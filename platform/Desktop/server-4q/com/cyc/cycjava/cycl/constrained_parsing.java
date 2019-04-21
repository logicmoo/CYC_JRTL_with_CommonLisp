package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.quirk.definitional_question;
import com.cyc.cycjava.cycl.quirk.question;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constrained_parsing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constrained_parsing";
    public static final String myFingerPrint = "d5e1cd29a368a344766ea5c3a6c6021ef28cc1c096ba406a7c7534cfa8185f6d";
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6222L)
    private static SubLSymbol $constrained_parsing_rankings$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6602L)
    private static SubLSymbol $constrained_parsing_without_assertingP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6912L)
    public static SubLSymbol $constrained_parsing_tracking_stringsP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7219L)
    public static SubLSymbol $constrained_parsing_tracking_substringsP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7924L)
    public static SubLSymbol $constrained_parsing_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8154L)
    private static SubLSymbol $constrained_parsing_action_log$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8911L)
    private static SubLSymbol $constrained_parsing_case_sensitiveP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9072L)
    private static SubLSymbol $constrained_parsing_assert_into_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9136L)
    private static SubLSymbol $constrained_parsing_consider_adjectivesP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9207L)
    private static SubLSymbol $constrained_parsing_cardinality_known$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9274L)
    private static SubLSymbol $constrained_parsing_allow_group_coercionP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9343L)
    private static SubLSymbol $new_isa_permissiveness_principles$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10040L)
    private static SubLSymbol $parsing_flow_control_principles$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLSymbol $dtp_parsing_faithfulness_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11154L)
    private static SubLSymbol $parsing_faithfulness_filter_types$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12147L)
    private static SubLSymbol $default_faithfulness_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12207L)
    private static SubLSymbol $default_definitional_faithfulness_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLSymbol $dtp_parsing_arbitrary_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12697L)
    private static SubLSymbol $parsing_arbitrary_filter_types$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13671L)
    private static SubLSymbol $default_assertion_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13726L)
    private static SubLSymbol $default_definitional_assertion_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13793L)
    private static SubLSymbol $bug_avoidance_principles$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 23828L)
    public static SubLSymbol $constrained_parsing_query_max_transformation_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 23957L)
    public static SubLSymbol $constrained_parsing_query_max_time$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24022L)
    public static SubLSymbol $constrained_parsing_query_productivity_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24417L)
    private static SubLSymbol $trace_new_cyc_queryP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24468L)
    private static SubLSymbol $debug_new_cyc_queryP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24518L)
    private static SubLSymbol $constrained_parsing_rewrite_backtrackingP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31097L)
    private static SubLSymbol $with_faithfulness_cutoffP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31196L)
    private static SubLSymbol $skip_definitional_faithfulnessP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31257L)
    private static SubLSymbol $with_arbitrary_filter_cutoffP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31316L)
    private static SubLSymbol $with_bug_avoidance_cutoffP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31372L)
    private static SubLSymbol $constrained_parsing_show_inference_metricsP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    private static SubLSymbol $acquaint_highly_relevant_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    private static SubLSymbol $acquaint_demo_assertion_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    private static SubLSymbol $acquaint_demo_lexical_assertion_filter$;
    private static final SubLObject $const0$SubcollectionDenotingFunction;
    private static final SubLSymbol $sym1$_CONSTRAINED_PARSING_RANKINGS_;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PWHEN;
    private static final SubLSymbol $sym8$__;
    private static final SubLSymbol $sym9$_CONSTRAINED_PARSING_TRACE_LEVEL_;
    private static final SubLSymbol $sym10$WARN;
    private static final SubLSymbol $sym11$_CONSTRAINED_PARSING_ACTION_LOG_;
    private static final SubLSymbol $kw12$AVOIDREDUNDANTFACETS;
    private static final SubLSymbol $kw13$PROHIBITSUBCOLLECTIONFNS;
    private static final SubLSymbol $kw14$PROHIBITAMBIGUOUSGAFS;
    private static final SubLSymbol $kw15$PERMISSIVENESSCUTOFF;
    private static final SubLSymbol $kw16$PERMITALLNONDISJOINTISAS;
    private static final SubLSymbol $kw17$PROHIBITGROUPCOERCION;
    private static final SubLSymbol $kw18$STRIPCARDINALITY;
    private static final SubLSymbol $kw19$CASESENSITIVELEXICON;
    private static final SubLSymbol $kw20$WIDESCOPEPRECISION;
    private static final SubLSymbol $kw21$PERMITADJECTIVEPARSES;
    private static final SubLSymbol $kw22$PERMITNARTISAS;
    private static final SubLSymbol $kw23$RELATIONALLINSTANCEPARSE;
    private static final SubLSymbol $kw24$NARROWSCOPEPRECISION;
    private static final SubLSymbol $kw25$CASEINSENSITIVELEXICON;
    private static final SubLSymbol $kw26$MINIMALTIMEPARSE;
    private static final SubLSymbol $kw27$PERMITRELATIVECLAUSEPARSES;
    private static final SubLSymbol $kw28$PERMITPPCOMPPARSES;
    private static final SubLSymbol $sym29$PARSING_FAITHFULNESS_FILTER;
    private static final SubLSymbol $sym30$PARSING_FAITHFULNESS_FILTER_P;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$PPRINT_FAITHFULNESS_FILTER;
    private static final SubLSymbol $sym36$PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PARSING_FAITHFULNESS_FILTER_TYPE;
    private static final SubLSymbol $sym39$_CSETF_PARSING_FAITHFULNESS_FILTER_TYPE;
    private static final SubLSymbol $sym40$PARSING_FAITHFULNESS_FILTER_MT;
    private static final SubLSymbol $sym41$_CSETF_PARSING_FAITHFULNESS_FILTER_MT;
    private static final SubLSymbol $kw42$TYPE;
    private static final SubLSymbol $kw43$MT;
    private static final SubLString $str44$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw45$BEGIN;
    private static final SubLSymbol $sym46$MAKE_PARSING_FAITHFULNESS_FILTER;
    private static final SubLSymbol $kw47$SLOT;
    private static final SubLSymbol $kw48$END;
    private static final SubLSymbol $sym49$VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD;
    private static final SubLString $str50$__PARSING_FAITHFULNESS_FILTER__A_;
    private static final SubLSymbol $kw51$OBEYISASINMT;
    private static final SubLSymbol $kw52$OBEYGAFSINMT;
    private static final SubLSymbol $kw53$FAITHFULNESSFILTERCUTOFF;
    private static final SubLSymbol $sym54$PARSING_FAITHFULNESS_FILTER_TYPE_P;
    private static final SubLSymbol $sym55$MT_IN_ANY_MT_;
    private static final SubLSymbol $sym56$PARSING_ARBITRARY_FILTER;
    private static final SubLSymbol $sym57$PARSING_ARBITRARY_FILTER_P;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$PPRINT_ARBITRARY_FILTER;
    private static final SubLSymbol $sym63$PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$PARSING_ARBITRARY_FILTER_TYPE;
    private static final SubLSymbol $sym66$_CSETF_PARSING_ARBITRARY_FILTER_TYPE;
    private static final SubLSymbol $sym67$PARSING_ARBITRARY_FILTER_DETAILS;
    private static final SubLSymbol $sym68$_CSETF_PARSING_ARBITRARY_FILTER_DETAILS;
    private static final SubLSymbol $sym69$PARSING_ARBITRARY_FILTER_MT;
    private static final SubLSymbol $sym70$_CSETF_PARSING_ARBITRARY_FILTER_MT;
    private static final SubLSymbol $kw71$DETAILS;
    private static final SubLSymbol $sym72$MAKE_PARSING_ARBITRARY_FILTER;
    private static final SubLSymbol $sym73$VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD;
    private static final SubLString $str74$__PARSING_ARBITRARY_FILTER__A__A_;
    private static final SubLSymbol $kw75$NOISASARESPECS;
    private static final SubLSymbol $kw76$ASSERTINTOMT;
    private static final SubLSymbol $kw77$ARBITRARYFILTERCUTOFF;
    private static final SubLSymbol $sym78$PARSING_ARBITRARY_FILTER_TYPE_P;
    private static final SubLSymbol $kw79$COMPENSATEFORISAPROBLEMS;
    private static final SubLSymbol $kw80$BUGAVOIDANCECUTOFF;
    private static final SubLSymbol $kw81$AVOIDREWRITEPARSES;
    private static final SubLSymbol $kw82$AVOIDNAMESTRINGPARSES;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$CDOLIST;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$CONSTRAINED_PARSING_PRINCIPLE_P;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$PARSING_FILTER_P;
    private static final SubLObject $const90$UniversalVocabularyMt;
    private static final SubLObject $const91$BaseKB;
    private static final SubLObject $const92$Relation;
    private static final SubLObject $const93$GrandLiftPredicate;
    private static final SubLSymbol $sym94$PARSING_CONSTRAINT_P;
    private static final SubLString $str95$A_constraint_can_t_outrank_itself;
    private static final SubLSymbol $kw96$PROMOTE;
    private static final SubLSymbol $kw97$DEMOTE;
    private static final SubLString $str98$_A_and_or__A_missing_from_ranking;
    private static final SubLInteger $int99$30;
    private static final SubLInteger $int100$2000000;
    private static final SubLSymbol $kw101$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw102$MAX_TIME;
    private static final SubLSymbol $kw103$PRODUCTIVITY_LIMIT;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const106$EverythingPSC;
    private static final SubLObject $const107$rewriteOf;
    private static final SubLObject $const108$InferencePSC;
    private static final SubLSymbol $kw109$PROBLEM_STORE;
    private static final SubLSymbol $kw110$RETURN;
    private static final SubLSymbol $kw111$TEMPLATE;
    private static final SubLSymbol $kw112$BROWSABLE_;
    private static final SubLSymbol $kw113$DEFAULT;
    private static final SubLSymbol $kw114$EXHAUST_TOTAL;
    private static final SubLSymbol $kw115$MAX_NUMBER;
    private static final SubLString $str116$_S_in__A_may_have_had_more_answer;
    private static final SubLString $str117$_S_in__A_exited_abnormally___A;
    private static final SubLObject $const118$EnglishMt;
    private static final SubLSymbol $kw119$BINDINGS;
    private static final SubLObject $const120$thereExists;
    private static final SubLSymbol $sym121$_RELN;
    private static final SubLObject $const122$and;
    private static final SubLObject $const123$argN;
    private static final SubLList $list124;
    private static final SubLObject $const125$genls;
    private static final SubLList $list126;
    private static final SubLObject $const127$not;
    private static final SubLObject $const128$isa;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$_KNOWN_TO_BE;
    private static final SubLObject $const131$operatorFormulas;
    private static final SubLObject $const132$GroupOfCardinalityFn;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$_COL2;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$_Y;
    private static final SubLSymbol $sym139$_X;
    private static final SubLList $list140;
    private static final SubLSymbol $kw141$NEEDED;
    private static final SubLString $str142$____investigating__A_faithfulness;
    private static final SubLSymbol $kw143$ARBITRARYFILTERCUTFF;
    private static final SubLString $str144$_____S_will_be_asserted_into__A__;
    private static final SubLSymbol $sym145$_COL;
    private static final SubLSymbol $sym146$EL_FORMULA_P;
    private static final SubLSymbol $sym147$UNASSERT;
    private static final SubLSymbol $sym148$HLMT_P;
    private static final SubLList $list149;
    private static final SubLObject $const150$Group;
    private static final SubLObject $const151$GroupFn;
    private static final SubLList $list152;
    private static final SubLObject $const153$hypothesizedIsaCoercedInto;
    private static final SubLList $list154;
    private static final SubLObject $const155$ist_Asserted;
    private static final SubLSymbol $sym156$_ANYWHERE;
    private static final SubLList $list157;
    private static final SubLObject $const158$sourceOfTerm;
    private static final SubLSymbol $kw159$MONOTONIC;
    private static final SubLSymbol $sym160$FI_ASSERT_INT;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $kw163$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw164$SOURCE;
    private static final SubLSymbol $kw165$RECORD_FILTER;
    private static final SubLSymbol $kw166$RECORD_NULL;
    private static final SubLSymbol $sym167$CHANNEL_SAYS;
    private static final SubLSymbol $sym168$CONSTRAINED_PARSING_POSSIBLY_ASSERT;
    private static final SubLSymbol $sym169$CAND;
    private static final SubLSymbol $sym170$CNOT;
    private static final SubLSymbol $sym171$CSETQ;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$COR;
    private static final SubLObject $const174$PositiveIntegerExtent;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLSymbol $sym177$GROUP_COL;
    private static final SubLSymbol $sym178$CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS;
    private static final SubLSymbol $sym179$LIST;
    private static final SubLString $str180$of;
    private static final SubLSymbol $sym181$_WU;
    private static final SubLObject $const182$prepositionStrings;
    private static final SubLObject $const183$partOfSpeech;
    private static final SubLSymbol $sym184$_POS;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$FORT_P;
    private static final SubLSymbol $sym187$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym188$STRINGP;
    private static final SubLSymbol $sym189$SUBCOLLECTION_NAUT_P;
    private static final SubLString $str190$____rejected_potential_parse_of__;
    private static final SubLObject $const191$nounStrings;
    private static final SubLSymbol $kw192$NADA;
    private static final SubLObject $const193$termPhrases;
    private static final SubLList $list194;
    private static final SubLString $str195$____remaining_parses_are__A_w_car;
    private static final SubLSymbol $kw196$WORK_DONE;
    private static final SubLSymbol $sym197$_COL_TYPE;
    private static final SubLSymbol $sym198$_FACETING_COL;
    private static final SubLSymbol $sym199$_SOMEWHERE;
    private static final SubLSymbol $sym200$_TERM_COL;
    private static final SubLList $list201;
    private static final SubLList $list202;
    private static final SubLList $list203;
    private static final SubLList $list204;
    private static final SubLList $list205;
    private static final SubLSymbol $kw206$ERROR;
    private static final SubLObject $const207$adjStrings;
    private static final SubLSymbol $kw208$ON;
    private static final SubLSymbol $kw209$OFF;
    private static final SubLString $str210$_;
    private static final SubLSymbol $sym211$_DENOT;
    private static final SubLObject $const212$Determiner;
    private static final SubLObject $const213$termStrings;
    private static final SubLList $list214;
    private static final SubLList $list215;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLObject $const219$preferredNameString;
    private static final SubLString $str220$____found__at_least___A_and__A_as;
    private static final SubLString $str221$____setting_rewrite_option_to__S;
    private static final SubLSymbol $sym222$_WHO;
    private static final SubLObject $const223$equals;
    private static final SubLList $list224;
    private static final SubLObject $const225$unknownSentence;
    private static final SubLList $list226;
    private static final SubLSymbol $sym227$LISTP;
    private static final SubLSymbol $kw228$IGNORE;
    private static final SubLObject $const229$or;
    private static final SubLObject $const230$subFields;
    private static final SubLObject $const231$admittedArgument;
    private static final SubLObject $const232$wordStrings;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$_FUNC;
    private static final SubLList $list235;
    private static final SubLObject $const236$RelationParaphraseMt;
    private static final SubLList $list237;
    private static final SubLList $list238;
    private static final SubLObject $const239$relationExistsInstance;
    private static final SubLObject $const240$Noun;
    private static final SubLList $list241;
    private static final SubLList $list242;
    private static final SubLSymbol $sym243$_PRED;
    private static final SubLList $list244;
    private static final SubLList $list245;
    private static final SubLObject $const246$Person;
    private static final SubLObject $const247$Organization;
    private static final SubLObject $const248$GeopoliticalEntity;
    private static final SubLList $list249;
    private static final SubLList $list250;
    private static final SubLObject $const251$substring;
    private static final SubLString $str252$___Co;
    private static final SubLString $str253$_Company;
    private static final SubLString $str254$_Plc;
    private static final SubLString $str255$_Ltd;
    private static final SubLObject $const256$Business;
    private static final SubLString $str257$_;
    private static final SubLList $list258;
    private static final SubLSymbol $sym259$_CONSTANT;
    private static final SubLList $list260;
    private static final SubLObject $const261$nameSpelling;
    private static final SubLObject $const262$givenNames;
    private static final SubLList $list263;
    private static final SubLObject $const264$familyName;
    private static final SubLSymbol $sym265$_SALUT;
    private static final SubLObject $const266$codeMapping;
    private static final SubLObject $const267$SalutationMapping;
    private static final SubLList $list268;
    private static final SubLObject $const269$relationAllInstance;
    private static final SubLObject $const270$salutation;
    private static final SubLObject $const271$BBN_CDE_StrengthenedMt;
    private static final SubLObject $const272$nameString;
    private static final SubLString $str273$____DEMO__initializing_rankings_w;
    private static final SubLString $str274$____DEMO__reverting_to_standard_c;
    private static final SubLSymbol $sym275$GET_RELEVANCE;
    private static final SubLSymbol $sym276$CAPITALIZED_STRING_P;
    private static final SubLString $str277$Who_is__A_;
    private static final SubLSymbol $sym278$DEFINITIONAL_QUESTION_P;
    private static final SubLString $str279$____processing__A;
    private static final SubLSymbol $sym280$GET_CONTENT;
    private static final SubLSymbol $sym281$ANSWER;
    private static final SubLString $str282$_S__;
    private static final SubLString $str283$____DEMO_____isa__A__A__wasn_t_fo;
    private static final SubLString $str284$Tony_Blair;
    private static final SubLObject $const285$TonyBlair;
    private static final SubLSymbol $sym286$_WHERE;
    private static final SubLList $list287;
    private static final SubLString $str288$____DEMO_____primeMinister_WHATEV;
    private static final SubLObject $const289$Warrior;
    private static final SubLString $str290$____DEMO____TonyBlair_was_mistake;
    private static final SubLString $str291$Saddam_Hussein;
    private static final SubLObject $const292$SaddamHusseinAl_Takriti;
    private static final SubLObject $const293$Vicious;
    private static final SubLObject $const294$PresidentFn;
    private static final SubLObject $const295$Iraq;
    private static final SubLString $str296$Bill_Clinton;
    private static final SubLObject $const297$BillClinton;
    private static final SubLObject $const298$UnitedStatesOfAmerica;
    private static final SubLString $str299$Osama;
    private static final SubLObject $const300$OsamaBinLaden;
    private static final SubLString $str301$____DEMO_____isa___SaddamHusseinA;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 3906L)
    public static SubLObject list_of_not_disjoint_collections_p(final SubLObject the_list) {
        SubLObject cdolist_list_var = the_list;
        SubLObject this_item = (SubLObject)constrained_parsing.NIL;
        this_item = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL == fort_types_interface.collection_in_any_mtP(this_item)) {
                return (SubLObject)constrained_parsing.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL == disjoint_with.any_disjoint_collection_pairP(the_list, (SubLObject)constrained_parsing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 4251L)
    public static SubLObject subcollection_naut_p(final SubLObject candidate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL != list_utilities.proper_list_p(candidate) && constrained_parsing.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(candidate), constrained_parsing.$const0$SubcollectionDenotingFunction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 4566L)
    public static SubLObject list_elements_preceding(final SubLObject v_object, final SubLObject list, SubLObject test) {
        if (test == constrained_parsing.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)constrained_parsing.EQL);
        }
        SubLObject appearing_before = (SubLObject)constrained_parsing.NIL;
        SubLObject found_itP = (SubLObject)constrained_parsing.NIL;
        if (constrained_parsing.NIL == found_itP) {
            SubLObject csome_list_var = list;
            SubLObject this_one = (SubLObject)constrained_parsing.NIL;
            this_one = csome_list_var.first();
            while (constrained_parsing.NIL == found_itP && constrained_parsing.NIL != csome_list_var) {
                if (constrained_parsing.NIL != Functions.funcall(test, this_one, v_object)) {
                    found_itP = (SubLObject)constrained_parsing.T;
                }
                else {
                    appearing_before = (SubLObject)ConsesLow.cons(this_one, appearing_before);
                }
                csome_list_var = csome_list_var.rest();
                this_one = csome_list_var.first();
            }
        }
        if (constrained_parsing.NIL != found_itP) {
            return Sequences.reverse(appearing_before);
        }
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 5170L)
    public static SubLObject rotate_list_around_pivot(final SubLObject list, final SubLObject the_pivot, SubLObject test) {
        if (test == constrained_parsing.UNPROVIDED) {
            test = (SubLObject)constrained_parsing.EQUAL;
        }
        SubLObject new_list = (SubLObject)constrained_parsing.NIL;
        SubLObject the_copy;
        SubLObject found_pivotP;
        for (the_copy = conses_high.copy_list(list), found_pivotP = (SubLObject)constrained_parsing.NIL; constrained_parsing.NIL != the_copy && constrained_parsing.NIL == found_pivotP; the_copy = the_copy.rest()) {
            if (constrained_parsing.NIL != Functions.funcall(test, the_copy.first(), the_pivot)) {
                found_pivotP = (SubLObject)constrained_parsing.T;
            }
            else {
                new_list = (SubLObject)ConsesLow.cons(the_copy.first(), new_list);
            }
        }
        if (constrained_parsing.NIL == found_pivotP) {
            return list;
        }
        new_list = Sequences.reverse(new_list);
        SubLObject cdolist_list_var = Sequences.reverse(the_copy);
        SubLObject this_item = (SubLObject)constrained_parsing.NIL;
        this_item = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            new_list = (SubLObject)ConsesLow.cons(this_item, new_list);
            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        }
        return new_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6493L)
    public static SubLObject current_parsing_constraint_rankings() {
        return conses_high.copy_list(constrained_parsing.$constrained_parsing_rankings$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6671L)
    public static SubLObject without_asserting_gafs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym2$CLET, (SubLObject)constrained_parsing.$list3, ConsesLow.append(body, (SubLObject)constrained_parsing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6801L)
    public static SubLObject constrained_parsing_assert_gafsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL == constrained_parsing.$constrained_parsing_without_assertingP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6982L)
    public static SubLObject while_tracking_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym2$CLET, (SubLObject)constrained_parsing.$list4, ConsesLow.append(body, (SubLObject)constrained_parsing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7111L)
    public static SubLObject constrained_parsing_tracking_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return constrained_parsing.$constrained_parsing_tracking_stringsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7292L)
    public static SubLObject while_tracking_substrings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym2$CLET, (SubLObject)constrained_parsing.$list5, ConsesLow.append(body, (SubLObject)constrained_parsing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7427L)
    public static SubLObject constrained_parsing_tracking_substringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return constrained_parsing.$constrained_parsing_tracking_substringsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7541L)
    public static SubLObject constrained_parsing_choose_string_sources(final SubLObject full, final SubLObject partial) {
        if (constrained_parsing.NIL != constrained_parsing_tracking_stringsP()) {
            return full;
        }
        if (constrained_parsing.NIL != constrained_parsing_tracking_substringsP()) {
            return partial;
        }
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7986L)
    public static SubLObject constrained_parsing_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)constrained_parsing.NIL;
        SubLObject format_str = (SubLObject)constrained_parsing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list6);
        level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list6);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym8$__, (SubLObject)constrained_parsing.$sym9$_CONSTRAINED_PARSING_TRACE_LEVEL_, level), (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym10$WARN, format_str, ConsesLow.append(args, (SubLObject)constrained_parsing.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8322L)
    public static SubLObject constrained_parsing_get_actions() {
        return Sequences.reverse(constrained_parsing.$constrained_parsing_action_log$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8427L)
    public static SubLObject constrained_parsing_clear_actions() {
        constrained_parsing.$constrained_parsing_action_log$.setGlobalValue((SubLObject)constrained_parsing.NIL);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8542L)
    public static SubLObject constrained_parsing_record_action(final SubLObject function, final SubLObject args) {
        final SubLObject push_me = (SubLObject)ConsesLow.cons(function, args);
        constrained_parsing.$constrained_parsing_action_log$.setGlobalValue((SubLObject)ConsesLow.cons(push_me, constrained_parsing.$constrained_parsing_action_log$.getGlobalValue()));
        return constrained_parsing.$constrained_parsing_action_log$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9760L)
    public static SubLObject get_new_isa_permissiveness_principles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(constrained_parsing.$new_isa_permissiveness_principles$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9876L)
    public static SubLObject new_isa_permissiveness_principle_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(candidate.isKeyword() && constrained_parsing.NIL != subl_promotions.memberP(candidate, constrained_parsing.$new_isa_permissiveness_principles$.getDynamicValue(thread), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10497L)
    public static SubLObject get_parsing_flow_control_principles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(constrained_parsing.$parsing_flow_control_principles$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10609L)
    public static SubLObject parsing_flow_control_principle_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(candidate.isKeyword() && constrained_parsing.NIL != subl_promotions.memberP(candidate, constrained_parsing.$parsing_flow_control_principles$.getDynamicValue(thread), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject parsing_faithfulness_filter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_faithfulness_filter(v_object, stream, (SubLObject)constrained_parsing.ZERO_INTEGER);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject parsing_faithfulness_filter_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $parsing_faithfulness_filter_native.class) ? constrained_parsing.T : constrained_parsing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject parsing_faithfulness_filter_type(final SubLObject v_object) {
        assert constrained_parsing.NIL != parsing_faithfulness_filter_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject parsing_faithfulness_filter_mt(final SubLObject v_object) {
        assert constrained_parsing.NIL != parsing_faithfulness_filter_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject _csetf_parsing_faithfulness_filter_type(final SubLObject v_object, final SubLObject value) {
        assert constrained_parsing.NIL != parsing_faithfulness_filter_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject _csetf_parsing_faithfulness_filter_mt(final SubLObject v_object, final SubLObject value) {
        assert constrained_parsing.NIL != parsing_faithfulness_filter_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject make_parsing_faithfulness_filter(SubLObject arglist) {
        if (arglist == constrained_parsing.UNPROVIDED) {
            arglist = (SubLObject)constrained_parsing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $parsing_faithfulness_filter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)constrained_parsing.NIL, next = arglist; constrained_parsing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)constrained_parsing.$kw42$TYPE)) {
                _csetf_parsing_faithfulness_filter_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)constrained_parsing.$kw43$MT)) {
                _csetf_parsing_faithfulness_filter_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)constrained_parsing.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject visit_defstruct_parsing_faithfulness_filter(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw45$BEGIN, (SubLObject)constrained_parsing.$sym46$MAKE_PARSING_FAITHFULNESS_FILTER, (SubLObject)constrained_parsing.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw47$SLOT, (SubLObject)constrained_parsing.$kw42$TYPE, parsing_faithfulness_filter_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw47$SLOT, (SubLObject)constrained_parsing.$kw43$MT, parsing_faithfulness_filter_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw48$END, (SubLObject)constrained_parsing.$sym46$MAKE_PARSING_FAITHFULNESS_FILTER, (SubLObject)constrained_parsing.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
    public static SubLObject visit_defstruct_object_parsing_faithfulness_filter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parsing_faithfulness_filter(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10902L)
    public static SubLObject pprint_faithfulness_filter(final SubLObject filter, SubLObject stream, SubLObject depth) {
        if (stream == constrained_parsing.UNPROVIDED) {
            stream = (SubLObject)constrained_parsing.NIL;
        }
        if (depth == constrained_parsing.UNPROVIDED) {
            depth = (SubLObject)constrained_parsing.NIL;
        }
        PrintLow.format(stream, (SubLObject)constrained_parsing.$str50$__PARSING_FAITHFULNESS_FILTER__A_, parsing_faithfulness_filter_type(filter), parsing_faithfulness_filter_mt(filter));
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11533L)
    public static SubLObject get_parsing_faithfulness_filter_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(constrained_parsing.$parsing_faithfulness_filter_types$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11649L)
    public static SubLObject parsing_faithfulness_filter_type_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(candidate, constrained_parsing.$parsing_faithfulness_filter_types$.getDynamicValue(thread), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11779L)
    public static SubLObject get_parsing_faithfulness_filters() {
        return list_utilities.find_all_if((SubLObject)constrained_parsing.$sym30$PARSING_FAITHFULNESS_FILTER_P, current_parsing_constraint_rankings(), (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11925L)
    public static SubLObject new_parsing_faithfulness_filter(final SubLObject filter, final SubLObject mt) {
        assert constrained_parsing.NIL != parsing_faithfulness_filter_type_p(filter) : filter;
        assert constrained_parsing.NIL != fort_types_interface.mt_in_any_mtP(mt) : mt;
        return make_parsing_faithfulness_filter((SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw42$TYPE, filter, (SubLObject)constrained_parsing.$kw43$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject parsing_arbitrary_filter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_arbitrary_filter(v_object, stream, (SubLObject)constrained_parsing.ZERO_INTEGER);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject parsing_arbitrary_filter_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $parsing_arbitrary_filter_native.class) ? constrained_parsing.T : constrained_parsing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject parsing_arbitrary_filter_type(final SubLObject v_object) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject parsing_arbitrary_filter_details(final SubLObject v_object) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject parsing_arbitrary_filter_mt(final SubLObject v_object) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject _csetf_parsing_arbitrary_filter_type(final SubLObject v_object, final SubLObject value) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject _csetf_parsing_arbitrary_filter_details(final SubLObject v_object, final SubLObject value) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject _csetf_parsing_arbitrary_filter_mt(final SubLObject v_object, final SubLObject value) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject make_parsing_arbitrary_filter(SubLObject arglist) {
        if (arglist == constrained_parsing.UNPROVIDED) {
            arglist = (SubLObject)constrained_parsing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $parsing_arbitrary_filter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)constrained_parsing.NIL, next = arglist; constrained_parsing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)constrained_parsing.$kw42$TYPE)) {
                _csetf_parsing_arbitrary_filter_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)constrained_parsing.$kw71$DETAILS)) {
                _csetf_parsing_arbitrary_filter_details(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)constrained_parsing.$kw43$MT)) {
                _csetf_parsing_arbitrary_filter_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)constrained_parsing.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject visit_defstruct_parsing_arbitrary_filter(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw45$BEGIN, (SubLObject)constrained_parsing.$sym72$MAKE_PARSING_ARBITRARY_FILTER, (SubLObject)constrained_parsing.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw47$SLOT, (SubLObject)constrained_parsing.$kw42$TYPE, parsing_arbitrary_filter_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw47$SLOT, (SubLObject)constrained_parsing.$kw71$DETAILS, parsing_arbitrary_filter_details(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw47$SLOT, (SubLObject)constrained_parsing.$kw43$MT, parsing_arbitrary_filter_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)constrained_parsing.$kw48$END, (SubLObject)constrained_parsing.$sym72$MAKE_PARSING_ARBITRARY_FILTER, (SubLObject)constrained_parsing.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
    public static SubLObject visit_defstruct_object_parsing_arbitrary_filter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parsing_arbitrary_filter(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12409L)
    public static SubLObject pprint_arbitrary_filter(final SubLObject filter, SubLObject stream, SubLObject depth) {
        if (stream == constrained_parsing.UNPROVIDED) {
            stream = (SubLObject)constrained_parsing.NIL;
        }
        if (depth == constrained_parsing.UNPROVIDED) {
            depth = (SubLObject)constrained_parsing.NIL;
        }
        PrintLow.format(stream, (SubLObject)constrained_parsing.$str74$__PARSING_ARBITRARY_FILTER__A__A_, new SubLObject[] { parsing_arbitrary_filter_type(filter), parsing_arbitrary_filter_details(filter), parsing_arbitrary_filter_mt(filter) });
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13005L)
    public static SubLObject get_parsing_arbitrary_filter_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(constrained_parsing.$parsing_arbitrary_filter_types$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13169L)
    public static SubLObject parsing_arbitrary_filter_type_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(candidate, constrained_parsing.$parsing_arbitrary_filter_types$.getDynamicValue(thread), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13293L)
    public static SubLObject get_parsing_arbitrary_filters() {
        return list_utilities.find_all_if((SubLObject)constrained_parsing.$sym57$PARSING_ARBITRARY_FILTER_P, current_parsing_constraint_rankings(), (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13433L)
    public static SubLObject new_parsing_arbitrary_filter(final SubLObject filter, final SubLObject details, final SubLObject mt) {
        assert constrained_parsing.NIL != parsing_arbitrary_filter_type_p(filter) : filter;
        assert constrained_parsing.NIL != fort_types_interface.mt_in_any_mtP(mt) : mt;
        return make_parsing_arbitrary_filter((SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw42$TYPE, filter, (SubLObject)constrained_parsing.$kw71$DETAILS, details, (SubLObject)constrained_parsing.$kw43$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14123L)
    public static SubLObject get_bug_avoidance_principles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(constrained_parsing.$bug_avoidance_principles$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14221L)
    public static SubLObject bug_avoidance_principle_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(candidate.isKeyword() && constrained_parsing.NIL != subl_promotions.memberP(candidate, constrained_parsing.$bug_avoidance_principles$.getDynamicValue(thread), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14367L)
    public static SubLObject parsing_principle_p(final SubLObject candidate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL != new_isa_permissiveness_principle_p(candidate) || constrained_parsing.NIL != parsing_flow_control_principle_p(candidate) || constrained_parsing.NIL != bug_avoidance_principle_p(candidate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14632L)
    public static SubLObject parsing_filter_p(final SubLObject candidate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL != parsing_faithfulness_filter_p(candidate) || constrained_parsing.NIL != parsing_arbitrary_filter_p(candidate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14780L)
    public static SubLObject parsing_filter_type_p(final SubLObject candidate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL != parsing_faithfulness_filter_type_p(candidate) || constrained_parsing.NIL != parsing_arbitrary_filter_type_p(candidate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14943L)
    public static SubLObject get_all_parsing_principles() {
        return list_utilities.flatten((SubLObject)ConsesLow.list(get_parsing_flow_control_principles(), get_new_isa_permissiveness_principles(), get_bug_avoidance_principles()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15144L)
    public static SubLObject get_all_parsing_filter_types() {
        return list_utilities.flatten((SubLObject)ConsesLow.list(get_parsing_faithfulness_filter_types(), get_parsing_arbitrary_filter_types()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15305L)
    public static SubLObject get_all_parsing_filters() {
        return list_utilities.flatten((SubLObject)ConsesLow.list(get_parsing_faithfulness_filters(), get_parsing_arbitrary_filters()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15451L)
    public static SubLObject get_all_parsing_constraints() {
        return list_utilities.flatten((SubLObject)ConsesLow.list(get_all_parsing_principles(), get_all_parsing_filter_types(), get_all_parsing_filters()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15612L)
    public static SubLObject parsing_constraint_p(final SubLObject candidate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_parsing.NIL != parsing_principle_p(candidate) || constrained_parsing.NIL != parsing_filter_type_p(candidate) || constrained_parsing.NIL != parsing_filter_p(candidate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15784L)
    public static SubLObject do_constrained_parsing_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint = (SubLObject)constrained_parsing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list83);
        constraint = current.first();
        current = current.rest();
        if (constrained_parsing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym84$CDOLIST, reader.bq_cons(constraint, (SubLObject)constrained_parsing.$list85), ConsesLow.append(body, (SubLObject)constrained_parsing.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list83);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15946L)
    public static SubLObject do_constrained_parsing_principles(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject principle = (SubLObject)constrained_parsing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list86);
        principle = current.first();
        current = current.rest();
        if (constrained_parsing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym84$CDOLIST, reader.bq_cons(principle, (SubLObject)constrained_parsing.$list85), (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym87$CONSTRAINED_PARSING_PRINCIPLE_P, principle), ConsesLow.append(body, (SubLObject)constrained_parsing.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list86);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 16162L)
    public static SubLObject do_constrained_parsing_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filter = (SubLObject)constrained_parsing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list88);
        filter = current.first();
        current = current.rest();
        if (constrained_parsing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym84$CDOLIST, reader.bq_cons(filter, (SubLObject)constrained_parsing.$list85), (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym89$PARSING_FILTER_P, filter), ConsesLow.append(body, (SubLObject)constrained_parsing.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list88);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 16351L)
    public static SubLObject initialize_constrained_parsing(SubLObject skip_gafsP, SubLObject skip_safety_netP) {
        if (skip_gafsP == constrained_parsing.UNPROVIDED) {
            skip_gafsP = (SubLObject)constrained_parsing.NIL;
        }
        if (skip_safety_netP == constrained_parsing.UNPROVIDED) {
            skip_safety_netP = (SubLObject)constrained_parsing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        constrained_parsing.$constrained_parsing_rankings$.setGlobalValue((SubLObject)constrained_parsing.NIL);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw53$FAITHFULNESSFILTERCUTOFF, (SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw77$ARBITRARYFILTERCUTOFF, (SubLObject)constrained_parsing.$kw53$FAITHFULNESSFILTERCUTOFF, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw15$PERMISSIVENESSCUTOFF, (SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.$kw16$PERMITALLNONDISJOINTISAS, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.$kw28$PERMITPPCOMPPARSES, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.$kw27$PERMITRELATIVECLAUSEPARSES, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw24$NARROWSCOPEPRECISION, (SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.UNPROVIDED);
        frontload_parsing_constraint((SubLObject)constrained_parsing.$kw20$WIDESCOPEPRECISION);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw18$STRIPCARDINALITY, (SubLObject)constrained_parsing.$kw20$WIDESCOPEPRECISION, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw19$CASESENSITIVELEXICON, (SubLObject)constrained_parsing.$kw20$WIDESCOPEPRECISION, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw24$NARROWSCOPEPRECISION, (SubLObject)constrained_parsing.$kw25$CASEINSENSITIVELEXICON, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw23$RELATIONALLINSTANCEPARSE, (SubLObject)constrained_parsing.$kw15$PERMISSIVENESSCUTOFF, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw22$PERMITNARTISAS, (SubLObject)constrained_parsing.$kw23$RELATIONALLINSTANCEPARSE, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw20$WIDESCOPEPRECISION, (SubLObject)constrained_parsing.$kw21$PERMITADJECTIVEPARSES, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw12$AVOIDREDUNDANTFACETS, (SubLObject)constrained_parsing.$kw21$PERMITADJECTIVEPARSES, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw13$PROHIBITSUBCOLLECTIONFNS, (SubLObject)constrained_parsing.$kw23$RELATIONALLINSTANCEPARSE, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw14$PROHIBITAMBIGUOUSGAFS, (SubLObject)constrained_parsing.$kw23$RELATIONALLINSTANCEPARSE, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF, (SubLObject)constrained_parsing.$kw81$AVOIDREWRITEPARSES, (SubLObject)constrained_parsing.UNPROVIDED);
        order_parsing_constraints((SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF, (SubLObject)constrained_parsing.$kw82$AVOIDNAMESTRINGPARSES, (SubLObject)constrained_parsing.UNPROVIDED);
        if (constrained_parsing.NIL == constrained_parsing.$default_definitional_faithfulness_filter$.getDynamicValue(thread)) {
            constrained_parsing.$default_definitional_faithfulness_filter$.setDynamicValue(new_parsing_faithfulness_filter((SubLObject)constrained_parsing.$kw51$OBEYISASINMT, constrained_parsing.$const90$UniversalVocabularyMt), thread);
        }
        if (constrained_parsing.NIL == constrained_parsing.$default_faithfulness_filter$.getDynamicValue(thread)) {
            constrained_parsing.$default_faithfulness_filter$.setDynamicValue(new_parsing_faithfulness_filter((SubLObject)constrained_parsing.$kw52$OBEYGAFSINMT, constrained_parsing.$const91$BaseKB), thread);
        }
        if (constrained_parsing.NIL == skip_safety_netP) {
            frontload_parsing_constraint(constrained_parsing.$default_faithfulness_filter$.getDynamicValue(thread));
            frontload_parsing_constraint(constrained_parsing.$default_definitional_faithfulness_filter$.getDynamicValue(thread));
        }
        frontload_parsing_constraint((SubLObject)constrained_parsing.$kw79$COMPENSATEFORISAPROBLEMS);
        if (constrained_parsing.NIL == constrained_parsing.$default_assertion_filter$.getDynamicValue(thread)) {
            constrained_parsing.$default_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter((SubLObject)constrained_parsing.$kw76$ASSERTINTOMT, constrained_parsing.$const92$Relation, constrained_parsing.$const91$BaseKB), thread);
        }
        if (constrained_parsing.NIL == constrained_parsing.$default_definitional_assertion_filter$.getDynamicValue(thread)) {
            constrained_parsing.$default_definitional_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter((SubLObject)constrained_parsing.$kw76$ASSERTINTOMT, constrained_parsing.$const93$GrandLiftPredicate, constrained_parsing.$const90$UniversalVocabularyMt), thread);
        }
        if (constrained_parsing.NIL == skip_gafsP) {
            frontload_parsing_constraint(constrained_parsing.$default_assertion_filter$.getDynamicValue(thread));
            order_parsing_constraints(constrained_parsing.$default_definitional_assertion_filter$.getDynamicValue(thread), constrained_parsing.$default_assertion_filter$.getDynamicValue(thread), (SubLObject)constrained_parsing.UNPROVIDED);
        }
        return current_parsing_constraint_rankings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 19561L)
    public static SubLObject parsing_constraint_outranksP(final SubLObject a, final SubLObject b) {
        final SubLObject indexa = Sequences.position(a, current_parsing_constraint_rankings(), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
        final SubLObject indexb = Sequences.position(b, current_parsing_constraint_rankings(), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(indexa.isNumber() && (!indexb.isNumber() || indexa.numL(indexb)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 19845L)
    public static SubLObject which_constraints_outrank(final SubLObject constraint) {
        if (constrained_parsing.NIL == parsing_constraint_p(constraint)) {
            return (SubLObject)constrained_parsing.NIL;
        }
        return list_elements_preceding(constraint, current_parsing_constraint_rankings(), (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 20047L)
    public static SubLObject order_parsing_constraints(final SubLObject wins, final SubLObject loses, SubLObject come_togetherP) {
        if (come_togetherP == constrained_parsing.UNPROVIDED) {
            come_togetherP = (SubLObject)constrained_parsing.NIL;
        }
        assert constrained_parsing.NIL != parsing_constraint_p(wins) : wins;
        assert constrained_parsing.NIL != parsing_constraint_p(loses) : loses;
        if (wins.eql(loses)) {
            Errors.error((SubLObject)constrained_parsing.$str95$A_constraint_can_t_outrank_itself);
        }
        else {
            final SubLObject before = current_parsing_constraint_rankings();
            if (constrained_parsing.NIL == before) {
                constrained_parsing.$constrained_parsing_rankings$.setGlobalValue((SubLObject)ConsesLow.list(wins, loses));
            }
            else if (constrained_parsing.NIL == subl_promotions.memberP(wins, before, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL == subl_promotions.memberP(loses, before, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                if (come_togetherP.eql((SubLObject)constrained_parsing.$kw96$PROMOTE)) {
                    constrained_parsing.$constrained_parsing_rankings$.setGlobalValue((SubLObject)ConsesLow.cons(loses, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue()));
                    constrained_parsing.$constrained_parsing_rankings$.setGlobalValue((SubLObject)ConsesLow.cons(wins, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue()));
                }
                else {
                    constrained_parsing.$constrained_parsing_rankings$.setGlobalValue(ConsesLow.append(constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), (SubLObject)ConsesLow.list(wins, loses)));
                }
            }
            else {
                final SubLObject winner_at = Sequences.position(wins, before, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                final SubLObject loser_at = Sequences.position(loses, before, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                if (constrained_parsing.NIL == winner_at) {
                    if (loser_at.numE((SubLObject)constrained_parsing.ZERO_INTEGER)) {
                        constrained_parsing.$constrained_parsing_rankings$.setGlobalValue((SubLObject)ConsesLow.cons(wins, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue()));
                    }
                    else {
                        list_utilities.ninsert_by_position(wins, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), loser_at);
                    }
                }
                else if (constrained_parsing.NIL == loser_at) {
                    list_utilities.ninsert_by_position(loses, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X(winner_at));
                }
                else if (loser_at.numL(winner_at)) {
                    if (come_togetherP.eql((SubLObject)constrained_parsing.$kw96$PROMOTE)) {
                        list_utilities.remove_nth(winner_at, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue());
                        list_utilities.ninsert_by_position(wins, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), loser_at);
                    }
                    else {
                        constrained_parsing.$constrained_parsing_rankings$.setGlobalValue(list_utilities.remove_nth(loser_at, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue()));
                        list_utilities.ninsert_by_position(loses, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), winner_at);
                    }
                }
                else if (come_togetherP.eql((SubLObject)constrained_parsing.$kw96$PROMOTE)) {
                    list_utilities.remove_nth(loser_at, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue());
                    list_utilities.ninsert_by_position(loses, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X(winner_at));
                }
                else if (come_togetherP.eql((SubLObject)constrained_parsing.$kw97$DEMOTE)) {
                    list_utilities.ninsert_by_position(wins, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X(loser_at));
                    list_utilities.remove_nth(winner_at, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue());
                }
            }
        }
        final SubLObject after = current_parsing_constraint_rankings();
        if (constrained_parsing.NIL == subl_promotions.memberP(wins, after, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) || constrained_parsing.NIL == subl_promotions.memberP(loses, after, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
            Errors.error((SubLObject)constrained_parsing.$str98$_A_and_or__A_missing_from_ranking, wins, loses, after);
        }
        return after;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 23436L)
    public static SubLObject frontload_parsing_constraint(final SubLObject constraint) {
        assert constrained_parsing.NIL != parsing_constraint_p(constraint) : constraint;
        if (constrained_parsing.NIL != subl_promotions.memberP(constraint, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), Symbols.symbol_function((SubLObject)constrained_parsing.EQUAL), (SubLObject)constrained_parsing.UNPROVIDED)) {
            constrained_parsing.$constrained_parsing_rankings$.setGlobalValue(list_utilities.move_to_front(constraint, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue(), Symbols.symbol_function((SubLObject)constrained_parsing.EQUAL)));
        }
        else {
            constrained_parsing.$constrained_parsing_rankings$.setGlobalValue((SubLObject)ConsesLow.cons(constraint, constrained_parsing.$constrained_parsing_rankings$.getGlobalValue()));
        }
        return current_parsing_constraint_rankings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24102L)
    public static SubLObject constrained_parsing_query_defaults() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw101$MAX_TRANSFORMATION_DEPTH, constrained_parsing.$constrained_parsing_query_max_transformation_depth$.getDynamicValue(thread), (SubLObject)constrained_parsing.$kw102$MAX_TIME, constrained_parsing.$constrained_parsing_query_max_time$.getDynamicValue(thread), (SubLObject)constrained_parsing.$kw103$PRODUCTIVITY_LIMIT, constrained_parsing.$constrained_parsing_query_productivity_limit$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24587L)
    public static SubLObject without_rewrite_backtracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym2$CLET, (SubLObject)constrained_parsing.$list104, ConsesLow.append(body, (SubLObject)constrained_parsing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24726L)
    public static SubLObject constrained_parsing_rewrite_backtracking(final SubLObject raw_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL == constrained_parsing.$constrained_parsing_rewrite_backtrackingP$.getDynamicValue(thread)) {
            return raw_query;
        }
        SubLObject revised_query = (SubLObject)constrained_parsing.NIL;
        SubLObject cdolist_list_var = raw_query;
        SubLObject this_term = (SubLObject)constrained_parsing.NIL;
        this_term = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (this_term.isList()) {
                revised_query = (SubLObject)ConsesLow.cons(constrained_parsing_rewrite_backtracking(this_term), revised_query);
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)constrained_parsing.$sym105$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(constrained_parsing.$const106$EverythingPSC, thread);
                    final SubLObject extent = kb_mapping.gather_gaf_arg_index(this_term, (SubLObject)constrained_parsing.TWO_INTEGER, constrained_parsing.$const107$rewriteOf, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                    if (constrained_parsing.NIL != list_utilities.singletonP(extent)) {
                        revised_query = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(assertions_high.assertion_formula(extent.first()), (SubLObject)constrained_parsing.UNPROVIDED), revised_query);
                    }
                    else {
                        revised_query = (SubLObject)ConsesLow.cons(this_term, revised_query);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_term = cdolist_list_var.first();
        }
        return Sequences.reverse(revised_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 25613L)
    public static SubLObject constrained_parsing_query(final SubLObject answer_type, final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == constrained_parsing.UNPROVIDED) {
            mt = constrained_parsing.$const108$InferencePSC;
        }
        if (v_properties == constrained_parsing.UNPROVIDED) {
            v_properties = (SubLObject)constrained_parsing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL == sentence) {
            return (SubLObject)constrained_parsing.NIL;
        }
        SubLObject the_answer = (SubLObject)constrained_parsing.NIL;
        SubLObject problem_store = (SubLObject)constrained_parsing.NIL;
        try {
            problem_store = inference_datastructures_problem_store.new_problem_store((SubLObject)constrained_parsing.NIL);
            final SubLObject the_sentence = (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_rewrite_backtrackingP$.getDynamicValue(thread)) ? constrained_parsing_rewrite_backtracking(sentence) : sentence;
            final SubLObject query_properties = ConsesLow.append(conses_high.putf(conses_high.putf(conses_high.putf(constrained_parsing_query_defaults(), (SubLObject)constrained_parsing.$kw109$PROBLEM_STORE, problem_store), (SubLObject)constrained_parsing.$kw110$RETURN, (SubLObject)(answer_type.isKeyword() ? answer_type : ConsesLow.list((SubLObject)constrained_parsing.$kw111$TEMPLATE, answer_type))), (SubLObject)constrained_parsing.$kw112$BROWSABLE_, (SubLObject)constrained_parsing.T), v_properties);
            SubLObject inference_suspend_status = (SubLObject)constrained_parsing.NIL;
            final SubLObject undo_traceP = (SubLObject)constrained_parsing.NIL;
            thread.resetMultipleValues();
            final SubLObject the_answer_$1 = inference_kernel.new_cyc_query(the_sentence, mt.eql((SubLObject)constrained_parsing.$kw113$DEFAULT) ? constrained_parsing.$const108$InferencePSC : mt, query_properties);
            final SubLObject inference_suspend_status_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            the_answer = the_answer_$1;
            inference_suspend_status = inference_suspend_status_$2;
            if (constrained_parsing.NIL != constrained_parsing.$debug_new_cyc_queryP$.getDynamicValue(thread)) {
                if (!inference_suspend_status.eql((SubLObject)constrained_parsing.$kw114$EXHAUST_TOTAL)) {
                    if (inference_suspend_status.eql((SubLObject)constrained_parsing.$kw115$MAX_NUMBER)) {
                        if (constrained_parsing.$constrained_parsing_trace_level$.getDynamicValue(thread).numGE((SubLObject)constrained_parsing.TWO_INTEGER)) {
                            Errors.warn((SubLObject)constrained_parsing.$str116$_S_in__A_may_have_had_more_answer, the_sentence, mt);
                        }
                    }
                    else {
                        Errors.sublisp_break((SubLObject)constrained_parsing.$str117$_S_in__A_exited_abnormally___A, new SubLObject[] { the_sentence, mt, inference_suspend_status });
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)constrained_parsing.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(problem_store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return answer_type.isKeyword() ? cyc_kernel.closed_query_success_result_p(the_answer) : the_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 27846L)
    public static SubLObject constrained_parsing_query_lexical(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == constrained_parsing.UNPROVIDED) {
            mt = constrained_parsing.$const118$EnglishMt;
        }
        if (v_properties == constrained_parsing.UNPROVIDED) {
            v_properties = (SubLObject)constrained_parsing.NIL;
        }
        return constrained_parsing_query(template, sentence, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 28114L)
    public static SubLObject constrained_parsing_query_successP(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == constrained_parsing.UNPROVIDED) {
            mt = (SubLObject)constrained_parsing.$kw113$DEFAULT;
        }
        if (v_properties == constrained_parsing.UNPROVIDED) {
            v_properties = (SubLObject)constrained_parsing.NIL;
        }
        return constrained_parsing_query((SubLObject)constrained_parsing.$kw119$BINDINGS, sentence, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 28393L)
    public static SubLObject constrained_parse_involves_group_coercionP(final SubLObject gaf, SubLObject mt) {
        if (mt == constrained_parsing.UNPROVIDED) {
            mt = (SubLObject)constrained_parsing.$kw113$DEFAULT;
        }
        if (constrained_parsing.NIL == el_utilities.el_binary_formula_p(gaf)) {
            return (SubLObject)constrained_parsing.NIL;
        }
        if (constrained_parsing.NIL == constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym121$_RELN, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const123$argN, (SubLObject)constrained_parsing.$sym121$_RELN, (SubLObject)constrained_parsing.ZERO_INTEGER, gaf), (SubLObject)constrained_parsing.$list124, (SubLObject)ConsesLow.listS(constrained_parsing.$const125$genls, cycl_utilities.formula_arg2(gaf, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.$list126))), mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return (SubLObject)constrained_parsing.T;
        }
        if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, cycl_utilities.formula_arg1(gaf, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.$list126)), mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return (SubLObject)constrained_parsing.T;
        }
        if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, cycl_utilities.formula_arg1(gaf, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.$list129), mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return (SubLObject)constrained_parsing.T;
        }
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 29589L)
    public static SubLObject constrained_parsing_illegal_isa_workaroundP(final SubLObject gaf, SubLObject mt) {
        if (mt == constrained_parsing.UNPROVIDED) {
            mt = (SubLObject)constrained_parsing.$kw113$DEFAULT;
        }
        if (constrained_parsing.NIL == constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym121$_RELN, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const123$argN, (SubLObject)constrained_parsing.$sym121$_RELN, (SubLObject)constrained_parsing.ZERO_INTEGER, gaf), (SubLObject)constrained_parsing.$list124, (SubLObject)ConsesLow.listS(constrained_parsing.$const125$genls, cycl_utilities.formula_arg2(gaf, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.$list126))), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return (SubLObject)constrained_parsing.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject relevant_isas = cdolist_list_var = constrained_parsing_query((SubLObject)constrained_parsing.$sym130$_KNOWN_TO_BE, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, new SubLObject[] { ConsesLow.list(constrained_parsing.$const131$operatorFormulas, constrained_parsing.$const132$GroupOfCardinalityFn, cycl_utilities.formula_arg2(gaf, (SubLObject)constrained_parsing.UNPROVIDED)), ConsesLow.listS(constrained_parsing.$const128$isa, cycl_utilities.formula_arg1(gaf, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.$list133), constrained_parsing.$list134, constrained_parsing.$list135, ConsesLow.list(constrained_parsing.$const123$argN, (SubLObject)constrained_parsing.$sym136$_COL2, (SubLObject)constrained_parsing.ONE_INTEGER, cycl_utilities.formula_arg2(gaf, (SubLObject)constrained_parsing.UNPROVIDED)), constrained_parsing.$list137 }), mt, (SubLObject)constrained_parsing.UNPROVIDED);
        SubLObject this_isa = (SubLObject)constrained_parsing.NIL;
        this_isa = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym138$_Y, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym139$_X, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const123$argN, (SubLObject)constrained_parsing.$sym139$_X, (SubLObject)constrained_parsing.TWO_INTEGER, this_isa), (SubLObject)ConsesLow.list(constrained_parsing.$const123$argN, (SubLObject)constrained_parsing.$sym138$_Y, (SubLObject)constrained_parsing.TWO_INTEGER, cycl_utilities.formula_arg2(gaf, (SubLObject)constrained_parsing.UNPROVIDED)), (SubLObject)constrained_parsing.$list140))), mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                return (SubLObject)constrained_parsing.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_isa = cdolist_list_var.first();
        }
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31445L)
    public static SubLObject constrained_parsing_gaf_fails_constraintsP_int(final SubLObject gaf, final SubLObject passed_mt, SubLObject constraints) {
        if (constraints == constrained_parsing.UNPROVIDED) {
            constraints = which_constraints_outrank((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL == constraints) {
            return (SubLObject)constrained_parsing.NIL;
        }
        SubLObject v_answer = (SubLObject)constrained_parsing.$kw141$NEEDED;
        final SubLObject focal_constraint = constraints.first();
        if (constrained_parsing.$constrained_parsing_trace_level$.getDynamicValue(thread).numGE((SubLObject)constrained_parsing.ONE_INTEGER)) {
            Errors.warn((SubLObject)constrained_parsing.$str142$____investigating__A_faithfulness, focal_constraint, constrained_parsing.$with_faithfulness_cutoffP$.getDynamicValue(thread), constrained_parsing.$with_arbitrary_filter_cutoffP$.getDynamicValue(thread));
        }
        final SubLObject pcase_var = focal_constraint;
        if (pcase_var.eql((SubLObject)constrained_parsing.$kw53$FAITHFULNESSFILTERCUTOFF)) {
            final SubLObject _prev_bind_0 = constrained_parsing.$with_faithfulness_cutoffP$.currentBinding(thread);
            try {
                constrained_parsing.$with_faithfulness_cutoffP$.bind((SubLObject)constrained_parsing.T, thread);
                v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
            }
            finally {
                constrained_parsing.$with_faithfulness_cutoffP$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)constrained_parsing.$kw143$ARBITRARYFILTERCUTFF)) {
            final SubLObject _prev_bind_0 = constrained_parsing.$with_arbitrary_filter_cutoffP$.currentBinding(thread);
            try {
                constrained_parsing.$with_arbitrary_filter_cutoffP$.bind((SubLObject)constrained_parsing.T, thread);
                v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
            }
            finally {
                constrained_parsing.$with_arbitrary_filter_cutoffP$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF)) {
            final SubLObject _prev_bind_0 = constrained_parsing.$with_bug_avoidance_cutoffP$.currentBinding(thread);
            try {
                constrained_parsing.$with_bug_avoidance_cutoffP$.bind((SubLObject)constrained_parsing.T, thread);
                v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
            }
            finally {
                constrained_parsing.$with_bug_avoidance_cutoffP$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)constrained_parsing.$kw17$PROHIBITGROUPCOERCION)) {
            if (constrained_parsing.NIL != constrained_parse_involves_group_coercionP(gaf, passed_mt)) {
                v_answer = focal_constraint;
            }
            else {
                v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
            }
        }
        else if (constrained_parsing.NIL != parsing_faithfulness_filter_p(focal_constraint)) {
            if (constrained_parsing.NIL == constrained_parsing.$with_faithfulness_cutoffP$.getDynamicValue(thread)) {
                SubLObject filter_mt = parsing_faithfulness_filter_mt(focal_constraint);
                final SubLObject filter_type = parsing_faithfulness_filter_type(focal_constraint);
                if (constrained_parsing.NIL != genl_mts.genl_mtP(passed_mt, filter_mt, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    filter_mt = passed_mt;
                }
                final SubLObject pcase_var_$3 = filter_type;
                if (pcase_var_$3.eql((SubLObject)constrained_parsing.$kw51$OBEYISASINMT)) {
                    if (constrained_parsing.NIL != genl_predicates.genl_predicate_in_any_mtP(cycl_utilities.formula_arg0(gaf), constrained_parsing.$const128$isa) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, gaf), filter_mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                        v_answer = focal_constraint;
                    }
                }
                else if (pcase_var_$3.eql((SubLObject)constrained_parsing.$kw52$OBEYGAFSINMT) && constrained_parsing.NIL == genl_predicates.genl_predicate_in_any_mtP(cycl_utilities.formula_arg0(gaf), constrained_parsing.$const128$isa) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, gaf), filter_mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    v_answer = focal_constraint;
                }
            }
        }
        else if (constrained_parsing.NIL != parsing_arbitrary_filter_p(focal_constraint)) {
            if (constrained_parsing.NIL == constrained_parsing.$with_arbitrary_filter_cutoffP$.getDynamicValue(thread)) {
                final SubLObject filter_mt = parsing_arbitrary_filter_mt(focal_constraint);
                if (passed_mt.eql((SubLObject)constrained_parsing.$kw113$DEFAULT) || constrained_parsing.NIL != genl_mts.genl_mtP(passed_mt, filter_mt, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    final SubLObject pcase_var_$4 = parsing_arbitrary_filter_type(focal_constraint);
                    if (pcase_var_$4.eql((SubLObject)constrained_parsing.$kw76$ASSERTINTOMT)) {
                        final SubLObject restriction = parsing_arbitrary_filter_details(focal_constraint);
                        final SubLObject gaf_operator = cycl_utilities.formula_arg0(gaf);
                        SubLObject into_mt = constrained_parsing.$constrained_parsing_assert_into_mt$.getDynamicValue(thread);
                        if (constrained_parsing.NIL == constrained_parsing.$constrained_parsing_assert_into_mt$.getDynamicValue(thread)) {
                            if (constrained_parsing.NIL != fort_types_interface.predicate_in_any_mtP(restriction)) {
                                if (constrained_parsing.NIL != genl_predicates.genl_predicateP(gaf_operator, restriction, filter_mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                                    into_mt = filter_mt;
                                }
                            }
                            else if (constrained_parsing.NIL != fort_types_interface.collection_in_any_mtP(restriction) && constrained_parsing.NIL != isa.isaP(gaf_operator, restriction, filter_mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                                into_mt = filter_mt;
                            }
                            if (constrained_parsing.NIL != genl_mts.genl_mtP(passed_mt, into_mt, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                                into_mt = passed_mt;
                            }
                            if (constrained_parsing.NIL != into_mt && constrained_parsing.$constrained_parsing_trace_level$.getDynamicValue(thread).numGE((SubLObject)constrained_parsing.ONE_INTEGER)) {
                                Errors.warn((SubLObject)constrained_parsing.$str144$_____S_will_be_asserted_into__A__, gaf, into_mt);
                            }
                        }
                        final SubLObject _prev_bind_2 = constrained_parsing.$constrained_parsing_assert_into_mt$.currentBinding(thread);
                        try {
                            constrained_parsing.$constrained_parsing_assert_into_mt$.bind(into_mt, thread);
                            v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
                            if (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_assert_into_mt$.getDynamicValue(thread) && constrained_parsing.NIL == parsing_constraint_p(v_answer)) {
                                v_answer = constrained_parsing.$constrained_parsing_assert_into_mt$.getDynamicValue(thread);
                            }
                        }
                        finally {
                            constrained_parsing.$constrained_parsing_assert_into_mt$.rebind(_prev_bind_2, thread);
                        }
                    }
                    else if (pcase_var_$4.eql((SubLObject)constrained_parsing.$kw75$NOISASARESPECS) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const123$argN, constrained_parsing.$const128$isa, (SubLObject)constrained_parsing.ZERO_INTEGER, gaf), (SubLObject)ConsesLow.list(constrained_parsing.$const123$argN, (SubLObject)constrained_parsing.$sym145$_COL, (SubLObject)constrained_parsing.TWO_INTEGER, gaf), (SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.list(constrained_parsing.$const125$genls, (SubLObject)constrained_parsing.$sym145$_COL, parsing_arbitrary_filter_details(focal_constraint)))), passed_mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                        v_answer = focal_constraint;
                    }
                }
            }
        }
        else if (focal_constraint.eql((SubLObject)constrained_parsing.$kw79$COMPENSATEFORISAPROBLEMS) && constrained_parsing.NIL == constrained_parsing.$with_bug_avoidance_cutoffP$.getDynamicValue(thread) && constrained_parsing.NIL != constrained_parsing_illegal_isa_workaroundP(gaf, passed_mt)) {
            v_answer = focal_constraint;
        }
        if (v_answer.eql((SubLObject)constrained_parsing.$kw141$NEEDED)) {
            v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 36473L)
    public static SubLObject constrained_parsing_gaf_fails_constraintsP(final SubLObject gaf, final SubLObject in_mt) {
        assert constrained_parsing.NIL != el_utilities.el_formula_p(gaf) : gaf;
        if (!in_mt.eql((SubLObject)constrained_parsing.$kw113$DEFAULT) && !constrained_parsing.assertionsDisabledSynth && constrained_parsing.NIL == fort_types_interface.mt_in_any_mtP(in_mt)) {
            throw new AssertionError(in_mt);
        }
        return constrained_parsing_gaf_fails_constraintsP_int(gaf, in_mt, which_constraints_outrank((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 37055L)
    public static SubLObject constrained_parsing_unassert(final SubLObject gaf, final SubLObject mt) {
        constrained_parsing_record_action((SubLObject)constrained_parsing.$sym147$UNASSERT, (SubLObject)ConsesLow.list(gaf, mt));
        if (constrained_parsing.NIL != constrained_parsing_assert_gafsP()) {
            return fi.fi_unassert_int(gaf, mt);
        }
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 37394L)
    public static SubLObject constrained_parsing_possibly_assert(final SubLObject gaf, SubLObject mt, SubLObject source_string) {
        if (source_string == constrained_parsing.UNPROVIDED) {
            source_string = (SubLObject)constrained_parsing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert constrained_parsing.NIL != el_utilities.el_formula_p(gaf) : gaf;
        if (!mt.eql((SubLObject)constrained_parsing.$kw113$DEFAULT) && !constrained_parsing.assertionsDisabledSynth && constrained_parsing.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (constrained_parsing.NIL != constrained_parsing_query_successP(gaf, mt, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return (SubLObject)constrained_parsing.NIL;
        }
        final SubLObject diagnosis = constrained_parsing_gaf_fails_constraintsP(gaf, mt);
        if (constrained_parsing.NIL != parsing_constraint_p(diagnosis)) {
            return diagnosis;
        }
        if (constrained_parsing.NIL != fort_types_interface.mt_in_any_mtP(diagnosis)) {
            if (mt.eql((SubLObject)constrained_parsing.$kw113$DEFAULT)) {
                mt = diagnosis;
            }
        }
        else if (mt.eql((SubLObject)constrained_parsing.$kw113$DEFAULT)) {
            return (SubLObject)constrained_parsing.NIL;
        }
        if (constrained_parsing.NIL != el_utilities.el_binary_formula_p(gaf)) {
            SubLObject pred = (SubLObject)constrained_parsing.NIL;
            SubLObject the_term = (SubLObject)constrained_parsing.NIL;
            SubLObject arg2 = (SubLObject)constrained_parsing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(gaf, gaf, (SubLObject)constrained_parsing.$list149);
            pred = gaf.first();
            SubLObject current = gaf.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, gaf, (SubLObject)constrained_parsing.$list149);
            the_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, gaf, (SubLObject)constrained_parsing.$list149);
            arg2 = current.first();
            current = current.rest();
            if (constrained_parsing.NIL == current) {
                if ((constrained_parsing.NIL != isa.isa_in_any_mtP(arg2, constrained_parsing.$const150$Group) || cycl_utilities.formula_arg0(arg2).eql(constrained_parsing.$const151$GroupFn) || cycl_utilities.formula_arg0(arg2).eql(constrained_parsing.$const132$GroupOfCardinalityFn)) && constrained_parsing.NIL == isa.isa_in_any_mtP(the_term, constrained_parsing.$const150$Group)) {
                    SubLObject cdolist_list_var = constrained_parsing_query((SubLObject)constrained_parsing.$list154, (SubLObject)ConsesLow.list(constrained_parsing.$const155$ist_Asserted, (SubLObject)constrained_parsing.$sym156$_ANYWHERE, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list157)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                    SubLObject this_answer = (SubLObject)constrained_parsing.NIL;
                    this_answer = cdolist_list_var.first();
                    while (constrained_parsing.NIL != cdolist_list_var) {
                        SubLObject current_$6;
                        final SubLObject datum_$5 = current_$6 = this_answer;
                        SubLObject this_isa = (SubLObject)constrained_parsing.NIL;
                        SubLObject this_mt = (SubLObject)constrained_parsing.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)constrained_parsing.$list152);
                        this_isa = current_$6.first();
                        current_$6 = current_$6.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)constrained_parsing.$list152);
                        this_mt = current_$6.first();
                        current_$6 = current_$6.rest();
                        if (constrained_parsing.NIL == current_$6) {
                            if (constrained_parsing.NIL == genls.genl_in_any_mtP(this_isa, constrained_parsing.$const150$Group)) {
                                constrained_parsing_unassert((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, this_isa), this_mt);
                                constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const153$hypothesizedIsaCoercedInto, the_term, this_isa, arg2), this_mt, (SubLObject)constrained_parsing.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)constrained_parsing.$list152);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        this_answer = cdolist_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(gaf, (SubLObject)constrained_parsing.$list149);
            }
        }
        SubLObject gafs_produced = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(gaf, mt));
        final SubLObject strength = (SubLObject)(cycl_utilities.formula_arg0(gaf).eql(constrained_parsing.$const158$sourceOfTerm) ? constrained_parsing.$kw159$MONOTONIC : constrained_parsing.$kw113$DEFAULT);
        constrained_parsing_record_action((SubLObject)constrained_parsing.$sym160$FI_ASSERT_INT, gafs_produced.first());
        if (constrained_parsing.NIL != constrained_parsing_assert_gafsP()) {
            if (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_show_inference_metricsP$.getDynamicValue(thread)) {
                final SubLObject undo_traceP = (SubLObject)constrained_parsing.NIL;
                inference_metrics.clear_forward_inference_metrics();
                final SubLObject _prev_bind_0 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = control_vars.$browse_forward_inferencesP$.currentBinding(thread);
                try {
                    inference_metrics.$gathering_forward_inference_metricsP$.bind((SubLObject)constrained_parsing.T, thread);
                    control_vars.$browse_forward_inferencesP$.bind((SubLObject)constrained_parsing.NIL, thread);
                    fi.fi_assert_int(gaf, mt, strength, (SubLObject)constrained_parsing.UNPROVIDED);
                    inference_metrics.show_forward_inference_metrics((SubLObject)constrained_parsing.FOUR_INTEGER, (SubLObject)constrained_parsing.UNPROVIDED);
                    inference_metrics.finalize_forward_inference_metrics_inference_index();
                }
                finally {
                    control_vars.$browse_forward_inferencesP$.rebind(_prev_bind_2, thread);
                    inference_metrics.$gathering_forward_inference_metricsP$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                fi.fi_assert_int(gaf, mt, strength, (SubLObject)constrained_parsing.UNPROVIDED);
            }
        }
        if (constrained_parsing.NIL != source_string && (constrained_parsing.NIL != constrained_parsing_tracking_stringsP() || constrained_parsing.NIL != constrained_parsing_tracking_substringsP())) {
            gafs_produced = (SubLObject)ConsesLow.cons(constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const158$sourceOfTerm, gaf, source_string), mt, (SubLObject)constrained_parsing.UNPROVIDED).first(), gafs_produced);
        }
        return Sequences.reverse(gafs_produced);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 40611L)
    public static SubLObject constrained_parsing_assert_through_channels(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject gaf = (SubLObject)constrained_parsing.NIL;
        SubLObject var = (SubLObject)constrained_parsing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list161);
        gaf = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list161);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)constrained_parsing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)constrained_parsing.NIL;
        SubLObject current_$7 = (SubLObject)constrained_parsing.NIL;
        while (constrained_parsing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constrained_parsing.$list161);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constrained_parsing.$list161);
            if (constrained_parsing.NIL == conses_high.member(current_$7, (SubLObject)constrained_parsing.$list162, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                bad = (SubLObject)constrained_parsing.T;
            }
            if (current_$7 == constrained_parsing.$kw163$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (constrained_parsing.NIL != bad && constrained_parsing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list161);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)constrained_parsing.$kw43$MT, current);
        final SubLObject mt = (SubLObject)((constrained_parsing.NIL != mt_tail) ? conses_high.cadr(mt_tail) : constrained_parsing.$kw113$DEFAULT);
        final SubLObject source_tail = cdestructuring_bind.property_list_member((SubLObject)constrained_parsing.$kw164$SOURCE, current);
        final SubLObject source = (SubLObject)((constrained_parsing.NIL != source_tail) ? conses_high.cadr(source_tail) : constrained_parsing.NIL);
        final SubLObject record_filter_tail = cdestructuring_bind.property_list_member((SubLObject)constrained_parsing.$kw165$RECORD_FILTER, current);
        final SubLObject record_filter = (SubLObject)((constrained_parsing.NIL != record_filter_tail) ? conses_high.cadr(record_filter_tail) : constrained_parsing.NIL);
        final SubLObject record_null_tail = cdestructuring_bind.property_list_member((SubLObject)constrained_parsing.$kw166$RECORD_NULL, current);
        final SubLObject record_null = (SubLObject)((constrained_parsing.NIL != record_null_tail) ? conses_high.cadr(record_null_tail) : constrained_parsing.NIL);
        final SubLObject channel_says = (SubLObject)constrained_parsing.$sym167$CHANNEL_SAYS;
        return (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(channel_says, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym168$CONSTRAINED_PARSING_POSSIBLY_ASSERT, gaf, mt, source))), (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym169$CAND, channel_says, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym170$CNOT, record_filter)), (SubLObject)ConsesLow.listS((SubLObject)constrained_parsing.$sym171$CSETQ, channel_says, (SubLObject)constrained_parsing.$list172)), (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym173$COR, channel_says, record_null), (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym171$CSETQ, var, channel_says)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 41056L)
    public static SubLObject constrained_parsing_coerce_to_group(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.$constrained_parsing_cardinality_known$.getDynamicValue(thread).isNumber() || constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, constrained_parsing.$constrained_parsing_cardinality_known$.getDynamicValue(thread), constrained_parsing.$const174$PositiveIntegerExtent), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(constrained_parsing.$const132$GroupOfCardinalityFn, col, constrained_parsing.$constrained_parsing_cardinality_known$.getDynamicValue(thread));
        }
        if (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_cardinality_known$.getDynamicValue(thread)) {
            return (SubLObject)ConsesLow.list(constrained_parsing.$const151$GroupFn, col);
        }
        return col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 41663L)
    public static SubLObject constrained_parsing_note_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = (SubLObject)constrained_parsing.NIL;
        SubLObject col = (SubLObject)constrained_parsing.NIL;
        SubLObject var = (SubLObject)constrained_parsing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list175);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list175);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list175);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)constrained_parsing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)constrained_parsing.NIL;
        SubLObject current_$8 = (SubLObject)constrained_parsing.NIL;
        while (constrained_parsing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constrained_parsing.$list175);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constrained_parsing.$list175);
            if (constrained_parsing.NIL == conses_high.member(current_$8, (SubLObject)constrained_parsing.$list176, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                bad = (SubLObject)constrained_parsing.T;
            }
            if (current_$8 == constrained_parsing.$kw163$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (constrained_parsing.NIL != bad && constrained_parsing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list175);
        }
        final SubLObject source_tail = cdestructuring_bind.property_list_member((SubLObject)constrained_parsing.$kw164$SOURCE, current);
        final SubLObject source = (SubLObject)((constrained_parsing.NIL != source_tail) ? conses_high.cadr(source_tail) : constrained_parsing.NIL);
        final SubLObject group_col = (SubLObject)constrained_parsing.$sym177$GROUP_COL;
        return (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(group_col, col)), (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym178$CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS, (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$sym179$LIST, constrained_parsing.$const128$isa, v_term, group_col), var, (SubLObject)constrained_parsing.$kw164$SOURCE, source));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 41910L)
    public static SubLObject constrained_parse_explode_np_string(final SubLObject string, SubLObject calling_constraint) {
        if (calling_constraint == constrained_parsing.UNPROVIDED) {
            calling_constraint = (SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE;
        }
        SubLObject exploded = (SubLObject)constrained_parsing.NIL;
        final SubLObject do_clausesP = parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw27$PERMITRELATIVECLAUSEPARSES, calling_constraint);
        final SubLObject do_ppP = parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw28$PERMITPPCOMPPARSES, calling_constraint);
        SubLObject abortP = (SubLObject)constrained_parsing.NIL;
        if (constrained_parsing.NIL == abortP) {
            SubLObject csome_list_var = string_utilities.split_string(string, (SubLObject)constrained_parsing.UNPROVIDED);
            SubLObject this_word = (SubLObject)constrained_parsing.NIL;
            this_word = csome_list_var.first();
            while (constrained_parsing.NIL == abortP && constrained_parsing.NIL != csome_list_var) {
                if (constrained_parsing.NIL == do_ppP && constrained_parsing.NIL == Strings.stringE(this_word, (SubLObject)constrained_parsing.$str180$of, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL != constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym181$_WU, (SubLObject)ConsesLow.list(constrained_parsing.$const182$prepositionStrings, (SubLObject)constrained_parsing.$sym181$_WU, this_word), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    abortP = (SubLObject)constrained_parsing.T;
                }
                else if (constrained_parsing.NIL == do_clausesP && constrained_parsing.NIL != constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym181$_WU, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const183$partOfSpeech, (SubLObject)constrained_parsing.$sym181$_WU, (SubLObject)constrained_parsing.$sym184$_POS, this_word), (SubLObject)constrained_parsing.$list185), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    abortP = (SubLObject)constrained_parsing.T;
                }
                else {
                    exploded = (SubLObject)ConsesLow.cons(this_word, exploded);
                }
                csome_list_var = csome_list_var.rest();
                this_word = csome_list_var.first();
            }
        }
        return Sequences.reverse(exploded);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 42973L)
    public static SubLObject constrained_parse_of_strings_for_term(final SubLObject the_term, final SubLObject the_strings) {
        assert constrained_parsing.NIL != forts.fort_p(the_term) : the_term;
        assert constrained_parsing.NIL != list_utilities.non_dotted_list_p(the_strings) : the_strings;
        SubLObject cdolist_list_var = the_strings;
        SubLObject elem = (SubLObject)constrained_parsing.NIL;
        elem = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            assert constrained_parsing.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject problemsP = (SubLObject)constrained_parsing.NIL;
        cdolist_list_var = the_strings;
        SubLObject this_string = (SubLObject)constrained_parsing.NIL;
        this_string = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL == constrained_parse_of_string_for_term(the_term, this_string)) {
                problemsP = (SubLObject)constrained_parsing.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_string = cdolist_list_var.first();
        }
        return problemsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 43584L)
    public static SubLObject constrained_parsing_get_acceptable_isas(final SubLObject the_term, SubLObject isa_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL != parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw13$PROHIBITSUBCOLLECTIONFNS, (SubLObject)constrained_parsing.$kw16$PERMITALLNONDISJOINTISAS)) {
            isa_list = Sequences.remove_if((SubLObject)constrained_parsing.$sym189$SUBCOLLECTION_NAUT_P, isa_list, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
        }
        if (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_cardinality_known$.getDynamicValue(thread)) {
            SubLObject tmp_list = (SubLObject)constrained_parsing.NIL;
            SubLObject cdolist_list_var = isa_list;
            SubLObject this_isa = (SubLObject)constrained_parsing.NIL;
            this_isa = cdolist_list_var.first();
            while (constrained_parsing.NIL != cdolist_list_var) {
                tmp_list = (SubLObject)ConsesLow.cons(constrained_parsing_coerce_to_group(this_isa), tmp_list);
                cdolist_list_var = cdolist_list_var.rest();
                this_isa = cdolist_list_var.first();
            }
            isa_list = Sequences.reverse(tmp_list);
            if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list126)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                return isa_list;
            }
        }
        SubLObject list_of_ok = (SubLObject)constrained_parsing.NIL;
        SubLObject cdolist_list_var = isa_list;
        SubLObject this_isa = (SubLObject)constrained_parsing.NIL;
        this_isa = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, this_isa)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                Errors.warn((SubLObject)constrained_parsing.$str190$____rejected_potential_parse_of__, this_isa, the_term);
            }
            else {
                list_of_ok = (SubLObject)ConsesLow.cons(this_isa, list_of_ok);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_isa = cdolist_list_var.first();
        }
        return Sequences.reverse(list_of_ok);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 45169L)
    public static SubLObject constrained_parse_of_substrings_for_term(final SubLObject the_term, final SubLObject substrings, SubLObject predicate) {
        if (predicate == constrained_parsing.UNPROVIDED) {
            predicate = constrained_parsing.$const191$nounStrings;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bunged = string_utilities.bunge(substrings, (SubLObject)constrained_parsing.UNPROVIDED);
        SubLObject did_workP = (SubLObject)constrained_parsing.$kw192$NADA;
        final SubLObject cols = constrained_parsing_get_acceptable_isas(the_term, constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym145$_COL, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const193$termPhrases, (SubLObject)constrained_parsing.$sym145$_COL, predicate, bunged), (SubLObject)constrained_parsing.$list194), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED));
        if (constrained_parsing.$constrained_parsing_trace_level$.getDynamicValue(thread).numGE((SubLObject)((constrained_parsing.NIL != cols) ? constrained_parsing.ZERO_INTEGER : constrained_parsing.TWO_INTEGER))) {
            Errors.warn((SubLObject)constrained_parsing.$str195$____remaining_parses_are__A_w_car, cols, constrained_parsing.$constrained_parsing_cardinality_known$.getDynamicValue(thread));
        }
        if (cols.isCons() && (constrained_parsing.NIL != list_utilities.singletonP(cols) || constrained_parsing.NIL != parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw16$PERMITALLNONDISJOINTISAS, (SubLObject)constrained_parsing.$kw14$PROHIBITAMBIGUOUSGAFS))) {
            SubLObject cdolist_list_var = cols;
            SubLObject this_col = (SubLObject)constrained_parsing.NIL;
            this_col = cdolist_list_var.first();
            while (constrained_parsing.NIL != cdolist_list_var) {
                if (constrained_parsing.NIL == constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, this_col)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL == constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, this_col), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL == constrained_parsing_faceting_violationP(the_term, this_col, (SubLObject)constrained_parsing.$kw16$PERMITALLNONDISJOINTISAS)) {
                    final SubLObject group_col = this_col;
                    SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, group_col), (SubLObject)constrained_parsing.$kw113$DEFAULT, bunged);
                    if (constrained_parsing.NIL != channel_says) {
                        channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                    }
                    if (constrained_parsing.NIL != channel_says) {
                        did_workP = channel_says;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_col = cdolist_list_var.first();
            }
        }
        return did_workP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 46496L)
    public static SubLObject constrained_parsing_faceting_violationP(final SubLObject the_term, final SubLObject wrt_col, final SubLObject key_constraint) {
        if (constrained_parsing.NIL != parsing_constraint_outranksP(key_constraint, (SubLObject)constrained_parsing.$kw12$AVOIDREDUNDANTFACETS)) {
            return (SubLObject)constrained_parsing.NIL;
        }
        return constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym145$_COL, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym197$_COL_TYPE, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym198$_FACETING_COL, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym199$_SOMEWHERE, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym156$_ANYWHERE, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym200$_TERM_COL, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const155$ist_Asserted, (SubLObject)constrained_parsing.$sym199$_SOMEWHERE, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, wrt_col, (SubLObject)constrained_parsing.$list201)), (SubLObject)constrained_parsing.$list202, (SubLObject)constrained_parsing.$list203, (SubLObject)ConsesLow.list(constrained_parsing.$const155$ist_Asserted, (SubLObject)constrained_parsing.$sym156$_ANYWHERE, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list157)), (SubLObject)constrained_parsing.$list204))))))), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 47651L)
    public static SubLObject constrained_parse_of_string_for_term(final SubLObject the_term, final SubLObject the_string) {
        if (constrained_parsing.NIL != string_utilities.capitalized_string_p(the_string)) {
            return constrained_parse_of_namestring_for_term(the_term, the_string);
        }
        return constrained_parse_of_string_for_term_int(the_term, constrained_parse_explode_np_string(the_string, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 48326L)
    public static SubLObject constrained_parse_of_string_for_term_int(final SubLObject the_term, SubLObject exploded, SubLObject constraints) {
        if (constraints == constrained_parsing.UNPROVIDED) {
            constraints = which_constraints_outrank((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL == exploded || constrained_parsing.NIL == constraints) {
            return (SubLObject)constrained_parsing.NIL;
        }
        SubLObject diagnosis = (SubLObject)constrained_parsing.NIL;
        final SubLObject focal_constraint = constraints.first();
        final SubLObject cdrstraints = constraints.rest();
        if (constrained_parsing.NIL != parsing_flow_control_principle_p(focal_constraint)) {
            final SubLObject pcase_var = focal_constraint;
            if (pcase_var.eql((SubLObject)constrained_parsing.$kw18$STRIPCARDINALITY)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                SubLObject current;
                final SubLObject datum = current = constrained_parse_extract_cardinality(exploded);
                SubLObject cardinality = (SubLObject)constrained_parsing.NIL;
                SubLObject strings = (SubLObject)constrained_parsing.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list205);
                cardinality = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list205);
                strings = current.first();
                current = current.rest();
                if (constrained_parsing.NIL == current) {
                    final SubLObject _prev_bind_0 = constrained_parsing.$constrained_parsing_cardinality_known$.currentBinding(thread);
                    try {
                        constrained_parsing.$constrained_parsing_cardinality_known$.bind(cardinality, thread);
                        if (constrained_parsing.NIL != cardinality && constrained_parsing.NIL == constrained_parsing.$constrained_parsing_allow_group_coercionP$.getDynamicValue(thread) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list126)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                            diagnosis = (SubLObject)constrained_parsing.$kw17$PROHIBITGROUPCOERCION;
                        }
                        else {
                            diagnosis = constrained_parse_of_string_for_term_int(the_term, strings, cdrstraints);
                        }
                    }
                    finally {
                        constrained_parsing.$constrained_parsing_cardinality_known$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list205);
                }
                return diagnosis;
            }
            if (pcase_var.eql((SubLObject)constrained_parsing.$kw20$WIDESCOPEPRECISION)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                for (SubLObject workspace = exploded; !diagnosis.eql((SubLObject)constrained_parsing.$kw206$ERROR) && constrained_parsing.NIL != workspace; workspace = workspace.rest()) {
                    diagnosis = constrained_parse_of_substrings_for_term(the_term, workspace, (SubLObject)constrained_parsing.UNPROVIDED);
                    if (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_consider_adjectivesP$.getDynamicValue(thread) && !diagnosis.eql((SubLObject)constrained_parsing.$kw206$ERROR)) {
                        diagnosis = constrained_parse_of_substrings_for_term(the_term, workspace, constrained_parsing.$const207$adjStrings);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)constrained_parsing.$kw24$NARROWSCOPEPRECISION)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                for (SubLObject workspace = Sequences.reverse(exploded); constrained_parsing.NIL != workspace && !diagnosis.eql((SubLObject)constrained_parsing.$kw206$ERROR); workspace = workspace.rest()) {
                    diagnosis = constrained_parse_of_substrings_for_term(the_term, (SubLObject)ConsesLow.list(workspace.first()), (SubLObject)constrained_parsing.UNPROVIDED);
                    if (constrained_parsing.NIL != constrained_parsing.$constrained_parsing_consider_adjectivesP$.getDynamicValue(thread) && !diagnosis.eql((SubLObject)constrained_parsing.$kw206$ERROR)) {
                        diagnosis = constrained_parse_of_substrings_for_term(the_term, (SubLObject)ConsesLow.list(workspace.first()), constrained_parsing.$const207$adjStrings);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)constrained_parsing.$kw22$PERMITNARTISAS)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                diagnosis = constrained_parse_of_nart_isas(the_term, exploded);
            }
            else if (pcase_var.eql((SubLObject)constrained_parsing.$kw23$RELATIONALLINSTANCEPARSE)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                diagnosis = constrained_parse_via_relation_all_instance(the_term, exploded);
            }
            else {
                if (pcase_var.eql((SubLObject)constrained_parsing.$kw17$PROHIBITGROUPCOERCION)) {
                    final SubLObject _prev_bind_2 = constrained_parsing.$constrained_parsing_allow_group_coercionP$.currentBinding(thread);
                    try {
                        constrained_parsing.$constrained_parsing_allow_group_coercionP$.bind((SubLObject)constrained_parsing.NIL, thread);
                        diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                    }
                    finally {
                        constrained_parsing.$constrained_parsing_allow_group_coercionP$.rebind(_prev_bind_2, thread);
                    }
                    return diagnosis;
                }
                if (pcase_var.eql((SubLObject)constrained_parsing.$kw21$PERMITADJECTIVEPARSES)) {
                    final SubLObject _prev_bind_2 = constrained_parsing.$constrained_parsing_consider_adjectivesP$.currentBinding(thread);
                    try {
                        constrained_parsing.$constrained_parsing_consider_adjectivesP$.bind((SubLObject)constrained_parsing.T, thread);
                        diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                    }
                    finally {
                        constrained_parsing.$constrained_parsing_consider_adjectivesP$.rebind(_prev_bind_2, thread);
                    }
                    return diagnosis;
                }
                if (pcase_var.eql((SubLObject)constrained_parsing.$kw19$CASESENSITIVELEXICON)) {
                    final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                    try {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)constrained_parsing.$kw208$ON, thread);
                        diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                    }
                    finally {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                    }
                    return diagnosis;
                }
                if (pcase_var.eql((SubLObject)constrained_parsing.$kw25$CASEINSENSITIVELEXICON)) {
                    final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                    try {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)constrained_parsing.$kw209$OFF, thread);
                        diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                    }
                    finally {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                    }
                    return diagnosis;
                }
            }
        }
        if (diagnosis.eql((SubLObject)constrained_parsing.$kw206$ERROR)) {
            return diagnosis;
        }
        return constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 52541L)
    public static SubLObject constrained_parse_extract_cardinality(final SubLObject exploded) {
        assert constrained_parsing.NIL != list_utilities.non_dotted_list_p(exploded) : exploded;
        SubLObject cdolist_list_var = exploded;
        SubLObject elem = (SubLObject)constrained_parsing.NIL;
        elem = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            assert constrained_parsing.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject post_strings = exploded;
        SubLObject workspace = (SubLObject)constrained_parsing.NIL;
        SubLObject as_integer = (SubLObject)constrained_parsing.NIL;
        SubLObject this_many = (SubLObject)constrained_parsing.NIL;
        SubLObject doneP = (SubLObject)constrained_parsing.NIL;
        SubLObject pre_strings = (SubLObject)constrained_parsing.NIL;
        if (constrained_parsing.NIL == doneP) {
            SubLObject csome_list_var = exploded;
            SubLObject this_word = (SubLObject)constrained_parsing.NIL;
            this_word = csome_list_var.first();
            while (constrained_parsing.NIL == doneP && constrained_parsing.NIL != csome_list_var) {
                as_integer = string_utilities.string_to_integer(string_utilities.remove_substring(this_word, (SubLObject)constrained_parsing.$str210$_));
                if (constrained_parsing.NIL != as_integer) {
                    workspace = (SubLObject)ConsesLow.list(as_integer);
                }
                else {
                    workspace = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.list(constrained_parsing.$const193$termPhrases, (SubLObject)constrained_parsing.$sym211$_DENOT, constrained_parsing.$const212$Determiner, this_word), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                if (constrained_parsing.NIL == workspace) {
                    workspace = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const213$termStrings, (SubLObject)constrained_parsing.$sym211$_DENOT, this_word), (SubLObject)constrained_parsing.$list214), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                if (constrained_parsing.NIL == workspace) {
                    workspace = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const213$termStrings, (SubLObject)constrained_parsing.$sym211$_DENOT, this_word), (SubLObject)constrained_parsing.$list215), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                }
                final SubLObject the_number = workspace.first();
                if (constrained_parsing.NIL == workspace) {
                    doneP = (SubLObject)constrained_parsing.T;
                }
                else if (constrained_parsing.NIL != list_utilities.singletonP(workspace) && constrained_parsing.NIL != the_number && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_number, (SubLObject)constrained_parsing.$list216), constrained_parsing.$const118$EnglishMt, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    if (constrained_parsing.NIL == this_many) {
                        this_many = the_number;
                    }
                    else if (this_many.isNumber()) {
                        this_many = Numbers.multiply(the_number, this_many);
                    }
                    else {
                        this_many = Numbers.multiply(this_many, constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.listS(constrained_parsing.$const213$termStrings, the_number, (SubLObject)constrained_parsing.$list217), (SubLObject)constrained_parsing.$list218), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED).first());
                    }
                }
                else {
                    pre_strings = (SubLObject)ConsesLow.cons(this_word, pre_strings);
                    doneP = list_utilities.sublisp_boolean(this_many);
                }
                if (constrained_parsing.NIL == doneP) {
                    post_strings = post_strings.rest();
                }
                csome_list_var = csome_list_var.rest();
                this_word = csome_list_var.first();
            }
        }
        return (SubLObject)((constrained_parsing.NIL != this_many) ? ConsesLow.list(this_many, list_utilities.flatten((SubLObject)ConsesLow.list(Sequences.reverse(pre_strings), post_strings))) : ConsesLow.list((SubLObject)constrained_parsing.NIL, exploded));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 55312L)
    public static SubLObject constrained_parse_search_for_rewrites(final SubLObject the_term, final SubLObject the_string, SubLObject search_predicate) {
        if (search_predicate == constrained_parsing.UNPROVIDED) {
            search_predicate = constrained_parsing.$const219$preferredNameString;
        }
        if (constrained_parsing.NIL != parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw81$AVOIDREWRITEPARSES, (SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF)) {
            return (SubLObject)constrained_parsing.$kw192$NADA;
        }
        SubLObject found_rewrite = (SubLObject)constrained_parsing.NIL;
        SubLObject cdolist_list_var = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym222$_WHO, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(search_predicate, (SubLObject)constrained_parsing.$sym222$_WHO, the_string), (SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.list(constrained_parsing.$const223$equals, (SubLObject)constrained_parsing.$sym222$_WHO, the_term)), (SubLObject)constrained_parsing.$list224, (SubLObject)ConsesLow.list(constrained_parsing.$const225$unknownSentence, (SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym145$_COL, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const155$ist_Asserted, (SubLObject)constrained_parsing.$sym156$_ANYWHERE, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list157)), (SubLObject)constrained_parsing.$list226)))), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
        SubLObject v_answer = (SubLObject)constrained_parsing.NIL;
        v_answer = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL != found_rewrite) {
                Errors.warn((SubLObject)constrained_parsing.$str220$____found__at_least___A_and__A_as, found_rewrite, v_answer, the_term);
                return (SubLObject)constrained_parsing.$kw192$NADA;
            }
            SubLObject collisionP = (SubLObject)constrained_parsing.NIL;
            if (constrained_parsing.NIL == collisionP) {
                SubLObject csome_list_var;
                SubLObject this_col;
                for (csome_list_var = constrained_parsing_query((SubLObject)constrained_parsing.$sym145$_COL, (SubLObject)ConsesLow.list(constrained_parsing.$const155$ist_Asserted, (SubLObject)constrained_parsing.$sym156$_ANYWHERE, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, v_answer, (SubLObject)constrained_parsing.$list157)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED), this_col = (SubLObject)constrained_parsing.NIL, this_col = csome_list_var.first(); constrained_parsing.NIL == collisionP && constrained_parsing.NIL != csome_list_var; collisionP = constrained_parsing_faceting_violationP(the_term, this_col, (SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE), csome_list_var = csome_list_var.rest(), this_col = csome_list_var.first()) {}
            }
            if (constrained_parsing.NIL == collisionP) {
                Errors.warn((SubLObject)constrained_parsing.$str221$____setting_rewrite_option_to__S, v_answer);
                found_rewrite = v_answer;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        if (constrained_parsing.NIL != found_rewrite) {
            SubLObject did_workP = (SubLObject)constrained_parsing.$kw192$NADA;
            SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const107$rewriteOf, found_rewrite, the_term), (SubLObject)constrained_parsing.$kw113$DEFAULT, the_string);
            if (constrained_parsing.NIL != channel_says) {
                channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
            }
            if (constrained_parsing.NIL != channel_says) {
                did_workP = channel_says;
            }
            return did_workP;
        }
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 57059L)
    public static SubLObject frontload_genitive_if_any(final SubLObject string_list) {
        return rotate_list_around_pivot(string_list, (SubLObject)constrained_parsing.$str180$of, (SubLObject)constrained_parsing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 57260L)
    public static SubLObject eliminate_redundant_narts(final SubLObject nart_list) {
        if (constrained_parsing.NIL == list_utilities.lengthG(nart_list, (SubLObject)constrained_parsing.ONE_INTEGER, (SubLObject)constrained_parsing.UNPROVIDED)) {
            return nart_list;
        }
        assert constrained_parsing.NIL != list_utilities.non_dotted_list_p(nart_list) : nart_list;
        SubLObject cdolist_list_var = nart_list;
        SubLObject elem = (SubLObject)constrained_parsing.NIL;
        elem = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            assert constrained_parsing.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject reduced = (SubLObject)constrained_parsing.NIL;
        cdolist_list_var = nart_list;
        SubLObject this_nart = (SubLObject)constrained_parsing.NIL;
        this_nart = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            SubLObject found_narrowerP = (SubLObject)constrained_parsing.NIL;
            if (constrained_parsing.NIL == found_narrowerP) {
                SubLObject csome_list_var = nart_list;
                SubLObject other_nart = (SubLObject)constrained_parsing.NIL;
                other_nart = csome_list_var.first();
                while (constrained_parsing.NIL == found_narrowerP && constrained_parsing.NIL != csome_list_var) {
                    if (!other_nart.equal(this_nart) && cycl_utilities.formula_arg0(this_nart).eql(cycl_utilities.formula_arg0(other_nart))) {
                        SubLObject n = (SubLObject)constrained_parsing.ZERO_INTEGER;
                        final SubLObject args = cycl_utilities.formula_args(this_nart, (SubLObject)constrained_parsing.$kw228$IGNORE);
                        SubLObject rest;
                        SubLObject this_arg;
                        for (rest = (SubLObject)constrained_parsing.NIL, rest = args; constrained_parsing.NIL == found_narrowerP && constrained_parsing.NIL != rest; found_narrowerP = constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const229$or, (SubLObject)ConsesLow.list(constrained_parsing.$const125$genls, cycl_utilities.formula_arg(other_nart, n, (SubLObject)constrained_parsing.UNPROVIDED), this_arg), (SubLObject)ConsesLow.list(constrained_parsing.$const230$subFields, this_arg, cycl_utilities.formula_arg(other_nart, n, (SubLObject)constrained_parsing.UNPROVIDED))), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED), rest = rest.rest()) {
                            this_arg = rest.first();
                            n = Numbers.add(n, (SubLObject)constrained_parsing.ONE_INTEGER);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    other_nart = csome_list_var.first();
                }
            }
            if (constrained_parsing.NIL == found_narrowerP) {
                reduced = (SubLObject)ConsesLow.cons(this_nart, reduced);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_nart = cdolist_list_var.first();
        }
        return reduced;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 58055L)
    public static SubLObject constrained_parse_of_nart_isas(final SubLObject the_term, final SubLObject the_strings) {
        SubLObject np_core = (SubLObject)constrained_parsing.NIL;
        SubLObject all_matches = (SubLObject)constrained_parsing.NIL;
        SubLObject strings_left = frontload_genitive_if_any(the_strings);
        final SubLObject enough_work_doneP = (SubLObject)constrained_parsing.NIL;
        SubLObject any_work_doneP = (SubLObject)constrained_parsing.$kw192$NADA;
        if (constrained_parsing.NIL == enough_work_doneP) {
            SubLObject csome_list_var = Sequences.reverse(strings_left);
            SubLObject this_word = (SubLObject)constrained_parsing.NIL;
            this_word = csome_list_var.first();
            while (constrained_parsing.NIL == enough_work_doneP && constrained_parsing.NIL != csome_list_var) {
                np_core = (SubLObject)ConsesLow.cons(this_word, np_core);
                strings_left = list_utilities.remove_last(strings_left);
                SubLObject cdolist_list_var = constrained_parsing_query((SubLObject)constrained_parsing.$sym234$_FUNC, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const213$termStrings, (SubLObject)constrained_parsing.$sym234$_FUNC, string_utilities.bunge(np_core, (SubLObject)constrained_parsing.UNPROVIDED)), (SubLObject)constrained_parsing.$list235), constrained_parsing.$const236$RelationParaphraseMt, (SubLObject)constrained_parsing.UNPROVIDED);
                SubLObject possible_func = (SubLObject)constrained_parsing.NIL;
                possible_func = cdolist_list_var.first();
                while (constrained_parsing.NIL != cdolist_list_var) {
                    SubLObject mod_core = (SubLObject)constrained_parsing.NIL;
                    if (constrained_parsing.NIL == enough_work_doneP) {
                        SubLObject csome_list_var_$9 = Sequences.reverse(strings_left);
                        SubLObject this_modifier = (SubLObject)constrained_parsing.NIL;
                        this_modifier = csome_list_var_$9.first();
                        while (constrained_parsing.NIL == enough_work_doneP && constrained_parsing.NIL != csome_list_var_$9) {
                            mod_core = (SubLObject)ConsesLow.cons(this_modifier, mod_core);
                            SubLObject answers = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const213$termStrings, (SubLObject)constrained_parsing.$sym211$_DENOT, string_utilities.bunge(mod_core, (SubLObject)constrained_parsing.UNPROVIDED)), (SubLObject)ConsesLow.list(constrained_parsing.$const231$admittedArgument, (SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)constrained_parsing.ONE_INTEGER, possible_func)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                            if (constrained_parsing.NIL != list_utilities.singletonP(answers)) {
                                all_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(possible_func, answers.first()), all_matches);
                            }
                            answers = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const232$wordStrings, (SubLObject)constrained_parsing.$sym181$_WU, string_utilities.bunge(mod_core, (SubLObject)constrained_parsing.UNPROVIDED)), (SubLObject)constrained_parsing.$list233, (SubLObject)ConsesLow.list(constrained_parsing.$const231$admittedArgument, (SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)constrained_parsing.ONE_INTEGER, possible_func)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                            if (constrained_parsing.NIL != list_utilities.singletonP(answers)) {
                                all_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(possible_func, answers.first()), all_matches);
                            }
                            csome_list_var_$9 = csome_list_var_$9.rest();
                            this_modifier = csome_list_var_$9.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    possible_func = cdolist_list_var.first();
                }
                csome_list_var = csome_list_var.rest();
                this_word = csome_list_var.first();
            }
        }
        all_matches = eliminate_redundant_narts(all_matches);
        if (constrained_parsing.NIL == all_matches || (constrained_parsing.NIL != list_utilities.lengthG(all_matches, (SubLObject)constrained_parsing.ONE_INTEGER, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL != parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw14$PROHIBITAMBIGUOUSGAFS, (SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE))) {
            return (SubLObject)constrained_parsing.$kw192$NADA;
        }
        SubLObject cdolist_list_var2 = all_matches;
        SubLObject this_match = (SubLObject)constrained_parsing.NIL;
        this_match = cdolist_list_var2.first();
        while (constrained_parsing.NIL != cdolist_list_var2) {
            if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, cycl_utilities.formula_arg0(this_match), (SubLObject)constrained_parsing.$list237), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                final SubLObject group_col = this_match;
                SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, group_col), (SubLObject)constrained_parsing.$kw113$DEFAULT, string_utilities.bunge(the_strings, (SubLObject)constrained_parsing.UNPROVIDED));
                if (constrained_parsing.NIL != channel_says) {
                    channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                }
                if (constrained_parsing.NIL != channel_says) {
                    any_work_doneP = channel_says;
                }
            }
            else {
                SubLObject channel_says2 = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const107$rewriteOf, this_match, the_term), (SubLObject)constrained_parsing.$kw113$DEFAULT, string_utilities.bunge(the_strings, (SubLObject)constrained_parsing.UNPROVIDED));
                if (constrained_parsing.NIL != channel_says2) {
                    channel_says2 = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                }
                if (constrained_parsing.NIL != channel_says2) {
                    any_work_doneP = channel_says2;
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_match = cdolist_list_var2.first();
        }
        return any_work_doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 60353L)
    public static SubLObject constrained_parse_via_relation_all_instance(final SubLObject the_term, final SubLObject the_strings) {
        SubLObject head = (SubLObject)constrained_parsing.NIL;
        SubLObject work_doneP = (SubLObject)constrained_parsing.$kw192$NADA;
        SubLObject string_copies = conses_high.copy_list(the_strings);
        while (constrained_parsing.NIL != list_utilities.lengthG(string_copies, (SubLObject)constrained_parsing.ONE_INTEGER, (SubLObject)constrained_parsing.UNPROVIDED)) {
            if (constrained_parsing.NIL == head) {
                head = (SubLObject)ConsesLow.list(list_utilities.last_one(string_copies));
            }
            else {
                head = (SubLObject)ConsesLow.cons(list_utilities.last_one(string_copies), head);
            }
            string_copies = list_utilities.remove_last(string_copies);
            SubLObject cdolist_list_var = constrained_parsing_query((SubLObject)constrained_parsing.$list242, (SubLObject)ConsesLow.listS(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const193$termPhrases, (SubLObject)constrained_parsing.$sym243$_PRED, constrained_parsing.$const240$Noun, string_utilities.bunge(head, (SubLObject)constrained_parsing.UNPROVIDED)), (SubLObject)ConsesLow.listS(constrained_parsing.$const231$admittedArgument, the_term, (SubLObject)constrained_parsing.$list244), (SubLObject)constrained_parsing.$list245), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
            SubLObject v_answer = (SubLObject)constrained_parsing.NIL;
            v_answer = cdolist_list_var.first();
            while (constrained_parsing.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = v_answer;
                SubLObject pred = (SubLObject)constrained_parsing.NIL;
                SubLObject col1 = (SubLObject)constrained_parsing.NIL;
                SubLObject col2 = (SubLObject)constrained_parsing.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list238);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list238);
                col1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_parsing.$list238);
                col2 = current.first();
                current = current.rest();
                if (constrained_parsing.NIL == current) {
                    final SubLObject source_string = constrained_parsing_choose_string_sources(string_utilities.bunge(the_strings, (SubLObject)constrained_parsing.UNPROVIDED), string_utilities.bunge(string_copies, (SubLObject)constrained_parsing.UNPROVIDED));
                    if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, col2), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                        SubLObject cdolist_list_var_$10 = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const193$termPhrases, (SubLObject)constrained_parsing.$sym211$_DENOT, constrained_parsing.$const240$Noun, list_utilities.last_one(string_copies)), (SubLObject)ConsesLow.list(constrained_parsing.$const125$genls, (SubLObject)constrained_parsing.$sym211$_DENOT, col1)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                        SubLObject denot = (SubLObject)constrained_parsing.NIL;
                        denot = cdolist_list_var_$10.first();
                        while (constrained_parsing.NIL != cdolist_list_var_$10) {
                            SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const239$relationExistsInstance, pred, denot, the_term), (SubLObject)constrained_parsing.$kw113$DEFAULT, source_string);
                            if (constrained_parsing.NIL != channel_says) {
                                channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                            }
                            if (constrained_parsing.NIL != channel_says) {
                                work_doneP = channel_says;
                            }
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            denot = cdolist_list_var_$10.first();
                        }
                        SubLObject cdolist_list_var_$11 = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const232$wordStrings, (SubLObject)constrained_parsing.$sym181$_WU, list_utilities.last_one(string_copies)), (SubLObject)constrained_parsing.$list241, (SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, (SubLObject)constrained_parsing.$sym211$_DENOT, col1)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                        denot = (SubLObject)constrained_parsing.NIL;
                        denot = cdolist_list_var_$11.first();
                        while (constrained_parsing.NIL != cdolist_list_var_$11) {
                            SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(pred, denot, the_term), (SubLObject)constrained_parsing.$kw113$DEFAULT, source_string);
                            if (constrained_parsing.NIL != channel_says) {
                                channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                            }
                            if (constrained_parsing.NIL != channel_says) {
                                work_doneP = channel_says;
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            denot = cdolist_list_var_$11.first();
                        }
                        SubLObject cdolist_list_var_$12 = constrained_parsing_query_lexical((SubLObject)constrained_parsing.$sym211$_DENOT, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)ConsesLow.list(constrained_parsing.$const232$wordStrings, (SubLObject)constrained_parsing.$sym181$_WU, list_utilities.last_one(string_copies)), (SubLObject)constrained_parsing.$list241, (SubLObject)ConsesLow.list(constrained_parsing.$const125$genls, (SubLObject)constrained_parsing.$sym211$_DENOT, col1)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                        denot = (SubLObject)constrained_parsing.NIL;
                        denot = cdolist_list_var_$12.first();
                        while (constrained_parsing.NIL != cdolist_list_var_$12) {
                            SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const239$relationExistsInstance, pred, denot, the_term), (SubLObject)constrained_parsing.$kw113$DEFAULT, source_string);
                            if (constrained_parsing.NIL != channel_says) {
                                channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                            }
                            if (constrained_parsing.NIL != channel_says) {
                                work_doneP = channel_says;
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            denot = cdolist_list_var_$12.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_parsing.$list238);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            }
        }
        return work_doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 62446L)
    public static SubLObject constrained_parse_of_namestring_for_term(final SubLObject the_term, final SubLObject namestring) {
        if (constrained_parsing.NIL != parsing_constraint_outranksP((SubLObject)constrained_parsing.$kw82$AVOIDNAMESTRINGPARSES, (SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF)) {
            return (SubLObject)constrained_parsing.$kw192$NADA;
        }
        if (constrained_parsing.NIL != isa.isaP(the_term, constrained_parsing.$const246$Person, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parse_search_for_rewrites(the_term, namestring, constrained_parsing.$const219$preferredNameString).eql((SubLObject)constrained_parsing.$kw196$WORK_DONE)) {
            return (SubLObject)constrained_parsing.$kw196$WORK_DONE;
        }
        if ((constrained_parsing.NIL != isa.isaP(the_term, constrained_parsing.$const247$Organization, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) || constrained_parsing.NIL != isa.isaP(the_term, constrained_parsing.$const248$GeopoliticalEntity, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) && constrained_parse_search_for_rewrites(the_term, namestring, constrained_parsing.$const213$termStrings).eql((SubLObject)constrained_parsing.$kw196$WORK_DONE)) {
            return (SubLObject)constrained_parsing.$kw196$WORK_DONE;
        }
        final SubLObject namesP = constrained_parse_of_first_and_last_names(the_term, namestring);
        if (!namesP.eql((SubLObject)constrained_parsing.$kw192$NADA)) {
            return namesP;
        }
        final SubLObject businessP = constrained_parse_of_business_suffix(the_term, namestring);
        if (!businessP.eql((SubLObject)constrained_parsing.$kw192$NADA)) {
            return businessP;
        }
        return (SubLObject)constrained_parsing.$kw192$NADA;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 63677L)
    public static SubLObject constrained_parse_of_business_suffix(final SubLObject the_term, final SubLObject namestring) {
        SubLObject work_doneP = (SubLObject)constrained_parsing.$kw192$NADA;
        if (constrained_parsing.NIL == constrained_parsing_query_successP((SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list249), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list250), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const229$or, (SubLObject)ConsesLow.list(constrained_parsing.$const251$substring, (SubLObject)constrained_parsing.$str252$___Co, namestring), (SubLObject)ConsesLow.list(constrained_parsing.$const251$substring, (SubLObject)constrained_parsing.$str253$_Company, namestring), (SubLObject)ConsesLow.list(constrained_parsing.$const251$substring, (SubLObject)constrained_parsing.$str254$_Plc, namestring), (SubLObject)ConsesLow.list(constrained_parsing.$const251$substring, (SubLObject)constrained_parsing.$str255$_Ltd, namestring)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
            final SubLObject group_col = constrained_parsing.$const256$Business;
            SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, group_col), (SubLObject)constrained_parsing.$kw113$DEFAULT, namestring);
            if (constrained_parsing.NIL != channel_says) {
                channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
            }
            if (constrained_parsing.NIL != channel_says) {
                work_doneP = channel_says;
            }
        }
        return work_doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 64493L)
    public static SubLObject constrained_parse_of_first_and_last_names(final SubLObject the_term, final SubLObject namestring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL != string_utilities.substringP((SubLObject)constrained_parsing.$str257$_, namestring, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED) && constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const229$or, (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list129), (SubLObject)ConsesLow.listS(constrained_parsing.$const128$isa, the_term, (SubLObject)constrained_parsing.$list258)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
            SubLObject saved_given_name = (SubLObject)constrained_parsing.NIL;
            SubLObject saved_family_name = (SubLObject)constrained_parsing.NIL;
            final SubLObject known_family_nameP = (SubLObject)constrained_parsing.NIL;
            SubLObject searchspace = string_utilities.split_string(namestring, (SubLObject)constrained_parsing.UNPROVIDED);
            SubLObject this_name = (SubLObject)constrained_parsing.NIL;
            SubLObject name_list = (SubLObject)constrained_parsing.NIL;
            while (constrained_parsing.NIL != list_utilities.lengthG(searchspace, (SubLObject)constrained_parsing.ONE_INTEGER, (SubLObject)constrained_parsing.UNPROVIDED)) {
                this_name = searchspace.first();
                if (constrained_parsing.NIL != list_utilities.proper_list_p(name_list)) {
                    name_list = list_utilities.flatten((SubLObject)ConsesLow.list(name_list, this_name));
                }
                else if (constrained_parsing.NIL == name_list && constrained_parse_of_salutation_if_any(the_term, this_name).eql((SubLObject)constrained_parsing.$kw192$NADA)) {
                    name_list = (SubLObject)ConsesLow.list(this_name);
                }
                searchspace = searchspace.rest();
                final SubLObject bunged_given_name = string_utilities.bunge(name_list, (SubLObject)constrained_parsing.UNPROVIDED);
                if (constrained_parsing.NIL != constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym259$_CONSTANT, (SubLObject)ConsesLow.list(constrained_parsing.$const229$or, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)constrained_parsing.$list260, (SubLObject)ConsesLow.list(constrained_parsing.$const261$nameSpelling, (SubLObject)constrained_parsing.$sym259$_CONSTANT, bunged_given_name)), (SubLObject)ConsesLow.list(constrained_parsing.$const262$givenNames, (SubLObject)constrained_parsing.$sym259$_CONSTANT, bunged_given_name))), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                    final SubLObject bunged_family_name = string_utilities.bunge(searchspace, (SubLObject)constrained_parsing.UNPROVIDED);
                    final SubLObject found_familyP = constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const120$thereExists, (SubLObject)constrained_parsing.$sym259$_CONSTANT, (SubLObject)ConsesLow.list(constrained_parsing.$const229$or, (SubLObject)ConsesLow.list(constrained_parsing.$const122$and, (SubLObject)constrained_parsing.$list263, (SubLObject)ConsesLow.list(constrained_parsing.$const261$nameSpelling, (SubLObject)constrained_parsing.$sym259$_CONSTANT, bunged_family_name)), (SubLObject)ConsesLow.list(constrained_parsing.$const264$familyName, (SubLObject)constrained_parsing.$sym259$_CONSTANT, bunged_family_name))), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
                    if (constrained_parsing.NIL != found_familyP && constrained_parsing.NIL != known_family_nameP) {
                        return (SubLObject)constrained_parsing.$kw192$NADA;
                    }
                    if (constrained_parsing.NIL != found_familyP) {
                        saved_given_name = bunged_given_name;
                        saved_family_name = bunged_family_name;
                    }
                    else {
                        if (constrained_parsing.NIL != saved_given_name) {
                            continue;
                        }
                        saved_given_name = bunged_given_name;
                        saved_family_name = bunged_family_name;
                    }
                }
            }
            if (constrained_parsing.NIL != saved_given_name && constrained_parsing.NIL != saved_family_name) {
                SubLObject work_doneP = (SubLObject)constrained_parsing.$kw192$NADA;
                final SubLObject _prev_bind_0 = constrained_parsing.$constrained_parsing_assert_into_mt$.currentBinding(thread);
                try {
                    constrained_parsing.$constrained_parsing_assert_into_mt$.bind(constrained_parsing.$const118$EnglishMt, thread);
                    final SubLObject possible_source = constrained_parsing_choose_string_sources(namestring, (SubLObject)constrained_parsing.NIL);
                    SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const262$givenNames, the_term, saved_given_name), (SubLObject)constrained_parsing.$kw113$DEFAULT, possible_source);
                    if (constrained_parsing.NIL != channel_says) {
                        channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                    }
                    if (constrained_parsing.NIL != channel_says) {
                        work_doneP = channel_says;
                    }
                    channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const264$familyName, the_term, saved_family_name), (SubLObject)constrained_parsing.$kw113$DEFAULT, possible_source);
                    if (constrained_parsing.NIL != channel_says) {
                        channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
                    }
                    if (constrained_parsing.NIL != channel_says) {
                        work_doneP = channel_says;
                    }
                }
                finally {
                    constrained_parsing.$constrained_parsing_assert_into_mt$.rebind(_prev_bind_0, thread);
                }
                return work_doneP;
            }
        }
        return (SubLObject)constrained_parsing.$kw192$NADA;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 67476L)
    public static SubLObject constrained_parse_of_salutation_if_any(final SubLObject the_term, final SubLObject the_string) {
        final SubLObject answers = constrained_parsing_query((SubLObject)constrained_parsing.$sym265$_SALUT, (SubLObject)ConsesLow.listS(constrained_parsing.$const266$codeMapping, constrained_parsing.$const267$SalutationMapping, the_string, (SubLObject)constrained_parsing.$list268), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
        SubLObject assert_these = (SubLObject)constrained_parsing.NIL;
        SubLObject work_doneP = (SubLObject)constrained_parsing.$kw192$NADA;
        if (constrained_parsing.NIL != list_utilities.singletonP(answers)) {
            final SubLObject first_pass = constrained_parsing_query((SubLObject)constrained_parsing.$sym145$_COL, (SubLObject)ConsesLow.list(constrained_parsing.$const269$relationAllInstance, constrained_parsing.$const270$salutation, (SubLObject)constrained_parsing.$sym145$_COL, answers.first()), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
            if (constrained_parsing.NIL != list_of_not_disjoint_collections_p(first_pass)) {
                SubLObject cdolist_list_var = first_pass;
                SubLObject this_col = (SubLObject)constrained_parsing.NIL;
                this_col = cdolist_list_var.first();
                while (constrained_parsing.NIL != cdolist_list_var) {
                    if (constrained_parsing.NIL == constrained_parsing_query_successP((SubLObject)ConsesLow.list(constrained_parsing.$const127$not, (SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, this_col)), (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED)) {
                        assert_these = (SubLObject)ConsesLow.cons(this_col, assert_these);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    this_col = cdolist_list_var.first();
                }
            }
        }
        SubLObject cdolist_list_var2 = assert_these;
        SubLObject this_col2 = (SubLObject)constrained_parsing.NIL;
        this_col2 = cdolist_list_var2.first();
        while (constrained_parsing.NIL != cdolist_list_var2) {
            final SubLObject group_col = this_col2;
            SubLObject channel_says = constrained_parsing_possibly_assert((SubLObject)ConsesLow.list(constrained_parsing.$const128$isa, the_term, group_col), (SubLObject)constrained_parsing.$kw113$DEFAULT, the_string);
            if (constrained_parsing.NIL != channel_says) {
                channel_says = (SubLObject)constrained_parsing.$kw196$WORK_DONE;
            }
            if (constrained_parsing.NIL != channel_says) {
                work_doneP = channel_says;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_col2 = cdolist_list_var2.first();
        }
        return work_doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_demo_rank_assertion_mts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_parsing.NIL == constrained_parsing.$acquaint_demo_assertion_filter$.getDynamicValue(thread)) {
            constrained_parsing.$acquaint_demo_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter((SubLObject)constrained_parsing.$kw76$ASSERTINTOMT, constrained_parsing.$const92$Relation, constrained_parsing.$const271$BBN_CDE_StrengthenedMt), thread);
        }
        if (constrained_parsing.NIL == constrained_parsing.$acquaint_demo_lexical_assertion_filter$.getDynamicValue(thread)) {
            constrained_parsing.$acquaint_demo_lexical_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter((SubLObject)constrained_parsing.$kw76$ASSERTINTOMT, constrained_parsing.$const272$nameString, constrained_parsing.$const118$EnglishMt), thread);
        }
        frontload_parsing_constraint(constrained_parsing.$acquaint_demo_assertion_filter$.getDynamicValue(thread));
        frontload_parsing_constraint(constrained_parsing.$acquaint_demo_lexical_assertion_filter$.getDynamicValue(thread));
        return current_parsing_constraint_rankings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject initialize_acquaint_highly_relevant_rankings() {
        Errors.warn((SubLObject)constrained_parsing.$str273$____DEMO__initializing_rankings_w);
        initialize_constrained_parsing((SubLObject)constrained_parsing.T, (SubLObject)constrained_parsing.UNPROVIDED);
        acquaint_demo_rank_assertion_mts();
        order_parsing_constraints((SubLObject)constrained_parsing.$kw26$MINIMALTIMEPARSE, (SubLObject)constrained_parsing.$kw12$AVOIDREDUNDANTFACETS, (SubLObject)constrained_parsing.$kw97$DEMOTE);
        return current_parsing_constraint_rankings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject initialize_acquaint_sort_of_relevant_rankings() {
        Errors.warn((SubLObject)constrained_parsing.$str274$____DEMO__reverting_to_standard_c);
        initialize_constrained_parsing((SubLObject)constrained_parsing.T, (SubLObject)constrained_parsing.UNPROVIDED);
        acquaint_demo_rank_assertion_mts();
        return current_parsing_constraint_rankings();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject highly_relevant_acquaint_answerP(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numGE(methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)constrained_parsing.$sym275$GET_RELEVANCE), constrained_parsing.$acquaint_highly_relevant_cutoff$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_demo_who_is(final SubLObject name, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert constrained_parsing.NIL != string_utilities.capitalized_string_p(name) : name;
        final SubLObject questions = (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)constrained_parsing.NIL, (SubLObject)constrained_parsing.$str277$Who_is__A_, name));
        initialize_acquaint_highly_relevant_rankings();
        SubLObject cdolist_list_var = questions;
        SubLObject q = (SubLObject)constrained_parsing.NIL;
        q = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            final SubLObject this_query = question.new_question(q, (SubLObject)constrained_parsing.UNPROVIDED, (SubLObject)constrained_parsing.UNPROVIDED);
            SubLObject re_initializedP = (SubLObject)constrained_parsing.NIL;
            assert constrained_parsing.NIL != definitional_question.definitional_question_p(this_query) : this_query;
            SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args(this_query, (SubLObject)constrained_parsing.$sym281$ANSWER);
            SubLObject this_answer = (SubLObject)constrained_parsing.NIL;
            this_answer = cdolist_list_var_$13.first();
            while (constrained_parsing.NIL != cdolist_list_var_$13) {
                if (constrained_parsing.NIL == re_initializedP && constrained_parsing.NIL == highly_relevant_acquaint_answerP(this_answer)) {
                    re_initializedP = initialize_acquaint_sort_of_relevant_rankings();
                }
                Errors.warn((SubLObject)constrained_parsing.$str279$____processing__A, this_answer);
                final SubLObject _prev_bind_0 = constrained_parsing.$constrained_parsing_tracking_stringsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = constrained_parsing.$constrained_parsing_show_inference_metricsP$.currentBinding(thread);
                try {
                    constrained_parsing.$constrained_parsing_tracking_stringsP$.bind((SubLObject)constrained_parsing.T, thread);
                    constrained_parsing.$constrained_parsing_show_inference_metricsP$.bind((SubLObject)constrained_parsing.T, thread);
                    constrained_parse_of_strings_for_term(v_term, (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(this_answer, (SubLObject)constrained_parsing.$sym280$GET_CONTENT)));
                }
                finally {
                    constrained_parsing.$constrained_parsing_show_inference_metricsP$.rebind(_prev_bind_2, thread);
                    constrained_parsing.$constrained_parsing_tracking_stringsP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                this_answer = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            q = cdolist_list_var.first();
        }
        cdolist_list_var = constrained_parsing_get_actions();
        SubLObject this_action = (SubLObject)constrained_parsing.NIL;
        this_action = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)constrained_parsing.T, (SubLObject)constrained_parsing.$str282$_S__, this_action);
            cdolist_list_var = cdolist_list_var.rest();
            this_action = cdolist_list_var.first();
        }
        return (SubLObject)constrained_parsing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_demo_verify_isas(final SubLObject v_term, final SubLObject isas) {
        SubLObject successP = (SubLObject)constrained_parsing.T;
        SubLObject cdolist_list_var = isas;
        SubLObject should_be = (SubLObject)constrained_parsing.NIL;
        should_be = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL == isa.isa_in_any_mtP(v_term, narts_high.nart_substitute(should_be))) {
                Errors.warn((SubLObject)constrained_parsing.$str283$____DEMO_____isa__A__A__wasn_t_fo, v_term, should_be);
                successP = (SubLObject)constrained_parsing.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            should_be = cdolist_list_var.first();
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_blair_demo() {
        acquaint_demo_who_is((SubLObject)constrained_parsing.$str284$Tony_Blair, constrained_parsing.$const285$TonyBlair);
        if (constrained_parsing.NIL == list_utilities.lengthE(constrained_parsing_query((SubLObject)constrained_parsing.$sym286$_WHERE, (SubLObject)constrained_parsing.$list287, constrained_parsing.$const271$BBN_CDE_StrengthenedMt, (SubLObject)constrained_parsing.UNPROVIDED), (SubLObject)constrained_parsing.TWO_INTEGER, (SubLObject)constrained_parsing.UNPROVIDED)) {
            Errors.warn((SubLObject)constrained_parsing.$str288$____DEMO_____primeMinister_WHATEV);
            return (SubLObject)constrained_parsing.NIL;
        }
        if (constrained_parsing.NIL != isa.isa_in_any_mtP(constrained_parsing.$const285$TonyBlair, constrained_parsing.$const289$Warrior)) {
            Errors.warn((SubLObject)constrained_parsing.$str290$____DEMO____TonyBlair_was_mistake);
            return (SubLObject)constrained_parsing.NIL;
        }
        return (SubLObject)constrained_parsing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_hussein_demo() {
        acquaint_demo_who_is((SubLObject)constrained_parsing.$str291$Saddam_Hussein, constrained_parsing.$const292$SaddamHusseinAl_Takriti);
        return acquaint_demo_verify_isas(constrained_parsing.$const292$SaddamHusseinAl_Takriti, (SubLObject)ConsesLow.list(constrained_parsing.$const293$Vicious, (SubLObject)ConsesLow.list(constrained_parsing.$const294$PresidentFn, constrained_parsing.$const295$Iraq)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_clinton_demo() {
        acquaint_demo_who_is((SubLObject)constrained_parsing.$str296$Bill_Clinton, constrained_parsing.$const297$BillClinton);
        return acquaint_demo_verify_isas(constrained_parsing.$const297$BillClinton, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constrained_parsing.$const294$PresidentFn, constrained_parsing.$const298$UnitedStatesOfAmerica)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
    public static SubLObject acquaint_osama_demo() {
        acquaint_demo_who_is((SubLObject)constrained_parsing.$str299$Osama, constrained_parsing.$const300$OsamaBinLaden);
        SubLObject successP = (SubLObject)constrained_parsing.T;
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constrained_parsing.$const294$PresidentFn, constrained_parsing.$const298$UnitedStatesOfAmerica));
        SubLObject should_be = (SubLObject)constrained_parsing.NIL;
        should_be = cdolist_list_var.first();
        while (constrained_parsing.NIL != cdolist_list_var) {
            if (constrained_parsing.NIL == isa.isa_in_any_mtP(constrained_parsing.$const292$SaddamHusseinAl_Takriti, narts_high.nart_substitute(should_be))) {
                Errors.warn((SubLObject)constrained_parsing.$str301$____DEMO_____isa___SaddamHusseinA, should_be);
                successP = (SubLObject)constrained_parsing.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            should_be = cdolist_list_var.first();
        }
        return successP;
    }
    
    public static SubLObject declare_constrained_parsing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "list_of_not_disjoint_collections_p", "LIST-OF-NOT-DISJOINT-COLLECTIONS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "subcollection_naut_p", "SUBCOLLECTION-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "list_elements_preceding", "LIST-ELEMENTS-PRECEDING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "rotate_list_around_pivot", "ROTATE-LIST-AROUND-PIVOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "current_parsing_constraint_rankings", "CURRENT-PARSING-CONSTRAINT-RANKINGS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "without_asserting_gafs", "WITHOUT-ASSERTING-GAFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_assert_gafsP", "CONSTRAINED-PARSING-ASSERT-GAFS?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "while_tracking_strings", "WHILE-TRACKING-STRINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_tracking_stringsP", "CONSTRAINED-PARSING-TRACKING-STRINGS?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "while_tracking_substrings", "WHILE-TRACKING-SUBSTRINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_tracking_substringsP", "CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_choose_string_sources", "CONSTRAINED-PARSING-CHOOSE-STRING-SOURCES", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_warn", "CONSTRAINED-PARSING-WARN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_get_actions", "CONSTRAINED-PARSING-GET-ACTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_clear_actions", "CONSTRAINED-PARSING-CLEAR-ACTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_record_action", "CONSTRAINED-PARSING-RECORD-ACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_new_isa_permissiveness_principles", "GET-NEW-ISA-PERMISSIVENESS-PRINCIPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "new_isa_permissiveness_principle_p", "NEW-ISA-PERMISSIVENESS-PRINCIPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_parsing_flow_control_principles", "GET-PARSING-FLOW-CONTROL-PRINCIPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_flow_control_principle_p", "PARSING-FLOW-CONTROL-PRINCIPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_faithfulness_filter_print_function_trampoline", "PARSING-FAITHFULNESS-FILTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_faithfulness_filter_p", "PARSING-FAITHFULNESS-FILTER-P", 1, 0, false);
        new $parsing_faithfulness_filter_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_faithfulness_filter_type", "PARSING-FAITHFULNESS-FILTER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_faithfulness_filter_mt", "PARSING-FAITHFULNESS-FILTER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "_csetf_parsing_faithfulness_filter_type", "_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "_csetf_parsing_faithfulness_filter_mt", "_CSETF-PARSING-FAITHFULNESS-FILTER-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "make_parsing_faithfulness_filter", "MAKE-PARSING-FAITHFULNESS-FILTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "visit_defstruct_parsing_faithfulness_filter", "VISIT-DEFSTRUCT-PARSING-FAITHFULNESS-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "visit_defstruct_object_parsing_faithfulness_filter_method", "VISIT-DEFSTRUCT-OBJECT-PARSING-FAITHFULNESS-FILTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "pprint_faithfulness_filter", "PPRINT-FAITHFULNESS-FILTER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_parsing_faithfulness_filter_types", "GET-PARSING-FAITHFULNESS-FILTER-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_faithfulness_filter_type_p", "PARSING-FAITHFULNESS-FILTER-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_parsing_faithfulness_filters", "GET-PARSING-FAITHFULNESS-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "new_parsing_faithfulness_filter", "NEW-PARSING-FAITHFULNESS-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_arbitrary_filter_print_function_trampoline", "PARSING-ARBITRARY-FILTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_arbitrary_filter_p", "PARSING-ARBITRARY-FILTER-P", 1, 0, false);
        new $parsing_arbitrary_filter_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_arbitrary_filter_type", "PARSING-ARBITRARY-FILTER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_arbitrary_filter_details", "PARSING-ARBITRARY-FILTER-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_arbitrary_filter_mt", "PARSING-ARBITRARY-FILTER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "_csetf_parsing_arbitrary_filter_type", "_CSETF-PARSING-ARBITRARY-FILTER-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "_csetf_parsing_arbitrary_filter_details", "_CSETF-PARSING-ARBITRARY-FILTER-DETAILS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "_csetf_parsing_arbitrary_filter_mt", "_CSETF-PARSING-ARBITRARY-FILTER-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "make_parsing_arbitrary_filter", "MAKE-PARSING-ARBITRARY-FILTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "visit_defstruct_parsing_arbitrary_filter", "VISIT-DEFSTRUCT-PARSING-ARBITRARY-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "visit_defstruct_object_parsing_arbitrary_filter_method", "VISIT-DEFSTRUCT-OBJECT-PARSING-ARBITRARY-FILTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "pprint_arbitrary_filter", "PPRINT-ARBITRARY-FILTER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_parsing_arbitrary_filter_types", "GET-PARSING-ARBITRARY-FILTER-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_arbitrary_filter_type_p", "PARSING-ARBITRARY-FILTER-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_parsing_arbitrary_filters", "GET-PARSING-ARBITRARY-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "new_parsing_arbitrary_filter", "NEW-PARSING-ARBITRARY-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_bug_avoidance_principles", "GET-BUG-AVOIDANCE-PRINCIPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "bug_avoidance_principle_p", "BUG-AVOIDANCE-PRINCIPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_principle_p", "PARSING-PRINCIPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_filter_p", "PARSING-FILTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_filter_type_p", "PARSING-FILTER-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_all_parsing_principles", "GET-ALL-PARSING-PRINCIPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_all_parsing_filter_types", "GET-ALL-PARSING-FILTER-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_all_parsing_filters", "GET-ALL-PARSING-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "get_all_parsing_constraints", "GET-ALL-PARSING-CONSTRAINTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_constraint_p", "PARSING-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "do_constrained_parsing_constraints", "DO-CONSTRAINED-PARSING-CONSTRAINTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "do_constrained_parsing_principles", "DO-CONSTRAINED-PARSING-PRINCIPLES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "do_constrained_parsing_filters", "DO-CONSTRAINED-PARSING-FILTERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "initialize_constrained_parsing", "INITIALIZE-CONSTRAINED-PARSING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "parsing_constraint_outranksP", "PARSING-CONSTRAINT-OUTRANKS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "which_constraints_outrank", "WHICH-CONSTRAINTS-OUTRANK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "order_parsing_constraints", "ORDER-PARSING-CONSTRAINTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "frontload_parsing_constraint", "FRONTLOAD-PARSING-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_query_defaults", "CONSTRAINED-PARSING-QUERY-DEFAULTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "without_rewrite_backtracking", "WITHOUT-REWRITE-BACKTRACKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_rewrite_backtracking", "CONSTRAINED-PARSING-REWRITE-BACKTRACKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_query", "CONSTRAINED-PARSING-QUERY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_query_lexical", "CONSTRAINED-PARSING-QUERY-LEXICAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_query_successP", "CONSTRAINED-PARSING-QUERY-SUCCESS?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_involves_group_coercionP", "CONSTRAINED-PARSE-INVOLVES-GROUP-COERCION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_illegal_isa_workaroundP", "CONSTRAINED-PARSING-ILLEGAL-ISA-WORKAROUND?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_gaf_fails_constraintsP_int", "CONSTRAINED-PARSING-GAF-FAILS-CONSTRAINTS?-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_gaf_fails_constraintsP", "CONSTRAINED-PARSING-GAF-FAILS-CONSTRAINTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_unassert", "CONSTRAINED-PARSING-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_possibly_assert", "CONSTRAINED-PARSING-POSSIBLY-ASSERT", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_assert_through_channels", "CONSTRAINED-PARSING-ASSERT-THROUGH-CHANNELS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_coerce_to_group", "CONSTRAINED-PARSING-COERCE-TO-GROUP", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_note_isa", "CONSTRAINED-PARSING-NOTE-ISA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_explode_np_string", "CONSTRAINED-PARSE-EXPLODE-NP-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_strings_for_term", "CONSTRAINED-PARSE-OF-STRINGS-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_get_acceptable_isas", "CONSTRAINED-PARSING-GET-ACCEPTABLE-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_substrings_for_term", "CONSTRAINED-PARSE-OF-SUBSTRINGS-FOR-TERM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parsing_faceting_violationP", "CONSTRAINED-PARSING-FACETING-VIOLATION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_string_for_term", "CONSTRAINED-PARSE-OF-STRING-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_string_for_term_int", "CONSTRAINED-PARSE-OF-STRING-FOR-TERM-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_extract_cardinality", "CONSTRAINED-PARSE-EXTRACT-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_search_for_rewrites", "CONSTRAINED-PARSE-SEARCH-FOR-REWRITES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "frontload_genitive_if_any", "FRONTLOAD-GENITIVE-IF-ANY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "eliminate_redundant_narts", "ELIMINATE-REDUNDANT-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_nart_isas", "CONSTRAINED-PARSE-OF-NART-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_via_relation_all_instance", "CONSTRAINED-PARSE-VIA-RELATION-ALL-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_namestring_for_term", "CONSTRAINED-PARSE-OF-NAMESTRING-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_business_suffix", "CONSTRAINED-PARSE-OF-BUSINESS-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_first_and_last_names", "CONSTRAINED-PARSE-OF-FIRST-AND-LAST-NAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "constrained_parse_of_salutation_if_any", "CONSTRAINED-PARSE-OF-SALUTATION-IF-ANY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_demo_rank_assertion_mts", "ACQUAINT-DEMO-RANK-ASSERTION-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "initialize_acquaint_highly_relevant_rankings", "INITIALIZE-ACQUAINT-HIGHLY-RELEVANT-RANKINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "initialize_acquaint_sort_of_relevant_rankings", "INITIALIZE-ACQUAINT-SORT-OF-RELEVANT-RANKINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "highly_relevant_acquaint_answerP", "HIGHLY-RELEVANT-ACQUAINT-ANSWER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_demo_who_is", "ACQUAINT-DEMO-WHO-IS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_demo_verify_isas", "ACQUAINT-DEMO-VERIFY-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_blair_demo", "ACQUAINT-BLAIR-DEMO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_hussein_demo", "ACQUAINT-HUSSEIN-DEMO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_clinton_demo", "ACQUAINT-CLINTON-DEMO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_parsing", "acquaint_osama_demo", "ACQUAINT-OSAMA-DEMO", 0, 0, false);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    public static SubLObject init_constrained_parsing_file() {
        constrained_parsing.$constrained_parsing_rankings$ = SubLFiles.deflexical("*CONSTRAINED-PARSING-RANKINGS*", (SubLObject)(maybeDefault((SubLObject)constrained_parsing.$sym1$_CONSTRAINED_PARSING_RANKINGS_, constrained_parsing.$constrained_parsing_rankings$, constrained_parsing.NIL)));
        constrained_parsing.$constrained_parsing_without_assertingP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_tracking_stringsP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-TRACKING-STRINGS?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_tracking_substringsP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_trace_level$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-TRACE-LEVEL*", (SubLObject)constrained_parsing.ZERO_INTEGER);
        constrained_parsing.$constrained_parsing_action_log$ = SubLFiles.deflexical("*CONSTRAINED-PARSING-ACTION-LOG*", (SubLObject)(maybeDefault((SubLObject)constrained_parsing.$sym11$_CONSTRAINED_PARSING_ACTION_LOG_, constrained_parsing.$constrained_parsing_action_log$, constrained_parsing.NIL)));
        constrained_parsing.$constrained_parsing_case_sensitiveP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-CASE-SENSITIVE?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_assert_into_mt$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-ASSERT-INTO-MT*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_consider_adjectivesP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-CONSIDER-ADJECTIVES?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_cardinality_known$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-CARDINALITY-KNOWN*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_allow_group_coercionP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-ALLOW-GROUP-COERCION?*", (SubLObject)constrained_parsing.T);
        constrained_parsing.$new_isa_permissiveness_principles$ = SubLFiles.defparameter("*NEW-ISA-PERMISSIVENESS-PRINCIPLES*", (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw12$AVOIDREDUNDANTFACETS, (SubLObject)constrained_parsing.$kw13$PROHIBITSUBCOLLECTIONFNS, (SubLObject)constrained_parsing.$kw14$PROHIBITAMBIGUOUSGAFS, (SubLObject)constrained_parsing.$kw15$PERMISSIVENESSCUTOFF, (SubLObject)constrained_parsing.$kw16$PERMITALLNONDISJOINTISAS, (SubLObject)constrained_parsing.$kw17$PROHIBITGROUPCOERCION));
        constrained_parsing.$parsing_flow_control_principles$ = SubLFiles.defparameter("*PARSING-FLOW-CONTROL-PRINCIPLES*", (SubLObject)ConsesLow.list(new SubLObject[] { constrained_parsing.$kw18$STRIPCARDINALITY, constrained_parsing.$kw19$CASESENSITIVELEXICON, constrained_parsing.$kw20$WIDESCOPEPRECISION, constrained_parsing.$kw21$PERMITADJECTIVEPARSES, constrained_parsing.$kw22$PERMITNARTISAS, constrained_parsing.$kw23$RELATIONALLINSTANCEPARSE, constrained_parsing.$kw24$NARROWSCOPEPRECISION, constrained_parsing.$kw25$CASEINSENSITIVELEXICON, constrained_parsing.$kw26$MINIMALTIMEPARSE, constrained_parsing.$kw27$PERMITRELATIVECLAUSEPARSES, constrained_parsing.$kw28$PERMITPPCOMPPARSES }));
        constrained_parsing.$dtp_parsing_faithfulness_filter$ = SubLFiles.defconstant("*DTP-PARSING-FAITHFULNESS-FILTER*", (SubLObject)constrained_parsing.$sym29$PARSING_FAITHFULNESS_FILTER);
        constrained_parsing.$parsing_faithfulness_filter_types$ = SubLFiles.defparameter("*PARSING-FAITHFULNESS-FILTER-TYPES*", (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw51$OBEYISASINMT, (SubLObject)constrained_parsing.$kw52$OBEYGAFSINMT, (SubLObject)constrained_parsing.$kw53$FAITHFULNESSFILTERCUTOFF));
        constrained_parsing.$default_faithfulness_filter$ = SubLFiles.defparameter("*DEFAULT-FAITHFULNESS-FILTER*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$default_definitional_faithfulness_filter$ = SubLFiles.defparameter("*DEFAULT-DEFINITIONAL-FAITHFULNESS-FILTER*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$dtp_parsing_arbitrary_filter$ = SubLFiles.defconstant("*DTP-PARSING-ARBITRARY-FILTER*", (SubLObject)constrained_parsing.$sym56$PARSING_ARBITRARY_FILTER);
        constrained_parsing.$parsing_arbitrary_filter_types$ = SubLFiles.defparameter("*PARSING-ARBITRARY-FILTER-TYPES*", (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw75$NOISASARESPECS, (SubLObject)constrained_parsing.$kw76$ASSERTINTOMT, (SubLObject)constrained_parsing.$kw77$ARBITRARYFILTERCUTOFF));
        constrained_parsing.$default_assertion_filter$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-FILTER*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$default_definitional_assertion_filter$ = SubLFiles.defparameter("*DEFAULT-DEFINITIONAL-ASSERTION-FILTER*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$bug_avoidance_principles$ = SubLFiles.defparameter("*BUG-AVOIDANCE-PRINCIPLES*", (SubLObject)ConsesLow.list((SubLObject)constrained_parsing.$kw79$COMPENSATEFORISAPROBLEMS, (SubLObject)constrained_parsing.$kw80$BUGAVOIDANCECUTOFF, (SubLObject)constrained_parsing.$kw81$AVOIDREWRITEPARSES, (SubLObject)constrained_parsing.$kw82$AVOIDNAMESTRINGPARSES));
        constrained_parsing.$constrained_parsing_query_max_transformation_depth$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-QUERY-MAX-TRANSFORMATION-DEPTH*", (SubLObject)constrained_parsing.ZERO_INTEGER);
        constrained_parsing.$constrained_parsing_query_max_time$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-QUERY-MAX-TIME*", (SubLObject)constrained_parsing.$int99$30);
        constrained_parsing.$constrained_parsing_query_productivity_limit$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-QUERY-PRODUCTIVITY-LIMIT*", (SubLObject)constrained_parsing.$int100$2000000);
        constrained_parsing.$trace_new_cyc_queryP$ = SubLFiles.defparameter("*TRACE-NEW-CYC-QUERY?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$debug_new_cyc_queryP$ = SubLFiles.defparameter("*DEBUG-NEW-CYC-QUERY?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_rewrite_backtrackingP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*", (SubLObject)constrained_parsing.T);
        constrained_parsing.$with_faithfulness_cutoffP$ = SubLFiles.defparameter("*WITH-FAITHFULNESS-CUTOFF?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$skip_definitional_faithfulnessP$ = SubLFiles.defparameter("*SKIP-DEFINITIONAL-FAITHFULNESS?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$with_arbitrary_filter_cutoffP$ = SubLFiles.defparameter("*WITH-ARBITRARY-FILTER-CUTOFF?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$with_bug_avoidance_cutoffP$ = SubLFiles.defparameter("*WITH-BUG-AVOIDANCE-CUTOFF?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$constrained_parsing_show_inference_metricsP$ = SubLFiles.defparameter("*CONSTRAINED-PARSING-SHOW-INFERENCE-METRICS?*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$acquaint_highly_relevant_cutoff$ = SubLFiles.defparameter("*ACQUAINT-HIGHLY-RELEVANT-CUTOFF*", (SubLObject)constrained_parsing.TEN_INTEGER);
        constrained_parsing.$acquaint_demo_assertion_filter$ = SubLFiles.defparameter("*ACQUAINT-DEMO-ASSERTION-FILTER*", (SubLObject)constrained_parsing.NIL);
        constrained_parsing.$acquaint_demo_lexical_assertion_filter$ = SubLFiles.defparameter("*ACQUAINT-DEMO-LEXICAL-ASSERTION-FILTER*", (SubLObject)constrained_parsing.NIL);
        return (SubLObject)constrained_parsing.NIL;
    }
    
    public static SubLObject setup_constrained_parsing_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)constrained_parsing.$sym1$_CONSTRAINED_PARSING_RANKINGS_);
        subl_macro_promotions.declare_defglobal((SubLObject)constrained_parsing.$sym11$_CONSTRAINED_PARSING_ACTION_LOG_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), constrained_parsing.$dtp_parsing_faithfulness_filter$.getGlobalValue(), Symbols.symbol_function((SubLObject)constrained_parsing.$sym36$PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)constrained_parsing.$list37);
        Structures.def_csetf((SubLObject)constrained_parsing.$sym38$PARSING_FAITHFULNESS_FILTER_TYPE, (SubLObject)constrained_parsing.$sym39$_CSETF_PARSING_FAITHFULNESS_FILTER_TYPE);
        Structures.def_csetf((SubLObject)constrained_parsing.$sym40$PARSING_FAITHFULNESS_FILTER_MT, (SubLObject)constrained_parsing.$sym41$_CSETF_PARSING_FAITHFULNESS_FILTER_MT);
        Equality.identity((SubLObject)constrained_parsing.$sym29$PARSING_FAITHFULNESS_FILTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), constrained_parsing.$dtp_parsing_faithfulness_filter$.getGlobalValue(), Symbols.symbol_function((SubLObject)constrained_parsing.$sym49$VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), constrained_parsing.$dtp_parsing_arbitrary_filter$.getGlobalValue(), Symbols.symbol_function((SubLObject)constrained_parsing.$sym63$PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)constrained_parsing.$list64);
        Structures.def_csetf((SubLObject)constrained_parsing.$sym65$PARSING_ARBITRARY_FILTER_TYPE, (SubLObject)constrained_parsing.$sym66$_CSETF_PARSING_ARBITRARY_FILTER_TYPE);
        Structures.def_csetf((SubLObject)constrained_parsing.$sym67$PARSING_ARBITRARY_FILTER_DETAILS, (SubLObject)constrained_parsing.$sym68$_CSETF_PARSING_ARBITRARY_FILTER_DETAILS);
        Structures.def_csetf((SubLObject)constrained_parsing.$sym69$PARSING_ARBITRARY_FILTER_MT, (SubLObject)constrained_parsing.$sym70$_CSETF_PARSING_ARBITRARY_FILTER_MT);
        Equality.identity((SubLObject)constrained_parsing.$sym56$PARSING_ARBITRARY_FILTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), constrained_parsing.$dtp_parsing_arbitrary_filter$.getGlobalValue(), Symbols.symbol_function((SubLObject)constrained_parsing.$sym73$VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD));
        return (SubLObject)constrained_parsing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_constrained_parsing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_constrained_parsing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_constrained_parsing_file();
    }
    
    static {
        me = (SubLFile)new constrained_parsing();
        constrained_parsing.$constrained_parsing_rankings$ = null;
        constrained_parsing.$constrained_parsing_without_assertingP$ = null;
        constrained_parsing.$constrained_parsing_tracking_stringsP$ = null;
        constrained_parsing.$constrained_parsing_tracking_substringsP$ = null;
        constrained_parsing.$constrained_parsing_trace_level$ = null;
        constrained_parsing.$constrained_parsing_action_log$ = null;
        constrained_parsing.$constrained_parsing_case_sensitiveP$ = null;
        constrained_parsing.$constrained_parsing_assert_into_mt$ = null;
        constrained_parsing.$constrained_parsing_consider_adjectivesP$ = null;
        constrained_parsing.$constrained_parsing_cardinality_known$ = null;
        constrained_parsing.$constrained_parsing_allow_group_coercionP$ = null;
        constrained_parsing.$new_isa_permissiveness_principles$ = null;
        constrained_parsing.$parsing_flow_control_principles$ = null;
        constrained_parsing.$dtp_parsing_faithfulness_filter$ = null;
        constrained_parsing.$parsing_faithfulness_filter_types$ = null;
        constrained_parsing.$default_faithfulness_filter$ = null;
        constrained_parsing.$default_definitional_faithfulness_filter$ = null;
        constrained_parsing.$dtp_parsing_arbitrary_filter$ = null;
        constrained_parsing.$parsing_arbitrary_filter_types$ = null;
        constrained_parsing.$default_assertion_filter$ = null;
        constrained_parsing.$default_definitional_assertion_filter$ = null;
        constrained_parsing.$bug_avoidance_principles$ = null;
        constrained_parsing.$constrained_parsing_query_max_transformation_depth$ = null;
        constrained_parsing.$constrained_parsing_query_max_time$ = null;
        constrained_parsing.$constrained_parsing_query_productivity_limit$ = null;
        constrained_parsing.$trace_new_cyc_queryP$ = null;
        constrained_parsing.$debug_new_cyc_queryP$ = null;
        constrained_parsing.$constrained_parsing_rewrite_backtrackingP$ = null;
        constrained_parsing.$with_faithfulness_cutoffP$ = null;
        constrained_parsing.$skip_definitional_faithfulnessP$ = null;
        constrained_parsing.$with_arbitrary_filter_cutoffP$ = null;
        constrained_parsing.$with_bug_avoidance_cutoffP$ = null;
        constrained_parsing.$constrained_parsing_show_inference_metricsP$ = null;
        constrained_parsing.$acquaint_highly_relevant_cutoff$ = null;
        constrained_parsing.$acquaint_demo_assertion_filter$ = null;
        constrained_parsing.$acquaint_demo_lexical_assertion_filter$ = null;
        $const0$SubcollectionDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionDenotingFunction"));
        $sym1$_CONSTRAINED_PARSING_RANKINGS_ = SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-RANKINGS*");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*"), (SubLObject)constrained_parsing.T));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-TRACKING-STRINGS?*"), (SubLObject)constrained_parsing.T));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*"), (SubLObject)constrained_parsing.T));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym7$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym8$__ = SubLObjectFactory.makeSymbol(">=");
        $sym9$_CONSTRAINED_PARSING_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-TRACE-LEVEL*");
        $sym10$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym11$_CONSTRAINED_PARSING_ACTION_LOG_ = SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-ACTION-LOG*");
        $kw12$AVOIDREDUNDANTFACETS = SubLObjectFactory.makeKeyword("AVOIDREDUNDANTFACETS");
        $kw13$PROHIBITSUBCOLLECTIONFNS = SubLObjectFactory.makeKeyword("PROHIBITSUBCOLLECTIONFNS");
        $kw14$PROHIBITAMBIGUOUSGAFS = SubLObjectFactory.makeKeyword("PROHIBITAMBIGUOUSGAFS");
        $kw15$PERMISSIVENESSCUTOFF = SubLObjectFactory.makeKeyword("PERMISSIVENESSCUTOFF");
        $kw16$PERMITALLNONDISJOINTISAS = SubLObjectFactory.makeKeyword("PERMITALLNONDISJOINTISAS");
        $kw17$PROHIBITGROUPCOERCION = SubLObjectFactory.makeKeyword("PROHIBITGROUPCOERCION");
        $kw18$STRIPCARDINALITY = SubLObjectFactory.makeKeyword("STRIPCARDINALITY");
        $kw19$CASESENSITIVELEXICON = SubLObjectFactory.makeKeyword("CASESENSITIVELEXICON");
        $kw20$WIDESCOPEPRECISION = SubLObjectFactory.makeKeyword("WIDESCOPEPRECISION");
        $kw21$PERMITADJECTIVEPARSES = SubLObjectFactory.makeKeyword("PERMITADJECTIVEPARSES");
        $kw22$PERMITNARTISAS = SubLObjectFactory.makeKeyword("PERMITNARTISAS");
        $kw23$RELATIONALLINSTANCEPARSE = SubLObjectFactory.makeKeyword("RELATIONALLINSTANCEPARSE");
        $kw24$NARROWSCOPEPRECISION = SubLObjectFactory.makeKeyword("NARROWSCOPEPRECISION");
        $kw25$CASEINSENSITIVELEXICON = SubLObjectFactory.makeKeyword("CASEINSENSITIVELEXICON");
        $kw26$MINIMALTIMEPARSE = SubLObjectFactory.makeKeyword("MINIMALTIMEPARSE");
        $kw27$PERMITRELATIVECLAUSEPARSES = SubLObjectFactory.makeKeyword("PERMITRELATIVECLAUSEPARSES");
        $kw28$PERMITPPCOMPPARSES = SubLObjectFactory.makeKeyword("PERMITPPCOMPPARSES");
        $sym29$PARSING_FAITHFULNESS_FILTER = SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER");
        $sym30$PARSING_FAITHFULNESS_FILTER_P = SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-P");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-MT"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-MT"));
        $sym35$PPRINT_FAITHFULNESS_FILTER = SubLObjectFactory.makeSymbol("PPRINT-FAITHFULNESS-FILTER");
        $sym36$PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-PRINT-FUNCTION-TRAMPOLINE");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-P"));
        $sym38$PARSING_FAITHFULNESS_FILTER_TYPE = SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-TYPE");
        $sym39$_CSETF_PARSING_FAITHFULNESS_FILTER_TYPE = SubLObjectFactory.makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE");
        $sym40$PARSING_FAITHFULNESS_FILTER_MT = SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-MT");
        $sym41$_CSETF_PARSING_FAITHFULNESS_FILTER_MT = SubLObjectFactory.makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-MT");
        $kw42$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw43$MT = SubLObjectFactory.makeKeyword("MT");
        $str44$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw45$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym46$MAKE_PARSING_FAITHFULNESS_FILTER = SubLObjectFactory.makeSymbol("MAKE-PARSING-FAITHFULNESS-FILTER");
        $kw47$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw48$END = SubLObjectFactory.makeKeyword("END");
        $sym49$VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSING-FAITHFULNESS-FILTER-METHOD");
        $str50$__PARSING_FAITHFULNESS_FILTER__A_ = SubLObjectFactory.makeString("#<PARSING-FAITHFULNESS-FILTER ~A ~A>");
        $kw51$OBEYISASINMT = SubLObjectFactory.makeKeyword("OBEYISASINMT");
        $kw52$OBEYGAFSINMT = SubLObjectFactory.makeKeyword("OBEYGAFSINMT");
        $kw53$FAITHFULNESSFILTERCUTOFF = SubLObjectFactory.makeKeyword("FAITHFULNESSFILTERCUTOFF");
        $sym54$PARSING_FAITHFULNESS_FILTER_TYPE_P = SubLObjectFactory.makeSymbol("PARSING-FAITHFULNESS-FILTER-TYPE-P");
        $sym55$MT_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("MT-IN-ANY-MT?");
        $sym56$PARSING_ARBITRARY_FILTER = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER");
        $sym57$PARSING_ARBITRARY_FILTER_P = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-P");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DETAILS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DETAILS"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-DETAILS"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-MT"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-DETAILS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-MT"));
        $sym62$PPRINT_ARBITRARY_FILTER = SubLObjectFactory.makeSymbol("PPRINT-ARBITRARY-FILTER");
        $sym63$PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-PRINT-FUNCTION-TRAMPOLINE");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-P"));
        $sym65$PARSING_ARBITRARY_FILTER_TYPE = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-TYPE");
        $sym66$_CSETF_PARSING_ARBITRARY_FILTER_TYPE = SubLObjectFactory.makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-TYPE");
        $sym67$PARSING_ARBITRARY_FILTER_DETAILS = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-DETAILS");
        $sym68$_CSETF_PARSING_ARBITRARY_FILTER_DETAILS = SubLObjectFactory.makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-DETAILS");
        $sym69$PARSING_ARBITRARY_FILTER_MT = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-MT");
        $sym70$_CSETF_PARSING_ARBITRARY_FILTER_MT = SubLObjectFactory.makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-MT");
        $kw71$DETAILS = SubLObjectFactory.makeKeyword("DETAILS");
        $sym72$MAKE_PARSING_ARBITRARY_FILTER = SubLObjectFactory.makeSymbol("MAKE-PARSING-ARBITRARY-FILTER");
        $sym73$VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSING-ARBITRARY-FILTER-METHOD");
        $str74$__PARSING_ARBITRARY_FILTER__A__A_ = SubLObjectFactory.makeString("#<PARSING-ARBITRARY-FILTER ~A ~A ~A>");
        $kw75$NOISASARESPECS = SubLObjectFactory.makeKeyword("NOISASARESPECS");
        $kw76$ASSERTINTOMT = SubLObjectFactory.makeKeyword("ASSERTINTOMT");
        $kw77$ARBITRARYFILTERCUTOFF = SubLObjectFactory.makeKeyword("ARBITRARYFILTERCUTOFF");
        $sym78$PARSING_ARBITRARY_FILTER_TYPE_P = SubLObjectFactory.makeSymbol("PARSING-ARBITRARY-FILTER-TYPE-P");
        $kw79$COMPENSATEFORISAPROBLEMS = SubLObjectFactory.makeKeyword("COMPENSATEFORISAPROBLEMS");
        $kw80$BUGAVOIDANCECUTOFF = SubLObjectFactory.makeKeyword("BUGAVOIDANCECUTOFF");
        $kw81$AVOIDREWRITEPARSES = SubLObjectFactory.makeKeyword("AVOIDREWRITEPARSES");
        $kw82$AVOIDNAMESTRINGPARSES = SubLObjectFactory.makeKeyword("AVOIDNAMESTRINGPARSES");
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym84$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PARSING-CONSTRAINT-RANKINGS")));
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINCIPLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym87$CONSTRAINED_PARSING_PRINCIPLE_P = SubLObjectFactory.makeSymbol("CONSTRAINED-PARSING-PRINCIPLE-P");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym89$PARSING_FILTER_P = SubLObjectFactory.makeSymbol("PARSING-FILTER-P");
        $const90$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const91$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const92$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $const93$GrandLiftPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GrandLiftPredicate"));
        $sym94$PARSING_CONSTRAINT_P = SubLObjectFactory.makeSymbol("PARSING-CONSTRAINT-P");
        $str95$A_constraint_can_t_outrank_itself = SubLObjectFactory.makeString("A constraint can't outrank itself!");
        $kw96$PROMOTE = SubLObjectFactory.makeKeyword("PROMOTE");
        $kw97$DEMOTE = SubLObjectFactory.makeKeyword("DEMOTE");
        $str98$_A_and_or__A_missing_from_ranking = SubLObjectFactory.makeString("~A and/or ~A missing from rankings:~%~A~%");
        $int99$30 = SubLObjectFactory.makeInteger(30);
        $int100$2000000 = SubLObjectFactory.makeInteger(2000000);
        $kw101$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw102$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw103$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*"), (SubLObject)constrained_parsing.NIL));
        $sym105$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const106$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const107$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $const108$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw109$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw110$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw111$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw112$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw113$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw114$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $kw115$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $str116$_S_in__A_may_have_had_more_answer = SubLObjectFactory.makeString("~S in ~A may have had more answers available");
        $str117$_S_in__A_exited_abnormally___A = SubLObjectFactory.makeString("~S in ~A exited abnormally: ~A");
        $const118$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $kw119$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $const120$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym121$_RELN = SubLObjectFactory.makeSymbol("?RELN");
        $const122$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const123$argN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN"));
        $list124 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?RELN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")));
        $const125$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list126 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Group")));
        $const127$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const128$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list129 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")));
        $sym130$_KNOWN_TO_BE = SubLObjectFactory.makeSymbol("?KNOWN-TO-BE");
        $const131$operatorFormulas = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operatorFormulas"));
        $const132$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupOfCardinalityFn"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?KNOWN-TO-BE"));
        $list134 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operatorFormulas")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupOfCardinalityFn")), (SubLObject)SubLObjectFactory.makeSymbol("?KNOWN-TO-BE"));
        $list135 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?COL1"), (SubLObject)constrained_parsing.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?KNOWN-TO-BE"));
        $sym136$_COL2 = SubLObjectFactory.makeSymbol("?COL2");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?COL1"), (SubLObject)SubLObjectFactory.makeSymbol("?COL2")));
        $sym138$_Y = SubLObjectFactory.makeSymbol("?Y");
        $sym139$_X = SubLObjectFactory.makeSymbol("?X");
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))));
        $kw141$NEEDED = SubLObjectFactory.makeKeyword("NEEDED");
        $str142$____investigating__A_faithfulness = SubLObjectFactory.makeString("*** investigating ~A faithfulness cutoff? ~A arbitrary filter cutoff? ~A~%");
        $kw143$ARBITRARYFILTERCUTFF = SubLObjectFactory.makeKeyword("ARBITRARYFILTERCUTFF");
        $str144$_____S_will_be_asserted_into__A__ = SubLObjectFactory.makeString("*** ~S will be asserted into ~A, if at all~%");
        $sym145$_COL = SubLObjectFactory.makeSymbol("?COL");
        $sym146$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym147$UNASSERT = SubLObjectFactory.makeSymbol("UNASSERT");
        $sym148$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("THE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const150$Group = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Group"));
        $const151$GroupFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupFn"));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MT"));
        $const153$hypothesizedIsaCoercedInto = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypothesizedIsaCoercedInto"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"), (SubLObject)SubLObjectFactory.makeSymbol("?ANYWHERE"));
        $const155$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $sym156$_ANYWHERE = SubLObjectFactory.makeSymbol("?ANYWHERE");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $const158$sourceOfTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceOfTerm"));
        $kw159$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $sym160$FI_ASSERT_INT = SubLObjectFactory.makeSymbol("FI-ASSERT-INT");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)constrained_parsing.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD-FILTER"), (SubLObject)constrained_parsing.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD-NULL"), (SubLObject)constrained_parsing.NIL));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("RECORD-FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("RECORD-NULL"));
        $kw163$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw164$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
        $kw165$RECORD_FILTER = SubLObjectFactory.makeKeyword("RECORD-FILTER");
        $kw166$RECORD_NULL = SubLObjectFactory.makeKeyword("RECORD-NULL");
        $sym167$CHANNEL_SAYS = SubLObjectFactory.makeUninternedSymbol("CHANNEL-SAYS");
        $sym168$CONSTRAINED_PARSING_POSSIBLY_ASSERT = SubLObjectFactory.makeSymbol("CONSTRAINED-PARSING-POSSIBLY-ASSERT");
        $sym169$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym170$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym171$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORK-DONE"));
        $sym173$COR = SubLObjectFactory.makeSymbol("COR");
        $const174$PositiveIntegerExtent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveIntegerExtent"));
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOURCE"));
        $sym177$GROUP_COL = SubLObjectFactory.makeUninternedSymbol("GROUP-COL");
        $sym178$CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS = SubLObjectFactory.makeSymbol("CONSTRAINED-PARSING-ASSERT-THROUGH-CHANNELS");
        $sym179$LIST = SubLObjectFactory.makeSymbol("LIST");
        $str180$of = SubLObjectFactory.makeString("of");
        $sym181$_WU = SubLObjectFactory.makeSymbol("?WU");
        $const182$prepositionStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"));
        $const183$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $sym184$_POS = SubLObjectFactory.makeSymbol("?POS");
        $list185 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Complementizer"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHPronoun")))));
        $sym186$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym187$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym188$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym189$SUBCOLLECTION_NAUT_P = SubLObjectFactory.makeSymbol("SUBCOLLECTION-NAUT-P");
        $str190$____rejected_potential_parse_of__ = SubLObjectFactory.makeString("*** rejected potential parse of ~A for ~A");
        $const191$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $kw192$NADA = SubLObjectFactory.makeKeyword("NADA");
        $const193$termPhrases = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $list194 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))));
        $str195$____remaining_parses_are__A_w_car = SubLObjectFactory.makeString("*** remaining parses are ~A w/cardinality ~A~%");
        $kw196$WORK_DONE = SubLObjectFactory.makeKeyword("WORK-DONE");
        $sym197$_COL_TYPE = SubLObjectFactory.makeSymbol("?COL-TYPE");
        $sym198$_FACETING_COL = SubLObjectFactory.makeSymbol("?FACETING-COL");
        $sym199$_SOMEWHERE = SubLObjectFactory.makeSymbol("?SOMEWHERE");
        $sym200$_TERM_COL = SubLObjectFactory.makeSymbol("?TERM-COL");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL-TYPE"));
        $list202 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?COL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?FACETING-COL"));
        $list203 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FACETING-COL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FacetingCollectionType")));
        $list204 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?FACETING-COL")));
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CARDINALITY"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"));
        $kw206$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $const207$adjStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adjStrings"));
        $kw208$ON = SubLObjectFactory.makeKeyword("ON");
        $kw209$OFF = SubLObjectFactory.makeKeyword("OFF");
        $str210$_ = SubLObjectFactory.makeString(",");
        $sym211$_DENOT = SubLObjectFactory.makeSymbol("?DENOT");
        $const212$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $const213$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $list214 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))));
        $list215 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveIntegerExtent"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger")))));
        $list216 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveIntegerExtent")));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $list218 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("?STRING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))));
        $const219$preferredNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $str220$____found__at_least___A_and__A_as = SubLObjectFactory.makeString("*** found (at least) ~A and ~A as rewrite possibilities for ~A");
        $str221$____setting_rewrite_option_to__S = SubLObjectFactory.makeString("*** setting rewrite option to ~S");
        $sym222$_WHO = SubLObjectFactory.makeSymbol("?WHO");
        $const223$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $list224 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?CORE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf")), (SubLObject)SubLObjectFactory.makeSymbol("?CORE"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"))));
        $const225$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $list226 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"), (SubLObject)SubLObjectFactory.makeSymbol("?COL"))));
        $sym227$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw228$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const229$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const230$subFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subFields"));
        $const231$admittedArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $const232$wordStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordStrings"));
        $list233 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), (SubLObject)SubLObjectFactory.makeSymbol("?WU"), (SubLObject)SubLObjectFactory.makeSymbol("??POS"), (SubLObject)SubLObjectFactory.makeSymbol("??WS"), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"));
        $sym234$_FUNC = SubLObjectFactory.makeSymbol("?FUNC");
        $list235 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiableFunction"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryFunction"))));
        $const236$RelationParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt"));
        $list237 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction")));
        $list238 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $const239$relationExistsInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance"));
        $const240$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $list241 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), (SubLObject)SubLObjectFactory.makeSymbol("?WU"), (SubLObject)SubLObjectFactory.makeSymbol("?POS"), (SubLObject)SubLObjectFactory.makeSymbol("?WS"), (SubLObject)SubLObjectFactory.makeSymbol("?DENOT"));
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?COL1"), (SubLObject)SubLObjectFactory.makeSymbol("?COL2"));
        $sym243$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $list244 = ConsesLow.list((SubLObject)constrained_parsing.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?PRED"));
        $list245 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?SOMEWHERE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?COL1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?ANYWHERE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?COL2"))));
        $const246$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $const247$Organization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"));
        $const248$GeopoliticalEntity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeopoliticalEntity"));
        $list249 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Business")));
        $list250 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")));
        $const251$substring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("substring"));
        $str252$___Co = SubLObjectFactory.makeString(" & Co");
        $str253$_Company = SubLObjectFactory.makeString(" Company");
        $str254$_Plc = SubLObjectFactory.makeString(" Plc");
        $str255$_Ltd = SubLObjectFactory.makeString(" Ltd");
        $const256$Business = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Business"));
        $str257$_ = SubLObjectFactory.makeString(" ");
        $list258 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens")));
        $sym259$_CONSTANT = SubLObjectFactory.makeSymbol("?CONSTANT");
        $list260 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?CONSTANT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanGivenName")));
        $const261$nameSpelling = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $const262$givenNames = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("givenNames"));
        $list263 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?CONSTANT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanSurname")));
        $const264$familyName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName"));
        $sym265$_SALUT = SubLObjectFactory.makeSymbol("?SALUT");
        $const266$codeMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("codeMapping"));
        $const267$SalutationMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SalutationMapping"));
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SALUT"));
        $const269$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $const270$salutation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salutation"));
        $const271$BBN_CDE_StrengthenedMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BBN-CDE-StrengthenedMt"));
        $const272$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $str273$____DEMO__initializing_rankings_w = SubLObjectFactory.makeString("*** DEMO: initializing rankings with :AvoidRedundantFacets suppressed");
        $str274$____DEMO__reverting_to_standard_c = SubLObjectFactory.makeString("*** DEMO: reverting to standard constraint rankings (and our mt preferences)");
        $sym275$GET_RELEVANCE = SubLObjectFactory.makeSymbol("GET-RELEVANCE");
        $sym276$CAPITALIZED_STRING_P = SubLObjectFactory.makeSymbol("CAPITALIZED-STRING-P");
        $str277$Who_is__A_ = SubLObjectFactory.makeString("Who is ~A?");
        $sym278$DEFINITIONAL_QUESTION_P = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-P");
        $str279$____processing__A = SubLObjectFactory.makeString("*** processing ~A");
        $sym280$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym281$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $str282$_S__ = SubLObjectFactory.makeString("~S~%");
        $str283$____DEMO_____isa__A__A__wasn_t_fo = SubLObjectFactory.makeString("*** DEMO: (#$isa ~A ~A) wasn't found");
        $str284$Tony_Blair = SubLObjectFactory.makeString("Tony Blair");
        $const285$TonyBlair = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TonyBlair"));
        $sym286$_WHERE = SubLObjectFactory.makeSymbol("?WHERE");
        $list287 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("primeMinister")), (SubLObject)SubLObjectFactory.makeSymbol("?WHERE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TonyBlair")));
        $str288$____DEMO_____primeMinister_WHATEV = SubLObjectFactory.makeString("*** DEMO: (#$primeMinister WHATEVER #$TonyBlair) apparently wasn't added");
        $const289$Warrior = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Warrior"));
        $str290$____DEMO____TonyBlair_was_mistake = SubLObjectFactory.makeString("*** DEMO: #$TonyBlair was mistakenly asserted to be a #$Warrior");
        $str291$Saddam_Hussein = SubLObjectFactory.makeString("Saddam Hussein");
        $const292$SaddamHusseinAl_Takriti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaddamHusseinAl-Takriti"));
        $const293$Vicious = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Vicious"));
        $const294$PresidentFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PresidentFn"));
        $const295$Iraq = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Iraq"));
        $str296$Bill_Clinton = SubLObjectFactory.makeString("Bill Clinton");
        $const297$BillClinton = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillClinton"));
        $const298$UnitedStatesOfAmerica = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedStatesOfAmerica"));
        $str299$Osama = SubLObjectFactory.makeString("Osama");
        $const300$OsamaBinLaden = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"));
        $str301$____DEMO_____isa___SaddamHusseinA = SubLObjectFactory.makeString("*** DEMO: (#$isa #$SaddamHusseinAl-Takriti ~A) is missing!");
    }
    
    public static final class $parsing_faithfulness_filter_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $mt;
        private static final SubLStructDeclNative structDecl;
        
        public $parsing_faithfulness_filter_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$parsing_faithfulness_filter_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$mt;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$parsing_faithfulness_filter_native.class, constrained_parsing.$sym29$PARSING_FAITHFULNESS_FILTER, constrained_parsing.$sym30$PARSING_FAITHFULNESS_FILTER_P, constrained_parsing.$list31, constrained_parsing.$list32, new String[] { "$type", "$mt" }, constrained_parsing.$list33, constrained_parsing.$list34, constrained_parsing.$sym35$PPRINT_FAITHFULNESS_FILTER);
        }
    }
    
    public static final class $parsing_faithfulness_filter_p$UnaryFunction extends UnaryFunction
    {
        public $parsing_faithfulness_filter_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARSING-FAITHFULNESS-FILTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return constrained_parsing.parsing_faithfulness_filter_p(arg1);
        }
    }
    
    public static final class $parsing_arbitrary_filter_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $details;
        public SubLObject $mt;
        private static final SubLStructDeclNative structDecl;
        
        public $parsing_arbitrary_filter_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$details = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$parsing_arbitrary_filter_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$details;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$mt;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$details = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$parsing_arbitrary_filter_native.class, constrained_parsing.$sym56$PARSING_ARBITRARY_FILTER, constrained_parsing.$sym57$PARSING_ARBITRARY_FILTER_P, constrained_parsing.$list58, constrained_parsing.$list59, new String[] { "$type", "$details", "$mt" }, constrained_parsing.$list60, constrained_parsing.$list61, constrained_parsing.$sym62$PPRINT_ARBITRARY_FILTER);
        }
    }
    
    public static final class $parsing_arbitrary_filter_p$UnaryFunction extends UnaryFunction
    {
        public $parsing_arbitrary_filter_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARSING-ARBITRARY-FILTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return constrained_parsing.parsing_arbitrary_filter_p(arg1);
        }
    }
}

/*

	Total time: 1001 ms
	 synthetic 
*/