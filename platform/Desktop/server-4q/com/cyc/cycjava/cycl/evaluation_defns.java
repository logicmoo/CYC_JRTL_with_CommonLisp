package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.wordnet_import.wordnet_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class evaluation_defns extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.evaluation_defns";
    public static final String myFingerPrint = "86a3f8d5c5d7044ca3af58d41c22eebf4740784d0f32fd0f01216351773886d9";
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 1253L)
    private static SubLSymbol $cycl_functions_used_as_evaluation_defns$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 17237L)
    private static SubLSymbol $max_supported_formula_arity$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 39021L)
    private static SubLSymbol $bug_18769_switchP$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 43976L)
    private static SubLSymbol $word_strings_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 44280L)
    private static SubLSymbol $word_sequence_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 47775L)
    private static SubLSymbol $cached_find_via_pred_value_wrt_template_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLSymbol $use_new_nl_generation_api_for_generate_phrase_fnP$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    private static SubLSymbol $assertions_relevant_to_string_defn_max_to_check$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 65805L)
    private static SubLSymbol $cyc_ordering_relation$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 73925L)
    private static SubLSymbol $term_to_isg_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 74090L)
    private static SubLSymbol $term_to_isg_table$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 74641L)
    private static SubLSymbol $term_to_isg_wXstart_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 74819L)
    private static SubLSymbol $term_to_isg_wXstart_table$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const2$EverythingPSC;
    private static final SubLObject $const3$evaluationDefn;
    private static final SubLObject $const4$EvaluatablePredicate;
    private static final SubLSymbol $sym5$CYC_TRUE_SUBL;
    private static final SubLSymbol $kw6$UNKNOWN;
    private static final SubLSymbol $sym7$CYC_DIFFERENT;
    private static final SubLSymbol $sym8$CYC_DIFFERENT_SYMBOLS;
    private static final SubLSymbol $sym9$CYC_STRING_PRECEDES;
    private static final SubLSymbol $sym10$CYC_STRING_PRECEDES_CASE_INSENSITIVE;
    private static final SubLSymbol $sym11$CHAR_;
    private static final SubLSymbol $sym12$CYC_SUBSTRING_PREDICATE;
    private static final SubLSymbol $sym13$CHAR_EQUAL;
    private static final SubLSymbol $sym14$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE;
    private static final SubLSymbol $sym15$CYC_PREFIX_SUBSTRING;
    private static final SubLSymbol $sym16$CYC_SUFFIX_SUBSTRING;
    private static final SubLSymbol $sym17$CYC_SUBWORD_PREDICATE;
    private static final SubLString $str18$Could_not_find_constant__A_;
    private static final SubLString $str19$Arg1_of___FindConstantFn_must_be_;
    private static final SubLSymbol $sym20$CYC_FIND_CONSTANT;
    private static final SubLObject $const21$EvaluatableFunction;
    private static final SubLSymbol $sym22$CYC_EVALUATE_SUBL;
    private static final SubLSymbol $sym23$CYC_STRING_UPCASE;
    private static final SubLSymbol $sym24$STRING_UPCASE_DEFN;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$CYC_STRING_DOWNCASE;
    private static final SubLSymbol $sym27$CYC_SUBSTRING;
    private static final SubLSymbol $sym28$STRINGP;
    private static final SubLSymbol $sym29$CCONCATENATE;
    private static final SubLSymbol $sym30$CYC_STRING_CONCAT;
    private static final SubLString $str31$;
    private static final SubLString $str32$_;
    private static final SubLSymbol $sym33$CYC_STRINGS_TO_PHRASE;
    private static final SubLSymbol $sym34$CYC_PRE_REMOVE;
    private static final SubLInteger $int35$128;
    private static final SubLSymbol $sym36$__;
    private static final SubLSymbol $sym37$CYC_REPLACE_SUBSTRING;
    private static final SubLSymbol $sym38$CYC_UNIQUE_WS;
    private static final SubLSymbol $sym39$GENERATE_NAMES_FOR_TERM;
    private static final SubLSymbol $sym40$CYC_REMOVE_SUBSTRING;
    private static final SubLSymbol $sym41$CYC_POST_REMOVE;
    private static final SubLSymbol $sym42$CYC_TRIM_WHITESPACE;
    private static final SubLSymbol $sym43$CYC_STRING_SEARCH;
    private static final SubLSymbol $sym44$CYC_LENGTH;
    private static final SubLString $str45$_;
    private static final SubLSymbol $sym46$CYC_STRING_TO_INTEGER;
    private static final SubLSymbol $sym47$CYC_INTEGRAL_NUMBER_TO_INTEGER;
    private static final SubLSymbol $sym48$CYC_INTEGER_TO_STRING;
    private static final SubLSymbol $sym49$CYC_STRINGIFY_FN;
    private static final SubLSymbol $kw50$MIXEDFRACTION;
    private static final SubLSymbol $sym51$CYC_STRING_TO_REAL_NUMBER;
    private static final SubLString $str52$__0_9______0_9______0_9___;
    private static final SubLObject $const53$MixedFractionFn;
    private static final SubLSymbol $kw54$SIMPLEFRACTION;
    private static final SubLString $str55$__0_9______0_9___;
    private static final SubLObject $const56$SimpleFractionFn;
    private static final SubLSymbol $kw57$DECIMALNUMBER;
    private static final SubLString $str58$__0_9_______0_9___;
    private static final SubLObject $const59$DecimalFractionFn;
    private static final SubLSymbol $kw60$NUMBER;
    private static final SubLString $str61$__0_9___;
    private static final SubLSymbol $sym62$CYC_SYNTACTIC_DISQUOTATION;
    private static final SubLString $str63$_0_9____0_9____0_9__;
    private static final SubLString $str64$_0_9____0_9__;
    private static final SubLString $str65$_0_9_____0_9__;
    private static final SubLString $str66$_0_9__;
    private static final SubLSymbol $kw67$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym68$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym69$_EXIT;
    private static final SubLSymbol $sym70$DOUBLE_FLOAT;
    private static final SubLSymbol $sym71$CYC_REAL_NUMBER_TO_STRING;
    private static final SubLInteger $int72$1000;
    private static final SubLSymbol $sym73$CYC_STRING_TOKENIZE;
    private static final SubLSymbol $sym74$CYC_STRING_TO_NTH_CODE_POINT;
    private static final SubLSymbol $sym75$CYC_HTTP_URL_ENCODE;
    private static final SubLSymbol $sym76$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym77$CYC_XML_VALUE_STRING;
    private static final SubLSymbol $sym78$CYC_HTTP_URL_DECODE;
    private static final SubLSymbol $sym79$CYC_ACRONYM_FROM_STRING;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $kw82$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw83$ID;
    private static final SubLSymbol $kw84$CLASS;
    private static final SubLSymbol $kw85$ISMAP;
    private static final SubLSymbol $kw86$HEIGHT;
    private static final SubLSymbol $kw87$WIDTH;
    private static final SubLSymbol $kw88$ALT;
    private static final SubLSymbol $kw89$ALIGN;
    private static final SubLSymbol $kw90$BORDER;
    private static final SubLSymbol $sym91$CYC_HTML_IMAGE;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$NOWRAP;
    private static final SubLSymbol $kw95$COLSPAN;
    private static final SubLSymbol $kw96$ROWSPAN;
    private static final SubLSymbol $kw97$VALIGN;
    private static final SubLSymbol $kw98$BGCOLOR;
    private static final SubLSymbol $sym99$CYC_HTML_TABLE_DATA;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$CYC_HTML_TABLE_DATA_VARIABLE_ARITY;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$CYC_HTML_TABLE_ROW;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$CYC_HTML_TABLE_ROW_VARIABLE_ARITY;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$NOFLOW;
    private static final SubLSymbol $kw110$CELLPADDING;
    private static final SubLSymbol $kw111$CELLSPACING;
    private static final SubLSymbol $kw112$COLSPEC;
    private static final SubLSymbol $kw113$UNITS;
    private static final SubLSymbol $kw114$BACKGROUND;
    private static final SubLSymbol $sym115$CYC_HTML_TABLE;
    private static final SubLSymbol $sym116$CYC_HTML_TABLE_VARIABLE_ARITY;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLSymbol $kw119$STYLE;
    private static final SubLSymbol $kw120$ONLOAD;
    private static final SubLSymbol $sym121$CYC_HTML_DIVISION;
    private static final SubLSymbol $sym122$CYC_HTML_DIVISION_VARIABLE_ARITY;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLString $str126$_;
    private static final SubLSymbol $sym127$PARSE_HTML_ATTRIBUTE_VALUE;
    private static final SubLObject $const128$URLFn;
    private static final SubLSymbol $sym129$CYC_CONTEXTUAL_URL;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$CYC_TERM_FROM_SPARQL_URI;
    private static final SubLSymbol $sym133$OPEN_CYC_URI_FOR_TERM;
    private static final SubLSymbol $sym134$CANONICAL_URI_FOR_TERM;
    private static final SubLObject $const135$ResourceWithURIFn;
    private static final SubLSymbol $sym136$CYC_REMOVE_HTML_TAGS;
    private static final SubLSymbol $sym137$CYC_CAPITALIZE_SMART;
    private static final SubLSymbol $sym138$CYC_RECAPITALIZE_SMART;
    private static final SubLSymbol $sym139$CYC_RELATION_ARG;
    private static final SubLObject $const140$TheList;
    private static final SubLSymbol $sym141$CYC_RELATION_ARGS_LIST;
    private static final SubLObject $const142$TheSet;
    private static final SubLSymbol $sym143$CYC_RELATION_ARG_SET;
    private static final SubLSymbol $sym144$CYC_QUOTED_RELATION_EXPRESSION_ARITY;
    private static final SubLSymbol $sym145$CYC_RELATION_EXPRESSION_ARITY;
    private static final SubLSymbol $sym146$CYC_IDENTITY;
    private static final SubLSymbol $sym147$CYC_RELATION_TUPLES;
    private static final SubLObject $const148$Kappa;
    private static final SubLSymbol $sym149$CYC_SUBSTITUTE_FORMULA;
    private static final SubLSymbol $sym150$SYMMETRIC_PART_TYPE_;
    private static final SubLSymbol $sym151$LEFT_FORM_OF_SYMMETRIC_PART_TYPE;
    private static final SubLSymbol $sym152$CYC_BILATERAL_FORM_OF_SENTENCE_LEFT;
    private static final SubLObject $const153$SymmetricAnatomicalPartType;
    private static final SubLObject $const154$LeftObjectOfPairFn;
    private static final SubLSymbol $sym155$RIGHT_FORM_OF_SYMMETRIC_PART_TYPE;
    private static final SubLSymbol $sym156$CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT;
    private static final SubLObject $const157$RightObjectOfPairFn;
    private static final SubLSymbol $sym158$SIDE_FN_NAUT_P;
    private static final SubLSymbol $sym159$NAT_ARG1;
    private static final SubLSymbol $sym160$_SIDEFN;
    private static final SubLObject $const161$Quote;
    private static final SubLSymbol $sym162$CYC_SUBSTITUTE_FORMULA_ARG;
    private static final SubLSymbol $sym163$CYC_SUBSTITUTE_FORMULA_ARG_POSITION;
    private static final SubLSymbol $sym164$CYC_MAKE_FORMULA;
    private static final SubLSymbol $sym165$CYC_SUBSTITUTE_QUOTED_FORMULA;
    private static final SubLSymbol $sym166$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG;
    private static final SubLSymbol $sym167$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION;
    private static final SubLSymbol $sym168$CYC_MAKE_QUOTED_FORMULA;
    private static final SubLSymbol $sym169$CYCL_TO_EL_FN;
    private static final SubLSymbol $sym170$CYC_SUBSTITUTE_NLTE;
    private static final SubLSymbol $sym171$SEM_TRANS_TEMPLATE_DEFN;
    private static final SubLSymbol $sym172$CYC_WORD_STRINGS;
    private static final SubLString $str173$WordStringsFn;
    private static final SubLString $str174$WordSequenceFn;
    private static final SubLSymbol $sym175$CYC_STRINGS_OF_WORD_SEQUENCE;
    private static final SubLSymbol $sym176$CYC_INSTANTIATE;
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$CYC_FIND_OR_INSTANTIATE;
    private static final SubLObject $const179$isa;
    private static final SubLSymbol $sym180$_OBJ;
    private static final SubLObject $const181$TheSetOf;
    private static final SubLObject $const182$definingMt;
    private static final SubLSymbol $sym183$CYC_FIND_VIA_PRED_VALUE_OR_CREATE_VIA_TEMPLATE;
    private static final SubLSymbol $sym184$CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE;
    private static final SubLSymbol $sym185$_CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE_CACHING_STATE_;
    private static final SubLObject $const186$creationTemplateMt;
    private static final SubLSymbol $sym187$CONSTANT_P;
    private static final SubLObject $const188$creationTemplateConstantNameForma;
    private static final SubLObject $const189$creationTemplateSentenceTemplate;
    private static final SubLSymbol $kw190$TERM;
    private static final SubLSymbol $kw191$VALUE;
    private static final SubLSymbol $kw192$ACTION;
    private static final SubLObject $const193$resultIsa;
    private static final SubLSymbol $sym194$INDIVIDUAL_DENOTING_FN_;
    private static final SubLSymbol $sym195$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR;
    private static final SubLObject $const196$resultGenl;
    private static final SubLSymbol $sym197$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR;
    private static final SubLSymbol $sym198$UNARY_FUNCTION_;
    private static final SubLSymbol $sym199$SKOLEM_FUNCTION_;
    private static final SubLObject $const200$UnaryFunction;
    private static final SubLObject $const201$IndividualDenotingFunction;
    private static final SubLSymbol $sym202$CYC_EL_VARIABLE_FN;
    private static final SubLSymbol $sym203$CYC_ADD_ENGLISH_SUFFIX;
    private static final SubLSymbol $sym204$_USE_NEW_NL_GENERATION_API_FOR_GENERATE_PHRASE_FN__;
    private static final SubLSymbol $sym205$GENERATE_PHRASE_DEFN;
    private static final SubLSymbol $sym206$GENERATE_PHRASE_MEMOIZED;
    private static final SubLSymbol $kw207$DEFAULT;
    private static final SubLInteger $int208$500000;
    private static final SubLString $str209$__Got__D_scored_assertions___;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$_;
    private static final SubLString $str212$__Returning__D_assertions___;
    private static final SubLSymbol $sym213$ASSERTIONS_RELEVANT_TO_STRING_DEFN;
    private static final SubLSymbol $sym214$ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED;
    private static final SubLSymbol $sym215$BEST_STRING_OF_NL_PHRASE_DEFN;
    private static final SubLSymbol $sym216$BEST_STRING_OF_NL_PHRASE_ADDRESSING_DEFN;
    private static final SubLSymbol $sym217$BEST_STRING_OF_NL_PHRASE_WITH_FORCE_DEFN;
    private static final SubLSymbol $sym218$GENERATE_GKE_GLOSS_WRT_MT;
    private static final SubLSymbol $sym219$BASIC_DATUM_PARAPHRASE_DEFN;
    private static final SubLSymbol $kw220$IGNORE;
    private static final SubLObject $const221$nonPlural_Generic;
    private static final SubLSymbol $sym222$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list223;
    private static final SubLObject $const224$genTemplate_QuerySentence;
    private static final SubLSymbol $kw225$INTERROGATIVE;
    private static final SubLSymbol $kw226$DECLARATIVE;
    private static final SubLSymbol $kw227$NONE;
    private static final SubLSymbol $kw228$QUIET;
    private static final SubLObject $const229$genTemplate_Constrained;
    private static final SubLString $str230$Formula_does_not_meet_this_assert;
    private static final SubLSymbol $sym231$CSETQ;
    private static final SubLSymbol $sym232$PARAPHRASE_OF_FORMULA_FROM_TEMPLATE_DEFN;
    private static final SubLObject $const233$geopoliticalSubdivision;
    private static final SubLObject $const234$State_UnitedStates;
    private static final SubLObject $const235$CanadianProvince;
    private static final SubLSymbol $sym236$STATE_OR_PROVINCE_FOR_CITY_DEFN;
    private static final SubLSymbol $sym237$CYC_HTML_URL_ENCODE;
    private static final SubLInteger $int238$255;
    private static final SubLSymbol $sym239$CHAR_CODE;
    private static final SubLString $str240$charset_utf_8;
    private static final SubLSymbol $sym241$CYC_URL_SOURCE;
    private static final SubLInteger $int242$80;
    private static final SubLSymbol $kw243$PRIVATE;
    private static final SubLSymbol $kw244$MACHINE;
    private static final SubLSymbol $kw245$PORT;
    private static final SubLSymbol $kw246$METHOD;
    private static final SubLSymbol $kw247$GET;
    private static final SubLSymbol $kw248$URL;
    private static final SubLString $str249$simple_http_get;
    private static final SubLSymbol $kw250$QUERY;
    private static final SubLSymbol $kw251$KEEP_ALIVE_;
    private static final SubLSymbol $kw252$WIDE_NEWLINES_;
    private static final SubLSymbol $kw253$ACCEPT_TYPES;
    private static final SubLSymbol $kw254$CONTENT_TYPE;
    private static final SubLSymbol $kw255$SOAP_ACTION_URI;
    private static final SubLSymbol $sym256$CYC_GET_FROM_HTTP_SOURCE;
    private static final SubLString $str257$_;
    private static final SubLString $str258$_;
    private static final SubLObject $const259$SchemaObjectFn;
    private static final SubLString $str260$_;
    private static final SubLString $str261$_;
    private static final SubLSymbol $sym262$CYC_TERM_URI_FN;
    private static final SubLObject $const263$City;
    private static final SubLObject $const264$CityNamedFn;
    private static final SubLSymbol $sym265$CITY_NAMED_FN_DEFN;
    private static final SubLList $list266;
    private static final SubLSymbol $kw267$OUTPUT_SPEC;
    private static final SubLSymbol $sym268$TEXT_TOPIC_STRUCTURE;
    private static final SubLSymbol $sym269$EL_LIST_TO_SUBL_LIST;
    private static final SubLSymbol $kw270$BASE_SET;
    private static final SubLObject $const271$baseSet;
    private static final SubLList $list272;
    private static final SubLSymbol $kw273$ORDERING_RELATION;
    private static final SubLObject $const274$orderingRelation;
    private static final SubLList $list275;
    private static final SubLSymbol $sym276$CYC_ORDERING_RESULT;
    private static final SubLSymbol $kw277$ELEMENT;
    private static final SubLObject $const278$elementOf;
    private static final SubLSymbol $sym279$ORDERING__;
    private static final SubLSymbol $sym280$CYC_TIME_OF_DAY_OF_DATE;
    private static final SubLSymbol $sym281$CYC_SECONDS_SINCE_1970_TO_DATE;
    private static final SubLSymbol $sym282$CYC_DATE_TO_SECONDS_SINCE_1970;
    private static final SubLSymbol $sym283$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL;
    private static final SubLSymbol $sym284$ASSERTION_GENERATING_TOOL_P;
    private static final SubLSymbol $sym285$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym286$NON_DOTTED_LIST_P;
    private static final SubLSymbol $kw287$GAF;
    private static final SubLObject $const288$genls;
    private static final SubLObject $const289$assertedUsingTool;
    private static final SubLSymbol $sym290$_;
    private static final SubLSymbol $sym291$CAR;
    private static final SubLObject $const292$AssertionGeneratingRKFTool;
    private static final SubLString $str293$_TEXT_;
    private static final SubLString $str294$__TEXT_;
    private static final SubLString $str295$_b_;
    private static final SubLString $str296$__b_;
    private static final SubLSymbol $sym297$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS_COUNT_BOLD_TAGS;
    private static final SubLString $str298$_____;
    private static final SubLSymbol $sym299$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS;
    private static final SubLSymbol $sym300$FORMAT;
    private static final SubLSymbol $sym301$CYC_FORMAT;
    private static final SubLString $str302$term____isg_table_lock;
    private static final SubLSymbol $sym303$_TERM_TO_ISG_TABLE_;
    private static final SubLSymbol $sym304$CYC_NEXT_INTEGER_IN_SEQUENCE;
    private static final SubLString $str305$term____isg_w__start_table_lock;
    private static final SubLSymbol $sym306$_TERM_TO_ISG_W_START_TABLE_;
    private static final SubLSymbol $sym307$CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT;
    private static final SubLObject $const308$LinkParser;
    private static final SubLObject $const309$CharniakParser;
    private static final SubLSymbol $kw310$PARSER;
    private static final SubLSymbol $sym311$CYC_CYCLIFY;
    private static final SubLSymbol $sym312$CYCL_STRING_P;
    private static final SubLSymbol $sym313$CYC_CONCATENATE_STRINGS;
    private static final SubLSymbol $sym314$CYC_CONCATENATE_LIST_OF_STRINGS;
    private static final SubLSymbol $sym315$CYC_TERM_SIMILARITY_METRIC;
    private static final SubLObject $const316$WordNet2_0_KS;
    private static final SubLSymbol $kw317$WN_SKS_REGISTERED;
    private static final SubLSymbol $sym318$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS;
    private static final SubLSymbol $sym319$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS;
    private static final SubLSymbol $sym320$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS;
    private static final SubLSymbol $sym321$MAKE_EL_SET;
    private static final SubLSymbol $kw322$STRONG;
    private static final SubLSymbol $kw323$COLLECTIONS;
    private static final SubLSymbol $sym324$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS;
    private static final SubLSymbol $sym325$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS;
    private static final SubLSymbol $sym326$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS;
    private static final SubLSymbol $sym327$CYC_KB_ORTHOGONAL;
    private static final SubLSymbol $sym328$CYC_CONTENT_OF_FILE;
    private static final SubLSymbol $sym329$CYC_TRANSFORM_RELATION_TUPLES;
    private static final SubLString $str330$_a_doesn_t_start_with___TheList;
    private static final SubLObject $const331$quotedIsa;
    private static final SubLSymbol $sym332$CYC_PROVABLE_VIA_DEFNS;
    private static final SubLSymbol $sym333$CURRENT_INFERENCE_ANSWER_JUSTIFICATION_PROOF_VIEW;
    private static final SubLSymbol $sym334$CYC_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym335$CYC_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLObject $const336$KAObjectInteractionFn;
    private static final SubLSymbol $sym337$CYC_DECODE_KA_INTERACTION;
    private static final SubLObject $const338$TheEmptyList;
    private static final SubLSymbol $sym339$CYC_MOST_RECENTLY_STARTED_EVENTS_BY_AGENT_RELATIVE_TO_INTERACTION;
    private static final SubLObject $const340$laterOrSameInteractionHistoryMt;
    private static final SubLObject $const341$laterInteractionHistoryMt;
    private static final SubLObject $const342$laterInteractionHistoryMt_Direct;
    private static final SubLObject $const343$laterInteractionHistoryMtForSimul;
    private static final SubLString $str344$More_than_one_recently_started_ev;
    private static final SubLObject $const345$executionOfPlannedEventBeginsInCo;
    private static final SubLObject $const346$performedByInBELLAUI;
    private static final SubLObject $const347$executionOfPlannedEvent;
    private static final SubLObject $const348$finishedEvent;
    private static final SubLObject $const349$mistakenEvent;
    private static final SubLSymbol $sym350$CYC_MOST_RECENTLY_STARTED_UNFINISH_EVENTS_BY_AGENT_RELATIVE_TO_IN;
    private static final SubLSymbol $sym351$CYC_EVENT_TO_PLAN_FOR_BY_AGENT_IN_INTERACTION_CONTEXT_FN;
    private static final SubLSymbol $sym352$GAF_ARG3;
    private static final SubLObject $const353$agentShouldAttemptToFindModelForE;
    private static final SubLString $str354$More_that_one_event_found_for__Ev;
    private static final SubLSymbol $sym355$CYC_PLAN_AGENT_SHOULD_EXECUTE_IN_INTERACTION_CONTEXT_FN;
    private static final SubLObject $const356$interactionContextAbandonedAtDate;
    private static final SubLSymbol $sym357$RELEVANT_MT_IS_EQ;
    private static final SubLObject $const358$eventModeledByPlannedByAtDate;
    private static final SubLObject $const359$startedInMt;
    private static final SubLObject $const360$finishedInMt;
    private static final SubLObject $const361$mistakenInMt;
    private static final SubLObject $const362$agentAgenda;
    private static final SubLString $str363$More_than_one_agenda_found_for__H;
    private static final SubLObject $const364$agendaHasTaskWithPriority;
    private static final SubLSymbol $sym365$MAX;
    private static final SubLString $str366$More_than_one_priority_found_for_;
    private static final SubLSymbol $sym367$CYC_AGENT_CANNOT_PROGRESS_IN_INTERACTION_CONTEXT_FN;
    private static final SubLObject $const368$False;
    private static final SubLObject $const369$True;
    private static final SubLSymbol $sym370$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_FOR_AGENT_IN_INTERACTION_CONT;
    private static final SubLSymbol $sym371$GAF_ARG2;
    private static final SubLObject $const372$agentToDoMtAndHistoryCoincideAtDa;
    private static final SubLString $str373$More_than_one_todo_mt_found_for__;
    private static final SubLSymbol $sym374$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_IN_TO_DO_MT_FN;
    private static final SubLList $list375;
    private static final SubLSymbol $sym376$SECOND;
    private static final SubLObject $const377$Microtheory;
    private static final SubLSymbol $sym378$CYC_LIKELIHOOD_OF_TRUTH_OF_SENTENCE;
    private static final SubLSymbol $sym379$FORMULA_ARG0;
    private static final SubLSymbol $sym380$CYC_TIME_INTERVALS_FOR_SENTENCE;
    private static final SubLString $str381$math_expression_evaluate_error___;
    private static final SubLSymbol $sym382$CYC_EVALUATE_MATH_EXPRESSION;
    private static final SubLString $str383$math_expression_flatten_error___A;
    private static final SubLSymbol $sym384$CYC_FLATTEN_MATH_EXPRESSION;
    private static final SubLSymbol $sym385$CYC_APPLY_OPERATION_TO_MATH_STATEMENT;
    private static final SubLSymbol $sym386$CYC_SERIALIZE_MATHML;
    private static final SubLSymbol $sym387$EXTENSIONAL_SET_ELEMENTS;
    private static final SubLSymbol $sym388$MAKE_EL_LIST;
    private static final SubLSymbol $sym389$CYC_CARTESIAN_PRODUCT;
    private static final SubLSymbol $sym390$CYC_FILTER_LIST;
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 1451L)
    public static SubLObject evaluatable_predicate_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)evaluation_defns.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)evaluation_defns.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(evaluation_defns.$const2$EverythingPSC, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances(evaluation_defns.$const4$EvaluatablePredicate, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
            SubLObject pred = (SubLObject)evaluation_defns.NIL;
            pred = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_any_mt(pred, evaluation_defns.$const3$evaluationDefn, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
                if (defn.isSymbol() && evaluation_defns.NIL != Symbols.fboundp(defn)) {
                    count = Numbers.add(count, (SubLObject)evaluation_defns.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 1947L)
    public static SubLObject cyc_true_subl(final SubLObject form) {
        return list_utilities.sublisp_boolean(cyc_evaluate_subl(form));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 2116L)
    public static SubLObject cyc_different(final SubLObject args) {
        final SubLObject result = equals.differentP(args, (SubLObject)evaluation_defns.$kw6$UNKNOWN);
        if (result == evaluation_defns.$kw6$UNKNOWN) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 2371L)
    public static SubLObject cyc_different_symbols(final SubLObject args) {
        return (SubLObject)SubLObjectFactory.makeBoolean(evaluation_defns.NIL == list_utilities.duplicatesP(args, Symbols.symbol_function((SubLObject)evaluation_defns.EQUAL), (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 2579L)
    public static SubLObject cyc_string_precedes(final SubLObject earlier_string, final SubLObject later_string) {
        return cyc_string_precedes_internal(earlier_string, later_string, (SubLObject)evaluation_defns.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 2885L)
    public static SubLObject cyc_string_precedes_case_insensitive(final SubLObject earlier_string, final SubLObject later_string) {
        return cyc_string_precedes_internal(earlier_string, later_string, (SubLObject)evaluation_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 3107L)
    public static SubLObject cyc_string_precedes_internal(final SubLObject earlier_string, final SubLObject later_string, final SubLObject case_sensitiveP) {
        if (!earlier_string.isString() || !later_string.isString()) {
            relation_evaluation.throw_unevaluatable();
            return (SubLObject)evaluation_defns.NIL;
        }
        if (evaluation_defns.NIL != case_sensitiveP) {
            return list_utilities.sublisp_boolean(Strings.stringL(earlier_string, later_string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
        }
        return list_utilities.sublisp_boolean(Strings.string_lessp(earlier_string, later_string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 3758L)
    public static SubLObject cyc_substring_predicate(final SubLObject substring, final SubLObject string) {
        return cyc_substring_predicate_internal(substring, string, Symbols.symbol_function((SubLObject)evaluation_defns.$sym11$CHAR_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 4041L)
    public static SubLObject cyc_substring_case_insensitive_predicate(final SubLObject substring, final SubLObject string) {
        return cyc_substring_predicate_internal(substring, string, Symbols.symbol_function((SubLObject)evaluation_defns.$sym13$CHAR_EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 4253L)
    public static SubLObject cyc_substring_predicate_internal(final SubLObject substring, final SubLObject string, final SubLObject test) {
        if (substring.isString() && string.isString()) {
            return list_utilities.sublisp_boolean(Sequences.search(substring, string, test, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
        }
        if (evaluation_defns.NIL != unicode_nauts.string_or_unicode_naut_p(substring) && evaluation_defns.NIL != unicode_nauts.string_or_unicode_naut_p(string)) {
            final SubLObject case_sensitiveP = Equality.eql(test, Symbols.symbol_function((SubLObject)evaluation_defns.$sym11$CHAR_));
            return unicode_nauts.unicode_substringP(substring, string, case_sensitiveP);
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 4686L)
    public static SubLObject cyc_prefix_substring(final SubLObject prefix, final SubLObject string) {
        if (!string.isString() || !prefix.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.starts_with(string, prefix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 4974L)
    public static SubLObject cyc_suffix_substring(final SubLObject suffix, final SubLObject string) {
        if (!suffix.isString() || !string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.ends_with(string, suffix, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 5260L)
    public static SubLObject cyc_subword_predicate(final SubLObject subword, final SubLObject string) {
        if (!subword.isString() || !string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return list_utilities.sublisp_boolean(string_utilities.subwordP(subword, string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 5577L)
    public static SubLObject cyc_find_constant(final SubLObject nat) {
        final SubLObject constant_name = cycl_utilities.nat_arg1(nat, (SubLObject)evaluation_defns.UNPROVIDED);
        if (constant_name.isString()) {
            final SubLObject constant = constants_high.find_constant(constant_name);
            if (evaluation_defns.NIL != constant) {
                return constant;
            }
            Errors.error((SubLObject)evaluation_defns.$str18$Could_not_find_constant__A_, constant_name);
        }
        Errors.error((SubLObject)evaluation_defns.$str19$Arg1_of___FindConstantFn_must_be_, constant_name);
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 6049L)
    public static SubLObject evaluatable_function_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)evaluation_defns.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)evaluation_defns.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(evaluation_defns.$const2$EverythingPSC, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances(evaluation_defns.$const21$EvaluatableFunction, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
            SubLObject pred = (SubLObject)evaluation_defns.NIL;
            pred = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_any_mt(pred, evaluation_defns.$const3$evaluationDefn, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
                if (defn.isSymbol() && evaluation_defns.NIL != Symbols.fboundp(defn)) {
                    count = Numbers.add(count, (SubLObject)evaluation_defns.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 6542L)
    public static SubLObject cyc_evaluate_subl(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = removal_modules_perform_subl.evaluate_subl_expression(form);
        final SubLObject successfulP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (evaluation_defns.NIL == successfulP) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 6851L)
    public static SubLObject cyc_string_upcase(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Strings.string_upcase(string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 7210L)
    public static SubLObject string_upcase_defn(final SubLObject string) {
        return cyc_string_upcase(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 7350L)
    public static SubLObject cyc_string_downcase(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Strings.string_downcase(string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 7605L)
    public static SubLObject cyc_substring(final SubLObject string, final SubLObject start, final SubLObject end) {
        if (evaluation_defns.NIL == unicode_nauts.string_or_unicode_naut_p(string)) {
            relation_evaluation.throw_unevaluatable();
        }
        else if (end.numG(cyc_length(string)) || start.numL((SubLObject)evaluation_defns.ZERO_INTEGER) || start.numG(end)) {
            relation_evaluation.throw_unevaluatable();
        }
        else {
            if (string.isString()) {
                return string_utilities.substring(string, start, end);
            }
            if (evaluation_defns.NIL != unicode_nauts.unicode_naut_p(string, (SubLObject)evaluation_defns.UNPROVIDED)) {
                return unicode_nauts.unicode_substring(string, start, end);
            }
            relation_evaluation.throw_unevaluatable();
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 8081L)
    public static SubLObject cyc_string_concat(final SubLObject strings) {
        if (evaluation_defns.NIL == strings || evaluation_defns.NIL != list_utilities.find_if_not(Symbols.symbol_function((SubLObject)evaluation_defns.$sym28$STRINGP), strings, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)evaluation_defns.$sym29$CCONCATENATE), strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 8385L)
    public static SubLObject cyc_strings_to_phrase(final SubLObject strings) {
        if (evaluation_defns.NIL == el_utilities.el_non_empty_list_p(strings)) {
            relation_evaluation.throw_unevaluatable();
        }
        else if (evaluation_defns.NIL != list_utilities.find_if_not(Symbols.symbol_function((SubLObject)evaluation_defns.$sym28$STRINGP), el_utilities.el_list_items(strings), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        else {
            if (evaluation_defns.NIL == strings) {
                return (SubLObject)evaluation_defns.$str31$;
            }
            SubLObject result = (SubLObject)evaluation_defns.$str31$;
            SubLObject cdolist_list_var = conses_high.butlast(el_utilities.el_list_items(strings), (SubLObject)evaluation_defns.UNPROVIDED);
            SubLObject string = (SubLObject)evaluation_defns.NIL;
            string = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                result = Sequences.cconcatenate(result, new SubLObject[] { string, evaluation_defns.$str32$_ });
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            }
            return Sequences.cconcatenate(result, conses_high.last(strings, (SubLObject)evaluation_defns.UNPROVIDED).first());
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 9043L)
    public static SubLObject cyc_pre_remove(final SubLObject string1, final SubLObject string2) {
        if (!string1.isString() || !string2.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.pre_remove(string1, string2, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 9312L)
    public static SubLObject cyc_replace_substring(final SubLObject string, final SubLObject substring, final SubLObject newstring) {
        if (string.isString() && evaluation_defns.NIL != string_utilities.non_empty_string_p(substring) && newstring.isString()) {
            return string_utilities.string_substitute(newstring, substring, string, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        if (evaluation_defns.NIL != unicode_naut_or_ascii_string_p(string) && (evaluation_defns.NIL != string_utilities.non_empty_string_p(substring) || (evaluation_defns.NIL != unicode_nauts.unicode_naut_p(substring, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL != string_utilities.non_empty_string_p(cycl_utilities.nat_arg1(substring, (SubLObject)evaluation_defns.UNPROVIDED)))) && evaluation_defns.NIL != unicode_naut_or_ascii_string_p(newstring)) {
            final SubLObject new_unicode_vector = vector_utilities.vector_nreplace_subsequence(cycl_string.cycl_string_to_unicode_vector(newstring), cycl_string.cycl_string_to_unicode_vector(substring), cycl_string.cycl_string_to_unicode_vector(string), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
            return (evaluation_defns.NIL != Sequences.find((SubLObject)evaluation_defns.$int35$128, new_unicode_vector, Symbols.symbol_function((SubLObject)evaluation_defns.$sym36$__), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) ? unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(new_unicode_vector)) : unicode_strings.unicode_vector_to_display(new_unicode_vector);
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 10319L)
    public static SubLObject unicode_naut_or_ascii_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(evaluation_defns.NIL != unicode_strings.ascii_string_p(v_object) || evaluation_defns.NIL != unicode_nauts.unicode_naut_p(v_object, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 10444L)
    public static SubLObject cyc_unique_ws(final SubLObject wu, final SubLObject pos, final SubLObject denot) {
        if (evaluation_defns.NIL == forts.fort_p(wu) || evaluation_defns.NIL == forts.fort_p(pos) || evaluation_defns.NIL == forts.fort_p(denot)) {
            relation_evaluation.throw_unevaluatable();
        }
        return lexicon_utilities.unique_ws(wu, pos, denot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 10731L)
    public static SubLObject generate_names_for_term(final SubLObject v_term) {
        if (evaluation_defns.NIL == forts.fort_p(v_term) && evaluation_defns.NIL == misc_kb_utilities.instance_named_fn_expression_p(v_term)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.make_el_list(pph_methods_lexicon.names_for_term(v_term, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 11048L)
    public static SubLObject cyc_remove_substring(final SubLObject string1, final SubLObject string2) {
        if (!string1.isString() || !string2.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.remove_substring(string1, string2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 11341L)
    public static SubLObject cyc_post_remove(final SubLObject string1, final SubLObject string2) {
        if (!string1.isString() || !string2.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.post_remove(string1, string2, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 11615L)
    public static SubLObject cyc_trim_whitespace(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.trim_whitespace(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 11862L)
    public static SubLObject cyc_string_search(final SubLObject string1, final SubLObject string2) {
        if (!string1.isString() || !string2.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Sequences.search(string1, string2, Symbols.symbol_function((SubLObject)evaluation_defns.EQUALP), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 12133L)
    public static SubLObject cyc_length(final SubLObject sequence) {
        if (sequence.isString()) {
            return Sequences.length(sequence);
        }
        if (evaluation_defns.NIL != unicode_nauts.unicode_naut_p(sequence, (SubLObject)evaluation_defns.UNPROVIDED)) {
            return Sequences.length(unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(sequence, (SubLObject)evaluation_defns.UNPROVIDED)));
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 12459L)
    public static SubLObject cyc_string_to_integer(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = reader.read_from_string_ignoring_errors(string_utilities.remove_substring(string, (SubLObject)evaluation_defns.$str45$_), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (result.isInteger()) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 12817L)
    public static SubLObject cyc_integral_number_to_integer(final SubLObject extended_number) {
        if (evaluation_defns.NIL == extended_numbers.extended_number_integer_p(extended_number)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = extended_numbers.extended_number_to_subl_real(extended_number);
        if (result.isInteger()) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 13216L)
    public static SubLObject cyc_integer_to_string(final SubLObject integer) {
        if (!integer.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return print_high.princ_to_string(integer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 13457L)
    public static SubLObject cyc_stringify_fn(final SubLObject v_object) {
        return print_high.princ_to_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 13616L)
    public static SubLObject cyc_syntactic_disquotation(final SubLObject string) {
        final SubLObject pcase_var = identify_pattern(string);
        if (pcase_var.eql((SubLObject)evaluation_defns.$kw50$MIXEDFRACTION)) {
            final SubLObject v_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym51$CYC_STRING_TO_REAL_NUMBER), regular_expression_utilities.regexp_capturing_match((SubLObject)evaluation_defns.$str52$__0_9______0_9______0_9___, string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED).rest());
            if (v_bindings.first().isInteger() && conses_high.second(v_bindings).isInteger() && conses_high.third(v_bindings).isInteger() && conses_high.third(v_bindings).numGE(conses_high.second(v_bindings))) {
                return el_utilities.make_el_formula(evaluation_defns.$const53$MixedFractionFn, v_bindings, (SubLObject)evaluation_defns.UNPROVIDED);
            }
            relation_evaluation.throw_unevaluatable();
        }
        else if (pcase_var.eql((SubLObject)evaluation_defns.$kw54$SIMPLEFRACTION)) {
            final SubLObject v_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym51$CYC_STRING_TO_REAL_NUMBER), regular_expression_utilities.regexp_capturing_match((SubLObject)evaluation_defns.$str55$__0_9______0_9___, string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED).rest());
            if (v_bindings.first().isInteger() && evaluation_defns.NIL != subl_promotions.non_zero_integer_p(conses_high.second(v_bindings))) {
                return el_utilities.make_el_formula(evaluation_defns.$const56$SimpleFractionFn, v_bindings, (SubLObject)evaluation_defns.UNPROVIDED);
            }
            relation_evaluation.throw_unevaluatable();
        }
        else if (pcase_var.eql((SubLObject)evaluation_defns.$kw57$DECIMALNUMBER)) {
            final SubLObject v_bindings = regular_expression_utilities.regexp_capturing_match((SubLObject)evaluation_defns.$str58$__0_9_______0_9___, string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED).rest();
            final SubLObject decimal_place = Sequences.length(conses_high.second(v_bindings));
            final SubLObject number_no_dot = cyc_string_to_real_number(Sequences.cconcatenate(v_bindings.first(), conses_high.second(v_bindings)));
            if (number_no_dot.isInteger()) {
                return el_utilities.make_el_formula(evaluation_defns.$const59$DecimalFractionFn, (SubLObject)ConsesLow.list(number_no_dot, decimal_place), (SubLObject)evaluation_defns.UNPROVIDED);
            }
            relation_evaluation.throw_unevaluatable();
        }
        else if (pcase_var.eql((SubLObject)evaluation_defns.$kw60$NUMBER)) {
            final SubLObject v_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym51$CYC_STRING_TO_REAL_NUMBER), regular_expression_utilities.regexp_capturing_match((SubLObject)evaluation_defns.$str61$__0_9___, string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED).rest());
            if (v_bindings.first().isInteger()) {
                return v_bindings.first();
            }
            relation_evaluation.throw_unevaluatable();
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 15491L)
    public static SubLObject identify_pattern(final SubLObject string) {
        if (evaluation_defns.NIL != regular_expression_utilities.regex_match_compile_pattern((SubLObject)evaluation_defns.$str63$_0_9____0_9____0_9__, string)) {
            return (SubLObject)evaluation_defns.$kw50$MIXEDFRACTION;
        }
        if (evaluation_defns.NIL != regular_expression_utilities.regex_match_compile_pattern((SubLObject)evaluation_defns.$str64$_0_9____0_9__, string)) {
            return (SubLObject)evaluation_defns.$kw54$SIMPLEFRACTION;
        }
        if (evaluation_defns.NIL != regular_expression_utilities.regex_match_compile_pattern((SubLObject)evaluation_defns.$str65$_0_9_____0_9__, string)) {
            return (SubLObject)evaluation_defns.$kw57$DECIMALNUMBER;
        }
        if (evaluation_defns.NIL != regular_expression_utilities.regex_match_compile_pattern((SubLObject)evaluation_defns.$str66$_0_9__, string)) {
            return (SubLObject)evaluation_defns.$kw60$NUMBER;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 16382L)
    public static SubLObject cyc_string_to_real_number(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = reader.read_from_string_ignoring_errors(string_utilities.remove_substring(string, (SubLObject)evaluation_defns.$str45$_), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL != collection_defns.cyc_real_number(result)) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 16758L)
    public static SubLObject cyc_real_number_to_string(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == collection_defns.cyc_real_number(number)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (evaluation_defns.NIL != scientific_numbers.scientific_number_p(number)) {
                        return scientific_numbers.scientific_number_to_string(number, (SubLObject)evaluation_defns.UNPROVIDED);
                    }
                    if (number.isNumber()) {
                        final SubLObject _prev_bind_0_$1 = reader.$read_default_float_format$.currentBinding(thread);
                        try {
                            reader.$read_default_float_format$.bind((SubLObject)evaluation_defns.$sym70$DOUBLE_FLOAT, thread);
                            return print_high.princ_to_string(number);
                        }
                        finally {
                            reader.$read_default_float_format$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 17491L)
    public static SubLObject max_supported_formula_arity() {
        return evaluation_defns.$max_supported_formula_arity$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 17579L)
    public static SubLObject cyc_string_tokenize(final SubLObject big_string, final SubLObject separator_strings) {
        if (evaluation_defns.NIL == unicode_nauts.string_or_unicode_naut_p(big_string) || evaluation_defns.NIL == el_utilities.el_list_p(separator_strings)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject cyc_strings = cycl_string.cycl_string_tokenize(big_string, el_utilities.el_list_items(separator_strings));
        if (evaluation_defns.NIL != list_utilities.lengthG(cyc_strings, max_supported_formula_arity(), (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.make_el_list(cyc_strings, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 18038L)
    public static SubLObject cyc_string_to_nth_code_point(final SubLObject str, final SubLObject n) {
        if (evaluation_defns.NIL == cycl_string.cycl_string_p(str) || evaluation_defns.NIL == subl_promotions.non_negative_integer_p(n)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject unicode_vector = cycl_string.cycl_string_to_unicode_vector(str);
        return Vectors.aref(unicode_vector, n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 18409L)
    public static SubLObject cyc_http_url_encode(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_encode(string, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 18667L)
    public static SubLObject cyc_xml_value_string(final SubLObject url, final SubLObject field_name, final SubLObject staleness_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject seconds = (SubLObject)evaluation_defns.NIL;
                    seconds = date_utilities.convert_time_quant_to_seconds(staleness_cutoff);
                    thread.resetMultipleValues();
                    final SubLObject machine = web_utilities.parse_http_url(url_string(url));
                    final SubLObject port = thread.secondMultipleValue();
                    final SubLObject url_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject value = xml_retrieval.get_xml_field_value(machine, url_string, field_name, seconds, port, (SubLObject)evaluation_defns.UNPROVIDED);
                    if (value.isString()) {
                        return value;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 19433L)
    public static SubLObject cyc_http_url_decode(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_decode(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 19691L)
    public static SubLObject cyc_acronym_from_string(final SubLObject string) {
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 19894L)
    public static SubLObject cyc_html_image(final SubLObject src, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!src.isString() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_image_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$2 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list80);
                        current_$2 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list80);
                        if (evaluation_defns.NIL == conses_high.member(current_$2, (SubLObject)evaluation_defns.$list81, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$2 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluation_defns.$list80);
                    }
                    final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw83$ID, current);
                    final SubLObject id = (SubLObject)((evaluation_defns.NIL != id_tail) ? conses_high.cadr(id_tail) : evaluation_defns.NIL);
                    final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw84$CLASS, current);
                    final SubLObject v_class = (SubLObject)((evaluation_defns.NIL != class_tail) ? conses_high.cadr(class_tail) : evaluation_defns.NIL);
                    final SubLObject ismap_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw85$ISMAP, current);
                    final SubLObject ismap = (SubLObject)((evaluation_defns.NIL != ismap_tail) ? conses_high.cadr(ismap_tail) : evaluation_defns.NIL);
                    final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw86$HEIGHT, current);
                    final SubLObject height = (SubLObject)((evaluation_defns.NIL != height_tail) ? conses_high.cadr(height_tail) : evaluation_defns.NIL);
                    final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw87$WIDTH, current);
                    final SubLObject width = (SubLObject)((evaluation_defns.NIL != width_tail) ? conses_high.cadr(width_tail) : evaluation_defns.NIL);
                    final SubLObject alt_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw88$ALT, current);
                    final SubLObject alt = (SubLObject)((evaluation_defns.NIL != alt_tail) ? conses_high.cadr(alt_tail) : evaluation_defns.NIL);
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw90$BORDER, current);
                    final SubLObject border = (SubLObject)((evaluation_defns.NIL != border_tail) ? conses_high.cadr(border_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            html_utilities.html_markup(src);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            if (evaluation_defns.NIL != id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(id);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != v_class) {
                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(v_class);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != ismap) {
                                html_utilities.html_simple_attribute(html_macros.$html_image_ismap$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != height) {
                                html_utilities.html_markup(html_macros.$html_image_height$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != width) {
                                html_utilities.html_markup(html_macros.$html_image_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != alt) {
                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(alt);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != border) {
                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(border);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 20674L)
    public static SubLObject html_image_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = el_utilities.el_list_items(options);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = conses_high.putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 20907L)
    public static SubLObject cyc_html_table_data(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!content.isString() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_table_data_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$6 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list92);
                        current_$6 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list92);
                        if (evaluation_defns.NIL == conses_high.member(current_$6, (SubLObject)evaluation_defns.$list93, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$6 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluation_defns.$list92);
                    }
                    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw94$NOWRAP, current);
                    final SubLObject nowrap = (SubLObject)((evaluation_defns.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : evaluation_defns.NIL);
                    final SubLObject colspan_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw95$COLSPAN, current);
                    final SubLObject colspan = (SubLObject)((evaluation_defns.NIL != colspan_tail) ? conses_high.cadr(colspan_tail) : evaluation_defns.NIL);
                    final SubLObject rowspan_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw96$ROWSPAN, current);
                    final SubLObject rowspan = (SubLObject)((evaluation_defns.NIL != rowspan_tail) ? conses_high.cadr(rowspan_tail) : evaluation_defns.NIL);
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw97$VALIGN, current);
                    final SubLObject valign = (SubLObject)((evaluation_defns.NIL != valign_tail) ? conses_high.cadr(valign_tail) : evaluation_defns.NIL);
                    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw98$BGCOLOR, current);
                    final SubLObject bgcolor = (SubLObject)((evaluation_defns.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : evaluation_defns.NIL);
                    final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw87$WIDTH, current);
                    final SubLObject width = (SubLObject)((evaluation_defns.NIL != width_tail) ? conses_high.cadr(width_tail) : evaluation_defns.NIL);
                    final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw86$HEIGHT, current);
                    final SubLObject height = (SubLObject)((evaluation_defns.NIL != height_tail) ? conses_high.cadr(height_tail) : evaluation_defns.NIL);
                    final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw83$ID, current);
                    final SubLObject id = (SubLObject)((evaluation_defns.NIL != id_tail) ? conses_high.cadr(id_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (evaluation_defns.NIL != id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(id);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != nowrap) {
                                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != colspan) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(colspan);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != rowspan) {
                                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(rowspan);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != width) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != height) {
                                html_utilities.html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                html_utilities.html_princ(content);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 21821L)
    public static SubLObject cyc_html_table_data_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = (SubLObject)evaluation_defns.NIL;
        SubLObject content = (SubLObject)evaluation_defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)evaluation_defns.$list100);
        options = args.first();
        final SubLObject current = content = args.rest();
        if (!content.isCons() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$11;
                    final SubLObject datum_$10 = current_$11 = html_table_data_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current_$11;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$12 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$10, (SubLObject)evaluation_defns.$list92);
                        current_$12 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$10, (SubLObject)evaluation_defns.$list92);
                        if (evaluation_defns.NIL == conses_high.member(current_$12, (SubLObject)evaluation_defns.$list93, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$12 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$10, (SubLObject)evaluation_defns.$list92);
                    }
                    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw94$NOWRAP, current_$11);
                    final SubLObject nowrap = (SubLObject)((evaluation_defns.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : evaluation_defns.NIL);
                    final SubLObject colspan_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw95$COLSPAN, current_$11);
                    final SubLObject colspan = (SubLObject)((evaluation_defns.NIL != colspan_tail) ? conses_high.cadr(colspan_tail) : evaluation_defns.NIL);
                    final SubLObject rowspan_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw96$ROWSPAN, current_$11);
                    final SubLObject rowspan = (SubLObject)((evaluation_defns.NIL != rowspan_tail) ? conses_high.cadr(rowspan_tail) : evaluation_defns.NIL);
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current_$11);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw97$VALIGN, current_$11);
                    final SubLObject valign = (SubLObject)((evaluation_defns.NIL != valign_tail) ? conses_high.cadr(valign_tail) : evaluation_defns.NIL);
                    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw98$BGCOLOR, current_$11);
                    final SubLObject bgcolor = (SubLObject)((evaluation_defns.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : evaluation_defns.NIL);
                    final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw87$WIDTH, current_$11);
                    final SubLObject width = (SubLObject)((evaluation_defns.NIL != width_tail) ? conses_high.cadr(width_tail) : evaluation_defns.NIL);
                    final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw86$HEIGHT, current_$11);
                    final SubLObject height = (SubLObject)((evaluation_defns.NIL != height_tail) ? conses_high.cadr(height_tail) : evaluation_defns.NIL);
                    final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw83$ID, current_$11);
                    final SubLObject id = (SubLObject)((evaluation_defns.NIL != id_tail) ? conses_high.cadr(id_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (evaluation_defns.NIL != id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(id);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != nowrap) {
                                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != colspan) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(colspan);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != rowspan) {
                                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(rowspan);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != width) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != height) {
                                html_utilities.html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                SubLObject cdolist_list_var = content;
                                SubLObject item = (SubLObject)evaluation_defns.NIL;
                                item = cdolist_list_var.first();
                                while (evaluation_defns.NIL != cdolist_list_var) {
                                    html_utilities.html_princ(item);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    item = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 22761L)
    public static SubLObject html_table_data_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = el_utilities.el_list_items(options);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = conses_high.putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 22999L)
    public static SubLObject cyc_html_table_row(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!content.isString() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_table_row_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$16 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list102);
                        current_$16 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list102);
                        if (evaluation_defns.NIL == conses_high.member(current_$16, (SubLObject)evaluation_defns.$list103, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$16 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluation_defns.$list102);
                    }
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw97$VALIGN, current);
                    final SubLObject valign = (SubLObject)((evaluation_defns.NIL != valign_tail) ? conses_high.cadr(valign_tail) : evaluation_defns.NIL);
                    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw98$BGCOLOR, current);
                    final SubLObject bgcolor = (SubLObject)((evaluation_defns.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : evaluation_defns.NIL);
                    final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw86$HEIGHT, current);
                    final SubLObject height = (SubLObject)((evaluation_defns.NIL != height_tail) ? conses_high.cadr(height_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(align);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != height) {
                                html_utilities.html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                html_utilities.html_princ(content);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)evaluation_defns.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 23757L)
    public static SubLObject cyc_html_table_row_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = (SubLObject)evaluation_defns.NIL;
        SubLObject data = (SubLObject)evaluation_defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)evaluation_defns.$list105);
        options = args.first();
        final SubLObject current = data = args.rest();
        if (!data.isCons() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$21;
                    final SubLObject datum_$20 = current_$21 = html_table_row_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current_$21;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$22 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$20, (SubLObject)evaluation_defns.$list102);
                        current_$22 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$20, (SubLObject)evaluation_defns.$list102);
                        if (evaluation_defns.NIL == conses_high.member(current_$22, (SubLObject)evaluation_defns.$list103, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$22 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)evaluation_defns.$list102);
                    }
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current_$21);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw97$VALIGN, current_$21);
                    final SubLObject valign = (SubLObject)((evaluation_defns.NIL != valign_tail) ? conses_high.cadr(valign_tail) : evaluation_defns.NIL);
                    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw98$BGCOLOR, current_$21);
                    final SubLObject bgcolor = (SubLObject)((evaluation_defns.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : evaluation_defns.NIL);
                    final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw86$HEIGHT, current_$21);
                    final SubLObject height = (SubLObject)((evaluation_defns.NIL != height_tail) ? conses_high.cadr(height_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(align);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != height) {
                                html_utilities.html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(height);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                SubLObject cdolist_list_var = data;
                                SubLObject datum_$21 = (SubLObject)evaluation_defns.NIL;
                                datum_$21 = cdolist_list_var.first();
                                while (evaluation_defns.NIL != cdolist_list_var) {
                                    html_utilities.html_princ(datum_$21);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    datum_$21 = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)evaluation_defns.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 24525L)
    public static SubLObject html_table_row_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = el_utilities.el_list_items(options);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = conses_high.putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 24762L)
    public static SubLObject cyc_html_table(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!content.isString() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_table_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$27 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list107);
                        current_$27 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list107);
                        if (evaluation_defns.NIL == conses_high.member(current_$27, (SubLObject)evaluation_defns.$list108, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$27 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluation_defns.$list107);
                    }
                    final SubLObject noflow_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw109$NOFLOW, current);
                    final SubLObject noflow = (SubLObject)((evaluation_defns.NIL != noflow_tail) ? conses_high.cadr(noflow_tail) : evaluation_defns.NIL);
                    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw94$NOWRAP, current);
                    final SubLObject nowrap = (SubLObject)((evaluation_defns.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : evaluation_defns.NIL);
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw90$BORDER, current);
                    final SubLObject border = (SubLObject)((evaluation_defns.NIL != border_tail) ? conses_high.cadr(border_tail) : evaluation_defns.NIL);
                    final SubLObject cellpadding_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw110$CELLPADDING, current);
                    final SubLObject cellpadding = (SubLObject)((evaluation_defns.NIL != cellpadding_tail) ? conses_high.cadr(cellpadding_tail) : evaluation_defns.NIL);
                    final SubLObject cellspacing_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw111$CELLSPACING, current);
                    final SubLObject cellspacing = (SubLObject)((evaluation_defns.NIL != cellspacing_tail) ? conses_high.cadr(cellspacing_tail) : evaluation_defns.NIL);
                    final SubLObject colspec_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw112$COLSPEC, current);
                    final SubLObject colspec = (SubLObject)((evaluation_defns.NIL != colspec_tail) ? conses_high.cadr(colspec_tail) : evaluation_defns.NIL);
                    final SubLObject units_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw113$UNITS, current);
                    final SubLObject units = (SubLObject)((evaluation_defns.NIL != units_tail) ? conses_high.cadr(units_tail) : evaluation_defns.NIL);
                    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw98$BGCOLOR, current);
                    final SubLObject bgcolor = (SubLObject)((evaluation_defns.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : evaluation_defns.NIL);
                    final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw87$WIDTH, current);
                    final SubLObject width = (SubLObject)((evaluation_defns.NIL != width_tail) ? conses_high.cadr(width_tail) : evaluation_defns.NIL);
                    final SubLObject background_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw114$BACKGROUND, current);
                    final SubLObject background = (SubLObject)((evaluation_defns.NIL != background_tail) ? conses_high.cadr(background_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (evaluation_defns.NIL != noflow) {
                                html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != nowrap) {
                                html_utilities.html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != border) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(border);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != cellpadding) {
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(cellpadding);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != cellspacing) {
                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(cellspacing);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != colspec) {
                                html_utilities.html_markup(html_macros.$html_table_colspec$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(colspec);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != units) {
                                html_utilities.html_markup(html_macros.$html_table_units$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(units);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != width) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != background) {
                                html_utilities.html_markup(html_macros.$html_table_background$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(background);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                html_utilities.html_princ(content);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 25796L)
    public static SubLObject cyc_html_table_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = (SubLObject)evaluation_defns.NIL;
        SubLObject content = (SubLObject)evaluation_defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)evaluation_defns.$list100);
        options = args.first();
        final SubLObject current = content = args.rest();
        if (!content.isCons() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$32;
                    final SubLObject datum_$31 = current_$32 = html_table_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current_$32;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$33 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$31, (SubLObject)evaluation_defns.$list107);
                        current_$33 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$31, (SubLObject)evaluation_defns.$list107);
                        if (evaluation_defns.NIL == conses_high.member(current_$33, (SubLObject)evaluation_defns.$list108, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$33 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$31, (SubLObject)evaluation_defns.$list107);
                    }
                    final SubLObject noflow_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw109$NOFLOW, current_$32);
                    final SubLObject noflow = (SubLObject)((evaluation_defns.NIL != noflow_tail) ? conses_high.cadr(noflow_tail) : evaluation_defns.NIL);
                    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw94$NOWRAP, current_$32);
                    final SubLObject nowrap = (SubLObject)((evaluation_defns.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : evaluation_defns.NIL);
                    final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw89$ALIGN, current_$32);
                    final SubLObject align = (SubLObject)((evaluation_defns.NIL != align_tail) ? conses_high.cadr(align_tail) : evaluation_defns.NIL);
                    final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw90$BORDER, current_$32);
                    final SubLObject border = (SubLObject)((evaluation_defns.NIL != border_tail) ? conses_high.cadr(border_tail) : evaluation_defns.NIL);
                    final SubLObject cellpadding_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw110$CELLPADDING, current_$32);
                    final SubLObject cellpadding = (SubLObject)((evaluation_defns.NIL != cellpadding_tail) ? conses_high.cadr(cellpadding_tail) : evaluation_defns.NIL);
                    final SubLObject cellspacing_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw111$CELLSPACING, current_$32);
                    final SubLObject cellspacing = (SubLObject)((evaluation_defns.NIL != cellspacing_tail) ? conses_high.cadr(cellspacing_tail) : evaluation_defns.NIL);
                    final SubLObject colspec_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw112$COLSPEC, current_$32);
                    final SubLObject colspec = (SubLObject)((evaluation_defns.NIL != colspec_tail) ? conses_high.cadr(colspec_tail) : evaluation_defns.NIL);
                    final SubLObject units_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw113$UNITS, current_$32);
                    final SubLObject units = (SubLObject)((evaluation_defns.NIL != units_tail) ? conses_high.cadr(units_tail) : evaluation_defns.NIL);
                    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw98$BGCOLOR, current_$32);
                    final SubLObject bgcolor = (SubLObject)((evaluation_defns.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : evaluation_defns.NIL);
                    final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw87$WIDTH, current_$32);
                    final SubLObject width = (SubLObject)((evaluation_defns.NIL != width_tail) ? conses_high.cadr(width_tail) : evaluation_defns.NIL);
                    final SubLObject background_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw114$BACKGROUND, current_$32);
                    final SubLObject background = (SubLObject)((evaluation_defns.NIL != background_tail) ? conses_high.cadr(background_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (evaluation_defns.NIL != noflow) {
                                html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != nowrap) {
                                html_utilities.html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                            }
                            if (evaluation_defns.NIL != align) {
                                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != border) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(border);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != cellpadding) {
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(cellpadding);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != cellspacing) {
                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(cellspacing);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != colspec) {
                                html_utilities.html_markup(html_macros.$html_table_colspec$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(colspec);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != units) {
                                html_utilities.html_markup(html_macros.$html_table_units$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(units);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != width) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(width);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            if (evaluation_defns.NIL != background) {
                                html_utilities.html_markup(html_macros.$html_table_background$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(background);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                SubLObject cdolist_list_var = content;
                                SubLObject row = (SubLObject)evaluation_defns.NIL;
                                row = cdolist_list_var.first();
                                while (evaluation_defns.NIL != cdolist_list_var) {
                                    html_utilities.html_princ(row);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    row = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 26787L)
    public static SubLObject html_table_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = el_utilities.el_list_items(options);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = conses_high.putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 27020L)
    public static SubLObject cyc_html_division(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!content.isString() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_division_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$37 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list117);
                        current_$37 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluation_defns.$list117);
                        if (evaluation_defns.NIL == conses_high.member(current_$37, (SubLObject)evaluation_defns.$list118, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$37 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluation_defns.$list117);
                    }
                    final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw83$ID, current);
                    final SubLObject id = (SubLObject)((evaluation_defns.NIL != id_tail) ? conses_high.cadr(id_tail) : evaluation_defns.NIL);
                    final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw84$CLASS, current);
                    final SubLObject v_class = (SubLObject)((evaluation_defns.NIL != class_tail) ? conses_high.cadr(class_tail) : evaluation_defns.NIL);
                    final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw119$STYLE, current);
                    final SubLObject style = (SubLObject)((evaluation_defns.NIL != style_tail) ? conses_high.cadr(style_tail) : evaluation_defns.NIL);
                    final SubLObject onload_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw120$ONLOAD, current);
                    final SubLObject onload = (SubLObject)((evaluation_defns.NIL != onload_tail) ? conses_high.cadr(onload_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            if (evaluation_defns.NIL != style && evaluation_defns.NIL != onload) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(style);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(onload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                    html_utilities.html_princ(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            else if (evaluation_defns.NIL != style) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(style);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                    html_utilities.html_princ(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            else if (evaluation_defns.NIL != onload) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(onload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                    html_utilities.html_princ(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
                                    html_utilities.html_princ(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 28156L)
    public static SubLObject cyc_html_division_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = (SubLObject)evaluation_defns.NIL;
        SubLObject content = (SubLObject)evaluation_defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)evaluation_defns.$list100);
        options = args.first();
        final SubLObject current = content = args.rest();
        if (!content.isCons() || evaluation_defns.NIL == el_utilities.el_list_p(options)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$45;
                    final SubLObject datum_$44 = current_$45 = html_division_plist(options);
                    SubLObject allow_other_keys_p = (SubLObject)evaluation_defns.NIL;
                    SubLObject rest = current_$45;
                    SubLObject bad = (SubLObject)evaluation_defns.NIL;
                    SubLObject current_$46 = (SubLObject)evaluation_defns.NIL;
                    while (evaluation_defns.NIL != rest) {
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$44, (SubLObject)evaluation_defns.$list117);
                        current_$46 = rest.first();
                        rest = rest.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$44, (SubLObject)evaluation_defns.$list117);
                        if (evaluation_defns.NIL == conses_high.member(current_$46, (SubLObject)evaluation_defns.$list118, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            bad = (SubLObject)evaluation_defns.T;
                        }
                        if (current_$46 == evaluation_defns.$kw82$ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if (evaluation_defns.NIL != bad && evaluation_defns.NIL == allow_other_keys_p) {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$44, (SubLObject)evaluation_defns.$list117);
                    }
                    final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw83$ID, current_$45);
                    final SubLObject id = (SubLObject)((evaluation_defns.NIL != id_tail) ? conses_high.cadr(id_tail) : evaluation_defns.NIL);
                    final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw84$CLASS, current_$45);
                    final SubLObject v_class = (SubLObject)((evaluation_defns.NIL != class_tail) ? conses_high.cadr(class_tail) : evaluation_defns.NIL);
                    final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw119$STYLE, current_$45);
                    final SubLObject style = (SubLObject)((evaluation_defns.NIL != style_tail) ? conses_high.cadr(style_tail) : evaluation_defns.NIL);
                    final SubLObject onload_tail = cdestructuring_bind.property_list_member((SubLObject)evaluation_defns.$kw120$ONLOAD, current_$45);
                    final SubLObject onload = (SubLObject)((evaluation_defns.NIL != onload_tail) ? conses_high.cadr(onload_tail) : evaluation_defns.NIL);
                    SubLObject stream = (SubLObject)evaluation_defns.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$47 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            if (evaluation_defns.NIL != style && evaluation_defns.NIL != onload) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(style);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(onload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    output_html_division_content(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            else if (evaluation_defns.NIL != style) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(style);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    output_html_division_content(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            else if (evaluation_defns.NIL != onload) {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_markup(onload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    output_html_division_content(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (evaluation_defns.NIL != id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(id);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                if (evaluation_defns.NIL != v_class) {
                                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                    html_utilities.html_markup(v_class);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)evaluation_defns.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)evaluation_defns.UNPROVIDED);
                                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.T, thread);
                                    output_html_division_content(content);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                        }
                        finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$47, thread);
                        }
                        html_string = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)evaluation_defns.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 29198L)
    public static SubLObject output_html_division_content(final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)evaluation_defns.NIL, thread);
            SubLObject cdolist_list_var = content;
            SubLObject item = (SubLObject)evaluation_defns.NIL;
            item = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                html_utilities.html_princ(item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 29382L)
    public static SubLObject html_division_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = el_utilities.el_list_items(options);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = conses_high.putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 29618L)
    public static SubLObject decode_html_option(final SubLObject item) {
        SubLObject current;
        final SubLObject datum = current = el_utilities.el_list_items(item);
        SubLObject el_attribute = (SubLObject)evaluation_defns.NIL;
        SubLObject el_value = (SubLObject)evaluation_defns.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluation_defns.$list123);
        el_attribute = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluation_defns.$list123);
        el_value = current.first();
        current = current.rest();
        if (evaluation_defns.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluation_defns.$list123);
            return (SubLObject)evaluation_defns.NIL;
        }
        if (evaluation_defns.NIL != pattern_match.tree_matches_pattern(el_attribute, (SubLObject)evaluation_defns.$list124)) {
            return Values.values(cycl_utilities.nat_arg1(el_attribute, (SubLObject)evaluation_defns.UNPROVIDED), el_value);
        }
        return Values.values(parse_html_attribute(el_attribute), parse_html_attribute_value(el_value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 30025L)
    public static SubLObject parse_html_attribute(final SubLObject el_attribute) {
        final SubLObject ans = (SubLObject)((evaluation_defns.NIL != forts.fort_p(el_attribute)) ? subl_identifier.sublid_from_cyc_entity(el_attribute) : evaluation_defns.NIL);
        if (!ans.isKeyword()) {
            relation_evaluation.throw_unevaluatable();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 30281L)
    public static SubLObject parse_html_attribute_value(final SubLObject el_value) {
        if (evaluation_defns.NIL != pattern_match.tree_matches_pattern((SubLObject)evaluation_defns.$list125, el_value)) {
            return Sequences.cconcatenate(format_nil.format_nil_d_no_copy(cycl_utilities.nat_arg1(el_value, (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.$str126$_);
        }
        if (evaluation_defns.NIL != el_utilities.el_list_p(el_value)) {
            return string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym127$PARSE_HTML_ATTRIBUTE_VALUE), el_utilities.el_list_items(el_value)), (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return el_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 30629L)
    public static SubLObject cyc_contextual_url(final SubLObject local_url, final SubLObject base_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject absolute_url = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    absolute_url = web_utilities.absolute_url_from_relative_url_and_base(url_string(local_url), url_string(base_uri));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message || !absolute_url.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.make_unary_formula(evaluation_defns.$const128$URLFn, absolute_url);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 31138L)
    public static SubLObject url_string(final SubLObject url) {
        if (url.isString()) {
            return url;
        }
        if (cycl_utilities.nat_functor(url).eql(evaluation_defns.$const128$URLFn)) {
            return cycl_utilities.nat_arg1(url, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 31280L)
    public static SubLObject cyc_term_from_sparql_uri(final SubLObject uri_string) {
        if (evaluation_defns.NIL == uri_string) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject rdf_uri_string = Strings.string_left_trim((SubLObject)evaluation_defns.$list130, Strings.string_right_trim((SubLObject)evaluation_defns.$list131, uri_string));
        return rdf_utilities.rdf_uri_to_cyc_term(rdf_uri.get_rdf_uri(rdf_uri_string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 31685L)
    public static SubLObject open_cyc_uri_for_term(final SubLObject v_term) {
        if (evaluation_defns.NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
        }
        return owl_cycl_to_xml.owl_opencyc_uri_for_term(v_term, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 31932L)
    public static SubLObject canonical_uri_for_term(final SubLObject v_term) {
        if (evaluation_defns.NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
            return (SubLObject)evaluation_defns.NIL;
        }
        if (evaluation_defns.NIL != resource_with_uri_fn_nat_p(v_term)) {
            return cycl_utilities.nat_arg1(v_term, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return owl_cycl_to_xml.owl_opencyc_uri_for_term(v_term, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 32254L)
    public static SubLObject resource_with_uri_fn_nat_p(final SubLObject v_term) {
        return cycl_utilities.nat_with_functor_p(v_term, evaluation_defns.$const135$ResourceWithURIFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 32362L)
    public static SubLObject cyc_remove_html_tags(final SubLObject string) {
        if (string.isString()) {
            return html_utilities.remove_html_tags(string, string_utilities.$empty_string$.getGlobalValue());
        }
        if (evaluation_defns.NIL != unicode_nauts.unicode_naut_p(string, (SubLObject)evaluation_defns.UNPROVIDED)) {
            return unicode_nauts.display_vector_string_to_cycl_safe_string(html_utilities.remove_html_tags(cycl_utilities.nat_arg1(string, (SubLObject)evaluation_defns.UNPROVIDED), string_utilities.$empty_string$.getGlobalValue()));
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 32803L)
    public static SubLObject cyc_capitalize_smart(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.capitalize_smart(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 33065L)
    public static SubLObject cyc_recapitalize_smart(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.uncapitalize_smart(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 33339L)
    public static SubLObject cyc_relation_arg(final SubLObject n, final SubLObject expression) {
        if (evaluation_defns.NIL == el_utilities.relation_expressionP(expression) || !n.isInteger() || n.isNegative()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (expression.isCons()) {
            if (!n.numL(el_utilities.formula_length(expression, (SubLObject)evaluation_defns.UNPROVIDED))) {
                relation_evaluation.throw_unevaluatable();
            }
            return cycl_utilities.formula_arg(expression, n, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        if (evaluation_defns.NIL != nart_handles.nart_p(expression)) {
            return cyc_relation_arg(n, narts_high.nart_hl_formula(expression));
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 33951L)
    public static SubLObject cyc_relation_args_list(final SubLObject expression) {
        if (evaluation_defns.NIL == el_utilities.relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject args = conses_high.copy_list(cycl_utilities.formula_args(expression, (SubLObject)evaluation_defns.UNPROVIDED));
        return reader.bq_cons(evaluation_defns.$const140$TheList, ConsesLow.append(args, (SubLObject)evaluation_defns.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 34286L)
    public static SubLObject cyc_relation_arg_set(final SubLObject expression) {
        if (evaluation_defns.NIL == el_utilities.relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject args = cycl_utilities.formula_args(expression, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject v_set = Sequences.reverse(Sequences.delete_duplicates(Sequences.reverse(args), Symbols.symbol_function((SubLObject)evaluation_defns.EQUAL), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
        return reader.bq_cons(evaluation_defns.$const142$TheSet, ConsesLow.append(v_set, (SubLObject)evaluation_defns.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 34751L)
    public static SubLObject cyc_quoted_relation_expression_arity(final SubLObject expression) {
        if (evaluation_defns.NIL == cycl_grammar.fast_cycl_quoted_term_p(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject unquoted_expression = czer_main.unquote_quoted_term(expression, (SubLObject)evaluation_defns.UNPROVIDED);
        return cyc_relation_expression_arity(unquoted_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 35161L)
    public static SubLObject cyc_relation_expression_arity(final SubLObject expression) {
        if (evaluation_defns.NIL == cycl_utilities.possibly_cycl_formula_p(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.formula_arity(expression, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 35382L)
    public static SubLObject cyc_identity(final SubLObject v_object) {
        return Equality.identity(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 35543L)
    public static SubLObject cyc_relation_tuples(final SubLObject relation) {
        return cyc_relation_tuples_internal(relation, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 35759L)
    public static SubLObject cyc_relation_tuples_internal(final SubLObject relation, SubLObject mt) {
        if (mt == evaluation_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject kappa_predicate = convert_relation_to_kappa(relation);
        if (evaluation_defns.NIL == kappa_predicate) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject formal_args = el_utilities.kappa_predicate_formal_args(kappa_predicate);
        final SubLObject query = el_utilities.kappa_predicate_query(kappa_predicate);
        return el_utilities.make_el_list_recursively(ask_utilities.kappa_tuples(formal_args, query, mt, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 36261L)
    public static SubLObject convert_relation_to_kappa(final SubLObject relation) {
        if (evaluation_defns.NIL != el_utilities.kappa_predicate_p(relation)) {
            return relation;
        }
        if (evaluation_defns.NIL != forts.fort_p(relation)) {
            final SubLObject v_arity = arity.arity(relation);
            if (v_arity.isInteger() && !v_arity.isNegative()) {
                final SubLObject formal_args = variables.generate_hl_variable_list(v_arity);
                final SubLObject query = (SubLObject)ConsesLow.cons(relation, formal_args);
                return (SubLObject)ConsesLow.list(evaluation_defns.$const148$Kappa, formal_args, query);
            }
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 36647L)
    public static SubLObject cyc_substitute_formula(final SubLObject v_new, final SubLObject old, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL != evaluation_defns.$bug_18769_switchP$.getDynamicValue(thread)) {
            final SubLObject unquoted_new = czer_main.unquote_quoted_term(v_new, (SubLObject)evaluation_defns.UNPROVIDED);
            final SubLObject unquoted_old = czer_main.unquote_quoted_term(old, (SubLObject)evaluation_defns.UNPROVIDED);
            return conses_high.subst(unquoted_new, unquoted_old, formula, Symbols.symbol_function((SubLObject)evaluation_defns.EQUAL), (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return narts_high.nart_substitute(conses_high.subst(cycl_utilities.hl_to_el(v_new), cycl_utilities.hl_to_el(old), cycl_utilities.hl_to_el(formula), Symbols.symbol_function((SubLObject)evaluation_defns.EQUAL), (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 37167L)
    public static SubLObject cyc_bilateral_form_of_sentence_left(final SubLObject sentence) {
        final SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
        if (evaluation_defns.NIL == symmetry_neutralized_el_sentence_p(el_sentence)) {
            relation_evaluation.throw_unevaluatable();
        }
        return cycl_utilities.hl_to_el(cycl_utilities.expression_transform(cycl_utilities.hl_to_el(el_sentence), (SubLObject)evaluation_defns.$sym150$SYMMETRIC_PART_TYPE_, (SubLObject)evaluation_defns.$sym151$LEFT_FORM_OF_SYMMETRIC_PART_TYPE, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 37701L)
    public static SubLObject symmetric_part_typeP(final SubLObject v_object) {
        return isa.isaP(v_object, evaluation_defns.$const153$SymmetricAnatomicalPartType, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 37801L)
    public static SubLObject left_form_of_symmetric_part_type(final SubLObject symmetric_part_type) {
        return czer_main.cyc_find_or_create_nart(el_utilities.make_unary_formula(evaluation_defns.$const154$LeftObjectOfPairFn, symmetric_part_type), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 37971L)
    public static SubLObject cyc_bilateral_form_of_sentence_right(final SubLObject sentence) {
        final SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
        if (evaluation_defns.NIL == symmetry_neutralized_el_sentence_p(el_sentence)) {
            relation_evaluation.throw_unevaluatable();
        }
        return cycl_utilities.hl_to_el(cycl_utilities.expression_transform(cycl_utilities.hl_to_el(el_sentence), (SubLObject)evaluation_defns.$sym150$SYMMETRIC_PART_TYPE_, (SubLObject)evaluation_defns.$sym155$RIGHT_FORM_OF_SYMMETRIC_PART_TYPE, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 38393L)
    public static SubLObject symmetry_neutralized_el_sentence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(evaluation_defns.NIL != el_grammar.el_sentence_p(v_object) && evaluation_defns.NIL == cycl_utilities.expression_find(evaluation_defns.$const154$LeftObjectOfPairFn, v_object, (SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == cycl_utilities.expression_find(evaluation_defns.$const157$RightObjectOfPairFn, v_object, (SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 38616L)
    public static SubLObject right_form_of_symmetric_part_type(final SubLObject symmetric_part_type) {
        return czer_main.cyc_find_or_create_nart(el_utilities.make_unary_formula(evaluation_defns.$const157$RightObjectOfPairFn, symmetric_part_type), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 38788L)
    public static SubLObject neutralize_symmetric_formula(final SubLObject sentence) {
        return cycl_utilities.expression_transform(cycl_utilities.hl_to_el(sentence), (SubLObject)evaluation_defns.$sym158$SIDE_FN_NAUT_P, (SubLObject)evaluation_defns.$sym159$NAT_ARG1, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 38926L)
    public static SubLObject side_fn_naut_p(final SubLObject v_object) {
        return el_utilities.el_formula_with_operator_p(v_object, (SubLObject)evaluation_defns.$sym160$_SIDEFN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 39202L)
    public static SubLObject cyc_substitute_formula_arg(final SubLObject argnum, final SubLObject arg, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL != evaluation_defns.$bug_18769_switchP$.getDynamicValue(thread)) {
            final SubLObject unquoted_arg = czer_main.unquote_quoted_term(arg, (SubLObject)evaluation_defns.UNPROVIDED);
            final SubLObject unquoted_formula = czer_main.unquote_quoted_term(formula, (SubLObject)evaluation_defns.UNPROVIDED);
            final SubLObject replaced_formula = narts_high.nart_substitute(el_utilities.replace_formula_arg(argnum, unquoted_arg, unquoted_formula));
            return el_utilities.make_el_formula(evaluation_defns.$const161$Quote, (SubLObject)ConsesLow.list(replaced_formula), (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return narts_high.nart_substitute(el_utilities.replace_formula_arg(argnum, arg, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 39789L)
    public static SubLObject cyc_substitute_formula_arg_position(final SubLObject cycl_arg_position, final SubLObject arg, final SubLObject formula) {
        if (evaluation_defns.NIL == el_utilities.el_formula_p(formula)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject arg_position = cycl_utilities.cycl_arg_position_to_arg_position(cycl_arg_position);
        return narts_high.nart_substitute(el_utilities.replace_formula_arg_position(arg_position, arg, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 40259L)
    public static SubLObject cyc_make_formula(final SubLObject operator, final SubLObject el_arg_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == el_utilities.el_list_p(el_arg_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject subl_arg_list = el_utilities.el_list_items(el_arg_list);
        SubLObject el_formula = (SubLObject)evaluation_defns.NIL;
        if (operator.eql(evaluation_defns.$const161$Quote)) {
            el_formula = el_utilities.make_el_formula(evaluation_defns.$const161$Quote, subl_arg_list, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        else if (evaluation_defns.NIL != evaluation_defns.$bug_18769_switchP$.getDynamicValue(thread)) {
            el_formula = el_utilities.make_el_formula(operator, subl_arg_list, (SubLObject)evaluation_defns.UNPROVIDED);
            if (evaluation_defns.NIL == cycl_grammar.cycl_formula_p(el_formula)) {
                relation_evaluation.throw_unevaluatable();
            }
            el_formula = el_utilities.make_el_formula(evaluation_defns.$const161$Quote, (SubLObject)ConsesLow.list(el_formula), (SubLObject)evaluation_defns.UNPROVIDED);
        }
        else {
            el_formula = el_utilities.make_el_formula(operator, subl_arg_list, (SubLObject)evaluation_defns.UNPROVIDED);
            if (evaluation_defns.NIL == cycl_grammar.cycl_formula_p(el_formula)) {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return narts_high.nart_substitute(el_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 41086L)
    public static SubLObject cyc_substitute_quoted_formula(final SubLObject v_new, final SubLObject old, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = evaluation_defns.$bug_18769_switchP$.currentBinding(thread);
        try {
            evaluation_defns.$bug_18769_switchP$.bind((SubLObject)evaluation_defns.T, thread);
            result = cyc_substitute_formula(v_new, old, formula);
        }
        finally {
            evaluation_defns.$bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 41450L)
    public static SubLObject cyc_substitute_quoted_formula_arg(final SubLObject argnum, final SubLObject arg, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = evaluation_defns.$bug_18769_switchP$.currentBinding(thread);
        try {
            evaluation_defns.$bug_18769_switchP$.bind((SubLObject)evaluation_defns.T, thread);
            result = cyc_substitute_formula_arg(argnum, arg, formula);
        }
        finally {
            evaluation_defns.$bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 41833L)
    public static SubLObject cyc_substitute_quoted_formula_arg_position(final SubLObject cycl_arg_position, final SubLObject arg, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = evaluation_defns.$bug_18769_switchP$.currentBinding(thread);
        try {
            evaluation_defns.$bug_18769_switchP$.bind((SubLObject)evaluation_defns.T, thread);
            result = cyc_substitute_formula_arg_position(cycl_arg_position, arg, formula);
        }
        finally {
            evaluation_defns.$bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 42288L)
    public static SubLObject cyc_make_quoted_formula(final SubLObject operator, final SubLObject el_arg_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = evaluation_defns.$bug_18769_switchP$.currentBinding(thread);
        try {
            evaluation_defns.$bug_18769_switchP$.bind((SubLObject)evaluation_defns.T, thread);
            result = cyc_make_formula(operator, el_arg_list);
        }
        finally {
            evaluation_defns.$bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 42619L)
    public static SubLObject cycl_to_el_fn(final SubLObject expression) {
        return cycl_utilities.hl_to_el(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 42751L)
    public static SubLObject cyc_substitute_nlte(final SubLObject v_new, final SubLObject old, final SubLObject nlte) {
        if (evaluation_defns.NIL == wff.kwt_wffP(nlte, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return conses_high.subst(v_new, old, nlte, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 43102L)
    public static SubLObject sem_trans_template_defn(final SubLObject frame, final SubLObject head_type, final SubLObject pred_list) {
        final SubLObject subl_pred_list = el_utilities.el_list_items(pred_list);
        final SubLObject template = lexicon_utilities.construct_semtrans_template_from_head_type_and_argument_roles(frame, head_type, subl_pred_list);
        if (evaluation_defns.NIL != template) {
            return template;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 43548L)
    public static SubLObject cyc_word_strings(final SubLObject wu, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    strings = lexicon_cache.strings_of_wordXpred(wu, pred, mt_relevance_macros.mt_info((SubLObject)evaluation_defns.UNPROVIDED));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
            return (SubLObject)evaluation_defns.NIL;
        }
        return el_utilities.make_el_set(strings, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 44125L)
    public static SubLObject word_strings_fn() {
        if (evaluation_defns.NIL == evaluation_defns.$word_strings_fn$.getGlobalValue()) {
            evaluation_defns.$word_strings_fn$.setGlobalValue(constants_high.find_constant((SubLObject)evaluation_defns.$str173$WordStringsFn));
        }
        return evaluation_defns.$word_strings_fn$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 44325L)
    public static SubLObject word_sequence_fn() {
        if (evaluation_defns.NIL == evaluation_defns.$word_sequence_fn$.getGlobalValue()) {
            evaluation_defns.$word_sequence_fn$.setGlobalValue(constants_high.find_constant((SubLObject)evaluation_defns.$str174$WordSequenceFn));
        }
        return evaluation_defns.$word_sequence_fn$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 44485L)
    public static SubLObject cyc_strings_of_word_sequence(final SubLObject word_sequence) {
        if (!cycl_utilities.nat_functor(word_sequence).eql(word_sequence_fn())) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject string_sets_in_reverse_order = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = cycl_utilities.nat_args(word_sequence, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject item_strings = (SubLObject)evaluation_defns.NIL;
            if (item.isString()) {
                item_strings = (SubLObject)ConsesLow.list(item);
            }
            else if (evaluation_defns.NIL != el_utilities.el_formula_with_operator_p(item, word_strings_fn())) {
                item_strings = lexicon_cache.strings_of_wordXpred(cycl_utilities.nat_arg1(item, (SubLObject)evaluation_defns.UNPROVIDED), cycl_utilities.nat_arg2(item, (SubLObject)evaluation_defns.UNPROVIDED), mt_relevance_macros.mt_info((SubLObject)evaluation_defns.UNPROVIDED));
            }
            if (evaluation_defns.NIL != list_utilities.non_empty_list_p(item_strings)) {
                string_sets_in_reverse_order = (SubLObject)ConsesLow.cons(item_strings, string_sets_in_reverse_order);
            }
            else {
                relation_evaluation.throw_unevaluatable();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        SubLObject strings = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var2 = list_utilities.cartesian_product(Sequences.nreverse(string_sets_in_reverse_order), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject string_list = (SubLObject)evaluation_defns.NIL;
        string_list = cdolist_list_var2.first();
        while (evaluation_defns.NIL != cdolist_list_var2) {
            strings = (SubLObject)ConsesLow.cons(string_utilities.bunge(string_list, (SubLObject)evaluation_defns.UNPROVIDED), strings);
            cdolist_list_var2 = cdolist_list_var2.rest();
            string_list = cdolist_list_var2.first();
        }
        return el_utilities.make_el_set(strings, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 45306L)
    public static SubLObject cyc_instantiate(final SubLObject prefix, final SubLObject mt, final SubLObject v_set) {
        if (!prefix.isString() || evaluation_defns.NIL == hlmt.hlmt_p(mt)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject formula = cyc_instantiate_set_formula(v_set);
        if (evaluation_defns.NIL == formula) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_term = cyc_instantiate_formula(formula, mt, prefix);
        if (evaluation_defns.NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 45784L)
    public static SubLObject cyc_find_or_instantiate(final SubLObject prefix, final SubLObject mt, final SubLObject v_set) {
        if (!prefix.isString() || evaluation_defns.NIL == hlmt.hlmt_p(mt)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject formula = cyc_instantiate_set_formula(v_set);
        if (evaluation_defns.NIL == formula) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject existing = ask_utilities.inference_recursive_query_unique_bindings(formula, mt, (SubLObject)evaluation_defns.$list177);
        if (evaluation_defns.NIL != existing) {
            final SubLObject v_term = bindings.variable_binding_value(existing.first().first());
            return v_term;
        }
        final SubLObject v_term = cyc_instantiate_formula(formula, mt, prefix);
        if (evaluation_defns.NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 46505L)
    public static SubLObject cyc_instantiate_set_formula(final SubLObject v_set) {
        SubLObject formula = (SubLObject)evaluation_defns.NIL;
        if (evaluation_defns.NIL != forts.fort_p(v_set)) {
            formula = (SubLObject)ConsesLow.list(evaluation_defns.$const179$isa, (SubLObject)evaluation_defns.$sym180$_OBJ, v_set);
        }
        else if (v_set.isCons() && evaluation_defns.$const181$TheSetOf.eql(cycl_utilities.nat_functor(v_set))) {
            formula = cycl_utilities.nat_arg2(v_set, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 46783L)
    public static SubLObject cyc_instantiate_formula(final SubLObject formula, final SubLObject mt, final SubLObject prefix) {
        final SubLObject v_bindings = prove.fi_hypothesize_int(formula, mt, prefix, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL != v_bindings) {
            final SubLObject v_term = bindings.variable_binding_value(v_bindings.first());
            final SubLObject unique_name = constant_completion_high.uniquify_constant_name(prefix, (SubLObject)evaluation_defns.UNPROVIDED);
            fi.fi_rename_int(v_term, unique_name);
            fi.fi_assert_int((SubLObject)ConsesLow.list(evaluation_defns.$const182$definingMt, v_term, mt), mt_vars.$defining_mt_mt$.getGlobalValue(), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
            return v_term;
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 47177L)
    public static SubLObject cyc_find_via_pred_value_or_create_via_template(final SubLObject template, final SubLObject pred, final SubLObject value) {
        SubLObject v_term = cached_find_via_pred_value_wrt_template(template, pred, value, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL == v_term) {
            v_term = create_and_assert_via_value_wrt_template(template, value, (SubLObject)evaluation_defns.UNPROVIDED);
            if (evaluation_defns.NIL == v_term) {
                relation_evaluation.throw_unevaluatable();
            }
            remove_cached_find_via_pred_value_wrt_template(template, pred, value, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 47775L)
    public static SubLObject clear_cached_find_via_pred_value_wrt_template() {
        final SubLObject cs = evaluation_defns.$cached_find_via_pred_value_wrt_template_caching_state$.getGlobalValue();
        if (evaluation_defns.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 47775L)
    public static SubLObject remove_cached_find_via_pred_value_wrt_template(final SubLObject template, final SubLObject pred, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == evaluation_defns.UNPROVIDED) {
            meta_mt = (SubLObject)evaluation_defns.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(evaluation_defns.$cached_find_via_pred_value_wrt_template_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(template, pred, value, meta_mt), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 47775L)
    public static SubLObject cached_find_via_pred_value_wrt_template_internal(final SubLObject template, final SubLObject pred, final SubLObject value, final SubLObject meta_mt) {
        return find_via_pred_value_wrt_template(template, pred, value, meta_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 47775L)
    public static SubLObject cached_find_via_pred_value_wrt_template(final SubLObject template, final SubLObject pred, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == evaluation_defns.UNPROVIDED) {
            meta_mt = (SubLObject)evaluation_defns.NIL;
        }
        SubLObject caching_state = evaluation_defns.$cached_find_via_pred_value_wrt_template_caching_state$.getGlobalValue();
        if (evaluation_defns.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)evaluation_defns.$sym184$CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE, (SubLObject)evaluation_defns.$sym185$_CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE_CACHING_STATE_, (SubLObject)evaluation_defns.$int72$1000, (SubLObject)evaluation_defns.EQUAL, (SubLObject)evaluation_defns.FOUR_INTEGER, (SubLObject)evaluation_defns.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(template, pred, value, meta_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)evaluation_defns.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)evaluation_defns.NIL;
            collision = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (value.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (evaluation_defns.NIL != cached_args && evaluation_defns.NIL == cached_args.rest() && meta_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_find_via_pred_value_wrt_template_internal(template, pred, value, meta_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(template, pred, value, meta_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 48006L)
    public static SubLObject find_via_pred_value_wrt_template(final SubLObject template, final SubLObject pred, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == evaluation_defns.UNPROVIDED) {
            meta_mt = (SubLObject)evaluation_defns.NIL;
        }
        final SubLObject mt = kb_mapping_utilities.fpred_value_in_relevant_mts(template, evaluation_defns.$const186$creationTemplateMt, meta_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject variable = variables.get_variable((SubLObject)evaluation_defns.ZERO_INTEGER);
        final SubLObject query = el_utilities.make_binary_formula(pred, variable, value);
        final SubLObject candidates = backward.removal_ask_variable(variable, query, mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject by_preference = (evaluation_defns.NIL != list_utilities.singletonP(candidates)) ? candidates : list_utilities.sort_via_test(candidates, Symbols.symbol_function((SubLObject)evaluation_defns.$sym187$CONSTANT_P), (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject v_term = by_preference.first();
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 48515L)
    public static SubLObject create_and_assert_via_value_wrt_template(final SubLObject template, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == evaluation_defns.UNPROVIDED) {
            meta_mt = (SubLObject)evaluation_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_constant = create_constant_from_value_wrt_template(template, value, meta_mt);
        thread.resetMultipleValues();
        final SubLObject sentence = compute_constant_assert_sentence_wrt_template(template, new_constant, value, meta_mt);
        final SubLObject assert_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ke.ke_assert_now(sentence, assert_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 48938L)
    public static SubLObject create_constant_from_value_wrt_template(final SubLObject template, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == evaluation_defns.UNPROVIDED) {
            meta_mt = (SubLObject)evaluation_defns.NIL;
        }
        final SubLObject format_string = kb_mapping_utilities.fpred_value_in_relevant_mts(template, evaluation_defns.$const188$creationTemplateConstantNameForma, meta_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject name_basis = PrintLow.format((SubLObject)evaluation_defns.NIL, format_string, value);
        final SubLObject new_name = string_utilities.make_valid_constant_name(name_basis, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject new_constant = cyc_kernel.cyc_create_new_permanent(new_name);
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 49355L)
    public static SubLObject compute_constant_assert_sentence_wrt_template(final SubLObject template, final SubLObject new_constant, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == evaluation_defns.UNPROVIDED) {
            meta_mt = (SubLObject)evaluation_defns.NIL;
        }
        final SubLObject mt = kb_mapping_utilities.fpred_value_in_relevant_mts(template, evaluation_defns.$const186$creationTemplateMt, meta_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject raw = kb_mapping_utilities.fpred_value_in_relevant_mts(template, evaluation_defns.$const189$creationTemplateSentenceTemplate, meta_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject v_bindings = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)evaluation_defns.$kw190$TERM, new_constant), reader.bq_cons((SubLObject)evaluation_defns.$kw191$VALUE, value));
        final SubLObject sentence = bindings.apply_bindings(v_bindings, raw);
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 49787L)
    public static SubLObject cyc_action_type_nlte(final SubLObject nlte) {
        if (evaluation_defns.NIL != wff.kwt_wffP(nlte, (SubLObject)evaluation_defns.UNPROVIDED)) {
            return cycl_utilities.collection_intersection(action_type_nlte(nlte));
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 50238L)
    public static SubLObject action_type_nlte(final SubLObject nlte) {
        final SubLObject head = nlte.first();
        if (head.eql(evaluation_defns.$const179$isa) && conses_high.second(nlte) == evaluation_defns.$kw192$ACTION) {
            return (SubLObject)ConsesLow.list(conses_high.third(nlte));
        }
        if (evaluation_defns.NIL != fort_types_interface.predicateP(head)) {
            return (SubLObject)evaluation_defns.NIL;
        }
        if (evaluation_defns.NIL != fort_types_interface.logical_connective_p(head)) {
            return action_type_nltes(nlte.rest());
        }
        if (evaluation_defns.NIL != fort_types_interface.quantifier_p(head)) {
            return action_type_nlte(conses_high.third(nlte));
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 50756L)
    public static SubLObject action_type_nltes(final SubLObject nltes) {
        if (evaluation_defns.NIL != conses_high.endp(nltes)) {
            return (SubLObject)evaluation_defns.NIL;
        }
        return ConsesLow.append(action_type_nlte(nltes.first()), action_type_nltes(nltes.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 51103L)
    public static SubLObject cyc_individual_denoting_unary_function_for(final SubLObject col) {
        final SubLObject functions = unary_functions_for(col, evaluation_defns.$const193$resultIsa);
        final SubLObject individual_denoters = list_utilities.remove_if_not((SubLObject)evaluation_defns.$sym194$INDIVIDUAL_DENOTING_FN_, functions, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL != list_utilities.singletonP(individual_denoters)) {
            return individual_denoters.first();
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 51774L)
    public static SubLObject cyc_collection_denoting_unary_function_for(final SubLObject col) {
        final SubLObject functions = unary_functions_for(col, evaluation_defns.$const196$resultGenl);
        if (evaluation_defns.NIL != list_utilities.singletonP(functions)) {
            return functions.first();
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 52241L)
    public static SubLObject unary_functions_for(final SubLObject col, final SubLObject slot) {
        if (evaluation_defns.NIL == kb_indexing_datastructures.indexed_term_p(col)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject functions = kb_mapping_utilities.pred_values(col, slot, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject unary_functions = list_utilities.remove_if_not((SubLObject)evaluation_defns.$sym198$UNARY_FUNCTION_, functions, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject non_skolems = Sequences.remove_if((SubLObject)evaluation_defns.$sym199$SKOLEM_FUNCTION_, unary_functions, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject ans = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = non_skolems;
        SubLObject fn = (SubLObject)evaluation_defns.NIL;
        fn = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            if (kb_indexing.num_gaf_arg_index(fn, (SubLObject)evaluation_defns.ONE_INTEGER, slot, (SubLObject)evaluation_defns.UNPROVIDED).eql((SubLObject)evaluation_defns.ONE_INTEGER)) {
                ans = (SubLObject)ConsesLow.cons(fn, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fn = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 52802L)
    public static SubLObject unary_functionP(final SubLObject obj) {
        return at_defns.quiet_has_typeP(obj, evaluation_defns.$const200$UnaryFunction, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 52888L)
    public static SubLObject individual_denoting_fnP(final SubLObject obj) {
        return at_defns.quiet_has_typeP(obj, evaluation_defns.$const201$IndividualDenotingFunction, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 52995L)
    public static SubLObject cyc_el_variable_fn(final SubLObject args) {
        return cycl_variables.make_el_var(constants_high.constant_name(args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53156L)
    public static SubLObject cyc_add_english_suffix(final SubLObject base, final SubLObject suffix) {
        if (!base.isString() || !suffix.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return morphology.add_english_suffix(base, suffix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject generate_phrase_defn(final SubLObject v_term) {
        return generate_phrase_memoized(v_term, evaluation_defns.$use_new_nl_generation_api_for_generate_phrase_fnP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject generate_phrase_memoized_internal(final SubLObject v_term, final SubLObject use_new_apiP) {
        if (evaluation_defns.NIL != use_new_apiP) {
            final SubLObject maps = nl_generation_api.cycl_term_to_nl_internal(v_term, (SubLObject)evaluation_defns.$kw207$DEFAULT);
            return (SubLObject)((evaluation_defns.NIL != maps) ? nl_generation_api.pph_output_map_to_text_internal(maps.first(), (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.ZERO_INTEGER, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.NIL) : evaluation_defns.NIL);
        }
        return pph_main.generate_phrase(v_term, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject generate_phrase_memoized(final SubLObject v_term, final SubLObject use_new_apiP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)evaluation_defns.NIL;
        if (evaluation_defns.NIL == v_memoization_state) {
            return generate_phrase_memoized_internal(v_term, use_new_apiP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)evaluation_defns.$sym206$GENERATE_PHRASE_MEMOIZED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)evaluation_defns.$sym206$GENERATE_PHRASE_MEMOIZED, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.EQUAL, (SubLObject)evaluation_defns.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)evaluation_defns.$sym206$GENERATE_PHRASE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, use_new_apiP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)evaluation_defns.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)evaluation_defns.NIL;
            collision = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (evaluation_defns.NIL != cached_args && evaluation_defns.NIL == cached_args.rest() && use_new_apiP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_phrase_memoized_internal(v_term, use_new_apiP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, use_new_apiP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject assertions_relevant_to_string_defn(final SubLObject prompt_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == string_utilities.non_empty_string_p(prompt_string)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject scored_assertions = assertions_for_prompt_string_memoized(prompt_string, mt_relevance_macros.$mt$.getDynamicValue(thread), evaluation_defns.$assertions_relevant_to_string_defn_max_to_check$.getGlobalValue());
        SubLObject assertions = (SubLObject)evaluation_defns.NIL;
        format_nil.force_format((SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.$str209$__Got__D_scored_assertions___, dictionary.dictionary_length(scored_assertions), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(scored_assertions, Symbols.symbol_function((SubLObject)evaluation_defns.$sym211$_));
        SubLObject cons = (SubLObject)evaluation_defns.NIL;
        cons = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject assertionXnl = (SubLObject)evaluation_defns.NIL;
            SubLObject value = (SubLObject)evaluation_defns.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluation_defns.$list210);
            assertionXnl = current.first();
            current = (value = current.rest());
            assertions = (SubLObject)ConsesLow.cons(assertionXnl.first(), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        format_nil.force_format((SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.$str212$__Returning__D_assertions___, Sequences.length(assertions), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        return el_utilities.make_el_list(assertions, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject assertions_for_prompt_string_memoized_internal(final SubLObject prompt_string, final SubLObject mt, final SubLObject max_to_check) {
        return string_relevant_assertions.assertions_for_prompt_string(prompt_string, mt, max_to_check);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject assertions_for_prompt_string_memoized(final SubLObject prompt_string, final SubLObject mt, final SubLObject max_to_check) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)evaluation_defns.NIL;
        if (evaluation_defns.NIL == v_memoization_state) {
            return assertions_for_prompt_string_memoized_internal(prompt_string, mt, max_to_check);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)evaluation_defns.$sym214$ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)evaluation_defns.$sym214$ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED, (SubLObject)evaluation_defns.THREE_INTEGER, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.EQUAL, (SubLObject)evaluation_defns.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)evaluation_defns.$sym214$ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(prompt_string, mt, max_to_check);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)evaluation_defns.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)evaluation_defns.NIL;
            collision = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (prompt_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (evaluation_defns.NIL != cached_args && evaluation_defns.NIL == cached_args.rest() && max_to_check.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(assertions_for_prompt_string_memoized_internal(prompt_string, mt, max_to_check)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(prompt_string, mt, max_to_check));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject best_string_of_nl_phrase_defn(final SubLObject phrase_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == pph_types.pph_phrase_nautP(phrase_naut)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        thread.resetMultipleValues();
        final SubLObject string_$53 = pph_main.generate_good_string_from_phrase_naut(phrase_naut, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject error_message_$54 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$53;
        error_message = error_message_$54;
        if (evaluation_defns.NIL != error_message || evaluation_defns.NIL == cycl_string.cycl_string_p(string)) {
            relation_evaluation.throw_unevaluatable();
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject best_string_of_nl_phrase_addressing_defn(final SubLObject phrase_naut, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding(thread);
        try {
            pph_vars.$pph_addressee$.bind(user, thread);
            return best_string_of_nl_phrase_defn(phrase_naut);
        }
        finally {
            pph_vars.$pph_addressee$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject best_string_of_nl_phrase_with_force_defn(final SubLObject phrase_naut, final SubLObject cycl_force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == pph_types.pph_phrase_nautP(phrase_naut)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject string = (SubLObject)evaluation_defns.NIL;
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        thread.resetMultipleValues();
        final SubLObject string_$55 = pph_main.generate_good_string_from_phrase_naut(phrase_naut, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), pph_utilities.pph_force_from_cycl_force(cycl_force));
        final SubLObject error_message_$56 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$55;
        error_message = error_message_$56;
        if (evaluation_defns.NIL != error_message || evaluation_defns.NIL == cycl_string.cycl_string_p(string)) {
            relation_evaluation.throw_unevaluatable();
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject generate_gke_gloss_wrt_mt(final SubLObject quoted_literal, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_javalist_to_cycl_structured_paraphrase(gke_main.generate_gke_gloss_wrt_mt_cached(cycl_utilities.formula_arg1(quoted_literal, (SubLObject)evaluation_defns.UNPROVIDED), domain_mt, mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject basic_datum_paraphrase_defn(final SubLObject el_set, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == el_utilities.el_set_p(el_set) || evaluation_defns.NIL == hlmt.possibly_hlmt_p(language_mt)) {
            relation_evaluation.throw_unevaluatable();
        }
        else {
            if (evaluation_defns.NIL != el_utilities.el_empty_set_p(el_set)) {
                return string_utilities.$empty_string$.getGlobalValue();
            }
            if (evaluation_defns.NIL != el_utilities.el_formula_p(el_set)) {
                final SubLObject phrase_naut = basic_datum_phrase_naut(el_set);
                thread.resetMultipleValues();
                final SubLObject string = pph_main.generate_good_string_from_phrase_naut(phrase_naut, language_mt, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)evaluation_defns.UNPROVIDED);
                final SubLObject error_message = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (evaluation_defns.NIL != error_message || !string.isString()) {
                    relation_evaluation.throw_unevaluatable();
                }
                return string;
            }
            relation_evaluation.throw_unevaluatable();
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject basic_datum_phrase_naut(final SubLObject el_set) {
        SubLObject phrase_nauts = (SubLObject)evaluation_defns.NIL;
        SubLObject i = (SubLObject)evaluation_defns.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(el_set, (SubLObject)evaluation_defns.$kw220$IGNORE);
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            i = Numbers.add(i, (SubLObject)evaluation_defns.ONE_INTEGER);
            if (i.numG((SubLObject)evaluation_defns.ONE_INTEGER)) {
                phrase_nauts = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.bestnlphraseofstringfn(), (SubLObject)evaluation_defns.$str45$_), phrase_nauts);
            }
            phrase_nauts = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(pph_functions.termparaphrasefn_constrained(), evaluation_defns.$const221$nonPlural_Generic, item), phrase_nauts);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (evaluation_defns.NIL == phrase_nauts) {
            relation_evaluation.throw_unevaluatable();
        }
        return (evaluation_defns.NIL != list_utilities.singletonP(phrase_nauts)) ? phrase_nauts.first() : el_utilities.make_el_formula(pph_functions.concatenatephrasesfn(), Sequences.nreverse(phrase_nauts), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 53507L)
    public static SubLObject paraphrase_of_formula_from_template_defn(final SubLObject formula, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err_msg = (SubLObject)evaluation_defns.NIL;
        SubLObject paraphrase = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject was_appendingP = Eval.eval((SubLObject)evaluation_defns.$sym222$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                    Eval.eval((SubLObject)evaluation_defns.$list223);
                    try {
                        final SubLObject _prev_bind_0_$57 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                            pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)evaluation_defns.T, thread);
                            try {
                                final SubLObject force = (SubLObject)((evaluation_defns.NIL != cycl_grammar.cycl_sentence_p(formula)) ? (evaluation_defns.$const224$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(assertion)) ? evaluation_defns.$kw225$INTERROGATIVE : evaluation_defns.$kw226$DECLARATIVE) : evaluation_defns.$kw227$NONE);
                                final SubLObject _prev_bind_0_$58 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$59 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$60 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_problem_reporting_mode$.bind((SubLObject)((evaluation_defns.NIL != pph_vars.pph_problem_reporting_on_p()) ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : evaluation_defns.$kw228$QUIET), thread);
                                    pph_vars.$pph_language_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                                    pph_vars.$pph_domain_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                                    SubLObject v_pph_phrase = (SubLObject)evaluation_defns.NIL;
                                    if (evaluation_defns.$const229$genTemplate_Constrained.eql(assertions_high.gaf_arg0(assertion))) {
                                        if (evaluation_defns.NIL != pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), formula, (SubLObject)evaluation_defns.NIL)) {
                                            v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(formula, assertion, force);
                                        }
                                        else {
                                            Errors.error((SubLObject)evaluation_defns.$str230$Formula_does_not_meet_this_assert);
                                        }
                                    }
                                    else {
                                        v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(formula, assertion, force);
                                    }
                                    if (evaluation_defns.NIL != v_pph_phrase) {
                                        paraphrase = pph_string.pph_string_to_cycl(pph_phrase.pph_phrase_string(v_pph_phrase, (SubLObject)evaluation_defns.NIL));
                                    }
                                }
                                finally {
                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_2_$60, thread);
                                    pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$59, thread);
                                    pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$58, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    pph_macros.destroy_new_pph_phrases();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                }
                            }
                        }
                        finally {
                            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_3, thread);
                            pph_macros.$new_pph_phrases$.rebind(_prev_bind_2, thread);
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$57, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            Eval.eval((SubLObject)ConsesLow.list((SubLObject)evaluation_defns.$sym231$CSETQ, (SubLObject)evaluation_defns.$sym222$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != err_msg || evaluation_defns.NIL == paraphrase) {
            relation_evaluation.throw_unevaluatable();
            return (SubLObject)evaluation_defns.NIL;
        }
        return paraphrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 59773L)
    public static SubLObject state_or_province_for_city_defn(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state_list = kb_mapping_utilities.pred_values_in_any_mt(fort, evaluation_defns.$const233$geopoliticalSubdivision, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject ans = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)evaluation_defns.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(evaluation_defns.$const2$EverythingPSC, thread);
            SubLObject cdolist_list_var = state_list;
            SubLObject item = (SubLObject)evaluation_defns.NIL;
            item = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                if (evaluation_defns.NIL != isa.isaP(item, evaluation_defns.$const234$State_UnitedStates, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) || evaluation_defns.NIL != isa.isaP(item, evaluation_defns.$const235$CanadianProvince, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (!Sequences.length(ans).eql((SubLObject)evaluation_defns.ONE_INTEGER)) {
            relation_evaluation.throw_unevaluatable();
        }
        return ans.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 60439L)
    public static SubLObject cyc_html_url_encode(final SubLObject the_string) {
        if (!the_string.isString() && evaluation_defns.NIL == unicode_nauts.unicode_naut_p(the_string, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_encode((evaluation_defns.NIL != unicode_nauts.unicode_naut_p(the_string, (SubLObject)evaluation_defns.UNPROVIDED)) ? unicode_strings.display_to_utf8_string(cycl_utilities.nat_arg1(the_string, (SubLObject)evaluation_defns.UNPROVIDED)) : the_string, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 60799L)
    public static SubLObject cyc_url_source(final SubLObject url) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        SubLObject ans = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)evaluation_defns.$sym76$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    ans = web_utilities.get_html_source_from_url(url_string(url), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        else if (!ans.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        else if (evaluation_defns.NIL != Sequences.find((SubLObject)evaluation_defns.$int238$255, ans, Symbols.symbol_function((SubLObject)evaluation_defns.$sym211$_), Symbols.symbol_function((SubLObject)evaluation_defns.$sym239$CHAR_CODE), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        else {
            if (evaluation_defns.NIL != unicode_strings.non_ascii_string_p(ans) && evaluation_defns.NIL != Sequences.search((SubLObject)evaluation_defns.$str240$charset_utf_8, ans, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                return unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(ans));
            }
            return ans;
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 61428L)
    public static SubLObject cyc_get_from_http_source(final SubLObject args) {
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject query_string = (SubLObject)evaluation_defns.NIL;
        if (Sequences.length(args).numG((SubLObject)evaluation_defns.TWO_INTEGER)) {
            query_string = encode_list_for_simple_http_server(conses_high.cddr(args));
        }
        if (evaluation_defns.NIL != query_string) {
            final SubLObject real_port = (SubLObject)(conses_high.cadr(args).eql((SubLObject)evaluation_defns.$kw207$DEFAULT) ? evaluation_defns.$int242$80 : conses_high.cadr(args));
            SubLObject channel = (SubLObject)evaluation_defns.NIL;
            try {
                channel = subl_promotions.open_tcp_stream_with_timeout(args.first(), real_port, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.$kw243$PRIVATE);
                if (evaluation_defns.NIL != subl_macro_promotions.validate_tcp_connection(channel, args.first(), real_port)) {
                    web_utilities.send_http_request(channel, (SubLObject)ConsesLow.list(new SubLObject[] { evaluation_defns.$kw244$MACHINE, args.first(), evaluation_defns.$kw245$PORT, conses_high.cadr(args), evaluation_defns.$kw246$METHOD, evaluation_defns.$kw247$GET, evaluation_defns.$kw248$URL, evaluation_defns.$str249$simple_http_get, evaluation_defns.$kw250$QUERY, query_string, evaluation_defns.$kw251$KEEP_ALIVE_, evaluation_defns.T, evaluation_defns.$kw252$WIDE_NEWLINES_, evaluation_defns.NIL, evaluation_defns.$kw253$ACCEPT_TYPES, evaluation_defns.$kw207$DEFAULT, evaluation_defns.$kw254$CONTENT_TYPE, evaluation_defns.$kw207$DEFAULT, evaluation_defns.$kw255$SOAP_ACTION_URI, evaluation_defns.NIL }));
                    result = web_utilities.http_response_body(web_utilities.read_until_eof(channel, (SubLObject)evaluation_defns.UNPROVIDED));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)evaluation_defns.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (evaluation_defns.NIL != channel) {
                        streams_high.close(channel, (SubLObject)evaluation_defns.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        else {
            final SubLObject real_port = (SubLObject)(conses_high.cadr(args).eql((SubLObject)evaluation_defns.$kw207$DEFAULT) ? evaluation_defns.$int242$80 : conses_high.cadr(args));
            SubLObject channel = (SubLObject)evaluation_defns.NIL;
            try {
                channel = subl_promotions.open_tcp_stream_with_timeout(args.first(), real_port, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.$kw243$PRIVATE);
                if (evaluation_defns.NIL != subl_macro_promotions.validate_tcp_connection(channel, args.first(), real_port)) {
                    web_utilities.send_http_request(channel, (SubLObject)ConsesLow.list(new SubLObject[] { evaluation_defns.$kw244$MACHINE, args.first(), evaluation_defns.$kw245$PORT, conses_high.cadr(args), evaluation_defns.$kw246$METHOD, evaluation_defns.$kw247$GET, evaluation_defns.$kw248$URL, evaluation_defns.$str249$simple_http_get, evaluation_defns.$kw250$QUERY, evaluation_defns.NIL, evaluation_defns.$kw251$KEEP_ALIVE_, evaluation_defns.T, evaluation_defns.$kw252$WIDE_NEWLINES_, evaluation_defns.NIL, evaluation_defns.$kw253$ACCEPT_TYPES, evaluation_defns.$kw207$DEFAULT, evaluation_defns.$kw254$CONTENT_TYPE, evaluation_defns.$kw207$DEFAULT, evaluation_defns.$kw255$SOAP_ACTION_URI, evaluation_defns.NIL }));
                    result = web_utilities.http_response_body(web_utilities.read_until_eof(channel, (SubLObject)evaluation_defns.UNPROVIDED));
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)evaluation_defns.T);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (evaluation_defns.NIL != channel) {
                        streams_high.close(channel, (SubLObject)evaluation_defns.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
        }
        return web_utilities.html_url_decode(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 62081L)
    public static SubLObject encode_list_for_simple_http_server(final SubLObject the_list) {
        SubLObject result = (SubLObject)evaluation_defns.$str31$;
        SubLObject cdolist_list_var = the_list;
        SubLObject the_element = (SubLObject)evaluation_defns.NIL;
        the_element = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            result = Sequences.cconcatenate(result, new SubLObject[] { the_element.isString() ? web_utilities.html_url_encode(Sequences.cconcatenate((SubLObject)evaluation_defns.$str257$_, new SubLObject[] { the_element, evaluation_defns.$str257$_ }), (SubLObject)evaluation_defns.UNPROVIDED) : web_utilities.html_url_encode(string_utilities.to_string(the_element), (SubLObject)evaluation_defns.UNPROVIDED), evaluation_defns.$str258$_ });
            cdolist_list_var = cdolist_list_var.rest();
            the_element = cdolist_list_var.first();
        }
        return string_utilities.post_remove(result, (SubLObject)evaluation_defns.$str258$_, (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 62452L)
    public static SubLObject cyc_term_uri_fn(final SubLObject cyc_term) {
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        if (evaluation_defns.NIL != cycl_grammar.cycl_nat_p(cyc_term) && cycl_utilities.nat_functor(cyc_term).eql(evaluation_defns.$const259$SchemaObjectFn) && evaluation_defns.NIL != string_utilities.starts_with(cycl_utilities.formula_arg2(cyc_term, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.$str260$_) && evaluation_defns.NIL != string_utilities.ends_with(cycl_utilities.formula_arg2(cyc_term, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.$str261$_, (SubLObject)evaluation_defns.UNPROVIDED)) {
            result = string_utilities.substring(cycl_utilities.formula_arg2(cyc_term, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.ONE_INTEGER, Numbers.subtract(Sequences.length(cycl_utilities.formula_arg2(cyc_term, (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.ONE_INTEGER));
        }
        else {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 62940L)
    public static SubLObject city_named_fn_defn(final SubLObject the_string, final SubLObject the_country) {
        if (!the_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject all_candidates = (SubLObject)evaluation_defns.NIL;
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        all_candidates = lexicon_accessors.denots_of_name_string(the_string, (SubLObject)evaluation_defns.T, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL == result) {
            SubLObject csome_list_var = all_candidates;
            SubLObject candidate = (SubLObject)evaluation_defns.NIL;
            candidate = csome_list_var.first();
            while (evaluation_defns.NIL == result && evaluation_defns.NIL != csome_list_var) {
                if (evaluation_defns.NIL != isa.isa_in_any_mtP(candidate, evaluation_defns.$const263$City) && evaluation_defns.NIL != city_in_regionP(candidate, the_country)) {
                    result = candidate;
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            }
        }
        return (evaluation_defns.NIL != result) ? result : cycl_utilities.reify_when_closed_naut((SubLObject)ConsesLow.list(evaluation_defns.$const264$CityNamedFn, the_string, the_country));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 63897L)
    public static SubLObject city_in_regionP(final SubLObject city, final SubLObject region) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject city_in_regionP = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)evaluation_defns.T, thread);
            city_in_regionP = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(evaluation_defns.$const233$geopoliticalSubdivision, region, city), mt, (SubLObject)evaluation_defns.$list266));
        }
        finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return city_in_regionP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 64245L)
    public static SubLObject text_topic_structure(final SubLObject source_string) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_string, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject string = (evaluation_defns.NIL != unicodeP) ? unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(source_string, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) : source_string;
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject doc = document.new_document(string, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        return parsing_utilities.complete_text_topic_structure_tagging(concept_tagger.tag_concepts(doc, (SubLObject)ConsesLow.list((SubLObject)evaluation_defns.$kw267$OUTPUT_SPEC, nl_api_datastructures.new_nl_interpretation_spec((SubLObject)evaluation_defns.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 64854L)
    public static SubLObject el_list_to_subl_list(final SubLObject el_list) {
        if (evaluation_defns.NIL == el_utilities.el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.el_list_items(el_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 65082L)
    public static SubLObject cyc_ordering_result(final SubLObject total_ordering) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject base_set = backward.removal_ask_variable((SubLObject)evaluation_defns.$kw270$BASE_SET, (SubLObject)ConsesLow.listS(evaluation_defns.$const271$baseSet, total_ordering, (SubLObject)evaluation_defns.$list272), mt_relevance_macros.inference_relevant_mt(), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED).first();
                    final SubLObject ordering_relation = backward.removal_ask_variable((SubLObject)evaluation_defns.$kw273$ORDERING_RELATION, (SubLObject)ConsesLow.listS(evaluation_defns.$const274$orderingRelation, total_ordering, (SubLObject)evaluation_defns.$list275), mt_relevance_macros.inference_relevant_mt(), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED).first();
                    ans = (SubLObject)((evaluation_defns.NIL != base_set && evaluation_defns.NIL != ordering_relation) ? cyc_ordering_result_internal(base_set, ordering_relation) : evaluation_defns.NIL);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == el_utilities.el_list_p(ans)) {
            relation_evaluation.throw_unevaluatable();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 65857L)
    public static SubLObject ordering_L(final SubLObject element1, final SubLObject element2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(backward.removal_ask(el_utilities.make_binary_formula(evaluation_defns.$cyc_ordering_relation$.getDynamicValue(thread), element1, element2), mt_relevance_macros.inference_relevant_mt(), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 66125L)
    public static SubLObject cyc_ordering_result_internal(final SubLObject base_set, final SubLObject ordering_relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements = backward.removal_ask_variable((SubLObject)evaluation_defns.$kw277$ELEMENT, (SubLObject)ConsesLow.list(evaluation_defns.$const278$elementOf, (SubLObject)evaluation_defns.$kw277$ELEMENT, base_set), mt_relevance_macros.inference_relevant_mt(), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject ans = (SubLObject)evaluation_defns.NIL;
        final SubLObject _prev_bind_0 = evaluation_defns.$cyc_ordering_relation$.currentBinding(thread);
        try {
            evaluation_defns.$cyc_ordering_relation$.bind(ordering_relation, thread);
            final SubLObject sorted = Sort.sort(elements, (SubLObject)evaluation_defns.$sym279$ORDERING__, (SubLObject)evaluation_defns.UNPROVIDED);
            ans = el_utilities.make_el_list(sorted, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        finally {
            evaluation_defns.$cyc_ordering_relation$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 66489L)
    public static SubLObject cyc_time_of_day_of_date(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = date_utilities.time_of_day_of_date(date);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 68561L)
    public static SubLObject cyc_seconds_since_1970_to_date(final SubLObject seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject universal_time = Numbers.add(seconds, date_utilities.$start_of_1970$.getGlobalValue());
                    result = date_utilities.universal_time_to_cycl_date(universal_time);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 69079L)
    public static SubLObject cyc_date_to_seconds_since_1970(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = Numbers.subtract(date_utilities.cycl_date_to_universal_time(date), date_utilities.$start_of_1970$.getGlobalValue());
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 69543L)
    public static SubLObject cyc_types_most_often_asserted_using_tool(final SubLObject tool, final SubLObject result_length) {
        return el_utilities.make_el_list(types_most_often_asserted_using_tool(tool, result_length, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 69910L)
    public static SubLObject types_most_often_asserted_using_tool(final SubLObject tool, SubLObject result_length, SubLObject exclude_list, SubLObject exclude_if_not_list) {
        if (result_length == evaluation_defns.UNPROVIDED) {
            result_length = (SubLObject)evaluation_defns.TEN_INTEGER;
        }
        if (exclude_list == evaluation_defns.UNPROVIDED) {
            exclude_list = (SubLObject)evaluation_defns.NIL;
        }
        if (exclude_if_not_list == evaluation_defns.UNPROVIDED) {
            exclude_if_not_list = (SubLObject)evaluation_defns.NIL;
        }
        assert evaluation_defns.NIL != assertion_generating_tool_p(tool) : tool;
        assert evaluation_defns.NIL != subl_promotions.non_negative_integer_p(result_length) : result_length;
        assert evaluation_defns.NIL != list_utilities.non_dotted_list_p(exclude_list) : exclude_list;
        assert evaluation_defns.NIL != list_utilities.non_dotted_list_p(exclude_if_not_list) : exclude_if_not_list;
        final SubLObject count_by_type = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)evaluation_defns.EQ), (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject cdolist_list_var = genl_predicates.all_spec_predicates(evaluation_defns.$const289$assertedUsingTool, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject spec_pred = (SubLObject)evaluation_defns.NIL;
        spec_pred = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject assertion = (SubLObject)evaluation_defns.NIL;
            final SubLObject pred_var = spec_pred;
            if (evaluation_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(tool, (SubLObject)evaluation_defns.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(tool, (SubLObject)evaluation_defns.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)evaluation_defns.NIL;
                final SubLObject token_var = (SubLObject)evaluation_defns.NIL;
                while (evaluation_defns.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (evaluation_defns.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)evaluation_defns.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)evaluation_defns.$kw287$GAF, (SubLObject)evaluation_defns.NIL, (SubLObject)evaluation_defns.NIL);
                            SubLObject done_var_$63 = (SubLObject)evaluation_defns.NIL;
                            final SubLObject token_var_$64 = (SubLObject)evaluation_defns.NIL;
                            while (evaluation_defns.NIL == done_var_$63) {
                                final SubLObject assertion_$65 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                final SubLObject valid_$66 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$64.eql(assertion_$65));
                                if (evaluation_defns.NIL != valid_$66) {
                                    assertion = assertions_high.gaf_arg(assertion_$65, (SubLObject)evaluation_defns.ONE_INTEGER);
                                    if (evaluation_defns.NIL != assertion_handles.assertion_p(assertion)) {
                                        final SubLObject pred = assertions_high.gaf_predicate(assertion);
                                        if (evaluation_defns.NIL != genls.genlP(pred, evaluation_defns.$const179$isa, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) || evaluation_defns.NIL != genls.genlP(pred, evaluation_defns.$const288$genls, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                                            final SubLObject type = assertions_high.gaf_arg2(assertion);
                                            dictionary_utilities.dictionary_increment(count_by_type, type, (SubLObject)evaluation_defns.UNPROVIDED);
                                        }
                                    }
                                }
                                done_var_$63 = (SubLObject)SubLObjectFactory.makeBoolean(evaluation_defns.NIL == valid_$66);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)evaluation_defns.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (evaluation_defns.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(evaluation_defns.NIL == valid);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        }
        SubLObject types_sorted = dictionary_utilities.sort_dictionary_by_values(count_by_type, Symbols.symbol_function((SubLObject)evaluation_defns.$sym290$_));
        SubLObject cdolist_list_var2 = exclude_list;
        SubLObject collection = (SubLObject)evaluation_defns.NIL;
        collection = cdolist_list_var2.first();
        while (evaluation_defns.NIL != cdolist_list_var2) {
            types_sorted = Sequences.delete(collection, types_sorted, Symbols.symbol_function((SubLObject)evaluation_defns.EQL), Symbols.symbol_function((SubLObject)evaluation_defns.$sym291$CAR), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            collection = cdolist_list_var2.first();
        }
        cdolist_list_var2 = exclude_if_not_list;
        SubLObject predicate = (SubLObject)evaluation_defns.NIL;
        predicate = cdolist_list_var2.first();
        while (evaluation_defns.NIL != cdolist_list_var2) {
            types_sorted = list_utilities.delete_if_not(predicate, types_sorted, Symbols.symbol_function((SubLObject)evaluation_defns.$sym291$CAR), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            predicate = cdolist_list_var2.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym291$CAR), list_utilities.first_n(result_length, types_sorted));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 71929L)
    public static SubLObject assertion_generating_tool_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, evaluation_defns.$const292$AssertionGeneratingRKFTool);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 72045L)
    public static SubLObject cyc_html_for_text_containing_strings(final SubLObject text_string, final SubLObject string_cyc_set) {
        SubLObject result_string = pph_utilities.pph_remove_html_tags(text_string, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject text_between_text_tags = string_utilities.get_substring_between_tags(result_string, (SubLObject)evaluation_defns.$str293$_TEXT_, (SubLObject)evaluation_defns.$str294$__TEXT_, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL != string_utilities.non_empty_stringP(text_between_text_tags)) {
            result_string = text_between_text_tags;
        }
        result_string = string_utilities.trim_whitespace(result_string);
        SubLObject cdolist_list_var = el_utilities.extensional_set_elements(string_cyc_set);
        SubLObject term_string = (SubLObject)evaluation_defns.NIL;
        term_string = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            result_string = string_utilities.string_substitute(Sequences.cconcatenate((SubLObject)evaluation_defns.$str295$_b_, new SubLObject[] { term_string, evaluation_defns.$str296$__b_ }), term_string, result_string, (SubLObject)evaluation_defns.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            term_string = cdolist_list_var.first();
        }
        final SubLObject separate_sentences = string_utilities.separate_sentences(result_string, (SubLObject)evaluation_defns.UNPROVIDED);
        final SubLObject sentence_bold_tag_counts = Mapping.mapcar((SubLObject)evaluation_defns.$sym297$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS_COUNT_BOLD_TAGS, separate_sentences);
        SubLObject saved_sentences = (SubLObject)evaluation_defns.NIL;
        SubLObject sentence = (SubLObject)evaluation_defns.NIL;
        SubLObject sentence_$67 = (SubLObject)evaluation_defns.NIL;
        SubLObject sentence_bold_tag_count = (SubLObject)evaluation_defns.NIL;
        SubLObject sentence_bold_tag_count_$68 = (SubLObject)evaluation_defns.NIL;
        sentence = separate_sentences;
        sentence_$67 = sentence.first();
        sentence_bold_tag_count = sentence_bold_tag_counts;
        sentence_bold_tag_count_$68 = sentence_bold_tag_count.first();
        while (evaluation_defns.NIL != sentence_bold_tag_count || evaluation_defns.NIL != sentence) {
            if (sentence_bold_tag_count_$68.numG((SubLObject)evaluation_defns.ZERO_INTEGER)) {
                saved_sentences = (SubLObject)ConsesLow.cons(sentence_$67, saved_sentences);
            }
            sentence = sentence.rest();
            sentence_$67 = sentence.first();
            sentence_bold_tag_count = sentence_bold_tag_count.rest();
            sentence_bold_tag_count_$68 = sentence_bold_tag_count.first();
        }
        result_string = string_utilities.join_strings(Sequences.nreverse(saved_sentences), (SubLObject)evaluation_defns.$str298$_____);
        if (evaluation_defns.NIL == result_string) {
            relation_evaluation.throw_unevaluatable();
        }
        return result_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 73581L)
    public static SubLObject cyc_html_for_text_containing_strings_count_bold_tags(final SubLObject sentence) {
        return Sequences.length(string_utilities.search_all((SubLObject)evaluation_defns.$str295$_b_, sentence, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 73709L)
    public static SubLObject cyc_format(final SubLObject format_string, final SubLObject arg_list) {
        return Functions.apply(Symbols.symbol_function((SubLObject)evaluation_defns.$sym300$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)evaluation_defns.NIL, (SubLObject)ConsesLow.cons(format_string, arg_list)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 74156L)
    public static SubLObject cyc_next_integer_in_sequence(final SubLObject cycl_term) {
        if (evaluation_defns.NIL == cycl_grammar.cycl_term_p(cycl_term)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_term = cycl_utilities.hl_to_el(cycl_term);
        SubLObject isg = (SubLObject)evaluation_defns.NIL;
        SubLObject release = (SubLObject)evaluation_defns.NIL;
        try {
            release = Locks.seize_lock(evaluation_defns.$term_to_isg_table_lock$.getGlobalValue());
            isg = dictionary.dictionary_lookup(evaluation_defns.$term_to_isg_table$.getGlobalValue(), v_term, (SubLObject)evaluation_defns.UNPROVIDED);
            if (evaluation_defns.NIL == isg) {
                isg = integer_sequence_generator.new_integer_sequence_generator((SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                dictionary.dictionary_enter(evaluation_defns.$term_to_isg_table$.getGlobalValue(), v_term, isg);
            }
        }
        finally {
            if (evaluation_defns.NIL != release) {
                Locks.release_lock(evaluation_defns.$term_to_isg_table_lock$.getGlobalValue());
            }
        }
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 74892L)
    public static SubLObject cyc_next_integer_in_sequence_starting_at(final SubLObject cycl_term, final SubLObject number) {
        if (evaluation_defns.NIL == cycl_grammar.cycl_term_p(cycl_term) || !number.isInteger() || !number.isPositive()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_term = cycl_utilities.hl_to_el(cycl_term);
        final SubLObject key_for_isg = (SubLObject)ConsesLow.cons(v_term, number);
        SubLObject isg = (SubLObject)evaluation_defns.NIL;
        SubLObject release = (SubLObject)evaluation_defns.NIL;
        try {
            release = Locks.seize_lock(evaluation_defns.$term_to_isg_wXstart_table_lock$.getGlobalValue());
            isg = dictionary.dictionary_lookup(evaluation_defns.$term_to_isg_wXstart_table$.getGlobalValue(), key_for_isg, (SubLObject)evaluation_defns.UNPROVIDED);
            if (evaluation_defns.NIL == isg) {
                isg = integer_sequence_generator.new_integer_sequence_generator(number, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                dictionary.dictionary_enter(evaluation_defns.$term_to_isg_wXstart_table$.getGlobalValue(), key_for_isg, isg);
            }
        }
        finally {
            if (evaluation_defns.NIL != release) {
                Locks.release_lock(evaluation_defns.$term_to_isg_wXstart_table_lock$.getGlobalValue());
            }
        }
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 75560L)
    public static SubLObject cyc_cyclify(final SubLObject sentence, final SubLObject parser_constant) {
        if (!sentence.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_parser = parser_constant.eql(evaluation_defns.$const308$LinkParser) ? parser.new_link_parser((SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) : (parser_constant.eql(evaluation_defns.$const309$CharniakParser) ? parser.new_charniak_parser((SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) : relation_evaluation.throw_unevaluatable());
        return el_utilities.make_el_list(cyclifier.cyclify(sentence, (SubLObject)ConsesLow.list((SubLObject)evaluation_defns.$kw310$PARSER, v_parser)), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 76045L)
    public static SubLObject cyc_concatenate_strings(final SubLObject strings) {
        if (evaluation_defns.NIL == list_utilities.non_dotted_list_p(strings) || evaluation_defns.NIL == list_utilities.every_in_list((SubLObject)evaluation_defns.$sym312$CYCL_STRING_P, strings, (SubLObject)evaluation_defns.UNPROVIDED)) {
            return relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.concatenate_strings(strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 76475L)
    public static SubLObject cyc_concatenate_list_of_strings(final SubLObject el_list_of_strings) {
        if (evaluation_defns.NIL != el_utilities.el_list_p(el_list_of_strings)) {
            final SubLObject strings = el_utilities.el_list_items(el_list_of_strings);
            if (evaluation_defns.NIL != list_utilities.non_dotted_list_p(strings) && evaluation_defns.NIL != list_utilities.every_in_list((SubLObject)evaluation_defns.$sym312$CYCL_STRING_P, strings, (SubLObject)evaluation_defns.UNPROVIDED)) {
                return string_utilities.concatenate_strings(strings);
            }
        }
        return relation_evaluation.throw_unevaluatable();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77048L)
    public static SubLObject cyc_term_similarity_metric(final SubLObject term1, final SubLObject term2) {
        return kb_utilities.term_similarity_metric(term1, term2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject check_wn_sks_registered() {
        if (evaluation_defns.NIL != sksi_infrastructure_utilities.sk_source_registeredP(evaluation_defns.$const316$WordNet2_0_KS, (SubLObject)evaluation_defns.UNPROVIDED)) {
            return (SubLObject)evaluation_defns.$kw317$WN_SKS_REGISTERED;
        }
        return relation_evaluation.throw_unevaluatable();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject cyc_wn_all_candidate_cycls_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return el_utilities.make_el_set(wordnet_utilities.wn_all_candidate_cycls_for_word_unitXpos(word_unit, pos, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject cyc_wn_all_hypernyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return el_utilities.make_el_set(wordnet_utilities.wn_all_hypernyms_for_word_unitXpos(word_unit, pos), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject cyc_wn_all_synonyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return el_utilities.make_el_set(wordnet_utilities.wn_all_synonyms_for_word_unitXpos(word_unit, pos), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject cyc_wn_ranked_candidate_cycls_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return el_utilities.make_el_list(Mapping.mapcar((SubLObject)evaluation_defns.$sym321$MAKE_EL_SET, wordnet_utilities.wn_ranked_candidate_cycls_for_word_unitXpos(word_unit, pos, (SubLObject)evaluation_defns.$kw322$STRONG, (SubLObject)evaluation_defns.$kw323$COLLECTIONS, (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject cyc_wn_ranked_hypernyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return el_utilities.make_el_list(Mapping.mapcar((SubLObject)evaluation_defns.$sym321$MAKE_EL_SET, wordnet_utilities.wn_ranked_hypernyms_for_word_unitXpos(word_unit, pos)), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 77297L)
    public static SubLObject cyc_wn_ranked_synonyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return el_utilities.make_el_list(Mapping.mapcar((SubLObject)evaluation_defns.$sym321$MAKE_EL_SET, wordnet_utilities.wn_ranked_synonyms_for_word_unitXpos(word_unit, pos)), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 79460L)
    public static SubLObject cyc_kb_orthogonal(final SubLObject col1, final SubLObject col2) {
        if (evaluation_defns.NIL == fort_types_interface.collection_p(col1) || evaluation_defns.NIL == fort_types_interface.collection_p(col2)) {
            relation_evaluation.throw_unevaluatable();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(evaluation_defns.NIL == genls.genlsP(col1, col2, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == genls.genlsP(col2, col1, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == disjoint_with.disjoint_withP(col1, col2, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 79797L)
    public static SubLObject cyc_content_of_file(final SubLObject file_path) {
        return file_utilities.slurp_file(file_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 80028L)
    public static SubLObject cyc_transform_relation_tuples(final SubLObject relation_tuples) {
        SubLObject result = (SubLObject)ConsesLow.list(evaluation_defns.$const140$TheList);
        SubLObject cdolist_list_var = relation_tuples.rest();
        SubLObject middle = (SubLObject)evaluation_defns.NIL;
        middle = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject middle_new = (SubLObject)ConsesLow.list(evaluation_defns.$const140$TheList);
            SubLObject cdolist_list_var_$69 = middle.rest();
            SubLObject inner = (SubLObject)evaluation_defns.NIL;
            inner = cdolist_list_var_$69.first();
            while (evaluation_defns.NIL != cdolist_list_var_$69) {
                middle_new = (SubLObject)ConsesLow.cons(unlist(inner), middle_new);
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                inner = cdolist_list_var_$69.first();
            }
            result = (SubLObject)ConsesLow.cons(Sequences.nreverse(middle_new), result);
            cdolist_list_var = cdolist_list_var.rest();
            middle = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 80459L)
    public static SubLObject unlist(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !evaluation_defns.$const140$TheList.eql(list.first())) {
            Errors.error((SubLObject)evaluation_defns.$str330$_a_doesn_t_start_with___TheList, list);
        }
        final SubLObject operator = cycl_utilities.formula_arg1(list, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL != fort_types_interface.functionP(operator)) {
            return cycl_utilities.formula_args(list, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        if (evaluation_defns.NIL != fort_types_interface.predicateP(operator)) {
            return cycl_utilities.formula_args(list, (SubLObject)evaluation_defns.UNPROVIDED);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 80751L)
    public static SubLObject cyc_provable_via_defns(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL != el_utilities.el_binary_formula_p(asent)) {
            thread.resetMultipleValues();
            final SubLObject pred = el_utilities.unmake_binary_formula(asent);
            final SubLObject ins = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject result = provable_via_defns_proper(pred, ins, col);
            if (evaluation_defns.NIL == result && evaluation_defns.NIL != el_utilities.possibly_naut_p(ins)) {
                final SubLObject pcase_var = pred;
                if (pcase_var.eql(evaluation_defns.$const179$isa)) {
                    final SubLObject known_cols = kb_accessors.result_isa(cycl_utilities.naut_functor(ins), (SubLObject)evaluation_defns.UNPROVIDED);
                    result = genls.any_specP(col, known_cols, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                }
                else if (pcase_var.eql(evaluation_defns.$const331$quotedIsa)) {
                    final SubLObject known_cols = kb_accessors.result_quoted_isa(cycl_utilities.naut_functor(ins), (SubLObject)evaluation_defns.UNPROVIDED);
                    result = genls.any_specP(col, known_cols, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                }
            }
            return result;
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 81508L)
    public static SubLObject provable_via_defns_proper(final SubLObject pred, final SubLObject ins, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)evaluation_defns.NIL, thread);
            if (pred.eql(evaluation_defns.$const179$isa)) {
                return at_defns.quiet_defns_admitP(col, ins, (SubLObject)evaluation_defns.UNPROVIDED);
            }
            if (pred.eql(evaluation_defns.$const331$quotedIsa)) {
                return at_defns.quiet_quoted_defns_admitP(col, ins, (SubLObject)evaluation_defns.UNPROVIDED);
            }
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 81760L)
    public static SubLObject current_inference_answer_justification_proof_view() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == inference_datastructures_proof.proof_p(inference_strategist.$current_inference_answer_justification_proof_being_cached$.getDynamicValue(thread)) || evaluation_defns.NIL == inference_datastructures_inference.inference_answer_p(inference_strategist.$current_inference_answer_being_cached$.getDynamicValue(thread))) {
            relation_evaluation.throw_unevaluatable();
        }
        return proof_view.proof_view_xml(proof_view.proof_view_get_id(proof_view.construct_inference_proof_view(inference_strategist.$current_inference_answer_justification_proof_being_cached$.getDynamicValue(thread), inference_strategist.$current_inference_answer_being_cached$.getDynamicValue(thread), (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 82363L)
    public static SubLObject cyc_find_object_by_compact_hl_external_id_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(string);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 82768L)
    public static SubLObject cyc_compact_hl_external_id_string(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = kb_utilities.compact_hl_external_id_string(v_object);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 83102L)
    public static SubLObject cyc_decode_ka_interaction(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(v_object);
                    if (evaluation_defns.NIL == result && v_object.isString()) {
                        result = el_utilities.make_el_formula(evaluation_defns.$const336$KAObjectInteractionFn, (SubLObject)ConsesLow.list(v_object), (SubLObject)evaluation_defns.UNPROVIDED);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 83553L)
    public static SubLObject cyc_most_recently_started_events_by_agent_relative_to_interaction_mt_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = most_recently_started_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
                    if (evaluation_defns.NIL != result) {
                        result = el_utilities.make_el_list(result, (SubLObject)evaluation_defns.UNPROVIDED);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            result = evaluation_defns.$const338$TheEmptyList;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 85765L)
    public static SubLObject most_recently_started_events_by_agent_relative_to_interaction_mt(final SubLObject agent, final SubLObject interaction_mt) {
        SubLObject interaction_mts_to_check = (SubLObject)ConsesLow.list(interaction_mt);
        SubLObject interaction_mts_checked = (SubLObject)evaluation_defns.NIL;
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        while (evaluation_defns.NIL != interaction_mts_to_check) {
            final SubLObject interaction_mt_to_check = interaction_mts_to_check.first();
            interaction_mts_checked = (SubLObject)ConsesLow.cons(interaction_mt_to_check, interaction_mts_checked);
            interaction_mts_to_check = interaction_mts_to_check.rest();
            final SubLObject executed_events = executed_events_for_agent_in_interaction_mt(agent, interaction_mt_to_check);
            if (evaluation_defns.NIL != executed_events) {
                SubLObject cdolist_list_var = executed_events;
                SubLObject executed_event = (SubLObject)evaluation_defns.NIL;
                executed_event = cdolist_list_var.first();
                while (evaluation_defns.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(executed_event, result);
                    cdolist_list_var = cdolist_list_var.rest();
                    executed_event = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var2;
                final SubLObject prior_mts = cdolist_list_var2 = Sequences.remove_duplicates(ConsesLow.append(kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const340$laterOrSameInteractionHistoryMt, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const341$laterInteractionHistoryMt, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const342$laterInteractionHistoryMt_Direct, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const343$laterInteractionHistoryMtForSimul, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                SubLObject prior_mt = (SubLObject)evaluation_defns.NIL;
                prior_mt = cdolist_list_var2.first();
                while (evaluation_defns.NIL != cdolist_list_var2) {
                    if (evaluation_defns.NIL == list_utilities.member_kbeqP(prior_mt, interaction_mts_checked)) {
                        interaction_mts_to_check = (SubLObject)ConsesLow.cons(prior_mt, interaction_mts_to_check);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    prior_mt = cdolist_list_var2.first();
                }
            }
        }
        if (evaluation_defns.NIL != result && evaluation_defns.NIL == list_utilities.singletonP(result)) {
            Errors.warn((SubLObject)evaluation_defns.$str344$More_than_one_recently_started_ev, agent, interaction_mt, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 87191L)
    public static SubLObject executed_events_for_agent_in_interaction_mt(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLObject planned_events = kb_mapping_utilities.pred_values(interaction_mt, evaluation_defns.$const345$executionOfPlannedEventBeginsInCo, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject executed_events = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = planned_events;
        SubLObject planned_event = (SubLObject)evaluation_defns.NIL;
        planned_event = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$70 = kb_mapping_utilities.pred_values(planned_event, evaluation_defns.$const347$executionOfPlannedEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
            SubLObject executed_event = (SubLObject)evaluation_defns.NIL;
            executed_event = cdolist_list_var_$70.first();
            while (evaluation_defns.NIL != cdolist_list_var_$70) {
                if (evaluation_defns.NIL != kb_mapping_utilities.pred_u_v_holds(evaluation_defns.$const346$performedByInBELLAUI, executed_event, agent, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                    executed_events = (SubLObject)ConsesLow.cons(executed_event, executed_events);
                }
                cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                executed_event = cdolist_list_var_$70.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            planned_event = cdolist_list_var.first();
        }
        return executed_events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 87670L)
    public static SubLObject executed_unfinished_events_for_agent_in_interaction_mt(final SubLObject agent, final SubLObject interaction_mt, SubLObject perspective_mt) {
        if (perspective_mt == evaluation_defns.UNPROVIDED) {
            perspective_mt = (SubLObject)evaluation_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject planned_events = kb_mapping_utilities.pred_values(interaction_mt, evaluation_defns.$const345$executionOfPlannedEventBeginsInCo, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
        SubLObject executed_events = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = planned_events;
        SubLObject planned_event = (SubLObject)evaluation_defns.NIL;
        planned_event = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$71 = kb_mapping_utilities.pred_values(planned_event, evaluation_defns.$const347$executionOfPlannedEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
            SubLObject executed_event = (SubLObject)evaluation_defns.NIL;
            executed_event = cdolist_list_var_$71.first();
            while (evaluation_defns.NIL != cdolist_list_var_$71) {
                if (evaluation_defns.NIL != kb_mapping_utilities.pred_u_v_holds(evaluation_defns.$const346$performedByInBELLAUI, executed_event, agent, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                    if (evaluation_defns.NIL != perspective_mt) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(perspective_mt);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (evaluation_defns.NIL == kb_mapping_utilities.pred_values(executed_event, evaluation_defns.$const348$finishedEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == kb_mapping_utilities.pred_values(executed_event, evaluation_defns.$const349$mistakenEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)) {
                                executed_events = (SubLObject)ConsesLow.cons(executed_event, executed_events);
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    else if (evaluation_defns.NIL == kb_mapping_utilities.pred_values(executed_event, evaluation_defns.$const348$finishedEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == kb_mapping_utilities.pred_values(executed_event, evaluation_defns.$const349$mistakenEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)) {
                        executed_events = (SubLObject)ConsesLow.cons(executed_event, executed_events);
                    }
                }
                cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                executed_event = cdolist_list_var_$71.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            planned_event = cdolist_list_var.first();
        }
        return executed_events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 88570L)
    public static SubLObject cyc_most_recently_started_unfinish_events_by_agent_relative_to_interaction_mt_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
                    if (evaluation_defns.NIL != result) {
                        result = el_utilities.make_el_list(result, (SubLObject)evaluation_defns.UNPROVIDED);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            result = evaluation_defns.$const338$TheEmptyList;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 88992L)
    public static SubLObject most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt(final SubLObject agent, final SubLObject interaction_mt) {
        SubLObject interaction_mts_to_check = (SubLObject)ConsesLow.list(interaction_mt);
        SubLObject interaction_mts_checked = (SubLObject)evaluation_defns.NIL;
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        while (evaluation_defns.NIL != interaction_mts_to_check) {
            final SubLObject interaction_mt_to_check = interaction_mts_to_check.first();
            interaction_mts_checked = (SubLObject)ConsesLow.cons(interaction_mt_to_check, interaction_mts_checked);
            interaction_mts_to_check = interaction_mts_to_check.rest();
            final SubLObject executed_unfinished_events = executed_unfinished_events_for_agent_in_interaction_mt(agent, interaction_mt_to_check, interaction_mt);
            if (evaluation_defns.NIL != executed_unfinished_events) {
                SubLObject cdolist_list_var = executed_unfinished_events;
                SubLObject event = (SubLObject)evaluation_defns.NIL;
                event = cdolist_list_var.first();
                while (evaluation_defns.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(event, result);
                    cdolist_list_var = cdolist_list_var.rest();
                    event = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var2;
                final SubLObject prior_mts = cdolist_list_var2 = Sequences.remove_duplicates(ConsesLow.append(kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const340$laterOrSameInteractionHistoryMt, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const341$laterInteractionHistoryMt, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const342$laterInteractionHistoryMt_Direct, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, evaluation_defns.$const343$laterInteractionHistoryMtForSimul, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                SubLObject prior_mt = (SubLObject)evaluation_defns.NIL;
                prior_mt = cdolist_list_var2.first();
                while (evaluation_defns.NIL != cdolist_list_var2) {
                    if (evaluation_defns.NIL == list_utilities.member_kbeqP(prior_mt, interaction_mts_checked)) {
                        interaction_mts_to_check = (SubLObject)ConsesLow.cons(prior_mt, interaction_mts_to_check);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    prior_mt = cdolist_list_var2.first();
                }
            }
        }
        if (evaluation_defns.NIL != result && evaluation_defns.NIL == list_utilities.singletonP(result)) {
            Errors.warn((SubLObject)evaluation_defns.$str344$More_than_one_recently_started_ev, agent, interaction_mt, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 90471L)
    public static SubLObject cyc_event_to_plan_for_by_agent_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = event_to_plan_for_by_agent_in_interaction_context(agent, interaction_mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 90993L)
    public static SubLObject event_to_plan_for_by_agent_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject most_recently_started_unfinished_events = most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
            SubLObject result = (SubLObject)evaluation_defns.NIL;
            SubLObject cdolist_list_var = most_recently_started_unfinished_events;
            SubLObject event = (SubLObject)evaluation_defns.NIL;
            event = cdolist_list_var.first();
            while (evaluation_defns.NIL != cdolist_list_var) {
                if (evaluation_defns.NIL == kb_mapping_utilities.pred_values(event, evaluation_defns.$const348$finishedEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == kb_mapping_utilities.pred_values(event, evaluation_defns.$const349$mistakenEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)) {
                    SubLObject subevents_of_event_were_planned_in_previous_contextP = (SubLObject)evaluation_defns.NIL;
                    SubLObject cdolist_list_var_$72 = Mapping.mapcar((SubLObject)evaluation_defns.$sym352$GAF_ARG3, kb_mapping_utilities.pred_u_v_holds_gafs(evaluation_defns.$const353$agentShouldAttemptToFindModelForE, agent, event, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED));
                    SubLObject possible_prior_mt = (SubLObject)evaluation_defns.NIL;
                    possible_prior_mt = cdolist_list_var_$72.first();
                    while (evaluation_defns.NIL != cdolist_list_var_$72) {
                        if (evaluation_defns.NIL != ghl_search_methods.ghl_predicate_relation_p(evaluation_defns.$const341$laterInteractionHistoryMt, possible_prior_mt, interaction_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                            subevents_of_event_were_planned_in_previous_contextP = (SubLObject)evaluation_defns.T;
                        }
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        possible_prior_mt = cdolist_list_var_$72.first();
                    }
                    if (evaluation_defns.NIL == subevents_of_event_were_planned_in_previous_contextP) {
                        result = (SubLObject)ConsesLow.cons(event, result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            }
            if (evaluation_defns.NIL != list_utilities.singletonP(result)) {
                return result.first();
            }
            if (evaluation_defns.NIL == result) {
                return (SubLObject)evaluation_defns.NIL;
            }
            Errors.warn((SubLObject)evaluation_defns.$str354$More_that_one_event_found_for__Ev, agent, interaction_mt, result);
            return result.first();
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 92509L)
    public static SubLObject cyc_plan_agent_should_execute_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = plan_agent_should_execute_in_interaction_context(agent, interaction_mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 93027L)
    public static SubLObject earlier_mt_or_abandonedP(final SubLObject test_mt, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (evaluation_defns.NIL != ghl_search_methods.ghl_predicate_relation_p(evaluation_defns.$const341$laterInteractionHistoryMt, test_mt, interaction_mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED) || evaluation_defns.NIL != kb_mapping_utilities.pred_values(test_mt, evaluation_defns.$const356$interactionContextAbandonedAtDate, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
                return (SubLObject)evaluation_defns.T;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 93314L)
    public static SubLObject plan_agent_should_execute_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL != event_to_plan_for_by_agent_in_interaction_context(agent, interaction_mt)) {
            return (SubLObject)evaluation_defns.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)evaluation_defns.$sym357$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(interaction_mt, thread);
            if (evaluation_defns.NIL != kb_mapping_utilities.pred_values(agent, evaluation_defns.$const358$eventModeledByPlannedByAtDate, (SubLObject)evaluation_defns.THREE_INTEGER, (SubLObject)evaluation_defns.FIVE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)) {
                return (SubLObject)evaluation_defns.NIL;
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject most_recently_started_events = most_recently_started_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
        SubLObject some_earlier_event_unfinishedP = (SubLObject)evaluation_defns.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (evaluation_defns.NIL == some_earlier_event_unfinishedP) {
                SubLObject csome_list_var = most_recently_started_events;
                SubLObject event = (SubLObject)evaluation_defns.NIL;
                event = csome_list_var.first();
                while (evaluation_defns.NIL == some_earlier_event_unfinishedP && evaluation_defns.NIL != csome_list_var) {
                    if (evaluation_defns.NIL == kb_mapping_utilities.fpred_value(event, evaluation_defns.$const348$finishedEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED) && evaluation_defns.NIL == kb_mapping_utilities.fpred_value(event, evaluation_defns.$const349$mistakenEvent, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)) {
                        some_earlier_event_unfinishedP = (SubLObject)evaluation_defns.T;
                    }
                    if (evaluation_defns.NIL == some_earlier_event_unfinishedP) {
                        final SubLObject start_mts = kb_mapping_utilities.pred_values(event, evaluation_defns.$const359$startedInMt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                        if (evaluation_defns.NIL == some_earlier_event_unfinishedP) {
                            SubLObject csome_list_var_$73 = start_mts;
                            SubLObject start_mt = (SubLObject)evaluation_defns.NIL;
                            start_mt = csome_list_var_$73.first();
                            while (evaluation_defns.NIL == some_earlier_event_unfinishedP && evaluation_defns.NIL != csome_list_var_$73) {
                                if (evaluation_defns.NIL == earlier_mt_or_abandonedP(start_mt, interaction_mt)) {
                                    some_earlier_event_unfinishedP = (SubLObject)evaluation_defns.T;
                                }
                                csome_list_var_$73 = csome_list_var_$73.rest();
                                start_mt = csome_list_var_$73.first();
                            }
                        }
                    }
                    if (evaluation_defns.NIL == some_earlier_event_unfinishedP) {
                        final SubLObject finish_mts = ConsesLow.append(kb_mapping_utilities.pred_values(event, evaluation_defns.$const360$finishedInMt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED), kb_mapping_utilities.pred_values(event, evaluation_defns.$const361$mistakenInMt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
                        if (evaluation_defns.NIL == some_earlier_event_unfinishedP) {
                            SubLObject csome_list_var_$74 = finish_mts;
                            SubLObject finish_mt = (SubLObject)evaluation_defns.NIL;
                            finish_mt = csome_list_var_$74.first();
                            while (evaluation_defns.NIL == some_earlier_event_unfinishedP && evaluation_defns.NIL != csome_list_var_$74) {
                                if (evaluation_defns.NIL == earlier_mt_or_abandonedP(finish_mt, interaction_mt)) {
                                    some_earlier_event_unfinishedP = (SubLObject)evaluation_defns.T;
                                }
                                csome_list_var_$74 = csome_list_var_$74.rest();
                                finish_mt = csome_list_var_$74.first();
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    event = csome_list_var.first();
                }
            }
            if (evaluation_defns.NIL == some_earlier_event_unfinishedP && !kb_indexing.num_predicate_extent_index(evaluation_defns.$const348$finishedEvent, interaction_mt).isZero()) {
                some_earlier_event_unfinishedP = (SubLObject)evaluation_defns.T;
            }
            if (evaluation_defns.NIL == some_earlier_event_unfinishedP) {
                final SubLObject highest_priority_item_on_agenda = highest_priority_item_on_agenda_for_agent_in_interaction_context(agent, interaction_mt);
                if (evaluation_defns.NIL == kb_mapping_utilities.pred_values(highest_priority_item_on_agenda, evaluation_defns.$const345$executionOfPlannedEventBeginsInCo, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)) {
                    return highest_priority_item_on_agenda;
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
        }
        thread.resetMultipleValues();
        final SubLObject new_plan = highest_priority_item_on_agenda_for_agent_in_interaction_context(agent, interaction_mt);
        final SubLObject new_plan_priority = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = most_recently_started_events;
        SubLObject executed_event = (SubLObject)evaluation_defns.NIL;
        executed_event = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            final SubLObject plans = kb_mapping_utilities.pred_values(executed_event, evaluation_defns.$const347$executionOfPlannedEvent, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
            final SubLObject agendas = kb_mapping_utilities.pred_values(agent, evaluation_defns.$const362$agentAgenda, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
            final SubLObject v_agenda = agendas.first();
            if (evaluation_defns.NIL != v_agenda && evaluation_defns.NIL == list_utilities.singletonP(agendas)) {
                Errors.warn((SubLObject)evaluation_defns.$str363$More_than_one_agenda_found_for__H, agent, interaction_mt, agendas);
            }
            SubLObject cdolist_list_var_$75 = plans;
            SubLObject plan = (SubLObject)evaluation_defns.NIL;
            plan = cdolist_list_var_$75.first();
            while (evaluation_defns.NIL != cdolist_list_var_$75) {
                final SubLObject plan_priorities = Sequences.remove_duplicates(Mapping.mapcar((SubLObject)evaluation_defns.$sym352$GAF_ARG3, kb_mapping_utilities.pred_u_v_holds_gafs(evaluation_defns.$const364$agendaHasTaskWithPriority, v_agenda, plan, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED)), (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                final SubLObject plan_priority = Functions.apply((SubLObject)evaluation_defns.$sym365$MAX, plan_priorities);
                if (evaluation_defns.NIL != plan_priority && evaluation_defns.NIL == list_utilities.singletonP(plan_priorities)) {
                    Errors.warn((SubLObject)evaluation_defns.$str366$More_than_one_priority_found_for_, v_agenda, plan, plan_priorities);
                }
                if (new_plan_priority.numG(plan_priority)) {
                    return new_plan;
                }
                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                plan = cdolist_list_var_$75.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            executed_event = cdolist_list_var.first();
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 97382L)
    public static SubLObject cyc_agent_cannot_progress_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = agent_cannot_progress_in_interaction_context(agent, interaction_mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 97888L)
    public static SubLObject agent_cannot_progress_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        if (evaluation_defns.NIL != event_to_plan_for_by_agent_in_interaction_context(agent, interaction_mt)) {
            return evaluation_defns.$const368$False;
        }
        if (evaluation_defns.NIL != plan_agent_should_execute_in_interaction_context(agent, interaction_mt)) {
            return evaluation_defns.$const368$False;
        }
        return evaluation_defns.$const369$True;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 98194L)
    public static SubLObject cyc_highest_priority_item_on_agenda_for_agent_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = highest_priority_item_on_agenda_for_agent_in_interaction_context(agent, interaction_mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 98819L)
    public static SubLObject highest_priority_item_on_agenda_for_agent_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject todo_mts = Mapping.mapcar((SubLObject)evaluation_defns.$sym371$GAF_ARG2, kb_mapping_utilities.pred_u_v_holds_gafs(evaluation_defns.$const372$agentToDoMtAndHistoryCoincideAtDa, agent, interaction_mt, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.THREE_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED));
            final SubLObject agendas = kb_mapping_utilities.pred_values(agent, evaluation_defns.$const362$agentAgenda, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.UNPROVIDED);
            final SubLObject todo_mt = todo_mts.first();
            final SubLObject v_agenda = agendas.first();
            if (evaluation_defns.NIL != todo_mt && evaluation_defns.NIL == list_utilities.singletonP(todo_mts)) {
                Errors.warn((SubLObject)evaluation_defns.$str373$More_than_one_todo_mt_found_for__, agent, interaction_mt, todo_mts);
            }
            if (evaluation_defns.NIL != v_agenda && evaluation_defns.NIL == list_utilities.singletonP(agendas)) {
                Errors.warn((SubLObject)evaluation_defns.$str363$More_than_one_agenda_found_for__H, agent, interaction_mt, agendas);
            }
            if (evaluation_defns.NIL != todo_mt && evaluation_defns.NIL != v_agenda) {
                return highest_priority_item_on_agenda_in_to_do_mt(v_agenda, todo_mt);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 99927L)
    public static SubLObject cyc_highest_priority_item_on_agenda_in_to_do_mt_fn(final SubLObject v_agenda, final SubLObject todo_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = highest_priority_item_on_agenda_in_to_do_mt(v_agenda, todo_mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 100410L)
    public static SubLObject highest_priority_item_on_agenda_in_to_do_mt(final SubLObject v_agenda, final SubLObject todo_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)evaluation_defns.$sym357$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(todo_mt, thread);
            final SubLObject task_priority_pairs = kb_mapping_utilities.pred_value_tuples(v_agenda, evaluation_defns.$const364$agendaHasTaskWithPriority, (SubLObject)evaluation_defns.ONE_INTEGER, (SubLObject)evaluation_defns.$list375, (SubLObject)evaluation_defns.UNPROVIDED);
            if (evaluation_defns.NIL != task_priority_pairs) {
                final SubLObject task_priority_pair = Sort.sort(task_priority_pairs, (SubLObject)evaluation_defns.$sym290$_, (SubLObject)evaluation_defns.$sym376$SECOND).first();
                return Values.values(task_priority_pair.first(), conses_high.second(task_priority_pair));
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 100797L)
    public static SubLObject cyc_likelihood_of_truth_of_sentence(final SubLObject sent, final SubLObject mt) {
        if (!sent.isList()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (evaluation_defns.NIL == isa.isaP(mt, evaluation_defns.$const377$Microtheory, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = temporal_projection.likelihood_of_truth_of_sentence(sent, mt, (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL != result) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 101201L)
    public static SubLObject cyc_time_intervals_for_sentence(final SubLObject sent, final SubLObject mt) {
        if (!sent.isList()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (evaluation_defns.NIL == isa.isaP(mt, evaluation_defns.$const377$Microtheory, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym379$FORMULA_ARG0), temporal_projection.time_intervals_for_sentence(sent, mt, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED));
        if (evaluation_defns.NIL != result) {
            result = (SubLObject)ConsesLow.cons(evaluation_defns.$const142$TheSet, result);
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 101655L)
    public static SubLObject cyc_evaluate_math_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        thread.resetMultipleValues();
        final SubLObject result = math_expression_utilities.math_expression_evaluate(expression);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        if (evaluation_defns.NIL != error_message) {
            Errors.warn((SubLObject)evaluation_defns.$str381$math_expression_evaluate_error___, error_message);
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 102174L)
    public static SubLObject cyc_flatten_math_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject error_message = (SubLObject)evaluation_defns.NIL;
        thread.resetMultipleValues();
        final SubLObject result = math_expression_utilities.math_expression_flatten(expression);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        if (evaluation_defns.NIL != error_message) {
            Errors.warn((SubLObject)evaluation_defns.$str383$math_expression_flatten_error___A, error_message);
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 102686L)
    public static SubLObject cyc_apply_operation_to_math_statement(final SubLObject statement, final SubLObject operation, final SubLObject v_term) {
        final SubLObject result = math_expression_utilities.apply_operation_to_math_statement(statement, operation, v_term);
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 103036L)
    public static SubLObject cyc_serialize_mathml(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$76 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind((SubLObject)evaluation_defns.NIL, thread);
                        try {
                            xml_vars.$xml_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                            mathml.serialize_mathml(expression);
                            result = streams_high.get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
                        }
                        finally {
                            final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)evaluation_defns.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                streams_high.close(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)evaluation_defns.UNPROVIDED);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$76, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 103368L)
    public static SubLObject cyc_cartesian_product(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == el_utilities.el_list_p(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
        try {
            thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject input_el_sets = el_utilities.el_list_items(expression);
                    final SubLObject input_hl_sets = Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym387$EXTENSIONAL_SET_ELEMENTS), input_el_sets);
                    final SubLObject hl_cartesian_product = list_utilities.cartesian_product(input_hl_sets, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED, (SubLObject)evaluation_defns.UNPROVIDED);
                    final SubLObject result_el_lists = Mapping.mapcar(Symbols.symbol_function((SubLObject)evaluation_defns.$sym388$MAKE_EL_LIST), hl_cartesian_product);
                    result = el_utilities.make_el_extensional_set(result_el_lists);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/evaluation-defns.lisp", position = 103999L)
    public static SubLObject cyc_filter_list(final SubLObject unary_pred, final SubLObject el_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (evaluation_defns.NIL == el_utilities.el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = (SubLObject)evaluation_defns.NIL;
        final SubLObject items = el_utilities.el_list_items(el_list);
        SubLObject filtered_items = (SubLObject)evaluation_defns.NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)evaluation_defns.NIL;
        item = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = (SubLObject)evaluation_defns.NIL;
            try {
                thread.throwStack.push(evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluation_defns.$sym68$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (evaluation_defns.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(unary_pred, item), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)evaluation_defns.UNPROVIDED)) {
                            filtered_items = (SubLObject)ConsesLow.cons(item, filtered_items);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)evaluation_defns.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluation_defns.$kw67$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        result = el_utilities.make_el_list(Sequences.nreverse(filtered_items), (SubLObject)evaluation_defns.UNPROVIDED);
        if (evaluation_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    public static SubLObject declare_evaluation_defns_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "evaluatable_predicate_count", "EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_true_subl", "CYC-TRUE-SUBL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_different", "CYC-DIFFERENT", 1, 0, false);
        new $cyc_different$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_different_symbols", "CYC-DIFFERENT-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_precedes", "CYC-STRING-PRECEDES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_precedes_case_insensitive", "CYC-STRING-PRECEDES-CASE-INSENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_precedes_internal", "CYC-STRING-PRECEDES-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substring_predicate", "CYC-SUBSTRING-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substring_case_insensitive_predicate", "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substring_predicate_internal", "CYC-SUBSTRING-PREDICATE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_prefix_substring", "CYC-PREFIX-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_suffix_substring", "CYC-SUFFIX-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_subword_predicate", "CYC-SUBWORD-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_find_constant", "CYC-FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "evaluatable_function_count", "EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_evaluate_subl", "CYC-EVALUATE-SUBL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_upcase", "CYC-STRING-UPCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "string_upcase_defn", "STRING-UPCASE-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_downcase", "CYC-STRING-DOWNCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substring", "CYC-SUBSTRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_concat", "CYC-STRING-CONCAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_strings_to_phrase", "CYC-STRINGS-TO-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_pre_remove", "CYC-PRE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_replace_substring", "CYC-REPLACE-SUBSTRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "unicode_naut_or_ascii_string_p", "UNICODE-NAUT-OR-ASCII-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_unique_ws", "CYC-UNIQUE-WS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "generate_names_for_term", "GENERATE-NAMES-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_remove_substring", "CYC-REMOVE-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_post_remove", "CYC-POST-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_trim_whitespace", "CYC-TRIM-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_search", "CYC-STRING-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_length", "CYC-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_to_integer", "CYC-STRING-TO-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_integral_number_to_integer", "CYC-INTEGRAL-NUMBER-TO-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_integer_to_string", "CYC-INTEGER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_stringify_fn", "CYC-STRINGIFY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_syntactic_disquotation", "CYC-SYNTACTIC-DISQUOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "identify_pattern", "IDENTIFY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_to_real_number", "CYC-STRING-TO-REAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_real_number_to_string", "CYC-REAL-NUMBER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "max_supported_formula_arity", "MAX-SUPPORTED-FORMULA-ARITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_tokenize", "CYC-STRING-TOKENIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_string_to_nth_code_point", "CYC-STRING-TO-NTH-CODE-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_http_url_encode", "CYC-HTTP-URL-ENCODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_xml_value_string", "CYC-XML-VALUE-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_http_url_decode", "CYC-HTTP-URL-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_acronym_from_string", "CYC-ACRONYM-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_image", "CYC-HTML-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "html_image_plist", "HTML-IMAGE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_table_data", "CYC-HTML-TABLE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_table_data_variable_arity", "CYC-HTML-TABLE-DATA-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "html_table_data_plist", "HTML-TABLE-DATA-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_table_row", "CYC-HTML-TABLE-ROW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_table_row_variable_arity", "CYC-HTML-TABLE-ROW-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "html_table_row_plist", "HTML-TABLE-ROW-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_table", "CYC-HTML-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_table_variable_arity", "CYC-HTML-TABLE-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "html_table_plist", "HTML-TABLE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_division", "CYC-HTML-DIVISION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_division_variable_arity", "CYC-HTML-DIVISION-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "output_html_division_content", "OUTPUT-HTML-DIVISION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "html_division_plist", "HTML-DIVISION-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "decode_html_option", "DECODE-HTML-OPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "parse_html_attribute", "PARSE-HTML-ATTRIBUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "parse_html_attribute_value", "PARSE-HTML-ATTRIBUTE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_contextual_url", "CYC-CONTEXTUAL-URL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "url_string", "URL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_term_from_sparql_uri", "CYC-TERM-FROM-SPARQL-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "open_cyc_uri_for_term", "OPEN-CYC-URI-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "canonical_uri_for_term", "CANONICAL-URI-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "resource_with_uri_fn_nat_p", "RESOURCE-WITH-URI-FN-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_remove_html_tags", "CYC-REMOVE-HTML-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_capitalize_smart", "CYC-CAPITALIZE-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_recapitalize_smart", "CYC-RECAPITALIZE-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_relation_arg", "CYC-RELATION-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_relation_args_list", "CYC-RELATION-ARGS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_relation_arg_set", "CYC-RELATION-ARG-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_quoted_relation_expression_arity", "CYC-QUOTED-RELATION-EXPRESSION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_relation_expression_arity", "CYC-RELATION-EXPRESSION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_identity", "CYC-IDENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_relation_tuples", "CYC-RELATION-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_relation_tuples_internal", "CYC-RELATION-TUPLES-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "convert_relation_to_kappa", "CONVERT-RELATION-TO-KAPPA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_formula", "CYC-SUBSTITUTE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_bilateral_form_of_sentence_left", "CYC-BILATERAL-FORM-OF-SENTENCE-LEFT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "symmetric_part_typeP", "SYMMETRIC-PART-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "left_form_of_symmetric_part_type", "LEFT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_bilateral_form_of_sentence_right", "CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "symmetry_neutralized_el_sentence_p", "SYMMETRY-NEUTRALIZED-EL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "right_form_of_symmetric_part_type", "RIGHT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "neutralize_symmetric_formula", "NEUTRALIZE-SYMMETRIC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "side_fn_naut_p", "SIDE-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_formula_arg", "CYC-SUBSTITUTE-FORMULA-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_formula_arg_position", "CYC-SUBSTITUTE-FORMULA-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_make_formula", "CYC-MAKE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_quoted_formula", "CYC-SUBSTITUTE-QUOTED-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_quoted_formula_arg", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_quoted_formula_arg_position", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_make_quoted_formula", "CYC-MAKE-QUOTED-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cycl_to_el_fn", "CYCL-TO-EL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_substitute_nlte", "CYC-SUBSTITUTE-NLTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "sem_trans_template_defn", "SEM-TRANS-TEMPLATE-DEFN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_word_strings", "CYC-WORD-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "word_strings_fn", "WORD-STRINGS-FN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "word_sequence_fn", "WORD-SEQUENCE-FN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_strings_of_word_sequence", "CYC-STRINGS-OF-WORD-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_instantiate", "CYC-INSTANTIATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_find_or_instantiate", "CYC-FIND-OR-INSTANTIATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_instantiate_set_formula", "CYC-INSTANTIATE-SET-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_instantiate_formula", "CYC-INSTANTIATE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_find_via_pred_value_or_create_via_template", "CYC-FIND-VIA-PRED-VALUE-OR-CREATE-VIA-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "clear_cached_find_via_pred_value_wrt_template", "CLEAR-CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "remove_cached_find_via_pred_value_wrt_template", "REMOVE-CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cached_find_via_pred_value_wrt_template_internal", "CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cached_find_via_pred_value_wrt_template", "CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "find_via_pred_value_wrt_template", "FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "create_and_assert_via_value_wrt_template", "CREATE-AND-ASSERT-VIA-VALUE-WRT-TEMPLATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "create_constant_from_value_wrt_template", "CREATE-CONSTANT-FROM-VALUE-WRT-TEMPLATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "compute_constant_assert_sentence_wrt_template", "COMPUTE-CONSTANT-ASSERT-SENTENCE-WRT-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_action_type_nlte", "CYC-ACTION-TYPE-NLTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "action_type_nlte", "ACTION-TYPE-NLTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "action_type_nltes", "ACTION-TYPE-NLTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_individual_denoting_unary_function_for", "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_collection_denoting_unary_function_for", "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "unary_functions_for", "UNARY-FUNCTIONS-FOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "unary_functionP", "UNARY-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "individual_denoting_fnP", "INDIVIDUAL-DENOTING-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_el_variable_fn", "CYC-EL-VARIABLE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_add_english_suffix", "CYC-ADD-ENGLISH-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "generate_phrase_defn", "GENERATE-PHRASE-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "generate_phrase_memoized_internal", "GENERATE-PHRASE-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "generate_phrase_memoized", "GENERATE-PHRASE-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "assertions_relevant_to_string_defn", "ASSERTIONS-RELEVANT-TO-STRING-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "assertions_for_prompt_string_memoized_internal", "ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "assertions_for_prompt_string_memoized", "ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "best_string_of_nl_phrase_defn", "BEST-STRING-OF-NL-PHRASE-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "best_string_of_nl_phrase_addressing_defn", "BEST-STRING-OF-NL-PHRASE-ADDRESSING-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "best_string_of_nl_phrase_with_force_defn", "BEST-STRING-OF-NL-PHRASE-WITH-FORCE-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "generate_gke_gloss_wrt_mt", "GENERATE-GKE-GLOSS-WRT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "basic_datum_paraphrase_defn", "BASIC-DATUM-PARAPHRASE-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "basic_datum_phrase_naut", "BASIC-DATUM-PHRASE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "paraphrase_of_formula_from_template_defn", "PARAPHRASE-OF-FORMULA-FROM-TEMPLATE-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "state_or_province_for_city_defn", "STATE-OR-PROVINCE-FOR-CITY-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_url_encode", "CYC-HTML-URL-ENCODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_url_source", "CYC-URL-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_get_from_http_source", "CYC-GET-FROM-HTTP-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "encode_list_for_simple_http_server", "ENCODE-LIST-FOR-SIMPLE-HTTP-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_term_uri_fn", "CYC-TERM-URI-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "city_named_fn_defn", "CITY-NAMED-FN-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "city_in_regionP", "CITY-IN-REGION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "text_topic_structure", "TEXT-TOPIC-STRUCTURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "el_list_to_subl_list", "EL-LIST-TO-SUBL-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_ordering_result", "CYC-ORDERING-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "ordering_L", "ORDERING-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_ordering_result_internal", "CYC-ORDERING-RESULT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_time_of_day_of_date", "CYC-TIME-OF-DAY-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_seconds_since_1970_to_date", "CYC-SECONDS-SINCE-1970-TO-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_date_to_seconds_since_1970", "CYC-DATE-TO-SECONDS-SINCE-1970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_types_most_often_asserted_using_tool", "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "types_most_often_asserted_using_tool", "TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "assertion_generating_tool_p", "ASSERTION-GENERATING-TOOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_for_text_containing_strings", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_html_for_text_containing_strings_count_bold_tags", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_format", "CYC-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_next_integer_in_sequence", "CYC-NEXT-INTEGER-IN-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_next_integer_in_sequence_starting_at", "CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_cyclify", "CYC-CYCLIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_concatenate_strings", "CYC-CONCATENATE-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_concatenate_list_of_strings", "CYC-CONCATENATE-LIST-OF-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_term_similarity_metric", "CYC-TERM-SIMILARITY-METRIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "check_wn_sks_registered", "CHECK-WN-SKS-REGISTERED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_wn_all_candidate_cycls_for_word_unitXpos", "CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_wn_all_hypernyms_for_word_unitXpos", "CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_wn_all_synonyms_for_word_unitXpos", "CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_wn_ranked_candidate_cycls_for_word_unitXpos", "CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_wn_ranked_hypernyms_for_word_unitXpos", "CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_wn_ranked_synonyms_for_word_unitXpos", "CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_kb_orthogonal", "CYC-KB-ORTHOGONAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_content_of_file", "CYC-CONTENT-OF-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_transform_relation_tuples", "CYC-TRANSFORM-RELATION-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "unlist", "UNLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_provable_via_defns", "CYC-PROVABLE-VIA-DEFNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "provable_via_defns_proper", "PROVABLE-VIA-DEFNS-PROPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "current_inference_answer_justification_proof_view", "CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-VIEW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_find_object_by_compact_hl_external_id_string", "CYC-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_compact_hl_external_id_string", "CYC-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_decode_ka_interaction", "CYC-DECODE-KA-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_most_recently_started_events_by_agent_relative_to_interaction_mt_fn", "CYC-MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "most_recently_started_events_by_agent_relative_to_interaction_mt", "MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "executed_events_for_agent_in_interaction_mt", "EXECUTED-EVENTS-FOR-AGENT-IN-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "executed_unfinished_events_for_agent_in_interaction_mt", "EXECUTED-UNFINISHED-EVENTS-FOR-AGENT-IN-INTERACTION-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_most_recently_started_unfinish_events_by_agent_relative_to_interaction_mt_fn", "CYC-MOST-RECENTLY-STARTED-UNFINISH-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt", "MOST-RECENTLY-STARTED-UNFINISHED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_event_to_plan_for_by_agent_in_interaction_context_fn", "CYC-EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "event_to_plan_for_by_agent_in_interaction_context", "EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_plan_agent_should_execute_in_interaction_context_fn", "CYC-PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "earlier_mt_or_abandonedP", "EARLIER-MT-OR-ABANDONED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "plan_agent_should_execute_in_interaction_context", "PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_agent_cannot_progress_in_interaction_context_fn", "CYC-AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "agent_cannot_progress_in_interaction_context", "AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_highest_priority_item_on_agenda_for_agent_in_interaction_context_fn", "CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "highest_priority_item_on_agenda_for_agent_in_interaction_context", "HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_highest_priority_item_on_agenda_in_to_do_mt_fn", "CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "highest_priority_item_on_agenda_in_to_do_mt", "HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_likelihood_of_truth_of_sentence", "CYC-LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_time_intervals_for_sentence", "CYC-TIME-INTERVALS-FOR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_evaluate_math_expression", "CYC-EVALUATE-MATH-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_flatten_math_expression", "CYC-FLATTEN-MATH-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_apply_operation_to_math_statement", "CYC-APPLY-OPERATION-TO-MATH-STATEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_serialize_mathml", "CYC-SERIALIZE-MATHML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_cartesian_product", "CYC-CARTESIAN-PRODUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.evaluation_defns", "cyc_filter_list", "CYC-FILTER-LIST", 2, 0, false);
        return (SubLObject)evaluation_defns.NIL;
    }
    
    public static SubLObject init_evaluation_defns_file() {
        evaluation_defns.$cycl_functions_used_as_evaluation_defns$ = SubLFiles.deflexical("*CYCL-FUNCTIONS-USED-AS-EVALUATION-DEFNS*", (SubLObject)evaluation_defns.$list0);
        evaluation_defns.$max_supported_formula_arity$ = SubLFiles.deflexical("*MAX-SUPPORTED-FORMULA-ARITY*", (SubLObject)evaluation_defns.$int72$1000);
        evaluation_defns.$bug_18769_switchP$ = SubLFiles.defparameter("*BUG-18769-SWITCH?*", (SubLObject)evaluation_defns.NIL);
        evaluation_defns.$word_strings_fn$ = SubLFiles.deflexical("*WORD-STRINGS-FN*", (SubLObject)evaluation_defns.NIL);
        evaluation_defns.$word_sequence_fn$ = SubLFiles.deflexical("*WORD-SEQUENCE-FN*", (SubLObject)evaluation_defns.NIL);
        evaluation_defns.$cached_find_via_pred_value_wrt_template_caching_state$ = SubLFiles.deflexical("*CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-CACHING-STATE*", (SubLObject)evaluation_defns.NIL);
        evaluation_defns.$use_new_nl_generation_api_for_generate_phrase_fnP$ = SubLFiles.deflexical("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*", (SubLObject)(maybeDefault((SubLObject)evaluation_defns.$sym204$_USE_NEW_NL_GENERATION_API_FOR_GENERATE_PHRASE_FN__, evaluation_defns.$use_new_nl_generation_api_for_generate_phrase_fnP$, evaluation_defns.NIL)));
        evaluation_defns.$assertions_relevant_to_string_defn_max_to_check$ = SubLFiles.deflexical("*ASSERTIONS-RELEVANT-TO-STRING-DEFN-MAX-TO-CHECK*", (SubLObject)evaluation_defns.$int208$500000);
        evaluation_defns.$cyc_ordering_relation$ = SubLFiles.defparameter("*CYC-ORDERING-RELATION*", (SubLObject)evaluation_defns.NIL);
        evaluation_defns.$term_to_isg_table_lock$ = SubLFiles.deflexical("*TERM-TO-ISG-TABLE-LOCK*", Locks.make_lock((SubLObject)evaluation_defns.$str302$term____isg_table_lock));
        evaluation_defns.$term_to_isg_table$ = SubLFiles.deflexical("*TERM-TO-ISG-TABLE*", maybeDefault((SubLObject)evaluation_defns.$sym303$_TERM_TO_ISG_TABLE_, evaluation_defns.$term_to_isg_table$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)evaluation_defns.EQUAL), (SubLObject)evaluation_defns.UNPROVIDED))));
        evaluation_defns.$term_to_isg_wXstart_table_lock$ = SubLFiles.deflexical("*TERM-TO-ISG-W/START-TABLE-LOCK*", Locks.make_lock((SubLObject)evaluation_defns.$str305$term____isg_w__start_table_lock));
        evaluation_defns.$term_to_isg_wXstart_table$ = SubLFiles.deflexical("*TERM-TO-ISG-W/START-TABLE*", maybeDefault((SubLObject)evaluation_defns.$sym306$_TERM_TO_ISG_W_START_TABLE_, evaluation_defns.$term_to_isg_wXstart_table$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)evaluation_defns.EQUAL), (SubLObject)evaluation_defns.UNPROVIDED))));
        return (SubLObject)evaluation_defns.NIL;
    }
    
    public static SubLObject setup_evaluation_defns_file() {
        SubLObject cdolist_list_var = evaluation_defns.$cycl_functions_used_as_evaluation_defns$.getGlobalValue();
        SubLObject symbol = (SubLObject)evaluation_defns.NIL;
        symbol = cdolist_list_var.first();
        while (evaluation_defns.NIL != cdolist_list_var) {
            utilities_macros.register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym5$CYC_TRUE_SUBL);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym7$CYC_DIFFERENT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym8$CYC_DIFFERENT_SYMBOLS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym9$CYC_STRING_PRECEDES);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym10$CYC_STRING_PRECEDES_CASE_INSENSITIVE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym12$CYC_SUBSTRING_PREDICATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym14$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym15$CYC_PREFIX_SUBSTRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym16$CYC_SUFFIX_SUBSTRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym17$CYC_SUBWORD_PREDICATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym20$CYC_FIND_CONSTANT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym22$CYC_EVALUATE_SUBL);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym23$CYC_STRING_UPCASE);
        access_macros.define_obsolete_register((SubLObject)evaluation_defns.$sym24$STRING_UPCASE_DEFN, (SubLObject)evaluation_defns.$list25);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym26$CYC_STRING_DOWNCASE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym27$CYC_SUBSTRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym30$CYC_STRING_CONCAT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym33$CYC_STRINGS_TO_PHRASE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym34$CYC_PRE_REMOVE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym37$CYC_REPLACE_SUBSTRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym38$CYC_UNIQUE_WS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym39$GENERATE_NAMES_FOR_TERM);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym40$CYC_REMOVE_SUBSTRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym41$CYC_POST_REMOVE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym42$CYC_TRIM_WHITESPACE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym43$CYC_STRING_SEARCH);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym44$CYC_LENGTH);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym46$CYC_STRING_TO_INTEGER);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym47$CYC_INTEGRAL_NUMBER_TO_INTEGER);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym48$CYC_INTEGER_TO_STRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym49$CYC_STRINGIFY_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym62$CYC_SYNTACTIC_DISQUOTATION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym51$CYC_STRING_TO_REAL_NUMBER);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym71$CYC_REAL_NUMBER_TO_STRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym73$CYC_STRING_TOKENIZE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym74$CYC_STRING_TO_NTH_CODE_POINT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym75$CYC_HTTP_URL_ENCODE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym77$CYC_XML_VALUE_STRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym78$CYC_HTTP_URL_DECODE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym79$CYC_ACRONYM_FROM_STRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym91$CYC_HTML_IMAGE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym99$CYC_HTML_TABLE_DATA);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym101$CYC_HTML_TABLE_DATA_VARIABLE_ARITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym104$CYC_HTML_TABLE_ROW);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym106$CYC_HTML_TABLE_ROW_VARIABLE_ARITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym115$CYC_HTML_TABLE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym116$CYC_HTML_TABLE_VARIABLE_ARITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym121$CYC_HTML_DIVISION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym122$CYC_HTML_DIVISION_VARIABLE_ARITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym129$CYC_CONTEXTUAL_URL);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym132$CYC_TERM_FROM_SPARQL_URI);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym133$OPEN_CYC_URI_FOR_TERM);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym134$CANONICAL_URI_FOR_TERM);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym136$CYC_REMOVE_HTML_TAGS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym137$CYC_CAPITALIZE_SMART);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym138$CYC_RECAPITALIZE_SMART);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym139$CYC_RELATION_ARG);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym141$CYC_RELATION_ARGS_LIST);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym143$CYC_RELATION_ARG_SET);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym144$CYC_QUOTED_RELATION_EXPRESSION_ARITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym145$CYC_RELATION_EXPRESSION_ARITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym146$CYC_IDENTITY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym147$CYC_RELATION_TUPLES);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym149$CYC_SUBSTITUTE_FORMULA);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym152$CYC_BILATERAL_FORM_OF_SENTENCE_LEFT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym156$CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym162$CYC_SUBSTITUTE_FORMULA_ARG);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym163$CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym164$CYC_MAKE_FORMULA);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym165$CYC_SUBSTITUTE_QUOTED_FORMULA);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym166$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym167$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym168$CYC_MAKE_QUOTED_FORMULA);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym169$CYCL_TO_EL_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym170$CYC_SUBSTITUTE_NLTE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym171$SEM_TRANS_TEMPLATE_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym172$CYC_WORD_STRINGS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym175$CYC_STRINGS_OF_WORD_SEQUENCE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym176$CYC_INSTANTIATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym178$CYC_FIND_OR_INSTANTIATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym183$CYC_FIND_VIA_PRED_VALUE_OR_CREATE_VIA_TEMPLATE);
        memoization_state.note_globally_cached_function((SubLObject)evaluation_defns.$sym184$CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym195$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym197$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym202$CYC_EL_VARIABLE_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym203$CYC_ADD_ENGLISH_SUFFIX);
        subl_macro_promotions.declare_defglobal((SubLObject)evaluation_defns.$sym204$_USE_NEW_NL_GENERATION_API_FOR_GENERATE_PHRASE_FN__);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym205$GENERATE_PHRASE_DEFN);
        memoization_state.note_memoized_function((SubLObject)evaluation_defns.$sym206$GENERATE_PHRASE_MEMOIZED);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym213$ASSERTIONS_RELEVANT_TO_STRING_DEFN);
        memoization_state.note_memoized_function((SubLObject)evaluation_defns.$sym214$ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym215$BEST_STRING_OF_NL_PHRASE_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym216$BEST_STRING_OF_NL_PHRASE_ADDRESSING_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym217$BEST_STRING_OF_NL_PHRASE_WITH_FORCE_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym218$GENERATE_GKE_GLOSS_WRT_MT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym219$BASIC_DATUM_PARAPHRASE_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym232$PARAPHRASE_OF_FORMULA_FROM_TEMPLATE_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym236$STATE_OR_PROVINCE_FOR_CITY_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym237$CYC_HTML_URL_ENCODE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym241$CYC_URL_SOURCE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym256$CYC_GET_FROM_HTTP_SOURCE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym262$CYC_TERM_URI_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym265$CITY_NAMED_FN_DEFN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym268$TEXT_TOPIC_STRUCTURE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym269$EL_LIST_TO_SUBL_LIST);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym276$CYC_ORDERING_RESULT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym280$CYC_TIME_OF_DAY_OF_DATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym281$CYC_SECONDS_SINCE_1970_TO_DATE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym282$CYC_DATE_TO_SECONDS_SINCE_1970);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym283$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym299$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym301$CYC_FORMAT);
        subl_macro_promotions.declare_defglobal((SubLObject)evaluation_defns.$sym303$_TERM_TO_ISG_TABLE_);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym304$CYC_NEXT_INTEGER_IN_SEQUENCE);
        subl_macro_promotions.declare_defglobal((SubLObject)evaluation_defns.$sym306$_TERM_TO_ISG_W_START_TABLE_);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym307$CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym311$CYC_CYCLIFY);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym313$CYC_CONCATENATE_STRINGS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym314$CYC_CONCATENATE_LIST_OF_STRINGS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym315$CYC_TERM_SIMILARITY_METRIC);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym318$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym319$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym320$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym324$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym325$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym326$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym327$CYC_KB_ORTHOGONAL);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym328$CYC_CONTENT_OF_FILE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym329$CYC_TRANSFORM_RELATION_TUPLES);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym332$CYC_PROVABLE_VIA_DEFNS);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym333$CURRENT_INFERENCE_ANSWER_JUSTIFICATION_PROOF_VIEW);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym334$CYC_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym335$CYC_COMPACT_HL_EXTERNAL_ID_STRING);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym337$CYC_DECODE_KA_INTERACTION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym339$CYC_MOST_RECENTLY_STARTED_EVENTS_BY_AGENT_RELATIVE_TO_INTERACTION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym350$CYC_MOST_RECENTLY_STARTED_UNFINISH_EVENTS_BY_AGENT_RELATIVE_TO_IN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym351$CYC_EVENT_TO_PLAN_FOR_BY_AGENT_IN_INTERACTION_CONTEXT_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym355$CYC_PLAN_AGENT_SHOULD_EXECUTE_IN_INTERACTION_CONTEXT_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym367$CYC_AGENT_CANNOT_PROGRESS_IN_INTERACTION_CONTEXT_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym370$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_FOR_AGENT_IN_INTERACTION_CONT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym374$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_IN_TO_DO_MT_FN);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym378$CYC_LIKELIHOOD_OF_TRUTH_OF_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym380$CYC_TIME_INTERVALS_FOR_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym382$CYC_EVALUATE_MATH_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym384$CYC_FLATTEN_MATH_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym385$CYC_APPLY_OPERATION_TO_MATH_STATEMENT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym386$CYC_SERIALIZE_MATHML);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym389$CYC_CARTESIAN_PRODUCT);
        utilities_macros.register_kb_function((SubLObject)evaluation_defns.$sym390$CYC_FILTER_LIST);
        return (SubLObject)evaluation_defns.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_evaluation_defns_file();
    }
    
    @Override
	public void initializeVariables() {
        init_evaluation_defns_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_evaluation_defns_file();
    }
    
    static {
        me = (SubLFile)new evaluation_defns();
        evaluation_defns.$cycl_functions_used_as_evaluation_defns$ = null;
        evaluation_defns.$max_supported_formula_arity$ = null;
        evaluation_defns.$bug_18769_switchP$ = null;
        evaluation_defns.$word_strings_fn$ = null;
        evaluation_defns.$word_sequence_fn$ = null;
        evaluation_defns.$cached_find_via_pred_value_wrt_template_caching_state$ = null;
        evaluation_defns.$use_new_nl_generation_api_for_generate_phrase_fnP$ = null;
        evaluation_defns.$assertions_relevant_to_string_defn_max_to_check$ = null;
        evaluation_defns.$cyc_ordering_relation$ = null;
        evaluation_defns.$term_to_isg_table_lock$ = null;
        evaluation_defns.$term_to_isg_table$ = null;
        evaluation_defns.$term_to_isg_wXstart_table_lock$ = null;
        evaluation_defns.$term_to_isg_wXstart_table$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-WHEN"));
        $sym1$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const2$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const3$evaluationDefn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn"));
        $const4$EvaluatablePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate"));
        $sym5$CYC_TRUE_SUBL = SubLObjectFactory.makeSymbol("CYC-TRUE-SUBL");
        $kw6$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym7$CYC_DIFFERENT = SubLObjectFactory.makeSymbol("CYC-DIFFERENT");
        $sym8$CYC_DIFFERENT_SYMBOLS = SubLObjectFactory.makeSymbol("CYC-DIFFERENT-SYMBOLS");
        $sym9$CYC_STRING_PRECEDES = SubLObjectFactory.makeSymbol("CYC-STRING-PRECEDES");
        $sym10$CYC_STRING_PRECEDES_CASE_INSENSITIVE = SubLObjectFactory.makeSymbol("CYC-STRING-PRECEDES-CASE-INSENSITIVE");
        $sym11$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $sym12$CYC_SUBSTRING_PREDICATE = SubLObjectFactory.makeSymbol("CYC-SUBSTRING-PREDICATE");
        $sym13$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $sym14$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE = SubLObjectFactory.makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");
        $sym15$CYC_PREFIX_SUBSTRING = SubLObjectFactory.makeSymbol("CYC-PREFIX-SUBSTRING");
        $sym16$CYC_SUFFIX_SUBSTRING = SubLObjectFactory.makeSymbol("CYC-SUFFIX-SUBSTRING");
        $sym17$CYC_SUBWORD_PREDICATE = SubLObjectFactory.makeSymbol("CYC-SUBWORD-PREDICATE");
        $str18$Could_not_find_constant__A_ = SubLObjectFactory.makeString("Could not find constant ~A.");
        $str19$Arg1_of___FindConstantFn_must_be_ = SubLObjectFactory.makeString("Arg1 of #$FindConstantFn must be a string: ~A.");
        $sym20$CYC_FIND_CONSTANT = SubLObjectFactory.makeSymbol("CYC-FIND-CONSTANT");
        $const21$EvaluatableFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatableFunction"));
        $sym22$CYC_EVALUATE_SUBL = SubLObjectFactory.makeSymbol("CYC-EVALUATE-SUBL");
        $sym23$CYC_STRING_UPCASE = SubLObjectFactory.makeSymbol("CYC-STRING-UPCASE");
        $sym24$STRING_UPCASE_DEFN = SubLObjectFactory.makeSymbol("STRING-UPCASE-DEFN");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-STRING-UPCASE"));
        $sym26$CYC_STRING_DOWNCASE = SubLObjectFactory.makeSymbol("CYC-STRING-DOWNCASE");
        $sym27$CYC_SUBSTRING = SubLObjectFactory.makeSymbol("CYC-SUBSTRING");
        $sym28$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym29$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym30$CYC_STRING_CONCAT = SubLObjectFactory.makeSymbol("CYC-STRING-CONCAT");
        $str31$ = SubLObjectFactory.makeString("");
        $str32$_ = SubLObjectFactory.makeString(" ");
        $sym33$CYC_STRINGS_TO_PHRASE = SubLObjectFactory.makeSymbol("CYC-STRINGS-TO-PHRASE");
        $sym34$CYC_PRE_REMOVE = SubLObjectFactory.makeSymbol("CYC-PRE-REMOVE");
        $int35$128 = SubLObjectFactory.makeInteger(128);
        $sym36$__ = SubLObjectFactory.makeSymbol("<=");
        $sym37$CYC_REPLACE_SUBSTRING = SubLObjectFactory.makeSymbol("CYC-REPLACE-SUBSTRING");
        $sym38$CYC_UNIQUE_WS = SubLObjectFactory.makeSymbol("CYC-UNIQUE-WS");
        $sym39$GENERATE_NAMES_FOR_TERM = SubLObjectFactory.makeSymbol("GENERATE-NAMES-FOR-TERM");
        $sym40$CYC_REMOVE_SUBSTRING = SubLObjectFactory.makeSymbol("CYC-REMOVE-SUBSTRING");
        $sym41$CYC_POST_REMOVE = SubLObjectFactory.makeSymbol("CYC-POST-REMOVE");
        $sym42$CYC_TRIM_WHITESPACE = SubLObjectFactory.makeSymbol("CYC-TRIM-WHITESPACE");
        $sym43$CYC_STRING_SEARCH = SubLObjectFactory.makeSymbol("CYC-STRING-SEARCH");
        $sym44$CYC_LENGTH = SubLObjectFactory.makeSymbol("CYC-LENGTH");
        $str45$_ = SubLObjectFactory.makeString(",");
        $sym46$CYC_STRING_TO_INTEGER = SubLObjectFactory.makeSymbol("CYC-STRING-TO-INTEGER");
        $sym47$CYC_INTEGRAL_NUMBER_TO_INTEGER = SubLObjectFactory.makeSymbol("CYC-INTEGRAL-NUMBER-TO-INTEGER");
        $sym48$CYC_INTEGER_TO_STRING = SubLObjectFactory.makeSymbol("CYC-INTEGER-TO-STRING");
        $sym49$CYC_STRINGIFY_FN = SubLObjectFactory.makeSymbol("CYC-STRINGIFY-FN");
        $kw50$MIXEDFRACTION = SubLObjectFactory.makeKeyword("MIXEDFRACTION");
        $sym51$CYC_STRING_TO_REAL_NUMBER = SubLObjectFactory.makeSymbol("CYC-STRING-TO-REAL-NUMBER");
        $str52$__0_9______0_9______0_9___ = SubLObjectFactory.makeString("([0-9]+) ([0-9]+)/([0-9]+)");
        $const53$MixedFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn"));
        $kw54$SIMPLEFRACTION = SubLObjectFactory.makeKeyword("SIMPLEFRACTION");
        $str55$__0_9______0_9___ = SubLObjectFactory.makeString("([0-9]+)/([0-9]+)");
        $const56$SimpleFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn"));
        $kw57$DECIMALNUMBER = SubLObjectFactory.makeKeyword("DECIMALNUMBER");
        $str58$__0_9_______0_9___ = SubLObjectFactory.makeString("([0-9]+)\\.([0-9]+)");
        $const59$DecimalFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn"));
        $kw60$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $str61$__0_9___ = SubLObjectFactory.makeString("([0-9]+)");
        $sym62$CYC_SYNTACTIC_DISQUOTATION = SubLObjectFactory.makeSymbol("CYC-SYNTACTIC-DISQUOTATION");
        $str63$_0_9____0_9____0_9__ = SubLObjectFactory.makeString("[0-9]+ [0-9]+/[0-9]+");
        $str64$_0_9____0_9__ = SubLObjectFactory.makeString("[0-9]+/[0-9]+");
        $str65$_0_9_____0_9__ = SubLObjectFactory.makeString("[0-9]+\\.[0-9]+");
        $str66$_0_9__ = SubLObjectFactory.makeString("[0-9]+");
        $kw67$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym68$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym69$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym70$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $sym71$CYC_REAL_NUMBER_TO_STRING = SubLObjectFactory.makeSymbol("CYC-REAL-NUMBER-TO-STRING");
        $int72$1000 = SubLObjectFactory.makeInteger(1000);
        $sym73$CYC_STRING_TOKENIZE = SubLObjectFactory.makeSymbol("CYC-STRING-TOKENIZE");
        $sym74$CYC_STRING_TO_NTH_CODE_POINT = SubLObjectFactory.makeSymbol("CYC-STRING-TO-NTH-CODE-POINT");
        $sym75$CYC_HTTP_URL_ENCODE = SubLObjectFactory.makeSymbol("CYC-HTTP-URL-ENCODE");
        $sym76$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym77$CYC_XML_VALUE_STRING = SubLObjectFactory.makeSymbol("CYC-XML-VALUE-STRING");
        $sym78$CYC_HTTP_URL_DECODE = SubLObjectFactory.makeSymbol("CYC-HTTP-URL-DECODE");
        $sym79$CYC_ACRONYM_FROM_STRING = SubLObjectFactory.makeSymbol("CYC-ACRONYM-FROM-STRING");
        $list80 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("ISMAP"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("ALT"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("BORDER") });
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER"));
        $kw82$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw83$ID = SubLObjectFactory.makeKeyword("ID");
        $kw84$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $kw85$ISMAP = SubLObjectFactory.makeKeyword("ISMAP");
        $kw86$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw87$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw88$ALT = SubLObjectFactory.makeKeyword("ALT");
        $kw89$ALIGN = SubLObjectFactory.makeKeyword("ALIGN");
        $kw90$BORDER = SubLObjectFactory.makeKeyword("BORDER");
        $sym91$CYC_HTML_IMAGE = SubLObjectFactory.makeSymbol("CYC-HTML-IMAGE");
        $list92 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NOWRAP"), SubLObjectFactory.makeSymbol("COLSPAN"), SubLObjectFactory.makeSymbol("ROWSPAN"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("VALIGN"), SubLObjectFactory.makeSymbol("BGCOLOR"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("ID") });
        $list93 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("COLSPAN"), SubLObjectFactory.makeKeyword("ROWSPAN"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("VALIGN"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("ID") });
        $kw94$NOWRAP = SubLObjectFactory.makeKeyword("NOWRAP");
        $kw95$COLSPAN = SubLObjectFactory.makeKeyword("COLSPAN");
        $kw96$ROWSPAN = SubLObjectFactory.makeKeyword("ROWSPAN");
        $kw97$VALIGN = SubLObjectFactory.makeKeyword("VALIGN");
        $kw98$BGCOLOR = SubLObjectFactory.makeKeyword("BGCOLOR");
        $sym99$CYC_HTML_TABLE_DATA = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-DATA");
        $list100 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"));
        $sym101$CYC_HTML_TABLE_DATA_VARIABLE_ARITY = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-DATA-VARIABLE-ARITY");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ALIGN"), (SubLObject)SubLObjectFactory.makeSymbol("VALIGN"), (SubLObject)SubLObjectFactory.makeSymbol("BGCOLOR"), (SubLObject)SubLObjectFactory.makeSymbol("HEIGHT"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("BGCOLOR"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"));
        $sym104$CYC_HTML_TABLE_ROW = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-ROW");
        $list105 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $sym106$CYC_HTML_TABLE_ROW_VARIABLE_ARITY = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-ROW-VARIABLE-ARITY");
        $list107 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NOFLOW"), SubLObjectFactory.makeSymbol("NOWRAP"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("BORDER"), SubLObjectFactory.makeSymbol("CELLPADDING"), SubLObjectFactory.makeSymbol("CELLSPACING"), SubLObjectFactory.makeSymbol("COLSPEC"), SubLObjectFactory.makeSymbol("UNITS"), SubLObjectFactory.makeSymbol("BGCOLOR"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("BACKGROUND") });
        $list108 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NOFLOW"), SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("BORDER"), SubLObjectFactory.makeKeyword("CELLPADDING"), SubLObjectFactory.makeKeyword("CELLSPACING"), SubLObjectFactory.makeKeyword("COLSPEC"), SubLObjectFactory.makeKeyword("UNITS"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("BACKGROUND") });
        $kw109$NOFLOW = SubLObjectFactory.makeKeyword("NOFLOW");
        $kw110$CELLPADDING = SubLObjectFactory.makeKeyword("CELLPADDING");
        $kw111$CELLSPACING = SubLObjectFactory.makeKeyword("CELLSPACING");
        $kw112$COLSPEC = SubLObjectFactory.makeKeyword("COLSPEC");
        $kw113$UNITS = SubLObjectFactory.makeKeyword("UNITS");
        $kw114$BACKGROUND = SubLObjectFactory.makeKeyword("BACKGROUND");
        $sym115$CYC_HTML_TABLE = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE");
        $sym116$CYC_HTML_TABLE_VARIABLE_ARITY = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-VARIABLE-ARITY");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("ONLOAD"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("ONLOAD"));
        $kw119$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $kw120$ONLOAD = SubLObjectFactory.makeKeyword("ONLOAD");
        $sym121$CYC_HTML_DIVISION = SubLObjectFactory.makeSymbol("CYC-HTML-DIVISION");
        $sym122$CYC_HTML_DIVISION_VARIABLE_ARITY = SubLObjectFactory.makeSymbol("CYC-HTML-DIVISION-VARIABLE-ARITY");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VALUE"));
        $list124 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list125 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str126$_ = SubLObjectFactory.makeString("%");
        $sym127$PARSE_HTML_ATTRIBUTE_VALUE = SubLObjectFactory.makeSymbol("PARSE-HTML-ATTRIBUTE-VALUE");
        $const128$URLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URLFn"));
        $sym129$CYC_CONTEXTUAL_URL = SubLObjectFactory.makeSymbol("CYC-CONTEXTUAL-URL");
        $list130 = ConsesLow.list((SubLObject)Characters.CHAR_less);
        $list131 = ConsesLow.list((SubLObject)Characters.CHAR_greater);
        $sym132$CYC_TERM_FROM_SPARQL_URI = SubLObjectFactory.makeSymbol("CYC-TERM-FROM-SPARQL-URI");
        $sym133$OPEN_CYC_URI_FOR_TERM = SubLObjectFactory.makeSymbol("OPEN-CYC-URI-FOR-TERM");
        $sym134$CANONICAL_URI_FOR_TERM = SubLObjectFactory.makeSymbol("CANONICAL-URI-FOR-TERM");
        $const135$ResourceWithURIFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn"));
        $sym136$CYC_REMOVE_HTML_TAGS = SubLObjectFactory.makeSymbol("CYC-REMOVE-HTML-TAGS");
        $sym137$CYC_CAPITALIZE_SMART = SubLObjectFactory.makeSymbol("CYC-CAPITALIZE-SMART");
        $sym138$CYC_RECAPITALIZE_SMART = SubLObjectFactory.makeSymbol("CYC-RECAPITALIZE-SMART");
        $sym139$CYC_RELATION_ARG = SubLObjectFactory.makeSymbol("CYC-RELATION-ARG");
        $const140$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $sym141$CYC_RELATION_ARGS_LIST = SubLObjectFactory.makeSymbol("CYC-RELATION-ARGS-LIST");
        $const142$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $sym143$CYC_RELATION_ARG_SET = SubLObjectFactory.makeSymbol("CYC-RELATION-ARG-SET");
        $sym144$CYC_QUOTED_RELATION_EXPRESSION_ARITY = SubLObjectFactory.makeSymbol("CYC-QUOTED-RELATION-EXPRESSION-ARITY");
        $sym145$CYC_RELATION_EXPRESSION_ARITY = SubLObjectFactory.makeSymbol("CYC-RELATION-EXPRESSION-ARITY");
        $sym146$CYC_IDENTITY = SubLObjectFactory.makeSymbol("CYC-IDENTITY");
        $sym147$CYC_RELATION_TUPLES = SubLObjectFactory.makeSymbol("CYC-RELATION-TUPLES");
        $const148$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $sym149$CYC_SUBSTITUTE_FORMULA = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-FORMULA");
        $sym150$SYMMETRIC_PART_TYPE_ = SubLObjectFactory.makeSymbol("SYMMETRIC-PART-TYPE?");
        $sym151$LEFT_FORM_OF_SYMMETRIC_PART_TYPE = SubLObjectFactory.makeSymbol("LEFT-FORM-OF-SYMMETRIC-PART-TYPE");
        $sym152$CYC_BILATERAL_FORM_OF_SENTENCE_LEFT = SubLObjectFactory.makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-LEFT");
        $const153$SymmetricAnatomicalPartType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricAnatomicalPartType"));
        $const154$LeftObjectOfPairFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftObjectOfPairFn"));
        $sym155$RIGHT_FORM_OF_SYMMETRIC_PART_TYPE = SubLObjectFactory.makeSymbol("RIGHT-FORM-OF-SYMMETRIC-PART-TYPE");
        $sym156$CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT = SubLObjectFactory.makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT");
        $const157$RightObjectOfPairFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightObjectOfPairFn"));
        $sym158$SIDE_FN_NAUT_P = SubLObjectFactory.makeSymbol("SIDE-FN-NAUT-P");
        $sym159$NAT_ARG1 = SubLObjectFactory.makeSymbol("NAT-ARG1");
        $sym160$_SIDEFN = SubLObjectFactory.makeSymbol("?SIDEFN");
        $const161$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $sym162$CYC_SUBSTITUTE_FORMULA_ARG = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");
        $sym163$CYC_SUBSTITUTE_FORMULA_ARG_POSITION = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");
        $sym164$CYC_MAKE_FORMULA = SubLObjectFactory.makeSymbol("CYC-MAKE-FORMULA");
        $sym165$CYC_SUBSTITUTE_QUOTED_FORMULA = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA");
        $sym166$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG");
        $sym167$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION");
        $sym168$CYC_MAKE_QUOTED_FORMULA = SubLObjectFactory.makeSymbol("CYC-MAKE-QUOTED-FORMULA");
        $sym169$CYCL_TO_EL_FN = SubLObjectFactory.makeSymbol("CYCL-TO-EL-FN");
        $sym170$CYC_SUBSTITUTE_NLTE = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-NLTE");
        $sym171$SEM_TRANS_TEMPLATE_DEFN = SubLObjectFactory.makeSymbol("SEM-TRANS-TEMPLATE-DEFN");
        $sym172$CYC_WORD_STRINGS = SubLObjectFactory.makeSymbol("CYC-WORD-STRINGS");
        $str173$WordStringsFn = SubLObjectFactory.makeString("WordStringsFn");
        $str174$WordSequenceFn = SubLObjectFactory.makeString("WordSequenceFn");
        $sym175$CYC_STRINGS_OF_WORD_SEQUENCE = SubLObjectFactory.makeSymbol("CYC-STRINGS-OF-WORD-SEQUENCE");
        $sym176$CYC_INSTANTIATE = SubLObjectFactory.makeSymbol("CYC-INSTANTIATE");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)evaluation_defns.ONE_INTEGER);
        $sym178$CYC_FIND_OR_INSTANTIATE = SubLObjectFactory.makeSymbol("CYC-FIND-OR-INSTANTIATE");
        $const179$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym180$_OBJ = SubLObjectFactory.makeSymbol("?OBJ");
        $const181$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const182$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $sym183$CYC_FIND_VIA_PRED_VALUE_OR_CREATE_VIA_TEMPLATE = SubLObjectFactory.makeSymbol("CYC-FIND-VIA-PRED-VALUE-OR-CREATE-VIA-TEMPLATE");
        $sym184$CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE = SubLObjectFactory.makeSymbol("CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE");
        $sym185$_CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-CACHING-STATE*");
        $const186$creationTemplateMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateMt"));
        $sym187$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $const188$creationTemplateConstantNameForma = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateConstantNameFormat"));
        $const189$creationTemplateSentenceTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateSentenceTemplate"));
        $kw190$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw191$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw192$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $const193$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $sym194$INDIVIDUAL_DENOTING_FN_ = SubLObjectFactory.makeSymbol("INDIVIDUAL-DENOTING-FN?");
        $sym195$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR = SubLObjectFactory.makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");
        $const196$resultGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $sym197$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR = SubLObjectFactory.makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");
        $sym198$UNARY_FUNCTION_ = SubLObjectFactory.makeSymbol("UNARY-FUNCTION?");
        $sym199$SKOLEM_FUNCTION_ = SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION?");
        $const200$UnaryFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryFunction"));
        $const201$IndividualDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndividualDenotingFunction"));
        $sym202$CYC_EL_VARIABLE_FN = SubLObjectFactory.makeSymbol("CYC-EL-VARIABLE-FN");
        $sym203$CYC_ADD_ENGLISH_SUFFIX = SubLObjectFactory.makeSymbol("CYC-ADD-ENGLISH-SUFFIX");
        $sym204$_USE_NEW_NL_GENERATION_API_FOR_GENERATE_PHRASE_FN__ = SubLObjectFactory.makeSymbol("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*");
        $sym205$GENERATE_PHRASE_DEFN = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-DEFN");
        $sym206$GENERATE_PHRASE_MEMOIZED = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-MEMOIZED");
        $kw207$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $int208$500000 = SubLObjectFactory.makeInteger(500000);
        $str209$__Got__D_scored_assertions___ = SubLObjectFactory.makeString("~&Got ~D scored assertions.~%");
        $list210 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION.NL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("VALUE"));
        $sym211$_ = SubLObjectFactory.makeSymbol("<");
        $str212$__Returning__D_assertions___ = SubLObjectFactory.makeString("~&Returning ~D assertions.~%");
        $sym213$ASSERTIONS_RELEVANT_TO_STRING_DEFN = SubLObjectFactory.makeSymbol("ASSERTIONS-RELEVANT-TO-STRING-DEFN");
        $sym214$ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED = SubLObjectFactory.makeSymbol("ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED");
        $sym215$BEST_STRING_OF_NL_PHRASE_DEFN = SubLObjectFactory.makeSymbol("BEST-STRING-OF-NL-PHRASE-DEFN");
        $sym216$BEST_STRING_OF_NL_PHRASE_ADDRESSING_DEFN = SubLObjectFactory.makeSymbol("BEST-STRING-OF-NL-PHRASE-ADDRESSING-DEFN");
        $sym217$BEST_STRING_OF_NL_PHRASE_WITH_FORCE_DEFN = SubLObjectFactory.makeSymbol("BEST-STRING-OF-NL-PHRASE-WITH-FORCE-DEFN");
        $sym218$GENERATE_GKE_GLOSS_WRT_MT = SubLObjectFactory.makeSymbol("GENERATE-GKE-GLOSS-WRT-MT");
        $sym219$BASIC_DATUM_PARAPHRASE_DEFN = SubLObjectFactory.makeSymbol("BASIC-DATUM-PARAPHRASE-DEFN");
        $kw220$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const221$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $sym222$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)evaluation_defns.NIL);
        $const224$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $kw225$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $kw226$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw227$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw228$QUIET = SubLObjectFactory.makeKeyword("QUIET");
        $const229$genTemplate_Constrained = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained"));
        $str230$Formula_does_not_meet_this_assert = SubLObjectFactory.makeString("Formula does not meet this assertion's constraints.");
        $sym231$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym232$PARAPHRASE_OF_FORMULA_FROM_TEMPLATE_DEFN = SubLObjectFactory.makeSymbol("PARAPHRASE-OF-FORMULA-FROM-TEMPLATE-DEFN");
        $const233$geopoliticalSubdivision = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision"));
        $const234$State_UnitedStates = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("State-UnitedStates"));
        $const235$CanadianProvince = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CanadianProvince"));
        $sym236$STATE_OR_PROVINCE_FOR_CITY_DEFN = SubLObjectFactory.makeSymbol("STATE-OR-PROVINCE-FOR-CITY-DEFN");
        $sym237$CYC_HTML_URL_ENCODE = SubLObjectFactory.makeSymbol("CYC-HTML-URL-ENCODE");
        $int238$255 = SubLObjectFactory.makeInteger(255);
        $sym239$CHAR_CODE = SubLObjectFactory.makeSymbol("CHAR-CODE");
        $str240$charset_utf_8 = SubLObjectFactory.makeString("charset=utf-8");
        $sym241$CYC_URL_SOURCE = SubLObjectFactory.makeSymbol("CYC-URL-SOURCE");
        $int242$80 = SubLObjectFactory.makeInteger(80);
        $kw243$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw244$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw245$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw246$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw247$GET = SubLObjectFactory.makeKeyword("GET");
        $kw248$URL = SubLObjectFactory.makeKeyword("URL");
        $str249$simple_http_get = SubLObjectFactory.makeString("simple-http-get");
        $kw250$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw251$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw252$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw253$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw254$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw255$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $sym256$CYC_GET_FROM_HTTP_SOURCE = SubLObjectFactory.makeSymbol("CYC-GET-FROM-HTTP-SOURCE");
        $str257$_ = SubLObjectFactory.makeString("\"");
        $str258$_ = SubLObjectFactory.makeString("&");
        $const259$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $str260$_ = SubLObjectFactory.makeString("<");
        $str261$_ = SubLObjectFactory.makeString(">");
        $sym262$CYC_TERM_URI_FN = SubLObjectFactory.makeSymbol("CYC-TERM-URI-FN");
        $const263$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $const264$CityNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $sym265$CITY_NAMED_FN_DEFN = SubLObjectFactory.makeSymbol("CITY-NAMED-FN-DEFN");
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI"))));
        $kw267$OUTPUT_SPEC = SubLObjectFactory.makeKeyword("OUTPUT-SPEC");
        $sym268$TEXT_TOPIC_STRUCTURE = SubLObjectFactory.makeSymbol("TEXT-TOPIC-STRUCTURE");
        $sym269$EL_LIST_TO_SUBL_LIST = SubLObjectFactory.makeSymbol("EL-LIST-TO-SUBL-LIST");
        $kw270$BASE_SET = SubLObjectFactory.makeKeyword("BASE-SET");
        $const271$baseSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseSet"));
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASE-SET"));
        $kw273$ORDERING_RELATION = SubLObjectFactory.makeKeyword("ORDERING-RELATION");
        $const274$orderingRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("orderingRelation"));
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERING-RELATION"));
        $sym276$CYC_ORDERING_RESULT = SubLObjectFactory.makeSymbol("CYC-ORDERING-RESULT");
        $kw277$ELEMENT = SubLObjectFactory.makeKeyword("ELEMENT");
        $const278$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym279$ORDERING__ = SubLObjectFactory.makeSymbol("ORDERING-<");
        $sym280$CYC_TIME_OF_DAY_OF_DATE = SubLObjectFactory.makeSymbol("CYC-TIME-OF-DAY-OF-DATE");
        $sym281$CYC_SECONDS_SINCE_1970_TO_DATE = SubLObjectFactory.makeSymbol("CYC-SECONDS-SINCE-1970-TO-DATE");
        $sym282$CYC_DATE_TO_SECONDS_SINCE_1970 = SubLObjectFactory.makeSymbol("CYC-DATE-TO-SECONDS-SINCE-1970");
        $sym283$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL = SubLObjectFactory.makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");
        $sym284$ASSERTION_GENERATING_TOOL_P = SubLObjectFactory.makeSymbol("ASSERTION-GENERATING-TOOL-P");
        $sym285$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym286$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $kw287$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const288$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const289$assertedUsingTool = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedUsingTool"));
        $sym290$_ = SubLObjectFactory.makeSymbol(">");
        $sym291$CAR = SubLObjectFactory.makeSymbol("CAR");
        $const292$AssertionGeneratingRKFTool = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssertionGeneratingRKFTool"));
        $str293$_TEXT_ = SubLObjectFactory.makeString("<TEXT>");
        $str294$__TEXT_ = SubLObjectFactory.makeString("</TEXT>");
        $str295$_b_ = SubLObjectFactory.makeString("<b>");
        $str296$__b_ = SubLObjectFactory.makeString("</b>");
        $sym297$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS_COUNT_BOLD_TAGS = SubLObjectFactory.makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS");
        $str298$_____ = SubLObjectFactory.makeString(" ... ");
        $sym299$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS = SubLObjectFactory.makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS");
        $sym300$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym301$CYC_FORMAT = SubLObjectFactory.makeSymbol("CYC-FORMAT");
        $str302$term____isg_table_lock = SubLObjectFactory.makeString("term -> isg table lock");
        $sym303$_TERM_TO_ISG_TABLE_ = SubLObjectFactory.makeSymbol("*TERM-TO-ISG-TABLE*");
        $sym304$CYC_NEXT_INTEGER_IN_SEQUENCE = SubLObjectFactory.makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE");
        $str305$term____isg_w__start_table_lock = SubLObjectFactory.makeString("term -> isg w/ start table lock");
        $sym306$_TERM_TO_ISG_W_START_TABLE_ = SubLObjectFactory.makeSymbol("*TERM-TO-ISG-W/START-TABLE*");
        $sym307$CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT = SubLObjectFactory.makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT");
        $const308$LinkParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinkParser"));
        $const309$CharniakParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharniakParser"));
        $kw310$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $sym311$CYC_CYCLIFY = SubLObjectFactory.makeSymbol("CYC-CYCLIFY");
        $sym312$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $sym313$CYC_CONCATENATE_STRINGS = SubLObjectFactory.makeSymbol("CYC-CONCATENATE-STRINGS");
        $sym314$CYC_CONCATENATE_LIST_OF_STRINGS = SubLObjectFactory.makeSymbol("CYC-CONCATENATE-LIST-OF-STRINGS");
        $sym315$CYC_TERM_SIMILARITY_METRIC = SubLObjectFactory.makeSymbol("CYC-TERM-SIMILARITY-METRIC");
        $const316$WordNet2_0_KS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet2_0-KS"));
        $kw317$WN_SKS_REGISTERED = SubLObjectFactory.makeKeyword("WN-SKS-REGISTERED");
        $sym318$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS = SubLObjectFactory.makeSymbol("CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS");
        $sym319$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS = SubLObjectFactory.makeSymbol("CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS");
        $sym320$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS = SubLObjectFactory.makeSymbol("CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS");
        $sym321$MAKE_EL_SET = SubLObjectFactory.makeSymbol("MAKE-EL-SET");
        $kw322$STRONG = SubLObjectFactory.makeKeyword("STRONG");
        $kw323$COLLECTIONS = SubLObjectFactory.makeKeyword("COLLECTIONS");
        $sym324$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS = SubLObjectFactory.makeSymbol("CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS");
        $sym325$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS = SubLObjectFactory.makeSymbol("CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS");
        $sym326$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS = SubLObjectFactory.makeSymbol("CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS");
        $sym327$CYC_KB_ORTHOGONAL = SubLObjectFactory.makeSymbol("CYC-KB-ORTHOGONAL");
        $sym328$CYC_CONTENT_OF_FILE = SubLObjectFactory.makeSymbol("CYC-CONTENT-OF-FILE");
        $sym329$CYC_TRANSFORM_RELATION_TUPLES = SubLObjectFactory.makeSymbol("CYC-TRANSFORM-RELATION-TUPLES");
        $str330$_a_doesn_t_start_with___TheList = SubLObjectFactory.makeString("~a doesn't start with #$TheList");
        $const331$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $sym332$CYC_PROVABLE_VIA_DEFNS = SubLObjectFactory.makeSymbol("CYC-PROVABLE-VIA-DEFNS");
        $sym333$CURRENT_INFERENCE_ANSWER_JUSTIFICATION_PROOF_VIEW = SubLObjectFactory.makeSymbol("CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-VIEW");
        $sym334$CYC_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("CYC-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $sym335$CYC_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("CYC-COMPACT-HL-EXTERNAL-ID-STRING");
        $const336$KAObjectInteractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KAObjectInteractionFn"));
        $sym337$CYC_DECODE_KA_INTERACTION = SubLObjectFactory.makeSymbol("CYC-DECODE-KA-INTERACTION");
        $const338$TheEmptyList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptyList"));
        $sym339$CYC_MOST_RECENTLY_STARTED_EVENTS_BY_AGENT_RELATIVE_TO_INTERACTION = SubLObjectFactory.makeSymbol("CYC-MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN");
        $const340$laterOrSameInteractionHistoryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterOrSameInteractionHistoryMt"));
        $const341$laterInteractionHistoryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterInteractionHistoryMt"));
        $const342$laterInteractionHistoryMt_Direct = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterInteractionHistoryMt-Direct"));
        $const343$laterInteractionHistoryMtForSimul = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterInteractionHistoryMtForSimulatedAgent-Direct"));
        $str344$More_than_one_recently_started_ev = SubLObjectFactory.makeString("More than one recently started event found for (MostRecentlyStartedEventsByAgentRelativeToInteractionMtFn ~S ~S) -> ~S");
        $const345$executionOfPlannedEventBeginsInCo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("executionOfPlannedEventBeginsInContext"));
        $const346$performedByInBELLAUI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedByInBELLAUI"));
        $const347$executionOfPlannedEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("executionOfPlannedEvent"));
        $const348$finishedEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("finishedEvent"));
        $const349$mistakenEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mistakenEvent"));
        $sym350$CYC_MOST_RECENTLY_STARTED_UNFINISH_EVENTS_BY_AGENT_RELATIVE_TO_IN = SubLObjectFactory.makeSymbol("CYC-MOST-RECENTLY-STARTED-UNFINISH-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN");
        $sym351$CYC_EVENT_TO_PLAN_FOR_BY_AGENT_IN_INTERACTION_CONTEXT_FN = SubLObjectFactory.makeSymbol("CYC-EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT-FN");
        $sym352$GAF_ARG3 = SubLObjectFactory.makeSymbol("GAF-ARG3");
        $const353$agentShouldAttemptToFindModelForE = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentShouldAttemptToFindModelForEventInInteractionContext"));
        $str354$More_that_one_event_found_for__Ev = SubLObjectFactory.makeString("More that one event found for (EventToPlanForByAgentInInteractionContextFn ~S ~S): ~S");
        $sym355$CYC_PLAN_AGENT_SHOULD_EXECUTE_IN_INTERACTION_CONTEXT_FN = SubLObjectFactory.makeSymbol("CYC-PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT-FN");
        $const356$interactionContextAbandonedAtDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interactionContextAbandonedAtDate"));
        $sym357$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $const358$eventModeledByPlannedByAtDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventModeledByPlannedByAtDate"));
        $const359$startedInMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startedInMt"));
        $const360$finishedInMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("finishedInMt"));
        $const361$mistakenInMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mistakenInMt"));
        $const362$agentAgenda = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentAgenda"));
        $str363$More_than_one_agenda_found_for__H = SubLObjectFactory.makeString("More than one agenda found for (HighestPriorityItemOnAgendaForAgentInInteractionContextFn ~S ~S) -> ~S");
        $const364$agendaHasTaskWithPriority = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agendaHasTaskWithPriority"));
        $sym365$MAX = SubLObjectFactory.makeSymbol("MAX");
        $str366$More_than_one_priority_found_for_ = SubLObjectFactory.makeString("More than one priority found for (#$agendaHasTaskWithPriority ~S ~S ?PRIORITY): ~S");
        $sym367$CYC_AGENT_CANNOT_PROGRESS_IN_INTERACTION_CONTEXT_FN = SubLObjectFactory.makeSymbol("CYC-AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT-FN");
        $const368$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const369$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $sym370$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_FOR_AGENT_IN_INTERACTION_CONT = SubLObjectFactory.makeSymbol("CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT-FN");
        $sym371$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $const372$agentToDoMtAndHistoryCoincideAtDa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentToDoMtAndHistoryCoincideAtDate"));
        $str373$More_than_one_todo_mt_found_for__ = SubLObjectFactory.makeString("More than one todo-mt found for (HighestPriorityItemOnAgendaForAgentInInteractionContextFn ~S ~S) -> ~S");
        $sym374$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_IN_TO_DO_MT_FN = SubLObjectFactory.makeSymbol("CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT-FN");
        $list375 = ConsesLow.list((SubLObject)evaluation_defns.TWO_INTEGER, (SubLObject)evaluation_defns.THREE_INTEGER);
        $sym376$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $const377$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $sym378$CYC_LIKELIHOOD_OF_TRUTH_OF_SENTENCE = SubLObjectFactory.makeSymbol("CYC-LIKELIHOOD-OF-TRUTH-OF-SENTENCE");
        $sym379$FORMULA_ARG0 = SubLObjectFactory.makeSymbol("FORMULA-ARG0");
        $sym380$CYC_TIME_INTERVALS_FOR_SENTENCE = SubLObjectFactory.makeSymbol("CYC-TIME-INTERVALS-FOR-SENTENCE");
        $str381$math_expression_evaluate_error___ = SubLObjectFactory.makeString("math-expression-evaluate error: ~A");
        $sym382$CYC_EVALUATE_MATH_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-EVALUATE-MATH-EXPRESSION");
        $str383$math_expression_flatten_error___A = SubLObjectFactory.makeString("math-expression-flatten error: ~A");
        $sym384$CYC_FLATTEN_MATH_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-FLATTEN-MATH-EXPRESSION");
        $sym385$CYC_APPLY_OPERATION_TO_MATH_STATEMENT = SubLObjectFactory.makeSymbol("CYC-APPLY-OPERATION-TO-MATH-STATEMENT");
        $sym386$CYC_SERIALIZE_MATHML = SubLObjectFactory.makeSymbol("CYC-SERIALIZE-MATHML");
        $sym387$EXTENSIONAL_SET_ELEMENTS = SubLObjectFactory.makeSymbol("EXTENSIONAL-SET-ELEMENTS");
        $sym388$MAKE_EL_LIST = SubLObjectFactory.makeSymbol("MAKE-EL-LIST");
        $sym389$CYC_CARTESIAN_PRODUCT = SubLObjectFactory.makeSymbol("CYC-CARTESIAN-PRODUCT");
        $sym390$CYC_FILTER_LIST = SubLObjectFactory.makeSymbol("CYC-FILTER-LIST");
    }
    
    public static final class $cyc_different$UnaryFunction extends UnaryFunction
    {
        public $cyc_different$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-DIFFERENT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return evaluation_defns.cyc_different(arg1);
        }
    }
}

/*

	Total time: 3015 ms
	
*/