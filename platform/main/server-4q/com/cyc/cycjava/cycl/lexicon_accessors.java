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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class lexicon_accessors
    extends
      SubLTranslatedFile
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
  public static SubLObject genl_lexicon_mtP(final SubLObject spec_mt, final SubLObject genl_mt)
  {
    if( spec_mt.equal( genl_mt ) || NIL != kb_utilities.kbeq( genl_mt, $const0$UniversalVocabularyMt ) || NIL != kb_utilities.kbeq( spec_mt, $const1$InferencePSC ) )
    {
      return T;
    }
    return genl_lexicon_mtP_cached( spec_mt, genl_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
  public static SubLObject clear_genl_lexicon_mtP_cached()
  {
    final SubLObject cs = $genl_lexicon_mtP_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
  public static SubLObject remove_genl_lexicon_mtP_cached(final SubLObject spec_mt, final SubLObject genl_mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $genl_lexicon_mtP_cached_caching_state$.getGlobalValue(), ConsesLow.list( spec_mt, genl_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
  public static SubLObject genl_lexicon_mtP_cached_internal(final SubLObject spec_mt, final SubLObject genl_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( spec_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = mt_relevance_macros.relevant_mtP( genl_mt );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
  public static SubLObject genl_lexicon_mtP_cached(final SubLObject spec_mt, final SubLObject genl_mt)
  {
    SubLObject caching_state = $genl_lexicon_mtP_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym2$GENL_LEXICON_MT__CACHED, $sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_, $int4$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym5$CLEAR_GENL_LEXICON_MT__CACHED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( spec_mt, genl_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( spec_mt.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && genl_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( genl_lexicon_mtP_cached_internal( spec_mt, genl_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( spec_mt, genl_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4434L)
  public static SubLObject initialize_speech_part_caches()
  {
    clear_speech_part_pred_caches();
    initialize_derived_preds();
    initialize_closed_lexical_class_strings();
    initialize_speech_parts();
    initialize_speech_part_preds();
    return $kw6$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 5146L)
  public static SubLObject preds_matching_pos(SubLObject nl_pred_list, final SubLObject pos, SubLObject include_specsP)
  {
    if( include_specsP == UNPROVIDED )
    {
      include_specsP = NIL;
    }
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    if( nl_pred_list == $kw8$ALL )
    {
      nl_pred_list = top_level_nl_preds();
    }
    final SubLObject preds = ( NIL != include_specsP ) ? all_preds_of_pos( pos ) : max_preds_of_pos( pos );
    return ( NIL != nl_pred_list && NIL != preds ) ? lexicon_utilities.filter_lexicon_preds( nl_pred_list, preds, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 5862L)
  public static SubLObject top_level_nl_preds()
  {
    return ConsesLow.list( lexicon_vars.$top_level_nl_pred$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6011L)
  public static SubLObject clear_speech_part_pred_caches()
  {
    clear_max_preds_matching_pos_cached();
    clear_max_preds_of_pos();
    clear_max_preds_licensed_by_pos();
    lexicon_utilities.clear_preds_licensed_by_pos();
    clear_speech_part_pred_min_ceilings_int();
    clear_speech_part_pred_max_floors_int();
    clear_derived_preds();
    clear_speech_part_preds();
    return $kw9$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6468L)
  public static SubLObject max_preds_matching_pos(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, SubLObject include_specsP)
  {
    if( include_specsP == UNPROVIDED )
    {
      include_specsP = NIL;
    }
    return ( NIL != control_vars.kb_loaded() ) ? conses_high.copy_list( max_preds_matching_pos_cached( nl_pred_list, pos, mt, include_specsP ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
  public static SubLObject clear_max_preds_matching_pos_cached()
  {
    final SubLObject cs = $max_preds_matching_pos_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
  public static SubLObject remove_max_preds_matching_pos_cached(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $max_preds_matching_pos_cached_caching_state$.getGlobalValue(), ConsesLow.list( nl_pred_list, pos, mt, include_specsP ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
  public static SubLObject max_preds_matching_pos_cached_internal(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject preds = preds_matching_pos( nl_pred_list, pos, include_specsP );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      final SubLObject nearest_common_genl_preds = speech_part_pred_min_ceilings( preds, UNPROVIDED );
      result = ( ( NIL != nearest_common_genl_preds ) ? nearest_common_genl_preds : preds );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
  public static SubLObject max_preds_matching_pos_cached(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP)
  {
    SubLObject caching_state = $max_preds_matching_pos_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym10$MAX_PREDS_MATCHING_POS_CACHED, $sym11$_MAX_PREDS_MATCHING_POS_CACHED_CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, $int12$32 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( nl_pred_list, pos, mt, include_specsP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( nl_pred_list.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pos.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && include_specsP.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( max_preds_matching_pos_cached_internal( nl_pred_list, pos, mt, include_specsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( nl_pred_list, pos, mt, include_specsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7397L)
  public static SubLObject all_preds_of_pos(final SubLObject pos)
  {
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = genls.all_specs( pos, UNPROVIDED, UNPROVIDED );
    SubLObject spec_pos = NIL;
    spec_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = lexicon_utilities.preds_of_pos( spec_pos, UNPROVIDED );
      SubLObject pred = NIL;
      pred = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject item_var = pred;
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
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
  public static SubLObject clear_max_preds_of_pos()
  {
    final SubLObject cs = $max_preds_of_pos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
  public static SubLObject remove_max_preds_of_pos(final SubLObject pos)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $max_preds_of_pos_caching_state$.getGlobalValue(), ConsesLow.list( pos ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
  public static SubLObject max_preds_of_pos_internal(final SubLObject pos)
  {
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    return lex_remove_spec_preds( lexicon_utilities.preds_of_pos( pos, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
  public static SubLObject max_preds_of_pos(final SubLObject pos)
  {
    SubLObject caching_state = $max_preds_of_pos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym13$MAX_PREDS_OF_POS, $sym14$_MAX_PREDS_OF_POS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym15$CLEAR_MAX_PREDS_OF_POS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( max_preds_of_pos_internal( pos ) ) );
      memoization_state.caching_state_put( caching_state, pos, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
  public static SubLObject clear_max_preds_licensed_by_pos()
  {
    final SubLObject cs = $max_preds_licensed_by_pos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
  public static SubLObject remove_max_preds_licensed_by_pos(final SubLObject pos)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $max_preds_licensed_by_pos_caching_state$.getGlobalValue(), ConsesLow.list( pos ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
  public static SubLObject max_preds_licensed_by_pos_internal(final SubLObject pos)
  {
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    return lex_remove_spec_preds( lexicon_utilities.preds_licensed_by_pos( pos ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
  public static SubLObject max_preds_licensed_by_pos(final SubLObject pos)
  {
    SubLObject caching_state = $max_preds_licensed_by_pos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym16$MAX_PREDS_LICENSED_BY_POS, $sym17$_MAX_PREDS_LICENSED_BY_POS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym18$CLEAR_MAX_PREDS_LICENSED_BY_POS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( max_preds_licensed_by_pos_internal( pos ) ) );
      memoization_state.caching_state_put( caching_state, pos, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8403L)
  public static SubLObject lex_remove_spec_preds(final SubLObject pos_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
          SubLObject remain;
          SubLObject current;
          SubLObject datum;
          SubLObject now;
          SubLObject later;
          SubLObject removeP;
          SubLObject csome_list_var;
          SubLObject other;
          for( remain = NIL, remain = pos_preds; NIL != remain; remain = remain.rest() )
          {
            datum = ( current = remain );
            now = NIL;
            later = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            now = current.first();
            current = ( later = current.rest() );
            removeP = NIL;
            if( NIL == removeP )
            {
              csome_list_var = later;
              other = NIL;
              other = csome_list_var.first();
              while ( NIL == removeP && NIL != csome_list_var)
              {
                if( NIL != subl_promotions.memberP( now, lex_remove_spec_preds_helper( other ), UNPROVIDED, UNPROVIDED ) )
                {
                  removeP = T;
                }
                csome_list_var = csome_list_var.rest();
                other = csome_list_var.first();
              }
            }
            if( NIL == removeP )
            {
              csome_list_var = ans;
              other = NIL;
              other = csome_list_var.first();
              while ( NIL == removeP && NIL != csome_list_var)
              {
                if( NIL != subl_promotions.memberP( now, lex_remove_spec_preds_helper( other ), UNPROVIDED, UNPROVIDED ) )
                {
                  removeP = T;
                }
                csome_list_var = csome_list_var.rest();
                other = csome_list_var.first();
              }
            }
            if( NIL == removeP )
            {
              ans = ConsesLow.cons( now, ans );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9057L)
  public static SubLObject lex_remove_spec_preds_helper_internal(final SubLObject v_term)
  {
    return genl_predicates.all_spec_preds( v_term, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9057L)
  public static SubLObject lex_remove_spec_preds_helper(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return lex_remove_spec_preds_helper_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym22$LEX_REMOVE_SPEC_PREDS_HELPER, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym22$LEX_REMOVE_SPEC_PREDS_HELPER, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym22$LEX_REMOVE_SPEC_PREDS_HELPER, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( lex_remove_spec_preds_helper_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9147L)
  public static SubLObject speech_part_pred_min_ceilings(final SubLObject preds, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return conses_high.copy_list( speech_part_pred_min_ceilings_int( preds, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
  public static SubLObject clear_speech_part_pred_min_ceilings_int()
  {
    final SubLObject cs = $speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
  public static SubLObject remove_speech_part_pred_min_ceilings_int(final SubLObject preds, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue(), ConsesLow.list( preds, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
  public static SubLObject speech_part_pred_min_ceilings_int_internal(final SubLObject preds, final SubLObject mt)
  {
    return genl_predicates.min_ceiling_predicates( preds, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
  public static SubLObject speech_part_pred_min_ceilings_int(final SubLObject preds, final SubLObject mt)
  {
    SubLObject caching_state = $speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT, $sym24$_SPEECH_PART_PRED_MIN_CEILINGS_INT_CACHING_STATE_, $int25$512, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym26$CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( preds, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( preds.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( speech_part_pred_min_ceilings_int_internal( preds, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( preds, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9477L)
  public static SubLObject speech_part_pred_max_floors(final SubLObject preds, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject ans = speech_part_pred_max_floors_int( preds, mt );
    return conses_high.copy_list( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
  public static SubLObject clear_speech_part_pred_max_floors_int()
  {
    final SubLObject cs = $speech_part_pred_max_floors_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
  public static SubLObject remove_speech_part_pred_max_floors_int(final SubLObject preds, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $speech_part_pred_max_floors_int_caching_state$.getGlobalValue(), ConsesLow.list( preds, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
  public static SubLObject speech_part_pred_max_floors_int_internal(final SubLObject preds, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = genl_predicates.max_floor_predicates( preds, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
  public static SubLObject speech_part_pred_max_floors_int(final SubLObject preds, final SubLObject mt)
  {
    SubLObject caching_state = $speech_part_pred_max_floors_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym27$SPEECH_PART_PRED_MAX_FLOORS_INT, $sym28$_SPEECH_PART_PRED_MAX_FLOORS_INT_CACHING_STATE_, $int25$512, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym29$CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( preds, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( preds.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( speech_part_pred_max_floors_int_internal( preds, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( preds, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
  public static SubLObject clear_pos_of_pred()
  {
    final SubLObject cs = $pos_of_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
  public static SubLObject remove_pos_of_pred(final SubLObject pred)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pos_of_pred_caching_state$.getGlobalValue(), ConsesLow.list( pred ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
  public static SubLObject pos_of_pred_internal(final SubLObject pred)
  {
    assert NIL != speech_part_predP( pred, UNPROVIDED ) : pred;
    return ( NIL != kb_indexing_datastructures.indexed_term_p( pred ) && NIL != constant_handles.valid_constantP( $const32$speechPartPreds, UNPROVIDED ) ) ? Sort.sort( kb_mapping_utilities.pred_values_in_any_mt( pred,
        $const32$speechPartPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ), $sym33$SPEC_POS_, UNPROVIDED ).first() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
  public static SubLObject pos_of_pred(final SubLObject pred)
  {
    SubLObject caching_state = $pos_of_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym30$POS_OF_PRED, $sym34$_POS_OF_PRED_CACHING_STATE_, $int35$128, EQL, ONE_INTEGER, $int12$32 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pos_of_pred_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 10358L)
  public static SubLObject singular_pred(final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    if( NIL == constant_handles.valid_constantP( $const36$Noun, UNPROVIDED ) || NIL == genls.genl_in_any_mtP( pos, $const36$Noun ) )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const37$singular_Generic, UNPROVIDED ) && NIL == ans )
      {
        SubLObject csome_list_var = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
        SubLObject pred = NIL;
        pred = csome_list_var.first();
        while ( NIL == ans && NIL != csome_list_var)
        {
          if( NIL != genl_predicates.genl_predP( pred, $const37$singular_Generic, UNPROVIDED, UNPROVIDED ) )
          {
            ans = pred;
          }
          csome_list_var = csome_list_var.rest();
          pred = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 10949L)
  public static SubLObject plural_pred(final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    if( NIL == constant_handles.valid_constantP( $const36$Noun, UNPROVIDED ) || NIL == genls.genl_in_any_mtP( pos, $const36$Noun ) )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const38$plural_Generic, UNPROVIDED ) && NIL == ans )
      {
        SubLObject csome_list_var = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
        SubLObject pred = NIL;
        pred = csome_list_var.first();
        while ( NIL == ans && NIL != csome_list_var)
        {
          if( NIL != genl_predicates.genl_predP( pred, $const38$plural_Generic, UNPROVIDED, UNPROVIDED ) )
          {
            ans = pred;
          }
          csome_list_var = csome_list_var.rest();
          pred = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11635L)
  public static SubLObject derived_preds()
  {
    return $derived_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11696L)
  public static SubLObject clear_derived_preds()
  {
    morphology.clear_pos_preds_derivable_from_pred_int();
    return Hashtables.clrhash( $derived_preds$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11817L)
  public static SubLObject initialize_derived_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_derived_preds();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const41$regularSuffix, UNPROVIDED ) )
      {
        final SubLObject pred_var = $const41$regularSuffix;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$4 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$5 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, NIL, NIL );
                  SubLObject done_var_$6 = NIL;
                  final SubLObject token_var_$7 = NIL;
                  while ( NIL == done_var_$6)
                  {
                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
                    final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( as ) );
                    if( NIL != valid_$8 )
                    {
                      final SubLObject derived_pred = assertions_high.gaf_arg1( as );
                      final SubLObject mt = assertions_high.assertion_mt( as );
                      hash_table_utilities.pushnew_hash( derived_pred, mt, $derived_preds$.getGlobalValue(), UNPROVIDED );
                    }
                    done_var_$6 = makeBoolean( NIL == valid_$8 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$5, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$4, thread );
          }
        }
      }
      if( NIL != constant_handles.valid_constantP( $const43$ProperNoun, UNPROVIDED ) && NIL != constant_handles.valid_constantP( $const32$speechPartPreds, UNPROVIDED ) )
      {
        SubLObject node_var = $const43$ProperNoun;
        final SubLObject deck_type = $kw46$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw48$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw51$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw53$WARN ) )
                {
                  Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_11 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const43$ProperNoun, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const55$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject pos = node_var;
                      final SubLObject pred_var2 = $const32$speechPartPreds;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pos, NIL, pred_var2 ) )
                      {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pos, NIL, pred_var2 );
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while ( NIL == done_var2)
                        {
                          final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                          final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                          if( NIL != valid2 )
                          {
                            SubLObject final_index_iterator2 = NIL;
                            try
                            {
                              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw42$GAF, $kw56$TRUE, NIL );
                              SubLObject done_var_$7 = NIL;
                              final SubLObject token_var_$8 = NIL;
                              while ( NIL == done_var_$7)
                              {
                                final SubLObject as2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$8 );
                                final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( as2 ) );
                                if( NIL != valid_$9 )
                                {
                                  final SubLObject spp = assertions_high.gaf_arg2( as2 );
                                  final SubLObject mt2 = assertions_high.assertion_mt( as2 );
                                  hash_table_utilities.pushnew_hash( spp, mt2, $derived_preds$.getGlobalValue(), UNPROVIDED );
                                }
                                done_var_$7 = makeBoolean( NIL == valid_$9 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if( NIL != final_index_iterator2 )
                                {
                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                                }
                                Values.restoreValuesFromVector( _values2 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                              }
                            }
                          }
                          done_var2 = makeBoolean( NIL == valid2 );
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const55$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                  {
                                    final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                      SubLObject iteration_state_$25;
                                      for( iteration_state_$25 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$25 ); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next( iteration_state_$25 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$25 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$13, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$25 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$12, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$27;
                            final SubLObject new_list = cdolist_list_var_$27 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$27.first();
                            while ( NIL != cdolist_list_var_$27)
                            {
                              final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$14, thread );
                              }
                              cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                              generating_fn = cdolist_list_var_$27.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$9, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$11, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$17, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$8, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$9, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $const43$ProperNoun, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                      UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_11, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_10, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_9, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$7, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$8, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$6, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$7, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $derived_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 12497L)
  public static SubLObject derived_predP(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    if( !Hashtables.hash_table_count( $derived_preds$.getGlobalValue() ).isPositive() )
    {
      initialize_derived_preds();
    }
    final SubLObject mts = Hashtables.gethash( obj, $derived_preds$.getGlobalValue(), UNPROVIDED );
    SubLObject mt_okP = kb_utilities.kbeq( mt, $const1$InferencePSC );
    if( NIL == mt_okP )
    {
      SubLObject csome_list_var;
      SubLObject ok_mt;
      for( csome_list_var = mts, ok_mt = NIL, ok_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, ok_mt ), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var
          .first() )
      {
      }
    }
    return makeBoolean( NIL != mts && NIL != mt_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 12901L)
  public static SubLObject base_preds_of_pred(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const60$EnglishMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject base_preds = NIL;
    if( NIL != derived_predP( pred, mt ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var = $const41$regularSuffix;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, ONE_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, NIL, NIL );
                SubLObject done_var_$30 = NIL;
                final SubLObject token_var_$31 = NIL;
                while ( NIL == done_var_$30)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$31 );
                  final SubLObject valid_$32 = makeBoolean( !token_var_$31.eql( gaf ) );
                  if( NIL != valid_$32 )
                  {
                    final SubLObject more_basic_pred = assertions_high.gaf_arg2( gaf );
                    base_preds = conses_high.union( base_preds, base_preds_of_pred( more_basic_pred, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
                  }
                  done_var_$30 = makeBoolean( NIL == valid_$32 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != base_preds ) ? base_preds : ConsesLow.list( pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 13507L)
  public static SubLObject do_speech_part_preds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$34 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list62 );
      current_$34 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list62 );
      if( NIL == conses_high.member( current_$34, $list63, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$34 == $kw64$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw65$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : $const1$InferencePSC;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw66$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject defining_mt = $sym67$DEFINING_MT;
    return ConsesLow.list( $sym68$PROGN, $list69, ConsesLow.list( $sym70$DO_DICTIONARY, ConsesLow.list( pred, defining_mt, $sym61$_SPEECH_PART_PREDS_, done ), ConsesLow.listS( $sym71$PWHEN, ConsesLow.list( $sym72$COR,
        ConsesLow.listS( $sym73$KBEQ, mt, $list74 ), ConsesLow.list( $sym75$GENL_LEXICON_MT_, mt, defining_mt ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 13874L)
  public static SubLObject speech_part_preds_initializedP()
  {
    return makeBoolean( NIL != dictionary.dictionary_p( $speech_part_preds$.getGlobalValue() ) && NIL == dictionary.dictionary_empty_p( $speech_part_preds$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14035L)
  public static SubLObject clear_speech_part_preds()
  {
    if( NIL == dictionary.dictionary_p( $speech_part_preds$.getGlobalValue() ) )
    {
      $speech_part_preds$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQL ), $int40$256 ) );
    }
    return dictionary.clear_dictionary( $speech_part_preds$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14235L)
  public static SubLObject initialize_speech_part_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_speech_part_preds();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const76$SpeechPartPredicate, UNPROVIDED ) )
      {
        SubLObject node_var = $const76$SpeechPartPredicate;
        final SubLObject deck_type = $kw46$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw48$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw51$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw53$WARN ) )
                {
                  Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const76$SpeechPartPredicate, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const55$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject sp_type = node_var;
                      final SubLObject pred_var = $const77$isa;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( sp_type, TWO_INTEGER, pred_var ) )
                      {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( sp_type, TWO_INTEGER, pred_var );
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while ( NIL == done_var)
                        {
                          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                          if( NIL != valid )
                          {
                            SubLObject final_index_iterator = NIL;
                            try
                            {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                              SubLObject done_var_$43 = NIL;
                              final SubLObject token_var_$44 = NIL;
                              while ( NIL == done_var_$43)
                              {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$44 );
                                final SubLObject valid_$45 = makeBoolean( !token_var_$44.eql( as ) );
                                if( NIL != valid_$45 )
                                {
                                  final SubLObject spp = assertions_high.gaf_arg1( as );
                                  final SubLObject mt = assertions_high.assertion_mt( as );
                                  dictionary_utilities.dictionary_push( $speech_part_preds$.getGlobalValue(), spp, mt );
                                  removal_modules_lexicon.set_up_removal_support_for_speech_part_predicate( spp );
                                }
                                done_var_$43 = makeBoolean( NIL == valid_$45 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                if( NIL != final_index_iterator )
                                {
                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                }
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
                              }
                            }
                          }
                          done_var = makeBoolean( NIL == valid );
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const55$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      SubLObject iteration_state_$50;
                                      for( iteration_state_$50 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$50 ); iteration_state_$50 = dictionary_contents.do_dictionary_contents_next( iteration_state_$50 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$50 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$42, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$50 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$41, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$52;
                            final SubLObject new_list = cdolist_list_var_$52 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$52.first();
                            while ( NIL != cdolist_list_var_$52)
                            {
                              final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$43, thread );
                              }
                              cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                              generating_fn = cdolist_list_var_$52.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$40, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$40, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$42, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$39, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$38, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $const76$SpeechPartPredicate, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                      UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$38, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$37, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$37, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$36, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$35, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $speech_part_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14705L)
  public static SubLObject ensure_speech_part_preds_initialized()
  {
    if( NIL == speech_part_preds_initializedP() )
    {
      initialize_speech_part_preds();
    }
    return $kw6$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14864L)
  public static SubLObject speech_part_predP(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    ensure_speech_part_preds_initialized();
    final SubLObject mts = dictionary.dictionary_lookup_without_values( $speech_part_preds$.getGlobalValue(), obj, UNPROVIDED );
    SubLObject mt_okP = kb_utilities.kbeq( mt, $const1$InferencePSC );
    if( NIL == mt_okP )
    {
      SubLObject csome_list_var;
      SubLObject ok_mt;
      for( csome_list_var = mts, ok_mt = NIL, ok_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, ok_mt ), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var
          .first() )
      {
      }
    }
    return makeBoolean( NIL != mts && NIL != mt_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 15252L)
  public static SubLObject all_speech_part_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    ensure_speech_part_preds_initialized();
    if( NIL != kb_utilities.kbeq( mt, $const1$InferencePSC ) )
    {
      return dictionary.dictionary_keys( $speech_part_preds$.getGlobalValue() );
    }
    SubLObject ans = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $speech_part_preds$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject sp = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject sp_mts = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject mt_okP = NIL;
      if( NIL == mt_okP )
      {
        SubLObject csome_list_var;
        SubLObject sp_mt;
        for( csome_list_var = sp_mts, sp_mt = NIL, sp_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, sp_mt ), csome_list_var = csome_list_var
            .rest(), sp_mt = csome_list_var.first() )
        {
        }
      }
      if( NIL != mt_okP )
      {
        ans = ConsesLow.cons( sp, ans );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 15858L)
  public static SubLObject spec_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return genl_pos_predP( pred2, pred1, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
  public static SubLObject clear_genl_pos_predP()
  {
    final SubLObject cs = $genl_pos_predP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
  public static SubLObject remove_genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $genl_pos_predP_caching_state$.getGlobalValue(), ConsesLow.list( pred1, pred2, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
  public static SubLObject genl_pos_predP_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( pred1.equal( pred2 ) )
    {
      return T;
    }
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = makeBoolean( NIL != forts.fort_p( pred1 ) && NIL != genl_predicates.genl_predP( pred1, pred2, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
  public static SubLObject genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $genl_pos_predP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym78$GENL_POS_PRED_, $sym79$_GENL_POS_PRED__CACHING_STATE_, $int4$4096, EQUAL, THREE_INTEGER, $int35$128 );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym80$CLEAR_GENL_POS_PRED_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pred1, pred2, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( genl_pos_predP_internal( pred1, pred2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred1, pred2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
  public static SubLObject clear_genl_pos_pred_from_mt_infoP()
  {
    final SubLObject cs = $genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
  public static SubLObject remove_genl_pos_pred_from_mt_infoP(final SubLObject pred1, final SubLObject pred2, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue(), ConsesLow.list( pred1, pred2, mt_info ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
  public static SubLObject genl_pos_pred_from_mt_infoP_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym19$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
        ans = makeBoolean( NIL != forts.fort_p( pred1 ) && NIL != genl_predicates.genl_predP( pred1, pred2, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym82$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym82$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const1$InferencePSC, thread );
        ans = makeBoolean( NIL != forts.fort_p( pred1 ) && NIL != genl_predicates.genl_predP( pred1, pred2, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym83$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        ans = makeBoolean( NIL != forts.fort_p( pred1 ) && NIL != genl_predicates.genl_predP( pred1, pred2, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym84$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        ans = makeBoolean( NIL != forts.fort_p( pred1 ) && NIL != genl_predicates.genl_predP( pred1, pred2, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
  public static SubLObject genl_pos_pred_from_mt_infoP(final SubLObject pred1, final SubLObject pred2, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = lexicon_vars.lexicon_lookup_mt_info();
    }
    SubLObject caching_state = $genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym81$GENL_POS_PRED_FROM_MT_INFO_, $sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int35$128 );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pred1, pred2, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pred2.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( genl_pos_pred_from_mt_infoP_internal( pred1, pred2, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred1, pred2, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16847L)
  public static SubLObject word_form_predictableP(final SubLObject word, final SubLObject string, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    assert NIL != speech_part_predP( pred, UNPROVIDED ) : pred;
    return subl_promotions.memberP( string, lexicon_cache.generate_regular_strings( word, pred, mt ), $sym88$STRING_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 17319L)
  public static SubLObject get_strings_of_type(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt)
  {
    if( include == UNPROVIDED )
    {
      include = $kw8$ALL;
    }
    if( exceptions == UNPROVIDED )
    {
      exceptions = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    final SubLObject preds = max_preds_matching_pos( include, pos, mt, NIL );
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      if( NIL != preds )
      {
        ans = lexicon_cache.strings_of_word_unit( word_unit, preds, exceptions, UNPROVIDED );
      }
      if( NIL != constant_handles.valid_constantP( $const89$ClosedClassWord, UNPROVIDED ) && NIL != constant_handles.valid_constantP( $const90$partOfSpeech, UNPROVIDED ) && NIL != closed_lexical_classP( pos,
          UNPROVIDED ) )
      {
        SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index( word_unit, ONE_INTEGER, $const90$partOfSpeech, UNPROVIDED, UNPROVIDED );
        SubLObject as = NIL;
        as = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != genl_posP( assertions_high.gaf_arg2( as ), pos, UNPROVIDED ) )
          {
            final SubLObject item_var = assertions_high.gaf_arg3( as );
            if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
            {
              ans = ConsesLow.cons( item_var, ans );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          as = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
  public static SubLObject clear_get_strings_of_type_cached()
  {
    final SubLObject cs = $get_strings_of_type_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
  public static SubLObject remove_get_strings_of_type_cached(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt)
  {
    if( include == UNPROVIDED )
    {
      include = $kw8$ALL;
    }
    if( exceptions == UNPROVIDED )
    {
      exceptions = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $get_strings_of_type_cached_caching_state$.getGlobalValue(), ConsesLow.list( word_unit, pos, include, exceptions, mt ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
  public static SubLObject get_strings_of_type_cached_internal(final SubLObject word_unit, final SubLObject pos, final SubLObject include, final SubLObject exceptions, final SubLObject mt)
  {
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    return get_strings_of_type( word_unit, pos, include, exceptions, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
  public static SubLObject get_strings_of_type_cached(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt)
  {
    if( include == UNPROVIDED )
    {
      include = $kw8$ALL;
    }
    if( exceptions == UNPROVIDED )
    {
      exceptions = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $get_strings_of_type_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym91$GET_STRINGS_OF_TYPE_CACHED, $sym92$_GET_STRINGS_OF_TYPE_CACHED_CACHING_STATE_, $int25$512, EQL, FIVE_INTEGER, $int40$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( word_unit, pos, include, exceptions, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( word_unit.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pos.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( include.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( exceptions.eql( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_strings_of_type_cached_internal( word_unit, pos, include, exceptions, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_unit, pos, include, exceptions, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18555L)
  public static SubLObject string_is_pos_on_wuP_internal(final SubLObject string, final SubLObject word_unit, final SubLObject pos, SubLObject mt, SubLObject string_lookup_function, SubLObject parse_morphologically)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( string_lookup_function == UNPROVIDED )
    {
      string_lookup_function = $sym94$GET_STRINGS_OF_TYPE;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexical_wordP( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    if( NIL == word_has_posP( word_unit, pos, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == skip_to_morphological_parsingP( parse_morphologically ) && NIL != string_is_pos_on_wuP_asserted( string, word_unit, pos, mt ) )
    {
      return T;
    }
    SubLObject strings = NIL;
    if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
    {
      final SubLObject pcase_var = string_lookup_function;
      if( pcase_var.eql( $sym94$GET_STRINGS_OF_TYPE ) )
      {
        strings = get_strings_of_type( word_unit, pos, $kw8$ALL, NIL, mt );
      }
      else if( pcase_var.eql( $sym91$GET_STRINGS_OF_TYPE_CACHED ) )
      {
        strings = get_strings_of_type_cached( word_unit, pos, $kw8$ALL, NIL, mt );
      }
      else
      {
        strings = Functions.funcall( string_lookup_function, word_unit, pos, $kw8$ALL, NIL, mt );
      }
    }
    if( NIL != subl_promotions.memberP( string, strings, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      return T;
    }
    if( parse_morphologically == $kw97$NEVER )
    {
      return NIL;
    }
    final SubLObject words = morphological_word_parser.words_of_complex_word_stringXspeech_part( string, pos );
    return subl_promotions.memberP( word_unit, words, Symbols.symbol_function( $sym98$EQUALS_EL_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18555L)
  public static SubLObject string_is_pos_on_wuP(final SubLObject string, final SubLObject word_unit, final SubLObject pos, SubLObject mt, SubLObject string_lookup_function, SubLObject parse_morphologically)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( string_lookup_function == UNPROVIDED )
    {
      string_lookup_function = $sym94$GET_STRINGS_OF_TYPE;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return string_is_pos_on_wuP_internal( string, word_unit, pos, mt, string_lookup_function, parse_morphologically );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym93$STRING_IS_POS_ON_WU_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym93$STRING_IS_POS_ON_WU_, SIX_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym93$STRING_IS_POS_ON_WU_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( string, word_unit, pos, mt, string_lookup_function, parse_morphologically );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( word_unit.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( pos.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( string_lookup_function.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && parse_morphologically.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( string_is_pos_on_wuP_internal( string, word_unit, pos, mt, string_lookup_function, parse_morphologically ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, word_unit, pos, mt, string_lookup_function, parse_morphologically ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 19966L)
  public static SubLObject string_is_pos_on_wuP_asserted(final SubLObject string, final SubLObject word_unit, final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$55 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$56 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
            ensure_speech_part_preds_initialized();
            SubLObject iteration_state;
            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $speech_part_preds$.getGlobalValue() ) ); NIL == ans && NIL == dictionary_contents
                .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
            {
              thread.resetMultipleValues();
              final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
              final SubLObject defining_mt = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != kb_utilities.kbeq( $const1$InferencePSC, $const1$InferencePSC ) || NIL != genl_lexicon_mtP( $const1$InferencePSC, defining_mt ) )
              {
                final SubLObject pred_var = pred;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, ONE_INTEGER, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, ONE_INTEGER, pred_var );
                  SubLObject done_var = ans;
                  final SubLObject token_var = NIL;
                  while ( NIL == done_var)
                  {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                    final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                    if( NIL != valid )
                    {
                      SubLObject final_index_iterator = NIL;
                      try
                      {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, NIL, NIL );
                        SubLObject done_var_$57 = ans;
                        final SubLObject token_var_$58 = NIL;
                        while ( NIL == done_var_$57)
                        {
                          final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$58 );
                          final SubLObject valid_$59 = makeBoolean( !token_var_$58.eql( as ) );
                          if( NIL != valid_$59 && assertions_high.gaf_arg2( as ).equalp( string ) )
                          {
                            final SubLObject curr_pos = pos_of_pred( pred );
                            final SubLObject okP = ( NIL != pos ) ? genl_posP( curr_pos, pos, UNPROVIDED ) : NIL;
                            if( NIL != okP )
                            {
                              ans = T;
                            }
                          }
                          done_var_$57 = makeBoolean( NIL == valid_$59 || NIL != ans );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid || NIL != ans );
                  }
                }
              }
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$56, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$55, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 20479L)
  public static SubLObject string_is_pred_on_wuP(final SubLObject string, final SubLObject word_unit, final SubLObject pred, SubLObject mt, SubLObject parse_morphologically)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexical_wordP( word_unit ) : word_unit;
    assert NIL != speech_part_predP( pred, UNPROVIDED ) : pred;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject successP = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$62 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            final SubLObject string_preds = preds_of_stringXword( string, word_unit, lexicon_vars.$misspellingsP$.getDynamicValue( thread ), mt, $kw97$NEVER );
            if( NIL == successP )
            {
              SubLObject csome_list_var = string_preds;
              SubLObject string_pred = NIL;
              string_pred = csome_list_var.first();
              while ( NIL == successP && NIL != csome_list_var)
              {
                if( NIL != genl_pos_predP( string_pred, pred, mt ) )
                {
                  successP = T;
                }
                csome_list_var = csome_list_var.rest();
                string_pred = csome_list_var.first();
              }
            }
          }
          if( NIL == successP && parse_morphologically != $kw97$NEVER )
          {
            final SubLObject morph_string_preds = morphological_word_parser.preds_of_complex_word_stringXword( string, word_unit );
            if( NIL == successP )
            {
              SubLObject csome_list_var = morph_string_preds;
              SubLObject string_pred = NIL;
              string_pred = csome_list_var.first();
              while ( NIL == successP && NIL != csome_list_var)
              {
                if( NIL != genl_pos_predP( string_pred, pred, mt ) )
                {
                  successP = T;
                }
                csome_list_var = csome_list_var.rest();
                string_pred = csome_list_var.first();
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$62, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 21791L)
  public static SubLObject best_wu_for_string(final SubLObject string, final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject words = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$parse_morphologically$.currentBinding( thread );
    try
    {
      lexicon_vars.$parse_morphologically$.bind( $kw99$AS_FALLBACK, thread );
      words = words_of_stringXspeech_part( string, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      lexicon_vars.$parse_morphologically$.rebind( _prev_bind_0, thread );
    }
    return words.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 22122L)
  public static SubLObject best_pos_for_stringXwuXpos(final SubLObject string, final SubLObject wu, final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject poses = pos_of_stringXword( string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = Sequences.find( pos, poses, $sym100$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 22533L)
  public static SubLObject words_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != speech_part_predP( pred, UNPROVIDED ) : pred;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject result = NIL;
    if( NIL != string_utilities.non_empty_string_p( string ) )
    {
      final SubLObject current_state = memoization_state.current_memoization_state();
      final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
      try
      {
        lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
        final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$64 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
            {
              result = nl_trie_accessors.nl_trie_words_of_stringXpred( string, pred, misspellingsP, lookup_mt, UNPROVIDED );
            }
            if( NIL != proceed_with_morphological_parsingP( result, parse_morphologically ) )
            {
              result = Sequences.delete_duplicates( ConsesLow.append( result, morphological_word_parser.words_of_complex_word_stringXpred( string, pred ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
            if( NIL != Characters.upper_case_p( string_utilities.first_char( string ) ) && NIL != genl_posP( pos_of_pred( pred ), $const43$ProperNoun, lookup_mt ) )
            {
              result = Sequences.delete_duplicates( ConsesLow.append( result, words_of_stringXpred( Strings.string_downcase( string, UNPROVIDED, UNPROVIDED ), lexicon_utilities.common_noun_form_of_pred( pred ),
                  UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$65, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$64, thread );
        }
      }
      finally
      {
        lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
  public static SubLObject clear_pos_for_keyword()
  {
    final SubLObject cs = $pos_for_keyword_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
  public static SubLObject remove_pos_for_keyword(final SubLObject pos_keyword, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const101$EnglishLexiconMt;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pos_for_keyword_caching_state$.getGlobalValue(), ConsesLow.list( pos_keyword, lexical_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
  public static SubLObject pos_for_keyword_internal(final SubLObject pos_keyword, final SubLObject lexical_mt)
  {
    assert NIL != Types.keywordp( pos_keyword ) : pos_keyword;
    SubLObject real_pos = NIL;
    if( pos_keyword.eql( $kw104$ALL_NOUN_FORMS ) )
    {
      real_pos = genls.all_specs( $const36$Noun, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw105$NOUN ) )
    {
      real_pos = $list106;
    }
    else if( pos_keyword.eql( $kw107$MASS_NOUN ) )
    {
      real_pos = $list108;
    }
    else if( pos_keyword.eql( $kw109$SIMPLE_NOUN ) )
    {
      real_pos = genls.all_specs( $const110$CountNoun, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw111$DEVERBAL_NOUN ) )
    {
      real_pos = genls.all_specs( $const112$DeVerbalNoun, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw113$AGENTIVE_NOUN ) )
    {
      real_pos = genls.all_specs( $const114$AgentiveNoun, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw115$GERUNDIVE_NOUN ) )
    {
      real_pos = genls.all_specs( $const116$GerundiveNoun, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw117$PROPER_NOUN ) )
    {
      real_pos = genls.all_specs( $const43$ProperNoun, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw118$VERB ) )
    {
      real_pos = $list119;
    }
    else if( pos_keyword.eql( $kw120$AUX ) )
    {
      real_pos = genls.all_specs( $const121$AuxVerb, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw122$ADJECTIVE ) )
    {
      real_pos = genls.all_specs( $const123$Adjective, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw124$ADVERB ) )
    {
      real_pos = genls.all_specs( $const125$Adverb, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw126$PREP ) )
    {
      real_pos = genls.all_specs( $const127$Preposition, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw128$DET ) )
    {
      real_pos = genls.all_specs( $const129$Determiner, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw130$CONJ ) )
    {
      real_pos = genls.all_specs( $const131$Conjunction, lexical_mt, UNPROVIDED );
    }
    else if( pos_keyword.eql( $kw132$ANY ) )
    {
      real_pos = all_speech_parts( lexical_mt );
    }
    return real_pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
  public static SubLObject pos_for_keyword(final SubLObject pos_keyword, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $const101$EnglishLexiconMt;
    }
    SubLObject caching_state = $pos_for_keyword_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym102$POS_FOR_KEYWORD, $sym133$_POS_FOR_KEYWORD_CACHING_STATE_, $int134$64, EQL, TWO_INTEGER, TWELVE_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos_keyword, lexical_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pos_keyword.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && lexical_mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pos_for_keyword_internal( pos_keyword, lexical_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos_keyword, lexical_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 25754L)
  public static SubLObject words_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.keywordp( pos_keyword ) : pos_keyword;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject word_units = NIL;
    SubLObject preds = NIL;
    SubLObject lex_preds = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$66 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject word_units_$67 = nl_trie_accessors.nl_trie_words_of_stringXpos( string, pos_keyword, misspellingsP, lookup_mt, UNPROVIDED );
            final SubLObject preds_$68 = thread.secondMultipleValue();
            final SubLObject lex_preds_$69 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            word_units = word_units_$67;
            preds = preds_$68;
            lex_preds = lex_preds_$69;
            if( Sequences.remove_duplicates( lex_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).equal( $list135 ) )
            {
              word_units = NIL;
              preds = NIL;
              lex_preds = NIL;
            }
          }
          if( NIL != proceed_with_morphological_parsingP( word_units, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_word_units = morphological_word_parser.words_of_complex_word_stringXpos( string, pos_keyword, lookup_mt );
            final SubLObject morph_preds = thread.secondMultipleValue();
            final SubLObject morph_lex_preds = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            word_units = ConsesLow.append( word_units, morph_word_units );
            preds = ConsesLow.append( preds, morph_preds );
            lex_preds = ConsesLow.append( lex_preds, morph_lex_preds );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$67, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$66, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( word_units, preds, lex_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 28079L)
  public static SubLObject words_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject word_units = NIL;
    SubLObject preds = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$71 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject word_units_$72 = nl_trie_accessors.nl_trie_words_of_stringXspeech_part( string, pos, misspellingsP, lookup_mt, UNPROVIDED );
            final SubLObject preds_$73 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            word_units = word_units_$72;
            preds = preds_$73;
          }
          if( NIL != proceed_with_morphological_parsingP( word_units, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_word_units = morphological_word_parser.words_of_complex_word_stringXspeech_part( string, pos );
            final SubLObject morph_preds = thread.secondMultipleValue();
            thread.resetMultipleValues();
            word_units = ConsesLow.append( word_units, morph_word_units );
            preds = ConsesLow.append( preds, Mapping.mapcan( IDENTITY, morph_preds, EMPTY_SUBL_OBJECT_ARRAY ) );
          }
          if( NIL != Characters.upper_case_p( string_utilities.first_char( string ) ) && NIL != genl_posP( pos, $const43$ProperNoun, lookup_mt ) )
          {
            thread.resetMultipleValues();
            final SubLObject proper_word_units = words_of_stringXspeech_part( Strings.string_downcase( string, UNPROVIDED, UNPROVIDED ), lexicon_utilities.common_noun_form_of_pos( pos ), UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
            final SubLObject proper_preds = thread.secondMultipleValue();
            thread.resetMultipleValues();
            word_units = ConsesLow.append( word_units, proper_word_units );
            preds = ConsesLow.append( preds, Mapping.mapcar( $sym136$PROPER_NOUN_FORM_OF_PRED, proper_preds ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$72, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$71, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( word_units, preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 29788L)
  public static SubLObject preds_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    return ( NIL != control_vars.kb_loaded() ) ? conses_high.copy_list( preds_of_stringXword_cached( string, word, misspellingsP, lookup_mt, parse_morphologically ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30534L)
  public static SubLObject clear_preds_of_stringXword()
  {
    return clear_preds_of_stringXword_cached();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
  public static SubLObject clear_preds_of_stringXword_cached()
  {
    final SubLObject cs = $preds_of_stringXword_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
  public static SubLObject remove_preds_of_stringXword_cached(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $preds_of_stringXword_cached_caching_state$.getGlobalValue(), ConsesLow.list( string, word, misspellingsP, lookup_mt, parse_morphologically ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
  public static SubLObject preds_of_stringXword_cached_internal(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexical_wordP( word ) : word;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject result = NIL;
    if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
    {
      result = nl_trie_accessors.nl_trie_preds_of_stringXword( string, word, misspellingsP, lookup_mt, UNPROVIDED );
    }
    if( NIL != proceed_with_morphological_parsingP( result, parse_morphologically ) )
    {
      result = Sequences.delete_duplicates( ConsesLow.append( result, morphological_word_parser.preds_of_complex_word_stringXword( string, word ) ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
  public static SubLObject preds_of_stringXword_cached(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically)
  {
    SubLObject caching_state = $preds_of_stringXword_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym137$PREDS_OF_STRING_WORD_CACHED, $sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_, $int40$256, EQUAL, FIVE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( string, word, misspellingsP, lookup_mt, parse_morphologically );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( word.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( misspellingsP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( lookup_mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && parse_morphologically.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( preds_of_stringXword_cached_internal( string, word, misspellingsP, lookup_mt, parse_morphologically ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, word, misspellingsP, lookup_mt, parse_morphologically ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 31326L)
  public static SubLObject other_strings_of_wu(final SubLObject word_unit, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexical_wordP( word_unit ) : word_unit;
    SubLObject strings = NIL;
    final SubLObject string_var = $sym139$_STRING;
    final SubLObject v_properties = ConsesLow.list( $kw140$MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER );
    final SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding( thread );
    try
    {
      lexicon_vars.$misspellingsP$.bind( misspellingsP, thread );
      if( NIL != constant_handles.valid_constantP( $const90$partOfSpeech, UNPROVIDED ) )
      {
        strings = ask_utilities.query_variable( string_var, ConsesLow.list( $const90$partOfSpeech, word_unit, $sym141$_POS, string_var ), lookup_mt, v_properties );
      }
    }
    finally
    {
      lexicon_vars.$misspellingsP$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove_duplicates( strings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 32223L)
  public static SubLObject right_frames_for_pos(final SubLObject pos)
  {
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    if( pos.eql( $const142$Verb ) )
    {
      return lexicon_vars.verb_frames( $const143$GeneralEnglishMt );
    }
    if( pos.eql( $const125$Adverb ) )
    {
      return isa.all_fort_instances( $const144$FrameForAdverbs, $const143$GeneralEnglishMt, UNPROVIDED );
    }
    if( pos.eql( $const145$ProperCountNoun ) )
    {
      return $list146;
    }
    if( pos.eql( $const147$ProperMassNoun ) )
    {
      return $list146;
    }
    if( pos.eql( $const110$CountNoun ) )
    {
      return isa.all_fort_instances( $const148$FrameForNouns, $const143$GeneralEnglishMt, UNPROVIDED );
    }
    if( pos.eql( $const149$MassNoun ) )
    {
      return Sequences.delete( $const150$ZeroArticleFrame, isa.all_fort_instances( $const148$FrameForNouns, $const143$GeneralEnglishMt, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( pos.eql( $const123$Adjective ) )
    {
      return Sequences.delete( $const151$FrameForAdjectives, isa.all_fort_instances( $const151$FrameForAdjectives, $const143$GeneralEnglishMt, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 33193L)
  public static SubLObject pos_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$75 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            result = nl_trie_accessors.nl_trie_pos_of_string( string, misspellingsP, lookup_mt, UNPROVIDED );
          }
          if( NIL != proceed_with_morphological_parsingP( result, parse_morphologically ) )
          {
            result = Sequences.delete_duplicates( ConsesLow.append( result, morphological_word_parser.pos_of_complex_word_string( string ) ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$75, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 34379L)
  public static SubLObject string_is_posP(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$77 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          result = nl_trie_accessors.nl_trie_string_is_posP( string, pos, misspellingsP, lookup_mt );
          if( NIL == result && parse_morphologically != $kw97$NEVER )
          {
            result = morphological_word_parser.complex_word_string_is_speech_partP( string, pos );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$78, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$77, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 35328L)
  public static SubLObject string_is_form_of_aux_verbP(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return string_is_posP( string, $const121$AuxVerb, misspellingsP, lookup_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 35828L)
  public static SubLObject clear_closed_lexical_class_hash()
  {
    Hashtables.clrhash( $closed_lexical_class_strings$.getGlobalValue() );
    Hashtables.clrhash( $closed_lexical_class_strings_case_insensitive$.getGlobalValue() );
    return $closed_lexical_class_strings$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 36025L)
  public static SubLObject initialize_closed_lexical_class_strings()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_closed_lexical_class_hash();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const89$ClosedClassWord, UNPROVIDED ) )
      {
        SubLObject node_var = $const89$ClosedClassWord;
        final SubLObject deck_type = $kw46$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$79 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw48$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw51$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw53$WARN ) )
                {
                  Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const89$ClosedClassWord, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$83 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$86 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const55$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject pos = node_var;
                      final SubLObject pred_var = $const90$partOfSpeech;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pos, TWO_INTEGER, pred_var ) )
                      {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pos, TWO_INTEGER, pred_var );
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while ( NIL == done_var)
                        {
                          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                          if( NIL != valid )
                          {
                            SubLObject final_index_iterator = NIL;
                            try
                            {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                              SubLObject done_var_$87 = NIL;
                              final SubLObject token_var_$88 = NIL;
                              while ( NIL == done_var_$87)
                              {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$88 );
                                final SubLObject valid_$89 = makeBoolean( !token_var_$88.eql( as ) );
                                if( NIL != valid_$89 )
                                {
                                  final SubLObject string = assertions_high.gaf_arg3( as );
                                  final SubLObject mt = assertions_high.assertion_mt( as );
                                  hash_table_utilities.pushnew_hash( string, mt, $closed_lexical_class_strings$.getGlobalValue(), UNPROVIDED );
                                  hash_table_utilities.pushnew_hash( string, mt, $closed_lexical_class_strings_case_insensitive$.getGlobalValue(), UNPROVIDED );
                                }
                                done_var_$87 = makeBoolean( NIL == valid_$89 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                if( NIL != final_index_iterator )
                                {
                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                }
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
                              }
                            }
                          }
                          done_var = makeBoolean( NIL == valid );
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const55$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$84 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      SubLObject iteration_state_$94;
                                      for( iteration_state_$94 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$94 ); iteration_state_$94 = dictionary_contents.do_dictionary_contents_next( iteration_state_$94 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$94 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$86, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$94 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$85, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$96;
                            final SubLObject new_list = cdolist_list_var_$96 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$96.first();
                            while ( NIL != cdolist_list_var_$96)
                            {
                              final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$87, thread );
                              }
                              cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                              generating_fn = cdolist_list_var_$96.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$84, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$84, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$86, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$83, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$82, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $const89$ClosedClassWord, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                      UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$82, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$81, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$81, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$80, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$88, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$79, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $closed_lexical_class_strings$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 36638L)
  public static SubLObject closed_lexical_class_string_intP(final SubLObject string, final SubLObject mt, final SubLObject case_sensitiveP)
  {
    if( !string.isString() )
    {
      return NIL;
    }
    if( !Hashtables.hash_table_count( $closed_lexical_class_strings$.getGlobalValue() ).isPositive() )
    {
      initialize_closed_lexical_class_strings();
    }
    final SubLObject hash = ( NIL != case_sensitiveP ) ? $closed_lexical_class_strings$.getGlobalValue() : $closed_lexical_class_strings_case_insensitive$.getGlobalValue();
    final SubLObject ok_mts = Hashtables.gethash( string, hash, UNPROVIDED );
    SubLObject mt_okP = kb_utilities.kbeq( mt, $const1$InferencePSC );
    if( NIL == mt_okP )
    {
      SubLObject csome_list_var;
      SubLObject ok_mt;
      for( csome_list_var = ok_mts, ok_mt = NIL, ok_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, ok_mt ), csome_list_var = csome_list_var
          .rest(), ok_mt = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL != ok_mts && NIL != mt_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 37427L)
  public static SubLObject closed_lexical_class_stringP(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    return closed_lexical_class_string_intP( string, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 37820L)
  public static SubLObject closed_lexical_class_string_case_insensitiveP(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    return closed_lexical_class_string_intP( string, mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38232L)
  public static SubLObject non_pronominal_closed_lexical_class_stringP(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    return makeBoolean( NIL != closed_lexical_class_stringP( string, mt ) && NIL == string_is_posP( string, $const154$Pronoun, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38435L)
  public static SubLObject contains_closed_lexical_class_wordP(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject class_member_found = NIL;
    final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding( thread );
    try
    {
      string_utilities.$test_char$.bind( string_utilities.$space_char$.getGlobalValue(), thread );
      SubLObject cdolist_list_var;
      final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words( string, $sym155$NOT_TEST_CHAR, UNPROVIDED );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != closed_lexical_class_stringP( word, UNPROVIDED ) )
        {
          class_member_found = T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    finally
    {
      string_utilities.$test_char$.rebind( _prev_bind_0, thread );
    }
    return class_member_found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
  public static SubLObject clear_closed_lexical_class_strings()
  {
    final SubLObject cs = $closed_lexical_class_strings_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
  public static SubLObject remove_closed_lexical_class_strings(SubLObject lookup_mt)
  {
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $closed_lexical_class_strings_caching_state$.getGlobalValue(), ConsesLow.list( lookup_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
  public static SubLObject closed_lexical_class_strings_internal(final SubLObject lookup_mt)
  {
    SubLObject open_class_strings = NIL;
    SubLObject open_class_string = NIL;
    SubLObject mts = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $closed_lexical_class_strings$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        open_class_string = Hashtables.getEntryKey( cdohash_entry );
        mts = Hashtables.getEntryValue( cdohash_entry );
        SubLObject mt_okP = kb_utilities.kbeq( lookup_mt, $const1$InferencePSC );
        if( NIL == mt_okP )
        {
          SubLObject csome_list_var;
          SubLObject mt;
          for( csome_list_var = mts, mt = NIL, mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( lookup_mt, mt ), csome_list_var = csome_list_var.rest(), mt = csome_list_var
              .first() )
          {
          }
        }
        if( NIL != mt_okP )
        {
          open_class_strings = ConsesLow.cons( open_class_string, open_class_strings );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return open_class_strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
  public static SubLObject closed_lexical_class_strings(SubLObject lookup_mt)
  {
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $closed_lexical_class_strings_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym156$CLOSED_LEXICAL_CLASS_STRINGS, $sym157$_CLOSED_LEXICAL_CLASS_STRINGS_CACHING_STATE_, $int12$32, EQL, ONE_INTEGER, FOUR_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, lookup_mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( closed_lexical_class_strings_internal( lookup_mt ) ) );
      memoization_state.caching_state_put( caching_state, lookup_mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39522L)
  public static SubLObject closed_lexical_classP(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return subl_promotions.memberP( obj, closed_lexical_classes( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
  public static SubLObject clear_closed_lexical_classes()
  {
    final SubLObject cs = $closed_lexical_classes_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
  public static SubLObject remove_closed_lexical_classes(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $closed_lexical_classes_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
  public static SubLObject closed_lexical_classes_internal(final SubLObject mt)
  {
    return genls.all_specs( $const89$ClosedClassWord, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
  public static SubLObject closed_lexical_classes(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $closed_lexical_classes_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym158$CLOSED_LEXICAL_CLASSES, $sym159$_CLOSED_LEXICAL_CLASSES_CACHING_STATE_, NIL, EQL, ONE_INTEGER, EIGHT_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( closed_lexical_classes_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 40039L)
  public static SubLObject maybe_initialize_prep_strings()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !Hashtables.hash_table_count( $preposition_strings$.getDynamicValue( thread ) ).isPositive() )
    {
      if( NIL != constant_handles.valid_constantP( $const127$Preposition, UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
          SubLObject node_var = $const127$Preposition;
          final SubLObject deck_type = $kw46$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw48$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw51$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw53$WARN ) )
                  {
                    Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const127$Preposition, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$103 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const55$genls ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                      while ( NIL != node_var)
                      {
                        final SubLObject pos = node_var;
                        final SubLObject pred_var = $const90$partOfSpeech;
                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pos, TWO_INTEGER, pred_var ) )
                        {
                          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pos, TWO_INTEGER, pred_var );
                          SubLObject done_var = NIL;
                          final SubLObject token_var = NIL;
                          while ( NIL == done_var)
                          {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                            if( NIL != valid )
                            {
                              SubLObject final_index_iterator = NIL;
                              try
                              {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                                SubLObject done_var_$107 = NIL;
                                final SubLObject token_var_$108 = NIL;
                                while ( NIL == done_var_$107)
                                {
                                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$108 );
                                  final SubLObject valid_$109 = makeBoolean( !token_var_$108.eql( as ) );
                                  if( NIL != valid_$109 )
                                  {
                                    final SubLObject string = assertions_high.gaf_arg3( as );
                                    final SubLObject mt = assertions_high.assertion_mt( as );
                                    hash_table_utilities.pushnew_hash( string, mt, $preposition_strings$.getDynamicValue( thread ), UNPROVIDED );
                                  }
                                  done_var_$107 = makeBoolean( NIL == valid_$109 );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values = Values.getValuesAsVector();
                                  if( NIL != final_index_iterator )
                                  {
                                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                  }
                                  Values.restoreValuesFromVector( _values );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$103, thread );
                                }
                              }
                            }
                            done_var = makeBoolean( NIL == valid );
                          }
                        }
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const55$genls ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$104 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        SubLObject iteration_state_$114;
                                        for( iteration_state_$114 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$114 ); iteration_state_$114 = dictionary_contents.do_dictionary_contents_next( iteration_state_$114 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$114 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$106, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$114 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$105, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$116;
                              final SubLObject new_list = cdolist_list_var_$116 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$116.first();
                              while ( NIL != cdolist_list_var_$116)
                              {
                                final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$107, thread );
                                }
                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                generating_fn = cdolist_list_var_$116.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$104, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$104, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        node_var = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$106, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$103, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$102, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $const127$Preposition, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                        UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$102, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$101, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$101, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$100, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$108, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$99, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      return $preposition_strings$.getDynamicValue( thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 40483L)
  public static SubLObject preposition_stringP(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    maybe_initialize_prep_strings();
    final SubLObject ok_mts = Hashtables.gethash( string, $preposition_strings$.getDynamicValue( thread ), UNPROVIDED );
    SubLObject mt_okP = kb_utilities.kbeq( mt, $const1$InferencePSC );
    if( NIL == mt_okP )
    {
      SubLObject csome_list_var;
      SubLObject ok_mt;
      for( csome_list_var = ok_mts, ok_mt = NIL, ok_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, ok_mt ), csome_list_var = csome_list_var
          .rest(), ok_mt = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL != ok_mts && NIL != mt_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41047L)
  public static SubLObject quick_lexical_wordP(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return quick_lexical_wordP_int( obj, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41425L)
  public static SubLObject quick_lexical_wordP_int(final SubLObject obj, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wordP = NIL;
    if( NIL != forts.fort_p( obj ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        if( NIL == wordP )
        {
          SubLObject csome_list_var;
          SubLObject pred;
          for( csome_list_var = $pos_forms_spec_preds$.getGlobalValue(), pred = NIL, pred = csome_list_var.first(); NIL == wordP && NIL != csome_list_var; wordP = makeBoolean( NIL != somewhere_cache
              .maybe_some_pred_assertion_somewhereP( pred, obj, ONE_INTEGER, UNPROVIDED ) && NIL != kb_mapping_utilities.some_pred_value( obj, pred, ONE_INTEGER, UNPROVIDED ) ), csome_list_var = csome_list_var
                  .rest(), pred = csome_list_var.first() )
          {
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else if( !obj.isAtom() )
    {
      wordP = quick_word_nautP( obj );
    }
    return wordP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41833L)
  public static SubLObject quick_word_nautP(final SubLObject obj)
  {
    return formula_pattern_match.formula_matches_pattern( obj, $list161 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42066L)
  public static SubLObject lexical_wordP_internal(final SubLObject obj)
  {
    return isa.isa_in_any_mtP( obj, $const162$LexicalWord );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42066L)
  public static SubLObject lexical_wordP(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return lexical_wordP_internal( obj );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym95$LEXICAL_WORD_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym95$LEXICAL_WORD_, ONE_INTEGER, $int163$1000, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym95$LEXICAL_WORD_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( lexical_wordP_internal( obj ) ) );
      memoization_state.caching_state_put( caching_state, obj, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42281L)
  public static SubLObject derived_wordP_internal(final SubLObject obj)
  {
    return isa.isa_in_any_mtP( obj, $const165$DerivedWord );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42281L)
  public static SubLObject derived_wordP(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return derived_wordP_internal( obj );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym164$DERIVED_WORD_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym164$DERIVED_WORD_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym164$DERIVED_WORD_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( derived_wordP_internal( obj ) ) );
      memoization_state.caching_state_put( caching_state, obj, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42527L)
  public static SubLObject initialize_vulgar_words()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    set.clear_set( $vulgar_words$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const167$InherentlyVulgarWord, UNPROVIDED ) )
      {
        final SubLObject node_var = $const167$InherentlyVulgarWord;
        final SubLObject _prev_bind_0_$119 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
        final SubLObject _prev_bind_1_$120 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
        try
        {
          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const77$isa ), thread );
          sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject node_var_$121 = node_var;
            final SubLObject deck_type = $kw46$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$121 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$121 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw48$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw51$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw53$WARN ) )
                    {
                      Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const77$isa ) ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                        $const77$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$123 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$129 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                            .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$121, UNPROVIDED );
                        while ( NIL != node_var_$121)
                        {
                          final SubLObject tt_node_var = node_var_$121;
                          SubLObject cdolist_list_var;
                          final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const77$isa ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$124 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ),
                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        final SubLObject _prev_bind_0_$125 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          SubLObject iteration_state_$133;
                                          for( iteration_state_$133 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$133 ); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next( iteration_state_$133 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$133 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$126 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject word;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    word = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, word ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( word,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( word ) )
                                                      {
                                                        set.set_add( word, $vulgar_words$.getGlobalValue() );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject word2 = NIL;
                                                  word2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( word2 ) )
                                                      {
                                                        set.set_add( word2, $vulgar_words$.getGlobalValue() );
                                                      }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    word2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$126, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$133 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$125, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                                if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                {
                                  SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                  SubLObject instance_tuple = NIL;
                                  instance_tuple = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = instance_tuple;
                                    SubLObject link_node = NIL;
                                    SubLObject mt2 = NIL;
                                    SubLObject tv2 = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list168 );
                                    link_node = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list168 );
                                    mt2 = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list168 );
                                    tv2 = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol;
                                              final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject word;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  word = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, word ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( word,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( word ) )
                                                    {
                                                      set.set_add( word, $vulgar_words$.getGlobalValue() );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var_$137 = sol;
                                                SubLObject word2 = NIL;
                                                word2 = csome_list_var_$137.first();
                                                while ( NIL != csome_list_var_$137)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( word2 ) )
                                                    {
                                                      set.set_add( word2, $vulgar_words$.getGlobalValue() );
                                                    }
                                                  }
                                                  csome_list_var_$137 = csome_list_var_$137.rest();
                                                  word2 = csome_list_var_$137.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$128, thread );
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$127, thread );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list168 );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    instance_tuple = csome_list_var2.first();
                                  }
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$138;
                                final SubLObject new_list = cdolist_list_var_$138 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), sbhl_search_vars.$sbhl_tv$
                                        .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ),
                                        sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$138.first();
                                while ( NIL != cdolist_list_var_$138)
                                {
                                  final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject word3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        word3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, word3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( word3,
                                            sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( word3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( word3 ) )
                                          {
                                            set.set_add( word3, $vulgar_words$.getGlobalValue() );
                                          }
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var3 = sol2;
                                      SubLObject word4 = NIL;
                                      word4 = csome_list_var3.first();
                                      while ( NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( word4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( word4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                          if( NIL != forts.fort_p( word4 ) )
                                          {
                                            set.set_add( word4, $vulgar_words$.getGlobalValue() );
                                          }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        word4 = csome_list_var3.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$129, thread );
                                  }
                                  cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                  generating_fn = cdolist_list_var_$138.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$124, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$124, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                          SubLObject cdolist_list_var2;
                          final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                              $const77$isa ) ) );
                          SubLObject module_var2 = NIL;
                          module_var2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            final SubLObject _prev_bind_0_$130 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$125 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node2 = function_terms.naut_to_nart( node_var_$121 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                              {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link2 )
                                {
                                  final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links2 )
                                  {
                                    SubLObject iteration_state2;
                                    for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                      final SubLObject tv_links2 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                      {
                                        final SubLObject _prev_bind_0_$131 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                          SubLObject iteration_state_$134;
                                          for( iteration_state_$134 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$134 ); iteration_state_$134 = dictionary_contents.do_dictionary_contents_next( iteration_state_$134 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$134 );
                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$132 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol3 = link_nodes4;
                                                if( NIL != set.set_p( sol3 ) )
                                                {
                                                  final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                  SubLObject basis_object3;
                                                  SubLObject state3;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol3.isList() )
                                                {
                                                  SubLObject csome_list_var4 = sol3;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$132, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$134 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$131, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$139;
                                final SubLObject new_list2 = cdolist_list_var_$139 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn2 = NIL;
                                generating_fn2 = cdolist_list_var_$139.first();
                                while ( NIL != cdolist_list_var_$139)
                                {
                                  final SubLObject _prev_bind_0_$133 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                    final SubLObject sol4;
                                    final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                    if( NIL != set.set_p( sol4 ) )
                                    {
                                      final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                      SubLObject basis_object4;
                                      SubLObject state4;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                          set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol4.isList() )
                                    {
                                      SubLObject csome_list_var5 = sol4;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var5.first();
                                      while ( NIL != csome_list_var5)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var5 = csome_list_var5.rest();
                                        node_vars_link_node4 = csome_list_var5.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$133, thread );
                                  }
                                  cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                                  generating_fn2 = cdolist_list_var_$139.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$125, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$130, thread );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            module_var2 = cdolist_list_var2.first();
                          }
                          node_var_$121 = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$129, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$123, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$123, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$122, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$122, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$121, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$121, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$134 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$134, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$120, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$135 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$135, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$120, thread );
          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$119, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $kw6$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42783L)
  public static SubLObject vulgar_wordP(final SubLObject obj)
  {
    if( NIL != set.set_emptyP( $vulgar_words$.getGlobalValue() ) )
    {
      initialize_vulgar_words();
    }
    return set.set_memberP( obj, $vulgar_words$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 43066L)
  public static SubLObject pos_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexical_wordP( word ) : word;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$149 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            result = nl_trie_accessors.nl_trie_pos_of_stringXword( string, word, misspellingsP, lookup_mt, UNPROVIDED );
          }
          if( NIL != proceed_with_morphological_parsingP( result, parse_morphologically ) )
          {
            result = Sequences.delete_duplicates( ConsesLow.append( result, morphological_word_parser.pos_of_complex_word_stringXword( string, word ) ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$150, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$149, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 44152L)
  public static SubLObject clear_nl_caches()
  {
    clear_cached_lexical_access_functions();
    pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    clear_nl_parsing_caches();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 44359L)
  public static SubLObject clear_nl_parsing_caches()
  {
    psp_main.clear_psp_caches();
    clear_cached_lexical_access_functions();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 44545L)
  public static SubLObject clear_cached_lexical_access_functions()
  {
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 45182L)
  public static SubLObject pos_of_word(final SubLObject word_unit, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexical_wordP( word_unit ) : word_unit;
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$151 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL != forts.fort_p( word_unit ) )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
            final SubLObject _prev_bind_0_$152 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              SubLObject cdolist_list_var = $pos_forms_spec_preds$.getGlobalValue();
              SubLObject pred = NIL;
              pred = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( NIL != kb_indexing_datastructures.indexed_term_p( pred ) )
                {
                  result = ConsesLow.append( result, kb_mapping_utilities.pred_values( word_unit, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$152, thread );
            }
          }
          else if( NIL != narts_high.naut_p( word_unit ) )
          {
            final SubLObject affix = lexicon_utilities.derived_word_affix( word_unit, UNPROVIDED );
            result = mwp_rule.mwp_result_poses_for_reified_affix( affix, UNPROVIDED );
          }
          else
          {
            Errors.warn( $str169$The_word_unit__S_is_neither_a_FOR, word_unit );
            result = NIL;
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$153 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$153, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$151, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 45941L)
  public static SubLObject word_has_posP(final SubLObject word_unit, final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexical_wordP( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      if( NIL == ans )
      {
        SubLObject csome_list_var;
        SubLObject word_pos;
        for( csome_list_var = pos_of_word( word_unit, mt ), word_pos = NIL, word_pos = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = ( ( NIL != mt ) ? genl_posP( word_pos, pos, mt )
            : genl_posP( word_pos, pos, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) ), csome_list_var = csome_list_var.rest(), word_pos = csome_list_var.first() )
        {
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
  public static SubLObject clear_verb_only_stringP()
  {
    final SubLObject cs = $verb_only_stringP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
  public static SubLObject remove_verb_only_stringP(final SubLObject string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $verb_only_stringP_caching_state$.getGlobalValue(), ConsesLow.list( string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
  public static SubLObject verb_only_stringP_internal(final SubLObject string)
  {
    final SubLObject poses = pos_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == poses )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = poses;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == genl_posP( pos, $const142$Verb, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
  public static SubLObject verb_only_stringP(final SubLObject string)
  {
    SubLObject caching_state = $verb_only_stringP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym170$VERB_ONLY_STRING_, $sym171$_VERB_ONLY_STRING__CACHING_STATE_, $int25$512, EQUAL, ONE_INTEGER, $int40$256 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( verb_only_stringP_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46721L)
  public static SubLObject typed_denots_of_string(final SubLObject string, final SubLObject type, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP,
      SubLObject lookup_mt, SubLObject semantic_mt, SubLObject parse_morphologically, SubLObject excluded_predicates)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const1$InferencePSC;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    if( excluded_predicates == UNPROVIDED )
    {
      excluded_predicates = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( string, $sym87$STRINGP );
    enforceType( type, $sym173$EL_FORT_P );
    enforceType( abbrev_types, $sym174$LISTP );
    enforceType( denot_type, $sym103$KEYWORDP );
    enforceType( misspellingsP, $sym175$BOOLEANP );
    enforceType( skip_namestringsP, $sym175$BOOLEANP );
    enforceType( lookup_mt, $sym176$HLMT_ );
    enforceType( semantic_mt, $sym176$HLMT_ );
    enforceType( parse_morphologically, $sym96$PARSE_MORPHOLOGICALLY_OPTION_P );
    enforceType( excluded_predicates, $sym177$SET_P );
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$154 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots = denots_of_string( string, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, parse_morphologically, UNPROVIDED, UNPROVIDED );
          final SubLObject pred_lists = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject denot = NIL;
          SubLObject denot_$155 = NIL;
          SubLObject preds = NIL;
          SubLObject preds_$156 = NIL;
          denot = denots;
          denot_$155 = denot.first();
          preds = pred_lists;
          preds_$156 = preds.first();
          while ( NIL != preds || NIL != denot)
          {
            if( NIL != typed_denots_of_string_preds_okP( preds_$156, excluded_predicates ) )
            {
              final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( semantic_mt );
              final SubLObject _prev_bind_0_$155 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                if( NIL != denot_has_typeP( denot_$155, type, UNPROVIDED ) )
                {
                  final SubLObject item_var = denot_$155;
                  if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var, result );
                  }
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$155, thread );
              }
            }
            denot = denot.rest();
            denot_$155 = denot.first();
            preds = preds.rest();
            preds_$156 = preds.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$156 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$156, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$154, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 48301L)
  public static SubLObject typed_denots_of_string_preds_okP(final SubLObject preds, final SubLObject excluded_predicates)
  {
    SubLObject okP = NIL;
    if( NIL == okP )
    {
      SubLObject csome_list_var = preds;
      SubLObject pred = NIL;
      pred = csome_list_var.first();
      while ( NIL == okP && NIL != csome_list_var)
      {
        if( NIL == set.set_memberP( pred, excluded_predicates ) )
        {
          okP = T;
        }
        csome_list_var = csome_list_var.rest();
        pred = csome_list_var.first();
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 48514L)
  public static SubLObject denot_has_typeP_internal(final SubLObject denot, final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != at_defns.quick_quiet_has_typeP( denot, type, mt ) )
      {
        ans = T;
      }
      else if( NIL != forts.fort_p( denot ) && NIL != isa.instantiationP( denot, type, UNPROVIDED ) )
      {
        ans = T;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 48514L)
  public static SubLObject denot_has_typeP(final SubLObject denot, final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return denot_has_typeP_internal( denot, type, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym183$DENOT_HAS_TYPE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym183$DENOT_HAS_TYPE_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym183$DENOT_HAS_TYPE_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( denot, type, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( denot.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( type.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( denot_has_typeP_internal( denot, type, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( denot, type, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 49067L)
  public static SubLObject denot_might_have_typeP_internal(final SubLObject denot, final SubLObject type)
  {
    if( NIL != denot_has_typeP( denot, type, UNPROVIDED ) )
    {
      return T;
    }
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var;
      SubLObject v_isa;
      for( csome_list_var = isa.isa( denot, UNPROVIDED, UNPROVIDED ), v_isa = NIL, v_isa = csome_list_var.first(); NIL == badP && NIL != csome_list_var; badP = disjoint_with.disjoint_withP( v_isa, type, UNPROVIDED,
          UNPROVIDED ), csome_list_var = csome_list_var.rest(), v_isa = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 49067L)
  public static SubLObject denot_might_have_typeP(final SubLObject denot, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return denot_might_have_typeP_internal( denot, type );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym184$DENOT_MIGHT_HAVE_TYPE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym184$DENOT_MIGHT_HAVE_TYPE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym184$DENOT_MIGHT_HAVE_TYPE_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( denot, type );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( denot.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && type.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( denot_might_have_typeP_internal( denot, type ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( denot, type ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 49411L)
  public static SubLObject multi_typed_denots_of_string(final SubLObject string, final SubLObject pos_types, final SubLObject neg_types, SubLObject include_genlP, SubLObject abbrev_types, SubLObject denot_type,
      SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt, SubLObject excluded_predicates)
  {
    if( include_genlP == UNPROVIDED )
    {
      include_genlP = NIL;
    }
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const1$InferencePSC;
    }
    if( excluded_predicates == UNPROVIDED )
    {
      excluded_predicates = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$159 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots = denots_of_string( string, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject pred_lists = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject denot = NIL;
          SubLObject denot_$160 = NIL;
          SubLObject preds = NIL;
          SubLObject preds_$161 = NIL;
          denot = denots;
          denot_$160 = denot.first();
          preds = pred_lists;
          preds_$161 = preds.first();
          while ( NIL != preds || NIL != denot)
          {
            if( NIL != typed_denots_of_string_preds_okP( preds_$161, excluded_predicates ) )
            {
              final SubLObject fn = ( NIL != include_genlP ) ? Symbols.symbol_function( $sym185$MORE_SPECIFIC_P ) : Symbols.symbol_function( $sym183$DENOT_HAS_TYPE_ );
              SubLObject fail_pos = NIL;
              SubLObject fail_neg = NIL;
              final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( semantic_mt );
              final SubLObject _prev_bind_0_$160 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                if( NIL == fail_pos )
                {
                  SubLObject csome_list_var = pos_types;
                  SubLObject pos_type = NIL;
                  pos_type = csome_list_var.first();
                  while ( NIL == fail_pos && NIL != csome_list_var)
                  {
                    if( NIL == Functions.funcall( fn, denot_$160, pos_type ) )
                    {
                      fail_pos = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos_type = csome_list_var.first();
                  }
                }
                if( NIL == fail_pos && NIL == fail_neg )
                {
                  SubLObject csome_list_var = neg_types;
                  SubLObject neg_type = NIL;
                  neg_type = csome_list_var.first();
                  while ( NIL == fail_neg && NIL != csome_list_var)
                  {
                    if( NIL != Functions.funcall( fn, denot_$160, neg_type ) )
                    {
                      fail_neg = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    neg_type = csome_list_var.first();
                  }
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$160, thread );
              }
              if( NIL == fail_pos && NIL == fail_neg )
              {
                result = ConsesLow.cons( denot_$160, result );
              }
            }
            denot = denot.rest();
            denot_$160 = denot.first();
            preds = preds.rest();
            preds_$161 = preds.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$161 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$161, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$159, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 51454L)
  public static SubLObject typed_denots_of_string_at_place(final SubLObject string, final SubLObject type, final SubLObject place, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP,
      SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const1$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$164 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          SubLObject cdolist_list_var;
          final SubLObject typed_denots = cdolist_list_var = typed_denots_of_string( string, type, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, semantic_mt, UNPROVIDED, UNPROVIDED );
          SubLObject denot = NIL;
          denot = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != in_region_p( denot, place, semantic_mt ) )
            {
              result = ConsesLow.cons( denot, result );
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
          }
          if( NIL == result && type.equal( $const186$City ) && NIL != genls.genlsP( type, $const187$GeopoliticalEntity, semantic_mt, UNPROVIDED ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $const188$CityNamedFn, string, place ), result );
          }
          if( NIL == result )
          {
            result = ConsesLow.cons( ConsesLow.list( $const189$InstanceNamedFn, string, ConsesLow.list( $const190$SubcollectionOfWithRelationToFn, type, $const191$inRegion, place ) ), result );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$165 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$165, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$164, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 52504L)
  public static SubLObject in_region_p(final SubLObject place, final SubLObject region, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      final SubLObject is_place_a_gpeP = isa.isaP( place, $const187$GeopoliticalEntity, UNPROVIDED, UNPROVIDED );
      final SubLObject is_region_a_gpeP = isa.isaP( region, $const187$GeopoliticalEntity, UNPROVIDED, UNPROVIDED );
      final SubLObject is_place_a_geo_regionP = isa.isaP( place, $const192$GeographicalRegion, UNPROVIDED, UNPROVIDED );
      final SubLObject is_region_a_geo_regionP = isa.isaP( region, $const192$GeographicalRegion, UNPROVIDED, UNPROVIDED );
      if( NIL != is_region_a_gpeP && NIL != is_place_a_gpeP && NIL != geopolitical_subdivisionP( region, place, mt ) )
      {
        result = T;
      }
      else if( NIL != is_place_a_geo_regionP && NIL != is_region_a_geo_regionP && NIL != geographical_subregionP( region, place, mt ) )
      {
        result = T;
      }
      else
      {
        if( NIL != is_region_a_gpeP && NIL != is_place_a_geo_regionP )
        {
          if( NIL == result )
          {
            SubLObject csome_list_var;
            SubLObject region_territory;
            for( csome_list_var = territories_for_gpe( region ), region_territory = NIL, region_territory = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = geographical_subregionP(
                region_territory, place, mt ), csome_list_var = csome_list_var.rest(), region_territory = csome_list_var.first() )
            {
            }
          }
          if( NIL == result && NIL == result )
          {
            SubLObject csome_list_var;
            SubLObject place_gpe;
            for( csome_list_var = gpe_for_territory( place ), place_gpe = NIL, place_gpe = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = geopolitical_subdivisionP( region, place_gpe,
                mt ), csome_list_var = csome_list_var.rest(), place_gpe = csome_list_var.first() )
            {
            }
          }
        }
        if( NIL != is_region_a_geo_regionP && NIL != is_place_a_gpeP && NIL == result )
        {
          if( NIL == result )
          {
            SubLObject csome_list_var;
            SubLObject region_territory;
            for( csome_list_var = gpe_for_territory( region ), region_territory = NIL, region_territory = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = geographical_subregionP(
                region_territory, place, mt ), csome_list_var = csome_list_var.rest(), region_territory = csome_list_var.first() )
            {
            }
          }
          if( NIL == result && NIL == result )
          {
            SubLObject csome_list_var;
            SubLObject region_gpe;
            for( csome_list_var = gpe_for_territory( region ), region_gpe = NIL, region_gpe = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = geopolitical_subdivisionP( region_gpe, place,
                mt ), csome_list_var = csome_list_var.rest(), region_gpe = csome_list_var.first() )
            {
            }
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 53870L)
  public static SubLObject geopolitical_subdivisionP(final SubLObject big_place, final SubLObject small_place, final SubLObject mt)
  {
    return cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( ConsesLow.list( $const193$geopoliticalSubdivision, big_place, small_place ), mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54054L)
  public static SubLObject geographical_subregionP(final SubLObject big_place, final SubLObject small_place, final SubLObject mt)
  {
    return cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( ConsesLow.list( $const194$geographicalSubRegions, big_place, small_place ), mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54234L)
  public static SubLObject territories_for_gpe(final SubLObject region)
  {
    return kb_mapping_utilities.pred_values( region, $const195$territoryOf, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54324L)
  public static SubLObject gpe_for_territory(final SubLObject territory)
  {
    return kb_mapping_utilities.pred_values( narts_high.nart_substitute( territory ), $const195$territoryOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54440L)
  public static SubLObject denots_of_partial_string(SubLObject string, SubLObject lookup_mt, SubLObject permissiveP, SubLObject test)
  {
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( permissiveP == UNPROVIDED )
    {
      permissiveP = T;
    }
    if( test == UNPROVIDED )
    {
      test = EQUALP;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != permissiveP && !string_utilities.string_last_n( ONE_INTEGER, string ).equal( $str196$_ ) )
    {
      string = Sequences.cconcatenate( string, $str196$_ );
    }
    SubLObject result = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$166 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject cleaned_string = Strings.string_left_trim( $list197, string );
          SubLObject tokenized_string = string_utilities.string_tokenize( cleaned_string, $list198, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject initial_matches = nl_trie_accessors.nl_trie_matching_phrases( tokenized_string.first(), $kw199$INFIX );
          final SubLObject first_token = tokenized_string.first();
          final SubLObject first_token_length = Sequences.length( tokenized_string.first() );
          SubLObject token_count = NIL;
          tokenized_string = tokenized_string.rest();
          if( list_utilities.last_one( tokenized_string ).equal( $str200$ ) )
          {
            tokenized_string = conses_high.butlast( tokenized_string, UNPROVIDED );
          }
          token_count = Sequences.length( tokenized_string );
          SubLObject cdolist_list_var = initial_matches;
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject phrase = nl_trie_accessors.nl_trie_index_item_phrase( item );
            final SubLObject v_term = nl_trie_accessors.nl_trie_index_item_term( item );
            final SubLObject first_token_location = Sequences.search( first_token, phrase, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject current_token_number = ZERO_INTEGER;
            SubLObject string_offset = NIL;
            SubLObject next_token = NIL;
            SubLObject fail = NIL;
            if( NIL != first_token_location )
            {
              string_offset = Numbers.add( first_token_location, first_token_length );
            }
            else
            {
              fail = T;
            }
            while ( current_token_number.numL( token_count ) && NIL == fail)
            {
              next_token = ConsesLow.nth( current_token_number, tokenized_string );
              if( next_token.equal( $str200$ ) )
              {
                current_token_number = Numbers.add( current_token_number, ONE_INTEGER );
              }
              else if( NIL != next_token && !next_token.equal( $str196$_ ) )
              {
                final SubLObject location = Sequences.search( next_token, phrase, test, IDENTITY, ZERO_INTEGER, NIL, string_offset, UNPROVIDED );
                if( NIL == location )
                {
                  continue;
                }
                string_offset = Numbers.add( location, Sequences.length( next_token ) );
                current_token_number = Numbers.add( current_token_number, ONE_INTEGER );
              }
              else if( next_token.equal( $str196$_ ) )
              {
                current_token_number = Numbers.add( current_token_number, ONE_INTEGER );
                next_token = ConsesLow.nth( current_token_number, tokenized_string );
                if( NIL == next_token )
                {
                  result = ConsesLow.cons( v_term, result );
                }
                else
                {
                  final SubLObject location = Sequences.search( next_token, phrase, test, IDENTITY, ZERO_INTEGER, NIL, string_offset, UNPROVIDED );
                  if( NIL != location )
                  {
                    string_offset = Numbers.add( location, Sequences.length( next_token ) );
                    current_token_number = Numbers.add( current_token_number, ONE_INTEGER );
                  }
                  else
                  {
                    fail = T;
                  }
                }
              }
              else
              {
                if( string_offset.eql( Sequences.length( phrase ) ) )
                {
                  continue;
                }
                fail = T;
                Errors.warn( $str201$I_should_never_be_called___ );
              }
            }
            if( token_count.eql( current_token_number ) && string_offset.eql( Sequences.length( phrase ) ) )
            {
              result = ConsesLow.cons( v_term, result );
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$167 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$167, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$166, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Sequences.delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 57354L)
  public static SubLObject denotation_mapper(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically)
  {
    if( excluded_preds == UNPROVIDED )
    {
      excluded_preds = NIL;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw202$GREEDY;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( string, $sym87$STRINGP );
    enforceType( excluded_preds, $sym203$LIST_OF_PREDICATES_P );
    enforceType( mode, $sym103$KEYWORDP );
    enforceType( parse_morphologically, $sym96$PARSE_MORPHOLOGICALLY_OPTION_P );
    SubLObject result = NIL;
    SubLObject failures = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$168 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          SubLObject cdolist_list_var;
          final SubLObject raw_mapping = cdolist_list_var = nl_trie_accessors.nl_trie_denotation_mapper( string, excluded_preds, mode, parse_morphologically );
          SubLObject token = NIL;
          token = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != standard_tokenization.string_token_value( token ) )
            {
              result = ConsesLow.cons( token, result );
            }
            else
            {
              final SubLObject number = string_utilities.string_to_number( standard_tokenization.string_token_string( token ) );
              if( NIL != number )
              {
                result = ConsesLow.cons( standard_tokenization.new_string_token( standard_tokenization.string_token_string( token ), number ), result );
              }
              else
              {
                failures = ConsesLow.cons( token, failures );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$169 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$169, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$168, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( result ), Sequences.nreverse( failures ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 58891L)
  public static SubLObject all_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject denots = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$170 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject denots_$171 = nl_trie_accessors.nl_trie_all_denots_of_string( string, misspellingsP, lookup_mt, UNPROVIDED );
            final SubLObject predicate_lists_$172 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = denots_$171;
            predicate_lists = predicate_lists_$172;
          }
          if( NIL != proceed_with_morphological_parsingP( denots, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string( string, UNPROVIDED );
            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = ConsesLow.append( denots, morph_denots );
            predicate_lists = ConsesLow.append( predicate_lists, morph_predicate_lists );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$171, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$170, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 60187L)
  public static SubLObject most_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject denots = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$174 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject denots_$175 = nl_trie_accessors.nl_trie_denots_of_string( string, $list209, $kw210$RELATED, misspellingsP, NIL, lookup_mt, UNPROVIDED );
            final SubLObject predicate_lists_$176 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = denots_$175;
            predicate_lists = predicate_lists_$176;
          }
          if( NIL != proceed_with_morphological_parsingP( denots, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string( string, UNPROVIDED );
            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = ConsesLow.append( denots, morph_denots );
            predicate_lists = ConsesLow.append( predicate_lists, morph_predicate_lists );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$175 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$175, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$174, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 61538L)
  public static SubLObject all_parsing_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject ans = NIL;
    final SubLObject skip_namesP = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$178 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject denots = nl_trie_accessors.nl_trie_denots_of_string( string, $list209, $kw172$DENOT, misspellingsP, skip_namesP, lookup_mt, UNPROVIDED );
            final SubLObject pred_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject denot = NIL;
            SubLObject denot_$179 = NIL;
            SubLObject pred_list = NIL;
            SubLObject pred_list_$180 = NIL;
            denot = denots;
            denot_$179 = denot.first();
            pred_list = pred_lists;
            pred_list_$180 = pred_list.first();
            while ( NIL != pred_list || NIL != denot)
            {
              SubLObject okP = NIL;
              if( NIL == okP )
              {
                SubLObject csome_list_var = pred_list_$180;
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while ( NIL == okP && NIL != csome_list_var)
                {
                  if( NIL == parsing_utilities.npp_excluded_name_predP( pred ) )
                  {
                    okP = T;
                    ans = ConsesLow.cons( denot_$179, ans );
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
            final SubLObject result = reader.read_from_string_ignoring_errors( string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != collection_defns.cyc_real_number( result ) )
            {
              ans = ConsesLow.cons( result, ans );
            }
          }
          if( NIL != proceed_with_morphological_parsingP( ans, parse_morphologically ) )
          {
            ans = czer_utilities.delete_el_duplicates( ConsesLow.append( ans, morphological_word_parser.denots_of_complex_word_string( string, UNPROVIDED ) ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$179, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$178, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 63318L)
  public static SubLObject denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt,
      SubLObject parse_morphologically, SubLObject parse_dates_and_numbersP, SubLObject lexicon)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    if( parse_dates_and_numbersP == UNPROVIDED )
    {
      parse_dates_and_numbersP = T;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( string, $sym211$CYCL_STRING_P );
    enforceType( abbrev_types, $sym174$LISTP );
    enforceType( denot_type, $sym103$KEYWORDP );
    enforceType( misspellingsP, $sym175$BOOLEANP );
    enforceType( skip_namestringsP, $sym175$BOOLEANP );
    enforceType( lookup_mt, $sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_ );
    enforceType( parse_morphologically, $sym96$PARSE_MORPHOLOGICALLY_OPTION_P );
    SubLObject denots = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$182 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( lookup_mt.isString() )
          {
            lookup_mt = denots_mt_for_language( lexicon_utilities.get_language_for_code( lookup_mt ) );
          }
          final SubLObject _prev_bind_0_$183 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
          try
          {
            lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
            if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
            {
              if( NIL == lexicon )
              {
                lexicon = denots_of_string_lexicon.lexicon_for_denots_of_string( abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$
                    .getDynamicValue( thread ) );
              }
              thread.resetMultipleValues();
              final SubLObject denots_$184 = denots_of_string_lexicon.lexicon_denots_of_string( string, lexicon );
              final SubLObject predicate_lists_$185 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              denots = denots_$184;
              predicate_lists = predicate_lists_$185;
              if( NIL != parse_dates_and_numbersP && string.isString() )
              {
                final SubLObject date_and_number_denots = date_and_number_denots_of_string( string );
                thread.resetMultipleValues();
                final SubLObject denots_$185 = add_denots_of_string_results( denots, predicate_lists, date_and_number_denots, ConsesLow.make_list( Sequences.length( date_and_number_denots ), $list213 ) );
                final SubLObject predicate_lists_$186 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                denots = denots_$185;
                predicate_lists = predicate_lists_$186;
              }
            }
            if( string.isString() && NIL != proceed_with_morphological_parsingP( denots, parse_morphologically ) )
            {
              thread.resetMultipleValues();
              final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string( string, UNPROVIDED );
              final SubLObject morph_predicate_lists = thread.secondMultipleValue();
              thread.resetMultipleValues();
              thread.resetMultipleValues();
              final SubLObject denots_$186 = add_denots_of_string_results( denots, predicate_lists, morph_denots, morph_predicate_lists );
              final SubLObject predicate_lists_$187 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              denots = denots_$186;
              predicate_lists = predicate_lists_$187;
            }
          }
          finally
          {
            lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0_$183, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$184 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$184, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$182, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 66933L)
  public static SubLObject valid_denots_of_string_lookup_mt_specificationP(final SubLObject obj)
  {
    return makeBoolean( NIL != hlmt.hlmt_p( obj ) || ( obj.isString() && NIL != lexicon_utilities.get_language_for_code( obj ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 67104L)
  public static SubLObject denots_mt_for_language(final SubLObject language)
  {
    final SubLObject validated_psc = kb_mapping_utilities.fpred_value_in_any_mt( language, $const219$validatedLexicalPSCForLanguage, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject monad = ( NIL != validated_psc ) ? validated_psc : lexicon_utilities.lexical_mt_for_language( language );
    return hlmt_czer.canonicalize_hlmt( el_utilities.make_binary_formula( $const220$MtSpace, monad, $const221$AnytimePSC ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 67483L)
  public static SubLObject add_denots_of_string_results(final SubLObject denots, final SubLObject predicate_lists, final SubLObject new_denots, final SubLObject new_predicate_lists)
  {
    SubLObject all_denots = denots;
    SubLObject all_predicate_lists = predicate_lists;
    SubLObject denot = NIL;
    SubLObject denot_$191 = NIL;
    SubLObject predicate_list = NIL;
    SubLObject predicate_list_$192 = NIL;
    denot = new_denots;
    denot_$191 = denot.first();
    predicate_list = new_predicate_lists;
    predicate_list_$192 = predicate_list.first();
    while ( NIL != predicate_list || NIL != denot)
    {
      final SubLObject position = Sequences.position( denot_$191, all_denots, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == position )
      {
        all_denots = list_utilities.add_to_end( denot_$191, all_denots );
        all_predicate_lists = list_utilities.add_to_end( predicate_list_$192, all_predicate_lists );
      }
      else
      {
        ConsesLow.set_nth( position, all_predicate_lists, conses_high.union( ConsesLow.nth( position, all_predicate_lists ), predicate_list_$192, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
      }
      denot = denot.rest();
      denot_$191 = denot.first();
      predicate_list = predicate_list.rest();
      predicate_list_$192 = predicate_list.first();
    }
    return Values.values( all_denots, all_predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 68126L)
  public static SubLObject date_and_number_denots_of_string(final SubLObject string)
  {
    final SubLObject date_parses = date_utilities.parse_date_from_string_fast( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject number_parse = numeral_parser.string_to_interval( string );
    return list_utilities.cons_if( number_parse, date_parses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 68388L)
  public static SubLObject denots_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt,
      SubLObject precise_with_theP, SubLObject parse_morphologically)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( precise_with_theP == UNPROVIDED )
    {
      precise_with_theP = NIL;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    if( NIL != speech_part_predP( pred, UNPROVIDED ) )
    {
      return denots_of_stringXpos_pred( string, pred, abbrev_types, denot_type, misspellingsP, lookup_mt, parse_morphologically );
    }
    if( NIL != lexicon_vars.name_string_predP( pred ) )
    {
      return denots_of_stringXnamestring_pred( string, pred, misspellingsP, lookup_mt, precise_with_theP );
    }
    Errors.error( $str222$_S_passes_neither_SPEECH_PART_PRE, pred );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 69099L)
  public static SubLObject denots_of_stringXnamestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( precise_with_theP == UNPROVIDED )
    {
      precise_with_theP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexicon_vars.name_string_predP( namestring_pred ) : namestring_pred;
    SubLObject result_denots = NIL;
    SubLObject result_preds = NIL;
    thread.resetMultipleValues();
    final SubLObject denots = denots_of_name_string( string, misspellingsP, lookup_mt, precise_with_theP );
    final SubLObject preds = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject denot = NIL;
    SubLObject denot_$193 = NIL;
    SubLObject pred_list = NIL;
    SubLObject pred_list_$194 = NIL;
    denot = denots;
    denot_$193 = denot.first();
    pred_list = preds;
    pred_list_$194 = pred_list.first();
    while ( NIL != pred_list || NIL != denot)
    {
      SubLObject cdolist_list_var = pred_list_$194;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject result_pred_list = NIL;
        if( NIL != genl_pos_predP( pred, namestring_pred, UNPROVIDED ) )
        {
          result_pred_list = ConsesLow.cons( pred, result_pred_list );
        }
        if( NIL != result_pred_list )
        {
          result_preds = ConsesLow.cons( result_pred_list, result_preds );
          result_denots = ConsesLow.cons( denot_$193, result_denots );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      denot = denot.rest();
      denot_$193 = denot.first();
      pred_list = pred_list.rest();
      pred_list_$194 = pred_list.first();
    }
    return Values.values( Sequences.nreverse( result_denots ), Sequences.nreverse( result_preds ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 70087L)
  public static SubLObject denots_of_stringXpos_pred(final SubLObject string, final SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt,
      SubLObject parse_morphologically)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != speech_part_predP( pos_pred, UNPROVIDED ) : pos_pred;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject denots = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$195 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject denots_$196 = nl_trie_accessors.nl_trie_denots_of_stringXpred( string, pos_pred, abbrev_types, denot_type, misspellingsP, lookup_mt, UNPROVIDED );
            final SubLObject predicate_lists_$197 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = denots_$196;
            predicate_lists = predicate_lists_$197;
          }
          if( NIL != proceed_with_morphological_parsingP( denots, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXpos_pred( string, pos_pred, lookup_mt, UNPROVIDED );
            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = ConsesLow.append( denots, morph_denots );
            predicate_lists = ConsesLow.append( predicate_lists, morph_predicate_lists );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$196 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$196, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$195, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 71427L)
  public static SubLObject denots_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt,
      SubLObject parse_morphologically)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject denots = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$199 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject denots_$200 = nl_trie_accessors.nl_trie_denots_of_stringXspeech_part( string, pos, abbrev_types, denot_type, misspellingsP, lookup_mt, UNPROVIDED );
            final SubLObject predicate_lists_$201 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = denots_$200;
            predicate_lists = predicate_lists_$201;
          }
          if( NIL != proceed_with_morphological_parsingP( denots, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXspeech_part( string, pos, UNPROVIDED );
            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = ConsesLow.append( denots, morph_denots );
            predicate_lists = ConsesLow.append( predicate_lists, morph_predicate_lists );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$200 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$200, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$199, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 72775L)
  public static SubLObject denots_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject denot_type, SubLObject misspellingsP, SubLObject abbrev_types, SubLObject lookup_mt,
      SubLObject parse_morphologically)
  {
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.keywordp( pos_keyword ) : pos_keyword;
    assert NIL != lexicon_vars.parse_morphologically_option_p( parse_morphologically ) : parse_morphologically;
    SubLObject denots = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$203 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == skip_to_morphological_parsingP( parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject denots_$204 = nl_trie_accessors.nl_trie_denots_of_stringXpos( string, pos_keyword, abbrev_types, denot_type, misspellingsP, lookup_mt, UNPROVIDED );
            final SubLObject predicate_lists_$205 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = denots_$204;
            predicate_lists = predicate_lists_$205;
          }
          if( NIL != proceed_with_morphological_parsingP( denots, parse_morphologically ) )
          {
            thread.resetMultipleValues();
            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXpos( string, pos_keyword, lookup_mt, UNPROVIDED );
            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denots = ConsesLow.append( denots, morph_denots );
            predicate_lists = ConsesLow.append( predicate_lists, morph_predicate_lists );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$204 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$204, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$203, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, predicate_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 74232L)
  public static SubLObject denots_of_name_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( precise_with_theP == UNPROVIDED )
    {
      precise_with_theP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    SubLObject pred_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$207 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots_$208 = nl_trie_accessors.nl_trie_denots_of_name_string( string, misspellingsP, lookup_mt, precise_with_theP, UNPROVIDED );
          final SubLObject pred_lists_$209 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denots = denots_$208;
          pred_lists = pred_lists_$209;
        }
        finally
        {
          final SubLObject _prev_bind_0_$208 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$208, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$207, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 74861L)
  public static SubLObject denots_of_name_string_precise(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return denots_of_name_string( string, misspellingsP, lookup_mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 75233L)
  public static SubLObject denots_of_wu(final SubLObject wu, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denotations = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject denot_preds = cdolist_list_var = nl_trie.nl_trie_denotation_predicates();
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == lexicon_utilities.stringlist_args_of_pred_cached( pred ) )
        {
          final SubLObject word_index = lexicon_utilities.wu_arg_of_pred_cached( pred );
          final SubLObject denot_index = lexicon_utilities.denotatum_arg_of_pred_cached( pred );
          SubLObject cdolist_list_var_$211 = kb_mapping.gather_gaf_arg_index( wu, word_index, pred, UNPROVIDED, UNPROVIDED );
          SubLObject v_assert = NIL;
          v_assert = cdolist_list_var_$211.first();
          while ( NIL != cdolist_list_var_$211)
          {
            denotations = ConsesLow.cons( cycl_utilities.formula_arg( v_assert, denot_index, UNPROVIDED ), denotations );
            cdolist_list_var_$211 = cdolist_list_var_$211.rest();
            v_assert = cdolist_list_var_$211.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return denotations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 75826L)
  public static SubLObject proceed_with_morphological_parsingP(final SubLObject results_so_far, final SubLObject parse_morphologically_option)
  {
    if( parse_morphologically_option.eql( $kw224$ONLY ) || parse_morphologically_option.eql( $kw225$ALWAYS ) )
    {
      return T;
    }
    if( parse_morphologically_option.eql( $kw99$AS_FALLBACK ) )
    {
      return Types.sublisp_null( results_so_far );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 76233L)
  public static SubLObject skip_to_morphological_parsingP(final SubLObject parse_morphologically_option)
  {
    return Equality.eq( parse_morphologically_option, $kw224$ONLY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 76504L)
  public static SubLObject denots_of_acronym_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    SubLObject pred_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$212 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots_$213 = nl_trie_accessors.nl_trie_denots_of_acronym_string( string, misspellingsP, lookup_mt, UNPROVIDED );
          final SubLObject pred_lists_$214 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denots = denots_$213;
          pred_lists = pred_lists_$214;
        }
        finally
        {
          final SubLObject _prev_bind_0_$213 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$213, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$212, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 77002L)
  public static SubLObject names_from_spelling(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    SubLObject pred_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$216 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots_$217 = nl_trie_accessors.nl_trie_names_from_spelling( string, misspellingsP, lookup_mt, UNPROVIDED );
          final SubLObject pred_lists_$218 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denots = denots_$217;
          pred_lists = pred_lists_$218;
        }
        finally
        {
          final SubLObject _prev_bind_0_$217 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$217, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$216, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 77523L)
  public static SubLObject names_from_nickname(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    SubLObject pred_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$220 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots_$221 = nl_trie_accessors.nl_trie_names_from_nickname( string, misspellingsP, lookup_mt, UNPROVIDED );
          final SubLObject pred_lists_$222 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denots = denots_$221;
          pred_lists = pred_lists_$222;
        }
        finally
        {
          final SubLObject _prev_bind_0_$221 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$221, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$220, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 78046L)
  public static SubLObject denots_of_abbreviation_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    SubLObject pred_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$224 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots_$225 = nl_trie_accessors.nl_trie_denots_of_abbreviation_string( string, misspellingsP, lookup_mt, UNPROVIDED );
          final SubLObject pred_lists_$226 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denots = denots_$225;
          pred_lists = pred_lists_$226;
        }
        finally
        {
          final SubLObject _prev_bind_0_$225 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$225, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$224, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 78626L)
  public static SubLObject known_proper_noun_phraseP(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( phrase ) : phrase;
    final SubLObject proper_name_preds = isa.all_fort_instances( $const226$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject denots = NIL;
    SubLObject predicates = NIL;
    SubLObject predicate_lists = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$228 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          thread.resetMultipleValues();
          final SubLObject denots_$229 = denots_of_string( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject predicate_lists_$230 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denots = denots_$229;
          predicate_lists = predicate_lists_$230;
          predicates = list_utilities.flatten( predicate_lists );
          if( NIL != denots && NIL == conses_high.set_difference( predicates, proper_name_preds, UNPROVIDED, UNPROVIDED ) )
          {
            result = T;
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$229 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$229, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$228, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 79576L)
  public static SubLObject determine_denotation_preds(final SubLObject denot_type)
  {
    if( denot_type.eql( $kw227$JUST_RELATED ) )
    {
      return $list228;
    }
    if( denot_type.eql( $kw229$JUST_PLACEHOLDER ) )
    {
      return $list230;
    }
    if( denot_type.eql( $kw210$RELATED ) )
    {
      return $list231;
    }
    if( denot_type.eql( $kw132$ANY ) )
    {
      return $list232;
    }
    return $list233;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 80506L)
  public static SubLObject determine_denotation_pred(final SubLObject denot_type)
  {
    if( denot_type.eql( $kw172$DENOT ) )
    {
      return $const234$denotation;
    }
    if( denot_type.eql( $kw235$PLACEHOLDER ) )
    {
      return $const236$denotationPlaceholder;
    }
    if( denot_type.eql( $kw210$RELATED ) )
    {
      return $const237$denotationRelatedTo;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 80913L)
  public static SubLObject meanings_of_sense(final SubLObject denot_type, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denot_preds = determine_denotation_preds( denot_type );
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = denot_preds;
      SubLObject denot_pred = NIL;
      denot_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred_var = denot_pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$232 = NIL;
                final SubLObject token_var_$233 = NIL;
                while ( NIL == done_var_$232)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$233 );
                  final SubLObject valid_$234 = makeBoolean( !token_var_$233.eql( gaf ) );
                  if( NIL != valid_$234 && NIL != kb_utilities.kbeq( assertions_high.gaf_arg2( gaf ), pos ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg3( gaf ), v_int ) )
                  {
                    final SubLObject item_var = assertions_high.gaf_arg4( gaf );
                    if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var, ans );
                    }
                  }
                  done_var_$232 = makeBoolean( NIL == valid_$234 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$235 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$235, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        denot_pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 81708L)
  public static SubLObject meaning_has_senseP(final SubLObject meaning, final SubLObject denot_type, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denot_preds = determine_denotation_preds( denot_type );
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == ans )
      {
        SubLObject csome_list_var = denot_preds;
        SubLObject denot_pred = NIL;
        denot_pred = csome_list_var.first();
        while ( NIL == ans && NIL != csome_list_var)
        {
          final SubLObject pred_var = denot_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
            SubLObject done_var = ans;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                  SubLObject done_var_$236 = ans;
                  final SubLObject token_var_$237 = NIL;
                  while ( NIL == done_var_$236)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$237 );
                    final SubLObject valid_$238 = makeBoolean( !token_var_$237.eql( gaf ) );
                    if( NIL != valid_$238 && NIL != kb_utilities.kbeq( assertions_high.gaf_arg2( gaf ), pos ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg3( gaf ), v_int ) && assertions_high.gaf_arg4( gaf )
                        .equal( meaning ) )
                    {
                      ans = T;
                    }
                    done_var_$236 = makeBoolean( NIL == valid_$238 || NIL != ans );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$239 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$239, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != ans );
            }
          }
          csome_list_var = csome_list_var.rest();
          denot_pred = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 82562L)
  public static SubLObject denot_has_senseP(final SubLObject denot, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return meaning_has_senseP( denot, $kw172$DENOT, word_unit, pos, v_int, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 82916L)
  public static SubLObject denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return meanings_of_sense( $kw172$DENOT, word_unit, pos, v_int, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 83237L)
  public static SubLObject proper_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return denots_of_sense( word_unit, pos, v_int, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 83588L)
  public static SubLObject related_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return meanings_of_sense( $kw227$JUST_RELATED, word_unit, pos, v_int, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 83932L)
  public static SubLObject placeholder_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return meanings_of_sense( $kw229$JUST_PLACEHOLDER, word_unit, pos, v_int, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 84387L)
  public static SubLObject denots_of_sense_by_mt(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject denot_type)
  {
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denot_preds = determine_denotation_preds( denot_type );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = denot_preds;
    SubLObject denot_pred = NIL;
    denot_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
        final SubLObject pred_var = denot_pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$240 = NIL;
                final SubLObject token_var_$241 = NIL;
                while ( NIL == done_var_$240)
                {
                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$241 );
                  final SubLObject valid_$242 = makeBoolean( !token_var_$241.eql( as ) );
                  if( NIL != valid_$242 && NIL != kb_utilities.kbeq( assertions_high.gaf_arg2( as ), pos ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg3( as ), v_int ) )
                  {
                    final SubLObject item_var = ConsesLow.cons( assertions_high.gaf_arg4( as ), assertions_high.assertion_mt( as ) );
                    if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var, ans );
                    }
                  }
                  done_var_$240 = makeBoolean( NIL == valid_$242 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$243 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$243, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      denot_pred = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 85001L)
  public static SubLObject senses_of_wuXpos(final SubLObject word_unit, final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      SubLObject cdolist_list_var = ConsesLow.cons( $const238$subcatFrame, determine_denotation_preds( $kw132$ANY ) );
      SubLObject predicate = NIL;
      predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$244 = NIL;
                final SubLObject token_var_$245 = NIL;
                while ( NIL == done_var_$244)
                {
                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$245 );
                  final SubLObject valid_$246 = makeBoolean( !token_var_$245.eql( as ) );
                  if( NIL != valid_$246 && ( NIL == mt || NIL != genl_lexicon_mtP( mt, assertions_high.assertion_mt( as ) ) ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg2( as ), pos ) )
                  {
                    final SubLObject item_var = assertions_high.gaf_arg3( as );
                    if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var, ans );
                    }
                  }
                  done_var_$244 = makeBoolean( NIL == valid_$246 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$247 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$247, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        predicate = cdolist_list_var.first();
      }
      final SubLObject semtrans_pred = pos_to_semtrans_pred( pos, UNPROVIDED );
      if( NIL != semtrans_pred )
      {
        final SubLObject pred_var2 = semtrans_pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var2 ) )
        {
          final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$245 = NIL;
                final SubLObject token_var_$246 = NIL;
                while ( NIL == done_var_$245)
                {
                  final SubLObject as2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$246 );
                  final SubLObject valid_$247 = makeBoolean( !token_var_$246.eql( as2 ) );
                  if( NIL != valid_$247 && ( NIL == mt || NIL != genl_lexicon_mtP( mt, assertions_high.assertion_mt( as2 ) ) ) )
                  {
                    final SubLObject item_var2 = assertions_high.gaf_arg2( as2 );
                    if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var2, ans );
                    }
                  }
                  done_var_$245 = makeBoolean( NIL == valid_$247 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$248 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$248, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sort.sort( ans, $sym239$_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 86077L)
  public static SubLObject subcat_frame_arity(final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( frame ) : frame;
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping_utilities.fpred_value( frame, $const241$subcatFrameArity, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 86381L)
  public static SubLObject frames_of_word(final SubLObject word_unit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    SubLObject ans = NIL;
    if( NIL != kb_mapping_utilities.some_pred_value_in_any_mt( word_unit, $const238$subcatFrame, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        ans = kb_mapping_utilities.pred_values( word_unit, $const238$subcatFrame, ONE_INTEGER, FOUR_INTEGER, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 86790L)
  public static SubLObject frames_of_wordXpos(final SubLObject word_unit, final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    SubLObject ans = NIL;
    if( NIL != frames_of_word( word_unit ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var = $const238$subcatFrame;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, ONE_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$252 = NIL;
                final SubLObject token_var_$253 = NIL;
                while ( NIL == done_var_$252)
                {
                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$253 );
                  final SubLObject valid_$254 = makeBoolean( !token_var_$253.eql( as ) );
                  if( NIL != valid_$254 && assertions_high.gaf_arg2( as ).equal( pos ) )
                  {
                    final SubLObject item_var = assertions_high.gaf_arg4( as );
                    if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var, ans );
                    }
                  }
                  done_var_$252 = makeBoolean( NIL == valid_$254 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$255 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$255, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        final SubLObject semtrans_pred = pos_to_semtrans_pred( pos, UNPROVIDED );
        if( NIL != semtrans_pred )
        {
          final SubLObject pred_var2 = semtrans_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, ONE_INTEGER, pred_var2 ) )
          {
            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, ONE_INTEGER, pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw42$GAF, $kw56$TRUE, NIL );
                  SubLObject done_var_$253 = NIL;
                  final SubLObject token_var_$254 = NIL;
                  while ( NIL == done_var_$253)
                  {
                    final SubLObject as2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$254 );
                    final SubLObject valid_$255 = makeBoolean( !token_var_$254.eql( as2 ) );
                    if( NIL != valid_$255 )
                    {
                      final SubLObject item_var2 = assertions_high.gaf_arg3( as2 );
                      if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                      {
                        ans = ConsesLow.cons( item_var2, ans );
                      }
                    }
                    done_var_$253 = makeBoolean( NIL == valid_$255 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$256 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$256, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 87563L)
  public static SubLObject frames_of_word_posXdenot(final SubLObject word_unit, final SubLObject pos, final SubLObject denot)
  {
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    SubLObject ans = NIL;
    if( NIL != frames_of_word( word_unit ) )
    {
      SubLObject cdolist_list_var = senses_of_wuXpos( word_unit, pos, UNPROVIDED );
      SubLObject sense = NIL;
      sense = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != denot_has_senseP( denot, word_unit, pos, sense, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var_$260 = frames_of_sense( word_unit, pos, sense, UNPROVIDED );
          SubLObject frame = NIL;
          frame = cdolist_list_var_$260.first();
          while ( NIL != cdolist_list_var_$260)
          {
            final SubLObject item_var = frame;
            if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              ans = ConsesLow.cons( item_var, ans );
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
  public static SubLObject frames_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const238$subcatFrame;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
              SubLObject done_var_$261 = NIL;
              final SubLObject token_var_$262 = NIL;
              while ( NIL == done_var_$261)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$262 );
                final SubLObject valid_$263 = makeBoolean( !token_var_$262.eql( as ) );
                if( NIL != valid_$263 && assertions_high.gaf_arg2( as ).equal( pos ) && assertions_high.gaf_arg3( as ).equal( v_int ) )
                {
                  final SubLObject item_var = assertions_high.gaf_arg4( as );
                  if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var, ans );
                  }
                }
                done_var_$261 = makeBoolean( NIL == valid_$263 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$264 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$264, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 88922L)
  public static SubLObject frames_of_sense_by_mt(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const238$subcatFrame;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
              SubLObject done_var_$265 = NIL;
              final SubLObject token_var_$266 = NIL;
              while ( NIL == done_var_$265)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$266 );
                final SubLObject valid_$267 = makeBoolean( !token_var_$266.eql( as ) );
                if( NIL != valid_$267 && assertions_high.gaf_arg2( as ).equal( pos ) && assertions_high.gaf_arg3( as ).equal( v_int ) )
                {
                  final SubLObject item_var = ConsesLow.cons( assertions_high.gaf_arg4( as ), assertions_high.assertion_mt( as ) );
                  if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var, ans );
                  }
                }
                done_var_$265 = makeBoolean( NIL == valid_$267 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$268 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$268, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89531L)
  public static SubLObject politeness_of_ws_pred()
  {
    return $const242$politenessOfWS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89601L)
  public static SubLObject formality_of_ws_pred()
  {
    return $const243$formalityOfWS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89669L)
  public static SubLObject politeness_levels_of_assertion(final SubLObject assertion, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = assertions_high.assertion_mt( assertion );
    }
    return ( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) ) ? backward.removal_ask_variable( $sym244$_LEVEL, ConsesLow.listS( politeness_of_ws_pred(), assertion, $list245 ), mt, UNPROVIDED,
        UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89967L)
  public static SubLObject formality_levels_of_assertion(final SubLObject assertion, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = assertions_high.assertion_mt( assertion );
    }
    return ( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) ) ? backward.removal_ask_variable( $sym244$_LEVEL, ConsesLow.listS( formality_of_ws_pred(), assertion, $list245 ), mt, UNPROVIDED,
        UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 90262L)
  public static SubLObject potentially_offensive_politeness_levelP(final SubLObject level)
  {
    return subl_promotions.memberP( level, $list246, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 90617L)
  public static SubLObject includes_potentially_offensive_politeness_levelP(final SubLObject politeness_levels)
  {
    return list_utilities.sublisp_boolean( Sequences.find_if( $sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_, politeness_levels, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 90988L)
  public static SubLObject potentially_offensive_lexical_assertionP(final SubLObject assertion)
  {
    final SubLObject politeness_levels = politeness_levels_of_assertion( assertion, UNPROVIDED );
    return includes_potentially_offensive_politeness_levelP( politeness_levels );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91553L)
  public static SubLObject slang_lexical_assertionP(final SubLObject assertion)
  {
    return subl_promotions.memberP( $const248$SlangSpeech, formality_levels_of_assertion( assertion, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91759L)
  public static SubLObject archaic_lexical_assertionP(final SubLObject assertion)
  {
    return subl_promotions.memberP( $const249$ArchaicSpeech, formality_levels_of_assertion( assertion, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
  public static SubLObject clear_indirect_lexical_assertionP()
  {
    final SubLObject cs = $indirect_lexical_assertionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
  public static SubLObject remove_indirect_lexical_assertionP(final SubLObject assertion)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $indirect_lexical_assertionP_caching_state$.getGlobalValue(), ConsesLow.list( assertion ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
  public static SubLObject indirect_lexical_assertionP_internal(final SubLObject assertion)
  {
    return isa.isaP( cycl_utilities.formula_arg0( assertion ), $const251$DenotationPredicate_ExcludedFromN, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
  public static SubLObject indirect_lexical_assertionP(final SubLObject assertion)
  {
    SubLObject caching_state = $indirect_lexical_assertionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym250$INDIRECT_LEXICAL_ASSERTION_, $sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_ );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( indirect_lexical_assertionP_internal( assertion ) ) );
      memoization_state.caching_state_put( caching_state, assertion, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 92268L)
  public static SubLObject inappropriate_lexical_assertionP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue( thread ) && NIL != potentially_offensive_lexical_assertionP( assertion ) )
    {
      return T;
    }
    if( NIL != lexicon_vars.$exclude_slangP$.getDynamicValue( thread ) && NIL != slang_lexical_assertionP( assertion ) )
    {
      return T;
    }
    if( NIL != lexicon_vars.$exclude_archaic_speechP$.getDynamicValue( thread ) && NIL != archaic_lexical_assertionP( assertion ) )
    {
      return T;
    }
    if( NIL != lexicon_vars.$exclude_indirect_relationsP$.getDynamicValue( thread ) && NIL != indirect_lexical_assertionP( assertion ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 92817L)
  public static SubLObject gather_denotation_assertions(final SubLObject word, final SubLObject speech_part, final SubLObject sense_num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      SubLObject cdolist_list_var = determine_denotation_preds( $kw132$ANY );
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$269 = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        SubLObject assertion = NIL;
        assertion = cdolist_list_var_$269.first();
        while ( NIL != cdolist_list_var_$269)
        {
          if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != kb_utilities.kbeq( assertion_pos( assertion ), speech_part ) && NIL != kb_utilities.kbeq( assertion_sense_num( assertion ), sense_num ) )
          {
            denot_assertions = ConsesLow.cons( assertion, denot_assertions );
          }
          cdolist_list_var_$269 = cdolist_list_var_$269.rest();
          assertion = cdolist_list_var_$269.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return denot_assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 93607L)
  public static SubLObject potentially_offensive_senseP(final SubLObject word, final SubLObject speech_part, final SubLObject sense)
  {
    assert NIL != forts.fort_p( word ) : word;
    assert NIL != speech_partP( speech_part, UNPROVIDED ) : speech_part;
    assert NIL != Types.integerp( sense ) : sense;
    SubLObject offensiveP = NIL;
    if( NIL == offensiveP )
    {
      SubLObject csome_list_var;
      SubLObject assertion;
      for( csome_list_var = gather_denotation_assertions( word, speech_part, sense ), assertion = NIL, assertion = csome_list_var.first(); NIL == offensiveP
          && NIL != csome_list_var; offensiveP = potentially_offensive_lexical_assertionP( assertion ), csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first() )
      {
      }
    }
    return offensiveP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 94161L)
  public static SubLObject inappropriate_senseP(final SubLObject word, final SubLObject speech_part, final SubLObject sense)
  {
    assert NIL != forts.fort_p( word ) : word;
    assert NIL != speech_partP( speech_part, UNPROVIDED ) : speech_part;
    assert NIL != Types.integerp( sense ) : sense;
    if( NIL == lexicon_vars.lexicon_filters() )
    {
      return NIL;
    }
    SubLObject inappropriateP = NIL;
    if( NIL == inappropriateP )
    {
      SubLObject csome_list_var;
      SubLObject assertion;
      for( csome_list_var = gather_denotation_assertions( word, speech_part, sense ), assertion = NIL, assertion = csome_list_var.first(); NIL == inappropriateP
          && NIL != csome_list_var; inappropriateP = inappropriate_lexical_assertionP( assertion ), csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first() )
      {
      }
    }
    return inappropriateP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 94882L)
  public static SubLObject semtrans_of_ws(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int)
  {
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    assert NIL != Types.integerp( v_int ) : v_int;
    return semtrans_lookup_int( word_unit, pos, v_int, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 95322L)
  public static SubLObject semtrans_of_wuXpos(final SubLObject word_unit, final SubLObject pos, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = NIL;
    }
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    return semtrans_lookup_int( word_unit, pos, NIL, frame );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 95747L)
  public static SubLObject semtrans_lookup_int(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject frame)
  {
    if( frame == UNPROVIDED )
    {
      frame = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = pos_to_semtrans_pred( pos, UNPROVIDED );
    SubLObject ans = NIL;
    if( NIL != pred )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var = pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$270 = NIL;
                final SubLObject token_var_$271 = NIL;
                while ( NIL == done_var_$270)
                {
                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$271 );
                  final SubLObject valid_$272 = makeBoolean( !token_var_$271.eql( as ) );
                  if( NIL != valid_$272 )
                  {
                    final SubLObject as_sense = assertions_high.gaf_arg2( as );
                    final SubLObject as_frame = assertions_high.gaf_arg3( as );
                    if( ( NIL == v_int || NIL != kb_utilities.kbeq( as_sense, v_int ) ) && ( NIL == frame || NIL != kb_utilities.kbeq( as_frame, frame ) ) && NIL == inappropriate_lexical_assertionP( as )
                        && NIL == inappropriate_senseP( word_unit, pos, as_sense ) )
                    {
                      final SubLObject semtransarg = lexicon_utilities.semtrans_arg_of_pred_cached( pred );
                      final SubLObject template = semtrans_template_from_assertion( as, semtransarg );
                      final SubLObject item_var = narts_high.nart_substitute( template );
                      if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                      {
                        ans = ConsesLow.cons( item_var, ans );
                      }
                    }
                  }
                  done_var_$270 = makeBoolean( NIL == valid_$272 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$273 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$273, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 97266L)
  public static SubLObject semtrans_template_from_assertion(final SubLObject as, SubLObject semtrans_arg)
  {
    if( semtrans_arg == UNPROVIDED )
    {
      semtrans_arg = NIL;
    }
    assert NIL != assertions_high.gaf_assertionP( as ) : as;
    if( NIL == semtrans_arg )
    {
      final SubLObject pred = assertions_high.gaf_arg0( as );
      semtrans_arg = lexicon_utilities.semtrans_arg_of_pred_cached( pred );
    }
    final SubLObject raw_template = assertions_high.gaf_arg( as, semtrans_arg );
    return ( NIL != el_utilities.el_formula_with_operator_p( raw_template, $const256$Quote ) ) ? cycl_utilities.formula_arg1( raw_template, UNPROVIDED ) : raw_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 97845L)
  public static SubLObject semtrans_sentence_infer(final SubLObject word_unit, final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject templates = NIL;
    final SubLObject semtrans_pred = pos_to_semtrans_pred( pos, UNPROVIDED );
    if( NIL != kb_indexing_datastructures.indexed_term_p( semtrans_pred ) && NIL == semtrans_assertion_lookup( word_unit, pos, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject denots = denots_of_word( word_unit, pos );
      final SubLObject senses = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject denot = NIL;
      SubLObject denot_$274 = NIL;
      SubLObject sense = NIL;
      SubLObject sense_$275 = NIL;
      denot = denots;
      denot_$274 = denot.first();
      sense = senses;
      sense_$275 = sense.first();
      while ( NIL != sense || NIL != denot)
      {
        SubLObject cdolist_list_var = frames_of_sense( word_unit, pos, sense_$275, UNPROVIDED );
        SubLObject frame = NIL;
        frame = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$276 = psp_semantics.psp_devise_word_templates( word_unit, pos, ConsesLow.list( denot_$274 ), ConsesLow.list( frame ) );
          SubLObject template = NIL;
          template = cdolist_list_var_$276.first();
          while ( NIL != cdolist_list_var_$276)
          {
            final SubLObject args = ConsesLow.list( word_unit, sense_$275, frame, template );
            final SubLObject item_var;
            final SubLObject semtrans_sentence = item_var = el_utilities.make_el_formula( semtrans_pred, args, UNPROVIDED );
            if( NIL == conses_high.member( item_var, templates, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              templates = ConsesLow.cons( item_var, templates );
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
  public static SubLObject denots_of_word(final SubLObject word_unit, SubLObject pos)
  {
    if( pos == UNPROVIDED )
    {
      pos = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const234$denotation;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
              SubLObject done_var_$277 = NIL;
              final SubLObject token_var_$278 = NIL;
              while ( NIL == done_var_$277)
              {
                final SubLObject denot_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$278 );
                final SubLObject valid_$279 = makeBoolean( !token_var_$278.eql( denot_as ) );
                if( NIL != valid_$279 && ( NIL == pos || NIL != genl_posP( assertions_high.gaf_arg2( denot_as ), pos, UNPROVIDED ) ) )
                {
                  final SubLObject item_var = ConsesLow.cons( assertions_high.gaf_arg4( denot_as ), assertions_high.gaf_arg3( denot_as ) );
                  if( NIL == conses_high.member( item_var, denots, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    denots = ConsesLow.cons( item_var, denots );
                  }
                }
                done_var_$277 = makeBoolean( NIL == valid_$279 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$280 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$280, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Mapping.mapcar( Symbols.symbol_function( $sym257$CAR ), denots ), Mapping.mapcar( Symbols.symbol_function( $sym258$CDR ), denots ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 99227L)
  public static SubLObject semtrans_assertion_lookup(final SubLObject word_unit, final SubLObject pos, SubLObject v_int)
  {
    if( v_int == UNPROVIDED )
    {
      v_int = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != lexical_wordP( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    final SubLObject pred = pos_to_semtrans_pred( pos, UNPROVIDED );
    SubLObject ans = NIL;
    if( NIL != pred && NIL != kb_indexing_datastructures.indexed_term_p( word_unit ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var = pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$281 = NIL;
                final SubLObject token_var_$282 = NIL;
                while ( NIL == done_var_$281)
                {
                  final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$282 );
                  final SubLObject valid_$283 = makeBoolean( !token_var_$282.eql( as ) );
                  if( NIL != valid_$283 )
                  {
                    final SubLObject as_sense = assertions_high.gaf_arg2( as );
                    if( ( NIL == v_int || NIL != kb_utilities.kbeq( as_sense, v_int ) ) && NIL == inappropriate_lexical_assertionP( as ) && NIL == inappropriate_senseP( word_unit, pos, as_sense ) )
                    {
                      final SubLObject item_var = as;
                      if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                      {
                        ans = ConsesLow.cons( item_var, ans );
                      }
                    }
                  }
                  done_var_$281 = makeBoolean( NIL == valid_$283 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$284 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$284, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 100247L)
  public static SubLObject all_semtrans_assertions(final SubLObject word_unit, final SubLObject pos, SubLObject v_int)
  {
    if( v_int == UNPROVIDED )
    {
      v_int = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( word_unit ) : word_unit;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding( thread );
    try
    {
      lexicon_vars.$exclude_vulgaritiesP$.bind( NIL, thread );
      lexicon_vars.$exclude_slangP$.bind( NIL, thread );
      assertions = semtrans_assertion_lookup( word_unit, pos, v_int );
    }
    finally
    {
      lexicon_vars.$exclude_slangP$.rebind( _prev_bind_2, thread );
      lexicon_vars.$exclude_vulgaritiesP$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 100672L)
  public static SubLObject preposition_of_frame(final SubLObject prep_frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = ( NIL != isa.isaP( prep_frame, $const259$TransitivePPFrameType, UNPROVIDED, UNPROVIDED ) || NIL != isa.isaP( prep_frame, $const260$DitransitivePPFrameType, UNPROVIDED, UNPROVIDED ) ) ? lexicon_cache
          .words_of_string( string_utilities.string_after( constants_high.constant_name( prep_frame ), Characters.CHAR_hyphen ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 101071L)
  public static SubLObject assertion_denotation(final SubLObject as)
  {
    final SubLObject pred = assertions_high.gaf_arg0( as );
    final SubLObject denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached( pred );
    return ( NIL != denot_arg ) ? assertions_high.gaf_arg( as, denot_arg ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 101430L)
  public static SubLObject assertion_pos(final SubLObject as)
  {
    final SubLObject pred = assertions_high.gaf_arg0( as );
    final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached( pred );
    return ( NIL != pos_arg ) ? assertions_high.gaf_arg( as, pos_arg ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 101701L)
  public static SubLObject assertion_sense_num(final SubLObject assertion)
  {
    final SubLObject pred = assertions_high.gaf_arg0( assertion );
    final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached( pred );
    final SubLObject sense_arg = ( NIL != pos_arg ) ? number_utilities.f_1X( pos_arg ) : NIL;
    final SubLObject sense_num = ( NIL != sense_arg ) ? assertions_high.gaf_arg( assertion, sense_arg ) : NIL;
    return sense_num.isInteger() ? sense_num : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
  public static SubLObject clear_agr_of_det_string()
  {
    final SubLObject cs = $agr_of_det_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
  public static SubLObject remove_agr_of_det_string(final SubLObject string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $agr_of_det_string_caching_state$.getGlobalValue(), ConsesLow.list( string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
  public static SubLObject agr_of_det_string_internal(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( string.equal( $str200$ ) )
    {
      return $list262;
    }
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$285 = agreement_lookup( word );
      SubLObject pos_pred = NIL;
      pos_pred = cdolist_list_var_$285.first();
      while ( NIL != cdolist_list_var_$285)
      {
        ans = ConsesLow.cons( pos_pred, ans );
        cdolist_list_var_$285 = cdolist_list_var_$285.rest();
        pos_pred = cdolist_list_var_$285.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject nearest_common_genl_preds = speech_part_pred_min_ceilings( ans, UNPROVIDED );
      ans = ( ( NIL != nearest_common_genl_preds ) ? nearest_common_genl_preds : ans );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
  public static SubLObject agr_of_det_string(final SubLObject string)
  {
    SubLObject caching_state = $agr_of_det_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym261$AGR_OF_DET_STRING, $sym263$_AGR_OF_DET_STRING_CACHING_STATE_, $int134$64, EQUALP, ONE_INTEGER, SIXTEEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( agr_of_det_string_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102884L)
  public static SubLObject agreement_lookup(final SubLObject word_unit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( word_unit ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        ans = kb_mapping_utilities.pred_values( word_unit, $const264$determinerAgreement, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 103223L)
  public static SubLObject denot_ws_lookup(final SubLObject word_unit, final SubLObject speech_part, SubLObject denot_type)
  {
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw172$DENOT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denot_preds = determine_denotation_preds( denot_type );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = denot_preds;
    SubLObject denot_pred = NIL;
    denot_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var = denot_pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( word_unit, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( word_unit, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                SubLObject done_var_$286 = NIL;
                final SubLObject token_var_$287 = NIL;
                while ( NIL == done_var_$286)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$287 );
                  final SubLObject valid_$288 = makeBoolean( !token_var_$287.eql( ass ) );
                  if( NIL != valid_$288 && NIL != kb_utilities.kbeq( speech_part, assertions_high.gaf_arg2( ass ) ) )
                  {
                    final SubLObject item_var = assertions_high.gaf_arg3( ass );
                    if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var, ans );
                    }
                  }
                  done_var_$286 = makeBoolean( NIL == valid_$288 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$289 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$289, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      denot_pred = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 103931L)
  public static SubLObject pos_to_semtrans_pred(final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( NIL == speech_partP( pos, UNPROVIDED ) )
    {
      return NIL;
    }
    return pos_to_semtrans_pred_cached( pos, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
  public static SubLObject clear_pos_to_semtrans_pred_cached()
  {
    final SubLObject cs = $pos_to_semtrans_pred_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
  public static SubLObject remove_pos_to_semtrans_pred_cached(final SubLObject pos, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pos_to_semtrans_pred_cached_caching_state$.getGlobalValue(), ConsesLow.list( pos, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
  public static SubLObject pos_to_semtrans_pred_cached_internal(final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping_utilities.fpred_value( pos, $const266$semTransPredForPOS, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == ans )
      {
        SubLObject csome_list_var;
        SubLObject genl_pos;
        for( csome_list_var = kb_mapping_utilities.pred_values( pos, $const55$genls, UNPROVIDED, UNPROVIDED, UNPROVIDED ), genl_pos = NIL, genl_pos = csome_list_var.first(); NIL == ans
            && NIL != csome_list_var; ans = pos_to_semtrans_pred( genl_pos, mt ), csome_list_var = csome_list_var.rest(), genl_pos = csome_list_var.first() )
        {
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
  public static SubLObject pos_to_semtrans_pred_cached(final SubLObject pos, final SubLObject mt)
  {
    SubLObject caching_state = $pos_to_semtrans_pred_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym265$POS_TO_SEMTRANS_PRED_CACHED, $sym267$_POS_TO_SEMTRANS_PRED_CACHED_CACHING_STATE_, $int134$64, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym268$CLEAR_POS_TO_SEMTRANS_PRED_CACHED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pos.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pos_to_semtrans_pred_cached_internal( pos, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
  public static SubLObject clear_semtrans_pred_to_pos()
  {
    final SubLObject cs = $semtrans_pred_to_pos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
  public static SubLObject remove_semtrans_pred_to_pos(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $semtrans_pred_to_pos_caching_state$.getGlobalValue(), ConsesLow.list( pred, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
  public static SubLObject semtrans_pred_to_pos_internal(final SubLObject pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = Sort.sort( kb_mapping_utilities.pred_values( pred, $const266$semTransPredForPOS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ), Symbols.symbol_function( $sym100$SPEC_ ), UNPROVIDED ).first();
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
  public static SubLObject semtrans_pred_to_pos(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $semtrans_pred_to_pos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym269$SEMTRANS_PRED_TO_POS, $sym270$_SEMTRANS_PRED_TO_POS_CACHING_STATE_, $int35$128, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( semtrans_pred_to_pos_internal( pred, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 105084L)
  public static SubLObject nicknames_of_name(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping_utilities.pred_values( name, $const271$commonNickname, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 105558L)
  public static SubLObject spellings_of_name(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = kb_mapping_utilities.pred_values( name, $const272$nameSpelling, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 105945L)
  public static SubLObject argn_is_speech_partP(final SubLObject reln, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      ans = subl_promotions.memberP( $const273$SpeechPart, kb_accessors.argn_isa( reln, n, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106353L)
  public static SubLObject speech_parts_initializedP()
  {
    return makeBoolean( NIL != dictionary.dictionary_p( $speech_parts$.getGlobalValue() ) && NIL == dictionary.dictionary_empty_p( $speech_parts$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106496L)
  public static SubLObject clear_speech_parts()
  {
    if( NIL == dictionary.dictionary_p( $speech_parts$.getGlobalValue() ) )
    {
      $speech_parts$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQL ), $int40$256 ) );
    }
    clear_cached_lexical_access_functions();
    return dictionary.clear_dictionary( $speech_parts$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106718L)
  public static SubLObject initialize_speech_parts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_speech_parts();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      if( NIL != constant_handles.valid_constantP( $const273$SpeechPart, UNPROVIDED ) )
      {
        SubLObject node_var = $const273$SpeechPart;
        final SubLObject deck_type = $kw46$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$290 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$291 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$292 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw48$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw51$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw53$WARN ) )
                {
                  Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$292 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$293 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const55$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const55$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const273$SpeechPart, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$293 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$294 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$297 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const55$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject sp_type = node_var;
                      final SubLObject pred_var = $const77$isa;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( sp_type, TWO_INTEGER, pred_var ) )
                      {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( sp_type, TWO_INTEGER, pred_var );
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while ( NIL == done_var)
                        {
                          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                          if( NIL != valid )
                          {
                            SubLObject final_index_iterator = NIL;
                            try
                            {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                              SubLObject done_var_$298 = NIL;
                              final SubLObject token_var_$299 = NIL;
                              while ( NIL == done_var_$298)
                              {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$299 );
                                final SubLObject valid_$300 = makeBoolean( !token_var_$299.eql( as ) );
                                if( NIL != valid_$300 )
                                {
                                  final SubLObject sp = assertions_high.gaf_arg1( as );
                                  final SubLObject mt = assertions_high.assertion_mt( as );
                                  dictionary_utilities.dictionary_push( $speech_parts$.getGlobalValue(), sp, mt );
                                }
                                done_var_$298 = makeBoolean( NIL == valid_$300 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$294 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                if( NIL != final_index_iterator )
                                {
                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                }
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$294, thread );
                              }
                            }
                          }
                          done_var = makeBoolean( NIL == valid );
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const55$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$295 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$295 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$296 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      SubLObject iteration_state_$305;
                                      for( iteration_state_$305 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$305 ); iteration_state_$305 = dictionary_contents.do_dictionary_contents_next( iteration_state_$305 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$305 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$297 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$297, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$305 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$296, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$307;
                            final SubLObject new_list = cdolist_list_var_$307 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$307.first();
                            while ( NIL != cdolist_list_var_$307)
                            {
                              final SubLObject _prev_bind_0_$298 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str57$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$298, thread );
                              }
                              cdolist_list_var_$307 = cdolist_list_var_$307.rest();
                              generating_fn = cdolist_list_var_$307.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$295, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$295, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$297, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$294, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$293, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $const273$SpeechPart, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                      UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$293, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$292, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$292, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$291, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$299 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$299, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$290, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $speech_parts$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 107086L)
  public static SubLObject speech_partP(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    ensure_speech_parts_initialized();
    final SubLObject mts = dictionary.dictionary_lookup_without_values( $speech_parts$.getGlobalValue(), obj, UNPROVIDED );
    SubLObject mt_okP = kb_utilities.kbeq( mt, $const1$InferencePSC );
    if( NIL == mt_okP )
    {
      SubLObject csome_list_var;
      SubLObject ok_mt;
      for( csome_list_var = mts, ok_mt = NIL, ok_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, ok_mt ), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var
          .first() )
      {
      }
    }
    return makeBoolean( NIL != mts && NIL != mt_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 107450L)
  public static SubLObject ensure_speech_parts_initialized()
  {
    if( NIL == speech_parts_initializedP() )
    {
      initialize_speech_parts();
    }
    return $kw6$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 107594L)
  public static SubLObject all_speech_parts(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const1$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    ensure_speech_parts_initialized();
    if( NIL != kb_utilities.kbeq( mt, $const1$InferencePSC ) )
    {
      return dictionary.dictionary_keys( $speech_parts$.getGlobalValue() );
    }
    SubLObject ans = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $speech_parts$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject sp = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject sp_mts = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject mt_okP = NIL;
      if( NIL == mt_okP )
      {
        SubLObject csome_list_var;
        SubLObject sp_mt;
        for( csome_list_var = sp_mts, sp_mt = NIL, sp_mt = csome_list_var.first(); NIL == mt_okP && NIL != csome_list_var; mt_okP = genl_lexicon_mtP( mt, sp_mt ), csome_list_var = csome_list_var
            .rest(), sp_mt = csome_list_var.first() )
        {
        }
      }
      if( NIL != mt_okP )
      {
        ans = ConsesLow.cons( sp, ans );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
  public static SubLObject clear_genl_posP()
  {
    final SubLObject cs = $genl_posP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
  public static SubLObject remove_genl_posP(final SubLObject spec_pos, final SubLObject genl_pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $genl_posP_caching_state$.getGlobalValue(), ConsesLow.list( spec_pos, genl_pos, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
  public static SubLObject genl_posP_internal(final SubLObject spec_pos, final SubLObject genl_pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != mt )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        result = genls.genl_ofP( genl_pos, spec_pos, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
        result = genls.genl_ofP( genl_pos, spec_pos, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_5, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
  public static SubLObject genl_posP(final SubLObject spec_pos, final SubLObject genl_pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject caching_state = $genl_posP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym275$GENL_POS_, $sym276$_GENL_POS__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int35$128 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( spec_pos, genl_pos, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( spec_pos.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( genl_pos.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( genl_posP_internal( spec_pos, genl_pos, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( spec_pos, genl_pos, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108497L)
  public static SubLObject genl_pos_memberP(final SubLObject spec_pos, final SubLObject pos_list)
  {
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = pos_list;
      SubLObject pos = NIL;
      pos = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != genl_posP( spec_pos, pos, UNPROVIDED ) )
        {
          doneP = T;
        }
        csome_list_var = csome_list_var.rest();
        pos = csome_list_var.first();
      }
    }
    return doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108850L)
  public static SubLObject spec_posP(final SubLObject pos1, final SubLObject pos2)
  {
    return genl_posP( pos2, pos1, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108986L)
  public static SubLObject adjpP(final SubLObject pos)
  {
    return Equality.equalp( safe_nart_hl_formula( pos ), $list278 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109171L)
  public static SubLObject vbarP(final SubLObject pos)
  {
    return object_is_compositional_pos_termP( pos, $const279$PhraseFn_Bar1, $const142$Verb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109344L)
  public static SubLObject nbarP(final SubLObject pos)
  {
    return object_is_compositional_pos_termP( pos, $const279$PhraseFn_Bar1, $const36$Noun );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109517L)
  public static SubLObject object_is_compositional_pos_termP(final SubLObject v_object, final SubLObject phrase_fn, final SubLObject genl_pos)
  {
    if( NIL != narts_high.naut_p( v_object ) )
    {
      return makeBoolean( NIL != kb_utilities.kbeq( cycl_utilities.nat_functor( v_object ), phrase_fn ) && NIL != genl_posP( cycl_utilities.nat_arg1( v_object, UNPROVIDED ), genl_pos, UNPROVIDED ) );
    }
    if( NIL != forts.fort_p( v_object ) )
    {
      final SubLObject nart = compositional_pos_nart( phrase_fn, genl_pos );
      return makeBoolean( NIL != nart && NIL != genl_posP( v_object, nart, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
  public static SubLObject clear_compositional_pos_nart()
  {
    final SubLObject cs = $compositional_pos_nart_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
  public static SubLObject remove_compositional_pos_nart(final SubLObject phrase_fn, final SubLObject genl_pos)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $compositional_pos_nart_caching_state$.getGlobalValue(), ConsesLow.list( phrase_fn, genl_pos ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
  public static SubLObject compositional_pos_nart_internal(final SubLObject phrase_fn, final SubLObject genl_pos)
  {
    return narts_high.find_nart( el_utilities.make_unary_formula( phrase_fn, genl_pos ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
  public static SubLObject compositional_pos_nart(final SubLObject phrase_fn, final SubLObject genl_pos)
  {
    SubLObject caching_state = $compositional_pos_nart_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym280$COMPOSITIONAL_POS_NART, $sym281$_COMPOSITIONAL_POS_NART_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( phrase_fn, genl_pos );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( phrase_fn.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && genl_pos.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( compositional_pos_nart_internal( phrase_fn, genl_pos ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( phrase_fn, genl_pos ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110109L)
  public static SubLObject npP(final SubLObject pos)
  {
    return subl_promotions.memberP( safe_nart_hl_formula( pos ), $list282, Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110306L)
  public static SubLObject ppP(final SubLObject pos)
  {
    return subl_promotions.memberP( safe_nart_hl_formula( pos ), $list283, Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110528L)
  public static SubLObject safe_nart_hl_formula(final SubLObject obj)
  {
    return ( NIL != nart_handles.nart_p( obj ) ) ? narts_high.nart_hl_formula( obj ) : obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110705L)
  public static SubLObject relational_noun_denots(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject possessor, SubLObject pred,
      SubLObject lexical_mt, SubLObject domain_mt)
  {
    if( possessor == UNPROVIDED )
    {
      possessor = $kw284$UNDETERMINED;
    }
    if( pred == UNPROVIDED )
    {
      pred = $kw132$ANY;
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    assert NIL != Types.listp( leading_strings ) : leading_strings;
    assert NIL != forts.fort_p( wu ) : wu;
    assert NIL != Types.listp( following_strings ) : following_strings;
    assert NIL != speech_partP( pos, UNPROVIDED ) : pos;
    final SubLObject preds = ( pred == $kw132$ANY ) ? relational_noun_preds( leading_strings, wu, following_strings, pos, lexical_mt ) : ConsesLow.list( pred );
    SubLObject denots = NIL;
    if( NIL != genl_posP( pos, $const36$Noun, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = preds;
      SubLObject denoted_pred = NIL;
      denoted_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != kb_accessors.binary_predicateP( denoted_pred ) )
        {
          SubLObject cdolist_list_var_$310;
          final SubLObject possessed_argnums = cdolist_list_var_$310 = relational_noun_possessed_argnums( leading_strings, wu, following_strings, pos, denoted_pred, lexical_mt );
          SubLObject possessed_argnum = NIL;
          possessed_argnum = cdolist_list_var_$310.first();
          while ( NIL != cdolist_list_var_$310)
          {
            SubLObject template = NIL;
            final SubLObject possessed_type = relational_noun_possessed_type( denoted_pred, possessed_argnum, domain_mt );
            final SubLObject possessor_argnum = Numbers.subtract( THREE_INTEGER, possessed_argnum );
            final SubLObject possessor_type = ( possessor == $kw284$UNDETERMINED ) ? relational_noun_possessor_type( denoted_pred, possessor_argnum, domain_mt ) : NIL;
            if( NIL != possessed_type )
            {
              if( possessor != $kw284$UNDETERMINED )
              {
                template = relational_noun_denot_template_lookup( NIL, possessed_argnum );
              }
              else if( NIL != possessor_type )
              {
                template = relational_noun_denot_template_lookup( T, possessed_argnum );
              }
            }
            if( NIL != template )
            {
              final SubLObject swap_alist = ConsesLow.list( reader.bq_cons( $kw285$POSSESSED_TYPE, possessed_type ), reader.bq_cons( $kw286$DENOTED_PRED, denoted_pred ), reader.bq_cons( $kw287$POSSESSOR, possessor ),
                  reader.bq_cons( $kw288$POSSESSOR_TYPE, possessor_type ) );
              final SubLObject result = cycl_utilities.expression_sublis( swap_alist, template, UNPROVIDED, UNPROVIDED );
              denots = ConsesLow.cons( result, denots );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 113811L)
  public static SubLObject relational_noun_denot_template_lookup(final SubLObject type_levelP, final SubLObject possessed_argnum)
  {
    return list_utilities.alist_lookup( list_utilities.alist_lookup( $relational_noun_denot_templates$.getGlobalValue(), type_levelP, UNPROVIDED, UNPROVIDED ), possessed_argnum, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 114002L)
  public static SubLObject relational_noun_possessed_argnums(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != leading_strings && NIL != following_strings )
      {
        final SubLObject dair_pred = $const290$headMedialStringDenotesArgInReln;
        if( kb_indexing.num_gaf_arg_index( wu, TWO_INTEGER, dair_pred, UNPROVIDED ).isPositive() )
        {
          final SubLObject pred_var = dair_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, FIVE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, FIVE_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                  SubLObject done_var_$311 = NIL;
                  final SubLObject token_var_$312 = NIL;
                  while ( NIL == done_var_$311)
                  {
                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$312 );
                    final SubLObject valid_$313 = makeBoolean( !token_var_$312.eql( as ) );
                    if( NIL != valid_$313 )
                    {
                      thread.resetMultipleValues();
                      final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula( assertions_high.gaf_formula( as ), UNPROVIDED );
                      final SubLObject as_wu = thread.secondMultipleValue();
                      final SubLObject as_following_strings = thread.thirdMultipleValue();
                      final SubLObject as_pos = thread.fourthMultipleValue();
                      thread.resetMultipleValues();
                      if( as_pos.eql( pos ) && as_wu.eql( wu ) && as_leading_strings.equal( leading_strings ) && as_following_strings.equal( following_strings ) )
                      {
                        ans = ConsesLow.cons( assertions_high.gaf_arg( as, SIX_INTEGER ), ans );
                      }
                    }
                    done_var_$311 = makeBoolean( NIL == valid_$313 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$314 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$314, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( NIL != leading_strings )
      {
        final SubLObject dair_pred = $const291$multiWordStringDenotesArgInReln;
        if( kb_indexing.num_gaf_arg_index( wu, TWO_INTEGER, dair_pred, UNPROVIDED ).isPositive() )
        {
          final SubLObject pred_var = dair_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, FOUR_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, FOUR_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                  SubLObject done_var_$312 = NIL;
                  final SubLObject token_var_$313 = NIL;
                  while ( NIL == done_var_$312)
                  {
                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$313 );
                    final SubLObject valid_$314 = makeBoolean( !token_var_$313.eql( as ) );
                    if( NIL != valid_$314 )
                    {
                      thread.resetMultipleValues();
                      final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula( assertions_high.gaf_formula( as ), UNPROVIDED );
                      final SubLObject as_wu = thread.secondMultipleValue();
                      final SubLObject as_following_strings = thread.thirdMultipleValue();
                      final SubLObject as_pos = thread.fourthMultipleValue();
                      thread.resetMultipleValues();
                      if( as_pos.eql( pos ) && as_wu.eql( wu ) && as_leading_strings.equal( leading_strings ) )
                      {
                        ans = ConsesLow.cons( assertions_high.gaf_arg5( as ), ans );
                      }
                    }
                    done_var_$312 = makeBoolean( NIL == valid_$314 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$315 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$315, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( NIL != following_strings )
      {
        final SubLObject dair_pred = $const292$compoundStringDenotesArgInReln;
        if( kb_indexing.num_gaf_arg_index( wu, ONE_INTEGER, dair_pred, UNPROVIDED ).isPositive() )
        {
          final SubLObject pred_var = dair_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, FOUR_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, FOUR_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                  SubLObject done_var_$313 = NIL;
                  final SubLObject token_var_$314 = NIL;
                  while ( NIL == done_var_$313)
                  {
                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$314 );
                    final SubLObject valid_$315 = makeBoolean( !token_var_$314.eql( as ) );
                    if( NIL != valid_$315 )
                    {
                      thread.resetMultipleValues();
                      final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula( assertions_high.gaf_formula( as ), UNPROVIDED );
                      final SubLObject as_wu = thread.secondMultipleValue();
                      final SubLObject as_following_strings = thread.thirdMultipleValue();
                      final SubLObject as_pos = thread.fourthMultipleValue();
                      thread.resetMultipleValues();
                      if( as_pos.eql( pos ) && as_wu.eql( wu ) && as_following_strings.equal( following_strings ) )
                      {
                        ans = ConsesLow.cons( assertions_high.gaf_arg5( as ), ans );
                      }
                    }
                    done_var_$313 = makeBoolean( NIL == valid_$315 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$316 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$316, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else
      {
        final SubLObject dair_pred = $const293$denotesArgInReln;
        if( kb_indexing.num_gaf_arg_index( wu, ONE_INTEGER, dair_pred, UNPROVIDED ).isPositive() )
        {
          final SubLObject pred_var = dair_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( wu, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( wu, NIL, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, $kw56$TRUE, NIL );
                  SubLObject done_var_$314 = NIL;
                  final SubLObject token_var_$315 = NIL;
                  while ( NIL == done_var_$314)
                  {
                    final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$315 );
                    final SubLObject valid_$316 = makeBoolean( !token_var_$315.eql( as ) );
                    if( NIL != valid_$316 )
                    {
                      thread.resetMultipleValues();
                      final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula( assertions_high.gaf_formula( as ), UNPROVIDED );
                      final SubLObject as_wu = thread.secondMultipleValue();
                      final SubLObject as_following_strings = thread.thirdMultipleValue();
                      final SubLObject as_pos = thread.fourthMultipleValue();
                      final SubLObject as_denot = thread.fifthMultipleValue();
                      thread.resetMultipleValues();
                      if( as_pos.eql( pos ) && as_denot.equal( pred ) && as_wu.eql( wu ) )
                      {
                        ans = ConsesLow.cons( assertions_high.gaf_arg4( as ), ans );
                      }
                    }
                    done_var_$314 = makeBoolean( NIL == valid_$316 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$317 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$317, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != list_utilities.non_empty_list_p( ans ) && NIL != forts.fort_p( pred ) && NIL != fort_types_interface.symmetric_binary_predicate_p( pred ) )
    {
      ans = $list294;
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 116899L)
  public static SubLObject relational_noun_preds(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( NIL != leading_strings && NIL != following_strings )
    {
      return ask_utilities.ask_variable( $sym295$_PRED, ConsesLow.listS( $const290$headMedialStringDenotesArgInReln, leading_strings, wu, following_strings, pos, $list296 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    if( NIL != leading_strings )
    {
      return ask_utilities.ask_variable( $sym295$_PRED, ConsesLow.listS( $const291$multiWordStringDenotesArgInReln, leading_strings, wu, pos, $list296 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != following_strings )
    {
      return ask_utilities.ask_variable( $sym295$_PRED, ConsesLow.listS( $const292$compoundStringDenotesArgInReln, wu, following_strings, pos, $list296 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return ask_utilities.ask_variable( $sym295$_PRED, ConsesLow.listS( $const293$denotesArgInReln, wu, pos, $list296 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 117784L)
  public static SubLObject relational_noun_possessed_type(final SubLObject pred, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject tightest_constraint = kb_accessors.min_argn_isa( pred, argnum, mt ).first();
    return ( NIL != tightest_constraint ) ? tightest_constraint : $const297$Thing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 118092L)
  public static SubLObject relational_noun_possessor_type(final SubLObject pred, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject tightest_constraint = kb_accessors.min_argn_isa( pred, argnum, mt ).first();
    return ( NIL != tightest_constraint ) ? tightest_constraint : $const297$Thing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 119479L)
  public static SubLObject la_test_func(final SubLObject thing1, final SubLObject thing2)
  {
    SubLObject cdolist_list_var = thing2;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( narts_high.nart_substitute( item ), narts_high.nart_substitute( thing1 ), EQUAL, UNPROVIDED ) )
      {
        Errors.warn( $str306$missing___S, item );
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 119712L)
  public static SubLObject denotation_mapper_test(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically)
  {
    if( excluded_preds == UNPROVIDED )
    {
      excluded_preds = NIL;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw202$GREEDY;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject result = denotation_mapper( string, excluded_preds, mode, parse_morphologically );
    final SubLObject failure = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = transform_list_utilities.transform( result, $sym307$HL_TERM_WITH_EL_COUNTERPART_P, $sym308$HL_TERM_TO_EL_TERM, UNPROVIDED );
    return Values.values( result, failure );
  }

  public static SubLObject declare_lexicon_accessors_file()
  {
    SubLFiles.declareFunction( me, "genl_lexicon_mtP", "GENL-LEXICON-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_genl_lexicon_mtP_cached", "CLEAR-GENL-LEXICON-MT?-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_genl_lexicon_mtP_cached", "REMOVE-GENL-LEXICON-MT?-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_lexicon_mtP_cached_internal", "GENL-LEXICON-MT?-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_lexicon_mtP_cached", "GENL-LEXICON-MT?-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_speech_part_caches", "INITIALIZE-SPEECH-PART-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "preds_matching_pos", "PREDS-MATCHING-POS", 2, 1, false );
    SubLFiles.declareFunction( me, "top_level_nl_preds", "TOP-LEVEL-NL-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_speech_part_pred_caches", "CLEAR-SPEECH-PART-PRED-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "max_preds_matching_pos", "MAX-PREDS-MATCHING-POS", 3, 1, false );
    SubLFiles.declareFunction( me, "clear_max_preds_matching_pos_cached", "CLEAR-MAX-PREDS-MATCHING-POS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_max_preds_matching_pos_cached", "REMOVE-MAX-PREDS-MATCHING-POS-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "max_preds_matching_pos_cached_internal", "MAX-PREDS-MATCHING-POS-CACHED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "max_preds_matching_pos_cached", "MAX-PREDS-MATCHING-POS-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "all_preds_of_pos", "ALL-PREDS-OF-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_max_preds_of_pos", "CLEAR-MAX-PREDS-OF-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_max_preds_of_pos", "REMOVE-MAX-PREDS-OF-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "max_preds_of_pos_internal", "MAX-PREDS-OF-POS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "max_preds_of_pos", "MAX-PREDS-OF-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_max_preds_licensed_by_pos", "CLEAR-MAX-PREDS-LICENSED-BY-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_max_preds_licensed_by_pos", "REMOVE-MAX-PREDS-LICENSED-BY-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "max_preds_licensed_by_pos_internal", "MAX-PREDS-LICENSED-BY-POS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "max_preds_licensed_by_pos", "MAX-PREDS-LICENSED-BY-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_remove_spec_preds", "LEX-REMOVE-SPEC-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_remove_spec_preds_helper_internal", "LEX-REMOVE-SPEC-PREDS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_remove_spec_preds_helper", "LEX-REMOVE-SPEC-PREDS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "speech_part_pred_min_ceilings", "SPEECH-PART-PRED-MIN-CEILINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_speech_part_pred_min_ceilings_int", "CLEAR-SPEECH-PART-PRED-MIN-CEILINGS-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_speech_part_pred_min_ceilings_int", "REMOVE-SPEECH-PART-PRED-MIN-CEILINGS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "speech_part_pred_min_ceilings_int_internal", "SPEECH-PART-PRED-MIN-CEILINGS-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "speech_part_pred_min_ceilings_int", "SPEECH-PART-PRED-MIN-CEILINGS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "speech_part_pred_max_floors", "SPEECH-PART-PRED-MAX-FLOORS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_speech_part_pred_max_floors_int", "CLEAR-SPEECH-PART-PRED-MAX-FLOORS-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_speech_part_pred_max_floors_int", "REMOVE-SPEECH-PART-PRED-MAX-FLOORS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "speech_part_pred_max_floors_int_internal", "SPEECH-PART-PRED-MAX-FLOORS-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "speech_part_pred_max_floors_int", "SPEECH-PART-PRED-MAX-FLOORS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_pos_of_pred", "CLEAR-POS-OF-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pos_of_pred", "REMOVE-POS-OF-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_of_pred_internal", "POS-OF-PRED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_of_pred", "POS-OF-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "singular_pred", "SINGULAR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_pred", "PLURAL-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "derived_preds", "DERIVED-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_derived_preds", "CLEAR-DERIVED-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_derived_preds", "INITIALIZE-DERIVED-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "derived_predP", "DERIVED-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "base_preds_of_pred", "BASE-PREDS-OF-PRED", 1, 1, false );
    SubLFiles.declareMacro( me, "do_speech_part_preds", "DO-SPEECH-PART-PREDS" );
    SubLFiles.declareFunction( me, "speech_part_preds_initializedP", "SPEECH-PART-PREDS-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_speech_part_preds", "CLEAR-SPEECH-PART-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_speech_part_preds", "INITIALIZE-SPEECH-PART-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_speech_part_preds_initialized", "ENSURE-SPEECH-PART-PREDS-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "speech_part_predP", "SPEECH-PART-PRED?", 1, 1, false );
    new $speech_part_predP$UnaryFunction();
    new $speech_part_predP$BinaryFunction();
    SubLFiles.declareFunction( me, "all_speech_part_preds", "ALL-SPEECH-PART-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "spec_pos_predP", "SPEC-POS-PRED?", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_genl_pos_predP", "CLEAR-GENL-POS-PRED?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_genl_pos_predP", "REMOVE-GENL-POS-PRED?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_pos_predP_internal", "GENL-POS-PRED?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "genl_pos_predP", "GENL-POS-PRED?", 2, 1, false );
    new $genl_pos_predP$BinaryFunction();
    SubLFiles.declareFunction( me, "clear_genl_pos_pred_from_mt_infoP", "CLEAR-GENL-POS-PRED-FROM-MT-INFO?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_genl_pos_pred_from_mt_infoP", "REMOVE-GENL-POS-PRED-FROM-MT-INFO?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_pos_pred_from_mt_infoP_internal", "GENL-POS-PRED-FROM-MT-INFO?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "genl_pos_pred_from_mt_infoP", "GENL-POS-PRED-FROM-MT-INFO?", 2, 1, false );
    SubLFiles.declareFunction( me, "word_form_predictableP", "WORD-FORM-PREDICTABLE?", 3, 1, false );
    SubLFiles.declareFunction( me, "get_strings_of_type", "GET-STRINGS-OF-TYPE", 2, 3, false );
    SubLFiles.declareFunction( me, "clear_get_strings_of_type_cached", "CLEAR-GET-STRINGS-OF-TYPE-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_strings_of_type_cached", "REMOVE-GET-STRINGS-OF-TYPE-CACHED", 2, 3, false );
    SubLFiles.declareFunction( me, "get_strings_of_type_cached_internal", "GET-STRINGS-OF-TYPE-CACHED-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "get_strings_of_type_cached", "GET-STRINGS-OF-TYPE-CACHED", 2, 3, false );
    SubLFiles.declareFunction( me, "string_is_pos_on_wuP_internal", "STRING-IS-POS-ON-WU?-INTERNAL", 3, 3, false );
    SubLFiles.declareFunction( me, "string_is_pos_on_wuP", "STRING-IS-POS-ON-WU?", 3, 3, false );
    SubLFiles.declareFunction( me, "string_is_pos_on_wuP_asserted", "STRING-IS-POS-ON-WU?-ASSERTED", 4, 0, false );
    SubLFiles.declareFunction( me, "string_is_pred_on_wuP", "STRING-IS-PRED-ON-WU?", 3, 2, false );
    SubLFiles.declareFunction( me, "best_wu_for_string", "BEST-WU-FOR-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "best_pos_for_stringXwuXpos", "BEST-POS-FOR-STRING&WU&POS", 3, 0, false );
    SubLFiles.declareFunction( me, "words_of_stringXpred", "WORDS-OF-STRING&PRED", 2, 3, false );
    SubLFiles.declareFunction( me, "clear_pos_for_keyword", "CLEAR-POS-FOR-KEYWORD", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pos_for_keyword", "REMOVE-POS-FOR-KEYWORD", 1, 1, false );
    SubLFiles.declareFunction( me, "pos_for_keyword_internal", "POS-FOR-KEYWORD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_for_keyword", "POS-FOR-KEYWORD", 1, 1, false );
    SubLFiles.declareFunction( me, "words_of_stringXpos", "WORDS-OF-STRING&POS", 2, 3, false );
    SubLFiles.declareFunction( me, "words_of_stringXspeech_part", "WORDS-OF-STRING&SPEECH-PART", 2, 3, false );
    SubLFiles.declareFunction( me, "preds_of_stringXword", "PREDS-OF-STRING&WORD", 2, 3, false );
    SubLFiles.declareFunction( me, "clear_preds_of_stringXword", "CLEAR-PREDS-OF-STRING&WORD", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_preds_of_stringXword_cached", "CLEAR-PREDS-OF-STRING&WORD-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_preds_of_stringXword_cached", "REMOVE-PREDS-OF-STRING&WORD-CACHED", 5, 0, false );
    SubLFiles.declareFunction( me, "preds_of_stringXword_cached_internal", "PREDS-OF-STRING&WORD-CACHED-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "preds_of_stringXword_cached", "PREDS-OF-STRING&WORD-CACHED", 5, 0, false );
    SubLFiles.declareFunction( me, "other_strings_of_wu", "OTHER-STRINGS-OF-WU", 1, 2, false );
    SubLFiles.declareFunction( me, "right_frames_for_pos", "RIGHT-FRAMES-FOR-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_of_string", "POS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "string_is_posP", "STRING-IS-POS?", 2, 3, false );
    SubLFiles.declareFunction( me, "string_is_form_of_aux_verbP", "STRING-IS-FORM-OF-AUX-VERB?", 1, 2, false );
    SubLFiles.declareFunction( me, "clear_closed_lexical_class_hash", "CLEAR-CLOSED-LEXICAL-CLASS-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_closed_lexical_class_strings", "INITIALIZE-CLOSED-LEXICAL-CLASS-STRINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "closed_lexical_class_string_intP", "CLOSED-LEXICAL-CLASS-STRING-INT?", 3, 0, false );
    SubLFiles.declareFunction( me, "closed_lexical_class_stringP", "CLOSED-LEXICAL-CLASS-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "closed_lexical_class_string_case_insensitiveP", "CLOSED-LEXICAL-CLASS-STRING-CASE-INSENSITIVE?", 1, 1, false );
    SubLFiles.declareFunction( me, "non_pronominal_closed_lexical_class_stringP", "NON-PRONOMINAL-CLOSED-LEXICAL-CLASS-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "contains_closed_lexical_class_wordP", "CONTAINS-CLOSED-LEXICAL-CLASS-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_closed_lexical_class_strings", "CLEAR-CLOSED-LEXICAL-CLASS-STRINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_closed_lexical_class_strings", "REMOVE-CLOSED-LEXICAL-CLASS-STRINGS", 0, 1, false );
    SubLFiles.declareFunction( me, "closed_lexical_class_strings_internal", "CLOSED-LEXICAL-CLASS-STRINGS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_lexical_class_strings", "CLOSED-LEXICAL-CLASS-STRINGS", 0, 1, false );
    SubLFiles.declareFunction( me, "closed_lexical_classP", "CLOSED-LEXICAL-CLASS?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_closed_lexical_classes", "CLEAR-CLOSED-LEXICAL-CLASSES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_closed_lexical_classes", "REMOVE-CLOSED-LEXICAL-CLASSES", 0, 1, false );
    SubLFiles.declareFunction( me, "closed_lexical_classes_internal", "CLOSED-LEXICAL-CLASSES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_lexical_classes", "CLOSED-LEXICAL-CLASSES", 0, 1, false );
    SubLFiles.declareFunction( me, "maybe_initialize_prep_strings", "MAYBE-INITIALIZE-PREP-STRINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "preposition_stringP", "PREPOSITION-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "quick_lexical_wordP", "QUICK-LEXICAL-WORD?", 1, 1, false );
    SubLFiles.declareFunction( me, "quick_lexical_wordP_int", "QUICK-LEXICAL-WORD?-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "quick_word_nautP", "QUICK-WORD-NAUT?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_wordP_internal", "LEXICAL-WORD?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_wordP", "LEXICAL-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "derived_wordP_internal", "DERIVED-WORD?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "derived_wordP", "DERIVED-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_vulgar_words", "INITIALIZE-VULGAR-WORDS", 0, 0, false );
    SubLFiles.declareFunction( me, "vulgar_wordP", "VULGAR-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_of_stringXword", "POS-OF-STRING&WORD", 2, 3, false );
    SubLFiles.declareFunction( me, "clear_nl_caches", "CLEAR-NL-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_nl_parsing_caches", "CLEAR-NL-PARSING-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_lexical_access_functions", "CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "pos_of_word", "POS-OF-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "word_has_posP", "WORD-HAS-POS?", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_verb_only_stringP", "CLEAR-VERB-ONLY-STRING?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_verb_only_stringP", "REMOVE-VERB-ONLY-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "verb_only_stringP_internal", "VERB-ONLY-STRING?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "verb_only_stringP", "VERB-ONLY-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "typed_denots_of_string", "TYPED-DENOTS-OF-STRING", 2, 8, false );
    SubLFiles.declareFunction( me, "typed_denots_of_string_preds_okP", "TYPED-DENOTS-OF-STRING-PREDS-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "denot_has_typeP_internal", "DENOT-HAS-TYPE?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "denot_has_typeP", "DENOT-HAS-TYPE?", 2, 1, false );
    SubLFiles.declareFunction( me, "denot_might_have_typeP_internal", "DENOT-MIGHT-HAVE-TYPE?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "denot_might_have_typeP", "DENOT-MIGHT-HAVE-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "multi_typed_denots_of_string", "MULTI-TYPED-DENOTS-OF-STRING", 3, 8, false );
    SubLFiles.declareFunction( me, "typed_denots_of_string_at_place", "TYPED-DENOTS-OF-STRING-AT-PLACE", 3, 6, false );
    SubLFiles.declareFunction( me, "in_region_p", "IN-REGION-P", 3, 0, false );
    SubLFiles.declareFunction( me, "geopolitical_subdivisionP", "GEOPOLITICAL-SUBDIVISION?", 3, 0, false );
    SubLFiles.declareFunction( me, "geographical_subregionP", "GEOGRAPHICAL-SUBREGION?", 3, 0, false );
    SubLFiles.declareFunction( me, "territories_for_gpe", "TERRITORIES-FOR-GPE", 1, 0, false );
    SubLFiles.declareFunction( me, "gpe_for_territory", "GPE-FOR-TERRITORY", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_of_partial_string", "DENOTS-OF-PARTIAL-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "denotation_mapper", "DENOTATION-MAPPER", 1, 3, false );
    SubLFiles.declareFunction( me, "all_denots_of_string", "ALL-DENOTS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "most_denots_of_string", "MOST-DENOTS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "all_parsing_denots_of_string", "ALL-PARSING-DENOTS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "denots_of_string", "DENOTS-OF-STRING", 1, 8, false );
    SubLFiles.declareFunction( me, "valid_denots_of_string_lookup_mt_specificationP", "VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_mt_for_language", "DENOTS-MT-FOR-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_denots_of_string_results", "ADD-DENOTS-OF-STRING-RESULTS", 4, 0, false );
    SubLFiles.declareFunction( me, "date_and_number_denots_of_string", "DATE-AND-NUMBER-DENOTS-OF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_of_stringXpred", "DENOTS-OF-STRING&PRED", 2, 6, false );
    SubLFiles.declareFunction( me, "denots_of_stringXnamestring_pred", "DENOTS-OF-STRING&NAMESTRING-PRED", 2, 3, false );
    SubLFiles.declareFunction( me, "denots_of_stringXpos_pred", "DENOTS-OF-STRING&POS-PRED", 2, 5, false );
    SubLFiles.declareFunction( me, "denots_of_stringXspeech_part", "DENOTS-OF-STRING&SPEECH-PART", 2, 5, false );
    SubLFiles.declareFunction( me, "denots_of_stringXpos", "DENOTS-OF-STRING&POS", 2, 5, false );
    SubLFiles.declareFunction( me, "denots_of_name_string", "DENOTS-OF-NAME-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "denots_of_name_string_precise", "DENOTS-OF-NAME-STRING-PRECISE", 1, 2, false );
    SubLFiles.declareFunction( me, "denots_of_wu", "DENOTS-OF-WU", 1, 1, false );
    SubLFiles.declareFunction( me, "proceed_with_morphological_parsingP", "PROCEED-WITH-MORPHOLOGICAL-PARSING?", 2, 0, false );
    SubLFiles.declareFunction( me, "skip_to_morphological_parsingP", "SKIP-TO-MORPHOLOGICAL-PARSING?", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_of_acronym_string", "DENOTS-OF-ACRONYM-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "names_from_spelling", "NAMES-FROM-SPELLING", 1, 2, false );
    SubLFiles.declareFunction( me, "names_from_nickname", "NAMES-FROM-NICKNAME", 1, 2, false );
    SubLFiles.declareFunction( me, "denots_of_abbreviation_string", "DENOTS-OF-ABBREVIATION-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "known_proper_noun_phraseP", "KNOWN-PROPER-NOUN-PHRASE?", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_denotation_preds", "DETERMINE-DENOTATION-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_denotation_pred", "DETERMINE-DENOTATION-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "meanings_of_sense", "MEANINGS-OF-SENSE", 4, 1, false );
    SubLFiles.declareFunction( me, "meaning_has_senseP", "MEANING-HAS-SENSE?", 5, 1, false );
    SubLFiles.declareFunction( me, "denot_has_senseP", "DENOT-HAS-SENSE?", 4, 1, false );
    SubLFiles.declareFunction( me, "denots_of_sense", "DENOTS-OF-SENSE", 3, 1, false );
    SubLFiles.declareFunction( me, "proper_denots_of_sense", "PROPER-DENOTS-OF-SENSE", 3, 1, false );
    SubLFiles.declareFunction( me, "related_denots_of_sense", "RELATED-DENOTS-OF-SENSE", 3, 1, false );
    SubLFiles.declareFunction( me, "placeholder_denots_of_sense", "PLACEHOLDER-DENOTS-OF-SENSE", 3, 1, false );
    SubLFiles.declareFunction( me, "denots_of_sense_by_mt", "DENOTS-OF-SENSE-BY-MT", 3, 1, false );
    SubLFiles.declareFunction( me, "senses_of_wuXpos", "SENSES-OF-WU&POS", 2, 1, false );
    SubLFiles.declareFunction( me, "subcat_frame_arity", "SUBCAT-FRAME-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "frames_of_word", "FRAMES-OF-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "frames_of_wordXpos", "FRAMES-OF-WORD&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "frames_of_word_posXdenot", "FRAMES-OF-WORD-POS&DENOT", 3, 0, false );
    SubLFiles.declareFunction( me, "frames_of_sense", "FRAMES-OF-SENSE", 3, 1, false );
    SubLFiles.declareFunction( me, "frames_of_sense_by_mt", "FRAMES-OF-SENSE-BY-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "politeness_of_ws_pred", "POLITENESS-OF-WS-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "formality_of_ws_pred", "FORMALITY-OF-WS-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "politeness_levels_of_assertion", "POLITENESS-LEVELS-OF-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "formality_levels_of_assertion", "FORMALITY-LEVELS-OF-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "potentially_offensive_politeness_levelP", "POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?", 1, 0, false );
    SubLFiles.declareFunction( me, "includes_potentially_offensive_politeness_levelP", "INCLUDES-POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_offensive_lexical_assertionP", "POTENTIALLY-OFFENSIVE-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "slang_lexical_assertionP", "SLANG-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "archaic_lexical_assertionP", "ARCHAIC-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_indirect_lexical_assertionP", "CLEAR-INDIRECT-LEXICAL-ASSERTION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_indirect_lexical_assertionP", "REMOVE-INDIRECT-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "indirect_lexical_assertionP_internal", "INDIRECT-LEXICAL-ASSERTION?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "indirect_lexical_assertionP", "INDIRECT-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inappropriate_lexical_assertionP", "INAPPROPRIATE-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_denotation_assertions", "GATHER-DENOTATION-ASSERTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "potentially_offensive_senseP", "POTENTIALLY-OFFENSIVE-SENSE?", 3, 0, false );
    SubLFiles.declareFunction( me, "inappropriate_senseP", "INAPPROPRIATE-SENSE?", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_of_ws", "SEMTRANS-OF-WS", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_of_wuXpos", "SEMTRANS-OF-WU&POS", 2, 1, false );
    SubLFiles.declareFunction( me, "semtrans_lookup_int", "SEMTRANS-LOOKUP-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "semtrans_template_from_assertion", "SEMTRANS-TEMPLATE-FROM-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "semtrans_sentence_infer", "SEMTRANS-SENTENCE-INFER", 2, 0, false );
    SubLFiles.declareFunction( me, "denots_of_word", "DENOTS-OF-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "semtrans_assertion_lookup", "SEMTRANS-ASSERTION-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "all_semtrans_assertions", "ALL-SEMTRANS-ASSERTIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "preposition_of_frame", "PREPOSITION-OF-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_denotation", "ASSERTION-DENOTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_pos", "ASSERTION-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_sense_num", "ASSERTION-SENSE-NUM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_agr_of_det_string", "CLEAR-AGR-OF-DET-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_agr_of_det_string", "REMOVE-AGR-OF-DET-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "agr_of_det_string_internal", "AGR-OF-DET-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "agr_of_det_string", "AGR-OF-DET-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "agreement_lookup", "AGREEMENT-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "denot_ws_lookup", "DENOT-WS-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "pos_to_semtrans_pred", "POS-TO-SEMTRANS-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_pos_to_semtrans_pred_cached", "CLEAR-POS-TO-SEMTRANS-PRED-CACHED", 0, 0, false );
    new $clear_pos_to_semtrans_pred_cached$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_pos_to_semtrans_pred_cached", "REMOVE-POS-TO-SEMTRANS-PRED-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_to_semtrans_pred_cached_internal", "POS-TO-SEMTRANS-PRED-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_to_semtrans_pred_cached", "POS-TO-SEMTRANS-PRED-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_semtrans_pred_to_pos", "CLEAR-SEMTRANS-PRED-TO-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_semtrans_pred_to_pos", "REMOVE-SEMTRANS-PRED-TO-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "semtrans_pred_to_pos_internal", "SEMTRANS-PRED-TO-POS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_pred_to_pos", "SEMTRANS-PRED-TO-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "nicknames_of_name", "NICKNAMES-OF-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "spellings_of_name", "SPELLINGS-OF-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "argn_is_speech_partP", "ARGN-IS-SPEECH-PART?", 2, 0, false );
    SubLFiles.declareFunction( me, "speech_parts_initializedP", "SPEECH-PARTS-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_speech_parts", "CLEAR-SPEECH-PARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_speech_parts", "INITIALIZE-SPEECH-PARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "speech_partP", "SPEECH-PART?", 1, 1, false );
    SubLFiles.declareFunction( me, "ensure_speech_parts_initialized", "ENSURE-SPEECH-PARTS-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "all_speech_parts", "ALL-SPEECH-PARTS", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_genl_posP", "CLEAR-GENL-POS?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_genl_posP", "REMOVE-GENL-POS?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_posP_internal", "GENL-POS?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "genl_posP", "GENL-POS?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_pos_memberP", "GENL-POS-MEMBER?", 2, 0, false );
    SubLFiles.declareFunction( me, "spec_posP", "SPEC-POS?", 2, 0, false );
    SubLFiles.declareFunction( me, "adjpP", "ADJP?", 1, 0, false );
    SubLFiles.declareFunction( me, "vbarP", "VBAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "nbarP", "NBAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "object_is_compositional_pos_termP", "OBJECT-IS-COMPOSITIONAL-POS-TERM?", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_compositional_pos_nart", "CLEAR-COMPOSITIONAL-POS-NART", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_compositional_pos_nart", "REMOVE-COMPOSITIONAL-POS-NART", 2, 0, false );
    SubLFiles.declareFunction( me, "compositional_pos_nart_internal", "COMPOSITIONAL-POS-NART-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "compositional_pos_nart", "COMPOSITIONAL-POS-NART", 2, 0, false );
    SubLFiles.declareFunction( me, "npP", "NP?", 1, 0, false );
    SubLFiles.declareFunction( me, "ppP", "PP?", 1, 0, false );
    SubLFiles.declareFunction( me, "safe_nart_hl_formula", "SAFE-NART-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "relational_noun_denots", "RELATIONAL-NOUN-DENOTS", 4, 4, false );
    SubLFiles.declareFunction( me, "relational_noun_denot_template_lookup", "RELATIONAL-NOUN-DENOT-TEMPLATE-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "relational_noun_possessed_argnums", "RELATIONAL-NOUN-POSSESSED-ARGNUMS", 5, 1, false );
    SubLFiles.declareFunction( me, "relational_noun_preds", "RELATIONAL-NOUN-PREDS", 4, 1, false );
    SubLFiles.declareFunction( me, "relational_noun_possessed_type", "RELATIONAL-NOUN-POSSESSED-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "relational_noun_possessor_type", "RELATIONAL-NOUN-POSSESSOR-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "la_test_func", "LA-TEST-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "denotation_mapper_test", "DENOTATION-MAPPER-TEST", 1, 3, false );
    return NIL;
  }

  public static SubLObject init_lexicon_accessors_file()
  {
    $genl_lexicon_mtP_cached_caching_state$ = SubLFiles.deflexical( "*GENL-LEXICON-MT?-CACHED-CACHING-STATE*", NIL );
    $max_preds_matching_pos_cached_caching_state$ = SubLFiles.deflexical( "*MAX-PREDS-MATCHING-POS-CACHED-CACHING-STATE*", NIL );
    $max_preds_of_pos_caching_state$ = SubLFiles.deflexical( "*MAX-PREDS-OF-POS-CACHING-STATE*", NIL );
    $max_preds_licensed_by_pos_caching_state$ = SubLFiles.deflexical( "*MAX-PREDS-LICENSED-BY-POS-CACHING-STATE*", NIL );
    $speech_part_pred_min_ceilings_int_caching_state$ = SubLFiles.deflexical( "*SPEECH-PART-PRED-MIN-CEILINGS-INT-CACHING-STATE*", NIL );
    $speech_part_pred_max_floors_int_caching_state$ = SubLFiles.deflexical( "*SPEECH-PART-PRED-MAX-FLOORS-INT-CACHING-STATE*", NIL );
    $pos_of_pred_caching_state$ = SubLFiles.deflexical( "*POS-OF-PRED-CACHING-STATE*", NIL );
    $derived_preds$ = SubLFiles.deflexical( "*DERIVED-PREDS*", maybeDefault( $sym39$_DERIVED_PREDS_, $derived_preds$, () -> ( Hashtables.make_hash_table( $int40$256, UNPROVIDED, UNPROVIDED ) ) ) );
    $speech_part_preds$ = SubLFiles.deflexical( "*SPEECH-PART-PREDS*", maybeDefault( $sym61$_SPEECH_PART_PREDS_, $speech_part_preds$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQL ), $int40$256 ) ) ) );
    $genl_pos_predP_caching_state$ = SubLFiles.deflexical( "*GENL-POS-PRED?-CACHING-STATE*", NIL );
    $genl_pos_pred_from_mt_infoP_caching_state$ = SubLFiles.deflexical( "*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*", NIL );
    $get_strings_of_type_cached_caching_state$ = SubLFiles.deflexical( "*GET-STRINGS-OF-TYPE-CACHED-CACHING-STATE*", NIL );
    $pos_for_keyword_caching_state$ = SubLFiles.deflexical( "*POS-FOR-KEYWORD-CACHING-STATE*", NIL );
    $preds_of_stringXword_cached_caching_state$ = SubLFiles.deflexical( "*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*", NIL );
    $closed_lexical_class_strings$ = SubLFiles.deflexical( "*CLOSED-LEXICAL-CLASS-STRINGS*", maybeDefault( $sym152$_CLOSED_LEXICAL_CLASS_STRINGS_, $closed_lexical_class_strings$, () -> ( Hashtables.make_hash_table(
        $int25$512, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $closed_lexical_class_strings_case_insensitive$ = SubLFiles.deflexical( "*CLOSED-LEXICAL-CLASS-STRINGS-CASE-INSENSITIVE*", maybeDefault( $sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_,
        $closed_lexical_class_strings_case_insensitive$, () -> ( Hashtables.make_hash_table( $int25$512, Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) ) );
    $closed_lexical_class_strings_caching_state$ = SubLFiles.deflexical( "*CLOSED-LEXICAL-CLASS-STRINGS-CACHING-STATE*", NIL );
    $closed_lexical_classes_caching_state$ = SubLFiles.deflexical( "*CLOSED-LEXICAL-CLASSES-CACHING-STATE*", NIL );
    $preposition_strings$ = SubLFiles.defparameter( "*PREPOSITION-STRINGS*", Hashtables.make_hash_table( $int134$64, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    $pos_forms_spec_preds$ = SubLFiles.deflexical( "*POS-FORMS-SPEC-PREDS*", $list160 );
    $vulgar_words$ = SubLFiles.deflexical( "*VULGAR-WORDS*", maybeDefault( $sym166$_VULGAR_WORDS_, $vulgar_words$, () -> ( set.new_set( UNPROVIDED, UNPROVIDED ) ) ) );
    $verb_only_stringP_caching_state$ = SubLFiles.deflexical( "*VERB-ONLY-STRING?-CACHING-STATE*", NIL );
    $indirect_lexical_assertionP_caching_state$ = SubLFiles.deflexical( "*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*", NIL );
    $agr_of_det_string_caching_state$ = SubLFiles.deflexical( "*AGR-OF-DET-STRING-CACHING-STATE*", NIL );
    $pos_to_semtrans_pred_cached_caching_state$ = SubLFiles.deflexical( "*POS-TO-SEMTRANS-PRED-CACHED-CACHING-STATE*", NIL );
    $semtrans_pred_to_pos_caching_state$ = SubLFiles.deflexical( "*SEMTRANS-PRED-TO-POS-CACHING-STATE*", NIL );
    $speech_parts$ = SubLFiles.deflexical( "*SPEECH-PARTS*", maybeDefault( $sym274$_SPEECH_PARTS_, $speech_parts$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQL ), $int40$256 ) ) ) );
    $genl_posP_caching_state$ = SubLFiles.deflexical( "*GENL-POS?-CACHING-STATE*", NIL );
    $most_general_speech_part$ = SubLFiles.deflexical( "*MOST-GENERAL-SPEECH-PART*", $const277$NLWordForm );
    $compositional_pos_nart_caching_state$ = SubLFiles.deflexical( "*COMPOSITIONAL-POS-NART-CACHING-STATE*", NIL );
    $relational_noun_denot_templates$ = SubLFiles.deflexical( "*RELATIONAL-NOUN-DENOT-TEMPLATES*", $list289 );
    return NIL;
  }

  public static SubLObject setup_lexicon_accessors_file()
  {
    memoization_state.note_globally_cached_function( $sym2$GENL_LEXICON_MT__CACHED );
    memoization_state.note_globally_cached_function( $sym10$MAX_PREDS_MATCHING_POS_CACHED );
    memoization_state.note_globally_cached_function( $sym13$MAX_PREDS_OF_POS );
    memoization_state.note_globally_cached_function( $sym16$MAX_PREDS_LICENSED_BY_POS );
    memoization_state.note_memoized_function( $sym22$LEX_REMOVE_SPEC_PREDS_HELPER );
    memoization_state.note_globally_cached_function( $sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT );
    memoization_state.note_globally_cached_function( $sym27$SPEECH_PART_PRED_MAX_FLOORS_INT );
    memoization_state.note_globally_cached_function( $sym30$POS_OF_PRED );
    subl_macro_promotions.declare_defglobal( $sym39$_DERIVED_PREDS_ );
    subl_macro_promotions.declare_defglobal( $sym61$_SPEECH_PART_PREDS_ );
    memoization_state.note_globally_cached_function( $sym78$GENL_POS_PRED_ );
    memoization_state.note_globally_cached_function( $sym81$GENL_POS_PRED_FROM_MT_INFO_ );
    memoization_state.note_globally_cached_function( $sym91$GET_STRINGS_OF_TYPE_CACHED );
    memoization_state.note_memoized_function( $sym93$STRING_IS_POS_ON_WU_ );
    memoization_state.note_globally_cached_function( $sym102$POS_FOR_KEYWORD );
    memoization_state.note_globally_cached_function( $sym137$PREDS_OF_STRING_WORD_CACHED );
    subl_macro_promotions.declare_defglobal( $sym152$_CLOSED_LEXICAL_CLASS_STRINGS_ );
    subl_macro_promotions.declare_defglobal( $sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_ );
    memoization_state.note_globally_cached_function( $sym156$CLOSED_LEXICAL_CLASS_STRINGS );
    memoization_state.note_globally_cached_function( $sym158$CLOSED_LEXICAL_CLASSES );
    memoization_state.note_memoized_function( $sym95$LEXICAL_WORD_ );
    memoization_state.note_memoized_function( $sym164$DERIVED_WORD_ );
    subl_macro_promotions.declare_defglobal( $sym166$_VULGAR_WORDS_ );
    memoization_state.note_globally_cached_function( $sym170$VERB_ONLY_STRING_ );
    utilities_macros.register_cyc_api_function( $sym178$TYPED_DENOTS_OF_STRING, $list179, $str180$_param_STRING_string_____param_TY, $list181, $list182 );
    memoization_state.note_memoized_function( $sym183$DENOT_HAS_TYPE_ );
    memoization_state.note_memoized_function( $sym184$DENOT_MIGHT_HAVE_TYPE_ );
    utilities_macros.register_cyc_api_function( $sym204$DENOTATION_MAPPER, $list205, $str206$_param_STRING_string__the_string_, $list207, $list208 );
    utilities_macros.register_cyc_api_function( $sym214$DENOTS_OF_STRING, $list215, $str216$_param_PARSE_MORPHOLOGICALLY__PAR, $list217, NIL );
    access_macros.register_external_symbol( $sym218$DENOTS_MT_FOR_LANGUAGE );
    memoization_state.note_globally_cached_function( $sym250$INDIRECT_LEXICAL_ASSERTION_ );
    memoization_state.note_globally_cached_function( $sym261$AGR_OF_DET_STRING );
    memoization_state.note_globally_cached_function( $sym265$POS_TO_SEMTRANS_PRED_CACHED );
    memoization_state.note_globally_cached_function( $sym269$SEMTRANS_PRED_TO_POS );
    subl_macro_promotions.declare_defglobal( $sym274$_SPEECH_PARTS_ );
    memoization_state.note_globally_cached_function( $sym275$GENL_POS_ );
    memoization_state.note_globally_cached_function( $sym280$COMPOSITIONAL_POS_NART );
    generic_testing.define_test_case_table_int( $sym214$DENOTS_OF_STRING, ConsesLow.list( new SubLObject[] { $kw298$TEST, $sym299$SETS_EQUAL_EQUAL_, $kw300$OWNER, NIL, $kw301$CLASSES, NIL, $kw302$KB, $kw303$FULL,
      $kw304$WORKING_, T
    } ), $list305 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_accessors_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_accessors_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_accessors_file();
  }
  static
  {
    me = new lexicon_accessors();
    $genl_lexicon_mtP_cached_caching_state$ = null;
    $max_preds_matching_pos_cached_caching_state$ = null;
    $max_preds_of_pos_caching_state$ = null;
    $max_preds_licensed_by_pos_caching_state$ = null;
    $speech_part_pred_min_ceilings_int_caching_state$ = null;
    $speech_part_pred_max_floors_int_caching_state$ = null;
    $pos_of_pred_caching_state$ = null;
    $derived_preds$ = null;
    $speech_part_preds$ = null;
    $genl_pos_predP_caching_state$ = null;
    $genl_pos_pred_from_mt_infoP_caching_state$ = null;
    $get_strings_of_type_cached_caching_state$ = null;
    $pos_for_keyword_caching_state$ = null;
    $preds_of_stringXword_cached_caching_state$ = null;
    $closed_lexical_class_strings$ = null;
    $closed_lexical_class_strings_case_insensitive$ = null;
    $closed_lexical_class_strings_caching_state$ = null;
    $closed_lexical_classes_caching_state$ = null;
    $preposition_strings$ = null;
    $pos_forms_spec_preds$ = null;
    $vulgar_words$ = null;
    $verb_only_stringP_caching_state$ = null;
    $indirect_lexical_assertionP_caching_state$ = null;
    $agr_of_det_string_caching_state$ = null;
    $pos_to_semtrans_pred_cached_caching_state$ = null;
    $semtrans_pred_to_pos_caching_state$ = null;
    $speech_parts$ = null;
    $genl_posP_caching_state$ = null;
    $most_general_speech_part$ = null;
    $compositional_pos_nart_caching_state$ = null;
    $relational_noun_denot_templates$ = null;
    $const0$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const1$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym2$GENL_LEXICON_MT__CACHED = makeSymbol( "GENL-LEXICON-MT?-CACHED" );
    $sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_ = makeSymbol( "*GENL-LEXICON-MT?-CACHED-CACHING-STATE*" );
    $int4$4096 = makeInteger( 4096 );
    $sym5$CLEAR_GENL_LEXICON_MT__CACHED = makeSymbol( "CLEAR-GENL-LEXICON-MT?-CACHED" );
    $kw6$INITIALIZED = makeKeyword( "INITIALIZED" );
    $sym7$SPEECH_PART_ = makeSymbol( "SPEECH-PART?" );
    $kw8$ALL = makeKeyword( "ALL" );
    $kw9$CLEARED = makeKeyword( "CLEARED" );
    $sym10$MAX_PREDS_MATCHING_POS_CACHED = makeSymbol( "MAX-PREDS-MATCHING-POS-CACHED" );
    $sym11$_MAX_PREDS_MATCHING_POS_CACHED_CACHING_STATE_ = makeSymbol( "*MAX-PREDS-MATCHING-POS-CACHED-CACHING-STATE*" );
    $int12$32 = makeInteger( 32 );
    $sym13$MAX_PREDS_OF_POS = makeSymbol( "MAX-PREDS-OF-POS" );
    $sym14$_MAX_PREDS_OF_POS_CACHING_STATE_ = makeSymbol( "*MAX-PREDS-OF-POS-CACHING-STATE*" );
    $sym15$CLEAR_MAX_PREDS_OF_POS = makeSymbol( "CLEAR-MAX-PREDS-OF-POS" );
    $sym16$MAX_PREDS_LICENSED_BY_POS = makeSymbol( "MAX-PREDS-LICENSED-BY-POS" );
    $sym17$_MAX_PREDS_LICENSED_BY_POS_CACHING_STATE_ = makeSymbol( "*MAX-PREDS-LICENSED-BY-POS-CACHING-STATE*" );
    $sym18$CLEAR_MAX_PREDS_LICENSED_BY_POS = makeSymbol( "CLEAR-MAX-PREDS-LICENSED-BY-POS" );
    $sym19$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const20$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $list21 = ConsesLow.cons( makeSymbol( "NOW" ), makeSymbol( "LATER" ) );
    $sym22$LEX_REMOVE_SPEC_PREDS_HELPER = makeSymbol( "LEX-REMOVE-SPEC-PREDS-HELPER" );
    $sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT = makeSymbol( "SPEECH-PART-PRED-MIN-CEILINGS-INT" );
    $sym24$_SPEECH_PART_PRED_MIN_CEILINGS_INT_CACHING_STATE_ = makeSymbol( "*SPEECH-PART-PRED-MIN-CEILINGS-INT-CACHING-STATE*" );
    $int25$512 = makeInteger( 512 );
    $sym26$CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT = makeSymbol( "CLEAR-SPEECH-PART-PRED-MIN-CEILINGS-INT" );
    $sym27$SPEECH_PART_PRED_MAX_FLOORS_INT = makeSymbol( "SPEECH-PART-PRED-MAX-FLOORS-INT" );
    $sym28$_SPEECH_PART_PRED_MAX_FLOORS_INT_CACHING_STATE_ = makeSymbol( "*SPEECH-PART-PRED-MAX-FLOORS-INT-CACHING-STATE*" );
    $sym29$CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT = makeSymbol( "CLEAR-SPEECH-PART-PRED-MAX-FLOORS-INT" );
    $sym30$POS_OF_PRED = makeSymbol( "POS-OF-PRED" );
    $sym31$SPEECH_PART_PRED_ = makeSymbol( "SPEECH-PART-PRED?" );
    $const32$speechPartPreds = constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) );
    $sym33$SPEC_POS_ = makeSymbol( "SPEC-POS?" );
    $sym34$_POS_OF_PRED_CACHING_STATE_ = makeSymbol( "*POS-OF-PRED-CACHING-STATE*" );
    $int35$128 = makeInteger( 128 );
    $const36$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const37$singular_Generic = constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) );
    $const38$plural_Generic = constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) );
    $sym39$_DERIVED_PREDS_ = makeSymbol( "*DERIVED-PREDS*" );
    $int40$256 = makeInteger( 256 );
    $const41$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $kw42$GAF = makeKeyword( "GAF" );
    $const43$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $kw44$BREADTH = makeKeyword( "BREADTH" );
    $kw45$QUEUE = makeKeyword( "QUEUE" );
    $kw46$STACK = makeKeyword( "STACK" );
    $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw48$ERROR = makeKeyword( "ERROR" );
    $str49$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym50$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw51$CERROR = makeKeyword( "CERROR" );
    $str52$continue_anyway = makeString( "continue anyway" );
    $kw53$WARN = makeKeyword( "WARN" );
    $str54$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const55$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw56$TRUE = makeKeyword( "TRUE" );
    $str57$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str58$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str59$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const60$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $sym61$_SPEECH_PART_PREDS_ = makeSymbol( "*SPEECH-PART-PREDS*" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), ConsesLow.list(
        makeSymbol( "DONE" ), NIL ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list63 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "DONE" ) );
    $kw64$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw65$MT = makeKeyword( "MT" );
    $kw66$DONE = makeKeyword( "DONE" );
    $sym67$DEFINING_MT = makeUninternedSymbol( "DEFINING-MT" );
    $sym68$PROGN = makeSymbol( "PROGN" );
    $list69 = ConsesLow.list( makeSymbol( "ENSURE-SPEECH-PART-PREDS-INITIALIZED" ) );
    $sym70$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym71$PWHEN = makeSymbol( "PWHEN" );
    $sym72$COR = makeSymbol( "COR" );
    $sym73$KBEQ = makeSymbol( "KBEQ" );
    $list74 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) );
    $sym75$GENL_LEXICON_MT_ = makeSymbol( "GENL-LEXICON-MT?" );
    $const76$SpeechPartPredicate = constant_handles.reader_make_constant_shell( makeString( "SpeechPartPredicate" ) );
    $const77$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym78$GENL_POS_PRED_ = makeSymbol( "GENL-POS-PRED?" );
    $sym79$_GENL_POS_PRED__CACHING_STATE_ = makeSymbol( "*GENL-POS-PRED?-CACHING-STATE*" );
    $sym80$CLEAR_GENL_POS_PRED_ = makeSymbol( "CLEAR-GENL-POS-PRED?" );
    $sym81$GENL_POS_PRED_FROM_MT_INFO_ = makeSymbol( "GENL-POS-PRED-FROM-MT-INFO?" );
    $sym82$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $sym83$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym84$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_ = makeSymbol( "*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*" );
    $sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_ = makeSymbol( "CLEAR-GENL-POS-PRED-FROM-MT-INFO?" );
    $sym87$STRINGP = makeSymbol( "STRINGP" );
    $sym88$STRING_ = makeSymbol( "STRING=" );
    $const89$ClosedClassWord = constant_handles.reader_make_constant_shell( makeString( "ClosedClassWord" ) );
    $const90$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $sym91$GET_STRINGS_OF_TYPE_CACHED = makeSymbol( "GET-STRINGS-OF-TYPE-CACHED" );
    $sym92$_GET_STRINGS_OF_TYPE_CACHED_CACHING_STATE_ = makeSymbol( "*GET-STRINGS-OF-TYPE-CACHED-CACHING-STATE*" );
    $sym93$STRING_IS_POS_ON_WU_ = makeSymbol( "STRING-IS-POS-ON-WU?" );
    $sym94$GET_STRINGS_OF_TYPE = makeSymbol( "GET-STRINGS-OF-TYPE" );
    $sym95$LEXICAL_WORD_ = makeSymbol( "LEXICAL-WORD?" );
    $sym96$PARSE_MORPHOLOGICALLY_OPTION_P = makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" );
    $kw97$NEVER = makeKeyword( "NEVER" );
    $sym98$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $kw99$AS_FALLBACK = makeKeyword( "AS-FALLBACK" );
    $sym100$SPEC_ = makeSymbol( "SPEC?" );
    $const101$EnglishLexiconMt = constant_handles.reader_make_constant_shell( makeString( "EnglishLexiconMt" ) );
    $sym102$POS_FOR_KEYWORD = makeSymbol( "POS-FOR-KEYWORD" );
    $sym103$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw104$ALL_NOUN_FORMS = makeKeyword( "ALL-NOUN-FORMS" );
    $kw105$NOUN = makeKeyword( "NOUN" );
    $list106 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) ), constant_handles
        .reader_make_constant_shell( makeString( "MassNoun" ) ), constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) ) );
    $kw107$MASS_NOUN = makeKeyword( "MASS-NOUN" );
    $list108 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ) );
    $kw109$SIMPLE_NOUN = makeKeyword( "SIMPLE-NOUN" );
    $const110$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $kw111$DEVERBAL_NOUN = makeKeyword( "DEVERBAL-NOUN" );
    $const112$DeVerbalNoun = constant_handles.reader_make_constant_shell( makeString( "DeVerbalNoun" ) );
    $kw113$AGENTIVE_NOUN = makeKeyword( "AGENTIVE-NOUN" );
    $const114$AgentiveNoun = constant_handles.reader_make_constant_shell( makeString( "AgentiveNoun" ) );
    $kw115$GERUNDIVE_NOUN = makeKeyword( "GERUNDIVE-NOUN" );
    $const116$GerundiveNoun = constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) );
    $kw117$PROPER_NOUN = makeKeyword( "PROPER-NOUN" );
    $kw118$VERB = makeKeyword( "VERB" );
    $list119 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $kw120$AUX = makeKeyword( "AUX" );
    $const121$AuxVerb = constant_handles.reader_make_constant_shell( makeString( "AuxVerb" ) );
    $kw122$ADJECTIVE = makeKeyword( "ADJECTIVE" );
    $const123$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $kw124$ADVERB = makeKeyword( "ADVERB" );
    $const125$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $kw126$PREP = makeKeyword( "PREP" );
    $const127$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $kw128$DET = makeKeyword( "DET" );
    $const129$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $kw130$CONJ = makeKeyword( "CONJ" );
    $const131$Conjunction = constant_handles.reader_make_constant_shell( makeString( "Conjunction" ) );
    $kw132$ANY = makeKeyword( "ANY" );
    $sym133$_POS_FOR_KEYWORD_CACHING_STATE_ = makeSymbol( "*POS-FOR-KEYWORD-CACHING-STATE*" );
    $int134$64 = makeInteger( 64 );
    $list135 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) ) );
    $sym136$PROPER_NOUN_FORM_OF_PRED = makeSymbol( "PROPER-NOUN-FORM-OF-PRED" );
    $sym137$PREDS_OF_STRING_WORD_CACHED = makeSymbol( "PREDS-OF-STRING&WORD-CACHED" );
    $sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_ = makeSymbol( "*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*" );
    $sym139$_STRING = makeSymbol( "?STRING" );
    $kw140$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $sym141$_POS = makeSymbol( "?POS" );
    $const142$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const143$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $const144$FrameForAdverbs = constant_handles.reader_make_constant_shell( makeString( "FrameForAdverbs" ) );
    $const145$ProperCountNoun = constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) );
    $list146 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DefiniteDeterminerFrame" ) ) );
    $const147$ProperMassNoun = constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) );
    $const148$FrameForNouns = constant_handles.reader_make_constant_shell( makeString( "FrameForNouns" ) );
    $const149$MassNoun = constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) );
    $const150$ZeroArticleFrame = constant_handles.reader_make_constant_shell( makeString( "ZeroArticleFrame" ) );
    $const151$FrameForAdjectives = constant_handles.reader_make_constant_shell( makeString( "FrameForAdjectives" ) );
    $sym152$_CLOSED_LEXICAL_CLASS_STRINGS_ = makeSymbol( "*CLOSED-LEXICAL-CLASS-STRINGS*" );
    $sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_ = makeSymbol( "*CLOSED-LEXICAL-CLASS-STRINGS-CASE-INSENSITIVE*" );
    $const154$Pronoun = constant_handles.reader_make_constant_shell( makeString( "Pronoun" ) );
    $sym155$NOT_TEST_CHAR = makeSymbol( "NOT-TEST-CHAR" );
    $sym156$CLOSED_LEXICAL_CLASS_STRINGS = makeSymbol( "CLOSED-LEXICAL-CLASS-STRINGS" );
    $sym157$_CLOSED_LEXICAL_CLASS_STRINGS_CACHING_STATE_ = makeSymbol( "*CLOSED-LEXICAL-CLASS-STRINGS-CACHING-STATE*" );
    $sym158$CLOSED_LEXICAL_CLASSES = makeSymbol( "CLOSED-LEXICAL-CLASSES" );
    $sym159$_CLOSED_LEXICAL_CLASSES_CACHING_STATE_ = makeSymbol( "*CLOSED-LEXICAL-CLASSES-CACHING-STATE*" );
    $list160 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "posForms" ) ), constant_handles.reader_make_constant_shell( makeString( "posBaseForms" ) ) );
    $list161 = ConsesLow.cons( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "WordWithPrefixFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "WordWithSuffixFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CompoundWordFn" ) ), constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), constant_handles
            .reader_make_constant_shell( makeString( "CompoundWordFn-HeadMedial" ) ), constant_handles.reader_make_constant_shell( makeString( "CompoundWordFn-HeadInitial" ) ) ), makeKeyword( "ANYTHING" ) );
    $const162$LexicalWord = constant_handles.reader_make_constant_shell( makeString( "LexicalWord" ) );
    $int163$1000 = makeInteger( 1000 );
    $sym164$DERIVED_WORD_ = makeSymbol( "DERIVED-WORD?" );
    $const165$DerivedWord = constant_handles.reader_make_constant_shell( makeString( "DerivedWord" ) );
    $sym166$_VULGAR_WORDS_ = makeSymbol( "*VULGAR-WORDS*" );
    $const167$InherentlyVulgarWord = constant_handles.reader_make_constant_shell( makeString( "InherentlyVulgarWord" ) );
    $list168 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str169$The_word_unit__S_is_neither_a_FOR = makeString( "The word-unit ~S is neither a FORT nor a NAUT." );
    $sym170$VERB_ONLY_STRING_ = makeSymbol( "VERB-ONLY-STRING?" );
    $sym171$_VERB_ONLY_STRING__CACHING_STATE_ = makeSymbol( "*VERB-ONLY-STRING?-CACHING-STATE*" );
    $kw172$DENOT = makeKeyword( "DENOT" );
    $sym173$EL_FORT_P = makeSymbol( "EL-FORT-P" );
    $sym174$LISTP = makeSymbol( "LISTP" );
    $sym175$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym176$HLMT_ = makeSymbol( "HLMT?" );
    $sym177$SET_P = makeSymbol( "SET-P" );
    $sym178$TYPED_DENOTS_OF_STRING = makeSymbol( "TYPED-DENOTS-OF-STRING" );
    $list179 = ConsesLow.list( new SubLObject[] { makeSymbol( "STRING" ), makeSymbol( "TYPE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "ABBREV-TYPES" ), NIL ), ConsesLow.list( makeSymbol( "DENOT-TYPE" ),
        makeKeyword( "DENOT" ) ), ConsesLow.list( makeSymbol( "MISSPELLINGS?" ), T ), ConsesLow.list( makeSymbol( "SKIP-NAMESTRINGS?" ), NIL ), ConsesLow.list( makeSymbol( "LOOKUP-MT" ), makeSymbol(
            "*LEXICON-LOOKUP-MT*" ) ), ConsesLow.list( makeSymbol( "SEMANTIC-MT" ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ),
                makeSymbol( "*PARSE-MORPHOLOGICALLY*" ) ), ConsesLow.list( makeSymbol( "EXCLUDED-PREDICATES" ), makeSymbol( "*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*" ) )
    } );
    $str180$_param_STRING_string_____param_TY = makeString(
        "@param STRING string\n   @param TYPE collection\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return list; a list of denotata for STRING that are instances of TYPE\n   note that this function does some parsing, if the type sent in is appropriate" );
    $list181 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol(
        "ABBREV-TYPES" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "DENOT-TYPE" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "MISSPELLINGS?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list(
            makeSymbol( "SKIP-NAMESTRINGS?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "LOOKUP-MT" ), makeSymbol( "HLMT?" ) ), ConsesLow.list( makeSymbol( "SEMANTIC-MT" ), makeSymbol( "HLMT?" ) ),
      ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ), makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" ) ), ConsesLow.list( makeSymbol( "EXCLUDED-PREDICATES" ), makeSymbol( "SET-P" ) )
    } );
    $list182 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym183$DENOT_HAS_TYPE_ = makeSymbol( "DENOT-HAS-TYPE?" );
    $sym184$DENOT_MIGHT_HAVE_TYPE_ = makeSymbol( "DENOT-MIGHT-HAVE-TYPE?" );
    $sym185$MORE_SPECIFIC_P = makeSymbol( "MORE-SPECIFIC-P" );
    $const186$City = constant_handles.reader_make_constant_shell( makeString( "City" ) );
    $const187$GeopoliticalEntity = constant_handles.reader_make_constant_shell( makeString( "GeopoliticalEntity" ) );
    $const188$CityNamedFn = constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) );
    $const189$InstanceNamedFn = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) );
    $const190$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const191$inRegion = constant_handles.reader_make_constant_shell( makeString( "inRegion" ) );
    $const192$GeographicalRegion = constant_handles.reader_make_constant_shell( makeString( "GeographicalRegion" ) );
    $const193$geopoliticalSubdivision = constant_handles.reader_make_constant_shell( makeString( "geopoliticalSubdivision" ) );
    $const194$geographicalSubRegions = constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegions" ) );
    $const195$territoryOf = constant_handles.reader_make_constant_shell( makeString( "territoryOf" ) );
    $str196$_ = makeString( "*" );
    $list197 = ConsesLow.list( Characters.CHAR_asterisk );
    $list198 = ConsesLow.list( makeString( "*" ) );
    $kw199$INFIX = makeKeyword( "INFIX" );
    $str200$ = makeString( "" );
    $str201$I_should_never_be_called___ = makeString( "I should never be called..." );
    $kw202$GREEDY = makeKeyword( "GREEDY" );
    $sym203$LIST_OF_PREDICATES_P = makeSymbol( "LIST-OF-PREDICATES-P" );
    $sym204$DENOTATION_MAPPER = makeSymbol( "DENOTATION-MAPPER" );
    $list205 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "EXCLUDED-PREDS" ), ConsesLow.list( makeSymbol( "MODE" ), makeKeyword( "GREEDY" ) ), ConsesLow.list( makeSymbol(
        "PARSE-MORPHOLOGICALLY" ), makeSymbol( "*PARSE-MORPHOLOGICALLY*" ) ) );
    $str206$_param_STRING_string__the_string_ = makeString(
        "@param STRING string; the string to map to its denotations\n   @param EXCLUDED-PREDS list; a list of semantic predicates which should be ignored when computing mappings \n   @param MODE keyword; :greedy or :diligent\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return 0 LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring \n                    of STRING and as its STRING-TOKEN-VALUE a denotatum for that string\n   @return 1 LISTP; a list of STRING-TOKENS for which no denotatum could be found" );
    $list207 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "EXCLUDED-PREDS" ), makeSymbol( "LIST-OF-PREDICATES-P" ) ), ConsesLow.list( makeSymbol(
        "MODE" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ), makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" ) ) );
    $list208 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "STRING-TOKEN-P" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "STRING-TOKEN-P" ) ) );
    $list209 = ConsesLow.list( makeKeyword( "ABBREVS" ), makeKeyword( "ACRONYMS" ) );
    $kw210$RELATED = makeKeyword( "RELATED" );
    $sym211$CYCL_STRING_P = makeSymbol( "CYCL-STRING-P" );
    $sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_ = makeSymbol( "VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?" );
    $list213 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ) );
    $sym214$DENOTS_OF_STRING = makeSymbol( "DENOTS-OF-STRING" );
    $list215 = ConsesLow.list( new SubLObject[] { makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "ABBREV-TYPES" ), NIL ), ConsesLow.list( makeSymbol( "DENOT-TYPE" ), makeKeyword(
        "DENOT" ) ), ConsesLow.list( makeSymbol( "MISSPELLINGS?" ), T ), ConsesLow.list( makeSymbol( "SKIP-NAMESTRINGS?" ), NIL ), ConsesLow.list( makeSymbol( "LOOKUP-MT" ), makeSymbol( "*LEXICON-LOOKUP-MT*" ) ),
      ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ), makeSymbol( "*PARSE-MORPHOLOGICALLY*" ) ), ConsesLow.list( makeSymbol( "PARSE-DATES-AND-NUMBERS?" ), T ), ConsesLow.list( makeSymbol( "LEXICON" ), NIL )
    } );
    $str216$_param_PARSE_MORPHOLOGICALLY__PAR = makeString(
        "@param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @param abbrev-types; listp: if it includes :abbrevs, include abbreviations;\n                               if it includes :acronyms, include acronyms\n   @param denot-type; keywordp: \n      :denot =  #$denotation assertions  (parsing)\n      :related = #$denotation and #$denotationRelatedTo (generation)\n      :any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\n   @param LOOKUP-MT: Lexical microtheory or ISO language code such as 'en'.\n   @param PARSE-DATES-AND-NUMBERS? booleanp; if set to NIL, DENOTS-OF-STRING will only perform lexical lookup, and \n      not try to parse any dates or numbers\n   @param LEXICON term-lexicon-p; if present, LOOKUP-MT will be ignored and LEXICON will be used instead.\n   @return 0. LISTP ; CycL denotational terms serving as denotations for the phrase\n   @return 1. LISTP ; list of predicate lists for each denotation" );
    $list217 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "CYCL-STRING-P" ) ), ConsesLow.list( makeSymbol( "ABBREV-TYPES" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "DENOT-TYPE" ),
        makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "MISSPELLINGS?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "SKIP-NAMESTRINGS?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol(
            "LOOKUP-MT" ), makeSymbol( "VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?" ) ), ConsesLow.list( makeSymbol( "PARSE-MORPHOLOGICALLY" ), makeSymbol( "PARSE-MORPHOLOGICALLY-OPTION-P" ) ) );
    $sym218$DENOTS_MT_FOR_LANGUAGE = makeSymbol( "DENOTS-MT-FOR-LANGUAGE" );
    $const219$validatedLexicalPSCForLanguage = constant_handles.reader_make_constant_shell( makeString( "validatedLexicalPSCForLanguage" ) );
    $const220$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const221$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $str222$_S_passes_neither_SPEECH_PART_PRE = makeString( "~S passes neither SPEECH-PART-PRED? nor NAME-STRING-PRED?" );
    $sym223$NAME_STRING_PRED_ = makeSymbol( "NAME-STRING-PRED?" );
    $kw224$ONLY = makeKeyword( "ONLY" );
    $kw225$ALWAYS = makeKeyword( "ALWAYS" );
    $const226$ProperNamePredicate_Strict = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-Strict" ) );
    $kw227$JUST_RELATED = makeKeyword( "JUST-RELATED" );
    $list228 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ) );
    $kw229$JUST_PLACEHOLDER = makeKeyword( "JUST-PLACEHOLDER" );
    $list230 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationPlaceholder" ) ) );
    $list231 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ), constant_handles.reader_make_constant_shell( makeString( "denotation" ) ) );
    $list232 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationPlaceholder" ) ), constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ), constant_handles
        .reader_make_constant_shell( makeString( "denotation" ) ) );
    $list233 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ) );
    $const234$denotation = constant_handles.reader_make_constant_shell( makeString( "denotation" ) );
    $kw235$PLACEHOLDER = makeKeyword( "PLACEHOLDER" );
    $const236$denotationPlaceholder = constant_handles.reader_make_constant_shell( makeString( "denotationPlaceholder" ) );
    $const237$denotationRelatedTo = constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) );
    $const238$subcatFrame = constant_handles.reader_make_constant_shell( makeString( "subcatFrame" ) );
    $sym239$_ = makeSymbol( "<" );
    $sym240$FORT_P = makeSymbol( "FORT-P" );
    $const241$subcatFrameArity = constant_handles.reader_make_constant_shell( makeString( "subcatFrameArity" ) );
    $const242$politenessOfWS = constant_handles.reader_make_constant_shell( makeString( "politenessOfWS" ) );
    $const243$formalityOfWS = constant_handles.reader_make_constant_shell( makeString( "formalityOfWS" ) );
    $sym244$_LEVEL = makeSymbol( "?LEVEL" );
    $list245 = ConsesLow.list( makeSymbol( "?LEVEL" ) );
    $list246 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RudeSpeech" ) ), constant_handles.reader_make_constant_shell( makeString( "VulgarSpeech" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ObjectionableSpeech" ) ) );
    $sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_ = makeSymbol( "POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?" );
    $const248$SlangSpeech = constant_handles.reader_make_constant_shell( makeString( "SlangSpeech" ) );
    $const249$ArchaicSpeech = constant_handles.reader_make_constant_shell( makeString( "ArchaicSpeech" ) );
    $sym250$INDIRECT_LEXICAL_ASSERTION_ = makeSymbol( "INDIRECT-LEXICAL-ASSERTION?" );
    $const251$DenotationPredicate_ExcludedFromN = constant_handles.reader_make_constant_shell( makeString( "DenotationPredicate-ExcludedFromNPParser" ) );
    $sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_ = makeSymbol( "*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*" );
    $sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_ = makeSymbol( "CLEAR-INDIRECT-LEXICAL-ASSERTION?" );
    $sym254$INTEGERP = makeSymbol( "INTEGERP" );
    $sym255$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $const256$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $sym257$CAR = makeSymbol( "CAR" );
    $sym258$CDR = makeSymbol( "CDR" );
    $const259$TransitivePPFrameType = constant_handles.reader_make_constant_shell( makeString( "TransitivePPFrameType" ) );
    $const260$DitransitivePPFrameType = constant_handles.reader_make_constant_shell( makeString( "DitransitivePPFrameType" ) );
    $sym261$AGR_OF_DET_STRING = makeSymbol( "AGR-OF-DET-STRING" );
    $list262 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonSingular-Generic" ) ) );
    $sym263$_AGR_OF_DET_STRING_CACHING_STATE_ = makeSymbol( "*AGR-OF-DET-STRING-CACHING-STATE*" );
    $const264$determinerAgreement = constant_handles.reader_make_constant_shell( makeString( "determinerAgreement" ) );
    $sym265$POS_TO_SEMTRANS_PRED_CACHED = makeSymbol( "POS-TO-SEMTRANS-PRED-CACHED" );
    $const266$semTransPredForPOS = constant_handles.reader_make_constant_shell( makeString( "semTransPredForPOS" ) );
    $sym267$_POS_TO_SEMTRANS_PRED_CACHED_CACHING_STATE_ = makeSymbol( "*POS-TO-SEMTRANS-PRED-CACHED-CACHING-STATE*" );
    $sym268$CLEAR_POS_TO_SEMTRANS_PRED_CACHED = makeSymbol( "CLEAR-POS-TO-SEMTRANS-PRED-CACHED" );
    $sym269$SEMTRANS_PRED_TO_POS = makeSymbol( "SEMTRANS-PRED-TO-POS" );
    $sym270$_SEMTRANS_PRED_TO_POS_CACHING_STATE_ = makeSymbol( "*SEMTRANS-PRED-TO-POS-CACHING-STATE*" );
    $const271$commonNickname = constant_handles.reader_make_constant_shell( makeString( "commonNickname" ) );
    $const272$nameSpelling = constant_handles.reader_make_constant_shell( makeString( "nameSpelling" ) );
    $const273$SpeechPart = constant_handles.reader_make_constant_shell( makeString( "SpeechPart" ) );
    $sym274$_SPEECH_PARTS_ = makeSymbol( "*SPEECH-PARTS*" );
    $sym275$GENL_POS_ = makeSymbol( "GENL-POS?" );
    $sym276$_GENL_POS__CACHING_STATE_ = makeSymbol( "*GENL-POS?-CACHING-STATE*" );
    $const277$NLWordForm = constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) );
    $list278 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ) );
    $const279$PhraseFn_Bar1 = constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) );
    $sym280$COMPOSITIONAL_POS_NART = makeSymbol( "COMPOSITIONAL-POS-NART" );
    $sym281$_COMPOSITIONAL_POS_NART_CACHING_STATE_ = makeSymbol( "*COMPOSITIONAL-POS-NART-CACHING-STATE*" );
    $list282 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ), constant_handles
        .reader_make_constant_shell( makeString( "NounPhrase" ) ) );
    $list283 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Preposition" ) ) ), constant_handles
        .reader_make_constant_shell( makeString( "PrepositionalPhrase" ) ) );
    $kw284$UNDETERMINED = makeKeyword( "UNDETERMINED" );
    $kw285$POSSESSED_TYPE = makeKeyword( "POSSESSED-TYPE" );
    $kw286$DENOTED_PRED = makeKeyword( "DENOTED-PRED" );
    $kw287$POSSESSOR = makeKeyword( "POSSESSOR" );
    $kw288$POSSESSOR_TYPE = makeKeyword( "POSSESSOR-TYPE" );
    $list289 = ConsesLow.list( ConsesLow.list( T, ConsesLow.list( ONE_INTEGER, constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) ), makeKeyword( "POSSESSED-TYPE" ),
        makeKeyword( "DENOTED-PRED" ), makeKeyword( "POSSESSOR-TYPE" ) ), ConsesLow.list( TWO_INTEGER, constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) ), makeKeyword(
            "POSSESSED-TYPE" ), makeKeyword( "DENOTED-PRED" ), makeKeyword( "POSSESSOR-TYPE" ) ) ), ConsesLow.list( NIL, ConsesLow.list( ONE_INTEGER, constant_handles.reader_make_constant_shell( makeString(
                "SubcollectionOfWithRelationToFn" ) ), makeKeyword( "POSSESSED-TYPE" ), makeKeyword( "DENOTED-PRED" ), makeKeyword( "POSSESSOR" ) ), ConsesLow.list( TWO_INTEGER, constant_handles
                    .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) ), makeKeyword( "POSSESSED-TYPE" ), makeKeyword( "DENOTED-PRED" ), makeKeyword( "POSSESSOR" ) ) ) );
    $const290$headMedialStringDenotesArgInReln = constant_handles.reader_make_constant_shell( makeString( "headMedialStringDenotesArgInReln" ) );
    $const291$multiWordStringDenotesArgInReln = constant_handles.reader_make_constant_shell( makeString( "multiWordStringDenotesArgInReln" ) );
    $const292$compoundStringDenotesArgInReln = constant_handles.reader_make_constant_shell( makeString( "compoundStringDenotesArgInReln" ) );
    $const293$denotesArgInReln = constant_handles.reader_make_constant_shell( makeString( "denotesArgInReln" ) );
    $list294 = ConsesLow.list( ONE_INTEGER );
    $sym295$_PRED = makeSymbol( "?PRED" );
    $list296 = ConsesLow.list( makeSymbol( "?PRED" ), makeSymbol( "?ARGNUM" ) );
    $const297$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $kw298$TEST = makeKeyword( "TEST" );
    $sym299$SETS_EQUAL_EQUAL_ = makeSymbol( "SETS-EQUAL-EQUAL?" );
    $kw300$OWNER = makeKeyword( "OWNER" );
    $kw301$CLASSES = makeKeyword( "CLASSES" );
    $kw302$KB = makeKeyword( "KB" );
    $kw303$FULL = makeKeyword( "FULL" );
    $kw304$WORKING_ = makeKeyword( "WORKING?" );
    $list305 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "ABEDA" ), ConsesLow.list( makeSymbol( "ABBREV-TYPES" ), makeKeyword( "ACRONYMS" ) ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "ArabBankForEconomicDevelopmentInAfrica" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "acronymString" ) ) ) ) ),
        ConsesLow.list( ConsesLow.list( makeString( "platform" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Platform-Military" ) ), constant_handles.reader_make_constant_shell(
            makeString( "ComputerProcessor" ) ), constant_handles.reader_make_constant_shell( makeString( "PoliticalBeliefSystem" ) ), constant_handles.reader_make_constant_shell( makeString( "Platform" ) ) ), ConsesLow
                .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow.list( ConsesLow
                        .list( makeString( "chemical engineering" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ChemicalEngineering" ) ) ), ConsesLow.list( ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "heart attack" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow.list(
                                    ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u99ac;" ) ), NIL, makeKeyword( "DENOT" ), NIL, NIL,
                                        constant_handles.reader_make_constant_shell( makeString( "ChineseLexicalMt" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Horse" ) ),
                                            constant_handles.reader_make_constant_shell( makeString( "YoYoMa-Cellist" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "singular" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "familyName" ) ) ) ) ) );
    $str306$missing___S = makeString( "missing: ~S" );
    $sym307$HL_TERM_WITH_EL_COUNTERPART_P = makeSymbol( "HL-TERM-WITH-EL-COUNTERPART-P" );
    $sym308$HL_TERM_TO_EL_TERM = makeSymbol( "HL-TERM-TO-EL-TERM" );
  }

  public static final class $speech_part_predP$UnaryFunction
      extends
        UnaryFunction
  {
    public $speech_part_predP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SPEECH-PART-PRED?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return speech_part_predP( arg1, $speech_part_predP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $speech_part_predP$BinaryFunction
      extends
        BinaryFunction
  {
    public $speech_part_predP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SPEECH-PART-PRED?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return speech_part_predP( arg1, arg2 );
    }
  }

  public static final class $genl_pos_predP$BinaryFunction
      extends
        BinaryFunction
  {
    public $genl_pos_predP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GENL-POS-PRED?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return genl_pos_predP( arg1, arg2, $genl_pos_predP$BinaryFunction.UNPROVIDED );
    }
  }

  public static final class $clear_pos_to_semtrans_pred_cached$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_pos_to_semtrans_pred_cached$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-POS-TO-SEMTRANS-PRED-CACHED" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_pos_to_semtrans_pred_cached();
    }
  }
}
/*
 * 
 * Total time: 5747 ms
 * 
 */