package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parsing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.parsing_utilities";
    public static final String myFingerPrint = "f8c37047cc61e2eddeda38cc3e2ede317d6a0a010542c18857c8ec18f22a2414";
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 5361L)
    private static SubLSymbol $parse_noun_compound_valid_non_alpha_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 5813L)
    private static SubLSymbol $nl_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 5917L)
    private static SubLSymbol $nl_tag_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 6010L)
    private static SubLSymbol $nl_tag_denoting_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11707L)
    private static SubLSymbol $make_nl_tag_template_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 14962L)
    private static SubLSymbol $nl_max_floor_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 19341L)
    private static SubLSymbol $spps_to_nl_numbers$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 22931L)
    private static SubLSymbol $npp_name_preds_to_exclude$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 30057L)
    private static SubLSymbol $ra1p_rae_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 30150L)
    private static SubLSymbol $ra1p_ra1_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 30242L)
    private static SubLSymbol $ra1p_show_pairsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 41153L)
    private static SubLSymbol $recently_created_parse_tree_elements$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 41325L)
    public static SubLSymbol $remember_new_parse_tree_elementsP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 54263L)
    private static SubLSymbol $penntag_phrase_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 55306L)
    private static SubLSymbol $penntag_forts$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 63894L)
    public static SubLSymbol $good_parsing_pile$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 65356L)
    public static SubLSymbol $bad_parsing_pile$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 74257L)
    private static SubLSymbol $parse_as_typeP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLSymbol $dtp_parse_iterator$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLSymbol $dtp_cyclify_iterator$;
    private static final SubLSymbol $kw0$NONE;
    private static final SubLSymbol $kw1$BEST_ONLY;
    private static final SubLSymbol $sym2$NPP_PARSE_CYCL;
    private static final SubLSymbol $kw3$EVERYTHING;
    private static final SubLSymbol $kw4$ANY;
    private static final SubLObject $const5$Definite_NLAttr;
    private static final SubLSymbol $sym6$INSTANCES_OF_COLLECTION_PARSE;
    private static final SubLSymbol $sym7$_X;
    private static final SubLObject $const8$isa;
    private static final SubLSymbol $kw9$MAX_NUMBER;
    private static final SubLSymbol $kw10$MAX_TIME;
    private static final SubLSymbol $kw11$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $sym12$PARSE_NOUN_COMPOUND_VALID_CHAR_P;
    private static final SubLObject $const13$UniversalVocabularyMt;
    private static final SubLString $str14$___0123456789;
    private static final SubLSymbol $sym15$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const16$EverythingPSC;
    private static final SubLObject $const17$NLUtteranceAttribute;
    private static final SubLSymbol $kw18$BREADTH;
    private static final SubLSymbol $kw19$QUEUE;
    private static final SubLSymbol $kw20$STACK;
    private static final SubLSymbol $sym21$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw22$ERROR;
    private static final SubLString $str23$_A_is_not_a__A;
    private static final SubLSymbol $sym24$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw25$CERROR;
    private static final SubLString $str26$continue_anyway;
    private static final SubLSymbol $kw27$WARN;
    private static final SubLString $str28$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const29$genls;
    private static final SubLSymbol $kw30$GAF;
    private static final SubLSymbol $kw31$TRUE;
    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str33$attempting_to_bind_direction_link;
    private static final SubLString $str34$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const35$genlFuncs;
    private static final SubLObject $const36$NLTagFn;
    private static final SubLObject $const37$resultIsa;
    private static final SubLObject $const38$InferencePSC;
    private static final SubLSymbol $sym39$STRIP_NL_TAGS;
    private static final SubLSymbol $kw40$DEFINITENESS;
    private static final SubLObject $const41$NLDefinitenessFn_3;
    private static final SubLSymbol $kw42$QUANT;
    private static final SubLObject $const43$NLQuantFn_3;
    private static final SubLString $str44$Can_t_find_ternary_NL_tag_fn_for_;
    private static final SubLObject $const45$NLDefinitenessFn;
    private static final SubLObject $const46$NLQuantFn;
    private static final SubLSymbol $kw47$NUMBER;
    private static final SubLObject $const48$NLNumberFn;
    private static final SubLString $str49$Can_t_find_binary_NL_tag_fn_for__;
    private static final SubLSymbol $sym50$MAKE_NL_TAG_TEMPLATE;
    private static final SubLSymbol $sym51$_MAKE_NL_TAG_TEMPLATE_CACHING_STATE_;
    private static final SubLSymbol $sym52$NL_TAG_;
    private static final SubLString $str53$Couldn_t_determine_NL_number_for_;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$DETERMINER_NUMBER_DENOT_;
    private static final SubLObject $const56$ScalarInterval;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$NL_MAX_FLOOR_PREDS;
    private static final SubLSymbol $sym61$_NL_MAX_FLOOR_PREDS_CACHING_STATE_;
    private static final SubLInteger $int62$256;
    private static final SubLObject $const63$PronounFn;
    private static final SubLSymbol $sym64$CYCL_PRONOUN_P;
    private static final SubLObject $const65$UnmarkedNumber_NLAttr;
    private static final SubLObject $const66$SubcollectionFunction;
    private static final SubLObject $const67$Ungendered_NLAttr;
    private static final SubLObject $const68$NLNumberAttribute;
    private static final SubLObject $const69$NLDefinitenessAttribute;
    private static final SubLObject $const70$NLGenderAttribute;
    private static final SubLSymbol $sym71$KB_NL_NUMBER_ATTRIBUTE_P;
    private static final SubLObject $const72$Generic_NLAttr;
    private static final SubLObject $const73$Mass_NLAttr;
    private static final SubLObject $const74$Plural_NLAttr;
    private static final SubLSymbol $sym75$KB_NL_GENDER_ATTRIBUTE_P;
    private static final SubLObject $const76$nonPlural_Generic;
    private static final SubLObject $const77$Singular_NLAttr;
    private static final SubLObject $const78$singular_Generic;
    private static final SubLObject $const79$plural_Generic;
    private static final SubLObject $const80$massNumber_Generic;
    private static final SubLSymbol $sym81$_SPPS_TO_NL_NUMBERS_;
    private static final SubLInteger $int82$128;
    private static final SubLObject $const83$partOfSpeech;
    private static final SubLSymbol $kw84$INITIALIZED;
    private static final SubLObject $const85$CollectionSubsetFn;
    private static final SubLObject $const86$TheSetOf;
    private static final SubLObject $const87$SubcollectionRelationFunction;
    private static final SubLObject $const88$ProperNamePredicate_ExcludedFromN;
    private static final SubLSymbol $kw89$UNINITIALIZED;
    private static final SubLSymbol $sym90$ROOT_MT;
    private static final SubLSymbol $sym91$PSP_WEIGHT_P;
    private static final SubLSymbol $sym92$FLOATP;
    private static final SubLSymbol $kw93$INTEGER;
    private static final SubLSymbol $kw94$FLOAT;
    private static final SubLSymbol $sym95$KEYWORDP;
    private static final SubLObject $const96$TheVPParse;
    private static final SubLObject $const97$SomeFn;
    private static final SubLObject $const98$TheResultOfParsing;
    private static final SubLSymbol $sym99$RESULT_OF_PARSING_FORMULA_;
    private static final SubLObject $const100$ParsingTemplateCategory;
    private static final SubLString $str101$_A_doesn_t_genl_to___ParsingTempl;
    private static final SubLList $list102;
    private static final SubLObject $const103$MiddleVoiceFrame;
    private static final SubLObject $const104$and;
    private static final SubLSymbol $kw105$ACTION;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLObject $const108$doneBy;
    private static final SubLObject $const109$patient_GenericDirect;
    private static final SubLObject $const110$patient_GenericIndirect;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$ALL_SPEC_PREDICATES;
    private static final SubLObject $const113$requiredArg1Pred;
    private static final SubLSymbol $sym114$SECOND;
    private static final SubLSymbol $sym115$GENL_PRED_;
    private static final SubLSymbol $sym116$GENL_;
    private static final SubLSymbol $sym117$FIRST;
    private static final SubLSymbol $sym118$SPEC_PRED_;
    private static final SubLList $list119;
    private static final SubLObject $const120$VariableFn;
    private static final SubLString $str121$0;
    private static final SubLString $str122$_;
    private static final SubLObject $const123$parsingConflateTo;
    private static final SubLSymbol $sym124$NART_TO_NAUT;
    private static final SubLObject $const125$rewriteOf;
    private static final SubLObject $const126$ParseTreeReificationTemplate;
    private static final SubLObject $const127$SyntacticNode;
    private static final SubLObject $const128$LexicalNode;
    private static final SubLObject $const129$SyntacticChoiceNode;
    private static final SubLObject $const130$syntacticNodeNthDaughter;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$_;
    private static final SubLObject $const134$syntacticDaughters;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$_MOTHER;
    private static final SubLList $list138;
    private static final SubLObject $const139$proposedMeaning;
    private static final SubLObject $const140$dependentMeaning;
    private static final SubLSymbol $sym141$_MEANING;
    private static final SubLList $list142;
    private static final SubLList $list143;
    private static final SubLList $list144;
    private static final SubLSymbol $kw145$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw146$MT;
    private static final SubLSymbol $kw147$PRED;
    private static final SubLSymbol $sym148$THIS_MEANING;
    private static final SubLSymbol $sym149$CDOLIST;
    private static final SubLSymbol $sym150$SYNTACTIC_NODE_PROPOSED_MEANINGS;
    private static final SubLSymbol $sym151$CPUSHNEW;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$THIS_MEANING;
    private static final SubLSymbol $sym154$LIST;
    private static final SubLSymbol $sym155$CLET;
    private static final SubLList $list156;
    private static final SubLString $str157$ParseTreeElement;
    private static final SubLSymbol $kw158$UPCASE;
    private static final SubLSymbol $sym159$_INSTANCE;
    private static final SubLString $str160$Can_t_hypothesize_instance_of__S_;
    private static final SubLObject $const161$syntacticNodeCreator;
    private static final SubLObject $const162$optionNodes;
    private static final SubLObject $const163$CycParseTree;
    private static final SubLObject $const164$syntacticRootOfParseTree;
    private static final SubLObject $const165$ContentMtOfParseTreeFn;
    private static final SubLObject $const166$syntacticNodeCategory;
    private static final SubLObject $const167$syntacticNodeString;
    private static final SubLObject $const168$syntacticNodePhraseStructureRule;
    private static final SubLObject $const169$tokenString;
    private static final SubLObject $const170$tokenStartCharacterOffset;
    private static final SubLString $str171$Token_node_mismatch__Token___S_st;
    private static final SubLObject $const172$syntacticNodeCoversToken;
    private static final SubLObject $const173$CycParsingTokenContiguousSetFn;
    private static final SubLObject $const174$syntacticNodeCoversTokenSet;
    private static final SubLObject $const175$syntacticNodeStartCharacterOffset;
    private static final SubLObject $const176$syntacticNodeAgreementPredicate;
    private static final SubLObject $const177$nodeInSystem;
    private static final SubLObject $const178$syntacticNodePennTag;
    private static final SubLObject $const179$contentMtOfParseTree;
    private static final SubLSymbol $kw180$TOKEN;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLSymbol $sym184$LAST_TOKEN_NUM;
    private static final SubLSymbol $sym185$FIRST_TOKEN_NUM;
    private static final SubLString $str186$Couldn_t_get_interval_span_for__S;
    private static final SubLObject $const187$lexicalNodeCreator;
    private static final SubLObject $const188$lexicalNodeCoversToken;
    private static final SubLObject $const189$lexicalNodeCoversTokenSet;
    private static final SubLSymbol $sym190$_N;
    private static final SubLList $list191;
    private static final SubLObject $const192$syntacticNodeNthContributor;
    private static final SubLObject $const193$syntacticNodeHeadDaughter;
    private static final SubLObject $const194$SubLQuoteFn;
    private static final SubLSymbol $sym195$SYNTACTIC_NODE_TO_NESTED_LIST;
    private static final SubLString $str196$;
    private static final SubLString $str197$Couldn_t_find_string_for__S;
    private static final SubLString $str198$_;
    private static final SubLString $str199$Bad_dtrs___S;
    private static final SubLSymbol $sym200$INTERVAL_SPAN_P;
    private static final SubLString $str201$Can_t_get_span_start_from__S;
    private static final SubLString $str202$Can_t_get_span_end_from__S;
    private static final SubLSymbol $sym203$_PENNTAG_PHRASE_CATEGORIES_;
    private static final SubLList $list204;
    private static final SubLList $list205;
    private static final SubLList $list206;
    private static final SubLSymbol $sym207$FORT_P;
    private static final SubLSymbol $sym208$_PENNTAG_FORTS_;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$STRINGP;
    private static final SubLSymbol $sym212$_TOKEN;
    private static final SubLObject $const213$nthTokenInTokenization;
    private static final SubLList $list214;
    private static final SubLSymbol $sym215$NON_NEGATIVE_INTEGER_P;
    private static final SubLObject $const216$CycParsingToken;
    private static final SubLString $str217$Failed_to_compute_start_offset_fo;
    private static final SubLObject $const218$tokenTokenization;
    private static final SubLObject $const219$pegTokenizations;
    private static final SubLObject $const220$tokenizationInputString;
    private static final SubLObject $const221$numberOfTokensInTokenization;
    private static final SubLSymbol $sym222$CONSTRUCT_PARSE_EXPRESSION_FROM_SYNTACTIC_NODE;
    private static final SubLSymbol $sym223$PHRASAL_NODE_;
    private static final SubLSymbol $sym224$GET_DAUGHTER;
    private static final SubLString $str225$Couldn_t_find_dtr__S_of__S;
    private static final SubLList $list226;
    private static final SubLSymbol $sym227$_GOOD_PARSING_PILE_;
    private static final SubLSymbol $sym228$_BAD_PARSING_PILE_;
    private static final SubLList $list229;
    private static final SubLSymbol $sym230$CPUSH;
    private static final SubLList $list231;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLList $list234;
    private static final SubLSymbol $sym235$FILTER_RESPONSE;
    private static final SubLSymbol $sym236$SOME_GOOD;
    private static final SubLSymbol $sym237$SOME_BAD;
    private static final SubLSymbol $sym238$THIS_CANDIDATE;
    private static final SubLList $list239;
    private static final SubLList $list240;
    private static final SubLSymbol $sym241$FUNCALL;
    private static final SubLSymbol $sym242$PIF;
    private static final SubLSymbol $sym243$CONS;
    private static final SubLSymbol $sym244$PWHEN;
    private static final SubLSymbol $sym245$PROPER_LIST_P;
    private static final SubLSymbol $sym246$CSETQ;
    private static final SubLList $list247;
    private static final SubLSymbol $sym248$PROGN;
    private static final SubLObject $const249$SubcollectionRelationFunction_Can;
    private static final SubLObject $const250$SubcollectionRelationFunction_Typ;
    private static final SubLObject $const251$SubcollectionRelationFunction_Inv;
    private static final SubLList $list252;
    private static final SubLList $list253;
    private static final SubLSymbol $sym254$PARSE_AS_TYPE_;
    private static final SubLObject $const255$unknownSentence;
    private static final SubLObject $const256$disjointWith;
    private static final SubLList $list257;
    private static final SubLSymbol $sym258$_PARSE_AS_TYPE__CACHING_STATE_;
    private static final SubLObject $const259$Unity;
    private static final SubLObject $const260$IntervalRangeFn;
    private static final SubLObject $const261$Date;
    private static final SubLString $str262$_;
    private static final SubLList $list263;
    private static final SubLSymbol $sym264$PARSE_ITERATOR;
    private static final SubLSymbol $sym265$PARSE_ITERATOR_P;
    private static final SubLList $list266;
    private static final SubLList $list267;
    private static final SubLList $list268;
    private static final SubLList $list269;
    private static final SubLSymbol $sym270$PRINT_PARSE_ITERATOR;
    private static final SubLSymbol $sym271$PARSE_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list272;
    private static final SubLSymbol $sym273$PI_SUB_ITERATORS;
    private static final SubLSymbol $sym274$_CSETF_PI_SUB_ITERATORS;
    private static final SubLSymbol $sym275$PI_PROPERTIES;
    private static final SubLSymbol $sym276$_CSETF_PI_PROPERTIES;
    private static final SubLSymbol $sym277$PI_CURRENT_ITERATOR_INDEX;
    private static final SubLSymbol $sym278$_CSETF_PI_CURRENT_ITERATOR_INDEX;
    private static final SubLSymbol $sym279$PI_STRING;
    private static final SubLSymbol $sym280$_CSETF_PI_STRING;
    private static final SubLSymbol $sym281$PI_PREVIOUS_PARSES;
    private static final SubLSymbol $sym282$_CSETF_PI_PREVIOUS_PARSES;
    private static final SubLSymbol $sym283$PI_NEXT;
    private static final SubLSymbol $sym284$_CSETF_PI_NEXT;
    private static final SubLSymbol $kw285$SUB_ITERATORS;
    private static final SubLSymbol $kw286$PROPERTIES;
    private static final SubLSymbol $kw287$CURRENT_ITERATOR_INDEX;
    private static final SubLSymbol $kw288$STRING;
    private static final SubLSymbol $kw289$PREVIOUS_PARSES;
    private static final SubLSymbol $kw290$NEXT;
    private static final SubLString $str291$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw292$BEGIN;
    private static final SubLSymbol $sym293$MAKE_PARSE_ITERATOR;
    private static final SubLSymbol $kw294$SLOT;
    private static final SubLSymbol $kw295$END;
    private static final SubLSymbol $sym296$VISIT_DEFSTRUCT_OBJECT_PARSE_ITERATOR_METHOD;
    private static final SubLString $str297$__parse_iterator__S_current_iter_;
    private static final SubLSymbol $sym298$PARSE_ITERATOR_DONE;
    private static final SubLSymbol $sym299$PARSE_ITERATOR_NEXT;
    private static final SubLSymbol $kw300$PARSERS;
    private static final SubLList $list301;
    private static final SubLObject $const302$CycRecursiveTemplateParser;
    private static final SubLObject $const303$CharniakParserCyclifier;
    private static final SubLSymbol $sym304$EQUALS_EL_;
    private static final SubLSymbol $kw305$FAILURE;
    private static final SubLSymbol $sym306$CYCLIFY_ITERATOR;
    private static final SubLSymbol $sym307$CYCLIFY_ITERATOR_P;
    private static final SubLList $list308;
    private static final SubLList $list309;
    private static final SubLList $list310;
    private static final SubLList $list311;
    private static final SubLSymbol $sym312$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym313$CYCLIFY_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list314;
    private static final SubLSymbol $sym315$CYCLIFY_ITERATOR_ITER_OBJ;
    private static final SubLSymbol $sym316$_CSETF_CYCLIFY_ITERATOR_ITER_OBJ;
    private static final SubLSymbol $kw317$ITER_OBJ;
    private static final SubLSymbol $sym318$MAKE_CYCLIFY_ITERATOR;
    private static final SubLSymbol $sym319$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_ITERATOR_METHOD;
    private static final SubLSymbol $sym320$CYCLIFY_ITERATOR_DONE;
    private static final SubLSymbol $sym321$CYCLIFY_ITERATOR_NEXT;
    private static final SubLSymbol $kw322$FAIL;
    private static final SubLSymbol $sym323$HAS_NEXT_;
    private static final SubLSymbol $sym324$NEXT;
    private static final SubLObject $const325$NLWordForm;
    private static final SubLSymbol $kw326$L2R;
    private static final SubLSymbol $sym327$_STRING;
    private static final SubLObject $const328$originalPhrase;
    private static final SubLList $list329;
    private static final SubLObject $const330$TextualEntailmentGenericBackgroun;
    private static final SubLSymbol $kw331$TEXTUAL_INFERENCE;
    private static final SubLObject $const332$contentModelFocalPeg;
    private static final SubLList $list333;
    private static final SubLSymbol $sym334$CYCL_SENTENCE_P;
    private static final SubLObject $const335$ebmtNLToCycLTrainingExample;
    private static final SubLObject $const336$Quote;
    private static final SubLObject $const337$EBMTTrainingExamplesFromQLMt;
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 760L)
    public static SubLObject parse_noun_compound_with_types(SubLObject string, final SubLObject good_list, final SubLObject bad_list, final SubLObject ignore_subcolfnsP, SubLObject instance_limit, SubLObject try_unknown_stringsP) {
        if (instance_limit == parsing_utilities.UNPROVIDED) {
            instance_limit = (SubLObject)parsing_utilities.TEN_INTEGER;
        }
        if (try_unknown_stringsP == parsing_utilities.UNPROVIDED) {
            try_unknown_stringsP = (SubLObject)parsing_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)parsing_utilities.NIL;
        string = clean_string_for_parse_noun_compound(string);
        if (parsing_utilities.NIL != string_utilities.non_empty_stringP(string)) {
            final SubLObject _prev_bind_0 = parsing_vars.$npp_max_rules_per_compound$.currentBinding(thread);
            try {
                parsing_vars.$npp_max_rules_per_compound$.bind((SubLObject)parsing_utilities.TWO_INTEGER, thread);
                SubLObject start_index = (SubLObject)parsing_utilities.NIL;
                SubLObject end_index = (SubLObject)parsing_utilities.NIL;
                SubLObject chart = (SubLObject)parsing_utilities.NIL;
                if (parsing_utilities.NIL == parsing_vars.$psp_chart$.getDynamicValue(thread) || parsing_utilities.NIL != parsing_macros.psp_chart_matches_gap_type_p(parsing_vars.$psp_chart$.getDynamicValue(thread), (SubLObject)parsing_utilities.$kw0$NONE)) {
                    thread.resetMultipleValues();
                    final SubLObject start_index_$1 = psp_main.psp_find_string_in_charts(string, parsing_vars.$psp_chart$.getDynamicValue(thread), parsing_vars.$psp_extra_charts$.getDynamicValue(thread));
                    final SubLObject end_index_$2 = thread.secondMultipleValue();
                    final SubLObject chart_$3 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    start_index = start_index_$1;
                    end_index = end_index_$2;
                    chart = chart_$3;
                }
                if (parsing_utilities.NIL != start_index) {
                    final SubLObject _prev_bind_0_$4 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_chart_start_index$.bind(start_index, thread);
                        parsing_vars.$psp_chart_end_index$.bind(end_index, thread);
                        parsing_vars.$psp_chart$.bind(chart, thread);
                        psp_syntax.psp_chart_do_syntactic_parsing(chart, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                        try {
                            parsing_vars.$psp_return_mode$.bind((SubLObject)parsing_utilities.$kw1$BEST_ONLY, thread);
                            parses = parse_noun_compound_with_types_int(string, good_list, bad_list, ignore_subcolfnsP, instance_limit);
                        }
                        finally {
                            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0_$5, thread);
                        }
                        if (parsing_utilities.NIL == parses) {
                            if (parsing_utilities.NIL != try_unknown_stringsP && parsing_utilities.NIL != psp_chart.psp_chart_has_unknown_stringsP((SubLObject)parsing_utilities.UNPROVIDED)) {
                                parses = filter_noun_compound_parses_by_types(Sequences.delete_duplicates(Mapping.mapcar((SubLObject)parsing_utilities.$sym2$NPP_PARSE_CYCL, noun_compound_parser.parse_noun_compound(string, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)), Symbols.symbol_function((SubLObject)parsing_utilities.EQUAL), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), good_list, bad_list, ignore_subcolfnsP, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                            else {
                                final SubLObject _prev_bind_0_$6 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                                try {
                                    parsing_vars.$psp_return_mode$.bind((SubLObject)parsing_utilities.$kw3$EVERYTHING, thread);
                                    parses = parse_noun_compound_with_types_int(string, good_list, bad_list, ignore_subcolfnsP, instance_limit);
                                }
                                finally {
                                    parsing_vars.$psp_return_mode$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                    }
                    finally {
                        parsing_vars.$psp_chart$.rebind(_prev_bind_3, thread);
                        parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_2, thread);
                        parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$7 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_chart_start_index$.bind((SubLObject)parsing_utilities.ZERO_INTEGER, thread);
                        parsing_vars.$psp_chart_end_index$.bind((SubLObject)parsing_utilities.NIL, thread);
                        final SubLObject chart_$4 = psp_syntax.psp_chart_for_string(string, parsing_macros.get_psp_lexicon(), (SubLObject)parsing_utilities.$kw0$NONE, (SubLObject)parsing_utilities.UNPROVIDED);
                        final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_$4);
                        final SubLObject _prev_bind_0_$8 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                            try {
                                final SubLObject _prev_bind_0_$9 = parsing_vars.$psp_chart$.currentBinding(thread);
                                try {
                                    parsing_vars.$psp_chart$.bind(chart_$4, thread);
                                    final SubLObject _prev_bind_0_$10 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                                    try {
                                        parsing_vars.$psp_return_mode$.bind((SubLObject)parsing_utilities.$kw1$BEST_ONLY, thread);
                                        parses = parse_noun_compound_with_types_int(string, good_list, bad_list, ignore_subcolfnsP, instance_limit);
                                    }
                                    finally {
                                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    if (parsing_utilities.NIL == parses) {
                                        if (parsing_utilities.NIL != try_unknown_stringsP && parsing_utilities.NIL != psp_chart.psp_chart_has_unknown_stringsP((SubLObject)parsing_utilities.UNPROVIDED)) {
                                            parses = filter_noun_compound_parses_by_types(Sequences.delete_duplicates(Mapping.mapcar((SubLObject)parsing_utilities.$sym2$NPP_PARSE_CYCL, noun_compound_parser.parse_noun_compound(string, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)), Symbols.symbol_function((SubLObject)parsing_utilities.EQUAL), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), good_list, bad_list, ignore_subcolfnsP, (SubLObject)parsing_utilities.UNPROVIDED);
                                        }
                                        else {
                                            final SubLObject _prev_bind_0_$11 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                                            try {
                                                parsing_vars.$psp_return_mode$.bind((SubLObject)parsing_utilities.$kw3$EVERYTHING, thread);
                                                parses = parse_noun_compound_with_types_int(string, good_list, bad_list, ignore_subcolfnsP, instance_limit);
                                            }
                                            finally {
                                                parsing_vars.$psp_return_mode$.rebind(_prev_bind_0_$11, thread);
                                            }
                                        }
                                    }
                                    if (parsing_utilities.NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue(thread)) {
                                        psp_chart.destroy_psp_chart((SubLObject)parsing_utilities.UNPROVIDED);
                                    }
                                }
                                finally {
                                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        }
                        finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    finally {
                        parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_2, thread);
                        parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                parsing_vars.$npp_max_rules_per_compound$.rebind(_prev_bind_0, thread);
            }
        }
        return parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 1999L)
    public static SubLObject parse_noun_compound_with_types_int(final SubLObject string, final SubLObject good_list, final SubLObject bad_list, final SubLObject ignore_subcolfnsP, SubLObject instance_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$use_ternary_np_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)parsing_utilities.T, thread);
            parsing_vars.$use_ternary_np_tagsP$.bind((SubLObject)parsing_utilities.NIL, thread);
            parses = psp_main.ps_get_cycls_for_phrase(string, (SubLObject)parsing_utilities.$kw4$ANY, (SubLObject)parsing_utilities.$kw4$ANY, (SubLObject)parsing_utilities.T, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        }
        finally {
            parsing_vars.$use_ternary_np_tagsP$.rebind(_prev_bind_2, thread);
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
        }
        if (parsing_utilities.NIL != list_utilities.non_empty_list_p(parses)) {
            if (parsing_utilities.NIL != subl_promotions.positive_integer_p(instance_limit) && parsing_utilities.NIL == noun_compound_parses_mostly_definiteP(parses)) {
                instance_limit = (SubLObject)parsing_utilities.ZERO_INTEGER;
            }
            parses = strip_nl_tags(parses, (SubLObject)parsing_utilities.UNPROVIDED);
            parses = ConsesLow.append(parses, instances_of_collection_parses(parses, instance_limit));
            parses = filter_noun_compound_parses_by_types(parses, good_list, bad_list, ignore_subcolfnsP, (SubLObject)parsing_utilities.UNPROVIDED);
        }
        return parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 2917L)
    public static SubLObject noun_compound_parses_mostly_definiteP(final SubLObject parses) {
        SubLObject threshold;
        SubLObject number_of_definite;
        SubLObject rest;
        SubLObject cycl;
        for (threshold = Numbers.divide(Sequences.length(parses), (SubLObject)parsing_utilities.TWO_INTEGER), number_of_definite = (SubLObject)parsing_utilities.ZERO_INTEGER, rest = (SubLObject)parsing_utilities.NIL, rest = parses; !number_of_definite.numGE(threshold) && parsing_utilities.NIL != rest; rest = rest.rest()) {
            cycl = rest.first();
            if (parsing_utilities.$const5$Definite_NLAttr.eql(nl_definiteness_attr_for_cycl(cycl))) {
                number_of_definite = Numbers.add(number_of_definite, (SubLObject)parsing_utilities.ONE_INTEGER);
            }
        }
        return Numbers.numGE(number_of_definite, threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 3266L)
    public static SubLObject instances_of_collection_parses(final SubLObject parses, final SubLObject instance_limit) {
        SubLObject result = (SubLObject)parsing_utilities.NIL;
        if (!instance_limit.isZero()) {
            SubLObject cdolist_list_var = parses;
            SubLObject parse = (SubLObject)parsing_utilities.NIL;
            parse = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                if (parsing_utilities.NIL != fort_types_interface.isa_collectionP(parse, (SubLObject)parsing_utilities.UNPROVIDED)) {
                    result = ConsesLow.append(result, instances_of_collection_parse(parse, instance_limit));
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        return list_utilities.fast_delete_duplicates(result, Symbols.symbol_function((SubLObject)parsing_utilities.EQUAL), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 4025L)
    public static SubLObject instances_of_collection_parse_internal(final SubLObject parse, final SubLObject instance_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_utilities.NIL != forts.fort_p(parse) && cardinality_estimates.instance_cardinality(parse).numG(instance_limit)) {
            return (SubLObject)parsing_utilities.NIL;
        }
        final SubLObject el_variable = (SubLObject)parsing_utilities.$sym7$_X;
        final SubLObject query_sentence = el_utilities.make_binary_formula(parsing_utilities.$const8$isa, el_variable, parse);
        final SubLObject query_mt = parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
        final SubLObject query_max_number = number_utilities.f_1X(instance_limit);
        final SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$kw9$MAX_NUMBER, query_max_number, (SubLObject)parsing_utilities.$kw10$MAX_TIME, (SubLObject)parsing_utilities.TWELVE_INTEGER, (SubLObject)parsing_utilities.$kw11$MAX_TRANSFORMATION_DEPTH, (SubLObject)parsing_utilities.ZERO_INTEGER);
        final SubLObject v_instances = ask_utilities.query_variable(el_variable, query_sentence, query_mt, query_properties);
        if (Sequences.length(v_instances).numG(instance_limit)) {
            return (SubLObject)parsing_utilities.NIL;
        }
        return v_instances;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 4025L)
    public static SubLObject instances_of_collection_parse(final SubLObject parse, final SubLObject instance_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL == v_memoization_state) {
            return instances_of_collection_parse_internal(parse, instance_limit);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)parsing_utilities.$sym6$INSTANCES_OF_COLLECTION_PARSE, (SubLObject)parsing_utilities.UNPROVIDED);
        if (parsing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)parsing_utilities.$sym6$INSTANCES_OF_COLLECTION_PARSE, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.EQUAL, (SubLObject)parsing_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)parsing_utilities.$sym6$INSTANCES_OF_COLLECTION_PARSE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(parse, instance_limit);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)parsing_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)parsing_utilities.NIL;
            collision = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (parse.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (parsing_utilities.NIL != cached_args && parsing_utilities.NIL == cached_args.rest() && instance_limit.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(instances_of_collection_parse_internal(parse, instance_limit)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(parse, instance_limit));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 4777L)
    public static SubLObject clean_string_for_parse_noun_compound(final SubLObject string) {
        return list_utilities.remove_if_not((SubLObject)parsing_utilities.$sym12$PARSE_NOUN_COMPOUND_VALID_CHAR_P, string, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 4906L)
    public static SubLObject filter_noun_compound_parses_by_types(final SubLObject parses, final SubLObject good_list, final SubLObject bad_list, SubLObject ignore_subcolfnsP, SubLObject mt) {
        if (ignore_subcolfnsP == parsing_utilities.UNPROVIDED) {
            ignore_subcolfnsP = (SubLObject)parsing_utilities.NIL;
        }
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        SubLObject for_typing = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL != ignore_subcolfnsP) {
            SubLObject cdolist_list_var = parses;
            SubLObject parse = (SubLObject)parsing_utilities.NIL;
            parse = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                if (parsing_utilities.NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(parse, parsing_utilities.$const13$UniversalVocabularyMt)) {
                    for_typing = (SubLObject)ConsesLow.cons(parse, for_typing);
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        else {
            for_typing = parses;
        }
        return restrict_parses_by_types(for_typing, good_list, bad_list, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 5588L)
    public static SubLObject parse_noun_compound_valid_char_p(final SubLObject v_object) {
        if (!v_object.isChar()) {
            return (SubLObject)parsing_utilities.NIL;
        }
        if (parsing_utilities.NIL != Sequences.find(v_object, parsing_utilities.$parse_noun_compound_valid_non_alpha_chars$.getGlobalValue(), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
            return (SubLObject)parsing_utilities.T;
        }
        return Characters.alpha_char_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 6152L)
    public static SubLObject clear_nl_tags() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.clear_dictionary(parsing_utilities.$nl_tags$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 6226L)
    public static SubLObject clear_nl_tag_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.clear_dictionary(parsing_utilities.$nl_tag_fns$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 6306L)
    public static SubLObject clear_nl_tag_denoting_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.clear_dictionary(parsing_utilities.$nl_tag_denoting_fns$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 6404L)
    public static SubLObject initialize_nl_tags() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_nl_tags();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)parsing_utilities.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(parsing_utilities.$const16$EverythingPSC, thread);
            SubLObject node_var = parsing_utilities.$const17$NLUtteranceAttribute;
            final SubLObject deck_type = (SubLObject)parsing_utilities.$kw20$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)parsing_utilities.NIL;
                    final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((parsing_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((parsing_utilities.NIL != tv_var) ? parsing_utilities.$sym21$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (parsing_utilities.NIL != tv_var && parsing_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && parsing_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)parsing_utilities.$kw22$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw25$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$str26$continue_anyway, (SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw27$WARN)) {
                                Errors.warn((SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)parsing_utilities.$str28$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)parsing_utilities.$str26$continue_anyway, (SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)parsing_utilities.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls), thread);
                            if (parsing_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || parsing_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(parsing_utilities.$const17$NLUtteranceAttribute, sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$18 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)parsing_utilities.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)parsing_utilities.UNPROVIDED);
                                    while (parsing_utilities.NIL != node_var) {
                                        final SubLObject sp_type = node_var;
                                        final SubLObject pred_var = parsing_utilities.$const8$isa;
                                        if (parsing_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sp_type, (SubLObject)parsing_utilities.TWO_INTEGER, pred_var)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sp_type, (SubLObject)parsing_utilities.TWO_INTEGER, pred_var);
                                            SubLObject done_var = (SubLObject)parsing_utilities.NIL;
                                            final SubLObject token_var = (SubLObject)parsing_utilities.NIL;
                                            while (parsing_utilities.NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                if (parsing_utilities.NIL != valid) {
                                                    SubLObject final_index_iterator = (SubLObject)parsing_utilities.NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)parsing_utilities.$kw30$GAF, (SubLObject)parsing_utilities.$kw31$TRUE, (SubLObject)parsing_utilities.NIL);
                                                        SubLObject done_var_$22 = (SubLObject)parsing_utilities.NIL;
                                                        final SubLObject token_var_$23 = (SubLObject)parsing_utilities.NIL;
                                                        while (parsing_utilities.NIL == done_var_$22) {
                                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                                            final SubLObject valid_$24 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$23.eql(as));
                                                            if (parsing_utilities.NIL != valid_$24) {
                                                                final SubLObject sp = assertions_high.gaf_arg1(as);
                                                                final SubLObject mt = assertions_high.assertion_mt(as);
                                                                dictionary_utilities.dictionary_pushnew(parsing_utilities.$nl_tags$.getDynamicValue(thread), sp, mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                                                            }
                                                            done_var_$22 = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid_$24);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            if (parsing_utilities.NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls));
                                        SubLObject module_var = (SubLObject)parsing_utilities.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (parsing_utilities.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((parsing_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(parsing_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (parsing_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED));
                                                    if (parsing_utilities.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED));
                                                        if (parsing_utilities.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); parsing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (parsing_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                    final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                        SubLObject iteration_state_$29;
                                                                        for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); parsing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (parsing_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (parsing_utilities.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)parsing_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); parsing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (parsing_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)parsing_utilities.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (parsing_utilities.NIL != csome_list_var) {
                                                                                            if (parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)parsing_utilities.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$21, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$20, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)parsing_utilities.FIVE_INTEGER, (SubLObject)parsing_utilities.$str33$attempting_to_bind_direction_link, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                                                    }
                                                }
                                                else if (parsing_utilities.NIL != obsolete.cnat_p(node, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$31;
                                                    final SubLObject new_list = cdolist_list_var_$31 = ((parsing_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)parsing_utilities.NIL;
                                                    generating_fn = cdolist_list_var_$31.first();
                                                    while (parsing_utilities.NIL != cdolist_list_var_$31) {
                                                        final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (parsing_utilities.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)parsing_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); parsing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (parsing_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)parsing_utilities.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (parsing_utilities.NIL != csome_list_var2) {
                                                                    if (parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)parsing_utilities.$str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$22, thread);
                                                        }
                                                        cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                                                        generating_fn = cdolist_list_var_$31.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$19, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$21, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$18, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$str34$Node__a_does_not_pass_sbhl_type_t, parsing_utilities.$const17$NLUtteranceAttribute, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED)), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$17, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$16, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$15, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$14, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return parsing_utilities.$nl_tags$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 6728L)
    public static SubLObject initialize_nl_tag_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_nl_tag_fns();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)parsing_utilities.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(parsing_utilities.$const16$EverythingPSC, thread);
            SubLObject cdolist_list_var = gt_methods.gt_all_inferiors(parsing_utilities.$const35$genlFuncs, parsing_utilities.$const36$NLTagFn, (SubLObject)parsing_utilities.UNPROVIDED);
            SubLObject spec_fn = (SubLObject)parsing_utilities.NIL;
            spec_fn = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                final SubLObject pred_var = parsing_utilities.$const8$isa;
                if (parsing_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec_fn, (SubLObject)parsing_utilities.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec_fn, (SubLObject)parsing_utilities.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)parsing_utilities.NIL;
                    final SubLObject token_var = (SubLObject)parsing_utilities.NIL;
                    while (parsing_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (parsing_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)parsing_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)parsing_utilities.$kw30$GAF, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.NIL);
                                SubLObject done_var_$34 = (SubLObject)parsing_utilities.NIL;
                                final SubLObject token_var_$35 = (SubLObject)parsing_utilities.NIL;
                                while (parsing_utilities.NIL == done_var_$34) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                    final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(as));
                                    if (parsing_utilities.NIL != valid_$36) {
                                        final SubLObject sp = assertions_high.gaf_arg1(as);
                                        final SubLObject mt = assertions_high.assertion_mt(as);
                                        dictionary_utilities.dictionary_pushnew(parsing_utilities.$nl_tag_fns$.getDynamicValue(thread), sp, mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                                    }
                                    done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid_$36);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (parsing_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_fn = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return parsing_utilities.$nl_tag_fns$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 7065L)
    public static SubLObject initialize_nl_tag_denoting_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_nl_tag_denoting_fns();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)parsing_utilities.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(parsing_utilities.$const16$EverythingPSC, thread);
            SubLObject node_var = parsing_utilities.$const17$NLUtteranceAttribute;
            final SubLObject deck_type = (SubLObject)parsing_utilities.$kw20$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$38 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)parsing_utilities.NIL;
                    final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((parsing_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((parsing_utilities.NIL != tv_var) ? parsing_utilities.$sym21$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (parsing_utilities.NIL != tv_var && parsing_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && parsing_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)parsing_utilities.$kw22$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw25$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$str26$continue_anyway, (SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw27$WARN)) {
                                Errors.warn((SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)parsing_utilities.$str28$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)parsing_utilities.$str26$continue_anyway, (SubLObject)parsing_utilities.$str23$_A_is_not_a__A, tv_var, (SubLObject)parsing_utilities.$sym24$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)parsing_utilities.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls), thread);
                            if (parsing_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || parsing_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(parsing_utilities.$const17$NLUtteranceAttribute, sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)parsing_utilities.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)parsing_utilities.UNPROVIDED);
                                    while (parsing_utilities.NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        final SubLObject pred_var = parsing_utilities.$const37$resultIsa;
                                        if (parsing_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec, (SubLObject)parsing_utilities.TWO_INTEGER, pred_var)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec, (SubLObject)parsing_utilities.TWO_INTEGER, pred_var);
                                            SubLObject done_var = (SubLObject)parsing_utilities.NIL;
                                            final SubLObject token_var = (SubLObject)parsing_utilities.NIL;
                                            while (parsing_utilities.NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                if (parsing_utilities.NIL != valid) {
                                                    SubLObject final_index_iterator = (SubLObject)parsing_utilities.NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)parsing_utilities.$kw30$GAF, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.NIL);
                                                        SubLObject done_var_$46 = (SubLObject)parsing_utilities.NIL;
                                                        final SubLObject token_var_$47 = (SubLObject)parsing_utilities.NIL;
                                                        while (parsing_utilities.NIL == done_var_$46) {
                                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                                            final SubLObject valid_$48 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$47.eql(as));
                                                            if (parsing_utilities.NIL != valid_$48) {
                                                                final SubLObject fn = assertions_high.gaf_arg1(as);
                                                                final SubLObject mt = assertions_high.assertion_mt(as);
                                                                dictionary_utilities.dictionary_pushnew(parsing_utilities.$nl_tag_denoting_fns$.getDynamicValue(thread), fn, mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                                                            }
                                                            done_var_$46 = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid_$48);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            if (parsing_utilities.NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                                        }
                                                    }
                                                }
                                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(parsing_utilities.$const29$genls));
                                        SubLObject module_var = (SubLObject)parsing_utilities.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (parsing_utilities.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((parsing_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(parsing_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (parsing_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED));
                                                    if (parsing_utilities.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED));
                                                        if (parsing_utilities.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); parsing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (parsing_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                    final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                        SubLObject iteration_state_$53;
                                                                        for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); parsing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (parsing_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (parsing_utilities.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)parsing_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); parsing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (parsing_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)parsing_utilities.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (parsing_utilities.NIL != csome_list_var) {
                                                                                            if (parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)parsing_utilities.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$45, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$44, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)parsing_utilities.FIVE_INTEGER, (SubLObject)parsing_utilities.$str33$attempting_to_bind_direction_link, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                                                    }
                                                }
                                                else if (parsing_utilities.NIL != obsolete.cnat_p(node, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$55;
                                                    final SubLObject new_list = cdolist_list_var_$55 = ((parsing_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)parsing_utilities.NIL;
                                                    generating_fn = cdolist_list_var_$55.first();
                                                    while (parsing_utilities.NIL != cdolist_list_var_$55) {
                                                        final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (parsing_utilities.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)parsing_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); parsing_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (parsing_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)parsing_utilities.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (parsing_utilities.NIL != csome_list_var2) {
                                                                    if (parsing_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)parsing_utilities.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)parsing_utilities.$str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$46, thread);
                                                        }
                                                        cdolist_list_var_$55 = cdolist_list_var_$55.rest();
                                                        generating_fn = cdolist_list_var_$55.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$43, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$43, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$45, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$42, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$41, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$str34$Node__a_does_not_pass_sbhl_type_t, parsing_utilities.$const17$NLUtteranceAttribute, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)parsing_utilities.UNPROVIDED)), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$41, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$40, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$39, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$38, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return parsing_utilities.$nl_tag_denoting_fns$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 7424L)
    public static SubLObject nl_tagP(final SubLObject obj, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_utilities.$const38$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!dictionary.dictionary_length(parsing_utilities.$nl_tags$.getDynamicValue(thread)).isPositive()) {
            initialize_nl_tags();
        }
        final SubLObject mts = dictionary.dictionary_lookup(parsing_utilities.$nl_tags$.getDynamicValue(thread), obj, (SubLObject)parsing_utilities.UNPROVIDED);
        SubLObject mt_okP = Equality.eql(mt, parsing_utilities.$const38$InferencePSC);
        SubLObject nl_tagP = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = (SubLObject)parsing_utilities.NIL, ok_mt = csome_list_var.first(); parsing_utilities.NIL == mt_okP && parsing_utilities.NIL != csome_list_var; mt_okP = genl_mts.genl_mtP(mt, ok_mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        nl_tagP = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != mts && parsing_utilities.NIL != mt_okP);
        if (parsing_utilities.NIL == nl_tagP && parsing_utilities.NIL != el_utilities.possibly_naut_p(obj)) {
            nl_tagP = nl_tag_denoting_fnP(cycl_utilities.nat_functor(obj), mt);
        }
        return nl_tagP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 8005L)
    public static SubLObject nl_tag_denoting_fnP(final SubLObject obj, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_utilities.$const38$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!dictionary.dictionary_length(parsing_utilities.$nl_tag_denoting_fns$.getDynamicValue(thread)).isPositive()) {
            initialize_nl_tag_denoting_fns();
        }
        final SubLObject mts = dictionary.dictionary_lookup(parsing_utilities.$nl_tag_denoting_fns$.getDynamicValue(thread), obj, (SubLObject)parsing_utilities.UNPROVIDED);
        SubLObject mt_okP = Equality.eql(mt, parsing_utilities.$const38$InferencePSC);
        if (parsing_utilities.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = (SubLObject)parsing_utilities.NIL, ok_mt = csome_list_var.first(); parsing_utilities.NIL == mt_okP && parsing_utilities.NIL != csome_list_var; mt_okP = genl_mts.genl_mtP(mt, ok_mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != mts && parsing_utilities.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 8379L)
    public static SubLObject nl_tag_fnP(final SubLObject obj, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_utilities.$const38$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!dictionary.dictionary_length(parsing_utilities.$nl_tag_fns$.getDynamicValue(thread)).isPositive()) {
            initialize_nl_tag_fns();
        }
        final SubLObject mts = dictionary.dictionary_lookup(parsing_utilities.$nl_tag_fns$.getDynamicValue(thread), obj, (SubLObject)parsing_utilities.UNPROVIDED);
        SubLObject mt_okP = Equality.eql(mt, parsing_utilities.$const38$InferencePSC);
        if (parsing_utilities.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = (SubLObject)parsing_utilities.NIL, ok_mt = csome_list_var.first(); parsing_utilities.NIL == mt_okP && parsing_utilities.NIL != csome_list_var; mt_okP = genl_mts.genl_mtP(mt, ok_mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != mts && parsing_utilities.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 8716L)
    public static SubLObject nl_tagged_termP(final SubLObject v_term) {
        if (!v_term.isCons() || (parsing_utilities.NIL == el_utilities.formula_arityE(v_term, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.UNPROVIDED) && parsing_utilities.NIL == el_utilities.formula_arityE(v_term, (SubLObject)parsing_utilities.THREE_INTEGER, (SubLObject)parsing_utilities.UNPROVIDED))) {
            return (SubLObject)parsing_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != nl_tag_fnP(cycl_utilities.formula_arg0(v_term), (SubLObject)parsing_utilities.UNPROVIDED) && parsing_utilities.NIL != nl_tagP(cycl_utilities.formula_arg1(v_term, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 9003L)
    public static SubLObject ternary_nl_tagged_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_utilities.$const38$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!v_term.isCons() || parsing_utilities.NIL == el_utilities.formula_arityE(v_term, (SubLObject)parsing_utilities.THREE_INTEGER, (SubLObject)parsing_utilities.UNPROVIDED)) {
            return (SubLObject)parsing_utilities.NIL;
        }
        SubLObject result = (SubLObject)parsing_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != ternary_nl_tag_fnP(cycl_utilities.formula_arg0(v_term)) && parsing_utilities.NIL != nl_tagP(cycl_utilities.formula_arg1(v_term, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 9334L)
    public static SubLObject ternary_nl_tag_fnP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != nl_tag_fnP(v_term, (SubLObject)parsing_utilities.UNPROVIDED) && arity.arity(v_term).numE((SubLObject)parsing_utilities.THREE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 9438L)
    public static SubLObject strip_nl_tags_top_level(final SubLObject obj) {
        return strip_nl_tags(obj, (SubLObject)parsing_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 9737L)
    public static SubLObject possibly_strip_nl_tags_from_list(final SubLObject term_list, final SubLObject stripP) {
        if (parsing_utilities.NIL == stripP) {
            return term_list;
        }
        SubLObject stripped_terms = (SubLObject)parsing_utilities.NIL;
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = (SubLObject)parsing_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject tag_free = item_var = strip_nl_tags(v_term, (SubLObject)parsing_utilities.UNPROVIDED);
            if (parsing_utilities.NIL == conses_high.member(item_var, stripped_terms, Symbols.symbol_function((SubLObject)parsing_utilities.EQL), Symbols.symbol_function((SubLObject)parsing_utilities.IDENTITY))) {
                stripped_terms = (SubLObject)ConsesLow.cons(item_var, stripped_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return stripped_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 10010L)
    public static SubLObject strip_nl_tags(final SubLObject obj, SubLObject top_level_onlyP) {
        if (top_level_onlyP == parsing_utilities.UNPROVIDED) {
            top_level_onlyP = (SubLObject)parsing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nl_tagged_objectP = nl_tagged_termP(obj);
        SubLObject stripped = obj;
        final SubLObject placeholder = parsing_vars.nl_tag_cycl_placeholder();
        SubLObject nl_tag_templates = (SubLObject)parsing_utilities.NIL;
        if (!obj.isAtom()) {
            if (parsing_utilities.NIL != nl_tagged_objectP) {
                thread.resetMultipleValues();
                final SubLObject stripped_$58 = strip_nl_tags(cycl_utilities.nat_arg2(obj, (SubLObject)parsing_utilities.UNPROVIDED), top_level_onlyP);
                final SubLObject nl_tag_templates_$59 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                stripped = stripped_$58;
                nl_tag_templates = nl_tag_templates_$59;
                nl_tag_templates = list_utilities.nadd_to_end(el_utilities.replace_formula_arg((SubLObject)parsing_utilities.TWO_INTEGER, placeholder, obj), nl_tag_templates);
            }
            else if (parsing_utilities.NIL != el_utilities.el_formula_p(obj) && parsing_utilities.NIL == top_level_onlyP) {
                stripped = el_utilities.map_formula_terms((SubLObject)parsing_utilities.$sym39$STRIP_NL_TAGS, obj, (SubLObject)parsing_utilities.UNPROVIDED);
            }
        }
        return Values.values(stripped, nl_tag_templates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 10704L)
    public static SubLObject get_nl_tag_fn(final SubLObject type, final SubLObject ternaryP) {
        if (parsing_utilities.NIL != ternaryP) {
            return get_ternary_nl_tag_fn(type);
        }
        return get_binary_nl_tag_fn(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 10852L)
    public static SubLObject get_ternary_nl_tag_fn(final SubLObject type) {
        if (type.eql((SubLObject)parsing_utilities.$kw40$DEFINITENESS)) {
            return parsing_utilities.$const41$NLDefinitenessFn_3;
        }
        if (type.eql((SubLObject)parsing_utilities.$kw42$QUANT)) {
            return parsing_utilities.$const43$NLQuantFn_3;
        }
        Errors.sublisp_break((SubLObject)parsing_utilities.$str44$Can_t_find_ternary_NL_tag_fn_for_, new SubLObject[] { type });
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11072L)
    public static SubLObject get_binary_nl_tag_fn(final SubLObject type) {
        if (type.eql((SubLObject)parsing_utilities.$kw40$DEFINITENESS)) {
            return parsing_utilities.$const45$NLDefinitenessFn;
        }
        if (type.eql((SubLObject)parsing_utilities.$kw42$QUANT)) {
            return parsing_utilities.$const46$NLQuantFn;
        }
        if (type.eql((SubLObject)parsing_utilities.$kw47$NUMBER)) {
            return parsing_utilities.$const48$NLNumberFn;
        }
        Errors.sublisp_break((SubLObject)parsing_utilities.$str49$Can_t_find_binary_NL_tag_fn_for__, new SubLObject[] { type });
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11324L)
    public static SubLObject get_nl_tag_template(final SubLObject type, final SubLObject attribute, SubLObject start_index) {
        if (start_index == parsing_utilities.UNPROVIDED) {
            start_index = (SubLObject)parsing_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ternaryP = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread) && type != parsing_utilities.$kw47$NUMBER);
        final SubLObject tag_fn = get_nl_tag_fn(type, ternaryP);
        return (parsing_utilities.NIL != ternaryP) ? el_utilities.make_ternary_formula(tag_fn, attribute, parsing_vars.nl_tag_cycl_placeholder(), start_index) : el_utilities.make_binary_formula(tag_fn, attribute, parsing_vars.nl_tag_cycl_placeholder());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11707L)
    public static SubLObject clear_make_nl_tag_template() {
        final SubLObject cs = parsing_utilities.$make_nl_tag_template_caching_state$.getGlobalValue();
        if (parsing_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11707L)
    public static SubLObject remove_make_nl_tag_template(final SubLObject type, final SubLObject attribute, final SubLObject start_index) {
        return memoization_state.caching_state_remove_function_results_with_args(parsing_utilities.$make_nl_tag_template_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(type, attribute, start_index), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11707L)
    public static SubLObject make_nl_tag_template_internal(final SubLObject type, final SubLObject attribute, final SubLObject start_index) {
        final SubLObject ternaryP = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != start_index && type != parsing_utilities.$kw47$NUMBER);
        final SubLObject tag_fn = get_nl_tag_fn(type, ternaryP);
        return (parsing_utilities.NIL != ternaryP) ? el_utilities.make_ternary_formula(tag_fn, attribute, parsing_vars.nl_tag_cycl_placeholder(), start_index) : el_utilities.make_binary_formula(tag_fn, attribute, parsing_vars.nl_tag_cycl_placeholder());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 11707L)
    public static SubLObject make_nl_tag_template(final SubLObject type, final SubLObject attribute, final SubLObject start_index) {
        SubLObject caching_state = parsing_utilities.$make_nl_tag_template_caching_state$.getGlobalValue();
        if (parsing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)parsing_utilities.$sym50$MAKE_NL_TAG_TEMPLATE, (SubLObject)parsing_utilities.$sym51$_MAKE_NL_TAG_TEMPLATE_CACHING_STATE_, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.EQL, (SubLObject)parsing_utilities.THREE_INTEGER, (SubLObject)parsing_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(type, attribute, start_index);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)parsing_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)parsing_utilities.NIL;
            collision = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (type.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (attribute.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (parsing_utilities.NIL != cached_args && parsing_utilities.NIL == cached_args.rest() && start_index.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(make_nl_tag_template_internal(type, attribute, start_index)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(type, attribute, start_index));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 12083L)
    public static SubLObject add_nl_tag_template(final SubLObject cycl, final SubLObject tag_template) {
        return el_utilities.replace_formula_arg((SubLObject)parsing_utilities.TWO_INTEGER, cycl, tag_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 12193L)
    public static SubLObject contains_nl_tagP(final SubLObject formula) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if((SubLObject)parsing_utilities.$sym52$NL_TAG_, formula, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 12353L)
    public static SubLObject add_nl_number_wrapper(final SubLObject cycl, final SubLObject pred) {
        final SubLObject number = spp_to_nl_number(pred);
        SubLObject ans = cycl;
        if (parsing_utilities.NIL == number) {
            Errors.warn((SubLObject)parsing_utilities.$str53$Couldn_t_determine_NL_number_for_, pred);
        }
        else if (parsing_utilities.NIL == formula_pattern_match.formula_matches_pattern(cycl, (SubLObject)ConsesLow.listS(parsing_utilities.$const48$NLNumberFn, number, (SubLObject)parsing_utilities.$list54))) {
            final SubLObject nl_tag_template = get_nl_tag_template((SubLObject)parsing_utilities.$kw47$NUMBER, number, (SubLObject)parsing_utilities.UNPROVIDED);
            ans = add_nl_tag_template(cycl, nl_tag_template);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 12876L)
    public static SubLObject determiner_number_denotP_internal(final SubLObject obj) {
        return at_defns.quick_quiet_has_typeP(obj, parsing_utilities.$const56$ScalarInterval, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 12876L)
    public static SubLObject determiner_number_denotP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL == v_memoization_state) {
            return determiner_number_denotP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)parsing_utilities.$sym55$DETERMINER_NUMBER_DENOT_, (SubLObject)parsing_utilities.UNPROVIDED);
        if (parsing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)parsing_utilities.$sym55$DETERMINER_NUMBER_DENOT_, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.EQUAL, (SubLObject)parsing_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)parsing_utilities.$sym55$DETERMINER_NUMBER_DENOT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(determiner_number_denotP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)parsing_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 13092L)
    public static SubLObject agr_preds_for_number(final SubLObject number) {
        if (number.isDouble()) {
            return (SubLObject)(number.numE((SubLObject)parsing_utilities.ONE_INTEGER) ? parsing_utilities.$list57 : parsing_utilities.$list58);
        }
        if (number.eql((SubLObject)parsing_utilities.ONE_INTEGER)) {
            return (SubLObject)parsing_utilities.$list59;
        }
        return (SubLObject)parsing_utilities.$list58;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 13392L)
    public static SubLObject add_nl_quant_wrapper(final SubLObject cycl, final SubLObject det_string, SubLObject det_cycls, SubLObject start_index) {
        if (det_cycls == parsing_utilities.UNPROVIDED) {
            det_cycls = (SubLObject)parsing_utilities.NIL;
        }
        if (start_index == parsing_utilities.UNPROVIDED) {
            start_index = (SubLObject)parsing_utilities.ZERO_INTEGER;
        }
        final SubLObject nlqas = lexicon_utilities.nl_quant_attributes_for_string(det_string, det_cycls);
        SubLObject ans = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL == nlqas) {
            ans = (SubLObject)ConsesLow.cons(cycl, ans);
        }
        else if (parsing_utilities.NIL != el_utilities.el_formula_p(cycl) && parsing_utilities.NIL != contains_nl_tagP(cycl)) {
            final SubLObject agr_preds = lexicon_accessors.agr_of_det_string(det_string);
            final SubLObject cycl_num_attr = nl_number_attr_for_cycl(cycl);
            final SubLObject cycl_spp = nl_number_to_spp(cycl_num_attr);
            final SubLObject all_preds = (SubLObject)ConsesLow.cons(cycl_spp, agr_preds);
            final SubLObject floor_preds = nl_max_floor_preds(all_preds);
            SubLObject new_cycl = (SubLObject)parsing_utilities.NIL;
            final SubLObject pcase_var = Sequences.length(floor_preds);
            if (!pcase_var.eql((SubLObject)parsing_utilities.ZERO_INTEGER)) {
                if (pcase_var.eql((SubLObject)parsing_utilities.ONE_INTEGER)) {
                    final SubLObject floor_pred = floor_preds.first();
                    final SubLObject new_num_attr = spp_to_nl_number(floor_pred);
                    if (parsing_utilities.NIL != new_num_attr) {
                        new_cycl = cycl_utilities.expression_subst(new_num_attr, cycl_num_attr, cycl, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                    }
                }
            }
            if (parsing_utilities.NIL != new_cycl) {
                SubLObject cdolist_list_var = nlqas;
                SubLObject nlqa = (SubLObject)parsing_utilities.NIL;
                nlqa = cdolist_list_var.first();
                while (parsing_utilities.NIL != cdolist_list_var) {
                    final SubLObject nl_tag_template = get_nl_tag_template((SubLObject)parsing_utilities.$kw42$QUANT, nlqa, start_index);
                    final SubLObject tagged_new_cycl = add_nl_tag_template(new_cycl, nl_tag_template);
                    ans = (SubLObject)ConsesLow.cons(tagged_new_cycl, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    nlqa = cdolist_list_var.first();
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 14962L)
    public static SubLObject clear_nl_max_floor_preds() {
        final SubLObject cs = parsing_utilities.$nl_max_floor_preds_caching_state$.getGlobalValue();
        if (parsing_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 14962L)
    public static SubLObject remove_nl_max_floor_preds(final SubLObject preds) {
        return memoization_state.caching_state_remove_function_results_with_args(parsing_utilities.$nl_max_floor_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(preds), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 14962L)
    public static SubLObject nl_max_floor_preds_internal(final SubLObject preds) {
        return genl_predicates.max_floor_predicates(preds, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 14962L)
    public static SubLObject nl_max_floor_preds(final SubLObject preds) {
        SubLObject caching_state = parsing_utilities.$nl_max_floor_preds_caching_state$.getGlobalValue();
        if (parsing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)parsing_utilities.$sym60$NL_MAX_FLOOR_PREDS, (SubLObject)parsing_utilities.$sym61$_NL_MAX_FLOOR_PREDS_CACHING_STATE_, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.EQUAL, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$int62$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, preds, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_max_floor_preds_internal(preds)));
            memoization_state.caching_state_put(caching_state, preds, results, (SubLObject)parsing_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 15239L)
    public static SubLObject cycl_has_definiteness_tagP(final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != cycl_utilities.expression_find(parsing_utilities.$const45$NLDefinitenessFn, cycl, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) || parsing_utilities.NIL != cycl_utilities.expression_find(parsing_utilities.$const41$NLDefinitenessFn_3, cycl, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 15396L)
    public static SubLObject cycl_pronoun_p(final SubLObject v_object) {
        return narts_high.nart_with_functor_p(parsing_utilities.$const63$PronounFn, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 15486L)
    public static SubLObject nl_person_attr_for_cycl_pronoun(final SubLObject pronoun) {
        assert parsing_utilities.NIL != cycl_pronoun_p(pronoun) : pronoun;
        return cycl_utilities.nat_arg1(pronoun, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 15610L)
    public static SubLObject nl_number_attr_for_cycl(final SubLObject cycl) {
        SubLObject attr = parsing_utilities.$const65$UnmarkedNumber_NLAttr;
        if (parsing_utilities.NIL != cycl_grammar.cycl_nat_p(cycl)) {
            final SubLObject function = cycl_utilities.nat_function(cycl);
            if (function.eql(parsing_utilities.$const48$NLNumberFn)) {
                attr = cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
            }
            else if (function.eql(parsing_utilities.$const45$NLDefinitenessFn)) {
                attr = nl_number_attr_for_cycl(cycl_utilities.nat_arg2(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
            }
            else if (function.eql(parsing_utilities.$const46$NLQuantFn)) {
                attr = nl_number_attr_for_cycl(cycl_utilities.nat_arg2(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
            }
            else if (function.eql(parsing_utilities.$const63$PronounFn)) {
                attr = cycl_utilities.nat_arg2(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
            }
            else if (parsing_utilities.NIL != isa.isaP(function, parsing_utilities.$const66$SubcollectionFunction, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                attr = nl_number_attr_for_cycl(cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
            }
        }
        return attr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 16214L)
    public static SubLObject nl_definiteness_attr_for_cycl(final SubLObject cycl) {
        SubLObject attr = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL != cycl_grammar.cycl_nat_p(cycl)) {
            final SubLObject function = cycl_utilities.nat_function(cycl);
            if (function.eql(parsing_utilities.$const45$NLDefinitenessFn)) {
                attr = cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
            }
            else if (function.eql(parsing_utilities.$const48$NLNumberFn)) {
                attr = nl_definiteness_attr_for_cycl(cycl_utilities.nat_arg2(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
            }
            else if (function.eql(parsing_utilities.$const46$NLQuantFn)) {
                attr = nl_definiteness_attr_for_cycl(cycl_utilities.nat_arg2(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
            }
            else if (function.eql(parsing_utilities.$const63$PronounFn)) {
                final SubLObject arg4 = cycl_utilities.nat_arg4(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
                if (parsing_utilities.NIL != fort_types_interface.nl_definiteness_attributeP(arg4)) {
                    attr = arg4;
                }
            }
            else if (parsing_utilities.NIL != isa.isaP(function, parsing_utilities.$const66$SubcollectionFunction, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                attr = nl_definiteness_attr_for_cycl(cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
            }
        }
        return attr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 16897L)
    public static SubLObject nl_gender_attr_for_cycl(final SubLObject cycl) {
        SubLObject attr = parsing_utilities.$const67$Ungendered_NLAttr;
        if (parsing_utilities.NIL != cycl_grammar.cycl_nat_p(cycl)) {
            final SubLObject function = cycl_utilities.nat_function(cycl);
            if (!function.eql(parsing_utilities.$const45$NLDefinitenessFn)) {
                if (!function.eql(parsing_utilities.$const48$NLNumberFn)) {
                    if (!function.eql(parsing_utilities.$const46$NLQuantFn)) {
                        if (function.eql(parsing_utilities.$const63$PronounFn)) {
                            attr = cycl_utilities.nat_arg3(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
                        }
                        else if (parsing_utilities.NIL != isa.isaP(function, parsing_utilities.$const66$SubcollectionFunction, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                            attr = nl_gender_attr_for_cycl(cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
                        }
                    }
                }
            }
        }
        return attr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 17382L)
    public static SubLObject kb_nl_number_attribute_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, parsing_utilities.$const68$NLNumberAttribute);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 17485L)
    public static SubLObject kb_nl_definiteness_attribute_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, parsing_utilities.$const69$NLDefinitenessAttribute);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 17600L)
    public static SubLObject kb_nl_gender_attribute_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, parsing_utilities.$const70$NLGenderAttribute);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 17703L)
    public static SubLObject nl_number_attributes_disagreeP(final SubLObject number1, final SubLObject number2) {
        assert parsing_utilities.NIL != kb_nl_number_attribute_p(number1) : number1;
        assert parsing_utilities.NIL != kb_nl_number_attribute_p(number2) : number2;
        return (SubLObject)SubLObjectFactory.makeBoolean(!number1.eql(number2) && !number1.eql(parsing_utilities.$const65$UnmarkedNumber_NLAttr) && !number2.eql(parsing_utilities.$const65$UnmarkedNumber_NLAttr) && (!number1.eql(parsing_utilities.$const72$Generic_NLAttr) || (!number2.eql(parsing_utilities.$const73$Mass_NLAttr) && !number2.eql(parsing_utilities.$const74$Plural_NLAttr))) && (!number2.eql(parsing_utilities.$const72$Generic_NLAttr) || (!number1.eql(parsing_utilities.$const73$Mass_NLAttr) && !number1.eql(parsing_utilities.$const74$Plural_NLAttr))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 18226L)
    public static SubLObject nl_gender_attributes_disagreeP(final SubLObject gender1, final SubLObject gender2) {
        assert parsing_utilities.NIL != kb_nl_gender_attribute_p(gender1) : gender1;
        assert parsing_utilities.NIL != kb_nl_gender_attribute_p(gender2) : gender2;
        return (SubLObject)SubLObjectFactory.makeBoolean(!gender1.eql(gender2) && !gender1.eql(parsing_utilities.$const67$Ungendered_NLAttr) && !gender2.eql(parsing_utilities.$const67$Ungendered_NLAttr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 18507L)
    public static SubLObject cycls_disagree_in_nl_number_attributeP(final SubLObject cycl1, final SubLObject cycl2) {
        final SubLObject number1 = nl_number_attr_for_cycl(cycl1);
        final SubLObject number2 = nl_number_attr_for_cycl(cycl2);
        return nl_number_attributes_disagreeP(number1, number2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 18733L)
    public static SubLObject cycls_disagree_in_nl_gender_attributeP(final SubLObject cycl1, final SubLObject cycl2) {
        final SubLObject gender1 = nl_gender_attr_for_cycl(cycl1);
        final SubLObject gender2 = nl_gender_attr_for_cycl(cycl2);
        return nl_gender_attributes_disagreeP(gender1, gender2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 18959L)
    public static SubLObject nl_number_to_spp(final SubLObject attr) {
        if (attr.eql(parsing_utilities.$const65$UnmarkedNumber_NLAttr)) {
            return parsing_utilities.$const76$nonPlural_Generic;
        }
        if (attr.eql(parsing_utilities.$const77$Singular_NLAttr)) {
            return parsing_utilities.$const78$singular_Generic;
        }
        if (attr.eql(parsing_utilities.$const74$Plural_NLAttr)) {
            return parsing_utilities.$const79$plural_Generic;
        }
        if (attr.eql(parsing_utilities.$const73$Mass_NLAttr)) {
            return parsing_utilities.$const80$massNumber_Generic;
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 19405L)
    public static SubLObject spp_to_nl_number(final SubLObject pred) {
        if (Hashtables.hash_table_count(parsing_utilities.$spps_to_nl_numbers$.getGlobalValue()).isZero()) {
            init_spps_to_nl_numbers();
        }
        return Hashtables.gethash(pred, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 19681L)
    public static SubLObject init_spps_to_nl_numbers() {
        Hashtables.clrhash(parsing_utilities.$spps_to_nl_numbers$.getGlobalValue());
        SubLObject cdolist_list_var = lexicon_accessors.all_speech_part_preds((SubLObject)parsing_utilities.UNPROVIDED);
        SubLObject pred = (SubLObject)parsing_utilities.NIL;
        pred = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            if (parsing_utilities.NIL != lexicon_accessors.genl_pos_predP(pred, parsing_utilities.$const78$singular_Generic, (SubLObject)parsing_utilities.UNPROVIDED) && parsing_utilities.NIL != lexicon_accessors.genl_pos_predP(pred, parsing_utilities.$const80$massNumber_Generic, (SubLObject)parsing_utilities.UNPROVIDED)) {
                Hashtables.sethash(pred, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), parsing_utilities.$const65$UnmarkedNumber_NLAttr);
            }
            else if (parsing_utilities.NIL != lexicon_accessors.genl_pos_predP(pred, parsing_utilities.$const79$plural_Generic, (SubLObject)parsing_utilities.UNPROVIDED)) {
                Hashtables.sethash(pred, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), parsing_utilities.$const74$Plural_NLAttr);
            }
            else if (parsing_utilities.NIL != lexicon_accessors.genl_pos_predP(pred, parsing_utilities.$const78$singular_Generic, (SubLObject)parsing_utilities.UNPROVIDED)) {
                Hashtables.sethash(pred, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), parsing_utilities.$const77$Singular_NLAttr);
            }
            else if (parsing_utilities.NIL != lexicon_accessors.genl_pos_predP(pred, parsing_utilities.$const80$massNumber_Generic, (SubLObject)parsing_utilities.UNPROVIDED)) {
                Hashtables.sethash(pred, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), parsing_utilities.$const73$Mass_NLAttr);
            }
            else {
                Hashtables.sethash(pred, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), parsing_utilities.$const65$UnmarkedNumber_NLAttr);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        Hashtables.sethash(parsing_utilities.$const83$partOfSpeech, parsing_utilities.$spps_to_nl_numbers$.getGlobalValue(), parsing_utilities.$const77$Singular_NLAttr);
        return (SubLObject)parsing_utilities.$kw84$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 20472L)
    public static SubLObject add_nl_def_wrapper(final SubLObject cycl, final SubLObject det_string, SubLObject pos, SubLObject denots, SubLObject start_index) {
        if (pos == parsing_utilities.UNPROVIDED) {
            pos = (SubLObject)parsing_utilities.NIL;
        }
        if (denots == parsing_utilities.UNPROVIDED) {
            denots = (SubLObject)parsing_utilities.NIL;
        }
        if (start_index == parsing_utilities.UNPROVIDED) {
            start_index = (SubLObject)parsing_utilities.ZERO_INTEGER;
        }
        SubLObject ans = (SubLObject)parsing_utilities.NIL;
        SubLObject cdolist_list_var = (parsing_utilities.NIL != pos) ? lexicon_utilities.nl_def_attributes_for_pos(pos, denots) : lexicon_utilities.nl_def_attributes_for_string(det_string, denots);
        SubLObject nlda = (SubLObject)parsing_utilities.NIL;
        nlda = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject nl_tag_template = get_nl_tag_template((SubLObject)parsing_utilities.$kw40$DEFINITENESS, nlda, start_index);
            final SubLObject tagged_cycl = add_nl_tag_template(cycl, nl_tag_template);
            ans = (SubLObject)ConsesLow.cons(tagged_cycl, ans);
            cdolist_list_var = cdolist_list_var.rest();
            nlda = cdolist_list_var.first();
        }
        return (SubLObject)((parsing_utilities.NIL != ans) ? ans : ConsesLow.list(cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 21092L)
    public static SubLObject parse_collection_expression(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject coll = cycl;
        SubLObject var = (SubLObject)parsing_utilities.NIL;
        SubLObject restrictions = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL != term.nautP(cycl, (SubLObject)parsing_utilities.UNPROVIDED)) {
            if (cycl_utilities.nat_function(cycl).eql(parsing_utilities.$const85$CollectionSubsetFn)) {
                coll = cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
                final SubLObject set_expr = cycl_utilities.nat_arg2(cycl, (SubLObject)parsing_utilities.UNPROVIDED);
                if (cycl_utilities.nat_function(set_expr).eql(parsing_utilities.$const86$TheSetOf)) {
                    var = cycl_utilities.nat_arg1(set_expr, (SubLObject)parsing_utilities.UNPROVIDED);
                    final SubLObject restr = cycl_utilities.nat_arg2(set_expr, (SubLObject)parsing_utilities.UNPROVIDED);
                    final SubLObject new_restrictions = restrictions = (SubLObject)((parsing_utilities.NIL != el_utilities.el_conjunction_p(restr)) ? cycl_utilities.formula_args(restr, (SubLObject)parsing_utilities.UNPROVIDED) : ConsesLow.list(restr));
                }
            }
            else if (parsing_utilities.NIL != isa.isa_in_any_mtP(cycl_utilities.nat_function(cycl), parsing_utilities.$const87$SubcollectionRelationFunction)) {
                thread.resetMultipleValues();
                final SubLObject subcoll = parse_collection_expression(cycl_utilities.nat_arg1(cycl, (SubLObject)parsing_utilities.UNPROVIDED));
                final SubLObject subvar = thread.secondMultipleValue();
                final SubLObject subrestrictions = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                coll = el_utilities.make_formula(cycl_utilities.nat_function(cycl), (SubLObject)ConsesLow.cons(subcoll, cycl_utilities.nat_args(cycl, (SubLObject)parsing_utilities.UNPROVIDED).rest()), (SubLObject)parsing_utilities.UNPROVIDED);
                var = subvar;
                restrictions = subrestrictions;
            }
        }
        return Values.values(coll, var, restrictions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 22274L)
    public static SubLObject make_collection_expression(final SubLObject coll, final SubLObject var, final SubLObject restrictions) {
        if (parsing_utilities.NIL == restrictions) {
            return coll;
        }
        if (parsing_utilities.NIL != list_utilities.singletonP(restrictions)) {
            return (SubLObject)ConsesLow.list(parsing_utilities.$const85$CollectionSubsetFn, coll, (SubLObject)ConsesLow.list(parsing_utilities.$const86$TheSetOf, var, restrictions.first()));
        }
        return (SubLObject)ConsesLow.list(parsing_utilities.$const85$CollectionSubsetFn, coll, (SubLObject)ConsesLow.list(parsing_utilities.$const86$TheSetOf, var, el_utilities.make_conjunction(restrictions)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 22990L)
    public static SubLObject npp_init_excluded_name_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)parsing_utilities.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(parsing_utilities.$const16$EverythingPSC, thread);
            final SubLObject preds = isa.all_fort_instances(parsing_utilities.$const88$ProperNamePredicate_ExcludedFromN, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            parsing_utilities.$npp_name_preds_to_exclude$.setDynamicValue((SubLObject)((parsing_utilities.NIL != preds) ? preds : parsing_utilities.$kw0$NONE), thread);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return parsing_utilities.$npp_name_preds_to_exclude$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 23243L)
    public static SubLObject npp_name_preds_to_exclude_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_utilities.NIL == parsing_utilities.$npp_name_preds_to_exclude$.getDynamicValue(thread)) {
            npp_init_excluded_name_preds();
        }
        return iteration.new_list_iterator(parsing_utilities.$npp_name_preds_to_exclude$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 23428L)
    public static SubLObject npp_excluded_name_predP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_utilities.NIL == parsing_utilities.$npp_name_preds_to_exclude$.getDynamicValue(thread)) {
            npp_init_excluded_name_preds();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!parsing_utilities.$npp_name_preds_to_exclude$.getDynamicValue(thread).eql((SubLObject)parsing_utilities.$kw0$NONE) && parsing_utilities.NIL != Sequences.find(v_object, parsing_utilities.$npp_name_preds_to_exclude$.getDynamicValue(thread), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 23662L)
    public static SubLObject blacklisted_cycl_for_parsersP(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(cycl, parsing_vars.$parser_cycl_blacklist$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)parsing_utilities.EQUAL), (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 23774L)
    public static SubLObject psp_lexicon_root_mt(SubLObject v_psp_lexicon) {
        if (v_psp_lexicon == parsing_utilities.UNPROVIDED) {
            v_psp_lexicon = parsing_vars.$psp_lexicon$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject root_mt = (SubLObject)parsing_utilities.$kw89$UNINITIALIZED;
        if (parsing_utilities.NIL != misc_utilities.initialized_p(v_psp_lexicon)) {
            root_mt = methods.funcall_instance_method_with_0_args(v_psp_lexicon, (SubLObject)parsing_utilities.$sym90$ROOT_MT);
        }
        if (parsing_utilities.NIL == misc_utilities.initialized_p(root_mt)) {
            root_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread);
        }
        return root_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 24107L)
    public static SubLObject psp_weight_to_float(final SubLObject psp_weight) {
        assert parsing_utilities.NIL != psp_chart.psp_weight_p(psp_weight) : psp_weight;
        return Numbers.divide(psp_weight, parsing_vars.$psp_max_weight$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 24328L)
    public static SubLObject psp_weight_from_float(final SubLObject v_float) {
        assert parsing_utilities.NIL != Types.floatp(v_float) : v_float;
        final SubLObject raw_float_weight = Numbers.multiply(v_float, parsing_vars.$psp_max_weight$.getGlobalValue());
        final SubLObject pcase_var = parsing_vars.$psp_weight_type$.getGlobalValue();
        if (pcase_var.eql((SubLObject)parsing_utilities.$kw93$INTEGER)) {
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)parsing_utilities.ZERO_INTEGER), Numbers.floor(raw_float_weight, (SubLObject)parsing_utilities.UNPROVIDED));
        }
        if (pcase_var.eql((SubLObject)parsing_utilities.$kw94$FLOAT)) {
            return raw_float_weight;
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 24701L)
    public static SubLObject remove_keyword_literals(final SubLObject cycl) {
        SubLObject copy = el_utilities.copy_expression(cycl);
        while (parsing_utilities.NIL != el_utilities.el_formula_p(copy) && parsing_utilities.NIL != cycl_utilities.expression_contains_keywordp(copy, (SubLObject)parsing_utilities.UNPROVIDED)) {
            final SubLObject arg_pos = cycl_utilities.arg_positions_if_bfs((SubLObject)parsing_utilities.$sym95$KEYWORDP, copy, (SubLObject)parsing_utilities.UNPROVIDED).first();
            if (parsing_utilities.NIL != list_utilities.singletonP(arg_pos)) {
                copy = (SubLObject)parsing_utilities.NIL;
            }
            else if (parsing_utilities.NIL != el_utilities.el_junction_p(list_utilities.get_nested_nth(copy, conses_high.butlast(arg_pos, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED))) {
                list_utilities.delete_nested_nth(copy, arg_pos);
            }
            else {
                list_utilities.delete_nested_nth(copy, conses_high.butlast(arg_pos, (SubLObject)parsing_utilities.UNPROVIDED));
            }
        }
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 25160L)
    public static SubLObject vp_parse_from_pspP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == el_utilities.formula_with_sequence_varP(formula) && ((parsing_utilities.NIL != el_utilities.el_binary_formula_p(formula) && parsing_utilities.NIL != genls.genl_in_any_mtP(cycl_utilities.formula_arg0(formula), parsing_utilities.$const96$TheVPParse)) || (parsing_utilities.NIL != el_utilities.el_unary_formula_p(formula) && parsing_utilities.NIL != genls.genl_in_any_mtP(cycl_utilities.formula_arg0(formula), parsing_utilities.$const97$SomeFn))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 25638L)
    public static SubLObject result_of_parsing_words(final SubLObject formula) {
        return conses_high.second(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 25718L)
    public static SubLObject result_of_parsing_span(final SubLObject formula) {
        return conses_high.third(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 25796L)
    public static SubLObject result_of_parsing_span_wXo_thelist(final SubLObject formula) {
        return conses_high.third(formula).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 25893L)
    public static SubLObject result_of_parsing_span_length(final SubLObject cycl) {
        return Sequences.length(result_of_parsing_span(cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 25997L)
    public static SubLObject result_of_parsing_category(final SubLObject formula) {
        return conses_high.fourth(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 26079L)
    public static SubLObject result_of_parsing_start(final SubLObject rop) {
        return result_of_parsing_span_wXo_thelist(rop).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 26225L)
    public static SubLObject result_of_parsing_end(final SubLObject rop) {
        return conses_high.last(result_of_parsing_span(rop), (SubLObject)parsing_utilities.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 26361L)
    public static SubLObject result_of_parsing_formulaP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula.isList() && parsing_utilities.$const98$TheResultOfParsing.eql(formula.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 26505L)
    public static SubLObject formula_contains_result_of_parsingP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != list_utilities.tree_find(parsing_utilities.$const98$TheResultOfParsing, formula, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) && parsing_utilities.NIL != cycl_utilities.expression_find_if((SubLObject)parsing_utilities.$sym99$RESULT_OF_PARSING_FORMULA_, formula, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 26712L)
    public static SubLObject formulas_containing_results_of_parsing(final SubLObject formula) {
        return list_utilities.tree_find_all_if((SubLObject)parsing_utilities.$sym99$RESULT_OF_PARSING_FORMULA_, formula, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 26844L)
    public static SubLObject token_list_from_span(final SubLObject start_index, final SubLObject end_index) {
        return list_utilities.new_num_list(Numbers.subtract(end_index, start_index), start_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 27057L)
    public static SubLObject result_of_parsing_highest_category(final SubLObject formula, SubLObject cat) {
        if (cat == parsing_utilities.UNPROVIDED) {
            cat = (SubLObject)parsing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_utilities.NIL != cat && parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parsing_utilities.NIL == genls.genl_in_any_mtP(cat, parsing_utilities.$const100$ParsingTemplateCategory)) {
            Errors.error((SubLObject)parsing_utilities.$str101$_A_doesn_t_genl_to___ParsingTempl, cat);
        }
        SubLObject v_answer = (SubLObject)parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)parsing_utilities.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(parsing_utilities.$const16$EverythingPSC, thread);
            v_answer = genls.max_cols(Sequences.delete(parsing_utilities.$const100$ParsingTemplateCategory, genls.all_genls_wrt(result_of_parsing_category(formula), (parsing_utilities.NIL != cat) ? cat : parsing_utilities.$const100$ParsingTemplateCategory, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED).first();
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 27543L)
    public static SubLObject devisable_verb_frameP(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != psp_chart.intransitive_frameP(frame, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)) || parsing_utilities.NIL != psp_chart.transitive_np_comp_frameP(frame, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 27842L)
    public static SubLObject verb_semtrans_from_denot_rolesXframe(final SubLObject denot, final SubLObject roles, final SubLObject frame, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject templates = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL != roles) {
            SubLObject subj_roles = (SubLObject)parsing_utilities.NIL;
            SubLObject dir_obj_roles = (SubLObject)parsing_utilities.NIL;
            SubLObject indir_obj_roles = (SubLObject)parsing_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(roles, roles, (SubLObject)parsing_utilities.$list102);
            subj_roles = roles.first();
            SubLObject current = roles.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, roles, (SubLObject)parsing_utilities.$list102);
            dir_obj_roles = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, roles, (SubLObject)parsing_utilities.$list102);
            indir_obj_roles = current.first();
            current = current.rest();
            if (parsing_utilities.NIL == current) {
                if (frame.eql(parsing_utilities.$const103$MiddleVoiceFrame)) {
                    SubLObject cdolist_list_var = dir_obj_roles;
                    SubLObject subj_role = (SubLObject)parsing_utilities.NIL;
                    subj_role = cdolist_list_var.first();
                    while (parsing_utilities.NIL != cdolist_list_var) {
                        templates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parsing_utilities.$const104$and, (SubLObject)ConsesLow.list(parsing_utilities.$const8$isa, (SubLObject)parsing_utilities.$kw105$ACTION, denot), reader.bq_cons(subj_role, (SubLObject)parsing_utilities.$list106)), templates);
                        cdolist_list_var = cdolist_list_var.rest();
                        subj_role = cdolist_list_var.first();
                    }
                }
                else if (parsing_utilities.NIL != psp_chart.intransitive_frameP(frame, mt)) {
                    SubLObject cdolist_list_var = subj_roles;
                    SubLObject subj_role = (SubLObject)parsing_utilities.NIL;
                    subj_role = cdolist_list_var.first();
                    while (parsing_utilities.NIL != cdolist_list_var) {
                        templates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parsing_utilities.$const104$and, (SubLObject)ConsesLow.list(parsing_utilities.$const8$isa, (SubLObject)parsing_utilities.$kw105$ACTION, denot), reader.bq_cons(subj_role, (SubLObject)parsing_utilities.$list106)), templates);
                        cdolist_list_var = cdolist_list_var.rest();
                        subj_role = cdolist_list_var.first();
                    }
                }
                else if (parsing_utilities.NIL != psp_chart.transitive_np_comp_frameP(frame, mt)) {
                    SubLObject cdolist_list_var = subj_roles;
                    SubLObject subj_role = (SubLObject)parsing_utilities.NIL;
                    subj_role = cdolist_list_var.first();
                    while (parsing_utilities.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$60 = dir_obj_roles;
                        SubLObject dir_obj_role = (SubLObject)parsing_utilities.NIL;
                        dir_obj_role = cdolist_list_var_$60.first();
                        while (parsing_utilities.NIL != cdolist_list_var_$60) {
                            templates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parsing_utilities.$const104$and, (SubLObject)ConsesLow.list(parsing_utilities.$const8$isa, (SubLObject)parsing_utilities.$kw105$ACTION, denot), reader.bq_cons(subj_role, (SubLObject)parsing_utilities.$list106), reader.bq_cons(dir_obj_role, (SubLObject)parsing_utilities.$list107)), templates);
                            cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                            dir_obj_role = cdolist_list_var_$60.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        subj_role = cdolist_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(roles, (SubLObject)parsing_utilities.$list102);
            }
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 28928L)
    public static SubLObject known_roles_for_denot(final SubLObject denot, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject roles = (SubLObject)parsing_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject doer_roles = known_subject_roles_for_denot(denot, mt, (SubLObject)parsing_utilities.UNPROVIDED);
            final SubLObject direct_object_roles = known_direct_object_roles_for_denot(denot, mt, (SubLObject)parsing_utilities.UNPROVIDED);
            final SubLObject indirect_object_roles = known_indirect_object_roles_for_denot(denot, mt, (SubLObject)parsing_utilities.UNPROVIDED);
            if (parsing_utilities.NIL != doer_roles || parsing_utilities.NIL != direct_object_roles || parsing_utilities.NIL != indirect_object_roles) {
                roles = (SubLObject)ConsesLow.list(doer_roles, direct_object_roles, indirect_object_roles);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return roles;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 29491L)
    public static SubLObject known_subject_roles_for_denot(final SubLObject denot, SubLObject mt, SubLObject best_onlyP) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (best_onlyP == parsing_utilities.UNPROVIDED) {
            best_onlyP = (SubLObject)parsing_utilities.NIL;
        }
        return required_arg1_preds(denot, parsing_utilities.$const108$doneBy, mt, best_onlyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 29664L)
    public static SubLObject known_direct_object_roles_for_denot(final SubLObject denot, SubLObject mt, SubLObject best_onlyP) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (best_onlyP == parsing_utilities.UNPROVIDED) {
            best_onlyP = (SubLObject)parsing_utilities.NIL;
        }
        return required_arg1_preds(denot, parsing_utilities.$const109$patient_GenericDirect, mt, best_onlyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 29857L)
    public static SubLObject known_indirect_object_roles_for_denot(final SubLObject denot, SubLObject mt, SubLObject best_onlyP) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (best_onlyP == parsing_utilities.UNPROVIDED) {
            best_onlyP = (SubLObject)parsing_utilities.NIL;
        }
        return required_arg1_preds(denot, parsing_utilities.$const110$patient_GenericIndirect, mt, best_onlyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 30346L)
    public static SubLObject required_arg1_preds(SubLObject col, SubLObject genl_pred, SubLObject mt, SubLObject best_onlyP) {
        if (genl_pred == parsing_utilities.UNPROVIDED) {
            genl_pred = (SubLObject)parsing_utilities.NIL;
        }
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (best_onlyP == parsing_utilities.UNPROVIDED) {
            best_onlyP = (SubLObject)parsing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        col = function_terms.naut_to_nart(col);
        if (parsing_utilities.NIL == fort_types_interface.collectionP(col)) {
            return (SubLObject)parsing_utilities.NIL;
        }
        SubLObject ans = (SubLObject)parsing_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject genl_pred_pairs = (SubLObject)parsing_utilities.NIL;
            final SubLObject rae_preds = (SubLObject)parsing_utilities.$list111;
            final SubLObject _prev_bind_0_$61 = parsing_utilities.$ra1p_rae_preds$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = parsing_utilities.$ra1p_ra1_preds$.currentBinding(thread);
            try {
                parsing_utilities.$ra1p_rae_preds$.bind(list_utilities.flatten(Mapping.mapcar((SubLObject)parsing_utilities.$sym112$ALL_SPEC_PREDICATES, rae_preds)), thread);
                parsing_utilities.$ra1p_ra1_preds$.bind(genl_predicates.all_spec_predicates(parsing_utilities.$const113$requiredArg1Pred, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), thread);
                SubLObject cdolist_list_var = (SubLObject)ConsesLow.cons(col, genls.all_genls(col, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
                SubLObject genl = (SubLObject)parsing_utilities.NIL;
                genl = cdolist_list_var.first();
                while (parsing_utilities.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$63 = ra1p_do_one_event_type(genl);
                    SubLObject req_pred = (SubLObject)parsing_utilities.NIL;
                    req_pred = cdolist_list_var_$63.first();
                    while (parsing_utilities.NIL != cdolist_list_var_$63) {
                        genl_pred_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(genl, req_pred), genl_pred_pairs);
                        cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                        req_pred = cdolist_list_var_$63.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    genl = cdolist_list_var.first();
                }
                genl_pred_pairs = Sequences.delete_duplicates(genl_pred_pairs, Symbols.symbol_function((SubLObject)parsing_utilities.EQUALP), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                final SubLObject spec_preds = (SubLObject)((parsing_utilities.NIL != genl_pred) ? genl_predicates.all_spec_predicates_among(genl_pred, Mapping.mapcar(Symbols.symbol_function((SubLObject)parsing_utilities.$sym114$SECOND), genl_pred_pairs), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) : parsing_utilities.NIL);
                SubLObject cdolist_list_var2 = genl_pred_pairs;
                SubLObject pair = (SubLObject)parsing_utilities.NIL;
                pair = cdolist_list_var2.first();
                while (parsing_utilities.NIL != cdolist_list_var2) {
                    if (parsing_utilities.NIL == genl_pred || parsing_utilities.NIL != subl_promotions.memberP(conses_high.second(pair), spec_preds, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                        ans = (SubLObject)ConsesLow.cons(pair, ans);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    pair = cdolist_list_var2.first();
                }
                if (parsing_utilities.NIL != parsing_utilities.$ra1p_show_pairsP$.getGlobalValue()) {
                    print_high.print(ans, (SubLObject)parsing_utilities.UNPROVIDED);
                }
                if (parsing_utilities.NIL != best_onlyP) {
                    final SubLObject sorted0 = Sort.sort(ans, Symbols.symbol_function((SubLObject)parsing_utilities.$sym115$GENL_PRED_), Symbols.symbol_function((SubLObject)parsing_utilities.$sym114$SECOND));
                    final SubLObject sorted2 = Sort.sort(sorted0, Symbols.symbol_function((SubLObject)parsing_utilities.$sym116$GENL_), Symbols.symbol_function((SubLObject)parsing_utilities.$sym117$FIRST));
                    ans = conses_high.second(sorted2.first());
                }
                else {
                    ans = remove_genl_preds(Sequences.delete_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)parsing_utilities.$sym114$SECOND), ans), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED);
                }
            }
            finally {
                parsing_utilities.$ra1p_ra1_preds$.rebind(_prev_bind_1_$62, thread);
                parsing_utilities.$ra1p_rae_preds$.rebind(_prev_bind_0_$61, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 32031L)
    public static SubLObject remove_genl_preds(final SubLObject preds, SubLObject key) {
        if (key == parsing_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)parsing_utilities.IDENTITY);
        }
        if (!preds.isList()) {
            return (SubLObject)parsing_utilities.NIL;
        }
        SubLObject ans = (SubLObject)parsing_utilities.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)parsing_utilities.NIL;
        pred = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject others = Sequences.remove(pred, preds, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            if (parsing_utilities.NIL == subl_promotions.memberP(Functions.funcall(key, pred), others, (SubLObject)parsing_utilities.$sym118$SPEC_PRED_, key)) {
                ans = (SubLObject)ConsesLow.cons(pred, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 32400L)
    public static SubLObject ra1p_do_one_event_type(final SubLObject event_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)parsing_utilities.NIL;
        SubLObject cdolist_list_var = parsing_utilities.$ra1p_ra1_preds$.getDynamicValue(thread);
        SubLObject ra1_pred = (SubLObject)parsing_utilities.NIL;
        ra1_pred = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$64 = ra1p_do_one_event_typeXpred(event_type, ra1_pred, (SubLObject)parsing_utilities.NIL);
            SubLObject req_pred = (SubLObject)parsing_utilities.NIL;
            req_pred = cdolist_list_var_$64.first();
            while (parsing_utilities.NIL != cdolist_list_var_$64) {
                ans = (SubLObject)ConsesLow.cons(req_pred, ans);
                cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                req_pred = cdolist_list_var_$64.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ra1_pred = cdolist_list_var.first();
        }
        cdolist_list_var = parsing_utilities.$ra1p_rae_preds$.getDynamicValue(thread);
        SubLObject rae_pred = (SubLObject)parsing_utilities.NIL;
        rae_pred = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$65 = ra1p_do_one_event_typeXpred(event_type, rae_pred, (SubLObject)parsing_utilities.T);
            SubLObject req_pred = (SubLObject)parsing_utilities.NIL;
            req_pred = cdolist_list_var_$65.first();
            while (parsing_utilities.NIL != cdolist_list_var_$65) {
                ans = (SubLObject)ConsesLow.cons(req_pred, ans);
                cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                req_pred = cdolist_list_var_$65.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rae_pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 32813L)
    public static SubLObject ra1p_do_one_event_typeXpred(final SubLObject event_type, final SubLObject pred, final SubLObject invertedP) {
        final SubLObject index_arg = (SubLObject)((parsing_utilities.NIL != invertedP) ? parsing_utilities.TWO_INTEGER : parsing_utilities.ONE_INTEGER);
        final SubLObject gather_arg = (SubLObject)((parsing_utilities.NIL != invertedP) ? parsing_utilities.ONE_INTEGER : parsing_utilities.TWO_INTEGER);
        if (parsing_utilities.NIL != somewhere_cache.somewhere_cached_pred_p(pred) && parsing_utilities.NIL == somewhere_cache.some_pred_assertion_somewhereP(pred, event_type, index_arg, (SubLObject)parsing_utilities.UNPROVIDED)) {
            return (SubLObject)parsing_utilities.NIL;
        }
        return kb_mapping_utilities.pred_values(event_type, pred, index_arg, gather_arg, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 33213L)
    public static SubLObject possibly_uniquify_variablefn(final SubLObject interp) {
        if (parsing_utilities.NIL == variablefn_termP(interp)) {
            return interp;
        }
        final SubLObject existing_var = cycl_utilities.formula_arg1(interp, (SubLObject)parsing_utilities.UNPROVIDED);
        final SubLObject new_var = unique_el_var_for_variablefn(interp);
        final SubLObject result = cycl_utilities.expression_subst(new_var, existing_var, interp, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 33636L)
    public static SubLObject unique_el_var_for_variablefn(final SubLObject interp) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(interp, (SubLObject)parsing_utilities.UNPROVIDED);
        SubLObject existing_var = (SubLObject)parsing_utilities.NIL;
        SubLObject type = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list119);
        existing_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list119);
        type = current.first();
        current = current.rest();
        if (parsing_utilities.NIL == current) {
            final SubLObject type_string = (parsing_utilities.NIL != good_type_for_var_nameP(type)) ? pph_main.generate_phrase(type, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) : cycl_variables.variable_name_without_prefix(existing_var);
            final SubLObject var_root = el_utilities.string_to_el_var_name(type_string);
            final SubLObject var_name = next_unique_var_name(var_root);
            final SubLObject var = cycl_variables.make_el_var(var_name);
            return var;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list119);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 34052L)
    public static SubLObject good_type_for_var_nameP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != forts.fort_p(type) && parsing_utilities.NIL == rkf_relevance_utilities.rkf_irrelevant_term(type, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 34226L)
    public static SubLObject variablefn_termP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && parsing_utilities.NIL != el_utilities.formula_arityE(obj, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.UNPROVIDED) && cycl_utilities.formula_arg0(obj).eql(parsing_utilities.$const120$VariableFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 34367L)
    public static SubLObject next_unique_var_name(final SubLObject var_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_num = dictionary.dictionary_lookup(parsing_vars.$variable_uniquification_store$.getDynamicValue(thread), var_name, (SubLObject)parsing_utilities.$str121$0);
        final SubLObject var_suffix = var_num.isNumber() ? Sequences.cconcatenate((SubLObject)parsing_utilities.$str122$_, string_utilities.to_string(var_num)) : var_num;
        final SubLObject result = Sequences.cconcatenate(var_name, var_suffix);
        if (var_num.isNumber()) {
            dictionary.dictionary_enter(parsing_vars.$variable_uniquification_store$.getDynamicValue(thread), var_name, number_utilities.f_1X(var_num));
        }
        else {
            dictionary.dictionary_enter(parsing_vars.$variable_uniquification_store$.getDynamicValue(thread), var_name, (SubLObject)parsing_utilities.ONE_INTEGER);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 35320L)
    public static SubLObject parsing_rewrite_of_inverseP(final SubLObject dispreferred_term, final SubLObject preferred_term, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = (SubLObject)parsing_utilities.NIL;
        }
        return parsing_rewrite_ofP(preferred_term, dispreferred_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 35488L)
    public static SubLObject parsing_rewrite_ofP(SubLObject term1, SubLObject term2, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = (SubLObject)parsing_utilities.NIL;
        }
        term1 = narts_high.nart_substitute(term1);
        term2 = narts_high.nart_substitute(term2);
        if (parsing_utilities.NIL != forts.fort_p(term1) && parsing_utilities.NIL != forts.fort_p(term2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != equals.direct_rewrite_ofP(term1, term2, mt) || parsing_utilities.NIL != subl_promotions.memberP(function_terms.nart_to_naut(term2), kb_mapping_utilities.pred_values_in_any_mt(term1, parsing_utilities.$const123$parsingConflateTo, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)parsing_utilities.EQUALP), Symbols.symbol_function((SubLObject)parsing_utilities.$sym124$NART_TO_NAUT)));
        }
        if (parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(term1)) {
            return subl_promotions.memberP(function_terms.nart_to_naut(term2), kb_mapping_utilities.pred_values_in_any_mt(term1, parsing_utilities.$const125$rewriteOf, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)parsing_utilities.EQUALP), (SubLObject)parsing_utilities.$sym124$NART_TO_NAUT);
        }
        if (term1.equal(relation_evaluation.cyc_evaluate(term2))) {
            return (SubLObject)parsing_utilities.T;
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 36213L)
    public static SubLObject parse_tree_creation_rules() {
        final SubLObject rules = forward.creation_template_allowable_rules(parsing_utilities.$const126$ParseTreeReificationTemplate);
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 36422L)
    public static SubLObject syntactic_node_p(final SubLObject v_object, SubLObject strictP) {
        if (strictP == parsing_utilities.UNPROVIDED) {
            strictP = parsing_vars.$use_strict_syntactic_node_checkingP$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != forts.fort_p(v_object) && (parsing_utilities.NIL == strictP || parsing_utilities.NIL != isa.isa_in_any_mtP(v_object, parsing_utilities.$const127$SyntacticNode)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 36622L)
    public static SubLObject lexical_nodeP(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, parsing_utilities.$const128$LexicalNode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 36711L)
    public static SubLObject phrasal_nodeP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != syntactic_node_p(v_object, (SubLObject)parsing_utilities.T) && parsing_utilities.NIL != list_utilities.non_empty_list_p(syntactic_node_dtrs(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 36851L)
    public static SubLObject syntactic_choice_node_p(final SubLObject v_object, SubLObject strictP) {
        if (strictP == parsing_utilities.UNPROVIDED) {
            strictP = parsing_vars.$use_strict_syntactic_node_checkingP$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != forts.fort_p(v_object) && parsing_utilities.NIL != isa.isa_in_any_mtP(v_object, parsing_utilities.$const129$SyntacticChoiceNode));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 37064L)
    public static SubLObject syntactic_node_dtrs(final SubLObject node) {
        final SubLObject pairs = inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(parsing_utilities.$const130$syntacticNodeNthDaughter, node, (SubLObject)parsing_utilities.$list131), parsing_utilities.$const16$EverythingPSC, (SubLObject)parsing_utilities.$list132);
        final SubLObject sorted = Sort.sort(pairs, Symbols.symbol_function((SubLObject)parsing_utilities.$sym133$_), Symbols.symbol_function((SubLObject)parsing_utilities.$sym114$SECOND));
        if (parsing_utilities.NIL != sorted) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)parsing_utilities.$sym117$FIRST), sorted);
        }
        return inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(parsing_utilities.$const134$syntacticDaughters, node, (SubLObject)parsing_utilities.$list135), parsing_utilities.$const16$EverythingPSC, (SubLObject)parsing_utilities.$list136);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 37602L)
    public static SubLObject syntactic_node_mother(final SubLObject node) {
        return inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(parsing_utilities.$const134$syntacticDaughters, (SubLObject)parsing_utilities.$sym137$_MOTHER, node), parsing_utilities.$const16$EverythingPSC, (SubLObject)parsing_utilities.$list138).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 37909L)
    public static SubLObject syntactic_node_root_node(final SubLObject node) {
        SubLObject candidate = node;
        for (SubLObject mother = syntactic_node_mother(candidate); parsing_utilities.NIL != mother; mother = syntactic_node_mother(candidate)) {
            candidate = mother;
        }
        return candidate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 38278L)
    public static SubLObject syntactic_node_nth_dtr(final SubLObject node, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dtr_num = number_utilities.f_1X(n);
        SubLObject dtr = (SubLObject)parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)parsing_utilities.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(parsing_utilities.$const16$EverythingPSC, thread);
            final SubLObject pred_var = parsing_utilities.$const130$syntacticNodeNthDaughter;
            if (parsing_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, (SubLObject)parsing_utilities.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, (SubLObject)parsing_utilities.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)parsing_utilities.NIL;
                final SubLObject token_var = (SubLObject)parsing_utilities.NIL;
                while (parsing_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (parsing_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)parsing_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)parsing_utilities.$kw30$GAF, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.NIL);
                            SubLObject done_var_$66 = (SubLObject)parsing_utilities.NIL;
                            final SubLObject token_var_$67 = (SubLObject)parsing_utilities.NIL;
                            while (parsing_utilities.NIL == done_var_$66) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                final SubLObject valid_$68 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$67.eql(gaf));
                                if (parsing_utilities.NIL != valid_$68 && assertions_high.gaf_arg2(gaf).eql(dtr_num)) {
                                    dtr = assertions_high.gaf_arg3(gaf);
                                }
                                done_var_$66 = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid_$68);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parsing_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (parsing_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 38651L)
    public static SubLObject syntactic_node_descendant_at_path(final SubLObject node, final SubLObject path) {
        SubLObject remaining_path;
        SubLObject node_at_path_so_far;
        for (remaining_path = path, node_at_path_so_far = node; parsing_utilities.NIL != node_at_path_so_far && parsing_utilities.NIL != remaining_path; node_at_path_so_far = syntactic_node_nth_dtr(node_at_path_so_far, remaining_path.first()), remaining_path = remaining_path.rest()) {}
        return node_at_path_so_far;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 39071L)
    public static SubLObject assert_parse_tree_info(final SubLObject sentence, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
        try {
            fi.$fi_error$.bind((SubLObject)parsing_utilities.NIL, thread);
            fi.$fi_warning$.bind((SubLObject)parsing_utilities.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_assert_wff_now(sentence, mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            final SubLObject fi_error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (parsing_utilities.NIL == successP) {
                Errors.error(fi.fi_error_string(fi_error));
            }
        }
        finally {
            fi.$fi_warning$.rebind(_prev_bind_2, thread);
            fi.$fi_error$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 39430L)
    public static SubLObject syntactic_node_propose_meaning(final SubLObject node, final SubLObject meaning, SubLObject pred, SubLObject mt) {
        if (pred == parsing_utilities.UNPROVIDED) {
            pred = parsing_utilities.$const139$proposedMeaning;
        }
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        assert_parse_tree_info((SubLObject)ConsesLow.list(pred, node, package_node_meaning(meaning)), mt);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 39743L)
    public static SubLObject syntactic_node_note_semantic_dependency(final SubLObject mother, final SubLObject mother_meaning, final SubLObject dtr, final SubLObject dtr_meaning, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const140$dependentMeaning, mother, package_node_meaning(mother_meaning), dtr, package_node_meaning(dtr_meaning)), mt);
        return mother;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 40189L)
    public static SubLObject syntactic_node_proposed_meanings(final SubLObject node, SubLObject mt, SubLObject pred) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        if (pred == parsing_utilities.UNPROVIDED) {
            pred = parsing_utilities.$const139$proposedMeaning;
        }
        if (parsing_utilities.NIL != genl_predicates.genl_predicate_in_any_mtP(pred, parsing_utilities.$const139$proposedMeaning)) {
            return ask_utilities.ask_variable((SubLObject)parsing_utilities.$sym141$_MEANING, (SubLObject)ConsesLow.listS(pred, node, (SubLObject)parsing_utilities.$list142), mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 40546L)
    public static SubLObject push_meanings_from_syntactic_node(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject meanings = (SubLObject)parsing_utilities.NIL;
        SubLObject node = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list143);
        meanings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list143);
        node = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)parsing_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)parsing_utilities.NIL;
        SubLObject current_$70 = (SubLObject)parsing_utilities.NIL;
        while (parsing_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_utilities.$list143);
            current_$70 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_utilities.$list143);
            if (parsing_utilities.NIL == conses_high.member(current_$70, (SubLObject)parsing_utilities.$list144, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                bad = (SubLObject)parsing_utilities.T;
            }
            if (current_$70 == parsing_utilities.$kw145$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (parsing_utilities.NIL != bad && parsing_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list143);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_utilities.$kw146$MT, current);
        final SubLObject mt = (parsing_utilities.NIL != mt_tail) ? conses_high.cadr(mt_tail) : parsing_vars.$parse_tree_mt$.getDynamicValue(thread);
        final SubLObject pred_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_utilities.$kw147$PRED, current);
        final SubLObject pred = (parsing_utilities.NIL != pred_tail) ? conses_high.cadr(pred_tail) : parsing_utilities.$const139$proposedMeaning;
        final SubLObject this_meaning = (SubLObject)parsing_utilities.$sym148$THIS_MEANING;
        return (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym149$CDOLIST, (SubLObject)ConsesLow.list(this_meaning, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym150$SYNTACTIC_NODE_PROPOSED_MEANINGS, node, mt, pred)), (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym151$CPUSHNEW, this_meaning, meanings, (SubLObject)parsing_utilities.$list152));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 40838L)
    public static SubLObject push_node_meaning_pairs_from_syntactic_node(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject meanings = (SubLObject)parsing_utilities.NIL;
        SubLObject node = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list143);
        meanings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list143);
        node = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)parsing_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)parsing_utilities.NIL;
        SubLObject current_$71 = (SubLObject)parsing_utilities.NIL;
        while (parsing_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_utilities.$list143);
            current_$71 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_utilities.$list143);
            if (parsing_utilities.NIL == conses_high.member(current_$71, (SubLObject)parsing_utilities.$list144, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                bad = (SubLObject)parsing_utilities.T;
            }
            if (current_$71 == parsing_utilities.$kw145$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (parsing_utilities.NIL != bad && parsing_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list143);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_utilities.$kw146$MT, current);
        final SubLObject mt = (parsing_utilities.NIL != mt_tail) ? conses_high.cadr(mt_tail) : parsing_vars.$parse_tree_mt$.getDynamicValue(thread);
        final SubLObject pred_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_utilities.$kw147$PRED, current);
        final SubLObject pred = (parsing_utilities.NIL != pred_tail) ? conses_high.cadr(pred_tail) : parsing_utilities.$const139$proposedMeaning;
        final SubLObject this_meaning = (SubLObject)parsing_utilities.$sym153$THIS_MEANING;
        return (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym149$CDOLIST, (SubLObject)ConsesLow.list(this_meaning, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym150$SYNTACTIC_NODE_PROPOSED_MEANINGS, node, mt, pred)), (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym151$CPUSHNEW, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym154$LIST, node, this_meaning), meanings, (SubLObject)parsing_utilities.$list152));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 41217L)
    public static SubLObject recently_created_parse_tree_elements() {
        return parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 41443L)
    public static SubLObject remembering_new_parse_tree_elements(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym155$CLET, (SubLObject)parsing_utilities.$list156, ConsesLow.append(body, (SubLObject)parsing_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 41582L)
    public static SubLObject forget_recently_created_parse_tree_elements() {
        parsing_utilities.$recently_created_parse_tree_elements$.setGlobalValue((SubLObject)parsing_utilities.NIL);
        return parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 41748L)
    public static SubLObject kill_recently_created_parse_tree_elements() {
        while (parsing_utilities.NIL != parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue()) {
            ke.ke_kill(parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue().first());
            parsing_utilities.$recently_created_parse_tree_elements$.setGlobalValue(parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue().rest());
        }
        return parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 42020L)
    public static SubLObject create_parse_tree_element(final SubLObject col, SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = mt_vars.$decontextualized_collection_mt$.getGlobalValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_constant = rkf_term_utilities.create_new_constant((SubLObject)((parsing_utilities.NIL != constant_handles.constant_p(col)) ? constants_high.constant_name(col) : parsing_utilities.$str157$ParseTreeElement), (SubLObject)ConsesLow.list(col), (SubLObject)parsing_utilities.NIL, mt, name_prefix, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.$kw158$UPCASE, (SubLObject)parsing_utilities.T, (SubLObject)parsing_utilities.T);
        if (parsing_utilities.NIL != parsing_utilities.$remember_new_parse_tree_elementsP$.getDynamicValue(thread)) {
            parsing_utilities.$recently_created_parse_tree_elements$.setGlobalValue((SubLObject)ConsesLow.cons(new_constant, parsing_utilities.$recently_created_parse_tree_elements$.getGlobalValue()));
        }
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 42531L)
    public static SubLObject hypothesize_parse_tree_element(final SubLObject col, SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = (SubLObject)parsing_utilities.$sym159$_INSTANCE;
        SubLObject instance = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = fi.$fi_error$.currentBinding(thread);
            final SubLObject _prev_bind_13 = fi.$fi_warning$.currentBinding(thread);
            try {
                control_vars.$within_assert$.bind((SubLObject)parsing_utilities.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)parsing_utilities.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)parsing_utilities.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)parsing_utilities.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)parsing_utilities.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)parsing_utilities.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)parsing_utilities.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)parsing_utilities.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)parsing_utilities.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)parsing_utilities.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)parsing_utilities.T, thread);
                fi.$fi_error$.bind((SubLObject)parsing_utilities.NIL, thread);
                fi.$fi_warning$.bind((SubLObject)parsing_utilities.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject v_bindings = prove.fi_hypothesize_int((SubLObject)ConsesLow.list(parsing_utilities.$const8$isa, (SubLObject)parsing_utilities.$sym159$_INSTANCE, col), mt, name_prefix, (SubLObject)parsing_utilities.UNPROVIDED);
                final SubLObject failure_reasons = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (parsing_utilities.NIL != failure_reasons) {
                    Errors.warn((SubLObject)parsing_utilities.$str160$Can_t_hypothesize_instance_of__S_, col, failure_reasons);
                }
                else {
                    instance = bindings.variable_lookup(var, v_bindings);
                }
            }
            finally {
                fi.$fi_warning$.rebind(_prev_bind_13, thread);
                fi.$fi_error$.rebind(_prev_bind_12, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                control_vars.$within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        return instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 43139L)
    public static SubLObject generate_choice_node(final SubLObject creator, SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject node = (SubLObject)parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            parsing_vars.$parse_tree_prefix$.bind(name_prefix, thread);
            node = create_parse_tree_element(parsing_utilities.$const129$SyntacticChoiceNode, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const161$syntacticNodeCreator, creator, node), (SubLObject)parsing_utilities.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 43546L)
    public static SubLObject choice_node_add_option_node(final SubLObject choice_node, final SubLObject option_node, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const162$optionNodes, choice_node, option_node), mt);
        return choice_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 43902L)
    public static SubLObject create_parse_tree(SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = mt_vars.$decontextualized_collection_mt$.getGlobalValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        final SubLObject tree = create_parse_tree_element(parsing_utilities.$const163$CycParseTree, mt, name_prefix);
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 44134L)
    public static SubLObject assert_parse_tree_root_node(final SubLObject tree, final SubLObject root_node, SubLObject mt) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const164$syntacticRootOfParseTree, tree, root_node), mt);
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 44374L)
    public static SubLObject create_parse_tree_with_root_node(final SubLObject root_node, SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        final SubLObject tree = create_parse_tree(mt, name_prefix);
        assert_parse_tree_root_node(tree, root_node, mt);
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 44694L)
    public static SubLObject content_mt_of_parse_tree(final SubLObject v_parse_tree) {
        return czer_main.cyc_find_or_create_nart((SubLObject)ConsesLow.list(parsing_utilities.$const165$ContentMtOfParseTreeFn, v_parse_tree), (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 44910L)
    public static SubLObject create_syntactic_node(final SubLObject tokenization, final SubLObject creator, final SubLObject category, final SubLObject span, final SubLObject lexical_nodeP, final SubLObject string, SubLObject rule, SubLObject mt, SubLObject name_prefix) {
        if (rule == parsing_utilities.UNPROVIDED) {
            rule = (SubLObject)parsing_utilities.NIL;
        }
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        if (parsing_utilities.NIL != lexical_nodeP) {
            return create_lexical_node(tokenization, creator, category, span, string, mt, name_prefix);
        }
        return create_phrasal_node(tokenization, creator, category, span, rule, string, mt, name_prefix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 45545L)
    public static SubLObject create_phrasal_node(final SubLObject tokenization, final SubLObject creator, final SubLObject category, final SubLObject span, final SubLObject rule, final SubLObject string, final SubLObject mt, final SubLObject name_prefix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject node = (SubLObject)parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            parsing_vars.$parse_tree_prefix$.bind(name_prefix, thread);
            node = create_parse_tree_element(parsing_utilities.$const127$SyntacticNode, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            if (parsing_utilities.NIL != creator) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const161$syntacticNodeCreator, creator, node), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (parsing_utilities.NIL != category) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const166$syntacticNodeCategory, node, category), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (parsing_utilities.NIL != string) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const167$syntacticNodeString, node, string), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (parsing_utilities.NIL != forts.fort_p(rule)) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const168$syntacticNodePhraseStructureRule, node, rule), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (interval_span.interval_span_length(span).eql((SubLObject)parsing_utilities.ONE_INTEGER)) {
                final SubLObject token_num = interval_span.interval_span_start(span);
                thread.resetMultipleValues();
                final SubLObject token = find_or_create_parse_token(tokenization, token_num, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                final SubLObject newP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (parsing_utilities.NIL != newP) {
                    assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const169$tokenString, token, string), (SubLObject)parsing_utilities.UNPROVIDED);
                    final SubLObject start_offset = compute_parse_token_start_offset(tokenization, token_num, string);
                    if (parsing_utilities.NIL != start_offset) {
                        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const170$tokenStartCharacterOffset, token, start_offset), (SubLObject)parsing_utilities.UNPROVIDED);
                    }
                }
                else if (parsing_utilities.NIL != string && parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !token_string(token).equal(string)) {
                    Errors.error((SubLObject)parsing_utilities.$str171$Token_node_mismatch__Token___S_st, token, token_string(token), string);
                }
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const172$syntacticNodeCoversToken, node, token), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            else {
                final SubLObject start = interval_span.interval_span_start(span);
                final SubLObject end = number_utilities.f_1_(interval_span.interval_span_end(span));
                final SubLObject token_set = (SubLObject)ConsesLow.list(parsing_utilities.$const173$CycParsingTokenContiguousSetFn, start, end, tokenization);
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const174$syntacticNodeCoversTokenSet, node, token_set), (SubLObject)parsing_utilities.UNPROVIDED);
            }
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 47195L)
    public static SubLObject assert_start_offset_for_token(final SubLObject token, SubLObject tokenization, SubLObject token_num, SubLObject string) {
        if (tokenization == parsing_utilities.UNPROVIDED) {
            tokenization = token_tokenization(token);
        }
        if (token_num == parsing_utilities.UNPROVIDED) {
            token_num = token_number(token);
        }
        if (string == parsing_utilities.UNPROVIDED) {
            string = token_string(token);
        }
        final SubLObject start_offset = compute_parse_token_start_offset(tokenization, token_num, string);
        if (parsing_utilities.NIL != start_offset) {
            assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const170$tokenStartCharacterOffset, token, start_offset), (SubLObject)parsing_utilities.UNPROVIDED);
        }
        return token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 47621L)
    public static SubLObject syntactic_node_string(final SubLObject syntactic_node) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(syntactic_node)) ? kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const167$syntacticNodeString, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 47801L)
    public static SubLObject syntactic_node_start_offset(final SubLObject syntactic_node) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(syntactic_node)) ? kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const175$syntacticNodeStartCharacterOffset, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 48001L)
    public static SubLObject syntactic_node_category(final SubLObject syntactic_node) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(syntactic_node)) ? kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const166$syntacticNodeCategory, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 48185L)
    public static SubLObject syntactic_node_agreement_pred(final SubLObject syntactic_node) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(syntactic_node)) ? kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const176$syntacticNodeAgreementPredicate, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 48385L)
    public static SubLObject syntactic_node_tree(final SubLObject syntactic_node) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(syntactic_node)) ? kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const177$nodeInSystem, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 48556L)
    public static SubLObject syntactic_node_penntag(final SubLObject syntactic_node) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(syntactic_node)) ? kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const178$syntacticNodePennTag, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 48738L)
    public static SubLObject parse_tree_content_mt(final SubLObject v_parse_tree) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_parse_tree)) ? kb_mapping_utilities.fpred_value_in_any_mt(v_parse_tree, parsing_utilities.$const179$contentMtOfParseTree, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 48907L)
    public static SubLObject syntactic_node_content_mt(final SubLObject syntactic_node) {
        final SubLObject tree = syntactic_node_tree(syntactic_node);
        return parse_tree_content_mt(tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 49064L)
    public static SubLObject syntactic_node_span(final SubLObject syntactic_node, final SubLObject tokenization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token = backward.removal_ask_variable((SubLObject)parsing_utilities.$kw180$TOKEN, (SubLObject)ConsesLow.listS(parsing_utilities.$const172$syntacticNodeCoversToken, syntactic_node, (SubLObject)parsing_utilities.$list181), parsing_utilities.$const38$InferencePSC, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED).first();
        final SubLObject token_set = kb_mapping_utilities.fpred_value_in_any_mt(syntactic_node, parsing_utilities.$const174$syntacticNodeCoversTokenSet, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        if (parsing_utilities.NIL != token && token_tokenization(token).eql(tokenization)) {
            final SubLObject token_num = token_number(token);
            if (parsing_utilities.NIL != token_num) {
                return interval_span.get_interval_span(token_num, number_utilities.f_1X(token_num));
            }
        }
        if (parsing_utilities.NIL != token_set) {
            final SubLObject pattern = (SubLObject)ConsesLow.list(parsing_utilities.$const173$CycParsingTokenContiguousSetFn, (SubLObject)parsing_utilities.$list182, (SubLObject)parsing_utilities.$list183, tokenization);
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(token_set, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (parsing_utilities.NIL != success) {
                final SubLObject last_token_num = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)parsing_utilities.$sym184$LAST_TOKEN_NUM, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                final SubLObject start;
                final SubLObject first_token_num = start = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)parsing_utilities.$sym185$FIRST_TOKEN_NUM, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                final SubLObject end = number_utilities.f_1X(last_token_num);
                return interval_span.get_interval_span(start, end);
            }
        }
        Errors.sublisp_break((SubLObject)parsing_utilities.$str186$Couldn_t_get_interval_span_for__S, new SubLObject[] { syntactic_node, tokenization });
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 49984L)
    public static SubLObject create_lexical_node(final SubLObject tokenization, final SubLObject creator, final SubLObject category, final SubLObject span, final SubLObject string, final SubLObject mt, final SubLObject name_prefix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject node = (SubLObject)parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        try {
            parsing_vars.$parse_tree_mt$.bind(mt, thread);
            final SubLObject _prev_bind_0_$72 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
            try {
                parsing_vars.$parse_tree_prefix$.bind(name_prefix, thread);
                node = create_parse_tree_element(parsing_utilities.$const128$LexicalNode, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            }
            finally {
                parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_0_$72, thread);
            }
            if (parsing_utilities.NIL != creator) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const187$lexicalNodeCreator, creator, node), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (parsing_utilities.NIL != category) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const166$syntacticNodeCategory, node, category), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (parsing_utilities.NIL != string) {
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const167$syntacticNodeString, node, string), (SubLObject)parsing_utilities.UNPROVIDED);
            }
            if (interval_span.interval_span_length(span).eql((SubLObject)parsing_utilities.ONE_INTEGER)) {
                final SubLObject token_num = interval_span.interval_span_start(span);
                final SubLObject token = find_or_create_parse_token(tokenization, token_num, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const188$lexicalNodeCoversToken, node, token), (SubLObject)parsing_utilities.UNPROVIDED);
                if (parsing_utilities.NIL != string && !string.equal(token_string(token))) {
                    assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const169$tokenString, token, string), (SubLObject)parsing_utilities.UNPROVIDED);
                    final SubLObject start_offset = compute_parse_token_start_offset(tokenization, token_num, string);
                    if (parsing_utilities.NIL != start_offset) {
                        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const170$tokenStartCharacterOffset, token, start_offset), (SubLObject)parsing_utilities.UNPROVIDED);
                    }
                }
            }
            else {
                final SubLObject start = interval_span.interval_span_start(span);
                final SubLObject end = number_utilities.f_1_(interval_span.interval_span_end(span));
                final SubLObject token_set = (SubLObject)ConsesLow.list(parsing_utilities.$const173$CycParsingTokenContiguousSetFn, start, end, tokenization);
                assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const189$lexicalNodeCoversTokenSet, node, token_set), (SubLObject)parsing_utilities.UNPROVIDED);
            }
        }
        finally {
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0, thread);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 51343L)
    public static SubLObject syntactic_node_add_dtr(final SubLObject node, final SubLObject dtr_node, SubLObject dtr_num, SubLObject mt) {
        if (dtr_num == parsing_utilities.UNPROVIDED) {
            dtr_num = (SubLObject)parsing_utilities.NIL;
        }
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        if (parsing_utilities.NIL == dtr_num) {
            dtr_num = (SubLObject)parsing_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = ask_utilities.ask_variable((SubLObject)parsing_utilities.$sym190$_N, (SubLObject)ConsesLow.listS(parsing_utilities.$const130$syntacticNodeNthDaughter, node, (SubLObject)parsing_utilities.$list191), mt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
            SubLObject n = (SubLObject)parsing_utilities.NIL;
            n = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                dtr_num = Numbers.max(dtr_num, n);
                cdolist_list_var = cdolist_list_var.rest();
                n = cdolist_list_var.first();
            }
            dtr_num = Numbers.add(dtr_num, (SubLObject)parsing_utilities.ONE_INTEGER);
        }
        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const130$syntacticNodeNthDaughter, node, dtr_num, dtr_node), mt);
        if (parsing_utilities.NIL == isa.isaP(dtr_node, parsing_utilities.$const129$SyntacticChoiceNode, mt, (SubLObject)parsing_utilities.UNPROVIDED)) {
            assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const192$syntacticNodeNthContributor, node, dtr_num, dtr_node), mt);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 52111L)
    public static SubLObject syntactic_node_add_head_dtr(final SubLObject node, final SubLObject dtr_node, SubLObject dtr_num, SubLObject mt) {
        if (dtr_num == parsing_utilities.UNPROVIDED) {
            dtr_num = (SubLObject)parsing_utilities.NIL;
        }
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = parsing_vars.$parse_tree_mt$.getDynamicValue();
        }
        syntactic_node_add_dtr(node, dtr_node, dtr_num, mt);
        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const193$syntacticNodeHeadDaughter, node, dtr_node), mt);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 52426L)
    public static SubLObject package_node_meaning(final SubLObject meaning) {
        return el_utilities.make_unary_formula(parsing_utilities.$const194$SubLQuoteFn, meaning);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 52630L)
    public static SubLObject syntactic_node_to_nested_list(final SubLObject node) {
        final SubLObject dtrs = syntactic_node_dtrs(node);
        return (SubLObject)((parsing_utilities.NIL != dtrs) ? ConsesLow.cons(node, Mapping.mapcar((SubLObject)parsing_utilities.$sym195$SYNTACTIC_NODE_TO_NESTED_LIST, dtrs)) : node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 52921L)
    public static SubLObject phrasal_node_string_from_dtrs(final SubLObject dtrs) {
        SubLObject string = (SubLObject)parsing_utilities.$str196$;
        SubLObject cdolist_list_var = dtrs;
        SubLObject node = (SubLObject)parsing_utilities.NIL;
        node = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject token_string = syntactic_node_string(node);
            if (!token_string.isString()) {
                Errors.error((SubLObject)parsing_utilities.$str197$Couldn_t_find_string_for__S, node);
            }
            string = ((parsing_utilities.NIL != string_utilities.empty_string_p(string)) ? token_string : Sequences.cconcatenate(string, new SubLObject[] { parsing_utilities.$str198$_, token_string }));
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 53339L)
    public static SubLObject phrasal_node_span_from_dtrs(final SubLObject dtrs, final SubLObject tokenization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject end;
        final SubLObject start = end = syntactic_node_span_start(dtrs.first(), tokenization);
        SubLObject cdolist_list_var = dtrs;
        SubLObject dtr = (SubLObject)parsing_utilities.NIL;
        dtr = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            if (parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !end.eql(syntactic_node_span_start(dtr, tokenization))) {
                Errors.error((SubLObject)parsing_utilities.$str199$Bad_dtrs___S, dtrs);
            }
            end = syntactic_node_span_end(dtr, tokenization);
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        }
        return interval_span.get_interval_span(start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 53783L)
    public static SubLObject syntactic_node_span_start(final SubLObject node, final SubLObject tokenization) {
        final SubLObject span = syntactic_node_span(node, tokenization);
        assert parsing_utilities.NIL != interval_span.interval_span_p(span) : span;
        return interval_span.interval_span_start(span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 54026L)
    public static SubLObject syntactic_node_span_end(final SubLObject node, final SubLObject tokenization) {
        final SubLObject span = syntactic_node_span(node, tokenization);
        assert parsing_utilities.NIL != interval_span.interval_span_p(span) : span;
        return interval_span.interval_span_end(span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 54355L)
    public static SubLObject initialize_penntag_phrase_categories() {
        final SubLObject ans = ask_utilities.query_template((SubLObject)parsing_utilities.$list204, (SubLObject)parsing_utilities.$list205, parsing_utilities.$const38$InferencePSC, (SubLObject)parsing_utilities.$list206);
        parsing_utilities.$penntag_phrase_categories$.setGlobalValue(ans);
        return parsing_utilities.$penntag_phrase_categories$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 54657L)
    public static SubLObject penntag_phrase_categories() {
        if (parsing_utilities.NIL == list_utilities.alist_p(parsing_utilities.$penntag_phrase_categories$.getGlobalValue())) {
            initialize_penntag_phrase_categories();
        }
        return parsing_utilities.$penntag_phrase_categories$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 54833L)
    public static SubLObject cycl_penntag_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP(penntag_phrase_categories(), v_object, Symbols.symbol_function((SubLObject)parsing_utilities.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 54944L)
    public static SubLObject penntag_category(final SubLObject penntag) {
        assert parsing_utilities.NIL != forts.fort_p(penntag) : penntag;
        return list_utilities.alist_lookup_without_values(penntag_phrase_categories(), penntag, Symbols.symbol_function((SubLObject)parsing_utilities.EQL), (SubLObject)parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 55106L)
    public static SubLObject denots_of_stringXpenntag(final SubLObject string, final SubLObject penntag) {
        final SubLObject category = penntag_category(penntag);
        return (SubLObject)((parsing_utilities.NIL != lexicon_accessors.speech_partP(category, (SubLObject)parsing_utilities.UNPROVIDED)) ? lexicon_accessors.denots_of_stringXspeech_part(string, category, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 55358L)
    public static SubLObject initialize_penntag_forts() {
        final SubLObject ans = ask_utilities.query_template((SubLObject)parsing_utilities.$list209, (SubLObject)parsing_utilities.$list210, parsing_utilities.$const38$InferencePSC, (SubLObject)parsing_utilities.$list206);
        parsing_utilities.$penntag_forts$.setGlobalValue(ans);
        return parsing_utilities.$penntag_forts$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 55620L)
    public static SubLObject penntag_forts() {
        if (parsing_utilities.NIL == list_utilities.alist_p(parsing_utilities.$penntag_forts$.getGlobalValue())) {
            initialize_penntag_forts();
        }
        return parsing_utilities.$penntag_forts$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 55748L)
    public static SubLObject penntag_to_cycl(final SubLObject penntag) {
        assert parsing_utilities.NIL != Types.stringp(penntag) : penntag;
        return list_utilities.alist_lookup_without_values(penntag_forts(), penntag, Symbols.symbol_function((SubLObject)parsing_utilities.EQUALP), (SubLObject)parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 55901L)
    public static SubLObject cycl_penntag_to_keyword(final SubLObject cycl_penntag) {
        final SubLObject string = list_utilities.alist_reverse_lookup_without_values(penntag_forts(), cycl_penntag, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        return (SubLObject)((parsing_utilities.NIL != string) ? Symbols.make_keyword(string) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 56094L)
    public static SubLObject find_or_create_parse_token(final SubLObject tokenization, final SubLObject token_num, SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = mt_vars.$decontextualized_collection_mt$.getGlobalValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        SubLObject token = find_parse_token(tokenization, token_num);
        final SubLObject newP = Types.sublisp_null(token);
        if (parsing_utilities.NIL == token) {
            token = create_parse_token(tokenization, token_num, mt, name_prefix);
        }
        return Values.values(token, newP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 56661L)
    public static SubLObject find_parse_token(final SubLObject tokenization, final SubLObject token_num) {
        final SubLObject token = ask_utilities.ask_variable((SubLObject)parsing_utilities.$sym212$_TOKEN, (SubLObject)ConsesLow.listS(parsing_utilities.$const213$nthTokenInTokenization, tokenization, token_num, (SubLObject)parsing_utilities.$list214), parsing_utilities.$const16$EverythingPSC, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED).first();
        return token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 56868L)
    public static SubLObject create_parse_token(final SubLObject tokenization, final SubLObject token_num, SubLObject mt, SubLObject name_prefix) {
        if (mt == parsing_utilities.UNPROVIDED) {
            mt = mt_vars.$decontextualized_collection_mt$.getGlobalValue();
        }
        if (name_prefix == parsing_utilities.UNPROVIDED) {
            name_prefix = parsing_vars.$parse_tree_prefix$.getDynamicValue();
        }
        assert parsing_utilities.NIL != subl_promotions.non_negative_integer_p(token_num) : token_num;
        final SubLObject token = create_parse_tree_element(parsing_utilities.$const216$CycParsingToken, mt, name_prefix);
        assert_parse_tree_info((SubLObject)ConsesLow.list(parsing_utilities.$const213$nthTokenInTokenization, tokenization, token_num, token), mt);
        return token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 57269L)
    public static SubLObject compute_parse_token_start_offset(final SubLObject tokenization, final SubLObject token_num, final SubLObject token_string) {
        assert parsing_utilities.NIL != subl_promotions.non_negative_integer_p(token_num) : token_num;
        if (token_num.isZero()) {
            return (SubLObject)parsing_utilities.ZERO_INTEGER;
        }
        final SubLObject preceding_token = find_parse_token(tokenization, number_utilities.f_1_(token_num));
        final SubLObject preceding_offset = (SubLObject)((parsing_utilities.NIL != preceding_token) ? token_start_offset(preceding_token) : parsing_utilities.NIL);
        if (parsing_utilities.NIL != preceding_offset) {
            final SubLObject preceding_string = token_string(preceding_token);
            final SubLObject cycl_full_string = tokenization_input_string(tokenization);
            final SubLObject full_string = (parsing_utilities.NIL != unicode_nauts.unicode_naut_p(cycl_full_string, (SubLObject)parsing_utilities.UNPROVIDED)) ? unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(cycl_full_string, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) : cycl_full_string;
            final SubLObject subl_token_string = (parsing_utilities.NIL != unicode_nauts.unicode_naut_p(token_string, (SubLObject)parsing_utilities.UNPROVIDED)) ? unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(token_string, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) : token_string;
            final SubLObject truncate_length = Numbers.add(preceding_offset, Sequences.length(preceding_string));
            final SubLObject remaining_string = (SubLObject)((parsing_utilities.NIL != full_string) ? string_utilities.substring(full_string, truncate_length, (SubLObject)parsing_utilities.UNPROVIDED) : parsing_utilities.NIL);
            final SubLObject local_offset = (SubLObject)((parsing_utilities.NIL != remaining_string) ? Sequences.search(subl_token_string, remaining_string, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) : parsing_utilities.NIL);
            final SubLObject overall_offset = (SubLObject)((parsing_utilities.NIL != local_offset) ? Numbers.add(local_offset, truncate_length) : parsing_utilities.NIL);
            if (parsing_utilities.NIL != overall_offset) {
                return overall_offset;
            }
        }
        Errors.warn((SubLObject)parsing_utilities.$str217$Failed_to_compute_start_offset_fo, token_num, token_string, tokenization);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 58584L)
    public static SubLObject token_start_offset(final SubLObject token) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(token)) ? kb_mapping_utilities.fpred_value_in_any_mt(token, parsing_utilities.$const170$tokenStartCharacterOffset, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 58740L)
    public static SubLObject token_number(final SubLObject token) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(token)) ? kb_mapping_utilities.fpred_value_in_any_mt(token, parsing_utilities.$const213$nthTokenInTokenization, (SubLObject)parsing_utilities.THREE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 58887L)
    public static SubLObject token_string(final SubLObject token) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(token)) ? kb_mapping_utilities.fpred_value_in_any_mt(token, parsing_utilities.$const169$tokenString, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 59023L)
    public static SubLObject token_tokenization(final SubLObject token) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(token)) ? kb_mapping_utilities.fpred_value_in_any_mt(token, parsing_utilities.$const218$tokenTokenization, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 59171L)
    public static SubLObject tokenization_peg(final SubLObject tokenization) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(tokenization)) ? kb_mapping_utilities.fpred_value_in_any_mt(tokenization, parsing_utilities.$const219$pegTokenizations, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 59337L)
    public static SubLObject tokenization_tokens(final SubLObject tokenization) {
        return (SubLObject)((parsing_utilities.NIL != kb_indexing_datastructures.indexed_term_p(tokenization)) ? kb_mapping_utilities.pred_values_in_any_mt(tokenization, parsing_utilities.$const218$tokenTokenization, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE) : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 59507L)
    public static SubLObject tokenization_input_string(final SubLObject tokenization) {
        return kb_mapping_utilities.fpred_value_in_any_mt(tokenization, parsing_utilities.$const220$tokenizationInputString, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 59649L)
    public static SubLObject tokenization_token_count(final SubLObject tokenization) {
        final SubLObject asserted = kb_mapping_utilities.fpred_value_in_any_mt(tokenization, parsing_utilities.$const221$numberOfTokensInTokenization, (SubLObject)parsing_utilities.ONE_INTEGER, (SubLObject)parsing_utilities.TWO_INTEGER, (SubLObject)parsing_utilities.$kw31$TRUE);
        return (SubLObject)((parsing_utilities.NIL != asserted) ? asserted : parsing_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 59841L)
    public static SubLObject create_token_mapping(final SubLObject tokens1, final SubLObject tokens2, SubLObject key1, SubLObject key2) {
        if (key1 == parsing_utilities.UNPROVIDED) {
            key1 = Symbols.symbol_function((SubLObject)parsing_utilities.IDENTITY);
        }
        if (key2 == parsing_utilities.UNPROVIDED) {
            key2 = Symbols.symbol_function((SubLObject)parsing_utilities.IDENTITY);
        }
        SubLObject cur_index = (SubLObject)parsing_utilities.ZERO_INTEGER;
        SubLObject token_mapping = (SubLObject)parsing_utilities.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(tokens2), i = (SubLObject)parsing_utilities.NIL, i = (SubLObject)parsing_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)parsing_utilities.ONE_INTEGER)) {
            token_mapping = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(i, i), token_mapping);
        }
        SubLObject list_var = (SubLObject)parsing_utilities.NIL;
        SubLObject word = (SubLObject)parsing_utilities.NIL;
        SubLObject j = (SubLObject)parsing_utilities.NIL;
        list_var = tokens2;
        word = list_var.first();
        for (j = (SubLObject)parsing_utilities.ZERO_INTEGER; parsing_utilities.NIL != list_var; list_var = list_var.rest(), word = list_var.first(), j = Numbers.add((SubLObject)parsing_utilities.ONE_INTEGER, j)) {
            final SubLObject cur_token = Functions.funcall(key1, ConsesLow.nth(cur_index, tokens1));
            final SubLObject next_token = Functions.funcall(key1, ConsesLow.nth(Numbers.add(cur_index, (SubLObject)parsing_utilities.ONE_INTEGER), tokens1));
            final SubLObject word_string = Functions.funcall(key2, word);
            if (j.numE((SubLObject)parsing_utilities.ZERO_INTEGER)) {
                ConsesLow.rplacd(conses_high.assoc((SubLObject)parsing_utilities.ZERO_INTEGER, token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), (SubLObject)parsing_utilities.ZERO_INTEGER);
            }
            else if (j.numE(Numbers.subtract(Sequences.length(tokens2), (SubLObject)parsing_utilities.ONE_INTEGER))) {
                ConsesLow.rplacd(conses_high.assoc(j, token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), Numbers.subtract(Sequences.length(tokens1), (SubLObject)parsing_utilities.ONE_INTEGER));
            }
            else if (parsing_utilities.NIL != Strings.string_equal(word_string, cur_token, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                update_token_mapping(token_mapping, j, cur_index);
            }
            else if (next_token.isString() && parsing_utilities.NIL != Strings.string_equal(word_string, next_token, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                cur_index = Numbers.add(cur_index, (SubLObject)parsing_utilities.ONE_INTEGER);
                update_token_mapping(token_mapping, j, cur_index);
            }
            else if (parsing_utilities.NIL != string_utilities.substringP(word_string, cur_token, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) && next_token.isString() && parsing_utilities.NIL == string_utilities.substringP(word_string, next_token, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                ConsesLow.rplacd(conses_high.assoc(j, token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), cur_index);
                if (parsing_utilities.NIL != string_utilities.ends_with(cur_token, word_string, (SubLObject)parsing_utilities.UNPROVIDED)) {
                    cur_index = Numbers.add(cur_index, (SubLObject)parsing_utilities.ONE_INTEGER);
                }
            }
            else if (parsing_utilities.NIL == string_utilities.substringP(word_string, cur_token, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) && next_token.isString() && parsing_utilities.NIL != string_utilities.substringP(word_string, next_token, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED)) {
                cur_index = Numbers.add(cur_index, (SubLObject)parsing_utilities.ONE_INTEGER);
                ConsesLow.rplacd(conses_high.assoc(j, token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), cur_index);
            }
            else {
                ConsesLow.rplacd(conses_high.assoc(j, token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), cur_index);
            }
        }
        return token_mapping;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 61942L)
    public static SubLObject update_token_mapping(final SubLObject token_mapping, final SubLObject word_index, SubLObject token_index) {
        ConsesLow.rplacd(conses_high.assoc(word_index, token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), token_index);
        if (word_index.numG((SubLObject)parsing_utilities.ZERO_INTEGER) && token_index.numG((SubLObject)parsing_utilities.ZERO_INTEGER)) {
            ConsesLow.rplacd(conses_high.assoc(Numbers.subtract(word_index, (SubLObject)parsing_utilities.ONE_INTEGER), token_mapping, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), Numbers.subtract(token_index, (SubLObject)parsing_utilities.ONE_INTEGER));
            token_index = Numbers.add(token_index, (SubLObject)parsing_utilities.ONE_INTEGER);
        }
        return token_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 62249L)
    public static SubLObject construct_parse_expression_from_syntactic_node(final SubLObject root_node) {
        final SubLObject penntag = syntactic_node_penntag(root_node);
        final SubLObject category = cycl_penntag_to_keyword(penntag);
        final SubLObject lexicalP = lexical_nodeP(root_node);
        if (parsing_utilities.NIL != lexicalP) {
            return (SubLObject)ConsesLow.list(category, syntactic_node_string(root_node));
        }
        final SubLObject subexpressions = Mapping.mapcar((SubLObject)parsing_utilities.$sym222$CONSTRUCT_PARSE_EXPRESSION_FROM_SYNTACTIC_NODE, syntactic_node_dtrs(root_node));
        return (SubLObject)ConsesLow.cons(category, subexpressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 62785L)
    public static SubLObject construct_subl_parse_tree_from_syntactic_node(final SubLObject root_node, SubLObject trees_to_nodes) {
        if (trees_to_nodes == parsing_utilities.UNPROVIDED) {
            trees_to_nodes = (SubLObject)parsing_utilities.NIL;
        }
        assert parsing_utilities.NIL != phrasal_nodeP(root_node) : root_node;
        final SubLObject v_parse_tree = parse_tree.new_parse_tree(construct_parse_expression_from_syntactic_node(root_node), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        if (parsing_utilities.NIL != dictionary.dictionary_p(trees_to_nodes)) {
            add_parse_tree_to_node_mappings(root_node, v_parse_tree, trees_to_nodes);
        }
        return v_parse_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 63309L)
    public static SubLObject add_parse_tree_to_node_mappings(final SubLObject root_node, final SubLObject v_parse_tree, final SubLObject trees_to_nodes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_enter(trees_to_nodes, v_parse_tree, root_node);
        SubLObject list_var = (SubLObject)parsing_utilities.NIL;
        SubLObject subnode = (SubLObject)parsing_utilities.NIL;
        SubLObject dtr_num = (SubLObject)parsing_utilities.NIL;
        list_var = syntactic_node_dtrs(root_node);
        subnode = list_var.first();
        for (dtr_num = (SubLObject)parsing_utilities.ZERO_INTEGER; parsing_utilities.NIL != list_var; list_var = list_var.rest(), subnode = list_var.first(), dtr_num = Numbers.add((SubLObject)parsing_utilities.ONE_INTEGER, dtr_num)) {
            final SubLObject subtree = methods.funcall_instance_method_with_1_args(v_parse_tree, (SubLObject)parsing_utilities.$sym224$GET_DAUGHTER, dtr_num);
            if (parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parsing_utilities.NIL == parse_tree.parse_tree_p(subtree)) {
                Errors.error((SubLObject)parsing_utilities.$str225$Couldn_t_find_dtr__S_of__S, dtr_num, v_parse_tree);
            }
            add_parse_tree_to_node_mappings(subnode, subtree, trees_to_nodes);
        }
        return trees_to_nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 65451L)
    public static SubLObject with_parsing_filter_piles(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list226);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject good = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list226);
        good = current.first();
        current = current.rest();
        final SubLObject bad = (SubLObject)(current.isCons() ? current.first() : parsing_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)parsing_utilities.$list226);
        current = current.rest();
        if (parsing_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym155$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym227$_GOOD_PARSING_PILE_, good), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym228$_BAD_PARSING_PILE_, bad)), ConsesLow.append(body, (SubLObject)parsing_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list226);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 65623L)
    public static SubLObject parsing_filter_accepts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject parse = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list229);
        parse = current.first();
        current = current.rest();
        if (parsing_utilities.NIL == current) {
            return (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym230$CPUSH, parse, (SubLObject)parsing_utilities.$list231);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list229);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 65721L)
    public static SubLObject parsing_filter_rejects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject parse = (SubLObject)parsing_utilities.NIL;
        SubLObject reason = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list232);
        parse = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list232);
        reason = current.first();
        current = current.rest();
        if (parsing_utilities.NIL == current) {
            return (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym230$CPUSH, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym154$LIST, parse, reason), (SubLObject)parsing_utilities.$list233);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list232);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 65838L)
    public static SubLObject apply_elimination_parsing_filter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filter = (SubLObject)parsing_utilities.NIL;
        SubLObject denot_accessor = (SubLObject)parsing_utilities.NIL;
        SubLObject diag_accessor = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list234);
        filter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list234);
        denot_accessor = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list234);
        diag_accessor = current.first();
        current = current.rest();
        if (parsing_utilities.NIL == current) {
            final SubLObject filter_response = (SubLObject)parsing_utilities.$sym235$FILTER_RESPONSE;
            final SubLObject some_good = (SubLObject)parsing_utilities.$sym236$SOME_GOOD;
            final SubLObject some_bad = (SubLObject)parsing_utilities.$sym237$SOME_BAD;
            final SubLObject this_candidate = (SubLObject)parsing_utilities.$sym238$THIS_CANDIDATE;
            return (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym155$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(some_good, (SubLObject)parsing_utilities.$list239), reader.bq_cons(some_bad, (SubLObject)parsing_utilities.$list233)), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym149$CDOLIST, reader.bq_cons(this_candidate, (SubLObject)parsing_utilities.$list240), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym155$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filter_response, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym241$FUNCALL, filter, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym241$FUNCALL, denot_accessor, this_candidate)))), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym242$PIF, filter_response, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym230$CPUSH, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym154$LIST, this_candidate, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym243$CONS, filter_response, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym241$FUNCALL, diag_accessor, this_candidate))), some_bad), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym230$CPUSH, this_candidate, some_good)))), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym244$PWHEN, (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym245$PROPER_LIST_P, some_good), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym246$CSETQ, (SubLObject)parsing_utilities.$sym227$_GOOD_PARSING_PILE_, some_good), (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym246$CSETQ, (SubLObject)parsing_utilities.$sym228$_BAD_PARSING_PILE_, some_bad)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list234);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 67007L)
    public static SubLObject save_parsing_filter_piles(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject good = (SubLObject)parsing_utilities.NIL;
        SubLObject bad = (SubLObject)parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list247);
        good = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list247);
        bad = current.first();
        current = current.rest();
        if (parsing_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)parsing_utilities.$sym248$PROGN, (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym246$CSETQ, good, (SubLObject)parsing_utilities.$list240), (SubLObject)ConsesLow.listS((SubLObject)parsing_utilities.$sym246$CSETQ, bad, (SubLObject)parsing_utilities.$list233));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list247);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 67155L)
    public static SubLObject apply_boolean_parsing_filter(final SubLObject parses, final SubLObject filter, final SubLObject accessor, SubLObject quietP) {
        if (quietP == parsing_utilities.UNPROVIDED) {
            quietP = (SubLObject)parsing_utilities.NIL;
        }
        SubLObject if_some_bad = (SubLObject)parsing_utilities.NIL;
        SubLObject if_all_bad = (SubLObject)parsing_utilities.NIL;
        SubLObject all_badP = (SubLObject)parsing_utilities.T;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = (SubLObject)parsing_utilities.NIL;
        parse = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject diagnostic = Functions.funcall(filter, Functions.funcall(accessor, parse));
            if (parsing_utilities.NIL == diagnostic) {
                all_badP = (SubLObject)parsing_utilities.NIL;
            }
            if (parsing_utilities.NIL != quietP) {
                if_all_bad = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse, (SubLObject)parsing_utilities.NIL), if_all_bad);
            }
            if_some_bad = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse, diagnostic), if_some_bad);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return (parsing_utilities.NIL != all_badP && parsing_utilities.NIL == quietP) ? if_all_bad : if_some_bad;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 68038L)
    public static SubLObject apply_macroscopic_parsing_filter(final SubLObject parses, final SubLObject filter, final SubLObject accessor, SubLObject quietP) {
        if (quietP == parsing_utilities.UNPROVIDED) {
            quietP = (SubLObject)parsing_utilities.NIL;
        }
        SubLObject if_some_bad = (SubLObject)parsing_utilities.NIL;
        SubLObject if_all_bad = (SubLObject)parsing_utilities.NIL;
        SubLObject all_badP = (SubLObject)parsing_utilities.T;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = (SubLObject)parsing_utilities.NIL;
        parse = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject diagnostic = Functions.funcall(filter, Functions.funcall(accessor, parse), Mapping.mapcar(accessor, parses));
            if (parsing_utilities.NIL == diagnostic) {
                all_badP = (SubLObject)parsing_utilities.NIL;
            }
            if (parsing_utilities.NIL != quietP) {
                if_all_bad = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse, (SubLObject)parsing_utilities.NIL), if_all_bad);
            }
            if_some_bad = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse, diagnostic), if_some_bad);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return (parsing_utilities.NIL != all_badP && parsing_utilities.NIL == quietP) ? if_all_bad : if_some_bad;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 68542L)
    public static SubLObject parsing_subcollection_function_nautP(final SubLObject v_object) {
        return reformulator_module_quantifier_unifier_3.subcollection_function_nautP(v_object, parsing_utilities.$const13$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 68744L)
    public static SubLObject ternary_parsing_subcollection_function_nautP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != el_utilities.el_ternary_formula_p(v_object) && parsing_utilities.NIL != isa.isaP(cycl_utilities.nat_functor(v_object), parsing_utilities.$const87$SubcollectionRelationFunction, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 68926L)
    public static SubLObject subcollection_function_naut_from_arg(final SubLObject subfn) {
        return (parsing_utilities.NIL != isa.isaP(cycl_utilities.formula_arg0(subfn), parsing_utilities.$const249$SubcollectionRelationFunction_Can, parsing_utilities.$const13$UniversalVocabularyMt, (SubLObject)parsing_utilities.UNPROVIDED)) ? cycl_utilities.formula_arg1(subfn, (SubLObject)parsing_utilities.UNPROVIDED) : cycl_utilities.formula_arg3(subfn, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 69412L)
    public static SubLObject subcollection_function_type_level_in_from_argP(final SubLObject subfn) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != isa.isaP(subfn, parsing_utilities.$const249$SubcollectionRelationFunction_Can, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) || parsing_utilities.NIL != isa.isaP(subfn, parsing_utilities.$const250$SubcollectionRelationFunction_Typ, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 69823L)
    public static SubLObject subcollection_function_type_level_in_to_argP(final SubLObject subfn) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != isa.isaP(subfn, parsing_utilities.$const251$SubcollectionRelationFunction_Inv, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED) || parsing_utilities.NIL != isa.isaP(subfn, parsing_utilities.$const250$SubcollectionRelationFunction_Typ, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 70224L)
    public static SubLObject subcollection_function_naut_to_arg(final SubLObject subfn) {
        return (parsing_utilities.NIL != isa.isaP(cycl_utilities.formula_arg0(subfn), parsing_utilities.$const249$SubcollectionRelationFunction_Can, parsing_utilities.$const13$UniversalVocabularyMt, (SubLObject)parsing_utilities.UNPROVIDED)) ? cycl_utilities.formula_arg3(subfn, (SubLObject)parsing_utilities.UNPROVIDED) : cycl_utilities.formula_arg1(subfn, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 70710L)
    public static SubLObject subcollection_function_naut_pred(final SubLObject subfn) {
        return cycl_utilities.formula_arg2(subfn, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 71074L)
    public static SubLObject subcollection_function_naut_with_new_from_arg(final SubLObject subfn, final SubLObject col) {
        SubLObject new_nat = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(subfn));
        final SubLObject canonicalP = isa.isaP(cycl_utilities.formula_arg0(subfn), parsing_utilities.$const249$SubcollectionRelationFunction_Can, parsing_utilities.$const13$UniversalVocabularyMt, (SubLObject)parsing_utilities.UNPROVIDED);
        new_nat = (SubLObject)ConsesLow.cons((parsing_utilities.NIL != canonicalP) ? col : cycl_utilities.formula_arg1(subfn, (SubLObject)parsing_utilities.UNPROVIDED), new_nat);
        new_nat = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(subfn, (SubLObject)parsing_utilities.UNPROVIDED), new_nat);
        new_nat = (SubLObject)ConsesLow.cons((parsing_utilities.NIL != canonicalP) ? cycl_utilities.formula_arg3(subfn, (SubLObject)parsing_utilities.UNPROVIDED) : col, new_nat);
        return Sequences.reverse(new_nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 71700L)
    public static SubLObject subcollection_function_naut_with_new_to_arg(final SubLObject subfn, final SubLObject col) {
        SubLObject new_nat = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(subfn));
        final SubLObject canonicalP = isa.isaP(cycl_utilities.formula_arg0(subfn), parsing_utilities.$const249$SubcollectionRelationFunction_Can, parsing_utilities.$const13$UniversalVocabularyMt, (SubLObject)parsing_utilities.UNPROVIDED);
        new_nat = (SubLObject)ConsesLow.cons((parsing_utilities.NIL != canonicalP) ? cycl_utilities.formula_arg1(subfn, (SubLObject)parsing_utilities.UNPROVIDED) : col, new_nat);
        new_nat = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(subfn, (SubLObject)parsing_utilities.UNPROVIDED), new_nat);
        new_nat = (SubLObject)ConsesLow.cons((parsing_utilities.NIL != canonicalP) ? col : cycl_utilities.formula_arg3(subfn, (SubLObject)parsing_utilities.UNPROVIDED), new_nat);
        return Sequences.reverse(new_nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 72324L)
    public static SubLObject eliminate_genl_subcollection_nauts(final SubLObject parses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_utilities.NIL == parses || parsing_utilities.NIL != list_utilities.singletonP(parses)) {
            return parses;
        }
        final SubLObject nats_by_func = dictionary.new_dictionary((SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        final SubLObject good_parses = set.new_set((SubLObject)parsing_utilities.EQUAL, (SubLObject)parsing_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = parses;
        SubLObject this_parse = (SubLObject)parsing_utilities.NIL;
        this_parse = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            if (parsing_utilities.NIL != ternary_parsing_subcollection_function_nautP(this_parse.first())) {
                final SubLObject this_func = cycl_utilities.formula_arg0(this_parse.first());
                dictionary.dictionary_enter(nats_by_func, this_func, (SubLObject)ConsesLow.cons(this_parse, dictionary.dictionary_lookup(nats_by_func, this_func, (SubLObject)parsing_utilities.UNPROVIDED)));
            }
            else {
                set.set_add(this_parse, good_parses);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_parse = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(nats_by_func)); parsing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject func = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject parses_$73 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (parsing_utilities.NIL != list_utilities.singletonP(parses_$73)) {
                set.set_add(parses_$73.first(), good_parses);
            }
            else {
                SubLObject cdolist_list_var2 = parses_$73;
                SubLObject this_parse2 = (SubLObject)parsing_utilities.NIL;
                this_parse2 = cdolist_list_var2.first();
                while (parsing_utilities.NIL != cdolist_list_var2) {
                    SubLObject found_generalityP = (SubLObject)parsing_utilities.NIL;
                    SubLObject checked_anyP = (SubLObject)parsing_utilities.NIL;
                    if (parsing_utilities.NIL == found_generalityP) {
                        SubLObject csome_list_var = parses_$73;
                        SubLObject other_parse = (SubLObject)parsing_utilities.NIL;
                        other_parse = csome_list_var.first();
                        while (parsing_utilities.NIL == found_generalityP && parsing_utilities.NIL != csome_list_var) {
                            if (!other_parse.first().equal(this_parse2.first())) {
                                checked_anyP = (SubLObject)parsing_utilities.T;
                                SubLObject current;
                                final SubLObject datum = current = cycl_utilities.formula_args(this_parse2.first(), (SubLObject)parsing_utilities.UNPROVIDED);
                                SubLObject this_arg1 = (SubLObject)parsing_utilities.NIL;
                                SubLObject this_pred = (SubLObject)parsing_utilities.NIL;
                                SubLObject this_arg2 = (SubLObject)parsing_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list252);
                                this_arg1 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list252);
                                this_pred = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_utilities.$list252);
                                this_arg2 = current.first();
                                current = current.rest();
                                if (parsing_utilities.NIL == current) {
                                    SubLObject current_$75;
                                    final SubLObject datum_$74 = current_$75 = cycl_utilities.formula_args(other_parse.first(), (SubLObject)parsing_utilities.UNPROVIDED);
                                    SubLObject other_arg1 = (SubLObject)parsing_utilities.NIL;
                                    SubLObject other_pred = (SubLObject)parsing_utilities.NIL;
                                    SubLObject other_arg2 = (SubLObject)parsing_utilities.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$75, datum_$74, (SubLObject)parsing_utilities.$list253);
                                    other_arg1 = current_$75.first();
                                    current_$75 = current_$75.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$75, datum_$74, (SubLObject)parsing_utilities.$list253);
                                    other_pred = current_$75.first();
                                    current_$75 = current_$75.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$75, datum_$74, (SubLObject)parsing_utilities.$list253);
                                    other_arg2 = current_$75.first();
                                    current_$75 = current_$75.rest();
                                    if (parsing_utilities.NIL == current_$75) {
                                        found_generalityP = (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL != genl_predicates.genl_predicate_in_any_mtP(this_pred, other_pred) && parsing_utilities.NIL != genls.genl_in_any_mtP(this_arg1, other_arg1) && parsing_utilities.NIL != genls.genl_in_any_mtP(this_arg2, other_arg2));
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum_$74, (SubLObject)parsing_utilities.$list253);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_utilities.$list252);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            other_parse = csome_list_var.first();
                        }
                    }
                    if (parsing_utilities.NIL == found_generalityP) {
                        set.set_add(this_parse2, good_parses);
                    }
                    if (parsing_utilities.NIL == checked_anyP) {
                        set.set_add(this_parse2, good_parses);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    this_parse2 = cdolist_list_var2.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return set.set_element_list(good_parses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 74257L)
    public static SubLObject clear_parse_as_typeP() {
        final SubLObject cs = parsing_utilities.$parse_as_typeP_caching_state$.getGlobalValue();
        if (parsing_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 74257L)
    public static SubLObject remove_parse_as_typeP(final SubLObject type, final SubLObject parse_type, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(parsing_utilities.$parse_as_typeP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(type, parse_type, mt), (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 74257L)
    public static SubLObject parse_as_typeP_internal(final SubLObject type, final SubLObject parse_type, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == disjoint_with.disjoint_withP(type, parse_type, mt, (SubLObject)parsing_utilities.UNPROVIDED) && parsing_utilities.NIL != cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(parsing_utilities.$const255$unknownSentence, (SubLObject)ConsesLow.list(parsing_utilities.$const256$disjointWith, type, parse_type)), mt, (SubLObject)parsing_utilities.$list257)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 74257L)
    public static SubLObject parse_as_typeP(final SubLObject type, final SubLObject parse_type, final SubLObject mt) {
        SubLObject caching_state = parsing_utilities.$parse_as_typeP_caching_state$.getGlobalValue();
        if (parsing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)parsing_utilities.$sym254$PARSE_AS_TYPE_, (SubLObject)parsing_utilities.$sym258$_PARSE_AS_TYPE__CACHING_STATE_, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.EQUAL, (SubLObject)parsing_utilities.THREE_INTEGER, (SubLObject)parsing_utilities.EIGHT_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(type, parse_type, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)parsing_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)parsing_utilities.NIL;
            collision = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (type.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (parse_type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (parsing_utilities.NIL != cached_args && parsing_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(parse_as_typeP_internal(type, parse_type, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(type, parse_type, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 74761L)
    public static SubLObject restrict_parses_by_types(final SubLObject all_parses, final SubLObject restrictions, final SubLObject exclusions, SubLObject semantic_mt) {
        if (semantic_mt == parsing_utilities.UNPROVIDED) {
            semantic_mt = parsing_utilities.$const38$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)parsing_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = all_parses;
            SubLObject parse = (SubLObject)parsing_utilities.NIL;
            parse = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                SubLObject badP = (SubLObject)parsing_utilities.NIL;
                if (parsing_utilities.NIL == badP) {
                    SubLObject csome_list_var = exclusions;
                    SubLObject type = (SubLObject)parsing_utilities.NIL;
                    type = csome_list_var.first();
                    while (parsing_utilities.NIL == badP && parsing_utilities.NIL != csome_list_var) {
                        if (parsing_utilities.NIL != lexicon_accessors.denot_has_typeP(parse, type, (SubLObject)parsing_utilities.UNPROVIDED)) {
                            badP = (SubLObject)parsing_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        type = csome_list_var.first();
                    }
                }
                if (parsing_utilities.NIL == badP) {
                    SubLObject goodP = (SubLObject)parsing_utilities.NIL;
                    if (parsing_utilities.NIL == goodP) {
                        SubLObject csome_list_var2 = restrictions;
                        SubLObject type2 = (SubLObject)parsing_utilities.NIL;
                        type2 = csome_list_var2.first();
                        while (parsing_utilities.NIL == goodP && parsing_utilities.NIL != csome_list_var2) {
                            if (parsing_utilities.NIL != lexicon_accessors.denot_has_typeP(parse, type2, (SubLObject)parsing_utilities.UNPROVIDED)) {
                                goodP = (SubLObject)parsing_utilities.T;
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            type2 = csome_list_var2.first();
                        }
                    }
                    if (parsing_utilities.NIL != goodP) {
                        result = (SubLObject)ConsesLow.cons(parse, result);
                    }
                    else {
                        SubLObject cdolist_list_var_$76 = restrictions;
                        SubLObject type2 = (SubLObject)parsing_utilities.NIL;
                        type2 = cdolist_list_var_$76.first();
                        while (parsing_utilities.NIL != cdolist_list_var_$76) {
                            final SubLObject restricted = restrict_parse_to_type(parse, type2);
                            if (parsing_utilities.NIL != restricted) {
                                result = (SubLObject)ConsesLow.cons(restricted, result);
                            }
                            cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                            type2 = cdolist_list_var_$76.first();
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 75680L)
    public static SubLObject restrict_parse_to_type(final SubLObject parse, final SubLObject type) {
        if (parsing_utilities.NIL != el_utilities.el_formula_with_operator_p(parse, parsing_utilities.$const259$Unity)) {
            final SubLObject restricted = el_utilities.replace_formula_arg((SubLObject)parsing_utilities.ZERO_INTEGER, parsing_utilities.$const260$IntervalRangeFn, parse);
            if (parsing_utilities.NIL != lexicon_accessors.denot_has_typeP(restricted, type, (SubLObject)parsing_utilities.UNPROVIDED)) {
                return restricted;
            }
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 76018L)
    public static SubLObject parse_dates_and_numbers(final SubLObject string, final SubLObject can_be, final SubLObject cant_be, SubLObject semantic_mt, SubLObject parsing_mt) {
        if (semantic_mt == parsing_utilities.UNPROVIDED) {
            semantic_mt = (SubLObject)parsing_utilities.NIL;
        }
        if (parsing_mt == parsing_utilities.UNPROVIDED) {
            parsing_mt = (SubLObject)parsing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_parses = (SubLObject)parsing_utilities.NIL;
        final SubLObject mt = (parsing_utilities.NIL != semantic_mt) ? semantic_mt : parsing_utilities.$const38$InferencePSC;
        SubLObject date_parses = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL == date_parses) {
            SubLObject csome_list_var = can_be;
            SubLObject type = (SubLObject)parsing_utilities.NIL;
            type = csome_list_var.first();
            while (parsing_utilities.NIL == date_parses && parsing_utilities.NIL != csome_list_var) {
                if (parsing_utilities.NIL != parse_as_typeP(type, parsing_utilities.$const261$Date, mt)) {
                    date_parses = date_utilities.parse_date_from_string(string);
                }
                csome_list_var = csome_list_var.rest();
                type = csome_list_var.first();
            }
        }
        if (parsing_utilities.NIL != date_parses) {
            all_parses = Sequences.remove_duplicates(date_parses, (SubLObject)parsing_utilities.EQUAL, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$psp_reformulateP$.currentBinding(thread);
        try {
            parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)parsing_utilities.NIL, thread);
            parsing_vars.$psp_return_mode$.bind((SubLObject)parsing_utilities.$kw1$BEST_ONLY, thread);
            parsing_vars.$psp_reformulateP$.bind((SubLObject)parsing_utilities.NIL, thread);
            SubLObject parse_as_numberP = (SubLObject)parsing_utilities.NIL;
            final SubLObject number_collection = parsing_utilities.$const56$ScalarInterval;
            SubLObject number_parses = (SubLObject)parsing_utilities.NIL;
            if (parsing_utilities.NIL == parse_as_numberP) {
                SubLObject csome_list_var2;
                SubLObject type2;
                for (csome_list_var2 = can_be, type2 = (SubLObject)parsing_utilities.NIL, type2 = csome_list_var2.first(); parsing_utilities.NIL == parse_as_numberP && parsing_utilities.NIL != csome_list_var2; parse_as_numberP = parse_as_typeP(type2, number_collection, mt), csome_list_var2 = csome_list_var2.rest(), type2 = csome_list_var2.first()) {}
            }
            if (parsing_utilities.NIL != parse_as_numberP) {
                final SubLObject standard_string = string_utilities.replace_substring(string, (SubLObject)parsing_utilities.$str262$_, (SubLObject)parsing_utilities.$str196$);
                number_parses = ConsesLow.append(english_quantity_parser.string_to_quantities(standard_string), psp_main.ps_get_cycls_for_np(standard_string, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED), psp_main.ps_get_cycls_for_phrase(standard_string, (SubLObject)parsing_utilities.$list263, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
            }
            SubLObject cdolist_list_var;
            number_parses = (cdolist_list_var = restrict_parses_by_types(number_parses, (SubLObject)ConsesLow.list(number_collection), (SubLObject)parsing_utilities.NIL, mt));
            SubLObject parse = (SubLObject)parsing_utilities.NIL;
            parse = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                final SubLObject item_var = parse;
                if (parsing_utilities.NIL == conses_high.member(item_var, all_parses, (SubLObject)parsing_utilities.EQUAL, Symbols.symbol_function((SubLObject)parsing_utilities.IDENTITY))) {
                    all_parses = (SubLObject)ConsesLow.cons(item_var, all_parses);
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        finally {
            parsing_vars.$psp_reformulateP$.rebind(_prev_bind_3, thread);
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_2, thread);
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
        }
        return restrict_parses_by_types(all_parses, can_be, cant_be, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject parse_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_parse_iterator(v_object, stream, (SubLObject)parsing_utilities.ZERO_INTEGER);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject parse_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $parse_iterator_native.class) ? parsing_utilities.T : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject pi_sub_iterators(final SubLObject v_object) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject pi_properties(final SubLObject v_object) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject pi_current_iterator_index(final SubLObject v_object) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject pi_string(final SubLObject v_object) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject pi_previous_parses(final SubLObject v_object) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject pi_next(final SubLObject v_object) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject _csetf_pi_sub_iterators(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject _csetf_pi_properties(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject _csetf_pi_current_iterator_index(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject _csetf_pi_string(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject _csetf_pi_previous_parses(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject _csetf_pi_next(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != parse_iterator_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject make_parse_iterator(SubLObject arglist) {
        if (arglist == parsing_utilities.UNPROVIDED) {
            arglist = (SubLObject)parsing_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $parse_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)parsing_utilities.NIL, next = arglist; parsing_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)parsing_utilities.$kw285$SUB_ITERATORS)) {
                _csetf_pi_sub_iterators(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw286$PROPERTIES)) {
                _csetf_pi_properties(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw287$CURRENT_ITERATOR_INDEX)) {
                _csetf_pi_current_iterator_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw288$STRING)) {
                _csetf_pi_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw289$PREVIOUS_PARSES)) {
                _csetf_pi_previous_parses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parsing_utilities.$kw290$NEXT)) {
                _csetf_pi_next(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)parsing_utilities.$str291$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject visit_defstruct_parse_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw292$BEGIN, (SubLObject)parsing_utilities.$sym293$MAKE_PARSE_ITERATOR, (SubLObject)parsing_utilities.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw285$SUB_ITERATORS, pi_sub_iterators(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw286$PROPERTIES, pi_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw287$CURRENT_ITERATOR_INDEX, pi_current_iterator_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw288$STRING, pi_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw289$PREVIOUS_PARSES, pi_previous_parses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw290$NEXT, pi_next(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw295$END, (SubLObject)parsing_utilities.$sym293$MAKE_PARSE_ITERATOR, (SubLObject)parsing_utilities.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 77885L)
    public static SubLObject visit_defstruct_object_parse_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 78495L)
    public static SubLObject print_parse_iterator(final SubLObject iter, SubLObject stream, SubLObject depth) {
        if (stream == parsing_utilities.UNPROVIDED) {
            stream = (SubLObject)parsing_utilities.NIL;
        }
        if (depth == parsing_utilities.UNPROVIDED) {
            depth = (SubLObject)parsing_utilities.NIL;
        }
        PrintLow.format(stream, (SubLObject)parsing_utilities.$str297$__parse_iterator__S_current_iter_, new SubLObject[] { pi_string(iter), pi_current_iterator_index(iter), pi_sub_iterators(iter), pi_properties(iter) });
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 78770L)
    public static SubLObject new_parse_iterator(final SubLObject string, SubLObject v_properties) {
        if (v_properties == parsing_utilities.UNPROVIDED) {
            v_properties = (SubLObject)parsing_utilities.NIL;
        }
        return iteration.new_iterator(new_parse_iterator_state(string, v_properties), (SubLObject)parsing_utilities.$sym298$PARSE_ITERATOR_DONE, (SubLObject)parsing_utilities.$sym299$PARSE_ITERATOR_NEXT, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 79107L)
    public static SubLObject new_parse_iterator_state(final SubLObject string, SubLObject v_properties) {
        if (v_properties == parsing_utilities.UNPROVIDED) {
            v_properties = (SubLObject)parsing_utilities.NIL;
        }
        final SubLObject iter = make_parse_iterator((SubLObject)parsing_utilities.UNPROVIDED);
        _csetf_pi_properties(iter, v_properties);
        _csetf_pi_string(iter, string);
        _csetf_pi_current_iterator_index(iter, (SubLObject)parsing_utilities.ZERO_INTEGER);
        _csetf_pi_sub_iterators(iter, parsing_subiterators(string, v_properties));
        _csetf_pi_next(iter, (SubLObject)parsing_utilities.NIL);
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 79822L)
    public static SubLObject parsing_subiterators(final SubLObject string, final SubLObject v_properties) {
        SubLObject iterators = (SubLObject)parsing_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject parsers = cdolist_list_var = conses_high.getf(v_properties, (SubLObject)parsing_utilities.$kw300$PARSERS, (SubLObject)parsing_utilities.$list301);
        SubLObject parser_symbol = (SubLObject)parsing_utilities.NIL;
        parser_symbol = cdolist_list_var.first();
        while (parsing_utilities.NIL != cdolist_list_var) {
            final SubLObject pcase_var = parser_symbol;
            if (pcase_var.eql(parsing_utilities.$const302$CycRecursiveTemplateParser)) {
                iterators = (SubLObject)ConsesLow.cons(rtp_iterators.new_rtp_iterator(string, v_properties), iterators);
            }
            else if (pcase_var.eql(parsing_utilities.$const303$CharniakParserCyclifier)) {
                final SubLObject cyclify_iter = new_cyclify_iterator(string, v_properties);
                if (parsing_utilities.NIL != cyclify_iterator_p(cyclify_iter)) {
                    iterators = (SubLObject)ConsesLow.cons(cyclify_iter, iterators);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parser_symbol = cdolist_list_var.first();
        }
        return Sequences.nreverse(iterators);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 80548L)
    public static SubLObject pi_current_iterator(final SubLObject iter) {
        return ConsesLow.nth(pi_current_iterator_index(iter), pi_sub_iterators(iter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 80672L)
    public static SubLObject parse_iterator_done(final SubLObject iter) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == parse_iterator_has_next(iter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 80763L)
    public static SubLObject parse_iterator_has_next(final SubLObject iter) {
        SubLObject current_iter = pi_current_iterator(iter);
        SubLObject failedP = (SubLObject)parsing_utilities.NIL;
        while (parsing_utilities.NIL == pi_next(iter) && parsing_utilities.NIL == failedP && parsing_utilities.NIL != current_iter) {
            SubLObject current_iter_done = iteration.iteration_done(current_iter);
            if (parsing_utilities.NIL != current_iter_done && pi_current_iterator_index(iter).numG(Sequences.length(pi_sub_iterators(iter)))) {
                failedP = (SubLObject)parsing_utilities.T;
            }
            else if (parsing_utilities.NIL != current_iter_done) {
                _csetf_pi_current_iterator_index(iter, number_utilities.f_1X(pi_current_iterator_index(iter)));
                current_iter_done = (SubLObject)parsing_utilities.NIL;
                current_iter = pi_current_iterator(iter);
            }
            else {
                final SubLObject next_val = iteration.iteration_next(current_iter);
                if (parsing_utilities.NIL != subl_promotions.memberP(next_val, pi_previous_parses(iter), (SubLObject)parsing_utilities.$sym304$EQUALS_EL_, (SubLObject)parsing_utilities.UNPROVIDED)) {
                    continue;
                }
                _csetf_pi_next(iter, (SubLObject)ConsesLow.cons(next_val, pi_next(iter)));
            }
        }
        return list_utilities.sublisp_boolean(pi_next(iter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81685L)
    public static SubLObject parse_iterator_next(final SubLObject iter) {
        if (parsing_utilities.NIL == parse_iterator_has_next(iter)) {
            return (SubLObject)parsing_utilities.$kw305$FAILURE;
        }
        final SubLObject next_val = pi_next(iter).first();
        _csetf_pi_previous_parses(iter, (SubLObject)ConsesLow.cons(next_val, pi_previous_parses(iter)));
        _csetf_pi_next(iter, pi_next(iter).rest());
        return Values.values(next_val, iter, (SubLObject)parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject cyclify_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)parsing_utilities.ZERO_INTEGER);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject cyclify_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cyclify_iterator_native.class) ? parsing_utilities.T : parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject cyclify_iterator_iter_obj(final SubLObject v_object) {
        assert parsing_utilities.NIL != cyclify_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject _csetf_cyclify_iterator_iter_obj(final SubLObject v_object, final SubLObject value) {
        assert parsing_utilities.NIL != cyclify_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject make_cyclify_iterator(SubLObject arglist) {
        if (arglist == parsing_utilities.UNPROVIDED) {
            arglist = (SubLObject)parsing_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cyclify_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)parsing_utilities.NIL, next = arglist; parsing_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)parsing_utilities.$kw317$ITER_OBJ)) {
                _csetf_cyclify_iterator_iter_obj(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)parsing_utilities.$str291$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject visit_defstruct_cyclify_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw292$BEGIN, (SubLObject)parsing_utilities.$sym318$MAKE_CYCLIFY_ITERATOR, (SubLObject)parsing_utilities.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw294$SLOT, (SubLObject)parsing_utilities.$kw317$ITER_OBJ, cyclify_iterator_iter_obj(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parsing_utilities.$kw295$END, (SubLObject)parsing_utilities.$sym318$MAKE_CYCLIFY_ITERATOR, (SubLObject)parsing_utilities.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 81985L)
    public static SubLObject visit_defstruct_object_cyclify_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyclify_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 82204L)
    public static SubLObject new_cyclify_iterator(final SubLObject string, SubLObject v_properties) {
        if (v_properties == parsing_utilities.UNPROVIDED) {
            v_properties = (SubLObject)parsing_utilities.NIL;
        }
        return iteration.new_iterator(new_cyclify_iterator_state(string, v_properties), (SubLObject)parsing_utilities.$sym320$CYCLIFY_ITERATOR_DONE, (SubLObject)parsing_utilities.$sym321$CYCLIFY_ITERATOR_NEXT, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 82451L)
    public static SubLObject new_cyclify_iterator_state(final SubLObject string, SubLObject v_properties) {
        if (v_properties == parsing_utilities.UNPROVIDED) {
            v_properties = (SubLObject)parsing_utilities.NIL;
        }
        final SubLObject iter = make_cyclify_iterator((SubLObject)parsing_utilities.UNPROVIDED);
        final SubLObject v_cyclifier = cyclifier.new_cyclifier(string, v_properties);
        if (parsing_utilities.NIL != cyclifier.cyclifier_p(v_cyclifier)) {
            _csetf_cyclify_iterator_iter_obj(iter, v_cyclifier);
            return iter;
        }
        return (SubLObject)parsing_utilities.$kw322$FAIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 82765L)
    public static SubLObject cyclify_iterator_done(final SubLObject iter) {
        if (parsing_utilities.NIL != cyclify_iterator_p(iter)) {
            final SubLObject internal_iter = cyclify_iterator_iter_obj(iter);
            return (SubLObject)SubLObjectFactory.makeBoolean(parsing_utilities.NIL == methods.funcall_instance_method_with_0_args(internal_iter, (SubLObject)parsing_utilities.$sym323$HAS_NEXT_));
        }
        return (SubLObject)parsing_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 82999L)
    public static SubLObject cyclify_iterator_next(final SubLObject iter) {
        if (parsing_utilities.NIL != cyclify_iterator_p(iter)) {
            final SubLObject internal_iter = cyclify_iterator_iter_obj(iter);
            if (parsing_utilities.NIL != internal_iter) {
                return Values.values(methods.funcall_instance_method_with_0_args(internal_iter, (SubLObject)parsing_utilities.$sym324$NEXT), iter, (SubLObject)parsing_utilities.NIL);
            }
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 83249L)
    public static SubLObject complete_text_topic_structure_tagging(final SubLObject iter) {
        SubLObject paragraph_result = (SubLObject)parsing_utilities.NIL;
        while (parsing_utilities.NIL == iteration.iteration_done(iter)) {
            final SubLObject sentence = iteration.iteration_next(iter);
            SubLObject sentence_result = (SubLObject)parsing_utilities.NIL;
            SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
            SubLObject word = (SubLObject)parsing_utilities.NIL;
            word = cdolist_list_var.first();
            while (parsing_utilities.NIL != cdolist_list_var) {
                sentence_result = (SubLObject)ConsesLow.cons(el_utilities.make_el_list((SubLObject)ConsesLow.list(document.word_string(word), (parsing_utilities.NIL != document.word_cyc_pos(word)) ? document.word_cyc_pos(word) : parsing_utilities.$const325$NLWordForm, el_utilities.make_el_set(nl_api_datastructures.cycls_from_nl_interps(document.word_interps(word)), (SubLObject)parsing_utilities.UNPROVIDED)), (SubLObject)parsing_utilities.UNPROVIDED), sentence_result);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
            paragraph_result = (SubLObject)ConsesLow.cons(el_utilities.make_el_list(Sequences.nreverse(sentence_result), (SubLObject)parsing_utilities.UNPROVIDED), paragraph_result);
        }
        return el_utilities.make_el_list(Sequences.nreverse(paragraph_result), (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 84079L)
    public static SubLObject speaker_referent() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (parsing_utilities.NIL != parsing_vars.$speaker_referent$.getDynamicValue(thread)) ? parsing_vars.$speaker_referent$.getDynamicValue(thread) : api_control_vars.$the_cyclist$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 84265L)
    public static SubLObject get_cyclifier_interps_for_expression_peg(final SubLObject peg) {
        final SubLObject ep_string = peg_text(peg);
        return get_cyclifier_interps_for_string(ep_string, (SubLObject)parsing_utilities.NIL, peg, (SubLObject)parsing_utilities.NIL, (SubLObject)parsing_utilities.$kw326$L2R);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 84544L)
    public static SubLObject peg_text(final SubLObject peg) {
        final SubLObject text = ask_utilities.query_variable((SubLObject)parsing_utilities.$sym327$_STRING, (SubLObject)ConsesLow.listS(parsing_utilities.$const328$originalPhrase, peg, (SubLObject)parsing_utilities.$list329), parsing_utilities.$const38$InferencePSC, (SubLObject)parsing_utilities.UNPROVIDED).first();
        return text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 84696L)
    public static SubLObject get_cyclifier_interps_for_string(final SubLObject sentence, SubLObject background_mt, SubLObject peg, SubLObject ephemeralP, SubLObject application) {
        if (background_mt == parsing_utilities.UNPROVIDED) {
            background_mt = parsing_utilities.$const330$TextualEntailmentGenericBackgroun;
        }
        if (peg == parsing_utilities.UNPROVIDED) {
            peg = (SubLObject)parsing_utilities.NIL;
        }
        if (ephemeralP == parsing_utilities.UNPROVIDED) {
            ephemeralP = (SubLObject)parsing_utilities.T;
        }
        if (application == parsing_utilities.UNPROVIDED) {
            application = (SubLObject)parsing_utilities.$kw331$TEXTUAL_INFERENCE;
        }
        SubLObject content_model_mt = (SubLObject)parsing_utilities.NIL;
        if (parsing_utilities.NIL != peg) {
            content_model_mt = ask_utilities.query_variable((SubLObject)parsing_utilities.$kw146$MT, (SubLObject)ConsesLow.list(parsing_utilities.$const332$contentModelFocalPeg, (SubLObject)parsing_utilities.$kw146$MT, peg), parsing_utilities.$const38$InferencePSC, (SubLObject)parsing_utilities.$list333).first();
        }
        return content_model_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 85492L)
    public static SubLObject record_suggested_nl_for_assertion(final SubLObject cycl, final SubLObject nl, final SubLObject force, final SubLObject english_type, SubLObject timestamp, SubLObject user) {
        if (timestamp == parsing_utilities.UNPROVIDED) {
            timestamp = numeric_date_utilities.universal_timestring((SubLObject)parsing_utilities.UNPROVIDED);
        }
        if (user == parsing_utilities.UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        assert parsing_utilities.NIL != cycl_grammar.cycl_sentence_p(cycl) : cycl;
        assert parsing_utilities.NIL != Types.stringp(nl) : nl;
        assert parsing_utilities.NIL != Types.keywordp(force) : force;
        assert parsing_utilities.NIL != Types.keywordp(english_type) : english_type;
        record_suggested_nl_to_file(cycl, nl, force, english_type, timestamp, user);
        record_suggested_nl_in_kb(cycl, nl);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 86417L)
    public static SubLObject record_suggested_nl_in_kb(final SubLObject cycl, final SubLObject nl) {
        return ke.ke_assert_now((SubLObject)ConsesLow.list(parsing_utilities.$const335$ebmtNLToCycLTrainingExample, nl, (SubLObject)ConsesLow.list(parsing_utilities.$const336$Quote, cycl)), parsing_utilities.$const337$EBMTTrainingExamplesFromQLMt, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-utilities.lisp", position = 86587L)
    public static SubLObject record_suggested_nl_to_file(final SubLObject cycl, final SubLObject nl, final SubLObject force, final SubLObject english_type, SubLObject timestamp, SubLObject user) {
        if (timestamp == parsing_utilities.UNPROVIDED) {
            timestamp = numeric_date_utilities.universal_timestring((SubLObject)parsing_utilities.UNPROVIDED);
        }
        if (user == parsing_utilities.UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        return (SubLObject)parsing_utilities.NIL;
    }
    
    public static SubLObject declare_parsing_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_noun_compound_with_types", "PARSE-NOUN-COMPOUND-WITH-TYPES", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_noun_compound_with_types_int", "PARSE-NOUN-COMPOUND-WITH-TYPES-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "noun_compound_parses_mostly_definiteP", "NOUN-COMPOUND-PARSES-MOSTLY-DEFINITE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "instances_of_collection_parses", "INSTANCES-OF-COLLECTION-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "instances_of_collection_parse_internal", "INSTANCES-OF-COLLECTION-PARSE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "instances_of_collection_parse", "INSTANCES-OF-COLLECTION-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clean_string_for_parse_noun_compound", "CLEAN-STRING-FOR-PARSE-NOUN-COMPOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "filter_noun_compound_parses_by_types", "FILTER-NOUN-COMPOUND-PARSES-BY-TYPES", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_noun_compound_valid_char_p", "PARSE-NOUN-COMPOUND-VALID-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clear_nl_tags", "CLEAR-NL-TAGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clear_nl_tag_fns", "CLEAR-NL-TAG-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clear_nl_tag_denoting_fns", "CLEAR-NL-TAG-DENOTING-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "initialize_nl_tags", "INITIALIZE-NL-TAGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "initialize_nl_tag_fns", "INITIALIZE-NL-TAG-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "initialize_nl_tag_denoting_fns", "INITIALIZE-NL-TAG-DENOTING-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_tagP", "NL-TAG?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_tag_denoting_fnP", "NL-TAG-DENOTING-FN?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_tag_fnP", "NL-TAG-FN?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_tagged_termP", "NL-TAGGED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "ternary_nl_tagged_termP", "TERNARY-NL-TAGGED-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "ternary_nl_tag_fnP", "TERNARY-NL-TAG-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "strip_nl_tags_top_level", "STRIP-NL-TAGS-TOP-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "possibly_strip_nl_tags_from_list", "POSSIBLY-STRIP-NL-TAGS-FROM-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "strip_nl_tags", "STRIP-NL-TAGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "get_nl_tag_fn", "GET-NL-TAG-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "get_ternary_nl_tag_fn", "GET-TERNARY-NL-TAG-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "get_binary_nl_tag_fn", "GET-BINARY-NL-TAG-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "get_nl_tag_template", "GET-NL-TAG-TEMPLATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clear_make_nl_tag_template", "CLEAR-MAKE-NL-TAG-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "remove_make_nl_tag_template", "REMOVE-MAKE-NL-TAG-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "make_nl_tag_template_internal", "MAKE-NL-TAG-TEMPLATE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "make_nl_tag_template", "MAKE-NL-TAG-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "add_nl_tag_template", "ADD-NL-TAG-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "contains_nl_tagP", "CONTAINS-NL-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "add_nl_number_wrapper", "ADD-NL-NUMBER-WRAPPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "determiner_number_denotP_internal", "DETERMINER-NUMBER-DENOT?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "determiner_number_denotP", "DETERMINER-NUMBER-DENOT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "agr_preds_for_number", "AGR-PREDS-FOR-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "add_nl_quant_wrapper", "ADD-NL-QUANT-WRAPPER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clear_nl_max_floor_preds", "CLEAR-NL-MAX-FLOOR-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "remove_nl_max_floor_preds", "REMOVE-NL-MAX-FLOOR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_max_floor_preds_internal", "NL-MAX-FLOOR-PREDS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_max_floor_preds", "NL-MAX-FLOOR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cycl_has_definiteness_tagP", "CYCL-HAS-DEFINITENESS-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cycl_pronoun_p", "CYCL-PRONOUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_person_attr_for_cycl_pronoun", "NL-PERSON-ATTR-FOR-CYCL-PRONOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_number_attr_for_cycl", "NL-NUMBER-ATTR-FOR-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_definiteness_attr_for_cycl", "NL-DEFINITENESS-ATTR-FOR-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_gender_attr_for_cycl", "NL-GENDER-ATTR-FOR-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "kb_nl_number_attribute_p", "KB-NL-NUMBER-ATTRIBUTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "kb_nl_definiteness_attribute_p", "KB-NL-DEFINITENESS-ATTRIBUTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "kb_nl_gender_attribute_p", "KB-NL-GENDER-ATTRIBUTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_number_attributes_disagreeP", "NL-NUMBER-ATTRIBUTES-DISAGREE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_gender_attributes_disagreeP", "NL-GENDER-ATTRIBUTES-DISAGREE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cycls_disagree_in_nl_number_attributeP", "CYCLS-DISAGREE-IN-NL-NUMBER-ATTRIBUTE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cycls_disagree_in_nl_gender_attributeP", "CYCLS-DISAGREE-IN-NL-GENDER-ATTRIBUTE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "nl_number_to_spp", "NL-NUMBER-TO-SPP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "spp_to_nl_number", "SPP-TO-NL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "init_spps_to_nl_numbers", "INIT-SPPS-TO-NL-NUMBERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "add_nl_def_wrapper", "ADD-NL-DEF-WRAPPER", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_collection_expression", "PARSE-COLLECTION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "make_collection_expression", "MAKE-COLLECTION-EXPRESSION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "npp_init_excluded_name_preds", "NPP-INIT-EXCLUDED-NAME-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "npp_name_preds_to_exclude_iterator", "NPP-NAME-PREDS-TO-EXCLUDE-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "npp_excluded_name_predP", "NPP-EXCLUDED-NAME-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "blacklisted_cycl_for_parsersP", "BLACKLISTED-CYCL-FOR-PARSERS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "psp_lexicon_root_mt", "PSP-LEXICON-ROOT-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "psp_weight_to_float", "PSP-WEIGHT-TO-FLOAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "psp_weight_from_float", "PSP-WEIGHT-FROM-FLOAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "remove_keyword_literals", "REMOVE-KEYWORD-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "vp_parse_from_pspP", "VP-PARSE-FROM-PSP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_words", "RESULT-OF-PARSING-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_span", "RESULT-OF-PARSING-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_span_wXo_thelist", "RESULT-OF-PARSING-SPAN-W/O-THELIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_span_length", "RESULT-OF-PARSING-SPAN-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_category", "RESULT-OF-PARSING-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_start", "RESULT-OF-PARSING-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_end", "RESULT-OF-PARSING-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_formulaP", "RESULT-OF-PARSING-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "formula_contains_result_of_parsingP", "FORMULA-CONTAINS-RESULT-OF-PARSING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "formulas_containing_results_of_parsing", "FORMULAS-CONTAINING-RESULTS-OF-PARSING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "token_list_from_span", "TOKEN-LIST-FROM-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "result_of_parsing_highest_category", "RESULT-OF-PARSING-HIGHEST-CATEGORY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "devisable_verb_frameP", "DEVISABLE-VERB-FRAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "verb_semtrans_from_denot_rolesXframe", "VERB-SEMTRANS-FROM-DENOT-ROLES&FRAME", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "known_roles_for_denot", "KNOWN-ROLES-FOR-DENOT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "known_subject_roles_for_denot", "KNOWN-SUBJECT-ROLES-FOR-DENOT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "known_direct_object_roles_for_denot", "KNOWN-DIRECT-OBJECT-ROLES-FOR-DENOT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "known_indirect_object_roles_for_denot", "KNOWN-INDIRECT-OBJECT-ROLES-FOR-DENOT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "required_arg1_preds", "REQUIRED-ARG1-PREDS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "remove_genl_preds", "REMOVE-GENL-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "ra1p_do_one_event_type", "RA1P-DO-ONE-EVENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "ra1p_do_one_event_typeXpred", "RA1P-DO-ONE-EVENT-TYPE&PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "possibly_uniquify_variablefn", "POSSIBLY-UNIQUIFY-VARIABLEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "unique_el_var_for_variablefn", "UNIQUE-EL-VAR-FOR-VARIABLEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "good_type_for_var_nameP", "GOOD-TYPE-FOR-VAR-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "variablefn_termP", "VARIABLEFN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "next_unique_var_name", "NEXT-UNIQUE-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parsing_rewrite_of_inverseP", "PARSING-REWRITE-OF-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parsing_rewrite_ofP", "PARSING-REWRITE-OF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_tree_creation_rules", "PARSE-TREE-CREATION-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_p", "SYNTACTIC-NODE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "lexical_nodeP", "LEXICAL-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "phrasal_nodeP", "PHRASAL-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_choice_node_p", "SYNTACTIC-CHOICE-NODE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_dtrs", "SYNTACTIC-NODE-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_mother", "SYNTACTIC-NODE-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_root_node", "SYNTACTIC-NODE-ROOT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_nth_dtr", "SYNTACTIC-NODE-NTH-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_descendant_at_path", "SYNTACTIC-NODE-DESCENDANT-AT-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "assert_parse_tree_info", "ASSERT-PARSE-TREE-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_propose_meaning", "SYNTACTIC-NODE-PROPOSE-MEANING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_note_semantic_dependency", "SYNTACTIC-NODE-NOTE-SEMANTIC-DEPENDENCY", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_proposed_meanings", "SYNTACTIC-NODE-PROPOSED-MEANINGS", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "push_meanings_from_syntactic_node", "PUSH-MEANINGS-FROM-SYNTACTIC-NODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "push_node_meaning_pairs_from_syntactic_node", "PUSH-NODE-MEANING-PAIRS-FROM-SYNTACTIC-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "recently_created_parse_tree_elements", "RECENTLY-CREATED-PARSE-TREE-ELEMENTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "remembering_new_parse_tree_elements", "REMEMBERING-NEW-PARSE-TREE-ELEMENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "forget_recently_created_parse_tree_elements", "FORGET-RECENTLY-CREATED-PARSE-TREE-ELEMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "kill_recently_created_parse_tree_elements", "KILL-RECENTLY-CREATED-PARSE-TREE-ELEMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_parse_tree_element", "CREATE-PARSE-TREE-ELEMENT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "hypothesize_parse_tree_element", "HYPOTHESIZE-PARSE-TREE-ELEMENT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "generate_choice_node", "GENERATE-CHOICE-NODE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "choice_node_add_option_node", "CHOICE-NODE-ADD-OPTION-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_parse_tree", "CREATE-PARSE-TREE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "assert_parse_tree_root_node", "ASSERT-PARSE-TREE-ROOT-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_parse_tree_with_root_node", "CREATE-PARSE-TREE-WITH-ROOT-NODE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "content_mt_of_parse_tree", "CONTENT-MT-OF-PARSE-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_syntactic_node", "CREATE-SYNTACTIC-NODE", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_phrasal_node", "CREATE-PHRASAL-NODE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "assert_start_offset_for_token", "ASSERT-START-OFFSET-FOR-TOKEN", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_string", "SYNTACTIC-NODE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_start_offset", "SYNTACTIC-NODE-START-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_category", "SYNTACTIC-NODE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_agreement_pred", "SYNTACTIC-NODE-AGREEMENT-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_tree", "SYNTACTIC-NODE-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_penntag", "SYNTACTIC-NODE-PENNTAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_tree_content_mt", "PARSE-TREE-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_content_mt", "SYNTACTIC-NODE-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_span", "SYNTACTIC-NODE-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_lexical_node", "CREATE-LEXICAL-NODE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_add_dtr", "SYNTACTIC-NODE-ADD-DTR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_add_head_dtr", "SYNTACTIC-NODE-ADD-HEAD-DTR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "package_node_meaning", "PACKAGE-NODE-MEANING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_to_nested_list", "SYNTACTIC-NODE-TO-NESTED-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "phrasal_node_string_from_dtrs", "PHRASAL-NODE-STRING-FROM-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "phrasal_node_span_from_dtrs", "PHRASAL-NODE-SPAN-FROM-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_span_start", "SYNTACTIC-NODE-SPAN-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "syntactic_node_span_end", "SYNTACTIC-NODE-SPAN-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "initialize_penntag_phrase_categories", "INITIALIZE-PENNTAG-PHRASE-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "penntag_phrase_categories", "PENNTAG-PHRASE-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cycl_penntag_p", "CYCL-PENNTAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "penntag_category", "PENNTAG-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "denots_of_stringXpenntag", "DENOTS-OF-STRING&PENNTAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "initialize_penntag_forts", "INITIALIZE-PENNTAG-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "penntag_forts", "PENNTAG-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "penntag_to_cycl", "PENNTAG-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cycl_penntag_to_keyword", "CYCL-PENNTAG-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "find_or_create_parse_token", "FIND-OR-CREATE-PARSE-TOKEN", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "find_parse_token", "FIND-PARSE-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_parse_token", "CREATE-PARSE-TOKEN", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "compute_parse_token_start_offset", "COMPUTE-PARSE-TOKEN-START-OFFSET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "token_start_offset", "TOKEN-START-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "token_number", "TOKEN-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "token_string", "TOKEN-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "token_tokenization", "TOKEN-TOKENIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "tokenization_peg", "TOKENIZATION-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "tokenization_tokens", "TOKENIZATION-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "tokenization_input_string", "TOKENIZATION-INPUT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "tokenization_token_count", "TOKENIZATION-TOKEN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "create_token_mapping", "CREATE-TOKEN-MAPPING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "update_token_mapping", "UPDATE-TOKEN-MAPPING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "construct_parse_expression_from_syntactic_node", "CONSTRUCT-PARSE-EXPRESSION-FROM-SYNTACTIC-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "construct_subl_parse_tree_from_syntactic_node", "CONSTRUCT-SUBL-PARSE-TREE-FROM-SYNTACTIC-NODE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "add_parse_tree_to_node_mappings", "ADD-PARSE-TREE-TO-NODE-MAPPINGS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "with_parsing_filter_piles", "WITH-PARSING-FILTER-PILES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "parsing_filter_accepts", "PARSING-FILTER-ACCEPTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "parsing_filter_rejects", "PARSING-FILTER-REJECTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "apply_elimination_parsing_filter", "APPLY-ELIMINATION-PARSING-FILTER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_utilities", "save_parsing_filter_piles", "SAVE-PARSING-FILTER-PILES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "apply_boolean_parsing_filter", "APPLY-BOOLEAN-PARSING-FILTER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "apply_macroscopic_parsing_filter", "APPLY-MACROSCOPIC-PARSING-FILTER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parsing_subcollection_function_nautP", "PARSING-SUBCOLLECTION-FUNCTION-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "ternary_parsing_subcollection_function_nautP", "TERNARY-PARSING-SUBCOLLECTION-FUNCTION-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_naut_from_arg", "SUBCOLLECTION-FUNCTION-NAUT-FROM-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_type_level_in_from_argP", "SUBCOLLECTION-FUNCTION-TYPE-LEVEL-IN-FROM-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_type_level_in_to_argP", "SUBCOLLECTION-FUNCTION-TYPE-LEVEL-IN-TO-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_naut_to_arg", "SUBCOLLECTION-FUNCTION-NAUT-TO-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_naut_pred", "SUBCOLLECTION-FUNCTION-NAUT-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_naut_with_new_from_arg", "SUBCOLLECTION-FUNCTION-NAUT-WITH-NEW-FROM-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "subcollection_function_naut_with_new_to_arg", "SUBCOLLECTION-FUNCTION-NAUT-WITH-NEW-TO-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "eliminate_genl_subcollection_nauts", "ELIMINATE-GENL-SUBCOLLECTION-NAUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "clear_parse_as_typeP", "CLEAR-PARSE-AS-TYPE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "remove_parse_as_typeP", "REMOVE-PARSE-AS-TYPE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_as_typeP_internal", "PARSE-AS-TYPE?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_as_typeP", "PARSE-AS-TYPE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "restrict_parses_by_types", "RESTRICT-PARSES-BY-TYPES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "restrict_parse_to_type", "RESTRICT-PARSE-TO-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_dates_and_numbers", "PARSE-DATES-AND-NUMBERS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_iterator_print_function_trampoline", "PARSE-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_iterator_p", "PARSE-ITERATOR-P", 1, 0, false);
        new $parse_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_sub_iterators", "PI-SUB-ITERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_properties", "PI-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_current_iterator_index", "PI-CURRENT-ITERATOR-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_string", "PI-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_previous_parses", "PI-PREVIOUS-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_next", "PI-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_pi_sub_iterators", "_CSETF-PI-SUB-ITERATORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_pi_properties", "_CSETF-PI-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_pi_current_iterator_index", "_CSETF-PI-CURRENT-ITERATOR-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_pi_string", "_CSETF-PI-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_pi_previous_parses", "_CSETF-PI-PREVIOUS-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_pi_next", "_CSETF-PI-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "make_parse_iterator", "MAKE-PARSE-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "visit_defstruct_parse_iterator", "VISIT-DEFSTRUCT-PARSE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "visit_defstruct_object_parse_iterator_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "print_parse_iterator", "PRINT-PARSE-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "new_parse_iterator", "NEW-PARSE-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "new_parse_iterator_state", "NEW-PARSE-ITERATOR-STATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parsing_subiterators", "PARSING-SUBITERATORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "pi_current_iterator", "PI-CURRENT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_iterator_done", "PARSE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_iterator_has_next", "PARSE-ITERATOR-HAS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "parse_iterator_next", "PARSE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cyclify_iterator_print_function_trampoline", "CYCLIFY-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cyclify_iterator_p", "CYCLIFY-ITERATOR-P", 1, 0, false);
        new $cyclify_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cyclify_iterator_iter_obj", "CYCLIFY-ITERATOR-ITER-OBJ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "_csetf_cyclify_iterator_iter_obj", "_CSETF-CYCLIFY-ITERATOR-ITER-OBJ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "make_cyclify_iterator", "MAKE-CYCLIFY-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "visit_defstruct_cyclify_iterator", "VISIT-DEFSTRUCT-CYCLIFY-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "visit_defstruct_object_cyclify_iterator_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFY-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "new_cyclify_iterator", "NEW-CYCLIFY-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "new_cyclify_iterator_state", "NEW-CYCLIFY-ITERATOR-STATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cyclify_iterator_done", "CYCLIFY-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "cyclify_iterator_next", "CYCLIFY-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "complete_text_topic_structure_tagging", "COMPLETE-TEXT-TOPIC-STRUCTURE-TAGGING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "speaker_referent", "SPEAKER-REFERENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "get_cyclifier_interps_for_expression_peg", "GET-CYCLIFIER-INTERPS-FOR-EXPRESSION-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "peg_text", "PEG-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "get_cyclifier_interps_for_string", "GET-CYCLIFIER-INTERPS-FOR-STRING", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "record_suggested_nl_for_assertion", "RECORD-SUGGESTED-NL-FOR-ASSERTION", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "record_suggested_nl_in_kb", "RECORD-SUGGESTED-NL-IN-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_utilities", "record_suggested_nl_to_file", "RECORD-SUGGESTED-NL-TO-FILE", 4, 2, false);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    public static SubLObject init_parsing_utilities_file() {
        parsing_utilities.$parse_noun_compound_valid_non_alpha_chars$ = SubLFiles.deflexical("*PARSE-NOUN-COMPOUND-VALID-NON-ALPHA-CHARS*", (SubLObject)parsing_utilities.$str14$___0123456789);
        parsing_utilities.$nl_tags$ = SubLFiles.defparameter("*NL-TAGS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)parsing_utilities.EQL), (SubLObject)parsing_utilities.SIXTEEN_INTEGER));
        parsing_utilities.$nl_tag_fns$ = SubLFiles.defparameter("*NL-TAG-FNS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)parsing_utilities.EQL), (SubLObject)parsing_utilities.SIXTEEN_INTEGER));
        parsing_utilities.$nl_tag_denoting_fns$ = SubLFiles.defparameter("*NL-TAG-DENOTING-FNS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)parsing_utilities.EQL), (SubLObject)parsing_utilities.SIXTEEN_INTEGER));
        parsing_utilities.$make_nl_tag_template_caching_state$ = SubLFiles.deflexical("*MAKE-NL-TAG-TEMPLATE-CACHING-STATE*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$nl_max_floor_preds_caching_state$ = SubLFiles.deflexical("*NL-MAX-FLOOR-PREDS-CACHING-STATE*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$spps_to_nl_numbers$ = SubLFiles.deflexical("*SPPS-TO-NL-NUMBERS*", (parsing_utilities.NIL != Symbols.boundp((SubLObject)parsing_utilities.$sym81$_SPPS_TO_NL_NUMBERS_)) ? parsing_utilities.$spps_to_nl_numbers$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)parsing_utilities.$int82$128, (SubLObject)parsing_utilities.UNPROVIDED, (SubLObject)parsing_utilities.UNPROVIDED));
        parsing_utilities.$npp_name_preds_to_exclude$ = SubLFiles.defparameter("*NPP-NAME-PREDS-TO-EXCLUDE*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$ra1p_rae_preds$ = SubLFiles.defparameter("*RA1P-RAE-PREDS*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$ra1p_ra1_preds$ = SubLFiles.defparameter("*RA1P-RA1-PREDS*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$ra1p_show_pairsP$ = SubLFiles.deflexical("*RA1P-SHOW-PAIRS?*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$recently_created_parse_tree_elements$ = SubLFiles.deflexical("*RECENTLY-CREATED-PARSE-TREE-ELEMENTS*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$remember_new_parse_tree_elementsP$ = SubLFiles.defparameter("*REMEMBER-NEW-PARSE-TREE-ELEMENTS?*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$penntag_phrase_categories$ = SubLFiles.deflexical("*PENNTAG-PHRASE-CATEGORIES*", (SubLObject)((parsing_utilities.NIL != Symbols.boundp((SubLObject)parsing_utilities.$sym203$_PENNTAG_PHRASE_CATEGORIES_)) ? parsing_utilities.$penntag_phrase_categories$.getGlobalValue() : parsing_utilities.$kw89$UNINITIALIZED));
        parsing_utilities.$penntag_forts$ = SubLFiles.deflexical("*PENNTAG-FORTS*", (SubLObject)((parsing_utilities.NIL != Symbols.boundp((SubLObject)parsing_utilities.$sym208$_PENNTAG_FORTS_)) ? parsing_utilities.$penntag_forts$.getGlobalValue() : parsing_utilities.$kw89$UNINITIALIZED));
        parsing_utilities.$good_parsing_pile$ = SubLFiles.defparameter("*GOOD-PARSING-PILE*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$bad_parsing_pile$ = SubLFiles.defparameter("*BAD-PARSING-PILE*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$parse_as_typeP_caching_state$ = SubLFiles.deflexical("*PARSE-AS-TYPE?-CACHING-STATE*", (SubLObject)parsing_utilities.NIL);
        parsing_utilities.$dtp_parse_iterator$ = SubLFiles.defconstant("*DTP-PARSE-ITERATOR*", (SubLObject)parsing_utilities.$sym264$PARSE_ITERATOR);
        parsing_utilities.$dtp_cyclify_iterator$ = SubLFiles.defconstant("*DTP-CYCLIFY-ITERATOR*", (SubLObject)parsing_utilities.$sym306$CYCLIFY_ITERATOR);
        return (SubLObject)parsing_utilities.NIL;
    }
    
    public static SubLObject setup_parsing_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)parsing_utilities.$sym6$INSTANCES_OF_COLLECTION_PARSE);
        memoization_state.note_globally_cached_function((SubLObject)parsing_utilities.$sym50$MAKE_NL_TAG_TEMPLATE);
        memoization_state.note_memoized_function((SubLObject)parsing_utilities.$sym55$DETERMINER_NUMBER_DENOT_);
        memoization_state.note_globally_cached_function((SubLObject)parsing_utilities.$sym60$NL_MAX_FLOOR_PREDS);
        subl_macro_promotions.declare_defglobal((SubLObject)parsing_utilities.$sym81$_SPPS_TO_NL_NUMBERS_);
        subl_macro_promotions.declare_defglobal((SubLObject)parsing_utilities.$sym203$_PENNTAG_PHRASE_CATEGORIES_);
        subl_macro_promotions.declare_defglobal((SubLObject)parsing_utilities.$sym208$_PENNTAG_FORTS_);
        memoization_state.note_globally_cached_function((SubLObject)parsing_utilities.$sym254$PARSE_AS_TYPE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), parsing_utilities.$dtp_parse_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)parsing_utilities.$sym271$PARSE_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)parsing_utilities.$list272);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym273$PI_SUB_ITERATORS, (SubLObject)parsing_utilities.$sym274$_CSETF_PI_SUB_ITERATORS);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym275$PI_PROPERTIES, (SubLObject)parsing_utilities.$sym276$_CSETF_PI_PROPERTIES);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym277$PI_CURRENT_ITERATOR_INDEX, (SubLObject)parsing_utilities.$sym278$_CSETF_PI_CURRENT_ITERATOR_INDEX);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym279$PI_STRING, (SubLObject)parsing_utilities.$sym280$_CSETF_PI_STRING);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym281$PI_PREVIOUS_PARSES, (SubLObject)parsing_utilities.$sym282$_CSETF_PI_PREVIOUS_PARSES);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym283$PI_NEXT, (SubLObject)parsing_utilities.$sym284$_CSETF_PI_NEXT);
        Equality.identity((SubLObject)parsing_utilities.$sym264$PARSE_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parsing_utilities.$dtp_parse_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)parsing_utilities.$sym296$VISIT_DEFSTRUCT_OBJECT_PARSE_ITERATOR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), parsing_utilities.$dtp_cyclify_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)parsing_utilities.$sym313$CYCLIFY_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)parsing_utilities.$list314);
        Structures.def_csetf((SubLObject)parsing_utilities.$sym315$CYCLIFY_ITERATOR_ITER_OBJ, (SubLObject)parsing_utilities.$sym316$_CSETF_CYCLIFY_ITERATOR_ITER_OBJ);
        Equality.identity((SubLObject)parsing_utilities.$sym306$CYCLIFY_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parsing_utilities.$dtp_cyclify_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)parsing_utilities.$sym319$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_ITERATOR_METHOD));
        return (SubLObject)parsing_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_parsing_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_parsing_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_parsing_utilities_file();
    }
    
    static {
        me = (SubLFile)new parsing_utilities();
        parsing_utilities.$parse_noun_compound_valid_non_alpha_chars$ = null;
        parsing_utilities.$nl_tags$ = null;
        parsing_utilities.$nl_tag_fns$ = null;
        parsing_utilities.$nl_tag_denoting_fns$ = null;
        parsing_utilities.$make_nl_tag_template_caching_state$ = null;
        parsing_utilities.$nl_max_floor_preds_caching_state$ = null;
        parsing_utilities.$spps_to_nl_numbers$ = null;
        parsing_utilities.$npp_name_preds_to_exclude$ = null;
        parsing_utilities.$ra1p_rae_preds$ = null;
        parsing_utilities.$ra1p_ra1_preds$ = null;
        parsing_utilities.$ra1p_show_pairsP$ = null;
        parsing_utilities.$recently_created_parse_tree_elements$ = null;
        parsing_utilities.$remember_new_parse_tree_elementsP$ = null;
        parsing_utilities.$penntag_phrase_categories$ = null;
        parsing_utilities.$penntag_forts$ = null;
        parsing_utilities.$good_parsing_pile$ = null;
        parsing_utilities.$bad_parsing_pile$ = null;
        parsing_utilities.$parse_as_typeP_caching_state$ = null;
        parsing_utilities.$dtp_parse_iterator$ = null;
        parsing_utilities.$dtp_cyclify_iterator$ = null;
        $kw0$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw1$BEST_ONLY = SubLObjectFactory.makeKeyword("BEST-ONLY");
        $sym2$NPP_PARSE_CYCL = SubLObjectFactory.makeSymbol("NPP-PARSE-CYCL");
        $kw3$EVERYTHING = SubLObjectFactory.makeKeyword("EVERYTHING");
        $kw4$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const5$Definite_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"));
        $sym6$INSTANCES_OF_COLLECTION_PARSE = SubLObjectFactory.makeSymbol("INSTANCES-OF-COLLECTION-PARSE");
        $sym7$_X = SubLObjectFactory.makeSymbol("?X");
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw9$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw10$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw11$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $sym12$PARSE_NOUN_COMPOUND_VALID_CHAR_P = SubLObjectFactory.makeSymbol("PARSE-NOUN-COMPOUND-VALID-CHAR-P");
        $const13$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str14$___0123456789 = SubLObjectFactory.makeString(" -'0123456789");
        $sym15$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const16$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const17$NLUtteranceAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLUtteranceAttribute"));
        $kw18$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw19$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw20$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym21$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw22$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str23$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym24$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw25$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str26$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw27$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str28$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const29$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw30$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw31$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str32$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str33$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str34$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const35$genlFuncs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFuncs"));
        $const36$NLTagFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn"));
        $const37$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $const38$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym39$STRIP_NL_TAGS = SubLObjectFactory.makeSymbol("STRIP-NL-TAGS");
        $kw40$DEFINITENESS = SubLObjectFactory.makeKeyword("DEFINITENESS");
        $const41$NLDefinitenessFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3"));
        $kw42$QUANT = SubLObjectFactory.makeKeyword("QUANT");
        $const43$NLQuantFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3"));
        $str44$Can_t_find_ternary_NL_tag_fn_for_ = SubLObjectFactory.makeString("Can't find ternary NL tag fn for ~S");
        $const45$NLDefinitenessFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn"));
        $const46$NLQuantFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn"));
        $kw47$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $const48$NLNumberFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn"));
        $str49$Can_t_find_binary_NL_tag_fn_for__ = SubLObjectFactory.makeString("Can't find binary NL tag fn for ~S");
        $sym50$MAKE_NL_TAG_TEMPLATE = SubLObjectFactory.makeSymbol("MAKE-NL-TAG-TEMPLATE");
        $sym51$_MAKE_NL_TAG_TEMPLATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAKE-NL-TAG-TEMPLATE-CACHING-STATE*");
        $sym52$NL_TAG_ = SubLObjectFactory.makeSymbol("NL-TAG?");
        $str53$Couldn_t_determine_NL_number_for_ = SubLObjectFactory.makeString("Couldn't determine NL number for ~S");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym55$DETERMINER_NUMBER_DENOT_ = SubLObjectFactory.makeSymbol("DETERMINER-NUMBER-DENOT?");
        $const56$ScalarInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $list57 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $list58 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $list59 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic")));
        $sym60$NL_MAX_FLOOR_PREDS = SubLObjectFactory.makeSymbol("NL-MAX-FLOOR-PREDS");
        $sym61$_NL_MAX_FLOOR_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-MAX-FLOOR-PREDS-CACHING-STATE*");
        $int62$256 = SubLObjectFactory.makeInteger(256);
        $const63$PronounFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PronounFn"));
        $sym64$CYCL_PRONOUN_P = SubLObjectFactory.makeSymbol("CYCL-PRONOUN-P");
        $const65$UnmarkedNumber_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnmarkedNumber-NLAttr"));
        $const66$SubcollectionFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionFunction"));
        $const67$Ungendered_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr"));
        $const68$NLNumberAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberAttribute"));
        $const69$NLDefinitenessAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessAttribute"));
        $const70$NLGenderAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLGenderAttribute"));
        $sym71$KB_NL_NUMBER_ATTRIBUTE_P = SubLObjectFactory.makeSymbol("KB-NL-NUMBER-ATTRIBUTE-P");
        $const72$Generic_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Generic-NLAttr"));
        $const73$Mass_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr"));
        $const74$Plural_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr"));
        $sym75$KB_NL_GENDER_ATTRIBUTE_P = SubLObjectFactory.makeSymbol("KB-NL-GENDER-ATTRIBUTE-P");
        $const76$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $const77$Singular_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $const78$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $const79$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $const80$massNumber_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber-Generic"));
        $sym81$_SPPS_TO_NL_NUMBERS_ = SubLObjectFactory.makeSymbol("*SPPS-TO-NL-NUMBERS*");
        $int82$128 = SubLObjectFactory.makeInteger(128);
        $const83$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $kw84$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $const85$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $const86$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const87$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction"));
        $const88$ProperNamePredicate_ExcludedFromN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-ExcludedFromNPParser"));
        $kw89$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym90$ROOT_MT = SubLObjectFactory.makeSymbol("ROOT-MT");
        $sym91$PSP_WEIGHT_P = SubLObjectFactory.makeSymbol("PSP-WEIGHT-P");
        $sym92$FLOATP = SubLObjectFactory.makeSymbol("FLOATP");
        $kw93$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $kw94$FLOAT = SubLObjectFactory.makeKeyword("FLOAT");
        $sym95$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $const96$TheVPParse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheVPParse"));
        $const97$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $const98$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $sym99$RESULT_OF_PARSING_FORMULA_ = SubLObjectFactory.makeSymbol("RESULT-OF-PARSING-FORMULA?");
        $const100$ParsingTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParsingTemplateCategory"));
        $str101$_A_doesn_t_genl_to___ParsingTempl = SubLObjectFactory.makeString("~A doesn't genl to #$ParsingTemplateCategory");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-ROLES"), (SubLObject)SubLObjectFactory.makeSymbol("DIR-OBJ-ROLES"), (SubLObject)SubLObjectFactory.makeSymbol("INDIR-OBJ-ROLES"));
        $const103$MiddleVoiceFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MiddleVoiceFrame"));
        $const104$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw105$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"));
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $const108$doneBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy"));
        $const109$patient_GenericDirect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patient-GenericDirect"));
        $const110$patient_GenericIndirect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patient-GenericIndirect"));
        $list111 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsMany")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin")));
        $sym112$ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDICATES");
        $const113$requiredArg1Pred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred"));
        $sym114$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym115$GENL_PRED_ = SubLObjectFactory.makeSymbol("GENL-PRED?");
        $sym116$GENL_ = SubLObjectFactory.makeSymbol("GENL?");
        $sym117$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym118$SPEC_PRED_ = SubLObjectFactory.makeSymbol("SPEC-PRED?");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $const120$VariableFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VariableFn"));
        $str121$0 = SubLObjectFactory.makeString("0");
        $str122$_ = SubLObjectFactory.makeString("-");
        $const123$parsingConflateTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parsingConflateTo"));
        $sym124$NART_TO_NAUT = SubLObjectFactory.makeSymbol("NART-TO-NAUT");
        $const125$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $const126$ParseTreeReificationTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParseTreeReificationTemplate"));
        $const127$SyntacticNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticNode"));
        $const128$LexicalNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalNode"));
        $const129$SyntacticChoiceNode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SyntacticChoiceNode"));
        $const130$syntacticNodeNthDaughter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeNthDaughter"));
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DTR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("?DTR"));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DTR"), (SubLObject)SubLObjectFactory.makeSymbol("?DTR-NUM"))), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym133$_ = SubLObjectFactory.makeSymbol("<");
        $const134$syntacticDaughters = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticDaughters"));
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DTR"));
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?DTR")), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym137$_MOTHER = SubLObjectFactory.makeSymbol("?MOTHER");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?MOTHER")), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)parsing_utilities.ONE_INTEGER);
        $const139$proposedMeaning = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("proposedMeaning"));
        $const140$dependentMeaning = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dependentMeaning"));
        $sym141$_MEANING = SubLObjectFactory.makeSymbol("?MEANING");
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MEANING"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEANINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSE-TREE-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("proposedMeaning"))));
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("PRED"));
        $kw145$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw146$MT = SubLObjectFactory.makeKeyword("MT");
        $kw147$PRED = SubLObjectFactory.makeKeyword("PRED");
        $sym148$THIS_MEANING = SubLObjectFactory.makeUninternedSymbol("THIS-MEANING");
        $sym149$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym150$SYNTACTIC_NODE_PROPOSED_MEANINGS = SubLObjectFactory.makeSymbol("SYNTACTIC-NODE-PROPOSED-MEANINGS");
        $sym151$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)parsing_utilities.EQUAL));
        $sym153$THIS_MEANING = SubLObjectFactory.makeUninternedSymbol("THIS-MEANING");
        $sym154$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym155$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*REMEMBER-NEW-PARSE-TREE-ELEMENTS?*"), (SubLObject)parsing_utilities.T));
        $str157$ParseTreeElement = SubLObjectFactory.makeString("ParseTreeElement");
        $kw158$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $sym159$_INSTANCE = SubLObjectFactory.makeSymbol("?INSTANCE");
        $str160$Can_t_hypothesize_instance_of__S_ = SubLObjectFactory.makeString("Can't hypothesize instance of ~S because~% ~S");
        $const161$syntacticNodeCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCreator"));
        $const162$optionNodes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("optionNodes"));
        $const163$CycParseTree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycParseTree"));
        $const164$syntacticRootOfParseTree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticRootOfParseTree"));
        $const165$ContentMtOfParseTreeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtOfParseTreeFn"));
        $const166$syntacticNodeCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCategory"));
        $const167$syntacticNodeString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeString"));
        $const168$syntacticNodePhraseStructureRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodePhraseStructureRule"));
        $const169$tokenString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenString"));
        $const170$tokenStartCharacterOffset = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenStartCharacterOffset"));
        $str171$Token_node_mismatch__Token___S_st = SubLObjectFactory.makeString("Token-node mismatch. Token: ~S string: ~S. Node string: ~S");
        $const172$syntacticNodeCoversToken = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCoversToken"));
        $const173$CycParsingTokenContiguousSetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycParsingTokenContiguousSetFn"));
        $const174$syntacticNodeCoversTokenSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeCoversTokenSet"));
        $const175$syntacticNodeStartCharacterOffset = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeStartCharacterOffset"));
        $const176$syntacticNodeAgreementPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeAgreementPredicate"));
        $const177$nodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nodeInSystem"));
        $const178$syntacticNodePennTag = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodePennTag"));
        $const179$contentMtOfParseTree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMtOfParseTree"));
        $kw180$TOKEN = SubLObjectFactory.makeKeyword("TOKEN");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOKEN"));
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-TOKEN-NUM"));
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-TOKEN-NUM"));
        $sym184$LAST_TOKEN_NUM = SubLObjectFactory.makeSymbol("LAST-TOKEN-NUM");
        $sym185$FIRST_TOKEN_NUM = SubLObjectFactory.makeSymbol("FIRST-TOKEN-NUM");
        $str186$Couldn_t_get_interval_span_for__S = SubLObjectFactory.makeString("Couldn't get interval span for ~S in ~S");
        $const187$lexicalNodeCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexicalNodeCreator"));
        $const188$lexicalNodeCoversToken = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexicalNodeCoversToken"));
        $const189$lexicalNodeCoversTokenSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexicalNodeCoversTokenSet"));
        $sym190$_N = SubLObjectFactory.makeSymbol("?N");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)SubLObjectFactory.makeSymbol("?NODE"));
        $const192$syntacticNodeNthContributor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeNthContributor"));
        $const193$syntacticNodeHeadDaughter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeHeadDaughter"));
        $const194$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $sym195$SYNTACTIC_NODE_TO_NESTED_LIST = SubLObjectFactory.makeSymbol("SYNTACTIC-NODE-TO-NESTED-LIST");
        $str196$ = SubLObjectFactory.makeString("");
        $str197$Couldn_t_find_string_for__S = SubLObjectFactory.makeString("Couldn't find string for ~S");
        $str198$_ = SubLObjectFactory.makeString(" ");
        $str199$Bad_dtrs___S = SubLObjectFactory.makeString("Bad dtrs: ~S");
        $sym200$INTERVAL_SPAN_P = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-P");
        $str201$Can_t_get_span_start_from__S = SubLObjectFactory.makeString("Can't get span start from ~S");
        $str202$Can_t_get_span_end_from__S = SubLObjectFactory.makeString("Can't get span end from ~S");
        $sym203$_PENNTAG_PHRASE_CATEGORIES_ = SubLObjectFactory.makeSymbol("*PENNTAG-PHRASE-CATEGORIES*");
        $list204 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?TAG"), (SubLObject)SubLObjectFactory.makeSymbol("?CATEGORY"));
        $list205 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticCategoryTags")), (SubLObject)SubLObjectFactory.makeSymbol("?CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("?TAG"));
        $list206 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym207$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym208$_PENNTAG_FORTS_ = SubLObjectFactory.makeSymbol("*PENNTAG-FORTS*");
        $list209 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?TAG-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?TAG"));
        $list210 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pennTagString")), (SubLObject)SubLObjectFactory.makeSymbol("?TAG"), (SubLObject)SubLObjectFactory.makeSymbol("?TAG-STRING"));
        $sym211$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym212$_TOKEN = SubLObjectFactory.makeSymbol("?TOKEN");
        $const213$nthTokenInTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthTokenInTokenization"));
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TOKEN"));
        $sym215$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $const216$CycParsingToken = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycParsingToken"));
        $str217$Failed_to_compute_start_offset_fo = SubLObjectFactory.makeString("Failed to compute start offset for ~S (~S) of ~S");
        $const218$tokenTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenTokenization"));
        $const219$pegTokenizations = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pegTokenizations"));
        $const220$tokenizationInputString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenizationInputString"));
        $const221$numberOfTokensInTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberOfTokensInTokenization"));
        $sym222$CONSTRUCT_PARSE_EXPRESSION_FROM_SYNTACTIC_NODE = SubLObjectFactory.makeSymbol("CONSTRUCT-PARSE-EXPRESSION-FROM-SYNTACTIC-NODE");
        $sym223$PHRASAL_NODE_ = SubLObjectFactory.makeSymbol("PHRASAL-NODE?");
        $sym224$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $str225$Couldn_t_find_dtr__S_of__S = SubLObjectFactory.makeString("Couldn't find dtr ~S of ~S");
        $list226 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BAD")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym227$_GOOD_PARSING_PILE_ = SubLObjectFactory.makeSymbol("*GOOD-PARSING-PILE*");
        $sym228$_BAD_PARSING_PILE_ = SubLObjectFactory.makeSymbol("*BAD-PARSING-PILE*");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"));
        $sym230$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list231 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GOOD-PARSING-PILES*"));
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"));
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*BAD-PARSING-PILE*"));
        $list234 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT-ACCESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("DIAG-ACCESSOR"));
        $sym235$FILTER_RESPONSE = SubLObjectFactory.makeUninternedSymbol("FILTER-RESPONSE");
        $sym236$SOME_GOOD = SubLObjectFactory.makeUninternedSymbol("SOME-GOOD");
        $sym237$SOME_BAD = SubLObjectFactory.makeUninternedSymbol("SOME-BAD");
        $sym238$THIS_CANDIDATE = SubLObjectFactory.makeUninternedSymbol("THIS-CANDIDATE");
        $list239 = ConsesLow.list((SubLObject)parsing_utilities.NIL);
        $list240 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GOOD-PARSING-PILE*"));
        $sym241$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym242$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym243$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym244$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym245$PROPER_LIST_P = SubLObjectFactory.makeSymbol("PROPER-LIST-P");
        $sym246$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list247 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOD"), (SubLObject)SubLObjectFactory.makeSymbol("BAD"));
        $sym248$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $const249$SubcollectionRelationFunction_Can = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Canonical"));
        $const250$SubcollectionRelationFunction_Typ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-TypeLevel"));
        $const251$SubcollectionRelationFunction_Inv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Inverse"));
        $list252 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-ARG3"));
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-ARG3"));
        $sym254$PARSE_AS_TYPE_ = SubLObjectFactory.makeSymbol("PARSE-AS-TYPE?");
        $const255$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const256$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $list257 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)parsing_utilities.NIL);
        $sym258$_PARSE_AS_TYPE__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PARSE-AS-TYPE?-CACHING-STATE*");
        $const259$Unity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity"));
        $const260$IntervalRangeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalRangeFn"));
        $const261$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $str262$_ = SubLObjectFactory.makeString(",");
        $list263 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $sym264$PARSE_ITERATOR = SubLObjectFactory.makeSymbol("PARSE-ITERATOR");
        $sym265$PARSE_ITERATOR_P = SubLObjectFactory.makeSymbol("PARSE-ITERATOR-P");
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-ITERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ITERATOR-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"));
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUB-ITERATORS"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-ITERATOR-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("PREVIOUS-PARSES"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT"));
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PI-SUB-ITERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("PI-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("PI-CURRENT-ITERATOR-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PI-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PI-PREVIOUS-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("PI-NEXT"));
        $list269 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PI-SUB-ITERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PI-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PI-CURRENT-ITERATOR-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PI-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PI-PREVIOUS-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PI-NEXT"));
        $sym270$PRINT_PARSE_ITERATOR = SubLObjectFactory.makeSymbol("PRINT-PARSE-ITERATOR");
        $sym271$PARSE_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARSE-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-ITERATOR-P"));
        $sym273$PI_SUB_ITERATORS = SubLObjectFactory.makeSymbol("PI-SUB-ITERATORS");
        $sym274$_CSETF_PI_SUB_ITERATORS = SubLObjectFactory.makeSymbol("_CSETF-PI-SUB-ITERATORS");
        $sym275$PI_PROPERTIES = SubLObjectFactory.makeSymbol("PI-PROPERTIES");
        $sym276$_CSETF_PI_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-PI-PROPERTIES");
        $sym277$PI_CURRENT_ITERATOR_INDEX = SubLObjectFactory.makeSymbol("PI-CURRENT-ITERATOR-INDEX");
        $sym278$_CSETF_PI_CURRENT_ITERATOR_INDEX = SubLObjectFactory.makeSymbol("_CSETF-PI-CURRENT-ITERATOR-INDEX");
        $sym279$PI_STRING = SubLObjectFactory.makeSymbol("PI-STRING");
        $sym280$_CSETF_PI_STRING = SubLObjectFactory.makeSymbol("_CSETF-PI-STRING");
        $sym281$PI_PREVIOUS_PARSES = SubLObjectFactory.makeSymbol("PI-PREVIOUS-PARSES");
        $sym282$_CSETF_PI_PREVIOUS_PARSES = SubLObjectFactory.makeSymbol("_CSETF-PI-PREVIOUS-PARSES");
        $sym283$PI_NEXT = SubLObjectFactory.makeSymbol("PI-NEXT");
        $sym284$_CSETF_PI_NEXT = SubLObjectFactory.makeSymbol("_CSETF-PI-NEXT");
        $kw285$SUB_ITERATORS = SubLObjectFactory.makeKeyword("SUB-ITERATORS");
        $kw286$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $kw287$CURRENT_ITERATOR_INDEX = SubLObjectFactory.makeKeyword("CURRENT-ITERATOR-INDEX");
        $kw288$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw289$PREVIOUS_PARSES = SubLObjectFactory.makeKeyword("PREVIOUS-PARSES");
        $kw290$NEXT = SubLObjectFactory.makeKeyword("NEXT");
        $str291$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw292$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym293$MAKE_PARSE_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-PARSE-ITERATOR");
        $kw294$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw295$END = SubLObjectFactory.makeKeyword("END");
        $sym296$VISIT_DEFSTRUCT_OBJECT_PARSE_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-ITERATOR-METHOD");
        $str297$__parse_iterator__S_current_iter_ = SubLObjectFactory.makeString("#<parse-iterator ~S current-iter: ~A sub-iters: ~A props: ~A>");
        $sym298$PARSE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("PARSE-ITERATOR-DONE");
        $sym299$PARSE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("PARSE-ITERATOR-NEXT");
        $kw300$PARSERS = SubLObjectFactory.makeKeyword("PARSERS");
        $list301 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharniakParserCyclifier")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRecursiveTemplateParser")));
        $const302$CycRecursiveTemplateParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRecursiveTemplateParser"));
        $const303$CharniakParserCyclifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharniakParserCyclifier"));
        $sym304$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $kw305$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $sym306$CYCLIFY_ITERATOR = SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR");
        $sym307$CYCLIFY_ITERATOR_P = SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-P");
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITER-OBJ"));
        $list309 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ITER-OBJ"));
        $list310 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-ITER-OBJ"));
        $list311 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-ITERATOR-ITER-OBJ"));
        $sym312$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym313$CYCLIFY_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list314 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-P"));
        $sym315$CYCLIFY_ITERATOR_ITER_OBJ = SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-ITER-OBJ");
        $sym316$_CSETF_CYCLIFY_ITERATOR_ITER_OBJ = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFY-ITERATOR-ITER-OBJ");
        $kw317$ITER_OBJ = SubLObjectFactory.makeKeyword("ITER-OBJ");
        $sym318$MAKE_CYCLIFY_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-CYCLIFY-ITERATOR");
        $sym319$VISIT_DEFSTRUCT_OBJECT_CYCLIFY_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCLIFY-ITERATOR-METHOD");
        $sym320$CYCLIFY_ITERATOR_DONE = SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-DONE");
        $sym321$CYCLIFY_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR-NEXT");
        $kw322$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $sym323$HAS_NEXT_ = SubLObjectFactory.makeSymbol("HAS-NEXT?");
        $sym324$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $const325$NLWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $kw326$L2R = SubLObjectFactory.makeKeyword("L2R");
        $sym327$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $const328$originalPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("originalPhrase"));
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $const330$TextualEntailmentGenericBackgroun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextualEntailmentGenericBackgroundMt"));
        $kw331$TEXTUAL_INFERENCE = SubLObjectFactory.makeKeyword("TEXTUAL-INFERENCE");
        $const332$contentModelFocalPeg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentModelFocalPeg"));
        $list333 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)parsing_utilities.ONE_INTEGER);
        $sym334$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $const335$ebmtNLToCycLTrainingExample = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ebmtNLToCycLTrainingExample"));
        $const336$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $const337$EBMTTrainingExamplesFromQLMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EBMTTrainingExamplesFromQLMt"));
    }
    
    public static final class $parse_iterator_native extends SubLStructNative
    {
        public SubLObject $sub_iterators;
        public SubLObject $properties;
        public SubLObject $current_iterator_index;
        public SubLObject $string;
        public SubLObject $previous_parses;
        public SubLObject $next;
        private static final SubLStructDeclNative structDecl;
        
        public $parse_iterator_native() {
            this.$sub_iterators = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
            this.$current_iterator_index = (SubLObject)CommonSymbols.NIL;
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$previous_parses = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$parse_iterator_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$sub_iterators;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$properties;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$current_iterator_index;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$string;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$previous_parses;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$next;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$sub_iterators = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$properties = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$current_iterator_index = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$string = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$previous_parses = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$next = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$parse_iterator_native.class, parsing_utilities.$sym264$PARSE_ITERATOR, parsing_utilities.$sym265$PARSE_ITERATOR_P, parsing_utilities.$list266, parsing_utilities.$list267, new String[] { "$sub_iterators", "$properties", "$current_iterator_index", "$string", "$previous_parses", "$next" }, parsing_utilities.$list268, parsing_utilities.$list269, parsing_utilities.$sym270$PRINT_PARSE_ITERATOR);
        }
    }
    
    public static final class $parse_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $parse_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARSE-ITERATOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return parsing_utilities.parse_iterator_p(arg1);
        }
    }
    
    public static final class $cyclify_iterator_native extends SubLStructNative
    {
        public SubLObject $iter_obj;
        private static final SubLStructDeclNative structDecl;
        
        public $cyclify_iterator_native() {
            this.$iter_obj = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cyclify_iterator_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$iter_obj;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$iter_obj = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cyclify_iterator_native.class, parsing_utilities.$sym306$CYCLIFY_ITERATOR, parsing_utilities.$sym307$CYCLIFY_ITERATOR_P, parsing_utilities.$list308, parsing_utilities.$list309, new String[] { "$iter_obj" }, parsing_utilities.$list310, parsing_utilities.$list311, parsing_utilities.$sym312$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $cyclify_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $cyclify_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCLIFY-ITERATOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return parsing_utilities.cyclify_iterator_p(arg1);
        }
    }
}

/*

	Total time: 2150 ms
	
*/