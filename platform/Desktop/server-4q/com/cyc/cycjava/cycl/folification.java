package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.cycjava.cycl.butler.alchemy_export;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class folification extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.folification";
    public static final String myFingerPrint = "13d07cc01e90991d17e52dbf8e5800515c329149b4219fa4d0d75436f3fa9c5c";
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 1989L)
    public static SubLSymbol $folification_version$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 3988L)
    private static SubLSymbol $fol_translation_type$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 4228L)
    private static SubLSymbol $fol_mt_handling$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 4706L)
    private static SubLSymbol $fol_isa_handling$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 4916L)
    private static SubLSymbol $fol_rmp_handling$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 5181L)
    private static SubLSymbol $fol_string_handling$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 5483L)
    private static SubLSymbol $fol_number_handling$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 5826L)
    private static SubLSymbol $unfolifiable_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 6497L)
    private static SubLSymbol $folification_unhandled_explanation_table$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8378L)
    private static SubLSymbol $fol_output_formats$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8602L)
    public static SubLSymbol $tptp_query_name$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8725L)
    public static SubLSymbol $tptp_axiom_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8835L)
    private static SubLSymbol $tptp_axiom_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8882L)
    private static SubLSymbol $candidate_sentence_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8937L)
    private static SubLSymbol $handled_sentence_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8989L)
    private static SubLSymbol $term_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 9029L)
    private static SubLSymbol $handled_term_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 9077L)
    private static SubLSymbol $partially_handled_term_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 9135L)
    private static SubLSymbol $unhandled_term_count$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 35394L)
    private static SubLSymbol $fol_current_assertion$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49772L)
    private static SubLSymbol $fol_sequence_variable_args_for_arity_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87733L)
    private static SubLSymbol $compute_tptp_query_index_number_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96547L)
    private static SubLSymbol $tptp_long_symbol_name_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96628L)
    private static SubLSymbol $tptp_long_symbol_min_length$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    private static SubLSymbol $include_alchemy_commentsP$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    public static SubLSymbol $alchemy_output_monotonic_rule_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 106294L)
    private static SubLSymbol $categorize_fol_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 106350L)
    private static SubLSymbol $categorize_fol_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 106405L)
    private static SubLSymbol $categorize_fol_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107848L)
    private static SubLSymbol $fol_nart_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 108256L)
    public static SubLSymbol $deepak_folification_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 110041L)
    private static SubLSymbol $deepak_queries$;
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 111302L)
    private static SubLSymbol $deepak_queries_2$;
    private static final SubLString $str0$0_7_2;
    private static final SubLSymbol $kw1$REGULAR_FOL;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$MT_VISIBLE_EXCEPT_CORE_MTS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$COLLAPSE;
    private static final SubLSymbol $kw6$UNARY_PREDICATE;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$GAF;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$ALLOWED;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$DWIM_FLOATS_TO_DISTINCT_CONSTANTS;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$GENERATION_PROPERTIES;
    private static final SubLSymbol $kw18$CANDIDATE_FOL_SENTENCE_COUNT;
    private static final SubLSymbol $kw19$FOL_SENTENCE_COUNT;
    private static final SubLSymbol $kw20$TERM_COUNT;
    private static final SubLSymbol $kw21$HANDLED_TERM_COUNT;
    private static final SubLSymbol $kw22$PARTIALLY_HANDLED_TERM_COUNT;
    private static final SubLSymbol $kw23$UNHANDLED_TERM_COUNT;
    private static final SubLSymbol $kw24$FOL_SENTENCES_DATA;
    private static final SubLSymbol $kw25$REJECTION_STATISTICS;
    private static final SubLSymbol $kw26$OUTPUT_FILENAME;
    private static final SubLSymbol $kw27$OUTPUT_FORMAT;
    private static final SubLSymbol $kw28$TPTP;
    private static final SubLString $str29$cyc;
    private static final SubLSymbol $sym30$FORT_P;
    private static final SubLSymbol $sym31$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym32$ASSERTION_P;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw36$TRANSLATION_TYPE;
    private static final SubLSymbol $kw37$MT_HANDLING;
    private static final SubLSymbol $kw38$MT_CEILING;
    private static final SubLSymbol $kw39$ISA_HANDLING;
    private static final SubLSymbol $kw40$RULE_MACRO_PREDICATE_HANDLING;
    private static final SubLSymbol $kw41$STRING_HANDLING;
    private static final SubLSymbol $kw42$NUMBER_HANDLING;
    private static final SubLSymbol $kw43$ALLOW_EQUIV_RELATION_;
    private static final SubLSymbol $kw44$SAMPLE_RATE;
    private static final SubLSymbol $kw45$HEADER;
    private static final SubLSymbol $kw46$ANALYSIS_FILENAME;
    private static final SubLSymbol $kw47$ANALYSIS_FILE_INTERNAL_;
    private static final SubLSymbol $kw48$INCLUDE_COMMENTS_;
    private static final SubLSymbol $kw49$RETURN_DATA_;
    private static final SubLSymbol $kw50$NEGATE_QUERIES_;
    private static final SubLSymbol $kw51$VERBOSE_;
    private static final SubLSymbol $kw52$OUTPUT;
    private static final SubLString $str53$Unable_to_open__S;
    private static final SubLString $str54$Converting_assertions_to_FOL;
    private static final SubLString $str55$cdolist;
    private static final SubLSymbol $kw56$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym57$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str58$failed_to_translate__s__;
    private static final SubLString $str59$Converting_sentences_to_FOL;
    private static final SubLObject $const60$UniversalVocabularyMt;
    private static final SubLString $str61$failed_to_translate__s;
    private static final SubLSymbol $sym62$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const63$EverythingPSC;
    private static final SubLString $str64$Converting_forts_to_FOL;
    private static final SubLSymbol $sym65$STRINGP;
    private static final SubLSymbol $kw66$INPUT;
    private static final SubLSymbol $kw67$ANALYSIS;
    private static final SubLString $str68$Expected_a_fol_sentences_analysis;
    private static final SubLSymbol $kw69$EOF;
    private static final SubLSymbol $kw70$DATUM;
    private static final SubLString $str71$expected_to_input_a_cons__got__s;
    private static final SubLSymbol $kw72$CYCL;
    private static final SubLSymbol $kw73$ALCHEMY;
    private static final SubLString $str74$Unrecognized_output_format___s;
    private static final SubLString $str75$Gathering_FOL_symbols;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$FOL_REPRESENTED_TERM_P;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLSymbol $kw81$MT_ARGUMENT;
    private static final SubLObject $const82$genlMt;
    private static final SubLSymbol $sym83$_MT;
    private static final SubLSymbol $kw84$MT_VISIBLE;
    private static final SubLObject $const85$mtVisible;
    private static final SubLSymbol $kw86$FLAT;
    private static final SubLString $str87$Queries_not_supported_for_Alchemy;
    private static final SubLSymbol $kw88$CONDITIONAL_SENTENCE_;
    private static final SubLString $str89$can_t_handle_conditional_sentence;
    private static final SubLSymbol $kw90$TESTING;
    private static final SubLSymbol $sym91$FOL_TRANSLATION_TYPE_PROPERTY_P;
    private static final SubLSymbol $sym92$FOL_MT_HANDLING_PROPERTY_P;
    private static final SubLSymbol $sym93$HLMT_P;
    private static final SubLSymbol $sym94$FOL_ISA_HANDLING_PROPERTY_P;
    private static final SubLSymbol $sym95$FOL_RMP_HANDLING_PROPERTY_P;
    private static final SubLSymbol $sym96$FOL_STRING_HANDLING_PROPERTY_P;
    private static final SubLSymbol $sym97$FOL_NUMBER_HANDLING_PROPERTY_P;
    private static final SubLSymbol $sym98$BOOLEANP;
    private static final SubLSymbol $sym99$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym100$FILE_VALID_FOR_WRITING_P;
    private static final SubLSymbol $sym101$FOL_OUTPUT_FORMAT_P;
    private static final SubLSymbol $kw102$EXPANSION;
    private static final SubLSymbol $kw103$GAF_AND_EXPANSION;
    private static final SubLObject $const104$resultIsaArg;
    private static final SubLObject $const105$RelationAllExistsFn;
    private static final SubLList $list106;
    private static final SubLObject $const107$RelationExistsAllFn;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$EXPLICITLY_FORBIDDEN_TERM;
    private static final SubLSymbol $sym110$FOL_EXPANDIBLE_EXPRESSION_;
    private static final SubLSymbol $sym111$FOL_EXPAND_ONE_STEP;
    private static final SubLObject $const112$expansion;
    private static final SubLList $list113;
    private static final SubLSymbol $kw114$NOT_IN_THEORY;
    private static final SubLSymbol $sym115$FOL_UNHANDLED_EXPRESSION_P;
    private static final SubLList $list116;
    private static final SubLString $str117$___a__;
    private static final SubLString $str118$FOLification_statistics;
    private static final SubLString $str119$_a__;
    private static final SubLString $str120$_______________________;
    private static final SubLString $str121$Rejection_statistics__raw__;
    private static final SubLString $str122$Rejection_statistics__pretty__;
    private static final SubLString $str123$Conversion_statistics_;
    private static final SubLSymbol $sym124$_;
    private static final SubLList $list125;
    private static final SubLString $str126$_s_assertion_p_could_not_be_conve;
    private static final SubLString $str127$it;
    private static final SubLString $str128$they;
    private static final SubLString $str129$yielded_the_rejection_condition_;
    private static final SubLObject $const130$FOL_UnhandledFn;
    private static final SubLList $list131;
    private static final SubLObject $const132$genlPreds;
    private static final SubLList $list133;
    private static final SubLObject $const134$negationPreds;
    private static final SubLList $list135;
    private static final SubLObject $const136$arg1Isa;
    private static final SubLObject $const137$arg2Isa;
    private static final SubLObject $const138$arg3Isa;
    private static final SubLObject $const139$arg4Isa;
    private static final SubLObject $const140$arg5Isa;
    private static final SubLObject $const141$arg6Isa;
    private static final SubLObject $const142$isa;
    private static final SubLObject $const143$arg1Genl;
    private static final SubLObject $const144$arg2Genl;
    private static final SubLObject $const145$arg3Genl;
    private static final SubLObject $const146$arg4Genl;
    private static final SubLObject $const147$arg5Genl;
    private static final SubLObject $const148$arg6Genl;
    private static final SubLObject $const149$genls;
    private static final SubLObject $const150$resultIsa;
    private static final SubLObject $const151$resultGenl;
    private static final SubLObject $const152$disjointWith;
    private static final SubLObject $const153$genlInverse;
    private static final SubLObject $const154$True;
    private static final SubLList $list155;
    private static final SubLSymbol $kw156$FUNCTION_ARG_CONSTRAINT;
    private static final SubLSymbol $kw157$ILL_FORMED;
    private static final SubLSymbol $kw158$NONSTANDARD_SENTENTIAL_RELATION;
    private static final SubLSymbol $kw159$UNEXPECTED;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY;
    private static final SubLString $str162$ARG;
    private static final SubLSymbol $sym163$_FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY_CACHING_STATE_;
    private static final SubLObject $const164$equiv;
    private static final SubLList $list165;
    private static final SubLSymbol $sym166$_X;
    private static final SubLObject $const167$FOL_PredicateFn;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLObject $const170$implies;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$ARGNUM_1;
    private static final SubLSymbol $sym176$ARG_ISA_PRED;
    private static final SubLSymbol $sym177$ARITY;
    private static final SubLSymbol $sym178$PWHEN;
    private static final SubLSymbol $sym179$FIXED_ARITY_PREDICATE_P;
    private static final SubLSymbol $sym180$CLET;
    private static final SubLSymbol $sym181$ARITY;
    private static final SubLSymbol $sym182$CDOTIMES;
    private static final SubLSymbol $sym183$1_;
    private static final SubLSymbol $sym184$ARG_ISA_PRED;
    private static final SubLSymbol $sym185$DO_GAF_ARG_INDEX;
    private static final SubLSymbol $kw186$PREDICATE;
    private static final SubLList $list187;
    private static final SubLSymbol $kw188$TRUE;
    private static final SubLSymbol $sym189$_INS;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLList $list192;
    private static final SubLList $list193;
    private static final SubLList $list194;
    private static final SubLObject $const195$transitiveViaArg;
    private static final SubLObject $const196$transitiveViaArgInverse;
    private static final SubLList $list197;
    private static final SubLList $list198;
    private static final SubLSymbol $sym199$_OLD;
    private static final SubLSymbol $sym200$_NEW;
    private static final SubLObject $const201$natFunction;
    private static final SubLObject $const202$natArgument;
    private static final SubLSymbol $kw203$SET_THEORY;
    private static final SubLSymbol $kw204$SEQUENCE_VAR;
    private static final SubLObject $const205$different;
    private static final SubLSymbol $sym206$FOL_TRANSFORM_ARG;
    private static final SubLObject $const207$equals;
    private static final SubLList $list208;
    private static final SubLSymbol $kw209$ISA;
    private static final SubLList $list210;
    private static final SubLSymbol $kw211$META_ASSERTION;
    private static final SubLSymbol $kw212$META_VARIABLE;
    private static final SubLSymbol $kw213$SUBL_ESCAPE;
    private static final SubLSymbol $kw214$META_SENTENCE;
    private static final SubLObject $const215$memberOfSet;
    private static final SubLObject $const216$SetifyArgumentFn;
    private static final SubLObject $const217$ist;
    private static final SubLSymbol $kw218$IST;
    private static final SubLList $list219;
    private static final SubLSymbol $kw220$NON_PREDICATE;
    private static final SubLSymbol $kw221$VARIABLE_ARITY_PREDICATE;
    private static final SubLSymbol $kw222$UNBOUNDED_ARITY_PREDICATE;
    private static final SubLSymbol $kw223$PREDICATE_QUANTIFICATION;
    private static final SubLObject $const224$Kappa;
    private static final SubLSymbol $kw225$KAPPA;
    private static final SubLSymbol $kw226$NON_COLLECTION;
    private static final SubLSymbol $kw227$COLLECTION_QUANTIFICATION;
    private static final SubLSymbol $kw228$NON_FUNCTION;
    private static final SubLSymbol $kw229$SCOPING_RELATION;
    private static final SubLSymbol $kw230$VARIABLE_ARITY_FUNCTION;
    private static final SubLSymbol $kw231$UNBOUNDED_ARITY_FUNCTION;
    private static final SubLSymbol $kw232$FUNCTION_QUANTIFICATION;
    private static final SubLObject $const233$Lambda;
    private static final SubLSymbol $kw234$LAMBDA;
    private static final SubLObject $const235$FOL_AtomicTermFn;
    private static final SubLSymbol $sym236$INTEGERP;
    private static final SubLObject $const237$FOL_FunctionFn;
    private static final SubLObject $const238$FOL_StringFn;
    private static final SubLSymbol $kw239$DWIM_TO_DISTINCT_CONSTANTS;
    private static final SubLObject $const240$FOL_StringConstantFn;
    private static final SubLSymbol $kw241$DWIM_TO_SINGLE_CONSTANT;
    private static final SubLObject $const242$Canonical_String;
    private static final SubLString $str243$unexpected_string_handling_direct;
    private static final SubLSymbol $sym244$NUMBERP;
    private static final SubLObject $const245$FOL_NumberFn;
    private static final SubLObject $const246$FOL_NumberConstantFn;
    private static final SubLSymbol $kw247$DWIM_ALL_TO_DISTINCT_CONSTANTS;
    private static final SubLString $str248$unexpected_number_handling_direct;
    private static final SubLSymbol $sym249$EL_VAR_;
    private static final SubLList $list250;
    private static final SubLList $list251;
    private static final SubLSymbol $sym252$FOL_ATOMIC_SENTENCE_;
    private static final SubLString $str253$______S;
    private static final SubLString $str254$_____QUERY_;
    private static final SubLString $str255$__Cyc_Assertion___a___;
    private static final SubLString $str256$__Cyc_NART___a___;
    private static final SubLString $str257$__Cyc_Constant___a___;
    private static final SubLString $str258$__CycL_Sentence___a___;
    private static final SubLString $str259$Unexpected_object__s;
    private static final SubLString $str260$_________________________________;
    private static final SubLString $str261$File;
    private static final SubLString $str262$CYC_10___TPTP_v2_2_0__Released_2_;
    private static final SubLString $str263$Domain;
    private static final SubLString $str264$Knowledge_Representation_Common_S;
    private static final SubLString $str265$Problem;
    private static final SubLString $str266$Reasoning_with_the_Cyc_Common_Sen;
    private static final SubLString $str267$Version;
    private static final SubLString $str268$English;
    private static final SubLString $str269$The_Cyc_KB_contains_assertions_fo;
    private static final SubLString $str270$Refs;
    private static final SubLString $str271$;
    private static final SubLString $str272$Source;
    private static final SubLString $str273$Names;
    private static final SubLString $str274$Status;
    private static final SubLString $str275$unknown;
    private static final SubLString $str276$Rating;
    private static final SubLString $str277$1_0;
    private static final SubLString $str278$Syntax;
    private static final SubLString $str279$_blank_;
    private static final SubLString $str280$Comments;
    private static final SubLString $str281$To_obtain_a_First_Orderification_;
    private static final SubLString $str282$Bugfixes;
    private static final SubLString $str283$_________________________________;
    private static final SubLSymbol $sym284$_EXIT;
    private static final SubLString $str285$__;
    private static final SubLString $str286$___;
    private static final SubLString $str287$_;
    private static final SubLString $str288$__;
    private static final SubLString $str289$__;
    private static final SubLSymbol $sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_;
    private static final SubLSymbol $sym291$COMPUTE_TPTP_QUERY_INDEX_NUMBER;
    private static final SubLSymbol $sym292$_COMPUTE_TPTP_QUERY_INDEX_NUMBER_CACHING_STATE_;
    private static final SubLString $str293$fof__a_axiom_;
    private static final SubLString $str294$____;
    private static final SubLString $str295$fof__a_conjecture_;
    private static final SubLList $list296;
    private static final SubLList $list297;
    private static final SubLString $str298$_;
    private static final SubLString $str299$____;
    private static final SubLString $str300$_;
    private static final SubLObject $const301$and;
    private static final SubLString $str302$___;
    private static final SubLObject $const303$or;
    private static final SubLString $str304$___;
    private static final SubLObject $const305$not;
    private static final SubLString $str306$__;
    private static final SubLObject $const307$thereExists;
    private static final SubLList $list308;
    private static final SubLString $str309$_____a____;
    private static final SubLObject $const310$forAll;
    private static final SubLString $str311$_____a____;
    private static final SubLObject $const312$equalSymbols;
    private static final SubLString $str313$___;
    private static final SubLString $str314$_;
    private static final SubLString $str315$__;
    private static final SubLString $str316$unexpected_FOL_term__s;
    private static final SubLList $list317;
    private static final SubLList $list318;
    private static final SubLString $str319$p_;
    private static final SubLList $list320;
    private static final SubLString $str321$f_;
    private static final SubLString $str322$c_zero_arity_function_application;
    private static final SubLList $list323;
    private static final SubLString $str324$c_;
    private static final SubLList $list325;
    private static final SubLString $str326$s_;
    private static final SubLList $list327;
    private static final SubLString $str328$_;
    private static final SubLList $list329;
    private static final SubLSymbol $sym330$DOUBLE_FLOAT;
    private static final SubLString $str331$n_;
    private static final SubLList $list332;
    private static final SubLSymbol $sym333$TPTP_STRING_CHAR_P;
    private static final SubLSymbol $sym334$_TPTP_LONG_SYMBOL_NAME_CACHE_;
    private static final SubLInteger $int335$256;
    private static final SubLString $str336$ls_;
    private static final SubLSymbol $sym337$TPTP_NON_NUMERIC_ATOM_CHAR_P;
    private static final SubLString $str338$tptp_;
    private static final SubLSymbol $sym339$TPTP_NUMERIC_ATOM_CHAR_P;
    private static final SubLInteger $int340$32;
    private static final SubLInteger $int341$126;
    private static final SubLSymbol $kw342$MONOTONIC;
    private static final SubLString $str343$_;
    private static final SubLString $str344$_A;
    private static final SubLString $str345$___Cyc_Assertion__a;
    private static final SubLString $str346$___Cyc_NART__a;
    private static final SubLString $str347$___Cyc_Constant___a_;
    private static final SubLString $str348$___CycL_Sentence___a_;
    private static final SubLSymbol $sym349$FOCYCL_TO_CYCL;
    private static final SubLSymbol $kw350$INCLUDE_HORN;
    private static final SubLSymbol $kw351$TERM_TYPES;
    private static final SubLSymbol $kw352$ALL;
    private static final SubLSymbol $kw353$SKIP;
    private static final SubLString $str354$_S_;
    private static final SubLSymbol $kw355$FUNCTION;
    private static final SubLSymbol $kw356$TERM;
    private static final SubLSymbol $sym357$CATEGORIZE_FOL_TERMS_INT;
    private static final SubLString $str358$time_to_handle_non_forts;
    private static final SubLString $str359$_P;
    private static final SubLString $str360$_F;
    private static final SubLString $str361$_T;
    private static final SubLString $str362$time_to_handle__S;
    private static final SubLSymbol $sym363$FOL_NART_STRING;
    private static final SubLSymbol $sym364$VALID_CONSTANT_NAME_CHAR_P;
    private static final SubLSymbol $sym365$_FOL_NART_STRING_CACHING_STATE_;
    private static final SubLList $list366;
    private static final SubLString $str367$opencyc_all_20050422_non_conditio;
    private static final SubLList $list368;
    private static final SubLObject $list369;
    private static final SubLInteger $int370$60;
    private static final SubLSymbol $kw371$MAX_TIME;
    private static final SubLList $list372;
    private static final SubLSymbol $kw373$FAILURE;
    private static final SubLString $str374$_S___s___s____;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 4113L)
    public static SubLObject fol_translation_type_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)folification.$list2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 4466L)
    public static SubLObject fol_mt_handling_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != list_utilities.member_eqP(v_object, (SubLObject)folification.$list4) || (v_object.isCons() && folification.$kw5$COLLAPSE == v_object.first() && folification.NIL != hlmt.hlmt_p(conses_high.second(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 4808L)
    public static SubLObject fol_isa_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)folification.$list7);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 5060L)
    public static SubLObject fol_rmp_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)folification.$list9);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 5326L)
    public static SubLObject fol_string_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)folification.$list11);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 5661L)
    public static SubLObject fol_number_handling_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)folification.$list13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 8506L)
    public static SubLObject fol_output_format_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, folification.$fol_output_formats$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 9185L)
    public static SubLObject new_fol_sentences_analysis(final SubLObject generation_properties, final SubLObject candidate_sentence_count, final SubLObject handled_sentence_count, final SubLObject term_count, final SubLObject handled_term_count, final SubLObject partially_handled_term_count, final SubLObject unhandled_term_count, final SubLObject fol_sentences_data, final SubLObject rejection_statistics) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { folification.$kw17$GENERATION_PROPERTIES, generation_properties, folification.$kw18$CANDIDATE_FOL_SENTENCE_COUNT, candidate_sentence_count, folification.$kw19$FOL_SENTENCE_COUNT, handled_sentence_count, folification.$kw20$TERM_COUNT, term_count, folification.$kw21$HANDLED_TERM_COUNT, handled_term_count, folification.$kw22$PARTIALLY_HANDLED_TERM_COUNT, partially_handled_term_count, folification.$kw23$UNHANDLED_TERM_COUNT, unhandled_term_count, folification.$kw24$FOL_SENTENCES_DATA, fol_sentences_data, folification.$kw25$REJECTION_STATISTICS, rejection_statistics });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 10451L)
    public static SubLObject fol_sentences_analysis_data(final SubLObject analysis) {
        return conses_high.getf(analysis, (SubLObject)folification.$kw24$FOL_SENTENCES_DATA, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 10564L)
    public static SubLObject fol_sentences_analysis_generation_properties(final SubLObject analysis) {
        return conses_high.getf(analysis, (SubLObject)folification.$kw17$GENERATION_PROPERTIES, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 10685L)
    public static SubLObject fol_sentences_analysis_rejection_statistics(final SubLObject analysis) {
        return conses_high.getf(analysis, (SubLObject)folification.$kw25$REJECTION_STATISTICS, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 10806L)
    public static SubLObject folify_kb(final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tptp_export_properties = ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)folification.$kw26$OUTPUT_FILENAME, output_filename, (SubLObject)folification.$kw27$OUTPUT_FORMAT, (SubLObject)folification.$kw28$TPTP), Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("TPTP-FOLIFICATION-PROPERTIES")));
        final SubLObject _prev_bind_0 = folification.$tptp_axiom_prefix$.currentBinding(thread);
        try {
            folification.$tptp_axiom_prefix$.bind((SubLObject)folification.$str29$cyc, thread);
            fol_sentences(kb_utilities.all_assertions(), (SubLObject)folification.NIL, kb_utilities.all_forts(), tptp_export_properties);
        }
        finally {
            folification.$tptp_axiom_prefix$.rebind(_prev_bind_0, thread);
        }
        return output_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 11404L)
    public static SubLObject kb_fol_sentences(SubLObject v_properties) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        return fol_sentences(kb_utilities.all_assertions(), (SubLObject)folification.NIL, kb_utilities.all_forts(), v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 11586L)
    public static SubLObject cycl_assertions_to_fol(final SubLObject assertions, SubLObject v_properties, SubLObject define_nart_constantsP) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        if (define_nart_constantsP == folification.UNPROVIDED) {
            define_nart_constantsP = (SubLObject)folification.T;
        }
        SubLObject v_forts = (SubLObject)folification.NIL;
        final SubLObject include_mtsP = (SubLObject)folification.T;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)folification.NIL;
        assertion = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, define_nart_constantsP, (SubLObject)folification.T, include_mtsP, (SubLObject)folification.UNPROVIDED);
            v_forts = ConsesLow.append(assertion_forts, v_forts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        v_forts = list_utilities.fast_delete_duplicates(v_forts, Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
        return fol_sentences(assertions, (SubLObject)folification.NIL, v_forts, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 12416L)
    public static SubLObject cycl_sentences_to_fol(final SubLObject sentences, SubLObject v_properties) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        final SubLObject v_forts = list_utilities.fast_delete_duplicates(list_utilities.tree_gather(sentences, Symbols.symbol_function((SubLObject)folification.$sym30$FORT_P), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
        return fol_sentences((SubLObject)folification.NIL, sentences, v_forts, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 12774L)
    public static SubLObject fol_sentences(final SubLObject assertions, final SubLObject sentences, final SubLObject v_forts, SubLObject v_properties) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert folification.NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = (SubLObject)folification.NIL;
        elem = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            assert folification.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = (SubLObject)folification.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)folification.NIL;
        SubLObject current_$1 = (SubLObject)folification.NIL;
        while (folification.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)folification.$list33);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)folification.$list33);
            if (folification.NIL == conses_high.member(current_$1, (SubLObject)folification.$list34, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED)) {
                bad = (SubLObject)folification.T;
            }
            if (current_$1 == folification.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (folification.NIL != bad && folification.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list33);
        }
        final SubLObject translation_type_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw36$TRANSLATION_TYPE, current);
        final SubLObject translation_type = (SubLObject)((folification.NIL != translation_type_tail) ? conses_high.cadr(translation_type_tail) : folification.NIL);
        final SubLObject mt_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw37$MT_HANDLING, current);
        final SubLObject mt_handling = (SubLObject)((folification.NIL != mt_handling_tail) ? conses_high.cadr(mt_handling_tail) : folification.NIL);
        final SubLObject mt_ceiling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw38$MT_CEILING, current);
        final SubLObject mt_ceiling = (SubLObject)((folification.NIL != mt_ceiling_tail) ? conses_high.cadr(mt_ceiling_tail) : folification.NIL);
        final SubLObject isa_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw39$ISA_HANDLING, current);
        final SubLObject isa_handling = (SubLObject)((folification.NIL != isa_handling_tail) ? conses_high.cadr(isa_handling_tail) : folification.NIL);
        final SubLObject rule_macro_predicate_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw40$RULE_MACRO_PREDICATE_HANDLING, current);
        final SubLObject rule_macro_predicate_handling = (SubLObject)((folification.NIL != rule_macro_predicate_handling_tail) ? conses_high.cadr(rule_macro_predicate_handling_tail) : folification.NIL);
        final SubLObject string_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw41$STRING_HANDLING, current);
        final SubLObject string_handling = (SubLObject)((folification.NIL != string_handling_tail) ? conses_high.cadr(string_handling_tail) : folification.NIL);
        final SubLObject number_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw42$NUMBER_HANDLING, current);
        final SubLObject number_handling = (SubLObject)((folification.NIL != number_handling_tail) ? conses_high.cadr(number_handling_tail) : folification.NIL);
        final SubLObject allow_equiv_relationP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw43$ALLOW_EQUIV_RELATION_, current);
        final SubLObject allow_equiv_relationP = (SubLObject)((folification.NIL != allow_equiv_relationP_tail) ? conses_high.cadr(allow_equiv_relationP_tail) : folification.NIL);
        final SubLObject sample_rate_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw44$SAMPLE_RATE, current);
        final SubLObject sample_rate = (SubLObject)((folification.NIL != sample_rate_tail) ? conses_high.cadr(sample_rate_tail) : folification.ONE_INTEGER);
        final SubLObject output_filename_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw26$OUTPUT_FILENAME, current);
        final SubLObject output_filename = (SubLObject)((folification.NIL != output_filename_tail) ? conses_high.cadr(output_filename_tail) : folification.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw27$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((folification.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : folification.NIL);
        final SubLObject header_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw45$HEADER, current);
        final SubLObject header = (SubLObject)((folification.NIL != header_tail) ? conses_high.cadr(header_tail) : folification.NIL);
        final SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw46$ANALYSIS_FILENAME, current);
        final SubLObject analysis_filename = (SubLObject)((folification.NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : folification.NIL);
        final SubLObject analysis_file_internalP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw47$ANALYSIS_FILE_INTERNAL_, current);
        final SubLObject analysis_file_internalP = (SubLObject)((folification.NIL != analysis_file_internalP_tail) ? conses_high.cadr(analysis_file_internalP_tail) : folification.NIL);
        final SubLObject include_commentsP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw48$INCLUDE_COMMENTS_, current);
        final SubLObject include_commentsP = (SubLObject)((folification.NIL != include_commentsP_tail) ? conses_high.cadr(include_commentsP_tail) : folification.NIL);
        final SubLObject return_dataP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw49$RETURN_DATA_, current);
        final SubLObject return_dataP = (SubLObject)((folification.NIL != return_dataP_tail) ? conses_high.cadr(return_dataP_tail) : folification.NIL);
        final SubLObject negate_queriesP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw50$NEGATE_QUERIES_, current);
        final SubLObject negate_queriesP = (SubLObject)((folification.NIL != negate_queriesP_tail) ? conses_high.cadr(negate_queriesP_tail) : folification.T);
        final SubLObject verboseP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw51$VERBOSE_, current);
        final SubLObject verboseP = (SubLObject)((folification.NIL != verboseP_tail) ? conses_high.cadr(verboseP_tail) : folification.T);
        check_folification_properties(translation_type, mt_handling, mt_ceiling, isa_handling, rule_macro_predicate_handling, string_handling, number_handling, allow_equiv_relationP, sample_rate, output_filename, output_format, header, analysis_filename, analysis_file_internalP, include_commentsP, return_dataP, negate_queriesP, verboseP);
        SubLObject analysis = (SubLObject)folification.NIL;
        final SubLObject filename_var = output_filename;
        if (folification.NIL != filename_var) {
            SubLObject stream = (SubLObject)folification.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)folification.NIL, thread);
                    stream = compatibility.open_text(filename_var, (SubLObject)folification.$kw52$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename_var);
                }
                final SubLObject output_stream = stream;
                final SubLObject filename_var_$2 = analysis_filename;
                if (folification.NIL != filename_var_$2) {
                    SubLObject stream_$3 = (SubLObject)folification.NIL;
                    try {
                        final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)folification.NIL, thread);
                            stream_$3 = compatibility.open_binary(filename_var_$2, (SubLObject)folification.$kw52$OUTPUT);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                        }
                        if (!stream_$3.isStream()) {
                            Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename_var_$2);
                        }
                        final SubLObject analysis_stream = stream_$3;
                        final SubLObject stub_analysis = new_fol_sentences_analysis(v_properties, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.NIL, (SubLObject)folification.NIL);
                        if (folification.NIL != output_stream) {
                            fol_header_to_stream(stub_analysis, output_format, output_stream);
                        }
                        possibly_save_fol_sentences_analysis(stub_analysis, analysis_stream);
                        final SubLObject _prev_bind_3 = folification.$tptp_axiom_count$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = folification.$candidate_sentence_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = folification.$handled_sentence_count$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = folification.$term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = folification.$handled_term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = folification.$partially_handled_term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = folification.$unhandled_term_count$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = folification.$fol_translation_type$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = folification.$fol_mt_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = folification.$fol_isa_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = folification.$fol_rmp_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_14 = folification.$fol_string_handling$.currentBinding(thread);
                        final SubLObject _prev_bind_15 = folification.$fol_number_handling$.currentBinding(thread);
                        try {
                            folification.$tptp_axiom_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$candidate_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$handled_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$partially_handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$unhandled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                            folification.$fol_translation_type$.bind((folification.NIL != translation_type) ? translation_type : folification.$fol_translation_type$.getDynamicValue(thread), thread);
                            folification.$fol_mt_handling$.bind((folification.NIL != mt_handling) ? mt_handling : folification.$fol_mt_handling$.getDynamicValue(thread), thread);
                            folification.$fol_isa_handling$.bind((folification.NIL != isa_handling) ? isa_handling : folification.$fol_isa_handling$.getDynamicValue(thread), thread);
                            folification.$fol_rmp_handling$.bind((folification.NIL != rule_macro_predicate_handling) ? rule_macro_predicate_handling : folification.$fol_rmp_handling$.getDynamicValue(thread), thread);
                            folification.$fol_string_handling$.bind((folification.NIL != string_handling) ? string_handling : folification.$fol_string_handling$.getDynamicValue(thread), thread);
                            folification.$fol_number_handling$.bind((folification.NIL != number_handling) ? number_handling : folification.$fol_number_handling$.getDynamicValue(thread), thread);
                            final SubLObject rejection_statistics = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
                            final SubLObject assertions_fol_sentences_data = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream, rejection_statistics, verboseP);
                            final SubLObject sentences_fol_sentences_data = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream, rejection_statistics, verboseP);
                            final SubLObject forts_fol_sentences_data = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream, rejection_statistics, verboseP);
                            final SubLObject fol_sentences_data = Sequences.nreverse(ConsesLow.nconc(forts_fol_sentences_data, sentences_fol_sentences_data, assertions_fol_sentences_data));
                            analysis = new_fol_sentences_analysis(v_properties, folification.$candidate_sentence_count$.getDynamicValue(thread), folification.$handled_sentence_count$.getDynamicValue(thread), folification.$term_count$.getDynamicValue(thread), folification.$handled_term_count$.getDynamicValue(thread), folification.$partially_handled_term_count$.getDynamicValue(thread), folification.$unhandled_term_count$.getDynamicValue(thread), fol_sentences_data, rejection_statistics);
                        }
                        finally {
                            folification.$fol_number_handling$.rebind(_prev_bind_15, thread);
                            folification.$fol_string_handling$.rebind(_prev_bind_14, thread);
                            folification.$fol_rmp_handling$.rebind(_prev_bind_13, thread);
                            folification.$fol_isa_handling$.rebind(_prev_bind_12, thread);
                            folification.$fol_mt_handling$.rebind(_prev_bind_11, thread);
                            folification.$fol_translation_type$.rebind(_prev_bind_10, thread);
                            folification.$unhandled_term_count$.rebind(_prev_bind_9, thread);
                            folification.$partially_handled_term_count$.rebind(_prev_bind_8, thread);
                            folification.$handled_term_count$.rebind(_prev_bind_7, thread);
                            folification.$term_count$.rebind(_prev_bind_6, thread);
                            folification.$handled_sentence_count$.rebind(_prev_bind_5, thread);
                            folification.$candidate_sentence_count$.rebind(_prev_bind_4, thread);
                            folification.$tptp_axiom_count$.rebind(_prev_bind_3, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream_$3.isStream()) {
                                streams_high.close(stream_$3, (SubLObject)folification.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                        }
                    }
                }
                else {
                    final SubLObject analysis_stream2 = (SubLObject)folification.NIL;
                    final SubLObject stub_analysis2 = new_fol_sentences_analysis(v_properties, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.NIL, (SubLObject)folification.NIL);
                    if (folification.NIL != output_stream) {
                        fol_header_to_stream(stub_analysis2, output_format, output_stream);
                    }
                    possibly_save_fol_sentences_analysis(stub_analysis2, analysis_stream2);
                    final SubLObject _prev_bind_17 = folification.$tptp_axiom_count$.currentBinding(thread);
                    final SubLObject _prev_bind_18 = folification.$candidate_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_19 = folification.$handled_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_20 = folification.$term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_21 = folification.$handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_22 = folification.$partially_handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_23 = folification.$unhandled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_24 = folification.$fol_translation_type$.currentBinding(thread);
                    final SubLObject _prev_bind_25 = folification.$fol_mt_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_26 = folification.$fol_isa_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_27 = folification.$fol_rmp_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_28 = folification.$fol_string_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_29 = folification.$fol_number_handling$.currentBinding(thread);
                    try {
                        folification.$tptp_axiom_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$candidate_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$handled_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$partially_handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$unhandled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$fol_translation_type$.bind((folification.NIL != translation_type) ? translation_type : folification.$fol_translation_type$.getDynamicValue(thread), thread);
                        folification.$fol_mt_handling$.bind((folification.NIL != mt_handling) ? mt_handling : folification.$fol_mt_handling$.getDynamicValue(thread), thread);
                        folification.$fol_isa_handling$.bind((folification.NIL != isa_handling) ? isa_handling : folification.$fol_isa_handling$.getDynamicValue(thread), thread);
                        folification.$fol_rmp_handling$.bind((folification.NIL != rule_macro_predicate_handling) ? rule_macro_predicate_handling : folification.$fol_rmp_handling$.getDynamicValue(thread), thread);
                        folification.$fol_string_handling$.bind((folification.NIL != string_handling) ? string_handling : folification.$fol_string_handling$.getDynamicValue(thread), thread);
                        folification.$fol_number_handling$.bind((folification.NIL != number_handling) ? number_handling : folification.$fol_number_handling$.getDynamicValue(thread), thread);
                        final SubLObject rejection_statistics2 = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
                        final SubLObject assertions_fol_sentences_data2 = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject sentences_fol_sentences_data2 = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject forts_fol_sentences_data2 = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject fol_sentences_data2 = Sequences.nreverse(ConsesLow.nconc(forts_fol_sentences_data2, sentences_fol_sentences_data2, assertions_fol_sentences_data2));
                        analysis = new_fol_sentences_analysis(v_properties, folification.$candidate_sentence_count$.getDynamicValue(thread), folification.$handled_sentence_count$.getDynamicValue(thread), folification.$term_count$.getDynamicValue(thread), folification.$handled_term_count$.getDynamicValue(thread), folification.$partially_handled_term_count$.getDynamicValue(thread), folification.$unhandled_term_count$.getDynamicValue(thread), fol_sentences_data2, rejection_statistics2);
                    }
                    finally {
                        folification.$fol_number_handling$.rebind(_prev_bind_29, thread);
                        folification.$fol_string_handling$.rebind(_prev_bind_28, thread);
                        folification.$fol_rmp_handling$.rebind(_prev_bind_27, thread);
                        folification.$fol_isa_handling$.rebind(_prev_bind_26, thread);
                        folification.$fol_mt_handling$.rebind(_prev_bind_25, thread);
                        folification.$fol_translation_type$.rebind(_prev_bind_24, thread);
                        folification.$unhandled_term_count$.rebind(_prev_bind_23, thread);
                        folification.$partially_handled_term_count$.rebind(_prev_bind_22, thread);
                        folification.$handled_term_count$.rebind(_prev_bind_21, thread);
                        folification.$term_count$.rebind(_prev_bind_20, thread);
                        folification.$handled_sentence_count$.rebind(_prev_bind_19, thread);
                        folification.$candidate_sentence_count$.rebind(_prev_bind_18, thread);
                        folification.$tptp_axiom_count$.rebind(_prev_bind_17, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)folification.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_30, thread);
                }
            }
        }
        else {
            final SubLObject output_stream2 = (SubLObject)folification.NIL;
            final SubLObject filename_var_$3 = analysis_filename;
            if (folification.NIL != filename_var_$3) {
                SubLObject stream2 = (SubLObject)folification.NIL;
                try {
                    final SubLObject _prev_bind_31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)folification.NIL, thread);
                        stream2 = compatibility.open_binary(filename_var_$3, (SubLObject)folification.$kw52$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_31, thread);
                    }
                    if (!stream2.isStream()) {
                        Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename_var_$3);
                    }
                    final SubLObject analysis_stream2 = stream2;
                    final SubLObject stub_analysis2 = new_fol_sentences_analysis(v_properties, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.NIL, (SubLObject)folification.NIL);
                    if (folification.NIL != output_stream2) {
                        fol_header_to_stream(stub_analysis2, output_format, output_stream2);
                    }
                    possibly_save_fol_sentences_analysis(stub_analysis2, analysis_stream2);
                    final SubLObject _prev_bind_17 = folification.$tptp_axiom_count$.currentBinding(thread);
                    final SubLObject _prev_bind_18 = folification.$candidate_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_19 = folification.$handled_sentence_count$.currentBinding(thread);
                    final SubLObject _prev_bind_20 = folification.$term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_21 = folification.$handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_22 = folification.$partially_handled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_23 = folification.$unhandled_term_count$.currentBinding(thread);
                    final SubLObject _prev_bind_24 = folification.$fol_translation_type$.currentBinding(thread);
                    final SubLObject _prev_bind_25 = folification.$fol_mt_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_26 = folification.$fol_isa_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_27 = folification.$fol_rmp_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_28 = folification.$fol_string_handling$.currentBinding(thread);
                    final SubLObject _prev_bind_29 = folification.$fol_number_handling$.currentBinding(thread);
                    try {
                        folification.$tptp_axiom_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$candidate_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$handled_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$partially_handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$unhandled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        folification.$fol_translation_type$.bind((folification.NIL != translation_type) ? translation_type : folification.$fol_translation_type$.getDynamicValue(thread), thread);
                        folification.$fol_mt_handling$.bind((folification.NIL != mt_handling) ? mt_handling : folification.$fol_mt_handling$.getDynamicValue(thread), thread);
                        folification.$fol_isa_handling$.bind((folification.NIL != isa_handling) ? isa_handling : folification.$fol_isa_handling$.getDynamicValue(thread), thread);
                        folification.$fol_rmp_handling$.bind((folification.NIL != rule_macro_predicate_handling) ? rule_macro_predicate_handling : folification.$fol_rmp_handling$.getDynamicValue(thread), thread);
                        folification.$fol_string_handling$.bind((folification.NIL != string_handling) ? string_handling : folification.$fol_string_handling$.getDynamicValue(thread), thread);
                        folification.$fol_number_handling$.bind((folification.NIL != number_handling) ? number_handling : folification.$fol_number_handling$.getDynamicValue(thread), thread);
                        final SubLObject rejection_statistics2 = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
                        final SubLObject assertions_fol_sentences_data2 = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject sentences_fol_sentences_data2 = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject forts_fol_sentences_data2 = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream2, rejection_statistics2, verboseP);
                        final SubLObject fol_sentences_data2 = Sequences.nreverse(ConsesLow.nconc(forts_fol_sentences_data2, sentences_fol_sentences_data2, assertions_fol_sentences_data2));
                        analysis = new_fol_sentences_analysis(v_properties, folification.$candidate_sentence_count$.getDynamicValue(thread), folification.$handled_sentence_count$.getDynamicValue(thread), folification.$term_count$.getDynamicValue(thread), folification.$handled_term_count$.getDynamicValue(thread), folification.$partially_handled_term_count$.getDynamicValue(thread), folification.$unhandled_term_count$.getDynamicValue(thread), fol_sentences_data2, rejection_statistics2);
                    }
                    finally {
                        folification.$fol_number_handling$.rebind(_prev_bind_29, thread);
                        folification.$fol_string_handling$.rebind(_prev_bind_28, thread);
                        folification.$fol_rmp_handling$.rebind(_prev_bind_27, thread);
                        folification.$fol_isa_handling$.rebind(_prev_bind_26, thread);
                        folification.$fol_mt_handling$.rebind(_prev_bind_25, thread);
                        folification.$fol_translation_type$.rebind(_prev_bind_24, thread);
                        folification.$unhandled_term_count$.rebind(_prev_bind_23, thread);
                        folification.$partially_handled_term_count$.rebind(_prev_bind_22, thread);
                        folification.$handled_term_count$.rebind(_prev_bind_21, thread);
                        folification.$term_count$.rebind(_prev_bind_20, thread);
                        folification.$handled_sentence_count$.rebind(_prev_bind_19, thread);
                        folification.$candidate_sentence_count$.rebind(_prev_bind_18, thread);
                        folification.$tptp_axiom_count$.rebind(_prev_bind_17, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (stream2.isStream()) {
                            streams_high.close(stream2, (SubLObject)folification.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_32, thread);
                    }
                }
            }
            else {
                final SubLObject analysis_stream3 = (SubLObject)folification.NIL;
                final SubLObject stub_analysis3 = new_fol_sentences_analysis(v_properties, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.ZERO_INTEGER, (SubLObject)folification.NIL, (SubLObject)folification.NIL);
                if (folification.NIL != output_stream2) {
                    fol_header_to_stream(stub_analysis3, output_format, output_stream2);
                }
                possibly_save_fol_sentences_analysis(stub_analysis3, analysis_stream3);
                final SubLObject _prev_bind_2 = folification.$tptp_axiom_count$.currentBinding(thread);
                final SubLObject _prev_bind_33 = folification.$candidate_sentence_count$.currentBinding(thread);
                final SubLObject _prev_bind_34 = folification.$handled_sentence_count$.currentBinding(thread);
                final SubLObject _prev_bind_35 = folification.$term_count$.currentBinding(thread);
                final SubLObject _prev_bind_36 = folification.$handled_term_count$.currentBinding(thread);
                final SubLObject _prev_bind_37 = folification.$partially_handled_term_count$.currentBinding(thread);
                final SubLObject _prev_bind_38 = folification.$unhandled_term_count$.currentBinding(thread);
                final SubLObject _prev_bind_39 = folification.$fol_translation_type$.currentBinding(thread);
                final SubLObject _prev_bind_40 = folification.$fol_mt_handling$.currentBinding(thread);
                final SubLObject _prev_bind_41 = folification.$fol_isa_handling$.currentBinding(thread);
                final SubLObject _prev_bind_42 = folification.$fol_rmp_handling$.currentBinding(thread);
                final SubLObject _prev_bind_43 = folification.$fol_string_handling$.currentBinding(thread);
                final SubLObject _prev_bind_44 = folification.$fol_number_handling$.currentBinding(thread);
                try {
                    folification.$tptp_axiom_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$candidate_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$handled_sentence_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$partially_handled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$unhandled_term_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    folification.$fol_translation_type$.bind((folification.NIL != translation_type) ? translation_type : folification.$fol_translation_type$.getDynamicValue(thread), thread);
                    folification.$fol_mt_handling$.bind((folification.NIL != mt_handling) ? mt_handling : folification.$fol_mt_handling$.getDynamicValue(thread), thread);
                    folification.$fol_isa_handling$.bind((folification.NIL != isa_handling) ? isa_handling : folification.$fol_isa_handling$.getDynamicValue(thread), thread);
                    folification.$fol_rmp_handling$.bind((folification.NIL != rule_macro_predicate_handling) ? rule_macro_predicate_handling : folification.$fol_rmp_handling$.getDynamicValue(thread), thread);
                    folification.$fol_string_handling$.bind((folification.NIL != string_handling) ? string_handling : folification.$fol_string_handling$.getDynamicValue(thread), thread);
                    folification.$fol_number_handling$.bind((folification.NIL != number_handling) ? number_handling : folification.$fol_number_handling$.getDynamicValue(thread), thread);
                    final SubLObject rejection_statistics3 = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
                    final SubLObject assertions_fol_sentences_data3 = assertions_fol_sentences_data(assertions, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream3, rejection_statistics3, verboseP);
                    final SubLObject sentences_fol_sentences_data3 = sentences_fol_sentences_data(sentences, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream3, rejection_statistics3, verboseP);
                    final SubLObject forts_fol_sentences_data3 = forts_fol_sentences_data(v_forts, sample_rate, mt_ceiling, return_dataP, v_properties, output_stream2, analysis_stream3, rejection_statistics3, verboseP);
                    final SubLObject fol_sentences_data3 = Sequences.nreverse(ConsesLow.nconc(forts_fol_sentences_data3, sentences_fol_sentences_data3, assertions_fol_sentences_data3));
                    analysis = new_fol_sentences_analysis(v_properties, folification.$candidate_sentence_count$.getDynamicValue(thread), folification.$handled_sentence_count$.getDynamicValue(thread), folification.$term_count$.getDynamicValue(thread), folification.$handled_term_count$.getDynamicValue(thread), folification.$partially_handled_term_count$.getDynamicValue(thread), folification.$unhandled_term_count$.getDynamicValue(thread), fol_sentences_data3, rejection_statistics3);
                }
                finally {
                    folification.$fol_number_handling$.rebind(_prev_bind_44, thread);
                    folification.$fol_string_handling$.rebind(_prev_bind_43, thread);
                    folification.$fol_rmp_handling$.rebind(_prev_bind_42, thread);
                    folification.$fol_isa_handling$.rebind(_prev_bind_41, thread);
                    folification.$fol_mt_handling$.rebind(_prev_bind_40, thread);
                    folification.$fol_translation_type$.rebind(_prev_bind_39, thread);
                    folification.$unhandled_term_count$.rebind(_prev_bind_38, thread);
                    folification.$partially_handled_term_count$.rebind(_prev_bind_37, thread);
                    folification.$handled_term_count$.rebind(_prev_bind_36, thread);
                    folification.$term_count$.rebind(_prev_bind_35, thread);
                    folification.$handled_sentence_count$.rebind(_prev_bind_34, thread);
                    folification.$candidate_sentence_count$.rebind(_prev_bind_33, thread);
                    folification.$tptp_axiom_count$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return analysis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 19174L)
    public static SubLObject assertions_fol_sentences_data(final SubLObject assertions, final SubLObject sample_rate, final SubLObject mt_ceiling, final SubLObject return_dataP, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert folification.NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = (SubLObject)folification.NIL;
        elem = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            assert folification.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject fol_sentences_data = (SubLObject)folification.NIL;
        SubLObject sample_count = (SubLObject)folification.ZERO_INTEGER;
        final SubLObject message_var = (SubLObject)((folification.NIL != verboseP) ? folification.$str54$Converting_assertions_to_FOL : folification.NIL);
        if (folification.NIL != message_var) {
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((folification.NIL != ((folification.NIL != verboseP) ? folification.$str54$Converting_assertions_to_FOL : folification.NIL)) ? ((folification.NIL != verboseP) ? folification.$str54$Converting_assertions_to_FOL : folification.NIL) : folification.$str55$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(assertions), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)folification.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)folification.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = assertions;
                    SubLObject ass = (SubLObject)folification.NIL;
                    ass = csome_list_var.first();
                    while (folification.NIL != csome_list_var) {
                        sample_count = Numbers.add(sample_count, (SubLObject)folification.ONE_INTEGER);
                        if (sample_count.numE(sample_rate)) {
                            sample_count = (SubLObject)folification.ZERO_INTEGER;
                            if (folification.NIL != kb_fol_assertion_under_mt_ceilingP(ass, mt_ceiling)) {
                                SubLObject fol_sentences = (SubLObject)folification.NIL;
                                SubLObject ignore_errors_tag = (SubLObject)folification.NIL;
                                try {
                                    thread.throwStack.push(folification.$kw56$IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)folification.$sym57$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            fol_sentences = assertion_fol_sentences(ass);
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)folification.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)folification.$kw56$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (folification.NIL != fol_sentences) {
                                    final SubLObject datum = make_and_postprocess_fol_sentences_datum(ass, fol_sentences, v_properties, output_stream, analysis_stream, rejection_statistics);
                                    if (folification.NIL != return_dataP) {
                                        fol_sentences_data = (SubLObject)ConsesLow.cons(datum, fol_sentences_data);
                                    }
                                }
                                else {
                                    PrintLow.format((SubLObject)folification.T, (SubLObject)folification.$str58$failed_to_translate__s__, ass);
                                }
                            }
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ass = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            SubLObject cdolist_list_var2 = assertions;
            SubLObject ass2 = (SubLObject)folification.NIL;
            ass2 = cdolist_list_var2.first();
            while (folification.NIL != cdolist_list_var2) {
                sample_count = Numbers.add(sample_count, (SubLObject)folification.ONE_INTEGER);
                if (sample_count.numE(sample_rate)) {
                    sample_count = (SubLObject)folification.ZERO_INTEGER;
                    if (folification.NIL != kb_fol_assertion_under_mt_ceilingP(ass2, mt_ceiling)) {
                        SubLObject fol_sentences2 = (SubLObject)folification.NIL;
                        SubLObject ignore_errors_tag2 = (SubLObject)folification.NIL;
                        try {
                            thread.throwStack.push(folification.$kw56$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_9 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)folification.$sym57$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    fol_sentences2 = assertion_fol_sentences(ass2);
                                }
                                catch (Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, (SubLObject)folification.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_9, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var2) {
                            ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)folification.$kw56$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (folification.NIL != fol_sentences2) {
                            final SubLObject datum2 = make_and_postprocess_fol_sentences_datum(ass2, fol_sentences2, v_properties, output_stream, analysis_stream, rejection_statistics);
                            if (folification.NIL != return_dataP) {
                                fol_sentences_data = (SubLObject)ConsesLow.cons(datum2, fol_sentences_data);
                            }
                        }
                        else {
                            PrintLow.format((SubLObject)folification.T, (SubLObject)folification.$str58$failed_to_translate__s__, ass2);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                ass2 = cdolist_list_var2.first();
            }
        }
        return fol_sentences_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 20205L)
    public static SubLObject sentences_fol_sentences_data(final SubLObject sentences, final SubLObject sample_rate, final SubLObject mt_ceiling, final SubLObject return_dataP, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences_data = (SubLObject)folification.NIL;
        SubLObject sample_count = (SubLObject)folification.ZERO_INTEGER;
        final SubLObject message_var = (SubLObject)((folification.NIL != verboseP) ? folification.$str59$Converting_sentences_to_FOL : folification.NIL);
        if (folification.NIL != message_var) {
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((folification.NIL != ((folification.NIL != verboseP) ? folification.$str59$Converting_sentences_to_FOL : folification.NIL)) ? ((folification.NIL != verboseP) ? folification.$str59$Converting_sentences_to_FOL : folification.NIL) : folification.$str55$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(sentences), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)folification.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)folification.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = sentences;
                    SubLObject original_sentence = (SubLObject)folification.NIL;
                    original_sentence = csome_list_var.first();
                    while (folification.NIL != csome_list_var) {
                        sample_count = Numbers.add(sample_count, (SubLObject)folification.ONE_INTEGER);
                        if (sample_count.numE(sample_rate)) {
                            sample_count = (SubLObject)folification.ZERO_INTEGER;
                            SubLObject sentence = original_sentence;
                            SubLObject mt = folification.$const60$UniversalVocabularyMt;
                            thread.resetMultipleValues();
                            final SubLObject sentence_$7 = czer_utilities.unwrap_if_ist_permissive(sentence, mt);
                            final SubLObject mt_$8 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            sentence = sentence_$7;
                            mt = mt_$8;
                            if (folification.NIL != kb_fol_under_mt_ceilingP(mt, mt_ceiling)) {
                                final SubLObject fol_sentences = sentence_fol_sentences(sentence, mt);
                                if (folification.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && folification.NIL == fol_sentences) {
                                    Errors.error((SubLObject)folification.$str61$failed_to_translate__s, fol_sentences);
                                }
                                final SubLObject datum = make_and_postprocess_fol_sentences_datum(original_sentence, fol_sentences, v_properties, output_stream, analysis_stream, rejection_statistics);
                                if (folification.NIL != return_dataP) {
                                    fol_sentences_data = (SubLObject)ConsesLow.cons(datum, fol_sentences_data);
                                }
                            }
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        original_sentence = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            SubLObject cdolist_list_var = sentences;
            SubLObject original_sentence2 = (SubLObject)folification.NIL;
            original_sentence2 = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                sample_count = Numbers.add(sample_count, (SubLObject)folification.ONE_INTEGER);
                if (sample_count.numE(sample_rate)) {
                    sample_count = (SubLObject)folification.ZERO_INTEGER;
                    SubLObject sentence2 = original_sentence2;
                    SubLObject mt2 = folification.$const60$UniversalVocabularyMt;
                    thread.resetMultipleValues();
                    final SubLObject sentence_$8 = czer_utilities.unwrap_if_ist_permissive(sentence2, mt2);
                    final SubLObject mt_$9 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence2 = sentence_$8;
                    mt2 = mt_$9;
                    if (folification.NIL != kb_fol_under_mt_ceilingP(mt2, mt_ceiling)) {
                        final SubLObject fol_sentences2 = sentence_fol_sentences(sentence2, mt2);
                        if (folification.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && folification.NIL == fol_sentences2) {
                            Errors.error((SubLObject)folification.$str61$failed_to_translate__s, fol_sentences2);
                        }
                        final SubLObject datum2 = make_and_postprocess_fol_sentences_datum(original_sentence2, fol_sentences2, v_properties, output_stream, analysis_stream, rejection_statistics);
                        if (folification.NIL != return_dataP) {
                            fol_sentences_data = (SubLObject)ConsesLow.cons(datum2, fol_sentences_data);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                original_sentence2 = cdolist_list_var.first();
            }
        }
        return fol_sentences_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 21220L)
    public static SubLObject forts_fol_sentences_data(final SubLObject v_forts, final SubLObject sample_rate, final SubLObject mt_ceiling, final SubLObject return_dataP, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences_data = (SubLObject)folification.NIL;
        SubLObject sample_count = (SubLObject)folification.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)folification.$sym62$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(folification.$const63$EverythingPSC, thread);
            final SubLObject message_var = (SubLObject)((folification.NIL != verboseP) ? folification.$str64$Converting_forts_to_FOL : folification.NIL);
            if (folification.NIL != message_var) {
                final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$13 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((folification.NIL != ((folification.NIL != verboseP) ? folification.$str64$Converting_forts_to_FOL : folification.NIL)) ? ((folification.NIL != verboseP) ? folification.$str64$Converting_forts_to_FOL : folification.NIL) : folification.$str55$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(v_forts), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)folification.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)folification.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = v_forts;
                        SubLObject fort = (SubLObject)folification.NIL;
                        fort = csome_list_var.first();
                        while (folification.NIL != csome_list_var) {
                            sample_count = Numbers.add(sample_count, (SubLObject)folification.ONE_INTEGER);
                            if (sample_count.numE(sample_rate)) {
                                sample_count = (SubLObject)folification.ZERO_INTEGER;
                                final SubLObject allow_equiv_relationP = conses_high.getf(v_properties, (SubLObject)folification.$kw43$ALLOW_EQUIV_RELATION_, (SubLObject)folification.NIL);
                                final SubLObject fol_sentences = kb_fol_additional_sentences_for_term(fort, mt_ceiling, allow_equiv_relationP);
                                if (folification.NIL != fol_sentences) {
                                    final SubLObject datum = make_and_postprocess_fol_sentences_datum(fort, fol_sentences, v_properties, output_stream, analysis_stream, rejection_statistics);
                                    if (folification.NIL != return_dataP) {
                                        fol_sentences_data = (SubLObject)ConsesLow.cons(datum, fol_sentences_data);
                                    }
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            fort = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$13, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$12, thread);
                }
            }
            else {
                SubLObject cdolist_list_var = v_forts;
                SubLObject fort2 = (SubLObject)folification.NIL;
                fort2 = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    sample_count = Numbers.add(sample_count, (SubLObject)folification.ONE_INTEGER);
                    if (sample_count.numE(sample_rate)) {
                        sample_count = (SubLObject)folification.ZERO_INTEGER;
                        final SubLObject allow_equiv_relationP2 = conses_high.getf(v_properties, (SubLObject)folification.$kw43$ALLOW_EQUIV_RELATION_, (SubLObject)folification.NIL);
                        final SubLObject fol_sentences2 = kb_fol_additional_sentences_for_term(fort2, mt_ceiling, allow_equiv_relationP2);
                        if (folification.NIL != fol_sentences2) {
                            final SubLObject datum2 = make_and_postprocess_fol_sentences_datum(fort2, fol_sentences2, v_properties, output_stream, analysis_stream, rejection_statistics);
                            if (folification.NIL != return_dataP) {
                                fol_sentences_data = (SubLObject)ConsesLow.cons(datum2, fol_sentences_data);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    fort2 = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return fol_sentences_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 22086L)
    public static SubLObject load_fol_sentences_analysis(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert folification.NIL != Types.stringp(filename) : filename;
        SubLObject fol_sentences_analysis = (SubLObject)folification.NIL;
        SubLObject additional_fol_sentences_data = (SubLObject)folification.NIL;
        SubLObject stream = (SubLObject)folification.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)folification.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)folification.$kw66$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename);
            }
            final SubLObject stream_$15 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)folification.NIL, thread);
                cfasl.cfasl_set_common_symbols(dumper.kb_dump_common_symbols());
                final SubLObject _prev_bind_0_$16 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
                    fol_sentences_analysis = cfasl.cfasl_input(stream_$15, (SubLObject)folification.T, (SubLObject)folification.UNPROVIDED);
                    if (folification.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && folification.$kw67$ANALYSIS != fol_sentences_input_item_type(fol_sentences_analysis)) {
                        Errors.error((SubLObject)folification.$str68$Expected_a_fol_sentences_analysis);
                    }
                    SubLObject doneP = (SubLObject)folification.NIL;
                    while (folification.NIL == doneP) {
                        final SubLObject input_item = cfasl.cfasl_input(stream_$15, (SubLObject)folification.NIL, (SubLObject)folification.$kw69$EOF);
                        doneP = Equality.eq(input_item, (SubLObject)folification.$kw69$EOF);
                        if (folification.NIL == doneP) {
                            if (folification.$kw70$DATUM == fol_sentences_input_item_type(input_item)) {
                                additional_fol_sentences_data = (SubLObject)ConsesLow.cons(input_item, additional_fol_sentences_data);
                            }
                            else {
                                fol_sentences_analysis = input_item;
                            }
                        }
                    }
                }
                finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)folification.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        additional_fol_sentences_data = Sequences.nreverse(additional_fol_sentences_data);
        fol_sentences_analysis = fol_sentences_analysis_nmerge_fol_sentences_data(fol_sentences_analysis, additional_fol_sentences_data);
        return fol_sentences_analysis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 23537L)
    public static SubLObject fol_sentences_input_item_type(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !list.isCons()) {
            Errors.error((SubLObject)folification.$str71$expected_to_input_a_cons__got__s, list);
        }
        final SubLObject first_item = list.first();
        if (first_item.isKeyword()) {
            return (SubLObject)folification.$kw67$ANALYSIS;
        }
        return (SubLObject)folification.$kw70$DATUM;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 23862L)
    public static SubLObject fol_sentences_analysis_nmerge_fol_sentences_data(SubLObject analysis, final SubLObject additional_fol_sentences_data) {
        if (folification.NIL != additional_fol_sentences_data) {
            SubLObject fol_sentences_data = fol_sentences_analysis_data(analysis);
            fol_sentences_data = ConsesLow.nconc(fol_sentences_data, additional_fol_sentences_data);
            analysis = conses_high.putf(analysis, (SubLObject)folification.$kw24$FOL_SENTENCES_DATA, fol_sentences_data);
        }
        return analysis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 24278L)
    public static SubLObject fol_sentences_to_file(final SubLObject fol_sentences_analysis, final SubLObject output_format, final SubLObject filename) {
        SubLObject result = (SubLObject)folification.NIL;
        SubLObject stream = (SubLObject)folification.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)folification.$kw52$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            result = fol_sentences_to_stream(fol_sentences_analysis, output_format, s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)folification.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)folification.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 24563L)
    public static SubLObject fol_sentences_to_stream(final SubLObject fol_sentences_analysis, final SubLObject output_format, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (output_format.eql((SubLObject)folification.$kw72$CYCL)) {
            return fol_sentences_to_cycl_stream(fol_sentences_analysis, stream);
        }
        if (output_format.eql((SubLObject)folification.$kw28$TPTP)) {
            return fol_sentences_to_tptp_stream(fol_sentences_analysis, stream);
        }
        if (output_format == folification.$kw73$ALCHEMY) {
            return fol_sentences_to_alchemy_stream(fol_sentences_analysis, stream);
        }
        return Errors.error((SubLObject)folification.$str74$Unrecognized_output_format___s, output_format);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 25185L)
    public static SubLObject fol_sentences_symbol_count(final SubLObject fol_sentences_analysis) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = set.new_set(Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED);
        final SubLObject list_var;
        final SubLObject fol_sentences_data = list_var = fol_sentences_analysis_data(fol_sentences_analysis);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)folification.$str75$Gathering_FOL_symbols, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)folification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)folification.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)folification.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)folification.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject datum = (SubLObject)folification.NIL;
                datum = csome_list_var.first();
                while (folification.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum_$17 = current = datum;
                    SubLObject v_term = (SubLObject)folification.NIL;
                    SubLObject fol_sentences = (SubLObject)folification.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum_$17, (SubLObject)folification.$list76);
                    v_term = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum_$17, (SubLObject)folification.$list76);
                    fol_sentences = current.first();
                    current = current.rest();
                    final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum_$17, (SubLObject)folification.$list76);
                    current = current.rest();
                    if (folification.NIL == current) {
                        SubLObject cdolist_list_var = list_utilities.tree_gather(fol_sentences, (SubLObject)folification.$sym77$FOL_REPRESENTED_TERM_P, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
                        SubLObject fol_term = (SubLObject)folification.NIL;
                        fol_term = cdolist_list_var.first();
                        while (folification.NIL != cdolist_list_var) {
                            set.set_add(fol_term, v_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            fol_term = cdolist_list_var.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$17, (SubLObject)folification.$list76);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    datum = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return set.set_size(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 25706L)
    public static SubLObject query_fol_sentence(final SubLObject query, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)folification.NIL;
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = (SubLObject)folification.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)folification.NIL;
        SubLObject current_$19 = (SubLObject)folification.NIL;
        while (folification.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)folification.$list78);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)folification.$list78);
            if (folification.NIL == conses_high.member(current_$19, (SubLObject)folification.$list79, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED)) {
                bad = (SubLObject)folification.T;
            }
            if (current_$19 == folification.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (folification.NIL != bad && folification.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list78);
        }
        final SubLObject translation_type_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw36$TRANSLATION_TYPE, current);
        final SubLObject translation_type = (SubLObject)((folification.NIL != translation_type_tail) ? conses_high.cadr(translation_type_tail) : folification.NIL);
        final SubLObject mt_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw37$MT_HANDLING, current);
        final SubLObject mt_handling = (SubLObject)((folification.NIL != mt_handling_tail) ? conses_high.cadr(mt_handling_tail) : folification.NIL);
        final SubLObject mt_ceiling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw38$MT_CEILING, current);
        final SubLObject mt_ceiling = (SubLObject)((folification.NIL != mt_ceiling_tail) ? conses_high.cadr(mt_ceiling_tail) : folification.NIL);
        final SubLObject isa_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw39$ISA_HANDLING, current);
        final SubLObject isa_handling = (SubLObject)((folification.NIL != isa_handling_tail) ? conses_high.cadr(isa_handling_tail) : folification.NIL);
        final SubLObject rule_macro_predicate_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw40$RULE_MACRO_PREDICATE_HANDLING, current);
        final SubLObject rule_macro_predicate_handling = (SubLObject)((folification.NIL != rule_macro_predicate_handling_tail) ? conses_high.cadr(rule_macro_predicate_handling_tail) : folification.NIL);
        final SubLObject string_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw41$STRING_HANDLING, current);
        final SubLObject string_handling = (SubLObject)((folification.NIL != string_handling_tail) ? conses_high.cadr(string_handling_tail) : folification.NIL);
        final SubLObject number_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw42$NUMBER_HANDLING, current);
        final SubLObject number_handling = (SubLObject)((folification.NIL != number_handling_tail) ? conses_high.cadr(number_handling_tail) : folification.NIL);
        final SubLObject allow_equiv_relationP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw43$ALLOW_EQUIV_RELATION_, current);
        final SubLObject allow_equiv_relationP = (SubLObject)((folification.NIL != allow_equiv_relationP_tail) ? conses_high.cadr(allow_equiv_relationP_tail) : folification.NIL);
        final SubLObject sample_rate_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw44$SAMPLE_RATE, current);
        final SubLObject sample_rate = (SubLObject)((folification.NIL != sample_rate_tail) ? conses_high.cadr(sample_rate_tail) : folification.ONE_INTEGER);
        final SubLObject output_filename_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw26$OUTPUT_FILENAME, current);
        final SubLObject output_filename = (SubLObject)((folification.NIL != output_filename_tail) ? conses_high.cadr(output_filename_tail) : folification.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw27$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((folification.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : folification.NIL);
        final SubLObject header_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw45$HEADER, current);
        final SubLObject header = (SubLObject)((folification.NIL != header_tail) ? conses_high.cadr(header_tail) : folification.NIL);
        final SubLObject include_commentsP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw48$INCLUDE_COMMENTS_, current);
        final SubLObject include_commentsP = (SubLObject)((folification.NIL != include_commentsP_tail) ? conses_high.cadr(include_commentsP_tail) : folification.NIL);
        final SubLObject negate_queriesP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw50$NEGATE_QUERIES_, current);
        final SubLObject negate_queriesP = (SubLObject)((folification.NIL != negate_queriesP_tail) ? conses_high.cadr(negate_queriesP_tail) : folification.T);
        final SubLObject verboseP_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw51$VERBOSE_, current);
        final SubLObject verboseP = (SubLObject)((folification.NIL != verboseP_tail) ? conses_high.cadr(verboseP_tail) : folification.T);
        check_folification_properties(translation_type, mt_handling, (SubLObject)folification.NIL, isa_handling, rule_macro_predicate_handling, string_handling, number_handling, allow_equiv_relationP, sample_rate, output_filename, output_format, header, (SubLObject)folification.NIL, (SubLObject)folification.NIL, include_commentsP, (SubLObject)folification.T, negate_queriesP, verboseP);
        SubLObject disjuncts = (SubLObject)folification.NIL;
        final SubLObject _prev_bind_0 = folification.$fol_translation_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = folification.$fol_mt_handling$.currentBinding(thread);
        final SubLObject _prev_bind_3 = folification.$fol_isa_handling$.currentBinding(thread);
        final SubLObject _prev_bind_4 = folification.$fol_rmp_handling$.currentBinding(thread);
        final SubLObject _prev_bind_5 = folification.$fol_string_handling$.currentBinding(thread);
        final SubLObject _prev_bind_6 = folification.$fol_number_handling$.currentBinding(thread);
        try {
            folification.$fol_translation_type$.bind((folification.NIL != translation_type) ? translation_type : folification.$fol_translation_type$.getDynamicValue(thread), thread);
            folification.$fol_mt_handling$.bind((folification.NIL != mt_handling) ? mt_handling : folification.$fol_mt_handling$.getDynamicValue(thread), thread);
            folification.$fol_isa_handling$.bind((folification.NIL != isa_handling) ? isa_handling : folification.$fol_isa_handling$.getDynamicValue(thread), thread);
            folification.$fol_rmp_handling$.bind((folification.NIL != rule_macro_predicate_handling) ? rule_macro_predicate_handling : folification.$fol_rmp_handling$.getDynamicValue(thread), thread);
            folification.$fol_string_handling$.bind((folification.NIL != string_handling) ? string_handling : folification.$fol_string_handling$.getDynamicValue(thread), thread);
            folification.$fol_number_handling$.bind((folification.NIL != number_handling) ? number_handling : folification.$fol_number_handling$.getDynamicValue(thread), thread);
            final SubLObject dnfs = clausifier.dnf_clausal_form(query, mt);
            if (folification.NIL == cycl_grammar.cycl_truth_value_p(dnfs)) {
                SubLObject cdolist_list_var = dnfs;
                SubLObject dnf = (SubLObject)folification.NIL;
                dnf = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    SubLObject current_$20;
                    final SubLObject datum_$20 = current_$20 = dnf;
                    SubLObject neg_lits = (SubLObject)folification.NIL;
                    SubLObject pos_lits = (SubLObject)folification.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$20, (SubLObject)folification.$list80);
                    neg_lits = current_$20.first();
                    current_$20 = current_$20.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$20, (SubLObject)folification.$list80);
                    pos_lits = current_$20.first();
                    current_$20 = current_$20.rest();
                    if (folification.NIL == current_$20) {
                        SubLObject fol_neg_lits = (SubLObject)folification.NIL;
                        SubLObject fol_pos_lits = (SubLObject)folification.NIL;
                        SubLObject cdolist_list_var_$22 = neg_lits;
                        SubLObject neg_lit = (SubLObject)folification.NIL;
                        neg_lit = cdolist_list_var_$22.first();
                        while (folification.NIL != cdolist_list_var_$22) {
                            final SubLObject fol_sentence = asent_sentence(neg_lit, mt, mt_handling);
                            fol_neg_lits = (SubLObject)ConsesLow.cons(fol_sentence, fol_neg_lits);
                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                            neg_lit = cdolist_list_var_$22.first();
                        }
                        SubLObject cdolist_list_var_$23 = pos_lits;
                        SubLObject pos_lit = (SubLObject)folification.NIL;
                        pos_lit = cdolist_list_var_$23.first();
                        while (folification.NIL != cdolist_list_var_$23) {
                            final SubLObject fol_sentence = asent_sentence(pos_lit, mt, mt_handling);
                            fol_pos_lits = (SubLObject)ConsesLow.cons(fol_sentence, fol_pos_lits);
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            pos_lit = cdolist_list_var_$23.first();
                        }
                        fol_neg_lits = Sequences.nreverse(fol_neg_lits);
                        fol_pos_lits = Sequences.nreverse(fol_pos_lits);
                        final SubLObject fol_dnf = clauses.make_dnf(fol_neg_lits, fol_pos_lits);
                        final SubLObject fol_sentence2 = clauses.dnf_formula(fol_dnf);
                        disjuncts = (SubLObject)ConsesLow.cons(fol_sentence2, disjuncts);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)folification.$list80);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    dnf = cdolist_list_var.first();
                }
            }
            if (folification.NIL == disjuncts) {
                result = (SubLObject)folification.NIL;
            }
            else {
                result = simplifier.simplify_cycl_sentence_syntax(simplifier.disjoin(disjuncts, (SubLObject)folification.UNPROVIDED), (SubLObject)folification.UNPROVIDED);
                final SubLObject pcase_var = folification.$fol_mt_handling$.getDynamicValue(thread);
                if (pcase_var.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
                    final SubLObject mt_visible_asent = el_utilities.make_binary_formula(folification.$const82$genlMt, folification.$const60$UniversalVocabularyMt, (SubLObject)folification.$sym83$_MT);
                    final SubLObject genlmt_fol_asent = asent_sentence(mt_visible_asent, mt, folification.$fol_mt_handling$.getDynamicValue(thread));
                    result = el_utilities.make_implication(genlmt_fol_asent, result);
                }
                else if (pcase_var.eql((SubLObject)folification.$kw84$MT_VISIBLE)) {
                    final SubLObject mt_visible_asent = el_utilities.make_unary_formula(folification.$const85$mtVisible, mt);
                    final SubLObject mt_visible_fol_asent = asent_sentence(mt_visible_asent, mt, folification.$fol_mt_handling$.getDynamicValue(thread));
                    result = el_utilities.make_implication(mt_visible_fol_asent, result);
                }
                else if (pcase_var.eql((SubLObject)folification.$kw3$MT_VISIBLE_EXCEPT_CORE_MTS)) {
                    if (folification.NIL == mt_vars.core_microtheory_p(mt)) {
                        final SubLObject mt_visible_asent = el_utilities.make_unary_formula(folification.$const85$mtVisible, mt);
                        final SubLObject mt_visible_fol_asent = asent_sentence(mt_visible_asent, mt, folification.$fol_mt_handling$.getDynamicValue(thread));
                        result = el_utilities.make_implication(mt_visible_fol_asent, result);
                    }
                }
                else if (pcase_var.eql((SubLObject)folification.$kw86$FLAT)) {}
                if (folification.NIL != negate_queriesP) {
                    result = cycl_utilities.negate(result);
                }
            }
        }
        finally {
            folification.$fol_number_handling$.rebind(_prev_bind_6, thread);
            folification.$fol_string_handling$.rebind(_prev_bind_5, thread);
            folification.$fol_rmp_handling$.rebind(_prev_bind_4, thread);
            folification.$fol_isa_handling$.rebind(_prev_bind_3, thread);
            folification.$fol_mt_handling$.rebind(_prev_bind_2, thread);
            folification.$fol_translation_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 28817L)
    public static SubLObject fol_query_to_stream(final SubLObject fol_query, final SubLObject fol_sentences_analysis, final SubLObject output_format, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (output_format.eql((SubLObject)folification.$kw72$CYCL)) {
            return fol_query_to_cycl_stream(fol_query, fol_sentences_analysis, stream);
        }
        if (output_format.eql((SubLObject)folification.$kw28$TPTP)) {
            return fol_query_to_tptp_stream(fol_query, fol_sentences_analysis, stream);
        }
        if (output_format == folification.$kw73$ALCHEMY) {
            return Errors.error((SubLObject)folification.$str87$Queries_not_supported_for_Alchemy);
        }
        return Errors.error((SubLObject)folification.$str74$Unrecognized_output_format___s, output_format);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 29362L)
    public static SubLObject kbq_fol_sentence(final SubLObject query_spec, SubLObject v_properties) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, (SubLObject)folification.UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (folification.NIL != conses_high.getf(query_properties, (SubLObject)folification.$kw88$CONDITIONAL_SENTENCE_, (SubLObject)folification.UNPROVIDED)) {
            Errors.warn((SubLObject)folification.$str89$can_t_handle_conditional_sentence);
            return (SubLObject)folification.NIL;
        }
        return query_fol_sentence(sentence, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 29739L)
    public static SubLObject kbq_fol_sentence_to_stream(final SubLObject query_spec, final SubLObject fol_sentences_analysis, final SubLObject output_format, SubLObject v_properties, SubLObject stream) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject fol_query = kbq_fol_sentence(query_spec, v_properties);
        if (folification.NIL != fol_query) {
            fol_query_to_stream(fol_query, fol_sentences_analysis, output_format, stream);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 30061L)
    public static SubLObject assertion_fol_sentences_to_stream(final SubLObject assertion, final SubLObject output_format, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        final SubLObject _prev_bind_0 = folification.$tptp_axiom_count$.currentBinding(thread);
        try {
            folification.$tptp_axiom_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
            final SubLObject rejection_statistics = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = folification.$candidate_sentence_count$.currentBinding(thread);
            try {
                folification.$candidate_sentence_count$.bind((SubLObject)folification.$kw90$TESTING, thread);
                fol_sentences = assertion_fol_sentences(assertion);
                final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)folification.$kw27$OUTPUT_FORMAT, output_format);
                make_and_postprocess_fol_sentences_datum(assertion, fol_sentences, v_properties, stream, (SubLObject)folification.NIL, rejection_statistics);
            }
            finally {
                folification.$candidate_sentence_count$.rebind(_prev_bind_0_$24, thread);
            }
        }
        finally {
            folification.$tptp_axiom_count$.rebind(_prev_bind_0, thread);
        }
        return fol_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 30640L)
    public static SubLObject make_and_postprocess_fol_sentences_datum(final SubLObject v_term, final SubLObject fol_sentences, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics) {
        final SubLObject datum = make_fol_sentences_datum(v_term, fol_sentences);
        postprocess_fol_sentences_datum(datum, v_properties, output_stream, analysis_stream, rejection_statistics);
        return datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 31003L)
    public static SubLObject make_fol_sentences_datum(final SubLObject v_term, final SubLObject fol_sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject handled_fol_sentences = partition_fol_unhandled_sentences(fol_sentences);
        final SubLObject unhandled_fol_sentences = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (folification.NIL != unhandled_fol_sentences) {
            return (SubLObject)ConsesLow.list(v_term, handled_fol_sentences, unhandled_fol_sentences);
        }
        return (SubLObject)ConsesLow.list(v_term, handled_fol_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 31338L)
    public static SubLObject postprocess_fol_sentences_datum(final SubLObject datum, final SubLObject v_properties, final SubLObject output_stream, final SubLObject analysis_stream, final SubLObject rejection_statistics) {
        update_fol_analysis_counts(datum);
        if (folification.NIL != output_stream) {
            postprocess_fol_sentences_datum_output(datum, v_properties, output_stream);
        }
        if (folification.NIL != analysis_stream) {
            postprocess_fol_sentences_datum_analysis(datum, v_properties, analysis_stream);
        }
        fol_sentences_datum_update_rejection_statistics(datum, rejection_statistics);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 31792L)
    public static SubLObject postprocess_fol_sentences_datum_output(final SubLObject datum, final SubLObject v_properties, final SubLObject output_stream) {
        final SubLObject output_format = conses_high.getf(v_properties, (SubLObject)folification.$kw27$OUTPUT_FORMAT, (SubLObject)folification.UNPROVIDED);
        fol_datum_to_stream(datum, output_format, output_stream);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 32014L)
    public static SubLObject postprocess_fol_sentences_datum_analysis(final SubLObject datum, final SubLObject v_properties, final SubLObject analysis_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internalP = conses_high.getf(v_properties, (SubLObject)folification.$kw47$ANALYSIS_FILE_INTERNAL_, (SubLObject)folification.UNPROVIDED);
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)folification.NIL, thread);
            cfasl.cfasl_set_common_symbols(dumper.kb_dump_common_symbols());
            if (folification.NIL != internalP) {
                cfasl.cfasl_output(datum, analysis_stream);
            }
            else {
                cfasl.cfasl_output_externalized(datum, analysis_stream);
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 32373L)
    public static SubLObject possibly_save_fol_sentences_analysis(final SubLObject analysis, final SubLObject analysis_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(analysis);
        if (folification.NIL != analysis_stream) {
            final SubLObject internalP = conses_high.getf(v_properties, (SubLObject)folification.$kw47$ANALYSIS_FILE_INTERNAL_, (SubLObject)folification.UNPROVIDED);
            final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)folification.NIL, thread);
                cfasl.cfasl_set_common_symbols(dumper.kb_dump_common_symbols());
                if (folification.NIL != internalP) {
                    cfasl.cfasl_output(analysis, analysis_stream);
                }
                else {
                    cfasl.cfasl_output_externalized(analysis, analysis_stream);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
            }
            return (SubLObject)folification.T;
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 32842L)
    public static SubLObject update_fol_analysis_counts(final SubLObject datum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.$candidate_sentence_count$.getDynamicValue(thread) == folification.$kw90$TESTING) {
            return datum;
        }
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(datum, datum, (SubLObject)folification.$list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)folification.$list76);
        current = current.rest();
        if (folification.NIL == current) {
            folification.$candidate_sentence_count$.setDynamicValue(Numbers.add(folification.$candidate_sentence_count$.getDynamicValue(thread), Sequences.length(fol_sentences)), thread);
            folification.$candidate_sentence_count$.setDynamicValue(Numbers.add(folification.$candidate_sentence_count$.getDynamicValue(thread), Sequences.length(unhandled_fol_sentences)), thread);
            folification.$handled_sentence_count$.setDynamicValue(Numbers.add(folification.$handled_sentence_count$.getDynamicValue(thread), Sequences.length(fol_sentences)), thread);
            folification.$term_count$.setDynamicValue(Numbers.add(folification.$term_count$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
            if (folification.NIL != fol_sentences && folification.NIL == unhandled_fol_sentences) {
                folification.$handled_term_count$.setDynamicValue(Numbers.add(folification.$handled_term_count$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
            }
            else if (folification.NIL != fol_sentences && folification.NIL != unhandled_fol_sentences) {
                folification.$partially_handled_term_count$.setDynamicValue(Numbers.add(folification.$partially_handled_term_count$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
            }
            else {
                folification.$unhandled_term_count$.setDynamicValue(Numbers.add(folification.$unhandled_term_count$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list76);
        }
        return datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 33636L)
    public static SubLObject check_folification_properties(final SubLObject translation_type, final SubLObject mt_handling, final SubLObject mt_ceiling, final SubLObject isa_handling, final SubLObject rule_macro_predicate_handling, final SubLObject string_handling, final SubLObject number_handling, final SubLObject allow_equiv_relationP, final SubLObject sample_rate, final SubLObject output_filename, final SubLObject output_format, final SubLObject header, final SubLObject analysis_filename, final SubLObject analysis_file_internalP, final SubLObject include_commentsP, final SubLObject return_dataP, final SubLObject negate_queriesP, final SubLObject verboseP) {
        if (folification.NIL != translation_type && !folification.assertionsDisabledSynth && folification.NIL == fol_translation_type_property_p(translation_type)) {
            throw new AssertionError(translation_type);
        }
        if (folification.NIL != mt_handling && !folification.assertionsDisabledSynth && folification.NIL == fol_mt_handling_property_p(mt_handling)) {
            throw new AssertionError(mt_handling);
        }
        if (folification.NIL != mt_ceiling && !folification.assertionsDisabledSynth && folification.NIL == hlmt.hlmt_p(mt_ceiling)) {
            throw new AssertionError(mt_ceiling);
        }
        if (folification.NIL != isa_handling && !folification.assertionsDisabledSynth && folification.NIL == fol_isa_handling_property_p(isa_handling)) {
            throw new AssertionError(isa_handling);
        }
        if (folification.NIL != rule_macro_predicate_handling && !folification.assertionsDisabledSynth && folification.NIL == fol_rmp_handling_property_p(rule_macro_predicate_handling)) {
            throw new AssertionError(rule_macro_predicate_handling);
        }
        if (folification.NIL != string_handling && !folification.assertionsDisabledSynth && folification.NIL == fol_string_handling_property_p(string_handling)) {
            throw new AssertionError(string_handling);
        }
        if (folification.NIL != number_handling && !folification.assertionsDisabledSynth && folification.NIL == fol_number_handling_property_p(number_handling)) {
            throw new AssertionError(number_handling);
        }
        assert folification.NIL != Types.booleanp(allow_equiv_relationP) : allow_equiv_relationP;
        assert folification.NIL != subl_promotions.positive_integer_p(sample_rate) : sample_rate;
        if (folification.NIL != output_filename && !folification.assertionsDisabledSynth && folification.NIL == file_utilities.file_valid_for_writing_p(output_filename)) {
            throw new AssertionError(output_filename);
        }
        if (folification.NIL != output_format && !folification.assertionsDisabledSynth && folification.NIL == fol_output_format_p(output_format)) {
            throw new AssertionError(output_format);
        }
        if (folification.NIL != header && !folification.assertionsDisabledSynth && folification.NIL == Types.stringp(header)) {
            throw new AssertionError(header);
        }
        if (folification.NIL != analysis_filename && !folification.assertionsDisabledSynth && folification.NIL == file_utilities.file_valid_for_writing_p(analysis_filename)) {
            throw new AssertionError(analysis_filename);
        }
        assert folification.NIL != Types.booleanp(analysis_file_internalP) : analysis_file_internalP;
        assert folification.NIL != Types.booleanp(include_commentsP) : include_commentsP;
        assert folification.NIL != Types.booleanp(return_dataP) : return_dataP;
        assert folification.NIL != Types.booleanp(negate_queriesP) : negate_queriesP;
        assert folification.NIL != Types.booleanp(verboseP) : verboseP;
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 34993L)
    public static SubLObject kb_fol_assertion_under_mt_ceilingP(final SubLObject assertion, final SubLObject mt_ceiling_spec) {
        return kb_fol_under_mt_ceilingP(assertions_high.assertion_mt(assertion), mt_ceiling_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 35150L)
    public static SubLObject kb_fol_under_mt_ceilingP(final SubLObject mt, final SubLObject mt_ceiling_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject above_ceilingP = (SubLObject)folification.NIL;
        if (folification.NIL != mt_ceiling_spec) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_ceiling_spec);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                above_ceilingP = mt_relevance_macros.relevant_mtP(mt);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == above_ceilingP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 35513L)
    public static SubLObject assertion_fol_sentences(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        final SubLObject pcase_var = folification.$fol_rmp_handling$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)folification.$kw8$GAF)) {
            fol_sentences = assertion_fol_sentences_int(assertion, mt);
        }
        else if (pcase_var.eql((SubLObject)folification.$kw102$EXPANSION) || pcase_var.eql((SubLObject)folification.$kw103$GAF_AND_EXPANSION)) {
            final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject _prev_bind_0 = folification.$fol_rmp_handling$.currentBinding(thread);
            try {
                folification.$fol_rmp_handling$.bind((SubLObject)folification.$kw102$EXPANSION, thread);
                fol_sentences = sentence_fol_sentences(formula, mt);
            }
            finally {
                folification.$fol_rmp_handling$.rebind(_prev_bind_0, thread);
            }
        }
        if (folification.$fol_rmp_handling$.getDynamicValue(thread) == folification.$kw103$GAF_AND_EXPANSION) {
            fol_sentences = ConsesLow.nconc(fol_sentences, assertion_fol_sentences_int(assertion, mt));
        }
        if (folification.NIL != assertions_high.gaf_assertionP(assertion) && folification.NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject additional_sentences = additional_gaf_fol_sentences(gaf, mt);
            if (folification.NIL != fol_sentences) {
                fol_sentences = ConsesLow.nconc(fol_sentences, additional_sentences);
            }
        }
        return list_utilities.fast_delete_duplicates(fol_sentences, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 36679L)
    public static SubLObject assertion_fol_sentences_int(final SubLObject assertion, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = assertions_high.intuitive_assertion_cnf(assertion);
        SubLObject sentences = (SubLObject)folification.NIL;
        final SubLObject _prev_bind_0 = folification.$fol_current_assertion$.currentBinding(thread);
        try {
            folification.$fol_current_assertion$.bind(assertion, thread);
            sentences = cnf_fol_sentences(cnf, mt);
        }
        finally {
            folification.$fol_current_assertion$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 36925L)
    public static SubLObject sentence_fol_sentences(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycl_sentences = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        final SubLObject pcase_var = folification.$fol_rmp_handling$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)folification.$kw8$GAF)) {
            cycl_sentences = (SubLObject)ConsesLow.cons(sentence, cycl_sentences);
        }
        else if (pcase_var.eql((SubLObject)folification.$kw102$EXPANSION)) {
            cycl_sentences = (SubLObject)ConsesLow.cons(fol_expand_sentence(sentence, mt), cycl_sentences);
        }
        else if (pcase_var.eql((SubLObject)folification.$kw103$GAF_AND_EXPANSION)) {
            cycl_sentences = (SubLObject)ConsesLow.cons(sentence, cycl_sentences);
            final SubLObject expanded_sentence = fol_expand_sentence(sentence, mt);
            if (!sentence.equal(expanded_sentence)) {
                cycl_sentences = (SubLObject)ConsesLow.cons(expanded_sentence, cycl_sentences);
            }
        }
        SubLObject cdolist_list_var = cycl_sentences;
        SubLObject sentence_$26 = (SubLObject)folification.NIL;
        sentence_$26 = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            final SubLObject cnfs = cnf_clausal_form_for_fol(sentence_$26, mt);
            if (folification.NIL == cycl_grammar.cycl_truth_value_p(cnfs)) {
                SubLObject cdolist_list_var_$27 = cnfs;
                SubLObject cnf = (SubLObject)folification.NIL;
                cnf = cdolist_list_var_$27.first();
                while (folification.NIL != cdolist_list_var_$27) {
                    fol_sentences = ConsesLow.nconc(fol_sentences, cnf_fol_sentences(cnf, mt));
                    if (folification.NIL != clauses.gaf_cnfP(cnf)) {
                        final SubLObject gaf = clause_utilities.atomic_cnf_asent(cnf);
                        final SubLObject additional_sentences = additional_gaf_fol_sentences(gaf, mt);
                        fol_sentences = ConsesLow.nconc(fol_sentences, additional_sentences);
                    }
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    cnf = cdolist_list_var_$27.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence_$26 = cdolist_list_var.first();
        }
        return fol_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 37952L)
    public static SubLObject fol_expand_sentence(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.NIL == el_utilities.el_formula_with_operator_p(sentence, folification.$const104$resultIsaArg)) {
            SubLObject result = (SubLObject)folification.NIL;
            if (folification.NIL != mt_vars.core_microtheory_p(mt)) {
                mt = mt_vars.$core_mt_floor$.getGlobalValue();
            }
            if (folification.NIL != list_utilities.tree_find_if((SubLObject)folification.$sym110$FOL_EXPANDIBLE_EXPRESSION_, sentence, (SubLObject)folification.UNPROVIDED)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    result = el_utilities.implicitify_explicit_universal_quantifiers(transform_list_utilities.quiescent_transform(sentence, (SubLObject)folification.$sym110$FOL_EXPANDIBLE_EXPRESSION_, (SubLObject)folification.$sym111$FOL_EXPAND_ONE_STEP, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        final SubLObject pcase_var = cycl_utilities.formula_arg1(sentence, (SubLObject)folification.UNPROVIDED);
        if (pcase_var.eql(folification.$const105$RelationAllExistsFn)) {
            return (SubLObject)folification.$list106;
        }
        if (pcase_var.eql(folification.$const107$RelationExistsAllFn)) {
            return (SubLObject)folification.$list108;
        }
        return fol_unhandled((SubLObject)folification.$kw109$EXPLICITLY_FORBIDDEN_TERM, folification.$const104$resultIsaArg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 39065L)
    public static SubLObject fol_expandible_expressionP(final SubLObject formula) {
        return fol_expandible_rmpP(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 39158L)
    public static SubLObject fol_expandible_rmpP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_operator(formula)) && folification.NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.formula_operator(formula), folification.$const112$expansion, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 39336L)
    public static SubLObject fol_expand_one_step(final SubLObject formula, SubLObject mt) {
        if (mt == folification.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return el_utilities.explicitify_implicit_universal_quantifiers(verbosifier.el_expansion_one_step(formula, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 39492L)
    public static SubLObject cnf_clausal_form_for_fol(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnfs = (SubLObject)folification.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = clausifier.$use_cnf_cacheP$.currentBinding(thread);
        try {
            czer_vars.$turn_existentials_into_skolemsP$.bind((SubLObject)folification.NIL, thread);
            clausifier.$use_cnf_cacheP$.bind((SubLObject)folification.NIL, thread);
            cnfs = clausifier.cnf_clausal_form(sentence, mt);
        }
        finally {
            clausifier.$use_cnf_cacheP$.rebind(_prev_bind_2, thread);
            czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return cnfs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 39780L)
    public static SubLObject cnf_fol_sentences(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = (SubLObject)folification.NIL;
        SubLObject neg_lits = (SubLObject)folification.NIL;
        SubLObject pos_lits = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(cnf, cnf, (SubLObject)folification.$list80);
        neg_lits = cnf.first();
        SubLObject current = cnf.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, cnf, (SubLObject)folification.$list80);
        pos_lits = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            SubLObject fol_neg_lits = (SubLObject)folification.NIL;
            SubLObject fol_pos_lits = (SubLObject)folification.NIL;
            SubLObject not_in_theoryP = (SubLObject)folification.NIL;
            final SubLObject pcase_var = folification.$fol_mt_handling$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
                if (folification.NIL != neg_lits || !Sequences.length(pos_lits).equal((SubLObject)folification.ONE_INTEGER) || !pos_lits.first().first().equal(folification.$const82$genlMt)) {
                    final SubLObject genlmt_asent = el_utilities.make_binary_formula(folification.$const82$genlMt, mt, (SubLObject)folification.$sym83$_MT);
                    fol_neg_lits = (SubLObject)ConsesLow.cons(asent_sentence(genlmt_asent, folification.$const60$UniversalVocabularyMt, folification.$fol_mt_handling$.getDynamicValue(thread)), fol_neg_lits);
                }
            }
            else if (pcase_var.eql((SubLObject)folification.$kw84$MT_VISIBLE)) {
                final SubLObject mt_visible_asent = el_utilities.make_unary_formula(folification.$const85$mtVisible, mt);
                fol_neg_lits = (SubLObject)ConsesLow.cons(asent_sentence(mt_visible_asent, mt, folification.$fol_mt_handling$.getDynamicValue(thread)), fol_neg_lits);
            }
            else if (pcase_var.eql((SubLObject)folification.$kw3$MT_VISIBLE_EXCEPT_CORE_MTS)) {
                if (folification.NIL == mt_vars.core_microtheory_p(mt)) {
                    final SubLObject mt_visible_asent = el_utilities.make_unary_formula(folification.$const85$mtVisible, mt);
                    fol_neg_lits = (SubLObject)ConsesLow.cons(asent_sentence(mt_visible_asent, mt, folification.$fol_mt_handling$.getDynamicValue(thread)), fol_neg_lits);
                }
            }
            else if (!pcase_var.eql((SubLObject)folification.$kw86$FLAT)) {
                SubLObject current_$29;
                final SubLObject datum_$28 = current_$29 = folification.$fol_mt_handling$.getDynamicValue(thread);
                SubLObject collapse = (SubLObject)folification.NIL;
                SubLObject theory_mt = (SubLObject)folification.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)folification.$list113);
                collapse = current_$29.first();
                current_$29 = current_$29.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)folification.$list113);
                theory_mt = current_$29.first();
                current_$29 = current_$29.rest();
                if (folification.NIL == current_$29) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(theory_mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (folification.NIL == mt_relevance_macros.relevant_mtP(mt)) {
                            not_in_theoryP = (SubLObject)folification.T;
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$28, (SubLObject)folification.$list113);
                }
            }
            if (folification.NIL != not_in_theoryP) {
                sentences = (SubLObject)ConsesLow.cons(fol_unhandled((SubLObject)folification.$kw114$NOT_IN_THEORY, mt), sentences);
            }
            else {
                SubLObject cdolist_list_var = neg_lits;
                SubLObject neg_lit = (SubLObject)folification.NIL;
                neg_lit = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    final SubLObject fol_sentence = asent_sentence(neg_lit, mt, folification.$fol_mt_handling$.getDynamicValue(thread));
                    fol_neg_lits = (SubLObject)ConsesLow.cons(fol_sentence, fol_neg_lits);
                    cdolist_list_var = cdolist_list_var.rest();
                    neg_lit = cdolist_list_var.first();
                }
                cdolist_list_var = pos_lits;
                SubLObject pos_lit = (SubLObject)folification.NIL;
                pos_lit = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    final SubLObject fol_sentence = asent_sentence(pos_lit, mt, folification.$fol_mt_handling$.getDynamicValue(thread));
                    fol_pos_lits = (SubLObject)ConsesLow.cons(fol_sentence, fol_pos_lits);
                    cdolist_list_var = cdolist_list_var.rest();
                    pos_lit = cdolist_list_var.first();
                }
                fol_neg_lits = Sequences.nreverse(fol_neg_lits);
                fol_pos_lits = Sequences.nreverse(fol_pos_lits);
                final SubLObject fol_cnf = clauses.make_cnf(fol_neg_lits, fol_pos_lits);
                final SubLObject fol_sentence2 = clauses.cnf_formula(fol_cnf, (SubLObject)folification.UNPROVIDED);
                sentences = (SubLObject)ConsesLow.cons(fol_sentence2, sentences);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(cnf, (SubLObject)folification.$list80);
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 41673L)
    public static SubLObject partition_fol_unhandled_sentences(final SubLObject fol_sentences) {
        if (folification.NIL == contains_fol_unhandled_expression_p(fol_sentences)) {
            return Values.values(fol_sentences, (SubLObject)folification.NIL);
        }
        SubLObject handled_fol_sentences = (SubLObject)folification.NIL;
        SubLObject unhandled_fol_sentences = (SubLObject)folification.NIL;
        SubLObject cdolist_list_var = fol_sentences;
        SubLObject fol_sentence = (SubLObject)folification.NIL;
        fol_sentence = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            if (folification.NIL != contains_fol_unhandled_expression_p(fol_sentence)) {
                unhandled_fol_sentences = (SubLObject)ConsesLow.cons(fol_sentence, unhandled_fol_sentences);
            }
            else {
                handled_fol_sentences = (SubLObject)ConsesLow.cons(fol_sentence, handled_fol_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fol_sentence = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(handled_fol_sentences), Sequences.nreverse(unhandled_fol_sentences));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 42527L)
    public static SubLObject fol_sentences_datum_update_rejection_statistics(final SubLObject datum, final SubLObject rejection_statistics) {
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(datum, datum, (SubLObject)folification.$list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)folification.$list76);
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.NIL != unhandled_fol_sentences) {
                update_fol_rejection_statistics_for_expression(unhandled_fol_sentences, rejection_statistics);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list76);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 43173L)
    public static SubLObject update_fol_rejection_statistics_for_expression(final SubLObject fol_expression, final SubLObject rejection_statistics) {
        final SubLObject reason_set = set.new_set(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rejections = cdolist_list_var = list_utilities.tree_gather(fol_expression, (SubLObject)folification.$sym115$FOL_UNHANDLED_EXPRESSION_P, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
        SubLObject rejection = (SubLObject)folification.NIL;
        rejection = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rejection;
            SubLObject fol_unhandled_fn = (SubLObject)folification.NIL;
            SubLObject reason = (SubLObject)folification.NIL;
            SubLObject culprit = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list116);
            fol_unhandled_fn = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list116);
            reason = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list116);
            culprit = current.first();
            current = current.rest();
            if (folification.NIL == current) {
                set.set_add(reason, reason_set);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list116);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rejection = cdolist_list_var.first();
        }
        final SubLObject set_contents_var = set.do_set_internal(reason_set);
        SubLObject reason;
        SubLObject basis_object;
        SubLObject state;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)folification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); folification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            reason = set_contents.do_set_contents_next(basis_object, state);
            if (folification.NIL != set_contents.do_set_contents_element_validP(state, reason)) {
                dictionary_utilities.dictionary_increment(rejection_statistics, reason, (SubLObject)folification.UNPROVIDED);
            }
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 43843L)
    public static SubLObject print_folification_summary(final SubLObject fol_sentences_analysis, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(stream, (SubLObject)folification.$str117$___a__, (SubLObject)folification.$str118$FOLification_statistics);
        PrintLow.format(stream, (SubLObject)folification.$str119$_a__, (SubLObject)folification.$str120$_______________________);
        kb_utilities.kb_statistics(stream, (SubLObject)folification.UNPROVIDED);
        final SubLObject rejection_statistics = fol_sentences_analysis_rejection_statistics(fol_sentences_analysis);
        if (folification.NIL != rejection_statistics) {
            PrintLow.format(stream, (SubLObject)folification.$str117$___a__, (SubLObject)folification.$str121$Rejection_statistics__raw__);
            print_fol_rejection_statistics(fol_sentences_analysis_rejection_statistics(fol_sentences_analysis), stream);
            streams_high.terpri(stream);
            PrintLow.format(stream, (SubLObject)folification.$str117$___a__, (SubLObject)folification.$str122$Rejection_statistics__pretty__);
            pretty_print_fol_rejection_statistics(fol_sentences_analysis_rejection_statistics(fol_sentences_analysis), stream);
        }
        PrintLow.format(stream, (SubLObject)folification.$str117$___a__, (SubLObject)folification.$str123$Conversion_statistics_);
        SubLObject print_plist = conses_high.copy_list(fol_sentences_analysis);
        print_plist = conses_high.remf(print_plist, (SubLObject)folification.$kw24$FOL_SENTENCES_DATA);
        print_plist = conses_high.remf(print_plist, (SubLObject)folification.$kw25$REJECTION_STATISTICS);
        list_utilities.pretty_print_plist(print_plist, stream);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 44897L)
    public static SubLObject print_fol_rejection_statistics(final SubLObject rejection_statistics, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return format_nil.print_one_per_line(dictionary_utilities.sort_dictionary_by_values(rejection_statistics, Symbols.symbol_function((SubLObject)folification.$sym124$_)), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 45095L)
    public static SubLObject pretty_print_fol_rejection_statistics(final SubLObject rejection_statistics, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(rejection_statistics, Symbols.symbol_function((SubLObject)folification.$sym124$_));
        SubLObject entry = (SubLObject)folification.NIL;
        entry = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = entry;
            SubLObject reason = (SubLObject)folification.NIL;
            SubLObject count = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list125);
            reason = current.first();
            current = (count = current.rest());
            final SubLObject explanation = fol_unhandled_explanation(reason);
            PrintLow.format(stream, (SubLObject)folification.$str126$_s_assertion_p_could_not_be_conve, new SubLObject[] { count, count, (folification.NIL != number_utilities.onep(count)) ? folification.$str127$it : folification.$str128$they, explanation });
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 45544L)
    public static SubLObject fol_unhandled_explanation(final SubLObject reason) {
        SubLObject explanation = conses_high.getf(folification.$folification_unhandled_explanation_table$.getGlobalValue(), reason, (SubLObject)folification.UNPROVIDED);
        if (folification.NIL == explanation) {
            explanation = Sequences.cconcatenate((SubLObject)folification.$str129$yielded_the_rejection_condition_, string_utilities.str(reason));
        }
        return explanation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 45816L)
    public static SubLObject fol_unhandled_expression_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const130$FOL_UnhandledFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 45966L)
    public static SubLObject contains_fol_unhandled_expression_p(final SubLObject v_object) {
        return list_utilities.tree_find_if((SubLObject)folification.$sym115$FOL_UNHANDLED_EXPRESSION_P, v_object, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 46089L)
    public static SubLObject fol_unhandled(final SubLObject reason, final SubLObject culprit) {
        return el_utilities.make_binary_formula(folification.$const130$FOL_UnhandledFn, reason, culprit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 46201L)
    public static SubLObject additional_gaf_fol_sentences(final SubLObject gaf, final SubLObject mt) {
        SubLObject predicate = (SubLObject)folification.NIL;
        SubLObject args = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(gaf, gaf, (SubLObject)folification.$list131);
        predicate = gaf.first();
        final SubLObject current = args = gaf.rest();
        if (folification.NIL != forts.fort_p(predicate)) {
            final SubLObject pcase_var = predicate;
            if (pcase_var.eql(folification.$const132$genlPreds)) {
                SubLObject current_$32;
                final SubLObject datum_$31 = current_$32 = args;
                SubLObject arg1 = (SubLObject)folification.NIL;
                SubLObject arg2 = (SubLObject)folification.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$32, datum_$31, (SubLObject)folification.$list133);
                arg1 = current_$32.first();
                current_$32 = current_$32.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$32, datum_$31, (SubLObject)folification.$list133);
                arg2 = current_$32.first();
                current_$32 = current_$32.rest();
                if (folification.NIL == current_$32) {
                    final SubLObject v_arity = arity.arity(arg1);
                    if (v_arity.isInteger()) {
                        final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                        final SubLObject expansion_cnf = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(arg1, ConsesLow.append(v_variables, (SubLObject)folification.NIL))), (SubLObject)ConsesLow.list(reader.bq_cons(arg2, ConsesLow.append(v_variables, (SubLObject)folification.NIL))));
                        return cnf_fol_sentences(expansion_cnf, mt);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$31, (SubLObject)folification.$list133);
                }
            }
            else if (pcase_var.eql(folification.$const134$negationPreds)) {
                SubLObject current_$33;
                final SubLObject datum_$32 = current_$33 = args;
                SubLObject arg1 = (SubLObject)folification.NIL;
                SubLObject arg2 = (SubLObject)folification.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$33, datum_$32, (SubLObject)folification.$list133);
                arg1 = current_$33.first();
                current_$33 = current_$33.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$33, datum_$32, (SubLObject)folification.$list133);
                arg2 = current_$33.first();
                current_$33 = current_$33.rest();
                if (folification.NIL == current_$33) {
                    final SubLObject v_arity = arity.arity(arg1);
                    if (v_arity.isInteger()) {
                        final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                        final SubLObject expansion_cnf = reader.bq_cons((SubLObject)ConsesLow.list(reader.bq_cons(arg1, ConsesLow.append(v_variables, (SubLObject)folification.NIL)), reader.bq_cons(arg2, ConsesLow.append(v_variables, (SubLObject)folification.NIL))), (SubLObject)folification.$list135);
                        return cnf_fol_sentences(expansion_cnf, mt);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$32, (SubLObject)folification.$list133);
                }
            }
            else {
                if (pcase_var.eql(folification.$const136$arg1Isa) || pcase_var.eql(folification.$const137$arg2Isa) || pcase_var.eql(folification.$const138$arg3Isa) || pcase_var.eql(folification.$const139$arg4Isa) || pcase_var.eql(folification.$const140$arg5Isa) || pcase_var.eql(folification.$const141$arg6Isa)) {
                    return additional_arg_isa_or_arg_genl_sentences(gaf, mt, folification.$const142$isa);
                }
                if (pcase_var.eql(folification.$const143$arg1Genl) || pcase_var.eql(folification.$const144$arg2Genl) || pcase_var.eql(folification.$const145$arg3Genl) || pcase_var.eql(folification.$const146$arg4Genl) || pcase_var.eql(folification.$const147$arg5Genl) || pcase_var.eql(folification.$const148$arg6Genl)) {
                    return additional_arg_isa_or_arg_genl_sentences(gaf, mt, folification.$const149$genls);
                }
                if (pcase_var.eql(folification.$const150$resultIsa)) {
                    return additional_result_isa_or_result_genl_sentences(gaf, mt, folification.$const142$isa);
                }
                if (pcase_var.eql(folification.$const151$resultGenl)) {
                    return additional_result_isa_or_result_genl_sentences(gaf, mt, folification.$const151$resultGenl);
                }
                if (pcase_var.eql(folification.$const149$genls) || pcase_var.eql(folification.$const152$disjointWith) || pcase_var.eql(folification.$const153$genlInverse)) {
                    SubLObject sentences = (SubLObject)folification.NIL;
                    final SubLObject expansion = verbosifier.el_expansion_one_step(gaf, mt);
                    if (!expansion.equal(gaf)) {
                        final SubLObject cnfs = clausifier.cnf_clausal_form(expansion, mt);
                        if (!folification.$const154$True.eql(cnfs)) {
                            if (cnfs.isCons()) {
                                SubLObject cdolist_list_var = cnfs;
                                SubLObject cnf = (SubLObject)folification.NIL;
                                cnf = cdolist_list_var.first();
                                while (folification.NIL != cdolist_list_var) {
                                    sentences = ConsesLow.nconc(cnf_fol_sentences(cnf, mt), sentences);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    cnf = cdolist_list_var.first();
                                }
                            }
                            else {
                                sentences = (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw102$EXPANSION, expansion));
                            }
                        }
                    }
                    return sentences;
                }
            }
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 48112L)
    public static SubLObject additional_arg_isa_or_arg_genl_sentences(final SubLObject gaf, final SubLObject mt, final SubLObject arg_pred) {
        SubLObject predicate = (SubLObject)folification.NIL;
        SubLObject args = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(gaf, gaf, (SubLObject)folification.$list131);
        predicate = gaf.first();
        final SubLObject current = args = gaf.rest();
        SubLObject current_$36;
        final SubLObject datum_$35 = current_$36 = args;
        SubLObject pred = (SubLObject)folification.NIL;
        SubLObject col = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$36, datum_$35, (SubLObject)folification.$list155);
        pred = current_$36.first();
        current_$36 = current_$36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$36, datum_$35, (SubLObject)folification.$list155);
        col = current_$36.first();
        current_$36 = current_$36.rest();
        if (folification.NIL == current_$36) {
            if (folification.NIL != fort_types_interface.functor_p(pred)) {
                return (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw156$FUNCTION_ARG_CONSTRAINT, gaf));
            }
            if (folification.NIL != fort_types_interface.predicate_p(pred)) {
                final SubLObject v_arity = arity.arity(pred);
                if (v_arity.isInteger()) {
                    final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                    final SubLObject index = folification.$const142$isa.eql(arg_pred) ? kb_accessors.isa_pred_arg(predicate) : kb_accessors.genl_pred_arg(predicate);
                    final SubLObject var = ConsesLow.nth(number_utilities.f_1_(index), v_variables);
                    if (index.numG(v_arity)) {
                        return (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, gaf));
                    }
                    final SubLObject expansion_cnf = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(pred, ConsesLow.append(v_variables, (SubLObject)folification.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(arg_pred, var, col)));
                    return cnf_fol_sentences(expansion_cnf, mt);
                }
            }
            else {
                if (folification.NIL != nonstandard_sentential_relation_p(pred)) {
                    return (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw158$NONSTANDARD_SENTENTIAL_RELATION, pred));
                }
                return (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw159$UNEXPECTED, pred));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum_$35, (SubLObject)folification.$list155);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49127L)
    public static SubLObject additional_result_isa_or_result_genl_sentences(final SubLObject gaf, final SubLObject mt, final SubLObject result_pred) {
        SubLObject predicate = (SubLObject)folification.NIL;
        SubLObject args = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(gaf, gaf, (SubLObject)folification.$list131);
        predicate = gaf.first();
        final SubLObject current = args = gaf.rest();
        SubLObject current_$38;
        final SubLObject datum_$37 = current_$38 = args;
        SubLObject func = (SubLObject)folification.NIL;
        SubLObject col = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$38, datum_$37, (SubLObject)folification.$list160);
        func = current_$38.first();
        current_$38 = current_$38.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$38, datum_$37, (SubLObject)folification.$list160);
        col = current_$38.first();
        current_$38 = current_$38.rest();
        if (folification.NIL == current_$38) {
            final SubLObject v_arity = arity.arity(func);
            if (v_arity.isInteger()) {
                final SubLObject v_variables = fol_sequence_variable_args_for_arity(v_arity);
                final SubLObject expansion_cnf = (SubLObject)ConsesLow.list((SubLObject)folification.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(result_pred, reader.bq_cons(func, ConsesLow.append(v_variables, (SubLObject)folification.NIL)), col)));
                return cnf_fol_sentences(expansion_cnf, mt);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum_$37, (SubLObject)folification.$list160);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49598L)
    public static SubLObject nonstandard_sentential_relation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.cyc_const_bounded_existential_operator_p(v_object) || folification.NIL != el_utilities.user_defined_sentential_relation_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49772L)
    public static SubLObject clear_fol_sequence_variable_args_for_arity() {
        final SubLObject cs = folification.$fol_sequence_variable_args_for_arity_caching_state$.getGlobalValue();
        if (folification.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49772L)
    public static SubLObject remove_fol_sequence_variable_args_for_arity(final SubLObject v_arity) {
        return memoization_state.caching_state_remove_function_results_with_args(folification.$fol_sequence_variable_args_for_arity_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_arity), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49772L)
    public static SubLObject fol_sequence_variable_args_for_arity_internal(final SubLObject v_arity) {
        SubLObject args = (SubLObject)folification.NIL;
        SubLObject i;
        SubLObject arg;
        for (i = (SubLObject)folification.NIL, i = (SubLObject)folification.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)folification.ONE_INTEGER)) {
            arg = cycl_variables.make_el_var(Sequences.cconcatenate((SubLObject)folification.$str162$ARG, format_nil.format_nil_a_no_copy(number_utilities.f_1X(i))));
            args = (SubLObject)ConsesLow.cons(arg, args);
        }
        return Sequences.nreverse(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 49772L)
    public static SubLObject fol_sequence_variable_args_for_arity(final SubLObject v_arity) {
        SubLObject caching_state = folification.$fol_sequence_variable_args_for_arity_caching_state$.getGlobalValue();
        if (folification.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)folification.$sym161$FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY, (SubLObject)folification.$sym163$_FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY_CACHING_STATE_, (SubLObject)folification.NIL, (SubLObject)folification.EQL, (SubLObject)folification.ONE_INTEGER, (SubLObject)folification.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_arity, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(fol_sequence_variable_args_for_arity_internal(v_arity)));
            memoization_state.caching_state_put(caching_state, v_arity, results, (SubLObject)folification.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 50019L)
    public static SubLObject kb_fol_additional_sentences_for_term(final SubLObject fort, final SubLObject mt_ceiling, final SubLObject allow_equiv_relationP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = (SubLObject)folification.NIL;
        if (folification.NIL == list_utilities.member_eqP(fort, folification.$unfolifiable_terms$.getGlobalValue())) {
            if (folification.NIL != fort_types_interface.collection_p(fort) && folification.NIL != kb_fol_under_mt_ceilingP(folification.$const60$UniversalVocabularyMt, mt_ceiling) && folification.$fol_isa_handling$.getDynamicValue(thread) == folification.$kw6$UNARY_PREDICATE) {
                if (folification.NIL != allow_equiv_relationP) {
                    sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(folification.$const164$equiv, (SubLObject)ConsesLow.list((SubLObject)folification.$list165, (SubLObject)folification.$sym166$_X, fol_transform_arg(fort)), reader.bq_cons((SubLObject)ConsesLow.listS(folification.$const167$FOL_PredicateFn, fort, (SubLObject)folification.$list168), (SubLObject)folification.$list169)), sentences);
                }
                else {
                    sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(folification.$const170$implies, (SubLObject)ConsesLow.list((SubLObject)folification.$list165, (SubLObject)folification.$sym166$_X, fol_transform_arg(fort)), reader.bq_cons((SubLObject)ConsesLow.listS(folification.$const167$FOL_PredicateFn, fort, (SubLObject)folification.$list168), (SubLObject)folification.$list169)), sentences);
                    sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(folification.$const170$implies, reader.bq_cons((SubLObject)ConsesLow.listS(folification.$const167$FOL_PredicateFn, fort, (SubLObject)folification.$list168), (SubLObject)folification.$list169), (SubLObject)ConsesLow.list((SubLObject)folification.$list165, (SubLObject)folification.$sym166$_X, fol_transform_arg(fort))), sentences);
                }
            }
            if (fort.eql(folification.$const82$genlMt) && folification.$kw86$FLAT != folification.$fol_mt_handling$.getDynamicValue(thread)) {
                sentences = (SubLObject)ConsesLow.cons((SubLObject)folification.$list171, sentences);
            }
            if (folification.NIL != list_utilities.member_eqP(folification.$fol_mt_handling$.getDynamicValue(thread), (SubLObject)folification.$list172) && folification.NIL != mt_vars.core_microtheory_p(fort)) {
                sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)folification.$list173, fol_transform_arg(fort)), sentences);
            }
            if (folification.NIL != fort_types_interface.predicate_p(fort)) {
                final SubLObject items_var = kb_fol_predicate_arg_type_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)folification.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        sentences = (SubLObject)ConsesLow.cons(item, sentences);
                    }
                }
                else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = (SubLObject)folification.NIL;
                    item2 = cdolist_list_var.first();
                    while (folification.NIL != cdolist_list_var) {
                        sentences = (SubLObject)ConsesLow.cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
                if (folification.NIL != arity.binaryP(fort) && folification.NIL != kb_fol_under_mt_ceilingP(mt_vars.$anect_mt$.getGlobalValue(), mt_ceiling)) {
                    SubLObject cdolist_list_var2 = kb_fol_transitive_binary_predicate_sentences(fort);
                    SubLObject sentence = (SubLObject)folification.NIL;
                    sentence = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = kb_fol_symmetric_binary_predicate_sentences(fort);
                    sentence = (SubLObject)folification.NIL;
                    sentence = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = kb_fol_asymmetric_binary_predicate_sentences(fort);
                    sentence = (SubLObject)folification.NIL;
                    sentence = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = kb_fol_reflexive_binary_predicate_sentences(fort);
                    sentence = (SubLObject)folification.NIL;
                    sentence = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = kb_fol_irreflexive_binary_predicate_sentences(fort);
                    sentence = (SubLObject)folification.NIL;
                    sentence = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = kb_fol_tva_sentences(fort);
                    sentence = (SubLObject)folification.NIL;
                    sentence = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sentence = cdolist_list_var2.first();
                    }
                }
            }
            if (folification.NIL != fort_types_interface.fixed_arity_functor_p(fort) && arity.arity(fort).isInteger()) {
                SubLObject items_var = kb_fol_nat_function_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)folification.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        sentences = (SubLObject)ConsesLow.cons(item, sentences);
                    }
                }
                else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = (SubLObject)folification.NIL;
                    item2 = cdolist_list_var.first();
                    while (folification.NIL != cdolist_list_var) {
                        sentences = (SubLObject)ConsesLow.cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
                items_var = kb_fol_nat_argument_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)folification.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        sentences = (SubLObject)ConsesLow.cons(item, sentences);
                    }
                }
                else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = (SubLObject)folification.NIL;
                    item2 = cdolist_list_var.first();
                    while (folification.NIL != cdolist_list_var) {
                        sentences = (SubLObject)ConsesLow.cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
                items_var = kb_fol_result_isa_sentences(fort);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)folification.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        sentences = (SubLObject)ConsesLow.cons(item, sentences);
                    }
                }
                else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = (SubLObject)folification.NIL;
                    item2 = cdolist_list_var.first();
                    while (folification.NIL != cdolist_list_var) {
                        sentences = (SubLObject)ConsesLow.cons(item2, sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
            }
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 52715L)
    public static SubLObject do_arg_isa_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf_var = (SubLObject)folification.NIL;
        SubLObject argnum_var = (SubLObject)folification.NIL;
        SubLObject pred = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list174);
        gaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list174);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list174);
        pred = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject argnum_1 = (SubLObject)folification.$sym175$ARGNUM_1;
            final SubLObject arg_isa_pred = (SubLObject)folification.$sym176$ARG_ISA_PRED;
            final SubLObject v_arity = (SubLObject)folification.$sym177$ARITY;
            return (SubLObject)ConsesLow.list((SubLObject)folification.$sym178$PWHEN, (SubLObject)ConsesLow.list((SubLObject)folification.$sym179$FIXED_ARITY_PREDICATE_P, pred), (SubLObject)ConsesLow.list((SubLObject)folification.$sym180$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_arity, (SubLObject)ConsesLow.list((SubLObject)folification.$sym181$ARITY, pred))), (SubLObject)ConsesLow.list((SubLObject)folification.$sym178$PWHEN, v_arity, (SubLObject)ConsesLow.list((SubLObject)folification.$sym182$CDOTIMES, (SubLObject)ConsesLow.list(argnum_1, v_arity), (SubLObject)ConsesLow.list((SubLObject)folification.$sym180$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(argnum_var, (SubLObject)ConsesLow.list((SubLObject)folification.$sym183$1_, argnum_1)), (SubLObject)ConsesLow.list(arg_isa_pred, (SubLObject)ConsesLow.list((SubLObject)folification.$sym184$ARG_ISA_PRED, argnum_var))), (SubLObject)ConsesLow.listS((SubLObject)folification.$sym185$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.listS(gaf_var, pred, (SubLObject)folification.$kw186$PREDICATE, arg_isa_pred, (SubLObject)folification.$list187), ConsesLow.append(body, (SubLObject)folification.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list174);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 53265L)
    public static SubLObject kb_fol_predicate_arg_type_sentences(final SubLObject pred) {
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        if (folification.NIL != fort_types_interface.fixed_arity_predicate_p(pred)) {
            final SubLObject v_arity = arity.arity(pred);
            if (folification.NIL != v_arity) {
                SubLObject argnum_1;
                SubLObject argnum;
                SubLObject pred_var;
                SubLObject arg_isa_pred;
                SubLObject iterator_var;
                SubLObject done_var;
                SubLObject token_var;
                SubLObject final_index_spec;
                SubLObject valid;
                SubLObject final_index_iterator;
                SubLObject done_var_$39;
                SubLObject token_var_$40;
                SubLObject gaf;
                SubLObject valid_$41;
                SubLObject constraint_col;
                SubLObject mt;
                SubLObject constraint_asent;
                SubLObject arg_type_cnf;
                SubLObject items_var;
                SubLObject vector_var;
                SubLObject backwardP_var;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                SubLObject cdolist_list_var;
                SubLObject item2;
                SubLObject _prev_bind_0;
                SubLObject _values;
                for (argnum_1 = (SubLObject)folification.NIL, argnum_1 = (SubLObject)folification.ZERO_INTEGER; argnum_1.numL(v_arity); argnum_1 = Numbers.add(argnum_1, (SubLObject)folification.ONE_INTEGER)) {
                    argnum = number_utilities.f_1X(argnum_1);
                    arg_isa_pred = (pred_var = kb_accessors.arg_isa_pred(argnum, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED));
                    if (folification.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)folification.ONE_INTEGER, pred_var)) {
                        iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)folification.ONE_INTEGER, pred_var);
                        done_var = (SubLObject)folification.NIL;
                        token_var = (SubLObject)folification.NIL;
                        while (folification.NIL == done_var) {
                            final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (folification.NIL != valid) {
                                final_index_iterator = (SubLObject)folification.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)folification.$kw8$GAF, (SubLObject)folification.$kw188$TRUE, (SubLObject)folification.NIL);
                                    done_var_$39 = (SubLObject)folification.NIL;
                                    token_var_$40 = (SubLObject)folification.NIL;
                                    while (folification.NIL == done_var_$39) {
                                        gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        valid_$41 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$40.eql(gaf));
                                        if (folification.NIL != valid_$41) {
                                            constraint_col = assertions_high.gaf_arg2(gaf);
                                            mt = assertions_high.assertion_mt(gaf);
                                            constraint_asent = el_utilities.replace_formula_arg(argnum, (SubLObject)folification.$sym189$_INS, argnum_variable_formula(pred));
                                            arg_type_cnf = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constraint_asent), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(folification.$const142$isa, (SubLObject)folification.$sym189$_INS, constraint_col)));
                                            items_var = cnf_fol_sentences(arg_type_cnf, mt);
                                            if (items_var.isVector()) {
                                                vector_var = items_var;
                                                backwardP_var = (SubLObject)folification.NIL;
                                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                                                    element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                                                    item = Vectors.aref(vector_var, element_num);
                                                    fol_sentences = (SubLObject)ConsesLow.cons(item, fol_sentences);
                                                }
                                            }
                                            else {
                                                cdolist_list_var = items_var;
                                                item2 = (SubLObject)folification.NIL;
                                                item2 = cdolist_list_var.first();
                                                while (folification.NIL != cdolist_list_var) {
                                                    fol_sentences = (SubLObject)ConsesLow.cons(item2, fol_sentences);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    item2 = cdolist_list_var.first();
                                                }
                                            }
                                        }
                                        done_var_$39 = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid_$41);
                                    }
                                }
                                finally {
                                    _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)folification.T);
                                        _values = Values.getValuesAsVector();
                                        if (folification.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid);
                        }
                    }
                }
            }
        }
        return fol_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 53748L)
    public static SubLObject kb_fol_transitive_binary_predicate_sentences(final SubLObject predicate) {
        if (folification.NIL != kb_accessors.transitive_predicateP(predicate)) {
            final SubLObject expansion_cnf = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list190), reader.bq_cons(predicate, (SubLObject)folification.$list191)), (SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list192)));
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 54108L)
    public static SubLObject kb_fol_symmetric_binary_predicate_sentences(final SubLObject predicate) {
        if (folification.NIL != kb_accessors.symmetric_predicateP(predicate)) {
            final SubLObject expansion_cnf = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list190)), (SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list193)));
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 54400L)
    public static SubLObject kb_fol_asymmetric_binary_predicate_sentences(final SubLObject predicate) {
        if (folification.NIL != kb_accessors.asymmetric_predicateP(predicate)) {
            final SubLObject expansion_cnf = reader.bq_cons((SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list190), reader.bq_cons(predicate, (SubLObject)folification.$list193)), (SubLObject)folification.$list135);
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 54704L)
    public static SubLObject kb_fol_reflexive_binary_predicate_sentences(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        if (folification.NIL != kb_accessors.reflexive_predicateP(predicate)) {
            final SubLObject arg_constraint_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
            if (folification.NIL != fort_types_interface.fixed_arity_predicate_p(predicate)) {
                final SubLObject v_arity = arity.arity(predicate);
                if (folification.NIL != v_arity) {
                    SubLObject argnum_1;
                    SubLObject argnum;
                    SubLObject pred_var;
                    SubLObject arg_isa_pred;
                    SubLObject iterator_var;
                    SubLObject done_var;
                    SubLObject token_var;
                    SubLObject final_index_spec;
                    SubLObject valid;
                    SubLObject final_index_iterator;
                    SubLObject done_var_$42;
                    SubLObject token_var_$43;
                    SubLObject gaf;
                    SubLObject valid_$44;
                    SubLObject mt;
                    SubLObject constraint_col;
                    SubLObject _prev_bind_0;
                    SubLObject _values;
                    for (argnum_1 = (SubLObject)folification.NIL, argnum_1 = (SubLObject)folification.ZERO_INTEGER; argnum_1.numL(v_arity); argnum_1 = Numbers.add(argnum_1, (SubLObject)folification.ONE_INTEGER)) {
                        argnum = number_utilities.f_1X(argnum_1);
                        arg_isa_pred = (pred_var = kb_accessors.arg_isa_pred(argnum, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED));
                        if (folification.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)folification.ONE_INTEGER, pred_var)) {
                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)folification.ONE_INTEGER, pred_var);
                            done_var = (SubLObject)folification.NIL;
                            token_var = (SubLObject)folification.NIL;
                            while (folification.NIL == done_var) {
                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (folification.NIL != valid) {
                                    final_index_iterator = (SubLObject)folification.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)folification.$kw8$GAF, (SubLObject)folification.$kw188$TRUE, (SubLObject)folification.NIL);
                                        done_var_$42 = (SubLObject)folification.NIL;
                                        token_var_$43 = (SubLObject)folification.NIL;
                                        while (folification.NIL == done_var_$42) {
                                            gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                            valid_$44 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$43.eql(gaf));
                                            if (folification.NIL != valid_$44) {
                                                mt = assertions_high.assertion_mt(gaf);
                                                if (folification.NIL != forts.fort_p(mt)) {
                                                    constraint_col = assertions_high.gaf_arg2(gaf);
                                                    dictionary_utilities.dictionary_push(arg_constraint_dict, mt, constraint_col);
                                                }
                                            }
                                            done_var_$42 = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid_$44);
                                        }
                                    }
                                    finally {
                                        _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                                            _values = Values.getValuesAsVector();
                                            if (folification.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid);
                            }
                        }
                    }
                }
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(arg_constraint_dict)); folification.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject constraint_cols = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject isa_neg_lits = (SubLObject)folification.NIL;
                SubLObject cdolist_list_var = genls.min_cols(constraint_cols, mt2, (SubLObject)folification.UNPROVIDED);
                SubLObject constraint_col2 = (SubLObject)folification.NIL;
                constraint_col2 = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    isa_neg_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(folification.$const142$isa, (SubLObject)folification.$sym166$_X, constraint_col2), isa_neg_lits);
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint_col2 = cdolist_list_var.first();
                }
                final SubLObject mt_specific_cnf = (SubLObject)ConsesLow.list(isa_neg_lits, (SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list194)));
                final SubLObject items_var = cnf_fol_sentences(mt_specific_cnf, mt2);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)folification.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        fol_sentences = (SubLObject)ConsesLow.cons(item, fol_sentences);
                    }
                }
                else {
                    SubLObject cdolist_list_var2 = items_var;
                    SubLObject item2 = (SubLObject)folification.NIL;
                    item2 = cdolist_list_var2.first();
                    while (folification.NIL != cdolist_list_var2) {
                        fol_sentences = (SubLObject)ConsesLow.cons(item2, fol_sentences);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        item2 = cdolist_list_var2.first();
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return fol_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 55599L)
    public static SubLObject kb_fol_irreflexive_binary_predicate_sentences(final SubLObject predicate) {
        if (folification.NIL != kb_accessors.irreflexive_predicateP(predicate)) {
            final SubLObject expansion_cnf = reader.bq_cons((SubLObject)ConsesLow.list(reader.bq_cons(predicate, (SubLObject)folification.$list194)), (SubLObject)folification.$list135);
            return cnf_fol_sentences(expansion_cnf, mt_vars.$anect_mt$.getGlobalValue());
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 55879L)
    public static SubLObject kb_fol_tva_sentences(final SubLObject predicate) {
        SubLObject sentences = (SubLObject)folification.NIL;
        if (folification.NIL != tva_utilities.some_tva_for_predicate(predicate)) {
            SubLObject pred_var = folification.$const195$transitiveViaArg;
            if (folification.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)folification.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)folification.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)folification.NIL;
                final SubLObject token_var = (SubLObject)folification.NIL;
                while (folification.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (folification.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)folification.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)folification.$kw8$GAF, (SubLObject)folification.$kw188$TRUE, (SubLObject)folification.NIL);
                            SubLObject done_var_$45 = (SubLObject)folification.NIL;
                            final SubLObject token_var_$46 = (SubLObject)folification.NIL;
                            while (folification.NIL == done_var_$45) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(gaf));
                                if (folification.NIL != valid_$47) {
                                    final SubLObject items_var = kb_fol_tva_sentences_int(gaf);
                                    if (items_var.isVector()) {
                                        final SubLObject vector_var = items_var;
                                        final SubLObject backwardP_var = (SubLObject)folification.NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject element_num;
                                        SubLObject item;
                                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                                            element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                                            item = Vectors.aref(vector_var, element_num);
                                            sentences = (SubLObject)ConsesLow.cons(item, sentences);
                                        }
                                    }
                                    else {
                                        SubLObject cdolist_list_var = items_var;
                                        SubLObject item2 = (SubLObject)folification.NIL;
                                        item2 = cdolist_list_var.first();
                                        while (folification.NIL != cdolist_list_var) {
                                            sentences = (SubLObject)ConsesLow.cons(item2, sentences);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            item2 = cdolist_list_var.first();
                                        }
                                    }
                                }
                                done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid_$47);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)folification.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (folification.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid);
                }
            }
            pred_var = folification.$const196$transitiveViaArgInverse;
            if (folification.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)folification.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)folification.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)folification.NIL;
                final SubLObject token_var = (SubLObject)folification.NIL;
                while (folification.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (folification.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)folification.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)folification.$kw8$GAF, (SubLObject)folification.$kw188$TRUE, (SubLObject)folification.NIL);
                            SubLObject done_var_$46 = (SubLObject)folification.NIL;
                            final SubLObject token_var_$47 = (SubLObject)folification.NIL;
                            while (folification.NIL == done_var_$46) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                final SubLObject valid_$48 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$47.eql(gaf));
                                if (folification.NIL != valid_$48) {
                                    final SubLObject items_var = kb_fol_tva_sentences_int(gaf);
                                    if (items_var.isVector()) {
                                        final SubLObject vector_var = items_var;
                                        final SubLObject backwardP_var = (SubLObject)folification.NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject element_num;
                                        SubLObject item;
                                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                                            element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                                            item = Vectors.aref(vector_var, element_num);
                                            sentences = (SubLObject)ConsesLow.cons(item, sentences);
                                        }
                                    }
                                    else {
                                        SubLObject cdolist_list_var = items_var;
                                        SubLObject item2 = (SubLObject)folification.NIL;
                                        item2 = cdolist_list_var.first();
                                        while (folification.NIL != cdolist_list_var) {
                                            sentences = (SubLObject)ConsesLow.cons(item2, sentences);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            item2 = cdolist_list_var.first();
                                        }
                                    }
                                }
                                done_var_$46 = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid_$48);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)folification.T);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (folification.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid);
                }
            }
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 56397L)
    public static SubLObject kb_fol_tva_sentences_int(final SubLObject tva_gaf) {
        final SubLObject tva_pred = assertions_high.gaf_predicate(tva_gaf);
        final SubLObject pred = assertions_high.gaf_arg1(tva_gaf);
        final SubLObject trans_pred = assertions_high.gaf_arg2(tva_gaf);
        final SubLObject argnum = assertions_high.gaf_arg3(tva_gaf);
        final SubLObject pred_neg_lit = kb_fol_tva_pred_neg_lit(pred, argnum);
        final SubLObject trans_pred_neg_lit = tva_pred.eql(folification.$const195$transitiveViaArg) ? reader.bq_cons(trans_pred, (SubLObject)folification.$list197) : reader.bq_cons(trans_pred, (SubLObject)folification.$list198);
        final SubLObject pred_pos_lit = kb_fol_tva_pred_pos_lit(pred, argnum);
        final SubLObject expansion_cnf = clauses.make_cnf((SubLObject)ConsesLow.list(pred_neg_lit, trans_pred_neg_lit), (SubLObject)ConsesLow.list(pred_pos_lit));
        return cnf_fol_sentences(expansion_cnf, assertions_high.assertion_mt(tva_gaf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 56977L)
    public static SubLObject kb_fol_tva_pred_neg_lit(final SubLObject pred, final SubLObject argnum) {
        return replace_argnum_variable_formula(pred, argnum, (SubLObject)folification.$sym199$_OLD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 57093L)
    public static SubLObject kb_fol_tva_pred_pos_lit(final SubLObject pred, final SubLObject argnum) {
        return replace_argnum_variable_formula(pred, argnum, (SubLObject)folification.$sym200$_NEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 57209L)
    public static SubLObject replace_argnum_variable_formula(final SubLObject pred, final SubLObject argnum, final SubLObject new_arg) {
        return el_utilities.replace_formula_arg(argnum, new_arg, argnum_variable_formula(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 57443L)
    public static SubLObject argnum_variable_formula(final SubLObject reln) {
        SubLObject formula = el_utilities.make_el_formula(reln, (SubLObject)folification.NIL, (SubLObject)folification.UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        SubLObject el_var;
        for (cdotimes_end_var = arity.arity(reln), i = (SubLObject)folification.NIL, i = (SubLObject)folification.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)folification.ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            el_var = cycl_variables.make_el_var(Sequences.cconcatenate((SubLObject)folification.$str162$ARG, string_utilities.str(argnum)));
            formula = (SubLObject)ConsesLow.cons(el_var, formula);
        }
        return Sequences.nreverse(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 57884L)
    public static SubLObject kb_fol_nat_function_sentences(final SubLObject func) {
        if (folification.NIL != arity.arity(func)) {
            final SubLObject expansion_lit = (SubLObject)ConsesLow.list(folification.$const201$natFunction, argnum_variable_formula(func), func);
            return cnf_fol_sentences(clause_utilities.make_gaf_cnf(expansion_lit), folification.$const60$UniversalVocabularyMt);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 58294L)
    public static SubLObject kb_fol_nat_argument_sentences(final SubLObject func) {
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        final SubLObject nat = argnum_variable_formula(func);
        final SubLObject v_arity = arity.arity(func);
        if (folification.NIL != v_arity) {
            SubLObject i_1;
            SubLObject i;
            SubLObject arg_var;
            SubLObject expansion_lit;
            SubLObject items_var;
            SubLObject vector_var;
            SubLObject backwardP_var;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            SubLObject cdolist_list_var;
            SubLObject item2;
            for (i_1 = (SubLObject)folification.NIL, i_1 = (SubLObject)folification.ZERO_INTEGER; i_1.numL(v_arity); i_1 = Numbers.add(i_1, (SubLObject)folification.ONE_INTEGER)) {
                i = number_utilities.f_1X(i_1);
                arg_var = cycl_utilities.nat_arg(nat, i, (SubLObject)folification.UNPROVIDED);
                expansion_lit = (SubLObject)ConsesLow.list(folification.$const202$natArgument, nat, i, arg_var);
                items_var = cnf_fol_sentences(clause_utilities.make_gaf_cnf(expansion_lit), folification.$const60$UniversalVocabularyMt);
                if (items_var.isVector()) {
                    vector_var = items_var;
                    backwardP_var = (SubLObject)folification.NIL;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        fol_sentences = (SubLObject)ConsesLow.cons(item, fol_sentences);
                    }
                }
                else {
                    cdolist_list_var = items_var;
                    item2 = (SubLObject)folification.NIL;
                    item2 = cdolist_list_var.first();
                    while (folification.NIL != cdolist_list_var) {
                        fol_sentences = (SubLObject)ConsesLow.cons(item2, fol_sentences);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
            }
        }
        return Sequences.nreverse(fol_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 58907L)
    public static SubLObject kb_fol_result_isa_sentences(final SubLObject func) {
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        final SubLObject nat = argnum_variable_formula(func);
        final SubLObject pred_var = folification.$const150$resultIsa;
        if (folification.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(func, (SubLObject)folification.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(func, (SubLObject)folification.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)folification.NIL;
            final SubLObject token_var = (SubLObject)folification.NIL;
            while (folification.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (folification.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)folification.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)folification.$kw8$GAF, (SubLObject)folification.$kw188$TRUE, (SubLObject)folification.NIL);
                        SubLObject done_var_$51 = (SubLObject)folification.NIL;
                        final SubLObject token_var_$52 = (SubLObject)folification.NIL;
                        while (folification.NIL == done_var_$51) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                            final SubLObject valid_$53 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$52.eql(gaf));
                            if (folification.NIL != valid_$53) {
                                final SubLObject col = assertions_high.gaf_arg2(gaf);
                                final SubLObject mt = assertions_high.assertion_mt(gaf);
                                final SubLObject cnf = (SubLObject)ConsesLow.list((SubLObject)folification.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(folification.$const142$isa, nat, col)));
                                final SubLObject items_var = cnf_fol_sentences(cnf, mt);
                                if (items_var.isVector()) {
                                    final SubLObject vector_var = items_var;
                                    final SubLObject backwardP_var = (SubLObject)folification.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject element_num;
                                    SubLObject item;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                                        element_num = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                                        item = Vectors.aref(vector_var, element_num);
                                        fol_sentences = (SubLObject)ConsesLow.cons(item, fol_sentences);
                                    }
                                }
                                else {
                                    SubLObject cdolist_list_var = items_var;
                                    SubLObject item2 = (SubLObject)folification.NIL;
                                    item2 = cdolist_list_var.first();
                                    while (folification.NIL != cdolist_list_var) {
                                        fol_sentences = (SubLObject)ConsesLow.cons(item2, fol_sentences);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        item2 = cdolist_list_var.first();
                                    }
                                }
                            }
                            done_var_$51 = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid_$53);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)folification.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (folification.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL == valid);
            }
        }
        return Sequences.nreverse(fol_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 59324L)
    public static SubLObject asent_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.$fol_translation_type$.getDynamicValue(thread) == folification.$kw203$SET_THEORY) {
            return asent_set_sentence(asent, mt, mt_handling);
        }
        return asent_fol_sentence(asent, mt, mt_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 59715L)
    public static SubLObject asent_fol_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        SubLObject fol_sentence = (SubLObject)folification.NIL;
        if (folification.NIL != el_utilities.sequence_term(asent)) {
            fol_sentence = ConsesLow.append(fol_sentence, (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw204$SEQUENCE_VAR, el_utilities.sequence_term(asent))));
        }
        else {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (pcase_var.eql(folification.$const142$isa)) {
                fol_sentence = isa_asent_fol_sentence(asent, mt, mt_handling);
            }
            else if (pcase_var.eql(folification.$const205$different)) {
                fol_sentence = different_asent_fol_sentence(asent);
            }
            else if (pcase_var.eql(folification.$const82$genlMt)) {
                fol_sentence = genlmt_asent_fol_sentence(asent);
            }
            else {
                fol_sentence = generic_asent_fol_sentence(asent, mt, mt_handling);
            }
        }
        return fol_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 60461L)
    public static SubLObject genlmt_asent_fol_sentence(final SubLObject asent) {
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
        final SubLObject fol_predicate = fol_transform_predicate(operator, (SubLObject)folification.$kw84$MT_VISIBLE);
        final SubLObject fol_args = fol_transform_args(args);
        return el_utilities.make_formula(fol_predicate, fol_args, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 60908L)
    public static SubLObject different_asent_fol_sentence(final SubLObject asent) {
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
        final SubLObject fol_args = Mapping.mapcar((SubLObject)folification.$sym206$FOL_TRANSFORM_ARG, args);
        final SubLObject fol_equals = make_fol_predicate(folification.$const207$equals, (SubLObject)folification.TWO_INTEGER);
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        SubLObject cdolist_list_var = list_utilities.pick_two(fol_args);
        SubLObject pair = (SubLObject)folification.NIL;
        pair = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject new_arg1 = (SubLObject)folification.NIL;
            SubLObject new_arg2 = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list208);
            new_arg1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list208);
            new_arg2 = current.first();
            current = current.rest();
            if (folification.NIL == current) {
                final SubLObject fol_sentence = cycl_utilities.negate(el_utilities.make_binary_formula(fol_equals, new_arg1, new_arg2));
                fol_sentences = (SubLObject)ConsesLow.cons(fol_sentence, fol_sentences);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list208);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return simplifier.conjoin(Sequences.nreverse(fol_sentences), (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 61593L)
    public static SubLObject generic_asent_fol_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        if (mt_handling.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
            final SubLObject operator = cycl_utilities.formula_operator(asent);
            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
            final SubLObject fol_predicate = fol_transform_predicate(operator, mt_handling);
            final SubLObject fol_args = (SubLObject)ConsesLow.cons(fol_transform_microtheory((SubLObject)folification.$sym83$_MT), fol_transform_args(args));
            return el_utilities.make_formula(fol_predicate, fol_args, (SubLObject)folification.UNPROVIDED);
        }
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
        final SubLObject fol_predicate = fol_transform_predicate(operator, mt_handling);
        final SubLObject fol_args = fol_transform_args(args);
        return el_utilities.make_formula(fol_predicate, fol_args, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 62297L)
    public static SubLObject isa_asent_fol_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = folification.$fol_isa_handling$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)folification.$kw209$ISA)) {
            return isa_asent_fol_sentence_as_isa(asent, mt, mt_handling);
        }
        if (pcase_var.eql((SubLObject)folification.$kw6$UNARY_PREDICATE)) {
            SubLObject result = isa_asent_fol_sentence_as_unary_predicate(asent, mt_handling);
            if (folification.NIL != contains_fol_unhandled_expression_p(result)) {
                result = isa_asent_fol_sentence_as_isa(asent, mt, mt_handling);
            }
            return result;
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 62813L)
    public static SubLObject isa_asent_fol_sentence_as_isa(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        return generic_asent_fol_sentence(asent, mt, mt_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 62942L)
    public static SubLObject isa_asent_fol_sentence_as_unary_predicate(final SubLObject asent, final SubLObject mt_handling) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)folification.UNPROVIDED);
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject col = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list210);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list210);
        col = current.first();
        current = current.rest();
        if (folification.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list210);
            return (SubLObject)folification.NIL;
        }
        if (mt_handling.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
            final SubLObject predicate = fol_transform_col_as_predicate(col, mt_handling);
            final SubLObject args = (SubLObject)ConsesLow.list(fol_transform_microtheory((SubLObject)folification.$sym83$_MT), fol_transform_arg(v_term));
            return el_utilities.make_formula(predicate, args, (SubLObject)folification.UNPROVIDED);
        }
        final SubLObject predicate = fol_transform_col_as_predicate(col, mt_handling);
        final SubLObject arg = fol_transform_arg(v_term);
        return el_utilities.make_unary_formula(predicate, arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 63508L)
    public static SubLObject fol_transform_args(final SubLObject args) {
        SubLObject fol_args = (SubLObject)folification.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)folification.NIL;
        arg = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            fol_args = (SubLObject)ConsesLow.cons(fol_transform_arg(arg), fol_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(fol_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 63679L)
    public static SubLObject fol_transform_arg(final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.NIL != list_utilities.member_eqP(arg, folification.$unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled((SubLObject)folification.$kw109$EXPLICITLY_FORBIDDEN_TERM, arg);
        }
        if (folification.NIL != constant_handles.constant_p(arg)) {
            return make_fol_atomic_term(arg);
        }
        if (folification.NIL != nart_handles.nart_p(arg)) {
            final SubLObject nart_formula = narts_high.nart_hl_formula(arg);
            return fol_transform_arg(nart_formula);
        }
        if (folification.NIL != variables.variable_p(arg)) {
            if (folification.NIL != folification.$fol_current_assertion$.getDynamicValue(thread)) {
                final SubLObject el_var = assertions_high.assertion_hl_variable_to_el(folification.$fol_current_assertion$.getDynamicValue(thread), arg);
                if (folification.NIL != el_var) {
                    return el_var;
                }
            }
            return arg;
        }
        if (folification.NIL != cycl_grammar.el_variable_p(arg)) {
            return arg;
        }
        if (arg.isNumber()) {
            return make_fol_number(arg);
        }
        if (arg.isString()) {
            return make_fol_string(arg);
        }
        if (folification.NIL != assertion_handles.assertion_p(arg)) {
            return fol_unhandled((SubLObject)folification.$kw211$META_ASSERTION, arg);
        }
        if (arg.isKeyword()) {
            return fol_unhandled((SubLObject)folification.$kw212$META_VARIABLE, arg);
        }
        if (arg.isSymbol()) {
            return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, arg);
        }
        if (folification.NIL == el_utilities.possibly_naut_p(arg)) {
            return fol_unhandled((SubLObject)folification.$kw159$UNEXPECTED, arg);
        }
        if (folification.NIL != el_utilities.subl_escape_p(arg)) {
            return fol_unhandled((SubLObject)folification.$kw213$SUBL_ESCAPE, arg);
        }
        if (folification.NIL != fort_types_interface.sentential_relation_p(cycl_utilities.formula_operator(arg))) {
            return fol_unhandled((SubLObject)folification.$kw214$META_SENTENCE, arg);
        }
        SubLObject fol_sentence = (SubLObject)folification.NIL;
        final SubLObject function = cycl_utilities.formula_operator(arg);
        final SubLObject args = cycl_utilities.formula_args(arg, (SubLObject)folification.UNPROVIDED);
        final SubLObject fol_function = fol_transform_function(function);
        final SubLObject fol_args = fol_transform_args(args);
        fol_sentence = el_utilities.make_formula(fol_function, fol_args, (SubLObject)folification.UNPROVIDED);
        if (folification.NIL != el_utilities.sequence_term(arg)) {
            fol_sentence = ConsesLow.append(fol_sentence, (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw204$SEQUENCE_VAR, el_utilities.sequence_term(arg))));
        }
        return fol_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 65241L)
    public static SubLObject fol_transform_microtheory(final SubLObject arg) {
        if (folification.NIL != list_utilities.member_eqP(arg, folification.$unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled((SubLObject)folification.$kw109$EXPLICITLY_FORBIDDEN_TERM, arg);
        }
        if (arg.isNumber()) {
            return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, arg);
        }
        if (arg.isString()) {
            return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, arg);
        }
        return fol_transform_arg(arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 65561L)
    public static SubLObject asent_set_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        SubLObject set_sentence = (SubLObject)folification.NIL;
        if (folification.NIL != el_utilities.sequence_term(asent)) {
            set_sentence = ConsesLow.append(set_sentence, (SubLObject)ConsesLow.list(fol_unhandled((SubLObject)folification.$kw204$SEQUENCE_VAR, el_utilities.sequence_term(asent))));
        }
        else {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (pcase_var.eql(folification.$const142$isa)) {
                set_sentence = isa_asent_set_sentence(asent, mt, mt_handling);
            }
            else if (pcase_var.eql(folification.$const205$different)) {
                set_sentence = different_asent_set_sentence(asent);
            }
            else if (pcase_var.eql(folification.$const82$genlMt)) {
                set_sentence = genlmt_asent_set_sentence(asent);
            }
            else {
                set_sentence = generic_asent_set_sentence(asent, mt, mt_handling);
            }
        }
        return set_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 66309L)
    public static SubLObject genlmt_asent_set_sentence(final SubLObject asent) {
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
        final SubLObject set_predicate = set_transform_predicate(operator, (SubLObject)folification.$kw84$MT_VISIBLE);
        final SubLObject set_args = set_transform_args(args);
        return el_utilities.make_formula(set_predicate, set_args, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 66823L)
    public static SubLObject generic_asent_set_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        if (mt_handling.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
            final SubLObject operator = cycl_utilities.formula_operator(asent);
            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
            final SubLObject set_predicate = set_transform_arg(operator);
            final SubLObject set_args = (SubLObject)ConsesLow.cons(set_transform_microtheory((SubLObject)folification.$sym83$_MT), set_transform_args(args));
            return el_utilities.make_formula(set_transform_predicate(folification.$const215$memberOfSet, mt_handling), (SubLObject)ConsesLow.cons(set_predicate, set_args), (SubLObject)folification.UNPROVIDED);
        }
        final SubLObject operator = cycl_utilities.formula_operator(asent);
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)folification.UNPROVIDED);
        final SubLObject set_predicate = set_transform_arg(operator);
        final SubLObject set_args = set_transform_args(args);
        return el_utilities.make_formula(set_transform_predicate(folification.$const215$memberOfSet, mt_handling), (SubLObject)ConsesLow.cons(set_predicate, set_args), (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 67604L)
    public static SubLObject isa_asent_set_sentence(final SubLObject asent, final SubLObject mt, final SubLObject mt_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = folification.$fol_isa_handling$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)folification.$kw209$ISA)) {
            return generic_asent_set_sentence(asent, mt, mt_handling);
        }
        if (pcase_var.eql((SubLObject)folification.$kw6$UNARY_PREDICATE)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)folification.UNPROVIDED);
            SubLObject v_term = (SubLObject)folification.NIL;
            SubLObject col = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list210);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list210);
            col = current.first();
            current = current.rest();
            if (folification.NIL == current) {
                if (mt_handling.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
                    final SubLObject predicate = set_transform_arg(col);
                    final SubLObject args = (SubLObject)ConsesLow.list(set_transform_microtheory((SubLObject)folification.$sym83$_MT), set_transform_arg(v_term));
                    return el_utilities.make_formula(set_transform_predicate(folification.$const215$memberOfSet, mt_handling), (SubLObject)ConsesLow.cons(predicate, args), (SubLObject)folification.UNPROVIDED);
                }
                final SubLObject predicate = set_transform_arg(col);
                final SubLObject arg = set_transform_arg(v_term);
                return el_utilities.make_formula(set_transform_predicate(folification.$const215$memberOfSet, mt_handling), (SubLObject)ConsesLow.list(predicate, arg), (SubLObject)folification.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list210);
            }
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 68462L)
    public static SubLObject different_asent_set_sentence(final SubLObject asent) {
        return different_asent_fol_sentence(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 68663L)
    public static SubLObject set_transform_args(final SubLObject args) {
        if (Sequences.length(args).eql((SubLObject)folification.ONE_INTEGER)) {
            return set_transform_arg(args.first());
        }
        return el_utilities.make_binary_formula(set_transform_function(folification.$const216$SetifyArgumentFn), set_transform_arg(args.first()), set_transform_args(args.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 69365L)
    public static SubLObject set_transform_function(final SubLObject operator) {
        return fol_transform_function(operator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 69459L)
    public static SubLObject set_transform_arg(final SubLObject arg) {
        return fol_transform_arg(arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 69533L)
    public static SubLObject set_transform_microtheory(final SubLObject mt) {
        return fol_transform_microtheory(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 69621L)
    public static SubLObject set_transform_predicate(final SubLObject operator, final SubLObject mt_handling) {
        return make_fol_predicate(operator, (SubLObject)folification.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 69749L)
    public static SubLObject fol_transform_predicate(final SubLObject operator, final SubLObject mt_handling) {
        if (folification.NIL != list_utilities.member_eqP(operator, folification.$unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled((SubLObject)folification.$kw109$EXPLICITLY_FORBIDDEN_TERM, operator);
        }
        if (operator.eql(folification.$const85$mtVisible)) {
            return make_fol_predicate(operator, (SubLObject)folification.ONE_INTEGER);
        }
        if (operator.eql(folification.$const217$ist)) {
            return fol_unhandled((SubLObject)folification.$kw218$IST, operator);
        }
        if (folification.NIL != list_utilities.member_eqP(operator, (SubLObject)folification.$list219)) {
            return operator;
        }
        if (folification.NIL != forts.fort_p(operator)) {
            if (folification.NIL == fort_types_interface.predicateP(operator)) {
                return fol_unhandled((SubLObject)folification.$kw220$NON_PREDICATE, operator);
            }
            final SubLObject v_arity = arity.arity(operator);
            if (!v_arity.isInteger()) {
                if (folification.NIL != arity.arity_max(operator)) {
                    return fol_unhandled((SubLObject)folification.$kw221$VARIABLE_ARITY_PREDICATE, operator);
                }
                return fol_unhandled((SubLObject)folification.$kw222$UNBOUNDED_ARITY_PREDICATE, operator);
            }
            else {
                if (mt_handling.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
                    return make_fol_predicate(operator, Numbers.add(v_arity, (SubLObject)folification.ONE_INTEGER));
                }
                return make_fol_predicate(operator, v_arity);
            }
        }
        else {
            if (folification.NIL == variables.fully_bound_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw223$PREDICATE_QUANTIFICATION, operator);
            }
            if (folification.NIL != cycl_grammar.el_variable_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw223$PREDICATE_QUANTIFICATION, operator);
            }
            if (operator.isKeyword()) {
                return fol_unhandled((SubLObject)folification.$kw212$META_VARIABLE, operator);
            }
            if (operator.isSymbol()) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            if (operator.isString()) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            if (folification.NIL == el_utilities.possibly_naut_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw159$UNEXPECTED, operator);
            }
            if (folification.$const224$Kappa.eql(cycl_utilities.naut_functor(operator))) {
                return fol_unhandled((SubLObject)folification.$kw225$KAPPA, operator);
            }
            return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 71461L)
    public static SubLObject fol_transform_col_as_predicate(final SubLObject operator, final SubLObject mt_handling) {
        if (folification.NIL != list_utilities.member_eqP(operator, folification.$unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled((SubLObject)folification.$kw109$EXPLICITLY_FORBIDDEN_TERM, operator);
        }
        if (folification.NIL != forts.fort_p(operator)) {
            if (folification.NIL == fort_types_interface.collectionP(operator)) {
                return fol_unhandled((SubLObject)folification.$kw226$NON_COLLECTION, operator);
            }
            if (mt_handling.eql((SubLObject)folification.$kw81$MT_ARGUMENT)) {
                return make_fol_predicate(operator, (SubLObject)folification.TWO_INTEGER);
            }
            return make_fol_predicate(operator, (SubLObject)folification.ONE_INTEGER);
        }
        else {
            if (folification.NIL == variables.fully_bound_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw227$COLLECTION_QUANTIFICATION, operator);
            }
            if (folification.NIL != cycl_grammar.el_variable_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw227$COLLECTION_QUANTIFICATION, operator);
            }
            if (folification.NIL != el_utilities.possibly_naut_p(operator) && folification.NIL != fort_types_interface.functor_p(cycl_utilities.formula_operator(operator))) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            if (operator.isKeyword()) {
                return fol_unhandled((SubLObject)folification.$kw212$META_VARIABLE, operator);
            }
            if (operator.isSymbol()) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            if (operator.isString()) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            return fol_unhandled((SubLObject)folification.$kw159$UNEXPECTED, operator);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 73048L)
    public static SubLObject fol_transform_function(final SubLObject operator) {
        if (folification.NIL != list_utilities.member_eqP(operator, folification.$unfolifiable_terms$.getGlobalValue())) {
            return fol_unhandled((SubLObject)folification.$kw109$EXPLICITLY_FORBIDDEN_TERM, operator);
        }
        if (operator.eql(folification.$const216$SetifyArgumentFn)) {
            return make_fol_function(operator, (SubLObject)folification.TWO_INTEGER);
        }
        if (folification.NIL != forts.fort_p(operator)) {
            if (folification.NIL == fort_types_interface.functionP(operator)) {
                return fol_unhandled((SubLObject)folification.$kw228$NON_FUNCTION, operator);
            }
            if (folification.NIL != fort_types_interface.scoping_relation_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw229$SCOPING_RELATION, operator);
            }
            final SubLObject v_arity = arity.arity(operator);
            if (v_arity.isInteger()) {
                return make_fol_function(operator, v_arity);
            }
            if (folification.NIL != arity.arity_max(operator)) {
                return fol_unhandled((SubLObject)folification.$kw230$VARIABLE_ARITY_FUNCTION, operator);
            }
            return fol_unhandled((SubLObject)folification.$kw231$UNBOUNDED_ARITY_FUNCTION, operator);
        }
        else {
            if (folification.NIL == variables.fully_bound_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw232$FUNCTION_QUANTIFICATION, operator);
            }
            if (folification.NIL != cycl_grammar.el_variable_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw232$FUNCTION_QUANTIFICATION, operator);
            }
            if (operator.isKeyword()) {
                return fol_unhandled((SubLObject)folification.$kw212$META_VARIABLE, operator);
            }
            if (operator.isSymbol()) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            if (operator.isString()) {
                return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
            }
            if (folification.NIL == el_utilities.possibly_naut_p(operator)) {
                return fol_unhandled((SubLObject)folification.$kw159$UNEXPECTED, operator);
            }
            if (folification.$const233$Lambda.eql(cycl_utilities.naut_functor(operator))) {
                return fol_unhandled((SubLObject)folification.$kw234$LAMBDA, operator);
            }
            return fol_unhandled((SubLObject)folification.$kw157$ILL_FORMED, operator);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 74468L)
    public static SubLObject fol_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != fol_represented_term_p(v_object) || folification.NIL != fol_unrepresented_term_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 74590L)
    public static SubLObject fol_represented_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != fol_atomic_term_p(v_object) || folification.NIL != fol_string_constant_p(v_object) || folification.NIL != fol_number_constant_p(v_object) || folification.NIL != fol_predicate_p(v_object) || folification.NIL != fol_function_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 74811L)
    public static SubLObject fol_unrepresented_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != fol_string_p(v_object) || folification.NIL != fol_number_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 74925L)
    public static SubLObject make_fol_atomic_term(final SubLObject v_object) {
        return el_utilities.make_unary_formula(folification.$const235$FOL_AtomicTermFn, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75027L)
    public static SubLObject fol_atomic_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const235$FOL_AtomicTermFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75164L)
    public static SubLObject make_fol_predicate(final SubLObject v_object, final SubLObject v_arity) {
        assert folification.NIL != Types.integerp(v_arity) : v_arity;
        return el_utilities.make_binary_formula(folification.$const167$FOL_PredicateFn, v_object, v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75306L)
    public static SubLObject fol_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const167$FOL_PredicateFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75440L)
    public static SubLObject make_fol_function(final SubLObject v_object, final SubLObject v_arity) {
        assert folification.NIL != Types.integerp(v_arity) : v_arity;
        return el_utilities.make_binary_formula(folification.$const237$FOL_FunctionFn, v_object, v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75580L)
    public static SubLObject fol_function_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const237$FOL_FunctionFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75712L)
    public static SubLObject fol_function_arity(final SubLObject v_object) {
        return cycl_utilities.formula_arg2(v_object, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 75787L)
    public static SubLObject make_fol_string(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert folification.NIL != Types.stringp(v_object) : v_object;
        final SubLObject pcase_var = folification.$fol_string_handling$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)folification.$kw10$ALLOWED)) {
            return el_utilities.make_unary_formula(folification.$const238$FOL_StringFn, v_object);
        }
        if (pcase_var.eql((SubLObject)folification.$kw239$DWIM_TO_DISTINCT_CONSTANTS)) {
            return el_utilities.make_unary_formula(folification.$const240$FOL_StringConstantFn, v_object);
        }
        if (pcase_var.eql((SubLObject)folification.$kw241$DWIM_TO_SINGLE_CONSTANT)) {
            return make_fol_atomic_term(folification.$const242$Canonical_String);
        }
        return Errors.error((SubLObject)folification.$str243$unexpected_string_handling_direct, folification.$fol_string_handling$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 76258L)
    public static SubLObject fol_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const238$FOL_StringFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 76449L)
    public static SubLObject fol_string_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const240$FOL_StringConstantFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 76723L)
    public static SubLObject make_fol_number(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert folification.NIL != Types.numberp(v_object) : v_object;
        final SubLObject pcase_var = folification.$fol_number_handling$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)folification.$kw10$ALLOWED)) {
            return el_utilities.make_unary_formula(folification.$const245$FOL_NumberFn, v_object);
        }
        if (pcase_var.eql((SubLObject)folification.$kw12$DWIM_FLOATS_TO_DISTINCT_CONSTANTS)) {
            if (v_object.isDouble()) {
                return el_utilities.make_unary_formula(folification.$const246$FOL_NumberConstantFn, v_object);
            }
            return el_utilities.make_unary_formula(folification.$const245$FOL_NumberFn, v_object);
        }
        else {
            if (pcase_var.eql((SubLObject)folification.$kw247$DWIM_ALL_TO_DISTINCT_CONSTANTS)) {
                return el_utilities.make_unary_formula(folification.$const246$FOL_NumberConstantFn, v_object);
            }
            return Errors.error((SubLObject)folification.$str248$unexpected_number_handling_direct, folification.$fol_number_handling$.getDynamicValue(thread));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 77275L)
    public static SubLObject fol_number_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const245$FOL_NumberFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 77406L)
    public static SubLObject fol_number_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.$const246$FOL_NumberConstantFn.eql(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 77722L)
    public static SubLObject fol_cafP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != fol_atomic_sentenceP(v_object) && folification.NIL != fol_closedP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 77829L)
    public static SubLObject fol_atomic_sentenceP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.el_formula_p(v_object) && folification.NIL != fol_predicate_p(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 77963L)
    public static SubLObject fol_closedP(final SubLObject focycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != el_utilities.groundP(focycl, Symbols.symbol_function((SubLObject)folification.$sym249$EL_VAR_)) || folification.NIL != el_utilities.no_free_variablesP(focycl_to_cycl(focycl), Symbols.symbol_function((SubLObject)folification.$sym249$EL_VAR_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 78129L)
    public static SubLObject fol_sentences_data_mentioning_term(final SubLObject fol_sentences_data, final SubLObject v_term) {
        SubLObject data = (SubLObject)folification.NIL;
        SubLObject cdolist_list_var = fol_sentences_data;
        SubLObject datum = (SubLObject)folification.NIL;
        datum = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            final SubLObject fol_sentences = conses_high.second(datum);
            if (folification.NIL != list_utilities.tree_find(v_term, fol_sentences, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED)) {
                data = (SubLObject)ConsesLow.cons(datum, data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return Sequences.nreverse(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 78417L)
    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_analysis(final SubLObject analysis) {
        return all_fol_predicates_and_arguments_mentioned_in_analysis_data(fol_sentences_analysis_data(analysis));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 78609L)
    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_analysis_data(final SubLObject analysis_data) {
        SubLObject all_predicates = (SubLObject)folification.NIL;
        SubLObject all_arguments = (SubLObject)folification.NIL;
        SubLObject cdolist_list_var = analysis_data;
        SubLObject fol_datum = (SubLObject)folification.NIL;
        fol_datum = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_fol_datum(fol_datum);
            SubLObject predicates = (SubLObject)folification.NIL;
            SubLObject v_arguments = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list250);
            predicates = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list250);
            v_arguments = current.first();
            current = current.rest();
            if (folification.NIL == current) {
                all_predicates = ConsesLow.append(predicates, all_predicates);
                all_arguments = ConsesLow.append(v_arguments, all_arguments);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list250);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fol_datum = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(list_utilities.fast_delete_duplicates(all_predicates, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 79152L)
    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_fol_datum(final SubLObject fol_datum) {
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_datum, fol_datum, (SubLObject)folification.$list76);
        v_term = fol_datum.first();
        SubLObject current = fol_datum.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_datum, (SubLObject)folification.$list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, fol_datum, (SubLObject)folification.$list76);
        current = current.rest();
        if (folification.NIL == current) {
            return all_fol_predicates_and_arguments_mentioned_in_fol_sentences(fol_sentences, (SubLObject)folification.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(fol_datum, (SubLObject)folification.$list76);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 79455L)
    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_fol_sentences(final SubLObject fol_sentences, SubLObject atomicP) {
        if (atomicP == folification.UNPROVIDED) {
            atomicP = (SubLObject)folification.NIL;
        }
        SubLObject all_predicates = (SubLObject)folification.NIL;
        SubLObject all_arguments = (SubLObject)folification.NIL;
        SubLObject cdolist_list_var = fol_sentences;
        SubLObject focycl_sentence = (SubLObject)folification.NIL;
        focycl_sentence = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_focycl_sentence(focycl_sentence, atomicP);
            SubLObject predicates = (SubLObject)folification.NIL;
            SubLObject v_arguments = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list250);
            predicates = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list250);
            v_arguments = current.first();
            current = current.rest();
            if (folification.NIL == current) {
                all_predicates = ConsesLow.append(predicates, all_predicates);
                all_arguments = ConsesLow.append(v_arguments, all_arguments);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list250);
            }
            cdolist_list_var = cdolist_list_var.rest();
            focycl_sentence = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(list_utilities.fast_delete_duplicates(all_predicates, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 80126L)
    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_focycl_sentence(final SubLObject focycl_sentence, final SubLObject atomicP) {
        if (folification.NIL != atomicP) {
            SubLObject fol_predicate = (SubLObject)folification.NIL;
            SubLObject fol_args = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(focycl_sentence, focycl_sentence, (SubLObject)folification.$list251);
            fol_predicate = focycl_sentence.first();
            final SubLObject current = fol_args = focycl_sentence.rest();
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(fol_predicate), fol_args);
        }
        final SubLObject atomic_sentences = list_utilities.tree_find_all_if(Symbols.symbol_function((SubLObject)folification.$sym252$FOL_ATOMIC_SENTENCE_), focycl_sentence, (SubLObject)folification.UNPROVIDED);
        return all_fol_predicates_and_arguments_mentioned_in_fol_sentences(atomic_sentences, (SubLObject)folification.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 80547L)
    public static SubLObject fol_header_to_stream(final SubLObject fol_sentences_analysis, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)folification.$kw28$TPTP)) {
            return fol_header_to_tptp_stream(fol_sentences_analysis, stream);
        }
        if (output_format.eql((SubLObject)folification.$kw72$CYCL)) {
            return fol_header_to_cycl_stream(fol_sentences_analysis, stream);
        }
        if (output_format == folification.$kw73$ALCHEMY) {
            return fol_header_to_alchemy_stream(fol_sentences_analysis, stream);
        }
        return Errors.error((SubLObject)folification.$str74$Unrecognized_output_format___s, output_format);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 81085L)
    public static SubLObject fol_datum_to_stream(final SubLObject datum, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)folification.$kw28$TPTP)) {
            return fol_datum_to_tptp_stream(datum, stream);
        }
        if (output_format.eql((SubLObject)folification.$kw72$CYCL)) {
            return fol_datum_to_cycl_stream(datum, stream);
        }
        if (output_format == folification.$kw73$ALCHEMY) {
            return fol_datum_to_alchemy_stream(datum, stream);
        }
        return Errors.error((SubLObject)folification.$str74$Unrecognized_output_format___s, output_format);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 81515L)
    public static SubLObject fol_sentences_to_cycl_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        fol_header_to_cycl_stream(v_properties, stream);
        SubLObject cdolist_list_var;
        final SubLObject fol_sentences_data = cdolist_list_var = fol_sentences_analysis_data(fol_sentences_analysis);
        SubLObject datum = (SubLObject)folification.NIL;
        datum = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            fol_datum_to_cycl_stream(datum, stream);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 81968L)
    public static SubLObject fol_header_to_cycl_stream(final SubLObject analysis, final SubLObject stream) {
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 82098L)
    public static SubLObject fol_datum_to_cycl_stream(final SubLObject datum, final SubLObject stream) {
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(datum, datum, (SubLObject)folification.$list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)folification.$list76);
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.NIL != assertion_handles.assertion_p(v_term)) {
                final SubLObject ass = v_term;
                PrintLow.format(stream, (SubLObject)folification.$str253$______S, assertion_handles.assertion_id(ass));
                SubLObject cdolist_list_var = fol_sentences;
                SubLObject sentence = (SubLObject)folification.NIL;
                sentence = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    format_cycl_expression.format_cycl_expression(sentence, stream, (SubLObject)folification.ZERO_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                }
            }
            else if (folification.NIL != forts.fort_p(v_term)) {
                final SubLObject fort = v_term;
                PrintLow.format(stream, (SubLObject)folification.$str253$______S, fort);
                SubLObject cdolist_list_var = fol_sentences;
                SubLObject sentence = (SubLObject)folification.NIL;
                sentence = cdolist_list_var.first();
                while (folification.NIL != cdolist_list_var) {
                    format_cycl_expression.format_cycl_expression(sentence, stream, (SubLObject)folification.ZERO_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list76);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 82658L)
    public static SubLObject fol_query_to_cycl_stream(final SubLObject fol_query, final SubLObject fol_sentences_analysis, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)folification.$str254$_____QUERY_);
        format_cycl_expression.format_cycl_expression(fol_query, stream, (SubLObject)folification.ZERO_INTEGER);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 82867L)
    public static SubLObject assertions_to_tptp_stream(final SubLObject assertions, final SubLObject stream) {
        final SubLObject fol_sentences_analysis = fol_sentences(assertions, (SubLObject)folification.NIL, (SubLObject)folification.NIL, (SubLObject)folification.UNPROVIDED);
        return fol_sentences_to_tptp_stream(fol_sentences_analysis, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 83119L)
    public static SubLObject fol_sentences_to_tptp_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fol_header_to_tptp_stream(fol_sentences_analysis, stream);
        final SubLObject _prev_bind_0 = folification.$tptp_axiom_count$.currentBinding(thread);
        try {
            folification.$tptp_axiom_count$.bind((SubLObject)folification.ZERO_INTEGER, thread);
            SubLObject cdolist_list_var;
            final SubLObject fol_sentences_data = cdolist_list_var = fol_sentences_analysis_data(fol_sentences_analysis);
            SubLObject datum = (SubLObject)folification.NIL;
            datum = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                fol_datum_to_tptp_stream(datum, stream);
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            }
        }
        finally {
            folification.$tptp_axiom_count$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 83477L)
    public static SubLObject fol_header_to_tptp_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        final SubLObject header = fol_generate_tptp_header(v_properties);
        print_high.princ(header, stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 83737L)
    public static SubLObject fol_datum_to_tptp_stream(final SubLObject datum, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(datum, datum, (SubLObject)folification.$list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)folification.$list76);
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.NIL != fol_sentences) {
                output_tptp_term_comment(v_term, stream);
            }
            SubLObject cdolist_list_var = fol_sentences;
            SubLObject focycl = (SubLObject)folification.NIL;
            focycl = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                folification.$tptp_axiom_count$.setDynamicValue(Numbers.add(folification.$tptp_axiom_count$.getDynamicValue(thread), (SubLObject)folification.ONE_INTEGER), thread);
                output_focycl_as_tptp(stream, focycl, folification.$tptp_axiom_count$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                focycl = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list76);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 84172L)
    public static SubLObject output_tptp_term_comment(final SubLObject v_term, final SubLObject stream) {
        if (folification.NIL != assertion_handles.assertion_p(v_term)) {
            PrintLow.format(stream, (SubLObject)folification.$str255$__Cyc_Assertion___a___, assertion_handles.assertion_id(v_term));
        }
        else if (folification.NIL != nart_handles.nart_p(v_term)) {
            PrintLow.format(stream, (SubLObject)folification.$str256$__Cyc_NART___a___, nart_handles.nart_id(v_term));
        }
        else if (folification.NIL != constant_handles.constant_p(v_term)) {
            PrintLow.format(stream, (SubLObject)folification.$str257$__Cyc_Constant___a___, constants_high.constant_internal_id(v_term));
        }
        else if (folification.NIL != el_utilities.possibly_cycl_sentence_p(v_term)) {
            PrintLow.format(stream, (SubLObject)folification.$str258$__CycL_Sentence___a___, v_term);
        }
        else {
            Errors.error((SubLObject)folification.$str259$Unexpected_object__s, v_term);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 84702L)
    public static SubLObject fol_query_to_tptp_stream(final SubLObject fol_query, final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject i = compute_tptp_query_index_number(fol_sentences_analysis);
        output_fol_query_as_tptp(stream, fol_query, i);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 84921L)
    public static SubLObject fol_generate_tptp_header(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject header = conses_high.getf(v_properties, (SubLObject)folification.$kw45$HEADER, (SubLObject)folification.UNPROVIDED);
        if (folification.NIL != header) {
            return header;
        }
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)folification.NIL, thread);
            print_high.$print_length$.bind((SubLObject)folification.NIL, thread);
            print_high.$print_level$.bind((SubLObject)folification.NIL, thread);
            header = (SubLObject)folification.$str260$_________________________________;
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str261$File, (SubLObject)folification.$str262$CYC_10___TPTP_v2_2_0__Released_2_);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str263$Domain, (SubLObject)folification.$str264$Knowledge_Representation_Common_S);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str265$Problem, (SubLObject)folification.$str266$Reasoning_with_the_Cyc_Common_Sen);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str267$Version, tptp_properties_for_header(v_properties));
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str268$English, (SubLObject)folification.$str269$The_Cyc_KB_contains_assertions_fo);
            header = fol_tptp_header_add_blankline(header);
            header = fol_tptp_header_add_blankline(header);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str270$Refs, (SubLObject)folification.$str271$);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str272$Source, (SubLObject)folification.$str271$);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str273$Names, (SubLObject)folification.$str271$);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str274$Status, (SubLObject)folification.$str275$unknown);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str276$Rating, (SubLObject)folification.$str277$1_0);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str278$Syntax, (SubLObject)folification.$str279$_blank_);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str280$Comments, (SubLObject)folification.$str281$To_obtain_a_First_Orderification_);
            header = fol_tptp_header_add_field(header, (SubLObject)folification.$str282$Bugfixes, (SubLObject)folification.$str271$);
            header = Sequences.cconcatenate(header, (SubLObject)folification.$str283$_________________________________);
            return header;
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87116L)
    public static SubLObject fol_tptp_header_add_field(final SubLObject header, final SubLObject fieldname, final SubLObject content) {
        return Sequences.cconcatenate(header, new SubLObject[] { folification.$str285$__, fieldname, folification.$str286$___, content, folification.$str287$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87323L)
    public static SubLObject fol_tptp_header_add_blankline(final SubLObject header) {
        return Sequences.cconcatenate(header, (SubLObject)folification.$str288$__);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87416L)
    public static SubLObject tptp_properties_for_header(final SubLObject v_properties) {
        return Sequences.cconcatenate(folification.$folification_version$.getGlobalValue(), new SubLObject[] { folification.$str289$__, format_nil.format_nil_s(list_utilities.filter_plist(v_properties, (SubLObject)folification.$sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87610L)
    public static SubLObject tptp_property_appropriate_for_printingP(final SubLObject property) {
        return (SubLObject)SubLObjectFactory.makeBoolean(property != folification.$kw26$OUTPUT_FILENAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87733L)
    public static SubLObject clear_compute_tptp_query_index_number() {
        final SubLObject cs = folification.$compute_tptp_query_index_number_caching_state$.getGlobalValue();
        if (folification.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87733L)
    public static SubLObject remove_compute_tptp_query_index_number(final SubLObject fol_sentences_analysis) {
        return memoization_state.caching_state_remove_function_results_with_args(folification.$compute_tptp_query_index_number_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fol_sentences_analysis), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87733L)
    public static SubLObject compute_tptp_query_index_number_internal(final SubLObject fol_sentences_analysis) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.NIL != folification.$tptp_query_name$.getDynamicValue(thread)) {
            return folification.$tptp_query_name$.getDynamicValue(thread);
        }
        final SubLObject fol_sentences_data = fol_sentences_analysis_data(fol_sentences_analysis);
        SubLObject count = (SubLObject)folification.ZERO_INTEGER;
        SubLObject cdolist_list_var = fol_sentences_data;
        SubLObject datum = (SubLObject)folification.NIL;
        datum = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$57 = current = datum;
            SubLObject v_term = (SubLObject)folification.NIL;
            SubLObject fol_sentences = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$57, (SubLObject)folification.$list76);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$57, (SubLObject)folification.$list76);
            fol_sentences = current.first();
            current = current.rest();
            final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum_$57, (SubLObject)folification.$list76);
            current = current.rest();
            if (folification.NIL == current) {
                count = Numbers.add(count, Sequences.length(fol_sentences));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$57, (SubLObject)folification.$list76);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return number_utilities.f_1X(count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 87733L)
    public static SubLObject compute_tptp_query_index_number(final SubLObject fol_sentences_analysis) {
        SubLObject caching_state = folification.$compute_tptp_query_index_number_caching_state$.getGlobalValue();
        if (folification.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)folification.$sym291$COMPUTE_TPTP_QUERY_INDEX_NUMBER, (SubLObject)folification.$sym292$_COMPUTE_TPTP_QUERY_INDEX_NUMBER_CACHING_STATE_, (SubLObject)folification.ONE_INTEGER, (SubLObject)folification.EQ, (SubLObject)folification.ONE_INTEGER, (SubLObject)folification.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fol_sentences_analysis, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(compute_tptp_query_index_number_internal(fol_sentences_analysis)));
            memoization_state.caching_state_put(caching_state, fol_sentences_analysis, results, (SubLObject)folification.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 88449L)
    public static SubLObject output_focycl_as_tptp(final SubLObject stream, final SubLObject focycl, final SubLObject i) {
        output_tptp_axiom(stream, focycl, i);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 88557L)
    public static SubLObject output_fol_query_as_tptp(final SubLObject stream, final SubLObject focycl, final SubLObject i) {
        output_tptp_query(stream, focycl, i);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 88668L)
    public static SubLObject output_tptp_axiom(final SubLObject stream, final SubLObject fol_sentence, final SubLObject i) {
        final SubLObject quantified_fol_sentence = el_utilities.explicitify_implicit_universal_quantifiers(fol_sentence);
        PrintLow.format(stream, (SubLObject)folification.$str293$fof__a_axiom_, tptp_axiom_id(i));
        output_tptp_sentence_recursive(stream, quantified_fol_sentence);
        PrintLow.format(stream, (SubLObject)folification.$str294$____);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 88984L)
    public static SubLObject tptp_axiom_id(final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (folification.NIL != folification.$tptp_axiom_prefix$.getDynamicValue(thread)) {
            return Sequences.cconcatenate(folification.$tptp_axiom_prefix$.getDynamicValue(thread), string_utilities.str(i));
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 89253L)
    public static SubLObject output_tptp_query(final SubLObject stream, final SubLObject fol_query, final SubLObject i) {
        final SubLObject quantified_fol_query = el_utilities.explicitify_implicit_existential_quantifiers(fol_query);
        PrintLow.format(stream, (SubLObject)folification.$str295$fof__a_conjecture_, i);
        output_tptp_sentence_recursive(stream, quantified_fol_query);
        PrintLow.format(stream, (SubLObject)folification.$str294$____);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 89548L)
    public static SubLObject output_tptp_sentence_recursive(final SubLObject stream, final SubLObject fol_sentence) {
        SubLObject operator = (SubLObject)folification.NIL;
        SubLObject args = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_sentence, fol_sentence, (SubLObject)folification.$list296);
        operator = fol_sentence.first();
        final SubLObject current = args = fol_sentence.rest();
        final SubLObject pcase_var = operator;
        if (pcase_var.eql(folification.$const170$implies)) {
            SubLObject current_$59;
            final SubLObject datum_$58 = current_$59 = args;
            SubLObject antecedent = (SubLObject)folification.NIL;
            SubLObject consequent = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$59, datum_$58, (SubLObject)folification.$list297);
            antecedent = current_$59.first();
            current_$59 = current_$59.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$59, datum_$58, (SubLObject)folification.$list297);
            consequent = current_$59.first();
            current_$59 = current_$59.rest();
            if (folification.NIL == current_$59) {
                print_high.princ((SubLObject)folification.$str298$_, stream);
                output_tptp_sentence_recursive(stream, antecedent);
                print_high.princ((SubLObject)folification.$str299$____, stream);
                output_tptp_sentence_recursive(stream, consequent);
                print_high.princ((SubLObject)folification.$str300$_, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$58, (SubLObject)folification.$list297);
            }
        }
        else if (pcase_var.eql(folification.$const301$and)) {
            print_high.princ((SubLObject)folification.$str298$_, stream);
            output_tptp_sentence_recursive(stream, args.first());
            SubLObject cdolist_list_var = args.rest();
            SubLObject conjunct = (SubLObject)folification.NIL;
            conjunct = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)folification.$str302$___, stream);
                output_tptp_sentence_recursive(stream, conjunct);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            print_high.princ((SubLObject)folification.$str300$_, stream);
        }
        else if (pcase_var.eql(folification.$const303$or)) {
            print_high.princ((SubLObject)folification.$str298$_, stream);
            output_tptp_sentence_recursive(stream, args.first());
            SubLObject cdolist_list_var = args.rest();
            SubLObject disjunct = (SubLObject)folification.NIL;
            disjunct = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)folification.$str304$___, stream);
                output_tptp_sentence_recursive(stream, disjunct);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
            print_high.princ((SubLObject)folification.$str300$_, stream);
        }
        else if (pcase_var.eql(folification.$const305$not)) {
            print_high.princ((SubLObject)folification.$str306$__, stream);
            output_tptp_sentence_recursive(stream, args.first());
            print_high.princ((SubLObject)folification.$str300$_, stream);
        }
        else if (pcase_var.eql(folification.$const307$thereExists)) {
            SubLObject current_$60;
            final SubLObject datum_$59 = current_$60 = args;
            SubLObject el_var = (SubLObject)folification.NIL;
            SubLObject fol_subsentence = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$60, datum_$59, (SubLObject)folification.$list308);
            el_var = current_$60.first();
            current_$60 = current_$60.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$60, datum_$59, (SubLObject)folification.$list308);
            fol_subsentence = current_$60.first();
            current_$60 = current_$60.rest();
            if (folification.NIL == current_$60) {
                PrintLow.format(stream, (SubLObject)folification.$str309$_____a____, fol_tptp_el_var_name(el_var));
                output_tptp_sentence_recursive(stream, fol_subsentence);
                print_high.princ((SubLObject)folification.$str300$_, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$59, (SubLObject)folification.$list308);
            }
        }
        else if (pcase_var.eql(folification.$const310$forAll)) {
            SubLObject current_$61;
            final SubLObject datum_$60 = current_$61 = args;
            SubLObject el_var = (SubLObject)folification.NIL;
            SubLObject fol_subsentence = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)folification.$list308);
            el_var = current_$61.first();
            current_$61 = current_$61.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)folification.$list308);
            fol_subsentence = current_$61.first();
            current_$61 = current_$61.rest();
            if (folification.NIL == current_$61) {
                PrintLow.format(stream, (SubLObject)folification.$str311$_____a____, fol_tptp_el_var_name(el_var));
                output_tptp_sentence_recursive(stream, fol_subsentence);
                print_high.princ((SubLObject)folification.$str300$_, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$60, (SubLObject)folification.$list308);
            }
        }
        else if (pcase_var.eql(folification.$const207$equals) || pcase_var.eql(folification.$const312$equalSymbols)) {
            SubLObject current_$62;
            final SubLObject datum_$61 = current_$62 = args;
            SubLObject arg1 = (SubLObject)folification.NIL;
            SubLObject arg2 = (SubLObject)folification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)folification.$list133);
            arg1 = current_$62.first();
            current_$62 = current_$62.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)folification.$list133);
            arg2 = current_$62.first();
            current_$62 = current_$62.rest();
            if (folification.NIL == current_$62) {
                print_high.princ((SubLObject)folification.$str298$_, stream);
                output_tptp_arg(stream, arg1);
                print_high.princ((SubLObject)folification.$str313$___, stream);
                output_tptp_arg(stream, arg2);
                print_high.princ((SubLObject)folification.$str300$_, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$61, (SubLObject)folification.$list133);
            }
        }
        else {
            print_high.princ((SubLObject)folification.$str298$_, stream);
            output_tptp_predicate(stream, operator);
            print_high.princ((SubLObject)folification.$str298$_, stream);
            output_tptp_arg(stream, args.first());
            SubLObject cdolist_list_var = args.rest();
            SubLObject arg3 = (SubLObject)folification.NIL;
            arg3 = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)folification.$str314$_, stream);
                output_tptp_arg(stream, arg3);
                cdolist_list_var = cdolist_list_var.rest();
                arg3 = cdolist_list_var.first();
            }
            print_high.princ((SubLObject)folification.$str315$__, stream);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 91483L)
    public static SubLObject output_tptp_arg(final SubLObject stream, final SubLObject v_object) {
        if (folification.NIL != fol_function_p(v_object)) {
            return output_tptp_function(stream, v_object);
        }
        if (folification.NIL != fol_atomic_term_p(v_object)) {
            return output_tptp_atomic_term(stream, v_object);
        }
        if (folification.NIL != fol_string_constant_p(v_object)) {
            return output_tptp_string_constant(stream, v_object);
        }
        if (folification.NIL != fol_string_p(v_object)) {
            return output_tptp_string(stream, v_object);
        }
        if (folification.NIL != fol_number_constant_p(v_object)) {
            return output_tptp_number_constant(stream, v_object);
        }
        if (folification.NIL != fol_number_p(v_object)) {
            return output_tptp_number(stream, v_object);
        }
        if (folification.NIL != cycl_grammar.el_variable_p(v_object)) {
            return output_tptp_variable(stream, v_object);
        }
        if (folification.NIL != el_utilities.possibly_naut_p(v_object)) {
            return output_tptp_nat(stream, v_object);
        }
        return Errors.error((SubLObject)folification.$str316$unexpected_FOL_term__s, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 92265L)
    public static SubLObject output_tptp_nat(final SubLObject stream, final SubLObject fol_nat) {
        SubLObject fol_function = (SubLObject)folification.NIL;
        SubLObject fol_args = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_nat, fol_nat, (SubLObject)folification.$list317);
        fol_function = fol_nat.first();
        final SubLObject current = fol_args = fol_nat.rest();
        final SubLObject v_arity = fol_function_arity(fol_function);
        if (v_arity.isZero()) {
            output_tptp_zero_arity_function(stream, fol_function);
        }
        else {
            output_tptp_function(stream, fol_function);
            print_high.princ((SubLObject)folification.$str298$_, stream);
            if (folification.NIL != fol_args) {
                output_tptp_arg(stream, fol_args.first());
            }
            SubLObject cdolist_list_var = fol_args.rest();
            SubLObject arg = (SubLObject)folification.NIL;
            arg = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                print_high.princ((SubLObject)folification.$str314$_, stream);
                output_tptp_arg(stream, arg);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            print_high.princ((SubLObject)folification.$str300$_, stream);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 92925L)
    public static SubLObject output_tptp_predicate(final SubLObject stream, final SubLObject fol_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_predicate_fn = (SubLObject)folification.NIL;
        SubLObject cycl_predicate = (SubLObject)folification.NIL;
        SubLObject v_arity = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_predicate, fol_predicate, (SubLObject)folification.$list318);
        fol_predicate_fn = fol_predicate.first();
        SubLObject current = fol_predicate.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_predicate, (SubLObject)folification.$list318);
        cycl_predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_predicate, (SubLObject)folification.$list318);
        v_arity = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.$fol_translation_type$.getDynamicValue(thread) == folification.$kw203$SET_THEORY) {
                print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str319$p_, string_utilities.str(cycl_predicate))), stream);
            }
            else {
                print_high.princ(make_tptp_symbol_name(string_utilities.str(cycl_predicate)), stream);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_predicate, (SubLObject)folification.$list318);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 93321L)
    public static SubLObject output_tptp_function(final SubLObject stream, final SubLObject fol_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_function_fn = (SubLObject)folification.NIL;
        SubLObject cycl_function = (SubLObject)folification.NIL;
        SubLObject v_arity = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_function, fol_function, (SubLObject)folification.$list320);
        fol_function_fn = fol_function.first();
        SubLObject current = fol_function.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_function, (SubLObject)folification.$list320);
        cycl_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_function, (SubLObject)folification.$list320);
        v_arity = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.$fol_translation_type$.getDynamicValue(thread) == folification.$kw203$SET_THEORY) {
                print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str321$f_, string_utilities.str(cycl_function))), stream);
            }
            else {
                print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str321$f_, string_utilities.str(cycl_function))), stream);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_function, (SubLObject)folification.$list320);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 93752L)
    public static SubLObject output_tptp_zero_arity_function(final SubLObject stream, final SubLObject fol_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_function_fn = (SubLObject)folification.NIL;
        SubLObject cycl_function = (SubLObject)folification.NIL;
        SubLObject v_arity = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_function, fol_function, (SubLObject)folification.$list320);
        fol_function_fn = fol_function.first();
        SubLObject current = fol_function.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_function, (SubLObject)folification.$list320);
        cycl_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_function, (SubLObject)folification.$list320);
        v_arity = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.$fol_translation_type$.getDynamicValue(thread) == folification.$kw203$SET_THEORY) {
                print_high.princ(make_tptp_symbol_name(string_utilities.str(cycl_function)), stream);
            }
            else {
                print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str322$c_zero_arity_function_application, string_utilities.str(cycl_function))), stream);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_function, (SubLObject)folification.$list320);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 94183L)
    public static SubLObject output_tptp_atomic_term(final SubLObject stream, final SubLObject fol_atomic_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_atomic_term_fn = (SubLObject)folification.NIL;
        SubLObject cycl_atomic_term = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_atomic_term, fol_atomic_term, (SubLObject)folification.$list323);
        fol_atomic_term_fn = fol_atomic_term.first();
        SubLObject current = fol_atomic_term.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_atomic_term, (SubLObject)folification.$list323);
        cycl_atomic_term = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.$fol_translation_type$.getDynamicValue(thread) == folification.$kw203$SET_THEORY) {
                print_high.princ(make_tptp_symbol_name(constants_high.constant_name(cycl_atomic_term)), stream);
            }
            else {
                print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str324$c_, constants_high.constant_name(cycl_atomic_term))), stream);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_atomic_term, (SubLObject)folification.$list323);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 94923L)
    public static SubLObject output_tptp_string_constant(final SubLObject stream, final SubLObject fol_string) {
        SubLObject fol_string_constant_fn = (SubLObject)folification.NIL;
        SubLObject subl_string = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_string, fol_string, (SubLObject)folification.$list325);
        fol_string_constant_fn = fol_string.first();
        SubLObject current = fol_string.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_string, (SubLObject)folification.$list325);
        subl_string = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str326$s_, subl_string)), stream);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_string, (SubLObject)folification.$list325);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 95184L)
    public static SubLObject output_tptp_string(final SubLObject stream, final SubLObject fol_string) {
        SubLObject fol_string_fn = (SubLObject)folification.NIL;
        SubLObject subl_string = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_string, fol_string, (SubLObject)folification.$list327);
        fol_string_fn = fol_string.first();
        SubLObject current = fol_string.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_string, (SubLObject)folification.$list327);
        subl_string = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            print_high.princ((SubLObject)folification.$str328$_, stream);
            print_high.princ(tptp_string_stringify(subl_string), stream);
            print_high.princ((SubLObject)folification.$str328$_, stream);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_string, (SubLObject)folification.$list327);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 95448L)
    public static SubLObject output_tptp_number_constant(final SubLObject stream, final SubLObject fol_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_number_constant_fn = (SubLObject)folification.NIL;
        SubLObject subl_number = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_number, fol_number, (SubLObject)folification.$list329);
        fol_number_constant_fn = fol_number.first();
        SubLObject current = fol_number.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_number, (SubLObject)folification.$list329);
        subl_number = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)folification.$sym330$DOUBLE_FLOAT, thread);
                print_high.princ(make_tptp_symbol_name(Sequences.cconcatenate((SubLObject)folification.$str331$n_, format_nil.format_nil_a_no_copy(subl_number))), stream);
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_number, (SubLObject)folification.$list329);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 95780L)
    public static SubLObject output_tptp_number(final SubLObject stream, final SubLObject fol_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fol_number_fn = (SubLObject)folification.NIL;
        SubLObject subl_number = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_number, fol_number, (SubLObject)folification.$list332);
        fol_number_fn = fol_number.first();
        SubLObject current = fol_number.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_number, (SubLObject)folification.$list332);
        subl_number = current.first();
        current = current.rest();
        if (folification.NIL == current) {
            final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)folification.$sym330$DOUBLE_FLOAT, thread);
                print_high.princ(tptp_number_stringify(format_nil.format_nil_a(subl_number)), stream);
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(fol_number, (SubLObject)folification.$list332);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96083L)
    public static SubLObject output_tptp_variable(final SubLObject stream, final SubLObject el_var) {
        print_high.princ(fol_tptp_el_var_name(el_var), stream);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96197L)
    public static SubLObject fol_tptp_el_var_name(final SubLObject el_var) {
        return tptp_upcase_stringify(cycl_variables.el_var_name(el_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96298L)
    public static SubLObject tptp_string_stringify(final SubLObject string) {
        return list_utilities.delete_if_not((SubLObject)folification.$sym333$TPTP_STRING_CHAR_P, string, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96756L)
    public static SubLObject clear_tptp_long_symbol_name_cache() {
        folification.$tptp_long_symbol_name_cache$.setGlobalValue(Hashtables.make_hash_table((SubLObject)folification.$int335$256, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED));
        return folification.$tptp_long_symbol_name_cache$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 96921L)
    public static SubLObject make_tptp_symbol_name(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = tptp_downcase_stringify(string);
        if (Sequences.length(name).numGE(folification.$tptp_long_symbol_min_length$.getDynamicValue(thread))) {
            final SubLObject cached_name = Hashtables.gethash_without_values(name, folification.$tptp_long_symbol_name_cache$.getGlobalValue(), (SubLObject)folification.UNPROVIDED);
            if (folification.NIL != cached_name) {
                name = cached_name;
            }
            else {
                final SubLObject i = Hashtables.hash_table_count(folification.$tptp_long_symbol_name_cache$.getGlobalValue());
                final SubLObject new_name = Sequences.cconcatenate((SubLObject)folification.$str336$ls_, string_utilities.str(i));
                Hashtables.sethash(name, folification.$tptp_long_symbol_name_cache$.getGlobalValue(), new_name);
                name = new_name;
            }
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 97481L)
    public static SubLObject tptp_downcase_stringify(SubLObject string) {
        string = string_utilities.char_subst((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, string);
        string = string_utilities.char_subst((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_colon, string);
        string = list_utilities.delete_if_not((SubLObject)folification.$sym337$TPTP_NON_NUMERIC_ATOM_CHAR_P, Strings.string_downcase(string, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
        if (folification.NIL == Characters.alpha_char_p(string_utilities.first_char(string))) {
            string = Sequences.cconcatenate((SubLObject)folification.$str338$tptp_, string);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 97967L)
    public static SubLObject tptp_upcase_stringify(final SubLObject string) {
        return list_utilities.delete_if_not((SubLObject)folification.$sym337$TPTP_NON_NUMERIC_ATOM_CHAR_P, Strings.string_upcase(string, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98173L)
    public static SubLObject tptp_number_stringify(final SubLObject string) {
        return list_utilities.delete_if_not((SubLObject)folification.$sym339$TPTP_NUMERIC_ATOM_CHAR_P, string, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98344L)
    public static SubLObject tptp_string_char_p(final SubLObject character) {
        if (!Characters.CHAR_quotation.eql(character) && !Characters.CHAR_backslash.eql(character) && !Characters.CHAR_newline.eql(character)) {
            final SubLObject code = Characters.char_code(character);
            if (code.numGE((SubLObject)folification.$int340$32) && code.numLE((SubLObject)folification.$int341$126)) {
                return (SubLObject)folification.T;
            }
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98626L)
    public static SubLObject tptp_non_numeric_atom_char_p(final SubLObject character) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != Characters.alphanumericp(character) || Characters.CHAR_underbar.eql(character));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98749L)
    public static SubLObject tptp_numeric_atom_char_p(final SubLObject character) {
        return (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != Characters.alphanumericp(character) || Characters.CHAR_underbar.eql(character) || Characters.CHAR_period.eql(character));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    public static SubLObject fol_sentences_to_alchemy_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fol_sentences_data = fol_sentences_analysis_data(fol_sentences_analysis);
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        final SubLObject include_commentsP = conses_high.getf(v_properties, (SubLObject)folification.$kw48$INCLUDE_COMMENTS_, (SubLObject)folification.T);
        if (folification.NIL != include_commentsP) {
            fol_header_to_alchemy_stream(fol_sentences_analysis, stream);
        }
        final SubLObject _prev_bind_0 = folification.$include_alchemy_commentsP$.currentBinding(thread);
        try {
            folification.$include_alchemy_commentsP$.bind(include_commentsP, thread);
            SubLObject cdolist_list_var = fol_sentences_data;
            SubLObject datum = (SubLObject)folification.NIL;
            datum = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                fol_datum_to_alchemy_stream(datum, stream);
                cdolist_list_var = cdolist_list_var.rest();
                datum = cdolist_list_var.first();
            }
        }
        finally {
            folification.$include_alchemy_commentsP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    public static SubLObject fol_header_to_alchemy_stream(final SubLObject fol_sentences_analysis, final SubLObject stream) {
        final SubLObject v_properties = fol_sentences_analysis_generation_properties(fol_sentences_analysis);
        final SubLObject header = fol_generate_alchemy_header(v_properties);
        print_high.princ(header, stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    public static SubLObject fol_datum_to_alchemy_stream(final SubLObject datum, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)folification.NIL;
        SubLObject fol_sentences = (SubLObject)folification.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(datum, datum, (SubLObject)folification.$list76);
        v_term = datum.first();
        SubLObject current = datum.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)folification.$list76);
        fol_sentences = current.first();
        current = current.rest();
        final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : folification.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)folification.$list76);
        current = current.rest();
        if (folification.NIL == current) {
            if (folification.NIL != fol_sentences && folification.NIL != folification.$include_alchemy_commentsP$.getDynamicValue(thread)) {
                streams_high.terpri(stream);
                output_alchemy_term_comment(v_term, stream);
            }
            SubLObject hardP = (SubLObject)SubLObjectFactory.makeBoolean(folification.NIL != folification.$alchemy_output_monotonic_rule_indicator$.getDynamicValue(thread) && folification.NIL != assertion_handles.assertion_p(v_term) && folification.$kw342$MONOTONIC == assertions_high.assertion_strength(v_term));
            SubLObject cdolist_list_var = fol_sentences;
            SubLObject focycl = (SubLObject)folification.NIL;
            focycl = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                if (folification.NIL == alchemy_export.alchemy_skip_fol_sentenceP(focycl)) {
                    if (cycl_utilities.formula_arg0(focycl).eql(folification.$const164$equiv)) {
                        hardP = (SubLObject)folification.T;
                    }
                    alchemy_export.alchemy_export_sentence(focycl, stream, (SubLObject)folification.T, hardP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                focycl = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)folification.$list76);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    public static SubLObject output_alchemy_term_comment(final SubLObject v_term, final SubLObject stream) {
        streams_high.terpri(stream);
        if (folification.NIL != assertion_handles.assertion_p(v_term)) {
            SubLObject assertion_string = (SubLObject)folification.NIL;
            assertion_string = string_utilities.string_substitute((SubLObject)folification.$str343$_, string_utilities.$new_line_string$.getGlobalValue(), PrintLow.format((SubLObject)folification.NIL, (SubLObject)folification.$str344$_A, uncanonicalizer.assertion_el_formula(v_term)), (SubLObject)folification.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)folification.$str345$___Cyc_Assertion__a, assertion_string);
        }
        else if (folification.NIL != nart_handles.nart_p(v_term)) {
            PrintLow.format(stream, (SubLObject)folification.$str346$___Cyc_NART__a, cycl_utilities.hl_to_el(v_term));
        }
        else if (folification.NIL != constant_handles.constant_p(v_term)) {
            PrintLow.format(stream, (SubLObject)folification.$str347$___Cyc_Constant___a_, constants_high.constant_internal_id(v_term));
        }
        else if (folification.NIL != el_utilities.possibly_cycl_sentence_p(v_term)) {
            final SubLObject representation = string_utilities.string_substitute((SubLObject)folification.$str343$_, string_utilities.$new_line_string$.getGlobalValue(), PrintLow.format((SubLObject)folification.NIL, (SubLObject)folification.$str344$_A, v_term), (SubLObject)folification.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)folification.$str348$___CycL_Sentence___a_, representation);
        }
        else {
            Errors.error((SubLObject)folification.$str259$Unexpected_object__s, v_term);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 98953L)
    public static SubLObject fol_generate_alchemy_header(final SubLObject v_properties) {
        return (SubLObject)folification.$str271$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 101785L)
    public static SubLObject focycl_to_cycl(final SubLObject focycl) {
        if (folification.NIL != fol_function_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != fol_predicate_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != fol_atomic_term_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != fol_string_constant_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != fol_string_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != fol_number_constant_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != fol_number_p(focycl)) {
            return cycl_utilities.formula_arg1(focycl, (SubLObject)folification.UNPROVIDED);
        }
        if (folification.NIL != cycl_grammar.el_variable_p(focycl)) {
            return focycl;
        }
        if (folification.NIL != fort_types_interface.sentential_relation_p(focycl)) {
            return focycl;
        }
        if (folification.NIL != el_utilities.el_formula_p(focycl)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)folification.$sym349$FOCYCL_TO_CYCL), focycl);
        }
        return Errors.error((SubLObject)folification.$str316$unexpected_FOL_term__s, focycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 102712L)
    public static SubLObject generate_symbol_index_file_from_kb(final SubLObject filename, SubLObject v_properties) {
        if (v_properties == folification.UNPROVIDED) {
            v_properties = (SubLObject)folification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_index = (SubLObject)folification.ZERO_INTEGER;
        final SubLObject predicate_set = set.new_set(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
        final SubLObject function_set = set.new_set(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
        final SubLObject term_set = set.new_set(Symbols.symbol_function((SubLObject)folification.EQ), (SubLObject)folification.UNPROVIDED);
        SubLObject term_count = (SubLObject)folification.NIL;
        SubLObject sentence_count = (SubLObject)folification.NIL;
        SubLObject stream = (SubLObject)folification.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)folification.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)folification.$kw52$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename);
            }
            final SubLObject stream_$67 = stream;
            final SubLObject current;
            final SubLObject datum = current = v_properties;
            final SubLObject mt_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw37$MT_HANDLING, current);
            final SubLObject mt_handling = (SubLObject)((folification.NIL != mt_handling_tail) ? conses_high.cadr(mt_handling_tail) : folification.NIL);
            final SubLObject mt_ceiling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw38$MT_CEILING, current);
            final SubLObject mt_ceiling = (SubLObject)((folification.NIL != mt_ceiling_tail) ? conses_high.cadr(mt_ceiling_tail) : folification.NIL);
            final SubLObject isa_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw39$ISA_HANDLING, current);
            final SubLObject isa_handling = (SubLObject)((folification.NIL != isa_handling_tail) ? conses_high.cadr(isa_handling_tail) : folification.NIL);
            final SubLObject rule_macro_predicate_handling_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw40$RULE_MACRO_PREDICATE_HANDLING, current);
            final SubLObject rule_macro_predicate_handling = (SubLObject)((folification.NIL != rule_macro_predicate_handling_tail) ? conses_high.cadr(rule_macro_predicate_handling_tail) : folification.NIL);
            final SubLObject include_horn_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw350$INCLUDE_HORN, current);
            final SubLObject include_horn = (SubLObject)((folification.NIL != include_horn_tail) ? conses_high.cadr(include_horn_tail) : folification.T);
            final SubLObject term_types_tail = cdestructuring_bind.property_list_member((SubLObject)folification.$kw351$TERM_TYPES, current);
            final SubLObject term_types = (SubLObject)((folification.NIL != term_types_tail) ? conses_high.cadr(term_types_tail) : folification.$kw352$ALL);
            final SubLObject _prev_bind_2 = folification.$fol_mt_handling$.currentBinding(thread);
            final SubLObject _prev_bind_3 = folification.$fol_isa_handling$.currentBinding(thread);
            final SubLObject _prev_bind_4 = folification.$fol_rmp_handling$.currentBinding(thread);
            try {
                folification.$fol_mt_handling$.bind(mt_handling, thread);
                folification.$fol_isa_handling$.bind(isa_handling, thread);
                folification.$fol_rmp_handling$.bind(rule_macro_predicate_handling, thread);
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)folification.$str54$Converting_assertions_to_FOL;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)folification.ZERO_INTEGER;
                assert folification.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_0_$68 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$69 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$70 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)folification.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)folification.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$71 = idx;
                        if (folification.NIL == id_index.id_index_objects_empty_p(idx_$71, (SubLObject)folification.$kw353$SKIP)) {
                            final SubLObject idx_$72 = idx_$71;
                            if (folification.NIL == id_index.id_index_dense_objects_empty_p(idx_$72, (SubLObject)folification.$kw353$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$72);
                                final SubLObject backwardP_var = (SubLObject)folification.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass;
                                SubLObject cdolist_list_var;
                                SubLObject sentences;
                                SubLObject sentence;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)folification.NIL, v_iteration = (SubLObject)folification.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)folification.ONE_INTEGER)) {
                                    a_id = ((folification.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)folification.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (folification.NIL == id_index.id_index_tombstone_p(a_handle) || folification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP)) {
                                        if (folification.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)folification.$kw353$SKIP;
                                        }
                                        ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (folification.NIL != kb_fol_assertion_under_mt_ceilingP(ass, mt_ceiling)) {
                                            sentences = (cdolist_list_var = assertion_fol_sentences(ass));
                                            sentence = (SubLObject)folification.NIL;
                                            sentence = cdolist_list_var.first();
                                            while (folification.NIL != cdolist_list_var) {
                                                if (folification.NIL != fol_sentence_allowed_by_horn_handling(sentence, include_horn)) {
                                                    sentence_index = Numbers.add(sentence_index, (SubLObject)folification.ONE_INTEGER);
                                                    generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence, term_types, predicate_set, function_set, term_set);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                sentence = cdolist_list_var.first();
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)folification.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$73 = idx_$71;
                            if (folification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$73) || folification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$73);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$73);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$73);
                                final SubLObject v_default = (SubLObject)((folification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP)) ? folification.NIL : folification.$kw353$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (folification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP) || folification.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (folification.NIL != kb_fol_assertion_under_mt_ceilingP(ass2, mt_ceiling)) {
                                            SubLObject cdolist_list_var2;
                                            final SubLObject sentences2 = cdolist_list_var2 = assertion_fol_sentences(ass2);
                                            SubLObject sentence2 = (SubLObject)folification.NIL;
                                            sentence2 = cdolist_list_var2.first();
                                            while (folification.NIL != cdolist_list_var2) {
                                                if (folification.NIL != fol_sentence_allowed_by_horn_handling(sentence2, include_horn)) {
                                                    sentence_index = Numbers.add(sentence_index, (SubLObject)folification.ONE_INTEGER);
                                                    generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence2, term_types, predicate_set, function_set, term_set);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                sentence2 = cdolist_list_var2.first();
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)folification.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)folification.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$70, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$69, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$68, thread);
                }
                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$70 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)folification.$sym62$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(folification.$const63$EverythingPSC, thread);
                    final SubLObject message = (SubLObject)folification.$str64$Converting_forts_to_FOL;
                    final SubLObject total_$77 = forts.fort_count();
                    SubLObject sofar_$78 = (SubLObject)folification.ZERO_INTEGER;
                    final SubLObject _prev_bind_0_$71 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$71 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$71 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)folification.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)folification.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)folification.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(message);
                            SubLObject cdolist_list_var3 = forts.do_forts_tables();
                            SubLObject table_var = (SubLObject)folification.NIL;
                            table_var = cdolist_list_var3.first();
                            while (folification.NIL != cdolist_list_var3) {
                                final SubLObject idx_$74 = table_var;
                                if (folification.NIL == id_index.id_index_objects_empty_p(idx_$74, (SubLObject)folification.$kw353$SKIP)) {
                                    final SubLObject idx_$75 = idx_$74;
                                    if (folification.NIL == id_index.id_index_dense_objects_empty_p(idx_$75, (SubLObject)folification.$kw353$SKIP)) {
                                        final SubLObject vector_var2 = id_index.id_index_dense_objects(idx_$75);
                                        final SubLObject backwardP_var2 = (SubLObject)folification.NIL;
                                        SubLObject length2;
                                        SubLObject v_iteration2;
                                        SubLObject id;
                                        SubLObject fort;
                                        SubLObject allow_equiv_relationP;
                                        SubLObject cdolist_list_var_$84;
                                        SubLObject sentences3;
                                        SubLObject sentence3;
                                        for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)folification.NIL, v_iteration2 = (SubLObject)folification.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)folification.ONE_INTEGER)) {
                                            id = ((folification.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)folification.ONE_INTEGER) : v_iteration2);
                                            fort = Vectors.aref(vector_var2, id);
                                            if (folification.NIL == id_index.id_index_tombstone_p(fort) || folification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP)) {
                                                if (folification.NIL != id_index.id_index_tombstone_p(fort)) {
                                                    fort = (SubLObject)folification.$kw353$SKIP;
                                                }
                                                sofar_$78 = Numbers.add(sofar_$78, (SubLObject)folification.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(sofar_$78, total_$77);
                                                allow_equiv_relationP = conses_high.getf(v_properties, (SubLObject)folification.$kw43$ALLOW_EQUIV_RELATION_, (SubLObject)folification.NIL);
                                                sentences3 = (cdolist_list_var_$84 = kb_fol_additional_sentences_for_term(fort, mt_ceiling, allow_equiv_relationP));
                                                sentence3 = (SubLObject)folification.NIL;
                                                sentence3 = cdolist_list_var_$84.first();
                                                while (folification.NIL != cdolist_list_var_$84) {
                                                    if (folification.NIL != fol_sentence_allowed_by_horn_handling(sentence3, include_horn)) {
                                                        sentence_index = Numbers.add(sentence_index, (SubLObject)folification.ONE_INTEGER);
                                                        generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence3, term_types, predicate_set, function_set, term_set);
                                                    }
                                                    cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                                                    sentence3 = cdolist_list_var_$84.first();
                                                }
                                            }
                                        }
                                    }
                                    final SubLObject idx_$76 = idx_$74;
                                    if (folification.NIL == id_index.id_index_sparse_objects_empty_p(idx_$76) || folification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP)) {
                                        final SubLObject sparse2 = id_index.id_index_sparse_objects(idx_$76);
                                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$76);
                                        final SubLObject end_id2 = id_index.id_index_next_id(idx_$76);
                                        final SubLObject v_default2 = (SubLObject)((folification.NIL != id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP)) ? folification.NIL : folification.$kw353$SKIP);
                                        while (id2.numL(end_id2)) {
                                            final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse2, v_default2);
                                            if (folification.NIL == id_index.id_index_skip_tombstones_p((SubLObject)folification.$kw353$SKIP) || folification.NIL == id_index.id_index_tombstone_p(fort2)) {
                                                sofar_$78 = Numbers.add(sofar_$78, (SubLObject)folification.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(sofar_$78, total_$77);
                                                final SubLObject allow_equiv_relationP2 = conses_high.getf(v_properties, (SubLObject)folification.$kw43$ALLOW_EQUIV_RELATION_, (SubLObject)folification.NIL);
                                                SubLObject cdolist_list_var_$85;
                                                final SubLObject sentences4 = cdolist_list_var_$85 = kb_fol_additional_sentences_for_term(fort2, mt_ceiling, allow_equiv_relationP2);
                                                SubLObject sentence4 = (SubLObject)folification.NIL;
                                                sentence4 = cdolist_list_var_$85.first();
                                                while (folification.NIL != cdolist_list_var_$85) {
                                                    if (folification.NIL != fol_sentence_allowed_by_horn_handling(sentence4, include_horn)) {
                                                        sentence_index = Numbers.add(sentence_index, (SubLObject)folification.ONE_INTEGER);
                                                        generate_symbol_index_file_from_kb_int(stream_$67, sentence_index, sentence4, term_types, predicate_set, function_set, term_set);
                                                    }
                                                    cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                                                    sentence4 = cdolist_list_var_$85.first();
                                                }
                                            }
                                            id2 = Numbers.add(id2, (SubLObject)folification.ONE_INTEGER);
                                        }
                                    }
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                table_var = cdolist_list_var3.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_6, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$71, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$71, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$71, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$70, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$70, thread);
                }
            }
            finally {
                folification.$fol_rmp_handling$.rebind(_prev_bind_4, thread);
                folification.$fol_isa_handling$.rebind(_prev_bind_3, thread);
                folification.$fol_mt_handling$.rebind(_prev_bind_2, thread);
            }
            sentence_count = sentence_index;
            term_count = Numbers.add(set.set_size(predicate_set), set.set_size(function_set), set.set_size(term_set));
        }
        finally {
            final SubLObject _prev_bind_7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)folification.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)folification.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
            }
        }
        return Values.values(term_count, sentence_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 104952L)
    public static SubLObject fol_sentence_allowed_by_horn_handling(final SubLObject sentence, final SubLObject include_horn) {
        if (folification.NIL != include_horn) {
            return (SubLObject)folification.T;
        }
        if (folification.NIL != el_utilities.el_disjunction_p(sentence)) {
            return (SubLObject)folification.T;
        }
        if (folification.NIL != el_utilities.el_implication_p(sentence) && folification.NIL != el_utilities.el_disjunction_p(cycl_utilities.sentence_arg2(sentence, (SubLObject)folification.UNPROVIDED))) {
            return (SubLObject)folification.T;
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 105290L)
    public static SubLObject generate_symbol_index_file_from_kb_int(final SubLObject stream, final SubLObject sentence_index, final SubLObject sentence, final SubLObject term_types, final SubLObject predicate_set, final SubLObject function_set, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject predicates = categorize_fol_terms(sentence);
        final SubLObject functions = thread.secondMultipleValue();
        final SubLObject terms = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (term_types == folification.$kw352$ALL || folification.NIL != list_utilities.member_eqP((SubLObject)folification.$kw186$PREDICATE, term_types)) {
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = (SubLObject)folification.NIL;
            predicate = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                set.set_add(predicate, predicate_set);
                PrintLow.format(stream, (SubLObject)folification.$str354$_S_, sentence_index);
                print_symbol_index_term_string(stream, predicate, (SubLObject)folification.$kw186$PREDICATE);
                streams_high.terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            }
        }
        if (term_types == folification.$kw352$ALL || folification.NIL != list_utilities.member_eqP((SubLObject)folification.$kw355$FUNCTION, term_types)) {
            SubLObject cdolist_list_var = functions;
            SubLObject function = (SubLObject)folification.NIL;
            function = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                set.set_add(function, function_set);
                PrintLow.format(stream, (SubLObject)folification.$str354$_S_, sentence_index);
                print_symbol_index_term_string(stream, function, (SubLObject)folification.$kw355$FUNCTION);
                streams_high.terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                function = cdolist_list_var.first();
            }
        }
        if (term_types == folification.$kw352$ALL || folification.NIL != list_utilities.member_eqP((SubLObject)folification.$kw356$TERM, term_types)) {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = (SubLObject)folification.NIL;
            v_term = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                set.set_add(v_term, term_set);
                PrintLow.format(stream, (SubLObject)folification.$str354$_S_, sentence_index);
                print_symbol_index_term_string(stream, v_term, (SubLObject)folification.$kw356$TERM);
                streams_high.terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 106460L)
    public static SubLObject categorize_fol_terms(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicates = (SubLObject)folification.NIL;
        SubLObject functions = (SubLObject)folification.NIL;
        SubLObject terms = (SubLObject)folification.NIL;
        final SubLObject _prev_bind_0 = folification.$categorize_fol_predicates$.currentBinding(thread);
        final SubLObject _prev_bind_2 = folification.$categorize_fol_functions$.currentBinding(thread);
        final SubLObject _prev_bind_3 = folification.$categorize_fol_terms$.currentBinding(thread);
        try {
            folification.$categorize_fol_predicates$.bind((SubLObject)folification.NIL, thread);
            folification.$categorize_fol_functions$.bind((SubLObject)folification.NIL, thread);
            folification.$categorize_fol_terms$.bind((SubLObject)folification.NIL, thread);
            cycl_utilities.expression_map((SubLObject)folification.$sym357$CATEGORIZE_FOL_TERMS_INT, sentence, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
            predicates = Sequences.nreverse(folification.$categorize_fol_predicates$.getDynamicValue(thread));
            functions = Sequences.nreverse(folification.$categorize_fol_functions$.getDynamicValue(thread));
            terms = Sequences.nreverse(folification.$categorize_fol_terms$.getDynamicValue(thread));
        }
        finally {
            folification.$categorize_fol_terms$.rebind(_prev_bind_3, thread);
            folification.$categorize_fol_functions$.rebind(_prev_bind_2, thread);
            folification.$categorize_fol_predicates$.rebind(_prev_bind_0, thread);
        }
        return Values.values(predicates, functions, terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 106942L)
    public static SubLObject categorize_fol_terms_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isCons()) {
            final SubLObject pcase_var = v_object.first();
            if (pcase_var.eql(folification.$const167$FOL_PredicateFn)) {
                final SubLObject item_var = conses_high.second(v_object);
                if (folification.NIL == conses_high.member(item_var, folification.$categorize_fol_predicates$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)folification.EQ), Symbols.symbol_function((SubLObject)folification.IDENTITY))) {
                    folification.$categorize_fol_predicates$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, folification.$categorize_fol_predicates$.getDynamicValue(thread)), thread);
                }
            }
            else if (pcase_var.eql(folification.$const237$FOL_FunctionFn)) {
                final SubLObject item_var = conses_high.second(v_object);
                if (folification.NIL == conses_high.member(item_var, folification.$categorize_fol_functions$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)folification.EQ), Symbols.symbol_function((SubLObject)folification.IDENTITY))) {
                    folification.$categorize_fol_functions$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, folification.$categorize_fol_functions$.getDynamicValue(thread)), thread);
                }
            }
            else if (pcase_var.eql(folification.$const235$FOL_AtomicTermFn)) {
                final SubLObject item_var = conses_high.second(v_object);
                if (folification.NIL == conses_high.member(item_var, folification.$categorize_fol_terms$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)folification.EQ), Symbols.symbol_function((SubLObject)folification.IDENTITY))) {
                    folification.$categorize_fol_terms$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, folification.$categorize_fol_terms$.getDynamicValue(thread)), thread);
                }
            }
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107317L)
    public static SubLObject print_symbol_index_term_string(final SubLObject stream, final SubLObject v_term, final SubLObject v_class) {
        if (folification.NIL != constant_handles.constant_p(v_term)) {
            print_high.princ(fol_constant_string(v_term), stream);
        }
        else if (folification.NIL != nart_handles.nart_p(v_term)) {
            print_high.princ(fol_nart_string(v_term), stream);
        }
        else {
            Errors.error((SubLObject)folification.$str358$time_to_handle_non_forts);
        }
        if (v_class.eql((SubLObject)folification.$kw186$PREDICATE)) {
            print_high.princ((SubLObject)folification.$str359$_P, stream);
        }
        else if (v_class.eql((SubLObject)folification.$kw355$FUNCTION)) {
            print_high.princ((SubLObject)folification.$str360$_F, stream);
        }
        else if (v_class.eql((SubLObject)folification.$kw356$TERM)) {
            print_high.princ((SubLObject)folification.$str361$_T, stream);
        }
        else {
            Errors.error((SubLObject)folification.$str362$time_to_handle__S, v_class);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107766L)
    public static SubLObject fol_constant_string(final SubLObject constant) {
        return constants_high.constant_name(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107848L)
    public static SubLObject clear_fol_nart_string() {
        final SubLObject cs = folification.$fol_nart_string_caching_state$.getGlobalValue();
        if (folification.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107848L)
    public static SubLObject remove_fol_nart_string(final SubLObject nart) {
        return memoization_state.caching_state_remove_function_results_with_args(folification.$fol_nart_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nart), (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107848L)
    public static SubLObject fol_nart_string_internal(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)folification.NIL;
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)folification.$sym330$DOUBLE_FLOAT, thread);
            string = cb_utilities.cb_fort_display_string(nart);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        string = list_utilities.nsubstitute_if_not((SubLObject)Characters.CHAR_underbar, Symbols.symbol_function((SubLObject)folification.$sym364$VALID_CONSTANT_NAME_CHAR_P), string, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED, (SubLObject)folification.UNPROVIDED);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 107848L)
    public static SubLObject fol_nart_string(final SubLObject nart) {
        SubLObject caching_state = folification.$fol_nart_string_caching_state$.getGlobalValue();
        if (folification.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)folification.$sym363$FOL_NART_STRING, (SubLObject)folification.$sym365$_FOL_NART_STRING_CACHING_STATE_, (SubLObject)folification.NIL, (SubLObject)folification.EQ, (SubLObject)folification.ONE_INTEGER, (SubLObject)folification.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(fol_nart_string_internal(nart)));
            memoization_state.caching_state_put(caching_state, nart, results, (SubLObject)folification.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 108657L)
    public static SubLObject write_deepak_opencyc_queries(final SubLObject filename, final SubLObject fol_sentences_analysis) {
        final SubLObject opencyc = arete.load_arete_experiment((SubLObject)folification.$str367$opencyc_all_20050422_non_conditio);
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(opencyc);
        final SubLObject queries = kbq_query_run.kbq_query_set_run_queries(answerable);
        SubLObject stream = (SubLObject)folification.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)folification.$kw52$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)folification.$str53$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject cdolist_list_var = queries;
            SubLObject query_spec = (SubLObject)folification.NIL;
            query_spec = cdolist_list_var.first();
            while (folification.NIL != cdolist_list_var) {
                kbq_fol_sentence_to_stream(query_spec, fol_sentences_analysis, (SubLObject)folification.$kw28$TPTP, folification.$deepak_folification_properties$.getGlobalValue(), s);
                cdolist_list_var = cdolist_list_var.rest();
                query_spec = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)folification.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)folification.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Sequences.length(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 109138L)
    public static SubLObject deepak_kb_fol_sentences(SubLObject sample_rate) {
        if (sample_rate == folification.UNPROVIDED) {
            sample_rate = (SubLObject)folification.ONE_INTEGER;
        }
        final SubLObject folification_properties = conses_high.putf(conses_high.copy_list(folification.$deepak_folification_properties$.getGlobalValue()), (SubLObject)folification.$kw44$SAMPLE_RATE, sample_rate);
        final SubLObject plist = kb_fol_sentences(folification_properties);
        print_folification_summary(plist, (SubLObject)folification.T);
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 109434L)
    public static SubLObject deepak_fol_query_to_tptp_stream(final SubLObject cycl_query, final SubLObject mt, final SubLObject fol_sentences_analysis, SubLObject stream) {
        if (stream == folification.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject fol_query = query_fol_sentence(cycl_query, mt, folification.$deepak_folification_properties$.getGlobalValue());
        fol_query_to_stream(fol_query, fol_sentences_analysis, (SubLObject)folification.$kw28$TPTP, stream);
        return (SubLObject)folification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 109737L)
    public static SubLObject deepak_assertion_fol_sentences(final SubLObject assertion_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)folification.NIL;
        final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
        print_high.print(assertion, (SubLObject)folification.UNPROVIDED);
        final SubLObject _prev_bind_0 = folification.$fol_mt_handling$.currentBinding(thread);
        try {
            folification.$fol_mt_handling$.bind((SubLObject)folification.$kw81$MT_ARGUMENT, thread);
            result = assertion_fol_sentences(assertion);
        }
        finally {
            folification.$fol_mt_handling$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 115694L)
    public static SubLObject deepak_queries_timing_test() {
        return deepak_queries_timing_test_int(folification.$deepak_queries$.getGlobalValue(), (SubLObject)folification.NIL, (SubLObject)folification.NIL, (SubLObject)folification.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 115810L)
    public static SubLObject deepak_queries_timing_test_2(SubLObject max_time, SubLObject verboseP, SubLObject forget_ephemeral_termsP) {
        if (max_time == folification.UNPROVIDED) {
            max_time = (SubLObject)folification.$int370$60;
        }
        if (verboseP == folification.UNPROVIDED) {
            verboseP = (SubLObject)folification.T;
        }
        if (forget_ephemeral_termsP == folification.UNPROVIDED) {
            forget_ephemeral_termsP = (SubLObject)folification.T;
        }
        return deepak_queries_timing_test_int(folification.$deepak_queries_2$.getGlobalValue(), max_time, verboseP, forget_ephemeral_termsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/folification.lisp", position = 116103L)
    public static SubLObject deepak_queries_timing_test_int(final SubLObject queries, final SubLObject max_time, final SubLObject verboseP, final SubLObject forget_ephemeral_termsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject times = (SubLObject)folification.NIL;
        if (folification.NIL != forget_ephemeral_termsP) {
            kb_cleanup.forget_ephemeral_terms((SubLObject)folification.UNPROVIDED);
        }
        SubLObject cdolist_list_var = queries;
        SubLObject query = (SubLObject)folification.NIL;
        query = cdolist_list_var.first();
        while (folification.NIL != cdolist_list_var) {
            final SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(el_utilities.designated_sentence(query));
            SubLObject time = (SubLObject)folification.NIL;
            SubLObject result = (SubLObject)folification.NIL;
            SubLObject halt_reason = (SubLObject)folification.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            thread.resetMultipleValues();
            final SubLObject result_$88 = inference_kernel.new_cyc_query(query, (SubLObject)folification.NIL, (SubLObject)ConsesLow.listS((SubLObject)folification.$kw88$CONDITIONAL_SENTENCE_, conditional_sentenceP, (SubLObject)folification.$kw371$MAX_TIME, max_time, (SubLObject)folification.$list372));
            final SubLObject halt_reason_$89 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$88;
            halt_reason = halt_reason_$89;
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (folification.NIL == result) {
                time = (SubLObject)folification.$kw373$FAILURE;
            }
            if (folification.NIL != verboseP) {
                PrintLow.format((SubLObject)folification.T, (SubLObject)folification.$str374$_S___s___s____, new SubLObject[] { query, halt_reason, time });
                streams_high.force_output((SubLObject)folification.UNPROVIDED);
            }
            times = (SubLObject)ConsesLow.cons(time, times);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return Sequences.nreverse(times);
    }
    
    public static SubLObject declare_folification_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_translation_type_property_p", "FOL-TRANSLATION-TYPE-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_mt_handling_property_p", "FOL-MT-HANDLING-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_isa_handling_property_p", "FOL-ISA-HANDLING-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_rmp_handling_property_p", "FOL-RMP-HANDLING-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_string_handling_property_p", "FOL-STRING-HANDLING-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_number_handling_property_p", "FOL-NUMBER-HANDLING-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_output_format_p", "FOL-OUTPUT-FORMAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "new_fol_sentences_analysis", "NEW-FOL-SENTENCES-ANALYSIS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_analysis_data", "FOL-SENTENCES-ANALYSIS-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_analysis_generation_properties", "FOL-SENTENCES-ANALYSIS-GENERATION-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_analysis_rejection_statistics", "FOL-SENTENCES-ANALYSIS-REJECTION-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "folify_kb", "FOLIFY-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_sentences", "KB-FOL-SENTENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "cycl_assertions_to_fol", "CYCL-ASSERTIONS-TO-FOL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "cycl_sentences_to_fol", "CYCL-SENTENCES-TO-FOL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences", "FOL-SENTENCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "assertions_fol_sentences_data", "ASSERTIONS-FOL-SENTENCES-DATA", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "sentences_fol_sentences_data", "SENTENCES-FOL-SENTENCES-DATA", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "forts_fol_sentences_data", "FORTS-FOL-SENTENCES-DATA", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "load_fol_sentences_analysis", "LOAD-FOL-SENTENCES-ANALYSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_input_item_type", "FOL-SENTENCES-INPUT-ITEM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_analysis_nmerge_fol_sentences_data", "FOL-SENTENCES-ANALYSIS-NMERGE-FOL-SENTENCES-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_to_file", "FOL-SENTENCES-TO-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_to_stream", "FOL-SENTENCES-TO-STREAM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_symbol_count", "FOL-SENTENCES-SYMBOL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "query_fol_sentence", "QUERY-FOL-SENTENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_query_to_stream", "FOL-QUERY-TO-STREAM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kbq_fol_sentence", "KBQ-FOL-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kbq_fol_sentence_to_stream", "KBQ-FOL-SENTENCE-TO-STREAM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "assertion_fol_sentences_to_stream", "ASSERTION-FOL-SENTENCES-TO-STREAM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_and_postprocess_fol_sentences_datum", "MAKE-AND-POSTPROCESS-FOL-SENTENCES-DATUM", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_fol_sentences_datum", "MAKE-FOL-SENTENCES-DATUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "postprocess_fol_sentences_datum", "POSTPROCESS-FOL-SENTENCES-DATUM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "postprocess_fol_sentences_datum_output", "POSTPROCESS-FOL-SENTENCES-DATUM-OUTPUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "postprocess_fol_sentences_datum_analysis", "POSTPROCESS-FOL-SENTENCES-DATUM-ANALYSIS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "possibly_save_fol_sentences_analysis", "POSSIBLY-SAVE-FOL-SENTENCES-ANALYSIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "update_fol_analysis_counts", "UPDATE-FOL-ANALYSIS-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "check_folification_properties", "CHECK-FOLIFICATION-PROPERTIES", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_assertion_under_mt_ceilingP", "KB-FOL-ASSERTION-UNDER-MT-CEILING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_under_mt_ceilingP", "KB-FOL-UNDER-MT-CEILING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "assertion_fol_sentences", "ASSERTION-FOL-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "assertion_fol_sentences_int", "ASSERTION-FOL-SENTENCES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "sentence_fol_sentences", "SENTENCE-FOL-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_expand_sentence", "FOL-EXPAND-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_expandible_expressionP", "FOL-EXPANDIBLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_expandible_rmpP", "FOL-EXPANDIBLE-RMP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_expand_one_step", "FOL-EXPAND-ONE-STEP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "cnf_clausal_form_for_fol", "CNF-CLAUSAL-FORM-FOR-FOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "cnf_fol_sentences", "CNF-FOL-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "partition_fol_unhandled_sentences", "PARTITION-FOL-UNHANDLED-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_datum_update_rejection_statistics", "FOL-SENTENCES-DATUM-UPDATE-REJECTION-STATISTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "update_fol_rejection_statistics_for_expression", "UPDATE-FOL-REJECTION-STATISTICS-FOR-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "print_folification_summary", "PRINT-FOLIFICATION-SUMMARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "print_fol_rejection_statistics", "PRINT-FOL-REJECTION-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "pretty_print_fol_rejection_statistics", "PRETTY-PRINT-FOL-REJECTION-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_unhandled_explanation", "FOL-UNHANDLED-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_unhandled_expression_p", "FOL-UNHANDLED-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "contains_fol_unhandled_expression_p", "CONTAINS-FOL-UNHANDLED-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_unhandled", "FOL-UNHANDLED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "additional_gaf_fol_sentences", "ADDITIONAL-GAF-FOL-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "additional_arg_isa_or_arg_genl_sentences", "ADDITIONAL-ARG-ISA-OR-ARG-GENL-SENTENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "additional_result_isa_or_result_genl_sentences", "ADDITIONAL-RESULT-ISA-OR-RESULT-GENL-SENTENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "nonstandard_sentential_relation_p", "NONSTANDARD-SENTENTIAL-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "clear_fol_sequence_variable_args_for_arity", "CLEAR-FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "remove_fol_sequence_variable_args_for_arity", "REMOVE-FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sequence_variable_args_for_arity_internal", "FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sequence_variable_args_for_arity", "FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_additional_sentences_for_term", "KB-FOL-ADDITIONAL-SENTENCES-FOR-TERM", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.folification", "do_arg_isa_gafs", "DO-ARG-ISA-GAFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_predicate_arg_type_sentences", "KB-FOL-PREDICATE-ARG-TYPE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_transitive_binary_predicate_sentences", "KB-FOL-TRANSITIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_symmetric_binary_predicate_sentences", "KB-FOL-SYMMETRIC-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_asymmetric_binary_predicate_sentences", "KB-FOL-ASYMMETRIC-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_reflexive_binary_predicate_sentences", "KB-FOL-REFLEXIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_irreflexive_binary_predicate_sentences", "KB-FOL-IRREFLEXIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_tva_sentences", "KB-FOL-TVA-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_tva_sentences_int", "KB-FOL-TVA-SENTENCES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_tva_pred_neg_lit", "KB-FOL-TVA-PRED-NEG-LIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_tva_pred_pos_lit", "KB-FOL-TVA-PRED-POS-LIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "replace_argnum_variable_formula", "REPLACE-ARGNUM-VARIABLE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "argnum_variable_formula", "ARGNUM-VARIABLE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_nat_function_sentences", "KB-FOL-NAT-FUNCTION-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_nat_argument_sentences", "KB-FOL-NAT-ARGUMENT-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "kb_fol_result_isa_sentences", "KB-FOL-RESULT-ISA-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "asent_sentence", "ASENT-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "asent_fol_sentence", "ASENT-FOL-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "genlmt_asent_fol_sentence", "GENLMT-ASENT-FOL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "different_asent_fol_sentence", "DIFFERENT-ASENT-FOL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "generic_asent_fol_sentence", "GENERIC-ASENT-FOL-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "isa_asent_fol_sentence", "ISA-ASENT-FOL-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "isa_asent_fol_sentence_as_isa", "ISA-ASENT-FOL-SENTENCE-AS-ISA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "isa_asent_fol_sentence_as_unary_predicate", "ISA-ASENT-FOL-SENTENCE-AS-UNARY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_transform_args", "FOL-TRANSFORM-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_transform_arg", "FOL-TRANSFORM-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_transform_microtheory", "FOL-TRANSFORM-MICROTHEORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "asent_set_sentence", "ASENT-SET-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "genlmt_asent_set_sentence", "GENLMT-ASENT-SET-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "generic_asent_set_sentence", "GENERIC-ASENT-SET-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "isa_asent_set_sentence", "ISA-ASENT-SET-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "different_asent_set_sentence", "DIFFERENT-ASENT-SET-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "set_transform_args", "SET-TRANSFORM-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "set_transform_function", "SET-TRANSFORM-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "set_transform_arg", "SET-TRANSFORM-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "set_transform_microtheory", "SET-TRANSFORM-MICROTHEORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "set_transform_predicate", "SET-TRANSFORM-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_transform_predicate", "FOL-TRANSFORM-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_transform_col_as_predicate", "FOL-TRANSFORM-COL-AS-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_transform_function", "FOL-TRANSFORM-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_term_p", "FOL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_represented_term_p", "FOL-REPRESENTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_unrepresented_term_p", "FOL-UNREPRESENTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_fol_atomic_term", "MAKE-FOL-ATOMIC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_atomic_term_p", "FOL-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_fol_predicate", "MAKE-FOL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_predicate_p", "FOL-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_fol_function", "MAKE-FOL-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_function_p", "FOL-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_function_arity", "FOL-FUNCTION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_fol_string", "MAKE-FOL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_string_p", "FOL-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_string_constant_p", "FOL-STRING-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_fol_number", "MAKE-FOL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_number_p", "FOL-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_number_constant_p", "FOL-NUMBER-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_cafP", "FOL-CAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_atomic_sentenceP", "FOL-ATOMIC-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_closedP", "FOL-CLOSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_data_mentioning_term", "FOL-SENTENCES-DATA-MENTIONING-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "all_fol_predicates_and_arguments_mentioned_in_analysis", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "all_fol_predicates_and_arguments_mentioned_in_analysis_data", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSIS-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "all_fol_predicates_and_arguments_mentioned_in_fol_datum", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOL-DATUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "all_fol_predicates_and_arguments_mentioned_in_fol_sentences", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOL-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "all_fol_predicates_and_arguments_mentioned_in_focycl_sentence", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOCYCL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_header_to_stream", "FOL-HEADER-TO-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_datum_to_stream", "FOL-DATUM-TO-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_to_cycl_stream", "FOL-SENTENCES-TO-CYCL-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_header_to_cycl_stream", "FOL-HEADER-TO-CYCL-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_datum_to_cycl_stream", "FOL-DATUM-TO-CYCL-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_query_to_cycl_stream", "FOL-QUERY-TO-CYCL-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "assertions_to_tptp_stream", "ASSERTIONS-TO-TPTP-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_to_tptp_stream", "FOL-SENTENCES-TO-TPTP-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_header_to_tptp_stream", "FOL-HEADER-TO-TPTP-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_datum_to_tptp_stream", "FOL-DATUM-TO-TPTP-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_term_comment", "OUTPUT-TPTP-TERM-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_query_to_tptp_stream", "FOL-QUERY-TO-TPTP-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_generate_tptp_header", "FOL-GENERATE-TPTP-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_tptp_header_add_field", "FOL-TPTP-HEADER-ADD-FIELD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_tptp_header_add_blankline", "FOL-TPTP-HEADER-ADD-BLANKLINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_properties_for_header", "TPTP-PROPERTIES-FOR-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_property_appropriate_for_printingP", "TPTP-PROPERTY-APPROPRIATE-FOR-PRINTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "clear_compute_tptp_query_index_number", "CLEAR-COMPUTE-TPTP-QUERY-INDEX-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "remove_compute_tptp_query_index_number", "REMOVE-COMPUTE-TPTP-QUERY-INDEX-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "compute_tptp_query_index_number_internal", "COMPUTE-TPTP-QUERY-INDEX-NUMBER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "compute_tptp_query_index_number", "COMPUTE-TPTP-QUERY-INDEX-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_focycl_as_tptp", "OUTPUT-FOCYCL-AS-TPTP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_fol_query_as_tptp", "OUTPUT-FOL-QUERY-AS-TPTP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_axiom", "OUTPUT-TPTP-AXIOM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_axiom_id", "TPTP-AXIOM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_query", "OUTPUT-TPTP-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_sentence_recursive", "OUTPUT-TPTP-SENTENCE-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_arg", "OUTPUT-TPTP-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_nat", "OUTPUT-TPTP-NAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_predicate", "OUTPUT-TPTP-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_function", "OUTPUT-TPTP-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_zero_arity_function", "OUTPUT-TPTP-ZERO-ARITY-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_atomic_term", "OUTPUT-TPTP-ATOMIC-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_string_constant", "OUTPUT-TPTP-STRING-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_string", "OUTPUT-TPTP-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_number_constant", "OUTPUT-TPTP-NUMBER-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_number", "OUTPUT-TPTP-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_tptp_variable", "OUTPUT-TPTP-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_tptp_el_var_name", "FOL-TPTP-EL-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_string_stringify", "TPTP-STRING-STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "clear_tptp_long_symbol_name_cache", "CLEAR-TPTP-LONG-SYMBOL-NAME-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "make_tptp_symbol_name", "MAKE-TPTP-SYMBOL-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_downcase_stringify", "TPTP-DOWNCASE-STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_upcase_stringify", "TPTP-UPCASE-STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_number_stringify", "TPTP-NUMBER-STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_string_char_p", "TPTP-STRING-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_non_numeric_atom_char_p", "TPTP-NON-NUMERIC-ATOM-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "tptp_numeric_atom_char_p", "TPTP-NUMERIC-ATOM-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentences_to_alchemy_stream", "FOL-SENTENCES-TO-ALCHEMY-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_header_to_alchemy_stream", "FOL-HEADER-TO-ALCHEMY-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_datum_to_alchemy_stream", "FOL-DATUM-TO-ALCHEMY-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "output_alchemy_term_comment", "OUTPUT-ALCHEMY-TERM-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_generate_alchemy_header", "FOL-GENERATE-ALCHEMY-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "focycl_to_cycl", "FOCYCL-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "generate_symbol_index_file_from_kb", "GENERATE-SYMBOL-INDEX-FILE-FROM-KB", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_sentence_allowed_by_horn_handling", "FOL-SENTENCE-ALLOWED-BY-HORN-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "generate_symbol_index_file_from_kb_int", "GENERATE-SYMBOL-INDEX-FILE-FROM-KB-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "categorize_fol_terms", "CATEGORIZE-FOL-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "categorize_fol_terms_int", "CATEGORIZE-FOL-TERMS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "print_symbol_index_term_string", "PRINT-SYMBOL-INDEX-TERM-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_constant_string", "FOL-CONSTANT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "clear_fol_nart_string", "CLEAR-FOL-NART-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "remove_fol_nart_string", "REMOVE-FOL-NART-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_nart_string_internal", "FOL-NART-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "fol_nart_string", "FOL-NART-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "write_deepak_opencyc_queries", "WRITE-DEEPAK-OPENCYC-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "deepak_kb_fol_sentences", "DEEPAK-KB-FOL-SENTENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "deepak_fol_query_to_tptp_stream", "DEEPAK-FOL-QUERY-TO-TPTP-STREAM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "deepak_assertion_fol_sentences", "DEEPAK-ASSERTION-FOL-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "deepak_queries_timing_test", "DEEPAK-QUERIES-TIMING-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "deepak_queries_timing_test_2", "DEEPAK-QUERIES-TIMING-TEST-2", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.folification", "deepak_queries_timing_test_int", "DEEPAK-QUERIES-TIMING-TEST-INT", 4, 0, false);
        return (SubLObject)folification.NIL;
    }
    
    public static SubLObject init_folification_file() {
        folification.$folification_version$ = SubLFiles.deflexical("*FOLIFICATION-VERSION*", (SubLObject)folification.$str0$0_7_2);
        folification.$fol_translation_type$ = SubLFiles.defparameter("*FOL-TRANSLATION-TYPE*", (SubLObject)folification.$kw1$REGULAR_FOL);
        folification.$fol_mt_handling$ = SubLFiles.defparameter("*FOL-MT-HANDLING*", (SubLObject)folification.$kw3$MT_VISIBLE_EXCEPT_CORE_MTS);
        folification.$fol_isa_handling$ = SubLFiles.defparameter("*FOL-ISA-HANDLING*", (SubLObject)folification.$kw6$UNARY_PREDICATE);
        folification.$fol_rmp_handling$ = SubLFiles.defparameter("*FOL-RMP-HANDLING*", (SubLObject)folification.$kw8$GAF);
        folification.$fol_string_handling$ = SubLFiles.defparameter("*FOL-STRING-HANDLING*", (SubLObject)folification.$kw10$ALLOWED);
        folification.$fol_number_handling$ = SubLFiles.defparameter("*FOL-NUMBER-HANDLING*", (SubLObject)folification.$kw12$DWIM_FLOATS_TO_DISTINCT_CONSTANTS);
        folification.$unfolifiable_terms$ = SubLFiles.deflexical("*UNFOLIFIABLE-TERMS*", (SubLObject)folification.$list14);
        folification.$folification_unhandled_explanation_table$ = SubLFiles.deflexical("*FOLIFICATION-UNHANDLED-EXPLANATION-TABLE*", (SubLObject)folification.$list15);
        folification.$fol_output_formats$ = SubLFiles.deflexical("*FOL-OUTPUT-FORMATS*", (SubLObject)folification.$list16);
        folification.$tptp_query_name$ = SubLFiles.defparameter("*TPTP-QUERY-NAME*", (SubLObject)folification.NIL);
        folification.$tptp_axiom_prefix$ = SubLFiles.defparameter("*TPTP-AXIOM-PREFIX*", (SubLObject)folification.NIL);
        folification.$tptp_axiom_count$ = SubLFiles.defparameter("*TPTP-AXIOM-COUNT*", (SubLObject)folification.NIL);
        folification.$candidate_sentence_count$ = SubLFiles.defparameter("*CANDIDATE-SENTENCE-COUNT*", (SubLObject)folification.NIL);
        folification.$handled_sentence_count$ = SubLFiles.defparameter("*HANDLED-SENTENCE-COUNT*", (SubLObject)folification.NIL);
        folification.$term_count$ = SubLFiles.defparameter("*TERM-COUNT*", (SubLObject)folification.NIL);
        folification.$handled_term_count$ = SubLFiles.defparameter("*HANDLED-TERM-COUNT*", (SubLObject)folification.NIL);
        folification.$partially_handled_term_count$ = SubLFiles.defparameter("*PARTIALLY-HANDLED-TERM-COUNT*", (SubLObject)folification.NIL);
        folification.$unhandled_term_count$ = SubLFiles.defparameter("*UNHANDLED-TERM-COUNT*", (SubLObject)folification.NIL);
        folification.$fol_current_assertion$ = SubLFiles.defparameter("*FOL-CURRENT-ASSERTION*", (SubLObject)folification.NIL);
        folification.$fol_sequence_variable_args_for_arity_caching_state$ = SubLFiles.deflexical("*FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-CACHING-STATE*", (SubLObject)folification.NIL);
        folification.$compute_tptp_query_index_number_caching_state$ = SubLFiles.deflexical("*COMPUTE-TPTP-QUERY-INDEX-NUMBER-CACHING-STATE*", (SubLObject)folification.NIL);
        folification.$tptp_long_symbol_name_cache$ = SubLFiles.deflexical("*TPTP-LONG-SYMBOL-NAME-CACHE*", (folification.NIL != Symbols.boundp((SubLObject)folification.$sym334$_TPTP_LONG_SYMBOL_NAME_CACHE_)) ? folification.$tptp_long_symbol_name_cache$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)folification.$int335$256, Symbols.symbol_function((SubLObject)folification.EQUAL), (SubLObject)folification.UNPROVIDED));
        folification.$tptp_long_symbol_min_length$ = SubLFiles.defparameter("*TPTP-LONG-SYMBOL-MIN-LENGTH*", (SubLObject)folification.$int335$256);
        folification.$include_alchemy_commentsP$ = SubLFiles.defparameter("*INCLUDE-ALCHEMY-COMMENTS?*", (SubLObject)folification.T);
        folification.$alchemy_output_monotonic_rule_indicator$ = SubLFiles.defparameter("*ALCHEMY-OUTPUT-MONOTONIC-RULE-INDICATOR*", (SubLObject)folification.NIL);
        folification.$categorize_fol_predicates$ = SubLFiles.defparameter("*CATEGORIZE-FOL-PREDICATES*", (SubLObject)folification.NIL);
        folification.$categorize_fol_functions$ = SubLFiles.defparameter("*CATEGORIZE-FOL-FUNCTIONS*", (SubLObject)folification.NIL);
        folification.$categorize_fol_terms$ = SubLFiles.defparameter("*CATEGORIZE-FOL-TERMS*", (SubLObject)folification.NIL);
        folification.$fol_nart_string_caching_state$ = SubLFiles.deflexical("*FOL-NART-STRING-CACHING-STATE*", (SubLObject)folification.NIL);
        folification.$deepak_folification_properties$ = SubLFiles.deflexical("*DEEPAK-FOLIFICATION-PROPERTIES*", (SubLObject)folification.$list366);
        folification.$deepak_queries$ = SubLFiles.deflexical("*DEEPAK-QUERIES*", (SubLObject)folification.$list368);
        folification.$deepak_queries_2$ = SubLFiles.deflexical("*DEEPAK-QUERIES-2*", folification.$list369);
        return (SubLObject)folification.NIL;
    }
    
    public static SubLObject setup_folification_file() {
        memoization_state.note_globally_cached_function((SubLObject)folification.$sym161$FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY);
        utilities_macros.note_funcall_helper_function((SubLObject)folification.$sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_);
        memoization_state.note_globally_cached_function((SubLObject)folification.$sym291$COMPUTE_TPTP_QUERY_INDEX_NUMBER);
        subl_macro_promotions.declare_defglobal((SubLObject)folification.$sym334$_TPTP_LONG_SYMBOL_NAME_CACHE_);
        memoization_state.note_globally_cached_function((SubLObject)folification.$sym363$FOL_NART_STRING);
        return (SubLObject)folification.NIL;
    }
    
    private static SubLObject _constant_369_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Baseball-Ball")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cube")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProductUsageMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typePrimaryFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bathtub")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TakingABath")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deviceUsed")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnimalActivitiesMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeBehaviorIncapable")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InanimateObject")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtLeastPartiallyMentalEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedStatesSocialLifeMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanInfant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanPreSchoolageChild")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndustryMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subOrganizations")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClothingGMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Garment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bluish")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WorldCulturalGeographyDataMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BombingOfIraqEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedStatesOfAmerica"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("responsibleFor")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BombingOfIraqEvent"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BlowDryer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Weapon")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GolfCart"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArmoredVehicle")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Alice")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Alice")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Vegetable-Plant"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Alice")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mineral"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArtifactGVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FireplacePoker"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("productTypeManufacturedIn")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Foundry-Building"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parts")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parts")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parts")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("covers-Generic")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transformedInto")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa2-1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("anatomicalParts")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FruitFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BananaTree"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BananaTree")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArrestingSomeone"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrivateSectorEmployee")))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thinking"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomethingExisting"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CIAWorldFactbook1997Mt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("permanentMemberOfOrganization")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthKorea")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UNSecurityCouncil"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScatteredSpaceRegion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("convexSpaceRegionOf")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("convexSpaceRegionOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("componentPartOfSpaceRegion")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProductPhysicalCharacteristicsMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhoneAnsweringMachineCombo"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uniformColorOfObject")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResetButton"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("surfaceParts")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uniformColorOfObject")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatternsOfGlobalTerrorism1998Mt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COMP2"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IBMNetfinityComputer"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COMP1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SunMachine"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentHosts")), (SubLObject)SubLObjectFactory.makeSymbol("?COMP1"), (SubLObject)SubLObjectFactory.makeSymbol("?COMP2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), (SubLObject)SubLObjectFactory.makeSymbol("?CRACK"), (SubLObject)SubLObjectFactory.makeSymbol("?HACKER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?CRACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cracking-CompromisingSecurity"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("securityCompromised")), (SubLObject)SubLObjectFactory.makeSymbol("?CRACK"), (SubLObject)SubLObjectFactory.makeSymbol("?COMP1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("damages")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("?COMP2"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NaiveInformationMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?CUP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Demitasse"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COFFEE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Coffee-Hot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-ContOpen")), (SubLObject)SubLObjectFactory.makeSymbol("?COFFEE"), (SubLObject)SubLObjectFactory.makeSymbol("?CUP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("orientation")), (SubLObject)SubLObjectFactory.makeSymbol("?CUP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightSideUp"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeBehaviorIncapable")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Can")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cancan-StyleOfDance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("biologicalFather")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Terrorist"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAsia")))))) });
    }
    
    public void declareFunctions() {
        declare_folification_file();
    }
    
    public void initializeVariables() {
        init_folification_file();
    }
    
    public void runTopLevelForms() {
        setup_folification_file();
    }
    
    static {
        me = (SubLFile)new folification();
        folification.$folification_version$ = null;
        folification.$fol_translation_type$ = null;
        folification.$fol_mt_handling$ = null;
        folification.$fol_isa_handling$ = null;
        folification.$fol_rmp_handling$ = null;
        folification.$fol_string_handling$ = null;
        folification.$fol_number_handling$ = null;
        folification.$unfolifiable_terms$ = null;
        folification.$folification_unhandled_explanation_table$ = null;
        folification.$fol_output_formats$ = null;
        folification.$tptp_query_name$ = null;
        folification.$tptp_axiom_prefix$ = null;
        folification.$tptp_axiom_count$ = null;
        folification.$candidate_sentence_count$ = null;
        folification.$handled_sentence_count$ = null;
        folification.$term_count$ = null;
        folification.$handled_term_count$ = null;
        folification.$partially_handled_term_count$ = null;
        folification.$unhandled_term_count$ = null;
        folification.$fol_current_assertion$ = null;
        folification.$fol_sequence_variable_args_for_arity_caching_state$ = null;
        folification.$compute_tptp_query_index_number_caching_state$ = null;
        folification.$tptp_long_symbol_name_cache$ = null;
        folification.$tptp_long_symbol_min_length$ = null;
        folification.$include_alchemy_commentsP$ = null;
        folification.$alchemy_output_monotonic_rule_indicator$ = null;
        folification.$categorize_fol_predicates$ = null;
        folification.$categorize_fol_functions$ = null;
        folification.$categorize_fol_terms$ = null;
        folification.$fol_nart_string_caching_state$ = null;
        folification.$deepak_folification_properties$ = null;
        folification.$deepak_queries$ = null;
        folification.$deepak_queries_2$ = null;
        $str0$0_7_2 = SubLObjectFactory.makeString("0.7.2");
        $kw1$REGULAR_FOL = SubLObjectFactory.makeKeyword("REGULAR-FOL");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REGULAR-FOL"), (SubLObject)SubLObjectFactory.makeKeyword("SET-THEORY"));
        $kw3$MT_VISIBLE_EXCEPT_CORE_MTS = SubLObjectFactory.makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT-VISIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("MT-ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("FLAT"));
        $kw5$COLLAPSE = SubLObjectFactory.makeKeyword("COLLAPSE");
        $kw6$UNARY_PREDICATE = SubLObjectFactory.makeKeyword("UNARY-PREDICATE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNARY-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("ISA"));
        $kw8$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GAF"), (SubLObject)SubLObjectFactory.makeKeyword("EXPANSION"), (SubLObject)SubLObjectFactory.makeKeyword("GAF-AND-EXPANSION"));
        $kw10$ALLOWED = SubLObjectFactory.makeKeyword("ALLOWED");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOWED"), (SubLObject)SubLObjectFactory.makeKeyword("DWIM-TO-SINGLE-CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("DWIM-TO-DISTINCT-CONSTANTS"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP"));
        $kw12$DWIM_FLOATS_TO_DISTINCT_CONSTANTS = SubLObjectFactory.makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOWED"), (SubLObject)SubLObjectFactory.makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS"), (SubLObject)SubLObjectFactory.makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS"));
        $list14 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EscapeQuote")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiQuote")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerable")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completelyEnumerableCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nothing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorEquiv")) });
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("VARIABLE-ARITY-PREDICATE"), SubLObjectFactory.makeString("contained a variable-arity predicate with a maximum arity."), SubLObjectFactory.makeKeyword("VARIABLE-ARITY-FUNCTION"), SubLObjectFactory.makeString("contained a variable-arity function with a maximum arity."), SubLObjectFactory.makeKeyword("UNBOUNDED-ARITY-PREDICATE"), SubLObjectFactory.makeString("contained a variable-arity predicate with an unbounded arity."), SubLObjectFactory.makeKeyword("UNBOUNDED-ARITY-FUNCTION"), SubLObjectFactory.makeString("contained a variable-arity function with an unbounded arity."), SubLObjectFactory.makeKeyword("META-SENTENCE"), SubLObjectFactory.makeString("contained an embedded sentence used as a term."), SubLObjectFactory.makeKeyword("META-ASSERTION"), SubLObjectFactory.makeString("contained an embedded assertion used as a term."), SubLObjectFactory.makeKeyword("META-VARIABLE"), SubLObjectFactory.makeString("contained a meta-variable."), SubLObjectFactory.makeKeyword("SUBL-ESCAPE"), SubLObjectFactory.makeString("contained an escape to SubL (a hook into the underlying implentation language)"), SubLObjectFactory.makeKeyword("FUNCTION-ARG-CONSTRAINT"), SubLObjectFactory.makeString("expressed an argument constraint on a function, for which there is currently no FOL translation."), SubLObjectFactory.makeKeyword("FUNCTION-QUANTIFICATION"), SubLObjectFactory.makeString("quantified over functions."), SubLObjectFactory.makeKeyword("PREDICATE-QUANTIFICATION"), SubLObjectFactory.makeString("quantified over predicates."), SubLObjectFactory.makeKeyword("COLLECTION-QUANTIFICATION"), SubLObjectFactory.makeString("quantified into a collection, which is like quantifying over predicates."), SubLObjectFactory.makeKeyword("SEQUENCE-VAR"), SubLObjectFactory.makeString("contained a sequence variable"), SubLObjectFactory.makeKeyword("IST"), SubLObjectFactory.makeString("used the predicate #$ist, which is used to do quantification across contexts or contextual lifting."), SubLObjectFactory.makeKeyword("ILL-FORMED"), SubLObjectFactory.makeString("were ill-formed.  This illustrates a problem with the Cyc KB itself, not with the Cyc -> FOL conversion."), SubLObjectFactory.makeKeyword("NONSTANDARD-SENTENTIAL-RELATION"), SubLObjectFactory.makeString("contained a bounded existential, or a user-defined logical operator or quantifier"), SubLObjectFactory.makeKeyword("EXPANSION"), SubLObjectFactory.makeString("had an expansion that could not be translated"), SubLObjectFactory.makeKeyword("KAPPA"), SubLObjectFactory.makeString("contained Kappa, a predicate-denoting function"), SubLObjectFactory.makeKeyword("LAMBDA"), SubLObjectFactory.makeString("contained Lambda, a function-denoting function"), SubLObjectFactory.makeKeyword("EXPLICITLY-FORBIDDEN-TERM"), SubLObjectFactory.makeString("contained an explicitly forbidden term, function, or predicate") });
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TPTP"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("ALCHEMY"));
        $kw17$GENERATION_PROPERTIES = SubLObjectFactory.makeKeyword("GENERATION-PROPERTIES");
        $kw18$CANDIDATE_FOL_SENTENCE_COUNT = SubLObjectFactory.makeKeyword("CANDIDATE-FOL-SENTENCE-COUNT");
        $kw19$FOL_SENTENCE_COUNT = SubLObjectFactory.makeKeyword("FOL-SENTENCE-COUNT");
        $kw20$TERM_COUNT = SubLObjectFactory.makeKeyword("TERM-COUNT");
        $kw21$HANDLED_TERM_COUNT = SubLObjectFactory.makeKeyword("HANDLED-TERM-COUNT");
        $kw22$PARTIALLY_HANDLED_TERM_COUNT = SubLObjectFactory.makeKeyword("PARTIALLY-HANDLED-TERM-COUNT");
        $kw23$UNHANDLED_TERM_COUNT = SubLObjectFactory.makeKeyword("UNHANDLED-TERM-COUNT");
        $kw24$FOL_SENTENCES_DATA = SubLObjectFactory.makeKeyword("FOL-SENTENCES-DATA");
        $kw25$REJECTION_STATISTICS = SubLObjectFactory.makeKeyword("REJECTION-STATISTICS");
        $kw26$OUTPUT_FILENAME = SubLObjectFactory.makeKeyword("OUTPUT-FILENAME");
        $kw27$OUTPUT_FORMAT = SubLObjectFactory.makeKeyword("OUTPUT-FORMAT");
        $kw28$TPTP = SubLObjectFactory.makeKeyword("TPTP");
        $str29$cyc = SubLObjectFactory.makeString("cyc");
        $sym30$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym31$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym32$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list33 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TRANSLATION-TYPE"), SubLObjectFactory.makeSymbol("MT-HANDLING"), SubLObjectFactory.makeSymbol("MT-CEILING"), SubLObjectFactory.makeSymbol("ISA-HANDLING"), SubLObjectFactory.makeSymbol("RULE-MACRO-PREDICATE-HANDLING"), SubLObjectFactory.makeSymbol("STRING-HANDLING"), SubLObjectFactory.makeSymbol("NUMBER-HANDLING"), SubLObjectFactory.makeSymbol("ALLOW-EQUIV-RELATION?"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAMPLE-RATE"), (SubLObject)folification.ONE_INTEGER), SubLObjectFactory.makeSymbol("OUTPUT-FILENAME"), SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), SubLObjectFactory.makeSymbol("HEADER"), SubLObjectFactory.makeSymbol("ANALYSIS-FILENAME"), SubLObjectFactory.makeSymbol("ANALYSIS-FILE-INTERNAL?"), SubLObjectFactory.makeSymbol("INCLUDE-COMMENTS?"), SubLObjectFactory.makeSymbol("RETURN-DATA?"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATE-QUERIES?"), (SubLObject)folification.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE?"), (SubLObject)folification.T) });
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TRANSLATION-TYPE"), SubLObjectFactory.makeKeyword("MT-HANDLING"), SubLObjectFactory.makeKeyword("MT-CEILING"), SubLObjectFactory.makeKeyword("ISA-HANDLING"), SubLObjectFactory.makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), SubLObjectFactory.makeKeyword("STRING-HANDLING"), SubLObjectFactory.makeKeyword("NUMBER-HANDLING"), SubLObjectFactory.makeKeyword("ALLOW-EQUIV-RELATION?"), SubLObjectFactory.makeKeyword("SAMPLE-RATE"), SubLObjectFactory.makeKeyword("OUTPUT-FILENAME"), SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), SubLObjectFactory.makeKeyword("HEADER"), SubLObjectFactory.makeKeyword("ANALYSIS-FILENAME"), SubLObjectFactory.makeKeyword("ANALYSIS-FILE-INTERNAL?"), SubLObjectFactory.makeKeyword("INCLUDE-COMMENTS?"), SubLObjectFactory.makeKeyword("RETURN-DATA?"), SubLObjectFactory.makeKeyword("NEGATE-QUERIES?"), SubLObjectFactory.makeKeyword("VERBOSE?") });
        $kw35$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw36$TRANSLATION_TYPE = SubLObjectFactory.makeKeyword("TRANSLATION-TYPE");
        $kw37$MT_HANDLING = SubLObjectFactory.makeKeyword("MT-HANDLING");
        $kw38$MT_CEILING = SubLObjectFactory.makeKeyword("MT-CEILING");
        $kw39$ISA_HANDLING = SubLObjectFactory.makeKeyword("ISA-HANDLING");
        $kw40$RULE_MACRO_PREDICATE_HANDLING = SubLObjectFactory.makeKeyword("RULE-MACRO-PREDICATE-HANDLING");
        $kw41$STRING_HANDLING = SubLObjectFactory.makeKeyword("STRING-HANDLING");
        $kw42$NUMBER_HANDLING = SubLObjectFactory.makeKeyword("NUMBER-HANDLING");
        $kw43$ALLOW_EQUIV_RELATION_ = SubLObjectFactory.makeKeyword("ALLOW-EQUIV-RELATION?");
        $kw44$SAMPLE_RATE = SubLObjectFactory.makeKeyword("SAMPLE-RATE");
        $kw45$HEADER = SubLObjectFactory.makeKeyword("HEADER");
        $kw46$ANALYSIS_FILENAME = SubLObjectFactory.makeKeyword("ANALYSIS-FILENAME");
        $kw47$ANALYSIS_FILE_INTERNAL_ = SubLObjectFactory.makeKeyword("ANALYSIS-FILE-INTERNAL?");
        $kw48$INCLUDE_COMMENTS_ = SubLObjectFactory.makeKeyword("INCLUDE-COMMENTS?");
        $kw49$RETURN_DATA_ = SubLObjectFactory.makeKeyword("RETURN-DATA?");
        $kw50$NEGATE_QUERIES_ = SubLObjectFactory.makeKeyword("NEGATE-QUERIES?");
        $kw51$VERBOSE_ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $kw52$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str53$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str54$Converting_assertions_to_FOL = SubLObjectFactory.makeString("Converting assertions to FOL");
        $str55$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw56$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym57$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str58$failed_to_translate__s__ = SubLObjectFactory.makeString("failed to translate ~s~%");
        $str59$Converting_sentences_to_FOL = SubLObjectFactory.makeString("Converting sentences to FOL");
        $const60$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str61$failed_to_translate__s = SubLObjectFactory.makeString("failed to translate ~s");
        $sym62$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const63$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str64$Converting_forts_to_FOL = SubLObjectFactory.makeString("Converting forts to FOL");
        $sym65$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw66$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw67$ANALYSIS = SubLObjectFactory.makeKeyword("ANALYSIS");
        $str68$Expected_a_fol_sentences_analysis = SubLObjectFactory.makeString("Expected a fol-sentences-analysis as the first loaded item");
        $kw69$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw70$DATUM = SubLObjectFactory.makeKeyword("DATUM");
        $str71$expected_to_input_a_cons__got__s = SubLObjectFactory.makeString("expected to input a cons, got ~s");
        $kw72$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw73$ALCHEMY = SubLObjectFactory.makeKeyword("ALCHEMY");
        $str74$Unrecognized_output_format___s = SubLObjectFactory.makeString("Unrecognized output format: ~s");
        $str75$Gathering_FOL_symbols = SubLObjectFactory.makeString("Gathering FOL symbols");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FOL-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("UNHANDLED-FOL-SENTENCES"));
        $sym77$FOL_REPRESENTED_TERM_P = SubLObjectFactory.makeSymbol("FOL-REPRESENTED-TERM-P");
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TRANSLATION-TYPE"), SubLObjectFactory.makeSymbol("MT-HANDLING"), SubLObjectFactory.makeSymbol("MT-CEILING"), SubLObjectFactory.makeSymbol("ISA-HANDLING"), SubLObjectFactory.makeSymbol("RULE-MACRO-PREDICATE-HANDLING"), SubLObjectFactory.makeSymbol("STRING-HANDLING"), SubLObjectFactory.makeSymbol("NUMBER-HANDLING"), SubLObjectFactory.makeSymbol("ALLOW-EQUIV-RELATION?"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAMPLE-RATE"), (SubLObject)folification.ONE_INTEGER), SubLObjectFactory.makeSymbol("OUTPUT-FILENAME"), SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), SubLObjectFactory.makeSymbol("HEADER"), SubLObjectFactory.makeSymbol("INCLUDE-COMMENTS?"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATE-QUERIES?"), (SubLObject)folification.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE?"), (SubLObject)folification.T) });
        $list79 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TRANSLATION-TYPE"), SubLObjectFactory.makeKeyword("MT-HANDLING"), SubLObjectFactory.makeKeyword("MT-CEILING"), SubLObjectFactory.makeKeyword("ISA-HANDLING"), SubLObjectFactory.makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), SubLObjectFactory.makeKeyword("STRING-HANDLING"), SubLObjectFactory.makeKeyword("NUMBER-HANDLING"), SubLObjectFactory.makeKeyword("ALLOW-EQUIV-RELATION?"), SubLObjectFactory.makeKeyword("SAMPLE-RATE"), SubLObjectFactory.makeKeyword("OUTPUT-FILENAME"), SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), SubLObjectFactory.makeKeyword("HEADER"), SubLObjectFactory.makeKeyword("INCLUDE-COMMENTS?"), SubLObjectFactory.makeKeyword("NEGATE-QUERIES?"), SubLObjectFactory.makeKeyword("VERBOSE?") });
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $kw81$MT_ARGUMENT = SubLObjectFactory.makeKeyword("MT-ARGUMENT");
        $const82$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $sym83$_MT = SubLObjectFactory.makeSymbol("?MT");
        $kw84$MT_VISIBLE = SubLObjectFactory.makeKeyword("MT-VISIBLE");
        $const85$mtVisible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtVisible"));
        $kw86$FLAT = SubLObjectFactory.makeKeyword("FLAT");
        $str87$Queries_not_supported_for_Alchemy = SubLObjectFactory.makeString("Queries not supported for Alchemy format.");
        $kw88$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $str89$can_t_handle_conditional_sentence = SubLObjectFactory.makeString("can't handle conditional sentences~%");
        $kw90$TESTING = SubLObjectFactory.makeKeyword("TESTING");
        $sym91$FOL_TRANSLATION_TYPE_PROPERTY_P = SubLObjectFactory.makeSymbol("FOL-TRANSLATION-TYPE-PROPERTY-P");
        $sym92$FOL_MT_HANDLING_PROPERTY_P = SubLObjectFactory.makeSymbol("FOL-MT-HANDLING-PROPERTY-P");
        $sym93$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym94$FOL_ISA_HANDLING_PROPERTY_P = SubLObjectFactory.makeSymbol("FOL-ISA-HANDLING-PROPERTY-P");
        $sym95$FOL_RMP_HANDLING_PROPERTY_P = SubLObjectFactory.makeSymbol("FOL-RMP-HANDLING-PROPERTY-P");
        $sym96$FOL_STRING_HANDLING_PROPERTY_P = SubLObjectFactory.makeSymbol("FOL-STRING-HANDLING-PROPERTY-P");
        $sym97$FOL_NUMBER_HANDLING_PROPERTY_P = SubLObjectFactory.makeSymbol("FOL-NUMBER-HANDLING-PROPERTY-P");
        $sym98$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym99$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym100$FILE_VALID_FOR_WRITING_P = SubLObjectFactory.makeSymbol("FILE-VALID-FOR-WRITING-P");
        $sym101$FOL_OUTPUT_FORMAT_P = SubLObjectFactory.makeSymbol("FOL-OUTPUT-FORMAT-P");
        $kw102$EXPANSION = SubLObjectFactory.makeKeyword("EXPANSION");
        $kw103$GAF_AND_EXPANSION = SubLObjectFactory.makeKeyword("GAF-AND-EXPANSION");
        $const104$resultIsaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArg"));
        $const105$RelationAllExistsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn"));
        $list106 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL")), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL")));
        $const107$RelationExistsAllFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn"));
        $list108 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL")), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL")));
        $kw109$EXPLICITLY_FORBIDDEN_TERM = SubLObjectFactory.makeKeyword("EXPLICITLY-FORBIDDEN-TERM");
        $sym110$FOL_EXPANDIBLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("FOL-EXPANDIBLE-EXPRESSION?");
        $sym111$FOL_EXPAND_ONE_STEP = SubLObjectFactory.makeSymbol("FOL-EXPAND-ONE-STEP");
        $const112$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLAPSE"), (SubLObject)SubLObjectFactory.makeSymbol("THEORY-MT"));
        $kw114$NOT_IN_THEORY = SubLObjectFactory.makeKeyword("NOT-IN-THEORY");
        $sym115$FOL_UNHANDLED_EXPRESSION_P = SubLObjectFactory.makeSymbol("FOL-UNHANDLED-EXPRESSION-P");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-UNHANDLED-FN"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"), (SubLObject)SubLObjectFactory.makeSymbol("CULPRIT"));
        $str117$___a__ = SubLObjectFactory.makeString("~%~a~%");
        $str118$FOLification_statistics = SubLObjectFactory.makeString("FOLification statistics");
        $str119$_a__ = SubLObjectFactory.makeString("~a~%");
        $str120$_______________________ = SubLObjectFactory.makeString("-----------------------");
        $str121$Rejection_statistics__raw__ = SubLObjectFactory.makeString("Rejection statistics (raw):");
        $str122$Rejection_statistics__pretty__ = SubLObjectFactory.makeString("Rejection statistics (pretty):");
        $str123$Conversion_statistics_ = SubLObjectFactory.makeString("Conversion statistics:");
        $sym124$_ = SubLObjectFactory.makeSymbol(">");
        $list125 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("REASON"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $str126$_s_assertion_p_could_not_be_conve = SubLObjectFactory.makeString("~s assertion~p could not be converted to FOL because ~a ~a~%");
        $str127$it = SubLObjectFactory.makeString("it");
        $str128$they = SubLObjectFactory.makeString("they");
        $str129$yielded_the_rejection_condition_ = SubLObjectFactory.makeString("yielded the rejection condition ");
        $const130$FOL_UnhandledFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-UnhandledFn"));
        $list131 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $const132$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const134$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $list135 = ConsesLow.list((SubLObject)folification.NIL);
        $const136$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const137$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $const138$arg3Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa"));
        $const139$arg4Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa"));
        $const140$arg5Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa"));
        $const141$arg6Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Isa"));
        $const142$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const143$arg1Genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl"));
        $const144$arg2Genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl"));
        $const145$arg3Genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl"));
        $const146$arg4Genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl"));
        $const147$arg5Genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl"));
        $const148$arg6Genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Genl"));
        $const149$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const150$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $const151$resultGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $const152$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $const153$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const154$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $kw156$FUNCTION_ARG_CONSTRAINT = SubLObjectFactory.makeKeyword("FUNCTION-ARG-CONSTRAINT");
        $kw157$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $kw158$NONSTANDARD_SENTENTIAL_RELATION = SubLObjectFactory.makeKeyword("NONSTANDARD-SENTENTIAL-RELATION");
        $kw159$UNEXPECTED = SubLObjectFactory.makeKeyword("UNEXPECTED");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $sym161$FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY = SubLObjectFactory.makeSymbol("FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY");
        $str162$ARG = SubLObjectFactory.makeString("ARG");
        $sym163$_FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-CACHING-STATE*");
        $const164$equiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv"));
        $list165 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)folification.TWO_INTEGER);
        $sym166$_X = SubLObjectFactory.makeSymbol("?X");
        $const167$FOL_PredicateFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-PredicateFn"));
        $list168 = ConsesLow.list((SubLObject)folification.ONE_INTEGER);
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $const170$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $list171 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtVisible")), (SubLObject)folification.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)folification.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-MT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtVisible")), (SubLObject)folification.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-MT")));
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT-VISIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"));
        $list173 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtVisible")), (SubLObject)folification.ONE_INTEGER);
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym175$ARGNUM_1 = SubLObjectFactory.makeUninternedSymbol("ARGNUM-1");
        $sym176$ARG_ISA_PRED = SubLObjectFactory.makeUninternedSymbol("ARG-ISA-PRED");
        $sym177$ARITY = SubLObjectFactory.makeUninternedSymbol("ARITY");
        $sym178$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym179$FIXED_ARITY_PREDICATE_P = SubLObjectFactory.makeSymbol("FIXED-ARITY-PREDICATE-P");
        $sym180$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym181$ARITY = SubLObjectFactory.makeSymbol("ARITY");
        $sym182$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym183$1_ = SubLObjectFactory.makeSymbol("1+");
        $sym184$ARG_ISA_PRED = SubLObjectFactory.makeSymbol("ARG-ISA-PRED");
        $sym185$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $kw186$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)folification.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $kw188$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym189$_INS = SubLObjectFactory.makeSymbol("?INS");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $const195$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $const196$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $list197 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?OLD"), (SubLObject)SubLObjectFactory.makeSymbol("?NEW"));
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NEW"), (SubLObject)SubLObjectFactory.makeSymbol("?OLD"));
        $sym199$_OLD = SubLObjectFactory.makeSymbol("?OLD");
        $sym200$_NEW = SubLObjectFactory.makeSymbol("?NEW");
        $const201$natFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natFunction"));
        $const202$natArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("natArgument"));
        $kw203$SET_THEORY = SubLObjectFactory.makeKeyword("SET-THEORY");
        $kw204$SEQUENCE_VAR = SubLObjectFactory.makeKeyword("SEQUENCE-VAR");
        $const205$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $sym206$FOL_TRANSFORM_ARG = SubLObjectFactory.makeSymbol("FOL-TRANSFORM-ARG");
        $const207$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ARG2"));
        $kw209$ISA = SubLObjectFactory.makeKeyword("ISA");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $kw211$META_ASSERTION = SubLObjectFactory.makeKeyword("META-ASSERTION");
        $kw212$META_VARIABLE = SubLObjectFactory.makeKeyword("META-VARIABLE");
        $kw213$SUBL_ESCAPE = SubLObjectFactory.makeKeyword("SUBL-ESCAPE");
        $kw214$META_SENTENCE = SubLObjectFactory.makeKeyword("META-SENTENCE");
        $const215$memberOfSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfSet"));
        $const216$SetifyArgumentFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SetifyArgumentFn"));
        $const217$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $kw218$IST = SubLObjectFactory.makeKeyword("IST");
        $list219 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")));
        $kw220$NON_PREDICATE = SubLObjectFactory.makeKeyword("NON-PREDICATE");
        $kw221$VARIABLE_ARITY_PREDICATE = SubLObjectFactory.makeKeyword("VARIABLE-ARITY-PREDICATE");
        $kw222$UNBOUNDED_ARITY_PREDICATE = SubLObjectFactory.makeKeyword("UNBOUNDED-ARITY-PREDICATE");
        $kw223$PREDICATE_QUANTIFICATION = SubLObjectFactory.makeKeyword("PREDICATE-QUANTIFICATION");
        $const224$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $kw225$KAPPA = SubLObjectFactory.makeKeyword("KAPPA");
        $kw226$NON_COLLECTION = SubLObjectFactory.makeKeyword("NON-COLLECTION");
        $kw227$COLLECTION_QUANTIFICATION = SubLObjectFactory.makeKeyword("COLLECTION-QUANTIFICATION");
        $kw228$NON_FUNCTION = SubLObjectFactory.makeKeyword("NON-FUNCTION");
        $kw229$SCOPING_RELATION = SubLObjectFactory.makeKeyword("SCOPING-RELATION");
        $kw230$VARIABLE_ARITY_FUNCTION = SubLObjectFactory.makeKeyword("VARIABLE-ARITY-FUNCTION");
        $kw231$UNBOUNDED_ARITY_FUNCTION = SubLObjectFactory.makeKeyword("UNBOUNDED-ARITY-FUNCTION");
        $kw232$FUNCTION_QUANTIFICATION = SubLObjectFactory.makeKeyword("FUNCTION-QUANTIFICATION");
        $const233$Lambda = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lambda"));
        $kw234$LAMBDA = SubLObjectFactory.makeKeyword("LAMBDA");
        $const235$FOL_AtomicTermFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-AtomicTermFn"));
        $sym236$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $const237$FOL_FunctionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-FunctionFn"));
        $const238$FOL_StringFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-StringFn"));
        $kw239$DWIM_TO_DISTINCT_CONSTANTS = SubLObjectFactory.makeKeyword("DWIM-TO-DISTINCT-CONSTANTS");
        $const240$FOL_StringConstantFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-StringConstantFn"));
        $kw241$DWIM_TO_SINGLE_CONSTANT = SubLObjectFactory.makeKeyword("DWIM-TO-SINGLE-CONSTANT");
        $const242$Canonical_String = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Canonical_String"));
        $str243$unexpected_string_handling_direct = SubLObjectFactory.makeString("unexpected string handling directive ~s");
        $sym244$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $const245$FOL_NumberFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-NumberFn"));
        $const246$FOL_NumberConstantFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOL-NumberConstantFn"));
        $kw247$DWIM_ALL_TO_DISTINCT_CONSTANTS = SubLObjectFactory.makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS");
        $str248$unexpected_number_handling_direct = SubLObjectFactory.makeString("unexpected number handling directive ~s");
        $sym249$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $list250 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $list251 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FOL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FOL-ARGS"));
        $sym252$FOL_ATOMIC_SENTENCE_ = SubLObjectFactory.makeSymbol("FOL-ATOMIC-SENTENCE?");
        $str253$______S = SubLObjectFactory.makeString("~%;; ~S");
        $str254$_____QUERY_ = SubLObjectFactory.makeString("~%;; QUERY:");
        $str255$__Cyc_Assertion___a___ = SubLObjectFactory.makeString("% Cyc Assertion #~a:~%");
        $str256$__Cyc_NART___a___ = SubLObjectFactory.makeString("% Cyc NART #~a:~%");
        $str257$__Cyc_Constant___a___ = SubLObjectFactory.makeString("% Cyc Constant #~a:~%");
        $str258$__CycL_Sentence___a___ = SubLObjectFactory.makeString("% CycL Sentence: ~a:~%");
        $str259$Unexpected_object__s = SubLObjectFactory.makeString("Unexpected object ~s");
        $str260$_________________________________ = SubLObjectFactory.makeString("%--------------------------------------------------------------------------\n");
        $str261$File = SubLObjectFactory.makeString("File");
        $str262$CYC_10___TPTP_v2_2_0__Released_2_ = SubLObjectFactory.makeString("CYC-10 : TPTP v2.2.0. Released 2.2.0. ");
        $str263$Domain = SubLObjectFactory.makeString("Domain");
        $str264$Knowledge_Representation_Common_S = SubLObjectFactory.makeString("Knowledge Representation(Common-Sense Reasoning)");
        $str265$Problem = SubLObjectFactory.makeString("Problem");
        $str266$Reasoning_with_the_Cyc_Common_Sen = SubLObjectFactory.makeString("Reasoning with the Cyc Common Sense KB");
        $str267$Version = SubLObjectFactory.makeString("Version");
        $str268$English = SubLObjectFactory.makeString("English");
        $str269$The_Cyc_KB_contains_assertions_fo = SubLObjectFactory.makeString("The Cyc KB contains assertions for reasoning with Common Sense mainly in FOL but with some extensions.");
        $str270$Refs = SubLObjectFactory.makeString("Refs");
        $str271$ = SubLObjectFactory.makeString("");
        $str272$Source = SubLObjectFactory.makeString("Source");
        $str273$Names = SubLObjectFactory.makeString("Names");
        $str274$Status = SubLObjectFactory.makeString("Status");
        $str275$unknown = SubLObjectFactory.makeString("unknown");
        $str276$Rating = SubLObjectFactory.makeString("Rating");
        $str277$1_0 = SubLObjectFactory.makeString("1.0");
        $str278$Syntax = SubLObjectFactory.makeString("Syntax");
        $str279$_blank_ = SubLObjectFactory.makeString("<blank>");
        $str280$Comments = SubLObjectFactory.makeString("Comments");
        $str281$To_obtain_a_First_Orderification_ = SubLObjectFactory.makeString("To obtain a First Orderification of the ResearchCyc KB a number of non-trivial transformations were performed.\n% See First-Orderized ResearchCyc: Expressivity and Efficiency in a Common-Sense Ontology (2005) [Ramachandran, Reagan, Goolsbey] for details.\n% \n% Copyright (c)2003-2011 by Cycorp, Inc.\n% All rights reserved.\n% Use outside of Cycorp subject to separate license terms.\n%");
        $str282$Bugfixes = SubLObjectFactory.makeString("Bugfixes");
        $str283$_________________________________ = SubLObjectFactory.makeString("%-----------------------------------------\n");
        $sym284$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str285$__ = SubLObjectFactory.makeString("% ");
        $str286$___ = SubLObjectFactory.makeString(" : ");
        $str287$_ = SubLObjectFactory.makeString("\n");
        $str288$__ = SubLObjectFactory.makeString("%\n");
        $str289$__ = SubLObjectFactory.makeString(": ");
        $sym290$TPTP_PROPERTY_APPROPRIATE_FOR_PRINTING_ = SubLObjectFactory.makeSymbol("TPTP-PROPERTY-APPROPRIATE-FOR-PRINTING?");
        $sym291$COMPUTE_TPTP_QUERY_INDEX_NUMBER = SubLObjectFactory.makeSymbol("COMPUTE-TPTP-QUERY-INDEX-NUMBER");
        $sym292$_COMPUTE_TPTP_QUERY_INDEX_NUMBER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*COMPUTE-TPTP-QUERY-INDEX-NUMBER-CACHING-STATE*");
        $str293$fof__a_axiom_ = SubLObjectFactory.makeString("fof(~a,axiom,");
        $str294$____ = SubLObjectFactory.makeString(").~%");
        $str295$fof__a_conjecture_ = SubLObjectFactory.makeString("fof(~a,conjecture,");
        $list296 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list297 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT"));
        $str298$_ = SubLObjectFactory.makeString("(");
        $str299$____ = SubLObjectFactory.makeString(" => ");
        $str300$_ = SubLObjectFactory.makeString(")");
        $const301$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str302$___ = SubLObjectFactory.makeString(" & ");
        $const303$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $str304$___ = SubLObjectFactory.makeString(" | ");
        $const305$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $str306$__ = SubLObjectFactory.makeString("(~");
        $const307$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FOL-SUBSENTENCE"));
        $str309$_____a____ = SubLObjectFactory.makeString("(? [~a] : ");
        $const310$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $str311$_____a____ = SubLObjectFactory.makeString("(! [~a] : ");
        $const312$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $str313$___ = SubLObjectFactory.makeString(" = ");
        $str314$_ = SubLObjectFactory.makeString(",");
        $str315$__ = SubLObjectFactory.makeString("))");
        $str316$unexpected_FOL_term__s = SubLObjectFactory.makeString("unexpected FOL term ~s");
        $list317 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FOL-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FOL-ARGS"));
        $list318 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-PREDICATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"));
        $str319$p_ = SubLObjectFactory.makeString("p_");
        $list320 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-FUNCTION-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"));
        $str321$f_ = SubLObjectFactory.makeString("f_");
        $str322$c_zero_arity_function_application = SubLObjectFactory.makeString("c_zero_arity_function_application_");
        $list323 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-ATOMIC-TERM-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-ATOMIC-TERM"));
        $str324$c_ = SubLObjectFactory.makeString("c_");
        $list325 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-STRING-CONSTANT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL-STRING"));
        $str326$s_ = SubLObjectFactory.makeString("s_");
        $list327 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-STRING-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL-STRING"));
        $str328$_ = SubLObjectFactory.makeString("\"");
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-NUMBER-CONSTANT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL-NUMBER"));
        $sym330$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str331$n_ = SubLObjectFactory.makeString("n_");
        $list332 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOL-NUMBER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL-NUMBER"));
        $sym333$TPTP_STRING_CHAR_P = SubLObjectFactory.makeSymbol("TPTP-STRING-CHAR-P");
        $sym334$_TPTP_LONG_SYMBOL_NAME_CACHE_ = SubLObjectFactory.makeSymbol("*TPTP-LONG-SYMBOL-NAME-CACHE*");
        $int335$256 = SubLObjectFactory.makeInteger(256);
        $str336$ls_ = SubLObjectFactory.makeString("ls_");
        $sym337$TPTP_NON_NUMERIC_ATOM_CHAR_P = SubLObjectFactory.makeSymbol("TPTP-NON-NUMERIC-ATOM-CHAR-P");
        $str338$tptp_ = SubLObjectFactory.makeString("tptp_");
        $sym339$TPTP_NUMERIC_ATOM_CHAR_P = SubLObjectFactory.makeSymbol("TPTP-NUMERIC-ATOM-CHAR-P");
        $int340$32 = SubLObjectFactory.makeInteger(32);
        $int341$126 = SubLObjectFactory.makeInteger(126);
        $kw342$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $str343$_ = SubLObjectFactory.makeString(" ");
        $str344$_A = SubLObjectFactory.makeString("~A");
        $str345$___Cyc_Assertion__a = SubLObjectFactory.makeString("// Cyc Assertion ~a");
        $str346$___Cyc_NART__a = SubLObjectFactory.makeString("// Cyc NART ~a");
        $str347$___Cyc_Constant___a_ = SubLObjectFactory.makeString("// Cyc Constant #~a:");
        $str348$___CycL_Sentence___a_ = SubLObjectFactory.makeString("// CycL Sentence: ~a:");
        $sym349$FOCYCL_TO_CYCL = SubLObjectFactory.makeSymbol("FOCYCL-TO-CYCL");
        $kw350$INCLUDE_HORN = SubLObjectFactory.makeKeyword("INCLUDE-HORN");
        $kw351$TERM_TYPES = SubLObjectFactory.makeKeyword("TERM-TYPES");
        $kw352$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw353$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str354$_S_ = SubLObjectFactory.makeString("~S ");
        $kw355$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $kw356$TERM = SubLObjectFactory.makeKeyword("TERM");
        $sym357$CATEGORIZE_FOL_TERMS_INT = SubLObjectFactory.makeSymbol("CATEGORIZE-FOL-TERMS-INT");
        $str358$time_to_handle_non_forts = SubLObjectFactory.makeString("time to handle non-forts");
        $str359$_P = SubLObjectFactory.makeString("_P");
        $str360$_F = SubLObjectFactory.makeString("_F");
        $str361$_T = SubLObjectFactory.makeString("_T");
        $str362$time_to_handle__S = SubLObjectFactory.makeString("time to handle ~S");
        $sym363$FOL_NART_STRING = SubLObjectFactory.makeSymbol("FOL-NART-STRING");
        $sym364$VALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $sym365$_FOL_NART_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FOL-NART-STRING-CACHING-STATE*");
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSLATION-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SET-THEORY"), (SubLObject)SubLObjectFactory.makeKeyword("MT-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("ISA-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("UNARY-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("DWIM-TO-SINGLE-CONSTANT"));
        $str367$opencyc_all_20050422_non_conditio = SubLObjectFactory.makeString("opencyc-all-20050422-non-conditional");
        $list368 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subOrganizations")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typePrimaryFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bathtub")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TakingABath")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deviceUsed")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeBehaviorIncapable")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Doughnut")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Talking")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parts")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parts")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parts")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Baseball-Ball")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cube")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanInfant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Doctor-Medical")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrestrialFrameOfReferenceMt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?CUP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoffeeCup"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COFFEE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Coffee-Hot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-ContOpen")), (SubLObject)SubLObjectFactory.makeSymbol("?COFFEE"), (SubLObject)SubLObjectFactory.makeSymbol("?CUP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("orientation")), (SubLObject)SubLObjectFactory.makeSymbol("?CUP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightSideUp"))))));
        $list369 = _constant_369_initializer();
        $int370$60 = SubLObjectFactory.makeInteger(60);
        $kw371$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $list372 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)folification.NIL, (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)folification.ONE_INTEGER);
        $kw373$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $str374$_S___s___s____ = SubLObjectFactory.makeString("~S~%~s~%~s~%~%");
    }
}

/*

	Total time: 4850 ms
	 synthetic 
*/