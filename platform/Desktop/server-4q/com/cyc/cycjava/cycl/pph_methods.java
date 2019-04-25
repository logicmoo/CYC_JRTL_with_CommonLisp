package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_methods
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_methods";
  public static final String myFingerPrint = "15bd07a1c66a0564882f2972f459be1f6d7dc9fc05ea2d49ad9b7829d2be5b55";
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 2280L)
  private static SubLSymbol $generate_skolem_ids$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 2349L)
  private static SubLSymbol $generate_skolem_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 20661L)
  public static SubLSymbol $pph_facet_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 27085L)
  public static SubLSymbol $pph_assume_distinct_vars_require_different_bindingsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 42548L)
  private static SubLSymbol $select_string_method_count$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 43088L)
  private static SubLSymbol $select_string_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 56494L)
  private static SubLSymbol $pph_name_string_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 57590L)
  private static SubLSymbol $pph_term_string_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62295L)
  private static SubLSymbol $pph_enhanced_domain_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66063L)
  private static SubLSymbol $pph_abbreviation_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 67576L)
  private static SubLSymbol $dispreferred_pph_name_string_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 84315L)
  private static SubLSymbol $english_integer_paraphrases$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 84693L)
  private static SubLSymbol $english_tens_paraphrases$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 88755L)
  private static SubLSymbol $pph_default_mt_time_index$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 91258L)
  private static SubLSymbol $ignore_misleading_time_parametersP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107498L)
  private static SubLSymbol $bad_collections_for_genitive_paraphrase$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107907L)
  private static SubLSymbol $pph_possessive_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 111247L)
  private static SubLSymbol $use_unlexified_form_for_instances$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 111472L)
  private static SubLSymbol $use_unlexified_form$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 119574L)
  private static SubLSymbol $known_english_variants$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 120394L)
  private static SubLSymbol $pph_default_grammatical_gender$;
  private static final SubLSymbol $sym0$GENERATE_CONSTANT_DEFAULT;
  private static final SubLSymbol $sym1$GENERATE_ATOMIC_FORMULA;
  private static final SubLSymbol $sym2$GENERATE_CYCL_LIST;
  private static final SubLSymbol $sym3$GENERATE_CYCL_VARIABLE;
  private static final SubLSymbol $sym4$GENERATE_NART_AS_NAUT;
  private static final SubLSymbol $sym5$GENERATE_NART_LEXIFIED_IMPRECISE;
  private static final SubLSymbol $sym6$GENERATE_NART_LEXIFIED_TIGHT;
  private static final SubLSymbol $sym7$GENERATE_PHRASE_FROM_TEMPLATE;
  private static final SubLSymbol $sym8$GENERATE_STRING;
  private static final SubLSymbol $sym9$GENERATE_SKOLEM_TERM_WITH_NAME;
  private static final SubLSymbol $kw10$SKOLEM_TERM;
  private static final SubLSymbol $kw11$DECENT;
  private static final SubLSymbol $kw12$HTML;
  private static final SubLObject $const13$nameString;
  private static final SubLSymbol $sym14$GENERATE_SKOLEM_NAME;
  private static final SubLObject $const15$InferencePSC;
  private static final SubLSymbol $kw16$TEXT;
  private static final SubLObject $const17$Thing;
  private static final SubLString $str18$Object;
  private static final SubLList $list19;
  private static final SubLString $str20$_;
  private static final SubLSymbol $sym21$_GENERATE_SKOLEM_NAME_CACHING_STATE_;
  private static final SubLSymbol $sym22$GENERATE_SKOLEM_TERM_EXISTENTIALLY;
  private static final SubLSymbol $kw23$INDEFINITE;
  private static final SubLObject $const24$nonPlural_Generic;
  private static final SubLSymbol $sym25$_X;
  private static final SubLSymbol $sym26$TOU_ATOMIC_SENTENCE_;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$NAT_FUNCTION;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const31$EverythingPSC;
  private static final SubLObject $const32$Collection;
  private static final SubLSymbol $sym33$GENERATE_HYPOTHETICAL;
  private static final SubLSymbol $kw34$HYPOTHETICAL;
  private static final SubLSymbol $kw35$BEST;
  private static final SubLSymbol $sym36$NAME_STRING_METHOD;
  private static final SubLObject $const37$singular_Generic;
  private static final SubLSymbol $kw38$VARIABLE;
  private static final SubLSymbol $kw39$LEXIFIED_VARIABLE;
  private static final SubLList $list40;
  private static final SubLObject $const41$Instance_TheWord;
  private static final SubLObject $const42$CountNoun;
  private static final SubLString $str43$instance;
  private static final SubLString $str44$_of;
  private static final SubLString $str45$some;
  private static final SubLSymbol $kw46$UNIVERSAL;
  private static final SubLString $str47$every;
  private static final SubLSymbol $kw48$NO;
  private static final SubLString $str49$no;
  private static final SubLSymbol $kw50$ANY;
  private static final SubLString $str51$any;
  private static final SubLSymbol $sym52$ATOMIC_SENTENCE_;
  private static final SubLString $str53$__Paraphrasing__S_as__S_in_contex;
  private static final SubLObject $const54$Determiner;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$PPH_NBAR_CYCL_TEMPLATE_FOR_TERM_TYPE;
  private static final SubLSymbol $sym57$PPH_DETP_CYCL_TEMPLATE_FOR_TERM_TYPE;
  private static final SubLSymbol $sym58$PPH_NP_CYCL_TEMPLATE_FOR_TERM_TYPE;
  private static final SubLObject $const59$nounStrings;
  private static final SubLString $str60$Can_t_reconcile__S_with__S;
  private static final SubLObject $const61$FacetingCollectionType;
  private static final SubLSymbol $sym62$_TG;
  private static final SubLObject $const63$typeGenls;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$PPH_GENL_;
  private static final SubLSymbol $kw66$EXISTENTIAL;
  private static final SubLSymbol $kw67$DEPTH;
  private static final SubLSymbol $kw68$STACK;
  private static final SubLSymbol $kw69$QUEUE;
  private static final SubLObject $const70$True_JustificationTruth;
  private static final SubLSymbol $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw72$ERROR;
  private static final SubLString $str73$_A_is_not_a__A;
  private static final SubLSymbol $sym74$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw75$CERROR;
  private static final SubLString $str76$continue_anyway;
  private static final SubLSymbol $kw77$WARN;
  private static final SubLString $str78$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const79$genlPreds;
  private static final SubLString $str80$Skipping__S_as_too_highly_faceted;
  private static final SubLString $str81$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str82$attempting_to_bind_direction_link;
  private static final SubLString $str83$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw84$BACKREFERENCE_CLASSB;
  private static final SubLSymbol $kw85$DEFINITE;
  private static final SubLSymbol $kw86$WHAT;
  private static final SubLSymbol $sym87$DETERMINER_TYPE_FOR_VAR_PHRASE;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$VARS;
  private static final SubLString $str90$Bound_by_universal_introduction__;
  private static final SubLSymbol $kw91$START;
  private static final SubLString $str92$if;
  private static final SubLSymbol $kw93$FOUND_IF;
  private static final SubLSymbol $kw94$FOUND_VAR_DTR;
  private static final SubLString $str95$_;
  private static final SubLString $str96$Arg_position__S_applied_to_top_le;
  private static final SubLObject $const97$thereExists;
  private static final SubLObject $const98$forAll;
  private static final SubLString $str99$Var__S_at_arg_position__S_in_cycl;
  private static final SubLString $str100$Quantifier_for_var__S_not_found_i;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLString $str103$it;
  private static final SubLString $str104$the;
  private static final SubLString $str105$thing;
  private static final SubLString $str106$something;
  private static final SubLString $str107$everything;
  private static final SubLString $str108$other;
  private static final SubLString $str109$another;
  private static final SubLString $str110$Explicitifying__S;
  private static final SubLSymbol $sym111$GENERATE_KEYWORD;
  private static final SubLSymbol $kw112$KEYWORD;
  private static final SubLSymbol $sym113$GENERATE_CYCL_SYMBOL;
  private static final SubLSymbol $kw114$CYCL_SYMBOL;
  private static final SubLString $str115$the_SubL_symbol_;
  private static final SubLSymbol $sym116$GENERATE_NON_CYCL_SYMBOL;
  private static final SubLSymbol $kw117$NON_CYCL_SYMBOL;
  private static final SubLString $str118$the_symbol_;
  private static final SubLSymbol $kw119$CONSTANT;
  private static final SubLSymbol $sym120$SCIENTIFIC_NAME_METHOD;
  private static final SubLSymbol $kw121$PRECISE;
  private static final SubLString $str122$__Shadowing_discourse_context____;
  private static final SubLSymbol $kw123$GOOD;
  private static final SubLString $str124$__GENERATE_CONSTANT_DEFAULT__Tryi;
  private static final SubLSymbol $sym125$GENERATE_LEXICAL_WORD;
  private static final SubLSymbol $kw126$LEXICAL_WORD;
  private static final SubLString $str127$_TheWord;
  private static final SubLString $str128$_MWW;
  private static final SubLString $str129$RKF_;
  private static final SubLObject $const130$ProperNoun;
  private static final SubLString $str131$the_word_;
  private static final SubLObject $const132$chemicalFormulaString;
  private static final SubLList $list133;
  private static final SubLObject $const134$ElectronicCharge;
  private static final SubLList $list135;
  private static final SubLObject $const136$TheList;
  private static final SubLList $list137;
  private static final SubLList $list138;
  private static final SubLObject $const139$completeAtomicComposition_List;
  private static final SubLObject $const140$SomeFn;
  private static final SubLSymbol $sym141$_CHARGE;
  private static final SubLObject $const142$chargeOfObject;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$_MOLECULE_TYPE;
  private static final SubLObject $const145$moleculesOfCompoundType;
  private static final SubLList $list146;
  private static final SubLObject $const147$ChemicalSubstanceFn;
  private static final SubLSymbol $sym148$_SELECT_STRING_METHOD_COUNT_;
  private static final SubLInteger $int149$256;
  private static final SubLList $list150;
  private static final SubLString $str151$__SELECT_STRING_METHOD__NL_PREDS_;
  private static final SubLString $str152$__SELECT_STRING_METHOD__Precision;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$DEMERITS;
  private static final SubLSymbol $sym155$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str156$___Top_level_CycL___S;
  private static final SubLString $str157$Added__S_alternatives_for____S;
  private static final SubLString $str158$__SELECT_STRING_METHOD__the_funct;
  private static final SubLString $str159$PPH_timeout_time_reached_;
  private static final SubLSymbol $sym160$SELECT_STRING_METHOD;
  private static final SubLSymbol $kw161$DEMERITS;
  private static final SubLSymbol $kw162$CYCL;
  private static final SubLSymbol $kw163$NL_PREDS;
  private static final SubLSymbol $kw164$INCREMENTAL_DEMERITS;
  private static final SubLSymbol $kw165$METHOD;
  private static final SubLString $str166$__SELECT_STRING_METHOD__Calling__;
  private static final SubLSymbol $sym167$PPH_PHRASE_OUTPUT_ITEM_STRING;
  private static final SubLList $list168;
  private static final SubLString $str169$__SELECT_STRING_METHOD__Function_;
  private static final SubLSymbol $sym170$NL_GENERATION_CACHE_METHOD;
  private static final SubLObject $const171$Noun;
  private static final SubLObject $const172$definiteDescriptions;
  private static final SubLString $str173$the_;
  private static final SubLString $str174$Removing_determiner_to_form_Nbar_;
  private static final SubLString $str175$Paraphrasing__S_as_an_NP_;
  private static final SubLList $list176;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLList $list179;
  private static final SubLObject $const180$properNameStrings;
  private static final SubLSymbol $sym181$PPH_SPEC_PREDICATE_;
  private static final SubLString $str182$Adding___properNameStrings_to__S;
  private static final SubLSymbol $sym183$PPH_PRED_LICENSED_BY_PRED_;
  private static final SubLSymbol $sym184$SELECT_STRING_FOR_TERM;
  private static final SubLSymbol $kw185$DEFAULT;
  private static final SubLString $str186$_PPH_error_level_;
  private static final SubLString $str187$__;
  private static final SubLString $str188$Trying_to_paraphrase__S_with_no_N;
  private static final SubLSymbol $sym189$PPH_PRECISION_P;
  private static final SubLInteger $int190$500;
  private static final SubLSymbol $sym191$PPH_NAME_STRING_PREDS;
  private static final SubLObject $const192$preferredNameString;
  private static final SubLObject $const193$ProperNamePredicate_Strict;
  private static final SubLSymbol $sym194$VALID_CONSTANT_;
  private static final SubLSymbol $sym195$HL_PROTOTYPICAL_INSTANCE_;
  private static final SubLSymbol $sym196$_PPH_NAME_STRING_PREDS_CACHING_STATE_;
  private static final SubLInteger $int197$128;
  private static final SubLSymbol $sym198$CLEAR_PPH_NAME_STRING_PREDS;
  private static final SubLSymbol $sym199$PPH_TERM_STRING_PREDS;
  private static final SubLObject $const200$preferredTermStrings;
  private static final SubLObject $const201$ProperNamePredicate_Loose;
  private static final SubLSymbol $sym202$_PPH_TERM_STRING_PREDS_CACHING_STATE_;
  private static final SubLSymbol $sym203$CLEAR_PPH_TERM_STRING_PREDS;
  private static final SubLString $str204$Broadening__PPH_LANGUAGE_MT__to__;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$SPEC_POS_PRED_;
  private static final SubLObject $const207$abbreviationString;
  private static final SubLSymbol $sym208$PPH_ENHANCED_DOMAIN_MT;
  private static final SubLObject $const209$MtUnionFn;
  private static final SubLSymbol $sym210$_PPH_ENHANCED_DOMAIN_MT_CACHING_STATE_;
  private static final SubLSymbol $sym211$CLEAR_PPH_ENHANCED_DOMAIN_MT;
  private static final SubLObject $const212$validatedLexicalPSCForLanguage;
  private static final SubLObject $const213$dispreferredLexification;
  private static final SubLString $str214$__Got__S;
  private static final SubLString $str215$Generated_name_for__S_from____S;
  private static final SubLObject $const216$ChemicalSubstanceType;
  private static final SubLString $str217$__No__S_assertions___for__S___fro;
  private static final SubLSymbol $sym218$NAME_STRING_GAF_STRINGS;
  private static final SubLSymbol $sym219$PPH_NON_ABBREVIATION_NAME_PRED_;
  private static final SubLSymbol $kw220$CLEARED;
  private static final SubLSymbol $sym221$PPH_ABBREVIATION_PREDS;
  private static final SubLObject $const222$abbreviationString_PN;
  private static final SubLSymbol $sym223$_PPH_ABBREVIATION_PREDS_CACHING_STATE_;
  private static final SubLInteger $int224$25;
  private static final SubLSymbol $sym225$CLEAR_PPH_ABBREVIATION_PREDS;
  private static final SubLObject $const226$acronymString;
  private static final SubLList $list227;
  private static final SubLObject $const228$Artifact_Generic;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$PPH_PREFER_NAME_STRING_PRED_;
  private static final SubLSymbol $sym231$INVALID_ASSERTION_;
  private static final SubLObject $const232$scientificName;
  private static final SubLList $list233;
  private static final SubLSymbol $kw234$GAF;
  private static final SubLList $list235;
  private static final SubLSymbol $kw236$LEXIFIED_NART;
  private static final SubLObject $const237$rewriteOf;
  private static final SubLSymbol $kw238$TRUE;
  private static final SubLString $str239$Couldn_t_find__S_lexification_wit;
  private static final SubLString $str240$Reverted_to_original_phrase_;
  private static final SubLSymbol $kw241$NART;
  private static final SubLString $str242$__GENERATE_NART_AS_NAUT_paraphras;
  private static final SubLString $str243$__GENERATE_NART_AS_NAUT_found_unj;
  private static final SubLSymbol $kw244$OK_NAT_TEMPLATE;
  private static final SubLSymbol $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_;
  private static final SubLSymbol $sym246$_EXIT;
  private static final SubLObject $const247$genTemplate_Constrained;
  private static final SubLObject $const248$genTemplate;
  private static final SubLSymbol $sym249$GENERATE_UNIVERSAL_DATE;
  private static final SubLSymbol $kw250$UNIVERSAL_DATE;
  private static final SubLSymbol $sym251$GENERATE_UNIVERSAL_DATE_NUMBERS;
  private static final SubLSymbol $kw252$FALLBACK;
  private static final SubLSymbol $sym253$GENERATE_UNIVERSAL_SECOND;
  private static final SubLSymbol $kw254$UNIVERSAL_SECOND;
  private static final SubLSymbol $kw255$SECOND;
  private static final SubLSymbol $kw256$MINUTE;
  private static final SubLString $str257$_00;
  private static final SubLSymbol $sym258$GENERATE_FLOAT;
  private static final SubLSymbol $kw259$FLOAT;
  private static final SubLString $str260$E0;
  private static final SubLSymbol $sym261$ALPHA_CHAR_P;
  private static final SubLString $str262$_0;
  private static final SubLObject $const263$MultiplicationSign_TheSymbol;
  private static final SubLString $str264$10;
  private static final SubLString $str265$_;
  private static final SubLString $str266$E;
  private static final SubLString $str267$D;
  private static final SubLString $str268$0;
  private static final SubLString $str269$_;
  private static final SubLString $str270$d;
  private static final SubLString $str271$__D;
  private static final SubLList $list272;
  private static final SubLList $list273;
  private static final SubLSymbol $sym274$INTEGERP;
  private static final SubLInteger $int275$100;
  private static final SubLString $str276$_;
  private static final SubLSymbol $sym277$GENERATE_NUMBER_DEFAULT;
  private static final SubLSymbol $kw278$NUMBER;
  private static final SubLString $str279$Was_anticipating_a_singleton_outp;
  private static final SubLObject $const280$OrdinalAdjective;
  private static final SubLSymbol $sym281$_STRING;
  private static final SubLObject $const282$imageURLPathname;
  private static final SubLList $list283;
  private static final SubLList $list284;
  private static final SubLSymbol $sym285$GENERATE_IMAGE_URL;
  private static final SubLSymbol $kw286$IMAGE_URL;
  private static final SubLString $str287$_img_src___A__;
  private static final SubLString $str288$;
  private static final SubLSymbol $sym289$GENERATE_PRINC;
  private static final SubLSymbol $kw290$OBJECT;
  private static final SubLSymbol $kw291$SYMBOL;
  private static final SubLSymbol $sym292$_PPH_DEFAULT_MT_TIME_INDEX_;
  private static final SubLObject $const293$Always_TimeInterval;
  private static final SubLSymbol $sym294$GENERATE_ASSERTION;
  private static final SubLSymbol $kw295$ASSERTION;
  private static final SubLObject $const296$ist;
  private static final SubLObject $const297$MtTimeDimFn;
  private static final SubLList $list298;
  private static final SubLSymbol $kw299$IGNORE;
  private static final SubLSymbol $sym300$_DATE;
  private static final SubLObject $const301$startingDate;
  private static final SubLList $list302;
  private static final SubLObject $const303$endingDate;
  private static final SubLList $list304;
  private static final SubLSymbol $sym305$END_DATE;
  private static final SubLSymbol $sym306$START_DATE;
  private static final SubLObject $const307$IntervalStartedByFn_Inclusive;
  private static final SubLObject $const308$IntervalEndedByFn_Inclusive;
  private static final SubLList $list309;
  private static final SubLSymbol $sym310$GUID;
  private static final SubLObject $const311$SomeTimeInIntervalFn;
  private static final SubLObject $const312$IntervalStartedByFn;
  private static final SubLObject $const313$IntervalEndedByFn;
  private static final SubLList $list314;
  private static final SubLSymbol $sym315$DATE;
  private static final SubLSymbol $sym316$INDEXED_TERM_P;
  private static final SubLSymbol $sym317$PPH_SUPPORT_CREATION_DATES;
  private static final SubLObject $const318$mtTimeIndex;
  private static final SubLSymbol $sym319$_TIME_INDEX;
  private static final SubLObject $const320$assertedSentence;
  private static final SubLList $list321;
  private static final SubLObject $const322$TKBSourceSpindleHeadMt;
  private static final SubLObject $const323$TKBSourceSpindleCollectorMt;
  private static final SubLSymbol $sym324$PPH_MT_TIME_INDEX;
  private static final SubLSymbol $kw325$TEST;
  private static final SubLSymbol $kw326$OWNER;
  private static final SubLSymbol $kw327$CLASSES;
  private static final SubLList $list328;
  private static final SubLSymbol $kw329$KB;
  private static final SubLSymbol $kw330$FULL;
  private static final SubLSymbol $kw331$WORKING_;
  private static final SubLList $list332;
  private static final SubLSymbol $kw333$SUBSUMING;
  private static final SubLObject $const334$startsAfterEndingOf;
  private static final SubLObject $const335$TimeIntervalInclusiveFn;
  private static final SubLList $list336;
  private static final SubLSymbol $kw337$FOLLOWING;
  private static final SubLList $list338;
  private static final SubLSymbol $kw339$PRECEDING;
  private static final SubLObject $const340$TimeIntervalBetweenFn;
  private static final SubLSymbol $sym341$PPH_ADJUST_MT_DATE_GRANULARITY;
  private static final SubLObject $const342$CalendarYear;
  private static final SubLList $list343;
  private static final SubLObject $const344$DurationFn;
  private static final SubLObject $const345$CalendarDay;
  private static final SubLList $list346;
  private static final SubLObject $const347$CalendarMonth;
  private static final SubLSymbol $sym348$PPH_ADJUST_MT_TIME_INDEX_GRANULARITY;
  private static final SubLList $list349;
  private static final SubLObject $const350$genWithGloss;
  private static final SubLObject $const351$englishGloss;
  private static final SubLSymbol $sym352$PPH_PHRASE_OUTPUT_LIST_P;
  private static final SubLSymbol $sym353$ASSERTION_OUTPUT_LIST_INFO_P;
  private static final SubLList $list354;
  private static final SubLSymbol $kw355$STRING;
  private static final SubLSymbol $sym356$VALID_CONSTANT_NAME_CHAR_P;
  private static final SubLSymbol $kw357$LIST;
  private static final SubLSymbol $sym358$GENERATE_ROP_EXPRESSION;
  private static final SubLSymbol $kw359$ROP_EXPRESSION;
  private static final SubLObject $const360$ScalarInterval;
  private static final SubLObject $const361$InstanceWithRelationFromFn;
  private static final SubLList $list362;
  private static final SubLSymbol $sym363$PPH_POSSESSIVE_PREDS;
  private static final SubLObject $const364$possessiveRelation;
  private static final SubLSymbol $sym365$_PPH_POSSESSIVE_PREDS_CACHING_STATE_;
  private static final SubLSymbol $sym366$PPH_FIND_POSSESSIVE_SENTENCE;
  private static final SubLInteger $int367$200;
  private static final SubLSymbol $sym368$_POSSESSOR;
  private static final SubLList $list369;
  private static final SubLObject $const370$PossessivePronoun_Pre;
  private static final SubLString $str371$Couldn_t_find_possessor_for__S;
  private static final SubLObject $const372$TheCoordinationSet;
  private static final SubLSymbol $sym373$_POSSESSED;
  private static final SubLList $list374;
  private static final SubLList $list375;
  private static final SubLString $str376$_S_is_an_instance_of__S__so_using;
  private static final SubLList $list377;
  private static final SubLSymbol $sym378$PPH_GENDER_P;
  private static final SubLObject $const379$NLGenderAttribute;
  private static final SubLString $str380$Defaulting_to_English_gender_unif;
  private static final SubLObject $const381$Masculine_NLAttr;
  private static final SubLObject $const382$Feminine_NLAttr;
  private static final SubLObject $const383$Neuter_NLAttr;
  private static final SubLObject $const384$Ungendered_NLAttr;
  private static final SubLObject $const385$Plural_NLAttr;
  private static final SubLObject $const386$Singular_NLAttr;
  private static final SubLObject $const387$ThirdPerson_NLAttr;
  private static final SubLObject $const388$FirstPerson_NLAttr;
  private static final SubLObject $const389$SecondPerson_NLAttr;
  private static final SubLSymbol $sym390$_GENDER;
  private static final SubLObject $const391$languageUsesGrammaticalGender;
  private static final SubLList $list392;
  private static final SubLList $list393;
  private static final SubLString $str394$Couldn_t_find_gender_for__S_in__S;
  private static final SubLList $list395;
  private static final SubLObject $const396$LanguageDialect;
  private static final SubLObject $const397$dialects;
  private static final SubLObject $const398$EnglishLanguage;
  private static final SubLSymbol $sym399$PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE;
  private static final SubLObject $const400$GeneralLexiconMt;
  private static final SubLObject $const401$defaultGrammaticalGender;
  private static final SubLString $str402$pph_number_of_var_guessing_that__;
  private static final SubLObject $const403$Group;
  private static final SubLObject $const404$Agent_Generic;
  private static final SubLObject $const405$ConceptualWorkSeries;
  private static final SubLObject $const406$licensedGrammaticalGender;
  private static final SubLString $str407$Couldn_t_find_a_gender_for__S_in_;
  private static final SubLList $list408;
  private static final SubLSymbol $sym409$SPEC_;
  private static final SubLList $list410;
  private static final SubLList $list411;

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 808L)
  public static SubLObject funcall_pph_method(final SubLObject method_symbol, final SubLObject phrase)
  {
    if( method_symbol.eql( $sym0$GENERATE_CONSTANT_DEFAULT ) )
    {
      return generate_constant_default( phrase );
    }
    if( method_symbol.eql( $sym1$GENERATE_ATOMIC_FORMULA ) )
    {
      return pph_methods_formulas.generate_atomic_formula( phrase );
    }
    if( method_symbol.eql( $sym2$GENERATE_CYCL_LIST ) )
    {
      return generate_cycl_list( phrase );
    }
    if( method_symbol.eql( $sym3$GENERATE_CYCL_VARIABLE ) )
    {
      return generate_cycl_variable( phrase );
    }
    if( method_symbol.eql( $sym4$GENERATE_NART_AS_NAUT ) )
    {
      return generate_nart_as_naut( phrase );
    }
    if( method_symbol.eql( $sym5$GENERATE_NART_LEXIFIED_IMPRECISE ) )
    {
      return generate_nart_lexified_imprecise( phrase );
    }
    if( method_symbol.eql( $sym6$GENERATE_NART_LEXIFIED_TIGHT ) )
    {
      return generate_nart_lexified_tight( phrase );
    }
    if( method_symbol.eql( $sym7$GENERATE_PHRASE_FROM_TEMPLATE ) )
    {
      return pph_methods_formulas.generate_phrase_from_template( phrase );
    }
    if( method_symbol.eql( $sym8$GENERATE_STRING ) )
    {
      return generate_string( phrase );
    }
    return Functions.funcall( method_symbol, phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 1753L)
  public static SubLObject generate_skolem_term_with_name(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject string = generate_skolem_name( cycl_utilities.hl_to_el( v_object ) );
    pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
    if( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw12$HTML && NIL != pph_vars.$pph_italicize_skolems_in_html_modeP$.getDynamicValue( thread ) )
    {
      pph_html.pph_phrase_italicize( phrase );
    }
    pph_phrase.pph_phrase_set_string( phrase, string );
    pph_phrase.pph_phrase_set_agr_pred( phrase, $const13$nameString, UNPROVIDED );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 2349L)
  public static SubLObject clear_generate_skolem_name()
  {
    final SubLObject cs = $generate_skolem_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 2349L)
  public static SubLObject remove_generate_skolem_name(final SubLObject v_object)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $generate_skolem_name_caching_state$.getGlobalValue(), ConsesLow.list( v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 2349L)
  public static SubLObject generate_skolem_name_internal(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_domain_mt$.bind( $const15$InferencePSC, thread );
      final SubLObject isa_col = pph_min_isa( v_object, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = pph_vars.$paraphrase_mode$.currentBinding( thread );
      try
      {
        pph_vars.$paraphrase_mode$.bind( $kw16$TEXT, thread );
        final SubLObject isa_string = isa_col.eql( $const17$Thing ) ? $str18$Object : pph_capitalize_smart( pph_main.pph_phrase_generate_string_from_cycl( isa_col, $list19, UNPROVIDED ) );
        final SubLObject id = dictionary.dictionary_lookup_without_values( $generate_skolem_ids$.getGlobalValue(), isa_string, ONE_INTEGER );
        final SubLObject id_string = string_utilities.str( id );
        dictionary_utilities.dictionary_increment( $generate_skolem_ids$.getGlobalValue(), isa_string, UNPROVIDED );
        ans = Sequences.cconcatenate( isa_string, new SubLObject[] { $str20$_, id_string
        } );
      }
      finally
      {
        pph_vars.$paraphrase_mode$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 2349L)
  public static SubLObject generate_skolem_name(final SubLObject v_object)
  {
    SubLObject caching_state = $generate_skolem_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym14$GENERATE_SKOLEM_NAME, $sym21$_GENERATE_SKOLEM_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( generate_skolem_name_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 3145L)
  public static SubLObject pph_capitalize_smart(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject capitalized = NIL;
    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        capitalized = string_utilities.capitalize_smart( string );
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return capitalized;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 3417L)
  public static SubLObject generate_skolem_term_existentially(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nart = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject string = generate_skolem_term_existentially_int( nart );
    final SubLObject agr_pred = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != string )
    {
      pph_phrase.pph_phrase_set_string( phrase, string );
      pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
      pph_phrase.pph_phrase_set_agr_pred( phrase, agr_pred, UNPROVIDED );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 3864L)
  public static SubLObject generate_skolem_term_existentially_int(final SubLObject skolem_nat)
  {
    final SubLObject coll = pph_skolem_nat_find_type( skolem_nat );
    if( NIL == coll )
    {
      return NIL;
    }
    final SubLObject np_cycl = pph_utilities.pph_np_cycl_for_term_type( coll, $kw23$INDEFINITE, $const24$nonPlural_Generic );
    return pph_main.pph_phrase_generate_string_from_cycl( np_cycl, ConsesLow.list( $const24$nonPlural_Generic ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 4202L)
  public static SubLObject pph_skolem_nat_find_type(final SubLObject skolem_nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject skolem_fn = cycl_utilities.nat_function( skolem_nat );
    SubLObject coll = NIL;
    final SubLObject var = $sym25$_X;
    SubLObject constraint_lits = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = kb_mapping.gather_function_rule_index( skolem_fn, UNPROVIDED, UNPROVIDED );
      SubLObject rule = NIL;
      rule = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cnf = assertions_high.assertion_cnf( rule );
        SubLObject cdolist_list_var_$3;
        final SubLObject toufs = cdolist_list_var_$3 = list_utilities.tree_gather( cnf, $sym26$TOU_ATOMIC_SENTENCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject touf = NIL;
        touf = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          SubLObject current;
          final SubLObject datum = current = cycl_utilities.formula_args( touf, UNPROVIDED );
          SubLObject hl_var = NIL;
          SubLObject naut = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
          hl_var = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
          naut = current.first();
          current = current.rest();
          if( NIL == current )
          {
            cnf = conses_high.subst( naut, hl_var, cnf, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
          }
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          touf = cdolist_list_var_$3.first();
        }
        SubLObject cdolist_list_var_$4 = clauses.pos_lits( cnf );
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL == pph_utilities.tou_atomic_sentenceP( pos_lit ) )
          {
            final SubLObject skolem_naut_from_rule = cycl_utilities.expression_find( skolem_fn, pos_lit, NIL, Symbols.symbol_function( EQ ), $sym28$NAT_FUNCTION );
            if( NIL != skolem_naut_from_rule )
            {
              SubLObject list_var = NIL;
              SubLObject arg = NIL;
              SubLObject n = NIL;
              list_var = cycl_utilities.nat_args( skolem_naut_from_rule, UNPROVIDED );
              arg = list_var.first();
              for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), n = Numbers.add( ONE_INTEGER, n ) )
              {
                pos_lit = conses_high.subst( function_terms.nart_to_naut( cycl_utilities.nat_arg( skolem_nat, number_utilities.f_1X( n ), UNPROVIDED ) ), arg, pos_lit, UNPROVIDED, UNPROVIDED );
              }
              pos_lit = conses_high.subst( var, function_terms.nart_to_naut( skolem_nat ), pos_lit, Symbols.symbol_function( EQUAL ), UNPROVIDED );
              if( NIL == coll && NIL != pph_utilities.pph_var_typing_clauseP( pos_lit, var, UNPROVIDED ) )
              {
                coll = cycl_utilities.formula_arg2( pos_lit, UNPROVIDED );
              }
              else
              {
                constraint_lits = ConsesLow.cons( pos_lit, constraint_lits );
              }
            }
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          pos_lit = cdolist_list_var_$4.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        rule = cdolist_list_var.first();
      }
      if( NIL == coll )
      {
        coll = pph_min_isa( skolem_nat, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject formula = parsing_utilities.make_collection_expression( coll, var, constraint_lits );
    if( NIL != list_utilities.singletonP( constraint_lits ) )
    {
      formula = reformulator_hub.reformulate_cycl( formula, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), $list29 );
    }
    return formula.eql( $const17$Thing ) ? NIL : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 6058L)
  public static SubLObject pph_min_isa(final SubLObject v_term, SubLObject exclude)
  {
    if( exclude == UNPROVIDED )
    {
      exclude = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject best = conses_high.set_difference( isa.min_isa( v_term, UNPROVIDED, UNPROVIDED ), exclude, UNPROVIDED, UNPROVIDED ).first();
      ans = ( ( NIL != best ) ? best : $const17$Thing );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 6368L)
  public static SubLObject arg_type_is_collection_p(final SubLObject pred, final SubLObject arg_pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym30$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const31$EverythingPSC, thread );
      type = kb_accessors.argn_isa( pred, arg_pos, UNPROVIDED ).first();
      if( NIL != type )
      {
        ans = pph_utilities.pph_genlP( type, $const32$Collection, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 6720L)
  public static SubLObject generate_hypothetical(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hypothesized_term = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED );
    final SubLObject name_string_method_result = pph_try_method( $sym36$NAME_STRING_METHOD, hypothesized_term, nl_preds, $kw11$DECENT, pph_utilities.pph_np_category() );
    if( NIL != pph_data_structures.pph_phrase_output_item_loose_p( name_string_method_result ) && NIL != pph_string.pph_string_p( pph_data_structures.pph_phrase_output_item_string( name_string_method_result ) ) )
    {
      pph_phrase.pph_phrase_set_output_list( phrase, ConsesLow.list( name_string_method_result ), UNPROVIDED );
      pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
      pph_phrase.pph_phrase_note_done( phrase );
    }
    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
    {
      final SubLObject hypothetical = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      final SubLObject var = bindings.apply_bindings_backwards( pph_vars.$pph_hypothetical_vars$.getDynamicValue( thread ), hypothetical );
      if( NIL != cycl_variables.el_varP( var ) )
      {
        thread.resetMultipleValues();
        final SubLObject output_list = pph_paraphrase_var_as_var( var, UNPROVIDED, UNPROVIDED );
        final SubLObject pred = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != output_list )
        {
          pph_phrase.pph_phrase_note_done( phrase );
          pph_phrase.pph_phrase_set_output_list( phrase, output_list, UNPROVIDED );
          pph_phrase_set_var_arg_position( var, phrase, UNPROVIDED );
          pph_phrase.pph_phrase_set_agr_pred( phrase, ( NIL != pred ) ? pred : $const37$singular_Generic, UNPROVIDED );
          pph_phrase.pph_phrase_set_cycl( phrase, var );
        }
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 8118L)
  public static SubLObject generate_cycl_variable(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject output_list = ( T.eql( pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue( thread ) ) && ( NIL != pph_phrase.pph_phrase_npP( phrase ) || NIL != pph_phrase_resolution
        .pph_phrase_determinerP( phrase ) || NIL != pph_phrase_resolution.pph_phrase_detpP( phrase ) || NIL == pph_phrase.pph_phrase_category( phrase, UNPROVIDED ) || NIL != pph_variable_handling
            .pph_var_previously_lexifiedP( var ) || ( NIL != pph_phrase.pph_phrase_nbarP( phrase ) && NIL == pph_variable_handling.pph_var_registered_as_defaultP( var ) ) ) && NIL != pph_var_ok_for_lexifyingP( var,
                UNPROVIDED ) ) ? pph_paraphrase_var_with_type( phrase ) : pph_paraphrase_var_as_var( var, T, phrase );
    final SubLObject pred = thread.secondMultipleValue();
    thread.resetMultipleValues();
    pph_phrase.pph_phrase_set_output_list( phrase, output_list, UNPROVIDED );
    pph_phrase_set_var_arg_position( var, phrase, UNPROVIDED );
    if( NIL != pph_phrase.pph_phrase_non_empty_output_list_p( output_list ) )
    {
      pph_phrase.pph_phrase_note_done( phrase );
    }
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      pph_phrase.pph_phrase_set_agr_pred( phrase, ( NIL != pred ) ? pred : $const37$singular_Generic, UNPROVIDED );
    }
    else if( NIL != pph_phrase.pph_phrase_has_dtrsP( phrase ) )
    {
      pph_phrase.pph_phrase_remove_all_dtrs( phrase );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 9185L)
  public static SubLObject pph_phrase_set_var_arg_position(final SubLObject var, final SubLObject phrase, SubLObject map)
  {
    if( map == UNPROVIDED )
    {
      map = pph_phrase.pph_phrase_arg_position_map( phrase );
    }
    final SubLObject var_arg_position = pph_utilities.pph_arg_position_lookup( NIL, map );
    return pph_phrase_set_arg_position_for_cycl( phrase, var, var_arg_position );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 9487L)
  public static SubLObject pph_phrase_set_var_type_arg_positions(final SubLObject phrase, final SubLObject type, final SubLObject type_arg_position_map)
  {
    SubLObject cdolist_list_var = type_arg_position_map;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject from_prefix = NIL;
      SubLObject to_prefix = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      from_prefix = current.first();
      current = ( to_prefix = current.rest() );
      final SubLObject subtype = pph_utilities.pph_dereference_arg_position( type, from_prefix );
      if( NIL != subtype )
      {
        pph_phrase_set_arg_position_for_cycl( phrase, subtype, to_prefix );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 9872L)
  public static SubLObject pph_phrase_set_var_type_arg_position(final SubLObject phrase, final SubLObject type, final SubLObject type_arg_position)
  {
    return pph_phrase_set_arg_position_for_cycl( phrase, type, type_arg_position );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 10081L)
  public static SubLObject pph_phrase_set_arg_position_for_cycl(final SubLObject phrase, final SubLObject cycl, final SubLObject arg_position)
  {
    SubLObject foundP = NIL;
    SubLObject cant_consolidateP = NIL;
    SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list( phrase );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl.equal( pph_data_structures.pph_phrase_output_item_cycl( item ) ) )
      {
        foundP = T;
        pph_data_structures.pph_phrase_output_item_set_arg_position( item, arg_position );
      }
      else if( pph_data_structures.pph_phrase_output_item_html_open_tag( item ).isString() || pph_data_structures.pph_phrase_output_item_html_close_tag( item ).isString() )
      {
        cant_consolidateP = T;
      }
      else if( NIL == pph_phrase.pph_unknown_cycl_p( pph_data_structures.pph_phrase_output_item_cycl( item ) ) && NIL == pph_utilities.pph_unknown_arg_position_p( pph_data_structures.pph_phrase_output_item_arg_position(
          item ) ) )
      {
        cant_consolidateP = T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    if( NIL == foundP && NIL == cant_consolidateP )
    {
      pph_phrase.pph_phrase_consolidate_output_list( phrase, arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      pph_phrase.pph_phrase_set_output_list_cycl( phrase, cycl );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 11199L)
  public static SubLObject pph_var_ok_for_lexifyingP(final SubLObject var, SubLObject require_quantificationP)
  {
    if( require_quantificationP == UNPROVIDED )
    {
      require_quantificationP = T;
    }
    return makeBoolean( NIL == pph_methods_formulas.pph_exceptional_var_p( var ) && NIL == pph_variable_handling.pph_use_explicit_varP( var ) && ( NIL == require_quantificationP || NIL != pph_variable_handling
        .pph_var_quantifiedP( var ) || NIL != pph_variable_handling.pph_query_var_p( var ) ) && NIL == pph_variable_handling.pph_var_paraphrased_explicitlyP( var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 11542L)
  public static SubLObject pph_paraphrase_var_as_var(final SubLObject var, SubLObject consider_quantificationP, SubLObject var_phrase)
  {
    if( consider_quantificationP == UNPROVIDED )
    {
      consider_quantificationP = NIL;
    }
    if( var_phrase == UNPROVIDED )
    {
      var_phrase = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string = ( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw16$TEXT ) ? cycl_variables.el_var_name( var ) : cycl_variables.el_var_name_without_prefix( var );
    SubLObject pos_pred = $const37$singular_Generic;
    pph_phrase.pph_phrase_set_string( var_phrase, string );
    pph_phrase.pph_phrase_set_cycl( var_phrase, var );
    pph_phrase.pph_phrase_set_output_list_cycl( var_phrase, var );
    pph_maybe_italicize_variable_phrase( var_phrase );
    if( NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) )
    {
      SubLObject prefix_items = NIL;
      if( NIL != consider_quantificationP && NIL != pph_vars.$pph_quantify_varsP$.getDynamicValue( thread ) && NIL == pph_variable_handling.pph_var_previously_explicitP( var ) && ( NIL == pph_phrase.pph_phrase_category(
          var_phrase, UNPROVIDED ) || NIL != pph_phrase.pph_phrase_npP( var_phrase ) || NIL != pph_phrase_resolution.pph_phrase_determinerP( var_phrase ) || NIL != pph_phrase_resolution.pph_phrase_detpP( var_phrase ) ) )
      {
        prefix_items = pph_var_phrase_prefix_items( var_phrase, UNPROVIDED );
      }
      if( NIL != pph_utilities.pph_isaP( var, $const32$Collection, UNPROVIDED ) && NIL != pph_phrase.pph_phrase_nbarP( var_phrase ) )
      {
        thread.resetMultipleValues();
        final SubLObject instance_of_item = pph_instance_of_item( pph_phrase.pph_phrase_agr_preds( var_phrase, UNPROVIDED ) );
        final SubLObject instance_of_pos_pred = thread.secondMultipleValue();
        thread.resetMultipleValues();
        prefix_items = ConsesLow.cons( instance_of_item, prefix_items );
        pos_pred = ( ( NIL != instance_of_pos_pred ) ? instance_of_pos_pred : pos_pred );
      }
      pph_phrase.pph_phrase_set_output_list( var_phrase, ConsesLow.append( prefix_items, pph_phrase.pph_phrase_output_list( var_phrase ) ), UNPROVIDED );
    }
    return Values.values( pph_phrase.pph_phrase_output_list( var_phrase ), pos_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 13018L)
  public static SubLObject pph_instance_of_item(final SubLObject agr_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject generated_string = NIL;
    SubLObject pos_pred = $const37$singular_Generic;
    thread.resetMultipleValues();
    final SubLObject generated_string_$5 = pph_methods_lexicon.pph_first_string_of_wordXspeech_part( $const41$Instance_TheWord, $const42$CountNoun, agr_preds, UNPROVIDED );
    final SubLObject pos_pred_$6 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    generated_string = generated_string_$5;
    pos_pred = pos_pred_$6;
    final SubLObject instance_string = ( NIL != generated_string ) ? generated_string : $str43$instance;
    final SubLObject item_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( instance_string ), $str44$_of );
    return Values.values( pph_question.new_pph_phrase_filler_item( item_string ), pos_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 13659L)
  public static SubLObject pph_maybe_italicize_variable_phrase(final SubLObject var_phrase)
  {
    if( NIL != pph_italicize_variablesP() )
    {
      pph_html.pph_phrase_italicize( var_phrase );
    }
    return var_phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 13852L)
  public static SubLObject pph_italicize_variablesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw12$HTML && NIL != pph_vars.$pph_italicize_variables_in_html_modeP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 14018L)
  public static SubLObject pph_var_phrase_prefix_items(final SubLObject var_phrase, SubLObject determiner_type)
  {
    if( determiner_type == UNPROVIDED )
    {
      determiner_type = determiner_type_for_var_phrase( var_phrase );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = pph_phrase.pph_phrase_cycl( var_phrase, UNPROVIDED );
    SubLObject prefix_items = NIL;
    if( NIL != pph_vars.$determiners_before_variables$.getDynamicValue( thread ) )
    {
      final SubLObject pcase_var = determiner_type;
      if( pcase_var.eql( $kw23$INDEFINITE ) )
      {
        if( NIL == var_functional_in_matrix_sentenceP( var ) )
        {
          prefix_items = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str45$some, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
      }
      else if( pcase_var.eql( $kw46$UNIVERSAL ) )
      {
        prefix_items = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str47$every, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      else if( pcase_var.eql( $kw48$NO ) )
      {
        prefix_items = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str49$no, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      else if( pcase_var.eql( $kw50$ANY ) )
      {
        prefix_items = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str51$any, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
    }
    return prefix_items;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 14728L)
  public static SubLObject var_functional_in_matrix_sentenceP(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject matrix_sentence = Sequences.find_if( $sym52$ATOMIC_SENTENCE_, pph_vars.$pph_cycls$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject matrix_arg0 = ( NIL != matrix_sentence ) ? cycl_utilities.sentence_arg0( matrix_sentence ) : NIL;
    final SubLObject functional_args = ( NIL != kb_indexing_datastructures.indexed_term_p( matrix_arg0 ) ) ? cycl_utilities.functional_in_arg_positions( matrix_arg0, UNPROVIDED ) : NIL;
    SubLObject functionalP = NIL;
    if( NIL == functionalP )
    {
      SubLObject csome_list_var = functional_args;
      SubLObject argnum = NIL;
      argnum = csome_list_var.first();
      while ( NIL == functionalP && NIL != csome_list_var)
      {
        if( var.eql( cycl_utilities.atomic_sentence_arg( matrix_sentence, argnum, UNPROVIDED ) ) )
        {
          functionalP = T;
        }
        csome_list_var = csome_list_var.rest();
        argnum = csome_list_var.first();
      }
    }
    return functionalP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 15217L)
  public static SubLObject pph_paraphrase_var_with_type(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject cat = pph_phrase.pph_phrase_category( phrase, UNPROVIDED );
    final SubLObject pred_from_phrase = ( NIL != pph_phrase.pph_phrase_nominalP( phrase ) ) ? pph_phrase.pph_phrase_agr_pred( phrase ) : NIL;
    final SubLObject agr_pred = ( NIL != pred_from_phrase ) ? pred_from_phrase : $const24$nonPlural_Generic;
    final SubLObject type = pph_variable_handling.pph_var_type( var );
    final SubLObject duplicate_typeP = ( NIL != type ) ? pph_variable_handling.pph_duplicate_var_typeP( type ) : NIL;
    final SubLObject previously_paraphrasedP = pph_drs.pph_discourse_referentP( var );
    final SubLObject determiner_type = determiner_type_for_var_phrase( phrase );
    SubLObject paraphrase_pred = NIL;
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str53$__Paraphrasing__S_as__S_in_contex, var, type, pph_vars.$pph_operator_scope_context$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != pph_phrase_resolution.anaphor_needed_for_phraseP( phrase ) && NIL != type && NIL != previously_paraphrasedP && NIL == duplicate_typeP && NIL == lexicon_accessors.nbarP( cat )
        && ( NIL != pph_variable_handling.pph_var_previously_pronounP( var ) || NIL == pph_methods_lexicon.pph_maybe_ambiguous_pronounP( var ) ) )
    {
      final SubLObject olist = pph_methods_lexicon.pph_generate_pronoun( phrase );
      if( NIL != pph_phrase.pph_phrase_non_empty_output_list_p( olist ) )
      {
        pph_phrase.pph_phrase_set_output_list( phrase, olist, UNPROVIDED );
        paraphrase_pred = pph_phrase.pph_phrase_agr_pred( phrase );
        pph_phrase.pph_phrase_note_done( phrase );
      }
    }
    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
    {
      final SubLObject map = pph_phrase.pph_phrase_arg_position_map( phrase );
      final SubLObject var_phrase = pph_lexify_var( var, determiner_type, cat, agr_pred, map, phrase );
      final SubLObject lexified_output_list = ( NIL != pph_phrase.pph_phrase_doneP( var_phrase ) ) ? pph_phrase.pph_phrase_output_list( var_phrase ) : NIL;
      if( NIL != pph_phrase.pph_phrase_non_empty_output_list_p( lexified_output_list ) )
      {
        paraphrase_pred = pph_phrase.pph_phrase_agr_pred( phrase );
        pph_phrase.pph_phrase_copy( var_phrase, phrase, UNPROVIDED );
        pph_phrase.pph_phrase_note_done( phrase );
      }
    }
    return Values.values( ( NIL != pph_phrase.pph_phrase_doneP( phrase ) ) ? pph_phrase.pph_phrase_output_list( phrase ) : NIL, ( NIL != pph_phrase.pph_phrase_doneP( phrase ) ) ? paraphrase_pred : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 17015L)
  public static SubLObject pph_lexify_var(final SubLObject var, final SubLObject determiner_type, final SubLObject category, SubLObject agr_pred, SubLObject map, SubLObject mother)
  {
    if( agr_pred == UNPROVIDED )
    {
      agr_pred = NIL;
    }
    if( map == UNPROVIDED )
    {
      map = pph_utilities.pph_new_identity_map();
    }
    if( mother == UNPROVIDED )
    {
      mother = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mother )
    {
      mother = pph_phrase.new_pph_phrase_for_cycl( var, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject type = pph_var_type_for_lexification( var, T );
    final SubLObject type_map = pph_variable_handling.pph_type_arg_position_map( var );
    final SubLObject nbarP = lexicon_accessors.nbarP( category );
    final SubLObject other_neededP = pph_use_other_for_varP( var );
    final SubLObject det_or_detpP = makeBoolean( NIL != category && ( NIL != pph_utilities.pph_genl_posP( category, $const54$Determiner, UNPROVIDED ) || NIL != pph_utilities.pph_genl_posP( category, $list55,
        UNPROVIDED ) ) );
    final SubLObject cycl_template_fn = ( NIL != nbarP ) ? $sym56$PPH_NBAR_CYCL_TEMPLATE_FOR_TERM_TYPE
        : ( ( NIL != det_or_detpP ) ? $sym57$PPH_DETP_CYCL_TEMPLATE_FOR_TERM_TYPE : $sym58$PPH_NP_CYCL_TEMPLATE_FOR_TERM_TYPE );
    final SubLObject agr_pred_to_use = ( NIL != pph_utilities.pph_genl_pos_predP( agr_pred, $const59$nounStrings, UNPROVIDED ) ) ? agr_pred : $const37$singular_Generic;
    final SubLObject var_phrase_naut = Functions.funcall( cycl_template_fn, type, determiner_type, agr_pred_to_use, other_neededP );
    final SubLObject agr_pred_okP = makeBoolean( NIL == agr_pred || NIL != pph_utilities.pph_filter_preds( ConsesLow.list( agr_pred ), ConsesLow.list( agr_pred_to_use ), UNPROVIDED ) );
    SubLObject var_phrase = NIL;
    if( NIL == agr_pred_okP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str60$Can_t_reconcile__S_with__S, agr_pred, agr_pred_to_use );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    if( NIL != agr_pred_okP )
    {
      SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding( thread );
      try
      {
        pph_vars.$pph_current_arg0$.bind( pph_phrase.pph_unknown_cycl(), thread );
        var_phrase = pph_phrase.pph_phrase_copy( pph_phrase.new_pph_phrase_for_cycl( var_phrase_naut, type_map, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_current_arg0$.rebind( _prev_bind_0, thread );
      }
      pph_phrase.pph_phrase_add_dtr_to_terminal( mother, var_phrase );
      pph_phrase_resolution.pph_phrase_replace_generic_args( var_phrase, type, type_map );
      pph_phrase.pph_phrase_set_category( var_phrase, category, UNPROVIDED );
      _prev_bind_0 = pph_vars.$pph_use_expansions_for_precisionP$.currentBinding( thread );
      try
      {
        pph_vars.$pph_use_expansions_for_precisionP$.bind( NIL, thread );
        pph_phrase_resolution.pph_phrase_get_string( mother, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_use_expansions_for_precisionP$.rebind( _prev_bind_0, thread );
      }
      if( NIL != pph_phrase.pph_phrase_doneP( mother ) )
      {
        pph_variable_handling.pph_update_var_type( var, type );
        if( NIL == other_neededP )
        {
          pph_phrase_maybe_explicitify_var_phrase( var_phrase, var, determiner_type );
        }
        pph_phrase_set_var_type_arg_positions( mother, type, type_map );
        pph_phrase_set_var_arg_position( var, mother, map );
      }
    }
    return mother;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 19168L)
  public static SubLObject pph_use_other_for_varP(final SubLObject var)
  {
    return different_instance_same_typeP( var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 19259L)
  public static SubLObject pph_var_type_for_lexification(final SubLObject var, SubLObject use_registered_type_directlyP)
  {
    if( use_registered_type_directlyP == UNPROVIDED )
    {
      use_registered_type_directlyP = makeBoolean( NIL != pph_utilities.pph_top_level_preciseP() || NIL != pph_vars.pph_inside_negation_scope_p() );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject registered_type = pph_variable_handling.pph_var_type( var );
    final SubLObject quantification = pph_variable_handling.pph_var_quantifier( var );
    return ( NIL != use_registered_type_directlyP ) ? registered_type : pph_var_type_for_lexification_internal( registered_type, quantification, pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 19710L)
  public static SubLObject pph_var_type_for_lexification_internal(final SubLObject registered_type, final SubLObject quantification, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type_for_lexification = registered_type;
    final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
      if( NIL != pph_utilities.pph_isaP( registered_type, $const61$FacetingCollectionType, UNPROVIDED ) )
      {
        final SubLObject type_genlss = list_utilities.remove_subsumed_items( pph_utilities.pph_ask_variable_new( $sym62$_TG, ConsesLow.listS( $const63$typeGenls, registered_type, $list64 ), UNPROVIDED, UNPROVIDED ),
            $sym65$PPH_GENL_, UNPROVIDED );
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var = type_genlss;
          SubLObject type_genls = NIL;
          type_genls = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL == pph_highly_faceted_typeP( type_genls ) )
            {
              type_for_lexification = pph_utilities.pph_make_type_level( type_genls );
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            type_genls = csome_list_var.first();
          }
        }
      }
      else if( quantification == $kw66$EXISTENTIAL && NIL == cycl_variables.el_varP( registered_type ) && NIL == pph_utilities.pph_top_level_preciseP() )
      {
        final SubLObject salient_generalization = pph_utilities.pph_salient_generalization( registered_type, domain_mt, NIL );
        type_for_lexification = ( ( NIL != salient_generalization ) ? salient_generalization : registered_type );
      }
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_0, thread );
    }
    return type_for_lexification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 20825L)
  public static SubLObject pph_highly_faceted_typeP(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject count = ZERO_INTEGER;
    if( NIL != subl_promotions.positive_integer_p( $pph_facet_threshold$.getDynamicValue( thread ) ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
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
          final SubLObject node_var = $const63$typeGenls;
          final SubLObject deck_type = $kw69$QUEUE;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          SubLObject node_and_predicate_mode = NIL;
          final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = $const70$True_JustificationTruth;
              final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw72$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw75$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str76$continue_anyway, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw77$WARN ) )
                  {
                    Errors.warn( $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str76$continue_anyway, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const63$typeGenls, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const79$genlPreds ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                      for( node_and_predicate_mode = ConsesLow.list( $const63$typeGenls, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == ans; node_and_predicate_mode = deck.deck_pop(
                          recur_deck ) )
                      {
                        final SubLObject node_var_$16 = node_and_predicate_mode.first();
                        final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                        final SubLObject pred = node_var_$16;
                        final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                          final SubLObject inverseP = predicate_mode;
                          final SubLObject argnum = ( NIL != inverseP ) ? ONE_INTEGER : TWO_INTEGER;
                          final SubLObject facet_types = kb_mapping_utilities.pred_values_in_relevant_mts( type, pred, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), argnum, Numbers.subtract( THREE_INTEGER,
                              argnum ), UNPROVIDED );
                          if( NIL == ans )
                          {
                            SubLObject csome_list_var = facet_types;
                            SubLObject facet_type = NIL;
                            facet_type = csome_list_var.first();
                            while ( NIL == ans && NIL != csome_list_var)
                            {
                              if( NIL != pph_utilities.pph_isaP( facet_type, $const61$FacetingCollectionType, UNPROVIDED ) )
                              {
                                count = Numbers.add( count, ONE_INTEGER );
                                if( count.numGE( $pph_facet_threshold$.getDynamicValue( thread ) ) )
                                {
                                  ans = T;
                                  if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                                  {
                                    Errors.warn( $str80$Skipping__S_as_too_highly_faceted, type, $pph_facet_threshold$.getDynamicValue( thread ) );
                                    streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                                  }
                                }
                              }
                              csome_list_var = csome_list_var.rest();
                              facet_type = csome_list_var.first();
                            }
                          }
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$12;
                          SubLObject _prev_bind_1_$12;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$13;
                          SubLObject iteration_state_$21;
                          SubLObject tv;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$14;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var2;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list;
                          SubLObject rest_$23;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$15;
                          SubLObject sol2;
                          SubLObject link_nodes2;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var3;
                          SubLObject node_vars_link_node4;
                          for( rest = NIL, rest = accessible_modules; NIL == ans && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( node_var_$16 );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == ans && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                      {
                                        _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                          for( iteration_state_$21 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == ans && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$21 ); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next( iteration_state_$21 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$21 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == ans )
                                                  {
                                                    csome_list_var2 = sol;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var2.first();
                                                    while ( NIL == ans && NIL != csome_list_var2)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                        deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                      }
                                                      csome_list_var2 = csome_list_var2.rest();
                                                      node_vars_link_node2 = csome_list_var2.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str81$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$14, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$21 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$13, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str82$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$23 = NIL, rest_$23 = new_list; NIL == ans && NIL != rest_$23; rest_$23 = rest_$23.rest() )
                                {
                                  generating_fn = rest_$23.first();
                                  _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == ans )
                                      {
                                        csome_list_var3 = sol2;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var3.first();
                                        while ( NIL == ans && NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                            deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          node_vars_link_node4 = csome_list_var3.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str81$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$15, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$12, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$12, thread );
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$11, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$13, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$11, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$10, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, $const63$typeGenls, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                        UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$12, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$10, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$9, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$9, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$8, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$7, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 21548L)
  public static SubLObject pph_var_arg_position_map(final SubLObject arg_position)
  {
    final SubLObject template = pph_utilities.pph_cycl_template_from_arg_position( arg_position );
    return pph_utilities.pph_figure_new_arg_position_map( pph_utilities.pph_new_identity_map(), template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 21838L)
  public static SubLObject determiner_type_for_var_phrase(final SubLObject var_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = pph_phrase.pph_phrase_cycl( var_phrase, UNPROVIDED );
    final SubLObject npi_licensor = pph_npi_licensor( var_phrase );
    if( ONE_INTEGER.numE( pph_drs.pph_count_previous_paraphrases( var ) ) )
    {
      return $kw84$BACKREFERENCE_CLASSB;
    }
    if( NIL != pph_drs.pph_discourse_rm_lookup( var ) )
    {
      return $kw85$DEFINITE;
    }
    if( NIL != pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue( thread ) && NIL != pph_variable_handling.pph_query_var_p( var ) )
    {
      return $kw86$WHAT;
    }
    if( NIL != npi_licensor && NIL != pph_vars.unexpressed_negationP( npi_licensor ) )
    {
      pph_vars.note_unexpressed_negation_expressed( npi_licensor, $sym87$DETERMINER_TYPE_FOR_VAR_PHRASE );
      return $kw48$NO;
    }
    if( NIL != npi_licensor || ( NIL != pph_var_phrase_var_bound_by_universal_introductionP( var_phrase ) && NIL != pph_var_phrase_in_if_clauseP( var_phrase ) ) )
    {
      final SubLObject only_referenceP = pph_phrase.pph_sole_reference_p( var_phrase, var );
      return ( NIL != only_referenceP ) ? $kw50$ANY : $kw23$INDEFINITE;
    }
    if( pph_variable_handling.pph_var_quantifier( var ) == $kw46$UNIVERSAL )
    {
      return $kw46$UNIVERSAL;
    }
    return $kw23$INDEFINITE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 22783L)
  public static SubLObject pph_var_phrase_var_bound_by_universal_introductionP(final SubLObject var_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = pph_phrase.pph_phrase_cycl( var_phrase, UNPROVIDED );
    for( SubLObject mother = pph_phrase.pph_phrase_mother( var_phrase ); NIL != pph_phrase.pph_phrase_p( mother, UNPROVIDED ); mother = pph_phrase.pph_phrase_mother( mother ) )
    {
      SubLObject cdolist_list_var = pph_phrase.pph_phrase_justification( mother );
      SubLObject just = NIL;
      just = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern( just, $list88 );
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject vars = list_utilities.alist_lookup_without_values( v_bindings, $sym89$VARS, UNPROVIDED, UNPROVIDED );
          if( NIL != subl_promotions.memberP( var, vars, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str90$Bound_by_universal_introduction__, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            return T;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        just = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 23300L)
  public static SubLObject pph_var_phrase_in_if_clauseP(final SubLObject var_phrase)
  {
    if( NIL == pph_utilities.pph_english_contextP( UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject var_dtr = var_phrase;
    for( SubLObject test_phrase = pph_phrase.pph_phrase_mother( var_phrase ); NIL != pph_phrase.pph_phrase_p( test_phrase, UNPROVIDED ); test_phrase = pph_phrase.pph_phrase_mother( test_phrase ) )
    {
      SubLObject state = $kw91$START;
      SubLObject dtr_num = ZERO_INTEGER;
      if( document.sign_constituents( test_phrase ).isVector() )
      {
        final SubLObject vector_var = document.sign_constituents( test_phrase );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject dtr;
        SubLObject pcase_var;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          dtr = Vectors.aref( vector_var, element_num );
          pcase_var = state;
          if( pcase_var.eql( $kw91$START ) )
          {
            if( NIL != pph_phrase.pph_phrase_doneP( dtr ) && pph_phrase.pph_phrase_string( dtr, UNPROVIDED ).equalp( $str92$if ) )
            {
              state = $kw93$FOUND_IF;
            }
          }
          else if( pcase_var.eql( $kw93$FOUND_IF ) )
          {
            if( dtr.eql( var_dtr ) )
            {
              state = $kw94$FOUND_VAR_DTR;
            }
          }
          else if( pcase_var.eql( $kw94$FOUND_VAR_DTR ) && NIL != pph_phrase.pph_phrase_doneP( dtr ) && pph_phrase.pph_phrase_string( dtr, UNPROVIDED ).equalp( $str95$_ ) )
          {
            return T;
          }
          dtr_num = Numbers.add( dtr_num, ONE_INTEGER );
        }
      }
      var_dtr = test_phrase;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 24079L)
  public static SubLObject pph_npi_licensor(final SubLObject var_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = pph_phrase.pph_phrase_cycl( var_phrase, UNPROVIDED );
    final SubLObject arg_position = pph_phrase.pph_phrase_arg_position( var_phrase );
    final SubLObject top_level_cycl = pph_vars.pph_top_level_cycl();
    if( NIL == el_utilities.el_formula_p( top_level_cycl ) )
    {
      return NIL;
    }
    final SubLObject arg_position_cycl = ( NIL != pph_utilities.pph_known_arg_position_p( arg_position ) ) ? cycl_utilities.formula_arg_position( top_level_cycl, arg_position, UNPROVIDED ) : top_level_cycl;
    if( !arg_position_cycl.equal( var ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str96$Arg_position__S_applied_to_top_le, new SubLObject[] { arg_position, pph_vars.pph_top_level_cycl(), var, arg_position_cycl, pph_vars.$pph_cycls$.getDynamicValue( thread )
        } );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
      return NIL;
    }
    return pph_npi_licensor_int( var, arg_position, top_level_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 24850L)
  public static SubLObject pph_npi_licensor_int(final SubLObject var, final SubLObject arg_position, final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_position = NIL;
    SubLObject remaining_arg_position = arg_position;
    SubLObject nonveridical_op = NIL;
    SubLObject quantifier_existentialP = NIL;
    SubLObject quantifier_universalP = NIL;
    if( NIL != conses_high.member( var, obsolete.formula_free_variables( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
    {
      quantifier_universalP = T;
    }
    while ( NIL != remaining_arg_position)
    {
      final SubLObject current_cycl = cycl_utilities.formula_arg_position( cycl, current_position, UNPROVIDED );
      final SubLObject current_arg0 = cycl_utilities.formula_arg0( current_cycl );
      if( var.equal( cycl_utilities.formula_arg1( current_cycl, UNPROVIDED ) ) )
      {
        if( current_arg0.equal( $const97$thereExists ) )
        {
          quantifier_existentialP = T;
          if( NIL != nonveridical_op )
          {
            return nonveridical_op;
          }
        }
        else if( current_arg0.equal( $const98$forAll ) )
        {
          quantifier_universalP = T;
        }
      }
      if( remaining_arg_position.first().equal( pph_operator_downward_entailing_in_which_arg( current_arg0 ) ) )
      {
        if( NIL != quantifier_universalP )
        {
          return ConsesLow.append( current_position, ConsesLow.list( ZERO_INTEGER ) );
        }
        nonveridical_op = ConsesLow.append( current_position, ConsesLow.list( ZERO_INTEGER ) );
      }
      current_position = ConsesLow.append( current_position, ConsesLow.list( remaining_arg_position.first() ) );
      remaining_arg_position = remaining_arg_position.rest();
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str99$Var__S_at_arg_position__S_in_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == quantifier_existentialP && NIL == quantifier_universalP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str100$Quantifier_for_var__S_not_found_i );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 26244L)
  public static SubLObject pph_downward_entailing_operator_p(final SubLObject reln)
  {
    return subl_promotions.memberP( reln, $list101, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 26365L)
  public static SubLObject pph_operator_downward_entailing_in_which_arg(final SubLObject reln)
  {
    return ( NIL != pph_downward_entailing_operator_p( reln ) ) ? ONE_INTEGER : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 26496L)
  public static SubLObject pph_phrase_maybe_add_disambiguation(final SubLObject var, final SubLObject var_phrase, final SubLObject determiner_type)
  {
    final SubLObject otherP = pph_phrase_maybe_add_other( var, var_phrase );
    if( NIL == otherP )
    {
      pph_phrase_maybe_explicitify_var_phrase( var_phrase, var, determiner_type );
    }
    return pph_phrase.pph_phrase_output_list( var_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 26857L)
  public static SubLObject pph_phrase_maybe_add_other(final SubLObject var, final SubLObject var_phrase)
  {
    if( NIL != different_instance_same_typeP( var ) )
    {
      return pph_phrase_add_other( var_phrase );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 27170L)
  public static SubLObject different_instance_same_typeP(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject duplicateP = NIL;
    final SubLObject strictP = makeBoolean( NIL == $pph_assume_distinct_vars_require_different_bindingsP$.getDynamicValue( thread ) );
    if( ( NIL == pph_drs.pph_discourse_referentP( var ) || NIL != pph_variable_handling.pph_var_previously_paraphrased_with_otherP( var ) ) && NIL == duplicateP )
    {
      SubLObject csome_list_var = pph_variable_handling.pph_other_vars_with_var_type( var );
      SubLObject other_var = NIL;
      other_var = csome_list_var.first();
      while ( NIL == duplicateP && NIL != csome_list_var)
      {
        if( NIL != pph_drs.pph_discourse_referentP( other_var ) && NIL != pph_variable_handling.pph_different_varsP( var, other_var, strictP ) )
        {
          duplicateP = T;
        }
        csome_list_var = csome_list_var.rest();
        other_var = csome_list_var.first();
      }
    }
    return duplicateP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 27694L)
  public static SubLObject pph_phrase_add_other(final SubLObject var_phrase)
  {
    if( NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) )
    {
      pph_phrase_add_english_other( var_phrase );
    }
    return pph_phrase.pph_phrase_output_list( var_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 27869L)
  public static SubLObject pph_phrase_add_english_other(final SubLObject var_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject np_olist = pph_phrase.pph_phrase_output_list( var_phrase );
    thread.resetMultipleValues();
    final SubLObject det_olist = split_english_determiner_off( np_olist );
    final SubLObject nbar_olist = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject new_olist = pph_add_english_other_to_olists( det_olist, nbar_olist );
    pph_phrase.pph_phrase_set_output_list( var_phrase, new_olist, UNPROVIDED );
    return pph_phrase.pph_phrase_output_list( var_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 28300L)
  public static SubLObject split_english_determiner_off(final SubLObject np_olist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject first_item = NIL;
    SubLObject rest_items = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( np_olist, np_olist, $list102 );
    first_item = np_olist.first();
    final SubLObject current = rest_items = np_olist.rest();
    thread.resetMultipleValues();
    final SubLObject maybe_det_string = pph_utilities.pph_first_word( pph_data_structures.pph_phrase_output_item_string( first_item ), UNPROVIDED );
    final SubLObject rest_of_first_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject np_string = pph_phrase.pph_phrase_output_list_string( np_olist, NIL );
    SubLObject det_olist = NIL;
    SubLObject nbar_olist = NIL;
    if( NIL != pph_utilities.determiner_stringP( maybe_det_string ) )
    {
      if( NIL != string_utilities.non_empty_stringP( rest_of_first_string ) )
      {
        pph_data_structures.pph_phrase_output_item_set_string( first_item, maybe_det_string );
        final SubLObject rest_item = pph_data_structures.pph_phrase_output_item_copy( first_item );
        pph_data_structures.pph_phrase_output_item_set_string( rest_item, rest_of_first_string );
        rest_items = ConsesLow.cons( rest_item, rest_items );
      }
      det_olist = ConsesLow.list( first_item );
      nbar_olist = rest_items;
    }
    else if( NIL != Strings.string_equal( np_string, $str103$it, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      det_olist = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str104$the, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      nbar_olist = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str105$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else if( NIL != Strings.string_equal( np_string, $str106$something, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      det_olist = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str45$some, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      nbar_olist = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str105$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else if( NIL != Strings.string_equal( np_string, $str107$everything, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      det_olist = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str47$every, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      nbar_olist = ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( $str105$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      nbar_olist = np_olist;
    }
    return Values.values( det_olist, nbar_olist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 29746L)
  public static SubLObject pph_add_english_other_to_olists(final SubLObject det_olist, final SubLObject nbar_olist)
  {
    if( NIL == det_olist )
    {
      return nbar_olist;
    }
    final SubLObject other_item = pph_question.new_pph_phrase_filler_item( $str108$other );
    if( NIL != pph_utilities.indefinite_determiner_stringP( pph_phrase.pph_phrase_output_list_string( det_olist, UNPROVIDED ) ) )
    {
      pph_data_structures.pph_phrase_output_item_set_string( other_item, $str109$another );
      return ConsesLow.cons( other_item, nbar_olist );
    }
    return ConsesLow.append( det_olist, ConsesLow.cons( other_item, nbar_olist ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 30252L)
  public static SubLObject pph_phrase_maybe_explicitify_var_phrase(final SubLObject var_phrase, final SubLObject var, final SubLObject determiner_type)
  {
    final SubLObject category = pph_phrase.pph_phrase_category( var_phrase, UNPROVIDED );
    if( NIL == pph_utilities.pph_genl_posP( category, $const54$Determiner, UNPROVIDED ) && NIL == pph_utilities.pph_genl_posP( category, $list55, UNPROVIDED ) && ( NIL != pph_variable_handling.pph_use_explicit_varP(
        var ) || ( NIL != different_instance_same_typeP( var ) && NIL == pph_phrase.pph_sole_reference_p( var_phrase, var ) ) ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str110$Explicitifying__S, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      pph_phrase_explicitify_var_phrase( var_phrase, var, determiner_type );
    }
    return pph_phrase.pph_phrase_output_list( var_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 30929L)
  public static SubLObject pph_phrase_explicitify_var_phrase(final SubLObject var_phrase, final SubLObject var, final SubLObject determiner_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type_output_items = pph_phrase.pph_phrase_output_list( var_phrase );
    final SubLObject var_output_items = pph_paraphrase_var_as_var( var, UNPROVIDED, UNPROVIDED );
    final SubLObject skip_type_info_for_existential_default_type_varsP = NIL;
    SubLObject new_list = NIL;
    thread.resetMultipleValues();
    final SubLObject det_olist = split_english_determiner_off( type_output_items );
    final SubLObject nbar_olist = thread.secondMultipleValue();
    thread.resetMultipleValues();
    type_output_items = ConsesLow.append( det_olist, nbar_olist );
    if( NIL != pph_variable_handling.pph_var_previously_explicitP( var ) )
    {
      new_list = var_output_items;
    }
    else if( NIL != skip_type_info_for_existential_default_type_varsP && NIL != pph_variable_handling.pph_var_registered_as_defaultP( var ) && pph_variable_handling.pph_var_quantifier( var ) == $kw66$EXISTENTIAL )
    {
      new_list = var_output_items;
    }
    else if( NIL != pph_variable_handling.pph_var_registered_as_defaultP( var ) && NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) )
    {
      final SubLObject var_prefix_items = pph_var_phrase_prefix_items( var_phrase, determiner_type );
      final SubLObject prefix_items = ( NIL != var_prefix_items ) ? var_prefix_items : type_output_items;
      new_list = ConsesLow.append( prefix_items, var_output_items );
    }
    else
    {
      new_list = ConsesLow.append( type_output_items, var_output_items );
    }
    pph_phrase.pph_phrase_set_output_list( var_phrase, new_list, UNPROVIDED );
    return pph_phrase.pph_phrase_output_list( var_phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 32366L)
  public static SubLObject generate_keyword(final SubLObject phrase)
  {
    pph_phrase.pph_phrase_set_string( phrase, pph_utilities.add_quotes_smart( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) );
    pph_phrase.pph_phrase_set_agr_pred( phrase, $const24$nonPlural_Generic, UNPROVIDED );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 32631L)
  public static SubLObject generate_cycl_symbol(final SubLObject phrase)
  {
    pph_phrase.pph_phrase_set_string( phrase, Sequences.cconcatenate( $str115$the_SubL_symbol_, format_nil.format_nil_a_no_copy( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 32870L)
  public static SubLObject generate_non_cycl_symbol(final SubLObject phrase)
  {
    pph_phrase.pph_phrase_set_string( phrase, Sequences.cconcatenate( $str118$the_symbol_, format_nil.format_nil_a_no_copy( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 33141L)
  public static SubLObject generate_constant_default(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
    {
      SubLObject pred = NIL;
      final SubLObject v_term = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      if( NIL != pph_utilities.pph_top_level_preciseP() )
      {
        final SubLObject scientific_name_item = pph_try_method( $sym120$SCIENTIFIC_NAME_METHOD, v_term, $kw50$ANY, $kw121$PRECISE, pph_utilities.pph_np_category() );
        if( NIL != pph_data_structures.pph_phrase_output_item_loose_p( scientific_name_item ) )
        {
          pph_phrase.pph_phrase_set_output_list( phrase, ConsesLow.list( scientific_name_item ), UNPROVIDED );
          pred = pph_data_structures.pph_phrase_output_item_agr_pred( scientific_name_item );
          pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
          pph_phrase.pph_phrase_note_done( phrase );
        }
      }
      if( NIL != pred )
      {
        pph_phrase.pph_phrase_set_agr_pred( phrase, pred, UNPROVIDED );
      }
      else
      {
        SubLObject new_rms = NIL;
        if( NIL != pph_utilities.pph_top_level_preciseP() )
        {
          final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms( UNPROVIDED );
          final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding( thread );
          try
          {
            pph_vars.$pph_discourse_context$.bind( pph_drs.pph_discourse_context_copy(), thread );
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str122$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            select_string_method( phrase, $kw121$PRECISE );
            new_rms = pph_macros.note_leaving_shadowed_discourse_context( pph_vars.$pph_discourse_context$.getDynamicValue( thread ), matrix_rms );
          }
          finally
          {
            pph_vars.$pph_discourse_context$.rebind( _prev_bind_0, thread );
          }
        }
        if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
        {
          final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms( UNPROVIDED );
          final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding( thread );
          try
          {
            pph_vars.$pph_discourse_context$.bind( pph_drs.pph_discourse_context_copy(), thread );
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str122$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            select_string_method( phrase, $kw123$GOOD );
            new_rms = pph_macros.note_leaving_shadowed_discourse_context( pph_vars.$pph_discourse_context$.getDynamicValue( thread ), matrix_rms );
          }
          finally
          {
            pph_vars.$pph_discourse_context$.rebind( _prev_bind_0, thread );
          }
        }
        if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
        {
          pph_drs.pph_ensure_rms_are_in_discourse_context( new_rms );
        }
        else
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str124$__GENERATE_CONSTANT_DEFAULT__Tryi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          select_string_method( phrase, $kw50$ANY );
        }
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 34521L)
  public static SubLObject generate_lexical_word(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject wu_name = constants_high.constant_name( word );
    SubLObject base_form = string_utilities.post_remove( string_utilities.post_remove( wu_name, $str127$_TheWord, UNPROVIDED ), $str128$_MWW, UNPROVIDED );
    base_form = string_utilities.pre_remove( base_form, $str129$RKF_, UNPROVIDED );
    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL == lexicon_accessors.names_from_spelling( base_form, UNPROVIDED, UNPROVIDED ) && NIL == genls.any_specP( $const130$ProperNoun, lexicon_accessors.pos_of_word( word, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          base_form = string_utilities.downcase_leading( base_form );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    final SubLObject paraphrase = Sequences.cconcatenate( $str131$the_word_, pph_utilities.add_quotes_smart( base_form ) );
    pph_phrase.pph_phrase_set_string( phrase, paraphrase );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 35230L)
  public static SubLObject generate_chemical_substance_type(final SubLObject phrase)
  {
    final SubLObject substance_type = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject output_items = do_generate_chemical_substance_type( substance_type );
    if( NIL != output_items )
    {
      final SubLObject composite_item = output_items.first();
      final SubLObject map = pph_phrase.pph_phrase_arg_position_map( phrase );
      final SubLObject arg_position = pph_utilities.pph_top_level_arg_position( map );
      pph_data_structures.pph_phrase_output_item_set_cycl( composite_item, substance_type );
      pph_data_structures.pph_phrase_output_item_set_arg_position( composite_item, arg_position );
      pph_phrase.pph_phrase_set_output_list( phrase, ConsesLow.list( composite_item ), UNPROVIDED );
      pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
      pph_phrase.pph_phrase_note_done( phrase );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 36084L)
  public static SubLObject do_generate_chemical_substance_type(final SubLObject substance_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject olist = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject formula_string = kb_mapping_utilities.fpred_value_in_relevant_mts( substance_type, $const132$chemicalFormulaString, pph_vars.$pph_language_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      if( NIL != formula_string )
      {
        olist = generate_chemical_substance_type_from_formula_string( substance_type, pph_string.pph_string_from_cycl_string( formula_string ) );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return olist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 36513L)
  public static SubLObject generate_chemical_substance_type_from_formula_string(final SubLObject substance_type, final SubLObject formula_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_string.pph_string_p( formula_string ) )
    {
      SubLObject output_items = NIL;
      if( $kw12$HTML == pph_vars.$paraphrase_mode$.getDynamicValue( thread ) )
      {
        output_items = pph_chemical_formula_html_output_items( formula_string );
      }
      else
      {
        output_items = pph_phrase.new_pph_phrase_output_list( formula_string, NIL, NIL, $const132$chemicalFormulaString );
      }
      if( NIL != output_items )
      {
        final SubLObject composite_item = pph_data_structures.new_pph_phrase_output_item_nospace_group( output_items );
        pph_data_structures.pph_phrase_output_item_set_cycl( composite_item, substance_type );
        pph_data_structures.pph_phrase_output_item_set_agr_pred( composite_item, $const132$chemicalFormulaString );
        return ConsesLow.list( composite_item );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 37214L)
  public static SubLObject pph_chemical_formula_html_output_items(final SubLObject formula_string)
  {
    SubLObject curr_string_chars = NIL;
    SubLObject in_subscriptP = NIL;
    SubLObject in_superscriptP = NIL;
    SubLObject output_items = NIL;
    for( SubLObject sequence_var = formula_string, end_index = sequence_var.isList() ? NIL : Sequences.length( sequence_var ), char_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( char_num,
        end_index, sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( char_num, end_index, sequence_var ) )
    {
      final SubLObject item = subl_macros.do_sequence_index_valueP( char_num, sequence_var );
      if( !char_num.isInteger() || !char_num.numL( ZERO_INTEGER ) )
      {
        if( !NIL.isInteger() || !char_num.isInteger() || !char_num.numGE( NIL ) )
        {
          final SubLObject v_char = item.isChar() ? item : pph_string.pph_code_char( item );
          if( !v_char.isInteger() && NIL == Characters.digit_char_p( v_char, UNPROVIDED ) && NIL != in_subscriptP )
          {
            final SubLObject curr_string = pph_string.pph_string_from_char_list( Sequences.nreverse( curr_string_chars ) );
            final SubLObject new_item = pph_question.new_pph_phrase_filler_item( curr_string );
            pph_html.pph_phrase_output_item_subscript( new_item );
            output_items = ConsesLow.cons( new_item, output_items );
            curr_string_chars = NIL;
            in_subscriptP = NIL;
          }
          if( v_char.isInteger() )
          {
            curr_string_chars = ConsesLow.cons( v_char, curr_string_chars );
          }
          else if( !Characters.CHAR_space.eql( v_char ) )
          {
            if( NIL != in_superscriptP && NIL != pph_string.pph_char_E( v_char, Characters.CHAR_rparen ) )
            {
              final SubLObject curr_string = pph_string.pph_string_from_char_list( Sequences.nreverse( curr_string_chars ) );
              final SubLObject new_item = pph_question.new_pph_phrase_filler_item( curr_string );
              pph_html.pph_phrase_output_item_superscript( new_item );
              output_items = ConsesLow.cons( new_item, output_items );
              curr_string_chars = NIL;
              in_superscriptP = NIL;
            }
            else if( NIL == in_subscriptP && NIL == in_superscriptP && NIL != Characters.digit_char_p( v_char, UNPROVIDED ) )
            {
              if( NIL != curr_string_chars )
              {
                final SubLObject curr_string = pph_string.pph_string_from_char_list( Sequences.nreverse( curr_string_chars ) );
                output_items = ConsesLow.cons( pph_question.new_pph_phrase_filler_item( curr_string ), output_items );
              }
              curr_string_chars = ConsesLow.list( v_char );
              in_subscriptP = T;
            }
            else if( NIL == in_superscriptP && NIL != pph_string.pph_char_E( v_char, Characters.CHAR_lparen ) && NIL == Characters.alpha_char_p( Strings.sublisp_char( formula_string, number_utilities.f_1X(
                char_num ) ) ) )
            {
              if( NIL != curr_string_chars )
              {
                final SubLObject curr_string = pph_string.pph_string_from_char_list( Sequences.nreverse( curr_string_chars ) );
                output_items = ConsesLow.cons( pph_question.new_pph_phrase_filler_item( curr_string ), output_items );
              }
              curr_string_chars = NIL;
              in_superscriptP = T;
            }
            else
            {
              curr_string_chars = ConsesLow.cons( v_char, curr_string_chars );
            }
          }
        }
      }
      sequence_var = subl_macros.do_sequence_index_update( sequence_var );
      char_num = Numbers.add( char_num, ONE_INTEGER );
    }
    if( NIL != curr_string_chars )
    {
      final SubLObject curr_string2 = pph_string.pph_string_from_char_list( Sequences.nreverse( curr_string_chars ) );
      final SubLObject item_arg_position = pph_utilities.pph_unknown_arg_position();
      final SubLObject item_cycl = ( NIL == output_items ) ? pph_phrase.pph_unknown_cycl() : pph_phrase.pph_empty_cycl();
      final SubLObject final_item = pph_data_structures.new_pph_phrase_output_item( curr_string2, item_arg_position, item_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != in_subscriptP )
      {
        pph_html.pph_phrase_output_item_subscript( final_item );
      }
      output_items = ConsesLow.cons( final_item, output_items );
    }
    return Sequences.nreverse( output_items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 39906L)
  public static SubLObject do_generate_chemical_substance_type_semantic(final SubLObject substance_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject atomic_composition_lists = pph_chemical_composition( substance_type );
    SubLObject abortP = Types.sublisp_null( atomic_composition_lists );
    SubLObject output_items = NIL;
    if( NIL == abortP )
    {
      SubLObject current;
      final SubLObject datum = current = atomic_composition_lists;
      SubLObject element_list = NIL;
      SubLObject quantity_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
      element_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
      quantity_list = current.first();
      current = current.rest();
      if( NIL == current )
      {
        output_items = ConsesLow.list( pph_phrase_resolution.pph_output_item_from_atomic_composition_lists( element_list, quantity_list ) );
        abortP = Types.sublisp_null( output_items );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list133 );
      }
      if( NIL == abortP )
      {
        final SubLObject charge = pph_electrical_charge_of_substance_type( substance_type );
        if( NIL != narts_high.naut_p( charge ) && cycl_utilities.nat_functor( charge ).eql( $const134$ElectronicCharge ) )
        {
          final SubLObject charge_value = cycl_utilities.nat_arg1( charge, UNPROVIDED );
          final SubLObject charge_item = pph_data_structures.new_pph_phrase_output_item( print_high.princ_to_string( charge_value ), NIL, charge_value, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw12$HTML )
          {
            pph_html.pph_phrase_output_item_superscript( charge_item );
          }
          output_items = ConsesLow.cons( charge_item, output_items );
        }
      }
    }
    if( NIL == abortP && NIL != output_items )
    {
      final SubLObject composite_item = pph_data_structures.new_pph_phrase_output_item_nospace_group( Sequences.nreverse( output_items ) );
      pph_data_structures.pph_phrase_output_item_set_cycl( composite_item, substance_type );
      pph_data_structures.pph_phrase_output_item_set_agr_pred( composite_item, $const132$chemicalFormulaString );
      return composite_item;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 41179L)
  public static SubLObject pph_chemical_composition(final SubLObject substance_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != formula_pattern_match.formula_matches_pattern( function_terms.nart_to_naut( substance_type ), $list135 ) )
    {
      return reader.bq_cons( ConsesLow.list( $const136$TheList, cycl_utilities.nat_arg1( substance_type, UNPROVIDED ) ), $list137 );
    }
    return pph_utilities.pph_ask_template( $list138, ConsesLow.listS( $const139$completeAtomicComposition_List, substance_type, $list138 ), pph_vars.$pph_domain_mt$.getDynamicValue( thread ), NIL, ONE_INTEGER ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 41677L)
  public static SubLObject pph_electrical_charge_of_substance_type(final SubLObject substance_type)
  {
    SubLObject charge = NIL;
    if( NIL == charge )
    {
      SubLObject csome_list_var = pph_molecule_types( substance_type );
      SubLObject molecule_type = NIL;
      molecule_type = csome_list_var.first();
      while ( NIL == charge && NIL != csome_list_var)
      {
        final SubLObject molecule = el_utilities.make_unary_formula( $const140$SomeFn, molecule_type );
        if( NIL == charge )
        {
          SubLObject csome_list_var_$27 = pph_utilities.pph_ask_variable( $sym141$_CHARGE, ConsesLow.listS( $const142$chargeOfObject, molecule, $list143 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject candidate_charge = NIL;
          candidate_charge = csome_list_var_$27.first();
          while ( NIL == charge && NIL != csome_list_var_$27)
          {
            if( NIL != narts_high.naut_p( candidate_charge ) && cycl_utilities.nat_functor( candidate_charge ).eql( $const134$ElectronicCharge ) )
            {
              charge = candidate_charge;
            }
            csome_list_var_$27 = csome_list_var_$27.rest();
            candidate_charge = csome_list_var_$27.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        molecule_type = csome_list_var.first();
      }
    }
    return charge;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 42183L)
  public static SubLObject pph_molecule_types(final SubLObject substance_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = pph_utilities.pph_ask_variable( $sym144$_MOLECULE_TYPE, ConsesLow.listS( $const145$moleculesOfCompoundType, substance_type, $list146 ), pph_vars.$pph_domain_mt$.getDynamicValue( thread ), NIL,
        ONE_INTEGER );
    if( NIL != nart_handles.nart_p( substance_type ) && cycl_utilities.nat_functor( substance_type ).eql( $const147$ChemicalSubstanceFn ) )
    {
      ans = ConsesLow.cons( cycl_utilities.nat_arg1( substance_type, UNPROVIDED ), ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 42965L)
  public static SubLObject select_string_method_count(final SubLObject method_symbol)
  {
    return Hashtables.gethash( method_symbol, $select_string_method_count$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 44237L)
  public static SubLObject select_string_method(final SubLObject phrase, SubLObject quality)
  {
    if( quality == UNPROVIDED )
    {
      quality = $kw50$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = function_terms.naut_to_nart( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
    final SubLObject cat = pph_phrase.pph_phrase_find_or_set_category( phrase );
    final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds( phrase, NIL );
    SubLObject doneP = pph_phrase.pph_phrase_doneP( phrase );
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str151$__SELECT_STRING_METHOD__NL_PREDS_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str152$__SELECT_STRING_METHOD__Precision, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject total_demerits;
    final SubLObject inherited_demerits = total_demerits = pph_phrase.pph_phrase_contextualized_demerits( phrase );
    final SubLObject v_methods = ( quality == $kw121$PRECISE ) ? $list153 : $select_string_methods$.getDynamicValue( thread );
    final SubLObject input_phrase = ( NIL != pph_vars.pph_generate_alternative_phrasesP() ) ? pph_phrase.pph_phrase_copy( phrase, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject demerit_cutoff = pph_demerit_cutoff_for_quality( quality );
    SubLObject used_items = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    try
    {
      pph_vars.$pph_demerit_cutoff$.bind( pph_macros.compute_new_pph_demerit_cutoff( demerit_cutoff ), thread );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = v_methods;
        SubLObject fun = NIL;
        fun = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          if( fun.isCons() && fun.first() == $sym154$DEMERITS )
          {
            final SubLObject additional_demerits = fun.rest();
            total_demerits = Numbers.add( total_demerits, additional_demerits );
            if( NIL != pph_vars.pph_too_many_demerits_p( total_demerits, UNPROVIDED ) )
            {
              doneP = T;
            }
          }
          else if( NIL != Symbols.fboundp( fun ) && NIL == omit_pph_select_string_method_p( fun ) )
          {
            SubLObject error_message = NIL;
            SubLObject preferred_item = NIL;
            SubLObject alternative_items = NIL;
            final SubLObject _prev_bind_0_$28 = Errors.$continue_cerrorP$.currentBinding( thread );
            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
            try
            {
              Errors.$continue_cerrorP$.bind( NIL, thread );
              pph_error.$pph_error_handling_onP$.bind( T, thread );
              if( NIL != pph_error.pph_break_on_errorP() )
              {
                thread.resetMultipleValues();
                final SubLObject preferred_item_$29 = pph_try_method( fun, v_term, nl_preds, quality, cat );
                final SubLObject alternative_items_$30 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                preferred_item = preferred_item_$29;
                alternative_items = alternative_items_$30;
              }
              else
              {
                try
                {
                  thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$29 = Errors.$error_handler$.currentBinding( thread );
                  try
                  {
                    Errors.$error_handler$.bind( $sym155$CATCH_ERROR_MESSAGE_HANDLER, thread );
                    try
                    {
                      thread.resetMultipleValues();
                      final SubLObject preferred_item_$30 = pph_try_method( fun, v_term, nl_preds, quality, cat );
                      final SubLObject alternative_items_$31 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      preferred_item = preferred_item_$30;
                      alternative_items = alternative_items_$31;
                    }
                    catch( final Throwable catch_var )
                    {
                      Errors.handleThrowable( catch_var, NIL );
                    }
                  }
                  finally
                  {
                    Errors.$error_handler$.rebind( _prev_bind_0_$29, thread );
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                }
                finally
                {
                  thread.throwStack.pop();
                }
                if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
                {
                  Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str156$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
                }
              }
            }
            finally
            {
              pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
              Errors.$continue_cerrorP$.rebind( _prev_bind_0_$28, thread );
            }
            if( NIL == error_message )
            {
              if( NIL != pph_data_structures.pph_phrase_output_item_loose_p( preferred_item ) )
              {
                if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
                {
                  alternative_items = ConsesLow.cons( preferred_item, alternative_items );
                }
                else
                {
                  pph_update_phrase_with_method_result( phrase, preferred_item, v_term, fun, cat, total_demerits, inherited_demerits, nl_preds, quality );
                  used_items = ConsesLow.cons( preferred_item, used_items );
                }
                SubLObject added_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = alternative_items;
                SubLObject alternative_item = NIL;
                alternative_item = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL == subl_promotions.memberP( alternative_item, used_items, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
                  {
                    used_items = ConsesLow.cons( alternative_item, used_items );
                    if( NIL != pph_vars.pph_generate_alternative_phrasesP() && NIL != pph_data_structures.pph_phrase_output_item_loose_p( alternative_item ) )
                    {
                      final SubLObject alternative_phrase = pph_phrase.pph_phrase_copy( input_phrase, UNPROVIDED, UNPROVIDED );
                      pph_update_phrase_with_method_result( alternative_phrase, alternative_item, v_term, fun, cat, total_demerits, inherited_demerits, nl_preds, quality );
                      if( NIL != pph_phrase.pph_phrase_doneP( alternative_phrase ) )
                      {
                        pph_phrase.pph_phrase_add_alternative( phrase, alternative_phrase );
                        added_count = Numbers.add( added_count, ONE_INTEGER );
                      }
                    }
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  alternative_item = cdolist_list_var.first();
                }
                if( added_count.isPositive() && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                {
                  format_nil.force_format( T, $str157$Added__S_alternatives_for____S, added_count, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                if( NIL == pph_vars.pph_generate_alternative_phrasesP() )
                {
                  doneP = T;
                }
              }
              else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
              {
                format_nil.force_format( T, $str158$__SELECT_STRING_METHOD__the_funct, fun, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
          }
          else if( NIL != pph_macros.pph_timeout_time_reachedP() )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
            {
              Errors.warn( $str159$PPH_timeout_time_reached_ );
              streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
            }
            pph_main.pph_abort();
          }
          csome_list_var = csome_list_var.rest();
          fun = csome_list_var.first();
        }
      }
    }
    finally
    {
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0, thread );
    }
    if( NIL == doneP )
    {
      final SubLObject revised_nl_preds = pph_revised_nl_preds_for_phrase( phrase, nl_preds );
      if( NIL == equal_pph_nl_predsP( revised_nl_preds, nl_preds ) )
      {
        pph_phrase.pph_phrase_set_agr_preds( phrase, nl_preds, UNPROVIDED );
        select_string_method( phrase, quality );
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 47727L)
  public static SubLObject equal_pph_nl_predsP(final SubLObject preds1, final SubLObject preds2)
  {
    if( preds2.eql( preds2 ) )
    {
      return T;
    }
    if( preds1.isList() && preds2.isList() )
    {
      return list_utilities.sets_equalP( preds1, preds2, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 47924L)
  public static SubLObject omit_pph_select_string_method_p(final SubLObject method_symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( method_symbol, pph_vars.$select_string_methods_to_omit$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 48059L)
  public static SubLObject pph_update_phrase_with_method_result(final SubLObject phrase, final SubLObject this_method_item, final SubLObject v_term, final SubLObject fun, SubLObject cat, SubLObject total_demerits,
      final SubLObject inherited_demerits, final SubLObject nl_preds, final SubLObject quality)
  {
    final SubLObject this_method_pred = pph_data_structures.pph_phrase_output_item_agr_pred( this_method_item );
    if( NIL != this_method_pred )
    {
      pph_phrase.pph_phrase_set_agr_pred( phrase, this_method_pred, UNPROVIDED );
      if( NIL == cat )
      {
        cat = pph_phrase.pph_phrase_find_or_set_category( phrase );
      }
    }
    final SubLObject arg_position = pph_phrase.pph_phrase_arg_position( phrase );
    pph_data_structures.pph_phrase_output_item_set_arg_position( this_method_item, arg_position );
    pph_phrase.pph_phrase_set_output_list( phrase, ConsesLow.list( this_method_item ), UNPROVIDED );
    pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
    pph_phrase.pph_phrase_add_justification( phrase, pph_phrase.pph_code_justification( fun, UNPROVIDED ) );
    pph_phrase.pph_phrase_add_justifications_from_item( phrase, this_method_item );
    pph_phrase.pph_phrase_note_done( phrase );
    total_demerits = Numbers.add( total_demerits, pph_data_structures.pph_phrase_output_item_demerits( this_method_item ) );
    final SubLObject incremental_demerits = Numbers.subtract( total_demerits, inherited_demerits );
    if( incremental_demerits.isPositive() )
    {
      pph_phrase.pph_phrase_set_top_level_demerits( phrase, total_demerits, fun );
      pph_phrase.pph_phrase_maybe_note_problem( phrase, $sym160$SELECT_STRING_METHOD, $kw161$DEMERITS, ConsesLow.list( $kw162$CYCL, v_term, $kw163$NL_PREDS, nl_preds, $kw164$INCREMENTAL_DEMERITS, incremental_demerits,
          $kw165$METHOD, fun ) );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 49540L)
  public static SubLObject pph_demerit_cutoff_for_quality(final SubLObject quality)
  {
    if( quality.eql( $kw123$GOOD ) )
    {
      return pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
    }
    return number_utilities.positive_infinity();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 49708L)
  public static SubLObject pph_try_method(final SubLObject method, final SubLObject v_term, final SubLObject nl_preds, final SubLObject quality, final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
    {
      format_nil.force_format( T, $str166$__SELECT_STRING_METHOD__Calling__, method, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject output_item = NIL;
    SubLObject alternative_output_items = NIL;
    thread.resetMultipleValues();
    final SubLObject preferred_result = Functions.funcall( method, v_term, nl_preds );
    SubLObject alternative_results = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( !alternative_results.isList() )
    {
      alternative_results = NIL;
    }
    output_item = pph_process_method_result( preferred_result, v_term, category, quality, nl_preds, method );
    SubLObject cdolist_list_var = alternative_results;
    SubLObject alternative_result = NIL;
    alternative_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = pph_process_method_result( alternative_result, v_term, category, quality, nl_preds, method );
      if( NIL != var )
      {
        final SubLObject item_var = var;
        if( NIL == conses_high.member( item_var, alternative_output_items, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym167$PPH_PHRASE_OUTPUT_ITEM_STRING ) ) )
        {
          alternative_output_items = ConsesLow.cons( item_var, alternative_output_items );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      alternative_result = cdolist_list_var.first();
    }
    return Values.values( output_item, Sequences.nreverse( alternative_output_items ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 50655L)
  public static SubLObject pph_process_method_result(final SubLObject preferred_result, final SubLObject v_term, final SubLObject category, final SubLObject quality, SubLObject nl_preds, final SubLObject method)
  {
    SubLObject output_item = NIL;
    if( NIL != pph_data_structures.pph_phrase_output_item_loose_p( preferred_result ) )
    {
      output_item = preferred_result;
    }
    else if( NIL != list_utilities.proper_list_p( preferred_result ) && NIL != list_utilities.lengthGE( preferred_result, TWO_INTEGER, UNPROVIDED ) )
    {
      SubLObject string = NIL;
      SubLObject pred = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( preferred_result, preferred_result, $list168 );
      string = preferred_result.first();
      SubLObject current = preferred_result.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, preferred_result, $list168 );
      pred = current.first();
      current = current.rest();
      final SubLObject demerits = current.isCons() ? current.first() : ZERO_INTEGER;
      cdestructuring_bind.destructuring_bind_must_listp( current, preferred_result, $list168 );
      current = current.rest();
      final SubLObject justification = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, preferred_result, $list168 );
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != pph_string.pph_string_p( string ) && NIL == pph_vars.pph_too_many_demerits_p( demerits, UNPROVIDED ) )
        {
          output_item = pph_data_structures.new_enhanced_pph_output_item( pph_data_structures.new_pph_phrase_output_item( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), demerits, justification );
          pph_data_structures.pph_phrase_output_item_set_agr_pred( output_item, pred );
          pph_data_structures.pph_phrase_output_item_set_cycl( output_item, v_term );
          if( NIL == pph_utilities.pph_string_ok_for_termP( string, v_term ) )
          {
            pph_disambiguation.pph_possibly_add_disambiguation_string( output_item, pph_category_for_disambiguation( category, method ) );
            if( NIL == pph_utilities.pph_string_ok_for_termP( pph_data_structures.pph_phrase_output_item_string( output_item ), v_term ) )
            {
              output_item = NIL;
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( preferred_result, $list168 );
      }
    }
    if( NIL != output_item && NIL != category )
    {
      pph_disambiguation.pph_possibly_add_disambiguation_string( output_item, pph_category_for_disambiguation( category, method ) );
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str169$__SELECT_STRING_METHOD__Function_, method, output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != pph_data_structures.pph_phrase_output_item_loose_p( output_item ) )
    {
      if( method.eql( $sym170$NL_GENERATION_CACHE_METHOD ) && nl_preds.equal( nl_generation_fort_cache.nl_generation_fort_cache_nl_preds( UNPROVIDED ) ) )
      {
        nl_preds = $kw50$ANY;
      }
      output_item = pph_filter_method_results( output_item, quality, nl_preds, category );
    }
    return output_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 52423L)
  public static SubLObject pph_category_for_disambiguation(final SubLObject phrase_category, final SubLObject method)
  {
    if( method == $sym170$NL_GENERATION_CACHE_METHOD )
    {
      return $const171$Noun;
    }
    return phrase_category;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 52599L)
  public static SubLObject pph_filter_method_results(SubLObject output_item, final SubLObject quality, final SubLObject nl_preds, final SubLObject category)
  {
    final SubLObject pred = pph_data_structures.pph_phrase_output_item_agr_pred( output_item );
    SubLObject okP = T;
    if( NIL == pph_pred_ok_for_qualityP( pred, quality, nl_preds, output_item ) )
    {
      okP = NIL;
    }
    else if( quality != $kw50$ANY )
    {
      if( NIL != pph_utilities.pph_name_string_predP( pred ) )
      {
        if( NIL != pph_utilities.pph_nbarP( category ) )
        {
          if( NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) && $const172$definiteDescriptions.eql( pred ) && NIL != string_utilities.starts_with_by_test( pph_data_structures.pph_phrase_output_item_string(
              output_item ), $str173$the_, Symbols.symbol_function( EQUALP ) ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str174$Removing_determiner_to_form_Nbar_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            pph_data_structures.pph_phrase_output_item_set_string( output_item, string_utilities.pre_remove( pph_data_structures.pph_phrase_output_item_string( output_item ), $str173$the_, Symbols.symbol_function(
                EQUALP ) ) );
          }
          else
          {
            okP = NIL;
          }
        }
      }
    }
    if( NIL == okP )
    {
      output_item = NIL;
    }
    return output_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 53488L)
  public static SubLObject pph_revised_nl_preds_for_phrase(final SubLObject phrase, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_nl_preds = nl_preds;
    if( NIL != pph_phrase.pph_phrase_npP( phrase ) && NIL == pph_types.pph_phrase_nautP( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) && NIL != pph_utilities.pph_collectionP( pph_phrase.pph_phrase_cycl( phrase,
        UNPROVIDED ) ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str175$Paraphrasing__S_as_an_NP_, pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        new_nl_preds = pph_utilities.pph_filter_preds( nl_preds, $list176, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != list_utilities.proper_list_p( nl_preds ) && NIL == pph_phrase.pph_phrase_nbarP( phrase ) && NIL != pph_utilities.pph_filter_preds( $list177, nl_preds, UNPROVIDED ) && NIL != pph_utilities
        .pph_filter_preds( $list178, nl_preds, UNPROVIDED ) && NIL != pph_utilities.pph_filter_preds( $list179, nl_preds, UNPROVIDED ) && NIL == subl_promotions.memberP( $const180$properNameStrings, nl_preds,
            $sym181$PPH_SPEC_PREDICATE_, UNPROVIDED ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str182$Adding___properNameStrings_to__S, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      new_nl_preds = ConsesLow.cons( $const180$properNameStrings, nl_preds );
    }
    else if( NIL == nl_preds && NIL != pph_phrase.pph_phrase_nbarP( phrase ) )
    {
      new_nl_preds = lexicon_accessors.top_level_nl_preds();
    }
    return new_nl_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 54760L)
  public static SubLObject pph_pred_ok_for_qualityP(final SubLObject pred, final SubLObject quality, final SubLObject nl_preds, final SubLObject output_item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( quality == $kw50$ANY )
    {
      return T;
    }
    if( nl_preds == $kw50$ANY )
    {
      return T;
    }
    if( NIL == nl_preds && NIL != lexicon_accessors.closed_lexical_class_stringP( pph_data_structures.pph_phrase_output_item_string( output_item ), pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) )
    {
      return T;
    }
    if( NIL == pred )
    {
      return NIL;
    }
    if( NIL != pph_utilities.pph_speech_part_predP( pred ) || NIL != pph_utilities.pph_name_string_predP( pred ) )
    {
      return makeBoolean( quality == $kw11$DECENT || NIL != conses_high.member( pred, nl_preds, $sym183$PPH_PRED_LICENSED_BY_PRED_, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 55273L)
  public static SubLObject pph_genl_lexicon_predicateP(final SubLObject pred1, final SubLObject pred2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return pph_utilities.pph_genl_predicateP( pred1, pred2, pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 55403L)
  public static SubLObject select_string_for_term_internal(final SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject precision, SubLObject mode)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw185$DEFAULT;
    }
    if( quality == UNPROVIDED )
    {
      quality = $kw50$ANY;
    }
    if( precision == UNPROVIDED )
    {
      precision = pph_utilities.pph_current_precision();
    }
    if( mode == UNPROVIDED )
    {
      mode = pph_vars.$paraphrase_mode$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == nl_preds )
    {
      final SubLObject new_format_string = Sequences.cconcatenate( $str186$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str187$__, format_nil.format_nil_a_no_copy(
          $str188$Trying_to_paraphrase__S_with_no_N )
      } );
      pph_error.pph_handle_error( new_format_string, ConsesLow.list( v_term ) );
    }
    if( nl_preds == $kw185$DEFAULT )
    {
      nl_preds = pph_utilities.pph_default_nl_preds_for_term( v_term );
    }
    final SubLObject fort = function_terms.naut_to_nart( v_term );
    final SubLObject phrase = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    pph_phrase.pph_phrase_set_cycl( phrase, fort );
    if( NIL != nl_preds )
    {
      pph_phrase.pph_phrase_set_agr_preds( phrase, nl_preds, UNPROVIDED );
    }
    assert NIL != pph_utilities.pph_precision_p( precision ) : precision;
    final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding( thread );
    try
    {
      pph_vars.$paraphrase_precision$.bind( precision, thread );
      pph_vars.$paraphrase_mode$.bind( mode, thread );
      select_string_method( phrase, quality );
    }
    finally
    {
      pph_vars.$paraphrase_mode$.rebind( _prev_bind_2, thread );
      pph_vars.$paraphrase_precision$.rebind( _prev_bind_0, thread );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 55403L)
  public static SubLObject select_string_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject precision, SubLObject mode)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw185$DEFAULT;
    }
    if( quality == UNPROVIDED )
    {
      quality = $kw50$ANY;
    }
    if( precision == UNPROVIDED )
    {
      precision = pph_utilities.pph_current_precision();
    }
    if( mode == UNPROVIDED )
    {
      mode = pph_vars.$paraphrase_mode$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return select_string_for_term_internal( v_term, nl_preds, quality, precision, mode );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym184$SELECT_STRING_FOR_TERM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym184$SELECT_STRING_FOR_TERM, FIVE_INTEGER, $int190$500, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym184$SELECT_STRING_FOR_TERM, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( v_term, nl_preds, quality, precision, mode );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( nl_preds.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( quality.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( precision.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && mode.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( select_string_for_term_internal( v_term, nl_preds, quality, precision, mode ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, nl_preds, quality, precision, mode ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 56494L)
  public static SubLObject clear_pph_name_string_preds()
  {
    final SubLObject cs = $pph_name_string_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 56494L)
  public static SubLObject remove_pph_name_string_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pph_name_string_preds_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 56494L)
  public static SubLObject pph_name_string_preds_internal(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      preds = Sequences.remove( $const192$preferredNameString, Sequences.delete_duplicates( ConsesLow.append( isa.all_fort_instances( $const193$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED ), genl_predicates
          .all_spec_preds( $const13$nameString, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject dispreferred_name_string_preds = ConsesLow.nconc( list_utilities.fast_set_difference( preds, isa.all_fort_instances( $const193$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED ), UNPROVIDED ),
          $dispreferred_pph_name_string_preds$.getGlobalValue() );
      preds = list_utilities.delete_if_not( $sym194$VALID_CONSTANT_, Sequences.delete_if( $sym195$HL_PROTOTYPICAL_INSTANCE_, conses_high.set_difference( preds, dispreferred_name_string_preds, UNPROVIDED, UNPROVIDED ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      preds = pph_sort_name_string_preds( preds );
      preds = ConsesLow.cons( $const192$preferredNameString, preds );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 56494L)
  public static SubLObject pph_name_string_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    SubLObject caching_state = $pph_name_string_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym191$PPH_NAME_STRING_PREDS, $sym196$_PPH_NAME_STRING_PREDS_CACHING_STATE_, $int197$128, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym198$CLEAR_PPH_NAME_STRING_PREDS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_name_string_preds_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 57590L)
  public static SubLObject clear_pph_term_string_preds()
  {
    final SubLObject cs = $pph_term_string_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 57590L)
  public static SubLObject remove_pph_term_string_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pph_term_string_preds_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 57590L)
  public static SubLObject pph_term_string_preds_internal(final SubLObject mt)
  {
    return ConsesLow.cons( $const200$preferredTermStrings, Sequences.remove( $const200$preferredTermStrings, isa.all_non_prototypical_fort_instances( $const201$ProperNamePredicate_Loose, mt, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 57590L)
  public static SubLObject pph_term_string_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    SubLObject caching_state = $pph_term_string_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym199$PPH_TERM_STRING_PREDS, $sym202$_PPH_TERM_STRING_PREDS_CACHING_STATE_, $int197$128, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym203$CLEAR_PPH_TERM_STRING_PREDS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_term_string_preds_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 57902L)
  public static SubLObject name_string_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw50$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preferred_results = NIL;
    SubLObject dispreferred_results = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL != nl_preds )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
      SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        thread.resetMultipleValues();
        final SubLObject preferred_results_$34 = name_string_method_int( v_term, nl_preds, preferred_results, UNPROVIDED );
        final SubLObject dispreferred_results_$35 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        preferred_results = preferred_results_$34;
        dispreferred_results = dispreferred_results_$35;
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      if( NIL != list_utilities.empty_list_p( preferred_results ) || NIL != pph_vars.pph_generate_alternative_phrasesP() )
      {
        thread.resetMultipleValues();
        final SubLObject preferred_results_$35 = name_string_method_int( v_term, nl_preds, preferred_results, T );
        final SubLObject dispreferred_results_$36 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        preferred_results = preferred_results_$35;
        dispreferred_results = dispreferred_results_$36;
        if( NIL != pph_vars.$allow_pph_language_mt_broadeningP$.getDynamicValue( thread ) && ( NIL != list_utilities.empty_list_p( preferred_results ) || NIL != pph_vars.pph_generate_alternative_phrasesP() ) )
        {
          final SubLObject broadened_language_mt = pph_broaden_language_mt();
          if( NIL == hlmt.hlmt_equalP( broadened_language_mt, pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) )
          {
            _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding( thread );
            try
            {
              pph_vars.$pph_language_mt$.bind( broadened_language_mt, thread );
              if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
              {
                Errors.warn( $str204$Broadening__PPH_LANGUAGE_MT__to__, pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
                streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
              }
              thread.resetMultipleValues();
              final SubLObject preferred_results_$36 = name_string_method_int( v_term, nl_preds, preferred_results, T );
              final SubLObject dispreferred_results_$37 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              preferred_results = preferred_results_$36;
              dispreferred_results = dispreferred_results_$37;
            }
            finally
            {
              pph_vars.$pph_language_mt$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
    }
    preferred_results = Sequences.nreverse( preferred_results );
    dispreferred_results = Sequences.nreverse( dispreferred_results );
    return Values.values( preferred_results.first(), ConsesLow.append( preferred_results.rest(), dispreferred_results ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 59775L)
  public static SubLObject name_string_method_int(final SubLObject v_term, final SubLObject nl_preds, final SubLObject results_so_far, SubLObject allow_domain_mt_for_namesP)
  {
    if( allow_domain_mt_for_namesP == UNPROVIDED )
    {
      allow_domain_mt_for_namesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = results_so_far;
    SubLObject dispreferred_results = NIL;
    final SubLObject preds = pph_name_string_preds_from_nl_pred_specification( nl_preds );
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = preds;
      SubLObject name_string_pred = NIL;
      name_string_pred = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP( name_string_pred, v_term, ONE_INTEGER, T ) )
        {
          thread.resetMultipleValues();
          final SubLObject preferred_pairs = pph_do_name_string_method( v_term, name_string_pred, allow_domain_mt_for_namesP );
          final SubLObject dispreferred_pairs = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject pairs = NIL;
          SubLObject pairs_$40 = NIL;
          SubLObject dispreferredP = NIL;
          SubLObject dispreferredP_$41 = NIL;
          pairs = ConsesLow.list( preferred_pairs, dispreferred_pairs );
          pairs_$40 = pairs.first();
          dispreferredP = ConsesLow.list( NIL, T );
          dispreferredP_$41 = dispreferredP.first();
          while ( NIL != dispreferredP || NIL != pairs)
          {
            if( NIL == doneP )
            {
              SubLObject csome_list_var_$42 = pairs_$40;
              SubLObject pair = NIL;
              pair = csome_list_var_$42.first();
              while ( NIL == doneP && NIL != csome_list_var_$42)
              {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject string = NIL;
                SubLObject pred = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
                string = current.first();
                current = ( pred = current.rest() );
                if( NIL != pph_name_ok_for_preds_and_cyclP( string, v_term, pred, nl_preds ) )
                {
                  string = smart_decapitalize( string, v_term );
                  if( NIL != dispreferredP_$41 )
                  {
                    final SubLObject item_var = ConsesLow.list( string, pred );
                    if( NIL == conses_high.member( item_var, dispreferred_results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      dispreferred_results = ConsesLow.cons( item_var, dispreferred_results );
                    }
                  }
                  else
                  {
                    final SubLObject item_var = ConsesLow.list( string, pred );
                    if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      results = ConsesLow.cons( item_var, results );
                    }
                  }
                }
                if( NIL == pph_vars.pph_generate_alternative_phrasesP() )
                {
                  doneP = T;
                }
                csome_list_var_$42 = csome_list_var_$42.rest();
                pair = csome_list_var_$42.first();
              }
            }
            pairs = pairs.rest();
            pairs_$40 = pairs.first();
            dispreferredP = dispreferredP.rest();
            dispreferredP_$41 = dispreferredP.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        name_string_pred = csome_list_var.first();
      }
    }
    return Values.values( results, dispreferred_results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 60878L)
  public static SubLObject pph_name_string_preds_from_nl_pred_specification(final SubLObject nl_preds)
  {
    return ( nl_preds == $kw50$ANY || NIL != Sequences.find( $const59$nounStrings, nl_preds, Symbols.symbol_function( $sym206$SPEC_POS_PRED_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? pph_name_string_preds( UNPROVIDED )
        : pph_name_string_preds_from_nl_preds( nl_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 61123L)
  public static SubLObject pph_name_ok_for_preds_and_cyclP(final SubLObject string, final SubLObject v_term, final SubLObject pred, final SubLObject nl_preds)
  {
    SubLObject okP = T;
    if( nl_preds.eql( $kw50$ANY ) )
    {
      okP = T;
    }
    else if( NIL == okP )
    {
      SubLObject csome_list_var;
      SubLObject nl_pred;
      for( csome_list_var = nl_preds, nl_pred = NIL, nl_pred = csome_list_var.first(); NIL == okP && NIL != csome_list_var; okP = pph_methods_lexicon.pph_name_ok_for_pred_and_cyclP( string, v_term, pred,
          nl_pred ), csome_list_var = csome_list_var.rest(), nl_pred = csome_list_var.first() )
      {
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 61432L)
  public static SubLObject pph_name_string_preds_from_nl_preds(final SubLObject nl_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject name_string_preds = NIL;
    SubLObject cdolist_list_var = nl_preds;
    SubLObject nl_pred = NIL;
    nl_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pph_utilities.pph_genl_predicateP( nl_pred, $const180$properNameStrings, UNPROVIDED ) || NIL != pph_utilities.pph_genl_predicateP( nl_pred, $const207$abbreviationString, UNPROVIDED ) )
      {
        final SubLObject nonstandardP = makeBoolean( NIL == pph_standard_name_string_predP( nl_pred ) );
        final SubLObject node_var = nl_pred;
        final SubLObject deck_type = $kw69$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw72$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw75$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str76$continue_anyway, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw77$WARN ) )
                {
                  Errors.warn( $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str76$continue_anyway, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( nl_pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$46 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const79$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( nl_pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$49 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject name_string_pred = node_var_$49;
                      final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$49 ) && ( NIL != nonstandardP || NIL != pph_standard_name_string_predP(
                            name_string_pred ) ) )
                        {
                          final SubLObject item_var = name_string_pred;
                          if( NIL == conses_high.member( item_var, name_string_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                          {
                            name_string_preds = ConsesLow.cons( item_var, name_string_preds );
                          }
                        }
                        SubLObject cdolist_list_var_$51;
                        final SubLObject accessible_modules = cdolist_list_var_$51 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var_$51.first();
                        while ( NIL != cdolist_list_var_$51)
                        {
                          final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var_$49 );
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
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$55;
                                        for( iteration_state_$55 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$55 ); iteration_state_$55 = dictionary_contents.do_dictionary_contents_next( iteration_state_$55 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$55 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
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
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str81$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$49, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$55 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$48, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str82$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
                                final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
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
                                        deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str81$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$50, thread );
                                }
                                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                generating_fn = cdolist_list_var_$52.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$47, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$47, thread );
                          }
                          cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                          module_var = cdolist_list_var_$51.first();
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$46, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$48, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$46, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$45, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, nl_pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$45, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$44, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$43, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      nl_pred = cdolist_list_var.first();
    }
    return pph_sort_name_string_preds( name_string_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62009L)
  public static SubLObject pph_standard_name_string_predP(final SubLObject nl_pred)
  {
    return makeBoolean( nl_pred.eql( $const180$properNameStrings ) || NIL != subl_promotions.memberP( nl_pred, pph_name_string_preds( UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62295L)
  public static SubLObject clear_pph_enhanced_domain_mt()
  {
    final SubLObject cs = $pph_enhanced_domain_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62295L)
  public static SubLObject remove_pph_enhanced_domain_mt(SubLObject language_mt, SubLObject domain_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pph_enhanced_domain_mt_caching_state$.getGlobalValue(), ConsesLow.list( language_mt, domain_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62295L)
  public static SubLObject pph_enhanced_domain_mt_internal(final SubLObject language_mt, final SubLObject domain_mt)
  {
    return pph_utilities.pph_canonicalize_hlmt( ConsesLow.list( $const209$MtUnionFn, language_mt, domain_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62295L)
  public static SubLObject pph_enhanced_domain_mt(SubLObject language_mt, SubLObject domain_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    SubLObject caching_state = $pph_enhanced_domain_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym208$PPH_ENHANCED_DOMAIN_MT, $sym210$_PPH_ENHANCED_DOMAIN_MT_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym211$CLEAR_PPH_ENHANCED_DOMAIN_MT );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( language_mt, domain_mt );
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
        if( language_mt.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_enhanced_domain_mt_internal( language_mt, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( language_mt, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 62582L)
  public static SubLObject pph_broaden_language_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject language = pph_language_of_mt( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    final SubLObject broadening_pred = $const212$validatedLexicalPSCForLanguage;
    final SubLObject language_psc = ( NIL != kb_indexing_datastructures.indexed_term_p( language ) ) ? kb_mapping_utilities.fpred_value_in_any_mt( language, broadening_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    return ( NIL != language_psc ) ? language_psc : pph_vars.$pph_language_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 63119L)
  public static SubLObject pph_dispreferred_assertionP(final SubLObject as)
  {
    return somewhere_cache.some_pred_assertion_somewhereP( $const213$dispreferredLexification, as, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 63249L)
  public static SubLObject pph_do_name_string_method(final SubLObject v_term, final SubLObject name_string_pred, SubLObject allow_domain_mt_for_namesP)
  {
    if( allow_domain_mt_for_namesP == UNPROVIDED )
    {
      allow_domain_mt_for_namesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertions = pph_methods_lexicon.pph_lexifications_for_term( v_term, ConsesLow.list( name_string_pred ), allow_domain_mt_for_namesP );
    SubLObject ans = NIL;
    SubLObject dispreferred = NIL;
    SubLObject doneP = NIL;
    if( NIL != assertions )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str214$__Got__S, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == doneP )
      {
        SubLObject csome_list_var = assertions;
        SubLObject gaf = NIL;
        gaf = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject dispreferredP = pph_dispreferred_assertionP( gaf );
          if( NIL == doneP )
          {
            SubLObject csome_list_var_$60 = name_string_gaf_strings( gaf );
            SubLObject string = NIL;
            string = csome_list_var_$60.first();
            while ( NIL == doneP && NIL != csome_list_var_$60)
            {
              if( NIL != pph_utilities.pph_string_ok_for_termP( string, v_term ) )
              {
                if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                {
                  format_nil.force_format( T, $str215$Generated_name_for__S_from____S, v_term, gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                pph_phrase_resolution.maybe_throw_pph_hl_supports( v_term, string, ConsesLow.list( name_string_pred ), ConsesLow.list( gaf ) );
                if( NIL != dispreferredP )
                {
                  final SubLObject item_var = ConsesLow.cons( string, name_string_pred );
                  if( NIL == conses_high.member( item_var, dispreferred, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    dispreferred = ConsesLow.cons( item_var, dispreferred );
                  }
                }
                else
                {
                  final SubLObject item_var = ConsesLow.cons( string, name_string_pred );
                  if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var, ans );
                  }
                }
              }
              else if( NIL != pph_disambiguation.pph_string_ambiguous_p( string ) )
              {
                final SubLObject new_string = pph_disambiguation.pph_possibly_add_alias( v_term, string );
                if( NIL != pph_utilities.pph_string_ok_for_termP( new_string, v_term ) )
                {
                  if( NIL != dispreferredP )
                  {
                    final SubLObject item_var2 = ConsesLow.cons( new_string, name_string_pred );
                    if( NIL == conses_high.member( item_var2, dispreferred, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      dispreferred = ConsesLow.cons( item_var2, dispreferred );
                    }
                  }
                  else
                  {
                    final SubLObject item_var2 = ConsesLow.cons( new_string, name_string_pred );
                    if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var2, ans );
                    }
                  }
                }
              }
              doneP = makeBoolean( NIL == pph_vars.pph_generate_alternative_phrasesP() && NIL != ans );
              csome_list_var_$60 = csome_list_var_$60.rest();
              string = csome_list_var_$60.first();
            }
          }
          csome_list_var = csome_list_var.rest();
          gaf = csome_list_var.first();
        }
      }
    }
    else if( name_string_pred.eql( $const132$chemicalFormulaString ) && NIL != pph_utilities.pph_collectionP( v_term ) && NIL != pph_utilities.pph_isaP( v_term, $const216$ChemicalSubstanceType, pph_vars.$pph_domain_mt$
        .getDynamicValue( thread ) ) )
    {
      final SubLObject output_item = do_generate_chemical_substance_type_semantic( v_term );
      final SubLObject item_var3 = ConsesLow.cons( pph_phrase.pph_phrase_output_item_get_string( output_item, T ), pph_data_structures.pph_phrase_output_item_agr_pred( output_item ) );
      if( NIL == conses_high.member( item_var3, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        ans = ConsesLow.cons( item_var3, ans );
      }
    }
    else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str217$__No__S_assertions___for__S___fro, name_string_pred, v_term, pph_vars.$pph_language_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return Values.values( ans, dispreferred, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 65049L)
  public static SubLObject name_string_gaf_strings_internal(final SubLObject gaf)
  {
    SubLObject strings = NIL;
    final SubLObject v_cycl_string = assertions_high.gaf_arg2( gaf );
    if( v_cycl_string.isString() || NIL != unicode_nauts.unicode_naut_p( v_cycl_string, UNPROVIDED ) )
    {
      final SubLObject string = pph_string.pph_string_from_cycl_string( v_cycl_string );
      strings = ConsesLow.cons( string, strings );
      if( NIL != pph_string.pph_string_p( string ) && NIL != pph_string.pph_string_starts_with( string, $str173$the_, Symbols.symbol_function( EQUALP ) ) )
      {
        strings = list_utilities.add_to_end( pph_string.pph_string_pre_remove( string, $str173$the_, Symbols.symbol_function( EQUALP ) ), strings );
      }
    }
    return strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 65049L)
  public static SubLObject name_string_gaf_strings(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return name_string_gaf_strings_internal( gaf );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym218$NAME_STRING_GAF_STRINGS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym218$NAME_STRING_GAF_STRINGS, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym218$NAME_STRING_GAF_STRINGS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, gaf, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( name_string_gaf_strings_internal( gaf ) ) );
      memoization_state.caching_state_put( caching_state, gaf, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 65543L)
  public static SubLObject pph_no_abbreviation_predsP(final SubLObject nl_preds)
  {
    return makeBoolean( NIL == list_utilities.find_if_not( $sym219$PPH_NON_ABBREVIATION_NAME_PRED_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 65731L)
  public static SubLObject pph_non_abbreviation_name_predP(final SubLObject pred)
  {
    return makeBoolean( NIL == pph_abbreviation_predP( pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 65835L)
  public static SubLObject clear_pph_methods_caches()
  {
    clear_generate_skolem_name();
    return $kw220$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 65931L)
  public static SubLObject pph_abbreviation_predP(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    return subl_promotions.memberP( pred, pph_abbreviation_preds( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66063L)
  public static SubLObject clear_pph_abbreviation_preds()
  {
    final SubLObject cs = $pph_abbreviation_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66063L)
  public static SubLObject remove_pph_abbreviation_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pph_abbreviation_preds_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66063L)
  public static SubLObject pph_abbreviation_preds_internal(final SubLObject mt)
  {
    return genl_predicates.all_spec_preds( $const222$abbreviationString_PN, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66063L)
  public static SubLObject pph_abbreviation_preds(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    SubLObject caching_state = $pph_abbreviation_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym221$PPH_ABBREVIATION_PREDS, $sym223$_PPH_ABBREVIATION_PREDS_CACHING_STATE_, $int224$25, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_genl_preds_dependent_cache_clear_callback( $sym225$CLEAR_PPH_ABBREVIATION_PREDS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_abbreviation_preds_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66258L)
  public static SubLObject any_name_string_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    return name_string_method( v_term, $kw50$ANY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66444L)
  public static SubLObject name_string_method_non_acronym(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    SubLObject preds = pph_name_string_preds_from_nl_pred_specification( nl_preds );
    preds = Sequences.delete( $const226$acronymString, preds, $sym181$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return name_string_method( v_term, preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 66781L)
  public static SubLObject smart_decapitalize(final SubLObject string, final SubLObject v_term)
  {
    if( NIL == pph_string.pph_string_p( string ) )
    {
      return NIL;
    }
    final SubLObject ans = pph_string.pph_string_copy( string );
    if( NIL != list_utilities.lengthG( string, ZERO_INTEGER, UNPROVIDED ) && NIL != pph_starts_with_determinerP( string ) && NIL == assume_det_is_part_of_nameP( v_term ) )
    {
      pph_string.pph_string_ndowncase_leading( ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 67188L)
  public static SubLObject pph_starts_with_determinerP(final SubLObject string)
  {
    if( NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) )
    {
      return pph_string.pph_string_starts_with_one_of( string, $list227 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 67369L)
  public static SubLObject assume_det_is_part_of_nameP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return pph_utilities.pph_isaP( v_term, $const228$Artifact_Generic, pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 68003L)
  public static SubLObject pph_sort_name_string_preds(final SubLObject preds)
  {
    return Sort.sort( preds, $sym230$PPH_PREFER_NAME_STRING_PRED_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 68107L)
  public static SubLObject pph_prefer_name_string_predP(final SubLObject pred1, final SubLObject pred2)
  {
    if( NIL != subl_promotions.memberP( pred2, $dispreferred_pph_name_string_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( pred1, $dispreferred_pph_name_string_preds$
        .getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != subl_promotions.memberP( pred1, $dispreferred_pph_name_string_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( pred2, $dispreferred_pph_name_string_preds$
        .getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != pph_utilities.pph_isaP( pred1, $const193$ProperNamePredicate_Strict, UNPROVIDED ) && NIL == pph_utilities.pph_isaP( pred2, $const193$ProperNamePredicate_Strict, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != pph_utilities.pph_isaP( pred2, $const193$ProperNamePredicate_Strict, UNPROVIDED ) && NIL == pph_utilities.pph_isaP( pred1, $const193$ProperNamePredicate_Strict, UNPROVIDED ) )
    {
      return NIL;
    }
    return cardinality_estimates.generality_estimateG( pred2, pred1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 68762L)
  public static SubLObject nl_generation_cache_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != forts.fort_p( v_term ) && pph_vars.$pph_language_mt$.getDynamicValue( thread ).equal( nl_generation_fort_cache.nl_generation_fort_cache_paraphrase_mt( UNPROVIDED ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject string = pph_utilities.pph_fort_paraphrase_cache_lookup( v_term, nl_preds, UNPROVIDED );
      final SubLObject pred = thread.secondMultipleValue();
      final SubLObject demerits = thread.thirdMultipleValue();
      final SubLObject justification = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      if( NIL != pph_string.pph_string_p( string ) && NIL == Sequences.find_if( $sym231$INVALID_ASSERTION_, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ans = ConsesLow.list( string, pred, demerits, justification );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 69369L)
  public static SubLObject term_string_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    if( NIL == kb_indexing_datastructures.indexed_term_p( v_term ) )
    {
      return ConsesLow.list( NIL, NIL );
    }
    SubLObject ans = NIL;
    SubLObject pred_used = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var;
      SubLObject termstring_pred;
      SubLObject string;
      for( csome_list_var = pph_term_string_preds( UNPROVIDED ), termstring_pred = NIL, termstring_pred = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = ( NIL != string ) ? pph_string
          .pph_string_from_cycl_string( string ) : NIL, pred_used = termstring_pred, csome_list_var = csome_list_var.rest(), termstring_pred = csome_list_var.first() )
      {
        string = kb_mapping_utilities.fpred_value_in_any_mt( v_term, termstring_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    if( NIL != pph_string.pph_string_p( ans ) )
    {
      ans = smart_decapitalize( ans, v_term );
    }
    return ConsesLow.list( ans, pred_used );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 70144L)
  public static SubLObject chemical_formula_method(final SubLObject substance_type, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLObject olist = do_generate_chemical_substance_type( substance_type );
    return ( NIL != pph_phrase.pph_phrase_output_list_p( olist ) && NIL != list_utilities.singletonP( olist ) ) ? olist.first() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 70455L)
  public static SubLObject scientific_name_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject scientific_name = NIL;
    SubLObject output_item = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        scientific_name = kb_mapping_utilities.fpred_value( v_term, $const232$scientificName, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      if( NIL != string_utilities.non_empty_stringP( scientific_name ) && NIL != pph_utilities.pph_string_ok_for_termP( scientific_name, v_term ) )
      {
        scientific_name = smart_decapitalize( scientific_name, v_term );
        output_item = pph_data_structures.new_pph_phrase_output_item( scientific_name, pph_utilities.pph_unknown_arg_position(), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        pph_data_structures.pph_phrase_output_item_set_agr_pred( output_item, $const232$scientificName );
        if( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw12$HTML )
        {
          pph_html.pph_phrase_output_item_italicize( output_item );
        }
      }
    }
    return output_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 71345L)
  public static SubLObject pretty_string_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_indexing_datastructures.indexed_term_p( v_term ) )
    {
      return ConsesLow.list( NIL, NIL );
    }
    final SubLObject preds = $list233;
    SubLObject ans = NIL;
    SubLObject others = NIL;
    SubLObject cdolist_list_var = preds;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constant_handles.valid_constantP( pred, UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym30$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const31$EverythingPSC, thread );
          SubLObject string = NIL;
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw234$GAF, NIL, NIL );
                  SubLObject done_var_$61 = NIL;
                  final SubLObject token_var_$62 = NIL;
                  while ( NIL == done_var_$61)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$62 );
                    final SubLObject valid_$63 = makeBoolean( !token_var_$62.eql( assertion ) );
                    if( NIL != valid_$63 )
                    {
                      string = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                      final SubLObject result = ConsesLow.list( string, pred );
                      if( NIL == ans )
                      {
                        ans = result;
                      }
                      else
                      {
                        final SubLObject item_var = result;
                        if( NIL == conses_high.member( item_var, others, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          others = ConsesLow.cons( item_var, others );
                        }
                      }
                    }
                    done_var_$61 = makeBoolean( NIL == valid_$63 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
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
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return Values.values( ans, others );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 71991L)
  public static SubLObject genitive_paraphrase_method(final SubLObject possessed, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans_string = NIL;
    SubLObject ans_pred = NIL;
    final SubLObject phrase = pph_data_structures.new_pph_phrase( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    pph_phrase.pph_phrase_set_cycl( phrase, possessed );
    pph_phrase.pph_phrase_set_agr_preds( phrase, nl_preds, UNPROVIDED );
    final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding( thread );
    try
    {
      pph_vars.$select_string_methods_to_omit$.bind( $list235, thread );
      generate_genitive( phrase );
    }
    finally
    {
      pph_vars.$select_string_methods_to_omit$.rebind( _prev_bind_0, thread );
    }
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      final SubLObject add_tagsP = NIL;
      ans_string = pph_phrase.pph_phrase_string( phrase, add_tagsP );
      ans_pred = pph_phrase.pph_phrase_agr_pred( phrase );
    }
    return ConsesLow.list( ans_string, ans_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 72798L)
  public static SubLObject generate_nart_lexified_tight(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject precision = ( NIL != pph_utilities.pph_top_level_preciseP() || NIL == pph_vars.$pph_terse_modeP$.getDynamicValue( thread ) ) ? $kw121$PRECISE : $kw123$GOOD;
    final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    try
    {
      pph_vars.$pph_demerit_cutoff$.bind( ZERO_INTEGER, thread );
      generate_nart_lexified( phrase, precision );
    }
    finally
    {
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0, thread );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 73217L)
  public static SubLObject generate_nart_lexified_imprecise(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_vars.$pph_terse_modeP$.getDynamicValue( thread ) && NIL != pph_utilities.pph_top_level_preciseP() )
    {
      final SubLObject precision = $kw123$GOOD;
      generate_nart_lexified( phrase, precision );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 73509L)
  public static SubLObject pph_nart_methods_to_omit_for_precision(final SubLObject precision)
  {
    if( precision.eql( $kw121$PRECISE ) )
    {
      return $list235;
    }
    if( precision.eql( $kw123$GOOD ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 73772L)
  public static SubLObject generate_nart_lexified(final SubLObject phrase, final SubLObject precision)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject original = pph_phrase.pph_phrase_create_backup( phrase );
    final SubLObject revised_nl_preds = pph_revised_nl_preds_for_phrase( phrase, UNPROVIDED );
    SubLObject methods_to_omit = pph_nart_methods_to_omit_for_precision( precision );
    methods_to_omit = ConsesLow.append( methods_to_omit, pph_vars.$select_string_methods_to_omit$.getDynamicValue( thread ) );
    if( NIL == pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue( thread ) )
    {
      final SubLObject item_var = $sym170$NL_GENERATION_CACHE_METHOD;
      if( NIL == conses_high.member( item_var, methods_to_omit, Symbols.symbol_function( EQ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        methods_to_omit = ConsesLow.cons( item_var, methods_to_omit );
      }
    }
    if( NIL != revised_nl_preds )
    {
      pph_phrase.pph_phrase_set_agr_preds( phrase, revised_nl_preds, UNPROVIDED );
      final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding( thread );
      try
      {
        pph_vars.$select_string_methods_to_omit$.bind( methods_to_omit, thread );
        final SubLObject nart = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
        final SubLObject nart_arg_position = pph_phrase.pph_phrase_arg_position( phrase );
        final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED );
        SubLObject select_string_olist = NIL;
        final SubLObject nart_equivalents = ConsesLow.cons( nart, kb_mapping_utilities.pred_values( nart, $const237$rewriteOf, TWO_INTEGER, ONE_INTEGER, $kw238$TRUE ) );
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var = nart_equivalents;
          SubLObject nart_equivalent = NIL;
          nart_equivalent = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            select_string_olist = select_string_for_term( nart_equivalent, nl_preds, precision, UNPROVIDED, UNPROVIDED );
            if( NIL != pph_phrase.pph_phrase_non_empty_output_list_p( select_string_olist ) )
            {
              pph_phrase.pph_phrase_set_output_list( phrase, select_string_olist, UNPROVIDED );
              pph_phrase.pph_phrase_set_output_list_cycl( phrase, nart );
              pph_phrase.pph_phrase_set_arg_position( phrase, nart_arg_position );
              pph_phrase.pph_phrase_note_done( phrase );
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            nart_equivalent = csome_list_var.first();
          }
        }
        if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str239$Couldn_t_find__S_lexification_wit, precision, nl_preds, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          pph_phrase.pph_phrase_revert_to_backup( phrase, original );
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str240$Reverted_to_original_phrase_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
        else if( NIL != list_utilities.singletonP( select_string_olist ) )
        {
          final SubLObject output_item = select_string_olist.first();
          final SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred( output_item );
          pph_data_structures.pph_phrase_output_item_set_arg_position( output_item, nart_arg_position );
          if( NIL != agr_pred )
          {
            pph_phrase.pph_phrase_set_agr_pred( phrase, agr_pred, UNPROVIDED );
          }
          pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
        }
        else
        {
          pph_phrase.pph_phrase_consolidate_output_list( phrase, nart_arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
        }
      }
      finally
      {
        pph_vars.$select_string_methods_to_omit$.rebind( _prev_bind_0, thread );
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 76076L)
  public static SubLObject generate_nart_as_naut(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nart = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject naut = narts_high.nart_hl_formula( nart );
    final SubLObject nart_arg_position = pph_utilities.pph_top_level_arg_position( pph_phrase.pph_phrase_arg_position_map( phrase ) );
    final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding( thread );
    try
    {
      pph_vars.$paraphrase_mode$.bind( ( NIL != pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue( thread ) ) ? $kw16$TEXT : pph_vars.$paraphrase_mode$.getDynamicValue( thread ), thread );
      final SubLObject precision = ( NIL != pph_utilities.pph_top_level_preciseP() ) ? NIL : pph_utilities.pph_current_precision();
      pph_phrase.pph_phrase_set_cycl( phrase, naut );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str242$__GENERATE_NART_AS_NAUT_paraphras, naut, pph_phrase.pph_phrase_category( phrase, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      assert NIL != pph_utilities.pph_precision_p( precision ) : precision;
      final SubLObject _prev_bind_0_$65 = pph_vars.$paraphrase_precision$.currentBinding( thread );
      try
      {
        pph_vars.$paraphrase_precision$.bind( precision, thread );
        pph_main.pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$paraphrase_precision$.rebind( _prev_bind_0_$65, thread );
      }
      maybe_adjust_nart_paraphrase_demerits( phrase );
      pph_phrase.pph_phrase_set_cycl( phrase, nart );
      if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
      {
        if( NIL == pph_phrase.pph_phrase_justification( phrase ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str243$__GENERATE_NART_AS_NAUT_found_unj, pph_phrase.pph_phrase_string( phrase, NIL ), naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    finally
    {
      pph_vars.$paraphrase_mode$.rebind( _prev_bind_0, thread );
    }
    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) && NIL == pph_vars.pph_too_many_demerits_p( pph_phrase.pph_phrase_demerits( phrase ), UNPROVIDED ) )
    {
      pph_phrase.pph_phrase_set_string( phrase, pph_methods_lexicon.pph_string_for_term( nart, $kw50$ANY, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue( thread ) )
    {
      pph_phrase.pph_phrase_consolidate_output_list( phrase, nart_arg_position, NIL, NIL, pph_phrase.pph_phrase_agr_pred( phrase ) );
      pph_phrase.pph_phrase_set_output_list_cycl( phrase, nart );
    }
    pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
    pph_phrase.pph_phrase_set_cycl( phrase, nart );
    pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports( phrase );
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 77856L)
  public static SubLObject maybe_adjust_nart_paraphrase_demerits(final SubLObject phrase)
  {
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) && NIL != cycl_grammar.cycl_nat_p( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) )
    {
      final SubLObject just = pph_phrase.pph_phrase_justification( phrase );
      final SubLObject reln = cycl_utilities.nat_functor( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
      SubLObject not_so_badP = NIL;
      if( NIL == not_so_badP )
      {
        SubLObject csome_list_var = just;
        SubLObject support = NIL;
        support = csome_list_var.first();
        while ( NIL == not_so_badP && NIL != csome_list_var)
        {
          if( NIL != ok_gen_template_assertion_for_relnP( support, reln, UNPROVIDED ) )
          {
            not_so_badP = T;
          }
          csome_list_var = csome_list_var.rest();
          support = csome_list_var.first();
        }
      }
      if( NIL != not_so_badP )
      {
        pph_phrase.pph_phrase_increment_top_level_demerits( phrase, MINUS_ONE_INTEGER, $kw244$OK_NAT_TEMPLATE );
      }
    }
    return pph_phrase.pph_phrase_demerits( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 78394L)
  public static SubLObject ok_gen_template_assertion_for_relnP_internal(final SubLObject support, final SubLObject reln, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == assertion_handles.assertion_p( support ) )
      {
        return NIL;
      }
      if( NIL == assertions_high.gaf_assertionP( support ) )
      {
        return NIL;
      }
      if( assertions_high.gaf_predicate( support ).eql( $const247$genTemplate_Constrained ) && assertions_high.gaf_arg1( support ).eql( reln ) )
      {
        return T;
      }
      if( assertions_high.gaf_predicate( support ).eql( $const248$genTemplate ) && NIL == kb_mapping_utilities.some_pred_value_in_relevant_mts( reln, $const247$genTemplate_Constrained, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) )
      {
        return T;
      }
      return NIL;
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 78394L)
  public static SubLObject ok_gen_template_assertion_for_relnP(final SubLObject support, final SubLObject reln, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return ok_gen_template_assertion_for_relnP_internal( support, reln, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( support, reln, mt );
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
        if( support.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( reln.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( ok_gen_template_assertion_for_relnP_internal( support, reln, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( support, reln, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 79172L)
  public static SubLObject generate_universal_date(final SubLObject phrase)
  {
    final SubLObject universal_date = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject date_cycl = date_utilities.universal_date_to_cycl_date( universal_date );
    final SubLObject date_phrase = pph_phrase.new_pph_phrase_for_cycl( date_cycl, UNPROVIDED, UNPROVIDED );
    pph_main.pph_phrase_generate( date_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject date_string = pph_phrase.pph_phrase_string( date_phrase, UNPROVIDED );
    pph_phrase.pph_phrase_set_string( phrase, date_string );
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 79719L)
  public static SubLObject generate_universal_date_numbers(final SubLObject phrase)
  {
    final SubLObject date = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject date_string = print_high.princ_to_string( date );
    final SubLObject year = string_utilities.substring( date_string, ZERO_INTEGER, FOUR_INTEGER );
    final SubLObject month = string_utilities.substring( date_string, FOUR_INTEGER, SIX_INTEGER );
    final SubLObject day = string_utilities.substring( date_string, SIX_INTEGER, EIGHT_INTEGER );
    pph_phrase.pph_phrase_set_string( phrase, Sequences.cconcatenate( month, new SubLObject[] { $str20$_, day, $str20$_, year
    } ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 80186L)
  public static SubLObject generate_universal_second(final SubLObject phrase, SubLObject precision)
  {
    if( precision == UNPROVIDED )
    {
      precision = $kw255$SECOND;
    }
    SubLObject string = numeric_date_utilities.secondstring( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) );
    final SubLObject pcase_var = precision;
    if( pcase_var.eql( $kw256$MINUTE ) )
    {
      string = string_utilities.post_remove( string, $str257$_00, UNPROVIDED );
    }
    pph_phrase.pph_phrase_set_string( phrase, string );
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 80603L)
  public static SubLObject generate_float(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_float = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject float_string = pph_float_string( v_float, UNPROVIDED );
    final SubLObject max_number_of_digits_to_print_with_commas = TEN_INTEGER;
    v_float = reader.read_from_string( float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( pph_vars.$pph_max_no_comma_length$.getDynamicValue( thread ).isInteger() && Numbers.round( v_float, UNPROVIDED ).numE( v_float ) && ( v_float.isZero() || Numbers.log( Numbers.abs( v_float ), TEN_INTEGER ).numLE(
        max_number_of_digits_to_print_with_commas ) ) )
    {
      pph_phrase.pph_phrase_set_string( phrase, generate_integer_wXcommas( Numbers.round( v_float, UNPROVIDED ) ) );
    }
    else if( NIL != string_utilities.ends_with( float_string, $str260$E0, UNPROVIDED ) || NIL == Sequences.find_if( $sym261$ALPHA_CHAR_P, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject snipped_float_string = string_utilities.post_remove( float_string, $str260$E0, UNPROVIDED );
      pph_phrase.pph_phrase_set_string( phrase, snipped_float_string );
    }
    else if( NIL != pph_vars.$pph_expand_e_notation_for_floatsP$.getDynamicValue( thread ) && pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw12$HTML )
    {
      final SubLObject arg_position = pph_phrase.pph_phrase_arg_position( phrase );
      thread.resetMultipleValues();
      final SubLObject base_item = generate_float_items( v_float, float_string, arg_position );
      final SubLObject expt_item = thread.secondMultipleValue();
      thread.resetMultipleValues();
      pph_phrase.pph_phrase_set_output_list( phrase, ConsesLow.list( base_item, expt_item ), UNPROVIDED );
      pph_phrase.pph_phrase_note_done( phrase );
    }
    else
    {
      pph_phrase.pph_phrase_set_string( phrase, float_string );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 82014L)
  public static SubLObject generate_float_items(final SubLObject v_float, final SubLObject float_string, final SubLObject arg_position)
  {
    final SubLObject divider_position = Sequences.position_if( $sym261$ALPHA_CHAR_P, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject base_string = pph_string.pph_bunge( ConsesLow.list( string_utilities.post_remove( string_utilities.substring( float_string, ZERO_INTEGER, divider_position ), $str262$_0, UNPROVIDED ),
        pph_phrase_resolution.pph_symbol_string( $const263$MultiplicationSign_TheSymbol ), $str264$10 ) );
    final SubLObject base_item = pph_data_structures.new_pph_phrase_output_item( base_string, arg_position, v_float, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject expt_string = string_utilities.pre_remove( string_utilities.substring( float_string, number_utilities.f_1X( divider_position ), UNPROVIDED ), $str265$_, UNPROVIDED );
    final SubLObject expt_item = pph_data_structures.new_pph_phrase_output_item( expt_string, arg_position, v_float, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    pph_html.pph_phrase_output_item_superscript( expt_item );
    return Values.values( base_item, expt_item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 82641L)
  public static SubLObject pph_float_string(final SubLObject v_float, SubLObject sig_dig)
  {
    if( sig_dig == UNPROVIDED )
    {
      sig_dig = pph_vars.$pph_significant_digits_cutoff$.getDynamicValue();
    }
    final SubLObject sig_dig_float = ( NIL != subl_promotions.positive_integer_p( sig_dig ) ) ? number_utilities.significant_digits( v_float, sig_dig ) : v_float;
    final SubLObject float_string = pph_standardize_float_string( string_utilities.str( sig_dig_float ), UNPROVIDED );
    return float_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 83023L)
  public static SubLObject pph_standardize_float_string(SubLObject float_string, SubLObject sig_dig)
  {
    if( sig_dig == UNPROVIDED )
    {
      sig_dig = pph_vars.$pph_significant_digits_cutoff$.getDynamicValue();
    }
    float_string = Strings.string_upcase( float_string, UNPROVIDED, UNPROVIDED );
    if( NIL != Sequences.find( Characters.CHAR_E, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return float_string;
    }
    if( NIL != Sequences.find( Characters.CHAR_D, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return string_utilities.string_subst( $str266$E, $str267$D, float_string, Symbols.symbol_function( EQUAL ) );
    }
    if( NIL != string_utilities.digit_stringP( float_string ) )
    {
      final SubLObject exp = number_utilities.f_1_( Sequences.length( float_string ) );
      SubLObject significand_string = string_utilities.trim_sides( float_string, Characters.CHAR_0 );
      if( !significand_string.isString() || NIL != list_utilities.lengthG( significand_string, sig_dig, UNPROVIDED ) )
      {
      }
      if( NIL == string_utilities.non_empty_stringP( significand_string ) )
      {
        significand_string = $str268$0;
      }
      if( NIL != list_utilities.lengthE( significand_string, ONE_INTEGER, UNPROVIDED ) )
      {
        significand_string = Sequences.cconcatenate( significand_string, $str268$0 );
      }
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( string_utilities.first_char( significand_string ) ), new SubLObject[] { $str269$_, format_nil.format_nil_a_no_copy( string_utilities.substring(
          significand_string, ONE_INTEGER, UNPROVIDED ) ), $str270$d, format_nil.format_nil_a_no_copy( exp.isNegative() ? Characters.CHAR_hyphen : Characters.CHAR_plus ), format_nil.format_nil_a_no_copy( exp )
      } );
    }
    return float_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 83975L)
  public static SubLObject generate_integer_wXcommas(final SubLObject v_int)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject no_commas = string_utilities.str( v_int );
    if( !pph_vars.$pph_max_no_comma_length$.getDynamicValue( thread ).isInteger() || NIL == list_utilities.lengthG( no_commas, pph_vars.$pph_max_no_comma_length$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return no_commas;
    }
    return PrintLow.format( NIL, $str271$__D, v_int );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 84917L)
  public static SubLObject generate_integer_as_word(final SubLObject v_int)
  {
    assert NIL != Types.integerp( v_int ) : v_int;
    SubLObject ans = NIL;
    if( v_int.numL( $int275$100 ) )
    {
      if( v_int.numL( ZERO_INTEGER ) )
      {
        return NIL;
      }
      if( v_int.numG( TWENTY_INTEGER ) && Numbers.mod( v_int, TEN_INTEGER ).isPositive() )
      {
        final SubLObject tens = Numbers.subtract( v_int, Numbers.mod( v_int, TEN_INTEGER ) );
        final SubLObject tens_string = generate_integer_as_word( tens );
        if( NIL != tens_string )
        {
          ans = Sequences.cconcatenate( tens_string, new SubLObject[] { $str276$_, generate_integer_as_word( Numbers.mod( v_int, TEN_INTEGER ) )
          } );
        }
      }
      else if( v_int.numL( TWENTY_INTEGER ) )
      {
        ans = ConsesLow.nth( v_int, $english_integer_paraphrases$.getGlobalValue() );
      }
      else
      {
        ans = conses_high.assoc( v_int, $english_tens_paraphrases$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 85638L)
  public static SubLObject generate_number_default(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject number = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject sig_dig_number = ( NIL != subl_promotions.positive_integer_p( pph_vars.$pph_significant_digits_cutoff$.getDynamicValue( thread ) ) ) ? number_utilities.significant_digits( number,
        pph_vars.$pph_significant_digits_cutoff$.getDynamicValue( thread ) ) : number;
    SubLObject string = NIL;
    SubLObject alt_strings = NIL;
    if( NIL != pph_ordinal_phrase_p( phrase ) )
    {
      string = pph_methods_formulas.ordinal_form( number );
    }
    else if( number.isInteger() )
    {
      if( number.numL( $int275$100 ) && NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) && NIL != pph_phrase.pph_phrase_category( phrase, UNPROVIDED ) && NIL != pph_utilities.pph_genl_posP( pph_utilities
          .pph_pos_of_category( pph_phrase.pph_phrase_category( phrase, UNPROVIDED ), UNPROVIDED ), $const54$Determiner, UNPROVIDED ) )
      {
        string = generate_integer_as_word( sig_dig_number );
        alt_strings = ConsesLow.cons( generate_integer_wXcommas( sig_dig_number ), alt_strings );
      }
      else if( pph_vars.$pph_max_no_comma_length$.getDynamicValue( thread ).isInteger() )
      {
        string = generate_integer_wXcommas( sig_dig_number );
        alt_strings = ConsesLow.cons( generate_integer_as_word( sig_dig_number ), alt_strings );
      }
    }
    if( NIL != string )
    {
      pph_phrase.pph_phrase_set_string( phrase, string );
      if( NIL == pph_utilities.pph_string_ok_for_termP( string, number ) )
      {
        final SubLObject olist = pph_phrase.pph_phrase_output_list( phrase );
        if( NIL != list_utilities.singletonP( olist ) )
        {
          pph_disambiguation.pph_possibly_add_disambiguation_string( olist.first(), $kw50$ANY );
        }
        else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( $str279$Was_anticipating_a_singleton_outp, olist );
          streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
        }
      }
      SubLObject cdolist_list_var = alt_strings;
      SubLObject alt_string = NIL;
      alt_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != pph_string.pph_string_p( alt_string ) )
        {
          final SubLObject alt_phrase = pph_data_structures.new_pph_phrase( alt_string, number, UNPROVIDED );
          pph_phrase.pph_phrase_add_alternative( phrase, alt_phrase );
        }
        cdolist_list_var = cdolist_list_var.rest();
        alt_string = cdolist_list_var.first();
      }
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 87144L)
  public static SubLObject pph_ordinal_phrase_p(final SubLObject phrase)
  {
    return makeBoolean( NIL != number_utilities.positive_number_p( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) && ( NIL != lexicon_utilities.term_phrases_constraint_implied_by_nl_predsP(
        $const280$OrdinalAdjective, pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED ) ) || ( NIL != pph_phrase.pph_phrase_category( phrase, UNPROVIDED ) && NIL != pph_utilities.pph_genl_posP( pph_phrase
            .pph_phrase_category( phrase, UNPROVIDED ), $const280$OrdinalAdjective, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 87561L)
  public static SubLObject get_image_url_as_string(final SubLObject url)
  {
    return ask_utilities.query_variable( $sym281$_STRING, ConsesLow.listS( $const282$imageURLPathname, url, $list283 ), $const15$InferencePSC, $list284 ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 87892L)
  public static SubLObject generate_image_url(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject image_url = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject url = get_image_url_as_string( image_url );
    final SubLObject html = PrintLow.format( NIL, $str287$_img_src___A__, url );
    if( $kw12$HTML == pph_vars.$paraphrase_mode$.getDynamicValue( thread ) )
    {
      pph_phrase.pph_phrase_set_html_tags( phrase, html, NIL );
      pph_phrase.pph_phrase_set_string( phrase, $str288$ );
    }
    else
    {
      pph_phrase.pph_phrase_set_string( phrase, url );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 88446L)
  public static SubLObject generate_princ(final SubLObject phrase)
  {
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject string = do_generate_princ( v_object );
    pph_phrase.pph_phrase_maybe_add_anchor_tags( phrase );
    pph_phrase.pph_phrase_set_string( phrase, string );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 88675L)
  public static SubLObject do_generate_princ(final SubLObject v_object)
  {
    return print_high.princ_to_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 88808L)
  public static SubLObject pph_default_mt_time_index()
  {
    if( NIL == $pph_default_mt_time_index$.getGlobalValue() && NIL != control_vars.kb_loaded() )
    {
      $pph_default_mt_time_index$.setGlobalValue( $const293$Always_TimeInterval );
    }
    return $pph_default_mt_time_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 89080L)
  public static SubLObject generate_assertion(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject sentence = pph_utilities.pph_sentence_from_assertion( assertion );
    final SubLObject pred = cycl_utilities.formula_arg0( sentence );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    thread.resetMultipleValues();
    final SubLObject gloss = pph_gloss_for_assertion( assertion, pred );
    final SubLObject support = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != gloss )
    {
      pph_phrase.pph_phrase_set_output_list( phrase, ConsesLow.list( pph_data_structures.new_pph_phrase_output_item( pph_string.pph_string_from_cycl_string( gloss ), NIL, assertion, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ), UNPROVIDED );
      pph_phrase.pph_phrase_note_done( phrase );
      pph_phrase.pph_phrase_add_justification( phrase, support );
      return phrase;
    }
    pph_phrase.pph_phrase_set_cycl( phrase, sentence );
    final SubLObject temporal_object = pph_time_interval_for_assertion( assertion );
    if( NIL != temporal_object && ( !pph_default_mt_time_index().eql( temporal_object ) || NIL != pph_vars.$pph_use_explicit_temporal_qualification_for_defaultP$.getDynamicValue( thread ) ) && ( NIL != pph_utilities
        .pph_top_level_preciseP() || NIL != pph_find_arg_starting_before( sentence, temporal_object, mt ) || NIL != pph_find_arg_ending_after( sentence, temporal_object, mt ) ) )
    {
      final SubLObject template = ConsesLow.listS( $const296$ist, ConsesLow.list( $const297$MtTimeDimFn, temporal_object ), $list298 );
      pph_phrase.pph_phrase_reset_cycl( phrase, template );
    }
    final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope( phrase );
    try
    {
      final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding( thread );
      try
      {
        pph_vars.$pph_domain_mt$.bind( pph_utilities.pph_canonicalize_hlmt( ConsesLow.list( $const209$MtUnionFn, mt, pph_vars.$pph_domain_mt$.getDynamicValue( thread ) ) ), thread );
        pph_main.pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_domain_mt$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped( phrase, save_cycl, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    pph_phrase.pph_phrase_set_cycl( phrase, assertion );
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 90565L)
  public static SubLObject pph_find_arg_starting_before(final SubLObject sentence, final SubLObject temporal_object, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw299$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_accessors.individualP( arg ) )
      {
        SubLObject cdolist_list_var_$66 = pph_utilities.pph_ask_variable( $sym300$_DATE, ConsesLow.listS( $const301$startingDate, arg, $list302 ), mt, UNPROVIDED, UNPROVIDED );
        SubLObject start = NIL;
        start = cdolist_list_var_$66.first();
        while ( NIL != cdolist_list_var_$66)
        {
          if( NIL != sbhl_time_modules.starts_after_starting_ofP( date_utilities.possibly_bind_temporal_indexical_in_object( temporal_object ), start, UNPROVIDED ) )
          {
            return arg;
          }
          cdolist_list_var_$66 = cdolist_list_var_$66.rest();
          start = cdolist_list_var_$66.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 90918L)
  public static SubLObject pph_find_arg_ending_after(final SubLObject sentence, final SubLObject temporal_object, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw299$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_accessors.individualP( arg ) )
      {
        SubLObject cdolist_list_var_$67 = pph_utilities.pph_ask_variable( $sym300$_DATE, ConsesLow.listS( $const303$endingDate, arg, $list302 ), mt, UNPROVIDED, UNPROVIDED );
        SubLObject end = NIL;
        end = cdolist_list_var_$67.first();
        while ( NIL != cdolist_list_var_$67)
        {
          if( NIL != sbhl_time_modules.ends_after_ending_ofP( end, date_utilities.possibly_bind_temporal_indexical_in_object( temporal_object ), UNPROVIDED ) )
          {
            return arg;
          }
          cdolist_list_var_$67 = cdolist_list_var_$67.rest();
          end = cdolist_list_var_$67.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 91323L)
  public static SubLObject pph_time_interval_for_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    SubLObject temporal_object = pph_mt_time_index( mt );
    if( NIL != $ignore_misleading_time_parametersP$.getDynamicValue( thread ) )
    {
      if( NIL != pph_ignore_temporal_qualification_for_assertionP( assertion, temporal_object ) )
      {
        temporal_object = NIL;
      }
      thread.resetMultipleValues();
      SubLObject success = formula_pattern_match.formula_matches_pattern( temporal_object, $list304 );
      SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject end_date = list_utilities.alist_lookup_without_values( v_bindings, $sym305$END_DATE, UNPROVIDED, UNPROVIDED );
        final SubLObject start_date = list_utilities.alist_lookup_without_values( v_bindings, $sym306$START_DATE, UNPROVIDED, UNPROVIDED );
        if( NIL != pph_irrelevant_date_wrt_assertion_contentP( assertion, end_date ) )
        {
          temporal_object = ConsesLow.list( $const307$IntervalStartedByFn_Inclusive, start_date );
        }
        else if( NIL != pph_irrelevant_date_wrt_assertion_contentP( assertion, start_date ) )
        {
          temporal_object = ConsesLow.list( $const308$IntervalEndedByFn_Inclusive, end_date );
        }
      }
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( temporal_object, $list309 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject guid = list_utilities.alist_lookup_without_values( v_bindings, $sym310$GUID, UNPROVIDED, UNPROVIDED );
        final SubLObject end_date2 = list_utilities.alist_lookup_without_values( v_bindings, $sym305$END_DATE, UNPROVIDED, UNPROVIDED );
        final SubLObject start_date2 = list_utilities.alist_lookup_without_values( v_bindings, $sym306$START_DATE, UNPROVIDED, UNPROVIDED );
        if( NIL != pph_irrelevant_date_wrt_assertion_contentP( assertion, end_date2 ) )
        {
          temporal_object = ConsesLow.list( $const311$SomeTimeInIntervalFn, ConsesLow.list( $const312$IntervalStartedByFn, start_date2 ), guid );
        }
        else if( NIL != pph_irrelevant_date_wrt_assertion_contentP( assertion, start_date2 ) )
        {
          temporal_object = ConsesLow.list( $const311$SomeTimeInIntervalFn, ConsesLow.list( $const313$IntervalEndedByFn, end_date2 ), guid );
        }
      }
    }
    return temporal_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 92689L)
  public static SubLObject pph_ignore_temporal_qualification_for_assertionP(final SubLObject assertion, final SubLObject temporal_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignoreP = NIL;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( temporal_object, $list314 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject date = list_utilities.alist_lookup_without_values( v_bindings, $sym315$DATE, UNPROVIDED, UNPROVIDED );
      if( NIL != pph_irrelevant_date_wrt_assertion_contentP( assertion, date ) )
      {
        ignoreP = T;
      }
    }
    return ignoreP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 93080L)
  public static SubLObject pph_irrelevant_date_wrt_assertion_contentP(final SubLObject assertion, final SubLObject date)
  {
    SubLObject irrelevantP = NIL;
    if( NIL == pph_indexed_nautP( date ) )
    {
      irrelevantP = T;
    }
    else if( NIL != subl_promotions.memberP( date_utilities.cycl_date_to_universal_date( date ), pph_support_creation_dates( assertion ), UNPROVIDED, UNPROVIDED ) )
    {
      irrelevantP = T;
    }
    return irrelevantP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 93407L)
  public static SubLObject pph_indexed_nautP(final SubLObject naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject indexedP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym30$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const31$EverythingPSC, thread );
      SubLObject indexed_terms = cycl_utilities.expression_gather( naut, $sym316$INDEXED_TERM_P, NIL, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
      if( NIL != kb_indexing_datastructures.indexed_term_p( NIL ) )
      {
        indexed_terms = ConsesLow.cons( NIL, indexed_terms );
      }
      SubLObject rest;
      SubLObject gaf;
      for( rest = NIL, rest = virtual_indexing.gather_overlap_index( indexed_terms, UNPROVIDED ); NIL == indexedP && NIL != rest; rest = rest.rest() )
      {
        gaf = rest.first();
        if( NIL != el_utilities.term_occurs_as_formula_argument( naut, assertions_high.assertion_formula( gaf ) ) )
        {
          indexedP = T;
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return indexedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 93604L)
  public static SubLObject pph_support_creation_dates_internal(final SubLObject support)
  {
    return pph_support_creation_dates_recursive( support, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 93604L)
  public static SubLObject pph_support_creation_dates(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_support_creation_dates_internal( support );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym317$PPH_SUPPORT_CREATION_DATES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym317$PPH_SUPPORT_CREATION_DATES, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym317$PPH_SUPPORT_CREATION_DATES, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_support_creation_dates_internal( support ) ) );
      memoization_state.caching_state_put( caching_state, support, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 93754L)
  public static SubLObject pph_support_creation_dates_recursive(final SubLObject support, SubLObject done_set)
  {
    SubLObject universal_dates = NIL;
    if( NIL == set.set_p( done_set ) || NIL == set.set_memberP( support, done_set ) )
    {
      if( NIL != set.set_p( done_set ) )
      {
        set.set_add( support, done_set );
      }
      if( NIL != assertion_handles.assertion_p( support ) )
      {
        final SubLObject item_var = assertions_high.asserted_when( support );
        if( NIL == conses_high.member( item_var, universal_dates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          universal_dates = ConsesLow.cons( item_var, universal_dates );
        }
      }
      if( NIL == assertion_handles.assertion_p( support ) || NIL != assertions_high.deduced_assertionP( support ) )
      {
        SubLObject cdolist_list_var = pph_proof.pph_meta_supports( support );
        SubLObject meta_support = NIL;
        meta_support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == set.set_p( done_set ) )
          {
            done_set = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
            set.set_add( support, done_set );
          }
          SubLObject cdolist_list_var_$68 = pph_support_creation_dates_recursive( meta_support, done_set );
          SubLObject support_date = NIL;
          support_date = cdolist_list_var_$68.first();
          while ( NIL != cdolist_list_var_$68)
          {
            final SubLObject item_var2 = support_date;
            if( NIL == conses_high.member( item_var2, universal_dates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              universal_dates = ConsesLow.cons( item_var2, universal_dates );
            }
            cdolist_list_var_$68 = cdolist_list_var_$68.rest();
            support_date = cdolist_list_var_$68.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          meta_support = cdolist_list_var.first();
        }
      }
    }
    return Sequences.delete( NIL, universal_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 94487L)
  public static SubLObject pph_mt_time_index(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = pph_default_mt_time_index();
    final SubLObject monad_mt = hlmt.hlmt_monad_mt_without_default( mt );
    SubLObject temporal_object = NIL;
    SubLObject time_parameter = NIL;
    thread.resetMultipleValues();
    final SubLObject temporal_object_$69 = hlmt.explode_hlmt_temporal_facets( mt, NIL, NIL );
    final SubLObject time_parameter_$70 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    temporal_object = temporal_object_$69;
    time_parameter = time_parameter_$70;
    if( NIL != temporal_object )
    {
      result = temporal_object;
    }
    if( NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP( $const318$mtTimeIndex, mt, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject query_result = pph_utilities.pph_ask_variable_new( $sym319$_TIME_INDEX, ConsesLow.list( $const320$assertedSentence, ConsesLow.listS( $const318$mtTimeIndex, mt, $list321 ) ), UNPROVIDED,
          UNPROVIDED );
      if( NIL != query_result )
      {
        result = query_result.first();
      }
    }
    return ( NIL != pph_monad_mt_time_precision_suspect_p( monad_mt ) ) ? pph_adjust_mt_time_index_granularity( result ) : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 95535L)
  public static SubLObject pph_monad_mt_time_precision_suspect_p(final SubLObject monad_mt)
  {
    return makeBoolean( NIL != monad_mt && NIL != pph_utilities.pph_genl_mtP( monad_mt, $const322$TKBSourceSpindleHeadMt ) && NIL != pph_utilities.pph_genl_mtP( $const323$TKBSourceSpindleCollectorMt, monad_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 95997L)
  public static SubLObject pph_adjust_mt_time_index_granularity(final SubLObject time_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject adjusted = time_index;
    if( NIL != date_utilities.date_p( time_index ) )
    {
      adjusted = pph_adjust_mt_date_granularity( time_index, $kw333$SUBSUMING );
    }
    thread.resetMultipleValues();
    SubLObject success = formula_pattern_match.formula_matches_pattern( time_index, $list304 );
    SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject end_date = list_utilities.alist_lookup_without_values( v_bindings, $sym305$END_DATE, UNPROVIDED, UNPROVIDED );
      final SubLObject start_date = list_utilities.alist_lookup_without_values( v_bindings, $sym306$START_DATE, UNPROVIDED, UNPROVIDED );
      SubLObject new_start_date = pph_adjust_mt_date_granularity( start_date, $kw333$SUBSUMING );
      SubLObject new_end_date = pph_adjust_mt_date_granularity( end_date, $kw333$SUBSUMING );
      if( NIL == pph_utilities.pph_ask_boolean( ConsesLow.list( $const334$startsAfterEndingOf, new_end_date, new_start_date ), UNPROVIDED, UNPROVIDED ) )
      {
        new_start_date = start_date;
        new_end_date = end_date;
      }
      adjusted = ConsesLow.list( $const335$TimeIntervalInclusiveFn, new_start_date, new_end_date );
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( time_index, $list336 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject end_date = list_utilities.alist_lookup_without_values( v_bindings, $sym305$END_DATE, UNPROVIDED, UNPROVIDED );
      final SubLObject new_end_date2 = pph_adjust_mt_date_granularity( end_date, $kw337$FOLLOWING );
      adjusted = el_utilities.replace_formula_arg_position( $list338, new_end_date2, adjusted );
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( time_index, $list309 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject guid = list_utilities.alist_lookup_without_values( v_bindings, $sym310$GUID, UNPROVIDED, UNPROVIDED );
      final SubLObject end_date2 = list_utilities.alist_lookup_without_values( v_bindings, $sym305$END_DATE, UNPROVIDED, UNPROVIDED );
      final SubLObject start_date2 = list_utilities.alist_lookup_without_values( v_bindings, $sym306$START_DATE, UNPROVIDED, UNPROVIDED );
      final SubLObject new_start_date2 = pph_adjust_mt_date_granularity( start_date2, $kw339$PRECEDING );
      final SubLObject new_end_date3 = pph_adjust_mt_date_granularity( end_date2, $kw337$FOLLOWING );
      adjusted = ConsesLow.list( $const311$SomeTimeInIntervalFn, ConsesLow.list( $const340$TimeIntervalBetweenFn, new_start_date2, new_end_date3 ), guid );
    }
    return adjusted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 97616L)
  public static SubLObject pph_adjust_mt_date_granularity_internal(final SubLObject date, final SubLObject type)
  {
    SubLObject adjusted = date;
    if( NIL != date_utilities.date_p( date ) )
    {
      final SubLObject today = date_utilities.indexical_today();
      SubLObject precision = NIL;
      if( NIL == pph_utilities.pph_time_interval_subsumesP( today, date ) )
      {
        if( NIL != pph_utilities.pph_time_interval_subsumesP( date_utilities.date_to_precision( today, $const342$CalendarYear, UNPROVIDED ), date ) )
        {
          if( NIL != pph_utilities.pph_longer_durationP( $list343, ConsesLow.list( $const344$DurationFn, date ) ) )
          {
            precision = $const345$CalendarDay;
          }
        }
        else if( NIL != pph_utilities.pph_longer_durationP( $list346, ConsesLow.list( $const344$DurationFn, date ) ) )
        {
          precision = $const347$CalendarMonth;
        }
      }
      if( NIL != precision )
      {
        adjusted = date_utilities.date_to_precision( date, precision, UNPROVIDED );
        if( !adjusted.equal( date ) )
        {
          if( type.eql( $kw339$PRECEDING ) )
          {
            adjusted = time_interval_utilities.preceding_cycl_date( adjusted );
          }
          else if( type.eql( $kw337$FOLLOWING ) )
          {
            adjusted = time_interval_utilities.succeeding_cycl_date( adjusted );
          }
        }
      }
    }
    else if( NIL != el_utilities.el_formula_with_operator_p( date, $const311$SomeTimeInIntervalFn ) && NIL != date_utilities.date_p( cycl_utilities.nat_arg1( date, UNPROVIDED ) ) )
    {
      final SubLObject old = cycl_utilities.nat_arg1( date, UNPROVIDED );
      final SubLObject v_new = pph_adjust_mt_date_granularity( old, type );
      if( !old.equal( v_new ) )
      {
        adjusted = v_new;
      }
    }
    else if( NIL != el_utilities.el_formula_with_operator_p( date, $const313$IntervalEndedByFn ) && NIL != date_utilities.date_p( cycl_utilities.nat_arg1( date, UNPROVIDED ) ) && type == $kw337$FOLLOWING )
    {
      final SubLObject old = cycl_utilities.nat_arg1( date, UNPROVIDED );
      final SubLObject v_new = pph_adjust_mt_date_granularity( old, type );
      if( old.equal( v_new ) )
      {
        adjusted = time_interval_utilities.succeeding_cycl_date( v_new );
      }
      else
      {
        adjusted = v_new;
      }
    }
    return adjusted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 97616L)
  public static SubLObject pph_adjust_mt_date_granularity(final SubLObject date, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_adjust_mt_date_granularity_internal( date, type );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym341$PPH_ADJUST_MT_DATE_GRANULARITY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym341$PPH_ADJUST_MT_DATE_GRANULARITY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym341$PPH_ADJUST_MT_DATE_GRANULARITY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( date, type );
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
        if( date.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_adjust_mt_date_granularity_internal( date, type ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( date, type ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 99689L)
  public static SubLObject pph_assertion_has_glossP(final SubLObject assertion)
  {
    final SubLObject sentence = pph_utilities.pph_sentence_from_assertion( assertion );
    final SubLObject pred = cycl_utilities.formula_arg0( sentence );
    final SubLObject gloss = pph_gloss_for_assertion( assertion, pred );
    return list_utilities.sublisp_boolean( gloss );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 99920L)
  public static SubLObject pph_gloss_for_assertion(final SubLObject assertion, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gloss = NIL;
    SubLObject support = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != forts.fort_p( pred ) && NIL != kb_mapping_utilities.some_pred_value( pred, $const350$genWithGloss, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject pred_var = $const351$englishGloss;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( assertion, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( assertion, ONE_INTEGER, pred_var );
          SubLObject done_var = gloss;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw234$GAF, NIL, NIL );
                SubLObject done_var_$71 = gloss;
                final SubLObject token_var_$72 = NIL;
                while ( NIL == done_var_$71)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$72 );
                  final SubLObject valid_$73 = makeBoolean( !token_var_$72.eql( gaf ) );
                  if( NIL != valid_$73 )
                  {
                    gloss = assertions_high.gaf_arg2( gaf );
                    support = gaf;
                  }
                  done_var_$71 = makeBoolean( NIL == valid_$73 || NIL != gloss );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$74, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != gloss );
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
    return Values.values( gloss, support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 100282L)
  public static SubLObject pph_output_list_to_assertion_output_list(final SubLObject olist)
  {
    SubLObject items = NIL;
    assert NIL != pph_phrase.pph_phrase_output_list_p( olist ) : olist;
    SubLObject start_char_index = ZERO_INTEGER;
    SubLObject end_char_index = ZERO_INTEGER;
    final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string( olist, T );
    final SubLObject whole_string = pph_utilities.pph_remove_html_tags( whole_html_string, NIL );
    final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator( olist );
    while ( NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p( iterator ))
    {
      final SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next( iterator );
      final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string( item, NIL );
      start_char_index = pph_macros.pph_output_list_find_start_char( raw_item_string, whole_string, end_char_index );
      if( start_char_index.numG( end_char_index ) )
      {
        final SubLObject string = pph_macros.pph_make_space_string( start_char_index, end_char_index );
        final SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
        final SubLObject open_tag = NIL;
        final SubLObject close_tag = NIL;
        final SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
        final SubLObject output_item = pph_question.new_pph_phrase_filler_item( string );
        final SubLObject start_char_index_$75 = end_char_index;
        final SubLObject raw_list = ConsesLow.list( close_tag, open_tag, arg_position, string );
        final SubLObject info_start = Sequences.position_if( $sym353$ASSERTION_OUTPUT_LIST_INFO_P, raw_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject info = Sequences.nreverse( conses_high.nthcdr( info_start, raw_list ) );
        if( NIL != list_utilities.singletonP( info ) )
        {
          info = info.first();
        }
        items = ConsesLow.cons( info, items );
      }
      end_char_index = pph_macros.pph_update_end_char_index( start_char_index, raw_item_string );
      final SubLObject string = pph_phrase.pph_phrase_output_item_get_string( item, NIL );
      final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position( item );
      final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag( item );
      final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag( item );
      final SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl( item );
      final SubLObject output_item = item;
      final SubLObject raw_list2 = ConsesLow.list( close_tag, open_tag, arg_position, string );
      final SubLObject info_start2 = Sequences.position_if( $sym353$ASSERTION_OUTPUT_LIST_INFO_P, raw_list2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject info2 = Sequences.nreverse( conses_high.nthcdr( info_start2, raw_list2 ) );
      if( NIL != list_utilities.singletonP( info2 ) )
      {
        info2 = info2.first();
      }
      items = ConsesLow.cons( info2, items );
    }
    return Sequences.nreverse( items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 100802L)
  public static SubLObject pph_output_list_from_assertion_output_list(final SubLObject assertion_output_list, final SubLObject assertion)
  {
    SubLObject olist_items = NIL;
    SubLObject cdolist_list_var = assertion_output_list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( item.isString() )
      {
        olist_items = ConsesLow.cons( pph_question.new_pph_phrase_filler_item( item ), olist_items );
      }
      else
      {
        SubLObject current;
        final SubLObject datum = current = item;
        SubLObject string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list354 );
        string = current.first();
        current = current.rest();
        final SubLObject arg_position = current.isCons() ? current.first() : pph_utilities.pph_unknown_arg_position();
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list354 );
        current = current.rest();
        final SubLObject open_tag = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list354 );
        current = current.rest();
        final SubLObject close_tag = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list354 );
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject cycl = ( NIL != pph_utilities.pph_known_arg_position_p( arg_position ) ) ? pph_utilities.pph_dereference_arg_position( assertion, arg_position ) : pph_phrase.pph_empty_cycl();
          olist_items = ConsesLow.cons( pph_data_structures.new_pph_phrase_output_item( string, arg_position, cycl, open_tag, close_tag, UNPROVIDED ), olist_items );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list354 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return pph_main.pph_sanitize_output_list( Sequences.nreverse( olist_items ), assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 101516L)
  public static SubLObject assertion_output_list_info_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && NIL == pph_utilities.pph_unknown_arg_position_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 101691L)
  public static SubLObject generate_string(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( pph_vars.$paraphrase_mode$.getDynamicValue( thread ) == $kw12$HTML )
    {
      generate_cycl_string_with_html( phrase );
    }
    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
    {
      final SubLObject string = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
      if( string.isString() )
      {
        pph_phrase.pph_phrase_set_string( phrase, string );
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 102011L)
  public static SubLObject generate_cycl_string_with_html(final SubLObject phrase)
  {
    final SubLObject string = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    if( string.isString() )
    {
      final SubLObject output_items = generate_cycl_string_with_html_internal( string, pph_phrase.pph_phrase_arg_position( phrase ) );
      pph_phrase.pph_phrase_set_output_list( phrase, output_items, UNPROVIDED );
      pph_phrase.pph_phrase_note_done( phrase );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 102384L)
  public static SubLObject generate_cycl_string_with_html_internal(final SubLObject string, SubLObject arg_position)
  {
    if( arg_position == UNPROVIDED )
    {
      arg_position = pph_utilities.pph_unknown_arg_position();
    }
    SubLObject output_items = NIL;
    SubLObject current_string = string_utilities.$empty_string$.getGlobalValue();
    SubLObject end_of_current_string = ZERO_INTEGER;
    SubLObject end_var_$76;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    SubLObject name_start;
    SubLObject next_whitespace;
    SubLObject putative_constant_name;
    SubLObject putative_constant;
    SubLObject constant_item;
    for( end_var = ( end_var_$76 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$76 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      if( Characters.CHAR_hash.eql( v_char ) && ( !i.isPositive() || NIL == constant_completion_high.valid_constant_name_char_p( Strings.sublisp_char( string, number_utilities.f_1_( i ) ) ) ) && NIL != list_utilities
          .lengthG( string, i, UNPROVIDED ) && Characters.CHAR_dollar.eql( Strings.sublisp_char( string, number_utilities.f_1X( i ) ) ) )
      {
        name_start = Numbers.add( i, TWO_INTEGER );
        next_whitespace = list_utilities.position_if_not( $sym356$VALID_CONSTANT_NAME_CHAR_P, string, Symbols.symbol_function( IDENTITY ), name_start, UNPROVIDED );
        putative_constant_name = string_utilities.substring( string, name_start, next_whitespace );
        putative_constant = constants_high.find_constant( putative_constant_name );
        if( NIL != constant_handles.valid_constantP( putative_constant, UNPROVIDED ) && NIL != pph_html.pph_use_anchor_tags_for_termP( putative_constant ) && NIL != list_utilities.sublisp_boolean( pph_html
            .pph_anchor_tags_for_term( putative_constant ) ) )
        {
          current_string = Sequences.cconcatenate( current_string, string_utilities.substring( string, end_of_current_string, i ) );
          end_of_current_string = next_whitespace;
          if( NIL != string_utilities.non_empty_stringP( current_string ) )
          {
            output_items = ConsesLow.cons( pph_question.new_pph_phrase_filler_item( current_string ), output_items );
            current_string = string_utilities.$empty_string$.getGlobalValue();
          }
          constant_item = pph_data_structures.new_pph_phrase_output_item( putative_constant_name, pph_utilities.pph_unknown_arg_position(), putative_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags( constant_item, putative_constant );
          output_items = ConsesLow.cons( constant_item, output_items );
        }
      }
    }
    if( NIL != end_of_current_string )
    {
      current_string = Sequences.cconcatenate( current_string, string_utilities.substring( string, end_of_current_string, UNPROVIDED ) );
    }
    if( NIL != string_utilities.non_empty_stringP( current_string ) )
    {
      final SubLObject item = ( NIL != list_utilities.empty_list_p( output_items ) ) ? pph_data_structures.new_pph_phrase_output_item( string, arg_position, string, UNPROVIDED, UNPROVIDED, UNPROVIDED )
          : pph_question.new_pph_phrase_filler_item( current_string );
      output_items = ConsesLow.cons( item, output_items );
    }
    return Sequences.nreverse( output_items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 104484L)
  public static SubLObject generate_cycl_list(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED );
    if( NIL != fort_types_interface.predicate_in_any_mtP( v_object.first() ) || NIL != fort_types_interface.function_in_any_mtP( v_object.first() ) )
    {
      missing_knowledge_discovery_events.post_unlexified_term_discovery_event( function_terms.naut_to_nart( v_object ), pph_vars.$pph_language_mt$.getDynamicValue( thread ), pph_vars.$pph_domain_mt$.getDynamicValue(
          thread ), nl_preds );
    }
    if( NIL != list_utilities.proper_list_p( v_object ) )
    {
      SubLObject output_items = NIL;
      final SubLObject map = pph_phrase.pph_phrase_arg_position_map( phrase );
      SubLObject list_var = NIL;
      SubLObject member = NIL;
      SubLObject i = NIL;
      list_var = v_object;
      member = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), member = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        SubLObject cdolist_list_var = pph_main.generate_pph_output_list_no_checks( member, $kw50$ANY, pph_vars.$pph_language_mt$.getDynamicValue( thread ), pph_vars.$pph_domain_mt$.getDynamicValue( thread ),
            pph_vars.$paraphrase_mode$.getDynamicValue( thread ), UNPROVIDED );
        SubLObject output_item = NIL;
        output_item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject local_arg_position = ConsesLow.list( i );
          final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup( local_arg_position, map );
          if( NIL != pph_utilities.pph_known_arg_position_p( global_arg_position ) )
          {
            pph_utilities.pph_contextualize_output_item_arg_position( global_arg_position, output_item );
          }
          output_items = ConsesLow.cons( output_item, output_items );
          cdolist_list_var = cdolist_list_var.rest();
          output_item = cdolist_list_var.first();
        }
      }
      final SubLObject olist = Sequences.nreverse( output_items );
      if( NIL != pph_phrase.pph_phrase_non_empty_output_list_p( olist ) )
      {
        pph_phrase.pph_phrase_set_output_list( phrase, olist, UNPROVIDED );
        pph_phrase.pph_phrase_note_done( phrase );
      }
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 105856L)
  public static SubLObject generate_rop_expression(final SubLObject phrase)
  {
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    if( NIL != el_utilities.formula_arityE( v_object, ONE_INTEGER, UNPROVIDED ) && NIL != pph_utilities.pph_isaP( cycl_utilities.formula_arg1( v_object, UNPROVIDED ), $const360$ScalarInterval, UNPROVIDED ) )
    {
      pph_phrase.pph_phrase_set_cycl( phrase, Sequences.reverse( v_object ) );
    }
    return generate_cycl_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 106178L)
  public static SubLObject generate_genitive(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject possessed = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject new_cycl = pph_genitive_cycl( possessed, UNPROVIDED );
    if( NIL != new_cycl )
    {
      pph_phrase.pph_phrase_reset_cycl( phrase, new_cycl );
      final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding( thread );
      try
      {
        pph_vars.$select_string_methods_to_omit$.bind( $list235, thread );
        pph_main.pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$select_string_methods_to_omit$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      pph_phrase.pph_phrase_set_agr_pred( phrase, $const172$definiteDescriptions, UNPROVIDED );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 106595L)
  public static SubLObject pph_genitive_cycl(final SubLObject possessed, SubLObject possessive_sentence)
  {
    if( possessive_sentence == UNPROVIDED )
    {
      possessive_sentence = NIL;
    }
    SubLObject ans = NIL;
    if( NIL == possessive_sentence && NIL != pph_term_ok_for_genitive_paraphraseP( possessed ) )
    {
      possessive_sentence = pph_find_possessive_sentence( possessed, UNPROVIDED );
    }
    if( NIL != el_utilities.el_formula_p( possessive_sentence ) )
    {
      final SubLObject possessive_pred = cycl_utilities.formula_arg0( possessive_sentence );
      final SubLObject possessor = pph_find_possessor( possessive_sentence );
      final SubLObject possessed_type = pph_find_possessed_type( possessive_sentence );
      if( NIL != possessed_type )
      {
        ans = ConsesLow.list( $const361$InstanceWithRelationFromFn, possessed_type, possessive_pred, possessor );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107249L)
  public static SubLObject pph_term_ok_for_genitive_paraphraseP(final SubLObject possessed)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == term.el_fort_p( possessed ) )
    {
      return NIL;
    }
    if( NIL != pph_utilities.pph_isa_anyP( possessed, pph_dont_use_instances_for_genitive_paraphrase(), pph_vars.$pph_domain_mt$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107724L)
  public static SubLObject pph_dont_use_instances_for_genitive_paraphrase()
  {
    return $bad_collections_for_genitive_paraphrase$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107907L)
  public static SubLObject clear_pph_possessive_preds()
  {
    final SubLObject cs = $pph_possessive_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107907L)
  public static SubLObject remove_pph_possessive_preds()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pph_possessive_preds_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107907L)
  public static SubLObject pph_possessive_preds_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym30$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const31$EverythingPSC, thread );
      final SubLObject node_var = $const364$possessiveRelation;
      final SubLObject deck_type = $kw69$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0_$77 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw72$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw75$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str76$continue_anyway, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw77$WARN ) )
              {
                Errors.warn( $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str76$continue_anyway, $str73$_A_is_not_a__A, tv_var, $sym74$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const364$possessiveRelation, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$81 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const79$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const364$possessiveRelation, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(
                      recur_deck ) )
                  {
                    final SubLObject node_var_$85 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject possessive_pred = node_var_$85;
                    final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$85 ) && !kb_indexing.num_predicate_extent_index( possessive_pred, UNPROVIDED )
                          .isZero() && !kb_accessors.fan_out_arg( possessive_pred, UNPROVIDED ).eql( TWO_INTEGER ) )
                      {
                        preds = ConsesLow.cons( possessive_pred, preds );
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const79$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$85 );
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
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$90;
                                      for( iteration_state_$90 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$90 ); iteration_state_$90 = dictionary_contents.do_dictionary_contents_next( iteration_state_$90 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$90 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
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
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str81$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$84, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$90 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$83, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str82$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$92;
                            final SubLObject new_list = cdolist_list_var_$92 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$92.first();
                            while ( NIL != cdolist_list_var_$92)
                            {
                              final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
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
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str81$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$85, thread );
                              }
                              cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                              generating_fn = cdolist_list_var_$92.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$82, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$82, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$81, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$84, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$81, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$80, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, $const364$possessiveRelation, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$80, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$79, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$79, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$78, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$86, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$77, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 107907L)
  public static SubLObject pph_possessive_preds()
  {
    SubLObject caching_state = $pph_possessive_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym363$PPH_POSSESSIVE_PREDS, $sym365$_PPH_POSSESSIVE_PREDS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_possessive_preds_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 108260L)
  public static SubLObject pph_find_possessive_sentence_internal(final SubLObject possessed, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject truth = $kw238$TRUE;
    if( NIL == ans )
    {
      SubLObject csome_list_var = pph_possessive_preds();
      SubLObject possessive_pred = NIL;
      possessive_pred = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
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
          if( NIL != kb_mapping_utilities.some_pred_value( possessed, possessive_pred, TWO_INTEGER, truth ) )
          {
            final SubLObject possessor = kb_mapping_utilities.fpred_value( possessed, possessive_pred, TWO_INTEGER, ONE_INTEGER, truth );
            if( NIL != kb_indexing_datastructures.indexed_term_p( possessor ) && ConsesLow.list( possessed ).equal( kb_mapping_utilities.pred_values( possessor, possessive_pred, ONE_INTEGER, TWO_INTEGER, truth ) ) )
            {
              ans = el_utilities.make_binary_formula( possessive_pred, possessor, possessed );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
        csome_list_var = csome_list_var.rest();
        possessive_pred = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 108260L)
  public static SubLObject pph_find_possessive_sentence(final SubLObject possessed, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_find_possessive_sentence_internal( possessed, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym366$PPH_FIND_POSSESSIVE_SENTENCE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym366$PPH_FIND_POSSESSIVE_SENTENCE, TWO_INTEGER, $int367$200, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym366$PPH_FIND_POSSESSIVE_SENTENCE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( possessed, mt );
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
        if( possessed.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_find_possessive_sentence_internal( possessed, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( possessed, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 109009L)
  public static SubLObject pph_find_possessor(final SubLObject possessive_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var = $sym368$_POSSESSOR;
    final SubLObject possessed = cycl_utilities.formula_arg2( possessive_sentence, UNPROVIDED );
    final SubLObject ask_sentence = el_utilities.replace_formula_arg( ONE_INTEGER, var, possessive_sentence );
    final SubLObject possessors = Sequences.remove( possessed, pph_utilities.pph_ask_variable( var, ask_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    final SubLObject max_possessors = TEN_INTEGER;
    final SubLObject check_discourse_participantsP = pph_speech_act.pph_discourse_participants_knownP( UNPROVIDED );
    final SubLObject speaker = ( NIL != check_discourse_participantsP ) ? Sequences.find( pph_vars.$pph_speaker$.getDynamicValue( thread ), possessors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject addressee = ( NIL != check_discourse_participantsP ) ? Sequences.find( pph_vars.$pph_addressee$.getDynamicValue( thread ), possessors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    if( NIL != speaker && NIL != addressee )
    {
      return pph_methods_lexicon.pph_pronoun_nart( $list369, $const370$PossessivePronoun_Pre );
    }
    if( NIL != speaker )
    {
      return speaker;
    }
    if( NIL != addressee )
    {
      return addressee;
    }
    if( NIL != list_utilities.singletonP( possessors ) )
    {
      return possessors.first();
    }
    if( NIL == possessors )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str371$Couldn_t_find_possessor_for__S, possessed );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
      return cycl_utilities.formula_arg1( possessive_sentence, UNPROVIDED );
    }
    return el_utilities.make_el_formula( $const372$TheCoordinationSet, list_utilities.first_n( max_possessors, possessors ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 110167L)
  public static SubLObject pph_find_possessive_support(final SubLObject possessor, final SubLObject possessed, final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject possessive_support = NIL;
    if( NIL == possessive_support )
    {
      SubLObject csome_list_var = justification;
      SubLObject support = NIL;
      support = csome_list_var.first();
      while ( NIL == possessive_support && NIL != csome_list_var)
      {
        if( NIL != assertions_high.gaf_assertionP( support ) && assertions_high.gaf_arg1( support ).equal( possessor ) && assertions_high.gaf_arg2( support ).equal( possessed ) && NIL != genl_predicates.genl_predP(
            assertions_high.gaf_arg0( support ), $const364$possessiveRelation, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), UNPROVIDED ) && NIL == Sequences.remove( possessed, pph_utilities.pph_ask_variable(
                $sym373$_POSSESSED, el_utilities.replace_formula_arg( TWO_INTEGER, $sym373$_POSSESSED, assertions_high.gaf_formula( support ) ), pph_vars.$pph_domain_mt$.getDynamicValue( thread ), NIL, TWO_INTEGER ),
                UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          possessive_support = support;
        }
        csome_list_var = csome_list_var.rest();
        support = csome_list_var.first();
      }
    }
    return possessive_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 110790L)
  public static SubLObject pph_find_possessed_type(final SubLObject possessive_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( possessive_sentence, UNPROVIDED );
    SubLObject possessive_pred = NIL;
    SubLObject possessor = NIL;
    SubLObject possessed = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list374 );
    possessive_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list374 );
    possessor = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list374 );
    possessed = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject ans = NIL;
      if( NIL == ans )
      {
        SubLObject csome_list_var = kb_accessors.argn_isa( possessive_pred, TWO_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
        SubLObject supertype = NIL;
        supertype = csome_list_var.first();
        while ( NIL == ans && NIL != csome_list_var)
        {
          if( NIL == ans )
          {
            SubLObject csome_list_var_$95 = isa.isa( possessed, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), UNPROVIDED );
            SubLObject v_isa = NIL;
            v_isa = csome_list_var_$95.first();
            while ( NIL == ans && NIL != csome_list_var_$95)
            {
              if( NIL != pph_utilities.pph_genlP( v_isa, supertype, UNPROVIDED ) && NIL == pph_utilities.pph_irrelevant_fort( v_isa, UNPROVIDED, UNPROVIDED ) )
              {
                ans = v_isa;
              }
              csome_list_var_$95 = csome_list_var_$95.rest();
              v_isa = csome_list_var_$95.first();
            }
          }
          csome_list_var = csome_list_var.rest();
          supertype = csome_list_var.first();
        }
      }
      return ans;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list374 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 111625L)
  public static SubLObject prefer_unlexified_formP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
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
        SubLObject csome_list_var = $use_unlexified_form_for_instances$.getDynamicValue( thread );
        SubLObject x = NIL;
        x = csome_list_var.first();
        while ( NIL == ans && NIL != csome_list_var)
        {
          if( NIL != pph_utilities.pph_isaP( v_object, x, UNPROVIDED ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str376$_S_is_an_instance_of__S__so_using, v_object, x, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            ans = T;
          }
          csome_list_var = csome_list_var.rest();
          x = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL == ans )
    {
      ans = subl_promotions.memberP( v_object, $use_unlexified_form$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 112231L)
  public static SubLObject prefer_unlexified_form_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    return ( NIL != prefer_unlexified_formP( v_term ) ) ? unlexified_term_method( v_term, UNPROVIDED ) : ConsesLow.list( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 112457L)
  public static SubLObject use_as_is_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    SubLObject ans = ConsesLow.list( NIL, NIL );
    if( NIL != pph_utilities.always_use_nameP( v_term ) )
    {
      ans = coerce_name_method( v_term, UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 112702L)
  public static SubLObject coerce_name_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    return reader.bq_cons( misc_kb_utilities.coerce_name( v_term ), $list377 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 112852L)
  public static SubLObject licensed_definite_description_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw50$ANY;
    }
    SubLObject item = NIL;
    if( NIL == item )
    {
      SubLObject csome_list_var;
      SubLObject type;
      for( csome_list_var = licensed_definite_description_types_for_term( v_term, nl_preds ), type = NIL, type = csome_list_var.first(); NIL == item && NIL != csome_list_var; item = generate_definite_description_item(
          v_term, type, nl_preds ), csome_list_var = csome_list_var.rest(), type = csome_list_var.first() )
      {
      }
    }
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 113137L)
  public static SubLObject licensed_definite_description_types_for_term(final SubLObject v_term, final SubLObject nl_preds)
  {
    if( NIL != pph_utilities.pph_pred_licensed_by_predsP( $const172$definiteDescriptions, nl_preds ) && NIL != pph_vars.definite_description_licensed_for_termP( v_term ) )
    {
      return pph_utilities.pph_salient_generalizations( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 113395L)
  public static SubLObject coerced_definite_description_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw50$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != pph_vars.$pph_coerce_definite_descriptions_for_unlexified_termsP$.getDynamicValue( thread ) )
    {
      final SubLObject generalization = pph_utilities.pph_salient_generalization( v_term, UNPROVIDED, UNPROVIDED );
      if( NIL != generalization )
      {
        ans = generate_definite_description_item( v_term, generalization, nl_preds );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 113854L)
  public static SubLObject generate_definite_description_item(final SubLObject v_term, final SubLObject type, final SubLObject nl_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == pph_utilities.pph_isaP( v_term, type, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject phrase = pph_templates.pph_phrasify_phrase_naut( ConsesLow.list( pph_functions.bestdetnbarfn_definite(), ConsesLow.list( pph_functions.termparaphrasefn_constrained(), $const24$nonPlural_Generic,
        type ) ), UNPROVIDED );
    pph_phrase.pph_phrase_set_cycl( phrase, v_term );
    pph_phrase.pph_phrase_set_agr_preds( phrase, nl_preds, UNPROVIDED );
    final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    try
    {
      pph_vars.$pph_demerit_cutoff$.bind( pph_macros.compute_new_pph_demerit_cutoff( TWO_INTEGER ), thread );
      pph_main.pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0, thread );
    }
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      pph_phrase.pph_phrase_consolidate_output_list( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      pph_phrase.pph_phrase_set_output_list_cycl( phrase, v_term );
      return pph_phrase.pph_phrase_output_list( phrase ).first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 114494L)
  public static SubLObject unlexified_term_method(final SubLObject v_term, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      missing_knowledge_discovery_events.post_unlexified_term_discovery_event( v_term, pph_vars.$pph_language_mt$.getDynamicValue( thread ), pph_vars.$pph_domain_mt$.getDynamicValue( thread ), nl_preds );
    }
    SubLObject ans = NIL;
    if( NIL == pph_vars.$pph_guess_names_for_unlexified_termsP$.getDynamicValue( thread ) )
    {
      ans = print_high.prin1_to_string( v_term );
    }
    else if( NIL != misc_kb_utilities.nat_objectP( v_term ) )
    {
      ans = misc_kb_utilities.coerce_name( v_term );
    }
    else
    {
      ans = kb_utilities.string_for_unlexified_term( v_term, UNPROVIDED );
      ans = ( ( NIL != fort_types_interface.collection_p( v_term ) ) ? string_utilities.string_downcase_except_acronyms( ans ) : string_utilities.capitalize_first( ans ) );
    }
    return reader.bq_cons( ans, $list377 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 115139L)
  public static SubLObject pph_gender_p_internal(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    return isa.isaP( obj, $const379$NLGenderAttribute, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 115139L)
  public static SubLObject pph_gender_p(final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_gender_p_internal( obj, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym378$PPH_GENDER_P, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym378$PPH_GENDER_P, TWO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym378$PPH_GENDER_P, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( obj, mt );
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
        if( obj.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_gender_p_internal( obj, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( obj, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 115299L)
  public static SubLObject pph_gender(final SubLObject exp)
  {
    if( NIL != cycl_variables.el_varP( exp ) )
    {
      return pph_gender_of_var( exp );
    }
    return pph_gender_of_term( exp, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 115532L)
  public static SubLObject pph_number(final SubLObject exp)
  {
    if( NIL != cycl_variables.el_varP( exp ) )
    {
      return pph_number_of_var( exp );
    }
    return pph_number_of_term( exp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 115801L)
  public static SubLObject pph_same_genderP(final SubLObject exp1, final SubLObject exp2)
  {
    return Equality.equal( pph_gender( exp1 ), pph_gender( exp2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 116135L)
  public static SubLObject pph_same_numberP(final SubLObject exp1, final SubLObject exp2)
  {
    return Equality.equal( pph_number( exp1 ), pph_number( exp2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 116372L)
  public static SubLObject pph_same_gender_and_numberP(final SubLObject exp1, final SubLObject exp2)
  {
    return makeBoolean( NIL != pph_same_genderP( exp1, exp2 ) && NIL != pph_same_numberP( exp1, exp2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 116654L)
  public static SubLObject pph_unify_gender(final SubLObject gen1, final SubLObject gen2)
  {
    if( gen1.eql( gen2 ) )
    {
      return gen1;
    }
    if( NIL == pph_utilities.pph_english_contextP( UNPROVIDED ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      format_nil.force_format( T, $str380$Defaulting_to_English_gender_unif, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != subl_promotions.memberP( $const381$Masculine_NLAttr, ConsesLow.list( gen1, gen2 ), UNPROVIDED, UNPROVIDED ) )
    {
      return $const381$Masculine_NLAttr;
    }
    if( NIL != subl_promotions.memberP( $const382$Feminine_NLAttr, ConsesLow.list( gen1, gen2 ), UNPROVIDED, UNPROVIDED ) )
    {
      return $const382$Feminine_NLAttr;
    }
    if( NIL != subl_promotions.memberP( $const383$Neuter_NLAttr, ConsesLow.list( gen1, gen2 ), UNPROVIDED, UNPROVIDED ) )
    {
      return $const383$Neuter_NLAttr;
    }
    return $const384$Ungendered_NLAttr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 117388L)
  public static SubLObject pph_unify_number(final SubLObject num1, final SubLObject num2)
  {
    return ( num1.eql( $const385$Plural_NLAttr ) || num2.eql( $const385$Plural_NLAttr ) ) ? $const385$Plural_NLAttr : $const386$Singular_NLAttr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 117726L)
  public static SubLObject pph_unify_person(final SubLObject pers1, final SubLObject pers2)
  {
    if( pers1.eql( $const387$ThirdPerson_NLAttr ) && pers2.eql( $const387$ThirdPerson_NLAttr ) )
    {
      return $const387$ThirdPerson_NLAttr;
    }
    if( pers1.eql( $const388$FirstPerson_NLAttr ) || pers2.eql( $const388$FirstPerson_NLAttr ) )
    {
      return $const388$FirstPerson_NLAttr;
    }
    return $const389$SecondPerson_NLAttr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 118176L)
  public static SubLObject pph_gender_of_var(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject type = ( NIL != pph_variable_handling.pph_var_registeredP( var ) ) ? pph_variable_handling.pph_cycl_var_type( var ) : NIL;
    final SubLObject the_language = pph_language_of_mt( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    return ( NIL != type && NIL != the_language ) ? pph_gender_of_var_type( type, the_language )
        : ( ( NIL != the_language ) ? pph_default_grammatical_gender_for_language( the_language, UNPROVIDED ) : pph_default_grammatical_gender() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 118663L)
  public static SubLObject pph_gender_of_var_type(final SubLObject type, final SubLObject the_language)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_utilities.specs_fn_natP( type ) )
    {
      return pph_default_grammatical_gender_for_language( the_language, UNPROVIDED );
    }
    if( NIL != cycl_variables.el_varP( type ) )
    {
      return pph_default_grammatical_gender_for_language( the_language, UNPROVIDED );
    }
    final SubLObject gender = pph_utilities.pph_ask_variable_new( $sym390$_GENDER, ConsesLow.listS( $const391$languageUsesGrammaticalGender, the_language, type, $list392 ), pph_vars.$pph_language_mt$.getDynamicValue(
        thread ), $list393 ).first();
    if( NIL == gender && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str394$Couldn_t_find_gender_for__S_in__S, type, the_language );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return ( NIL != gender ) ? gender : pph_default_grammatical_gender_for_language( the_language, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 119379L)
  public static SubLObject pph_language_of_mt(final SubLObject mt)
  {
    return lexicon_utilities.language_of_lexicon( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 119642L)
  public static SubLObject pph_english_lexical_mtP(final SubLObject mt)
  {
    final SubLObject language = pph_language_of_mt( mt );
    SubLObject known_english_variantP = conses_high.member( language, $known_english_variants$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL == known_english_variantP && NIL != pph_utilities.pph_isaP( language, $const396$LanguageDialect, UNPROVIDED ) && NIL != pph_utilities.pph_ask_boolean( ConsesLow.list( $const397$dialects,
        $const398$EnglishLanguage, language ), $const15$InferencePSC, UNPROVIDED ) )
    {
      known_english_variantP = T;
      $known_english_variants$.setGlobalValue( ConsesLow.cons( language, $known_english_variants$.getGlobalValue() ) );
    }
    return known_english_variantP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 120157L)
  public static SubLObject pph_non_english_lexical_mtP(final SubLObject mt)
  {
    final SubLObject language = pph_language_of_mt( mt );
    return makeBoolean( NIL != language && NIL == pph_english_lexical_mtP( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 120465L)
  public static SubLObject pph_default_grammatical_gender()
  {
    return $pph_default_grammatical_gender$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 120557L)
  public static SubLObject pph_default_grammatical_gender_for_language_internal(final SubLObject language, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const400$GeneralLexiconMt;
    }
    final SubLObject gender = pph_utilities.pph_ask_variable_new( $sym390$_GENDER, ConsesLow.listS( $const401$defaultGrammaticalGender, language, $list392 ), mt, UNPROVIDED ).first();
    return ( NIL != gender ) ? gender : pph_default_grammatical_gender();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 120557L)
  public static SubLObject pph_default_grammatical_gender_for_language(final SubLObject language, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const400$GeneralLexiconMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pph_default_grammatical_gender_for_language_internal( language, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym399$PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym399$PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, TWO_INTEGER, EIGHT_INTEGER, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym399$PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( language, mt );
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
        if( language.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pph_default_grammatical_gender_for_language_internal( language, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( language, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 120905L)
  public static SubLObject pph_number_of_var(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_drs.pph_discourse_referentP( var ) )
    {
      return pph_drs.pph_discourse_number_for_cycl( var );
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str402$pph_number_of_var_guessing_that__, var );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return $const386$Singular_NLAttr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 121279L)
  public static SubLObject pph_number_of_term(final SubLObject v_term)
  {
    if( NIL != pph_drs.pph_discourse_referentP( v_term ) )
    {
      return pph_drs.pph_discourse_number_for_cycl( v_term );
    }
    return pph_number_from_cycl( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 121527L)
  public static SubLObject pph_number_from_cycl(final SubLObject v_term)
  {
    if( NIL != pph_utilities.pph_isaP( v_term, $const403$Group, UNPROVIDED ) && NIL == pph_utilities.pph_isaP( v_term, $const404$Agent_Generic, UNPROVIDED ) && NIL == pph_utilities.pph_isaP( v_term,
        $const405$ConceptualWorkSeries, UNPROVIDED ) )
    {
      return $const385$Plural_NLAttr;
    }
    return $const386$Singular_NLAttr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 121773L)
  public static SubLObject pph_gender_of_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_enhanced_domain_mt( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject the_language = pph_language_of_mt( pph_vars.$pph_language_mt$.getDynamicValue( thread ) );
    SubLObject gender = NIL;
    final SubLObject query_sentence = ConsesLow.listS( $const406$licensedGrammaticalGender, the_language, v_term, $list392 );
    SubLObject timed_outP = NIL;
    if( NIL != the_language && NIL != el_utilities.closedP( v_term, UNPROVIDED ) )
    {
      final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
      try
      {
        thread.throwStack.push( tag );
        final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
        try
        {
          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
          SubLObject timer = NIL;
          try
          {
            final SubLObject _prev_bind_0_$96 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
              timer = subl_macro_promotions.with_timeout_start_timer( TWO_INTEGER, tag );
              gender = pph_utilities.pph_ask_variable_new( $sym390$_GENDER, query_sentence, mt, $list393 ).first();
            }
            finally
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$96, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              subl_macro_promotions.with_timeout_stop_timer( timer );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
            }
          }
        }
        finally
        {
          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    if( NIL == gender && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str407$Couldn_t_find_a_gender_for__S_in_, v_term, mt );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    if( NIL != timed_outP || gender.eql( $const384$Ungendered_NLAttr ) )
    {
      gender = adjust_gender_for_top_level_cycl( v_term, gender, the_language );
    }
    return ( NIL != gender ) ? gender : ( ( NIL != the_language ) ? pph_default_grammatical_gender_for_language( the_language, UNPROVIDED ) : pph_default_grammatical_gender() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 122712L)
  public static SubLObject adjust_gender_for_top_level_cycl(final SubLObject v_term, final SubLObject gender, final SubLObject the_language)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cycl_grammar.cycl_sentence_p( pph_vars.pph_top_level_cycl() ) && NIL != el_utilities.groundP( pph_vars.pph_top_level_cycl(), UNPROVIDED ) )
    {
      final SubLObject var = $sym25$_X;
      final SubLObject formula = cycl_utilities.formula_subst( var, v_term, pph_vars.pph_top_level_cycl(), UNPROVIDED, UNPROVIDED );
      final SubLObject constraints = pph_variable_handling.pph_variable_isa_constraints( var, formula, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), T, T, UNPROVIDED );
      SubLObject cdolist_list_var = pph_utilities.pph_ask_template( $list410, ConsesLow.listS( $const391$languageUsesGrammaticalGender, the_language, $list411 ), pph_vars.$pph_language_mt$.getDynamicValue( thread ),
          UNPROVIDED, UNPROVIDED );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject type = NIL;
        SubLObject adjusted_gender = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list408 );
        type = current.first();
        current = ( adjusted_gender = current.rest() );
        if( NIL != subl_promotions.memberP( type, constraints, $sym409$SPEC_, UNPROVIDED ) )
        {
          return adjusted_gender;
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    return gender;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 123299L)
  public static SubLObject pph_person(final SubLObject exp)
  {
    if( NIL != pph_drs.pph_discourse_referentP( exp ) )
    {
      return pph_drs.pph_discourse_person_for_cycl( exp );
    }
    return pph_default_person();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-methods.lisp", position = 123576L)
  public static SubLObject pph_default_person()
  {
    return $const387$ThirdPerson_NLAttr;
  }

  public static SubLObject declare_pph_methods_file()
  {
    SubLFiles.declareFunction( me, "funcall_pph_method", "FUNCALL-PPH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_skolem_term_with_name", "GENERATE-SKOLEM-TERM-WITH-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_generate_skolem_name", "CLEAR-GENERATE-SKOLEM-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_generate_skolem_name", "REMOVE-GENERATE-SKOLEM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_skolem_name_internal", "GENERATE-SKOLEM-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_skolem_name", "GENERATE-SKOLEM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_capitalize_smart", "PPH-CAPITALIZE-SMART", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_skolem_term_existentially", "GENERATE-SKOLEM-TERM-EXISTENTIALLY", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_skolem_term_existentially_int", "GENERATE-SKOLEM-TERM-EXISTENTIALLY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_skolem_nat_find_type", "PPH-SKOLEM-NAT-FIND-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_min_isa", "PPH-MIN-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_type_is_collection_p", "ARG-TYPE-IS-COLLECTION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_hypothetical", "GENERATE-HYPOTHETICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_cycl_variable", "GENERATE-CYCL-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_set_var_arg_position", "PPH-PHRASE-SET-VAR-ARG-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_set_var_type_arg_positions", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_set_var_type_arg_position", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITION", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_set_arg_position_for_cycl", "PPH-PHRASE-SET-ARG-POSITION-FOR-CYCL", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_var_ok_for_lexifyingP", "PPH-VAR-OK-FOR-LEXIFYING?", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_paraphrase_var_as_var", "PPH-PARAPHRASE-VAR-AS-VAR", 1, 2, false );
    SubLFiles.declareFunction( me, "pph_instance_of_item", "PPH-INSTANCE-OF-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_maybe_italicize_variable_phrase", "PPH-MAYBE-ITALICIZE-VARIABLE-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_italicize_variablesP", "PPH-ITALICIZE-VARIABLES?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_var_phrase_prefix_items", "PPH-VAR-PHRASE-PREFIX-ITEMS", 1, 1, false );
    SubLFiles.declareFunction( me, "var_functional_in_matrix_sentenceP", "VAR-FUNCTIONAL-IN-MATRIX-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_paraphrase_var_with_type", "PPH-PARAPHRASE-VAR-WITH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_lexify_var", "PPH-LEXIFY-VAR", 3, 3, false );
    SubLFiles.declareFunction( me, "pph_use_other_for_varP", "PPH-USE-OTHER-FOR-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_var_type_for_lexification", "PPH-VAR-TYPE-FOR-LEXIFICATION", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_var_type_for_lexification_internal", "PPH-VAR-TYPE-FOR-LEXIFICATION-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_highly_faceted_typeP", "PPH-HIGHLY-FACETED-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_var_arg_position_map", "PPH-VAR-ARG-POSITION-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "determiner_type_for_var_phrase", "DETERMINER-TYPE-FOR-VAR-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_var_phrase_var_bound_by_universal_introductionP", "PPH-VAR-PHRASE-VAR-BOUND-BY-UNIVERSAL-INTRODUCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_var_phrase_in_if_clauseP", "PPH-VAR-PHRASE-IN-IF-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_npi_licensor", "PPH-NPI-LICENSOR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_npi_licensor_int", "PPH-NPI-LICENSOR-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_downward_entailing_operator_p", "PPH-DOWNWARD-ENTAILING-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_operator_downward_entailing_in_which_arg", "PPH-OPERATOR-DOWNWARD-ENTAILING-IN-WHICH-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_maybe_add_disambiguation", "PPH-PHRASE-MAYBE-ADD-DISAMBIGUATION", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_maybe_add_other", "PPH-PHRASE-MAYBE-ADD-OTHER", 2, 0, false );
    SubLFiles.declareFunction( me, "different_instance_same_typeP", "DIFFERENT-INSTANCE-SAME-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_add_other", "PPH-PHRASE-ADD-OTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_add_english_other", "PPH-PHRASE-ADD-ENGLISH-OTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "split_english_determiner_off", "SPLIT-ENGLISH-DETERMINER-OFF", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_add_english_other_to_olists", "PPH-ADD-ENGLISH-OTHER-TO-OLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_maybe_explicitify_var_phrase", "PPH-PHRASE-MAYBE-EXPLICITIFY-VAR-PHRASE", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_explicitify_var_phrase", "PPH-PHRASE-EXPLICITIFY-VAR-PHRASE", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_keyword", "GENERATE-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_cycl_symbol", "GENERATE-CYCL-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_non_cycl_symbol", "GENERATE-NON-CYCL-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_constant_default", "GENERATE-CONSTANT-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_lexical_word", "GENERATE-LEXICAL-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_chemical_substance_type", "GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "do_generate_chemical_substance_type", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_chemical_substance_type_from_formula_string", "GENERATE-CHEMICAL-SUBSTANCE-TYPE-FROM-FORMULA-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_chemical_formula_html_output_items", "PPH-CHEMICAL-FORMULA-HTML-OUTPUT-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "do_generate_chemical_substance_type_semantic", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE-SEMANTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_chemical_composition", "PPH-CHEMICAL-COMPOSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_electrical_charge_of_substance_type", "PPH-ELECTRICAL-CHARGE-OF-SUBSTANCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_molecule_types", "PPH-MOLECULE-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "select_string_method_count", "SELECT-STRING-METHOD-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "select_string_method", "SELECT-STRING-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "equal_pph_nl_predsP", "EQUAL-PPH-NL-PREDS?", 2, 0, false );
    SubLFiles.declareFunction( me, "omit_pph_select_string_method_p", "OMIT-PPH-SELECT-STRING-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_update_phrase_with_method_result", "PPH-UPDATE-PHRASE-WITH-METHOD-RESULT", 9, 0, false );
    SubLFiles.declareFunction( me, "pph_demerit_cutoff_for_quality", "PPH-DEMERIT-CUTOFF-FOR-QUALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_try_method", "PPH-TRY-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "pph_process_method_result", "PPH-PROCESS-METHOD-RESULT", 6, 0, false );
    SubLFiles.declareFunction( me, "pph_category_for_disambiguation", "PPH-CATEGORY-FOR-DISAMBIGUATION", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_filter_method_results", "PPH-FILTER-METHOD-RESULTS", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_revised_nl_preds_for_phrase", "PPH-REVISED-NL-PREDS-FOR-PHRASE", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_pred_ok_for_qualityP", "PPH-PRED-OK-FOR-QUALITY?", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_genl_lexicon_predicateP", "PPH-GENL-LEXICON-PREDICATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "select_string_for_term_internal", "SELECT-STRING-FOR-TERM-INTERNAL", 1, 4, false );
    SubLFiles.declareFunction( me, "select_string_for_term", "SELECT-STRING-FOR-TERM", 1, 4, false );
    SubLFiles.declareFunction( me, "clear_pph_name_string_preds", "CLEAR-PPH-NAME-STRING-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_name_string_preds", "REMOVE-PPH-NAME-STRING-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_name_string_preds_internal", "PPH-NAME-STRING-PREDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_name_string_preds", "PPH-NAME-STRING-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_pph_term_string_preds", "CLEAR-PPH-TERM-STRING-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_term_string_preds", "REMOVE-PPH-TERM-STRING-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_term_string_preds_internal", "PPH-TERM-STRING-PREDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_term_string_preds", "PPH-TERM-STRING-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "name_string_method", "NAME-STRING-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "name_string_method_int", "NAME-STRING-METHOD-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_name_string_preds_from_nl_pred_specification", "PPH-NAME-STRING-PREDS-FROM-NL-PRED-SPECIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_name_ok_for_preds_and_cyclP", "PPH-NAME-OK-FOR-PREDS-AND-CYCL?", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_name_string_preds_from_nl_preds", "PPH-NAME-STRING-PREDS-FROM-NL-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_standard_name_string_predP", "PPH-STANDARD-NAME-STRING-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_enhanced_domain_mt", "CLEAR-PPH-ENHANCED-DOMAIN-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_enhanced_domain_mt", "REMOVE-PPH-ENHANCED-DOMAIN-MT", 0, 2, false );
    SubLFiles.declareFunction( me, "pph_enhanced_domain_mt_internal", "PPH-ENHANCED-DOMAIN-MT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_enhanced_domain_mt", "PPH-ENHANCED-DOMAIN-MT", 0, 2, false );
    SubLFiles.declareFunction( me, "pph_broaden_language_mt", "PPH-BROADEN-LANGUAGE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_dispreferred_assertionP", "PPH-DISPREFERRED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_do_name_string_method", "PPH-DO-NAME-STRING-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "name_string_gaf_strings_internal", "NAME-STRING-GAF-STRINGS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "name_string_gaf_strings", "NAME-STRING-GAF-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_no_abbreviation_predsP", "PPH-NO-ABBREVIATION-PREDS?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_non_abbreviation_name_predP", "PPH-NON-ABBREVIATION-NAME-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_methods_caches", "CLEAR-PPH-METHODS-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_abbreviation_predP", "PPH-ABBREVIATION-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_pph_abbreviation_preds", "CLEAR-PPH-ABBREVIATION-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_abbreviation_preds", "REMOVE-PPH-ABBREVIATION-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_abbreviation_preds_internal", "PPH-ABBREVIATION-PREDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_abbreviation_preds", "PPH-ABBREVIATION-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "any_name_string_method", "ANY-NAME-STRING-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "name_string_method_non_acronym", "NAME-STRING-METHOD-NON-ACRONYM", 1, 1, false );
    SubLFiles.declareFunction( me, "smart_decapitalize", "SMART-DECAPITALIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_starts_with_determinerP", "PPH-STARTS-WITH-DETERMINER?", 1, 0, false );
    SubLFiles.declareFunction( me, "assume_det_is_part_of_nameP", "ASSUME-DET-IS-PART-OF-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_sort_name_string_preds", "PPH-SORT-NAME-STRING-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_prefer_name_string_predP", "PPH-PREFER-NAME-STRING-PRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_cache_method", "NL-GENERATION-CACHE-METHOD", 1, 1, false );
    new $nl_generation_cache_method$UnaryFunction();
    new $nl_generation_cache_method$BinaryFunction();
    SubLFiles.declareFunction( me, "term_string_method", "TERM-STRING-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "chemical_formula_method", "CHEMICAL-FORMULA-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "scientific_name_method", "SCIENTIFIC-NAME-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "pretty_string_method", "PRETTY-STRING-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "genitive_paraphrase_method", "GENITIVE-PARAPHRASE-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_nart_lexified_tight", "GENERATE-NART-LEXIFIED-TIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_nart_lexified_imprecise", "GENERATE-NART-LEXIFIED-IMPRECISE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_nart_methods_to_omit_for_precision", "PPH-NART-METHODS-TO-OMIT-FOR-PRECISION", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_nart_lexified", "GENERATE-NART-LEXIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_nart_as_naut", "GENERATE-NART-AS-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_adjust_nart_paraphrase_demerits", "MAYBE-ADJUST-NART-PARAPHRASE-DEMERITS", 1, 0, false );
    SubLFiles.declareFunction( me, "ok_gen_template_assertion_for_relnP_internal", "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "ok_gen_template_assertion_for_relnP", "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?", 2, 1, false );
    SubLFiles.declareFunction( me, "generate_universal_date", "GENERATE-UNIVERSAL-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_universal_date_numbers", "GENERATE-UNIVERSAL-DATE-NUMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_universal_second", "GENERATE-UNIVERSAL-SECOND", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_float", "GENERATE-FLOAT", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_float_items", "GENERATE-FLOAT-ITEMS", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_float_string", "PPH-FLOAT-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_standardize_float_string", "PPH-STANDARDIZE-FLOAT-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_integer_wXcommas", "GENERATE-INTEGER-W/COMMAS", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_integer_as_word", "GENERATE-INTEGER-AS-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_number_default", "GENERATE-NUMBER-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_ordinal_phrase_p", "PPH-ORDINAL-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_image_url_as_string", "GET-IMAGE-URL-AS-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_image_url", "GENERATE-IMAGE-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_princ", "GENERATE-PRINC", 1, 0, false );
    SubLFiles.declareFunction( me, "do_generate_princ", "DO-GENERATE-PRINC", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_default_mt_time_index", "PPH-DEFAULT-MT-TIME-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "generate_assertion", "GENERATE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_find_arg_starting_before", "PPH-FIND-ARG-STARTING-BEFORE", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_find_arg_ending_after", "PPH-FIND-ARG-ENDING-AFTER", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_time_interval_for_assertion", "PPH-TIME-INTERVAL-FOR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_ignore_temporal_qualification_for_assertionP", "PPH-IGNORE-TEMPORAL-QUALIFICATION-FOR-ASSERTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_irrelevant_date_wrt_assertion_contentP", "PPH-IRRELEVANT-DATE-WRT-ASSERTION-CONTENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_indexed_nautP", "PPH-INDEXED-NAUT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_support_creation_dates_internal", "PPH-SUPPORT-CREATION-DATES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_support_creation_dates", "PPH-SUPPORT-CREATION-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_support_creation_dates_recursive", "PPH-SUPPORT-CREATION-DATES-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_mt_time_index", "PPH-MT-TIME-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_monad_mt_time_precision_suspect_p", "PPH-MONAD-MT-TIME-PRECISION-SUSPECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_adjust_mt_time_index_granularity", "PPH-ADJUST-MT-TIME-INDEX-GRANULARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_adjust_mt_date_granularity_internal", "PPH-ADJUST-MT-DATE-GRANULARITY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_adjust_mt_date_granularity", "PPH-ADJUST-MT-DATE-GRANULARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_assertion_has_glossP", "PPH-ASSERTION-HAS-GLOSS?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_gloss_for_assertion", "PPH-GLOSS-FOR-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_output_list_to_assertion_output_list", "PPH-OUTPUT-LIST-TO-ASSERTION-OUTPUT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_list_from_assertion_output_list", "PPH-OUTPUT-LIST-FROM-ASSERTION-OUTPUT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "assertion_output_list_info_p", "ASSERTION-OUTPUT-LIST-INFO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_string", "GENERATE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_cycl_string_with_html", "GENERATE-CYCL-STRING-WITH-HTML", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_cycl_string_with_html_internal", "GENERATE-CYCL-STRING-WITH-HTML-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_cycl_list", "GENERATE-CYCL-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_rop_expression", "GENERATE-ROP-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_genitive", "GENERATE-GENITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_genitive_cycl", "PPH-GENITIVE-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_term_ok_for_genitive_paraphraseP", "PPH-TERM-OK-FOR-GENITIVE-PARAPHRASE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_dont_use_instances_for_genitive_paraphrase", "PPH-DONT-USE-INSTANCES-FOR-GENITIVE-PARAPHRASE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_possessive_preds", "CLEAR-PPH-POSSESSIVE-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_possessive_preds", "REMOVE-PPH-POSSESSIVE-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_possessive_preds_internal", "PPH-POSSESSIVE-PREDS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_possessive_preds", "PPH-POSSESSIVE-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_find_possessive_sentence_internal", "PPH-FIND-POSSESSIVE-SENTENCE-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_find_possessive_sentence", "PPH-FIND-POSSESSIVE-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_find_possessor", "PPH-FIND-POSSESSOR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_find_possessive_support", "PPH-FIND-POSSESSIVE-SUPPORT", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_find_possessed_type", "PPH-FIND-POSSESSED-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "prefer_unlexified_formP", "PREFER-UNLEXIFIED-FORM?", 1, 0, false );
    SubLFiles.declareFunction( me, "prefer_unlexified_form_method", "PREFER-UNLEXIFIED-FORM-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "use_as_is_method", "USE-AS-IS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "coerce_name_method", "COERCE-NAME-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "licensed_definite_description_method", "LICENSED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "licensed_definite_description_types_for_term", "LICENSED-DEFINITE-DESCRIPTION-TYPES-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "coerced_definite_description_method", "COERCED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_definite_description_item", "GENERATE-DEFINITE-DESCRIPTION-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "unlexified_term_method", "UNLEXIFIED-TERM-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_gender_p_internal", "PPH-GENDER-P-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_gender_p", "PPH-GENDER-P", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_gender", "PPH-GENDER", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_number", "PPH-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_same_genderP", "PPH-SAME-GENDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_same_numberP", "PPH-SAME-NUMBER?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_same_gender_and_numberP", "PPH-SAME-GENDER-AND-NUMBER?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_unify_gender", "PPH-UNIFY-GENDER", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_unify_number", "PPH-UNIFY-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_unify_person", "PPH-UNIFY-PERSON", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_gender_of_var", "PPH-GENDER-OF-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_gender_of_var_type", "PPH-GENDER-OF-VAR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_language_of_mt", "PPH-LANGUAGE-OF-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_english_lexical_mtP", "PPH-ENGLISH-LEXICAL-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_non_english_lexical_mtP", "PPH-NON-ENGLISH-LEXICAL-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_default_grammatical_gender", "PPH-DEFAULT-GRAMMATICAL-GENDER", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_default_grammatical_gender_for_language_internal", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_default_grammatical_gender_for_language", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_number_of_var", "PPH-NUMBER-OF-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_number_of_term", "PPH-NUMBER-OF-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_number_from_cycl", "PPH-NUMBER-FROM-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_gender_of_term", "PPH-GENDER-OF-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "adjust_gender_for_top_level_cycl", "ADJUST-GENDER-FOR-TOP-LEVEL-CYCL", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_person", "PPH-PERSON", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_default_person", "PPH-DEFAULT-PERSON", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_methods_file()
  {
    $generate_skolem_ids$ = SubLFiles.deflexical( "*GENERATE-SKOLEM-IDS*", dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $generate_skolem_name_caching_state$ = SubLFiles.deflexical( "*GENERATE-SKOLEM-NAME-CACHING-STATE*", NIL );
    $pph_facet_threshold$ = SubLFiles.defparameter( "*PPH-FACET-THRESHOLD*", NIL );
    $pph_assume_distinct_vars_require_different_bindingsP$ = SubLFiles.defparameter( "*PPH-ASSUME-DISTINCT-VARS-REQUIRE-DIFFERENT-BINDINGS?*", NIL );
    $select_string_method_count$ = SubLFiles.deflexical( "*SELECT-STRING-METHOD-COUNT*", maybeDefault( $sym148$_SELECT_STRING_METHOD_COUNT_, $select_string_method_count$, () -> ( Hashtables.make_hash_table( $int149$256,
        UNPROVIDED, UNPROVIDED ) ) ) );
    $select_string_methods$ = SubLFiles.defparameter( "*SELECT-STRING-METHODS*", $list150 );
    $pph_name_string_preds_caching_state$ = SubLFiles.deflexical( "*PPH-NAME-STRING-PREDS-CACHING-STATE*", NIL );
    $pph_term_string_preds_caching_state$ = SubLFiles.deflexical( "*PPH-TERM-STRING-PREDS-CACHING-STATE*", NIL );
    $pph_enhanced_domain_mt_caching_state$ = SubLFiles.deflexical( "*PPH-ENHANCED-DOMAIN-MT-CACHING-STATE*", NIL );
    $pph_abbreviation_preds_caching_state$ = SubLFiles.deflexical( "*PPH-ABBREVIATION-PREDS-CACHING-STATE*", NIL );
    $dispreferred_pph_name_string_preds$ = SubLFiles.deflexical( "*DISPREFERRED-PPH-NAME-STRING-PREDS*", $list229 );
    $english_integer_paraphrases$ = SubLFiles.deflexical( "*ENGLISH-INTEGER-PARAPHRASES*", $list272 );
    $english_tens_paraphrases$ = SubLFiles.deflexical( "*ENGLISH-TENS-PARAPHRASES*", $list273 );
    $pph_default_mt_time_index$ = SubLFiles.deflexical( "*PPH-DEFAULT-MT-TIME-INDEX*", ( maybeDefault( $sym292$_PPH_DEFAULT_MT_TIME_INDEX_, $pph_default_mt_time_index$, NIL ) ) );
    $ignore_misleading_time_parametersP$ = SubLFiles.defparameter( "*IGNORE-MISLEADING-TIME-PARAMETERS?*", NIL );
    $bad_collections_for_genitive_paraphrase$ = SubLFiles.deflexical( "*BAD-COLLECTIONS-FOR-GENITIVE-PARAPHRASE*", $list362 );
    $pph_possessive_preds_caching_state$ = SubLFiles.deflexical( "*PPH-POSSESSIVE-PREDS-CACHING-STATE*", NIL );
    $use_unlexified_form_for_instances$ = SubLFiles.defparameter( "*USE-UNLEXIFIED-FORM-FOR-INSTANCES*", NIL );
    $use_unlexified_form$ = SubLFiles.defparameter( "*USE-UNLEXIFIED-FORM*", $list375 );
    $known_english_variants$ = SubLFiles.deflexical( "*KNOWN-ENGLISH-VARIANTS*", $list395 );
    $pph_default_grammatical_gender$ = SubLFiles.deflexical( "*PPH-DEFAULT-GRAMMATICAL-GENDER*", $const383$Neuter_NLAttr );
    return NIL;
  }

  public static SubLObject setup_pph_methods_file()
  {
    pph_types.pph_register_method( $sym9$GENERATE_SKOLEM_TERM_WITH_NAME, $kw10$SKOLEM_TERM, $kw11$DECENT );
    memoization_state.note_globally_cached_function( $sym14$GENERATE_SKOLEM_NAME );
    pph_types.pph_register_method( $sym22$GENERATE_SKOLEM_TERM_EXISTENTIALLY, $kw10$SKOLEM_TERM, $kw11$DECENT );
    pph_types.pph_register_method( $sym33$GENERATE_HYPOTHETICAL, $kw34$HYPOTHETICAL, $kw35$BEST );
    pph_types.pph_register_method( $sym3$GENERATE_CYCL_VARIABLE, $kw38$VARIABLE, $kw35$BEST );
    pph_types.pph_register_method( $sym3$GENERATE_CYCL_VARIABLE, $kw39$LEXIFIED_VARIABLE, $kw35$BEST );
    pph_types.pph_register_method( $sym111$GENERATE_KEYWORD, $kw112$KEYWORD, $kw35$BEST );
    pph_types.pph_register_method( $sym113$GENERATE_CYCL_SYMBOL, $kw114$CYCL_SYMBOL, $kw35$BEST );
    pph_types.pph_register_method( $sym116$GENERATE_NON_CYCL_SYMBOL, $kw117$NON_CYCL_SYMBOL, $kw11$DECENT );
    pph_types.pph_register_method( $sym0$GENERATE_CONSTANT_DEFAULT, $kw119$CONSTANT, $kw35$BEST );
    pph_types.pph_register_method( $sym125$GENERATE_LEXICAL_WORD, $kw126$LEXICAL_WORD, $kw35$BEST );
    subl_macro_promotions.declare_defglobal( $sym148$_SELECT_STRING_METHOD_COUNT_ );
    memoization_state.note_memoized_function( $sym184$SELECT_STRING_FOR_TERM );
    memoization_state.note_globally_cached_function( $sym191$PPH_NAME_STRING_PREDS );
    memoization_state.note_globally_cached_function( $sym199$PPH_TERM_STRING_PREDS );
    memoization_state.note_globally_cached_function( $sym208$PPH_ENHANCED_DOMAIN_MT );
    memoization_state.note_memoized_function( $sym218$NAME_STRING_GAF_STRINGS );
    memoization_state.note_globally_cached_function( $sym221$PPH_ABBREVIATION_PREDS );
    pph_types.pph_register_method( $sym6$GENERATE_NART_LEXIFIED_TIGHT, $kw236$LEXIFIED_NART, $kw35$BEST );
    pph_types.pph_register_method( $sym5$GENERATE_NART_LEXIFIED_IMPRECISE, $kw236$LEXIFIED_NART, $kw11$DECENT );
    pph_types.pph_register_method( $sym4$GENERATE_NART_AS_NAUT, $kw241$NART, $kw35$BEST );
    memoization_state.note_memoized_function( $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_ );
    pph_types.pph_register_method( $sym249$GENERATE_UNIVERSAL_DATE, $kw250$UNIVERSAL_DATE, $kw35$BEST );
    pph_types.pph_register_method( $sym251$GENERATE_UNIVERSAL_DATE_NUMBERS, $kw250$UNIVERSAL_DATE, $kw252$FALLBACK );
    pph_types.pph_register_method( $sym253$GENERATE_UNIVERSAL_SECOND, $kw254$UNIVERSAL_SECOND, $kw35$BEST );
    pph_types.pph_register_method( $sym258$GENERATE_FLOAT, $kw259$FLOAT, $kw35$BEST );
    pph_types.pph_register_method( $sym277$GENERATE_NUMBER_DEFAULT, $kw278$NUMBER, $kw35$BEST );
    pph_types.pph_register_method( $sym285$GENERATE_IMAGE_URL, $kw286$IMAGE_URL, $kw35$BEST );
    pph_types.pph_register_method( $sym289$GENERATE_PRINC, $kw290$OBJECT, $kw252$FALLBACK );
    pph_types.pph_register_method( $sym289$GENERATE_PRINC, $kw291$SYMBOL, $kw252$FALLBACK );
    subl_macro_promotions.declare_defglobal( $sym292$_PPH_DEFAULT_MT_TIME_INDEX_ );
    pph_types.pph_register_method( $sym294$GENERATE_ASSERTION, $kw295$ASSERTION, $kw35$BEST );
    memoization_state.note_memoized_function( $sym317$PPH_SUPPORT_CREATION_DATES );
    generic_testing.define_test_case_table_int( $sym324$PPH_MT_TIME_INDEX, ConsesLow.list( new SubLObject[] { $kw325$TEST, EQUAL, $kw326$OWNER, NIL, $kw327$CLASSES, $list328, $kw329$KB, $kw330$FULL, $kw331$WORKING_, T
    } ), $list332 );
    memoization_state.note_memoized_function( $sym341$PPH_ADJUST_MT_DATE_GRANULARITY );
    generic_testing.define_test_case_table_int( $sym348$PPH_ADJUST_MT_TIME_INDEX_GRANULARITY, ConsesLow.list( new SubLObject[] { $kw325$TEST, EQUAL, $kw326$OWNER, NIL, $kw327$CLASSES, $list328, $kw329$KB, $kw330$FULL,
      $kw331$WORKING_, T
    } ), $list349 );
    pph_types.pph_register_method( $sym8$GENERATE_STRING, $kw355$STRING, $kw35$BEST );
    pph_types.pph_register_method( $sym2$GENERATE_CYCL_LIST, $kw357$LIST, $kw11$DECENT );
    pph_types.pph_register_method( $sym358$GENERATE_ROP_EXPRESSION, $kw359$ROP_EXPRESSION, $kw11$DECENT );
    memoization_state.note_globally_cached_function( $sym363$PPH_POSSESSIVE_PREDS );
    memoization_state.note_memoized_function( $sym366$PPH_FIND_POSSESSIVE_SENTENCE );
    memoization_state.note_memoized_function( $sym378$PPH_GENDER_P );
    memoization_state.note_memoized_function( $sym399$PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_methods_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_methods_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_methods_file();
  }
  static
  {
    me = new pph_methods();
    $generate_skolem_ids$ = null;
    $generate_skolem_name_caching_state$ = null;
    $pph_facet_threshold$ = null;
    $pph_assume_distinct_vars_require_different_bindingsP$ = null;
    $select_string_method_count$ = null;
    $select_string_methods$ = null;
    $pph_name_string_preds_caching_state$ = null;
    $pph_term_string_preds_caching_state$ = null;
    $pph_enhanced_domain_mt_caching_state$ = null;
    $pph_abbreviation_preds_caching_state$ = null;
    $dispreferred_pph_name_string_preds$ = null;
    $english_integer_paraphrases$ = null;
    $english_tens_paraphrases$ = null;
    $pph_default_mt_time_index$ = null;
    $ignore_misleading_time_parametersP$ = null;
    $bad_collections_for_genitive_paraphrase$ = null;
    $pph_possessive_preds_caching_state$ = null;
    $use_unlexified_form_for_instances$ = null;
    $use_unlexified_form$ = null;
    $known_english_variants$ = null;
    $pph_default_grammatical_gender$ = null;
    $sym0$GENERATE_CONSTANT_DEFAULT = makeSymbol( "GENERATE-CONSTANT-DEFAULT" );
    $sym1$GENERATE_ATOMIC_FORMULA = makeSymbol( "GENERATE-ATOMIC-FORMULA" );
    $sym2$GENERATE_CYCL_LIST = makeSymbol( "GENERATE-CYCL-LIST" );
    $sym3$GENERATE_CYCL_VARIABLE = makeSymbol( "GENERATE-CYCL-VARIABLE" );
    $sym4$GENERATE_NART_AS_NAUT = makeSymbol( "GENERATE-NART-AS-NAUT" );
    $sym5$GENERATE_NART_LEXIFIED_IMPRECISE = makeSymbol( "GENERATE-NART-LEXIFIED-IMPRECISE" );
    $sym6$GENERATE_NART_LEXIFIED_TIGHT = makeSymbol( "GENERATE-NART-LEXIFIED-TIGHT" );
    $sym7$GENERATE_PHRASE_FROM_TEMPLATE = makeSymbol( "GENERATE-PHRASE-FROM-TEMPLATE" );
    $sym8$GENERATE_STRING = makeSymbol( "GENERATE-STRING" );
    $sym9$GENERATE_SKOLEM_TERM_WITH_NAME = makeSymbol( "GENERATE-SKOLEM-TERM-WITH-NAME" );
    $kw10$SKOLEM_TERM = makeKeyword( "SKOLEM-TERM" );
    $kw11$DECENT = makeKeyword( "DECENT" );
    $kw12$HTML = makeKeyword( "HTML" );
    $const13$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $sym14$GENERATE_SKOLEM_NAME = makeSymbol( "GENERATE-SKOLEM-NAME" );
    $const15$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw16$TEXT = makeKeyword( "TEXT" );
    $const17$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str18$Object = makeString( "Object" );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) );
    $str20$_ = makeString( "-" );
    $sym21$_GENERATE_SKOLEM_NAME_CACHING_STATE_ = makeSymbol( "*GENERATE-SKOLEM-NAME-CACHING-STATE*" );
    $sym22$GENERATE_SKOLEM_TERM_EXISTENTIALLY = makeSymbol( "GENERATE-SKOLEM-TERM-EXISTENTIALLY" );
    $kw23$INDEFINITE = makeKeyword( "INDEFINITE" );
    $const24$nonPlural_Generic = constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) );
    $sym25$_X = makeSymbol( "?X" );
    $sym26$TOU_ATOMIC_SENTENCE_ = makeSymbol( "TOU-ATOMIC-SENTENCE?" );
    $list27 = ConsesLow.list( makeSymbol( "HL-VAR" ), makeSymbol( "NAUT" ) );
    $sym28$NAT_FUNCTION = makeSymbol( "NAT-FUNCTION" );
    $list29 = ConsesLow.list( makeKeyword( "MODES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ReformulatorMode-Tersify" ) ) ) );
    $sym30$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const31$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const32$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym33$GENERATE_HYPOTHETICAL = makeSymbol( "GENERATE-HYPOTHETICAL" );
    $kw34$HYPOTHETICAL = makeKeyword( "HYPOTHETICAL" );
    $kw35$BEST = makeKeyword( "BEST" );
    $sym36$NAME_STRING_METHOD = makeSymbol( "NAME-STRING-METHOD" );
    $const37$singular_Generic = constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) );
    $kw38$VARIABLE = makeKeyword( "VARIABLE" );
    $kw39$LEXIFIED_VARIABLE = makeKeyword( "LEXIFIED-VARIABLE" );
    $list40 = ConsesLow.cons( makeSymbol( "FROM-PREFIX" ), makeSymbol( "TO-PREFIX" ) );
    $const41$Instance_TheWord = constant_handles.reader_make_constant_shell( makeString( "Instance-TheWord" ) );
    $const42$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $str43$instance = makeString( "instance" );
    $str44$_of = makeString( " of" );
    $str45$some = makeString( "some" );
    $kw46$UNIVERSAL = makeKeyword( "UNIVERSAL" );
    $str47$every = makeString( "every" );
    $kw48$NO = makeKeyword( "NO" );
    $str49$no = makeString( "no" );
    $kw50$ANY = makeKeyword( "ANY" );
    $str51$any = makeString( "any" );
    $sym52$ATOMIC_SENTENCE_ = makeSymbol( "ATOMIC-SENTENCE?" );
    $str53$__Paraphrasing__S_as__S_in_contex = makeString( "~&Paraphrasing ~S as ~S in context ~S.~%" );
    $const54$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $list55 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Determiner" ) ) );
    $sym56$PPH_NBAR_CYCL_TEMPLATE_FOR_TERM_TYPE = makeSymbol( "PPH-NBAR-CYCL-TEMPLATE-FOR-TERM-TYPE" );
    $sym57$PPH_DETP_CYCL_TEMPLATE_FOR_TERM_TYPE = makeSymbol( "PPH-DETP-CYCL-TEMPLATE-FOR-TERM-TYPE" );
    $sym58$PPH_NP_CYCL_TEMPLATE_FOR_TERM_TYPE = makeSymbol( "PPH-NP-CYCL-TEMPLATE-FOR-TERM-TYPE" );
    $const59$nounStrings = constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) );
    $str60$Can_t_reconcile__S_with__S = makeString( "Can't reconcile ~S with ~S" );
    $const61$FacetingCollectionType = constant_handles.reader_make_constant_shell( makeString( "FacetingCollectionType" ) );
    $sym62$_TG = makeSymbol( "?TG" );
    $const63$typeGenls = constant_handles.reader_make_constant_shell( makeString( "typeGenls" ) );
    $list64 = ConsesLow.list( makeSymbol( "?TG" ) );
    $sym65$PPH_GENL_ = makeSymbol( "PPH-GENL?" );
    $kw66$EXISTENTIAL = makeKeyword( "EXISTENTIAL" );
    $kw67$DEPTH = makeKeyword( "DEPTH" );
    $kw68$STACK = makeKeyword( "STACK" );
    $kw69$QUEUE = makeKeyword( "QUEUE" );
    $const70$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw72$ERROR = makeKeyword( "ERROR" );
    $str73$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym74$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw75$CERROR = makeKeyword( "CERROR" );
    $str76$continue_anyway = makeString( "continue anyway" );
    $kw77$WARN = makeKeyword( "WARN" );
    $str78$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const79$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str80$Skipping__S_as_too_highly_faceted = makeString( "Skipping ~S as too highly faceted (threshold = ~S)." );
    $str81$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str82$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str83$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw84$BACKREFERENCE_CLASSB = makeKeyword( "BACKREFERENCE-CLASSB" );
    $kw85$DEFINITE = makeKeyword( "DEFINITE" );
    $kw86$WHAT = makeKeyword( "WHAT" );
    $sym87$DETERMINER_TYPE_FOR_VAR_PHRASE = makeSymbol( "DETERMINER-TYPE-FOR-VAR-PHRASE" );
    $list88 = ConsesLow.list( makeKeyword( "CODE" ), makeSymbol( "UNIVERSAL-INTRODUCTION" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VARS" ) ) );
    $sym89$VARS = makeSymbol( "VARS" );
    $str90$Bound_by_universal_introduction__ = makeString( "Bound by universal introduction: ~S" );
    $kw91$START = makeKeyword( "START" );
    $str92$if = makeString( "if" );
    $kw93$FOUND_IF = makeKeyword( "FOUND-IF" );
    $kw94$FOUND_VAR_DTR = makeKeyword( "FOUND-VAR-DTR" );
    $str95$_ = makeString( "," );
    $str96$Arg_position__S_applied_to_top_le = makeString( "Arg position ~S applied to top-level cycl ~S does not yield correct var ~S but rather ~S!~%*pph-cycls*: ~S~%" );
    $const97$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const98$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $str99$Var__S_at_arg_position__S_in_cycl = makeString( "Var ~S at arg-position ~S in cycl ~S not in non-veridical environment.~%" );
    $str100$Quantifier_for_var__S_not_found_i = makeString( "Quantifier for var ~S not found in top-level cycl!~%" );
    $list101 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell(
        makeString( "unknownSentence" ) ) );
    $list102 = ConsesLow.cons( makeSymbol( "FIRST-ITEM" ), makeSymbol( "REST-ITEMS" ) );
    $str103$it = makeString( "it" );
    $str104$the = makeString( "the" );
    $str105$thing = makeString( "thing" );
    $str106$something = makeString( "something" );
    $str107$everything = makeString( "everything" );
    $str108$other = makeString( "other" );
    $str109$another = makeString( "another" );
    $str110$Explicitifying__S = makeString( "Explicitifying ~S" );
    $sym111$GENERATE_KEYWORD = makeSymbol( "GENERATE-KEYWORD" );
    $kw112$KEYWORD = makeKeyword( "KEYWORD" );
    $sym113$GENERATE_CYCL_SYMBOL = makeSymbol( "GENERATE-CYCL-SYMBOL" );
    $kw114$CYCL_SYMBOL = makeKeyword( "CYCL-SYMBOL" );
    $str115$the_SubL_symbol_ = makeString( "the SubL symbol " );
    $sym116$GENERATE_NON_CYCL_SYMBOL = makeSymbol( "GENERATE-NON-CYCL-SYMBOL" );
    $kw117$NON_CYCL_SYMBOL = makeKeyword( "NON-CYCL-SYMBOL" );
    $str118$the_symbol_ = makeString( "the symbol " );
    $kw119$CONSTANT = makeKeyword( "CONSTANT" );
    $sym120$SCIENTIFIC_NAME_METHOD = makeSymbol( "SCIENTIFIC-NAME-METHOD" );
    $kw121$PRECISE = makeKeyword( "PRECISE" );
    $str122$__Shadowing_discourse_context____ = makeString( "~&Shadowing discourse context...~%" );
    $kw123$GOOD = makeKeyword( "GOOD" );
    $str124$__GENERATE_CONSTANT_DEFAULT__Tryi = makeString( "~&GENERATE-CONSTANT-DEFAULT: Trying again with :ANY quality.~%" );
    $sym125$GENERATE_LEXICAL_WORD = makeSymbol( "GENERATE-LEXICAL-WORD" );
    $kw126$LEXICAL_WORD = makeKeyword( "LEXICAL-WORD" );
    $str127$_TheWord = makeString( "-TheWord" );
    $str128$_MWW = makeString( "-MWW" );
    $str129$RKF_ = makeString( "RKF-" );
    $const130$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $str131$the_word_ = makeString( "the word " );
    $const132$chemicalFormulaString = constant_handles.reader_make_constant_shell( makeString( "chemicalFormulaString" ) );
    $list133 = ConsesLow.list( makeSymbol( "ELEMENT-LIST" ), makeSymbol( "QUANTITY-LIST" ) );
    $const134$ElectronicCharge = constant_handles.reader_make_constant_shell( makeString( "ElectronicCharge" ) );
    $list135 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ElementalSubstanceFn" ) ), makeKeyword( "FORT" ) );
    $const136$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $list137 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), ONE_INTEGER ) );
    $list138 = ConsesLow.list( makeSymbol( "?ELEMENTS" ), makeSymbol( "?QUANTITIES" ) );
    $const139$completeAtomicComposition_List = constant_handles.reader_make_constant_shell( makeString( "completeAtomicComposition-List" ) );
    $const140$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $sym141$_CHARGE = makeSymbol( "?CHARGE" );
    $const142$chargeOfObject = constant_handles.reader_make_constant_shell( makeString( "chargeOfObject" ) );
    $list143 = ConsesLow.list( makeSymbol( "?CHARGE" ) );
    $sym144$_MOLECULE_TYPE = makeSymbol( "?MOLECULE-TYPE" );
    $const145$moleculesOfCompoundType = constant_handles.reader_make_constant_shell( makeString( "moleculesOfCompoundType" ) );
    $list146 = ConsesLow.list( makeSymbol( "?MOLECULE-TYPE" ) );
    $const147$ChemicalSubstanceFn = constant_handles.reader_make_constant_shell( makeString( "ChemicalSubstanceFn" ) );
    $sym148$_SELECT_STRING_METHOD_COUNT_ = makeSymbol( "*SELECT-STRING-METHOD-COUNT*" );
    $int149$256 = makeInteger( 256 );
    $list150 = ConsesLow.list( new SubLObject[] { makeSymbol( "LICENSED-DEFINITE-DESCRIPTION-METHOD" ), makeSymbol( "NL-GENERATION-CACHE-METHOD" ), makeSymbol( "GEN-PHRASE-METHOD" ), makeSymbol(
        "PREFERRED-GEN-UNIT-METHOD" ), makeSymbol( "PREFERRED-LEXIFICATION-METHOD" ), makeSymbol( "USE-AS-IS-METHOD" ), makeSymbol( "PREFER-UNLEXIFIED-FORM-METHOD" ), makeSymbol( "PASSED-PREDS-SUCCEED-METHOD" ),
      makeSymbol( "NAME-STRING-METHOD-NON-ACRONYM" ), makeSymbol( "CHEMICAL-FORMULA-METHOD" ), ConsesLow.cons( makeSymbol( "DEMERITS" ), TWO_INTEGER ), makeSymbol( "RDF-LABEL-METHOD" ), makeSymbol(
          "NOUN-FROM-ADJECTIVE-METHOD" ), makeSymbol( "NAME-STRING-METHOD" ), makeSymbol( "SCIENTIFIC-NAME-METHOD" ), makeSymbol( "ANY-NAME-STRING-METHOD" ), makeSymbol( "PRETTY-STRING-METHOD" ), ConsesLow.cons(
              makeSymbol( "DEMERITS" ), ONE_INTEGER ), makeSymbol( "ANY-PREDS-SUCCEED-METHOD" ), makeSymbol( "GENITIVE-PARAPHRASE-METHOD" ), makeSymbol( "COERCED-DEFINITE-DESCRIPTION-METHOD" ), makeSymbol(
                  "TERM-STRING-METHOD" ), ConsesLow.cons( makeSymbol( "DEMERITS" ), ONE_INTEGER ), makeSymbol( "UNLEXIFIED-TERM-METHOD" ), makeSymbol( "COERCE-NAME-METHOD" )
    } );
    $str151$__SELECT_STRING_METHOD__NL_PREDS_ = makeString( "~&SELECT-STRING-METHOD: NL-PREDS is ~S.~%" );
    $str152$__SELECT_STRING_METHOD__Precision = makeString( "~&SELECT-STRING-METHOD: Precision is ~S.~%" );
    $list153 = ConsesLow.list( makeSymbol( "GEN-STRING-ASSERTION-PRECISE-METHOD" ) );
    $sym154$DEMERITS = makeSymbol( "DEMERITS" );
    $sym155$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str156$___Top_level_CycL___S = makeString( "~% Top-level CycL: ~S" );
    $str157$Added__S_alternatives_for____S = makeString( "Added ~S alternatives for~% ~S" );
    $str158$__SELECT_STRING_METHOD__the_funct = makeString( "~&SELECT-STRING-METHOD: the function ~S returned NIL for ~S.~%" );
    $str159$PPH_timeout_time_reached_ = makeString( "PPH timeout time reached." );
    $sym160$SELECT_STRING_METHOD = makeSymbol( "SELECT-STRING-METHOD" );
    $kw161$DEMERITS = makeKeyword( "DEMERITS" );
    $kw162$CYCL = makeKeyword( "CYCL" );
    $kw163$NL_PREDS = makeKeyword( "NL-PREDS" );
    $kw164$INCREMENTAL_DEMERITS = makeKeyword( "INCREMENTAL-DEMERITS" );
    $kw165$METHOD = makeKeyword( "METHOD" );
    $str166$__SELECT_STRING_METHOD__Calling__ = makeString( "~&SELECT-STRING-METHOD: Calling ~S on ~S.~%" );
    $sym167$PPH_PHRASE_OUTPUT_ITEM_STRING = makeSymbol( "PPH-PHRASE-OUTPUT-ITEM-STRING" );
    $list168 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DEMERITS" ), ZERO_INTEGER ), makeSymbol( "JUSTIFICATION" ) );
    $str169$__SELECT_STRING_METHOD__Function_ = makeString( "~&SELECT-STRING-METHOD: Function ~S returned ~S.~%" );
    $sym170$NL_GENERATION_CACHE_METHOD = makeSymbol( "NL-GENERATION-CACHE-METHOD" );
    $const171$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const172$definiteDescriptions = constant_handles.reader_make_constant_shell( makeString( "definiteDescriptions" ) );
    $str173$the_ = makeString( "the " );
    $str174$Removing_determiner_to_form_Nbar_ = makeString( "Removing determiner to form Nbar." );
    $str175$Paraphrasing__S_as_an_NP_ = makeString( "Paraphrasing ~S as an NP." );
    $list176 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonSingular-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) ) );
    $list177 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) ) );
    $list178 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) ) );
    $list179 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "massNumber-Generic" ) ) );
    $const180$properNameStrings = constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) );
    $sym181$PPH_SPEC_PREDICATE_ = makeSymbol( "PPH-SPEC-PREDICATE?" );
    $str182$Adding___properNameStrings_to__S = makeString( "Adding #$properNameStrings to ~S" );
    $sym183$PPH_PRED_LICENSED_BY_PRED_ = makeSymbol( "PPH-PRED-LICENSED-BY-PRED?" );
    $sym184$SELECT_STRING_FOR_TERM = makeSymbol( "SELECT-STRING-FOR-TERM" );
    $kw185$DEFAULT = makeKeyword( "DEFAULT" );
    $str186$_PPH_error_level_ = makeString( "(PPH error level " );
    $str187$__ = makeString( ") " );
    $str188$Trying_to_paraphrase__S_with_no_N = makeString( "Trying to paraphrase ~S with no NL preds." );
    $sym189$PPH_PRECISION_P = makeSymbol( "PPH-PRECISION-P" );
    $int190$500 = makeInteger( 500 );
    $sym191$PPH_NAME_STRING_PREDS = makeSymbol( "PPH-NAME-STRING-PREDS" );
    $const192$preferredNameString = constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) );
    $const193$ProperNamePredicate_Strict = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-Strict" ) );
    $sym194$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym195$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol( "HL-PROTOTYPICAL-INSTANCE?" );
    $sym196$_PPH_NAME_STRING_PREDS_CACHING_STATE_ = makeSymbol( "*PPH-NAME-STRING-PREDS-CACHING-STATE*" );
    $int197$128 = makeInteger( 128 );
    $sym198$CLEAR_PPH_NAME_STRING_PREDS = makeSymbol( "CLEAR-PPH-NAME-STRING-PREDS" );
    $sym199$PPH_TERM_STRING_PREDS = makeSymbol( "PPH-TERM-STRING-PREDS" );
    $const200$preferredTermStrings = constant_handles.reader_make_constant_shell( makeString( "preferredTermStrings" ) );
    $const201$ProperNamePredicate_Loose = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-Loose" ) );
    $sym202$_PPH_TERM_STRING_PREDS_CACHING_STATE_ = makeSymbol( "*PPH-TERM-STRING-PREDS-CACHING-STATE*" );
    $sym203$CLEAR_PPH_TERM_STRING_PREDS = makeSymbol( "CLEAR-PPH-TERM-STRING-PREDS" );
    $str204$Broadening__PPH_LANGUAGE_MT__to__ = makeString( "Broadening *PPH-LANGUAGE-MT* to ~S" );
    $list205 = ConsesLow.cons( makeSymbol( "STRING" ), makeSymbol( "PRED" ) );
    $sym206$SPEC_POS_PRED_ = makeSymbol( "SPEC-POS-PRED?" );
    $const207$abbreviationString = constant_handles.reader_make_constant_shell( makeString( "abbreviationString" ) );
    $sym208$PPH_ENHANCED_DOMAIN_MT = makeSymbol( "PPH-ENHANCED-DOMAIN-MT" );
    $const209$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $sym210$_PPH_ENHANCED_DOMAIN_MT_CACHING_STATE_ = makeSymbol( "*PPH-ENHANCED-DOMAIN-MT-CACHING-STATE*" );
    $sym211$CLEAR_PPH_ENHANCED_DOMAIN_MT = makeSymbol( "CLEAR-PPH-ENHANCED-DOMAIN-MT" );
    $const212$validatedLexicalPSCForLanguage = constant_handles.reader_make_constant_shell( makeString( "validatedLexicalPSCForLanguage" ) );
    $const213$dispreferredLexification = constant_handles.reader_make_constant_shell( makeString( "dispreferredLexification" ) );
    $str214$__Got__S = makeString( "~%Got ~S" );
    $str215$Generated_name_for__S_from____S = makeString( "Generated name for ~S from~% ~S" );
    $const216$ChemicalSubstanceType = constant_handles.reader_make_constant_shell( makeString( "ChemicalSubstanceType" ) );
    $str217$__No__S_assertions___for__S___fro = makeString( "~%No ~S assertions~% for ~S~% from ~S" );
    $sym218$NAME_STRING_GAF_STRINGS = makeSymbol( "NAME-STRING-GAF-STRINGS" );
    $sym219$PPH_NON_ABBREVIATION_NAME_PRED_ = makeSymbol( "PPH-NON-ABBREVIATION-NAME-PRED?" );
    $kw220$CLEARED = makeKeyword( "CLEARED" );
    $sym221$PPH_ABBREVIATION_PREDS = makeSymbol( "PPH-ABBREVIATION-PREDS" );
    $const222$abbreviationString_PN = constant_handles.reader_make_constant_shell( makeString( "abbreviationString-PN" ) );
    $sym223$_PPH_ABBREVIATION_PREDS_CACHING_STATE_ = makeSymbol( "*PPH-ABBREVIATION-PREDS-CACHING-STATE*" );
    $int224$25 = makeInteger( 25 );
    $sym225$CLEAR_PPH_ABBREVIATION_PREDS = makeSymbol( "CLEAR-PPH-ABBREVIATION-PREDS" );
    $const226$acronymString = constant_handles.reader_make_constant_shell( makeString( "acronymString" ) );
    $list227 = ConsesLow.list( makeString( "The " ), makeString( "A " ), makeString( "An " ) );
    $const228$Artifact_Generic = constant_handles.reader_make_constant_shell( makeString( "Artifact-Generic" ) );
    $list229 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "middleName" ) ), constant_handles.reader_make_constant_shell( makeString( "scientificName" ) ), constant_handles
        .reader_make_constant_shell( makeString( "nicknames" ) ), constant_handles.reader_make_constant_shell( makeString( "firstName" ) ), constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ),
      constant_handles.reader_make_constant_shell( makeString( "familyName" ) ), constant_handles.reader_make_constant_shell( makeString( "formerName" ) ), constant_handles.reader_make_constant_shell( makeString(
          "placeName-LocalLongForm" ) ), constant_handles.reader_make_constant_shell( makeString( "placeName-LocalShortForm" ) ), constant_handles.reader_make_constant_shell( makeString( "countryName-LocalLongForm" ) ),
      constant_handles.reader_make_constant_shell( makeString( "countryName-LocalShortForm" ) ), constant_handles.reader_make_constant_shell( makeString( "epistleAddresseeText" ) ), constant_handles
          .reader_make_constant_shell( makeString( "abbreviationString-PN" ) ), constant_handles.reader_make_constant_shell( makeString( "internetCountryCode" ) ), constant_handles.reader_make_constant_shell( makeString(
              "countryCodeDigraph" ) ), constant_handles.reader_make_constant_shell( makeString( "geopoliticalEntityCodeDigraph" ) )
    } );
    $sym230$PPH_PREFER_NAME_STRING_PRED_ = makeSymbol( "PPH-PREFER-NAME-STRING-PRED?" );
    $sym231$INVALID_ASSERTION_ = makeSymbol( "INVALID-ASSERTION?" );
    $const232$scientificName = constant_handles.reader_make_constant_shell( makeString( "scientificName" ) );
    $list233 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "prettyString-Canonical" ) ), constant_handles.reader_make_constant_shell( makeString( "prettyString" ) ) );
    $kw234$GAF = makeKeyword( "GAF" );
    $list235 = ConsesLow.list( makeSymbol( "GENITIVE-PARAPHRASE-METHOD" ) );
    $kw236$LEXIFIED_NART = makeKeyword( "LEXIFIED-NART" );
    $const237$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $kw238$TRUE = makeKeyword( "TRUE" );
    $str239$Couldn_t_find__S_lexification_wit = makeString( "Couldn't find ~S lexification with preds ~S for~% ~S" );
    $str240$Reverted_to_original_phrase_ = makeString( "Reverted to original phrase." );
    $kw241$NART = makeKeyword( "NART" );
    $str242$__GENERATE_NART_AS_NAUT_paraphras = makeString( "~&GENERATE-NART-AS-NAUT paraphrasing ~S with category ~S.~%" );
    $str243$__GENERATE_NART_AS_NAUT_found_unj = makeString( "~&GENERATE-NART-AS-NAUT found unjustified string ~S for ~S.~%" );
    $kw244$OK_NAT_TEMPLATE = makeKeyword( "OK-NAT-TEMPLATE" );
    $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_ = makeSymbol( "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?" );
    $sym246$_EXIT = makeSymbol( "%EXIT" );
    $const247$genTemplate_Constrained = constant_handles.reader_make_constant_shell( makeString( "genTemplate-Constrained" ) );
    $const248$genTemplate = constant_handles.reader_make_constant_shell( makeString( "genTemplate" ) );
    $sym249$GENERATE_UNIVERSAL_DATE = makeSymbol( "GENERATE-UNIVERSAL-DATE" );
    $kw250$UNIVERSAL_DATE = makeKeyword( "UNIVERSAL-DATE" );
    $sym251$GENERATE_UNIVERSAL_DATE_NUMBERS = makeSymbol( "GENERATE-UNIVERSAL-DATE-NUMBERS" );
    $kw252$FALLBACK = makeKeyword( "FALLBACK" );
    $sym253$GENERATE_UNIVERSAL_SECOND = makeSymbol( "GENERATE-UNIVERSAL-SECOND" );
    $kw254$UNIVERSAL_SECOND = makeKeyword( "UNIVERSAL-SECOND" );
    $kw255$SECOND = makeKeyword( "SECOND" );
    $kw256$MINUTE = makeKeyword( "MINUTE" );
    $str257$_00 = makeString( ":00" );
    $sym258$GENERATE_FLOAT = makeSymbol( "GENERATE-FLOAT" );
    $kw259$FLOAT = makeKeyword( "FLOAT" );
    $str260$E0 = makeString( "E0" );
    $sym261$ALPHA_CHAR_P = makeSymbol( "ALPHA-CHAR-P" );
    $str262$_0 = makeString( ".0" );
    $const263$MultiplicationSign_TheSymbol = constant_handles.reader_make_constant_shell( makeString( "MultiplicationSign-TheSymbol" ) );
    $str264$10 = makeString( "10" );
    $str265$_ = makeString( "+" );
    $str266$E = makeString( "E" );
    $str267$D = makeString( "D" );
    $str268$0 = makeString( "0" );
    $str269$_ = makeString( "." );
    $str270$d = makeString( "d" );
    $str271$__D = makeString( "~:D" );
    $list272 = ConsesLow.list( new SubLObject[] { makeString( "no" ), makeString( "one" ), makeString( "two" ), makeString( "three" ), makeString( "four" ), makeString( "five" ), makeString( "six" ), makeString(
        "seven" ), makeString( "eight" ), makeString( "nine" ), makeString( "ten" ), makeString( "eleven" ), makeString( "twelve" ), makeString( "thirteen" ), makeString( "fourteen" ), makeString( "fifteen" ),
      makeString( "sixteen" ), makeString( "seventeen" ), makeString( "eighteen" ), makeString( "nineteen" )
    } );
    $list273 = ConsesLow.list( ConsesLow.cons( TWENTY_INTEGER, makeString( "twenty" ) ), ConsesLow.cons( makeInteger( 30 ), makeString( "thirty" ) ), ConsesLow.cons( makeInteger( 40 ), makeString( "forty" ) ), ConsesLow
        .cons( makeInteger( 50 ), makeString( "fifty" ) ), ConsesLow.cons( makeInteger( 60 ), makeString( "sixty" ) ), ConsesLow.cons( makeInteger( 70 ), makeString( "seventy" ) ), ConsesLow.cons( makeInteger( 80 ),
            makeString( "eighty" ) ), ConsesLow.cons( makeInteger( 90 ), makeString( "ninety" ) ) );
    $sym274$INTEGERP = makeSymbol( "INTEGERP" );
    $int275$100 = makeInteger( 100 );
    $str276$_ = makeString( " " );
    $sym277$GENERATE_NUMBER_DEFAULT = makeSymbol( "GENERATE-NUMBER-DEFAULT" );
    $kw278$NUMBER = makeKeyword( "NUMBER" );
    $str279$Was_anticipating_a_singleton_outp = makeString( "Was anticipating a singleton output list, got: ~S.  Not adding disambiguation string." );
    $const280$OrdinalAdjective = constant_handles.reader_make_constant_shell( makeString( "OrdinalAdjective" ) );
    $sym281$_STRING = makeSymbol( "?STRING" );
    $const282$imageURLPathname = constant_handles.reader_make_constant_shell( makeString( "imageURLPathname" ) );
    $list283 = ConsesLow.list( makeSymbol( "?STRING" ) );
    $list284 = ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) );
    $sym285$GENERATE_IMAGE_URL = makeSymbol( "GENERATE-IMAGE-URL" );
    $kw286$IMAGE_URL = makeKeyword( "IMAGE-URL" );
    $str287$_img_src___A__ = makeString( "<img src=\"~A\">" );
    $str288$ = makeString( "" );
    $sym289$GENERATE_PRINC = makeSymbol( "GENERATE-PRINC" );
    $kw290$OBJECT = makeKeyword( "OBJECT" );
    $kw291$SYMBOL = makeKeyword( "SYMBOL" );
    $sym292$_PPH_DEFAULT_MT_TIME_INDEX_ = makeSymbol( "*PPH-DEFAULT-MT-TIME-INDEX*" );
    $const293$Always_TimeInterval = constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) );
    $sym294$GENERATE_ASSERTION = makeSymbol( "GENERATE-ASSERTION" );
    $kw295$ASSERTION = makeKeyword( "ASSERTION" );
    $const296$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const297$MtTimeDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) );
    $list298 = ConsesLow.list( makeKeyword( "SELF" ) );
    $kw299$IGNORE = makeKeyword( "IGNORE" );
    $sym300$_DATE = makeSymbol( "?DATE" );
    $const301$startingDate = constant_handles.reader_make_constant_shell( makeString( "startingDate" ) );
    $list302 = ConsesLow.list( makeSymbol( "?DATE" ) );
    $const303$endingDate = constant_handles.reader_make_constant_shell( makeString( "endingDate" ) );
    $list304 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "START-DATE" ) ), ConsesLow.list( makeKeyword(
        "BIND" ), makeSymbol( "END-DATE" ) ) );
    $sym305$END_DATE = makeSymbol( "END-DATE" );
    $sym306$START_DATE = makeSymbol( "START-DATE" );
    $const307$IntervalStartedByFn_Inclusive = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) );
    $const308$IntervalEndedByFn_Inclusive = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn-Inclusive" ) );
    $list309 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalBetweenFn" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "START-DATE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "END-DATE" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GUID" ) ) );
    $sym310$GUID = makeSymbol( "GUID" );
    $const311$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) );
    $const312$IntervalStartedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn" ) );
    $const313$IntervalEndedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) );
    $list314 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), makeKeyword( "ANYTHING" ) );
    $sym315$DATE = makeSymbol( "DATE" );
    $sym316$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym317$PPH_SUPPORT_CREATION_DATES = makeSymbol( "PPH-SUPPORT-CREATION-DATES" );
    $const318$mtTimeIndex = constant_handles.reader_make_constant_shell( makeString( "mtTimeIndex" ) );
    $sym319$_TIME_INDEX = makeSymbol( "?TIME-INDEX" );
    $const320$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $list321 = ConsesLow.list( makeSymbol( "?TIME-INDEX" ) );
    $const322$TKBSourceSpindleHeadMt = constant_handles.reader_make_constant_shell( makeString( "TKBSourceSpindleHeadMt" ) );
    $const323$TKBSourceSpindleCollectorMt = constant_handles.reader_make_constant_shell( makeString( "TKBSourceSpindleCollectorMt" ) );
    $sym324$PPH_MT_TIME_INDEX = makeSymbol( "PPH-MT-TIME-INDEX" );
    $kw325$TEST = makeKeyword( "TEST" );
    $kw326$OWNER = makeKeyword( "OWNER" );
    $kw327$CLASSES = makeKeyword( "CLASSES" );
    $list328 = ConsesLow.list( makeSymbol( "PPH-TEST-CASE-TABLES" ) );
    $kw329$KB = makeKeyword( "KB" );
    $kw330$FULL = makeKeyword( "FULL" );
    $kw331$WORKING_ = makeKeyword( "WORKING?" );
    $list332 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CIAWorldFactbook1995Mt" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "YearFn" ) ), makeInteger( 1994 ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles
            .reader_make_constant_shell( makeString( "BaseKB" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "YearFn" ) ), makeInteger( 1994 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1994 ) ) ) );
    $kw333$SUBSUMING = makeKeyword( "SUBSUMING" );
    $const334$startsAfterEndingOf = constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) );
    $const335$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $list336 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "END-DATE" ) ) ), makeKeyword( "ANYTHING" ) );
    $kw337$FOLLOWING = makeKeyword( "FOLLOWING" );
    $list338 = ConsesLow.list( ONE_INTEGER, ONE_INTEGER );
    $kw339$PRECEDING = makeKeyword( "PRECEDING" );
    $const340$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalBetweenFn" ) );
    $sym341$PPH_ADJUST_MT_DATE_GRANULARITY = makeSymbol( "PPH-ADJUST-MT-DATE-GRANULARITY" );
    $const342$CalendarYear = constant_handles.reader_make_constant_shell( makeString( "CalendarYear" ) );
    $list343 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), ONE_INTEGER );
    $const344$DurationFn = constant_handles.reader_make_constant_shell( makeString( "DurationFn" ) );
    $const345$CalendarDay = constant_handles.reader_make_constant_shell( makeString( "CalendarDay" ) );
    $list346 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearsDuration" ) ), ONE_INTEGER );
    $const347$CalendarMonth = constant_handles.reader_make_constant_shell( makeString( "CalendarMonth" ) );
    $sym348$PPH_ADJUST_MT_TIME_INDEX_GRANULARITY = makeSymbol( "PPH-ADJUST-MT-TIME-INDEX-GRANULARITY" );
    $list349 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1956 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1956 ) ) ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), SIXTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "MinuteFn" ) ), makeInteger( 42 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), TWENTY_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "DayFn" ) ), ELEVEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "August" ) ),
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2004 ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "August" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                            2004 ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecadeFn" ) ), makeInteger( 198 ) ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "DecadeFn" ) ), makeInteger( 198 ) ) ) );
    $const350$genWithGloss = constant_handles.reader_make_constant_shell( makeString( "genWithGloss" ) );
    $const351$englishGloss = constant_handles.reader_make_constant_shell( makeString( "englishGloss" ) );
    $sym352$PPH_PHRASE_OUTPUT_LIST_P = makeSymbol( "PPH-PHRASE-OUTPUT-LIST-P" );
    $sym353$ASSERTION_OUTPUT_LIST_INFO_P = makeSymbol( "ASSERTION-OUTPUT-LIST-INFO-P" );
    $list354 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "ARG-POSITION" ), ConsesLow.list( makeSymbol( "PPH-UNKNOWN-ARG-POSITION" ) ) ), makeSymbol( "OPEN-TAG" ),
        makeSymbol( "CLOSE-TAG" ) );
    $kw355$STRING = makeKeyword( "STRING" );
    $sym356$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $kw357$LIST = makeKeyword( "LIST" );
    $sym358$GENERATE_ROP_EXPRESSION = makeSymbol( "GENERATE-ROP-EXPRESSION" );
    $kw359$ROP_EXPRESSION = makeKeyword( "ROP-EXPRESSION" );
    $const360$ScalarInterval = constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) );
    $const361$InstanceWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "InstanceWithRelationFromFn" ) );
    $list362 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Relation" ) ), constant_handles
        .reader_make_constant_shell( makeString( "GAFGathering" ) ), constant_handles.reader_make_constant_shell( makeString( "StringBasedSearching" ) ), constant_handles.reader_make_constant_shell( makeString(
            "ObtainingAStringBasedSearchResult" ) ), constant_handles.reader_make_constant_shell( makeString( "LexicalItem" ) ), constant_handles.reader_make_constant_shell( makeString(
                "SKSSchema-LogicalOrPhysical" ) ) );
    $sym363$PPH_POSSESSIVE_PREDS = makeSymbol( "PPH-POSSESSIVE-PREDS" );
    $const364$possessiveRelation = constant_handles.reader_make_constant_shell( makeString( "possessiveRelation" ) );
    $sym365$_PPH_POSSESSIVE_PREDS_CACHING_STATE_ = makeSymbol( "*PPH-POSSESSIVE-PREDS-CACHING-STATE*" );
    $sym366$PPH_FIND_POSSESSIVE_SENTENCE = makeSymbol( "PPH-FIND-POSSESSIVE-SENTENCE" );
    $int367$200 = makeInteger( 200 );
    $sym368$_POSSESSOR = makeSymbol( "?POSSESSOR" );
    $list369 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FirstPerson-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Ungendered-NLAttr" ) ) );
    $const370$PossessivePronoun_Pre = constant_handles.reader_make_constant_shell( makeString( "PossessivePronoun-Pre" ) );
    $str371$Couldn_t_find_possessor_for__S = makeString( "Couldn't find possessor for ~S" );
    $const372$TheCoordinationSet = constant_handles.reader_make_constant_shell( makeString( "TheCoordinationSet" ) );
    $sym373$_POSSESSED = makeSymbol( "?POSSESSED" );
    $list374 = ConsesLow.list( makeSymbol( "POSSESSIVE-PRED" ), makeSymbol( "POSSESSOR" ), makeSymbol( "POSSESSED" ) );
    $list375 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) );
    $str376$_S_is_an_instance_of__S__so_using = makeString( "~S is an instance of ~S, so using unlexified form.~%" );
    $list377 = ConsesLow.list( NIL );
    $sym378$PPH_GENDER_P = makeSymbol( "PPH-GENDER-P" );
    $const379$NLGenderAttribute = constant_handles.reader_make_constant_shell( makeString( "NLGenderAttribute" ) );
    $str380$Defaulting_to_English_gender_unif = makeString( "Defaulting to English gender unification in non-English context" );
    $const381$Masculine_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Masculine-NLAttr" ) );
    $const382$Feminine_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Feminine-NLAttr" ) );
    $const383$Neuter_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Neuter-NLAttr" ) );
    $const384$Ungendered_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Ungendered-NLAttr" ) );
    $const385$Plural_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) );
    $const386$Singular_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) );
    $const387$ThirdPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "ThirdPerson-NLAttr" ) );
    $const388$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "FirstPerson-NLAttr" ) );
    $const389$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "SecondPerson-NLAttr" ) );
    $sym390$_GENDER = makeSymbol( "?GENDER" );
    $const391$languageUsesGrammaticalGender = constant_handles.reader_make_constant_shell( makeString( "languageUsesGrammaticalGender" ) );
    $list392 = ConsesLow.list( makeSymbol( "?GENDER" ) );
    $list393 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $str394$Couldn_t_find_gender_for__S_in__S = makeString( "Couldn't find gender for ~S in ~S" );
    $list395 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EnglishLanguage" ) ) );
    $const396$LanguageDialect = constant_handles.reader_make_constant_shell( makeString( "LanguageDialect" ) );
    $const397$dialects = constant_handles.reader_make_constant_shell( makeString( "dialects" ) );
    $const398$EnglishLanguage = constant_handles.reader_make_constant_shell( makeString( "EnglishLanguage" ) );
    $sym399$PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE = makeSymbol( "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE" );
    $const400$GeneralLexiconMt = constant_handles.reader_make_constant_shell( makeString( "GeneralLexiconMt" ) );
    $const401$defaultGrammaticalGender = constant_handles.reader_make_constant_shell( makeString( "defaultGrammaticalGender" ) );
    $str402$pph_number_of_var_guessing_that__ = makeString( "pph-number-of-var guessing that ~S is singular because it's not a discourse referent~%" );
    $const403$Group = constant_handles.reader_make_constant_shell( makeString( "Group" ) );
    $const404$Agent_Generic = constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) );
    $const405$ConceptualWorkSeries = constant_handles.reader_make_constant_shell( makeString( "ConceptualWorkSeries" ) );
    $const406$licensedGrammaticalGender = constant_handles.reader_make_constant_shell( makeString( "licensedGrammaticalGender" ) );
    $str407$Couldn_t_find_a_gender_for__S_in_ = makeString( "Couldn't find a gender for ~S in ~S" );
    $list408 = ConsesLow.cons( makeSymbol( "TYPE" ), makeSymbol( "ADJUSTED-GENDER" ) );
    $sym409$SPEC_ = makeSymbol( "SPEC?" );
    $list410 = ConsesLow.cons( makeSymbol( "?TYPE" ), makeSymbol( "?GENDER" ) );
    $list411 = ConsesLow.list( makeSymbol( "?TYPE" ), makeSymbol( "?GENDER" ) );
  }

  public static final class $nl_generation_cache_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $nl_generation_cache_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NL-GENERATION-CACHE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nl_generation_cache_method( arg1, $nl_generation_cache_method$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $nl_generation_cache_method$BinaryFunction
      extends
        BinaryFunction
  {
    public $nl_generation_cache_method$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NL-GENERATION-CACHE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return nl_generation_cache_method( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 3043 ms
 * 
 */