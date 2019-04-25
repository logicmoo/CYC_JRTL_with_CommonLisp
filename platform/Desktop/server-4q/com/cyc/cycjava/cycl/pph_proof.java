package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_proof extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_proof";
    public static final String myFingerPrint = "09721c75af6bdecb2dd21c0b752b6650185b1729965b95d2c2f8aa997dc52473";
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 820L)
    private static SubLSymbol $pph_show_gory_proof_details$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 59794L)
    private static SubLSymbol $pph_meta_support_max$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 60166L)
    private static SubLSymbol $pph_meta_support_level$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 65581L)
    public static SubLSymbol $pph_hl_modules_to_skip_meta_supports_for$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 70403L)
    private static SubLSymbol $var_binding_candidates$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 73693L)
    private static SubLSymbol $pph_support_modules_for_which_to_show_all_meta_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 76774L)
    private static SubLSymbol $pph_irrelevant_support_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 94220L)
    public static SubLSymbol $pph_use_proof_templatesP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 116055L)
    private static SubLSymbol $proof_view_max_nowrap_line$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 143993L)
    private static SubLSymbol $pph_meta_supports_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 144049L)
    private static SubLSymbol $pph_meta_supports_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 144100L)
    public static SubLSymbol $pph_prefer_deduced_meta_supportsP$;
    private static final SubLSymbol $sym0$GENERATE_INFERENCE_ANSWER_SENTENCE_FOR_JAVA;
    private static final SubLSymbol $sym1$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw2$DEFAULT;
    private static final SubLSymbol $kw3$DECLARATIVE;
    private static final SubLString $str4$Couldn_t_generate_a_paraphrase_fo;
    private static final SubLSymbol $sym5$PPH_PROOF__;
    private static final SubLSymbol $kw6$FIND_BEST;
    private static final SubLString $str7$_S_is_not_a_proof_of__S;
    private static final SubLString $str8$proof;
    private static final SubLSymbol $sym9$INFERENCE_ANSWER_P;
    private static final SubLSymbol $sym10$PROOF_P;
    private static final SubLString $str11$Facts_Proved_;
    private static final SubLSymbol $sym12$GAF_ASSERTION_;
    private static final SubLString $str13$Selected_;
    private static final SubLString $str14$Facts_Used_from_Knowledge_Base_;
    private static final SubLSymbol $sym15$ASSERTED_ASSERTION_;
    private static final SubLSymbol $sym16$PPH_IRRELEVANT_SUPPORT_;
    private static final SubLSymbol $sym17$PPH_SUPPORT_EL_SENTENCE;
    private static final SubLSymbol $sym18$HL_SUPPORT_P;
    private static final SubLSymbol $kw19$SKSI;
    private static final SubLSymbol $sym20$PPH_TRIVIAL_SENTENCE_;
    private static final SubLSymbol $sym21$PPH_IRRELEVANT_FORMULA_;
    private static final SubLSymbol $sym22$PPH_PROOF_PROVEN_SENTENCE_EL_SENTENCE;
    private static final SubLSymbol $sym23$_;
    private static final SubLSymbol $sym24$PPH_PROOF_DEPTH;
    private static final SubLSymbol $sym25$PPH_PROOF_DEPTH_MEMOIZED;
    private static final SubLSymbol $sym26$SUPPORT_SENTENCE;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$PWHEN;
    private static final SubLSymbol $sym29$_PPH_IRRELEVANT_WARN__;
    private static final SubLSymbol $sym30$WARN;
    private static final SubLSymbol $sym31$CCONCATENATE;
    private static final SubLSymbol $sym32$FORMAT_NIL;
    private static final SubLString $str33$PPH_irrelevant_formula_____S__;
    private static final SubLSymbol $kw34$SUPPORTS_AND_CONCLUSION;
    private static final SubLString $str35$See_above;
    private static final SubLString $str36$From_question;
    private static final SubLString $str37$see_above_;
    private static final SubLString $str38$text_css;
    private static final SubLString $str39$screen;
    private static final SubLString $str40$none;
    private static final SubLString $str41$;
    private static final SubLSymbol $kw42$INVISIBLE;
    private static final SubLSymbol $kw43$TEXT;
    private static final SubLString $str44$__A_;
    private static final SubLSymbol $sym45$PPH_PROOF_QUERY_EQUAL_;
    private static final SubLSymbol $sym46$PROOF_PROVEN_QUERY;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLString $str49$By_analogous_reasoning__;
    private static final SubLString $str50$since_;
    private static final SubLString $str51$it_follows_that_;
    private static final SubLString $str52$Trivially__;
    private static final SubLSymbol $sym53$RULE_ASSERTION_;
    private static final SubLSymbol $sym54$_EXIT;
    private static final SubLObject $const55$ruleAndSupportsTrivialForJustific;
    private static final SubLString $str56$__Removing_irrelevant_support____;
    private static final SubLSymbol $sym57$PPH_SUPPORT_TRIVIAL_;
    private static final SubLSymbol $kw58$CODE;
    private static final SubLString $str59$_;
    private static final SubLString $str60$Proof_that;
    private static final SubLString $str61$Intermediate_Result_;
    private static final SubLString $str62$Conclusion_;
    private static final SubLString $str63$Supporting_Facts;
    private static final SubLString $str64$_transformation_supports;
    private static final SubLString $str65$Rule_Application_;
    private static final SubLString $str66$Transformation_Proof_Supports;
    private static final SubLSymbol $sym67$EL_IMPLICATION_P;
    private static final SubLSymbol $sym68$PPH_SUPPORT_TREE_SENTENCE;
    private static final SubLList $list69;
    private static final SubLString $str70$_meta_;
    private static final SubLSymbol $kw71$HYPOTHESIZED;
    private static final SubLSymbol $kw72$FROM_KB;
    private static final SubLString $str73$Applicable_Rule_;
    private static final SubLSymbol $sym74$FIRST;
    private static final SubLSymbol $sym75$UNIFY;
    private static final SubLString $str76$transformation_rule_;
    private static final SubLString $str77$Invalidated_Rule;
    private static final SubLString $str78$Supporting_Rule;
    private static final SubLString $str79$Transformation_Supports;
    private static final SubLSymbol $kw80$IMPLICATION;
    private static final SubLSymbol $kw81$DISJUNCTION;
    private static final SubLSymbol $kw82$DERIVED_FROM_HYPOTHESIS;
    private static final SubLString $str83$Given__from_the_question__;
    private static final SubLString $str84$Derived_from_the_question_;
    private static final SubLString $str85$Given__from_the_knowledge_base__;
    private static final SubLString $str86$Other_Givens_;
    private static final SubLString $str87$_restriction_subproofs;
    private static final SubLObject $const88$BaseTrivialityMt;
    private static final SubLObject $const89$MtUnionFn;
    private static final SubLSymbol $sym90$PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE;
    private static final SubLObject $const91$TrivialityContextForIndividualFn;
    private static final SubLSymbol $kw92$DEPTH;
    private static final SubLSymbol $kw93$STACK;
    private static final SubLSymbol $kw94$QUEUE;
    private static final SubLSymbol $sym95$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw96$ERROR;
    private static final SubLString $str97$_A_is_not_a__A;
    private static final SubLSymbol $sym98$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw99$CERROR;
    private static final SubLString $str100$continue_anyway;
    private static final SubLSymbol $kw101$WARN;
    private static final SubLString $str102$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const103$isa;
    private static final SubLString $str104$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str105$attempting_to_bind_direction_link;
    private static final SubLObject $const106$TrivialityContextForTypeFn;
    private static final SubLString $str107$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const108$BaseIrrelevanceMt;
    private static final SubLSymbol $sym109$PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE;
    private static final SubLObject $const110$IrrelevanceContextForIndividualFn;
    private static final SubLObject $const111$IrrelevanceContextForTypeFn;
    private static final SubLObject $const112$ruleRequiredForJustificationParap;
    private static final SubLSymbol $kw113$ASSERTION;
    private static final SubLObject $const114$ruleConclusionsTrivial;
    private static final SubLString $str115$PPH_irrelevant_formula_;
    private static final SubLString $str116$_;
    private static final SubLString $str117$Derived_from_rule_whose_conclusio;
    private static final SubLObject $const118$mtTrivialForJustificationParaphra;
    private static final SubLSymbol $kw119$MT;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$HTML_FANCY_TABLE;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$HTML_TABLE_ROW;
    private static final SubLSymbol $sym124$HTML_FANCY_TABLE_DATA;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$HTML_TABLE_DATA;
    private static final SubLList $list127;
    private static final SubLString $str128$subproofs_;
    private static final SubLString $str129$pf_indent;
    private static final SubLString $str130$pf_indent_td;
    private static final SubLString $str131$_A_subproof;
    private static final SubLString $str132$_A_subproof__D;
    private static final SubLString $str133$support;
    private static final SubLSymbol $kw134$UNCOMPUTED;
    private static final SubLString $str135$highly_relevant;
    private static final SubLString $str136$_see_above;
    private static final SubLObject $const137$predHighlyRelevantForJustificatio;
    private static final SubLString $str138$Invalidated_support;
    private static final SubLString $str139$meta_supports_;
    private static final SubLString $str140$_A_meta__D;
    private static final SubLString $str141$assert_info_;
    private static final SubLString $str142$__;
    private static final SubLObject $const143$HypotheticalContext;
    private static final SubLString $str144$This_was_stated_in_the_question_;
    private static final SubLString $str145$Note__This_rule_has_exceptions__b;
    private static final SubLObject $const146$InferencePSC;
    private static final SubLString $str147$Note__This_rule_has_further_condi;
    private static final SubLSymbol $kw148$EVAL;
    private static final SubLSymbol $sym149$NAUT_P;
    private static final SubLString $str150$Skipping_meta_supports_for__S;
    private static final SubLString $str151$Pruning_all_supports_for__S___due;
    private static final SubLString $str152$__Checking_for_literals_to_suppre;
    private static final SubLString $str153$__Literals_to_suppress_____S__;
    private static final SubLSymbol $kw154$IRRELEVANT;
    private static final SubLSymbol $sym155$PPH_META_SUPPORT_SHOULD_PRECEDE_;
    private static final SubLObject $const156$suppressLiteralForJustificationPa;
    private static final SubLSymbol $kw157$INFERENCE_MODE;
    private static final SubLSymbol $kw158$SHALLOW;
    private static final SubLSymbol $kw159$ALLOWED_RULES;
    private static final SubLSymbol $kw160$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw161$PROOF;
    private static final SubLSymbol $kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static final SubLSymbol $kw163$COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static final SubLSymbol $kw164$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw165$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw166$HL;
    private static final SubLSymbol $kw167$PROBLEM_STORE;
    private static final SubLSymbol $kw168$BROWSABLE_;
    private static final SubLSymbol $kw169$SKIP;
    private static final SubLString $str170$Couldn_t_bind_variables_in_litera;
    private static final SubLSymbol $sym171$EL_VARIABLE_P;
    private static final SubLSymbol $sym172$SUBSTITUTE_PPH_VAR_BINDING;
    private static final SubLString $str173$__Lit_candidates_for__S_____S;
    private static final SubLString $str174$__New_candidates_for__S___S__;
    private static final SubLSymbol $sym175$CYCL_VARIABLE_P;
    private static final SubLString $str176$Candidates_for__S___S;
    private static final SubLString $str177$Couldn_t_fully_bind_variables_in_;
    private static final SubLSymbol $kw178$OR;
    private static final SubLSymbol $kw179$ANYTHING;
    private static final SubLString $str180$__Pruning_meta_supports____Input_;
    private static final SubLString $str181$Pruning__S;
    private static final SubLSymbol $sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_;
    private static final SubLSymbol $kw183$RTV;
    private static final SubLSymbol $kw184$GENLPREDS;
    private static final SubLSymbol $sym185$PPH_INVALID_SUPPORT_;
    private static final SubLString $str186$_2;
    private static final SubLString $str187$Invalid;
    private static final SubLString $str188$_A__D;
    private static final SubLString $str189$___is_a_trivial_support_;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$PPH_TRANSFORMABLE_REDUNDANT_NART_P;
    private static final SubLSymbol $sym192$PPH_TRANSFORM_REDUNDANT_NART;
    private static final SubLSymbol $sym193$PPH_CONSTANT_FOR_NART;
    private static final SubLSymbol $sym194$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const195$EverythingPSC;
    private static final SubLObject $const196$rewriteOf;
    private static final SubLSymbol $kw197$GAF;
    private static final SubLSymbol $kw198$TRUE;
    private static final SubLString $str199$Has_EL_variable_functor___S_;
    private static final SubLString $str200$Has_HL_variable_functor___S_;
    private static final SubLObject $const201$interestingSentence;
    private static final SubLObject $const202$ist;
    private static final SubLSymbol $kw203$IGNORE;
    private static final SubLString $str204$Has_irrelevant_FORT___S_in__S_;
    private static final SubLSymbol $kw205$PREDICATE;
    private static final SubLString $str206$Trivial_functional_sentence_;
    private static final SubLObject $const207$sentenceTrivialForJustificationPa;
    private static final SubLSymbol $sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_;
    private static final SubLObject $const209$The;
    private static final SubLList $list210;
    private static final SubLObject $const211$FunctionalPredicate;
    private static final SubLList $list212;
    private static final SubLObject $const213$functionCorrespondingPredicate;
    private static final SubLSymbol $sym214$_FN;
    private static final SubLList $list215;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLString $str218$Trivial_functional_sentence_____S;
    private static final SubLList $list219;
    private static final SubLObject $const220$genls;
    private static final SubLList $list221;
    private static final SubLObject $const222$CollectionUnionFn;
    private static final SubLObject $const223$instanceAndSpecSentencesTrivialFo;
    private static final SubLObject $const224$specSentencesTrivialForJustificat;
    private static final SubLString $str225$Trivial___genls_sentence_____S__;
    private static final SubLObject $const226$instanceSentencesTrivialForJustif;
    private static final SubLObject $const227$SingletonCollectionFn;
    private static final SubLString $str228$Trivial___isa_sentence_____S__;
    private static final SubLObject $const229$genlPreds;
    private static final SubLSymbol $sym230$PPH_REQUIRED_SENTENCE_;
    private static final SubLObject $const231$or;
    private static final SubLObject $const232$sentenceRequiredForJustificationP;
    private static final SubLObject $const233$thereExists;
    private static final SubLSymbol $sym234$_AS;
    private static final SubLObject $const235$and;
    private static final SubLObject $const236$assertionSentence;
    private static final SubLList $list237;
    private static final SubLList $list238;
    private static final SubLSymbol $sym239$X;
    private static final SubLSymbol $sym240$BIN_PRED;
    private static final SubLSymbol $sym241$NAT;
    private static final SubLObject $const242$reflexiveInArgs;
    private static final SubLSymbol $sym243$PPH_TRIVIAL_TERM_;
    private static final SubLString $str244$_A_is_trivial_in__S;
    private static final SubLObject $const245$predTrivialForJustificationParaph;
    private static final SubLObject $const246$assertionTrivialForJustificationP;
    private static final SubLString $str247$_S_is_an_unknown_triviality_type_;
    private static final SubLObject $const248$False;
    private static final SubLSymbol $kw249$MINIMAL;
    private static final SubLString $str250$additional_supports_;
    private static final SubLString $str251$Additional_Supports;
    private static final SubLString $str252$_A_additional__D;
    private static final SubLString $str253$_from__A;
    private static final SubLObject $const254$sentenceHighlyRelevantForJustific;
    private static final SubLSymbol $kw255$INTERROGATIVE;
    private static final SubLSymbol $kw256$NONE;
    private static final SubLSymbol $kw257$ANY;
    private static final SubLString $str258$Generated__D_demerits_for__S;
    private static final SubLSymbol $sym259$_TEMPLATE;
    private static final SubLObject $const260$justificationTemplateAppliesToPro;
    private static final SubLList $list261;
    private static final SubLList $list262;
    private static final SubLString $str263$Since_;
    private static final SubLString $str264$and_since_;
    private static final SubLSymbol $sym265$_CONSTRAINT;
    private static final SubLObject $const266$justificationTemplateApplicabilit;
    private static final SubLList $list267;
    private static final SubLString $str268$the_Henderson_Hasselbalch_equatio;
    private static final SubLList $list269;
    private static final SubLString $str270$_sub;
    private static final SubLSymbol $sym271$_RULE_GLOSS_TEMPLATE;
    private static final SubLObject $const272$justificationGenerationRuleGlossT;
    private static final SubLList $list273;
    private static final SubLString $str274$We_can_apply_the_rule__;
    private static final SubLSymbol $kw275$RIGHT;
    private static final SubLSymbol $kw276$TOP;
    private static final SubLSymbol $kw277$CENTER;
    private static final SubLSymbol $kw278$NBSP;
    private static final SubLString $str279$_;
    private static final SubLSymbol $kw280$LEFT;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$INTEGERP;
    private static final SubLSymbol $sym283$INFERENCE_PROOF_GET_DEPTH;
    private static final SubLString $str284$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str285$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw286$UNINITIALIZED;
    private static final SubLSymbol $sym287$VALID_PROOF_VIEW_P;
    private static final SubLString $str288$pf_debug_proof_view;
    private static final SubLString $str289$proof_view;
    private static final SubLString $str290$body;
    private static final SubLString $str291$Query_;
    private static final SubLSymbol $sym292$PROOF_VIEW_ENTRY_GET_LABEL;
    private static final SubLString $str293$justifications;
    private static final SubLString $str294$yui_navset;
    private static final SubLString $str295$yui_nav;
    private static final SubLSymbol $sym296$SUPPRESS_PROOF_VIEW_SECTION_WITH_ROOT_;
    private static final SubLString $str297$_;
    private static final SubLString $str298$selected;
    private static final SubLString $str299$tabErrorOutput;
    private static final SubLString $str300$Debugging_Messages;
    private static final SubLString $str301$yui_content;
    private static final SubLString $str302$pfFilteredItems;
    private static final SubLSymbol $sym303$PROOF_VIEW_TAB_ID_FOR_ENTRY;
    private static final SubLSymbol $sym304$ALPHANUMERIC_CHAR_P;
    private static final SubLString $str305$tab;
    private static final SubLSymbol $sym306$STRINGP;
    private static final SubLString $str307$pf_buttonbar;
    private static final SubLString $str308$bd;
    private static final SubLString $str309$pf_show_debugging;
    private static final SubLString $str310$pf_show_debugging_checkbox;
    private static final SubLString $str311$Debugging_;
    private static final SubLString $str312$toggleDebug_this___body___;
    private static final SubLString $str313$pf_show_cycl_button;
    private static final SubLString $str314$pf_show_cycl_checkbox;
    private static final SubLString $str315$show_cycl;
    private static final SubLString $str316$toggleCycLVisible_this___body___;
    private static final SubLString $str317$Show_CycL;
    private static final SubLString $str318$pf_parameters;
    private static final SubLString $str319$Parameters;
    private static final SubLList $list320;
    private static final SubLString $str321$right;
    private static final SubLString $str322$left;
    private static final SubLString $str323$pf_toc;
    private static final SubLString $str324$Quick_Links;
    private static final SubLList $list325;
    private static final SubLList $list326;
    private static final SubLString $str327$query;
    private static final SubLString $str328$Root;
    private static final SubLString $str329$root;
    private static final SubLString $str330$Key_Rules_;
    private static final SubLString $str331$rules;
    private static final SubLString $str332$Because_;
    private static final SubLString $str333$because;
    private static final SubLString $str334$Detailed_Justification_;
    private static final SubLString $str335$details;
    private static final SubLString $str336$Linear_Justification_;
    private static final SubLString $str337$linear;
    private static final SubLSymbol $sym338$PPH_PROOF_INDENT;
    private static final SubLSymbol $sym339$HTML_TABLE;
    private static final SubLList $list340;
    private static final SubLString $str341$filtered;
    private static final SubLString $str342$Filtered_Supports;
    private static final SubLString $str343$Reason___S;
    private static final SubLSymbol $kw344$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym345$IGNORE_ERRORS_HANDLER;
    private static final SubLObject $const346$CycProofViewSummarySection;
    private static final SubLObject $const347$CycProofViewJustificationSection;
    private static final SubLSymbol $sym348$CYC_PROOF_VIEW_SECTION_HTML;
    private static final SubLString $str349$___S_handled_by__S__;
    private static final SubLSymbol $sym350$DEBUG_PROOF_VIEW_CB_LINK_FOR_TERM;
    private static final SubLString $str351$pf_stepnum;
    private static final SubLString $str352$pf_steprow;
    private static final SubLString $str353$pf_label;
    private static final SubLString $str354$_A;
    private static final SubLString $str355$pf_entry_content;
    private static final SubLString $str356$pf_children;
    private static final SubLString $str357$Already_seen__S;
    private static final SubLInteger $int358$200;
    private static final SubLString $str359$pf_paraphrase;
    private static final SubLString $str360$_4d_;
    private static final SubLSymbol $sym361$PROOF_VIEW_ENTRY_P;
    private static final SubLString $str362$pf_object_pf_entry_struct;
    private static final SubLString $str363$pf_object;
    private static final SubLString $str364$pf_proof;
    private static final SubLString $str365$Proof__;
    private static final SubLString $str366$pf_function;
    private static final SubLString $str367$Function___S;
    private static final SubLString $str368$pf_function_section;
    private static final SubLString $str369$Section___S;
    private static final SubLSymbol $kw370$QUERY_SENTENCE;
    private static final SubLSymbol $sym371$EL_TERM_P;
    private static final SubLSymbol $sym372$ASSERTION_P;
    private static final SubLSymbol $sym373$SUPPORT_P;
    private static final SubLSymbol $sym374$EL_SENTENCE_P;
    private static final SubLSymbol $kw375$PREMISE;
    private static final SubLSymbol $kw376$RULE;
    private static final SubLSymbol $kw377$CONCLUSION;
    private static final SubLSymbol $kw378$VISIBLE;
    private static final SubLSymbol $kw379$SECTION_ROOT;
    private static final SubLString $str380$pf_entry_;
    private static final SubLString $str381$pf_;
    private static final SubLList $list382;
    private static final SubLString $str383$Inferred_;
    private static final SubLString $str384$Asserted_;
    private static final SubLString $str385$Opaque_;
    private static final SubLSymbol $kw386$NEG;
    private static final SubLSymbol $kw387$POS;
    private static final SubLSymbol $sym388$PPH_TRIVIAL_NEG_LIT_;
    private static final SubLObject $const389$evaluate;
    private static final SubLSymbol $sym390$ATOMIC_SENTENCE_PREDICATE;
    private static final SubLList $list391;
    private static final SubLObject $const392$termOfUnit;
    private static final SubLSymbol $sym393$CDR;
    private static final SubLSymbol $sym394$PROOF_SUID;
    private static final SubLSymbol $sym395$PPH_PROOF_CONCLUSION;
    private static final SubLSymbol $sym396$PPH_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_;
    private static final SubLSymbol $sym397$PPH_FIND_ASSERTION_FOR_SUPPORT;
    private static final SubLSymbol $sym398$DEDUCTION_P;
    private static final SubLSymbol $sym399$EARLIER_DEDUCTION_P;
    private static final SubLSymbol $sym400$ASSERTION_FORMULA;
    private static final SubLSymbol $sym401$ASSERTION_MT;
    private static final SubLSymbol $sym402$PPH_SUPPORT_TREE_P;
    private static final SubLList $list403;
    private static final SubLSymbol $sym404$PPH_PREFER_DEDUCTION_;
    private static final SubLSymbol $sym405$EXPRESSION_FIND;
    private static final SubLSymbol $sym406$PPH_ASSERTION_HAS_GLOSS_;
    private static final SubLList $list407;
    private static final SubLSymbol $kw408$DISJOINTWITH;
    private static final SubLString $str409$HL_VERIFY_failure_on_valid_suppor;
    private static final SubLList $list410;
    private static final SubLList $list411;
    private static final SubLSymbol $kw412$ASCENDING;
    private static final SubLSymbol $kw413$GENLS;
    private static final SubLList $list414;
    private static final SubLObject $const415$disjointWith;
    private static final SubLList $list416;
    private static final SubLList $list417;
    private static final SubLSymbol $kw418$DESCENDING;
    private static final SubLString $str419$No_THCL_or_non_irrelevant_collect;
    private static final SubLFloat $float420$1_0;
    private static final SubLSymbol $sym421$INFERENCE_P;
    private static final SubLSymbol $sym422$NUMBERP;
    private static final SubLSymbol $kw423$NEW;
    private static final SubLSymbol $kw424$QUIET;
    private static final SubLSymbol $sym425$NEW_PPH_SENTENCE;
    private static final SubLObject $const426$appropriateResponseContent;
    private static final SubLObject $const427$BestSupportSentenceFn;
    private static final SubLSymbol $kw428$MAX_NUMBER;
    private static final SubLSymbol $sym429$VARIABLE_BINDING_VALUE;
    private static final SubLSymbol $kw430$REMOVED_SUPPORTS_THAT_DONT_MENTION_BINDING_VALUES;
    private static final SubLSymbol $sym431$FORT_P;
    private static final SubLSymbol $kw432$USED_SUPPORTS_THAT_MENTION_MOST_PROVEN_SENTENCE_FORTS;
    private static final SubLSymbol $sym433$PPH_EXPLANATION_SENTENCE_FROM_SUPPORT;
    private static final SubLObject $const434$authorityClaims_Term;
    private static final SubLString $str435$_S___has_too_many_bindings__no_mo;
    private static final SubLObject $const436$True;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 974L)
    public static SubLObject generate_inference_answer_sentence_for_java(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject answer_id, SubLObject language_mt) {
        if (language_mt == pph_proof.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_proof.NIL != subl_promotions.non_negative_integer_p(problem_store_id) : problem_store_id;
        assert pph_proof.NIL != subl_promotions.non_negative_integer_p(inference_id) : inference_id;
        assert pph_proof.NIL != subl_promotions.non_negative_integer_p(answer_id) : answer_id;
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(problem_store_id, inference_id, answer_id);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject query_mt = pph_get_inference_mt(inference);
        SubLObject result = (SubLObject)pph_proof.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)pph_proof.T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)pph_proof.UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)pph_proof.T, thread);
            pph_vars.$pph_repositioned_proofs$.bind((SubLObject)pph_proof.NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind((SubLObject)pph_proof.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$1 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind((pph_proof.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind((pph_proof.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
                SubLObject justification = (SubLObject)pph_proof.NIL;
                justification = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    if (pph_proof.NIL == result) {
                        SubLObject cdolist_list_var_$3 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                        SubLObject proof = (SubLObject)pph_proof.NIL;
                        proof = cdolist_list_var_$3.first();
                        while (pph_proof.NIL != cdolist_list_var_$3) {
                            if (pph_proof.NIL == result) {
                                final SubLObject proof_conclusion = pph_proof_conclusion(proof, query_mt);
                                final SubLObject javalist = pph_main.generate_phrase_for_java(proof_conclusion, (SubLObject)pph_proof.$kw2$DEFAULT, (SubLObject)pph_proof.$kw3$DECLARATIVE, language_mt, query_mt, (SubLObject)pph_proof.UNPROVIDED);
                                if (pph_proof.NIL != proof_conclusion && pph_proof.NIL != javalist) {
                                    result = (SubLObject)ConsesLow.list(javalist, proof_conclusion);
                                }
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            proof = cdolist_list_var_$3.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                }
            }
            finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$2, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
        }
        if (pph_proof.NIL == result) {
            Errors.error((SubLObject)pph_proof.$str4$Couldn_t_generate_a_paraphrase_fo, problem_store_id, inference_id, answer_id);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 2395L)
    public static SubLObject pph_show_inference_answer_proofs(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject mt = pph_get_inference_mt(inference);
        SubLObject proof_num = (SubLObject)pph_proof.ZERO_INTEGER;
        SubLObject done_proofs = (SubLObject)pph_proof.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)pph_proof.T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)pph_proof.UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)pph_proof.T, thread);
            pph_vars.$pph_repositioned_proofs$.bind((SubLObject)pph_proof.NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind((SubLObject)pph_proof.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$4 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$5 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind((pph_proof.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind((pph_proof.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                pph_macros.pph_possibly_enable_showXhide();
                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
                SubLObject justification = (SubLObject)pph_proof.NIL;
                justification = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$6 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                    SubLObject proof = (SubLObject)pph_proof.NIL;
                    proof = cdolist_list_var_$6.first();
                    while (pph_proof.NIL != cdolist_list_var_$6) {
                        if (pph_proof.NIL == subl_promotions.memberP(proof, done_proofs, (SubLObject)pph_proof.$sym5$PPH_PROOF__, (SubLObject)pph_proof.UNPROVIDED)) {
                            final SubLObject index_string = print_high.princ_to_string(proof_num);
                            final SubLObject _prev_bind_0_$5 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
                            try {
                                pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(proof), thread);
                                pph_maybe_show_inference_proof_summary(proof, mt);
                                pph_show_inference_proof(proof, mt, index_string);
                            }
                            finally {
                                pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0_$5, thread);
                            }
                            done_proofs = (SubLObject)ConsesLow.cons(proof, done_proofs);
                            proof_num = Numbers.add(proof_num, (SubLObject)pph_proof.ONE_INTEGER);
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        proof = cdolist_list_var_$6.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                }
            }
            finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$5, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
        }
        return inference_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 3301L)
    public static SubLObject pph_show_inference_answer_proof(final SubLObject inference_answer, SubLObject proof) {
        if (proof == pph_proof.UNPROVIDED) {
            proof = (SubLObject)pph_proof.$kw6$FIND_BEST;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != inference_datastructures_proof.proof_p(proof) && pph_proof.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_proof.NIL == proof_of_inference_answer_p(proof, inference_answer)) {
            Errors.error((SubLObject)pph_proof.$str7$_S_is_not_a_proof_of__S, proof, inference_answer);
        }
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject mt = pph_get_inference_mt(inference);
        final SubLObject proofs = inference_answer_get_proofs(inference_answer);
        final SubLObject best_proof = (pph_proof.NIL != inference_datastructures_proof.proof_p(proof)) ? proof : pph_find_best_proof(proofs);
        final SubLObject _prev_bind_0 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(best_proof), thread);
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)pph_proof.T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)pph_proof.UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)pph_proof.T, thread);
            pph_vars.$pph_repositioned_proofs$.bind((SubLObject)pph_proof.NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind((SubLObject)pph_proof.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$8 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$9 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind((pph_proof.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind((pph_proof.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                pph_macros.pph_possibly_enable_showXhide();
                pph_maybe_show_inference_proof_summary(best_proof, mt);
                pph_show_inference_proof(best_proof, mt, (SubLObject)pph_proof.$str8$proof);
            }
            finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$9, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$8, thread);
            }
        }
        finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0, thread);
        }
        return inference_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 4183L)
    public static SubLObject pph_inference_answer_justification_for_java(final SubLObject store_id, final SubLObject inference_id, final SubLObject answer_id, final SubLObject proof_suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(store_id, inference_id, answer_id);
        final SubLObject proof = inference_datastructures_problem_store.find_proof_by_ids(store_id, proof_suid);
        SubLObject justification_string = (SubLObject)pph_proof.NIL;
        assert pph_proof.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : inference_answer;
        assert pph_proof.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject stream = (SubLObject)pph_proof.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                pph_vars.$pph_use_showXhideP$.bind((SubLObject)pph_proof.NIL, thread);
                pph_show_inference_answer_proof(inference_answer, proof);
            }
            finally {
                pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_2, thread);
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            justification_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)pph_proof.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return justification_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 4828L)
    public static SubLObject pph_maybe_show_inference_proof_summary(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL == pph_templated_proofP(proof)) {
            final SubLObject proven_sentences = pph_proof_proven_sentences(proof, mt);
            if (pph_proof.NIL != list_utilities.lengthG(proven_sentences, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.UNPROVIDED)) {
                html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str11$Facts_Proved_);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    SubLObject cdolist_list_var = proven_sentences;
                    SubLObject proven_sentence = (SubLObject)pph_proof.NIL;
                    proven_sentence = cdolist_list_var.first();
                    while (pph_proof.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            pph_show_sentence(proven_sentence, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        proven_sentence = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                html_utilities.html_hr((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            }
            if (pph_proof.NIL != pph_vars.$pph_proof_show_facts_usedP$.getDynamicValue(thread)) {
                final SubLObject depth_cutoff = pph_vars.$pph_proof_show_facts_depth_cutoff$.getDynamicValue(thread);
                final SubLObject used_assertions = list_utilities.remove_if_not((SubLObject)pph_proof.$sym12$GAF_ASSERTION_, pph_proof_used_assertions(proof, mt, depth_cutoff, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject minimum_worth_showing = (SubLObject)pph_proof.ONE_INTEGER;
                if (pph_proof.NIL != list_utilities.lengthGE(used_assertions, minimum_worth_showing, (SubLObject)pph_proof.UNPROVIDED)) {
                    html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                    if (pph_proof.NIL != depth_cutoff) {
                        html_utilities.html_princ_strong((SubLObject)pph_proof.$str13$Selected_);
                    }
                    html_utilities.html_princ_strong((SubLObject)pph_proof.$str14$Facts_Used_from_Knowledge_Base_);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        SubLObject cdolist_list_var2 = used_assertions;
                        SubLObject used_assertion = (SubLObject)pph_proof.NIL;
                        used_assertion = cdolist_list_var2.first();
                        while (pph_proof.NIL != cdolist_list_var2) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                pph_show_assertion(used_assertion);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            used_assertion = cdolist_list_var2.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_hr((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                }
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 5862L)
    public static SubLObject pph_proof_used_assertions(final SubLObject proof, final SubLObject mt, SubLObject depth_cutoff, SubLObject strict_cutoffP) {
        if (depth_cutoff == pph_proof.UNPROVIDED) {
            depth_cutoff = (SubLObject)pph_proof.NIL;
        }
        if (strict_cutoffP == pph_proof.UNPROVIDED) {
            strict_cutoffP = (SubLObject)pph_proof.T;
        }
        SubLObject used_assertions = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_worker.structural_proof_p(proof)) {
            used_assertions = pph_proof_used_assertions_from_subproofs(proof, mt, depth_cutoff, strict_cutoffP);
        }
        else if (pph_proof.NIL == sksi_proof_p(proof)) {
            if (pph_proof.NIL != inference_worker_removal.removal_proof_p(proof)) {
                used_assertions = pph_proof_used_assertions_from_supports(proof, mt, depth_cutoff, strict_cutoffP);
            }
            else if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
                used_assertions = list_utilities.delete_if_not((SubLObject)pph_proof.$sym15$ASSERTED_ASSERTION_, ConsesLow.append(pph_proof_used_assertions_from_supports(proof, mt, depth_cutoff, strict_cutoffP), pph_proof_used_assertions_from_subproofs(proof, mt, (pph_proof.NIL != subl_promotions.non_negative_integer_p(depth_cutoff)) ? number_utilities.f_1_(depth_cutoff) : depth_cutoff, strict_cutoffP)), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            }
        }
        return Sequences.delete_if((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, Sequences.delete_duplicates(used_assertions, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.$sym17$PPH_SUPPORT_EL_SENTENCE), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 6949L)
    public static SubLObject pph_proof_used_assertions_from_subproofs(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject used_assertions = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = pph_proof_subproofs(proof);
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = pph_proof_used_assertions(subproof, mt, depth_cutoff, strict_cutoffP);
            SubLObject as = (SubLObject)pph_proof.NIL;
            as = cdolist_list_var_$12.first();
            while (pph_proof.NIL != cdolist_list_var_$12) {
                used_assertions = (SubLObject)ConsesLow.cons(as, used_assertions);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                as = cdolist_list_var_$12.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        used_assertions = Sequences.nreverse(used_assertions);
        return used_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 7330L)
    public static SubLObject pph_proof_used_assertions_from_supports(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject used_assertions = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof));
        SubLObject support = (SubLObject)pph_proof.NIL;
        support = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = pph_meta_supports_from_tree(pph_meta_support_tree(support, set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)), depth_cutoff, strict_cutoffP, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject meta_support = (SubLObject)pph_proof.NIL;
            meta_support = cdolist_list_var_$13.first();
            while (pph_proof.NIL != cdolist_list_var_$13) {
                if (pph_proof.NIL != assertion_handles.assertion_p(meta_support) && pph_proof.NIL == pph_hypothesized_supportP(meta_support, mt)) {
                    used_assertions = (SubLObject)ConsesLow.cons(meta_support, used_assertions);
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                meta_support = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return used_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 7869L)
    public static SubLObject pph_proof_used_external_supports(final SubLObject proof, final SubLObject mt, SubLObject depth_cutoff, SubLObject strict_cutoffP) {
        if (depth_cutoff == pph_proof.UNPROVIDED) {
            depth_cutoff = (SubLObject)pph_proof.NIL;
        }
        if (strict_cutoffP == pph_proof.UNPROVIDED) {
            strict_cutoffP = (SubLObject)pph_proof.T;
        }
        SubLObject external_supports = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_worker.structural_proof_p(proof)) {
            external_supports = pph_proof_external_supports_from_subproofs(proof, mt, depth_cutoff, strict_cutoffP);
        }
        else if (pph_proof.NIL != sksi_proof_p(proof)) {
            external_supports = pph_proof_external_supports_from_supports(proof, mt, depth_cutoff, strict_cutoffP);
        }
        else if (pph_proof.NIL == inference_worker_removal.removal_proof_p(proof)) {
            if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
                external_supports = list_utilities.delete_if_not((SubLObject)pph_proof.$sym18$HL_SUPPORT_P, ConsesLow.append(pph_proof_external_supports_from_supports(proof, mt, depth_cutoff, strict_cutoffP), pph_proof_external_supports_from_subproofs(proof, mt, (pph_proof.NIL != subl_promotions.non_negative_integer_p(depth_cutoff)) ? number_utilities.f_1_(depth_cutoff) : depth_cutoff, strict_cutoffP)), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            }
        }
        return Sequences.delete_if((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, Sequences.delete_duplicates(external_supports, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 8955L)
    public static SubLObject pph_proof_external_supports_from_subproofs(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject external_supports = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = pph_proof_subproofs(proof);
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = pph_proof_used_external_supports(subproof, mt, depth_cutoff, strict_cutoffP);
            SubLObject support = (SubLObject)pph_proof.NIL;
            support = cdolist_list_var_$14.first();
            while (pph_proof.NIL != cdolist_list_var_$14) {
                final SubLObject item_var = support;
                if (pph_proof.NIL == conses_high.member(item_var, external_supports, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.IDENTITY))) {
                    external_supports = (SubLObject)ConsesLow.cons(item_var, external_supports);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                support = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        external_supports = Sequences.nreverse(external_supports);
        return external_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 9380L)
    public static SubLObject pph_proof_external_supports_from_supports(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject external_supports = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof));
        SubLObject support = (SubLObject)pph_proof.NIL;
        support = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = pph_meta_supports_from_tree(pph_meta_support_tree(support, set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)), depth_cutoff, strict_cutoffP, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject meta_support = (SubLObject)pph_proof.NIL;
            meta_support = cdolist_list_var_$15.first();
            while (pph_proof.NIL != cdolist_list_var_$15) {
                if (pph_proof.NIL != proof_view.proof_view_external_support_p(meta_support)) {
                    final SubLObject item_var = meta_support;
                    if (pph_proof.NIL == conses_high.member(item_var, external_supports, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.IDENTITY))) {
                        external_supports = (SubLObject)ConsesLow.cons(item_var, external_supports);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                meta_support = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return external_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 9905L)
    public static SubLObject sksi_proof_p(final SubLObject proof) {
        if (pph_proof.NIL != inference_worker.content_proof_p(proof)) {
            final SubLObject hl_module = inference_worker.content_proof_hl_module(proof);
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != inference_modules.hl_module_p(hl_module) && pph_proof.NIL != conses_high.member((SubLObject)pph_proof.$kw19$SKSI, inference_modules.hl_module_subtypes(hl_module), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 10127L)
    public static SubLObject pph_meta_supports_from_tree(final SubLObject support_tree, SubLObject depth_cutoff, SubLObject strict_cutoffP, SubLObject current_depth, SubLObject terminal_onlyP) {
        if (depth_cutoff == pph_proof.UNPROVIDED) {
            depth_cutoff = (SubLObject)pph_proof.NIL;
        }
        if (strict_cutoffP == pph_proof.UNPROVIDED) {
            strict_cutoffP = (SubLObject)pph_proof.T;
        }
        if (current_depth == pph_proof.UNPROVIDED) {
            current_depth = (SubLObject)pph_proof.ZERO_INTEGER;
        }
        if (terminal_onlyP == pph_proof.UNPROVIDED) {
            terminal_onlyP = (SubLObject)pph_proof.NIL;
        }
        SubLObject meta_supports = (SubLObject)pph_proof.NIL;
        final SubLObject depth_cutoff_exceededP = (SubLObject)SubLObjectFactory.makeBoolean(depth_cutoff.isInteger() && current_depth.numG(depth_cutoff));
        if (pph_proof.NIL != pph_support_tree_p(support_tree)) {
            if (pph_proof.NIL == strict_cutoffP || pph_proof.NIL == depth_cutoff_exceededP) {
                SubLObject cdolist_list_var = pph_support_tree_supporters(support_tree);
                SubLObject meta_support_tree = (SubLObject)pph_proof.NIL;
                meta_support_tree = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$16 = pph_meta_supports_from_tree(meta_support_tree, depth_cutoff, strict_cutoffP, number_utilities.f_1X(current_depth), terminal_onlyP);
                    SubLObject meta_support = (SubLObject)pph_proof.NIL;
                    meta_support = cdolist_list_var_$16.first();
                    while (pph_proof.NIL != cdolist_list_var_$16) {
                        if (pph_proof.NIL == depth_cutoff_exceededP || pph_proof.NIL != pph_exempted_supportP(meta_support)) {
                            meta_supports = (SubLObject)ConsesLow.cons(meta_support, meta_supports);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        meta_support = cdolist_list_var_$16.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_support_tree = cdolist_list_var.first();
                }
            }
            if (pph_proof.NIL == terminal_onlyP || pph_proof.NIL == meta_supports) {
                meta_supports = (SubLObject)ConsesLow.cons(pph_support_tree_supported(support_tree), meta_supports);
            }
        }
        return Sequences.delete_duplicates(meta_supports, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 11173L)
    public static SubLObject pph_terminal_meta_supports_from_tree(final SubLObject support_tree, SubLObject depth_cutoff, SubLObject strict_cutoffP, SubLObject current_depth) {
        if (depth_cutoff == pph_proof.UNPROVIDED) {
            depth_cutoff = (SubLObject)pph_proof.NIL;
        }
        if (strict_cutoffP == pph_proof.UNPROVIDED) {
            strict_cutoffP = (SubLObject)pph_proof.T;
        }
        if (current_depth == pph_proof.UNPROVIDED) {
            current_depth = (SubLObject)pph_proof.ZERO_INTEGER;
        }
        return pph_meta_supports_from_tree(support_tree, depth_cutoff, strict_cutoffP, current_depth, (SubLObject)pph_proof.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 11508L)
    public static SubLObject pph_exempted_supportP(final SubLObject support) {
        if (pph_proof.NIL != assertion_handles.assertion_p(support) && pph_proof.NIL != sources.assertion_sourcedP(support)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 11660L)
    public static SubLObject pph_proof_proven_sentences(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proven_sentences = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_worker.structural_proof_p(proof)) {
            SubLObject cdolist_list_var = pph_proof_subproofs(proof);
            SubLObject subproof = (SubLObject)pph_proof.NIL;
            subproof = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$17 = pph_proof_proven_sentences(subproof, mt);
                SubLObject sentence = (SubLObject)pph_proof.NIL;
                sentence = cdolist_list_var_$17.first();
                while (pph_proof.NIL != cdolist_list_var_$17) {
                    proven_sentences = (SubLObject)ConsesLow.cons(sentence, proven_sentences);
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    sentence = cdolist_list_var_$17.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            proven_sentences = Sequences.nreverse(proven_sentences);
        }
        else if (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof)) {
            proven_sentences = (SubLObject)ConsesLow.cons(pph_proof_el_formula(proof, mt), proven_sentences);
            proven_sentences = ConsesLow.append(pph_real_or_quasi_transformation_proof_intermediate_conclusions(proof, mt), proven_sentences);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            proven_sentences = Sequences.delete_if((SubLObject)pph_proof.$sym20$PPH_TRIVIAL_SENTENCE_, Sequences.delete_if((SubLObject)pph_proof.$sym21$PPH_IRRELEVANT_FORMULA_, Sequences.delete_duplicates(proven_sentences, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.$sym22$PPH_PROOF_PROVEN_SENTENCE_EL_SENTENCE), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return proven_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 12549L)
    public static SubLObject pph_proof_proven_sentence_el_sentence(final SubLObject sentence) {
        if (pph_proof.NIL != assertion_handles.assertion_p(sentence)) {
            return pph_support_el_sentence(sentence);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 12721L)
    public static SubLObject inference_answer_get_proofs(final SubLObject inference_answer) {
        assert pph_proof.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : inference_answer;
        SubLObject proofs = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = (SubLObject)pph_proof.NIL;
        justification = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            proofs = (SubLObject)ConsesLow.cons(pph_pick_justification_proof(justification), proofs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 13064L)
    public static SubLObject pph_pick_justification_proof(final SubLObject justification) {
        return inference_datastructures_inference.inference_answer_justification_first_proof(justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 13193L)
    public static SubLObject pph_preferable_and_equal_proofP(final SubLObject proof1, final SubLObject proof2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != pph_proof_E(proof1, proof2) && pph_proof.NIL != list_utilities.greater_length_p(abduction.proof_abductions(proof2), abduction.proof_abductions(proof1)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 13379L)
    public static SubLObject inference_answer_get_justification_with_proof(final SubLObject inference_answer, final SubLObject proof) {
        assert pph_proof.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : inference_answer;
        assert pph_proof.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = (SubLObject)pph_proof.NIL;
        justification = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
            SubLObject real_proof = (SubLObject)pph_proof.NIL;
            real_proof = cdolist_list_var_$18.first();
            while (pph_proof.NIL != cdolist_list_var_$18) {
                if (proof.eql(real_proof)) {
                    return justification;
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                real_proof = cdolist_list_var_$18.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 13891L)
    public static SubLObject pph_find_best_proof(final SubLObject proofs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_proof.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                ans = list_utilities.extremal(proofs, (SubLObject)pph_proof.$sym23$_, (SubLObject)pph_proof.$sym24$PPH_PROOF_DEPTH);
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 14056L)
    public static SubLObject pph_proof_depth(final SubLObject proof) {
        return pph_proof_depth_memoized(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 14139L)
    public static SubLObject pph_proof_depth_memoized_internal(final SubLObject proof) {
        if (pph_proof.NIL == inference_datastructures_proof.proof_direct_subproofs(proof)) {
            return (SubLObject)pph_proof.ONE_INTEGER;
        }
        return number_utilities.f_1X(number_utilities.maximum(Mapping.mapcar((SubLObject)pph_proof.$sym25$PPH_PROOF_DEPTH_MEMOIZED, inference_datastructures_proof.proof_direct_subproofs(proof)), (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 14139L)
    public static SubLObject pph_proof_depth_memoized(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_proof_depth_memoized_internal(proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym25$PPH_PROOF_DEPTH_MEMOIZED, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym25$PPH_PROOF_DEPTH_MEMOIZED, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQ, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym25$PPH_PROOF_DEPTH_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_proof_depth_memoized_internal(proof)));
            memoization_state.caching_state_put(caching_state, proof, results, (SubLObject)pph_proof.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 14433L)
    public static SubLObject pph_proof_E(final SubLObject proof1, final SubLObject proof2) {
        final SubLObject supports1 = inference_datastructures_proof.proof_direct_supports(proof1);
        final SubLObject supports2 = inference_datastructures_proof.proof_direct_supports(proof2);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != list_utilities.same_length_p(supports1, supports2) && pph_proof.NIL != list_utilities.proper_list_p(supports1) && pph_proof.NIL != arguments.hl_justification_p(supports1) && pph_proof.NIL != arguments.hl_justification_p(supports2) && pph_proof.NIL == conses_high.set_difference(supports1, supports2, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym26$SUPPORT_SENTENCE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 14922L)
    public static SubLObject pph_irrelevant_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl = (SubLObject)pph_proof.NIL;
        SubLObject format_string = (SubLObject)pph_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list27);
        cycl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list27);
        format_string = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym28$PWHEN, (SubLObject)pph_proof.$sym29$_PPH_IRRELEVANT_WARN__, (SubLObject)ConsesLow.listS((SubLObject)pph_proof.$sym30$WARN, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym31$CCONCATENATE, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym32$FORMAT_NIL, (SubLObject)pph_proof.$str33$PPH_irrelevant_formula_____S__, cycl), format_string), ConsesLow.append(args, (SubLObject)pph_proof.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 15141L)
    public static SubLObject pph_show_inference_proof(final SubLObject proof, final SubLObject mt, SubLObject proof_index_string) {
        if (proof_index_string == pph_proof.UNPROVIDED) {
            proof_index_string = (SubLObject)pph_proof.$str8$proof;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_el_formula = pph_proof_el_formula(proof, mt);
        final SubLObject proof_conclusion = pph_proof_conclusion(proof, mt);
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            pph_vars.$pph_proof_depth$.bind(number_utilities.f_1X(pph_vars.$pph_proof_depth$.getDynamicValue(thread)), thread);
            thread.resetMultipleValues();
            final SubLObject analogous_to_lastP = pph_proofs_analogousP(proof, pph_most_recent_proof_displayed(), mt);
            final SubLObject diffs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_proof.NIL == conses_high.member(proof, pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                if (pph_proof.NIL != inference_worker.structural_proof_p(proof)) {
                    SubLObject list_var = (SubLObject)pph_proof.NIL;
                    SubLObject subproof = (SubLObject)pph_proof.NIL;
                    SubLObject i = (SubLObject)pph_proof.NIL;
                    list_var = pph_proof_subproofs(proof);
                    subproof = list_var.first();
                    for (i = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), subproof = list_var.first(), i = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, i)) {
                        final SubLObject index_string = Sequences.cconcatenate(proof_index_string, print_high.princ_to_string(i));
                        final SubLObject _prev_bind_0_$20 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                        try {
                            pph_vars.$pph_proof_depth$.bind(number_utilities.f_1_(pph_vars.$pph_proof_depth$.getDynamicValue(thread)), thread);
                            pph_show_inference_proof(subproof, mt, index_string);
                        }
                        finally {
                            pph_vars.$pph_proof_depth$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    pph_note_proof_displayed(proof);
                }
                else if (pph_proof.NIL != pph_trivial_sentenceP(query_el_formula, mt)) {
                    if (pph_proof.NIL != pph_vars.$pph_show_trivial_proofsP$.getDynamicValue(thread)) {
                        pph_show_trivial_proof(proof, mt);
                    }
                    pph_note_proof_displayed(proof);
                }
                else if (pph_proof.NIL != analogous_to_lastP && pph_proof.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_proof.UNPROVIDED)) {
                    pph_show_analogous_proof(proof, mt, diffs);
                }
                else if (pph_proof.NIL != pph_proof_already_displayed_p(proof)) {
                    html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                    pph_show_proof_conclusion_int(proof_conclusion);
                    if (pph_proof.NIL != pph_proof_already_justified_p(proof)) {
                        pph_proof_show_see_above(proof_index_string);
                    }
                }
                else if (pph_proof.NIL == pph_irrelevant_formulaP(query_el_formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                    if (pph_proof.NIL == pph_justify_proofP(proof, mt, (SubLObject)pph_proof.UNPROVIDED)) {
                        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                        pph_show_proof_conclusion_int(proof_conclusion);
                        pph_note_proof_displayed(proof);
                    }
                    else if (pph_proof.NIL != pph_proof_wX_isomorphic_support_p(proof) && pph_proof.NIL == pph_quasi_transformation_proof_p(proof)) {
                        final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
                        if (pph_vars.$pph_proof_depth$.getDynamicValue(thread).isPositive()) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                pph_show_argument(supports, proof_index_string);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        else {
                            html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                            pph_show_argument(supports, proof_index_string);
                        }
                        pph_note_proof_displayed(proof);
                    }
                    else {
                        final SubLObject style = (SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION;
                        if (pph_proof.NIL != pph_top_level_proof_p()) {
                            pph_show_proof_query_and_supports(proof, query_el_formula, mt, proof_index_string, style);
                        }
                        else {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                pph_show_proof_query_and_supports(proof, query_el_formula, mt, proof_index_string, style);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        pph_note_proof_displayed(proof);
                    }
                }
            }
        }
        finally {
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 17614L)
    public static SubLObject pph_top_level_proof_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numE(pph_vars.$pph_proof_depth$.getDynamicValue(thread), pph_vars.$pph_top_level_proof_depth$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 17784L)
    public static SubLObject pph_proof_show_see_above(final SubLObject index_string) {
        pph_proof_show_short_attribution((SubLObject)pph_proof.$str35$See_above, index_string);
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 17916L)
    public static SubLObject pph_proof_show_hypothetical_attribution(final SubLObject index_string) {
        pph_proof_show_short_attribution((SubLObject)pph_proof.$str36$From_question, index_string);
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 18067L)
    public static SubLObject pph_proof_show_short_attribution(final SubLObject attribution_text, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = Sequences.cconcatenate((SubLObject)pph_proof.$str37$see_above_, index_string);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_indent((SubLObject)pph_proof.TWO_INTEGER);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, (SubLObject)pph_proof.$str41$);
            dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (pph_proof.NIL != object_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(object_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(attribution_text);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        else {
            html_utilities.html_indent((SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str44$__A_, attribution_text);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 18729L)
    public static SubLObject pph_justify_proofP(final SubLObject proof, final SubLObject mt, SubLObject done_proofs) {
        if (done_proofs == pph_proof.UNPROVIDED) {
            done_proofs = set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != pph_proof_already_displayed_p(proof)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_displayworthy_supports(proof, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_proof_wX_isomorphic_support_p(proof)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_trivial_sentenceP(pph_proof_el_formula(proof, mt), mt)) {
            return (SubLObject)pph_proof.NIL;
        }
        set.set_add(proof, done_proofs);
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL == set.set_memberP(subproof, done_proofs) && pph_proof.NIL != pph_justify_proofP(subproof, mt, done_proofs)) {
                return (SubLObject)pph_proof.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 19471L)
    public static SubLObject find_or_create_pph_displayed_proof_stack() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread))) {
            return pph_vars.$pph_displayed_proofs$.getDynamicValue(thread);
        }
        return stacks.create_stack();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 19641L)
    public static SubLObject pph_note_proof_displayed(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread))) {
            stacks.stack_push(proof, pph_vars.$pph_displayed_proofs$.getDynamicValue(thread));
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)pph_proof.NIL;
            subproof = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                pph_note_proof_displayed(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 19886L)
    public static SubLObject pph_most_recent_proof_displayed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((pph_proof.NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread))) ? stacks.stack_peek(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread)) : pph_proof.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 20026L)
    public static SubLObject pph_proof_already_displayed_p(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread)) && pph_proof.NIL != stacks.stack_find(inference_worker.proof_proven_query(proof), pph_vars.$pph_displayed_proofs$.getDynamicValue(thread), (SubLObject)pph_proof.$sym45$PPH_PROOF_QUERY_EQUAL_, (SubLObject)pph_proof.$sym46$PROOF_PROVEN_QUERY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 20247L)
    public static SubLObject pph_proof_query_equalP(final SubLObject query1, final SubLObject query2) {
        SubLObject differentP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == list_utilities.same_length_p(query1, query2));
        if (pph_proof.NIL == differentP) {
            SubLObject clause1 = (SubLObject)pph_proof.NIL;
            SubLObject clause1_$25 = (SubLObject)pph_proof.NIL;
            SubLObject clause2 = (SubLObject)pph_proof.NIL;
            SubLObject clause2_$26 = (SubLObject)pph_proof.NIL;
            clause1 = query1;
            clause1_$25 = clause1.first();
            clause2 = query2;
            clause2_$26 = clause2.first();
            while (pph_proof.NIL == differentP && (pph_proof.NIL != clause2 || pph_proof.NIL != clause1)) {
                if (pph_proof.NIL == pph_proof_lits_equal(clauses.neg_lits(clause1_$25), clauses.neg_lits(clause2_$26)) || pph_proof.NIL == pph_proof_lits_equal(clauses.pos_lits(clause1_$25), clauses.pos_lits(clause2_$26))) {
                    differentP = (SubLObject)pph_proof.T;
                }
                clause1 = clause1.rest();
                clause1_$25 = clause1.first();
                clause2 = clause2.rest();
                clause2_$26 = clause2.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == differentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 20639L)
    public static SubLObject pph_proof_lits_equal(final SubLObject lits1, final SubLObject lits2) {
        SubLObject differentP = (SubLObject)pph_proof.NIL;
        differentP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == list_utilities.same_length_p(lits1, lits2));
        if (pph_proof.NIL == differentP) {
            SubLObject lit1 = (SubLObject)pph_proof.NIL;
            SubLObject lit1_$27 = (SubLObject)pph_proof.NIL;
            SubLObject lit2 = (SubLObject)pph_proof.NIL;
            SubLObject lit2_$28 = (SubLObject)pph_proof.NIL;
            lit1 = lits1;
            lit1_$27 = lit1.first();
            lit2 = lits2;
            lit2_$28 = lit2.first();
            while (pph_proof.NIL == differentP && (pph_proof.NIL != lit2 || pph_proof.NIL != lit1)) {
                SubLObject current;
                final SubLObject datum = current = lit1_$27;
                SubLObject mt1 = (SubLObject)pph_proof.NIL;
                SubLObject asent1 = (SubLObject)pph_proof.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list47);
                mt1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list47);
                asent1 = current.first();
                current = current.rest();
                if (pph_proof.NIL == current) {
                    SubLObject current_$30;
                    final SubLObject datum_$29 = current_$30 = lit2_$28;
                    SubLObject mt2 = (SubLObject)pph_proof.NIL;
                    SubLObject asent2 = (SubLObject)pph_proof.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)pph_proof.$list48);
                    mt2 = current_$30.first();
                    current_$30 = current_$30.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)pph_proof.$list48);
                    asent2 = current_$30.first();
                    current_$30 = current_$30.rest();
                    if (pph_proof.NIL == current_$30) {
                        differentP = (SubLObject)SubLObjectFactory.makeBoolean(!asent1.equal(asent2));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$29, (SubLObject)pph_proof.$list48);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list47);
                }
                lit1 = lit1.rest();
                lit1_$27 = lit1.first();
                lit2 = lit2.rest();
                lit2_$28 = lit2.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == differentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 21054L)
    public static SubLObject find_or_create_pph_justified_proof_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != set.set_p(pph_vars.$pph_justified_proofs$.getDynamicValue(thread))) {
            return pph_vars.$pph_justified_proofs$.getDynamicValue(thread);
        }
        return set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 21214L)
    public static SubLObject pph_note_proof_justified(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != set.set_p(pph_vars.$pph_justified_proofs$.getDynamicValue(thread))) {
            set.set_add(proof, pph_vars.$pph_justified_proofs$.getDynamicValue(thread));
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 21363L)
    public static SubLObject pph_proof_already_justified_p(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != set.set_p(pph_vars.$pph_justified_proofs$.getDynamicValue(thread)) && pph_proof.NIL != set_utilities.set_find(inference_worker.proof_proven_query(proof), pph_vars.$pph_justified_proofs$.getDynamicValue(thread), (SubLObject)pph_proof.$sym45$PPH_PROOF_QUERY_EQUAL_, (SubLObject)pph_proof.$sym46$PROOF_PROVEN_QUERY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 21585L)
    public static SubLObject pph_note_support_displayed(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_vars.$pph_displayed_supports$.getDynamicValue(thread).isList()) {
            pph_vars.$pph_displayed_supports$.setDynamicValue((SubLObject)ConsesLow.cons(support, pph_vars.$pph_displayed_supports$.getDynamicValue(thread)), thread);
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 21744L)
    public static SubLObject pph_proofs_analogousP(final SubLObject proof1, final SubLObject proof2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject analogousP = (SubLObject)pph_proof.NIL;
        SubLObject diffs = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_datastructures_proof.proof_p(proof1) && pph_proof.NIL != inference_datastructures_proof.proof_p(proof2) && pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof1) && pph_proof.NIL != pph_proof_already_justified_p(proof2)) {
            thread.resetMultipleValues();
            final SubLObject analogousP_$31 = pph_proofs_analogousP_int(proof1, proof2, mt, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject diffs_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            analogousP = analogousP_$31;
            diffs = diffs_$32;
        }
        return Values.values(analogousP, diffs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 22338L)
    public static SubLObject pph_proofs_analogousP_int(final SubLObject proof1, final SubLObject proof2, final SubLObject mt, SubLObject nestedP) {
        if (nestedP == pph_proof.UNPROVIDED) {
            nestedP = (SubLObject)pph_proof.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject diffs = (SubLObject)pph_proof.NIL;
        if (!inference_datastructures_proof.proof_type(proof1).eql(inference_datastructures_proof.proof_type(proof2)) || (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof1) && !inference_worker_transformation.transformation_proof_rule_assertion(proof1).eql(inference_worker_transformation.transformation_proof_rule_assertion(proof2)))) {
            return Values.values((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL);
        }
        final SubLObject proof1_query = pph_proof_el_formula(proof1, mt);
        final SubLObject proof2_query = pph_proof_el_formula(proof2, mt);
        final SubLObject proof1_subproofs = inference_datastructures_proof.proof_direct_subproofs(proof1);
        final SubLObject proof2_subproofs = inference_datastructures_proof.proof_direct_subproofs(proof2);
        if (pph_proof.NIL != pph_cached_transformation_proof_p(proof1) && !cycl_utilities.formula_arg0(proof1_query).equal(cycl_utilities.formula_arg0(proof2_query))) {
            return Values.values((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL);
        }
        if (pph_proof.NIL == list_utilities.same_length_p(proof1_subproofs, proof2_subproofs)) {
            return Values.values((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL);
        }
        if (pph_proof.NIL != proof1_subproofs) {
            SubLObject subproof1 = (SubLObject)pph_proof.NIL;
            SubLObject subproof1_$33 = (SubLObject)pph_proof.NIL;
            SubLObject subproof2 = (SubLObject)pph_proof.NIL;
            SubLObject subproof2_$34 = (SubLObject)pph_proof.NIL;
            subproof1 = proof1_subproofs;
            subproof1_$33 = subproof1.first();
            subproof2 = proof2_subproofs;
            subproof2_$34 = subproof2.first();
            while (pph_proof.NIL != subproof2 || pph_proof.NIL != subproof1) {
                thread.resetMultipleValues();
                final SubLObject analogousP = pph_proofs_analogousP_int(subproof1_$33, subproof2_$34, mt, (SubLObject)pph_proof.T);
                final SubLObject new_diffs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_proof.NIL == analogousP) {
                    return Values.values((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL);
                }
                SubLObject cdolist_list_var = new_diffs;
                SubLObject diff = (SubLObject)pph_proof.NIL;
                diff = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    final SubLObject item_var = diff;
                    if (pph_proof.NIL == conses_high.member(item_var, diffs, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.IDENTITY))) {
                        diffs = (SubLObject)ConsesLow.cons(item_var, diffs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    diff = cdolist_list_var.first();
                }
                subproof1 = subproof1.rest();
                subproof1_$33 = subproof1.first();
                subproof2 = subproof2.rest();
                subproof2_$34 = subproof2.first();
            }
        }
        else if (pph_proof.NIL != nestedP && !proof1_query.equal(proof2_query)) {
            diffs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(proof1_query, proof2_query), diffs);
        }
        return Values.values((SubLObject)pph_proof.T, diffs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 23853L)
    public static SubLObject pph_show_analogous_proof(final SubLObject proof, final SubLObject mt, final SubLObject diffs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_princ((SubLObject)pph_proof.$str49$By_analogous_reasoning__);
        if (pph_proof.NIL != diffs) {
            html_utilities.html_princ((SubLObject)pph_proof.$str50$since_);
            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                SubLObject cdolist_list_var = diffs;
                SubLObject diff = (SubLObject)pph_proof.NIL;
                diff = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        pph_show_sentence(diff.first(), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    diff = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        }
        html_utilities.html_princ((SubLObject)pph_proof.$str51$it_follows_that_);
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        pph_show_proof_conclusion_int(proof_conclusion);
        html_utilities.html_hr((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 24436L)
    public static SubLObject pph_show_trivial_proof(final SubLObject proof, final SubLObject mt) {
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_princ((SubLObject)pph_proof.$str52$Trivially__);
        pph_show_sentence(pph_proof_el_formula(proof, mt), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 24670L)
    public static SubLObject pph_show_proof_query_and_supports(final SubLObject proof, final SubLObject query_el_formula, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        final SubLObject pcase_var = style;
        if (pcase_var.eql((SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION)) {
            pph_show_proof_supports_and_conclusion(proof, mt, proof_index_string);
        }
        else {
            pph_show_proof_query_and_supports_default(proof, query_el_formula, mt, proof_index_string);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 25057L)
    public static SubLObject pph_show_proof_supports_and_conclusion(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof)) {
            pph_show_real_or_quasi_transformation_proof_supports_bu(proof, mt, proof_index_string, (SubLObject)pph_proof.UNPROVIDED);
        }
        else {
            final SubLObject proof_conclusion = pph_proof_conclusion(proof, mt);
            pph_show_proof_conclusion_int(proof_conclusion);
            SubLObject supports = pph_displayworthy_supports(proof, (SubLObject)pph_proof.T, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, mt);
            if (pph_proof.NIL != el_utilities.el_formula_p(proof_conclusion)) {
                supports = Sequences.remove(proof_conclusion, supports, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym26$SUPPORT_SENTENCE, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            }
            if (pph_proof.NIL != supports) {
                pph_maybe_show_meta_supports(supports, proof_index_string, (SubLObject)pph_proof.UNPROVIDED);
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 25801L)
    public static SubLObject pph_displayworthy_supports(final SubLObject proof, SubLObject include_subproofsP, SubLObject inference_mt, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (include_subproofsP == pph_proof.UNPROVIDED) {
            include_subproofsP = (SubLObject)pph_proof.NIL;
        }
        if (inference_mt == pph_proof.UNPROVIDED) {
            inference_mt = (SubLObject)pph_proof.NIL;
        }
        if (pph_relevance_safe_list == pph_proof.UNPROVIDED) {
            pph_relevance_safe_list = (SubLObject)pph_proof.NIL;
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        if (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof) && pph_proof.NIL != proof_view_pruning_ruleP(pph_real_or_quasi_transformation_proof_rule(proof), domain_mt)) {
            return (SubLObject)pph_proof.NIL;
        }
        final SubLObject all = inference_datastructures_proof.proof_supports(proof);
        final SubLObject v_new = conses_high.set_difference(all, pph_displayed_supports(), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        SubLObject relevant = remove_if_pph_irrelevant_support(v_new, pph_relevance_safe_list);
        if (pph_proof.NIL != relevant) {
            final SubLObject rule = Sequences.find_if((SubLObject)pph_proof.$sym53$RULE_ASSERTION_, all, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            relevant = pph_prune_meta_supports(relevant, (SubLObject)((pph_proof.NIL != rule) ? proof_view_populator.proof_literals_to_suppress(proof, (SubLObject)pph_proof.UNPROVIDED) : pph_proof.NIL));
        }
        if (pph_proof.NIL != relevant && pph_proof.NIL != inference_mt) {
            SubLObject found_non_hypothesizedP = (SubLObject)pph_proof.NIL;
            if (pph_proof.NIL == found_non_hypothesizedP) {
                SubLObject csome_list_var = relevant;
                SubLObject support = (SubLObject)pph_proof.NIL;
                support = csome_list_var.first();
                while (pph_proof.NIL == found_non_hypothesizedP && pph_proof.NIL != csome_list_var) {
                    if (pph_proof.NIL == pph_hypothesized_supportP(support, inference_mt)) {
                        found_non_hypothesizedP = (SubLObject)pph_proof.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    support = csome_list_var.first();
                }
            }
            if (pph_proof.NIL == found_non_hypothesizedP) {
                relevant = v_new;
            }
        }
        if (pph_proof.NIL != include_subproofsP) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)pph_proof.NIL;
            subproof = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                relevant = ConsesLow.append(relevant, pph_displayworthy_supports(subproof, (SubLObject)pph_proof.T, inference_mt, pph_relevance_safe_list, domain_mt));
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return pph_sort_meta_supports(relevant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 27123L)
    public static SubLObject proof_view_pruning_ruleP(final SubLObject rule, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != assertion_handles.assertion_p(rule) && pph_proof.NIL != kb_mapping_utilities.some_pred_value(rule, pph_proof.$const55$ruleAndSupportsTrivialForJustific, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 27382L)
    public static SubLObject remove_if_pph_irrelevant_support(final SubLObject supports, final SubLObject pph_relevance_safe_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevant = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)pph_proof.NIL;
        support = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != pph_irrelevant_supportP(support, pph_relevance_safe_list, (SubLObject)pph_proof.UNPROVIDED)) {
                if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str56$__Removing_irrelevant_support____, support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                }
            }
            else {
                relevant = (SubLObject)ConsesLow.cons(support, relevant);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.nreverse(relevant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 27723L)
    public static SubLObject pph_non_trivial_proof_supports(final SubLObject proof) {
        return Sequences.remove_if((SubLObject)pph_proof.$sym57$PPH_SUPPORT_TRIVIAL_, inference_datastructures_proof.proof_supports(proof), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 27845L)
    public static SubLObject pph_real_or_quasi_transformation_proof_p(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof) || pph_proof.NIL != pph_quasi_transformation_proof_p(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 28003L)
    public static SubLObject pph_real_or_quasi_transformation_proof_rule(final SubLObject proof) {
        if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return inference_worker_transformation.transformation_proof_rule_assertion(proof);
        }
        if (pph_proof.NIL != pph_cached_transformation_proof_p(proof)) {
            return pph_cached_transformation_proof_supporting_assertion(proof);
        }
        if (pph_proof.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_rule_assertion(proof);
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 28419L)
    public static SubLObject pph_real_or_quasi_transformation_proof_intermediate_conclusions(final SubLObject proof, final SubLObject mt) {
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != pph_quasi_transformation_proof_p(proof)) {
            SubLObject cdolist_list_var = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof));
            SubLObject support = (SubLObject)pph_proof.NIL;
            support = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                if (pph_proof.NIL != pph_hypothesized_supportP(support, mt) && pph_proof.NIL == assertions_high.asserted_assertionP(support)) {
                    SubLObject cdolist_list_var_$36 = pph_assertion_deduced_support_sentences(support, mt, (SubLObject)pph_proof.UNPROVIDED);
                    SubLObject meta_support_sentence = (SubLObject)pph_proof.NIL;
                    meta_support_sentence = cdolist_list_var_$36.first();
                    while (pph_proof.NIL != cdolist_list_var_$36) {
                        ans = (SubLObject)ConsesLow.cons(meta_support_sentence, ans);
                        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                        meta_support_sentence = cdolist_list_var_$36.first();
                    }
                    if (pph_proof.NIL == pph_cached_transformation_proof_p(proof)) {
                        ans = (SubLObject)ConsesLow.cons(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)pph_proof.NIL;
            subproof = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$37 = pph_real_or_quasi_transformation_proof_intermediate_conclusions(subproof, mt);
                SubLObject conclusion = (SubLObject)pph_proof.NIL;
                conclusion = cdolist_list_var_$37.first();
                while (pph_proof.NIL != cdolist_list_var_$37) {
                    ans = (SubLObject)ConsesLow.cons(conclusion, ans);
                    cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                    conclusion = cdolist_list_var_$37.first();
                }
                if (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(subproof)) {
                    ans = (SubLObject)ConsesLow.cons(pph_proof_el_formula(subproof, mt), ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 29368L)
    public static SubLObject pph_assertion_deduced_support_sentences(final SubLObject assertion, final SubLObject mt, SubLObject circular_support_sentences) {
        if (circular_support_sentences == pph_proof.UNPROVIDED) {
            circular_support_sentences = set.new_set(Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        }
        SubLObject ans = (SubLObject)pph_proof.NIL;
        set.set_add(pph_support_sentence(assertion, (SubLObject)pph_proof.UNPROVIDED), circular_support_sentences);
        SubLObject cdolist_list_var = pph_assertion_supports(assertion, (SubLObject)pph_proof.T, circular_support_sentences);
        SubLObject support = (SubLObject)pph_proof.NIL;
        support = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL == set.set_memberP(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), circular_support_sentences) && pph_proof.NIL != pph_hypothesized_supportP(support, mt) && pph_proof.NIL == assertions_high.asserted_assertionP(support)) {
                set.set_add(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), circular_support_sentences);
                SubLObject cdolist_list_var_$38 = pph_assertion_deduced_support_sentences(support, mt, circular_support_sentences);
                SubLObject sentence = (SubLObject)pph_proof.NIL;
                sentence = cdolist_list_var_$38.first();
                while (pph_proof.NIL != cdolist_list_var_$38) {
                    ans = (SubLObject)ConsesLow.cons(sentence, ans);
                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                    sentence = cdolist_list_var_$38.first();
                }
                ans = (SubLObject)ConsesLow.cons(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 30377L)
    public static SubLObject pph_quasi_transformation_proof_p(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != pph_hl_transformation_proof_p(proof) || pph_proof.NIL != pph_cached_transformation_proof_p(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 30597L)
    public static SubLObject pph_hl_transformation_proof_p(final SubLObject proof) {
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_worker_removal.removal_proof_p(proof) && pph_proof.NIL == ans) {
            SubLObject csome_list_var = inference_datastructures_proof.proof_supports(proof);
            SubLObject support = (SubLObject)pph_proof.NIL;
            support = csome_list_var.first();
            while (pph_proof.NIL == ans && pph_proof.NIL != csome_list_var) {
                if (pph_proof.NIL != arguments.hl_support_p(support) && arguments.support_module(support) == pph_proof.$kw58$CODE && pph_proof.NIL != el_utilities.el_implication_p(arguments.support_sentence(support))) {
                    ans = support;
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 30927L)
    public static SubLObject pph_cached_transformation_proof_p(final SubLObject proof) {
        return assertion_handles.assertion_p(pph_cached_transformation_proof_supporting_assertion(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 31175L)
    public static SubLObject pph_cached_transformation_proof_supporting_assertion(final SubLObject proof) {
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_worker_removal.removal_proof_p(proof)) {
            final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
            if (pph_proof.NIL != list_utilities.singletonP(supports)) {
                final SubLObject assertion = pph_find_assertion_for_support(supports.first());
                if (pph_proof.NIL != assertion_handles.assertion_p(assertion) && pph_proof.NIL == assertions_high.asserted_assertionP(assertion) && pph_proof.NIL == ans) {
                    SubLObject csome_list_var = pph_support_tree_supporters(pph_assertion_support_tree(assertion, (SubLObject)pph_proof.UNPROVIDED));
                    SubLObject support_tree = (SubLObject)pph_proof.NIL;
                    support_tree = csome_list_var.first();
                    while (pph_proof.NIL == ans && pph_proof.NIL != csome_list_var) {
                        if (pph_proof.NIL != assertions_high.rule_assertionP(pph_support_tree_supported(support_tree))) {
                            ans = assertion;
                        }
                        csome_list_var = csome_list_var.rest();
                        support_tree = csome_list_var.first();
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 31907L)
    public static SubLObject pph_show_real_or_quasi_transformation_proof_supports_bu(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject nestedP) {
        if (nestedP == pph_proof.UNPROVIDED) {
            nestedP = (SubLObject)pph_proof.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        if (pph_proof.NIL == pph_irrelevant_proof_conclusionP(proof_conclusion)) {
            final SubLObject query_formula = pph_proof_el_formula(proof, mt);
            final SubLObject higher_as = (SubLObject)((pph_proof.NIL != el_utilities.atomic_sentenceP(query_formula)) ? pph_gaf_with_formula_in_higher_mt(query_formula, mt, (SubLObject)pph_proof.T) : pph_proof.NIL);
            if (pph_proof.NIL == assertion_handles.assertion_p(higher_as)) {
                if (pph_proof.NIL == nestedP && pph_proof.NIL == pph_top_level_proof_p()) {
                    pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, nestedP, (SubLObject)pph_proof.T);
                }
                SubLObject count = (SubLObject)pph_proof.ZERO_INTEGER;
                SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
                SubLObject subproof = (SubLObject)pph_proof.NIL;
                subproof = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    final SubLObject subproof_index_string = Sequences.cconcatenate(proof_index_string, new SubLObject[] { pph_proof.$str59$_, print_high.princ_to_string(count) });
                    pph_show_real_or_quasi_transformation_proof_supports_bu(subproof, mt, subproof_index_string, (SubLObject)pph_proof.T);
                    count = Numbers.add(count, (SubLObject)pph_proof.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    subproof = cdolist_list_var.first();
                }
                if (count.isPositive()) {
                    pph_note_proof_justified(proof);
                }
                if (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof) && pph_proof.NIL == pph_proof_already_displayed_p(proof)) {
                    if (pph_proof.NIL != pph_templated_proofP(proof)) {
                        pph_show_templated_proof(proof, mt, proof_index_string, nestedP);
                        return proof;
                    }
                    pph_show_real_or_quasi_transformation_proof_supports(proof, mt, proof_index_string, (SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION);
                    if (pph_proof.NIL != nestedP) {
                        pph_vars.$pph_repositioned_proofs$.setDynamicValue((SubLObject)ConsesLow.cons(proof, pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread)), thread);
                    }
                    pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, nestedP, (SubLObject)pph_proof.NIL);
                    pph_note_proof_displayed(proof);
                }
            }
            else {
                if (pph_proof.NIL != assertions_high.deduced_assertionP(higher_as)) {
                    if (pph_proof.NIL == nestedP && pph_proof.NIL == pph_top_level_proof_p()) {
                        pph_show_real_or_quasi_transformation_proof_conclusion(higher_as, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.T);
                    }
                    final SubLObject justifiedP = pph_show_cached_transformation_proof_supports_from_as(higher_as, mt, proof_index_string, (SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION);
                    if (pph_proof.NIL != justifiedP) {
                        pph_note_proof_justified(proof);
                    }
                    pph_show_real_or_quasi_transformation_proof_conclusion(higher_as, nestedP, (SubLObject)pph_proof.NIL);
                    pph_note_proof_displayed(proof);
                    return proof;
                }
                return proof;
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 34146L)
    public static SubLObject pph_show_real_or_quasi_transformation_proof_conclusion(final SubLObject proof_conclusion, SubLObject nestedP, SubLObject conclusion_precedes_proofP) {
        if (nestedP == pph_proof.UNPROVIDED) {
            nestedP = (SubLObject)pph_proof.NIL;
        }
        if (conclusion_precedes_proofP == pph_proof.UNPROVIDED) {
            conclusion_precedes_proofP = (SubLObject)pph_proof.NIL;
        }
        html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
        if (pph_proof.NIL != conclusion_precedes_proofP) {
            html_utilities.html_princ_strong((SubLObject)pph_proof.$str60$Proof_that);
        }
        else if (pph_proof.NIL != nestedP) {
            html_utilities.html_princ_strong((SubLObject)pph_proof.$str61$Intermediate_Result_);
        }
        else {
            html_utilities.html_princ_strong((SubLObject)pph_proof.$str62$Conclusion_);
        }
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        pph_show_proof_conclusion_int(proof_conclusion);
        return proof_conclusion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 34658L)
    public static SubLObject pph_show_proof_conclusion_int(final SubLObject proof_conclusion) {
        if (pph_proof.NIL != assertion_handles.assertion_p(proof_conclusion)) {
            pph_show_assertion(proof_conclusion);
        }
        else {
            pph_show_sentence(proof_conclusion, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        return proof_conclusion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 34878L)
    public static SubLObject pph_real_or_quasi_transformation_proof_conclusion(final SubLObject proof, final SubLObject mt) {
        if (pph_proof.NIL != pph_cached_transformation_proof_p(proof)) {
            return pph_cached_transformation_proof_supporting_assertion(proof);
        }
        return pph_proof_conclusion(proof, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 35130L)
    public static SubLObject pph_show_proof_query_and_supports_default(final SubLObject proof, final SubLObject query_el_formula, final SubLObject mt, final SubLObject proof_index_string) {
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        pph_show_sentence(query_el_formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            pph_show_transformation_proof_supports(proof, mt, proof_index_string, (SubLObject)pph_proof.UNPROVIDED);
        }
        else {
            final SubLObject supports = pph_displayworthy_supports(proof, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, mt);
            SubLObject label = (SubLObject)pph_proof.$str63$Supporting_Facts;
            if (pph_proof.NIL != supports) {
                pph_maybe_show_meta_supports(supports, proof_index_string, label);
            }
            if (pph_proof.NIL != inference_datastructures_proof.proof_has_subproofsP(proof)) {
                if (pph_proof.NIL != inference_datastructures_proof.proof_has_supportsP(proof)) {
                    html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                }
                final SubLObject subproofs = pph_proof_subproofs(proof);
                label = (SubLObject)pph_proof.$str63$Supporting_Facts;
                pph_maybe_show_subproofs(subproofs, mt, proof_index_string, label);
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 35963L)
    public static SubLObject pph_show_real_or_quasi_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            pph_show_transformation_proof_supports(proof, mt, proof_index_string, style);
        }
        else if (pph_proof.NIL != pph_hl_transformation_proof_p(proof)) {
            pph_show_hl_transformation_proof_supports(proof, mt, proof_index_string, style);
        }
        else if (pph_proof.NIL != pph_cached_transformation_proof_p(proof)) {
            pph_show_cached_transformation_proof_supports(proof, mt, proof_index_string, style);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 36492L)
    public static SubLObject pph_show_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        pph_show_transformation_proof_rule(proof, mt, proof_index_string, style);
        final SubLObject subproof = inference_worker_transformation.transformation_proof_subproof(proof);
        if (pph_proof.NIL != pph_transformation_subproof_worth_showingP(subproof, mt)) {
            final SubLObject pcase_var = style;
            if (pcase_var.eql((SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION)) {
                final SubLObject index_string = Sequences.cconcatenate(proof_index_string, (SubLObject)pph_proof.$str64$_transformation_supports);
                html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str65$Rule_Application_);
                pph_show_inference_proof(subproof, mt, index_string);
            }
            else {
                final SubLObject label = (SubLObject)pph_proof.$str66$Transformation_Proof_Supports;
                pph_maybe_show_subproofs((SubLObject)ConsesLow.list(subproof), mt, proof_index_string, label);
            }
            pph_note_proof_justified(proof);
        }
        pph_note_proof_displayed(proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 37304L)
    public static SubLObject pph_transformation_subproof_worth_showingP(final SubLObject subproof, final SubLObject mt) {
        if (pph_proof.NIL != pph_transformation_subproof_worth_showingP_int(subproof, mt)) {
            return (SubLObject)pph_proof.T;
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(subproof);
        SubLObject sub_subproof = (SubLObject)pph_proof.NIL;
        sub_subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != pph_transformation_subproof_worth_showingP(sub_subproof, mt)) {
                return (SubLObject)pph_proof.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_subproof = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 37684L)
    public static SubLObject pph_transformation_subproof_worth_showingP_int(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == subl_promotions.memberP(proof, pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == inference_worker.structural_proof_p(proof) && pph_proof.NIL == pph_proof_already_displayed_p(proof) && pph_proof.NIL == pph_trivial_sentenceP(pph_proof_el_formula(proof, mt), mt) && (pph_proof.NIL != pph_real_or_quasi_transformation_proof_p(proof) || pph_proof.NIL != pph_displayworthy_supports(proof, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 38077L)
    public static SubLObject pph_show_hl_transformation_proof_supports_bu(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        pph_show_hl_transformation_proof_supports(proof, mt, proof_index_string, (SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION);
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 38539L)
    public static SubLObject pph_show_hl_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
        final SubLObject support_tree = pph_support_tree_from_supports(proof, supports, (SubLObject)pph_proof.UNPROVIDED);
        pph_show_reconstructed_transformation_proof_support_tree(support_tree, proof_index_string, mt, style);
        if (pph_proof.NIL != support_tree) {
            pph_note_proof_justified(proof);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 39005L)
    public static SubLObject pph_show_cached_transformation_proof_supports_bu(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        pph_show_cached_transformation_proof_supports(proof, mt, proof_index_string, (SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION);
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 39469L)
    public static SubLObject pph_show_cached_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        final SubLObject supporting_assertion = pph_cached_transformation_proof_supporting_assertion(proof);
        if (pph_proof.NIL != assertion_handles.assertion_p(supporting_assertion)) {
            pph_show_cached_transformation_proof_supports_from_as(supporting_assertion, mt, proof_index_string, style);
            pph_note_proof_justified(proof);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 39966L)
    public static SubLObject pph_show_cached_transformation_proof_supports_from_as(final SubLObject supporting_assertion, final SubLObject mt, final SubLObject proof_index_string, final SubLObject style) {
        final SubLObject support_tree = pph_assertion_support_tree(supporting_assertion, (SubLObject)pph_proof.UNPROVIDED);
        SubLObject justifiedP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != support_tree) {
            pph_show_reconstructed_transformation_proof_support_tree(support_tree, proof_index_string, mt, style);
            if (pph_proof.NIL != pph_support_tree_supporters(support_tree)) {
                justifiedP = (SubLObject)pph_proof.T;
            }
        }
        return justifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 40500L)
    public static SubLObject pph_reconstructed_transformation_proof_support_tree_p(final SubLObject support_tree) {
        return list_utilities.sublisp_boolean(Sequences.find_if((SubLObject)pph_proof.$sym67$EL_IMPLICATION_P, pph_support_tree_supporters(support_tree), (SubLObject)pph_proof.$sym68$PPH_SUPPORT_TREE_SENTENCE, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 40708L)
    public static SubLObject pph_show_reconstructed_transformation_proof_support_tree(final SubLObject support_tree, final SubLObject proof_index_string, final SubLObject mt, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subnodes = pph_support_tree_supporters(support_tree);
        final SubLObject rule_subnode = Sequences.find_if((SubLObject)pph_proof.$sym67$EL_IMPLICATION_P, subnodes, (SubLObject)pph_proof.$sym68$PPH_SUPPORT_TREE_SENTENCE, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject non_rule_subnodes = Sequences.remove(rule_subnode, subnodes, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        SubLObject transformation_subnodes = pph_find_transformation_support_trees(rule_subnode, non_rule_subnodes);
        SubLObject intermediate_support_trees = (SubLObject)pph_proof.NIL;
        SubLObject list_var = (SubLObject)pph_proof.NIL;
        SubLObject support_tree_$39 = (SubLObject)pph_proof.NIL;
        SubLObject i = (SubLObject)pph_proof.NIL;
        list_var = transformation_subnodes;
        support_tree_$39 = list_var.first();
        for (i = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), support_tree_$39 = list_var.first(), i = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, i)) {
            SubLObject current;
            final SubLObject datum = current = support_tree_$39;
            SubLObject support = (SubLObject)pph_proof.NIL;
            SubLObject meta_support_trees = (SubLObject)pph_proof.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list69);
            support = current.first();
            current = (meta_support_trees = current.rest());
            if (pph_proof.NIL != assertion_handles.assertion_p(support) && pph_proof.NIL != list_utilities.proper_list_p(meta_support_trees)) {
                final SubLObject index_string = Sequences.cconcatenate(proof_index_string, new SubLObject[] { pph_proof.$str70$_meta_, print_high.princ_to_string(i) });
                if (pph_proof.NIL != pph_reconstructed_transformation_proof_support_tree_p(support_tree_$39)) {
                    pph_show_reconstructed_transformation_proof_support_tree(support_tree_$39, index_string, mt, style);
                    intermediate_support_trees = (SubLObject)ConsesLow.cons(support_tree_$39, intermediate_support_trees);
                    pph_note_support_displayed(support);
                    pph_show_real_or_quasi_transformation_proof_conclusion(support, (SubLObject)pph_proof.T, (SubLObject)pph_proof.NIL);
                }
            }
        }
        if (pph_proof.NIL != intermediate_support_trees) {
            transformation_subnodes = conses_high.set_difference(transformation_subnodes, intermediate_support_trees, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        }
        SubLObject given_support_trees = (SubLObject)pph_proof.NIL;
        SubLObject supports_from_question = (SubLObject)pph_proof.NIL;
        SubLObject supports_from_kb = (SubLObject)pph_proof.NIL;
        SubLObject list_var2 = (SubLObject)pph_proof.NIL;
        SubLObject support_tree_$40 = (SubLObject)pph_proof.NIL;
        SubLObject j = (SubLObject)pph_proof.NIL;
        list_var2 = transformation_subnodes;
        support_tree_$40 = list_var2.first();
        for (j = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var2; list_var2 = list_var2.rest(), support_tree_$40 = list_var2.first(), j = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, j)) {
            final SubLObject support = pph_support_tree_supported(support_tree_$40);
            if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
                if (pph_proof.NIL != pph_hypothesized_supportP(support, mt)) {
                    given_support_trees = (SubLObject)ConsesLow.cons(support_tree_$40, given_support_trees);
                    supports_from_question = (SubLObject)ConsesLow.cons(support, supports_from_question);
                }
                else {
                    supports_from_kb = (SubLObject)ConsesLow.cons(support, supports_from_kb);
                    given_support_trees = (SubLObject)ConsesLow.cons(support_tree_$40, given_support_trees);
                }
            }
        }
        pph_proof_show_givens(Sequences.nreverse(supports_from_question), (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$kw71$HYPOTHESIZED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        pph_proof_show_givens(Sequences.nreverse(supports_from_kb), (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$kw72$FROM_KB, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL != given_support_trees) {
            SubLObject cdolist_list_var = given_support_trees;
            SubLObject given_support_tree = (SubLObject)pph_proof.NIL;
            given_support_tree = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                final SubLObject support2 = pph_support_tree_supported(given_support_tree);
                pph_note_support_displayed(support2);
                cdolist_list_var = cdolist_list_var.rest();
                given_support_tree = cdolist_list_var.first();
            }
            transformation_subnodes = conses_high.set_difference(transformation_subnodes, given_support_trees, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        }
        final SubLObject rule_support = pph_support_tree_supported(rule_subnode);
        if (pph_proof.NIL != rule_support && pph_proof.NIL == pph_irrelevant_supportP(rule_support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
            html_utilities.html_princ_strong((SubLObject)pph_proof.$str73$Applicable_Rule_);
            html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
            pph_show_support(rule_support, proof_index_string, (SubLObject)pph_proof.UNPROVIDED);
            dictionary_utilities.dictionary_pushnew(pph_vars.$rules_used_in_quasi_transformation_proofs$.getGlobalValue(), rule_support, pph_support_tree_supported(support_tree), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != transformation_subnodes) {
            final SubLObject transformation_supports = Mapping.mapcar(Symbols.symbol_function((SubLObject)pph_proof.$sym74$FIRST), transformation_subnodes);
            final SubLObject pcase_var = style;
            if (pcase_var.eql((SubLObject)pph_proof.$kw34$SUPPORTS_AND_CONCLUSION)) {
                final SubLObject index_string2 = Sequences.cconcatenate(proof_index_string, (SubLObject)pph_proof.$str64$_transformation_supports);
                final SubLObject label = (SubLObject)pph_proof.$str65$Rule_Application_;
                html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
                if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                    pph_maybe_show_meta_supports(transformation_supports, index_string2, label);
                }
                else {
                    pph_show_supports_wXo_indent(label, transformation_supports);
                }
            }
            else {
                final SubLObject label2 = (SubLObject)pph_proof.$str66$Transformation_Proof_Supports;
                pph_maybe_show_meta_supports(transformation_supports, proof_index_string, label2);
            }
        }
        return support_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 44326L)
    public static SubLObject pph_find_transformation_support_trees(final SubLObject rule_support_tree, final SubLObject non_rule_support_trees) {
        final SubLObject rule_support = pph_support_tree_supported(rule_support_tree);
        final SubLObject rule_neg_lits = (SubLObject)((pph_proof.NIL != arguments.support_p(rule_support)) ? clauses.neg_lits(support_cnf(rule_support)) : pph_proof.NIL);
        SubLObject transformation_support_trees = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = non_rule_support_trees;
        SubLObject support_tree = (SubLObject)pph_proof.NIL;
        support_tree = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject support = pph_support_tree_supported(support_tree);
            if (pph_proof.NIL != subl_promotions.memberP(arguments.support_sentence(support), rule_neg_lits, Symbols.symbol_function((SubLObject)pph_proof.$sym75$UNIFY), (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == pph_irrelevant_supportP(support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                transformation_support_trees = (SubLObject)ConsesLow.cons(support_tree, transformation_support_trees);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support_tree = cdolist_list_var.first();
        }
        return Sequences.nreverse(transformation_support_trees);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 45025L)
    public static SubLObject pph_show_transformation_proof_rule(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, final SubLObject style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_assertion = inference_worker_transformation.transformation_proof_rule_assertion(proof);
        final SubLObject object_id = Sequences.cconcatenate((SubLObject)pph_proof.$str76$transformation_rule_, proof_index_string);
        if (pph_proof.NIL == pph_trivial_assertionP(rule_assertion, mt)) {
            if (pph_proof.NIL != assertions_high.valid_assertion(rule_assertion, (SubLObject)pph_proof.UNPROVIDED)) {
                pph_show_valid_transformation_proof_rule(rule_assertion, proof, mt, proof_index_string, object_id, style);
            }
            else if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                    dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                    dhtml_macros.dhtml_dom_attribute_postamble();
                    dhtml_macros.dhtml_dom_wrapper_postamble();
                    html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, (SubLObject)pph_proof.$str77$Invalidated_Rule);
                dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (pph_proof.NIL != object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(object_id);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            pph_show_invalidated_support(rule_assertion);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            else {
                html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        pph_show_invalidated_support(rule_assertion);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 46066L)
    public static SubLObject pph_show_valid_transformation_proof_rule(final SubLObject rule_assertion, final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, final SubLObject object_id, SubLObject style) {
        if (style == pph_proof.UNPROVIDED) {
            style = (SubLObject)pph_proof.$kw2$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unfocused_restricted_formula = pph_restrict_transformation_rule(rule_assertion, proof, mt);
        final SubLObject restriction_subproofs = thread.secondMultipleValue();
        final SubLObject non_hypothetical_restriction_bindingsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        final SubLObject proof_el_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        final SubLObject restricted_formula = pph_focus_rule_formula(unfocused_restricted_formula, proof_conclusion, proof_el_bindings);
        if (pph_proof.NIL != restriction_subproofs && pph_proof.$kw34$SUPPORTS_AND_CONCLUSION == style) {
            pph_show_restriction_subproofs(restriction_subproofs, proof, mt, proof_index_string);
        }
        final SubLObject other_supports = inference_worker_transformation.transformation_proof_additional_supports(proof);
        if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread) && style == pph_proof.$kw2$DEFAULT) {
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
            final SubLObject label = (SubLObject)pph_proof.$str78$Supporting_Rule;
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
            dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (pph_proof.NIL != object_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(object_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        pph_display_restricted_and_general_rule(restricted_formula, rule_assertion, mt, restriction_subproofs, other_supports, proof_index_string, style);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        else if (style == pph_proof.$kw34$SUPPORTS_AND_CONCLUSION) {
            if (pph_proof.NIL == pph_irrelevant_supportP(rule_assertion, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str73$Applicable_Rule_);
                html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                if (pph_proof.NIL != non_hypothetical_restriction_bindingsP) {
                    pph_display_restricted_and_general_rule(restricted_formula, rule_assertion, mt, restriction_subproofs, other_supports, proof_index_string, style);
                }
                else {
                    pph_show_support(rule_assertion, proof_index_string, (SubLObject)pph_proof.UNPROVIDED);
                }
            }
        }
        else {
            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    pph_show_sentence(restricted_formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    pph_maybe_show_meta_supports((SubLObject)ConsesLow.list(rule_assertion), proof_index_string, (SubLObject)pph_proof.$str78$Supporting_Rule);
                    if (pph_proof.NIL != other_supports) {
                        pph_maybe_show_meta_supports(other_supports, proof_index_string, (SubLObject)pph_proof.$str79$Transformation_Supports);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        }
        return rule_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 48410L)
    public static SubLObject pph_focus_rule_formula(final SubLObject unfocused_rule_formula, SubLObject proof_conclusion, final SubLObject proof_el_bindings) {
        final SubLObject input_rule_type = (SubLObject)((pph_proof.NIL != el_utilities.el_implication_p(unfocused_rule_formula)) ? pph_proof.$kw80$IMPLICATION : ((pph_proof.NIL != el_utilities.el_disjunction_p(unfocused_rule_formula)) ? pph_proof.$kw81$DISJUNCTION : pph_proof.NIL));
        if (pph_proof.NIL != input_rule_type) {
            SubLObject antecedent = (SubLObject)((input_rule_type == pph_proof.$kw80$IMPLICATION) ? cycl_utilities.formula_arg1(unfocused_rule_formula, (SubLObject)pph_proof.UNPROVIDED) : pph_proof.NIL);
            final SubLObject consequent = (input_rule_type == pph_proof.$kw80$IMPLICATION) ? cycl_utilities.formula_arg2(unfocused_rule_formula, (SubLObject)pph_proof.UNPROVIDED) : unfocused_rule_formula;
            if (input_rule_type == pph_proof.$kw81$DISJUNCTION) {
                if (pph_proof.NIL != assertion_handles.assertion_p(proof_conclusion)) {
                    proof_conclusion = uncanonicalizer.assertion_el_formula(proof_conclusion);
                }
                SubLObject found_proof_conclusionP = (SubLObject)pph_proof.NIL;
                final SubLObject proof_conclusion_wX_vars = bindings.apply_bindings_backwards(proof_el_bindings, proof_conclusion);
                SubLObject new_consequent = (SubLObject)pph_proof.NIL;
                SubLObject cdolist_list_var = cycl_utilities.formula_args(consequent, (SubLObject)pph_proof.UNPROVIDED);
                SubLObject disjunct = (SubLObject)pph_proof.NIL;
                disjunct = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    if (bindings.apply_bindings_backwards(proof_el_bindings, disjunct).equal(proof_conclusion_wX_vars)) {
                        found_proof_conclusionP = (SubLObject)pph_proof.T;
                        new_consequent = disjunct;
                    }
                    else {
                        final SubLObject new_neg_lit = (input_rule_type == pph_proof.$kw80$IMPLICATION) ? el_utilities.make_negation(disjunct) : disjunct;
                        if (pph_proof.NIL == pph_trivial_neg_litP(new_neg_lit, (SubLObject)pph_proof.UNPROVIDED)) {
                            antecedent = ((pph_proof.NIL != antecedent) ? simplifier.conjoin((SubLObject)ConsesLow.list(antecedent, new_neg_lit), (SubLObject)pph_proof.T) : new_neg_lit);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    disjunct = cdolist_list_var.first();
                }
                if (pph_proof.NIL != found_proof_conclusionP) {
                    if (input_rule_type == pph_proof.$kw81$DISJUNCTION) {
                        antecedent = el_utilities.make_negation(antecedent);
                    }
                    return el_utilities.make_implication(antecedent, new_consequent);
                }
            }
        }
        return unfocused_rule_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 50104L)
    public static SubLObject pph_show_restriction_subproofs(final SubLObject restriction_subproofs, final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothesized_subproof_conclusions = (SubLObject)pph_proof.NIL;
        SubLObject subproofs_derived_from_hypothesis = (SubLObject)pph_proof.NIL;
        SubLObject other_subproofs = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = restriction_subproofs;
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != pph_proof_to_show_p(subproof, pph_proof_el_formula(subproof, mt), mt)) {
                if (pph_proof.NIL == pph_proof_already_displayed_p(subproof)) {
                    if (pph_proof.NIL == pph_proof_from_hypothesisP(subproof, mt)) {
                        other_subproofs = (SubLObject)ConsesLow.cons(subproof, other_subproofs);
                    }
                    else if (pph_proof.NIL != pph_lookup_proof_p(subproof)) {
                        hypothesized_subproof_conclusions = (SubLObject)ConsesLow.cons(pph_proof_conclusion(subproof, mt), hypothesized_subproof_conclusions);
                    }
                    else {
                        subproofs_derived_from_hypothesis = (SubLObject)ConsesLow.cons(subproof, subproofs_derived_from_hypothesis);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        pph_proof_show_givens(Sequences.nreverse(hypothesized_subproof_conclusions), (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$kw71$HYPOTHESIZED, proof_index_string, mt);
        pph_proof_show_givens(Sequences.nreverse(subproofs_derived_from_hypothesis), (SubLObject)pph_proof.T, (SubLObject)pph_proof.$kw82$DERIVED_FROM_HYPOTHESIS, proof_index_string, mt);
        pph_proof_show_givens(Sequences.nreverse(other_subproofs), (SubLObject)pph_proof.T, (SubLObject)pph_proof.$kw72$FROM_KB, proof_index_string, mt);
        pph_vars.$pph_repositioned_proofs$.setDynamicValue(ConsesLow.append(pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), restriction_subproofs), thread);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 51335L)
    public static SubLObject pph_proof_show_givens(final SubLObject givens, final SubLObject proofsP, SubLObject source, SubLObject proof_index_string, SubLObject mt) {
        if (proof_index_string == pph_proof.UNPROVIDED) {
            proof_index_string = (SubLObject)pph_proof.NIL;
        }
        if (mt == pph_proof.UNPROVIDED) {
            mt = (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != givens) {
            html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
            if (source.eql((SubLObject)pph_proof.$kw71$HYPOTHESIZED)) {
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str83$Given__from_the_question__);
            }
            else if (source.eql((SubLObject)pph_proof.$kw82$DERIVED_FROM_HYPOTHESIS)) {
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str84$Derived_from_the_question_);
            }
            else if (source.eql((SubLObject)pph_proof.$kw72$FROM_KB)) {
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str85$Given__from_the_knowledge_base__);
            }
            else {
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str86$Other_Givens_);
            }
            if (pph_proof.NIL != proofsP) {
                SubLObject list_var = (SubLObject)pph_proof.NIL;
                SubLObject proof = (SubLObject)pph_proof.NIL;
                SubLObject i = (SubLObject)pph_proof.NIL;
                list_var = givens;
                proof = list_var.first();
                for (i = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), proof = list_var.first(), i = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, i)) {
                    final SubLObject index_string = Sequences.cconcatenate(proof_index_string, new SubLObject[] { pph_proof.$str59$_, print_high.princ_to_string(source), print_high.princ_to_string(i) });
                    pph_show_inference_proof(proof, mt, index_string);
                }
            }
            else {
                SubLObject cdolist_list_var = givens;
                SubLObject proof_conclusion = (SubLObject)pph_proof.NIL;
                proof_conclusion = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                    pph_show_proof_conclusion_int(proof_conclusion);
                    cdolist_list_var = cdolist_list_var.rest();
                    proof_conclusion = cdolist_list_var.first();
                }
            }
        }
        return givens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 52155L)
    public static SubLObject pph_display_restricted_and_general_rule(final SubLObject restricted_formula, final SubLObject rule_assertion, final SubLObject mt, final SubLObject restriction_subproofs, final SubLObject other_supports, final SubLObject proof_index_string, final SubLObject style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_show_sentence(restricted_formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
        pph_maybe_show_meta_supports((SubLObject)ConsesLow.list(rule_assertion), proof_index_string, (SubLObject)pph_proof.$str78$Supporting_Rule);
        if (pph_proof.NIL != restriction_subproofs && pph_proof.$kw2$DEFAULT == style) {
            final SubLObject subproof_index_string = Sequences.cconcatenate(proof_index_string, (SubLObject)pph_proof.$str87$_restriction_subproofs);
            html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
            pph_maybe_show_subproofs(restriction_subproofs, mt, subproof_index_string, (SubLObject)pph_proof.UNPROVIDED);
            pph_vars.$pph_repositioned_proofs$.setDynamicValue(ConsesLow.append(pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), restriction_subproofs), thread);
        }
        if (pph_proof.NIL != other_supports) {
            pph_maybe_show_meta_supports(other_supports, proof_index_string, (SubLObject)pph_proof.$str79$Transformation_Supports);
        }
        return rule_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 53073L)
    public static SubLObject pph_support_trivialP(final SubLObject support, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_proof.$pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_required_ruleP(support)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_trivial_assertionP(support, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_sentenceP(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_mtP(arguments.support_mt(support), domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 53509L)
    public static SubLObject pph_triviality_check_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = pph_proof.$const88$BaseTrivialityMt;
        if (pph_proof.NIL != pph_speech_act.pph_addressee_known_p()) {
            final SubLObject addressee_triviality_mt = pph_triviality_check_mt_for_addressee(pph_vars.$pph_addressee$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != addressee_triviality_mt) {
                mt = pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, mt, addressee_triviality_mt));
            }
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 53852L)
    public static SubLObject pph_triviality_check_mt_for_addressee_internal(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == pph_proof.UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = narts_high.find_nart((SubLObject)ConsesLow.list(pph_proof.$const91$TrivialityContextForIndividualFn, addressee));
        if (pph_proof.NIL == mt && pph_proof.NIL != kb_indexing_datastructures.indexed_term_p(addressee)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject node_var = addressee;
                final SubLObject deck_type = (SubLObject)pph_proof.$kw94$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)pph_proof.NIL;
                        final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((pph_proof.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_proof.NIL != tv_var) ? pph_proof.$sym95$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (pph_proof.NIL != tv_var && pph_proof.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_proof.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)pph_proof.$kw96$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)pph_proof.$kw99$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.$str100$continue_anyway, (SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)pph_proof.$kw101$WARN)) {
                                    Errors.warn((SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)pph_proof.$str102$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)pph_proof.$str100$continue_anyway, (SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$52 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_proof.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa), thread);
                                if (pph_proof.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_proof.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(addressee, sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_proof.NIL, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa));
                                        SubLObject module_var = (SubLObject)pph_proof.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (pph_proof.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$51 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_proof.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_proof.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (pph_proof.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                    if (pph_proof.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                        if (pph_proof.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$58 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (pph_proof.NIL != mt_relevance_macros.relevant_mtP(mt_$58)) {
                                                                    final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$58, thread);
                                                                        SubLObject iteration_state_$60;
                                                                        for (iteration_state_$60 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$60); iteration_state_$60 = dictionary_contents.do_dictionary_contents_next(iteration_state_$60)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$60);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (pph_proof.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (pph_proof.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_proof.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)pph_proof.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (pph_proof.NIL != csome_list_var) {
                                                                                            if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$53, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$60);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$52, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)pph_proof.FIVE_INTEGER, (SubLObject)pph_proof.$str105$attempting_to_bind_direction_link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                                    }
                                                }
                                                else if (pph_proof.NIL != obsolete.cnat_p(node, (SubLObject)pph_proof.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$62;
                                                    final SubLObject new_list = cdolist_list_var_$62 = ((pph_proof.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)pph_proof.NIL;
                                                    generating_fn = cdolist_list_var_$62.first();
                                                    while (pph_proof.NIL != cdolist_list_var_$62) {
                                                        final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (pph_proof.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_proof.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_proof.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)pph_proof.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (pph_proof.NIL != csome_list_var2) {
                                                                    if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_proof.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$54, thread);
                                                        }
                                                        cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                                                        generating_fn = cdolist_list_var_$62.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$52, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$51, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                        final SubLObject _prev_bind_0_$55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$54 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_proof.NIL, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)), thread);
                                            while (pph_proof.NIL != node_var) {
                                                final SubLObject type = node_var;
                                                final SubLObject triviality_mt = narts_high.find_nart((SubLObject)ConsesLow.list(pph_proof.$const106$TrivialityContextForTypeFn, type));
                                                if (pph_proof.NIL != mt && pph_proof.NIL != triviality_mt) {
                                                    mt = pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, mt, triviality_mt));
                                                }
                                                else if (pph_proof.NIL != triviality_mt) {
                                                    mt = triviality_mt;
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                SubLObject module_var2 = (SubLObject)pph_proof.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (pph_proof.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$56 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_proof.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_proof.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                        if (pph_proof.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                            if (pph_proof.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                                if (pph_proof.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$59 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_proof.NIL != mt_relevance_macros.relevant_mtP(mt_$59)) {
                                                                            final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$59, thread);
                                                                                SubLObject iteration_state_$61;
                                                                                for (iteration_state_$61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$61); iteration_state_$61 = dictionary_contents.do_dictionary_contents_next(iteration_state_$61)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$61);
                                                                                    final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_proof.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes3;
                                                                                            if (pph_proof.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node5;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_proof.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = (SubLObject)pph_proof.NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (pph_proof.NIL != csome_list_var3) {
                                                                                                    if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$58, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$61);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$57, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_proof.FIVE_INTEGER, (SubLObject)pph_proof.$str105$attempting_to_bind_direction_link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_proof.NIL != obsolete.cnat_p(node2, (SubLObject)pph_proof.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$63;
                                                            final SubLObject new_list2 = cdolist_list_var_$63 = ((pph_proof.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)pph_proof.NIL;
                                                            generating_fn2 = cdolist_list_var_$63.first();
                                                            while (pph_proof.NIL != cdolist_list_var_$63) {
                                                                final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (pph_proof.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject node_vars_link_node2;
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_proof.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var4 = sol4;
                                                                        SubLObject node_vars_link_node7 = (SubLObject)pph_proof.NIL;
                                                                        node_vars_link_node7 = csome_list_var4.first();
                                                                        while (pph_proof.NIL != csome_list_var4) {
                                                                            if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, (SubLObject)pph_proof.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node7, recur_deck);
                                                                            }
                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                            node_vars_link_node7 = csome_list_var4.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$59, thread);
                                                                }
                                                                cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                                                                generating_fn2 = cdolist_list_var_$63.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$56, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$54, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$55, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$53, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$51, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$50, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.$str107$Node__a_does_not_pass_sbhl_type_t, addressee, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$52, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$50, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$49, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 53852L)
    public static SubLObject pph_triviality_check_mt_for_addressee(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == pph_proof.UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_triviality_check_mt_for_addressee_internal(addressee, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym90$PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym90$PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym90$PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(addressee, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (addressee.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_triviality_check_mt_for_addressee_internal(addressee, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(addressee, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 54478L)
    public static SubLObject pph_irrelevance_check_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = pph_proof.$const108$BaseIrrelevanceMt;
        if (pph_proof.NIL != pph_speech_act.pph_addressee_known_p()) {
            final SubLObject addressee_irrelevance_mt = pph_irrelevance_check_mt_for_addressee(pph_vars.$pph_addressee$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != addressee_irrelevance_mt) {
                mt = pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, mt, addressee_irrelevance_mt));
            }
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 54827L)
    public static SubLObject pph_irrelevance_check_mt_for_addressee_internal(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == pph_proof.UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = narts_high.find_nart((SubLObject)ConsesLow.list(pph_proof.$const110$IrrelevanceContextForIndividualFn, addressee));
        if (pph_proof.NIL == mt && pph_proof.NIL != kb_indexing_datastructures.indexed_term_p(addressee)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject node_var = addressee;
                final SubLObject deck_type = (SubLObject)pph_proof.$kw94$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$76 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)pph_proof.NIL;
                        final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$78 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((pph_proof.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_proof.NIL != tv_var) ? pph_proof.$sym95$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (pph_proof.NIL != tv_var && pph_proof.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_proof.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)pph_proof.$kw96$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)pph_proof.$kw99$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.$str100$continue_anyway, (SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)pph_proof.$kw101$WARN)) {
                                    Errors.warn((SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)pph_proof.$str102$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)pph_proof.$str100$continue_anyway, (SubLObject)pph_proof.$str97$_A_is_not_a__A, tv_var, (SubLObject)pph_proof.$sym98$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$81 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_proof.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa), thread);
                                if (pph_proof.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_proof.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(addressee, sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$80 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_proof.NIL, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_proof.$const103$isa));
                                        SubLObject module_var = (SubLObject)pph_proof.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (pph_proof.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$80 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_proof.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_proof.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (pph_proof.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                    if (pph_proof.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                        if (pph_proof.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$87 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (pph_proof.NIL != mt_relevance_macros.relevant_mtP(mt_$87)) {
                                                                    final SubLObject _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$87, thread);
                                                                        SubLObject iteration_state_$89;
                                                                        for (iteration_state_$89 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$89); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next(iteration_state_$89)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$89);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (pph_proof.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (pph_proof.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_proof.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)pph_proof.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (pph_proof.NIL != csome_list_var) {
                                                                                            if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$82, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$89);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$81, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)pph_proof.FIVE_INTEGER, (SubLObject)pph_proof.$str105$attempting_to_bind_direction_link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                                    }
                                                }
                                                else if (pph_proof.NIL != obsolete.cnat_p(node, (SubLObject)pph_proof.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$91;
                                                    final SubLObject new_list = cdolist_list_var_$91 = ((pph_proof.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)pph_proof.NIL;
                                                    generating_fn = cdolist_list_var_$91.first();
                                                    while (pph_proof.NIL != cdolist_list_var_$91) {
                                                        final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (pph_proof.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_proof.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_proof.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)pph_proof.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (pph_proof.NIL != csome_list_var2) {
                                                                    if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_proof.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$83, thread);
                                                        }
                                                        cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                        generating_fn = cdolist_list_var_$91.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$81, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$80, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                        final SubLObject _prev_bind_0_$84 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$83 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_proof.NIL, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)), thread);
                                            while (pph_proof.NIL != node_var) {
                                                final SubLObject type = node_var;
                                                final SubLObject irrelevance_mt = narts_high.find_nart((SubLObject)ConsesLow.list(pph_proof.$const111$IrrelevanceContextForTypeFn, type));
                                                if (pph_proof.NIL != mt && pph_proof.NIL != irrelevance_mt) {
                                                    mt = pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, mt, irrelevance_mt));
                                                }
                                                else if (pph_proof.NIL != irrelevance_mt) {
                                                    mt = irrelevance_mt;
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                SubLObject module_var2 = (SubLObject)pph_proof.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (pph_proof.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$85 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_proof.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_proof.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                        if (pph_proof.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                            if (pph_proof.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED));
                                                                if (pph_proof.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$88 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_proof.NIL != mt_relevance_macros.relevant_mtP(mt_$88)) {
                                                                            final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$88, thread);
                                                                                SubLObject iteration_state_$90;
                                                                                for (iteration_state_$90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$90); iteration_state_$90 = dictionary_contents.do_dictionary_contents_next(iteration_state_$90)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$90);
                                                                                    final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_proof.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes3;
                                                                                            if (pph_proof.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node5;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_proof.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = (SubLObject)pph_proof.NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (pph_proof.NIL != csome_list_var3) {
                                                                                                    if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)pph_proof.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$87, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$90);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$86, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_proof.FIVE_INTEGER, (SubLObject)pph_proof.$str105$attempting_to_bind_direction_link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_proof.NIL != obsolete.cnat_p(node2, (SubLObject)pph_proof.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$92;
                                                            final SubLObject new_list2 = cdolist_list_var_$92 = ((pph_proof.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)pph_proof.NIL;
                                                            generating_fn2 = cdolist_list_var_$92.first();
                                                            while (pph_proof.NIL != cdolist_list_var_$92) {
                                                                final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (pph_proof.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject node_vars_link_node2;
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_proof.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_proof.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (pph_proof.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2) && pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_proof.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var4 = sol4;
                                                                        SubLObject node_vars_link_node7 = (SubLObject)pph_proof.NIL;
                                                                        node_vars_link_node7 = csome_list_var4.first();
                                                                        while (pph_proof.NIL != csome_list_var4) {
                                                                            if (pph_proof.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, (SubLObject)pph_proof.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node7, recur_deck);
                                                                            }
                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                            node_vars_link_node7 = csome_list_var4.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_proof.$str104$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$88, thread);
                                                                }
                                                                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                generating_fn2 = cdolist_list_var_$92.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$83, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$85, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$83, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$82, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$84, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$82, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$80, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$79, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.$str107$Node__a_does_not_pass_sbhl_type_t, addressee, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_proof.UNPROVIDED)), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$81, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$78, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$77, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$76, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 54827L)
    public static SubLObject pph_irrelevance_check_mt_for_addressee(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == pph_proof.UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_irrelevance_check_mt_for_addressee_internal(addressee, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym109$PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym109$PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym109$PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(addressee, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (addressee.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_irrelevance_check_mt_for_addressee_internal(addressee, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(addressee, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 55462L)
    public static SubLObject pph_required_ruleP(final SubLObject v_object) {
        if (pph_proof.NIL == assertion_handles.assertion_p(v_object) || pph_proof.NIL == assertions_high.rule_assertionP(v_object)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_object, pph_proof.$const112$ruleRequiredForJustificationParap, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 55709L)
    public static SubLObject pph_trivial_assertionP(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != assertion_handles.assertion_p(v_object) && pph_proof.NIL != pph_assertion_trivialP(v_object, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 55893L)
    public static SubLObject pph_assertion_trivialP(final SubLObject assertion, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        if (pph_proof.NIL != pph_trivial_mtP(arguments.support_mt(assertion), domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_termP(assertion, (SubLObject)pph_proof.$kw113$ASSERTION, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_sentenceP(assertions_high.assertion_formula(assertion), domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_derived_assertionP(assertion, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 56308L)
    public static SubLObject pph_trivial_derived_assertionP(final SubLObject assertion, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != assertions_high.asserted_assertionP(assertion)) {
            return (SubLObject)pph_proof.NIL;
        }
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject rest;
            SubLObject argument;
            SubLObject rest_$105;
            SubLObject support;
            for (rest = (SubLObject)pph_proof.NIL, rest = assertions_high.assertion_arguments(assertion); pph_proof.NIL == trivialP && pph_proof.NIL != rest; rest = rest.rest()) {
                argument = rest.first();
                if (pph_proof.NIL != deduction_handles.deduction_p(argument)) {
                    for (rest_$105 = (SubLObject)pph_proof.NIL, rest_$105 = deductions_high.deduction_supports(argument); pph_proof.NIL == trivialP && pph_proof.NIL != rest_$105; rest_$105 = rest_$105.rest()) {
                        support = rest_$105.first();
                        if (pph_proof.NIL != assertion_handles.assertion_p(support) && pph_proof.NIL != kb_mapping_utilities.some_pred_value(support, pph_proof.$const114$ruleConclusionsTrivial, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                            if (pph_proof.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)pph_proof.$str115$PPH_irrelevant_formula_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_proof.$str116$_, format_nil.format_nil_s_no_copy(assertion), format_nil.$format_nil_percent$.getGlobalValue() }), (SubLObject)pph_proof.$str117$Derived_from_rule_whose_conclusio), support);
                            }
                            trivialP = (SubLObject)pph_proof.T;
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
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 56779L)
    public static SubLObject pph_trivial_mtP(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        if (pph_proof.NIL == hlmt.hlmt_p(v_object)) {
            return (SubLObject)pph_proof.NIL;
        }
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_object);
        if (pph_proof.NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP(pph_proof.$const118$mtTrivialForJustificationParaphra, monad_mt, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != pph_trivial_termP(monad_mt, (SubLObject)pph_proof.$kw119$MT, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 57172L)
    public static SubLObject pph_proof_to_show_p(final SubLObject proof, final SubLObject proof_query_formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_proof.$pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != inference_worker.structural_proof_p(proof)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_non_explanatory_proof_p(proof)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_trivial_sentenceP(proof_query_formula, domain_mt)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_irrelevant_formulaP(proof_query_formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        return (SubLObject)pph_proof.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 57698L)
    public static SubLObject pph_non_explanatory_proof_p(final SubLObject proof) {
        return subl_promotions.memberP(proof, pph_non_explanatory_proofs(), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 57805L)
    public static SubLObject pph_non_explanatory_proofs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)(pph_vars.$pph_non_explanatory_proofs$.getDynamicValue(thread).isList() ? pph_vars.$pph_non_explanatory_proofs$.getDynamicValue(thread) : pph_proof.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 57935L)
    public static SubLObject pph_proof_fancy_indent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject indent_content = (SubLObject)pph_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list120);
        indent_content = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym121$HTML_FANCY_TABLE, (SubLObject)pph_proof.$list122, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym123$HTML_TABLE_ROW, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym124$HTML_FANCY_TABLE_DATA, (SubLObject)pph_proof.$list125, indent_content), reader.bq_cons((SubLObject)pph_proof.$sym126$HTML_TABLE_DATA, ConsesLow.append(body, (SubLObject)pph_proof.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 58366L)
    public static SubLObject pph_proof_indent(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym121$HTML_FANCY_TABLE, (SubLObject)pph_proof.$list122, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym123$HTML_TABLE_ROW, (SubLObject)pph_proof.$list127, reader.bq_cons((SubLObject)pph_proof.$sym126$HTML_TABLE_DATA, ConsesLow.append(body, (SubLObject)pph_proof.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 58626L)
    public static SubLObject pph_maybe_show_subproofs(final SubLObject subproofs, final SubLObject mt, final SubLObject index_string, SubLObject label) {
        if (label == pph_proof.UNPROVIDED) {
            label = (SubLObject)pph_proof.$str63$Supporting_Facts;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = Sequences.cconcatenate((SubLObject)pph_proof.$str128$subproofs_, index_string);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
            dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (pph_proof.NIL != object_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(object_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                if (pph_proof.NIL != list_utilities.singletonP(subproofs)) {
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                final SubLObject subproof_index_string = PrintLow.format((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$str131$_A_subproof, index_string);
                                pph_show_inference_proof(subproofs.first(), mt, subproof_index_string);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                else {
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                SubLObject list_var = (SubLObject)pph_proof.NIL;
                                SubLObject subproof = (SubLObject)pph_proof.NIL;
                                SubLObject subproof_num = (SubLObject)pph_proof.NIL;
                                list_var = subproofs;
                                subproof = list_var.first();
                                for (subproof_num = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), subproof = list_var.first(), subproof_num = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, subproof_num)) {
                                    final SubLObject subproof_index_string2 = PrintLow.format((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$str132$_A_subproof__D, index_string, subproof_num);
                                    pph_show_inference_proof(subproof, mt, subproof_index_string2);
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
            return (SubLObject)pph_proof.NIL;
        }
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_princ_strong(label);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        SubLObject list_var2 = (SubLObject)pph_proof.NIL;
                        SubLObject subproof2 = (SubLObject)pph_proof.NIL;
                        SubLObject subproof_num2 = (SubLObject)pph_proof.NIL;
                        list_var2 = subproofs;
                        subproof2 = list_var2.first();
                        for (subproof_num2 = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var2; list_var2 = list_var2.rest(), subproof2 = list_var2.first(), subproof_num2 = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, subproof_num2)) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                pph_show_inference_proof(subproof2, mt, (SubLObject)pph_proof.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 59922L)
    public static SubLObject pph_set_meta_support_max(final SubLObject value) {
        if (pph_proof.NIL != subl_promotions.non_negative_integer_p(value)) {
            pph_proof.$pph_meta_support_max$.setGlobalValue(value);
        }
        return pph_proof.$pph_meta_support_max$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 60264L)
    public static SubLObject pph_show_support(final SubLObject support, SubLObject index_string, SubLObject known_invalid_supports) {
        if (index_string == pph_proof.UNPROVIDED) {
            index_string = (SubLObject)pph_proof.$str133$support;
        }
        if (known_invalid_supports == pph_proof.UNPROVIDED) {
            known_invalid_supports = (SubLObject)pph_proof.$kw134$UNCOMPUTED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != arguments.support_p(support)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(arguments.support_mt(support), (SubLObject)pph_proof.UNPROVIDED), thread);
                if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
                    final SubLObject _prev_bind_0_$119 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread) || pph_proof.NIL != assertions_high.rule_assertionP(support)), thread);
                        pph_show_assertion(support);
                        if (pph_proof.NIL != assertions_high.asserted_assertionP(support)) {
                            pph_maybe_show_assert_info(support, index_string);
                        }
                    }
                    finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$119, thread);
                    }
                }
                else if (known_invalid_supports.isList() && pph_proof.NIL != conses_high.member(support, known_invalid_supports, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED)) {
                    pph_show_invalidated_support(support);
                }
                else if (pph_proof.NIL != pph_vars.$validate_proof_supportsP$.getDynamicValue(thread) && known_invalid_supports == pph_proof.$kw134$UNCOMPUTED && pph_proof.NIL != pph_invalid_supportP(support)) {
                    pph_show_invalidated_support(support);
                }
                else {
                    final SubLObject formula = pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject highly_relevantP = pph_justification_pred_highly_relevantP(cycl_utilities.formula_arg0(formula), (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject meta_supports = (SubLObject)((pph_proof.NIL != pph_vars.$pph_show_meta_supports_with_supportsP$.getDynamicValue(thread) && pph_proof.$pph_meta_support_level$.getDynamicValue(thread).numL(pph_proof.$pph_meta_support_max$.getGlobalValue())) ? pph_meta_supports_to_show(support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) : pph_proof.NIL);
                    if (pph_proof.NIL != highly_relevantP) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str135$highly_relevant);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            pph_show_sentence(formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            pph_show_sentence(formula, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    if (pph_proof.NIL != meta_supports) {
                        final SubLObject _prev_bind_0_$122 = pph_proof.$pph_meta_support_level$.currentBinding(thread);
                        try {
                            pph_proof.$pph_meta_support_level$.bind(number_utilities.f_1X(pph_proof.$pph_meta_support_level$.getDynamicValue(thread)), thread);
                            pph_maybe_show_meta_supports(meta_supports, index_string, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            pph_proof.$pph_meta_support_level$.rebind(_prev_bind_0_$122, thread);
                        }
                    }
                    else if (pph_proof.NIL != pph_proof_support_already_shown_p(support)) {
                        final SubLObject see_above_index_string = Sequences.cconcatenate(index_string, (SubLObject)pph_proof.$str136$_see_above);
                        pph_proof_show_see_above(see_above_index_string);
                    }
                }
                pph_note_support_displayed(support);
            }
            finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 62016L)
    public static SubLObject pph_justification_pred_highly_relevantP(final SubLObject pred, SubLObject mt) {
        if (mt == pph_proof.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return pph_utilities.pph_ask_boolean((SubLObject)ConsesLow.list(pph_proof.$const137$predHighlyRelevantForJustificatio, pred), mt, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 62199L)
    public static SubLObject pph_show_invalidated_support(final SubLObject support) {
        final SubLObject sentence = pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
        if (pph_proof.NIL != el_utilities.el_formula_p(sentence)) {
            pph_show_sentence(sentence, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        else {
            html_utilities.html_princ((SubLObject)pph_proof.$str138$Invalidated_support);
        }
        html_utilities.html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 62568L)
    public static SubLObject pph_maybe_show_meta_supports(final SubLObject meta_supports, SubLObject index_string, SubLObject label) {
        if (index_string == pph_proof.UNPROVIDED) {
            index_string = (SubLObject)pph_proof.NIL;
        }
        if (label == pph_proof.UNPROVIDED) {
            label = (SubLObject)pph_proof.$str41$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = Sequences.cconcatenate((SubLObject)pph_proof.$str139$meta_supports_, index_string);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
            dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (pph_proof.NIL != object_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(object_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    SubLObject list_var = (SubLObject)pph_proof.NIL;
                    SubLObject support = (SubLObject)pph_proof.NIL;
                    SubLObject support_num = (SubLObject)pph_proof.NIL;
                    list_var = meta_supports;
                    support = list_var.first();
                    for (support_num = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, support_num)) {
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject support_index_string = PrintLow.format((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$str140$_A_meta__D, index_string, support_num);
                            pph_show_support(support, support_index_string, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        else {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        pph_show_supports_wXo_indent(label, meta_supports);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 63391L)
    public static SubLObject pph_show_supports_wXo_indent(final SubLObject label, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ_strong(label);
        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            SubLObject list_var = (SubLObject)pph_proof.NIL;
            SubLObject support = (SubLObject)pph_proof.NIL;
            SubLObject support_num = (SubLObject)pph_proof.NIL;
            list_var = supports;
            support = list_var.first();
            for (support_num = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, support_num)) {
                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    pph_show_support(support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 63629L)
    public static SubLObject pph_maybe_show_assert_info(final SubLObject assertion, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_vars.$pph_show_assert_info_with_assertionsP$.getDynamicValue(thread)) {
            if (pph_proof.NIL != pph_assertion_has_assert_infoP(assertion)) {
                if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                    final SubLObject object_id = Sequences.cconcatenate((SubLObject)pph_proof.$str141$assert_info_, index_string);
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                    html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)pph_proof.TWO_INTEGER);
                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, (SubLObject)pph_proof.$str41$);
                    dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (pph_proof.NIL != object_id) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup(object_id);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                pph_show_assert_info(assertion);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                }
                else if (pph_proof.NIL != hypothetical_mtP(assertions_high.assertion_mt(assertion))) {
                    pph_proof_show_hypothetical_attribution(string_utilities.$empty_string$.getGlobalValue());
                }
                else {
                    html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)pph_proof.TWO_INTEGER);
                    html_utilities.html_princ((SubLObject)pph_proof.$str142$__);
                    pph_show_assert_info(assertion);
                }
            }
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 64543L)
    public static SubLObject pph_assertion_has_assert_infoP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != sources.assertion_sourcedP(assertion) || pph_proof.NIL != abnormal.rule_has_exceptionsP(assertion) || pph_proof.NIL != isa.isaP(assertions_high.assertion_mt(assertion), pph_proof.$const143$HypotheticalContext, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 64818L)
    public static SubLObject pph_show_assert_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = pph_assert_info(assertion);
        final SubLObject v_sources = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
        if (pph_proof.NIL != v_sources) {
            SubLObject cdolist_list_var = v_sources;
            SubLObject source = (SubLObject)pph_proof.NIL;
            source = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                pph_show_source(source, (SubLObject)pph_proof.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            }
        }
        else if (pph_proof.NIL != isa.isaP(mt, pph_proof.$const143$HypotheticalContext, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            html_utilities.html_princ((SubLObject)pph_proof.$str144$This_was_stated_in_the_question_);
        }
        if (pph_proof.NIL != abnormal.rule_has_exceptionsP(assertion)) {
            html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_indent((SubLObject)pph_proof.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)pph_proof.$str145$Note__This_rule_has_exceptions__b);
        }
        if (pph_proof.NIL != assertions_high.rule_assertionP(assertion) && pph_proof.NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(assertion, pph_proof.$const146$InferencePSC)) {
            html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_indent((SubLObject)pph_proof.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)pph_proof.$str147$Note__This_rule_has_further_condi);
        }
        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 65726L)
    public static SubLObject pph_skip_meta_supports_for_support_p(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != subl_promotions.memberP(arguments.support_module(support), pph_proof.$pph_hl_modules_to_skip_meta_supports_for$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) || pph_proof.NIL != pph_proof_support_already_shown_p(support) || (arguments.support_module(support).eql((SubLObject)pph_proof.$kw148$EVAL) && pph_proof.NIL != narts_high.naut_p(cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(support), (SubLObject)pph_proof.UNPROVIDED)) && pph_proof.NIL == Sequences.find_if((SubLObject)pph_proof.$sym149$NAUT_P, cycl_utilities.formula_args(cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(support), (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 66138L)
    public static SubLObject pph_displayed_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)(pph_vars.$pph_displayed_supports$.getDynamicValue(thread).isList() ? pph_vars.$pph_displayed_supports$.getDynamicValue(thread) : pph_proof.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 66256L)
    public static SubLObject pph_proof_support_already_shown_p(final SubLObject support) {
        return subl_promotions.memberP(support, pph_displayed_supports(), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 66377L)
    public static SubLObject pph_meta_supports_to_show(final SubLObject support, SubLObject v_proof_view, SubLObject domain_mt) {
        if (v_proof_view == pph_proof.UNPROVIDED) {
            v_proof_view = (SubLObject)pph_proof.NIL;
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_skip_meta_supports_for_support_p(support)) {
            if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)pph_proof.$str150$Skipping_meta_supports_for__S, support);
            }
            return (SubLObject)pph_proof.NIL;
        }
        final SubLObject all_meta_supports = pph_meta_supports(support);
        final SubLObject support_sentence = pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject support_module = arguments.support_module(support);
        final SubLObject irrelevance_mt = pph_irrelevance_check_mt();
        SubLObject literals_to_suppress = (SubLObject)pph_proof.NIL;
        SubLObject ans = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = all_meta_supports;
        SubLObject meta_support = (SubLObject)pph_proof.NIL;
        meta_support = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != assertions_high.rule_assertionP(meta_support)) {
                if (pph_proof.NIL != proof_view_pruning_ruleP(meta_support, domain_mt)) {
                    if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)pph_proof.$str151$Pruning_all_supports_for__S___due, support, meta_support);
                    }
                    return (SubLObject)pph_proof.NIL;
                }
                if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str152$__Checking_for_literals_to_suppre, meta_support, irrelevance_mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                }
                literals_to_suppress = pph_literals_to_suppress_from_rule_and_conclusion(meta_support, support, irrelevance_mt);
                if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str153$__Literals_to_suppress_____S__, literals_to_suppress, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                }
            }
            if (pph_proof.NIL != pph_always_show_meta_support_for_moduleP(meta_support, support_module)) {
                ans = (SubLObject)ConsesLow.cons(meta_support, ans);
            }
            else if (!pph_support_sentence(meta_support, (SubLObject)pph_proof.UNPROVIDED).equal(support_sentence)) {
                if (pph_proof.NIL != pph_irrelevant_supportP(meta_support, (SubLObject)pph_proof.NIL, irrelevance_mt)) {
                    if (pph_proof.NIL != v_proof_view) {
                        proof_view.proof_view_note_filtered_item(v_proof_view, meta_support, (SubLObject)pph_proof.$kw154$IRRELEVANT);
                    }
                }
                else {
                    ans = (SubLObject)ConsesLow.cons(meta_support, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        }
        if (pph_proof.NIL != literals_to_suppress && pph_proof.NIL != ans) {
            ans = pph_prune_meta_supports(ans, literals_to_suppress);
        }
        return pph_sort_meta_supports(Sequences.delete_duplicates(Sequences.nreverse(ans), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.$sym17$PPH_SUPPORT_EL_SENTENCE), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 68197L)
    public static SubLObject pph_sort_meta_supports(final SubLObject meta_supports) {
        return Sort.sort(meta_supports, (SubLObject)pph_proof.$sym155$PPH_META_SUPPORT_SHOULD_PRECEDE_, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 68319L)
    public static SubLObject pph_meta_support_should_precedeP(final SubLObject support1, final SubLObject support2) {
        if (pph_proof.NIL != assertions_high.rule_assertionP(support1) && pph_proof.NIL == assertions_high.rule_assertionP(support2)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != assertions_high.rule_assertionP(support2) && pph_proof.NIL == assertions_high.rule_assertionP(support1)) {
            return (SubLObject)pph_proof.NIL;
        }
        return kb_utilities.term_L(support1, support2, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 68614L)
    public static SubLObject pph_rule_literals_to_suppress(final SubLObject rule, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, pph_irrelevance_check_mt(), pph_triviality_check_mt()));
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return conses_high.copy_tree(kb_mapping_utilities.pred_values(rule, pph_proof.$const156$suppressLiteralForJustificationPa, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 68944L)
    public static SubLObject pph_literals_to_suppress_from_rule_and_conclusion(final SubLObject rule, final SubLObject conclusion, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, pph_irrelevance_check_mt(), pph_triviality_check_mt()));
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_literals_to_suppress = pph_rule_literals_to_suppress(rule, domain_mt);
        if (pph_proof.NIL != list_utilities.non_empty_list_p(rule_literals_to_suppress)) {
            SubLObject store = (SubLObject)pph_proof.NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store((SubLObject)pph_proof.NIL);
                final SubLObject inference = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)pph_proof.TWO_INTEGER), inference_kernel.new_cyc_query(arguments.support_sentence(conclusion), pph_proof.$const146$InferencePSC, (SubLObject)ConsesLow.list(new SubLObject[] { pph_proof.$kw157$INFERENCE_MODE, pph_proof.$kw158$SHALLOW, pph_proof.$kw159$ALLOWED_RULES, ConsesLow.list(rule), pph_proof.$kw160$RESULT_UNIQUENESS, pph_proof.$kw161$PROOF, pph_proof.$kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, pph_proof.NIL, pph_proof.$kw163$COMPUTE_ANSWER_JUSTIFICATIONS_, pph_proof.T, pph_proof.$kw164$MAX_TRANSFORMATION_DEPTH, pph_proof.ONE_INTEGER, pph_proof.$kw165$ANSWER_LANGUAGE, pph_proof.$kw166$HL, pph_proof.$kw167$PROBLEM_STORE, store, pph_proof.$kw168$BROWSABLE_, pph_proof.T })));
                final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (pph_proof.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)pph_proof.$kw169$SKIP)) {
                    final SubLObject idx_$131 = idx;
                    if (pph_proof.NIL == id_index.id_index_dense_objects_empty_p(idx_$131, (SubLObject)pph_proof.$kw169$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$131);
                        final SubLObject backwardP_var = (SubLObject)pph_proof.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_answer;
                        SubLObject cdolist_list_var;
                        SubLObject justification;
                        SubLObject cdolist_list_var_$132;
                        SubLObject proof;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_proof.NIL, v_iteration = (SubLObject)pph_proof.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_proof.ONE_INTEGER)) {
                            id = ((pph_proof.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_proof.ONE_INTEGER) : v_iteration);
                            v_answer = Vectors.aref(vector_var, id);
                            if (pph_proof.NIL == id_index.id_index_tombstone_p(v_answer) || pph_proof.NIL == id_index.id_index_skip_tombstones_p((SubLObject)pph_proof.$kw169$SKIP)) {
                                if (pph_proof.NIL != id_index.id_index_tombstone_p(v_answer)) {
                                    v_answer = (SubLObject)pph_proof.$kw169$SKIP;
                                }
                                cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                justification = (SubLObject)pph_proof.NIL;
                                justification = cdolist_list_var.first();
                                while (pph_proof.NIL != cdolist_list_var) {
                                    cdolist_list_var_$132 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                    proof = (SubLObject)pph_proof.NIL;
                                    proof = cdolist_list_var_$132.first();
                                    while (pph_proof.NIL != cdolist_list_var_$132) {
                                        if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
                                            return bindings.apply_bindings(inference_worker_transformation.transformation_proof_rule_el_bindings(proof), rule_literals_to_suppress);
                                        }
                                        cdolist_list_var_$132 = cdolist_list_var_$132.rest();
                                        proof = cdolist_list_var_$132.first();
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    justification = cdolist_list_var.first();
                                }
                            }
                        }
                    }
                    final SubLObject idx_$132 = idx;
                    if (pph_proof.NIL == id_index.id_index_sparse_objects_empty_p(idx_$132)) {
                        final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$132);
                        SubLObject id2 = (SubLObject)pph_proof.NIL;
                        SubLObject v_answer2 = (SubLObject)pph_proof.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                                SubLObject justification2 = (SubLObject)pph_proof.NIL;
                                justification2 = cdolist_list_var2.first();
                                while (pph_proof.NIL != cdolist_list_var2) {
                                    SubLObject cdolist_list_var_$133 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                                    SubLObject proof2 = (SubLObject)pph_proof.NIL;
                                    proof2 = cdolist_list_var_$133.first();
                                    while (pph_proof.NIL != cdolist_list_var_$133) {
                                        if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof2)) {
                                            return bindings.apply_bindings(inference_worker_transformation.transformation_proof_rule_el_bindings(proof2), rule_literals_to_suppress);
                                        }
                                        cdolist_list_var_$133 = cdolist_list_var_$133.rest();
                                        proof2 = cdolist_list_var_$133.first();
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    justification2 = cdolist_list_var2.first();
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(store);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (pph_proof.NIL != assertion_handles.assertion_p(conclusion)) {
                return pph_literals_to_suppress_from_deductions(rule, conclusion, rule_literals_to_suppress);
            }
            if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)pph_proof.$str170$Couldn_t_bind_variables_in_litera, rule, conclusion);
            }
        }
        return rule_literals_to_suppress;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 70468L)
    public static SubLObject pph_literals_to_suppress_from_deductions(final SubLObject rule, final SubLObject conclusion, final SubLObject rule_literals_to_suppress) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject antecedent = cycl_utilities.formula_arg1(uncanonicalizer.assertion_el_formula(rule), (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_proof.$var_binding_candidates$.currentBinding(thread);
        try {
            pph_proof.$var_binding_candidates$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_proof.EQL), (SubLObject)pph_proof.UNPROVIDED), thread);
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(conclusion);
            SubLObject argument = (SubLObject)pph_proof.NIL;
            argument = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                if (pph_proof.NIL != deduction_handles.deduction_p(argument)) {
                    SubLObject cdolist_list_var_$135 = (SubLObject)((pph_proof.NIL != el_utilities.el_conjunction_p(antecedent)) ? cycl_utilities.formula_args(antecedent, (SubLObject)pph_proof.UNPROVIDED) : ConsesLow.list(antecedent));
                    SubLObject lit = (SubLObject)pph_proof.NIL;
                    lit = cdolist_list_var_$135.first();
                    while (pph_proof.NIL != cdolist_list_var_$135) {
                        SubLObject lit_candidates = (SubLObject)pph_proof.NIL;
                        final SubLObject pattern = cycl_utilities.expression_transform(lit, (SubLObject)pph_proof.$sym171$EL_VARIABLE_P, (SubLObject)pph_proof.$sym172$SUBSTITUTE_PPH_VAR_BINDING, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        SubLObject cdolist_list_var_$136 = deductions_high.deduction_supports(argument);
                        SubLObject support = (SubLObject)pph_proof.NIL;
                        support = cdolist_list_var_$136.first();
                        while (pph_proof.NIL != cdolist_list_var_$136) {
                            final SubLObject support_sentence = arguments.support_sentence(support);
                            if (pph_proof.NIL != formula_pattern_match.formula_matches_pattern(support_sentence, pattern)) {
                                lit_candidates = (SubLObject)ConsesLow.cons(support_sentence, lit_candidates);
                            }
                            cdolist_list_var_$136 = cdolist_list_var_$136.rest();
                            support = cdolist_list_var_$136.first();
                        }
                        if (pph_proof.NIL != lit_candidates) {
                            if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str173$__Lit_candidates_for__S_____S, lit, lit_candidates, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                            }
                            SubLObject cdolist_list_var_$137 = cycl_utilities.expression_gather(lit, (SubLObject)pph_proof.$sym175$CYCL_VARIABLE_P, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                            SubLObject var = (SubLObject)pph_proof.NIL;
                            var = cdolist_list_var_$137.first();
                            while (pph_proof.NIL != cdolist_list_var_$137) {
                                final SubLObject old_var_candidates = dictionary.dictionary_lookup_without_values(pph_proof.$var_binding_candidates$.getDynamicValue(thread), var, misc_utilities.uninitialized());
                                SubLObject new_var_candidates = (SubLObject)pph_proof.NIL;
                                SubLObject cdolist_list_var_$138 = lit_candidates;
                                SubLObject lit_candidate = (SubLObject)pph_proof.NIL;
                                lit_candidate = cdolist_list_var_$138.first();
                                while (pph_proof.NIL != cdolist_list_var_$138) {
                                    final SubLObject position = cycl_utilities.arg_positions_dfs(var, lit, (SubLObject)pph_proof.UNPROVIDED).first();
                                    final SubLObject var_$139;
                                    final SubLObject candidate = var_$139 = cycl_utilities.formula_arg_position(lit_candidate, position, (SubLObject)pph_proof.UNPROVIDED);
                                    if (pph_proof.NIL != var_$139) {
                                        new_var_candidates = (SubLObject)ConsesLow.cons(var_$139, new_var_candidates);
                                    }
                                    cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                    lit_candidate = cdolist_list_var_$138.first();
                                }
                                if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                    format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str174$__New_candidates_for__S___S__, var, new_var_candidates, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                if (pph_proof.NIL != list_utilities.singletonP(lit_candidates)) {
                                    dictionary.dictionary_enter(pph_proof.$var_binding_candidates$.getDynamicValue(thread), var, new_var_candidates);
                                }
                                else if (pph_proof.NIL != misc_utilities.initialized_p(old_var_candidates)) {
                                    dictionary.dictionary_enter(pph_proof.$var_binding_candidates$.getDynamicValue(thread), var, conses_high.intersection(old_var_candidates, new_var_candidates, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED));
                                }
                                else {
                                    dictionary.dictionary_enter(pph_proof.$var_binding_candidates$.getDynamicValue(thread), var, new_var_candidates);
                                }
                                cdolist_list_var_$137 = cdolist_list_var_$137.rest();
                                var = cdolist_list_var_$137.first();
                            }
                        }
                        cdolist_list_var_$135 = cdolist_list_var_$135.rest();
                        lit = cdolist_list_var_$135.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            }
            SubLObject ans = (SubLObject)pph_proof.NIL;
            SubLObject cdolist_list_var2 = rule_literals_to_suppress;
            SubLObject lit2 = (SubLObject)pph_proof.NIL;
            lit2 = cdolist_list_var2.first();
            while (pph_proof.NIL != cdolist_list_var2) {
                SubLObject bound_version = el_utilities.copy_expression(lit2);
                SubLObject cdolist_list_var_$139 = cycl_utilities.expression_gather(lit2, (SubLObject)pph_proof.$sym175$CYCL_VARIABLE_P, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                SubLObject var2 = (SubLObject)pph_proof.NIL;
                var2 = cdolist_list_var_$139.first();
                while (pph_proof.NIL != cdolist_list_var_$139) {
                    final SubLObject var_binding_candidates = dictionary.dictionary_lookup_without_values(pph_proof.$var_binding_candidates$.getDynamicValue(thread), var2, (SubLObject)pph_proof.UNPROVIDED);
                    if (pph_proof.NIL != list_utilities.singletonP(var_binding_candidates)) {
                        bound_version = cycl_utilities.expression_subst(list_utilities.only_one(var_binding_candidates), var2, bound_version, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    }
                    else if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)pph_proof.$str176$Candidates_for__S___S, var2, var_binding_candidates);
                    }
                    cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                    var2 = cdolist_list_var_$139.first();
                }
                if (pph_proof.NIL == variables.fully_bound_p(bound_version) && pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)pph_proof.$str177$Couldn_t_fully_bind_variables_in_, lit2);
                }
                ans = (SubLObject)ConsesLow.cons(bound_version, ans);
                cdolist_list_var2 = cdolist_list_var2.rest();
                lit2 = cdolist_list_var2.first();
            }
            return Sequences.nreverse(ans);
        }
        finally {
            pph_proof.$var_binding_candidates$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 72925L)
    public static SubLObject substitute_pph_var_binding(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidates = dictionary.dictionary_lookup_without_values(pph_proof.$var_binding_candidates$.getDynamicValue(thread), obj, misc_utilities.uninitialized());
        return (SubLObject)((pph_proof.NIL != misc_utilities.initialized_p(candidates)) ? ConsesLow.cons((SubLObject)pph_proof.$kw178$OR, candidates) : pph_proof.$kw179$ANYTHING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 73155L)
    public static SubLObject pph_prune_meta_supports(final SubLObject input_supports, final SubLObject literals_to_suppress) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str180$__Pruning_meta_supports____Input_, input_supports, literals_to_suppress, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        SubLObject pruned = (SubLObject)pph_proof.NIL;
        final SubLObject _prev_bind_0 = proof_view.$proof_view_literals_to_suppress$.currentBinding(thread);
        try {
            proof_view.$proof_view_literals_to_suppress$.bind((SubLObject)((pph_proof.NIL != misc_utilities.initialized_p(proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread))) ? proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread) : pph_proof.NIL), thread);
            if (literals_to_suppress.isVector()) {
                final SubLObject backwardP_var = (SubLObject)pph_proof.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = Sequences.length(literals_to_suppress), v_iteration = (SubLObject)pph_proof.NIL, v_iteration = (SubLObject)pph_proof.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_proof.ONE_INTEGER)) {
                    element_num = ((pph_proof.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_proof.ONE_INTEGER) : v_iteration);
                    item = Vectors.aref(literals_to_suppress, element_num);
                    proof_view.$proof_view_literals_to_suppress$.setDynamicValue((SubLObject)ConsesLow.cons(item, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
                }
            }
            else {
                SubLObject cdolist_list_var = literals_to_suppress;
                SubLObject item2 = (SubLObject)pph_proof.NIL;
                item2 = cdolist_list_var.first();
                while (pph_proof.NIL != cdolist_list_var) {
                    proof_view.$proof_view_literals_to_suppress$.setDynamicValue((SubLObject)ConsesLow.cons(item2, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                }
            }
            SubLObject cdolist_list_var = input_supports;
            SubLObject support = (SubLObject)pph_proof.NIL;
            support = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                if (pph_proof.NIL == conses_high.member(support, pruned, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != proof_view.suppress_proof_supportP(support)) {
                    if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)pph_proof.$str181$Pruning__S, support);
                    }
                    pruned = (SubLObject)ConsesLow.cons(support, pruned);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        finally {
            proof_view.$proof_view_literals_to_suppress$.rebind(_prev_bind_0, thread);
        }
        return conses_high.set_difference(input_supports, pruned, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 73781L)
    public static SubLObject pph_show_all_meta_supports_for_module_p(final SubLObject module) {
        return subl_promotions.memberP(module, pph_proof.$pph_support_modules_for_which_to_show_all_meta_supports$.getGlobalValue(), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 73931L)
    public static SubLObject pph_always_show_meta_support_for_moduleP_internal(final SubLObject meta_support, final SubLObject module) {
        if (pph_proof.NIL != pph_show_all_meta_supports_for_module_p(module)) {
            return (SubLObject)pph_proof.T;
        }
        if (module.eql((SubLObject)pph_proof.$kw183$RTV) && !arguments.support_module(meta_support).eql((SubLObject)pph_proof.$kw184$GENLPREDS)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 73931L)
    public static SubLObject pph_always_show_meta_support_for_moduleP(final SubLObject meta_support, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_always_show_meta_support_for_moduleP_internal(meta_support, module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(meta_support, module);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (meta_support.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && module.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_always_show_meta_support_for_moduleP_internal(meta_support, module)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(meta_support, module));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 74223L)
    public static SubLObject pph_show_argument(SubLObject argument, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        argument = pph_sub_isomorphic_assertions_into_supports(argument);
        final SubLObject invalid_supports = list_utilities.remove_if_not((SubLObject)pph_proof.$sym185$PPH_INVALID_SUPPORT_, argument, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL != invalid_supports) {
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str186$_2);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != html_macros.$html_color_cyc_logo_violet$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_cyc_logo_violet$.getGlobalValue()));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_princ_strong((SubLObject)pph_proof.$str187$Invalid);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        if (pph_proof.NIL != list_utilities.singletonP(argument)) {
            pph_show_support(argument.first(), index_string, invalid_supports);
        }
        else {
            SubLObject additional_supports = list_utilities.remove_if_not((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, argument, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != list_utilities.same_length_p(argument, additional_supports)) {
                additional_supports = (SubLObject)pph_proof.NIL;
            }
            additional_supports = conses_high.set_difference(additional_supports, invalid_supports, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                SubLObject list_var = (SubLObject)pph_proof.NIL;
                SubLObject support = (SubLObject)pph_proof.NIL;
                SubLObject support_num = (SubLObject)pph_proof.NIL;
                list_var = argument;
                support = list_var.first();
                for (support_num = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, support_num)) {
                    if (pph_proof.NIL == subl_promotions.memberP(support, additional_supports, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject support_index_string = PrintLow.format((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$str188$_A__D, index_string, support_num);
                            pph_show_support(support, support_index_string, invalid_supports);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            if (pph_proof.NIL != additional_supports) {
                pph_maybe_show_additional_supports(additional_supports, index_string);
            }
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 75475L)
    public static SubLObject pph_irrelevant_proof_conclusionP(final SubLObject proof_conclusion) {
        if (pph_proof.NIL != assertion_handles.assertion_p(proof_conclusion)) {
            return pph_irrelevant_supportP(proof_conclusion, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != el_utilities.el_conjunction_p(proof_conclusion)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == list_utilities.find_if_not((SubLObject)pph_proof.$sym21$PPH_IRRELEVANT_FORMULA_, cycl_utilities.formula_args(proof_conclusion, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
        }
        if (pph_proof.NIL != el_utilities.el_formula_p(proof_conclusion)) {
            return pph_irrelevant_formulaP(proof_conclusion, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 75880L)
    public static SubLObject pph_irrelevant_supportP_internal(final SubLObject support, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (pph_relevance_safe_list == pph_proof.UNPROVIDED) {
            pph_relevance_safe_list = (SubLObject)pph_proof.NIL;
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_proof.$pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != assertions_high.invalid_assertionP(support, (SubLObject)pph_proof.UNPROVIDED) || pph_proof.NIL != pph_proof_support_already_shown_p(support)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_support_trivialP(support, pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_proof.$const89$MtUnionFn, domain_mt, pph_triviality_check_mt())))) {
            if (pph_proof.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)pph_proof.$str115$PPH_irrelevant_formula_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_proof.$str116$_, format_nil.format_nil_s_no_copy(support), format_nil.$format_nil_percent$.getGlobalValue() }), (SubLObject)pph_proof.$str189$___is_a_trivial_support_));
            }
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_required_ruleP(support)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != assertion_handles.assertion_p(support) && pph_proof.NIL != pph_methods.pph_assertion_has_glossP(support)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_irrelevant_support_module_p(arguments.support_module(support)) || pph_proof.NIL != pph_irrelevant_formulaP(pph_support_el_sentence(support), pph_relevance_safe_list, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 75880L)
    public static SubLObject pph_irrelevant_supportP(final SubLObject support, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (pph_relevance_safe_list == pph_proof.UNPROVIDED) {
            pph_relevance_safe_list = (SubLObject)pph_proof.NIL;
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_irrelevant_supportP_internal(support, pph_relevance_safe_list, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, (SubLObject)pph_proof.THREE_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(support, pph_relevance_safe_list, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (support.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_relevance_safe_list.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_irrelevant_supportP_internal(support, pph_relevance_safe_list, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(support, pph_relevance_safe_list, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 76903L)
    public static SubLObject pph_irrelevant_support_module_p(final SubLObject support_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(support_module, pph_proof.$pph_irrelevant_support_modules$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77038L)
    public static SubLObject pph_support_sentence(final SubLObject support, SubLObject replace_redundant_nartsP) {
        if (replace_redundant_nartsP == pph_proof.UNPROVIDED) {
            replace_redundant_nartsP = (SubLObject)pph_proof.T;
        }
        final SubLObject sentence = arguments.support_sentence(support);
        return (pph_proof.NIL != replace_redundant_nartsP) ? pph_sentence_replace_redundant_narts(sentence) : sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77289L)
    public static SubLObject pph_support_el_sentence_internal(final SubLObject support) {
        final SubLObject sentence = arguments.support_el_sentence(support);
        return pph_sentence_replace_redundant_narts(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77289L)
    public static SubLObject pph_support_el_sentence(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_support_el_sentence_internal(support);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym17$PPH_SUPPORT_EL_SENTENCE, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym17$PPH_SUPPORT_EL_SENTENCE, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym17$PPH_SUPPORT_EL_SENTENCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_support_el_sentence_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, (SubLObject)pph_proof.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77470L)
    public static SubLObject pph_sentence_replace_redundant_narts(final SubLObject sentence) {
        return cycl_utilities.expression_transform(sentence, (SubLObject)pph_proof.$sym191$PPH_TRANSFORMABLE_REDUNDANT_NART_P, (SubLObject)pph_proof.$sym192$PPH_TRANSFORM_REDUNDANT_NART, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77658L)
    public static SubLObject pph_transformable_redundant_nart_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != nart_handles.nart_p(v_object) && pph_proof.NIL != pph_constant_for_nart(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77788L)
    public static SubLObject pph_transform_redundant_nart(final SubLObject nart) {
        return pph_constant_for_nart(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77879L)
    public static SubLObject pph_constant_for_nart_internal(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = (SubLObject)pph_proof.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_proof.$sym194$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_proof.$const195$EverythingPSC, thread);
            final SubLObject pred_var = pph_proof.$const196$rewriteOf;
            if (pph_proof.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, (SubLObject)pph_proof.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, (SubLObject)pph_proof.NIL, pred_var);
                SubLObject done_var = constant;
                final SubLObject token_var = (SubLObject)pph_proof.NIL;
                while (pph_proof.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (pph_proof.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)pph_proof.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_proof.$kw197$GAF, (SubLObject)pph_proof.$kw198$TRUE, (SubLObject)pph_proof.NIL);
                            SubLObject done_var_$142 = constant;
                            final SubLObject token_var_$143 = (SubLObject)pph_proof.NIL;
                            while (pph_proof.NIL == done_var_$142) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$143);
                                final SubLObject valid_$144 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$143.eql(gaf));
                                if (pph_proof.NIL != valid_$144) {
                                    final SubLObject simpler = assertions_high.gaf_arg1(gaf);
                                    if (pph_proof.NIL != constant_handles.constant_p(simpler)) {
                                        constant = simpler;
                                    }
                                }
                                done_var_$142 = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == valid_$144 || pph_proof.NIL != constant);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (pph_proof.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == valid || pph_proof.NIL != constant);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 77879L)
    public static SubLObject pph_constant_for_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_constant_for_nart_internal(nart);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym193$PPH_CONSTANT_FOR_NART, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym193$PPH_CONSTANT_FOR_NART, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQ, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym193$PPH_CONSTANT_FOR_NART, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_constant_for_nart_internal(nart)));
            memoization_state.caching_state_put(caching_state, nart, results, (SubLObject)pph_proof.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 78190L)
    public static SubLObject pph_irrelevant_formulaP(final SubLObject formula, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (pph_relevance_safe_list == pph_proof.UNPROVIDED) {
            pph_relevance_safe_list = (SubLObject)pph_proof.NIL;
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != arguments.support_p(formula)) {
            return pph_irrelevant_formulaP(arguments.support_el_sentence(formula), pph_relevance_safe_list, domain_mt);
        }
        if (pph_proof.NIL != cycl_utilities.expression_find(formula, el_utilities.make_el_list(pph_relevance_safe_list, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.T, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != el_utilities.el_implication_p(formula)) {
            return pph_irrelevant_formulaP(cycl_utilities.formula_arg2(formula, (SubLObject)pph_proof.UNPROVIDED), pph_relevance_safe_list, domain_mt);
        }
        if (pph_proof.NIL == el_utilities.el_formula_p(formula)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg0(formula))) {
            if (pph_proof.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)pph_proof.$str115$PPH_irrelevant_formula_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_proof.$str116$_, format_nil.format_nil_s_no_copy(formula), format_nil.$format_nil_percent$.getGlobalValue() }), (SubLObject)pph_proof.$str199$Has_EL_variable_functor___S_), cycl_utilities.formula_arg0(formula));
            }
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != cycl_variables.hl_varP(cycl_utilities.formula_arg0(formula))) {
            if (pph_proof.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)pph_proof.$str115$PPH_irrelevant_formula_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_proof.$str116$_, format_nil.format_nil_s_no_copy(formula), format_nil.$format_nil_percent$.getGlobalValue() }), (SubLObject)pph_proof.$str200$Has_HL_variable_functor___S_), cycl_utilities.formula_arg0(formula));
            }
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_utilities.pph_genl_predicateP(narts_high.nart_substitute(cycl_utilities.formula_arg0(formula)), pph_proof.$const201$interestingSentence, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != el_utilities.el_formula_with_operator_p(formula, pph_proof.$const202$ist)) {
            return pph_irrelevant_formulaP(cycl_utilities.formula_arg2(formula, (SubLObject)pph_proof.UNPROVIDED), pph_relevance_safe_list, domain_mt);
        }
        if (pph_proof.NIL != sksi_external_term_browser.sksi_supported_external_termP(formula)) {
            return (SubLObject)pph_proof.NIL;
        }
        final SubLObject max_to_check = (SubLObject)pph_proof.TWELVE_INTEGER;
        final SubLObject terms = cycl_utilities.formula_terms(formula, (SubLObject)pph_proof.$kw203$IGNORE);
        SubLObject list_var = (SubLObject)pph_proof.NIL;
        SubLObject arg = (SubLObject)pph_proof.NIL;
        SubLObject argnum = (SubLObject)pph_proof.NIL;
        list_var = terms;
        arg = list_var.first();
        for (argnum = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (argnum.numG(max_to_check)) {
                return (SubLObject)pph_proof.NIL;
            }
            if (pph_proof.NIL != pph_utilities.pph_irrelevant_fort(arg, pph_relevance_safe_list, domain_mt)) {
                if (pph_proof.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                    Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)pph_proof.$str115$PPH_irrelevant_formula_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_proof.$str116$_, format_nil.format_nil_s_no_copy(formula), format_nil.$format_nil_percent$.getGlobalValue() }), (SubLObject)pph_proof.$str204$Has_irrelevant_FORT___S_in__S_), arg, domain_mt);
                }
                return (SubLObject)pph_proof.T;
            }
            if (pph_proof.NIL != pph_irrelevant_formulaP(arg, pph_relevance_safe_list, domain_mt)) {
                return (SubLObject)pph_proof.T;
            }
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 79769L)
    public static SubLObject pph_trivial_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_proof.$pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != assertion_handles.assertion_p(sentence)) {
            return pph_assertion_trivialP(sentence, (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != pph_trivial_termP(cycl_utilities.formula_arg0(sentence), (SubLObject)pph_proof.$kw205$PREDICATE, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != pph_trivial_sentenceP(cycl_utilities.formula_arg2(sentence, (SubLObject)pph_proof.UNPROVIDED), domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != el_utilities.el_negation_p(sentence) && pph_proof.NIL != pph_trivial_termP(cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED)), (SubLObject)pph_proof.$kw205$PREDICATE, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != formula_too_complex_for_proof_paraphraseP(sentence, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL == el_utilities.closedP(sentence, (SubLObject)pph_proof.UNPROVIDED) || pph_proof.NIL == el_utilities.atomic_sentenceP(sentence)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_trivial_instance_with_relation_isa_sentenceP(sentence)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_upper_ontology_sentenceP(sentence)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_isa_sentenceP(sentence, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_genls_sentenceP(sentence, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_genl_preds_sentenceP(sentence, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_subcollection_pred_sentenceP(sentence)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_reflexive_sentenceP(sentence)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_the_sentenceP(sentence, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_trivial_functional_sentenceP(sentence, domain_mt)) {
            if (pph_proof.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)pph_proof.$str115$PPH_irrelevant_formula_, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), pph_proof.$str116$_, format_nil.format_nil_s_no_copy(sentence), format_nil.$format_nil_percent$.getGlobalValue() }), (SubLObject)pph_proof.$str206$Trivial_functional_sentence_));
            }
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != sentence_has_trivial_isomorphic_assertionP(sentence, domain_mt)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 81350L)
    public static SubLObject sentence_trivial_for_justification_paraphraseP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != el_utilities.closedP(sentence, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != pph_utilities.pph_ask_boolean(el_utilities.make_unary_formula(pph_proof.$const207$sentenceTrivialForJustificationPa, sentence), domain_mt, (SubLObject)pph_proof.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 81626L)
    public static SubLObject sentence_has_trivial_isomorphic_assertionP_internal(final SubLObject sentence, final SubLObject domain_mt) {
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == trivialP) {
            SubLObject csome_list_var = kb_indexing.find_all_gafs(sentence);
            SubLObject gaf = (SubLObject)pph_proof.NIL;
            gaf = csome_list_var.first();
            while (pph_proof.NIL == trivialP && pph_proof.NIL != csome_list_var) {
                if (pph_proof.NIL != pph_trivial_termP(gaf, (SubLObject)pph_proof.$kw113$ASSERTION, domain_mt)) {
                    trivialP = (SubLObject)pph_proof.T;
                }
                csome_list_var = csome_list_var.rest();
                gaf = csome_list_var.first();
            }
        }
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 81626L)
    public static SubLObject sentence_has_trivial_isomorphic_assertionP(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return sentence_has_trivial_isomorphic_assertionP_internal(sentence, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sentence_has_trivial_isomorphic_assertionP_internal(sentence, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 81920L)
    public static SubLObject pph_trivial_the_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED)).equal(pph_proof.$const209$The) && cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED).equal(cycl_utilities.formula_arg2(sentence, (SubLObject)pph_proof.UNPROVIDED)) && pph_proof.NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg0(sentence), pph_proof.$const103$isa, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 82236L)
    public static SubLObject pph_trivial_upper_ontology_sentenceP(final SubLObject sentence) {
        if (pph_proof.NIL != formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)pph_proof.$list210)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 82425L)
    public static SubLObject pph_trivial_functional_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject ask_result = (SubLObject)((pph_proof.NIL != isa.isaP(pred, pph_proof.$const211$FunctionalPredicate, domain_mt, (SubLObject)pph_proof.UNPROVIDED)) ? pph_utilities.pph_ask_template_new((SubLObject)pph_proof.$list212, (SubLObject)ConsesLow.listS(pph_proof.$const213$functionCorrespondingPredicate, (SubLObject)pph_proof.$sym214$_FN, pred, (SubLObject)pph_proof.$list215), domain_mt, (SubLObject)pph_proof.$list216) : pph_proof.NIL);
        if (pph_proof.NIL == trivialP) {
            SubLObject csome_list_var = ask_result;
            SubLObject this_ask_result = (SubLObject)pph_proof.NIL;
            this_ask_result = csome_list_var.first();
            while (pph_proof.NIL == trivialP && pph_proof.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = this_ask_result;
                SubLObject fn = (SubLObject)pph_proof.NIL;
                SubLObject argnum = (SubLObject)pph_proof.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list217);
                fn = current.first();
                current = (argnum = current.rest());
                final SubLObject arg = cycl_utilities.atomic_sentence_arg(sentence, argnum, (SubLObject)pph_proof.UNPROVIDED);
                trivialP = Equality.eql(cycl_utilities.nat_functor(arg), fn);
                csome_list_var = csome_list_var.rest();
                this_ask_result = csome_list_var.first();
            }
        }
        if (pph_proof.NIL != trivialP && pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)pph_proof.$str218$Trivial_functional_sentence_____S, sentence);
        }
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 83136L)
    public static SubLObject pph_trivial_instance_with_relation_isa_sentenceP(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.formula_arg0(sentence).eql(pph_proof.$const103$isa) && cycl_utilities.formula_arg2(sentence, (SubLObject)pph_proof.UNPROVIDED).equal(cycl_utilities.nat_arg1(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED)) && pph_proof.NIL != conses_high.member(cycl_utilities.nat_functor(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED)), (SubLObject)pph_proof.$list219, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 83457L)
    public static SubLObject pph_trivial_genls_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != el_utilities.formula_arityE(sentence, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != el_utilities.el_formula_with_operator_p(sentence, pph_proof.$const220$genls)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(sentence, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject arg1 = (SubLObject)pph_proof.NIL;
            SubLObject arg2 = (SubLObject)pph_proof.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list221);
            arg1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list221);
            arg2 = current.first();
            current = current.rest();
            if (pph_proof.NIL == current) {
                if (arg2.equal(cycl_utilities.nat_arg1(arg1, (SubLObject)pph_proof.UNPROVIDED)) && pph_proof.NIL != kb_accessors.subcollection_relation_function_expression_p(arg1)) {
                    trivialP = (SubLObject)pph_proof.T;
                }
                else {
                    if (pph_proof.NIL != cycl_grammar.cycl_nat_p(arg2) && pph_proof.$const222$CollectionUnionFn.eql(cycl_utilities.nat_functor(arg2)) && pph_proof.NIL != el_utilities.el_set_p(cycl_utilities.nat_arg1(arg2, (SubLObject)pph_proof.UNPROVIDED)) && pph_proof.NIL != conses_high.member(arg1, el_utilities.el_set_items(cycl_utilities.nat_arg1(arg2, (SubLObject)pph_proof.UNPROVIDED)), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                        return (SubLObject)pph_proof.T;
                    }
                    if (pph_proof.NIL != kb_indexing_datastructures.indexed_term_p(arg2) && (pph_proof.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, pph_proof.$const223$instanceAndSpecSentencesTrivialFo, domain_mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) || pph_proof.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, pph_proof.$const224$specSentencesTrivialForJustificat, domain_mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED))) {
                        trivialP = (SubLObject)pph_proof.T;
                    }
                    else if (pph_proof.NIL != cycl_grammar.cycl_nat_p(arg1) && pph_proof.NIL != subl_promotions.memberP(arg2, kb_accessors.result_genl(cycl_utilities.nat_functor(arg1), domain_mt, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                        trivialP = (SubLObject)pph_proof.T;
                    }
                    else if (pph_proof.NIL != cycl_grammar.cycl_nat_p(arg1) && pph_proof.NIL != subl_promotions.memberP(arg2, kb_accessors.result_genl_args(arg1, domain_mt), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                        trivialP = (SubLObject)pph_proof.T;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list221);
            }
        }
        if (pph_proof.NIL != trivialP && pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)pph_proof.$str225$Trivial___genls_sentence_____S__, sentence);
        }
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 84745L)
    public static SubLObject pph_trivial_isa_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != el_utilities.formula_arityE(sentence, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != el_utilities.el_formula_with_operator_p(sentence, pph_proof.$const103$isa)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(sentence, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject arg1 = (SubLObject)pph_proof.NIL;
            SubLObject arg2 = (SubLObject)pph_proof.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list221);
            arg1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list221);
            arg2 = current.first();
            current = current.rest();
            if (pph_proof.NIL == current) {
                if (pph_proof.NIL != kb_indexing_datastructures.indexed_term_p(arg2) && (pph_proof.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, pph_proof.$const223$instanceAndSpecSentencesTrivialFo, domain_mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) || pph_proof.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, pph_proof.$const226$instanceSentencesTrivialForJustif, domain_mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED))) {
                    trivialP = (SubLObject)pph_proof.T;
                }
                else if (pph_proof.NIL != cycl_grammar.cycl_nat_p(arg2) && cycl_utilities.nat_functor(arg2).eql(pph_proof.$const227$SingletonCollectionFn)) {
                    trivialP = (SubLObject)pph_proof.T;
                }
                else if (pph_proof.NIL != cycl_grammar.cycl_nat_p(arg1) && pph_proof.NIL != subl_promotions.memberP(arg2, kb_accessors.result_isa(cycl_utilities.nat_functor(arg1), domain_mt), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                    trivialP = (SubLObject)pph_proof.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list221);
            }
        }
        if (pph_proof.NIL != trivialP && pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)pph_proof.$str228$Trivial___isa_sentence_____S__, sentence);
        }
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 85655L)
    public static SubLObject pph_trivial_genl_preds_sentenceP(final SubLObject sentence, SubLObject mt) {
        if (mt == pph_proof.UNPROVIDED) {
            mt = pph_triviality_check_mt();
        }
        if (!cycl_utilities.formula_arg0(sentence).eql(pph_proof.$const229$genlPreds)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (cycl_utilities.formula_arg2(sentence, (SubLObject)pph_proof.UNPROVIDED).equal(cycl_utilities.nat_arg1(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED))) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != pph_required_sentenceP(sentence, mt)) {
            return (SubLObject)pph_proof.NIL;
        }
        return (SubLObject)pph_proof.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 85991L)
    public static SubLObject pph_required_sentenceP_internal(final SubLObject sentence, final SubLObject mt) {
        return inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(pph_proof.$const231$or, (SubLObject)ConsesLow.list(pph_proof.$const232$sentenceRequiredForJustificationP, sentence), (SubLObject)ConsesLow.list(pph_proof.$const233$thereExists, (SubLObject)pph_proof.$sym234$_AS, (SubLObject)ConsesLow.listS(pph_proof.$const235$and, (SubLObject)ConsesLow.list(pph_proof.$const236$assertionSentence, (SubLObject)pph_proof.$sym234$_AS, sentence), (SubLObject)pph_proof.$list237))), mt, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 85991L)
    public static SubLObject pph_required_sentenceP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_required_sentenceP_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym230$PPH_REQUIRED_SENTENCE_, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym230$PPH_REQUIRED_SENTENCE_, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym230$PPH_REQUIRED_SENTENCE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_required_sentenceP_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 86316L)
    public static SubLObject pph_trivial_subcollection_pred_sentenceP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)pph_proof.$list238);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_proof.NIL != success) {
            final SubLObject x = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_proof.$sym239$X, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_proof.$sym240$BIN_PRED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject nat = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_proof.$sym241$NAT, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != formula_pattern_match.formula_matches_pattern(cycl_utilities.formula_terms(nat, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)pph_proof.$kw179$ANYTHING, (SubLObject)pph_proof.$kw179$ANYTHING, bin_pred, x))) {
                trivialP = (SubLObject)pph_proof.T;
            }
        }
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 86827L)
    public static SubLObject pph_trivial_reflexive_sentenceP(final SubLObject sentence) {
        SubLObject trivialP = (SubLObject)pph_proof.NIL;
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject arg_to_argnums = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        SubLObject argnum = (SubLObject)pph_proof.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)pph_proof.$kw203$IGNORE);
        SubLObject arg = (SubLObject)pph_proof.NIL;
        arg = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)pph_proof.ONE_INTEGER);
            dictionary_utilities.dictionary_push(arg_to_argnums, arg, argnum);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (pph_proof.NIL == trivialP) {
            SubLObject csome_list_var = dictionary.dictionary_values(arg_to_argnums);
            SubLObject argnums = (SubLObject)pph_proof.NIL;
            argnums = csome_list_var.first();
            while (pph_proof.NIL == trivialP && pph_proof.NIL != csome_list_var) {
                SubLObject argnum_pairs = (SubLObject)pph_proof.NIL;
                final SubLObject pcase_var = Sequences.length(argnums);
                if (!pcase_var.eql((SubLObject)pph_proof.ZERO_INTEGER)) {
                    if (!pcase_var.eql((SubLObject)pph_proof.ONE_INTEGER)) {
                        if (pcase_var.eql((SubLObject)pph_proof.TWO_INTEGER)) {
                            argnum_pairs = (SubLObject)ConsesLow.list(argnums);
                        }
                        else {
                            SubLObject cdolist_list_var2 = list_utilities.cartesian_product((SubLObject)ConsesLow.list(argnums, argnums), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                            SubLObject argnum_pair = (SubLObject)pph_proof.NIL;
                            argnum_pair = cdolist_list_var2.first();
                            while (pph_proof.NIL != cdolist_list_var2) {
                                if (argnum_pair.first().numL(conses_high.second(argnum_pair))) {
                                    argnum_pairs = (SubLObject)ConsesLow.cons(argnum_pair, argnum_pairs);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                argnum_pair = cdolist_list_var2.first();
                            }
                        }
                    }
                }
                if (pph_proof.NIL == trivialP) {
                    SubLObject csome_list_var_$146 = argnum_pairs;
                    SubLObject argnum_pair = (SubLObject)pph_proof.NIL;
                    argnum_pair = csome_list_var_$146.first();
                    while (pph_proof.NIL == trivialP && pph_proof.NIL != csome_list_var_$146) {
                        SubLObject current;
                        final SubLObject datum = current = argnum_pair;
                        SubLObject arg2 = (SubLObject)pph_proof.NIL;
                        SubLObject arg3 = (SubLObject)pph_proof.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list221);
                        arg2 = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list221);
                        arg3 = current.first();
                        current = current.rest();
                        if (pph_proof.NIL == current) {
                            if (pph_proof.NIL != pph_utilities.pph_ask_boolean((SubLObject)ConsesLow.list(pph_proof.$const242$reflexiveInArgs, pred, arg2, arg3), pph_proof.$const146$InferencePSC, (SubLObject)pph_proof.ONE_INTEGER)) {
                                trivialP = (SubLObject)pph_proof.T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list221);
                        }
                        csome_list_var_$146 = csome_list_var_$146.rest();
                        argnum_pair = csome_list_var_$146.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                argnums = csome_list_var.first();
            }
        }
        if (pph_proof.NIL != trivialP) {}
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 87796L)
    public static SubLObject pph_trivial_termP_internal(final SubLObject v_object, final SubLObject type, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != cycl_grammar.cycl_term_p(v_object)) {
            SubLObject store = (SubLObject)pph_proof.NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store((SubLObject)pph_proof.NIL);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != term_has_pro_trivial_argumentP(v_object, type, domain_mt, store) && pph_proof.NIL == term_has_con_trivial_argumentP(v_object, type, domain_mt, store));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(store);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (pph_proof.NIL != ans && pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)pph_proof.$str244$_A_is_trivial_in__S, v_object, domain_mt);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 87796L)
    public static SubLObject pph_trivial_termP(final SubLObject v_object, final SubLObject type, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_trivial_termP_internal(v_object, type, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym243$PPH_TRIVIAL_TERM_, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym243$PPH_TRIVIAL_TERM_, (SubLObject)pph_proof.THREE_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym243$PPH_TRIVIAL_TERM_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_object, type, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_object.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_trivial_termP_internal(v_object, type, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_object, type, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 88255L)
    public static SubLObject triviality_sentence_for_term(final SubLObject v_term, final SubLObject type) {
        if (type.eql((SubLObject)pph_proof.$kw205$PREDICATE)) {
            return (SubLObject)ConsesLow.list(pph_proof.$const245$predTrivialForJustificationParaph, v_term);
        }
        if (type.eql((SubLObject)pph_proof.$kw113$ASSERTION)) {
            return (SubLObject)ConsesLow.list(pph_proof.$const246$assertionTrivialForJustificationP, v_term);
        }
        if (type.eql((SubLObject)pph_proof.$kw119$MT)) {
            return (SubLObject)ConsesLow.list(pph_proof.$const118$mtTrivialForJustificationParaphra, v_term);
        }
        Errors.error((SubLObject)pph_proof.$str247$_S_is_an_unknown_triviality_type_, type);
        return pph_proof.$const248$False;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 88636L)
    public static SubLObject triviality_query_properties(final SubLObject problem_store) {
        return (SubLObject)ConsesLow.list((SubLObject)pph_proof.$kw157$INFERENCE_MODE, (SubLObject)pph_proof.$kw249$MINIMAL, (SubLObject)pph_proof.$kw167$PROBLEM_STORE, problem_store);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 88773L)
    public static SubLObject term_has_pro_trivial_argumentP(final SubLObject v_term, final SubLObject type, final SubLObject domain_mt, final SubLObject problem_store) {
        if (type == pph_proof.$kw205$PREDICATE && pph_proof.NIL != somewhere_cache.valid_somewhere_cache_itemP(v_term) && pph_proof.NIL == somewhere_cache.some_pred_assertion_somewhereP(pph_proof.$const245$predTrivialForJustificationParaph, v_term, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.T)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (type == pph_proof.$kw113$ASSERTION && pph_proof.NIL == assertion_has_triviality_assertionsP(v_term)) {
            return (SubLObject)pph_proof.NIL;
        }
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(triviality_sentence_for_term(v_term, type), domain_mt, triviality_query_properties(problem_store)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 89318L)
    public static SubLObject assertion_has_triviality_assertionsP(final SubLObject v_assert) {
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds(pph_proof.$const246$assertionTrivialForJustificationP, pph_proof.$const146$InferencePSC, (SubLObject)pph_proof.UNPROVIDED);
        SubLObject pred = (SubLObject)pph_proof.NIL;
        pred = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL == somewhere_cache.somewhere_cached_pred_p(pred) || pph_proof.NIL != somewhere_cache.some_pred_assertion_somewhereP(pred, v_assert, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.T)) {
                return (SubLObject)pph_proof.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 89611L)
    public static SubLObject term_has_con_trivial_argumentP(final SubLObject v_term, final SubLObject type, final SubLObject domain_mt, final SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(cycl_utilities.negate(triviality_sentence_for_term(v_term, type)), domain_mt, triviality_query_properties(problem_store)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 89862L)
    public static SubLObject pph_maybe_show_additional_supports(final SubLObject supports, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = Sequences.cconcatenate((SubLObject)pph_proof.$str250$additional_supports_, index_string);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str38$text_css);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str39$screen);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_utilities.html_markup((SubLObject)pph_proof.$str40$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, (SubLObject)pph_proof.$str251$Additional_Supports);
            dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)pph_proof.$kw42$INVISIBLE, (SubLObject)pph_proof.$kw43$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (pph_proof.NIL != object_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(object_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    SubLObject list_var = (SubLObject)pph_proof.NIL;
                    SubLObject support = (SubLObject)pph_proof.NIL;
                    SubLObject support_num = (SubLObject)pph_proof.NIL;
                    list_var = supports;
                    support = list_var.first();
                    for (support_num = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, support_num)) {
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject support_index_string = PrintLow.format((SubLObject)pph_proof.NIL, (SubLObject)pph_proof.$str252$_A_additional__D, index_string, support_num);
                            pph_show_support(support, support_index_string, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        else {
            html_utilities.html_princ((SubLObject)pph_proof.$str251$Additional_Supports);
            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                SubLObject list_var2 = (SubLObject)pph_proof.NIL;
                SubLObject support2 = (SubLObject)pph_proof.NIL;
                SubLObject support_num2 = (SubLObject)pph_proof.NIL;
                list_var2 = supports;
                support2 = list_var2.first();
                for (support_num2 = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var2; list_var2 = list_var2.rest(), support2 = list_var2.first(), support_num2 = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, support_num2)) {
                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        pph_show_support(support2, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 90768L)
    public static SubLObject pph_show_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(assertions_high.assertion_mt(assertion), (SubLObject)pph_proof.UNPROVIDED), thread);
            if (pph_proof.NIL != pph_highly_relevant_assertionP(assertion, (SubLObject)pph_proof.UNPROVIDED)) {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str135$highly_relevant);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    pph_show_assertion_int(assertion);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    pph_show_assertion_int(assertion);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 91117L)
    public static SubLObject pph_show_assertion_int(final SubLObject assertion) {
        pph_show_wXsentential_force(assertion, (SubLObject)pph_proof.$kw3$DECLARATIVE, (SubLObject)pph_proof.UNPROVIDED);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 91403L)
    public static SubLObject pph_assert_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_sources = sources.assertion_sources(assertion);
        final SubLObject strengthenedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(hlmt.assertion_hlmt(assertion), v_sources, strengthenedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 91610L)
    public static SubLObject pph_show_source(SubLObject source, SubLObject strengthenedP) {
        if (strengthenedP == pph_proof.UNPROVIDED) {
            strengthenedP = (SubLObject)pph_proof.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str253$_from__A, pph_term_phrase_np(source));
        return source;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 91772L)
    public static SubLObject pph_highly_relevant_assertionP(final SubLObject assertion, SubLObject mt) {
        if (mt == pph_proof.UNPROVIDED) {
            mt = pph_proof.$const146$InferencePSC;
        }
        SubLObject sentence = (SubLObject)ConsesLow.list(pph_proof.$const254$sentenceHighlyRelevantForJustific, assertion);
        if (pph_proof.NIL != assertions_high.gaf_assertionP(assertion)) {
            sentence = simplifier.disjoin((SubLObject)ConsesLow.list(sentence, (SubLObject)ConsesLow.list(pph_proof.$const137$predHighlyRelevantForJustificatio, assertions_high.gaf_arg0(assertion))), (SubLObject)pph_proof.UNPROVIDED);
        }
        return pph_utilities.pph_ask_boolean(sentence, mt, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 92152L)
    public static SubLObject pph_show_sentence(final SubLObject sentence, SubLObject paraphrase, SubLObject show_linkP) {
        if (paraphrase == pph_proof.UNPROVIDED) {
            paraphrase = (SubLObject)pph_proof.NIL;
        }
        if (show_linkP == pph_proof.UNPROVIDED) {
            show_linkP = (SubLObject)pph_proof.T;
        }
        pph_show_wXsentential_force(sentence, (SubLObject)pph_proof.$kw3$DECLARATIVE, paraphrase);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 92586L)
    public static SubLObject pph_show_term(final SubLObject v_term, SubLObject paraphrase, SubLObject show_linkP) {
        if (paraphrase == pph_proof.UNPROVIDED) {
            paraphrase = (SubLObject)pph_proof.NIL;
        }
        if (show_linkP == pph_proof.UNPROVIDED) {
            show_linkP = (SubLObject)pph_proof.T;
        }
        final SubLObject force = pph_utilities.pph_default_force_for_term(v_term);
        pph_show_wXsentential_force(v_term, force, paraphrase);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 93036L)
    public static SubLObject pph_show_question(final SubLObject v_question) {
        pph_show_wXsentential_force(v_question, (SubLObject)pph_proof.$kw255$INTERROGATIVE, (SubLObject)pph_proof.UNPROVIDED);
        return v_question;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 93158L)
    public static SubLObject pph_term_phrase_np(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tagged = (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_constrained(), pph_utilities.pph_np_category(), v_object);
        return pph_main.generate_text_wXsentential_force(tagged, (SubLObject)pph_proof.$kw256$NONE, (SubLObject)pph_proof.$kw257$ANY, (SubLObject)pph_proof.$kw2$DEFAULT, (SubLObject)pph_proof.$kw2$DEFAULT, pph_vars.$paraphrase_mode$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 93395L)
    public static SubLObject pph_show_wXsentential_force(final SubLObject v_object, final SubLObject force, SubLObject paraphrase) {
        if (paraphrase == pph_proof.UNPROVIDED) {
            paraphrase = (SubLObject)pph_proof.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!paraphrase.isString()) {
            final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_proof.T, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject v_cycl_string = pph_main.generate_text_wXsentential_force(v_object, force, (SubLObject)pph_proof.$kw2$DEFAULT, (SubLObject)pph_proof.$kw2$DEFAULT, (SubLObject)pph_proof.$kw2$DEFAULT, pph_vars.$paraphrase_mode$.getDynamicValue(thread), (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject pred = thread.secondMultipleValue();
                    final SubLObject justification = thread.thirdMultipleValue();
                    final SubLObject output_list = thread.fourthMultipleValue();
                    final SubLObject demerits = thread.fifthMultipleValue();
                    final SubLObject v_pph_phrase = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_proof.NIL != subl_promotions.positive_integer_p(demerits) && pph_proof.NIL != misc_utilities.initialized_p(pph_vars.$pph_top_level_demerits$.getDynamicValue(thread))) {
                        Errors.warn((SubLObject)pph_proof.$str258$Generated__D_demerits_for__S, demerits, v_object);
                        pph_vars.$pph_top_level_demerits$.setDynamicValue(demerits, thread);
                    }
                    if (pph_proof.NIL != pph_vars.$pph_proof_include_phrase_linksP$.getDynamicValue(thread) && pph_proof.NIL != v_pph_phrase) {
                        return cb_utilities.cb_form(v_pph_phrase, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    }
                    paraphrase = v_cycl_string;
                }
                finally {
                    final SubLObject _prev_bind_0_$152 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$152, thread);
                    }
                }
            }
            finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
            }
        }
        if (paraphrase.isString()) {
            html_utilities.html_markup(paraphrase);
        }
        else {
            html_utilities.html_princ(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 94403L)
    public static SubLObject pph_templated_proofP(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != pph_proof.$pph_use_proof_templatesP$.getDynamicValue(thread) && pph_proof.NIL != pph_proof_template(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 94525L)
    public static SubLObject pph_proof_template(final SubLObject proof) {
        SubLObject template = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            template = pph_get_proof_template(proof);
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 94712L)
    public static SubLObject pph_get_proof_template(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_proof = removal_modules_inference_reflection.cycl_proof_decode(proof);
        SubLObject templates = (SubLObject)pph_proof.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_el_template_vars_during_queriesP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_el_template_vars_during_queriesP$.bind((SubLObject)pph_proof.NIL, thread);
            templates = pph_utilities.pph_ask_variable_new((SubLObject)pph_proof.$sym259$_TEMPLATE, (SubLObject)ConsesLow.list(pph_proof.$const260$justificationTemplateAppliesToPro, (SubLObject)pph_proof.$sym259$_TEMPLATE, cycl_proof), pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_proof.$list261);
        }
        finally {
            czer_vars.$canonicalize_el_template_vars_during_queriesP$.rebind(_prev_bind_0, thread);
        }
        return pph_choose_proof_template(proof, templates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 95135L)
    public static SubLObject pph_choose_proof_template(final SubLObject proof, final SubLObject templates) {
        return templates.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 95325L)
    public static SubLObject pph_show_templated_proof(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject nestedP) {
        if (nestedP == pph_proof.UNPROVIDED) {
            nestedP = (SubLObject)pph_proof.NIL;
        }
        final SubLObject template = pph_get_proof_template(proof);
        pph_show_proof_template_motivation(proof, template, mt, proof_index_string);
        pph_show_proof_template_body(proof, template, mt, proof_index_string);
        pph_show_proof_template_conclusion(proof, template, mt, proof_index_string, nestedP);
        pph_note_proof_displayed(proof);
        pph_note_proof_justified(proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 95795L)
    public static SubLObject pph_proof_template_var_name(final SubLObject var, final SubLObject template) {
        final SubLObject alist = (SubLObject)pph_proof.$list262;
        return list_utilities.alist_lookup(alist, var, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 96004L)
    public static SubLObject pph_show_proof_template_motivation(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        SubLObject list_var = (SubLObject)pph_proof.NIL;
        SubLObject constraint = (SubLObject)pph_proof.NIL;
        SubLObject i = (SubLObject)pph_proof.NIL;
        list_var = pph_proof_template_applicability_constraints(template);
        constraint = list_var.first();
        for (i = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), constraint = list_var.first(), i = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, i)) {
            html_utilities.html_newline((SubLObject)pph_proof.TWO_INTEGER);
            if (i.isZero()) {
                html_utilities.html_princ((SubLObject)pph_proof.$str263$Since_);
            }
            else {
                html_utilities.html_princ((SubLObject)pph_proof.$str264$and_since_);
            }
            final SubLObject subbed_constraint = bindings.apply_bindings(rule_bindings, constraint);
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_lists_min_level$.currentBinding(thread);
            try {
                pph_vars.$pph_use_bulleted_lists_min_level$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            pph_show_sentence(subbed_constraint, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            finally {
                pph_vars.$pph_use_bulleted_lists_min_level$.rebind(_prev_bind_0, thread);
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 96652L)
    public static SubLObject pph_proof_template_applicability_constraints(final SubLObject template) {
        return pph_utilities.pph_ask_variable_new((SubLObject)pph_proof.$sym265$_CONSTRAINT, (SubLObject)ConsesLow.listS(pph_proof.$const266$justificationTemplateApplicabilit, template, (SubLObject)pph_proof.$list267), pph_proof.$const146$InferencePSC, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 96875L)
    public static SubLObject pph_proof_template_has_preconditionsP(final SubLObject template) {
        return (SubLObject)pph_proof.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 96982L)
    public static SubLObject pph_proof_show_template(final SubLObject template) {
        final SubLObject template_name = (SubLObject)pph_proof.$str268$the_Henderson_Hasselbalch_equatio;
        html_utilities.html_princ(template_name);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 97198L)
    public static SubLObject pph_proof_template_show_precondition_proofs(final SubLObject template, final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        if (pph_proof.NIL != formula_pattern_match.formula_matches_pattern(pph_proof_el_formula(proof, mt), (SubLObject)pph_proof.$list269)) {
            pph_show_inference_proof(proof, mt, proof_index_string);
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject index_string = Sequences.cconcatenate(proof_index_string, (SubLObject)pph_proof.$str270$_sub);
            pph_proof_template_show_precondition_proofs(template, subproof, mt, index_string);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 97745L)
    public static SubLObject pph_show_proof_template_body(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLObject rule_gloss_templates = pph_utilities.pph_ask_variable_new((SubLObject)pph_proof.$sym271$_RULE_GLOSS_TEMPLATE, (SubLObject)ConsesLow.listS(pph_proof.$const272$justificationGenerationRuleGlossT, template, (SubLObject)pph_proof.$list273), pph_proof.$const146$InferencePSC, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject rule_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        SubLObject doneP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == doneP) {
            SubLObject csome_list_var = rule_gloss_templates;
            SubLObject phrase_naut = (SubLObject)pph_proof.NIL;
            phrase_naut = csome_list_var.first();
            while (pph_proof.NIL == doneP && pph_proof.NIL != csome_list_var) {
                final SubLObject subbed_phrase_naut = pph_utilities.pph_resolve_formula_arg_nauts(bindings.apply_bindings(rule_bindings, phrase_naut), (SubLObject)pph_proof.NIL);
                final SubLObject v_pph_phrase = pph_templates.pph_phrasify_phrase_naut(subbed_phrase_naut, (SubLObject)pph_proof.UNPROVIDED);
                pph_phrase_resolution.pph_phrase_get_string(v_pph_phrase, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                if (pph_proof.NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
                    html_utilities.html_princ((SubLObject)pph_proof.$str274$We_can_apply_the_rule__);
                    pph_show_sentence(subbed_phrase_naut, pph_phrase.pph_phrase_string(v_pph_phrase, (SubLObject)pph_proof.T), (SubLObject)pph_proof.NIL);
                    doneP = (SubLObject)pph_proof.T;
                }
                csome_list_var = csome_list_var.rest();
                phrase_naut = csome_list_var.first();
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 98664L)
    public static SubLObject pph_show_proof_template_variable_bindings(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        final SubLObject vars_to_show = pph_proof_template_vars_to_substitute(template);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            SubLObject cdolist_list_var = vars_to_show;
            SubLObject var = (SubLObject)pph_proof.NIL;
            var = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                html_utilities.html_newline((SubLObject)pph_proof.UNPROVIDED);
                final SubLObject variable_name = pph_proof_template_var_name(var, template);
                final SubLObject value = bindings.variable_lookup(var, all_bindings);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$kw275$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$kw276$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(variable_name);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$kw277$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$kw276$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_glyph((SubLObject)pph_proof.$kw278$NBSP, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)pph_proof.$str279$_);
                        html_utilities.html_glyph((SubLObject)pph_proof.$kw278$NBSP, (SubLObject)pph_proof.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$kw280$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$kw276$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        cb_utilities.cb_form(value, (SubLObject)pph_proof.ZERO_INTEGER, (SubLObject)pph_proof.T);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 99515L)
    public static SubLObject pph_proof_template_vars_to_substitute(final SubLObject template) {
        return (SubLObject)pph_proof.$list281;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 99651L)
    public static SubLObject pph_show_proof_template_conclusion(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string, final SubLObject nestedP) {
        final SubLObject proof_conclusion = pph_proof_conclusion(proof, mt);
        pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, nestedP, (SubLObject)pph_proof.NIL);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 104776L)
    public static SubLObject debug_construct_proof_views(final SubLObject problem_store_id, SubLObject inference_id, SubLObject inference_answer_id) {
        if (inference_id == pph_proof.UNPROVIDED) {
            inference_id = (SubLObject)pph_proof.ZERO_INTEGER;
        }
        if (inference_answer_id == pph_proof.UNPROVIDED) {
            inference_answer_id = (SubLObject)pph_proof.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_proof.NIL != Types.integerp(problem_store_id) : problem_store_id;
        assert pph_proof.NIL != Types.integerp(inference_id) : inference_id;
        assert pph_proof.NIL != Types.integerp(inference_answer_id) : inference_answer_id;
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, inference_answer_id);
        final SubLObject proofs = Sort.sort(inference_answer_get_proofs(inference_answer), Symbols.symbol_function((SubLObject)pph_proof.$sym23$_), (SubLObject)pph_proof.$sym283$INFERENCE_PROOF_GET_DEPTH);
        SubLObject proof_views = (SubLObject)pph_proof.NIL;
        html_utilities.html_markup((SubLObject)pph_proof.$str284$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (pph_proof.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str285$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == pph_proof.$kw286$UNINITIALIZED) ? ConsesLow.list(pph_proof.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            SubLObject cdolist_list_var = proofs;
            SubLObject proof = (SubLObject)pph_proof.NIL;
            proof = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                final SubLObject mt = pph_get_inference_mt(inference);
                final SubLObject v_proof_view = proof_view.construct_inference_proof_view(proof, inference_answer, mt);
                proof_views = (SubLObject)ConsesLow.cons(v_proof_view, proof_views);
                html_utilities.html_hr((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                cb_utilities.cb_form(v_proof_view, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_terpri((SubLObject)pph_proof.UNPROVIDED);
                show_proof_view(v_proof_view, (SubLObject)pph_proof.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        return proof_views;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 105954L)
    public static SubLObject show_proof_view(SubLObject v_proof_view, SubLObject debugP) {
        if (debugP == pph_proof.UNPROVIDED) {
            debugP = proof_view.proof_view_get_enable_debugP(v_proof_view);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != subl_promotions.non_negative_integer_p(v_proof_view)) {
            v_proof_view = proof_view.find_proof_view_by_id(v_proof_view);
        }
        assert pph_proof.NIL != proof_view.valid_proof_view_p(v_proof_view) : v_proof_view;
        final SubLObject local_state;
        final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(v_proof_view);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject v_class = (SubLObject)((pph_proof.NIL != debugP) ? pph_proof.$str288$pf_debug_proof_view : pph_proof.$str289$proof_view);
                html_script_utilities.html_popup_script();
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str290$body);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                if (pph_proof.NIL != v_class) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(v_class);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$161 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    proof_view_show_buttons(debugP);
                    if (pph_proof.NIL != debugP) {
                        show_proof_view_params(v_proof_view);
                    }
                    final SubLObject _prev_bind_0_$162 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                    try {
                        pph_vars.$pph_displayed_proofs$.bind((SubLObject)pph_proof.NIL, thread);
                        final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
                        final SubLObject children = proof_view.proof_view_entry_get_children(root_entry);
                        final SubLObject query = Sequences.find((SubLObject)pph_proof.$str291$Query_, children, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym292$PROOF_VIEW_ENTRY_GET_LABEL, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        SubLObject tab_entries = (SubLObject)pph_proof.NIL;
                        SubLObject cdolist_list_var = proof_view.$proof_view_tab_entry_labels$.getDynamicValue(thread);
                        SubLObject label = (SubLObject)pph_proof.NIL;
                        label = cdolist_list_var.first();
                        while (pph_proof.NIL != cdolist_list_var) {
                            final SubLObject entry = Sequences.find(label, children, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym292$PROOF_VIEW_ENTRY_GET_LABEL, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                            if (pph_proof.NIL != entry) {
                                tab_entries = (SubLObject)ConsesLow.cons(entry, tab_entries);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            label = cdolist_list_var.first();
                        }
                        if (pph_proof.NIL != query) {
                            show_proof_view_entry(query, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str293$justifications);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str294$yui_navset);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject error_output = proof_view.proof_view_get_error_output(v_proof_view);
                            final SubLObject show_error_outputP = string_utilities.non_empty_stringP(error_output);
                            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)pph_proof.$str295$yui_nav);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                final SubLObject favored_entry = list_utilities.find_if_not((SubLObject)pph_proof.$sym296$SUPPRESS_PROOF_VIEW_SECTION_WITH_ROOT_, tab_entries, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                SubLObject cdolist_list_var2 = tab_entries;
                                SubLObject tab_entry = (SubLObject)pph_proof.NIL;
                                tab_entry = cdolist_list_var2.first();
                                while (pph_proof.NIL != cdolist_list_var2) {
                                    if (pph_proof.NIL == proof_view_populator.suppress_proof_view_section_with_rootP(tab_entry)) {
                                        final SubLObject elt_href = Sequences.cconcatenate((SubLObject)pph_proof.$str297$_, proof_view_tab_id_for_entry(tab_entry));
                                        final SubLObject v_class_$165 = (SubLObject)(tab_entry.equal(favored_entry) ? pph_proof.$str298$selected : pph_proof.$str41$);
                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        if (pph_proof.NIL != v_class_$165) {
                                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                            html_utilities.html_markup(v_class_$165);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                            html_utilities.html_markup(elt_href);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), proof_view.proof_view_entry_get_label(tab_entry));
                                                html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$166, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$165, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                        proof_view_populator.proof_view_entry_remove_label(tab_entry);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    tab_entry = cdolist_list_var2.first();
                                }
                                if (pph_proof.NIL != show_error_outputP) {
                                    final SubLObject elt_href = Sequences.cconcatenate((SubLObject)pph_proof.$str297$_, (SubLObject)pph_proof.$str299$tabErrorOutput);
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup(elt_href);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$168 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                            html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str300$Debugging_Messages);
                                            html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$168, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)pph_proof.$str301$yui_content);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$169 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                SubLObject list_var = (SubLObject)pph_proof.NIL;
                                SubLObject tab_entry2 = (SubLObject)pph_proof.NIL;
                                SubLObject tab_num = (SubLObject)pph_proof.NIL;
                                list_var = tab_entries;
                                tab_entry2 = list_var.first();
                                for (tab_num = (SubLObject)pph_proof.ZERO_INTEGER; pph_proof.NIL != list_var; list_var = list_var.rest(), tab_entry2 = list_var.first(), tab_num = Numbers.add((SubLObject)pph_proof.ONE_INTEGER, tab_num)) {
                                    if (pph_proof.NIL == proof_view_populator.suppress_proof_view_section_with_rootP(tab_entry2)) {
                                        final SubLObject tab_id = proof_view_tab_id_for_entry(tab_entry2);
                                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (pph_proof.NIL != tab_id) {
                                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                            html_utilities.html_markup(tab_id);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$170 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                            show_proof_view_entry(tab_entry2, (SubLObject)pph_proof.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$170, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    }
                                }
                                if (pph_proof.NIL != show_error_outputP) {
                                    final SubLObject tab_id = (SubLObject)pph_proof.$str299$tabErrorOutput;
                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (pph_proof.NIL != tab_id) {
                                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup(tab_id);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        show_proof_view_error_output(error_output);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$171, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$169, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            SubLObject cdolist_list_var3 = children;
                            SubLObject child = (SubLObject)pph_proof.NIL;
                            child = cdolist_list_var3.first();
                            while (pph_proof.NIL != cdolist_list_var3) {
                                if (!query.eql(child) && pph_proof.NIL == subl_promotions.memberP(child, tab_entries, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == proof_view_populator.suppress_proof_view_section_with_rootP(child)) {
                                    show_proof_view_entry(child, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                child = cdolist_list_var3.first();
                            }
                            if (pph_proof.NIL != debugP) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)pph_proof.$str302$pfFilteredItems);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$172 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    show_proof_view_filtered_items(v_proof_view);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$172, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_0_$162, thread);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$161, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            }
            finally {
                final SubLObject _prev_bind_0_$173 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        proof_view.proof_view_set_displayed_universal_time(v_proof_view, (SubLObject)pph_proof.UNPROVIDED);
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 109033L)
    public static SubLObject proof_view_tab_id_for_entry_internal(final SubLObject entry) {
        final SubLObject label = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)pph_proof.$sym304$ALPHANUMERIC_CHAR_P), proof_view.proof_view_entry_get_label(entry), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        return Sequences.cconcatenate((SubLObject)pph_proof.$str305$tab, label);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 109033L)
    public static SubLObject proof_view_tab_id_for_entry(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return proof_view_tab_id_for_entry_internal(entry);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym303$PROOF_VIEW_TAB_ID_FOR_ENTRY, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym303$PROOF_VIEW_TAB_ID_FOR_ENTRY, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym303$PROOF_VIEW_TAB_ID_FOR_ENTRY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, entry, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(proof_view_tab_id_for_entry_internal(entry)));
            memoization_state.caching_state_put(caching_state, entry, results, (SubLObject)pph_proof.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 109250L)
    public static SubLObject show_proof_view_error_output(final SubLObject error_output) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_proof.NIL != Types.stringp(error_output) : error_output;
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind((SubLObject)pph_proof.T, thread);
            html_utilities.html_princ(error_output);
        }
        finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        return error_output;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 109408L)
    public static SubLObject proof_view_show_buttons(final SubLObject include_debugP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.$str307$pf_buttonbar);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str308$bd);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                if (pph_proof.NIL != include_debugP) {
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str309$pf_show_debugging);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str310$pf_show_debugging_checkbox);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str311$Debugging_);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str312$toggleDebug_this___body___);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        if (pph_proof.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str311$Debugging_);
                        html_utilities.html_indent((SubLObject)pph_proof.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str313$pf_show_cycl_button);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str314$pf_show_cycl_checkbox);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str315$show_cycl);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str316$toggleCycLVisible_this___body___);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    if (pph_proof.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str317$Show_CycL);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$177, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 110062L)
    public static SubLObject show_proof_view_params(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$179 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$179, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str318$pf_parameters);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$181 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$182 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)pph_proof.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            if (pph_proof.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$183 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str319$Parameters);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$183, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$182, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                        SubLObject cdolist_list_var = proof_view.proof_view_params(v_proof_view);
                        SubLObject cons = (SubLObject)pph_proof.NIL;
                        cons = cdolist_list_var.first();
                        while (pph_proof.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = cons;
                            SubLObject param = (SubLObject)pph_proof.NIL;
                            SubLObject value = (SubLObject)pph_proof.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list320);
                            param = current.first();
                            current = (value = current.rest());
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$184 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$str321$right));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$185 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    html_utilities.html_princ(param);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$185, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)pph_proof.$str322$left));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$186 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    cb_utilities.cb_form(value, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$186, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$184, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            cons = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$181, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$178, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 110580L)
    public static SubLObject show_proof_view_toc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$188, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$189 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str323$pf_toc);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$190 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$191 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            final SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (pph_proof.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$192 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str324$Quick_Links);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$192, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$191, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                        SubLObject cdolist_list_var = (SubLObject)pph_proof.$list326;
                        SubLObject cons = (SubLObject)pph_proof.NIL;
                        cons = cdolist_list_var.first();
                        while (pph_proof.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = cons;
                            SubLObject anchor = (SubLObject)pph_proof.NIL;
                            SubLObject linktext = (SubLObject)pph_proof.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list325);
                            anchor = current.first();
                            current = (linktext = current.rest());
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$193 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$194 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                    html_utilities.html_markup(anchor);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$195 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        html_utilities.html_princ(linktext);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$195, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$194, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$193, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            cons = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$190, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$189, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$187, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 111271L)
    public static SubLObject maybe_insert_proof_view_entry_anchor(final SubLObject proof_view_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject label = proof_view.proof_view_entry_get_label(proof_view_entry);
        SubLObject name = (SubLObject)pph_proof.NIL;
        if (label.equal((SubLObject)pph_proof.$str291$Query_)) {
            name = (SubLObject)pph_proof.$str327$query;
        }
        else if (label.equal((SubLObject)pph_proof.$str328$Root)) {
            name = (SubLObject)pph_proof.$str329$root;
        }
        else if (label.equal((SubLObject)pph_proof.$str330$Key_Rules_)) {
            name = (SubLObject)pph_proof.$str331$rules;
        }
        else if (label.equal((SubLObject)pph_proof.$str332$Because_)) {
            name = (SubLObject)pph_proof.$str333$because;
        }
        else if (label.equal((SubLObject)pph_proof.$str334$Detailed_Justification_)) {
            name = (SubLObject)pph_proof.$str335$details;
        }
        else if (label.equal((SubLObject)pph_proof.$str336$Linear_Justification_)) {
            name = (SubLObject)pph_proof.$str337$linear;
        }
        if (pph_proof.NIL != name) {
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            if (pph_proof.NIL != name) {
                html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(name);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 111888L)
    public static SubLObject show_proof_view_filtered_items_row(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym123$HTML_TABLE_ROW, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym124$HTML_FANCY_TABLE_DATA, (SubLObject)pph_proof.NIL, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$sym338$PPH_PROOF_INDENT, (SubLObject)ConsesLow.listS((SubLObject)pph_proof.$sym339$HTML_TABLE, (SubLObject)pph_proof.$list340, ConsesLow.append(body, (SubLObject)pph_proof.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 112069L)
    public static SubLObject show_proof_view_filtered_items(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filtered_items = proof_view.proof_view_get_filtered_items(v_proof_view);
        if (pph_proof.NIL != filtered_items && pph_proof.NIL == dictionary.dictionary_empty_p(filtered_items)) {
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str341$filtered);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$196 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$197 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$198 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$198, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)pph_proof.ONE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$201 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$202 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str342$Filtered_Supports);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$202, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$201, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$203 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$204 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$205 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$206 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$207 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$207, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$208 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                    html_utilities.html_markup((SubLObject)pph_proof.ONE_INTEGER);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$209 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(filtered_items)); pph_proof.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject reason = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject supports = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$210 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                final SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (pph_proof.NIL != bgcolor) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                    html_utilities.html_markup(bgcolor);
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                }
                                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                final SubLObject _prev_bind_0_$211 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str343$Reason___S, reason);
                                                                }
                                                                finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$211, thread);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$210, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$212 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                final SubLObject _prev_bind_0_$213 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                    html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                    html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                    final SubLObject _prev_bind_0_$214 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                        final SubLObject _prev_bind_0_$215 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                            html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                            final SubLObject _prev_bind_0_$216 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                            }
                                                                            finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$216, thread);
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                            final SubLObject _prev_bind_0_$217 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                                html_utilities.html_markup((SubLObject)pph_proof.ONE_INTEGER);
                                                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                                final SubLObject _prev_bind_0_$218 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                                    SubLObject cdolist_list_var = supports;
                                                                                    SubLObject support = (SubLObject)pph_proof.NIL;
                                                                                    support = cdolist_list_var.first();
                                                                                    while (pph_proof.NIL != cdolist_list_var) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                                        final SubLObject _prev_bind_0_$219 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                                                            final SubLObject _prev_bind_0_$220 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                                                                cb_utilities.cb_form(support, (SubLObject)pph_proof.ZERO_INTEGER, (SubLObject)pph_proof.T);
                                                                                            }
                                                                                            finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$220, thread);
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        }
                                                                                        finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$219, thread);
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                                        support = cdolist_list_var.first();
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$218, thread);
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                            }
                                                                            finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$217, thread);
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        }
                                                                        finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$215, thread);
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                                                    }
                                                                    finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$214, thread);
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                }
                                                                finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$213, thread);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$212, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$209, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$208, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$206, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$205, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$204, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$203, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$199, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$197, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$196, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 112890L)
    public static SubLObject cyc_proof_view_section_html(final SubLObject cyc_proof_view, final SubLObject section_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)pph_proof.NIL;
        try {
            thread.throwStack.push(pph_proof.$kw344$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)pph_proof.$sym345$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject v_proof_view = proof_view.find_proof_view_by_id(cycl_utilities.nat_arg1(cyc_proof_view, (SubLObject)pph_proof.UNPROVIDED));
                    SubLObject section_root = (SubLObject)pph_proof.NIL;
                    if (section_type.eql(pph_proof.$const346$CycProofViewSummarySection)) {
                        section_root = proof_view_summary.proof_view_get_summary_root(v_proof_view);
                    }
                    else if (section_type.eql(pph_proof.$const347$CycProofViewJustificationSection)) {
                        section_root = proof_view_populator.proof_view_get_justification_root_entry(v_proof_view);
                    }
                    else {
                        final SubLObject section_key = proof_view_populator.proof_view_section_key_from_id(section_type);
                        section_root = proof_view_populator.proof_view_get_special_section_root(v_proof_view, section_key);
                    }
                    if (pph_proof.NIL == v_proof_view || pph_proof.NIL == section_root) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return proof_view_section_html(section_root);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)pph_proof.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)pph_proof.$kw344$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 113697L)
    public static SubLObject proof_view_section_html(final SubLObject section_root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject html = (SubLObject)pph_proof.NIL;
        SubLObject stream = (SubLObject)pph_proof.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                show_proof_view_entry(section_root, (SubLObject)pph_proof.UNPROVIDED);
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            html = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)pph_proof.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 113929L)
    public static SubLObject show_proof_view_entry(final SubLObject proof_view_entry, SubLObject depth) {
        if (depth == pph_proof.UNPROVIDED) {
            depth = (SubLObject)pph_proof.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = proof_view.proof_view_entry_showers();
        SubLObject fn = (SubLObject)pph_proof.NIL;
        fn = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != Functions.funcall(fn, proof_view_entry, depth)) {
                if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str349$___S_handled_by__S__, proof_view_entry, fn, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                }
                return (SubLObject)pph_proof.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            fn = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = proof_view_summary.$proof_view_seen_entries$.currentBinding(thread);
        try {
            proof_view_summary.$proof_view_seen_entries$.bind((pph_proof.NIL != misc_utilities.initialized_p(proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread))) ? proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread) : set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), thread);
            if (pph_proof.NIL == proof_view_summary.$proof_view_track_seen_entriesP$.getDynamicValue(thread) || pph_proof.NIL != set.set_add(proof_view_entry, proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread))) {
                final SubLObject raw_html = proof_view.proof_view_entry_generate_html(proof_view_entry);
                final SubLObject html = fact_sheets.replace_fact_sheet_markups_fast(raw_html, (SubLObject)pph_proof.$sym350$DEBUG_PROOF_VIEW_CB_LINK_FOR_TERM, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject stepnum = proof_view.proof_view_entry_get_id(proof_view_entry);
                final SubLObject stepnum_name = Sequences.cconcatenate((SubLObject)pph_proof.$str351$pf_stepnum, format_nil.format_nil_a_no_copy(stepnum));
                maybe_insert_proof_view_entry_anchor(proof_view_entry);
                final SubLObject v_class = proof_view_entry_class(proof_view_entry);
                final SubLObject stuff_to_hideP = list_utilities.sublisp_boolean(proof_view.proof_view_entry_get_children(proof_view_entry));
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.$str129$pf_indent);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_markup((SubLObject)pph_proof.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$221 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str130$pf_indent_td);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            if (depth.numG((SubLObject)pph_proof.ZERO_INTEGER) && pph_proof.NIL != stuff_to_hideP) {
                                dhtml_macros.dhtml_switch_visibility_links_arrows(stepnum_name, (SubLObject)pph_proof.$str41$);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$223, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$224 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (pph_proof.NIL != v_class) {
                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                html_utilities.html_markup(v_class);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$225 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                if (pph_proof.NIL != string_utilities.non_empty_stringP(proof_view.proof_view_entry_get_label(proof_view_entry))) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$226 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)pph_proof.$str352$pf_steprow);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$227 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)pph_proof.$str353$pf_label);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$228 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str354$_A, proof_view.proof_view_entry_get_label(proof_view_entry));
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$228, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$227, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$226, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject _prev_bind_0_$229 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$230 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)pph_proof.$str355$pf_entry_content);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$231 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                            show_proof_view_entry_local_content(proof_view_entry, stepnum, html, depth);
                                            final SubLObject children = proof_view.proof_view_entry_get_children(proof_view_entry);
                                            final SubLObject visibility = proof_view_entry_initial_child_visibility(proof_view_entry, depth);
                                            if (pph_proof.NIL != children) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)pph_proof.$str356$pf_children);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$232 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$233 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                        dhtml_macros.dhtml_set_switched_visibility(stepnum_name, visibility, (SubLObject)pph_proof.$kw43$TEXT);
                                                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                        if (pph_proof.NIL != stepnum_name) {
                                                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                            html_utilities.html_markup(stepnum_name);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                                                        }
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$234 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                                            SubLObject cdolist_list_var2 = children;
                                                            SubLObject child = (SubLObject)pph_proof.NIL;
                                                            child = cdolist_list_var2.first();
                                                            while (pph_proof.NIL != cdolist_list_var2) {
                                                                show_proof_view_entry(child, Numbers.add(depth, (SubLObject)pph_proof.ONE_INTEGER));
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                child = cdolist_list_var2.first();
                                                            }
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$234, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$233, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$232, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$231, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$230, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$229, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$225, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$224, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$222, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$221, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            else if (pph_proof.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)pph_proof.T, (SubLObject)pph_proof.$str357$Already_seen__S, proof_view_entry, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            }
        }
        finally {
            proof_view_summary.$proof_view_seen_entries$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 116110L)
    public static SubLObject show_proof_view_entry_local_content(final SubLObject proof_view_entry, final SubLObject stepnum, final SubLObject html, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = proof_view.proof_view_entry_get_object(proof_view_entry);
        SubLObject object_type = proof_view.proof_view_entry_get_object_type(proof_view_entry);
        final SubLObject td_nowrapP = list_utilities.lengthLE(html_utilities.remove_html_tags(html, (SubLObject)pph_proof.UNPROVIDED), pph_proof.$proof_view_max_nowrap_line$.getGlobalValue(), (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL != v_object) {
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_markup((SubLObject)pph_proof.$str359$pf_paraphrase);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (pph_proof.NIL != td_nowrapP) {
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_0_$235 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str351$pf_stepnum);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$236 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str360$_4d_, stepnum);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$236, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_utilities.html_markup(html);
                    maybe_show_proof_view_entry_bug_report_link(proof_view_entry);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$235, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
            while (pph_proof.NIL != proof_view.proof_view_entry_p(v_object)) {
                object_type = proof_view.proof_view_entry_get_object_type(v_object);
                v_object = proof_view.proof_view_entry_get_object(v_object);
            }
            if (pph_proof.NIL != show_proof_view_object_typeP(object_type) && pph_proof.NIL != proof_view.proof_view_get_include_cycl_in_outputP(proof_view.proof_view_entry_get_proof_view(proof_view_entry))) {
                final SubLObject v_class = (SubLObject)((pph_proof.NIL != proof_view.proof_view_entry_p(v_object) || pph_proof.NIL != list_utilities.list_of_type_p((SubLObject)pph_proof.$sym361$PROOF_VIEW_ENTRY_P, v_object)) ? pph_proof.$str362$pf_object_pf_entry_struct : pph_proof.$str363$pf_object);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (pph_proof.NIL != v_class) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup(v_class);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_0_$237 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        show_proof_view_object(v_object, proof_view_entry, depth);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$237, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
            }
            if (pph_proof.NIL != proof_view.proof_view_get_enable_debugP(proof_view.proof_view_entry_get_proof_view(proof_view_entry))) {
                final SubLObject proof = proof_view.proof_view_entry_get_proof(proof_view_entry, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject fn = proof_view.proof_view_entry_get_function(proof_view_entry);
                final SubLObject fn_section = (SubLObject)((pph_proof.NIL != fn) ? proof_view.proof_view_entry_get_function_section(proof_view_entry) : pph_proof.NIL);
                if (pph_proof.NIL != proof) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str364$pf_proof);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$238 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str365$Proof__);
                            cb_utilities.cb_form(proof, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$238, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                }
                if (pph_proof.NIL != fn) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)pph_proof.$str366$pf_function);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                    SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject _prev_bind_0_$239 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str367$Function___S, fn);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$239, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                    if (pph_proof.NIL != fn_section) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)pph_proof.$str368$pf_function_section);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)pph_proof.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                        _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_proof.UNPROVIDED);
                            final SubLObject _prev_bind_0_$240 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)pph_proof.T, thread);
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)pph_proof.$str369$Section___S, fn_section);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$240, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)pph_proof.UNPROVIDED);
                    }
                }
            }
        }
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 118140L)
    public static SubLObject maybe_show_proof_view_entry_bug_report_link(final SubLObject proof_view_entry) {
        if (pph_proof.NIL != show_bug_report_link_for_proof_view_entryP(proof_view_entry)) {
            cb_proof_view.cb_link_proof_view_bug(proof_view_entry);
        }
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 118366L)
    public static SubLObject show_bug_report_link_for_proof_view_entryP(final SubLObject proof_view_entry) {
        if (pph_proof.NIL == proof_view.proof_view_get_show_cb_bug_report_linksP(proof_view.proof_view_entry_get_proof_view(proof_view_entry))) {
            return (SubLObject)pph_proof.NIL;
        }
        final SubLObject pcase_var = proof_view.proof_view_entry_get_object_type(proof_view_entry);
        if (pcase_var.eql((SubLObject)pph_proof.$kw370$QUERY_SENTENCE) || pcase_var.eql((SubLObject)pph_proof.$sym371$EL_TERM_P) || pcase_var.eql((SubLObject)pph_proof.$sym372$ASSERTION_P) || pcase_var.eql((SubLObject)pph_proof.$sym373$SUPPORT_P) || pcase_var.eql((SubLObject)pph_proof.$sym374$EL_SENTENCE_P) || pcase_var.eql((SubLObject)pph_proof.$kw375$PREMISE) || pcase_var.eql((SubLObject)pph_proof.$kw376$RULE) || pcase_var.eql((SubLObject)pph_proof.$kw377$CONCLUSION)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 118791L)
    public static SubLObject show_proof_view_object(final SubLObject v_object, final SubLObject entry, final SubLObject depth) {
        final SubLObject linksP = proof_view.proof_view_get_allow_internal_linksP(proof_view.proof_view_entry_get_proof_view(entry));
        if (pph_proof.NIL != linksP) {
            if (pph_proof.NIL != arguments.support_p(v_object)) {
                cb_assertion_browser.cb_show_support(v_object, (SubLObject)pph_proof.UNPROVIDED);
            }
            else {
                cb_utilities.cb_form(v_object, depth, (SubLObject)pph_proof.T);
            }
        }
        else {
            html_utilities.html_princ(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 119099L)
    public static SubLObject proof_view_entry_initial_child_visibility(final SubLObject proof_view_entry, final SubLObject depth) {
        return (SubLObject)((pph_proof.NIL != proof_view.proof_view_entry_expand_intiallyP(proof_view_entry)) ? pph_proof.$kw378$VISIBLE : pph_proof.$kw42$INVISIBLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 119293L)
    public static SubLObject proof_view_entry_class(final SubLObject entry) {
        final SubLObject pcase_var;
        final SubLObject object_type = pcase_var = proof_view.proof_view_entry_get_object_type(entry);
        if (pcase_var.eql((SubLObject)pph_proof.$kw379$SECTION_ROOT)) {
            return Sequences.cconcatenate((SubLObject)pph_proof.$str380$pf_entry_, proof_view_html_class(proof_view.proof_view_entry_get_label(entry)));
        }
        return Sequences.cconcatenate((SubLObject)pph_proof.$str380$pf_entry_, proof_view_html_class(object_type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 119652L)
    public static SubLObject proof_view_html_class(final SubLObject v_object) {
        return string_utilities.char_subst((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_space, Sequences.cconcatenate((SubLObject)pph_proof.$str381$pf_, Strings.string_downcase(list_utilities.remove_if_not((SubLObject)pph_proof.$sym304$ALPHANUMERIC_CHAR_P, print_high.princ_to_string(v_object), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 119846L)
    public static SubLObject show_proof_view_object_typeP(final SubLObject object_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == conses_high.member(object_type, (SubLObject)pph_proof.$list382, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 119990L)
    public static SubLObject debug_proof_view_cb_link_for_term(final SubLObject v_term, final SubLObject open_tag, final SubLObject link_tokens, final SubLObject close_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject link = (SubLObject)pph_proof.NIL;
        SubLObject tokenized = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != constant_handles.constant_p(v_term)) {
            SubLObject stream = (SubLObject)pph_proof.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_utilities.cb_link_constant(v_term, (SubLObject)pph_proof.$str41$, (SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                link = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)pph_proof.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            tokenized = xml_parsing_utilities.xml_string_tokenize(link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            return (SubLObject)ConsesLow.list(tokenized.first(), link_tokens, conses_high.second(tokenized));
        }
        if (pph_proof.NIL != nart_handles.nart_p(v_term)) {
            SubLObject stream = (SubLObject)pph_proof.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_utilities.cb_link_nart(v_term, (SubLObject)pph_proof.$str41$, (SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                link = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)pph_proof.UNPROVIDED);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            tokenized = xml_parsing_utilities.xml_string_tokenize(link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            return (SubLObject)ConsesLow.list(tokenized.first(), link_tokens, conses_high.second(tokenized));
        }
        if (pph_proof.NIL != cycl_grammar.cycl_nat_p(v_term)) {
            SubLObject stream = (SubLObject)pph_proof.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_utilities.cb_link_naut(v_term, (SubLObject)pph_proof.$str41$, (SubLObject)pph_proof.UNPROVIDED);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                link = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)pph_proof.UNPROVIDED);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
            tokenized = xml_parsing_utilities.xml_string_tokenize(link, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            return (SubLObject)ConsesLow.list(tokenized.first(), link_tokens, conses_high.second(tokenized));
        }
        return (SubLObject)ConsesLow.list(open_tag, link_tokens, close_tag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 120797L)
    public static SubLObject debug_proof_view_entry_label_color(final SubLObject proof_view_entry) {
        final SubLObject label = proof_view.proof_view_entry_get_label(proof_view_entry);
        if (label.equal((SubLObject)pph_proof.$str383$Inferred_)) {
            return html_macros.$html_color_lighter_green$.getGlobalValue();
        }
        if (label.equal((SubLObject)pph_proof.$str384$Asserted_)) {
            return html_macros.$html_color_lighter_yellow$.getGlobalValue();
        }
        if (label.equal((SubLObject)pph_proof.$str385$Opaque_)) {
            return html_macros.$html_color_lighter_grey$.getGlobalValue();
        }
        return html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 121212L)
    public static SubLObject pph_get_inference_mt(final SubLObject inference) {
        final SubLObject hl_mts = inference_datastructures_inference.inference_hl_mts(inference);
        final SubLObject mt = (pph_proof.NIL != list_utilities.singletonP(hl_mts)) ? hl_mts.first() : inference_datastructures_inference.inference_mt(inference);
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 121542L)
    public static SubLObject proof_of_inference_answer_p(final SubLObject proof, final SubLObject inference_answer) {
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = (SubLObject)pph_proof.NIL;
        justification = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$241 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
            SubLObject real_proof = (SubLObject)pph_proof.NIL;
            real_proof = cdolist_list_var_$241.first();
            while (pph_proof.NIL != cdolist_list_var_$241) {
                if (proof.eql(real_proof)) {
                    return (SubLObject)pph_proof.T;
                }
                cdolist_list_var_$241 = cdolist_list_var_$241.rest();
                real_proof = cdolist_list_var_$241.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 121876L)
    public static SubLObject support_cnf(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_cnf(support);
        }
        if (pph_proof.NIL != arguments.hl_support_p(support)) {
            return clausifier.cnf_clausal_form(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread)).first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 122249L)
    public static SubLObject hypothetical_mtP(final SubLObject mt) {
        return isa.isaP(mt, pph_proof.$const143$HypotheticalContext, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 122332L)
    public static SubLObject pph_proof_from_hypothesisP(final SubLObject proof, final SubLObject mt) {
        if (pph_proof.NIL == hypothetical_mtP(mt)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != pph_lookup_proof_p(proof)) {
            final SubLObject support = inference_datastructures_proof.proof_supports(proof).first();
            final SubLObject support_assertion = pph_find_assertion_for_support(support);
            final SubLObject proof_support_mt = (SubLObject)((pph_proof.NIL != assertion_handles.assertion_p(support_assertion)) ? assertions_high.assertion_mt(support_assertion) : pph_proof.NIL);
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != hlmt.hlmt_p(proof_support_mt) && pph_proof.NIL != pph_hypothesis_mt_for_mtP(proof_support_mt, mt));
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 122927L)
    public static SubLObject pph_hypothesized_supportP(final SubLObject support, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != assertion_handles.assertion_p(support) && (pph_proof.NIL != pph_assertion_references_hypothetical_term_p(support) || pph_proof.NIL != pph_hypothesis_mt_for_mtP(assertions_high.assertion_mt(support), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 123194L)
    public static SubLObject pph_assertion_references_hypothetical_term_p(final SubLObject as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypotheticalP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == hypotheticalP) {
            SubLObject csome_list_var = pph_vars.$pph_hypothetical_vars$.getDynamicValue(thread);
            SubLObject binding = (SubLObject)pph_proof.NIL;
            binding = csome_list_var.first();
            while (pph_proof.NIL == hypotheticalP && pph_proof.NIL != csome_list_var) {
                if (pph_proof.NIL != cycl_utilities.expression_find(bindings.variable_binding_value(binding), as, (SubLObject)pph_proof.T, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                    hypotheticalP = (SubLObject)pph_proof.T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return hypotheticalP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 123472L)
    public static SubLObject pph_hypothesis_mt_for_mtP(final SubLObject assertion_mt, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != hypothetical_mtP(assertion_mt) && pph_proof.NIL != genl_mts.genl_mtP(mt, assertion_mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 123712L)
    public static SubLObject pph_terminal_transformation_proof_p(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != inference_worker_transformation.transformation_proof_p(proof) && pph_proof.NIL == pph_proof_has_transformation_subproofs_p(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 123952L)
    public static SubLObject pph_proof_has_transformation_subproofs_p(final SubLObject proof) {
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != inference_worker_transformation.transformation_proof_p(subproof)) {
                return (SubLObject)pph_proof.T;
            }
            if (pph_proof.NIL != pph_proof_has_transformation_subproofs_p(subproof)) {
                return (SubLObject)pph_proof.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 124218L)
    public static SubLObject pph_find_subproofs_matching_asents(final SubLObject proof, final SubLObject mt, final SubLObject asents) {
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != subl_promotions.memberP(pph_proof_el_formula(proof, mt), asents, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED)) {
            ans = (SubLObject)ConsesLow.cons(proof, ans);
        }
        else {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)pph_proof.NIL;
            subproof = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                ans = ConsesLow.append(ans, pph_find_subproofs_matching_asents(subproof, mt, asents));
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return Sequences.delete_duplicates(ans, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 124656L)
    public static SubLObject pph_restrict_transformation_rule(final SubLObject rule_assertion, final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject restriction_subproofs = pph_restriction_subproofs_and_bindings(proof);
        final SubLObject restriction_bindings = thread.secondMultipleValue();
        final SubLObject non_hypothetical_bindingsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subbed_formula = pph_restrict_rule_via_subproofs(rule_assertion, restriction_subproofs, restriction_bindings, mt);
        return Values.values(subbed_formula, restriction_subproofs, non_hypothetical_bindingsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 125284L)
    public static SubLObject pph_restrict_rule_via_subproofs(final SubLObject rule_assertion, final SubLObject restriction_subproofs, final SubLObject restriction_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_cnf = el_utilities.copy_clause(assertions_high.assertion_cnf(rule_assertion));
        final SubLObject subbed_rule_cnf = bindings.apply_bindings(restriction_bindings, rule_cnf);
        final SubLObject de_toued_rule_cnf = pph_restricted_rule_resolve_tous(subbed_rule_cnf);
        SubLObject matched_neg_lits = (SubLObject)pph_proof.NIL;
        SubLObject subbed_formula = (SubLObject)pph_proof.NIL;
        SubLObject index_var = (SubLObject)pph_proof.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(de_toued_rule_cnf);
        SubLObject asent = (SubLObject)pph_proof.NIL;
        asent = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)pph_proof.$kw386$NEG;
            if (sense == pph_proof.$kw386$NEG) {
                SubLObject foundP = (SubLObject)pph_proof.NIL;
                if (pph_proof.NIL == foundP) {
                    SubLObject csome_list_var = restriction_subproofs;
                    SubLObject subproof = (SubLObject)pph_proof.NIL;
                    subproof = csome_list_var.first();
                    while (pph_proof.NIL == foundP && pph_proof.NIL != csome_list_var) {
                        if (pph_proof.NIL != pph_subproof_matches_asent_p(subproof, asent, mt)) {
                            matched_neg_lits = (SubLObject)ConsesLow.cons(asent, matched_neg_lits);
                            foundP = (SubLObject)pph_proof.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        subproof = csome_list_var.first();
                    }
                }
            }
            index_var = Numbers.add(index_var, (SubLObject)pph_proof.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        index_var = (SubLObject)pph_proof.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(de_toued_rule_cnf);
        asent = (SubLObject)pph_proof.NIL;
        asent = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)pph_proof.$kw387$POS;
            if (sense == pph_proof.$kw386$NEG) {
                SubLObject foundP = (SubLObject)pph_proof.NIL;
                if (pph_proof.NIL == foundP) {
                    SubLObject csome_list_var = restriction_subproofs;
                    SubLObject subproof = (SubLObject)pph_proof.NIL;
                    subproof = csome_list_var.first();
                    while (pph_proof.NIL == foundP && pph_proof.NIL != csome_list_var) {
                        if (pph_proof.NIL != pph_subproof_matches_asent_p(subproof, asent, mt)) {
                            matched_neg_lits = (SubLObject)ConsesLow.cons(asent, matched_neg_lits);
                            foundP = (SubLObject)pph_proof.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        subproof = csome_list_var.first();
                    }
                }
            }
            index_var = Numbers.add(index_var, (SubLObject)pph_proof.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            final SubLObject remaining_neg_lits = pph_remove_trivial_neg_lits(conses_high.set_difference(clauses.neg_lits(de_toued_rule_cnf), matched_neg_lits, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
            final SubLObject new_cnf = clauses.make_clause(remaining_neg_lits, clauses.pos_lits(de_toued_rule_cnf));
            final SubLObject el_vars = assertions_high.assertion_el_variables(rule_assertion);
            subbed_formula = uncanonicalizer.cnf_el_formula(new_cnf, assertions_high.assertion_mt(rule_assertion), el_vars);
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return subbed_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 126347L)
    public static SubLObject pph_remove_trivial_neg_lits(SubLObject neg_lits) {
        neg_lits = Sequences.remove_if((SubLObject)pph_proof.$sym388$PPH_TRIVIAL_NEG_LIT_, neg_lits, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        neg_lits = pph_remove_trivial_evaluatable_neg_lits(neg_lits);
        return neg_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 126553L)
    public static SubLObject pph_remove_trivial_evaluatable_neg_lits(final SubLObject neg_lits) {
        SubLObject cdolist_list_var;
        final SubLObject evaluate_lits = cdolist_list_var = list_utilities.find_all(pph_proof.$const389$evaluate, neg_lits, Symbols.symbol_function((SubLObject)pph_proof.EQ), (SubLObject)pph_proof.$sym390$ATOMIC_SENTENCE_PREDICATE);
        SubLObject evaluate_lit = (SubLObject)pph_proof.NIL;
        evaluate_lit = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(evaluate_lit, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject var = (SubLObject)pph_proof.NIL;
            SubLObject evaluatable_expression = (SubLObject)pph_proof.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list391);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list391);
            evaluatable_expression = current.first();
            current = current.rest();
            if (pph_proof.NIL == current) {
                final SubLObject other_lits = Sequences.remove(evaluate_lit, neg_lits, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject other_lits_subbed = conses_high.subst(evaluatable_expression, var, other_lits, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject trivials_out = pph_remove_trivial_neg_lits(other_lits_subbed);
                if (!other_lits_subbed.equal(trivials_out)) {
                    return trivials_out;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list391);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evaluate_lit = cdolist_list_var.first();
        }
        return neg_lits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 127140L)
    public static SubLObject pph_trivial_neg_litP(final SubLObject neg_lit, SubLObject domain_mt) {
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != variables.fully_bound_p(neg_lit) && (pph_proof.NIL != pph_irrelevant_formulaP(neg_lit, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) || pph_proof.NIL != pph_trivial_sentenceP(neg_lit, domain_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 127368L)
    public static SubLObject pph_restricted_rule_resolve_tous(final SubLObject subbed_rule_cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tou_bindings = (SubLObject)pph_proof.NIL;
        SubLObject found_a_touP = (SubLObject)pph_proof.NIL;
        SubLObject non_tou_neg_lits = (SubLObject)pph_proof.NIL;
        SubLObject index_var = (SubLObject)pph_proof.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(subbed_rule_cnf);
        SubLObject asent = (SubLObject)pph_proof.NIL;
        asent = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)pph_proof.$kw386$NEG;
            if (sense == pph_proof.$kw386$NEG) {
                if (cycl_utilities.atomic_sentence_predicate(asent).eql(pph_proof.$const392$termOfUnit) && pph_proof.NIL != nart_handles.nart_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)pph_proof.UNPROVIDED))) {
                    found_a_touP = (SubLObject)pph_proof.T;
                    thread.resetMultipleValues();
                    final SubLObject new_bindings = unification.unify(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)pph_proof.UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$242 = new_bindings;
                    SubLObject new_binding = (SubLObject)pph_proof.NIL;
                    new_binding = cdolist_list_var_$242.first();
                    while (pph_proof.NIL != cdolist_list_var_$242) {
                        tou_bindings = (SubLObject)ConsesLow.cons(new_binding, tou_bindings);
                        cdolist_list_var_$242 = cdolist_list_var_$242.rest();
                        new_binding = cdolist_list_var_$242.first();
                    }
                }
                else {
                    non_tou_neg_lits = (SubLObject)ConsesLow.cons(asent, non_tou_neg_lits);
                }
            }
            index_var = Numbers.add(index_var, (SubLObject)pph_proof.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        index_var = (SubLObject)pph_proof.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(subbed_rule_cnf);
        asent = (SubLObject)pph_proof.NIL;
        asent = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)pph_proof.$kw387$POS;
            if (sense == pph_proof.$kw386$NEG) {
                if (cycl_utilities.atomic_sentence_predicate(asent).eql(pph_proof.$const392$termOfUnit) && pph_proof.NIL != nart_handles.nart_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)pph_proof.UNPROVIDED))) {
                    found_a_touP = (SubLObject)pph_proof.T;
                    thread.resetMultipleValues();
                    final SubLObject new_bindings = unification.unify(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)pph_proof.UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$243 = new_bindings;
                    SubLObject new_binding = (SubLObject)pph_proof.NIL;
                    new_binding = cdolist_list_var_$243.first();
                    while (pph_proof.NIL != cdolist_list_var_$243) {
                        tou_bindings = (SubLObject)ConsesLow.cons(new_binding, tou_bindings);
                        cdolist_list_var_$243 = cdolist_list_var_$243.rest();
                        new_binding = cdolist_list_var_$243.first();
                    }
                }
                else {
                    non_tou_neg_lits = (SubLObject)ConsesLow.cons(asent, non_tou_neg_lits);
                }
            }
            index_var = Numbers.add(index_var, (SubLObject)pph_proof.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        if (pph_proof.NIL == found_a_touP) {
            return subbed_rule_cnf;
        }
        final SubLObject new_neg_lits = Sequences.nreverse(non_tou_neg_lits);
        final SubLObject stripped_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(subbed_rule_cnf));
        return bindings.apply_bindings(tou_bindings, stripped_cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 128241L)
    public static SubLObject pph_subproof_matches_asent_p(final SubLObject subproof, final SubLObject asent, final SubLObject mt) {
        return Equality.equal(asent, pph_proof_el_formula(subproof, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 128365L)
    public static SubLObject pph_restriction_subproofs_and_bindings(final SubLObject transformation_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject restriction_subproofs = pph_lookup_subproofs(transformation_proof);
        SubLObject non_base_hl_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rule_bindings = inference_worker_transformation.transformation_proof_rule_bindings(transformation_proof);
        final SubLObject hypotheticals = conses_high.intersection(rule_bindings, pph_vars.$pph_hypothetical_vars$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)pph_proof.EQL), Symbols.symbol_function((SubLObject)pph_proof.$sym393$CDR));
        final SubLObject non_hypothetical_bindingsP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != conses_high.set_difference(non_base_hl_bindings, hypotheticals, Symbols.symbol_function((SubLObject)pph_proof.EQL), Symbols.symbol_function((SubLObject)pph_proof.$sym393$CDR)));
        non_base_hl_bindings = ConsesLow.append(non_base_hl_bindings, hypotheticals);
        return Values.values(restriction_subproofs, unification.variable_base_inversion(non_base_hl_bindings), non_hypothetical_bindingsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 129111L)
    public static SubLObject pph_lookup_subproofs(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subproofs = (SubLObject)pph_proof.NIL;
        SubLObject v_bindings = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)pph_proof.NIL;
        subproof = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            final SubLObject variable_map = pph_subproof_to_proof_variable_map(proof, subproof);
            if (pph_proof.NIL != pph_lookup_proof_p(subproof)) {
                final SubLObject item_var = subproof;
                if (pph_proof.NIL == conses_high.member(item_var, subproofs, Symbols.symbol_function((SubLObject)pph_proof.EQL), Symbols.symbol_function((SubLObject)pph_proof.IDENTITY))) {
                    subproofs = (SubLObject)ConsesLow.cons(item_var, subproofs);
                }
                if (pph_proof.NIL != list_utilities.singletonP(inference_datastructures_proof.proof_direct_subproofs(proof))) {
                    SubLObject cdolist_list_var_$244 = bindings.apply_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
                    SubLObject binding = (SubLObject)pph_proof.NIL;
                    binding = cdolist_list_var_$244.first();
                    while (pph_proof.NIL != cdolist_list_var_$244) {
                        final SubLObject var = binding;
                        if (pph_proof.NIL != var) {
                            v_bindings = (SubLObject)ConsesLow.cons(var, v_bindings);
                        }
                        cdolist_list_var_$244 = cdolist_list_var_$244.rest();
                        binding = cdolist_list_var_$244.first();
                    }
                }
            }
            else if (pph_proof.NIL == inference_worker_transformation.transformation_proof_p(subproof)) {
                thread.resetMultipleValues();
                final SubLObject sub_subproofs = pph_lookup_subproofs(subproof);
                SubLObject sub_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sub_bindings = bindings.apply_bindings(variable_map, sub_bindings);
                SubLObject sub_subproof = (SubLObject)pph_proof.NIL;
                SubLObject sub_subproof_$245 = (SubLObject)pph_proof.NIL;
                SubLObject binding2 = (SubLObject)pph_proof.NIL;
                SubLObject binding_$246 = (SubLObject)pph_proof.NIL;
                sub_subproof = sub_subproofs;
                sub_subproof_$245 = sub_subproof.first();
                binding2 = sub_bindings;
                binding_$246 = binding2.first();
                while (pph_proof.NIL != binding2 || pph_proof.NIL != sub_subproof) {
                    final SubLObject item_var2 = sub_subproof_$245;
                    if (pph_proof.NIL == conses_high.member(item_var2, subproofs, Symbols.symbol_function((SubLObject)pph_proof.EQL), Symbols.symbol_function((SubLObject)pph_proof.IDENTITY))) {
                        subproofs = (SubLObject)ConsesLow.cons(item_var2, subproofs);
                    }
                    final SubLObject var2 = binding_$246;
                    if (pph_proof.NIL != var2) {
                        v_bindings = (SubLObject)ConsesLow.cons(var2, v_bindings);
                    }
                    sub_subproof = sub_subproof.rest();
                    sub_subproof_$245 = sub_subproof.first();
                    binding2 = binding2.rest();
                    binding_$246 = binding2.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return Values.values(list_utilities.remove_if_not((SubLObject)pph_proof.$sym10$PROOF_P, subproofs, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 130092L)
    public static SubLObject pph_subproof_to_proof_variable_map(final SubLObject proof, final SubLObject subproof) {
        final SubLObject link = inference_datastructures_proof.proof_link(proof);
        final SubLObject problem = inference_datastructures_proof.proof_supported_problem(subproof);
        SubLObject mapped_problem = (SubLObject)pph_proof.NIL;
        final SubLObject link_var = link;
        SubLObject rest;
        SubLObject supporting_mapped_problem;
        for (rest = (SubLObject)pph_proof.NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); pph_proof.NIL == mapped_problem && pph_proof.NIL != rest; rest = rest.rest()) {
            supporting_mapped_problem = rest.first();
            if (pph_proof.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)pph_proof.NIL, link_var, supporting_mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))) {
                mapped_problem = supporting_mapped_problem;
            }
        }
        return (SubLObject)((pph_proof.NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem)) ? inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem) : pph_proof.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 130682L)
    public static SubLObject pph_lookup_proof_p(final SubLObject proof) {
        if (pph_proof.NIL != inference_worker_removal.removal_proof_p(proof)) {
            final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
            if (pph_proof.NIL != list_utilities.singletonP(supports)) {
                final SubLObject assertion = pph_find_assertion_for_support(supports.first());
                return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != assertion_handles.assertion_p(assertion) && pph_proof.NIL != assertions_high.asserted_assertionP(assertion));
            }
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 131049L)
    public static SubLObject pph_proof_subproofs(final SubLObject proof) {
        final SubLObject subproofs = conses_high.copy_list(inference_datastructures_proof.proof_direct_subproofs(proof));
        final SubLObject explanatory_subproofs = conses_high.set_difference(subproofs, pph_non_explanatory_proofs(), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject sorted_subproofs = Sort.sort(explanatory_subproofs, Symbols.symbol_function((SubLObject)pph_proof.$sym23$_), (SubLObject)pph_proof.$sym394$PROOF_SUID);
        return sorted_subproofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 131422L)
    public static SubLObject pph_proof_conclusion_internal(final SubLObject proof, SubLObject mt) {
        if (mt == pph_proof.UNPROVIDED) {
            mt = proof_view.pph_proof_mt(proof);
        }
        final SubLObject el_formula = pph_proof_el_formula(proof, mt);
        final SubLObject isomorphic_assertion = (SubLObject)((pph_proof.NIL != check_for_isomorphic_assertionP(el_formula)) ? czer_meta.find_assertion_cycl(el_formula, mt) : pph_proof.NIL);
        if (pph_proof.NIL != isomorphic_assertion) {
            return isomorphic_assertion;
        }
        if (pph_proof.NIL == pph_proof_wX_isomorphic_support_p(proof)) {
            return el_formula;
        }
        final SubLObject support = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof)).first();
        if (pph_proof.NIL != pph_hypothesized_supportP(support, mt)) {
            return el_formula;
        }
        if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        return arguments.support_el_sentence(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 131422L)
    public static SubLObject pph_proof_conclusion(final SubLObject proof, SubLObject mt) {
        if (mt == pph_proof.UNPROVIDED) {
            mt = proof_view.pph_proof_mt(proof);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == v_memoization_state) {
            return pph_proof_conclusion_internal(proof, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_proof.$sym395$PPH_PROOF_CONCLUSION, (SubLObject)pph_proof.UNPROVIDED);
        if (pph_proof.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_proof.$sym395$PPH_PROOF_CONCLUSION, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.EQUAL, (SubLObject)pph_proof.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_proof.$sym395$PPH_PROOF_CONCLUSION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_proof.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_proof.NIL;
            collision = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_proof.NIL != cached_args && pph_proof.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_proof_conclusion_internal(proof, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(proof, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 132283L)
    public static SubLObject check_for_isomorphic_assertionP(final SubLObject el_formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != el_utilities.el_atomic_sentenceP(el_formula) && pph_proof.NIL == formula_too_complex_for_proof_paraphraseP(el_formula, (SubLObject)pph_proof.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 132462L)
    public static SubLObject formula_too_complex_for_proof_paraphraseP(final SubLObject el_formula, SubLObject depth) {
        if (depth == pph_proof.UNPROVIDED) {
            depth = (SubLObject)pph_proof.ZERO_INTEGER;
        }
        if (depth.numG((SubLObject)pph_proof.FIVE_INTEGER)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL == list_utilities.proper_list_p(el_formula)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != list_utilities.lengthG(el_formula, (SubLObject)pph_proof.TWELVE_INTEGER, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.T;
        }
        final SubLObject new_depth = number_utilities.f_1X(depth);
        SubLObject cdolist_list_var = el_formula;
        SubLObject v_term = (SubLObject)pph_proof.NIL;
        v_term = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != formula_too_complex_for_proof_paraphraseP(v_term, new_depth)) {
                return (SubLObject)pph_proof.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 132860L)
    public static SubLObject pph_proof_el_formula(final SubLObject proof, final SubLObject mt) {
        final SubLObject query_el_formula = inference_czer.contextualized_dnf_clauses_formula(inference_worker.proof_proven_query(proof), mt);
        return pph_sentence_replace_redundant_narts(query_el_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 133121L)
    public static SubLObject pph_proof_wX_isomorphic_support_p(final SubLObject proof) {
        final SubLObject proof_supports = inference_datastructures_proof.proof_supports(proof);
        if (pph_proof.NIL != list_utilities.singletonP(proof_supports) && pph_proof.NIL != inference_worker_removal.removal_proof_p(proof)) {
            final SubLObject support = proof_supports.first();
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != arguments.hl_support_p(support) || pph_proof.NIL != assertions_high.gaf_assertionP(support));
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 133537L)
    public static SubLObject pph_sub_isomorphic_assertions_into_supports(final SubLObject supports) {
        return transform_list_utilities.transform(supports, (SubLObject)pph_proof.$sym396$PPH_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_, (SubLObject)pph_proof.$sym397$PPH_FIND_ASSERTION_FOR_SUPPORT, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 133840L)
    public static SubLObject pph_hl_support_with_isomorphic_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((pph_proof.NIL != arguments.hl_support_p(v_object) || pph_proof.NIL != kb_hl_support_handles.kb_hl_support_p(v_object)) && pph_proof.NIL != pph_find_assertion_for_support(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 134126L)
    public static SubLObject pph_find_assertion_for_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (pph_proof.$kw113$ASSERTION == arguments.support_module(support)) {
            return fi.sentence_assertion(arguments.support_sentence(support), arguments.support_mt(support));
        }
        final SubLObject sentence = arguments.support_sentence(support);
        final SubLObject support_mt = arguments.support_mt(support);
        if (pph_proof.NIL == check_for_isomorphic_assertionP(sentence)) {
            return (SubLObject)pph_proof.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject cnfs = clausifier.clausal_form(sentence, support_mt, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return pph_find_assertion_from_cnfs(cnfs, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 134650L)
    public static SubLObject pph_find_assertion_from_cnfs(final SubLObject cnfs, final SubLObject mt) {
        SubLObject isomorphic_assertion = (SubLObject)pph_proof.NIL;
        if (!cnfs.isList()) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL == isomorphic_assertion) {
            SubLObject csome_list_var;
            SubLObject cnf;
            for (csome_list_var = cnfs, cnf = (SubLObject)pph_proof.NIL, cnf = csome_list_var.first(); pph_proof.NIL == isomorphic_assertion && pph_proof.NIL != csome_list_var; isomorphic_assertion = pph_find_assertion_from_cnf(cnf, mt), csome_list_var = csome_list_var.rest(), cnf = csome_list_var.first()) {}
        }
        return isomorphic_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 135006L)
    public static SubLObject pph_find_assertion_from_cnf(final SubLObject cnf, final SubLObject mt) {
        if (mt.eql(pph_proof.$const195$EverythingPSC) || mt.eql(pph_proof.$const146$InferencePSC)) {
            return kb_indexing.find_assertion_any_mt(cnf);
        }
        return kb_indexing.find_assertion_genl_mts(cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 135212L)
    public static SubLObject pph_assertion_support_tree(final SubLObject as, SubLObject supported_assertions) {
        if (supported_assertions == pph_proof.UNPROVIDED) {
            supported_assertions = set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        final SubLObject all_deductions = list_utilities.remove_if_not((SubLObject)pph_proof.$sym398$DEDUCTION_P, assertions_high.assertion_arguments(as), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject sorted_deductions = Sort.sort(all_deductions, (SubLObject)pph_proof.$sym399$EARLIER_DEDUCTION_P, (SubLObject)pph_proof.UNPROVIDED);
        SubLObject support_tree = (SubLObject)pph_proof.NIL;
        final SubLObject all_supported_assertions = set.copy_set(supported_assertions);
        set.set_add(as, all_supported_assertions);
        if (pph_proof.NIL == support_tree) {
            SubLObject csome_list_var = sorted_deductions;
            SubLObject deduction = (SubLObject)pph_proof.NIL;
            deduction = csome_list_var.first();
            while (pph_proof.NIL == support_tree && pph_proof.NIL != csome_list_var) {
                SubLObject support_trees = (SubLObject)pph_proof.NIL;
                final SubLObject deduction_supports = pph_sub_isomorphic_assertions_into_supports(deductions_high.deduction_supports(deduction));
                SubLObject circularP = (SubLObject)pph_proof.NIL;
                if (pph_proof.NIL == circularP) {
                    SubLObject csome_list_var_$247 = deduction_supports;
                    SubLObject deduction_support = (SubLObject)pph_proof.NIL;
                    deduction_support = csome_list_var_$247.first();
                    while (pph_proof.NIL == circularP && pph_proof.NIL != csome_list_var_$247) {
                        if (pph_proof.NIL != set_utilities.set_find(pph_support_sentence(deduction_support, (SubLObject)pph_proof.UNPROVIDED), all_supported_assertions, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym400$ASSERTION_FORMULA) && pph_proof.NIL != set_utilities.set_find(arguments.support_mt(deduction_support), all_supported_assertions, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym401$ASSERTION_MT)) {
                            circularP = (SubLObject)pph_proof.T;
                        }
                        else {
                            final SubLObject meta_support_tree = pph_meta_support_tree(deduction_support, all_supported_assertions);
                            if (pph_proof.NIL == meta_support_tree) {
                                circularP = (SubLObject)pph_proof.T;
                            }
                            else {
                                support_trees = (SubLObject)ConsesLow.cons(meta_support_tree, support_trees);
                            }
                        }
                        csome_list_var_$247 = csome_list_var_$247.rest();
                        deduction_support = csome_list_var_$247.first();
                    }
                }
                if (pph_proof.NIL == circularP) {
                    support_tree = (SubLObject)ConsesLow.cons(as, Sequences.nreverse(support_trees));
                }
                csome_list_var = csome_list_var.rest();
                deduction = csome_list_var.first();
            }
        }
        if (pph_proof.NIL != list_utilities.proper_list_p(support_tree)) {
            return support_tree;
        }
        if (pph_proof.NIL != assertions_high.asserted_assertionP(as)) {
            return (SubLObject)ConsesLow.list(as);
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 137218L)
    public static SubLObject pph_meta_support_tree(final SubLObject support, final SubLObject supported_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_support_tree = (SubLObject)pph_proof.NIL;
        final SubLObject _prev_bind_0 = pph_proof.$pph_meta_support_level$.currentBinding(thread);
        try {
            pph_proof.$pph_meta_support_level$.bind((SubLObject)(pph_proof.$pph_meta_support_level$.getDynamicValue(thread).isInteger() ? number_utilities.f_1X(pph_proof.$pph_meta_support_level$.getDynamicValue(thread)) : pph_proof.ONE_INTEGER), thread);
            if (!pph_proof.$pph_meta_support_level$.getDynamicValue(thread).numG(pph_proof.$pph_meta_support_max$.getGlobalValue())) {
                if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
                    meta_support_tree = pph_assertion_support_tree(support, supported_assertions);
                }
                else if (pph_proof.NIL != arguments.hl_support_p(support)) {
                    final SubLObject meta_supports = Sequences.remove(support, pph_meta_supports(support), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
                    meta_support_tree = pph_support_tree_from_supports(support, meta_supports, supported_assertions);
                }
            }
        }
        finally {
            pph_proof.$pph_meta_support_level$.rebind(_prev_bind_0, thread);
        }
        if (pph_proof.NIL != meta_support_tree && !pph_proof.assertionsDisabledInClass && pph_proof.NIL == pph_support_tree_p(meta_support_tree)) {
            throw new AssertionError(meta_support_tree);
        }
        return meta_support_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 138227L)
    public static SubLObject pph_support_tree_from_supports(final SubLObject supported, final SubLObject supports, SubLObject supported_assertions) {
        if (supported_assertions == pph_proof.UNPROVIDED) {
            supported_assertions = set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        SubLObject support_trees = (SubLObject)pph_proof.NIL;
        SubLObject circularP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == circularP) {
            SubLObject csome_list_var = supports;
            SubLObject support = (SubLObject)pph_proof.NIL;
            support = csome_list_var.first();
            while (pph_proof.NIL == circularP && pph_proof.NIL != csome_list_var) {
                if (pph_proof.NIL != set_utilities.set_find(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), supported_assertions, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.$sym400$ASSERTION_FORMULA)) {
                    circularP = (SubLObject)pph_proof.T;
                }
                else {
                    final SubLObject support_tree = pph_meta_support_tree(support, supported_assertions);
                    if (pph_proof.NIL == support_tree) {
                        circularP = (SubLObject)pph_proof.T;
                    }
                    else {
                        support_trees = (SubLObject)ConsesLow.cons(support_tree, support_trees);
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        if (pph_proof.NIL != circularP) {
            return (SubLObject)pph_proof.NIL;
        }
        final SubLObject support_tree2 = (SubLObject)ConsesLow.cons(supported, Sequences.nreverse(support_trees));
        assert pph_proof.NIL != pph_support_tree_p(support_tree2) : support_tree2;
        return support_tree2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 139020L)
    public static SubLObject pph_support_tree_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != list_utilities.proper_list_p(v_object) && pph_proof.NIL != arguments.support_p(pph_support_tree_supported(v_object)) && pph_proof.NIL != list_utilities.list_of_type_p((SubLObject)pph_proof.$sym402$PPH_SUPPORT_TREE_P, v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 139215L)
    public static SubLObject pph_support_tree_supported(final SubLObject support_tree) {
        return support_tree.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 139366L)
    public static SubLObject pph_support_tree_supporters(final SubLObject support_tree) {
        return support_tree.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 139541L)
    public static SubLObject pph_support_tree_sentence(final SubLObject support_tree) {
        SubLObject support = (SubLObject)pph_proof.NIL;
        SubLObject subnodes = (SubLObject)pph_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support_tree, support_tree, (SubLObject)pph_proof.$list403);
        support = support_tree.first();
        final SubLObject current = subnodes = support_tree.rest();
        return pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 139721L)
    public static SubLObject pph_assertion_supports(SubLObject as, SubLObject prefer_deduced_argumentsP, SubLObject circular_support_sentences) {
        if (prefer_deduced_argumentsP == pph_proof.UNPROVIDED) {
            prefer_deduced_argumentsP = (SubLObject)pph_proof.T;
        }
        if (circular_support_sentences == pph_proof.UNPROVIDED) {
            circular_support_sentences = set.new_set(Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
        }
        SubLObject supports = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != prefer_deduced_argumentsP || pph_proof.NIL == assertions_high.asserted_assertionP(as)) {
            final SubLObject maybe_better_assertion = pph_find_isomorphic_assertion_in_higher_mt(as, (SubLObject)pph_proof.NIL);
            if (pph_proof.NIL != assertion_handles.assertion_p(maybe_better_assertion)) {
                as = maybe_better_assertion;
            }
            final SubLObject all_deductions = list_utilities.remove_if_not((SubLObject)pph_proof.$sym398$DEDUCTION_P, assertions_high.assertion_arguments(as), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject dependent_assertions = assertions_interface.all_dependent_assertions(as);
            if (pph_proof.NIL == supports) {
                SubLObject csome_list_var = Sort.sort(all_deductions, (SubLObject)pph_proof.$sym404$PPH_PREFER_DEDUCTION_, (SubLObject)pph_proof.UNPROVIDED);
                SubLObject argument = (SubLObject)pph_proof.NIL;
                argument = csome_list_var.first();
                while (pph_proof.NIL == supports && pph_proof.NIL != csome_list_var) {
                    final SubLObject deduction_supports = pph_sub_isomorphic_assertions_into_supports(deductions_high.deduction_supports(argument));
                    SubLObject circularP = (SubLObject)pph_proof.NIL;
                    if (pph_proof.NIL == circularP) {
                        SubLObject csome_list_var_$248 = deduction_supports;
                        SubLObject deduction_support = (SubLObject)pph_proof.NIL;
                        deduction_support = csome_list_var_$248.first();
                        while (pph_proof.NIL == circularP && pph_proof.NIL != csome_list_var_$248) {
                            if (pph_proof.NIL != set.set_memberP(pph_support_sentence(deduction_support, (SubLObject)pph_proof.UNPROVIDED), circular_support_sentences) || pph_proof.NIL != subl_promotions.memberP(deduction_support, dependent_assertions, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                                circularP = (SubLObject)pph_proof.T;
                            }
                            csome_list_var_$248 = csome_list_var_$248.rest();
                            deduction_support = csome_list_var_$248.first();
                        }
                    }
                    if (pph_proof.NIL == circularP && pph_proof.NIL != Sequences.remove_if((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, deduction_supports, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                        supports = deduction_supports;
                    }
                    csome_list_var = csome_list_var.rest();
                    argument = csome_list_var.first();
                }
            }
        }
        if (pph_proof.NIL == supports) {
            supports = (SubLObject)ConsesLow.list(as);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 141184L)
    public static SubLObject pph_prefer_deductionP(final SubLObject d1, final SubLObject d2) {
        if (pph_proof.NIL != cycl_utilities.expression_find(pph_proof.$const196$rewriteOf, deductions_high.deduction_supports(d2), (SubLObject)pph_proof.$sym405$EXPRESSION_FIND, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == cycl_utilities.expression_find(pph_proof.$const196$rewriteOf, deductions_high.deduction_supports(d1), (SubLObject)pph_proof.$sym405$EXPRESSION_FIND, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != cycl_utilities.expression_find(pph_proof.$const196$rewriteOf, deductions_high.deduction_supports(d1), (SubLObject)pph_proof.$sym405$EXPRESSION_FIND, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == cycl_utilities.expression_find(pph_proof.$const196$rewriteOf, deductions_high.deduction_supports(d2), (SubLObject)pph_proof.$sym405$EXPRESSION_FIND, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != Sequences.find_if((SubLObject)pph_proof.$sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not((SubLObject)pph_proof.$sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d1), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == Sequences.find_if((SubLObject)pph_proof.$sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not((SubLObject)pph_proof.$sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d2), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.T;
        }
        if (pph_proof.NIL != Sequences.find_if((SubLObject)pph_proof.$sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not((SubLObject)pph_proof.$sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d2), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL == Sequences.find_if((SubLObject)pph_proof.$sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not((SubLObject)pph_proof.$sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d1), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != earlier_deduction_p(d1, d2)) {
            return (SubLObject)pph_proof.T;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 142264L)
    public static SubLObject pph_find_isomorphic_assertion_in_higher_mt(final SubLObject as, SubLObject allow_redundant_nart_equalityP) {
        if (allow_redundant_nart_equalityP == pph_proof.UNPROVIDED) {
            allow_redundant_nart_equalityP = (SubLObject)pph_proof.NIL;
        }
        SubLObject better_as = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != assertions_high.gaf_assertionP(as)) {
            final SubLObject as_formula = pph_support_sentence(as, allow_redundant_nart_equalityP);
            final SubLObject as_mt = assertions_high.assertion_mt(as);
            better_as = pph_gaf_with_formula_in_higher_mt(as_formula, as_mt, allow_redundant_nart_equalityP);
        }
        return better_as;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 142780L)
    public static SubLObject pph_gaf_with_formula_in_higher_mt(final SubLObject gaf_formula, final SubLObject mt, final SubLObject allow_redundant_nart_equalityP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject match = (SubLObject)pph_proof.NIL;
        SubLObject pred = (SubLObject)pph_proof.NIL;
        SubLObject arg1 = (SubLObject)pph_proof.NIL;
        SubLObject other_args = (SubLObject)pph_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(gaf_formula, gaf_formula, (SubLObject)pph_proof.$list407);
        pred = gaf_formula.first();
        SubLObject current = gaf_formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, gaf_formula, (SubLObject)pph_proof.$list407);
        arg1 = current.first();
        current = (other_args = current.rest());
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = pred;
            if (pph_proof.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, (SubLObject)pph_proof.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, (SubLObject)pph_proof.NIL, pred_var);
                SubLObject done_var = match;
                final SubLObject token_var = (SubLObject)pph_proof.NIL;
                while (pph_proof.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (pph_proof.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)pph_proof.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_proof.$kw197$GAF, (SubLObject)pph_proof.NIL, (SubLObject)pph_proof.NIL);
                            SubLObject done_var_$249 = match;
                            final SubLObject token_var_$250 = (SubLObject)pph_proof.NIL;
                            while (pph_proof.NIL == done_var_$249) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$250);
                                final SubLObject valid_$251 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$250.eql(gaf));
                                if (pph_proof.NIL != valid_$251 && pph_proof.NIL != pph_gaf_with_formula_in_not_lower_mtP(gaf, gaf_formula, mt, allow_redundant_nart_equalityP)) {
                                    final SubLObject even_match = pph_find_isomorphic_assertion_in_higher_mt(gaf, (SubLObject)pph_proof.UNPROVIDED);
                                    match = ((pph_proof.NIL != even_match) ? even_match : gaf);
                                }
                                done_var_$249 = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == valid_$251 || pph_proof.NIL != match);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$252 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (pph_proof.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$252, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == valid || pph_proof.NIL != match);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return match;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 143330L)
    public static SubLObject pph_gaf_with_formula_in_not_lower_mtP(final SubLObject gaf, final SubLObject gaf_formula, final SubLObject mt, final SubLObject allow_redundant_nart_equalityP) {
        final SubLObject matchP = (SubLObject)SubLObjectFactory.makeBoolean(!assertions_high.assertion_mt(gaf).eql(mt) && pph_support_sentence(gaf, allow_redundant_nart_equalityP).equal(gaf_formula) && pph_proof.NIL == genl_mts.genl_mtP(assertions_high.assertion_mt(gaf), mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
        return matchP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 143775L)
    public static SubLObject earlier_deduction_p(final SubLObject deduction1, final SubLObject deduction2) {
        return Numbers.numL(deduction_handles.deduction_id(deduction1), deduction_handles.deduction_id(deduction2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 144164L)
    public static SubLObject pph_meta_supports(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL != sksi_infrastructure_utilities.sksi_support_p(support)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return pph_meta_supports(kb_hl_supports_high.kb_hl_support_hl_support(support));
        }
        if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
            final SubLObject prefer_deduced_argumentsP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != pph_proof.$pph_prefer_deduced_meta_supportsP$.getDynamicValue(thread) || pph_proof.NIL != isa.isaP(hlmt.hlmt_monad_mt(hlmt.assertion_hlmt(support)), pph_proof.$const143$HypotheticalContext, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
            return pph_assertion_supports(support, prefer_deduced_argumentsP, (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != pph_not_isa_supportP(support)) {
            return pph_not_isa_supports(support);
        }
        if (arguments.support_module(support).eql((SubLObject)pph_proof.$kw408$DISJOINTWITH)) {
            return pph_supports_for_disjoint_support(support);
        }
        if (pph_proof.NIL != pph_isa_supportP(support)) {
            return pph_isa_supports(support);
        }
        if (pph_proof.NIL != pph_genls_supportP(support)) {
            return pph_genls_supports(support);
        }
        return pph_default_meta_supports(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 145164L)
    public static SubLObject pph_default_meta_supports(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_justify_result = hl_supports.hl_justify(support);
        final SubLObject support_module = arguments.support_module(support);
        SubLObject literals_to_suppress = (SubLObject)pph_proof.NIL;
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != arguments.supports_p(hl_justify_result)) {
            SubLObject cdolist_list_var = hl_justify_result;
            SubLObject meta_support = (SubLObject)pph_proof.NIL;
            meta_support = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                if (pph_proof.NIL != pph_always_show_meta_support_for_moduleP(meta_support, support_module)) {
                    ans = (SubLObject)ConsesLow.cons(meta_support, ans);
                }
                else if (pph_proof.NIL == pph_irrelevant_supportP(meta_support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons(meta_support, ans);
                }
                else if (pph_proof.NIL != assertions_high.rule_assertionP(meta_support)) {
                    literals_to_suppress = conses_high.union(literals_to_suppress, pph_rule_literals_to_suppress(meta_support, (SubLObject)pph_proof.UNPROVIDED), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
                }
                else if (pph_proof.$pph_meta_supports_depth$.getDynamicValue(thread).numL(pph_proof.$pph_meta_supports_max_depth$.getDynamicValue(thread)) && pph_proof.NIL == pph_support_trivialP(meta_support, (SubLObject)pph_proof.UNPROVIDED)) {
                    final SubLObject _prev_bind_0 = pph_proof.$pph_meta_supports_depth$.currentBinding(thread);
                    try {
                        pph_proof.$pph_meta_supports_depth$.bind(number_utilities.f_1X(pph_proof.$pph_meta_supports_depth$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var_$253 = pph_meta_supports(meta_support);
                        SubLObject meta_meta_support = (SubLObject)pph_proof.NIL;
                        meta_meta_support = cdolist_list_var_$253.first();
                        while (pph_proof.NIL != cdolist_list_var_$253) {
                            if (pph_proof.NIL == pph_irrelevant_supportP(meta_meta_support, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                                final SubLObject item_var = meta_meta_support;
                                if (pph_proof.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.$sym26$SUPPORT_SENTENCE))) {
                                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                }
                            }
                            else if (pph_proof.NIL != assertions_high.rule_assertionP(meta_meta_support)) {
                                literals_to_suppress = conses_high.union(literals_to_suppress, pph_rule_literals_to_suppress(meta_meta_support, (SubLObject)pph_proof.UNPROVIDED), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
                            }
                            cdolist_list_var_$253 = cdolist_list_var_$253.rest();
                            meta_meta_support = cdolist_list_var_$253.first();
                        }
                    }
                    finally {
                        pph_proof.$pph_meta_supports_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                meta_support = cdolist_list_var.first();
            }
            if (pph_proof.NIL != literals_to_suppress && pph_proof.NIL != ans) {
                ans = pph_prune_meta_supports(ans, literals_to_suppress);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 146601L)
    public static SubLObject pph_invalid_supportP(final SubLObject v_object) {
        if (pph_proof.NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_high.invalid_assertion(v_object, (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != arguments.hl_support_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == pph_hl_verify(v_object));
        }
        if (pph_proof.NIL == arguments.support_p(v_object)) {
            return (SubLObject)pph_proof.NIL;
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 146939L)
    public static SubLObject pph_hl_verify(final SubLObject hl_support) {
        SubLObject okP = hl_supports.hl_verify(hl_support);
        if (pph_proof.NIL == okP) {
            okP = pph_hl_verify_via_removal_ask(hl_support);
            if (pph_proof.NIL != okP) {
                Errors.warn((SubLObject)pph_proof.$str409$HL_VERIFY_failure_on_valid_suppor, hl_support);
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 147284L)
    public static SubLObject pph_hl_verify_via_removal_ask(final SubLObject hl_support) {
        final SubLObject v_properties = (SubLObject)pph_proof.$list410;
        final SubLObject mt = arguments.support_mt(hl_support);
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(arguments.support_sentence(hl_support), mt, v_properties));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 147611L)
    public static SubLObject pph_isa_supportP(final SubLObject support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.support_truth(support) == pph_proof.$kw198$TRUE && pph_proof.NIL != el_utilities.el_formula_with_operator_p(arguments.support_sentence(support), pph_proof.$const103$isa));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 147774L)
    public static SubLObject pph_genls_supportP(final SubLObject support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.support_truth(support) == pph_proof.$kw198$TRUE && pph_proof.NIL != el_utilities.el_formula_with_operator_p(arguments.support_sentence(support), pph_proof.$const220$genls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 147941L)
    public static SubLObject pph_genls_supports(final SubLObject support) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(arguments.support_sentence(support), (SubLObject)pph_proof.UNPROVIDED);
        SubLObject spec = (SubLObject)pph_proof.NIL;
        SubLObject genl = (SubLObject)pph_proof.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list411);
        spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list411);
        genl = current.first();
        current = current.rest();
        if (pph_proof.NIL == current) {
            final SubLObject support_mt = arguments.support_mt(support);
            final SubLObject highest_thcl = find_thcl_genls_between(spec, genl, support_mt, (SubLObject)pph_proof.$kw412$ASCENDING, (SubLObject)pph_proof.NIL);
            if (pph_proof.NIL != highest_thcl) {
                return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)pph_proof.$kw413$GENLS, el_utilities.make_binary_formula(pph_proof.$const220$genls, spec, highest_thcl), support_mt, (SubLObject)pph_proof.UNPROVIDED), arguments.make_hl_support((SubLObject)pph_proof.$kw413$GENLS, el_utilities.make_binary_formula(pph_proof.$const220$genls, highest_thcl, genl), support_mt, (SubLObject)pph_proof.UNPROVIDED));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list411);
        }
        return pph_default_meta_supports(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 148452L)
    public static SubLObject pph_isa_supports(final SubLObject isa_support) {
        final SubLObject raw_supports = (SubLObject)((pph_proof.NIL != arguments.support_p(isa_support) && pph_proof.NIL == assertion_handles.assertion_p(isa_support)) ? hl_supports.hl_justify(isa_support) : pph_proof.NIL);
        SubLObject abortP = list_utilities.lengthL(raw_supports, (SubLObject)pph_proof.THREE_INTEGER, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject focus_term = cycl_utilities.formula_arg1(pph_support_sentence(isa_support, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED);
        SubLObject curr_isa = (SubLObject)pph_proof.NIL;
        SubLObject curr_genl = (SubLObject)pph_proof.NIL;
        SubLObject new_supports = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == abortP) {
            SubLObject csome_list_var = raw_supports;
            SubLObject raw_support = (SubLObject)pph_proof.NIL;
            raw_support = csome_list_var.first();
            while (pph_proof.NIL == abortP && pph_proof.NIL != csome_list_var) {
                if (pph_proof.NIL == new_supports && (pph_proof.NIL == assertion_handles.assertion_p(raw_support) || pph_proof.NIL == pph_isa_supportP(raw_support) || !assertions_high.gaf_arg1(raw_support).equal(focus_term))) {
                    abortP = (SubLObject)pph_proof.T;
                }
                else if (pph_proof.NIL == new_supports) {
                    new_supports = (SubLObject)ConsesLow.cons(raw_support, new_supports);
                    curr_isa = assertions_high.gaf_arg2(raw_support);
                    curr_genl = assertions_high.gaf_arg2(raw_support);
                }
                else if (pph_proof.NIL != pph_genls_supportP(raw_support) && pph_proof.NIL != assertion_handles.assertion_p(raw_support) && assertions_high.gaf_arg1(raw_support).equal(curr_genl) && pph_proof.NIL == pph_utilities.pph_irrelevant_fort(assertions_high.gaf_arg2(raw_support), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                    curr_genl = assertions_high.gaf_arg2(raw_support);
                    if (pph_proof.NIL != pph_utilities.pph_irrelevant_fort(curr_isa, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                        curr_isa = curr_genl;
                        new_supports = (SubLObject)ConsesLow.list(arguments.make_hl_support(arguments.support_module(isa_support), el_utilities.replace_formula_arg((SubLObject)pph_proof.TWO_INTEGER, curr_isa, arguments.support_sentence(isa_support)), arguments.support_mt(isa_support), enumeration_types.tv_from_truth_strength(arguments.support_truth(isa_support), arguments.support_strength(isa_support))));
                    }
                }
                else {
                    abortP = (SubLObject)pph_proof.T;
                }
                csome_list_var = csome_list_var.rest();
                raw_support = csome_list_var.first();
            }
        }
        if (pph_proof.NIL != abortP || pph_proof.NIL == curr_genl || pph_proof.NIL == curr_isa || curr_genl.equal(curr_isa)) {
            return raw_supports;
        }
        final SubLObject genls_support_sentence = el_utilities.make_binary_formula(pph_proof.$const220$genls, curr_isa, curr_genl);
        final SubLObject new_genls_support = arguments.make_hl_support((SubLObject)pph_proof.$kw413$GENLS, genls_support_sentence, arguments.support_mt(isa_support), (SubLObject)pph_proof.UNPROVIDED);
        new_supports = (SubLObject)ConsesLow.cons(new_genls_support, new_supports);
        return Sequences.nreverse(new_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 150392L)
    public static SubLObject pph_not_isa_supportP(final SubLObject support) {
        final SubLObject sentence = arguments.support_sentence(support);
        final SubLObject pred = cycl_utilities.formula_operator(sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != subl_promotions.memberP(pred, (SubLObject)pph_proof.$list414, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED), pph_proof.$const103$isa));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 150653L)
    public static SubLObject pph_not_isa_supports(final SubLObject support) {
        final SubLObject isa_sentence = cycl_utilities.formula_arg1(pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject mt = arguments.support_mt(support);
        if (pph_proof.NIL != pph_isa_genls_type_violation_supportP(support)) {
            final SubLObject genls_sentence = el_utilities.make_el_formula(pph_proof.$const220$genls, cycl_utilities.formula_args(isa_sentence, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED);
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)pph_proof.$kw413$GENLS, genls_sentence, mt, (SubLObject)pph_proof.UNPROVIDED));
        }
        final SubLObject raw_supports = hl_supports.hl_justify(support);
        final SubLObject first_support = raw_supports.first();
        if (pph_proof.NIL != el_utilities.el_formula_with_operator_p(arguments.support_sentence(first_support), pph_proof.$const103$isa)) {
            final SubLObject not_isa_col = cycl_utilities.formula_arg2(isa_sentence, (SubLObject)pph_proof.UNPROVIDED);
            final SubLObject first_isa_col = cycl_utilities.formula_arg2(pph_support_sentence(first_support, (SubLObject)pph_proof.UNPROVIDED), (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != disjoint_with.collections_disjointP(not_isa_col, first_isa_col, mt)) {
                return (SubLObject)ConsesLow.list(first_support, arguments.make_hl_support((SubLObject)pph_proof.$kw408$DISJOINTWITH, el_utilities.make_binary_formula(pph_proof.$const415$disjointWith, first_isa_col, not_isa_col), mt, (SubLObject)pph_proof.UNPROVIDED));
            }
        }
        return raw_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 151558L)
    public static SubLObject pph_isa_genls_type_violation_supportP(final SubLObject support) {
        final SubLObject sentence = pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_operator(sentence);
        if (pph_proof.NIL != subl_promotions.memberP(pred, (SubLObject)pph_proof.$list414, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            final SubLObject core_sentence = cycl_utilities.formula_arg1(sentence, (SubLObject)pph_proof.UNPROVIDED);
            if (pph_proof.NIL != el_utilities.el_formula_with_operator_p(core_sentence, pph_proof.$const103$isa) && !cycl_utilities.formula_arg1(core_sentence, (SubLObject)pph_proof.UNPROVIDED).equal(cycl_utilities.formula_arg2(core_sentence, (SubLObject)pph_proof.UNPROVIDED))) {
                final SubLObject mt = arguments.support_mt(support);
                final SubLObject args = cycl_utilities.formula_args(core_sentence, (SubLObject)pph_proof.UNPROVIDED);
                return list_utilities.sublisp_boolean(backward.removal_ask(el_utilities.make_el_formula(pph_proof.$const220$genls, args, (SubLObject)pph_proof.UNPROVIDED), mt, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED));
            }
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 152255L)
    public static SubLObject pph_supports_for_disjoint_support(final SubLObject support) {
        final SubLObject sentence = pph_support_sentence(support, (SubLObject)pph_proof.UNPROVIDED);
        SubLObject supports = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != el_utilities.formula_arityE(sentence, (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(sentence, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject col1 = (SubLObject)pph_proof.NIL;
            SubLObject col2 = (SubLObject)pph_proof.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list416);
            col1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_proof.$list416);
            col2 = current.first();
            current = current.rest();
            if (pph_proof.NIL == current) {
                SubLObject doneP = (SubLObject)pph_proof.NIL;
                final SubLObject mt = arguments.support_mt(support);
                if (pph_proof.NIL == doneP) {
                    SubLObject csome_list_var = hl_supports.hl_justify(support);
                    SubLObject meta_support = (SubLObject)pph_proof.NIL;
                    meta_support = csome_list_var.first();
                    while (pph_proof.NIL == doneP && pph_proof.NIL != csome_list_var) {
                        if (pph_proof.$const415$disjointWith.eql(cycl_utilities.formula_arg0(arguments.support_sentence(meta_support)))) {
                            SubLObject current_$255;
                            final SubLObject datum_$254 = current_$255 = cycl_utilities.formula_args(arguments.support_sentence(meta_support), (SubLObject)pph_proof.UNPROVIDED);
                            SubLObject genl1 = (SubLObject)pph_proof.NIL;
                            SubLObject genl2 = (SubLObject)pph_proof.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$255, datum_$254, (SubLObject)pph_proof.$list417);
                            genl1 = current_$255.first();
                            current_$255 = current_$255.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$255, datum_$254, (SubLObject)pph_proof.$list417);
                            genl2 = current_$255.first();
                            current_$255 = current_$255.rest();
                            if (pph_proof.NIL == current_$255) {
                                if (pph_proof.NIL == genls.genlP(col1, genl1, mt, (SubLObject)pph_proof.UNPROVIDED)) {
                                    final SubLObject tmp = genl1;
                                    genl1 = genl2;
                                    genl2 = tmp;
                                }
                                final SubLObject thcl_genl1 = find_highest_thcl_genls_between(col1, genl1, mt, (SubLObject)pph_proof.UNPROVIDED);
                                final SubLObject thcl_genl2 = find_highest_thcl_genls_between(col2, genl2, mt, (SubLObject)pph_proof.UNPROVIDED);
                                if (thcl_genl1.eql(genl1) && thcl_genl2.eql(genl2)) {
                                    supports = (SubLObject)ConsesLow.cons(meta_support, supports);
                                }
                                else {
                                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)pph_proof.$kw408$DISJOINTWITH, el_utilities.make_binary_formula(pph_proof.$const415$disjointWith, thcl_genl1, thcl_genl2), mt, (SubLObject)pph_proof.UNPROVIDED), supports);
                                }
                                if (!col1.equal(thcl_genl1)) {
                                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)pph_proof.$kw413$GENLS, el_utilities.make_binary_formula(pph_proof.$const220$genls, col1, thcl_genl1), mt, (SubLObject)pph_proof.UNPROVIDED), supports);
                                }
                                if (!col2.equal(thcl_genl2)) {
                                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)pph_proof.$kw413$GENLS, el_utilities.make_binary_formula(pph_proof.$const220$genls, col2, thcl_genl2), mt, (SubLObject)pph_proof.UNPROVIDED), supports);
                                }
                                doneP = (SubLObject)pph_proof.T;
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$254, (SubLObject)pph_proof.$list417);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        meta_support = csome_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_proof.$list416);
            }
        }
        if (pph_proof.NIL == supports) {
            supports = hl_supports.hl_justify(support);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 153630L)
    public static SubLObject find_highest_thcl_genls_between(final SubLObject col, final SubLObject genl, final SubLObject mt, SubLObject inclusiveP) {
        if (inclusiveP == pph_proof.UNPROVIDED) {
            inclusiveP = (SubLObject)pph_proof.T;
        }
        return find_thcl_genls_between(col, genl, mt, (SubLObject)pph_proof.$kw418$DESCENDING, inclusiveP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 153788L)
    public static SubLObject find_thcl_genls_between(final SubLObject col, final SubLObject genl, final SubLObject mt, final SubLObject sort_direction, final SubLObject inclusiveP) {
        SubLObject sorted_genls = cardinality_estimates.sort_by_generality_estimate(genls.all_genls_wrt(col, genl, mt, (SubLObject)pph_proof.UNPROVIDED), sort_direction);
        if (pph_proof.NIL == inclusiveP) {
            sorted_genls = Sequences.delete(col, Sequences.delete(genl, sorted_genls, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED), Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        SubLObject cdolist_list_var = sorted_genls;
        SubLObject in_between = (SubLObject)pph_proof.NIL;
        in_between = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL != thcl.thcl_fortP(in_between, (SubLObject)pph_proof.UNPROVIDED)) {
                return in_between;
            }
            cdolist_list_var = cdolist_list_var.rest();
            in_between = cdolist_list_var.first();
        }
        cdolist_list_var = sorted_genls;
        in_between = (SubLObject)pph_proof.NIL;
        in_between = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            if (pph_proof.NIL == pph_utilities.pph_irrelevant_fort(in_between, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                return in_between;
            }
            cdolist_list_var = cdolist_list_var.rest();
            in_between = cdolist_list_var.first();
        }
        Errors.warn((SubLObject)pph_proof.$str419$No_THCL_or_non_irrelevant_collect, col, genl, mt);
        return genl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 154380L)
    public static SubLObject pph_weight_p(final SubLObject x) {
        return (SubLObject)SubLObjectFactory.makeBoolean(x.isDouble() && x.numLE((SubLObject)pph_proof.$float420$1_0) && pph_proof.ZERO_INTEGER.numLE(x));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 154586L)
    public static SubLObject pph_explain_inference_answer_with_proof(final SubLObject inference_answer, final SubLObject proof, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == pph_proof.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_proof.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_proof.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : inference_answer;
        assert pph_proof.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        if (pph_proof.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_proof.NIL == proof_of_inference_answer_p(proof, inference_answer)) {
            Errors.error((SubLObject)pph_proof.$str7$_S_is_not_a_proof_of__S, proof, inference_answer);
        }
        return pph_explain_inference_answer_with_proof_int(inference_answer, proof, language_mt, domain_mt, mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 155324L)
    public static SubLObject pph_explain_all_relevant_inference_answers(final SubLObject inference, SubLObject relevant_fn, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (relevant_fn == pph_proof.UNPROVIDED) {
            relevant_fn = Symbols.symbol_function((SubLObject)pph_proof.IDENTITY);
        }
        if (language_mt == pph_proof.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_proof.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)pph_proof.NIL;
        thread.resetMultipleValues();
        final SubLObject explanation_strings = pph_explain_all_inference_answers_for_best_proofs(inference, relevant_fn, language_mt, domain_mt, mode, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject sentences_used = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = explanation_strings;
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 155988L)
    public static SubLObject pph_explain_all_inference_answers_for_best_proofs(final SubLObject inference, SubLObject relevant_fn, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject interrupt_time_cutoff, SubLObject abort_time_cutoff) {
        if (relevant_fn == pph_proof.UNPROVIDED) {
            relevant_fn = Symbols.symbol_function((SubLObject)pph_proof.IDENTITY);
        }
        if (language_mt == pph_proof.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_proof.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        if (interrupt_time_cutoff == pph_proof.UNPROVIDED) {
            interrupt_time_cutoff = (SubLObject)pph_proof.NIL;
        }
        if (abort_time_cutoff == pph_proof.UNPROVIDED) {
            abort_time_cutoff = (SubLObject)pph_proof.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_proof.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        if (pph_proof.NIL != interrupt_time_cutoff && !pph_proof.assertionsDisabledInClass && pph_proof.NIL == Types.numberp(interrupt_time_cutoff)) {
            throw new AssertionError(interrupt_time_cutoff);
        }
        if (pph_proof.NIL != abort_time_cutoff && !pph_proof.assertionsDisabledInClass && pph_proof.NIL == Types.numberp(abort_time_cutoff)) {
            throw new AssertionError(abort_time_cutoff);
        }
        SubLObject explanation_strings = (SubLObject)pph_proof.NIL;
        SubLObject cycl_sentences_used = (SubLObject)pph_proof.NIL;
        SubLObject weights = (SubLObject)pph_proof.NIL;
        SubLObject problem_dictionaries = (SubLObject)pph_proof.NIL;
        SubLObject interruptedP = (SubLObject)pph_proof.NIL;
        SubLObject abortedP = (SubLObject)pph_proof.NIL;
        SubLObject consistent_stateP = (SubLObject)pph_proof.T;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)pph_proof.T, thread);
                SubLObject timer = (SubLObject)pph_proof.NIL;
                try {
                    final SubLObject _prev_bind_0_$256 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)pph_proof.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(abort_time_cutoff, tag);
                        final SubLObject _prev_bind_0_$257 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                        try {
                            pph_macros.$pph_timeout_time_check_count$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
                            pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(interrupt_time_cutoff), thread);
                            pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                            pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                            if (pph_proof.NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                final SubLObject _prev_bind_0_$258 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_proof.NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$259 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$260 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$261 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$262 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                        try {
                                                            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                                            if (pph_proof.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)pph_proof.$kw169$SKIP)) {
                                                                final SubLObject idx_$263 = idx;
                                                                if (pph_proof.NIL == id_index.id_index_dense_objects_empty_p(idx_$263, (SubLObject)pph_proof.$kw169$SKIP)) {
                                                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$263);
                                                                    final SubLObject backwardP_var = (SubLObject)pph_proof.NIL;
                                                                    SubLObject length;
                                                                    SubLObject v_iteration;
                                                                    SubLObject id;
                                                                    SubLObject inference_answer;
                                                                    SubLObject all_proofs;
                                                                    SubLObject best_proof;
                                                                    SubLObject _prev_bind_0_$263;
                                                                    SubLObject _prev_bind_1_$265;
                                                                    SubLObject explanation_string;
                                                                    SubLObject cycl_sentences;
                                                                    SubLObject weight;
                                                                    SubLObject problem_dictionary;
                                                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_proof.NIL, v_iteration = (SubLObject)pph_proof.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_proof.ONE_INTEGER)) {
                                                                        id = ((pph_proof.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_proof.ONE_INTEGER) : v_iteration);
                                                                        inference_answer = Vectors.aref(vector_var, id);
                                                                        if (pph_proof.NIL == id_index.id_index_tombstone_p(inference_answer) || pph_proof.NIL == id_index.id_index_skip_tombstones_p((SubLObject)pph_proof.$kw169$SKIP)) {
                                                                            if (pph_proof.NIL != id_index.id_index_tombstone_p(inference_answer)) {
                                                                                inference_answer = (SubLObject)pph_proof.$kw169$SKIP;
                                                                            }
                                                                            if (pph_proof.NIL != Functions.funcall(relevant_fn, inference_answer)) {
                                                                                all_proofs = inference_answer_get_proofs(inference_answer);
                                                                                best_proof = pph_find_best_proof(all_proofs);
                                                                                _prev_bind_0_$263 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                _prev_bind_1_$265 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind((SubLObject)pph_proof.TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    explanation_string = pph_explain_inference_answer_with_proof_int(inference_answer, best_proof, language_mt, domain_mt, mode);
                                                                                    cycl_sentences = thread.secondMultipleValue();
                                                                                    weight = thread.thirdMultipleValue();
                                                                                    problem_dictionary = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_proof.NIL == pph_inference_answer_explanation_okP(explanation_string, cycl_sentences, weight)) {
                                                                                        explanation_string = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if (pph_proof.NIL == string_utilities.non_empty_stringP(explanation_string) || pph_proof.NIL == subl_promotions.memberP(explanation_string, explanation_strings, Symbols.symbol_function((SubLObject)pph_proof.EQUALP), (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                        consistent_stateP = (SubLObject)pph_proof.NIL;
                                                                                        explanation_strings = (SubLObject)ConsesLow.cons(explanation_string, explanation_strings);
                                                                                        cycl_sentences_used = (SubLObject)ConsesLow.cons(cycl_sentences, cycl_sentences_used);
                                                                                        weights = (SubLObject)ConsesLow.cons(weight, weights);
                                                                                        problem_dictionaries = (SubLObject)ConsesLow.cons(problem_dictionary, problem_dictionaries);
                                                                                        consistent_stateP = (SubLObject)pph_proof.T;
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$265, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$263, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                final SubLObject idx_$264 = idx;
                                                                if (pph_proof.NIL == id_index.id_index_sparse_objects_empty_p(idx_$264)) {
                                                                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$264);
                                                                    SubLObject id2 = (SubLObject)pph_proof.NIL;
                                                                    SubLObject inference_answer2 = (SubLObject)pph_proof.NIL;
                                                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                                            id2 = Hashtables.getEntryKey(cdohash_entry);
                                                                            inference_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                                                            if (pph_proof.NIL != Functions.funcall(relevant_fn, inference_answer2)) {
                                                                                final SubLObject all_proofs2 = inference_answer_get_proofs(inference_answer2);
                                                                                final SubLObject best_proof2 = pph_find_best_proof(all_proofs2);
                                                                                final SubLObject _prev_bind_0_$264 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$266 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind((SubLObject)pph_proof.TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject explanation_string2 = pph_explain_inference_answer_with_proof_int(inference_answer2, best_proof2, language_mt, domain_mt, mode);
                                                                                    final SubLObject cycl_sentences2 = thread.secondMultipleValue();
                                                                                    final SubLObject weight2 = thread.thirdMultipleValue();
                                                                                    final SubLObject problem_dictionary2 = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_proof.NIL == pph_inference_answer_explanation_okP(explanation_string2, cycl_sentences2, weight2)) {
                                                                                        explanation_string2 = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if (pph_proof.NIL != string_utilities.non_empty_stringP(explanation_string2) && pph_proof.NIL != subl_promotions.memberP(explanation_string2, explanation_strings, Symbols.symbol_function((SubLObject)pph_proof.EQUALP), (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                        continue;
                                                                                    }
                                                                                    consistent_stateP = (SubLObject)pph_proof.NIL;
                                                                                    explanation_strings = (SubLObject)ConsesLow.cons(explanation_string2, explanation_strings);
                                                                                    cycl_sentences_used = (SubLObject)ConsesLow.cons(cycl_sentences2, cycl_sentences_used);
                                                                                    weights = (SubLObject)ConsesLow.cons(weight2, weights);
                                                                                    problem_dictionaries = (SubLObject)ConsesLow.cons(problem_dictionary2, problem_dictionaries);
                                                                                    consistent_stateP = (SubLObject)pph_proof.T;
                                                                                }
                                                                                finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$266, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$264, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$265 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$265, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$262, thread);
                                                    }
                                                }
                                                finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$261, thread);
                                                }
                                                if (new_or_reused == pph_proof.$kw423$NEW && pph_proof.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                            finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$260, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$266 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (pph_proof.NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$266, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$259, thread);
                                    }
                                }
                                finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$258, thread);
                                }
                            }
                            interruptedP = pph_macros.pph_timeout_time_reachedP();
                        }
                        finally {
                            pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
                            pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$257, thread);
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$256, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$267 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$267, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            abortedP = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (pph_proof.NIL == consistent_stateP) {
            final SubLObject min_length = Numbers.min(Sequences.length(explanation_strings), new SubLObject[] { Sequences.length(cycl_sentences_used), Sequences.length(weights), Sequences.length(problem_dictionaries) });
            final SubLObject max_length = Numbers.max(Sequences.length(explanation_strings), new SubLObject[] { Sequences.length(cycl_sentences_used), Sequences.length(weights), Sequences.length(problem_dictionaries) });
            if (!min_length.numE(max_length)) {
                explanation_strings = list_utilities.first_n(min_length, explanation_strings);
                cycl_sentences_used = list_utilities.first_n(min_length, cycl_sentences_used);
                weights = list_utilities.first_n(min_length, weights);
                problem_dictionaries = list_utilities.first_n(min_length, problem_dictionaries);
            }
        }
        final SubLObject timed_outP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != interruptedP || pph_proof.NIL != abortedP);
        return Values.values(explanation_strings, cycl_sentences_used, weights, problem_dictionaries, timed_outP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 159608L)
    public static SubLObject pph_inference_answer_explanation_okP(final SubLObject explanation_string, final SubLObject cycl_sentences, final SubLObject weight) {
        if (pph_proof.NIL == string_utilities.non_empty_stringP(explanation_string)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), explanation_string, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        return (SubLObject)pph_proof.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 159909L)
    public static SubLObject pph_explain_inference_answer_with_proof_int(final SubLObject inference_answer, final SubLObject proof, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject explanation_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject content_explained = (SubLObject)pph_proof.NIL;
        SubLObject problem_dictionary = (SubLObject)pph_proof.NIL;
        SubLObject explanation_weight = (SubLObject)pph_proof.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(proof), thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            final SubLObject explanation_contents = pph_inference_answer_explanation_contents(inference_answer, proof);
            if (pph_proof.NIL != explanation_contents) {
                final SubLObject _prev_bind_0_$272 = pph_vars.$pph_inference_answer$.currentBinding(thread);
                final SubLObject _prev_bind_1_$273 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
                final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
                final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
                try {
                    pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                    pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
                    pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)pph_proof.T, thread);
                    pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)pph_proof.UNPROVIDED), thread);
                    pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)pph_proof.T, thread);
                    pph_vars.$pph_repositioned_proofs$.bind((SubLObject)pph_proof.NIL, thread);
                    pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
                    pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
                    pph_vars.$pph_proof_depth$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
                    pph_vars.$pph_displayed_supports$.bind((SubLObject)pph_proof.NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                    final SubLObject html_target = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$273 = pph_vars.$constant_link_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$274 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$constant_link_function$.bind((pph_proof.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$html_generation_target$.bind((pph_proof.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                        problem_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_proof.EQL), (SubLObject)pph_proof.UNPROVIDED);
                        final SubLObject matrix_problem_dictionary = pph_vars.$pph_problem_reports$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$274 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$275 = pph_vars.$pph_problem_reports$.currentBinding(thread);
                        try {
                            pph_vars.$pph_problem_reporting_mode$.bind((SubLObject)((pph_proof.NIL != pph_vars.pph_problem_reporting_on_p()) ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : pph_proof.$kw424$QUIET), thread);
                            pph_vars.$pph_problem_reports$.bind(problem_dictionary, thread);
                            final SubLObject _prev_bind_0_$275 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$276 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$280 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                            try {
                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_proof.T, thread);
                                try {
                                    final SubLObject pph_sentences = Mapping.mapcar((SubLObject)pph_proof.$sym425$NEW_PPH_SENTENCE, explanation_contents);
                                    final SubLObject pph_paragraph = pph_document.new_pph_paragraph(inference_answer, pph_sentences);
                                    pph_document.pph_paragraph_generate(pph_paragraph, language_mt, domain_mt, mode);
                                    if (pph_proof.NIL != pph_document.pph_paragraph_doneP(pph_paragraph)) {
                                        SubLObject stream = (SubLObject)pph_proof.NIL;
                                        try {
                                            stream = streams_high.make_private_string_output_stream();
                                            pph_document.pph_paragraph_print(pph_paragraph, stream);
                                            explanation_string = streams_high.get_output_stream_string(stream);
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$276 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                streams_high.close(stream, (SubLObject)pph_proof.UNPROVIDED);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$276, thread);
                                            }
                                        }
                                        explanation_weight = pph_paragraph_demerits_to_weight(pph_paragraph);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$277 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        pph_macros.destroy_new_pph_phrases();
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$277, thread);
                                    }
                                }
                            }
                            finally {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_2_$280, thread);
                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$276, thread);
                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$275, thread);
                            }
                            if (pph_proof.NIL != dictionary.dictionary_p(matrix_problem_dictionary)) {
                                pph_phrase.pph_merge_problem_dictionary(pph_vars.$pph_problem_reports$.getDynamicValue(thread), matrix_problem_dictionary);
                            }
                        }
                        finally {
                            pph_vars.$pph_problem_reports$.rebind(_prev_bind_1_$275, thread);
                            pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$274, thread);
                        }
                        content_explained = explanation_contents;
                    }
                    finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_1_$274, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_0_$273, thread);
                    }
                }
                finally {
                    pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
                    pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
                    pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
                    pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
                    pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
                    pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
                    pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_1_$273, thread);
                    pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$272, thread);
                }
            }
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0, thread);
        }
        return Values.values(explanation_string, content_explained, explanation_weight, problem_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 161433L)
    public static SubLObject pph_paragraph_demerits_to_weight(final SubLObject pph_paragraph) {
        final SubLObject demerits = pph_document.pph_paragraph_demerits(pph_paragraph);
        return (SubLObject)(demerits.isZero() ? pph_proof.$float420$1_0 : Numbers.divide((SubLObject)pph_proof.$float420$1_0, demerits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 161629L)
    public static SubLObject pph_inference_answer_explanation_contents(final SubLObject inference_answer, final SubLObject proof) {
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject mt = pph_get_inference_mt(inference);
        final SubLObject proven_el_query_formula = pph_proof_el_formula(proof, mt);
        final SubLObject explanation_contents = (pph_proof.NIL != el_utilities.el_formula_with_operator_p(proven_el_query_formula, pph_proof.$const426$appropriateResponseContent)) ? pph_inference_answer_explanation_contents_for_appropriate_response_content(proven_el_query_formula, inference_datastructures_inference.inference_answer_bindings(inference_answer), mt, inference_datastructures_inference.inference_problem_store(inference)) : pph_inference_answer_explanation_contents_default(inference_answer, proof, proven_el_query_formula);
        return explanation_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 162443L)
    public static SubLObject best_support_sentence_nautP(final SubLObject v_object) {
        return el_utilities.el_formula_with_operator_p(v_object, pph_proof.$const427$BestSupportSentenceFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 162566L)
    public static SubLObject pph_inference_answer_explanation_contents_for_appropriate_response_content(final SubLObject proven_el_query_formula, final SubLObject v_bindings, final SubLObject mt, final SubLObject problem_store) {
        final SubLObject content = cycl_utilities.formula_arg2(proven_el_query_formula, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject use_support_sentenceP = best_support_sentence_nautP(content);
        final SubLObject content_sentence = (pph_proof.NIL != use_support_sentenceP) ? cycl_utilities.nat_arg1(content, (SubLObject)pph_proof.UNPROVIDED) : content;
        final SubLObject all_supports = pph_supports_for_appropriate_response_content_sentence(content_sentence, mt, problem_store);
        final SubLObject explanation_contents = (pph_proof.NIL != use_support_sentenceP) ? pph_inference_answer_explanation_contents_from_supports_and_bindings(all_supports, v_bindings, content_sentence) : pph_inference_answer_explanation_contents_from_supports(all_supports, v_bindings, (SubLObject)ConsesLow.list(content_sentence));
        return explanation_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 163600L)
    public static SubLObject pph_supports_for_appropriate_response_content_sentence(final SubLObject content_sentence, final SubLObject mt, final SubLObject problem_store) {
        if (pph_proof.NIL != el_utilities.possibly_inference_sentence_p(content_sentence)) {
            final SubLObject justified = ask_utilities.query_justified(content_sentence, mt, (SubLObject)ConsesLow.list((SubLObject)pph_proof.$kw428$MAX_NUMBER, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.$kw167$PROBLEM_STORE, problem_store));
            final SubLObject first_answer = justified.first();
            return list_utilities.remove_if_not((SubLObject)pph_proof.$sym373$SUPPORT_P, conses_high.second(first_answer), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        }
        if (pph_proof.NIL != assertion_handles.assertion_p(content_sentence)) {
            return pph_meta_supports(content_sentence);
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 164105L)
    public static SubLObject pph_inference_answer_explanation_contents_default(final SubLObject inference_answer, final SubLObject proof, final SubLObject proven_el_query_formula) {
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        final SubLObject justification = inference_answer_get_justification_with_proof(inference_answer, proof);
        final SubLObject all_supports = list_utilities.remove_if_not((SubLObject)pph_proof.$sym373$SUPPORT_P, inference_datastructures_inference.inference_answer_justification_supports(justification), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject explanation_contents = pph_inference_answer_explanation_contents_from_supports_and_bindings(all_supports, v_bindings, proven_el_query_formula);
        return explanation_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 164691L)
    public static SubLObject pph_inference_answer_explanation_contents_from_supports_and_bindings(final SubLObject all_supports, final SubLObject v_bindings, final SubLObject proven_sentence) {
        if (pph_proof.NIL != list_utilities.singletonP(v_bindings) && pph_proof.NIL != cycl_grammar.cycl_sentence_p(bindings.variable_binding_value(v_bindings.first()))) {
            return Mapping.mapcar((SubLObject)pph_proof.$sym429$VARIABLE_BINDING_VALUE, v_bindings);
        }
        final SubLObject good_supports = Sequences.remove_if((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, all_supports, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject meta_ized_supports = Sequences.delete_if((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_, pph_meta_ize_supports(good_supports), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        final SubLObject optimized = pph_maybe_optimize_answer_explanation_supports(meta_ized_supports, v_bindings, proven_sentence);
        return pph_inference_answer_explanation_contents_from_supports(optimized, v_bindings, (SubLObject)((pph_proof.NIL != pph_trivial_sentenceP(proven_sentence, (SubLObject)pph_proof.UNPROVIDED)) ? pph_proof.NIL : ConsesLow.list(proven_sentence)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 165507L)
    public static SubLObject pph_maybe_optimize_answer_explanation_supports(final SubLObject supports, final SubLObject v_bindings, final SubLObject proven_sentence) {
        if (pph_proof.NIL != pph_answer_explanation_supports_need_optimizingP(supports)) {
            return pph_optimize_answer_explanation_supports(supports, v_bindings, proven_sentence);
        }
        return Values.values(supports, (SubLObject)pph_proof.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 166039L)
    public static SubLObject pph_answer_explanation_supports_need_optimizingP(final SubLObject supports) {
        return list_utilities.lengthG(supports, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 166146L)
    public static SubLObject pph_optimize_answer_explanation_supports(final SubLObject supports, final SubLObject v_bindings, final SubLObject proven_sentence) {
        SubLObject optimized = supports;
        SubLObject reasons = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL != v_bindings) {
            SubLObject good = (SubLObject)pph_proof.NIL;
            SubLObject cdolist_list_var = optimized;
            SubLObject support = (SubLObject)pph_proof.NIL;
            support = cdolist_list_var.first();
            while (pph_proof.NIL != cdolist_list_var) {
                if (pph_proof.NIL != pph_support_mentions_bindingP(support, v_bindings)) {
                    good = (SubLObject)ConsesLow.cons(support, good);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            if (pph_proof.NIL != good && pph_proof.NIL == list_utilities.same_length_p(good, optimized)) {
                optimized = Sequences.nreverse(good);
                reasons = (SubLObject)ConsesLow.cons((SubLObject)pph_proof.$kw430$REMOVED_SUPPORTS_THAT_DONT_MENTION_BINDING_VALUES, reasons);
            }
            if (pph_proof.NIL == pph_answer_explanation_supports_need_optimizingP(optimized)) {
                return Values.values(optimized, reasons);
            }
        }
        final SubLObject proven_sentence_forts = cycl_utilities.expression_gather(proven_sentence, (SubLObject)pph_proof.$sym431$FORT_P, (SubLObject)pph_proof.T, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
        SubLObject good2 = (SubLObject)pph_proof.NIL;
        SubLObject good_fort_match_count = (SubLObject)pph_proof.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = optimized;
        SubLObject support2 = (SubLObject)pph_proof.NIL;
        support2 = cdolist_list_var2.first();
        while (pph_proof.NIL != cdolist_list_var2) {
            SubLObject this_fort_match_count = (SubLObject)pph_proof.ZERO_INTEGER;
            SubLObject cdolist_list_var_$283 = proven_sentence_forts;
            SubLObject this_fort = (SubLObject)pph_proof.NIL;
            this_fort = cdolist_list_var_$283.first();
            while (pph_proof.NIL != cdolist_list_var_$283) {
                if (pph_proof.NIL != cycl_utilities.expression_find(this_fort, support2, (SubLObject)pph_proof.T, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
                    this_fort_match_count = Numbers.add(this_fort_match_count, (SubLObject)pph_proof.ONE_INTEGER);
                }
                cdolist_list_var_$283 = cdolist_list_var_$283.rest();
                this_fort = cdolist_list_var_$283.first();
            }
            if (this_fort_match_count.numG(good_fort_match_count)) {
                good2 = (SubLObject)ConsesLow.list(support2);
                good_fort_match_count = this_fort_match_count;
            }
            else if (this_fort_match_count.numE(good_fort_match_count)) {
                good2 = (SubLObject)ConsesLow.cons(support2, good2);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            support2 = cdolist_list_var2.first();
        }
        if (pph_proof.NIL != good2 && pph_proof.NIL == list_utilities.same_length_p(good2, optimized)) {
            optimized = Sequences.nreverse(good2);
            reasons = (SubLObject)ConsesLow.cons((SubLObject)pph_proof.$kw432$USED_SUPPORTS_THAT_MENTION_MOST_PROVEN_SENTENCE_FORTS, reasons);
        }
        return Values.values(optimized, reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 167921L)
    public static SubLObject pph_support_mentions_bindingP(final SubLObject support, final SubLObject v_bindings) {
        SubLObject ans = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == ans) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = (SubLObject)pph_proof.NIL;
            binding = csome_list_var.first();
            while (pph_proof.NIL == ans && pph_proof.NIL != csome_list_var) {
                final SubLObject value = bindings.variable_binding_value(binding);
                ans = cycl_utilities.expression_find(value, support, (SubLObject)pph_proof.T, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED);
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 168169L)
    public static SubLObject pph_all_bindings_mentionedP(final SubLObject sentences, final SubLObject v_bindings) {
        SubLObject badP = (SubLObject)pph_proof.NIL;
        if (pph_proof.NIL == badP) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = (SubLObject)pph_proof.NIL;
            binding = csome_list_var.first();
            while (pph_proof.NIL == badP && pph_proof.NIL != csome_list_var) {
                final SubLObject value = bindings.variable_binding_value(binding);
                SubLObject okayP = best_support_sentence_nautP(value);
                if (pph_proof.NIL == okayP) {
                    SubLObject csome_list_var_$284;
                    SubLObject sentence;
                    for (csome_list_var_$284 = sentences, sentence = (SubLObject)pph_proof.NIL, sentence = csome_list_var_$284.first(); pph_proof.NIL == okayP && pph_proof.NIL != csome_list_var_$284; okayP = cycl_utilities.expression_find(value, sentence, (SubLObject)pph_proof.T, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), (SubLObject)pph_proof.UNPROVIDED), csome_list_var_$284 = csome_list_var_$284.rest(), sentence = csome_list_var_$284.first()) {}
                }
                badP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == okayP);
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 168545L)
    public static SubLObject pph_inference_answer_explanation_contents_from_supports(final SubLObject all_supports, final SubLObject v_bindings, final SubLObject default_explanation_contents) {
        final SubLObject good_support_sentences = pph_explanation_sentences_from_supports(all_supports);
        final SubLObject explanation_contents = (pph_proof.NIL != pph_good_explanation_contentsP(good_support_sentences, v_bindings)) ? good_support_sentences : default_explanation_contents;
        return explanation_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 168974L)
    public static SubLObject pph_good_explanation_contentsP(final SubLObject sentences, final SubLObject v_bindings) {
        if (pph_proof.NIL == sentences) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != list_utilities.lengthG(sentences, (SubLObject)pph_proof.ONE_INTEGER, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL == pph_all_bindings_mentionedP(sentences, v_bindings)) {
            return (SubLObject)pph_proof.NIL;
        }
        return (SubLObject)pph_proof.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 169455L)
    public static SubLObject pph_meta_ize_supports(final SubLObject supports) {
        SubLObject ans = (SubLObject)pph_proof.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)pph_proof.NIL;
        support = cdolist_list_var.first();
        while (pph_proof.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$285 = pph_terminal_meta_supports_from_tree(pph_meta_support_tree(support, set.new_set((SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)), (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED);
            SubLObject meta_support = (SubLObject)pph_proof.NIL;
            meta_support = cdolist_list_var_$285.first();
            while (pph_proof.NIL != cdolist_list_var_$285) {
                final SubLObject item_var = meta_support;
                if (pph_proof.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)pph_proof.EQUAL), Symbols.symbol_function((SubLObject)pph_proof.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
                cdolist_list_var_$285 = cdolist_list_var_$285.rest();
                meta_support = cdolist_list_var_$285.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 169849L)
    public static SubLObject pph_explanation_sentences_from_supports(final SubLObject supports) {
        return Mapping.mapcar((SubLObject)pph_proof.$sym433$PPH_EXPLANATION_SENTENCE_FROM_SUPPORT, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 170154L)
    public static SubLObject pph_explanation_sentence_from_support(final SubLObject support) {
        final SubLObject claims_pred = pph_proof.$const434$authorityClaims_Term;
        final SubLObject source = (SubLObject)((pph_proof.NIL != constant_handles.valid_constantP(claims_pred, (SubLObject)pph_proof.UNPROVIDED)) ? pph_explanation_source_for_support(support) : pph_proof.NIL);
        SubLObject sentence = support;
        if (pph_proof.NIL != arguments.hl_support_p(support)) {
            sentence = arguments.support_sentence(support);
        }
        if (pph_proof.NIL != cycl_grammar.cycl_represented_term_p(source)) {
            sentence = el_utilities.make_binary_formula(claims_pred, source, sentence);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 170610L)
    public static SubLObject pph_explanation_source_for_support(final SubLObject support) {
        if (pph_proof.NIL != assertion_handles.assertion_p(support)) {
            return sources.assertion_sources(support).first();
        }
        return (SubLObject)pph_proof.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 170763L)
    public static SubLObject pph_report_inference_answer(final SubLObject inference_answer, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == pph_proof.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_proof.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        assert pph_proof.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : inference_answer;
        return pph_report_inference_answer_int(inference_answer, language_mt, domain_mt, mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 171281L)
    public static SubLObject pph_report_all_relevant_inference_answers(final SubLObject inference, SubLObject relevant_fn, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject interrupt_time_cutoff, SubLObject abort_time_cutoff) {
        if (relevant_fn == pph_proof.UNPROVIDED) {
            relevant_fn = Symbols.symbol_function((SubLObject)pph_proof.IDENTITY);
        }
        if (language_mt == pph_proof.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_proof.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_proof.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        if (interrupt_time_cutoff == pph_proof.UNPROVIDED) {
            interrupt_time_cutoff = (SubLObject)pph_proof.NIL;
        }
        if (abort_time_cutoff == pph_proof.UNPROVIDED) {
            abort_time_cutoff = (SubLObject)pph_proof.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_proof.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        if (pph_proof.NIL != interrupt_time_cutoff && !pph_proof.assertionsDisabledInClass && pph_proof.NIL == Types.numberp(interrupt_time_cutoff)) {
            throw new AssertionError(interrupt_time_cutoff);
        }
        if (pph_proof.NIL != abort_time_cutoff && !pph_proof.assertionsDisabledInClass && pph_proof.NIL == Types.numberp(abort_time_cutoff)) {
            throw new AssertionError(abort_time_cutoff);
        }
        SubLObject report_strings = (SubLObject)pph_proof.NIL;
        SubLObject cycl_answers_used = (SubLObject)pph_proof.NIL;
        SubLObject weights = (SubLObject)pph_proof.NIL;
        SubLObject problem_dictionaries = (SubLObject)pph_proof.NIL;
        SubLObject interruptedP = (SubLObject)pph_proof.NIL;
        SubLObject abortedP = (SubLObject)pph_proof.NIL;
        SubLObject consistent_stateP = (SubLObject)pph_proof.T;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)pph_proof.T, thread);
                SubLObject timer = (SubLObject)pph_proof.NIL;
                try {
                    final SubLObject _prev_bind_0_$286 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)pph_proof.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(abort_time_cutoff, tag);
                        final SubLObject _prev_bind_0_$287 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                        try {
                            pph_macros.$pph_timeout_time_check_count$.bind((SubLObject)pph_proof.ZERO_INTEGER, thread);
                            pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(interrupt_time_cutoff), thread);
                            pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                            pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                            if (pph_proof.NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                final SubLObject _prev_bind_0_$288 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_proof.NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$289 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$290 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$291 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$292 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                        try {
                                                            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                                            if (pph_proof.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)pph_proof.$kw169$SKIP)) {
                                                                final SubLObject idx_$293 = idx;
                                                                if (pph_proof.NIL == id_index.id_index_dense_objects_empty_p(idx_$293, (SubLObject)pph_proof.$kw169$SKIP)) {
                                                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$293);
                                                                    final SubLObject backwardP_var = (SubLObject)pph_proof.NIL;
                                                                    SubLObject length;
                                                                    SubLObject v_iteration;
                                                                    SubLObject id;
                                                                    SubLObject inference_answer;
                                                                    SubLObject _prev_bind_0_$293;
                                                                    SubLObject _prev_bind_1_$295;
                                                                    SubLObject report_string;
                                                                    SubLObject cycl_answers;
                                                                    SubLObject weight;
                                                                    SubLObject problem_dictionary;
                                                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_proof.NIL, v_iteration = (SubLObject)pph_proof.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_proof.ONE_INTEGER)) {
                                                                        id = ((pph_proof.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_proof.ONE_INTEGER) : v_iteration);
                                                                        inference_answer = Vectors.aref(vector_var, id);
                                                                        if (pph_proof.NIL == id_index.id_index_tombstone_p(inference_answer) || pph_proof.NIL == id_index.id_index_skip_tombstones_p((SubLObject)pph_proof.$kw169$SKIP)) {
                                                                            if (pph_proof.NIL != id_index.id_index_tombstone_p(inference_answer)) {
                                                                                inference_answer = (SubLObject)pph_proof.$kw169$SKIP;
                                                                            }
                                                                            if (pph_proof.NIL != list_utilities.lengthL(inference_datastructures_inference.inference_answer_bindings(inference_answer), (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != Functions.funcall(relevant_fn, inference_answer)) {
                                                                                _prev_bind_0_$293 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                _prev_bind_1_$295 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind((SubLObject)pph_proof.TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    report_string = pph_report_inference_answer_int(inference_answer, language_mt, domain_mt, mode);
                                                                                    cycl_answers = thread.secondMultipleValue();
                                                                                    weight = thread.thirdMultipleValue();
                                                                                    problem_dictionary = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_proof.NIL == pph_inference_answer_report_okP(report_string, cycl_answers, weight)) {
                                                                                        report_string = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if (pph_proof.NIL == string_utilities.non_empty_stringP(report_string) || pph_proof.NIL == subl_promotions.memberP(report_string, report_strings, Symbols.symbol_function((SubLObject)pph_proof.EQUALP), (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                        consistent_stateP = (SubLObject)pph_proof.NIL;
                                                                                        report_strings = (SubLObject)ConsesLow.cons(report_string, report_strings);
                                                                                        cycl_answers_used = (SubLObject)ConsesLow.cons(cycl_answers, cycl_answers_used);
                                                                                        weights = (SubLObject)ConsesLow.cons(weight, weights);
                                                                                        problem_dictionaries = (SubLObject)ConsesLow.cons(problem_dictionary, problem_dictionaries);
                                                                                        consistent_stateP = (SubLObject)pph_proof.T;
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$295, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$293, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                final SubLObject idx_$294 = idx;
                                                                if (pph_proof.NIL == id_index.id_index_sparse_objects_empty_p(idx_$294)) {
                                                                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$294);
                                                                    SubLObject id2 = (SubLObject)pph_proof.NIL;
                                                                    SubLObject inference_answer2 = (SubLObject)pph_proof.NIL;
                                                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                                            id2 = Hashtables.getEntryKey(cdohash_entry);
                                                                            inference_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                                                            if (pph_proof.NIL != list_utilities.lengthL(inference_datastructures_inference.inference_answer_bindings(inference_answer2), (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.UNPROVIDED) && pph_proof.NIL != Functions.funcall(relevant_fn, inference_answer2)) {
                                                                                final SubLObject _prev_bind_0_$294 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$296 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind((SubLObject)pph_proof.TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject report_string2 = pph_report_inference_answer_int(inference_answer2, language_mt, domain_mt, mode);
                                                                                    final SubLObject cycl_answers2 = thread.secondMultipleValue();
                                                                                    final SubLObject weight2 = thread.thirdMultipleValue();
                                                                                    final SubLObject problem_dictionary2 = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_proof.NIL == pph_inference_answer_report_okP(report_string2, cycl_answers2, weight2)) {
                                                                                        report_string2 = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if (pph_proof.NIL != string_utilities.non_empty_stringP(report_string2) && pph_proof.NIL != subl_promotions.memberP(report_string2, report_strings, Symbols.symbol_function((SubLObject)pph_proof.EQUALP), (SubLObject)pph_proof.UNPROVIDED)) {
                                                                                        continue;
                                                                                    }
                                                                                    consistent_stateP = (SubLObject)pph_proof.NIL;
                                                                                    report_strings = (SubLObject)ConsesLow.cons(report_string2, report_strings);
                                                                                    cycl_answers_used = (SubLObject)ConsesLow.cons(cycl_answers2, cycl_answers_used);
                                                                                    weights = (SubLObject)ConsesLow.cons(weight2, weights);
                                                                                    problem_dictionaries = (SubLObject)ConsesLow.cons(problem_dictionary2, problem_dictionaries);
                                                                                    consistent_stateP = (SubLObject)pph_proof.T;
                                                                                }
                                                                                finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$296, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$294, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$295 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$295, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$292, thread);
                                                    }
                                                }
                                                finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$291, thread);
                                                }
                                                if (new_or_reused == pph_proof.$kw423$NEW && pph_proof.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                            finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$290, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$296 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (pph_proof.NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$289, thread);
                                    }
                                }
                                finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$288, thread);
                                }
                            }
                            interruptedP = pph_macros.pph_timeout_time_reachedP();
                        }
                        finally {
                            pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
                            pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$287, thread);
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$286, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$297 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_proof.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$297, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            abortedP = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (pph_proof.NIL == consistent_stateP) {
            final SubLObject min_length = Numbers.min(Sequences.length(report_strings), new SubLObject[] { Sequences.length(cycl_answers_used), Sequences.length(weights), Sequences.length(problem_dictionaries) });
            final SubLObject max_length = Numbers.max(Sequences.length(report_strings), new SubLObject[] { Sequences.length(cycl_answers_used), Sequences.length(weights), Sequences.length(problem_dictionaries) });
            if (!min_length.numE(max_length)) {
                report_strings = list_utilities.first_n(min_length, report_strings);
                cycl_answers_used = list_utilities.first_n(min_length, cycl_answers_used);
                weights = list_utilities.first_n(min_length, weights);
                problem_dictionaries = list_utilities.first_n(min_length, problem_dictionaries);
            }
        }
        final SubLObject timed_outP = (SubLObject)SubLObjectFactory.makeBoolean(pph_proof.NIL != interruptedP || pph_proof.NIL != abortedP);
        return Values.values(report_strings, cycl_answers_used, weights, problem_dictionaries, timed_outP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 174437L)
    public static SubLObject pph_report_inference_answer_int(final SubLObject inference_answer, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_proof.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_proof.NIL == list_utilities.lengthL(inference_datastructures_inference.inference_answer_bindings(inference_answer), (SubLObject)pph_proof.TWO_INTEGER, (SubLObject)pph_proof.UNPROVIDED)) {
            Errors.error((SubLObject)pph_proof.$str435$_S___has_too_many_bindings__no_mo, inference_answer);
        }
        SubLObject report_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject answer_reported = (SubLObject)pph_proof.NIL;
        SubLObject problem_dictionary = (SubLObject)pph_proof.NIL;
        SubLObject report_weight = (SubLObject)pph_proof.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            final SubLObject report_answer = pph_inference_answer_report_answer(inference_answer);
            final SubLObject force = (SubLObject)pph_proof.$kw3$DECLARATIVE;
            if (pph_proof.NIL != report_answer) {
                problem_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_proof.EQL), (SubLObject)pph_proof.UNPROVIDED);
                final SubLObject matrix_problem_dictionary = pph_vars.$pph_problem_reports$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$302 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_problem_reports$.currentBinding(thread);
                try {
                    pph_vars.$pph_problem_reporting_mode$.bind((SubLObject)((pph_proof.NIL != pph_vars.pph_problem_reporting_on_p()) ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : pph_proof.$kw424$QUIET), thread);
                    pph_vars.$pph_problem_reports$.bind(problem_dictionary, thread);
                    report_string = pph_main.generate_text_wXsentential_force(report_answer, force, (SubLObject)pph_proof.$kw2$DEFAULT, language_mt, domain_mt, mode, (SubLObject)pph_proof.UNPROVIDED);
                    if (pph_proof.NIL != dictionary.dictionary_p(matrix_problem_dictionary)) {
                        pph_phrase.pph_merge_problem_dictionary(pph_vars.$pph_problem_reports$.getDynamicValue(thread), matrix_problem_dictionary);
                    }
                }
                finally {
                    pph_vars.$pph_problem_reports$.rebind(_prev_bind_2, thread);
                    pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$302, thread);
                }
                answer_reported = report_answer;
                report_weight = (SubLObject)((pph_proof.NIL != report_string) ? pph_weight_from_problem_dictionary(problem_dictionary) : pph_proof.ZERO_INTEGER);
            }
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(report_string, answer_reported, report_weight, problem_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 175650L)
    public static SubLObject pph_inference_answer_report_answer(final SubLObject inference_answer) {
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        if (pph_proof.NIL != v_bindings) {
            final SubLObject ans = bindings.variable_binding_value(v_bindings.first());
            return (SubLObject)((pph_proof.NIL != pph_utilities.pph_irrelevant_fort(ans, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) ? pph_proof.NIL : ans);
        }
        return pph_proof.$const436$True;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 175932L)
    public static SubLObject pph_weight_from_problem_dictionary(final SubLObject problem_dictionary) {
        final SubLObject dictionary_length = dictionary.dictionary_length(problem_dictionary);
        return Numbers.divide((SubLObject)pph_proof.$float420$1_0, number_utilities.f_1X(dictionary_length));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-proof.lisp", position = 176117L)
    public static SubLObject pph_inference_answer_report_okP(final SubLObject report_string, final SubLObject cycl_answer, final SubLObject weight) {
        if (pph_proof.NIL == string_utilities.non_empty_stringP(report_string)) {
            return (SubLObject)pph_proof.NIL;
        }
        if (pph_proof.NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), report_string, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED, (SubLObject)pph_proof.UNPROVIDED)) {
            return (SubLObject)pph_proof.NIL;
        }
        return (SubLObject)pph_proof.T;
    }
    
    public static SubLObject declare_pph_proof_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "generate_inference_answer_sentence_for_java", "GENERATE-INFERENCE-ANSWER-SENTENCE-FOR-JAVA", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_inference_answer_proofs", "PPH-SHOW-INFERENCE-ANSWER-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_inference_answer_proof", "PPH-SHOW-INFERENCE-ANSWER-PROOF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_justification_for_java", "PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_maybe_show_inference_proof_summary", "PPH-MAYBE-SHOW-INFERENCE-PROOF-SUMMARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_used_assertions", "PPH-PROOF-USED-ASSERTIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_used_assertions_from_subproofs", "PPH-PROOF-USED-ASSERTIONS-FROM-SUBPROOFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_used_assertions_from_supports", "PPH-PROOF-USED-ASSERTIONS-FROM-SUPPORTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_used_external_supports", "PPH-PROOF-USED-EXTERNAL-SUPPORTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_external_supports_from_subproofs", "PPH-PROOF-EXTERNAL-SUPPORTS-FROM-SUBPROOFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_external_supports_from_supports", "PPH-PROOF-EXTERNAL-SUPPORTS-FROM-SUPPORTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "sksi_proof_p", "SKSI-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_meta_supports_from_tree", "PPH-META-SUPPORTS-FROM-TREE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_terminal_meta_supports_from_tree", "PPH-TERMINAL-META-SUPPORTS-FROM-TREE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_exempted_supportP", "PPH-EXEMPTED-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_proven_sentences", "PPH-PROOF-PROVEN-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_proven_sentence_el_sentence", "PPH-PROOF-PROVEN-SENTENCE-EL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "inference_answer_get_proofs", "INFERENCE-ANSWER-GET-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_pick_justification_proof", "PPH-PICK-JUSTIFICATION-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_preferable_and_equal_proofP", "PPH-PREFERABLE-AND-EQUAL-PROOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "inference_answer_get_justification_with_proof", "INFERENCE-ANSWER-GET-JUSTIFICATION-WITH-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_best_proof", "PPH-FIND-BEST-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_depth", "PPH-PROOF-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_depth_memoized_internal", "PPH-PROOF-DEPTH-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_depth_memoized", "PPH-PROOF-DEPTH-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_E", "PPH-PROOF-=", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevant_warn", "PPH-IRRELEVANT-WARN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_inference_proof", "PPH-SHOW-INFERENCE-PROOF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_top_level_proof_p", "PPH-TOP-LEVEL-PROOF-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_show_see_above", "PPH-PROOF-SHOW-SEE-ABOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_show_hypothetical_attribution", "PPH-PROOF-SHOW-HYPOTHETICAL-ATTRIBUTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_show_short_attribution", "PPH-PROOF-SHOW-SHORT-ATTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_justify_proofP", "PPH-JUSTIFY-PROOF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "find_or_create_pph_displayed_proof_stack", "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_note_proof_displayed", "PPH-NOTE-PROOF-DISPLAYED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_most_recent_proof_displayed", "PPH-MOST-RECENT-PROOF-DISPLAYED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_already_displayed_p", "PPH-PROOF-ALREADY-DISPLAYED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_query_equalP", "PPH-PROOF-QUERY-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_lits_equal", "PPH-PROOF-LITS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "find_or_create_pph_justified_proof_set", "FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_note_proof_justified", "PPH-NOTE-PROOF-JUSTIFIED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_already_justified_p", "PPH-PROOF-ALREADY-JUSTIFIED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_note_support_displayed", "PPH-NOTE-SUPPORT-DISPLAYED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proofs_analogousP", "PPH-PROOFS-ANALOGOUS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proofs_analogousP_int", "PPH-PROOFS-ANALOGOUS?-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_analogous_proof", "PPH-SHOW-ANALOGOUS-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_trivial_proof", "PPH-SHOW-TRIVIAL-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_query_and_supports", "PPH-SHOW-PROOF-QUERY-AND-SUPPORTS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_supports_and_conclusion", "PPH-SHOW-PROOF-SUPPORTS-AND-CONCLUSION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_displayworthy_supports", "PPH-DISPLAYWORTHY-SUPPORTS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_pruning_ruleP", "PROOF-VIEW-PRUNING-RULE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "remove_if_pph_irrelevant_support", "REMOVE-IF-PPH-IRRELEVANT-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_non_trivial_proof_supports", "PPH-NON-TRIVIAL-PROOF-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_real_or_quasi_transformation_proof_p", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_real_or_quasi_transformation_proof_rule", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_real_or_quasi_transformation_proof_intermediate_conclusions", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-INTERMEDIATE-CONCLUSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assertion_deduced_support_sentences", "PPH-ASSERTION-DEDUCED-SUPPORT-SENTENCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_quasi_transformation_proof_p", "PPH-QUASI-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_hl_transformation_proof_p", "PPH-HL-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_cached_transformation_proof_p", "PPH-CACHED-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_cached_transformation_proof_supporting_assertion", "PPH-CACHED-TRANSFORMATION-PROOF-SUPPORTING-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_real_or_quasi_transformation_proof_supports_bu", "PPH-SHOW-REAL-OR-QUASI-TRANSFORMATION-PROOF-SUPPORTS-BU", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_real_or_quasi_transformation_proof_conclusion", "PPH-SHOW-REAL-OR-QUASI-TRANSFORMATION-PROOF-CONCLUSION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_conclusion_int", "PPH-SHOW-PROOF-CONCLUSION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_real_or_quasi_transformation_proof_conclusion", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-CONCLUSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_query_and_supports_default", "PPH-SHOW-PROOF-QUERY-AND-SUPPORTS-DEFAULT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_real_or_quasi_transformation_proof_supports", "PPH-SHOW-REAL-OR-QUASI-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_transformation_proof_supports", "PPH-SHOW-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_transformation_subproof_worth_showingP", "PPH-TRANSFORMATION-SUBPROOF-WORTH-SHOWING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_transformation_subproof_worth_showingP_int", "PPH-TRANSFORMATION-SUBPROOF-WORTH-SHOWING?-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_hl_transformation_proof_supports_bu", "PPH-SHOW-HL-TRANSFORMATION-PROOF-SUPPORTS-BU", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_hl_transformation_proof_supports", "PPH-SHOW-HL-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_cached_transformation_proof_supports_bu", "PPH-SHOW-CACHED-TRANSFORMATION-PROOF-SUPPORTS-BU", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_cached_transformation_proof_supports", "PPH-SHOW-CACHED-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_cached_transformation_proof_supports_from_as", "PPH-SHOW-CACHED-TRANSFORMATION-PROOF-SUPPORTS-FROM-AS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_reconstructed_transformation_proof_support_tree_p", "PPH-RECONSTRUCTED-TRANSFORMATION-PROOF-SUPPORT-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_reconstructed_transformation_proof_support_tree", "PPH-SHOW-RECONSTRUCTED-TRANSFORMATION-PROOF-SUPPORT-TREE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_transformation_support_trees", "PPH-FIND-TRANSFORMATION-SUPPORT-TREES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_transformation_proof_rule", "PPH-SHOW-TRANSFORMATION-PROOF-RULE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_valid_transformation_proof_rule", "PPH-SHOW-VALID-TRANSFORMATION-PROOF-RULE", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_focus_rule_formula", "PPH-FOCUS-RULE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_restriction_subproofs", "PPH-SHOW-RESTRICTION-SUBPROOFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_show_givens", "PPH-PROOF-SHOW-GIVENS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_display_restricted_and_general_rule", "PPH-DISPLAY-RESTRICTED-AND-GENERAL-RULE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_trivialP", "PPH-SUPPORT-TRIVIAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_triviality_check_mt", "PPH-TRIVIALITY-CHECK-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_triviality_check_mt_for_addressee_internal", "PPH-TRIVIALITY-CHECK-MT-FOR-ADDRESSEE-INTERNAL", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_triviality_check_mt_for_addressee", "PPH-TRIVIALITY-CHECK-MT-FOR-ADDRESSEE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevance_check_mt", "PPH-IRRELEVANCE-CHECK-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevance_check_mt_for_addressee_internal", "PPH-IRRELEVANCE-CHECK-MT-FOR-ADDRESSEE-INTERNAL", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevance_check_mt_for_addressee", "PPH-IRRELEVANCE-CHECK-MT-FOR-ADDRESSEE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_required_ruleP", "PPH-REQUIRED-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_assertionP", "PPH-TRIVIAL-ASSERTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assertion_trivialP", "PPH-ASSERTION-TRIVIAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_derived_assertionP", "PPH-TRIVIAL-DERIVED-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_mtP", "PPH-TRIVIAL-MT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_to_show_p", "PPH-PROOF-TO-SHOW-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_non_explanatory_proof_p", "PPH-NON-EXPLANATORY-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_non_explanatory_proofs", "PPH-NON-EXPLANATORY-PROOFS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_proof", "pph_proof_fancy_indent", "PPH-PROOF-FANCY-INDENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_proof", "pph_proof_indent", "PPH-PROOF-INDENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_maybe_show_subproofs", "PPH-MAYBE-SHOW-SUBPROOFS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_set_meta_support_max", "PPH-SET-META-SUPPORT-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_support", "PPH-SHOW-SUPPORT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_justification_pred_highly_relevantP", "PPH-JUSTIFICATION-PRED-HIGHLY-RELEVANT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_invalidated_support", "PPH-SHOW-INVALIDATED-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_maybe_show_meta_supports", "PPH-MAYBE-SHOW-META-SUPPORTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_supports_wXo_indent", "PPH-SHOW-SUPPORTS-W/O-INDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_maybe_show_assert_info", "PPH-MAYBE-SHOW-ASSERT-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assertion_has_assert_infoP", "PPH-ASSERTION-HAS-ASSERT-INFO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_assert_info", "PPH-SHOW-ASSERT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_skip_meta_supports_for_support_p", "PPH-SKIP-META-SUPPORTS-FOR-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_displayed_supports", "PPH-DISPLAYED-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_support_already_shown_p", "PPH-PROOF-SUPPORT-ALREADY-SHOWN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_meta_supports_to_show", "PPH-META-SUPPORTS-TO-SHOW", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_sort_meta_supports", "PPH-SORT-META-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_meta_support_should_precedeP", "PPH-META-SUPPORT-SHOULD-PRECEDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_rule_literals_to_suppress", "PPH-RULE-LITERALS-TO-SUPPRESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_literals_to_suppress_from_rule_and_conclusion", "PPH-LITERALS-TO-SUPPRESS-FROM-RULE-AND-CONCLUSION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_literals_to_suppress_from_deductions", "PPH-LITERALS-TO-SUPPRESS-FROM-DEDUCTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "substitute_pph_var_binding", "SUBSTITUTE-PPH-VAR-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_prune_meta_supports", "PPH-PRUNE-META-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_all_meta_supports_for_module_p", "PPH-SHOW-ALL-META-SUPPORTS-FOR-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_always_show_meta_support_for_moduleP_internal", "PPH-ALWAYS-SHOW-META-SUPPORT-FOR-MODULE?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_always_show_meta_support_for_moduleP", "PPH-ALWAYS-SHOW-META-SUPPORT-FOR-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_argument", "PPH-SHOW-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevant_proof_conclusionP", "PPH-IRRELEVANT-PROOF-CONCLUSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevant_supportP_internal", "PPH-IRRELEVANT-SUPPORT?-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevant_supportP", "PPH-IRRELEVANT-SUPPORT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevant_support_module_p", "PPH-IRRELEVANT-SUPPORT-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_sentence", "PPH-SUPPORT-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_el_sentence_internal", "PPH-SUPPORT-EL-SENTENCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_el_sentence", "PPH-SUPPORT-EL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_sentence_replace_redundant_narts", "PPH-SENTENCE-REPLACE-REDUNDANT-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_transformable_redundant_nart_p", "PPH-TRANSFORMABLE-REDUNDANT-NART-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_transform_redundant_nart", "PPH-TRANSFORM-REDUNDANT-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_constant_for_nart_internal", "PPH-CONSTANT-FOR-NART-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_constant_for_nart", "PPH-CONSTANT-FOR-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_irrelevant_formulaP", "PPH-IRRELEVANT-FORMULA?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_sentenceP", "PPH-TRIVIAL-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "sentence_trivial_for_justification_paraphraseP", "SENTENCE-TRIVIAL-FOR-JUSTIFICATION-PARAPHRASE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "sentence_has_trivial_isomorphic_assertionP_internal", "SENTENCE-HAS-TRIVIAL-ISOMORPHIC-ASSERTION?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "sentence_has_trivial_isomorphic_assertionP", "SENTENCE-HAS-TRIVIAL-ISOMORPHIC-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_the_sentenceP", "PPH-TRIVIAL-THE-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_upper_ontology_sentenceP", "PPH-TRIVIAL-UPPER-ONTOLOGY-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_functional_sentenceP", "PPH-TRIVIAL-FUNCTIONAL-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_instance_with_relation_isa_sentenceP", "PPH-TRIVIAL-INSTANCE-WITH-RELATION-ISA-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_genls_sentenceP", "PPH-TRIVIAL-GENLS-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_isa_sentenceP", "PPH-TRIVIAL-ISA-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_genl_preds_sentenceP", "PPH-TRIVIAL-GENL-PREDS-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_required_sentenceP_internal", "PPH-REQUIRED-SENTENCE?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_required_sentenceP", "PPH-REQUIRED-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_subcollection_pred_sentenceP", "PPH-TRIVIAL-SUBCOLLECTION-PRED-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_reflexive_sentenceP", "PPH-TRIVIAL-REFLEXIVE-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_termP_internal", "PPH-TRIVIAL-TERM?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_termP", "PPH-TRIVIAL-TERM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "triviality_sentence_for_term", "TRIVIALITY-SENTENCE-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "triviality_query_properties", "TRIVIALITY-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "term_has_pro_trivial_argumentP", "TERM-HAS-PRO-TRIVIAL-ARGUMENT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "assertion_has_triviality_assertionsP", "ASSERTION-HAS-TRIVIALITY-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "term_has_con_trivial_argumentP", "TERM-HAS-CON-TRIVIAL-ARGUMENT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_maybe_show_additional_supports", "PPH-MAYBE-SHOW-ADDITIONAL-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_assertion", "PPH-SHOW-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_assertion_int", "PPH-SHOW-ASSERTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assert_info", "PPH-ASSERT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_source", "PPH-SHOW-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_highly_relevant_assertionP", "PPH-HIGHLY-RELEVANT-ASSERTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_sentence", "PPH-SHOW-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_term", "PPH-SHOW-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_question", "PPH-SHOW-QUESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_term_phrase_np", "PPH-TERM-PHRASE-NP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_wXsentential_force", "PPH-SHOW-W/SENTENTIAL-FORCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_templated_proofP", "PPH-TEMPLATED-PROOF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_template", "PPH-PROOF-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_get_proof_template", "PPH-GET-PROOF-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_choose_proof_template", "PPH-CHOOSE-PROOF-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_templated_proof", "PPH-SHOW-TEMPLATED-PROOF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_template_var_name", "PPH-PROOF-TEMPLATE-VAR-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_template_motivation", "PPH-SHOW-PROOF-TEMPLATE-MOTIVATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_template_applicability_constraints", "PPH-PROOF-TEMPLATE-APPLICABILITY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_template_has_preconditionsP", "PPH-PROOF-TEMPLATE-HAS-PRECONDITIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_show_template", "PPH-PROOF-SHOW-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_template_show_precondition_proofs", "PPH-PROOF-TEMPLATE-SHOW-PRECONDITION-PROOFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_template_body", "PPH-SHOW-PROOF-TEMPLATE-BODY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_template_variable_bindings", "PPH-SHOW-PROOF-TEMPLATE-VARIABLE-BINDINGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_template_vars_to_substitute", "PPH-PROOF-TEMPLATE-VARS-TO-SUBSTITUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_show_proof_template_conclusion", "PPH-SHOW-PROOF-TEMPLATE-CONCLUSION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "debug_construct_proof_views", "DEBUG-CONSTRUCT-PROOF-VIEWS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view", "SHOW-PROOF-VIEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_tab_id_for_entry_internal", "PROOF-VIEW-TAB-ID-FOR-ENTRY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_tab_id_for_entry", "PROOF-VIEW-TAB-ID-FOR-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_error_output", "SHOW-PROOF-VIEW-ERROR-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_show_buttons", "PROOF-VIEW-SHOW-BUTTONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_params", "SHOW-PROOF-VIEW-PARAMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_toc", "SHOW-PROOF-VIEW-TOC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "maybe_insert_proof_view_entry_anchor", "MAYBE-INSERT-PROOF-VIEW-ENTRY-ANCHOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_filtered_items_row", "SHOW-PROOF-VIEW-FILTERED-ITEMS-ROW");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_filtered_items", "SHOW-PROOF-VIEW-FILTERED-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "cyc_proof_view_section_html", "CYC-PROOF-VIEW-SECTION-HTML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_section_html", "PROOF-VIEW-SECTION-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_entry", "SHOW-PROOF-VIEW-ENTRY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_entry_local_content", "SHOW-PROOF-VIEW-ENTRY-LOCAL-CONTENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "maybe_show_proof_view_entry_bug_report_link", "MAYBE-SHOW-PROOF-VIEW-ENTRY-BUG-REPORT-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_bug_report_link_for_proof_view_entryP", "SHOW-BUG-REPORT-LINK-FOR-PROOF-VIEW-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_object", "SHOW-PROOF-VIEW-OBJECT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_entry_initial_child_visibility", "PROOF-VIEW-ENTRY-INITIAL-CHILD-VISIBILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_entry_class", "PROOF-VIEW-ENTRY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_view_html_class", "PROOF-VIEW-HTML-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "show_proof_view_object_typeP", "SHOW-PROOF-VIEW-OBJECT-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "debug_proof_view_cb_link_for_term", "DEBUG-PROOF-VIEW-CB-LINK-FOR-TERM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "debug_proof_view_entry_label_color", "DEBUG-PROOF-VIEW-ENTRY-LABEL-COLOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_get_inference_mt", "PPH-GET-INFERENCE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "proof_of_inference_answer_p", "PROOF-OF-INFERENCE-ANSWER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "support_cnf", "SUPPORT-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "hypothetical_mtP", "HYPOTHETICAL-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_from_hypothesisP", "PPH-PROOF-FROM-HYPOTHESIS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_hypothesized_supportP", "PPH-HYPOTHESIZED-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assertion_references_hypothetical_term_p", "PPH-ASSERTION-REFERENCES-HYPOTHETICAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_hypothesis_mt_for_mtP", "PPH-HYPOTHESIS-MT-FOR-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_terminal_transformation_proof_p", "PPH-TERMINAL-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_has_transformation_subproofs_p", "PPH-PROOF-HAS-TRANSFORMATION-SUBPROOFS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_subproofs_matching_asents", "PPH-FIND-SUBPROOFS-MATCHING-ASENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_restrict_transformation_rule", "PPH-RESTRICT-TRANSFORMATION-RULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_restrict_rule_via_subproofs", "PPH-RESTRICT-RULE-VIA-SUBPROOFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_remove_trivial_neg_lits", "PPH-REMOVE-TRIVIAL-NEG-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_remove_trivial_evaluatable_neg_lits", "PPH-REMOVE-TRIVIAL-EVALUATABLE-NEG-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_trivial_neg_litP", "PPH-TRIVIAL-NEG-LIT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_restricted_rule_resolve_tous", "PPH-RESTRICTED-RULE-RESOLVE-TOUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_subproof_matches_asent_p", "PPH-SUBPROOF-MATCHES-ASENT-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_restriction_subproofs_and_bindings", "PPH-RESTRICTION-SUBPROOFS-AND-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_lookup_subproofs", "PPH-LOOKUP-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_subproof_to_proof_variable_map", "PPH-SUBPROOF-TO-PROOF-VARIABLE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_lookup_proof_p", "PPH-LOOKUP-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_subproofs", "PPH-PROOF-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_conclusion_internal", "PPH-PROOF-CONCLUSION-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_conclusion", "PPH-PROOF-CONCLUSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "check_for_isomorphic_assertionP", "CHECK-FOR-ISOMORPHIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "formula_too_complex_for_proof_paraphraseP", "FORMULA-TOO-COMPLEX-FOR-PROOF-PARAPHRASE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_el_formula", "PPH-PROOF-EL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_proof_wX_isomorphic_support_p", "PPH-PROOF-W/-ISOMORPHIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_sub_isomorphic_assertions_into_supports", "PPH-SUB-ISOMORPHIC-ASSERTIONS-INTO-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_hl_support_with_isomorphic_assertionP", "PPH-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_assertion_for_support", "PPH-FIND-ASSERTION-FOR-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_assertion_from_cnfs", "PPH-FIND-ASSERTION-FROM-CNFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_assertion_from_cnf", "PPH-FIND-ASSERTION-FROM-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assertion_support_tree", "PPH-ASSERTION-SUPPORT-TREE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_meta_support_tree", "PPH-META-SUPPORT-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_tree_from_supports", "PPH-SUPPORT-TREE-FROM-SUPPORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_tree_p", "PPH-SUPPORT-TREE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_tree_supported", "PPH-SUPPORT-TREE-SUPPORTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_tree_supporters", "PPH-SUPPORT-TREE-SUPPORTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_tree_sentence", "PPH-SUPPORT-TREE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_assertion_supports", "PPH-ASSERTION-SUPPORTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_prefer_deductionP", "PPH-PREFER-DEDUCTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_find_isomorphic_assertion_in_higher_mt", "PPH-FIND-ISOMORPHIC-ASSERTION-IN-HIGHER-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_gaf_with_formula_in_higher_mt", "PPH-GAF-WITH-FORMULA-IN-HIGHER-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_gaf_with_formula_in_not_lower_mtP", "PPH-GAF-WITH-FORMULA-IN-NOT-LOWER-MT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "earlier_deduction_p", "EARLIER-DEDUCTION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_meta_supports", "PPH-META-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_default_meta_supports", "PPH-DEFAULT-META-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_invalid_supportP", "PPH-INVALID-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_hl_verify", "PPH-HL-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_hl_verify_via_removal_ask", "PPH-HL-VERIFY-VIA-REMOVAL-ASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_isa_supportP", "PPH-ISA-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_genls_supportP", "PPH-GENLS-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_genls_supports", "PPH-GENLS-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_isa_supports", "PPH-ISA-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_not_isa_supportP", "PPH-NOT-ISA-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_not_isa_supports", "PPH-NOT-ISA-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_isa_genls_type_violation_supportP", "PPH-ISA-GENLS-TYPE-VIOLATION-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_supports_for_disjoint_support", "PPH-SUPPORTS-FOR-DISJOINT-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "find_highest_thcl_genls_between", "FIND-HIGHEST-THCL-GENLS-BETWEEN", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "find_thcl_genls_between", "FIND-THCL-GENLS-BETWEEN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_weight_p", "PPH-WEIGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explain_inference_answer_with_proof", "PPH-EXPLAIN-INFERENCE-ANSWER-WITH-PROOF", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explain_all_relevant_inference_answers", "PPH-EXPLAIN-ALL-RELEVANT-INFERENCE-ANSWERS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explain_all_inference_answers_for_best_proofs", "PPH-EXPLAIN-ALL-INFERENCE-ANSWERS-FOR-BEST-PROOFS", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_explanation_okP", "PPH-INFERENCE-ANSWER-EXPLANATION-OK?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explain_inference_answer_with_proof_int", "PPH-EXPLAIN-INFERENCE-ANSWER-WITH-PROOF-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_paragraph_demerits_to_weight", "PPH-PARAGRAPH-DEMERITS-TO-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_explanation_contents", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "best_support_sentence_nautP", "BEST-SUPPORT-SENTENCE-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_explanation_contents_for_appropriate_response_content", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-FOR-APPROPRIATE-RESPONSE-CONTENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_supports_for_appropriate_response_content_sentence", "PPH-SUPPORTS-FOR-APPROPRIATE-RESPONSE-CONTENT-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_explanation_contents_default", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-DEFAULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_explanation_contents_from_supports_and_bindings", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-FROM-SUPPORTS-AND-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_maybe_optimize_answer_explanation_supports", "PPH-MAYBE-OPTIMIZE-ANSWER-EXPLANATION-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_answer_explanation_supports_need_optimizingP", "PPH-ANSWER-EXPLANATION-SUPPORTS-NEED-OPTIMIZING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_optimize_answer_explanation_supports", "PPH-OPTIMIZE-ANSWER-EXPLANATION-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_support_mentions_bindingP", "PPH-SUPPORT-MENTIONS-BINDING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_all_bindings_mentionedP", "PPH-ALL-BINDINGS-MENTIONED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_explanation_contents_from_supports", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-FROM-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_good_explanation_contentsP", "PPH-GOOD-EXPLANATION-CONTENTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_meta_ize_supports", "PPH-META-IZE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explanation_sentences_from_supports", "PPH-EXPLANATION-SENTENCES-FROM-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explanation_sentence_from_support", "PPH-EXPLANATION-SENTENCE-FROM-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_explanation_source_for_support", "PPH-EXPLANATION-SOURCE-FOR-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_report_inference_answer", "PPH-REPORT-INFERENCE-ANSWER", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_report_all_relevant_inference_answers", "PPH-REPORT-ALL-RELEVANT-INFERENCE-ANSWERS", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_report_inference_answer_int", "PPH-REPORT-INFERENCE-ANSWER-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_report_answer", "PPH-INFERENCE-ANSWER-REPORT-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_weight_from_problem_dictionary", "PPH-WEIGHT-FROM-PROBLEM-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_proof", "pph_inference_answer_report_okP", "PPH-INFERENCE-ANSWER-REPORT-OK?", 3, 0, false);
        return (SubLObject)pph_proof.NIL;
    }
    
    public static SubLObject init_pph_proof_file() {
        pph_proof.$pph_show_gory_proof_details$ = SubLFiles.defparameter("*PPH-SHOW-GORY-PROOF-DETAILS*", (SubLObject)pph_proof.NIL);
        pph_proof.$pph_meta_support_max$ = SubLFiles.deflexical("*PPH-META-SUPPORT-MAX*", (SubLObject)pph_proof.TEN_INTEGER);
        pph_proof.$pph_meta_support_level$ = SubLFiles.defparameter("*PPH-META-SUPPORT-LEVEL*", (SubLObject)pph_proof.ZERO_INTEGER);
        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$ = SubLFiles.defparameter("*PPH-HL-MODULES-TO-SKIP-META-SUPPORTS-FOR*", (SubLObject)pph_proof.NIL);
        pph_proof.$var_binding_candidates$ = SubLFiles.defparameter("*VAR-BINDING-CANDIDATES*", misc_utilities.uninitialized());
        pph_proof.$pph_support_modules_for_which_to_show_all_meta_supports$ = SubLFiles.deflexical("*PPH-SUPPORT-MODULES-FOR-WHICH-TO-SHOW-ALL-META-SUPPORTS*", (SubLObject)pph_proof.NIL);
        pph_proof.$pph_irrelevant_support_modules$ = SubLFiles.defparameter("*PPH-IRRELEVANT-SUPPORT-MODULES*", (SubLObject)pph_proof.$list190);
        pph_proof.$pph_use_proof_templatesP$ = SubLFiles.defparameter("*PPH-USE-PROOF-TEMPLATES?*", (SubLObject)pph_proof.T);
        pph_proof.$proof_view_max_nowrap_line$ = SubLFiles.deflexical("*PROOF-VIEW-MAX-NOWRAP-LINE*", (SubLObject)pph_proof.$int358$200);
        pph_proof.$pph_meta_supports_max_depth$ = SubLFiles.defparameter("*PPH-META-SUPPORTS-MAX-DEPTH*", (SubLObject)pph_proof.TWO_INTEGER);
        pph_proof.$pph_meta_supports_depth$ = SubLFiles.defparameter("*PPH-META-SUPPORTS-DEPTH*", (SubLObject)pph_proof.ZERO_INTEGER);
        pph_proof.$pph_prefer_deduced_meta_supportsP$ = SubLFiles.defparameter("*PPH-PREFER-DEDUCED-META-SUPPORTS?*", (SubLObject)pph_proof.T);
        return (SubLObject)pph_proof.NIL;
    }
    
    public static SubLObject setup_pph_proof_file() {
        access_macros.register_external_symbol((SubLObject)pph_proof.$sym0$GENERATE_INFERENCE_ANSWER_SENTENCE_FOR_JAVA);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym25$PPH_PROOF_DEPTH_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym90$PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym109$PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym16$PPH_IRRELEVANT_SUPPORT_);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym17$PPH_SUPPORT_EL_SENTENCE);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym193$PPH_CONSTANT_FOR_NART);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym230$PPH_REQUIRED_SENTENCE_);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym243$PPH_TRIVIAL_TERM_);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym303$PROOF_VIEW_TAB_ID_FOR_ENTRY);
        utilities_macros.register_kb_function((SubLObject)pph_proof.$sym348$CYC_PROOF_VIEW_SECTION_HTML);
        memoization_state.note_memoized_function((SubLObject)pph_proof.$sym395$PPH_PROOF_CONCLUSION);
        return (SubLObject)pph_proof.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_proof_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_proof_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_proof_file();
    }
    
    static {
        me = (SubLFile)new pph_proof();
        pph_proof.$pph_show_gory_proof_details$ = null;
        pph_proof.$pph_meta_support_max$ = null;
        pph_proof.$pph_meta_support_level$ = null;
        pph_proof.$pph_hl_modules_to_skip_meta_supports_for$ = null;
        pph_proof.$var_binding_candidates$ = null;
        pph_proof.$pph_support_modules_for_which_to_show_all_meta_supports$ = null;
        pph_proof.$pph_irrelevant_support_modules$ = null;
        pph_proof.$pph_use_proof_templatesP$ = null;
        pph_proof.$proof_view_max_nowrap_line$ = null;
        pph_proof.$pph_meta_supports_max_depth$ = null;
        pph_proof.$pph_meta_supports_depth$ = null;
        pph_proof.$pph_prefer_deduced_meta_supportsP$ = null;
        $sym0$GENERATE_INFERENCE_ANSWER_SENTENCE_FOR_JAVA = SubLObjectFactory.makeSymbol("GENERATE-INFERENCE-ANSWER-SENTENCE-FOR-JAVA");
        $sym1$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw2$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw3$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $str4$Couldn_t_generate_a_paraphrase_fo = SubLObjectFactory.makeString("Couldn't generate a paraphrase for the sentence proven by inference answer ~S ~S ~S");
        $sym5$PPH_PROOF__ = SubLObjectFactory.makeSymbol("PPH-PROOF-=");
        $kw6$FIND_BEST = SubLObjectFactory.makeKeyword("FIND-BEST");
        $str7$_S_is_not_a_proof_of__S = SubLObjectFactory.makeString("~S is not a proof of ~S");
        $str8$proof = SubLObjectFactory.makeString("proof");
        $sym9$INFERENCE_ANSWER_P = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P");
        $sym10$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $str11$Facts_Proved_ = SubLObjectFactory.makeString("Facts Proved:");
        $sym12$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $str13$Selected_ = SubLObjectFactory.makeString("Selected ");
        $str14$Facts_Used_from_Knowledge_Base_ = SubLObjectFactory.makeString("Facts Used from Knowledge Base:");
        $sym15$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $sym16$PPH_IRRELEVANT_SUPPORT_ = SubLObjectFactory.makeSymbol("PPH-IRRELEVANT-SUPPORT?");
        $sym17$PPH_SUPPORT_EL_SENTENCE = SubLObjectFactory.makeSymbol("PPH-SUPPORT-EL-SENTENCE");
        $sym18$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $kw19$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $sym20$PPH_TRIVIAL_SENTENCE_ = SubLObjectFactory.makeSymbol("PPH-TRIVIAL-SENTENCE?");
        $sym21$PPH_IRRELEVANT_FORMULA_ = SubLObjectFactory.makeSymbol("PPH-IRRELEVANT-FORMULA?");
        $sym22$PPH_PROOF_PROVEN_SENTENCE_EL_SENTENCE = SubLObjectFactory.makeSymbol("PPH-PROOF-PROVEN-SENTENCE-EL-SENTENCE");
        $sym23$_ = SubLObjectFactory.makeSymbol("<");
        $sym24$PPH_PROOF_DEPTH = SubLObjectFactory.makeSymbol("PPH-PROOF-DEPTH");
        $sym25$PPH_PROOF_DEPTH_MEMOIZED = SubLObjectFactory.makeSymbol("PPH-PROOF-DEPTH-MEMOIZED");
        $sym26$SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym28$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym29$_PPH_IRRELEVANT_WARN__ = SubLObjectFactory.makeSymbol("*PPH-IRRELEVANT-WARN?*");
        $sym30$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym31$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym32$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str33$PPH_irrelevant_formula_____S__ = SubLObjectFactory.makeString("PPH irrelevant formula:~% ~S~%");
        $kw34$SUPPORTS_AND_CONCLUSION = SubLObjectFactory.makeKeyword("SUPPORTS-AND-CONCLUSION");
        $str35$See_above = SubLObjectFactory.makeString("See above");
        $str36$From_question = SubLObjectFactory.makeString("From question");
        $str37$see_above_ = SubLObjectFactory.makeString("see_above_");
        $str38$text_css = SubLObjectFactory.makeString("text/css");
        $str39$screen = SubLObjectFactory.makeString("screen");
        $str40$none = SubLObjectFactory.makeString("none");
        $str41$ = SubLObjectFactory.makeString("");
        $kw42$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw43$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str44$__A_ = SubLObjectFactory.makeString("(~A)");
        $sym45$PPH_PROOF_QUERY_EQUAL_ = SubLObjectFactory.makeSymbol("PPH-PROOF-QUERY-EQUAL?");
        $sym46$PROOF_PROVEN_QUERY = SubLObjectFactory.makeSymbol("PROOF-PROVEN-QUERY");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT1"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT2"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT2"));
        $str49$By_analogous_reasoning__ = SubLObjectFactory.makeString("By analogous reasoning, ");
        $str50$since_ = SubLObjectFactory.makeString("since:");
        $str51$it_follows_that_ = SubLObjectFactory.makeString("it follows that:");
        $str52$Trivially__ = SubLObjectFactory.makeString("Trivially: ");
        $sym53$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym54$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const55$ruleAndSupportsTrivialForJustific = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleAndSupportsTrivialForJustificationParaphrase"));
        $str56$__Removing_irrelevant_support____ = SubLObjectFactory.makeString("~&Removing irrelevant support:~% ~S");
        $sym57$PPH_SUPPORT_TRIVIAL_ = SubLObjectFactory.makeSymbol("PPH-SUPPORT-TRIVIAL?");
        $kw58$CODE = SubLObjectFactory.makeKeyword("CODE");
        $str59$_ = SubLObjectFactory.makeString("_");
        $str60$Proof_that = SubLObjectFactory.makeString("Proof that");
        $str61$Intermediate_Result_ = SubLObjectFactory.makeString("Intermediate Result:");
        $str62$Conclusion_ = SubLObjectFactory.makeString("Conclusion:");
        $str63$Supporting_Facts = SubLObjectFactory.makeString("Supporting Facts");
        $str64$_transformation_supports = SubLObjectFactory.makeString("_transformation_supports");
        $str65$Rule_Application_ = SubLObjectFactory.makeString("Rule Application:");
        $str66$Transformation_Proof_Supports = SubLObjectFactory.makeString("Transformation Proof Supports");
        $sym67$EL_IMPLICATION_P = SubLObjectFactory.makeSymbol("EL-IMPLICATION-P");
        $sym68$PPH_SUPPORT_TREE_SENTENCE = SubLObjectFactory.makeSymbol("PPH-SUPPORT-TREE-SENTENCE");
        $list69 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("META-SUPPORT-TREES"));
        $str70$_meta_ = SubLObjectFactory.makeString("_meta_");
        $kw71$HYPOTHESIZED = SubLObjectFactory.makeKeyword("HYPOTHESIZED");
        $kw72$FROM_KB = SubLObjectFactory.makeKeyword("FROM-KB");
        $str73$Applicable_Rule_ = SubLObjectFactory.makeString("Applicable Rule:");
        $sym74$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym75$UNIFY = SubLObjectFactory.makeSymbol("UNIFY");
        $str76$transformation_rule_ = SubLObjectFactory.makeString("transformation_rule_");
        $str77$Invalidated_Rule = SubLObjectFactory.makeString("Invalidated Rule");
        $str78$Supporting_Rule = SubLObjectFactory.makeString("Supporting Rule");
        $str79$Transformation_Supports = SubLObjectFactory.makeString("Transformation Supports");
        $kw80$IMPLICATION = SubLObjectFactory.makeKeyword("IMPLICATION");
        $kw81$DISJUNCTION = SubLObjectFactory.makeKeyword("DISJUNCTION");
        $kw82$DERIVED_FROM_HYPOTHESIS = SubLObjectFactory.makeKeyword("DERIVED-FROM-HYPOTHESIS");
        $str83$Given__from_the_question__ = SubLObjectFactory.makeString("Given (from the question):");
        $str84$Derived_from_the_question_ = SubLObjectFactory.makeString("Derived from the question:");
        $str85$Given__from_the_knowledge_base__ = SubLObjectFactory.makeString("Given (from the knowledge base):");
        $str86$Other_Givens_ = SubLObjectFactory.makeString("Other Givens:");
        $str87$_restriction_subproofs = SubLObjectFactory.makeString("_restriction-subproofs");
        $const88$BaseTrivialityMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseTrivialityMt"));
        $const89$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $sym90$PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE = SubLObjectFactory.makeSymbol("PPH-TRIVIALITY-CHECK-MT-FOR-ADDRESSEE");
        $const91$TrivialityContextForIndividualFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TrivialityContextForIndividualFn"));
        $kw92$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw93$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw94$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym95$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw96$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str97$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym98$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw99$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str100$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw101$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str102$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const103$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str104$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str105$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $const106$TrivialityContextForTypeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TrivialityContextForTypeFn"));
        $str107$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const108$BaseIrrelevanceMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseIrrelevanceMt"));
        $sym109$PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE = SubLObjectFactory.makeSymbol("PPH-IRRELEVANCE-CHECK-MT-FOR-ADDRESSEE");
        $const110$IrrelevanceContextForIndividualFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IrrelevanceContextForIndividualFn"));
        $const111$IrrelevanceContextForTypeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IrrelevanceContextForTypeFn"));
        $const112$ruleRequiredForJustificationParap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleRequiredForJustificationParaphrase"));
        $kw113$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $const114$ruleConclusionsTrivial = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleConclusionsTrivial"));
        $str115$PPH_irrelevant_formula_ = SubLObjectFactory.makeString("PPH irrelevant formula:");
        $str116$_ = SubLObjectFactory.makeString(" ");
        $str117$Derived_from_rule_whose_conclusio = SubLObjectFactory.makeString("Derived from rule whose conclusions are trivial:~% ~S");
        $const118$mtTrivialForJustificationParaphra = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTrivialForJustificationParaphrase"));
        $kw119$MT = SubLObjectFactory.makeKeyword("MT");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT-CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym121$HTML_FANCY_TABLE = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)pph_proof.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeString("pf-indent"));
        $sym123$HTML_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-TABLE-ROW");
        $sym124$HTML_FANCY_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeString("pf-indent-td"));
        $sym126$HTML_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-TABLE-DATA");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeString("pf-indent-td")));
        $str128$subproofs_ = SubLObjectFactory.makeString("subproofs_");
        $str129$pf_indent = SubLObjectFactory.makeString("pf-indent");
        $str130$pf_indent_td = SubLObjectFactory.makeString("pf-indent-td");
        $str131$_A_subproof = SubLObjectFactory.makeString("~A_subproof");
        $str132$_A_subproof__D = SubLObjectFactory.makeString("~A_subproof_~D");
        $str133$support = SubLObjectFactory.makeString("support");
        $kw134$UNCOMPUTED = SubLObjectFactory.makeKeyword("UNCOMPUTED");
        $str135$highly_relevant = SubLObjectFactory.makeString("highly-relevant");
        $str136$_see_above = SubLObjectFactory.makeString("_see_above");
        $const137$predHighlyRelevantForJustificatio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predHighlyRelevantForJustificationParaphrase"));
        $str138$Invalidated_support = SubLObjectFactory.makeString("Invalidated support");
        $str139$meta_supports_ = SubLObjectFactory.makeString("meta_supports_");
        $str140$_A_meta__D = SubLObjectFactory.makeString("~A_meta_~D");
        $str141$assert_info_ = SubLObjectFactory.makeString("assert_info_");
        $str142$__ = SubLObjectFactory.makeString("--");
        $const143$HypotheticalContext = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"));
        $str144$This_was_stated_in_the_question_ = SubLObjectFactory.makeString("This was stated in the question.");
        $str145$Note__This_rule_has_exceptions__b = SubLObjectFactory.makeString("Note: This rule has exceptions, but none that apply in this case.");
        $const146$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str147$Note__This_rule_has_further_condi = SubLObjectFactory.makeString("Note: This rule has further conditions on its application, but all are met in this case.");
        $kw148$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $sym149$NAUT_P = SubLObjectFactory.makeSymbol("NAUT-P");
        $str150$Skipping_meta_supports_for__S = SubLObjectFactory.makeString("Skipping meta-supports for ~S");
        $str151$Pruning_all_supports_for__S___due = SubLObjectFactory.makeString("Pruning all supports for ~S~% due to ~S");
        $str152$__Checking_for_literals_to_suppre = SubLObjectFactory.makeString("~&Checking for literals to suppress.~% Rule: ~S~% Mt: ~S~%");
        $str153$__Literals_to_suppress_____S__ = SubLObjectFactory.makeString("~&Literals to suppress:~% ~S~%");
        $kw154$IRRELEVANT = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $sym155$PPH_META_SUPPORT_SHOULD_PRECEDE_ = SubLObjectFactory.makeSymbol("PPH-META-SUPPORT-SHOULD-PRECEDE?");
        $const156$suppressLiteralForJustificationPa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suppressLiteralForJustificationParaphrase"));
        $kw157$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw158$SHALLOW = SubLObjectFactory.makeKeyword("SHALLOW");
        $kw159$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $kw160$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw161$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw163$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $kw164$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw165$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw166$HL = SubLObjectFactory.makeKeyword("HL");
        $kw167$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw168$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw169$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str170$Couldn_t_bind_variables_in_litera = SubLObjectFactory.makeString("Couldn't bind variables in literals to suppress for~% ~S~% given conclusion ~S~%");
        $sym171$EL_VARIABLE_P = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $sym172$SUBSTITUTE_PPH_VAR_BINDING = SubLObjectFactory.makeSymbol("SUBSTITUTE-PPH-VAR-BINDING");
        $str173$__Lit_candidates_for__S_____S = SubLObjectFactory.makeString("~&Lit candidates for ~S:~% ~S");
        $str174$__New_candidates_for__S___S__ = SubLObjectFactory.makeString("~&New candidates for ~S: ~S~%");
        $sym175$CYCL_VARIABLE_P = SubLObjectFactory.makeSymbol("CYCL-VARIABLE-P");
        $str176$Candidates_for__S___S = SubLObjectFactory.makeString("Candidates for ~S: ~S");
        $str177$Couldn_t_fully_bind_variables_in_ = SubLObjectFactory.makeString("Couldn't fully bind variables in lit to suppress: ~S");
        $kw178$OR = SubLObjectFactory.makeKeyword("OR");
        $kw179$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $str180$__Pruning_meta_supports____Input_ = SubLObjectFactory.makeString("~&Pruning meta supports.~% Input: ~S~% To Suppress: ~S~%");
        $str181$Pruning__S = SubLObjectFactory.makeString("Pruning ~S");
        $sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_ = SubLObjectFactory.makeSymbol("PPH-ALWAYS-SHOW-META-SUPPORT-FOR-MODULE?");
        $kw183$RTV = SubLObjectFactory.makeKeyword("RTV");
        $kw184$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $sym185$PPH_INVALID_SUPPORT_ = SubLObjectFactory.makeSymbol("PPH-INVALID-SUPPORT?");
        $str186$_2 = SubLObjectFactory.makeString("+2");
        $str187$Invalid = SubLObjectFactory.makeString("Invalid");
        $str188$_A__D = SubLObjectFactory.makeString("~A_~D");
        $str189$___is_a_trivial_support_ = SubLObjectFactory.makeString("...is a trivial support.");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REFORMULATE"));
        $sym191$PPH_TRANSFORMABLE_REDUNDANT_NART_P = SubLObjectFactory.makeSymbol("PPH-TRANSFORMABLE-REDUNDANT-NART-P");
        $sym192$PPH_TRANSFORM_REDUNDANT_NART = SubLObjectFactory.makeSymbol("PPH-TRANSFORM-REDUNDANT-NART");
        $sym193$PPH_CONSTANT_FOR_NART = SubLObjectFactory.makeSymbol("PPH-CONSTANT-FOR-NART");
        $sym194$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const195$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const196$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $kw197$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw198$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str199$Has_EL_variable_functor___S_ = SubLObjectFactory.makeString("Has EL variable functor: ~S.");
        $str200$Has_HL_variable_functor___S_ = SubLObjectFactory.makeString("Has HL variable functor: ~S.");
        $const201$interestingSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interestingSentence"));
        $const202$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $kw203$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str204$Has_irrelevant_FORT___S_in__S_ = SubLObjectFactory.makeString("Has irrelevant FORT: ~S in ~S.");
        $kw205$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $str206$Trivial_functional_sentence_ = SubLObjectFactory.makeString("Trivial functional sentence.");
        $const207$sentenceTrivialForJustificationPa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceTrivialForJustificationParaphrase"));
        $sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_ = SubLObjectFactory.makeSymbol("SENTENCE-HAS-TRIVIAL-ISOMORPHIC-ASSERTION?");
        $const209$The = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The"));
        $list210 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $const211$FunctionalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionalPredicate"));
        $list212 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?FN"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"));
        $const213$functionCorrespondingPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate"));
        $sym214$_FN = SubLObjectFactory.makeSymbol("?FN");
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"));
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $list217 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $str218$Trivial_functional_sentence_____S = SubLObjectFactory.makeString("Trivial functional sentence:~% ~S~%");
        $list219 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationFromFn")));
        $const220$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const222$CollectionUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $const223$instanceAndSpecSentencesTrivialFo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceAndSpecSentencesTrivialForJustificationParaphrase"));
        $const224$specSentencesTrivialForJustificat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("specSentencesTrivialForJustificationParaphrase"));
        $str225$Trivial___genls_sentence_____S__ = SubLObjectFactory.makeString("Trivial #$genls sentence:~% ~S~%");
        $const226$instanceSentencesTrivialForJustif = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceSentencesTrivialForJustificationParaphrase"));
        $const227$SingletonCollectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingletonCollectionFn"));
        $str228$Trivial___isa_sentence_____S__ = SubLObjectFactory.makeString("Trivial #$isa sentence:~% ~S~%");
        $const229$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym230$PPH_REQUIRED_SENTENCE_ = SubLObjectFactory.makeSymbol("PPH-REQUIRED-SENTENCE?");
        $const231$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const232$sentenceRequiredForJustificationP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceRequiredForJustificationParaphrase"));
        $const233$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym234$_AS = SubLObjectFactory.makeSymbol("?AS");
        $const235$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const236$assertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $list237 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionRequiredForJustificationParaphrase")), (SubLObject)SubLObjectFactory.makeSymbol("?AS")));
        $list238 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-NAT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NAT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("X")));
        $sym239$X = SubLObjectFactory.makeSymbol("X");
        $sym240$BIN_PRED = SubLObjectFactory.makeSymbol("BIN-PRED");
        $sym241$NAT = SubLObjectFactory.makeSymbol("NAT");
        $const242$reflexiveInArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reflexiveInArgs"));
        $sym243$PPH_TRIVIAL_TERM_ = SubLObjectFactory.makeSymbol("PPH-TRIVIAL-TERM?");
        $str244$_A_is_trivial_in__S = SubLObjectFactory.makeString("~A is trivial in ~S");
        $const245$predTrivialForJustificationParaph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predTrivialForJustificationParaphrase"));
        $const246$assertionTrivialForJustificationP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTrivialForJustificationParaphrase"));
        $str247$_S_is_an_unknown_triviality_type_ = SubLObjectFactory.makeString("~S is an unknown triviality type.");
        $const248$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw249$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $str250$additional_supports_ = SubLObjectFactory.makeString("additional_supports_");
        $str251$Additional_Supports = SubLObjectFactory.makeString("Additional Supports");
        $str252$_A_additional__D = SubLObjectFactory.makeString("~A_additional_~D");
        $str253$_from__A = SubLObjectFactory.makeString(" from ~A");
        $const254$sentenceHighlyRelevantForJustific = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceHighlyRelevantForJustificationParaphrase"));
        $kw255$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $kw256$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw257$ANY = SubLObjectFactory.makeKeyword("ANY");
        $str258$Generated__D_demerits_for__S = SubLObjectFactory.makeString("Generated ~D demerits for ~S");
        $sym259$_TEMPLATE = SubLObjectFactory.makeSymbol("?TEMPLATE");
        $const260$justificationTemplateAppliesToPro = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("justificationTemplateAppliesToProof"));
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)pph_proof.ONE_INTEGER);
        $list262 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?KA"), (SubLObject)SubLObjectFactory.makeString("K<sub>a</sub>")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?PH"), (SubLObject)SubLObjectFactory.makeString("pH")));
        $str263$Since_ = SubLObjectFactory.makeString("Since:");
        $str264$and_since_ = SubLObjectFactory.makeString("and since:");
        $sym265$_CONSTRAINT = SubLObjectFactory.makeSymbol("?CONSTRAINT");
        $const266$justificationTemplateApplicabilit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("justificationTemplateApplicabilityConstraint"));
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CONSTRAINT"));
        $str268$the_Henderson_Hasselbalch_equatio = SubLObjectFactory.makeString("the Henderson-Hasselbalch equation");
        $list269 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AqueousBufferSolution")));
        $str270$_sub = SubLObjectFactory.makeString("_sub");
        $sym271$_RULE_GLOSS_TEMPLATE = SubLObjectFactory.makeSymbol("?RULE-GLOSS-TEMPLATE");
        $const272$justificationGenerationRuleGlossT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("justificationGenerationRuleGlossTemplate"));
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RULE-GLOSS-TEMPLATE"));
        $str274$We_can_apply_the_rule__ = SubLObjectFactory.makeString("We can apply the rule: ");
        $kw275$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw276$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw277$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw278$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str279$_ = SubLObjectFactory.makeString("=");
        $kw280$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?KA"), (SubLObject)SubLObjectFactory.makeSymbol("?PH"));
        $sym282$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym283$INFERENCE_PROOF_GET_DEPTH = SubLObjectFactory.makeSymbol("INFERENCE-PROOF-GET-DEPTH");
        $str284$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str285$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw286$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym287$VALID_PROOF_VIEW_P = SubLObjectFactory.makeSymbol("VALID-PROOF-VIEW-P");
        $str288$pf_debug_proof_view = SubLObjectFactory.makeString("pf-debug proof-view");
        $str289$proof_view = SubLObjectFactory.makeString("proof-view");
        $str290$body = SubLObjectFactory.makeString("body");
        $str291$Query_ = SubLObjectFactory.makeString("Query:");
        $sym292$PROOF_VIEW_ENTRY_GET_LABEL = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-LABEL");
        $str293$justifications = SubLObjectFactory.makeString("justifications");
        $str294$yui_navset = SubLObjectFactory.makeString("yui-navset");
        $str295$yui_nav = SubLObjectFactory.makeString("yui-nav");
        $sym296$SUPPRESS_PROOF_VIEW_SECTION_WITH_ROOT_ = SubLObjectFactory.makeSymbol("SUPPRESS-PROOF-VIEW-SECTION-WITH-ROOT?");
        $str297$_ = SubLObjectFactory.makeString("#");
        $str298$selected = SubLObjectFactory.makeString("selected");
        $str299$tabErrorOutput = SubLObjectFactory.makeString("tabErrorOutput");
        $str300$Debugging_Messages = SubLObjectFactory.makeString("Debugging Messages");
        $str301$yui_content = SubLObjectFactory.makeString("yui-content");
        $str302$pfFilteredItems = SubLObjectFactory.makeString("pfFilteredItems");
        $sym303$PROOF_VIEW_TAB_ID_FOR_ENTRY = SubLObjectFactory.makeSymbol("PROOF-VIEW-TAB-ID-FOR-ENTRY");
        $sym304$ALPHANUMERIC_CHAR_P = SubLObjectFactory.makeSymbol("ALPHANUMERIC-CHAR-P");
        $str305$tab = SubLObjectFactory.makeString("tab");
        $sym306$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str307$pf_buttonbar = SubLObjectFactory.makeString("pf-buttonbar");
        $str308$bd = SubLObjectFactory.makeString("bd");
        $str309$pf_show_debugging = SubLObjectFactory.makeString("pf-show-debugging");
        $str310$pf_show_debugging_checkbox = SubLObjectFactory.makeString("pf-show-debugging-checkbox");
        $str311$Debugging_ = SubLObjectFactory.makeString("Debugging?");
        $str312$toggleDebug_this___body___ = SubLObjectFactory.makeString("toggleDebug(this, 'body');");
        $str313$pf_show_cycl_button = SubLObjectFactory.makeString("pf-show-cycl-button");
        $str314$pf_show_cycl_checkbox = SubLObjectFactory.makeString("pf-show-cycl-checkbox");
        $str315$show_cycl = SubLObjectFactory.makeString("show-cycl");
        $str316$toggleCycLVisible_this___body___ = SubLObjectFactory.makeString("toggleCycLVisible(this, 'body');");
        $str317$Show_CycL = SubLObjectFactory.makeString("Show CycL");
        $str318$pf_parameters = SubLObjectFactory.makeString("pf-parameters");
        $str319$Parameters = SubLObjectFactory.makeString("Parameters");
        $list320 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PARAM"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str321$right = SubLObjectFactory.makeString("right");
        $str322$left = SubLObjectFactory.makeString("left");
        $str323$pf_toc = SubLObjectFactory.makeString("pf-toc");
        $str324$Quick_Links = SubLObjectFactory.makeString("Quick Links");
        $list325 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ANCHOR"), (SubLObject)SubLObjectFactory.makeSymbol("LINKTEXT"));
        $list326 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#root"), (SubLObject)SubLObjectFactory.makeString("Root")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#query"), (SubLObject)SubLObjectFactory.makeString("Query and Answer")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#because"), (SubLObject)SubLObjectFactory.makeString("Key Facts")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#rules"), (SubLObject)SubLObjectFactory.makeString("Key Rules")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#details"), (SubLObject)SubLObjectFactory.makeString("Detailed Justification")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#linear"), (SubLObject)SubLObjectFactory.makeString("Linear Justification")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#filtered"), (SubLObject)SubLObjectFactory.makeString("Filtered Supports")));
        $str327$query = SubLObjectFactory.makeString("query");
        $str328$Root = SubLObjectFactory.makeString("Root");
        $str329$root = SubLObjectFactory.makeString("root");
        $str330$Key_Rules_ = SubLObjectFactory.makeString("Key Rules:");
        $str331$rules = SubLObjectFactory.makeString("rules");
        $str332$Because_ = SubLObjectFactory.makeString("Because:");
        $str333$because = SubLObjectFactory.makeString("because");
        $str334$Detailed_Justification_ = SubLObjectFactory.makeString("Detailed Justification:");
        $str335$details = SubLObjectFactory.makeString("details");
        $str336$Linear_Justification_ = SubLObjectFactory.makeString("Linear Justification:");
        $str337$linear = SubLObjectFactory.makeString("linear");
        $sym338$PPH_PROOF_INDENT = SubLObjectFactory.makeSymbol("PPH-PROOF-INDENT");
        $sym339$HTML_TABLE = SubLObjectFactory.makeSymbol("HTML-TABLE");
        $list340 = ConsesLow.list((SubLObject)pph_proof.ONE_INTEGER);
        $str341$filtered = SubLObjectFactory.makeString("filtered");
        $str342$Filtered_Supports = SubLObjectFactory.makeString("Filtered Supports");
        $str343$Reason___S = SubLObjectFactory.makeString("Reason: ~S");
        $kw344$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym345$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $const346$CycProofViewSummarySection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewSummarySection"));
        $const347$CycProofViewJustificationSection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewJustificationSection"));
        $sym348$CYC_PROOF_VIEW_SECTION_HTML = SubLObjectFactory.makeSymbol("CYC-PROOF-VIEW-SECTION-HTML");
        $str349$___S_handled_by__S__ = SubLObjectFactory.makeString("~&~S handled by ~S~%");
        $sym350$DEBUG_PROOF_VIEW_CB_LINK_FOR_TERM = SubLObjectFactory.makeSymbol("DEBUG-PROOF-VIEW-CB-LINK-FOR-TERM");
        $str351$pf_stepnum = SubLObjectFactory.makeString("pf-stepnum");
        $str352$pf_steprow = SubLObjectFactory.makeString("pf-steprow");
        $str353$pf_label = SubLObjectFactory.makeString("pf-label");
        $str354$_A = SubLObjectFactory.makeString("~A");
        $str355$pf_entry_content = SubLObjectFactory.makeString("pf-entry-content");
        $str356$pf_children = SubLObjectFactory.makeString("pf-children");
        $str357$Already_seen__S = SubLObjectFactory.makeString("Already seen ~S");
        $int358$200 = SubLObjectFactory.makeInteger(200);
        $str359$pf_paraphrase = SubLObjectFactory.makeString("pf-paraphrase");
        $str360$_4d_ = SubLObjectFactory.makeString("~4d ");
        $sym361$PROOF_VIEW_ENTRY_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-P");
        $str362$pf_object_pf_entry_struct = SubLObjectFactory.makeString("pf-object pf-entry-struct");
        $str363$pf_object = SubLObjectFactory.makeString("pf-object");
        $str364$pf_proof = SubLObjectFactory.makeString("pf-proof");
        $str365$Proof__ = SubLObjectFactory.makeString("Proof: ");
        $str366$pf_function = SubLObjectFactory.makeString("pf-function");
        $str367$Function___S = SubLObjectFactory.makeString("Function: ~S");
        $str368$pf_function_section = SubLObjectFactory.makeString("pf-function-section");
        $str369$Section___S = SubLObjectFactory.makeString("Section: ~S");
        $kw370$QUERY_SENTENCE = SubLObjectFactory.makeKeyword("QUERY-SENTENCE");
        $sym371$EL_TERM_P = SubLObjectFactory.makeSymbol("EL-TERM-P");
        $sym372$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym373$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym374$EL_SENTENCE_P = SubLObjectFactory.makeSymbol("EL-SENTENCE-P");
        $kw375$PREMISE = SubLObjectFactory.makeKeyword("PREMISE");
        $kw376$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw377$CONCLUSION = SubLObjectFactory.makeKeyword("CONCLUSION");
        $kw378$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $kw379$SECTION_ROOT = SubLObjectFactory.makeKeyword("SECTION-ROOT");
        $str380$pf_entry_ = SubLObjectFactory.makeString("pf-entry ");
        $str381$pf_ = SubLObjectFactory.makeString("pf-");
        $list382 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION-BOOKKEEPING"), (SubLObject)SubLObjectFactory.makeKeyword("UNSUPPORTED-SUPPORT"));
        $str383$Inferred_ = SubLObjectFactory.makeString("Inferred:");
        $str384$Asserted_ = SubLObjectFactory.makeString("Asserted:");
        $str385$Opaque_ = SubLObjectFactory.makeString("Opaque:");
        $kw386$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw387$POS = SubLObjectFactory.makeKeyword("POS");
        $sym388$PPH_TRIVIAL_NEG_LIT_ = SubLObjectFactory.makeSymbol("PPH-TRIVIAL-NEG-LIT?");
        $const389$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym390$ATOMIC_SENTENCE_PREDICATE = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $list391 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("EVALUATABLE-EXPRESSION"));
        $const392$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $sym393$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym394$PROOF_SUID = SubLObjectFactory.makeSymbol("PROOF-SUID");
        $sym395$PPH_PROOF_CONCLUSION = SubLObjectFactory.makeSymbol("PPH-PROOF-CONCLUSION");
        $sym396$PPH_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_ = SubLObjectFactory.makeSymbol("PPH-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?");
        $sym397$PPH_FIND_ASSERTION_FOR_SUPPORT = SubLObjectFactory.makeSymbol("PPH-FIND-ASSERTION-FOR-SUPPORT");
        $sym398$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym399$EARLIER_DEDUCTION_P = SubLObjectFactory.makeSymbol("EARLIER-DEDUCTION-P");
        $sym400$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $sym401$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym402$PPH_SUPPORT_TREE_P = SubLObjectFactory.makeSymbol("PPH-SUPPORT-TREE-P");
        $list403 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBNODES"));
        $sym404$PPH_PREFER_DEDUCTION_ = SubLObjectFactory.makeSymbol("PPH-PREFER-DEDUCTION?");
        $sym405$EXPRESSION_FIND = SubLObjectFactory.makeSymbol("EXPRESSION-FIND");
        $sym406$PPH_ASSERTION_HAS_GLOSS_ = SubLObjectFactory.makeSymbol("PPH-ASSERTION-HAS-GLOSS?");
        $list407 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-ARGS"));
        $kw408$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $str409$HL_VERIFY_failure_on_valid_suppor = SubLObjectFactory.makeString("HL-VERIFY failure on valid support:~% ~S~%");
        $list410 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), (SubLObject)pph_proof.T, (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)pph_proof.NIL);
        $list411 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"));
        $kw412$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $kw413$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $list414 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")));
        $const415$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $list416 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $list417 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL1"), (SubLObject)SubLObjectFactory.makeSymbol("GENL2"));
        $kw418$DESCENDING = SubLObjectFactory.makeKeyword("DESCENDING");
        $str419$No_THCL_or_non_irrelevant_collect = SubLObjectFactory.makeString("No THCL or non-irrelevant collections between ~S and ~S in ~S");
        $float420$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $sym421$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym422$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $kw423$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw424$QUIET = SubLObjectFactory.makeKeyword("QUIET");
        $sym425$NEW_PPH_SENTENCE = SubLObjectFactory.makeSymbol("NEW-PPH-SENTENCE");
        $const426$appropriateResponseContent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("appropriateResponseContent"));
        $const427$BestSupportSentenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BestSupportSentenceFn"));
        $kw428$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $sym429$VARIABLE_BINDING_VALUE = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-VALUE");
        $kw430$REMOVED_SUPPORTS_THAT_DONT_MENTION_BINDING_VALUES = SubLObjectFactory.makeKeyword("REMOVED-SUPPORTS-THAT-DONT-MENTION-BINDING-VALUES");
        $sym431$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw432$USED_SUPPORTS_THAT_MENTION_MOST_PROVEN_SENTENCE_FORTS = SubLObjectFactory.makeKeyword("USED-SUPPORTS-THAT-MENTION-MOST-PROVEN-SENTENCE-FORTS");
        $sym433$PPH_EXPLANATION_SENTENCE_FROM_SUPPORT = SubLObjectFactory.makeSymbol("PPH-EXPLANATION-SENTENCE-FROM-SUPPORT");
        $const434$authorityClaims_Term = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("authorityClaims-Term"));
        $str435$_S___has_too_many_bindings__no_mo = SubLObjectFactory.makeString("~S~% has too many bindings (no more than 1 is allowed).");
        $const436$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
    }
}

/*

	Total time: 6081 ms
	 synthetic 
*/