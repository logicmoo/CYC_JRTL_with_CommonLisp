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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constrained_parsing
    extends
      SubLTranslatedFile
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
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 3906L)
  public static SubLObject list_of_not_disjoint_collections_p(final SubLObject the_list)
  {
    SubLObject cdolist_list_var = the_list;
    SubLObject this_item = NIL;
    this_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == fort_types_interface.collection_in_any_mtP( this_item ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_item = cdolist_list_var.first();
    }
    return makeBoolean( NIL == disjoint_with.any_disjoint_collection_pairP( the_list, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 4251L)
  public static SubLObject subcollection_naut_p(final SubLObject candidate)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( candidate ) && NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg0( candidate ), $const0$SubcollectionDenotingFunction ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 4566L)
  public static SubLObject list_elements_preceding(final SubLObject v_object, final SubLObject list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    SubLObject appearing_before = NIL;
    SubLObject found_itP = NIL;
    if( NIL == found_itP )
    {
      SubLObject csome_list_var = list;
      SubLObject this_one = NIL;
      this_one = csome_list_var.first();
      while ( NIL == found_itP && NIL != csome_list_var)
      {
        if( NIL != Functions.funcall( test, this_one, v_object ) )
        {
          found_itP = T;
        }
        else
        {
          appearing_before = ConsesLow.cons( this_one, appearing_before );
        }
        csome_list_var = csome_list_var.rest();
        this_one = csome_list_var.first();
      }
    }
    if( NIL != found_itP )
    {
      return Sequences.reverse( appearing_before );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 5170L)
  public static SubLObject rotate_list_around_pivot(final SubLObject list, final SubLObject the_pivot, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    SubLObject new_list = NIL;
    SubLObject the_copy;
    SubLObject found_pivotP;
    for( the_copy = conses_high.copy_list( list ), found_pivotP = NIL; NIL != the_copy && NIL == found_pivotP; the_copy = the_copy.rest() )
    {
      if( NIL != Functions.funcall( test, the_copy.first(), the_pivot ) )
      {
        found_pivotP = T;
      }
      else
      {
        new_list = ConsesLow.cons( the_copy.first(), new_list );
      }
    }
    if( NIL == found_pivotP )
    {
      return list;
    }
    new_list = Sequences.reverse( new_list );
    SubLObject cdolist_list_var = Sequences.reverse( the_copy );
    SubLObject this_item = NIL;
    this_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_list = ConsesLow.cons( this_item, new_list );
      cdolist_list_var = cdolist_list_var.rest();
      this_item = cdolist_list_var.first();
    }
    return new_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6493L)
  public static SubLObject current_parsing_constraint_rankings()
  {
    return conses_high.copy_list( $constrained_parsing_rankings$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6671L)
  public static SubLObject without_asserting_gafs(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list3, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6801L)
  public static SubLObject constrained_parsing_assert_gafsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $constrained_parsing_without_assertingP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 6982L)
  public static SubLObject while_tracking_strings(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7111L)
  public static SubLObject constrained_parsing_tracking_stringsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $constrained_parsing_tracking_stringsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7292L)
  public static SubLObject while_tracking_substrings(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list5, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7427L)
  public static SubLObject constrained_parsing_tracking_substringsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $constrained_parsing_tracking_substringsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7541L)
  public static SubLObject constrained_parsing_choose_string_sources(final SubLObject full, final SubLObject partial)
  {
    if( NIL != constrained_parsing_tracking_stringsP() )
    {
      return full;
    }
    if( NIL != constrained_parsing_tracking_substringsP() )
    {
      return partial;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 7986L)
  public static SubLObject constrained_parsing_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym7$PWHEN, ConsesLow.list( $sym8$__, $sym9$_CONSTRAINED_PARSING_TRACE_LEVEL_, level ), ConsesLow.listS( $sym10$WARN, format_str, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8322L)
  public static SubLObject constrained_parsing_get_actions()
  {
    return Sequences.reverse( $constrained_parsing_action_log$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8427L)
  public static SubLObject constrained_parsing_clear_actions()
  {
    $constrained_parsing_action_log$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 8542L)
  public static SubLObject constrained_parsing_record_action(final SubLObject function, final SubLObject args)
  {
    final SubLObject push_me = ConsesLow.cons( function, args );
    $constrained_parsing_action_log$.setGlobalValue( ConsesLow.cons( push_me, $constrained_parsing_action_log$.getGlobalValue() ) );
    return $constrained_parsing_action_log$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9760L)
  public static SubLObject get_new_isa_permissiveness_principles()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $new_isa_permissiveness_principles$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 9876L)
  public static SubLObject new_isa_permissiveness_principle_p(final SubLObject candidate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( candidate.isKeyword() && NIL != subl_promotions.memberP( candidate, $new_isa_permissiveness_principles$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10497L)
  public static SubLObject get_parsing_flow_control_principles()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $parsing_flow_control_principles$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10609L)
  public static SubLObject parsing_flow_control_principle_p(final SubLObject candidate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( candidate.isKeyword() && NIL != subl_promotions.memberP( candidate, $parsing_flow_control_principles$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject parsing_faithfulness_filter_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_faithfulness_filter( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject parsing_faithfulness_filter_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $parsing_faithfulness_filter_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject parsing_faithfulness_filter_type(final SubLObject v_object)
  {
    assert NIL != parsing_faithfulness_filter_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject parsing_faithfulness_filter_mt(final SubLObject v_object)
  {
    assert NIL != parsing_faithfulness_filter_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject _csetf_parsing_faithfulness_filter_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parsing_faithfulness_filter_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject _csetf_parsing_faithfulness_filter_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parsing_faithfulness_filter_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject make_parsing_faithfulness_filter(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $parsing_faithfulness_filter_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw42$TYPE ) )
      {
        _csetf_parsing_faithfulness_filter_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$MT ) )
      {
        _csetf_parsing_faithfulness_filter_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject visit_defstruct_parsing_faithfulness_filter(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym46$MAKE_PARSING_FAITHFULNESS_FILTER, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw42$TYPE, parsing_faithfulness_filter_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$MT, parsing_faithfulness_filter_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym46$MAKE_PARSING_FAITHFULNESS_FILTER, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10769L)
  public static SubLObject visit_defstruct_object_parsing_faithfulness_filter_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_parsing_faithfulness_filter( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 10902L)
  public static SubLObject pprint_faithfulness_filter(final SubLObject filter, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str50$__PARSING_FAITHFULNESS_FILTER__A_, parsing_faithfulness_filter_type( filter ), parsing_faithfulness_filter_mt( filter ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11533L)
  public static SubLObject get_parsing_faithfulness_filter_types()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $parsing_faithfulness_filter_types$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11649L)
  public static SubLObject parsing_faithfulness_filter_type_p(final SubLObject candidate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( candidate, $parsing_faithfulness_filter_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11779L)
  public static SubLObject get_parsing_faithfulness_filters()
  {
    return list_utilities.find_all_if( $sym30$PARSING_FAITHFULNESS_FILTER_P, current_parsing_constraint_rankings(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 11925L)
  public static SubLObject new_parsing_faithfulness_filter(final SubLObject filter, final SubLObject mt)
  {
    assert NIL != parsing_faithfulness_filter_type_p( filter ) : filter;
    assert NIL != fort_types_interface.mt_in_any_mtP( mt ) : mt;
    return make_parsing_faithfulness_filter( ConsesLow.list( $kw42$TYPE, filter, $kw43$MT, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject parsing_arbitrary_filter_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_arbitrary_filter( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject parsing_arbitrary_filter_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $parsing_arbitrary_filter_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject parsing_arbitrary_filter_type(final SubLObject v_object)
  {
    assert NIL != parsing_arbitrary_filter_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject parsing_arbitrary_filter_details(final SubLObject v_object)
  {
    assert NIL != parsing_arbitrary_filter_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject parsing_arbitrary_filter_mt(final SubLObject v_object)
  {
    assert NIL != parsing_arbitrary_filter_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject _csetf_parsing_arbitrary_filter_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parsing_arbitrary_filter_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject _csetf_parsing_arbitrary_filter_details(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parsing_arbitrary_filter_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject _csetf_parsing_arbitrary_filter_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != parsing_arbitrary_filter_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject make_parsing_arbitrary_filter(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $parsing_arbitrary_filter_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw42$TYPE ) )
      {
        _csetf_parsing_arbitrary_filter_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$DETAILS ) )
      {
        _csetf_parsing_arbitrary_filter_details( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$MT ) )
      {
        _csetf_parsing_arbitrary_filter_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject visit_defstruct_parsing_arbitrary_filter(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym72$MAKE_PARSING_ARBITRARY_FILTER, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw42$TYPE, parsing_arbitrary_filter_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw71$DETAILS, parsing_arbitrary_filter_details( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$MT, parsing_arbitrary_filter_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym72$MAKE_PARSING_ARBITRARY_FILTER, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12277L)
  public static SubLObject visit_defstruct_object_parsing_arbitrary_filter_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_parsing_arbitrary_filter( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 12409L)
  public static SubLObject pprint_arbitrary_filter(final SubLObject filter, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str74$__PARSING_ARBITRARY_FILTER__A__A_, new SubLObject[] { parsing_arbitrary_filter_type( filter ), parsing_arbitrary_filter_details( filter ), parsing_arbitrary_filter_mt( filter )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13005L)
  public static SubLObject get_parsing_arbitrary_filter_types()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $parsing_arbitrary_filter_types$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13169L)
  public static SubLObject parsing_arbitrary_filter_type_p(final SubLObject candidate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( candidate, $parsing_arbitrary_filter_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13293L)
  public static SubLObject get_parsing_arbitrary_filters()
  {
    return list_utilities.find_all_if( $sym57$PARSING_ARBITRARY_FILTER_P, current_parsing_constraint_rankings(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 13433L)
  public static SubLObject new_parsing_arbitrary_filter(final SubLObject filter, final SubLObject details, final SubLObject mt)
  {
    assert NIL != parsing_arbitrary_filter_type_p( filter ) : filter;
    assert NIL != fort_types_interface.mt_in_any_mtP( mt ) : mt;
    return make_parsing_arbitrary_filter( ConsesLow.list( $kw42$TYPE, filter, $kw71$DETAILS, details, $kw43$MT, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14123L)
  public static SubLObject get_bug_avoidance_principles()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $bug_avoidance_principles$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14221L)
  public static SubLObject bug_avoidance_principle_p(final SubLObject candidate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( candidate.isKeyword() && NIL != subl_promotions.memberP( candidate, $bug_avoidance_principles$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14367L)
  public static SubLObject parsing_principle_p(final SubLObject candidate)
  {
    return makeBoolean( NIL != new_isa_permissiveness_principle_p( candidate ) || NIL != parsing_flow_control_principle_p( candidate ) || NIL != bug_avoidance_principle_p( candidate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14632L)
  public static SubLObject parsing_filter_p(final SubLObject candidate)
  {
    return makeBoolean( NIL != parsing_faithfulness_filter_p( candidate ) || NIL != parsing_arbitrary_filter_p( candidate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14780L)
  public static SubLObject parsing_filter_type_p(final SubLObject candidate)
  {
    return makeBoolean( NIL != parsing_faithfulness_filter_type_p( candidate ) || NIL != parsing_arbitrary_filter_type_p( candidate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 14943L)
  public static SubLObject get_all_parsing_principles()
  {
    return list_utilities.flatten( ConsesLow.list( get_parsing_flow_control_principles(), get_new_isa_permissiveness_principles(), get_bug_avoidance_principles() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15144L)
  public static SubLObject get_all_parsing_filter_types()
  {
    return list_utilities.flatten( ConsesLow.list( get_parsing_faithfulness_filter_types(), get_parsing_arbitrary_filter_types() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15305L)
  public static SubLObject get_all_parsing_filters()
  {
    return list_utilities.flatten( ConsesLow.list( get_parsing_faithfulness_filters(), get_parsing_arbitrary_filters() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15451L)
  public static SubLObject get_all_parsing_constraints()
  {
    return list_utilities.flatten( ConsesLow.list( get_all_parsing_principles(), get_all_parsing_filter_types(), get_all_parsing_filters() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15612L)
  public static SubLObject parsing_constraint_p(final SubLObject candidate)
  {
    return makeBoolean( NIL != parsing_principle_p( candidate ) || NIL != parsing_filter_type_p( candidate ) || NIL != parsing_filter_p( candidate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15784L)
  public static SubLObject do_constrained_parsing_constraints(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constraint = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    constraint = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym84$CDOLIST, reader.bq_cons( constraint, $list85 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 15946L)
  public static SubLObject do_constrained_parsing_principles(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject principle = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    principle = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym84$CDOLIST, reader.bq_cons( principle, $list85 ), ConsesLow.listS( $sym7$PWHEN, ConsesLow.list( $sym87$CONSTRAINED_PARSING_PRINCIPLE_P, principle ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list86 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 16162L)
  public static SubLObject do_constrained_parsing_filters(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject filter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    filter = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym84$CDOLIST, reader.bq_cons( filter, $list85 ), ConsesLow.listS( $sym7$PWHEN, ConsesLow.list( $sym89$PARSING_FILTER_P, filter ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 16351L)
  public static SubLObject initialize_constrained_parsing(SubLObject skip_gafsP, SubLObject skip_safety_netP)
  {
    if( skip_gafsP == UNPROVIDED )
    {
      skip_gafsP = NIL;
    }
    if( skip_safety_netP == UNPROVIDED )
    {
      skip_safety_netP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $constrained_parsing_rankings$.setGlobalValue( NIL );
    order_parsing_constraints( $kw53$FAITHFULNESSFILTERCUTOFF, $kw26$MINIMALTIMEPARSE, UNPROVIDED );
    order_parsing_constraints( $kw77$ARBITRARYFILTERCUTOFF, $kw53$FAITHFULNESSFILTERCUTOFF, UNPROVIDED );
    order_parsing_constraints( $kw15$PERMISSIVENESSCUTOFF, $kw26$MINIMALTIMEPARSE, UNPROVIDED );
    order_parsing_constraints( $kw26$MINIMALTIMEPARSE, $kw80$BUGAVOIDANCECUTOFF, UNPROVIDED );
    order_parsing_constraints( $kw26$MINIMALTIMEPARSE, $kw16$PERMITALLNONDISJOINTISAS, UNPROVIDED );
    order_parsing_constraints( $kw26$MINIMALTIMEPARSE, $kw28$PERMITPPCOMPPARSES, UNPROVIDED );
    order_parsing_constraints( $kw26$MINIMALTIMEPARSE, $kw27$PERMITRELATIVECLAUSEPARSES, UNPROVIDED );
    order_parsing_constraints( $kw24$NARROWSCOPEPRECISION, $kw26$MINIMALTIMEPARSE, UNPROVIDED );
    frontload_parsing_constraint( $kw20$WIDESCOPEPRECISION );
    order_parsing_constraints( $kw18$STRIPCARDINALITY, $kw20$WIDESCOPEPRECISION, UNPROVIDED );
    order_parsing_constraints( $kw19$CASESENSITIVELEXICON, $kw20$WIDESCOPEPRECISION, UNPROVIDED );
    order_parsing_constraints( $kw24$NARROWSCOPEPRECISION, $kw25$CASEINSENSITIVELEXICON, UNPROVIDED );
    order_parsing_constraints( $kw23$RELATIONALLINSTANCEPARSE, $kw15$PERMISSIVENESSCUTOFF, UNPROVIDED );
    order_parsing_constraints( $kw22$PERMITNARTISAS, $kw23$RELATIONALLINSTANCEPARSE, UNPROVIDED );
    order_parsing_constraints( $kw20$WIDESCOPEPRECISION, $kw21$PERMITADJECTIVEPARSES, UNPROVIDED );
    order_parsing_constraints( $kw12$AVOIDREDUNDANTFACETS, $kw21$PERMITADJECTIVEPARSES, UNPROVIDED );
    order_parsing_constraints( $kw13$PROHIBITSUBCOLLECTIONFNS, $kw23$RELATIONALLINSTANCEPARSE, UNPROVIDED );
    order_parsing_constraints( $kw14$PROHIBITAMBIGUOUSGAFS, $kw23$RELATIONALLINSTANCEPARSE, UNPROVIDED );
    order_parsing_constraints( $kw80$BUGAVOIDANCECUTOFF, $kw81$AVOIDREWRITEPARSES, UNPROVIDED );
    order_parsing_constraints( $kw80$BUGAVOIDANCECUTOFF, $kw82$AVOIDNAMESTRINGPARSES, UNPROVIDED );
    if( NIL == $default_definitional_faithfulness_filter$.getDynamicValue( thread ) )
    {
      $default_definitional_faithfulness_filter$.setDynamicValue( new_parsing_faithfulness_filter( $kw51$OBEYISASINMT, $const90$UniversalVocabularyMt ), thread );
    }
    if( NIL == $default_faithfulness_filter$.getDynamicValue( thread ) )
    {
      $default_faithfulness_filter$.setDynamicValue( new_parsing_faithfulness_filter( $kw52$OBEYGAFSINMT, $const91$BaseKB ), thread );
    }
    if( NIL == skip_safety_netP )
    {
      frontload_parsing_constraint( $default_faithfulness_filter$.getDynamicValue( thread ) );
      frontload_parsing_constraint( $default_definitional_faithfulness_filter$.getDynamicValue( thread ) );
    }
    frontload_parsing_constraint( $kw79$COMPENSATEFORISAPROBLEMS );
    if( NIL == $default_assertion_filter$.getDynamicValue( thread ) )
    {
      $default_assertion_filter$.setDynamicValue( new_parsing_arbitrary_filter( $kw76$ASSERTINTOMT, $const92$Relation, $const91$BaseKB ), thread );
    }
    if( NIL == $default_definitional_assertion_filter$.getDynamicValue( thread ) )
    {
      $default_definitional_assertion_filter$.setDynamicValue( new_parsing_arbitrary_filter( $kw76$ASSERTINTOMT, $const93$GrandLiftPredicate, $const90$UniversalVocabularyMt ), thread );
    }
    if( NIL == skip_gafsP )
    {
      frontload_parsing_constraint( $default_assertion_filter$.getDynamicValue( thread ) );
      order_parsing_constraints( $default_definitional_assertion_filter$.getDynamicValue( thread ), $default_assertion_filter$.getDynamicValue( thread ), UNPROVIDED );
    }
    return current_parsing_constraint_rankings();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 19561L)
  public static SubLObject parsing_constraint_outranksP(final SubLObject a, final SubLObject b)
  {
    final SubLObject indexa = Sequences.position( a, current_parsing_constraint_rankings(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject indexb = Sequences.position( b, current_parsing_constraint_rankings(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return makeBoolean( indexa.isNumber() && ( !indexb.isNumber() || indexa.numL( indexb ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 19845L)
  public static SubLObject which_constraints_outrank(final SubLObject constraint)
  {
    if( NIL == parsing_constraint_p( constraint ) )
    {
      return NIL;
    }
    return list_elements_preceding( constraint, current_parsing_constraint_rankings(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 20047L)
  public static SubLObject order_parsing_constraints(final SubLObject wins, final SubLObject loses, SubLObject come_togetherP)
  {
    if( come_togetherP == UNPROVIDED )
    {
      come_togetherP = NIL;
    }
    assert NIL != parsing_constraint_p( wins ) : wins;
    assert NIL != parsing_constraint_p( loses ) : loses;
    if( wins.eql( loses ) )
    {
      Errors.error( $str95$A_constraint_can_t_outrank_itself );
    }
    else
    {
      final SubLObject before = current_parsing_constraint_rankings();
      if( NIL == before )
      {
        $constrained_parsing_rankings$.setGlobalValue( ConsesLow.list( wins, loses ) );
      }
      else if( NIL == subl_promotions.memberP( wins, before, UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( loses, before, UNPROVIDED, UNPROVIDED ) )
      {
        if( come_togetherP.eql( $kw96$PROMOTE ) )
        {
          $constrained_parsing_rankings$.setGlobalValue( ConsesLow.cons( loses, $constrained_parsing_rankings$.getGlobalValue() ) );
          $constrained_parsing_rankings$.setGlobalValue( ConsesLow.cons( wins, $constrained_parsing_rankings$.getGlobalValue() ) );
        }
        else
        {
          $constrained_parsing_rankings$.setGlobalValue( ConsesLow.append( $constrained_parsing_rankings$.getGlobalValue(), ConsesLow.list( wins, loses ) ) );
        }
      }
      else
      {
        final SubLObject winner_at = Sequences.position( wins, before, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject loser_at = Sequences.position( loses, before, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == winner_at )
        {
          if( loser_at.numE( ZERO_INTEGER ) )
          {
            $constrained_parsing_rankings$.setGlobalValue( ConsesLow.cons( wins, $constrained_parsing_rankings$.getGlobalValue() ) );
          }
          else
          {
            list_utilities.ninsert_by_position( wins, $constrained_parsing_rankings$.getGlobalValue(), loser_at );
          }
        }
        else if( NIL == loser_at )
        {
          list_utilities.ninsert_by_position( loses, $constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X( winner_at ) );
        }
        else if( loser_at.numL( winner_at ) )
        {
          if( come_togetherP.eql( $kw96$PROMOTE ) )
          {
            list_utilities.remove_nth( winner_at, $constrained_parsing_rankings$.getGlobalValue() );
            list_utilities.ninsert_by_position( wins, $constrained_parsing_rankings$.getGlobalValue(), loser_at );
          }
          else
          {
            $constrained_parsing_rankings$.setGlobalValue( list_utilities.remove_nth( loser_at, $constrained_parsing_rankings$.getGlobalValue() ) );
            list_utilities.ninsert_by_position( loses, $constrained_parsing_rankings$.getGlobalValue(), winner_at );
          }
        }
        else if( come_togetherP.eql( $kw96$PROMOTE ) )
        {
          list_utilities.remove_nth( loser_at, $constrained_parsing_rankings$.getGlobalValue() );
          list_utilities.ninsert_by_position( loses, $constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X( winner_at ) );
        }
        else if( come_togetherP.eql( $kw97$DEMOTE ) )
        {
          list_utilities.ninsert_by_position( wins, $constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X( loser_at ) );
          list_utilities.remove_nth( winner_at, $constrained_parsing_rankings$.getGlobalValue() );
        }
      }
    }
    final SubLObject after = current_parsing_constraint_rankings();
    if( NIL == subl_promotions.memberP( wins, after, UNPROVIDED, UNPROVIDED ) || NIL == subl_promotions.memberP( loses, after, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str98$_A_and_or__A_missing_from_ranking, wins, loses, after );
    }
    return after;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 23436L)
  public static SubLObject frontload_parsing_constraint(final SubLObject constraint)
  {
    assert NIL != parsing_constraint_p( constraint ) : constraint;
    if( NIL != subl_promotions.memberP( constraint, $constrained_parsing_rankings$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      $constrained_parsing_rankings$.setGlobalValue( list_utilities.move_to_front( constraint, $constrained_parsing_rankings$.getGlobalValue(), Symbols.symbol_function( EQUAL ) ) );
    }
    else
    {
      $constrained_parsing_rankings$.setGlobalValue( ConsesLow.cons( constraint, $constrained_parsing_rankings$.getGlobalValue() ) );
    }
    return current_parsing_constraint_rankings();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24102L)
  public static SubLObject constrained_parsing_query_defaults()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.list( $kw101$MAX_TRANSFORMATION_DEPTH, $constrained_parsing_query_max_transformation_depth$.getDynamicValue( thread ), $kw102$MAX_TIME, $constrained_parsing_query_max_time$.getDynamicValue( thread ),
        $kw103$PRODUCTIVITY_LIMIT, $constrained_parsing_query_productivity_limit$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24587L)
  public static SubLObject without_rewrite_backtracking(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list104, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 24726L)
  public static SubLObject constrained_parsing_rewrite_backtracking(final SubLObject raw_query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $constrained_parsing_rewrite_backtrackingP$.getDynamicValue( thread ) )
    {
      return raw_query;
    }
    SubLObject revised_query = NIL;
    SubLObject cdolist_list_var = raw_query;
    SubLObject this_term = NIL;
    this_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( this_term.isList() )
      {
        revised_query = ConsesLow.cons( constrained_parsing_rewrite_backtracking( this_term ), revised_query );
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym105$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const106$EverythingPSC, thread );
          final SubLObject extent = kb_mapping.gather_gaf_arg_index( this_term, TWO_INTEGER, $const107$rewriteOf, UNPROVIDED, UNPROVIDED );
          if( NIL != list_utilities.singletonP( extent ) )
          {
            revised_query = ConsesLow.cons( cycl_utilities.formula_arg1( assertions_high.assertion_formula( extent.first() ), UNPROVIDED ), revised_query );
          }
          else
          {
            revised_query = ConsesLow.cons( this_term, revised_query );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_term = cdolist_list_var.first();
    }
    return Sequences.reverse( revised_query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 25613L)
  public static SubLObject constrained_parsing_query(final SubLObject answer_type, final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const108$InferencePSC;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sentence )
    {
      return NIL;
    }
    SubLObject the_answer = NIL;
    SubLObject problem_store = NIL;
    try
    {
      problem_store = inference_datastructures_problem_store.new_problem_store( NIL );
      final SubLObject the_sentence = ( NIL != $constrained_parsing_rewrite_backtrackingP$.getDynamicValue( thread ) ) ? constrained_parsing_rewrite_backtracking( sentence ) : sentence;
      final SubLObject query_properties = ConsesLow.append( conses_high.putf( conses_high.putf( conses_high.putf( constrained_parsing_query_defaults(), $kw109$PROBLEM_STORE, problem_store ), $kw110$RETURN, answer_type
          .isKeyword() ? answer_type : ConsesLow.list( $kw111$TEMPLATE, answer_type ) ), $kw112$BROWSABLE_, T ), v_properties );
      SubLObject inference_suspend_status = NIL;
      final SubLObject undo_traceP = NIL;
      thread.resetMultipleValues();
      final SubLObject the_answer_$1 = inference_kernel.new_cyc_query( the_sentence, mt.eql( $kw113$DEFAULT ) ? $const108$InferencePSC : mt, query_properties );
      final SubLObject inference_suspend_status_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      the_answer = the_answer_$1;
      inference_suspend_status = inference_suspend_status_$2;
      if( NIL != $debug_new_cyc_queryP$.getDynamicValue( thread ) )
      {
        if( !inference_suspend_status.eql( $kw114$EXHAUST_TOTAL ) )
        {
          if( inference_suspend_status.eql( $kw115$MAX_NUMBER ) )
          {
            if( $constrained_parsing_trace_level$.getDynamicValue( thread ).numGE( TWO_INTEGER ) )
            {
              Errors.warn( $str116$_S_in__A_may_have_had_more_answer, the_sentence, mt );
            }
          }
          else
          {
            Errors.sublisp_break( $str117$_S_in__A_exited_abnormally___A, new SubLObject[] { the_sentence, mt, inference_suspend_status
            } );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        inference_datastructures_problem_store.destroy_problem_store( problem_store );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return answer_type.isKeyword() ? cyc_kernel.closed_query_success_result_p( the_answer ) : the_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 27846L)
  public static SubLObject constrained_parsing_query_lexical(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const118$EnglishMt;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    return constrained_parsing_query( template, sentence, mt, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 28114L)
  public static SubLObject constrained_parsing_query_successP(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw113$DEFAULT;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    return constrained_parsing_query( $kw119$BINDINGS, sentence, mt, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 28393L)
  public static SubLObject constrained_parse_involves_group_coercionP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw113$DEFAULT;
    }
    if( NIL == el_utilities.el_binary_formula_p( gaf ) )
    {
      return NIL;
    }
    if( NIL == constrained_parsing_query_successP( ConsesLow.list( $const120$thereExists, $sym121$_RELN, ConsesLow.list( $const122$and, ConsesLow.list( $const123$argN, $sym121$_RELN, ZERO_INTEGER, gaf ), $list124,
        ConsesLow.listS( $const125$genls, cycl_utilities.formula_arg2( gaf, UNPROVIDED ), $list126 ) ) ), mt, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != constrained_parsing_query_successP( ConsesLow.list( $const127$not, ConsesLow.listS( $const128$isa, cycl_utilities.formula_arg1( gaf, UNPROVIDED ), $list126 ) ), mt, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != constrained_parsing_query_successP( ConsesLow.listS( $const128$isa, cycl_utilities.formula_arg1( gaf, UNPROVIDED ), $list129 ), mt, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 29589L)
  public static SubLObject constrained_parsing_illegal_isa_workaroundP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw113$DEFAULT;
    }
    if( NIL == constrained_parsing_query_successP( ConsesLow.list( $const120$thereExists, $sym121$_RELN, ConsesLow.list( $const122$and, ConsesLow.list( $const123$argN, $sym121$_RELN, ZERO_INTEGER, gaf ), $list124,
        ConsesLow.listS( $const125$genls, cycl_utilities.formula_arg2( gaf, UNPROVIDED ), $list126 ) ) ), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject relevant_isas = cdolist_list_var = constrained_parsing_query( $sym130$_KNOWN_TO_BE, ConsesLow.listS( $const122$and, new SubLObject[] { ConsesLow.list( $const131$operatorFormulas,
        $const132$GroupOfCardinalityFn, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ), ConsesLow.listS( $const128$isa, cycl_utilities.formula_arg1( gaf, UNPROVIDED ), $list133 ), $list134, $list135, ConsesLow.list(
            $const123$argN, $sym136$_COL2, ONE_INTEGER, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ), $list137
    } ), mt, UNPROVIDED );
    SubLObject this_isa = NIL;
    this_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constrained_parsing_query_successP( ConsesLow.list( $const120$thereExists, $sym138$_Y, ConsesLow.list( $const120$thereExists, $sym139$_X, ConsesLow.listS( $const122$and, ConsesLow.list( $const123$argN,
          $sym139$_X, TWO_INTEGER, this_isa ), ConsesLow.list( $const123$argN, $sym138$_Y, TWO_INTEGER, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ), $list140 ) ) ), mt, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_isa = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 31445L)
  public static SubLObject constrained_parsing_gaf_fails_constraintsP_int(final SubLObject gaf, final SubLObject passed_mt, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = which_constraints_outrank( $kw26$MINIMALTIMEPARSE );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == constraints )
    {
      return NIL;
    }
    SubLObject v_answer = $kw141$NEEDED;
    final SubLObject focal_constraint = constraints.first();
    if( $constrained_parsing_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      Errors.warn( $str142$____investigating__A_faithfulness, focal_constraint, $with_faithfulness_cutoffP$.getDynamicValue( thread ), $with_arbitrary_filter_cutoffP$.getDynamicValue( thread ) );
    }
    final SubLObject pcase_var = focal_constraint;
    if( pcase_var.eql( $kw53$FAITHFULNESSFILTERCUTOFF ) )
    {
      final SubLObject _prev_bind_0 = $with_faithfulness_cutoffP$.currentBinding( thread );
      try
      {
        $with_faithfulness_cutoffP$.bind( T, thread );
        v_answer = constrained_parsing_gaf_fails_constraintsP_int( gaf, passed_mt, constraints.rest() );
      }
      finally
      {
        $with_faithfulness_cutoffP$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( $kw143$ARBITRARYFILTERCUTFF ) )
    {
      final SubLObject _prev_bind_0 = $with_arbitrary_filter_cutoffP$.currentBinding( thread );
      try
      {
        $with_arbitrary_filter_cutoffP$.bind( T, thread );
        v_answer = constrained_parsing_gaf_fails_constraintsP_int( gaf, passed_mt, constraints.rest() );
      }
      finally
      {
        $with_arbitrary_filter_cutoffP$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( $kw80$BUGAVOIDANCECUTOFF ) )
    {
      final SubLObject _prev_bind_0 = $with_bug_avoidance_cutoffP$.currentBinding( thread );
      try
      {
        $with_bug_avoidance_cutoffP$.bind( T, thread );
        v_answer = constrained_parsing_gaf_fails_constraintsP_int( gaf, passed_mt, constraints.rest() );
      }
      finally
      {
        $with_bug_avoidance_cutoffP$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( $kw17$PROHIBITGROUPCOERCION ) )
    {
      if( NIL != constrained_parse_involves_group_coercionP( gaf, passed_mt ) )
      {
        v_answer = focal_constraint;
      }
      else
      {
        v_answer = constrained_parsing_gaf_fails_constraintsP_int( gaf, passed_mt, constraints.rest() );
      }
    }
    else if( NIL != parsing_faithfulness_filter_p( focal_constraint ) )
    {
      if( NIL == $with_faithfulness_cutoffP$.getDynamicValue( thread ) )
      {
        SubLObject filter_mt = parsing_faithfulness_filter_mt( focal_constraint );
        final SubLObject filter_type = parsing_faithfulness_filter_type( focal_constraint );
        if( NIL != genl_mts.genl_mtP( passed_mt, filter_mt, UNPROVIDED, UNPROVIDED ) )
        {
          filter_mt = passed_mt;
        }
        final SubLObject pcase_var_$3 = filter_type;
        if( pcase_var_$3.eql( $kw51$OBEYISASINMT ) )
        {
          if( NIL != genl_predicates.genl_predicate_in_any_mtP( cycl_utilities.formula_arg0( gaf ), $const128$isa ) && NIL != constrained_parsing_query_successP( ConsesLow.list( $const127$not, gaf ), filter_mt,
              UNPROVIDED ) )
          {
            v_answer = focal_constraint;
          }
        }
        else if( pcase_var_$3.eql( $kw52$OBEYGAFSINMT ) && NIL == genl_predicates.genl_predicate_in_any_mtP( cycl_utilities.formula_arg0( gaf ), $const128$isa ) && NIL != constrained_parsing_query_successP( ConsesLow
            .list( $const127$not, gaf ), filter_mt, UNPROVIDED ) )
        {
          v_answer = focal_constraint;
        }
      }
    }
    else if( NIL != parsing_arbitrary_filter_p( focal_constraint ) )
    {
      if( NIL == $with_arbitrary_filter_cutoffP$.getDynamicValue( thread ) )
      {
        final SubLObject filter_mt = parsing_arbitrary_filter_mt( focal_constraint );
        if( passed_mt.eql( $kw113$DEFAULT ) || NIL != genl_mts.genl_mtP( passed_mt, filter_mt, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject pcase_var_$4 = parsing_arbitrary_filter_type( focal_constraint );
          if( pcase_var_$4.eql( $kw76$ASSERTINTOMT ) )
          {
            final SubLObject restriction = parsing_arbitrary_filter_details( focal_constraint );
            final SubLObject gaf_operator = cycl_utilities.formula_arg0( gaf );
            SubLObject into_mt = $constrained_parsing_assert_into_mt$.getDynamicValue( thread );
            if( NIL == $constrained_parsing_assert_into_mt$.getDynamicValue( thread ) )
            {
              if( NIL != fort_types_interface.predicate_in_any_mtP( restriction ) )
              {
                if( NIL != genl_predicates.genl_predicateP( gaf_operator, restriction, filter_mt, UNPROVIDED ) )
                {
                  into_mt = filter_mt;
                }
              }
              else if( NIL != fort_types_interface.collection_in_any_mtP( restriction ) && NIL != isa.isaP( gaf_operator, restriction, filter_mt, UNPROVIDED ) )
              {
                into_mt = filter_mt;
              }
              if( NIL != genl_mts.genl_mtP( passed_mt, into_mt, UNPROVIDED, UNPROVIDED ) )
              {
                into_mt = passed_mt;
              }
              if( NIL != into_mt && $constrained_parsing_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
              {
                Errors.warn( $str144$_____S_will_be_asserted_into__A__, gaf, into_mt );
              }
            }
            final SubLObject _prev_bind_2 = $constrained_parsing_assert_into_mt$.currentBinding( thread );
            try
            {
              $constrained_parsing_assert_into_mt$.bind( into_mt, thread );
              v_answer = constrained_parsing_gaf_fails_constraintsP_int( gaf, passed_mt, constraints.rest() );
              if( NIL != $constrained_parsing_assert_into_mt$.getDynamicValue( thread ) && NIL == parsing_constraint_p( v_answer ) )
              {
                v_answer = $constrained_parsing_assert_into_mt$.getDynamicValue( thread );
              }
            }
            finally
            {
              $constrained_parsing_assert_into_mt$.rebind( _prev_bind_2, thread );
            }
          }
          else if( pcase_var_$4.eql( $kw75$NOISASARESPECS ) && NIL != constrained_parsing_query_successP( ConsesLow.list( $const122$and, ConsesLow.list( $const123$argN, $const128$isa, ZERO_INTEGER, gaf ), ConsesLow.list(
              $const123$argN, $sym145$_COL, TWO_INTEGER, gaf ), ConsesLow.list( $const127$not, ConsesLow.list( $const125$genls, $sym145$_COL, parsing_arbitrary_filter_details( focal_constraint ) ) ) ), passed_mt,
              UNPROVIDED ) )
          {
            v_answer = focal_constraint;
          }
        }
      }
    }
    else if( focal_constraint.eql( $kw79$COMPENSATEFORISAPROBLEMS ) && NIL == $with_bug_avoidance_cutoffP$.getDynamicValue( thread ) && NIL != constrained_parsing_illegal_isa_workaroundP( gaf, passed_mt ) )
    {
      v_answer = focal_constraint;
    }
    if( v_answer.eql( $kw141$NEEDED ) )
    {
      v_answer = constrained_parsing_gaf_fails_constraintsP_int( gaf, passed_mt, constraints.rest() );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 36473L)
  public static SubLObject constrained_parsing_gaf_fails_constraintsP(final SubLObject gaf, final SubLObject in_mt)
  {
    assert NIL != el_utilities.el_formula_p( gaf ) : gaf;
    if( !in_mt.eql( $kw113$DEFAULT ) && !assertionsDisabledSynth && NIL == fort_types_interface.mt_in_any_mtP( in_mt ) )
    {
      throw new AssertionError( in_mt );
    }
    return constrained_parsing_gaf_fails_constraintsP_int( gaf, in_mt, which_constraints_outrank( $kw26$MINIMALTIMEPARSE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 37055L)
  public static SubLObject constrained_parsing_unassert(final SubLObject gaf, final SubLObject mt)
  {
    constrained_parsing_record_action( $sym147$UNASSERT, ConsesLow.list( gaf, mt ) );
    if( NIL != constrained_parsing_assert_gafsP() )
    {
      return fi.fi_unassert_int( gaf, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 37394L)
  public static SubLObject constrained_parsing_possibly_assert(final SubLObject gaf, SubLObject mt, SubLObject source_string)
  {
    if( source_string == UNPROVIDED )
    {
      source_string = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_formula_p( gaf ) : gaf;
    if( !mt.eql( $kw113$DEFAULT ) && !assertionsDisabledSynth && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    if( NIL != constrained_parsing_query_successP( gaf, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject diagnosis = constrained_parsing_gaf_fails_constraintsP( gaf, mt );
    if( NIL != parsing_constraint_p( diagnosis ) )
    {
      return diagnosis;
    }
    if( NIL != fort_types_interface.mt_in_any_mtP( diagnosis ) )
    {
      if( mt.eql( $kw113$DEFAULT ) )
      {
        mt = diagnosis;
      }
    }
    else if( mt.eql( $kw113$DEFAULT ) )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_binary_formula_p( gaf ) )
    {
      SubLObject pred = NIL;
      SubLObject the_term = NIL;
      SubLObject arg2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( gaf, gaf, $list149 );
      pred = gaf.first();
      SubLObject current = gaf.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, gaf, $list149 );
      the_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, gaf, $list149 );
      arg2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( ( NIL != isa.isa_in_any_mtP( arg2, $const150$Group ) || cycl_utilities.formula_arg0( arg2 ).eql( $const151$GroupFn ) || cycl_utilities.formula_arg0( arg2 ).eql( $const132$GroupOfCardinalityFn ) )
            && NIL == isa.isa_in_any_mtP( the_term, $const150$Group ) )
        {
          SubLObject cdolist_list_var = constrained_parsing_query( $list154, ConsesLow.list( $const155$ist_Asserted, $sym156$_ANYWHERE, ConsesLow.listS( $const128$isa, the_term, $list157 ) ), UNPROVIDED, UNPROVIDED );
          SubLObject this_answer = NIL;
          this_answer = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current_$6;
            final SubLObject datum_$5 = current_$6 = this_answer;
            SubLObject this_isa = NIL;
            SubLObject this_mt = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list152 );
            this_isa = current_$6.first();
            current_$6 = current_$6.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list152 );
            this_mt = current_$6.first();
            current_$6 = current_$6.rest();
            if( NIL == current_$6 )
            {
              if( NIL == genls.genl_in_any_mtP( this_isa, $const150$Group ) )
              {
                constrained_parsing_unassert( ConsesLow.list( $const128$isa, the_term, this_isa ), this_mt );
                constrained_parsing_possibly_assert( ConsesLow.list( $const153$hypothesizedIsaCoercedInto, the_term, this_isa, arg2 ), this_mt, UNPROVIDED );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$5, $list152 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_answer = cdolist_list_var.first();
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( gaf, $list149 );
      }
    }
    SubLObject gafs_produced = ConsesLow.list( ConsesLow.list( gaf, mt ) );
    final SubLObject strength = cycl_utilities.formula_arg0( gaf ).eql( $const158$sourceOfTerm ) ? $kw159$MONOTONIC : $kw113$DEFAULT;
    constrained_parsing_record_action( $sym160$FI_ASSERT_INT, gafs_produced.first() );
    if( NIL != constrained_parsing_assert_gafsP() )
    {
      if( NIL != $constrained_parsing_show_inference_metricsP$.getDynamicValue( thread ) )
      {
        final SubLObject undo_traceP = NIL;
        inference_metrics.clear_forward_inference_metrics();
        final SubLObject _prev_bind_0 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = control_vars.$browse_forward_inferencesP$.currentBinding( thread );
        try
        {
          inference_metrics.$gathering_forward_inference_metricsP$.bind( T, thread );
          control_vars.$browse_forward_inferencesP$.bind( NIL, thread );
          fi.fi_assert_int( gaf, mt, strength, UNPROVIDED );
          inference_metrics.show_forward_inference_metrics( FOUR_INTEGER, UNPROVIDED );
          inference_metrics.finalize_forward_inference_metrics_inference_index();
        }
        finally
        {
          control_vars.$browse_forward_inferencesP$.rebind( _prev_bind_2, thread );
          inference_metrics.$gathering_forward_inference_metricsP$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        fi.fi_assert_int( gaf, mt, strength, UNPROVIDED );
      }
    }
    if( NIL != source_string && ( NIL != constrained_parsing_tracking_stringsP() || NIL != constrained_parsing_tracking_substringsP() ) )
    {
      gafs_produced = ConsesLow.cons( constrained_parsing_possibly_assert( ConsesLow.list( $const158$sourceOfTerm, gaf, source_string ), mt, UNPROVIDED ).first(), gafs_produced );
    }
    return Sequences.reverse( gafs_produced );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 40611L)
  public static SubLObject constrained_parsing_assert_through_channels(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject gaf = NIL;
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list161 );
    gaf = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list161 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list161 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list161 );
      if( NIL == conses_high.member( current_$7, $list162, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw163$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list161 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw43$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : $kw113$DEFAULT;
    final SubLObject source_tail = cdestructuring_bind.property_list_member( $kw164$SOURCE, current );
    final SubLObject source = ( NIL != source_tail ) ? conses_high.cadr( source_tail ) : NIL;
    final SubLObject record_filter_tail = cdestructuring_bind.property_list_member( $kw165$RECORD_FILTER, current );
    final SubLObject record_filter = ( NIL != record_filter_tail ) ? conses_high.cadr( record_filter_tail ) : NIL;
    final SubLObject record_null_tail = cdestructuring_bind.property_list_member( $kw166$RECORD_NULL, current );
    final SubLObject record_null = ( NIL != record_null_tail ) ? conses_high.cadr( record_null_tail ) : NIL;
    final SubLObject channel_says = $sym167$CHANNEL_SAYS;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( channel_says, ConsesLow.list( $sym168$CONSTRAINED_PARSING_POSSIBLY_ASSERT, gaf, mt, source ) ) ), ConsesLow.list( $sym7$PWHEN, ConsesLow.list(
        $sym169$CAND, channel_says, ConsesLow.list( $sym170$CNOT, record_filter ) ), ConsesLow.listS( $sym171$CSETQ, channel_says, $list172 ) ), ConsesLow.list( $sym7$PWHEN, ConsesLow.list( $sym173$COR, channel_says,
            record_null ), ConsesLow.list( $sym171$CSETQ, var, channel_says ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 41056L)
  public static SubLObject constrained_parsing_coerce_to_group(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $constrained_parsing_cardinality_known$.getDynamicValue( thread ).isNumber() || NIL != constrained_parsing_query_successP( ConsesLow.list( $const128$isa, $constrained_parsing_cardinality_known$.getDynamicValue(
        thread ), $const174$PositiveIntegerExtent ), UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( $const132$GroupOfCardinalityFn, col, $constrained_parsing_cardinality_known$.getDynamicValue( thread ) );
    }
    if( NIL != $constrained_parsing_cardinality_known$.getDynamicValue( thread ) )
    {
      return ConsesLow.list( $const151$GroupFn, col );
    }
    return col;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 41663L)
  public static SubLObject constrained_parsing_note_isa(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_term = NIL;
    SubLObject col = NIL;
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list175 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list175 );
      if( NIL == conses_high.member( current_$8, $list176, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw163$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list175 );
    }
    final SubLObject source_tail = cdestructuring_bind.property_list_member( $kw164$SOURCE, current );
    final SubLObject source = ( NIL != source_tail ) ? conses_high.cadr( source_tail ) : NIL;
    final SubLObject group_col = $sym177$GROUP_COL;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( group_col, col ) ), ConsesLow.list( $sym178$CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS, ConsesLow.list( $sym179$LIST, $const128$isa, v_term,
        group_col ), var, $kw164$SOURCE, source ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 41910L)
  public static SubLObject constrained_parse_explode_np_string(final SubLObject string, SubLObject calling_constraint)
  {
    if( calling_constraint == UNPROVIDED )
    {
      calling_constraint = $kw26$MINIMALTIMEPARSE;
    }
    SubLObject exploded = NIL;
    final SubLObject do_clausesP = parsing_constraint_outranksP( $kw27$PERMITRELATIVECLAUSEPARSES, calling_constraint );
    final SubLObject do_ppP = parsing_constraint_outranksP( $kw28$PERMITPPCOMPPARSES, calling_constraint );
    SubLObject abortP = NIL;
    if( NIL == abortP )
    {
      SubLObject csome_list_var = string_utilities.split_string( string, UNPROVIDED );
      SubLObject this_word = NIL;
      this_word = csome_list_var.first();
      while ( NIL == abortP && NIL != csome_list_var)
      {
        if( NIL == do_ppP && NIL == Strings.stringE( this_word, $str180$of, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != constrained_parsing_query_lexical( $sym181$_WU, ConsesLow.list(
            $const182$prepositionStrings, $sym181$_WU, this_word ), UNPROVIDED, UNPROVIDED ) )
        {
          abortP = T;
        }
        else if( NIL == do_clausesP && NIL != constrained_parsing_query_lexical( $sym181$_WU, ConsesLow.listS( $const122$and, ConsesLow.list( $const183$partOfSpeech, $sym181$_WU, $sym184$_POS, this_word ), $list185 ),
            UNPROVIDED, UNPROVIDED ) )
        {
          abortP = T;
        }
        else
        {
          exploded = ConsesLow.cons( this_word, exploded );
        }
        csome_list_var = csome_list_var.rest();
        this_word = csome_list_var.first();
      }
    }
    return Sequences.reverse( exploded );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 42973L)
  public static SubLObject constrained_parse_of_strings_for_term(final SubLObject the_term, final SubLObject the_strings)
  {
    assert NIL != forts.fort_p( the_term ) : the_term;
    assert NIL != list_utilities.non_dotted_list_p( the_strings ) : the_strings;
    SubLObject cdolist_list_var = the_strings;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject problemsP = NIL;
    cdolist_list_var = the_strings;
    SubLObject this_string = NIL;
    this_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == constrained_parse_of_string_for_term( the_term, this_string ) )
      {
        problemsP = T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_string = cdolist_list_var.first();
    }
    return problemsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 43584L)
  public static SubLObject constrained_parsing_get_acceptable_isas(final SubLObject the_term, SubLObject isa_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != parsing_constraint_outranksP( $kw13$PROHIBITSUBCOLLECTIONFNS, $kw16$PERMITALLNONDISJOINTISAS ) )
    {
      isa_list = Sequences.remove_if( $sym189$SUBCOLLECTION_NAUT_P, isa_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != $constrained_parsing_cardinality_known$.getDynamicValue( thread ) )
    {
      SubLObject tmp_list = NIL;
      SubLObject cdolist_list_var = isa_list;
      SubLObject this_isa = NIL;
      this_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        tmp_list = ConsesLow.cons( constrained_parsing_coerce_to_group( this_isa ), tmp_list );
        cdolist_list_var = cdolist_list_var.rest();
        this_isa = cdolist_list_var.first();
      }
      isa_list = Sequences.reverse( tmp_list );
      if( NIL != constrained_parsing_query_successP( ConsesLow.list( $const127$not, ConsesLow.listS( $const128$isa, the_term, $list126 ) ), UNPROVIDED, UNPROVIDED ) )
      {
        return isa_list;
      }
    }
    SubLObject list_of_ok = NIL;
    SubLObject cdolist_list_var = isa_list;
    SubLObject this_isa = NIL;
    this_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constrained_parsing_query_successP( ConsesLow.list( $const127$not, ConsesLow.list( $const128$isa, the_term, this_isa ) ), UNPROVIDED, UNPROVIDED ) )
      {
        Errors.warn( $str190$____rejected_potential_parse_of__, this_isa, the_term );
      }
      else
      {
        list_of_ok = ConsesLow.cons( this_isa, list_of_ok );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_isa = cdolist_list_var.first();
    }
    return Sequences.reverse( list_of_ok );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 45169L)
  public static SubLObject constrained_parse_of_substrings_for_term(final SubLObject the_term, final SubLObject substrings, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = $const191$nounStrings;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject bunged = string_utilities.bunge( substrings, UNPROVIDED );
    SubLObject did_workP = $kw192$NADA;
    final SubLObject cols = constrained_parsing_get_acceptable_isas( the_term, constrained_parsing_query_lexical( $sym145$_COL, ConsesLow.listS( $const122$and, ConsesLow.list( $const193$termPhrases, $sym145$_COL,
        predicate, bunged ), $list194 ), UNPROVIDED, UNPROVIDED ) );
    if( $constrained_parsing_trace_level$.getDynamicValue( thread ).numGE( ( NIL != cols ) ? ZERO_INTEGER : TWO_INTEGER ) )
    {
      Errors.warn( $str195$____remaining_parses_are__A_w_car, cols, $constrained_parsing_cardinality_known$.getDynamicValue( thread ) );
    }
    if( cols.isCons() && ( NIL != list_utilities.singletonP( cols ) || NIL != parsing_constraint_outranksP( $kw16$PERMITALLNONDISJOINTISAS, $kw14$PROHIBITAMBIGUOUSGAFS ) ) )
    {
      SubLObject cdolist_list_var = cols;
      SubLObject this_col = NIL;
      this_col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == constrained_parsing_query_successP( ConsesLow.list( $const127$not, ConsesLow.list( $const128$isa, the_term, this_col ) ), UNPROVIDED, UNPROVIDED ) && NIL == constrained_parsing_query_successP(
            ConsesLow.list( $const128$isa, the_term, this_col ), UNPROVIDED, UNPROVIDED ) && NIL == constrained_parsing_faceting_violationP( the_term, this_col, $kw16$PERMITALLNONDISJOINTISAS ) )
        {
          final SubLObject group_col = this_col;
          SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const128$isa, the_term, group_col ), $kw113$DEFAULT, bunged );
          if( NIL != channel_says )
          {
            channel_says = $kw196$WORK_DONE;
          }
          if( NIL != channel_says )
          {
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
  public static SubLObject constrained_parsing_faceting_violationP(final SubLObject the_term, final SubLObject wrt_col, final SubLObject key_constraint)
  {
    if( NIL != parsing_constraint_outranksP( key_constraint, $kw12$AVOIDREDUNDANTFACETS ) )
    {
      return NIL;
    }
    return constrained_parsing_query_successP( ConsesLow.list( $const120$thereExists, $sym145$_COL, ConsesLow.list( $const120$thereExists, $sym197$_COL_TYPE, ConsesLow.list( $const120$thereExists, $sym198$_FACETING_COL,
        ConsesLow.list( $const120$thereExists, $sym199$_SOMEWHERE, ConsesLow.list( $const120$thereExists, $sym156$_ANYWHERE, ConsesLow.list( $const120$thereExists, $sym200$_TERM_COL, ConsesLow.listS( $const122$and,
            ConsesLow.list( $const155$ist_Asserted, $sym199$_SOMEWHERE, ConsesLow.listS( $const128$isa, wrt_col, $list201 ) ), $list202, $list203, ConsesLow.list( $const155$ist_Asserted, $sym156$_ANYWHERE, ConsesLow
                .listS( $const128$isa, the_term, $list157 ) ), $list204 ) ) ) ) ) ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 47651L)
  public static SubLObject constrained_parse_of_string_for_term(final SubLObject the_term, final SubLObject the_string)
  {
    if( NIL != string_utilities.capitalized_string_p( the_string ) )
    {
      return constrained_parse_of_namestring_for_term( the_term, the_string );
    }
    return constrained_parse_of_string_for_term_int( the_term, constrained_parse_explode_np_string( the_string, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 48326L)
  public static SubLObject constrained_parse_of_string_for_term_int(final SubLObject the_term, SubLObject exploded, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = which_constraints_outrank( $kw26$MINIMALTIMEPARSE );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == exploded || NIL == constraints )
    {
      return NIL;
    }
    SubLObject diagnosis = NIL;
    final SubLObject focal_constraint = constraints.first();
    final SubLObject cdrstraints = constraints.rest();
    if( NIL != parsing_flow_control_principle_p( focal_constraint ) )
    {
      final SubLObject pcase_var = focal_constraint;
      if( pcase_var.eql( $kw18$STRIPCARDINALITY ) )
      {
        if( exploded.isString() )
        {
          exploded = constrained_parse_explode_np_string( focal_constraint, UNPROVIDED );
        }
        SubLObject current;
        final SubLObject datum = current = constrained_parse_extract_cardinality( exploded );
        SubLObject cardinality = NIL;
        SubLObject strings = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
        cardinality = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
        strings = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject _prev_bind_0 = $constrained_parsing_cardinality_known$.currentBinding( thread );
          try
          {
            $constrained_parsing_cardinality_known$.bind( cardinality, thread );
            if( NIL != cardinality && NIL == $constrained_parsing_allow_group_coercionP$.getDynamicValue( thread ) && NIL != constrained_parsing_query_successP( ConsesLow.list( $const127$not, ConsesLow.listS(
                $const128$isa, the_term, $list126 ) ), UNPROVIDED, UNPROVIDED ) )
            {
              diagnosis = $kw17$PROHIBITGROUPCOERCION;
            }
            else
            {
              diagnosis = constrained_parse_of_string_for_term_int( the_term, strings, cdrstraints );
            }
          }
          finally
          {
            $constrained_parsing_cardinality_known$.rebind( _prev_bind_0, thread );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list205 );
        }
        return diagnosis;
      }
      if( pcase_var.eql( $kw20$WIDESCOPEPRECISION ) )
      {
        if( exploded.isString() )
        {
          exploded = constrained_parse_explode_np_string( focal_constraint, UNPROVIDED );
        }
        for( SubLObject workspace = exploded; !diagnosis.eql( $kw206$ERROR ) && NIL != workspace; workspace = workspace.rest() )
        {
          diagnosis = constrained_parse_of_substrings_for_term( the_term, workspace, UNPROVIDED );
          if( NIL != $constrained_parsing_consider_adjectivesP$.getDynamicValue( thread ) && !diagnosis.eql( $kw206$ERROR ) )
          {
            diagnosis = constrained_parse_of_substrings_for_term( the_term, workspace, $const207$adjStrings );
          }
        }
      }
      else if( pcase_var.eql( $kw24$NARROWSCOPEPRECISION ) )
      {
        if( exploded.isString() )
        {
          exploded = constrained_parse_explode_np_string( focal_constraint, UNPROVIDED );
        }
        for( SubLObject workspace = Sequences.reverse( exploded ); NIL != workspace && !diagnosis.eql( $kw206$ERROR ); workspace = workspace.rest() )
        {
          diagnosis = constrained_parse_of_substrings_for_term( the_term, ConsesLow.list( workspace.first() ), UNPROVIDED );
          if( NIL != $constrained_parsing_consider_adjectivesP$.getDynamicValue( thread ) && !diagnosis.eql( $kw206$ERROR ) )
          {
            diagnosis = constrained_parse_of_substrings_for_term( the_term, ConsesLow.list( workspace.first() ), $const207$adjStrings );
          }
        }
      }
      else if( pcase_var.eql( $kw22$PERMITNARTISAS ) )
      {
        if( exploded.isString() )
        {
          exploded = constrained_parse_explode_np_string( focal_constraint, UNPROVIDED );
        }
        diagnosis = constrained_parse_of_nart_isas( the_term, exploded );
      }
      else if( pcase_var.eql( $kw23$RELATIONALLINSTANCEPARSE ) )
      {
        if( exploded.isString() )
        {
          exploded = constrained_parse_explode_np_string( focal_constraint, UNPROVIDED );
        }
        diagnosis = constrained_parse_via_relation_all_instance( the_term, exploded );
      }
      else
      {
        if( pcase_var.eql( $kw17$PROHIBITGROUPCOERCION ) )
        {
          final SubLObject _prev_bind_2 = $constrained_parsing_allow_group_coercionP$.currentBinding( thread );
          try
          {
            $constrained_parsing_allow_group_coercionP$.bind( NIL, thread );
            diagnosis = constrained_parse_of_string_for_term_int( the_term, exploded, cdrstraints );
          }
          finally
          {
            $constrained_parsing_allow_group_coercionP$.rebind( _prev_bind_2, thread );
          }
          return diagnosis;
        }
        if( pcase_var.eql( $kw21$PERMITADJECTIVEPARSES ) )
        {
          final SubLObject _prev_bind_2 = $constrained_parsing_consider_adjectivesP$.currentBinding( thread );
          try
          {
            $constrained_parsing_consider_adjectivesP$.bind( T, thread );
            diagnosis = constrained_parse_of_string_for_term_int( the_term, exploded, cdrstraints );
          }
          finally
          {
            $constrained_parsing_consider_adjectivesP$.rebind( _prev_bind_2, thread );
          }
          return diagnosis;
        }
        if( pcase_var.eql( $kw19$CASESENSITIVELEXICON ) )
        {
          final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
          try
          {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( $kw208$ON, thread );
            diagnosis = constrained_parse_of_string_for_term_int( the_term, exploded, cdrstraints );
          }
          finally
          {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_2, thread );
          }
          return diagnosis;
        }
        if( pcase_var.eql( $kw25$CASEINSENSITIVELEXICON ) )
        {
          final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
          try
          {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( $kw209$OFF, thread );
            diagnosis = constrained_parse_of_string_for_term_int( the_term, exploded, cdrstraints );
          }
          finally
          {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_2, thread );
          }
          return diagnosis;
        }
      }
    }
    if( diagnosis.eql( $kw206$ERROR ) )
    {
      return diagnosis;
    }
    return constrained_parse_of_string_for_term_int( the_term, exploded, cdrstraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 52541L)
  public static SubLObject constrained_parse_extract_cardinality(final SubLObject exploded)
  {
    assert NIL != list_utilities.non_dotted_list_p( exploded ) : exploded;
    SubLObject cdolist_list_var = exploded;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject post_strings = exploded;
    SubLObject workspace = NIL;
    SubLObject as_integer = NIL;
    SubLObject this_many = NIL;
    SubLObject doneP = NIL;
    SubLObject pre_strings = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = exploded;
      SubLObject this_word = NIL;
      this_word = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        as_integer = string_utilities.string_to_integer( string_utilities.remove_substring( this_word, $str210$_ ) );
        if( NIL != as_integer )
        {
          workspace = ConsesLow.list( as_integer );
        }
        else
        {
          workspace = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.list( $const193$termPhrases, $sym211$_DENOT, $const212$Determiner, this_word ), UNPROVIDED, UNPROVIDED );
        }
        if( NIL == workspace )
        {
          workspace = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.listS( $const122$and, ConsesLow.list( $const213$termStrings, $sym211$_DENOT, this_word ), $list214 ), UNPROVIDED, UNPROVIDED );
        }
        if( NIL == workspace )
        {
          workspace = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.listS( $const122$and, ConsesLow.list( $const213$termStrings, $sym211$_DENOT, this_word ), $list215 ), UNPROVIDED, UNPROVIDED );
        }
        final SubLObject the_number = workspace.first();
        if( NIL == workspace )
        {
          doneP = T;
        }
        else if( NIL != list_utilities.singletonP( workspace ) && NIL != the_number && NIL != constrained_parsing_query_successP( ConsesLow.listS( $const128$isa, the_number, $list216 ), $const118$EnglishMt,
            UNPROVIDED ) )
        {
          if( NIL == this_many )
          {
            this_many = the_number;
          }
          else if( this_many.isNumber() )
          {
            this_many = Numbers.multiply( the_number, this_many );
          }
          else
          {
            this_many = Numbers.multiply( this_many, constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.listS( $const122$and, ConsesLow.listS( $const213$termStrings, the_number, $list217 ), $list218 ),
                UNPROVIDED, UNPROVIDED ).first() );
          }
        }
        else
        {
          pre_strings = ConsesLow.cons( this_word, pre_strings );
          doneP = list_utilities.sublisp_boolean( this_many );
        }
        if( NIL == doneP )
        {
          post_strings = post_strings.rest();
        }
        csome_list_var = csome_list_var.rest();
        this_word = csome_list_var.first();
      }
    }
    return ( NIL != this_many ) ? ConsesLow.list( this_many, list_utilities.flatten( ConsesLow.list( Sequences.reverse( pre_strings ), post_strings ) ) ) : ConsesLow.list( NIL, exploded );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 55312L)
  public static SubLObject constrained_parse_search_for_rewrites(final SubLObject the_term, final SubLObject the_string, SubLObject search_predicate)
  {
    if( search_predicate == UNPROVIDED )
    {
      search_predicate = $const219$preferredNameString;
    }
    if( NIL != parsing_constraint_outranksP( $kw81$AVOIDREWRITEPARSES, $kw80$BUGAVOIDANCECUTOFF ) )
    {
      return $kw192$NADA;
    }
    SubLObject found_rewrite = NIL;
    SubLObject cdolist_list_var = constrained_parsing_query_lexical( $sym222$_WHO, ConsesLow.list( $const122$and, ConsesLow.list( search_predicate, $sym222$_WHO, the_string ), ConsesLow.list( $const127$not, ConsesLow
        .list( $const223$equals, $sym222$_WHO, the_term ) ), $list224, ConsesLow.list( $const225$unknownSentence, ConsesLow.list( $const120$thereExists, $sym145$_COL, ConsesLow.listS( $const122$and, ConsesLow.list(
            $const155$ist_Asserted, $sym156$_ANYWHERE, ConsesLow.listS( $const128$isa, the_term, $list157 ) ), $list226 ) ) ) ), UNPROVIDED, UNPROVIDED );
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != found_rewrite )
      {
        Errors.warn( $str220$____found__at_least___A_and__A_as, found_rewrite, v_answer, the_term );
        return $kw192$NADA;
      }
      SubLObject collisionP = NIL;
      if( NIL == collisionP )
      {
        SubLObject csome_list_var;
        SubLObject this_col;
        for( csome_list_var = constrained_parsing_query( $sym145$_COL, ConsesLow.list( $const155$ist_Asserted, $sym156$_ANYWHERE, ConsesLow.listS( $const128$isa, v_answer, $list157 ) ), UNPROVIDED,
            UNPROVIDED ), this_col = NIL, this_col = csome_list_var.first(); NIL == collisionP && NIL != csome_list_var; collisionP = constrained_parsing_faceting_violationP( the_term, this_col,
                $kw26$MINIMALTIMEPARSE ), csome_list_var = csome_list_var.rest(), this_col = csome_list_var.first() )
        {
        }
      }
      if( NIL == collisionP )
      {
        Errors.warn( $str221$____setting_rewrite_option_to__S, v_answer );
        found_rewrite = v_answer;
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    if( NIL != found_rewrite )
    {
      SubLObject did_workP = $kw192$NADA;
      SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const107$rewriteOf, found_rewrite, the_term ), $kw113$DEFAULT, the_string );
      if( NIL != channel_says )
      {
        channel_says = $kw196$WORK_DONE;
      }
      if( NIL != channel_says )
      {
        did_workP = channel_says;
      }
      return did_workP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 57059L)
  public static SubLObject frontload_genitive_if_any(final SubLObject string_list)
  {
    return rotate_list_around_pivot( string_list, $str180$of, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 57260L)
  public static SubLObject eliminate_redundant_narts(final SubLObject nart_list)
  {
    if( NIL == list_utilities.lengthG( nart_list, ONE_INTEGER, UNPROVIDED ) )
    {
      return nart_list;
    }
    assert NIL != list_utilities.non_dotted_list_p( nart_list ) : nart_list;
    SubLObject cdolist_list_var = nart_list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.listp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject reduced = NIL;
    cdolist_list_var = nart_list;
    SubLObject this_nart = NIL;
    this_nart = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject found_narrowerP = NIL;
      if( NIL == found_narrowerP )
      {
        SubLObject csome_list_var = nart_list;
        SubLObject other_nart = NIL;
        other_nart = csome_list_var.first();
        while ( NIL == found_narrowerP && NIL != csome_list_var)
        {
          if( !other_nart.equal( this_nart ) && cycl_utilities.formula_arg0( this_nart ).eql( cycl_utilities.formula_arg0( other_nart ) ) )
          {
            SubLObject n = ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args( this_nart, $kw228$IGNORE );
            SubLObject rest;
            SubLObject this_arg;
            for( rest = NIL, rest = args; NIL == found_narrowerP && NIL != rest; found_narrowerP = constrained_parsing_query_successP( ConsesLow.list( $const229$or, ConsesLow.list( $const125$genls, cycl_utilities
                .formula_arg( other_nart, n, UNPROVIDED ), this_arg ), ConsesLow.list( $const230$subFields, this_arg, cycl_utilities.formula_arg( other_nart, n, UNPROVIDED ) ) ), UNPROVIDED, UNPROVIDED ), rest = rest
                    .rest() )
            {
              this_arg = rest.first();
              n = Numbers.add( n, ONE_INTEGER );
            }
          }
          csome_list_var = csome_list_var.rest();
          other_nart = csome_list_var.first();
        }
      }
      if( NIL == found_narrowerP )
      {
        reduced = ConsesLow.cons( this_nart, reduced );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_nart = cdolist_list_var.first();
    }
    return reduced;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 58055L)
  public static SubLObject constrained_parse_of_nart_isas(final SubLObject the_term, final SubLObject the_strings)
  {
    SubLObject np_core = NIL;
    SubLObject all_matches = NIL;
    SubLObject strings_left = frontload_genitive_if_any( the_strings );
    final SubLObject enough_work_doneP = NIL;
    SubLObject any_work_doneP = $kw192$NADA;
    if( NIL == enough_work_doneP )
    {
      SubLObject csome_list_var = Sequences.reverse( strings_left );
      SubLObject this_word = NIL;
      this_word = csome_list_var.first();
      while ( NIL == enough_work_doneP && NIL != csome_list_var)
      {
        np_core = ConsesLow.cons( this_word, np_core );
        strings_left = list_utilities.remove_last( strings_left );
        SubLObject cdolist_list_var = constrained_parsing_query( $sym234$_FUNC, ConsesLow.listS( $const122$and, ConsesLow.list( $const213$termStrings, $sym234$_FUNC, string_utilities.bunge( np_core, UNPROVIDED ) ),
            $list235 ), $const236$RelationParaphraseMt, UNPROVIDED );
        SubLObject possible_func = NIL;
        possible_func = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject mod_core = NIL;
          if( NIL == enough_work_doneP )
          {
            SubLObject csome_list_var_$9 = Sequences.reverse( strings_left );
            SubLObject this_modifier = NIL;
            this_modifier = csome_list_var_$9.first();
            while ( NIL == enough_work_doneP && NIL != csome_list_var_$9)
            {
              mod_core = ConsesLow.cons( this_modifier, mod_core );
              SubLObject answers = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.list( $const122$and, ConsesLow.list( $const213$termStrings, $sym211$_DENOT, string_utilities.bunge( mod_core,
                  UNPROVIDED ) ), ConsesLow.list( $const231$admittedArgument, $sym211$_DENOT, ONE_INTEGER, possible_func ) ), UNPROVIDED, UNPROVIDED );
              if( NIL != list_utilities.singletonP( answers ) )
              {
                all_matches = ConsesLow.cons( ConsesLow.list( possible_func, answers.first() ), all_matches );
              }
              answers = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.list( $const122$and, ConsesLow.list( $const232$wordStrings, $sym181$_WU, string_utilities.bunge( mod_core, UNPROVIDED ) ), $list233,
                  ConsesLow.list( $const231$admittedArgument, $sym211$_DENOT, ONE_INTEGER, possible_func ) ), UNPROVIDED, UNPROVIDED );
              if( NIL != list_utilities.singletonP( answers ) )
              {
                all_matches = ConsesLow.cons( ConsesLow.list( possible_func, answers.first() ), all_matches );
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
    all_matches = eliminate_redundant_narts( all_matches );
    if( NIL == all_matches || ( NIL != list_utilities.lengthG( all_matches, ONE_INTEGER, UNPROVIDED ) && NIL != parsing_constraint_outranksP( $kw14$PROHIBITAMBIGUOUSGAFS, $kw26$MINIMALTIMEPARSE ) ) )
    {
      return $kw192$NADA;
    }
    SubLObject cdolist_list_var2 = all_matches;
    SubLObject this_match = NIL;
    this_match = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != constrained_parsing_query_successP( ConsesLow.listS( $const128$isa, cycl_utilities.formula_arg0( this_match ), $list237 ), UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject group_col = this_match;
        SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const128$isa, the_term, group_col ), $kw113$DEFAULT, string_utilities.bunge( the_strings, UNPROVIDED ) );
        if( NIL != channel_says )
        {
          channel_says = $kw196$WORK_DONE;
        }
        if( NIL != channel_says )
        {
          any_work_doneP = channel_says;
        }
      }
      else
      {
        SubLObject channel_says2 = constrained_parsing_possibly_assert( ConsesLow.list( $const107$rewriteOf, this_match, the_term ), $kw113$DEFAULT, string_utilities.bunge( the_strings, UNPROVIDED ) );
        if( NIL != channel_says2 )
        {
          channel_says2 = $kw196$WORK_DONE;
        }
        if( NIL != channel_says2 )
        {
          any_work_doneP = channel_says2;
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      this_match = cdolist_list_var2.first();
    }
    return any_work_doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 60353L)
  public static SubLObject constrained_parse_via_relation_all_instance(final SubLObject the_term, final SubLObject the_strings)
  {
    SubLObject head = NIL;
    SubLObject work_doneP = $kw192$NADA;
    SubLObject string_copies = conses_high.copy_list( the_strings );
    while ( NIL != list_utilities.lengthG( string_copies, ONE_INTEGER, UNPROVIDED ))
    {
      if( NIL == head )
      {
        head = ConsesLow.list( list_utilities.last_one( string_copies ) );
      }
      else
      {
        head = ConsesLow.cons( list_utilities.last_one( string_copies ), head );
      }
      string_copies = list_utilities.remove_last( string_copies );
      SubLObject cdolist_list_var = constrained_parsing_query( $list242, ConsesLow.listS( $const122$and, ConsesLow.list( $const193$termPhrases, $sym243$_PRED, $const240$Noun, string_utilities.bunge( head, UNPROVIDED ) ),
          ConsesLow.listS( $const231$admittedArgument, the_term, $list244 ), $list245 ), UNPROVIDED, UNPROVIDED );
      SubLObject v_answer = NIL;
      v_answer = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = v_answer;
        SubLObject pred = NIL;
        SubLObject col1 = NIL;
        SubLObject col2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list238 );
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list238 );
        col1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list238 );
        col2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject source_string = constrained_parsing_choose_string_sources( string_utilities.bunge( the_strings, UNPROVIDED ), string_utilities.bunge( string_copies, UNPROVIDED ) );
          if( NIL != constrained_parsing_query_successP( ConsesLow.list( $const128$isa, the_term, col2 ), UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var_$10 = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.list( $const122$and, ConsesLow.list( $const193$termPhrases, $sym211$_DENOT, $const240$Noun, list_utilities
                .last_one( string_copies ) ), ConsesLow.list( $const125$genls, $sym211$_DENOT, col1 ) ), UNPROVIDED, UNPROVIDED );
            SubLObject denot = NIL;
            denot = cdolist_list_var_$10.first();
            while ( NIL != cdolist_list_var_$10)
            {
              SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const239$relationExistsInstance, pred, denot, the_term ), $kw113$DEFAULT, source_string );
              if( NIL != channel_says )
              {
                channel_says = $kw196$WORK_DONE;
              }
              if( NIL != channel_says )
              {
                work_doneP = channel_says;
              }
              cdolist_list_var_$10 = cdolist_list_var_$10.rest();
              denot = cdolist_list_var_$10.first();
            }
            SubLObject cdolist_list_var_$11 = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.list( $const122$and, ConsesLow.list( $const232$wordStrings, $sym181$_WU, list_utilities.last_one(
                string_copies ) ), $list241, ConsesLow.list( $const128$isa, $sym211$_DENOT, col1 ) ), UNPROVIDED, UNPROVIDED );
            denot = NIL;
            denot = cdolist_list_var_$11.first();
            while ( NIL != cdolist_list_var_$11)
            {
              SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( pred, denot, the_term ), $kw113$DEFAULT, source_string );
              if( NIL != channel_says )
              {
                channel_says = $kw196$WORK_DONE;
              }
              if( NIL != channel_says )
              {
                work_doneP = channel_says;
              }
              cdolist_list_var_$11 = cdolist_list_var_$11.rest();
              denot = cdolist_list_var_$11.first();
            }
            SubLObject cdolist_list_var_$12 = constrained_parsing_query_lexical( $sym211$_DENOT, ConsesLow.list( $const122$and, ConsesLow.list( $const232$wordStrings, $sym181$_WU, list_utilities.last_one(
                string_copies ) ), $list241, ConsesLow.list( $const125$genls, $sym211$_DENOT, col1 ) ), UNPROVIDED, UNPROVIDED );
            denot = NIL;
            denot = cdolist_list_var_$12.first();
            while ( NIL != cdolist_list_var_$12)
            {
              SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const239$relationExistsInstance, pred, denot, the_term ), $kw113$DEFAULT, source_string );
              if( NIL != channel_says )
              {
                channel_says = $kw196$WORK_DONE;
              }
              if( NIL != channel_says )
              {
                work_doneP = channel_says;
              }
              cdolist_list_var_$12 = cdolist_list_var_$12.rest();
              denot = cdolist_list_var_$12.first();
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list238 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_answer = cdolist_list_var.first();
      }
    }
    return work_doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 62446L)
  public static SubLObject constrained_parse_of_namestring_for_term(final SubLObject the_term, final SubLObject namestring)
  {
    if( NIL != parsing_constraint_outranksP( $kw82$AVOIDNAMESTRINGPARSES, $kw80$BUGAVOIDANCECUTOFF ) )
    {
      return $kw192$NADA;
    }
    if( NIL != isa.isaP( the_term, $const246$Person, UNPROVIDED, UNPROVIDED ) && constrained_parse_search_for_rewrites( the_term, namestring, $const219$preferredNameString ).eql( $kw196$WORK_DONE ) )
    {
      return $kw196$WORK_DONE;
    }
    if( ( NIL != isa.isaP( the_term, $const247$Organization, UNPROVIDED, UNPROVIDED ) || NIL != isa.isaP( the_term, $const248$GeopoliticalEntity, UNPROVIDED, UNPROVIDED ) ) && constrained_parse_search_for_rewrites(
        the_term, namestring, $const213$termStrings ).eql( $kw196$WORK_DONE ) )
    {
      return $kw196$WORK_DONE;
    }
    final SubLObject namesP = constrained_parse_of_first_and_last_names( the_term, namestring );
    if( !namesP.eql( $kw192$NADA ) )
    {
      return namesP;
    }
    final SubLObject businessP = constrained_parse_of_business_suffix( the_term, namestring );
    if( !businessP.eql( $kw192$NADA ) )
    {
      return businessP;
    }
    return $kw192$NADA;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 63677L)
  public static SubLObject constrained_parse_of_business_suffix(final SubLObject the_term, final SubLObject namestring)
  {
    SubLObject work_doneP = $kw192$NADA;
    if( NIL == constrained_parsing_query_successP( ConsesLow.listS( $const128$isa, the_term, $list249 ), UNPROVIDED, UNPROVIDED ) && NIL != constrained_parsing_query_successP( ConsesLow.listS( $const128$isa, the_term,
        $list250 ), UNPROVIDED, UNPROVIDED ) && NIL != constrained_parsing_query_successP( ConsesLow.list( $const229$or, ConsesLow.list( $const251$substring, $str252$___Co, namestring ), ConsesLow.list(
            $const251$substring, $str253$_Company, namestring ), ConsesLow.list( $const251$substring, $str254$_Plc, namestring ), ConsesLow.list( $const251$substring, $str255$_Ltd, namestring ) ), UNPROVIDED,
            UNPROVIDED ) )
    {
      final SubLObject group_col = $const256$Business;
      SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const128$isa, the_term, group_col ), $kw113$DEFAULT, namestring );
      if( NIL != channel_says )
      {
        channel_says = $kw196$WORK_DONE;
      }
      if( NIL != channel_says )
      {
        work_doneP = channel_says;
      }
    }
    return work_doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 64493L)
  public static SubLObject constrained_parse_of_first_and_last_names(final SubLObject the_term, final SubLObject namestring)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != string_utilities.substringP( $str257$_, namestring, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != constrained_parsing_query_successP( ConsesLow.list( $const229$or, ConsesLow.listS( $const128$isa,
        the_term, $list129 ), ConsesLow.listS( $const128$isa, the_term, $list258 ) ), UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject saved_given_name = NIL;
      SubLObject saved_family_name = NIL;
      final SubLObject known_family_nameP = NIL;
      SubLObject searchspace = string_utilities.split_string( namestring, UNPROVIDED );
      SubLObject this_name = NIL;
      SubLObject name_list = NIL;
      while ( NIL != list_utilities.lengthG( searchspace, ONE_INTEGER, UNPROVIDED ))
      {
        this_name = searchspace.first();
        if( NIL != list_utilities.proper_list_p( name_list ) )
        {
          name_list = list_utilities.flatten( ConsesLow.list( name_list, this_name ) );
        }
        else if( NIL == name_list && constrained_parse_of_salutation_if_any( the_term, this_name ).eql( $kw192$NADA ) )
        {
          name_list = ConsesLow.list( this_name );
        }
        searchspace = searchspace.rest();
        final SubLObject bunged_given_name = string_utilities.bunge( name_list, UNPROVIDED );
        if( NIL != constrained_parsing_query_successP( ConsesLow.list( $const120$thereExists, $sym259$_CONSTANT, ConsesLow.list( $const229$or, ConsesLow.list( $const122$and, $list260, ConsesLow.list(
            $const261$nameSpelling, $sym259$_CONSTANT, bunged_given_name ) ), ConsesLow.list( $const262$givenNames, $sym259$_CONSTANT, bunged_given_name ) ) ), UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject bunged_family_name = string_utilities.bunge( searchspace, UNPROVIDED );
          final SubLObject found_familyP = constrained_parsing_query_successP( ConsesLow.list( $const120$thereExists, $sym259$_CONSTANT, ConsesLow.list( $const229$or, ConsesLow.list( $const122$and, $list263, ConsesLow
              .list( $const261$nameSpelling, $sym259$_CONSTANT, bunged_family_name ) ), ConsesLow.list( $const264$familyName, $sym259$_CONSTANT, bunged_family_name ) ) ), UNPROVIDED, UNPROVIDED );
          if( NIL != found_familyP && NIL != known_family_nameP )
          {
            return $kw192$NADA;
          }
          if( NIL != found_familyP )
          {
            saved_given_name = bunged_given_name;
            saved_family_name = bunged_family_name;
          }
          else
          {
            if( NIL != saved_given_name )
            {
              continue;
            }
            saved_given_name = bunged_given_name;
            saved_family_name = bunged_family_name;
          }
        }
      }
      if( NIL != saved_given_name && NIL != saved_family_name )
      {
        SubLObject work_doneP = $kw192$NADA;
        final SubLObject _prev_bind_0 = $constrained_parsing_assert_into_mt$.currentBinding( thread );
        try
        {
          $constrained_parsing_assert_into_mt$.bind( $const118$EnglishMt, thread );
          final SubLObject possible_source = constrained_parsing_choose_string_sources( namestring, NIL );
          SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const262$givenNames, the_term, saved_given_name ), $kw113$DEFAULT, possible_source );
          if( NIL != channel_says )
          {
            channel_says = $kw196$WORK_DONE;
          }
          if( NIL != channel_says )
          {
            work_doneP = channel_says;
          }
          channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const264$familyName, the_term, saved_family_name ), $kw113$DEFAULT, possible_source );
          if( NIL != channel_says )
          {
            channel_says = $kw196$WORK_DONE;
          }
          if( NIL != channel_says )
          {
            work_doneP = channel_says;
          }
        }
        finally
        {
          $constrained_parsing_assert_into_mt$.rebind( _prev_bind_0, thread );
        }
        return work_doneP;
      }
    }
    return $kw192$NADA;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 67476L)
  public static SubLObject constrained_parse_of_salutation_if_any(final SubLObject the_term, final SubLObject the_string)
  {
    final SubLObject answers = constrained_parsing_query( $sym265$_SALUT, ConsesLow.listS( $const266$codeMapping, $const267$SalutationMapping, the_string, $list268 ), UNPROVIDED, UNPROVIDED );
    SubLObject assert_these = NIL;
    SubLObject work_doneP = $kw192$NADA;
    if( NIL != list_utilities.singletonP( answers ) )
    {
      final SubLObject first_pass = constrained_parsing_query( $sym145$_COL, ConsesLow.list( $const269$relationAllInstance, $const270$salutation, $sym145$_COL, answers.first() ), UNPROVIDED, UNPROVIDED );
      if( NIL != list_of_not_disjoint_collections_p( first_pass ) )
      {
        SubLObject cdolist_list_var = first_pass;
        SubLObject this_col = NIL;
        this_col = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == constrained_parsing_query_successP( ConsesLow.list( $const127$not, ConsesLow.list( $const128$isa, the_term, this_col ) ), UNPROVIDED, UNPROVIDED ) )
          {
            assert_these = ConsesLow.cons( this_col, assert_these );
          }
          cdolist_list_var = cdolist_list_var.rest();
          this_col = cdolist_list_var.first();
        }
      }
    }
    SubLObject cdolist_list_var2 = assert_these;
    SubLObject this_col2 = NIL;
    this_col2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject group_col = this_col2;
      SubLObject channel_says = constrained_parsing_possibly_assert( ConsesLow.list( $const128$isa, the_term, group_col ), $kw113$DEFAULT, the_string );
      if( NIL != channel_says )
      {
        channel_says = $kw196$WORK_DONE;
      }
      if( NIL != channel_says )
      {
        work_doneP = channel_says;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      this_col2 = cdolist_list_var2.first();
    }
    return work_doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_demo_rank_assertion_mts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $acquaint_demo_assertion_filter$.getDynamicValue( thread ) )
    {
      $acquaint_demo_assertion_filter$.setDynamicValue( new_parsing_arbitrary_filter( $kw76$ASSERTINTOMT, $const92$Relation, $const271$BBN_CDE_StrengthenedMt ), thread );
    }
    if( NIL == $acquaint_demo_lexical_assertion_filter$.getDynamicValue( thread ) )
    {
      $acquaint_demo_lexical_assertion_filter$.setDynamicValue( new_parsing_arbitrary_filter( $kw76$ASSERTINTOMT, $const272$nameString, $const118$EnglishMt ), thread );
    }
    frontload_parsing_constraint( $acquaint_demo_assertion_filter$.getDynamicValue( thread ) );
    frontload_parsing_constraint( $acquaint_demo_lexical_assertion_filter$.getDynamicValue( thread ) );
    return current_parsing_constraint_rankings();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject initialize_acquaint_highly_relevant_rankings()
  {
    Errors.warn( $str273$____DEMO__initializing_rankings_w );
    initialize_constrained_parsing( T, UNPROVIDED );
    acquaint_demo_rank_assertion_mts();
    order_parsing_constraints( $kw26$MINIMALTIMEPARSE, $kw12$AVOIDREDUNDANTFACETS, $kw97$DEMOTE );
    return current_parsing_constraint_rankings();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject initialize_acquaint_sort_of_relevant_rankings()
  {
    Errors.warn( $str274$____DEMO__reverting_to_standard_c );
    initialize_constrained_parsing( T, UNPROVIDED );
    acquaint_demo_rank_assertion_mts();
    return current_parsing_constraint_rankings();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject highly_relevant_acquaint_answerP(final SubLObject v_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numGE( methods.funcall_instance_method_with_0_args( v_answer, $sym275$GET_RELEVANCE ), $acquaint_highly_relevant_cutoff$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_demo_who_is(final SubLObject name, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != string_utilities.capitalized_string_p( name ) : name;
    final SubLObject questions = ConsesLow.list( PrintLow.format( NIL, $str277$Who_is__A_, name ) );
    initialize_acquaint_highly_relevant_rankings();
    SubLObject cdolist_list_var = questions;
    SubLObject q = NIL;
    q = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject this_query = question.new_question( q, UNPROVIDED, UNPROVIDED );
      SubLObject re_initializedP = NIL;
      assert NIL != definitional_question.definitional_question_p( this_query ) : this_query;
      SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args( this_query, $sym281$ANSWER );
      SubLObject this_answer = NIL;
      this_answer = cdolist_list_var_$13.first();
      while ( NIL != cdolist_list_var_$13)
      {
        if( NIL == re_initializedP && NIL == highly_relevant_acquaint_answerP( this_answer ) )
        {
          re_initializedP = initialize_acquaint_sort_of_relevant_rankings();
        }
        Errors.warn( $str279$____processing__A, this_answer );
        final SubLObject _prev_bind_0 = $constrained_parsing_tracking_stringsP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = $constrained_parsing_show_inference_metricsP$.currentBinding( thread );
        try
        {
          $constrained_parsing_tracking_stringsP$.bind( T, thread );
          $constrained_parsing_show_inference_metricsP$.bind( T, thread );
          constrained_parse_of_strings_for_term( v_term, ConsesLow.list( methods.funcall_instance_method_with_0_args( this_answer, $sym280$GET_CONTENT ) ) );
        }
        finally
        {
          $constrained_parsing_show_inference_metricsP$.rebind( _prev_bind_2, thread );
          $constrained_parsing_tracking_stringsP$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
        this_answer = cdolist_list_var_$13.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      q = cdolist_list_var.first();
    }
    cdolist_list_var = constrained_parsing_get_actions();
    SubLObject this_action = NIL;
    this_action = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str282$_S__, this_action );
      cdolist_list_var = cdolist_list_var.rest();
      this_action = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_demo_verify_isas(final SubLObject v_term, final SubLObject isas)
  {
    SubLObject successP = T;
    SubLObject cdolist_list_var = isas;
    SubLObject should_be = NIL;
    should_be = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == isa.isa_in_any_mtP( v_term, narts_high.nart_substitute( should_be ) ) )
      {
        Errors.warn( $str283$____DEMO_____isa__A__A__wasn_t_fo, v_term, should_be );
        successP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      should_be = cdolist_list_var.first();
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_blair_demo()
  {
    acquaint_demo_who_is( $str284$Tony_Blair, $const285$TonyBlair );
    if( NIL == list_utilities.lengthE( constrained_parsing_query( $sym286$_WHERE, $list287, $const271$BBN_CDE_StrengthenedMt, UNPROVIDED ), TWO_INTEGER, UNPROVIDED ) )
    {
      Errors.warn( $str288$____DEMO_____primeMinister_WHATEV );
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( $const285$TonyBlair, $const289$Warrior ) )
    {
      Errors.warn( $str290$____DEMO____TonyBlair_was_mistake );
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_hussein_demo()
  {
    acquaint_demo_who_is( $str291$Saddam_Hussein, $const292$SaddamHusseinAl_Takriti );
    return acquaint_demo_verify_isas( $const292$SaddamHusseinAl_Takriti, ConsesLow.list( $const293$Vicious, ConsesLow.list( $const294$PresidentFn, $const295$Iraq ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_clinton_demo()
  {
    acquaint_demo_who_is( $str296$Bill_Clinton, $const297$BillClinton );
    return acquaint_demo_verify_isas( $const297$BillClinton, ConsesLow.list( ConsesLow.list( $const294$PresidentFn, $const298$UnitedStatesOfAmerica ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-parsing.lisp", position = 82204L)
  public static SubLObject acquaint_osama_demo()
  {
    acquaint_demo_who_is( $str299$Osama, $const300$OsamaBinLaden );
    SubLObject successP = T;
    SubLObject cdolist_list_var = ConsesLow.list( ConsesLow.list( $const294$PresidentFn, $const298$UnitedStatesOfAmerica ) );
    SubLObject should_be = NIL;
    should_be = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == isa.isa_in_any_mtP( $const292$SaddamHusseinAl_Takriti, narts_high.nart_substitute( should_be ) ) )
      {
        Errors.warn( $str301$____DEMO_____isa___SaddamHusseinA, should_be );
        successP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      should_be = cdolist_list_var.first();
    }
    return successP;
  }

  public static SubLObject declare_constrained_parsing_file()
  {
    SubLFiles.declareFunction( me, "list_of_not_disjoint_collections_p", "LIST-OF-NOT-DISJOINT-COLLECTIONS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subcollection_naut_p", "SUBCOLLECTION-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "list_elements_preceding", "LIST-ELEMENTS-PRECEDING", 2, 1, false );
    SubLFiles.declareFunction( me, "rotate_list_around_pivot", "ROTATE-LIST-AROUND-PIVOT", 2, 1, false );
    SubLFiles.declareFunction( me, "current_parsing_constraint_rankings", "CURRENT-PARSING-CONSTRAINT-RANKINGS", 0, 0, false );
    SubLFiles.declareMacro( me, "without_asserting_gafs", "WITHOUT-ASSERTING-GAFS" );
    SubLFiles.declareFunction( me, "constrained_parsing_assert_gafsP", "CONSTRAINED-PARSING-ASSERT-GAFS?", 0, 0, false );
    SubLFiles.declareMacro( me, "while_tracking_strings", "WHILE-TRACKING-STRINGS" );
    SubLFiles.declareFunction( me, "constrained_parsing_tracking_stringsP", "CONSTRAINED-PARSING-TRACKING-STRINGS?", 0, 0, false );
    SubLFiles.declareMacro( me, "while_tracking_substrings", "WHILE-TRACKING-SUBSTRINGS" );
    SubLFiles.declareFunction( me, "constrained_parsing_tracking_substringsP", "CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?", 0, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_choose_string_sources", "CONSTRAINED-PARSING-CHOOSE-STRING-SOURCES", 2, 0, false );
    SubLFiles.declareMacro( me, "constrained_parsing_warn", "CONSTRAINED-PARSING-WARN" );
    SubLFiles.declareFunction( me, "constrained_parsing_get_actions", "CONSTRAINED-PARSING-GET-ACTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_clear_actions", "CONSTRAINED-PARSING-CLEAR-ACTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_record_action", "CONSTRAINED-PARSING-RECORD-ACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_new_isa_permissiveness_principles", "GET-NEW-ISA-PERMISSIVENESS-PRINCIPLES", 0, 0, false );
    SubLFiles.declareFunction( me, "new_isa_permissiveness_principle_p", "NEW-ISA-PERMISSIVENESS-PRINCIPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parsing_flow_control_principles", "GET-PARSING-FLOW-CONTROL-PRINCIPLES", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_flow_control_principle_p", "PARSING-FLOW-CONTROL-PRINCIPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_faithfulness_filter_print_function_trampoline", "PARSING-FAITHFULNESS-FILTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "parsing_faithfulness_filter_p", "PARSING-FAITHFULNESS-FILTER-P", 1, 0, false );
    new $parsing_faithfulness_filter_p$UnaryFunction();
    SubLFiles.declareFunction( me, "parsing_faithfulness_filter_type", "PARSING-FAITHFULNESS-FILTER-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_faithfulness_filter_mt", "PARSING-FAITHFULNESS-FILTER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_parsing_faithfulness_filter_type", "_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_parsing_faithfulness_filter_mt", "_CSETF-PARSING-FAITHFULNESS-FILTER-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_parsing_faithfulness_filter", "MAKE-PARSING-FAITHFULNESS-FILTER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_parsing_faithfulness_filter", "VISIT-DEFSTRUCT-PARSING-FAITHFULNESS-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_parsing_faithfulness_filter_method", "VISIT-DEFSTRUCT-OBJECT-PARSING-FAITHFULNESS-FILTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_faithfulness_filter", "PPRINT-FAITHFULNESS-FILTER", 1, 2, false );
    SubLFiles.declareFunction( me, "get_parsing_faithfulness_filter_types", "GET-PARSING-FAITHFULNESS-FILTER-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_faithfulness_filter_type_p", "PARSING-FAITHFULNESS-FILTER-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parsing_faithfulness_filters", "GET-PARSING-FAITHFULNESS-FILTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_parsing_faithfulness_filter", "NEW-PARSING-FAITHFULNESS-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "parsing_arbitrary_filter_print_function_trampoline", "PARSING-ARBITRARY-FILTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "parsing_arbitrary_filter_p", "PARSING-ARBITRARY-FILTER-P", 1, 0, false );
    new $parsing_arbitrary_filter_p$UnaryFunction();
    SubLFiles.declareFunction( me, "parsing_arbitrary_filter_type", "PARSING-ARBITRARY-FILTER-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_arbitrary_filter_details", "PARSING-ARBITRARY-FILTER-DETAILS", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_arbitrary_filter_mt", "PARSING-ARBITRARY-FILTER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_parsing_arbitrary_filter_type", "_CSETF-PARSING-ARBITRARY-FILTER-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_parsing_arbitrary_filter_details", "_CSETF-PARSING-ARBITRARY-FILTER-DETAILS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_parsing_arbitrary_filter_mt", "_CSETF-PARSING-ARBITRARY-FILTER-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_parsing_arbitrary_filter", "MAKE-PARSING-ARBITRARY-FILTER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_parsing_arbitrary_filter", "VISIT-DEFSTRUCT-PARSING-ARBITRARY-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_parsing_arbitrary_filter_method", "VISIT-DEFSTRUCT-OBJECT-PARSING-ARBITRARY-FILTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_arbitrary_filter", "PPRINT-ARBITRARY-FILTER", 1, 2, false );
    SubLFiles.declareFunction( me, "get_parsing_arbitrary_filter_types", "GET-PARSING-ARBITRARY-FILTER-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_arbitrary_filter_type_p", "PARSING-ARBITRARY-FILTER-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parsing_arbitrary_filters", "GET-PARSING-ARBITRARY-FILTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_parsing_arbitrary_filter", "NEW-PARSING-ARBITRARY-FILTER", 3, 0, false );
    SubLFiles.declareFunction( me, "get_bug_avoidance_principles", "GET-BUG-AVOIDANCE-PRINCIPLES", 0, 0, false );
    SubLFiles.declareFunction( me, "bug_avoidance_principle_p", "BUG-AVOIDANCE-PRINCIPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_principle_p", "PARSING-PRINCIPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_filter_p", "PARSING-FILTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parsing_filter_type_p", "PARSING-FILTER-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_parsing_principles", "GET-ALL-PARSING-PRINCIPLES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_parsing_filter_types", "GET-ALL-PARSING-FILTER-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_parsing_filters", "GET-ALL-PARSING-FILTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_parsing_constraints", "GET-ALL-PARSING-CONSTRAINTS", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_constraint_p", "PARSING-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_constrained_parsing_constraints", "DO-CONSTRAINED-PARSING-CONSTRAINTS" );
    SubLFiles.declareMacro( me, "do_constrained_parsing_principles", "DO-CONSTRAINED-PARSING-PRINCIPLES" );
    SubLFiles.declareMacro( me, "do_constrained_parsing_filters", "DO-CONSTRAINED-PARSING-FILTERS" );
    SubLFiles.declareFunction( me, "initialize_constrained_parsing", "INITIALIZE-CONSTRAINED-PARSING", 0, 2, false );
    SubLFiles.declareFunction( me, "parsing_constraint_outranksP", "PARSING-CONSTRAINT-OUTRANKS?", 2, 0, false );
    SubLFiles.declareFunction( me, "which_constraints_outrank", "WHICH-CONSTRAINTS-OUTRANK", 1, 0, false );
    SubLFiles.declareFunction( me, "order_parsing_constraints", "ORDER-PARSING-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "frontload_parsing_constraint", "FRONTLOAD-PARSING-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_query_defaults", "CONSTRAINED-PARSING-QUERY-DEFAULTS", 0, 0, false );
    SubLFiles.declareMacro( me, "without_rewrite_backtracking", "WITHOUT-REWRITE-BACKTRACKING" );
    SubLFiles.declareFunction( me, "constrained_parsing_rewrite_backtracking", "CONSTRAINED-PARSING-REWRITE-BACKTRACKING", 1, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_query", "CONSTRAINED-PARSING-QUERY", 2, 2, false );
    SubLFiles.declareFunction( me, "constrained_parsing_query_lexical", "CONSTRAINED-PARSING-QUERY-LEXICAL", 2, 2, false );
    SubLFiles.declareFunction( me, "constrained_parsing_query_successP", "CONSTRAINED-PARSING-QUERY-SUCCESS?", 1, 2, false );
    SubLFiles.declareFunction( me, "constrained_parse_involves_group_coercionP", "CONSTRAINED-PARSE-INVOLVES-GROUP-COERCION?", 1, 1, false );
    SubLFiles.declareFunction( me, "constrained_parsing_illegal_isa_workaroundP", "CONSTRAINED-PARSING-ILLEGAL-ISA-WORKAROUND?", 1, 1, false );
    SubLFiles.declareFunction( me, "constrained_parsing_gaf_fails_constraintsP_int", "CONSTRAINED-PARSING-GAF-FAILS-CONSTRAINTS?-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "constrained_parsing_gaf_fails_constraintsP", "CONSTRAINED-PARSING-GAF-FAILS-CONSTRAINTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_unassert", "CONSTRAINED-PARSING-UNASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_possibly_assert", "CONSTRAINED-PARSING-POSSIBLY-ASSERT", 2, 1, false );
    SubLFiles.declareMacro( me, "constrained_parsing_assert_through_channels", "CONSTRAINED-PARSING-ASSERT-THROUGH-CHANNELS" );
    SubLFiles.declareFunction( me, "constrained_parsing_coerce_to_group", "CONSTRAINED-PARSING-COERCE-TO-GROUP", 1, 0, false );
    SubLFiles.declareMacro( me, "constrained_parsing_note_isa", "CONSTRAINED-PARSING-NOTE-ISA" );
    SubLFiles.declareFunction( me, "constrained_parse_explode_np_string", "CONSTRAINED-PARSE-EXPLODE-NP-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_strings_for_term", "CONSTRAINED-PARSE-OF-STRINGS-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parsing_get_acceptable_isas", "CONSTRAINED-PARSING-GET-ACCEPTABLE-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_substrings_for_term", "CONSTRAINED-PARSE-OF-SUBSTRINGS-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "constrained_parsing_faceting_violationP", "CONSTRAINED-PARSING-FACETING-VIOLATION?", 3, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_string_for_term", "CONSTRAINED-PARSE-OF-STRING-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_string_for_term_int", "CONSTRAINED-PARSE-OF-STRING-FOR-TERM-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "constrained_parse_extract_cardinality", "CONSTRAINED-PARSE-EXTRACT-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_search_for_rewrites", "CONSTRAINED-PARSE-SEARCH-FOR-REWRITES", 2, 1, false );
    SubLFiles.declareFunction( me, "frontload_genitive_if_any", "FRONTLOAD-GENITIVE-IF-ANY", 1, 0, false );
    SubLFiles.declareFunction( me, "eliminate_redundant_narts", "ELIMINATE-REDUNDANT-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_nart_isas", "CONSTRAINED-PARSE-OF-NART-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_via_relation_all_instance", "CONSTRAINED-PARSE-VIA-RELATION-ALL-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_namestring_for_term", "CONSTRAINED-PARSE-OF-NAMESTRING-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_business_suffix", "CONSTRAINED-PARSE-OF-BUSINESS-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_first_and_last_names", "CONSTRAINED-PARSE-OF-FIRST-AND-LAST-NAMES", 2, 0, false );
    SubLFiles.declareFunction( me, "constrained_parse_of_salutation_if_any", "CONSTRAINED-PARSE-OF-SALUTATION-IF-ANY", 2, 0, false );
    SubLFiles.declareFunction( me, "acquaint_demo_rank_assertion_mts", "ACQUAINT-DEMO-RANK-ASSERTION-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_acquaint_highly_relevant_rankings", "INITIALIZE-ACQUAINT-HIGHLY-RELEVANT-RANKINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_acquaint_sort_of_relevant_rankings", "INITIALIZE-ACQUAINT-SORT-OF-RELEVANT-RANKINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "highly_relevant_acquaint_answerP", "HIGHLY-RELEVANT-ACQUAINT-ANSWER?", 1, 0, false );
    SubLFiles.declareFunction( me, "acquaint_demo_who_is", "ACQUAINT-DEMO-WHO-IS", 2, 0, false );
    SubLFiles.declareFunction( me, "acquaint_demo_verify_isas", "ACQUAINT-DEMO-VERIFY-ISAS", 2, 0, false );
    SubLFiles.declareFunction( me, "acquaint_blair_demo", "ACQUAINT-BLAIR-DEMO", 0, 0, false );
    SubLFiles.declareFunction( me, "acquaint_hussein_demo", "ACQUAINT-HUSSEIN-DEMO", 0, 0, false );
    SubLFiles.declareFunction( me, "acquaint_clinton_demo", "ACQUAINT-CLINTON-DEMO", 0, 0, false );
    SubLFiles.declareFunction( me, "acquaint_osama_demo", "ACQUAINT-OSAMA-DEMO", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_constrained_parsing_file()
  {
    $constrained_parsing_rankings$ = SubLFiles.deflexical( "*CONSTRAINED-PARSING-RANKINGS*", ( maybeDefault( $sym1$_CONSTRAINED_PARSING_RANKINGS_, $constrained_parsing_rankings$, NIL ) ) );
    $constrained_parsing_without_assertingP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*", NIL );
    $constrained_parsing_tracking_stringsP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-TRACKING-STRINGS?*", NIL );
    $constrained_parsing_tracking_substringsP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*", NIL );
    $constrained_parsing_trace_level$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-TRACE-LEVEL*", ZERO_INTEGER );
    $constrained_parsing_action_log$ = SubLFiles.deflexical( "*CONSTRAINED-PARSING-ACTION-LOG*", ( maybeDefault( $sym11$_CONSTRAINED_PARSING_ACTION_LOG_, $constrained_parsing_action_log$, NIL ) ) );
    $constrained_parsing_case_sensitiveP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-CASE-SENSITIVE?*", NIL );
    $constrained_parsing_assert_into_mt$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-ASSERT-INTO-MT*", NIL );
    $constrained_parsing_consider_adjectivesP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-CONSIDER-ADJECTIVES?*", NIL );
    $constrained_parsing_cardinality_known$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-CARDINALITY-KNOWN*", NIL );
    $constrained_parsing_allow_group_coercionP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-ALLOW-GROUP-COERCION?*", T );
    $new_isa_permissiveness_principles$ = SubLFiles.defparameter( "*NEW-ISA-PERMISSIVENESS-PRINCIPLES*", ConsesLow.list( $kw12$AVOIDREDUNDANTFACETS, $kw13$PROHIBITSUBCOLLECTIONFNS, $kw14$PROHIBITAMBIGUOUSGAFS,
        $kw15$PERMISSIVENESSCUTOFF, $kw16$PERMITALLNONDISJOINTISAS, $kw17$PROHIBITGROUPCOERCION ) );
    $parsing_flow_control_principles$ = SubLFiles.defparameter( "*PARSING-FLOW-CONTROL-PRINCIPLES*", ConsesLow.list( new SubLObject[] { $kw18$STRIPCARDINALITY, $kw19$CASESENSITIVELEXICON, $kw20$WIDESCOPEPRECISION,
      $kw21$PERMITADJECTIVEPARSES, $kw22$PERMITNARTISAS, $kw23$RELATIONALLINSTANCEPARSE, $kw24$NARROWSCOPEPRECISION, $kw25$CASEINSENSITIVELEXICON, $kw26$MINIMALTIMEPARSE, $kw27$PERMITRELATIVECLAUSEPARSES,
      $kw28$PERMITPPCOMPPARSES
    } ) );
    $dtp_parsing_faithfulness_filter$ = SubLFiles.defconstant( "*DTP-PARSING-FAITHFULNESS-FILTER*", $sym29$PARSING_FAITHFULNESS_FILTER );
    $parsing_faithfulness_filter_types$ = SubLFiles.defparameter( "*PARSING-FAITHFULNESS-FILTER-TYPES*", ConsesLow.list( $kw51$OBEYISASINMT, $kw52$OBEYGAFSINMT, $kw53$FAITHFULNESSFILTERCUTOFF ) );
    $default_faithfulness_filter$ = SubLFiles.defparameter( "*DEFAULT-FAITHFULNESS-FILTER*", NIL );
    $default_definitional_faithfulness_filter$ = SubLFiles.defparameter( "*DEFAULT-DEFINITIONAL-FAITHFULNESS-FILTER*", NIL );
    $dtp_parsing_arbitrary_filter$ = SubLFiles.defconstant( "*DTP-PARSING-ARBITRARY-FILTER*", $sym56$PARSING_ARBITRARY_FILTER );
    $parsing_arbitrary_filter_types$ = SubLFiles.defparameter( "*PARSING-ARBITRARY-FILTER-TYPES*", ConsesLow.list( $kw75$NOISASARESPECS, $kw76$ASSERTINTOMT, $kw77$ARBITRARYFILTERCUTOFF ) );
    $default_assertion_filter$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-FILTER*", NIL );
    $default_definitional_assertion_filter$ = SubLFiles.defparameter( "*DEFAULT-DEFINITIONAL-ASSERTION-FILTER*", NIL );
    $bug_avoidance_principles$ = SubLFiles.defparameter( "*BUG-AVOIDANCE-PRINCIPLES*", ConsesLow.list( $kw79$COMPENSATEFORISAPROBLEMS, $kw80$BUGAVOIDANCECUTOFF, $kw81$AVOIDREWRITEPARSES, $kw82$AVOIDNAMESTRINGPARSES ) );
    $constrained_parsing_query_max_transformation_depth$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-QUERY-MAX-TRANSFORMATION-DEPTH*", ZERO_INTEGER );
    $constrained_parsing_query_max_time$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-QUERY-MAX-TIME*", $int99$30 );
    $constrained_parsing_query_productivity_limit$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-QUERY-PRODUCTIVITY-LIMIT*", $int100$2000000 );
    $trace_new_cyc_queryP$ = SubLFiles.defparameter( "*TRACE-NEW-CYC-QUERY?*", NIL );
    $debug_new_cyc_queryP$ = SubLFiles.defparameter( "*DEBUG-NEW-CYC-QUERY?*", NIL );
    $constrained_parsing_rewrite_backtrackingP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*", T );
    $with_faithfulness_cutoffP$ = SubLFiles.defparameter( "*WITH-FAITHFULNESS-CUTOFF?*", NIL );
    $skip_definitional_faithfulnessP$ = SubLFiles.defparameter( "*SKIP-DEFINITIONAL-FAITHFULNESS?*", NIL );
    $with_arbitrary_filter_cutoffP$ = SubLFiles.defparameter( "*WITH-ARBITRARY-FILTER-CUTOFF?*", NIL );
    $with_bug_avoidance_cutoffP$ = SubLFiles.defparameter( "*WITH-BUG-AVOIDANCE-CUTOFF?*", NIL );
    $constrained_parsing_show_inference_metricsP$ = SubLFiles.defparameter( "*CONSTRAINED-PARSING-SHOW-INFERENCE-METRICS?*", NIL );
    $acquaint_highly_relevant_cutoff$ = SubLFiles.defparameter( "*ACQUAINT-HIGHLY-RELEVANT-CUTOFF*", TEN_INTEGER );
    $acquaint_demo_assertion_filter$ = SubLFiles.defparameter( "*ACQUAINT-DEMO-ASSERTION-FILTER*", NIL );
    $acquaint_demo_lexical_assertion_filter$ = SubLFiles.defparameter( "*ACQUAINT-DEMO-LEXICAL-ASSERTION-FILTER*", NIL );
    return NIL;
  }

  public static SubLObject setup_constrained_parsing_file()
  {
    subl_macro_promotions.declare_defglobal( $sym1$_CONSTRAINED_PARSING_RANKINGS_ );
    subl_macro_promotions.declare_defglobal( $sym11$_CONSTRAINED_PARSING_ACTION_LOG_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_parsing_faithfulness_filter$.getGlobalValue(), Symbols.symbol_function(
        $sym36$PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list37 );
    Structures.def_csetf( $sym38$PARSING_FAITHFULNESS_FILTER_TYPE, $sym39$_CSETF_PARSING_FAITHFULNESS_FILTER_TYPE );
    Structures.def_csetf( $sym40$PARSING_FAITHFULNESS_FILTER_MT, $sym41$_CSETF_PARSING_FAITHFULNESS_FILTER_MT );
    Equality.identity( $sym29$PARSING_FAITHFULNESS_FILTER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parsing_faithfulness_filter$.getGlobalValue(), Symbols.symbol_function(
        $sym49$VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_parsing_arbitrary_filter$.getGlobalValue(), Symbols.symbol_function(
        $sym63$PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list64 );
    Structures.def_csetf( $sym65$PARSING_ARBITRARY_FILTER_TYPE, $sym66$_CSETF_PARSING_ARBITRARY_FILTER_TYPE );
    Structures.def_csetf( $sym67$PARSING_ARBITRARY_FILTER_DETAILS, $sym68$_CSETF_PARSING_ARBITRARY_FILTER_DETAILS );
    Structures.def_csetf( $sym69$PARSING_ARBITRARY_FILTER_MT, $sym70$_CSETF_PARSING_ARBITRARY_FILTER_MT );
    Equality.identity( $sym56$PARSING_ARBITRARY_FILTER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parsing_arbitrary_filter$.getGlobalValue(), Symbols.symbol_function(
        $sym73$VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constrained_parsing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constrained_parsing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constrained_parsing_file();
  }
  static
  {
    me = new constrained_parsing();
    $constrained_parsing_rankings$ = null;
    $constrained_parsing_without_assertingP$ = null;
    $constrained_parsing_tracking_stringsP$ = null;
    $constrained_parsing_tracking_substringsP$ = null;
    $constrained_parsing_trace_level$ = null;
    $constrained_parsing_action_log$ = null;
    $constrained_parsing_case_sensitiveP$ = null;
    $constrained_parsing_assert_into_mt$ = null;
    $constrained_parsing_consider_adjectivesP$ = null;
    $constrained_parsing_cardinality_known$ = null;
    $constrained_parsing_allow_group_coercionP$ = null;
    $new_isa_permissiveness_principles$ = null;
    $parsing_flow_control_principles$ = null;
    $dtp_parsing_faithfulness_filter$ = null;
    $parsing_faithfulness_filter_types$ = null;
    $default_faithfulness_filter$ = null;
    $default_definitional_faithfulness_filter$ = null;
    $dtp_parsing_arbitrary_filter$ = null;
    $parsing_arbitrary_filter_types$ = null;
    $default_assertion_filter$ = null;
    $default_definitional_assertion_filter$ = null;
    $bug_avoidance_principles$ = null;
    $constrained_parsing_query_max_transformation_depth$ = null;
    $constrained_parsing_query_max_time$ = null;
    $constrained_parsing_query_productivity_limit$ = null;
    $trace_new_cyc_queryP$ = null;
    $debug_new_cyc_queryP$ = null;
    $constrained_parsing_rewrite_backtrackingP$ = null;
    $with_faithfulness_cutoffP$ = null;
    $skip_definitional_faithfulnessP$ = null;
    $with_arbitrary_filter_cutoffP$ = null;
    $with_bug_avoidance_cutoffP$ = null;
    $constrained_parsing_show_inference_metricsP$ = null;
    $acquaint_highly_relevant_cutoff$ = null;
    $acquaint_demo_assertion_filter$ = null;
    $acquaint_demo_lexical_assertion_filter$ = null;
    $const0$SubcollectionDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionDenotingFunction" ) );
    $sym1$_CONSTRAINED_PARSING_RANKINGS_ = makeSymbol( "*CONSTRAINED-PARSING-RANKINGS*" );
    $sym2$CLET = makeSymbol( "CLET" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*" ), T ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTRAINED-PARSING-TRACKING-STRINGS?*" ), T ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*" ), T ) );
    $list6 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym7$PWHEN = makeSymbol( "PWHEN" );
    $sym8$__ = makeSymbol( ">=" );
    $sym9$_CONSTRAINED_PARSING_TRACE_LEVEL_ = makeSymbol( "*CONSTRAINED-PARSING-TRACE-LEVEL*" );
    $sym10$WARN = makeSymbol( "WARN" );
    $sym11$_CONSTRAINED_PARSING_ACTION_LOG_ = makeSymbol( "*CONSTRAINED-PARSING-ACTION-LOG*" );
    $kw12$AVOIDREDUNDANTFACETS = makeKeyword( "AVOIDREDUNDANTFACETS" );
    $kw13$PROHIBITSUBCOLLECTIONFNS = makeKeyword( "PROHIBITSUBCOLLECTIONFNS" );
    $kw14$PROHIBITAMBIGUOUSGAFS = makeKeyword( "PROHIBITAMBIGUOUSGAFS" );
    $kw15$PERMISSIVENESSCUTOFF = makeKeyword( "PERMISSIVENESSCUTOFF" );
    $kw16$PERMITALLNONDISJOINTISAS = makeKeyword( "PERMITALLNONDISJOINTISAS" );
    $kw17$PROHIBITGROUPCOERCION = makeKeyword( "PROHIBITGROUPCOERCION" );
    $kw18$STRIPCARDINALITY = makeKeyword( "STRIPCARDINALITY" );
    $kw19$CASESENSITIVELEXICON = makeKeyword( "CASESENSITIVELEXICON" );
    $kw20$WIDESCOPEPRECISION = makeKeyword( "WIDESCOPEPRECISION" );
    $kw21$PERMITADJECTIVEPARSES = makeKeyword( "PERMITADJECTIVEPARSES" );
    $kw22$PERMITNARTISAS = makeKeyword( "PERMITNARTISAS" );
    $kw23$RELATIONALLINSTANCEPARSE = makeKeyword( "RELATIONALLINSTANCEPARSE" );
    $kw24$NARROWSCOPEPRECISION = makeKeyword( "NARROWSCOPEPRECISION" );
    $kw25$CASEINSENSITIVELEXICON = makeKeyword( "CASEINSENSITIVELEXICON" );
    $kw26$MINIMALTIMEPARSE = makeKeyword( "MINIMALTIMEPARSE" );
    $kw27$PERMITRELATIVECLAUSEPARSES = makeKeyword( "PERMITRELATIVECLAUSEPARSES" );
    $kw28$PERMITPPCOMPPARSES = makeKeyword( "PERMITPPCOMPPARSES" );
    $sym29$PARSING_FAITHFULNESS_FILTER = makeSymbol( "PARSING-FAITHFULNESS-FILTER" );
    $sym30$PARSING_FAITHFULNESS_FILTER_P = makeSymbol( "PARSING-FAITHFULNESS-FILTER-P" );
    $list31 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "MT" ) );
    $list32 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "MT" ) );
    $list33 = ConsesLow.list( makeSymbol( "PARSING-FAITHFULNESS-FILTER-TYPE" ), makeSymbol( "PARSING-FAITHFULNESS-FILTER-MT" ) );
    $list34 = ConsesLow.list( makeSymbol( "_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE" ), makeSymbol( "_CSETF-PARSING-FAITHFULNESS-FILTER-MT" ) );
    $sym35$PPRINT_FAITHFULNESS_FILTER = makeSymbol( "PPRINT-FAITHFULNESS-FILTER" );
    $sym36$PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PARSING-FAITHFULNESS-FILTER-PRINT-FUNCTION-TRAMPOLINE" );
    $list37 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PARSING-FAITHFULNESS-FILTER-P" ) );
    $sym38$PARSING_FAITHFULNESS_FILTER_TYPE = makeSymbol( "PARSING-FAITHFULNESS-FILTER-TYPE" );
    $sym39$_CSETF_PARSING_FAITHFULNESS_FILTER_TYPE = makeSymbol( "_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE" );
    $sym40$PARSING_FAITHFULNESS_FILTER_MT = makeSymbol( "PARSING-FAITHFULNESS-FILTER-MT" );
    $sym41$_CSETF_PARSING_FAITHFULNESS_FILTER_MT = makeSymbol( "_CSETF-PARSING-FAITHFULNESS-FILTER-MT" );
    $kw42$TYPE = makeKeyword( "TYPE" );
    $kw43$MT = makeKeyword( "MT" );
    $str44$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw45$BEGIN = makeKeyword( "BEGIN" );
    $sym46$MAKE_PARSING_FAITHFULNESS_FILTER = makeSymbol( "MAKE-PARSING-FAITHFULNESS-FILTER" );
    $kw47$SLOT = makeKeyword( "SLOT" );
    $kw48$END = makeKeyword( "END" );
    $sym49$VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PARSING-FAITHFULNESS-FILTER-METHOD" );
    $str50$__PARSING_FAITHFULNESS_FILTER__A_ = makeString( "#<PARSING-FAITHFULNESS-FILTER ~A ~A>" );
    $kw51$OBEYISASINMT = makeKeyword( "OBEYISASINMT" );
    $kw52$OBEYGAFSINMT = makeKeyword( "OBEYGAFSINMT" );
    $kw53$FAITHFULNESSFILTERCUTOFF = makeKeyword( "FAITHFULNESSFILTERCUTOFF" );
    $sym54$PARSING_FAITHFULNESS_FILTER_TYPE_P = makeSymbol( "PARSING-FAITHFULNESS-FILTER-TYPE-P" );
    $sym55$MT_IN_ANY_MT_ = makeSymbol( "MT-IN-ANY-MT?" );
    $sym56$PARSING_ARBITRARY_FILTER = makeSymbol( "PARSING-ARBITRARY-FILTER" );
    $sym57$PARSING_ARBITRARY_FILTER_P = makeSymbol( "PARSING-ARBITRARY-FILTER-P" );
    $list58 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "DETAILS" ), makeSymbol( "MT" ) );
    $list59 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "DETAILS" ), makeKeyword( "MT" ) );
    $list60 = ConsesLow.list( makeSymbol( "PARSING-ARBITRARY-FILTER-TYPE" ), makeSymbol( "PARSING-ARBITRARY-FILTER-DETAILS" ), makeSymbol( "PARSING-ARBITRARY-FILTER-MT" ) );
    $list61 = ConsesLow.list( makeSymbol( "_CSETF-PARSING-ARBITRARY-FILTER-TYPE" ), makeSymbol( "_CSETF-PARSING-ARBITRARY-FILTER-DETAILS" ), makeSymbol( "_CSETF-PARSING-ARBITRARY-FILTER-MT" ) );
    $sym62$PPRINT_ARBITRARY_FILTER = makeSymbol( "PPRINT-ARBITRARY-FILTER" );
    $sym63$PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PARSING-ARBITRARY-FILTER-PRINT-FUNCTION-TRAMPOLINE" );
    $list64 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PARSING-ARBITRARY-FILTER-P" ) );
    $sym65$PARSING_ARBITRARY_FILTER_TYPE = makeSymbol( "PARSING-ARBITRARY-FILTER-TYPE" );
    $sym66$_CSETF_PARSING_ARBITRARY_FILTER_TYPE = makeSymbol( "_CSETF-PARSING-ARBITRARY-FILTER-TYPE" );
    $sym67$PARSING_ARBITRARY_FILTER_DETAILS = makeSymbol( "PARSING-ARBITRARY-FILTER-DETAILS" );
    $sym68$_CSETF_PARSING_ARBITRARY_FILTER_DETAILS = makeSymbol( "_CSETF-PARSING-ARBITRARY-FILTER-DETAILS" );
    $sym69$PARSING_ARBITRARY_FILTER_MT = makeSymbol( "PARSING-ARBITRARY-FILTER-MT" );
    $sym70$_CSETF_PARSING_ARBITRARY_FILTER_MT = makeSymbol( "_CSETF-PARSING-ARBITRARY-FILTER-MT" );
    $kw71$DETAILS = makeKeyword( "DETAILS" );
    $sym72$MAKE_PARSING_ARBITRARY_FILTER = makeSymbol( "MAKE-PARSING-ARBITRARY-FILTER" );
    $sym73$VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PARSING-ARBITRARY-FILTER-METHOD" );
    $str74$__PARSING_ARBITRARY_FILTER__A__A_ = makeString( "#<PARSING-ARBITRARY-FILTER ~A ~A ~A>" );
    $kw75$NOISASARESPECS = makeKeyword( "NOISASARESPECS" );
    $kw76$ASSERTINTOMT = makeKeyword( "ASSERTINTOMT" );
    $kw77$ARBITRARYFILTERCUTOFF = makeKeyword( "ARBITRARYFILTERCUTOFF" );
    $sym78$PARSING_ARBITRARY_FILTER_TYPE_P = makeSymbol( "PARSING-ARBITRARY-FILTER-TYPE-P" );
    $kw79$COMPENSATEFORISAPROBLEMS = makeKeyword( "COMPENSATEFORISAPROBLEMS" );
    $kw80$BUGAVOIDANCECUTOFF = makeKeyword( "BUGAVOIDANCECUTOFF" );
    $kw81$AVOIDREWRITEPARSES = makeKeyword( "AVOIDREWRITEPARSES" );
    $kw82$AVOIDNAMESTRINGPARSES = makeKeyword( "AVOIDNAMESTRINGPARSES" );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTRAINT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym84$CDOLIST = makeSymbol( "CDOLIST" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-PARSING-CONSTRAINT-RANKINGS" ) ) );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRINCIPLE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym87$CONSTRAINED_PARSING_PRINCIPLE_P = makeSymbol( "CONSTRAINED-PARSING-PRINCIPLE-P" );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILTER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym89$PARSING_FILTER_P = makeSymbol( "PARSING-FILTER-P" );
    $const90$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const91$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const92$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $const93$GrandLiftPredicate = constant_handles.reader_make_constant_shell( makeString( "GrandLiftPredicate" ) );
    $sym94$PARSING_CONSTRAINT_P = makeSymbol( "PARSING-CONSTRAINT-P" );
    $str95$A_constraint_can_t_outrank_itself = makeString( "A constraint can't outrank itself!" );
    $kw96$PROMOTE = makeKeyword( "PROMOTE" );
    $kw97$DEMOTE = makeKeyword( "DEMOTE" );
    $str98$_A_and_or__A_missing_from_ranking = makeString( "~A and/or ~A missing from rankings:~%~A~%" );
    $int99$30 = makeInteger( 30 );
    $int100$2000000 = makeInteger( 2000000 );
    $kw101$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw102$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw103$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*" ), NIL ) );
    $sym105$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const106$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const107$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $const108$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw109$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw110$RETURN = makeKeyword( "RETURN" );
    $kw111$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw112$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw113$DEFAULT = makeKeyword( "DEFAULT" );
    $kw114$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $kw115$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $str116$_S_in__A_may_have_had_more_answer = makeString( "~S in ~A may have had more answers available" );
    $str117$_S_in__A_exited_abnormally___A = makeString( "~S in ~A exited abnormally: ~A" );
    $const118$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $kw119$BINDINGS = makeKeyword( "BINDINGS" );
    $const120$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym121$_RELN = makeSymbol( "?RELN" );
    $const122$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const123$argN = constant_handles.reader_make_constant_shell( makeString( "argN" ) );
    $list124 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol( "?RELN" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) );
    $const125$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list126 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Group" ) ) );
    $const127$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $const128$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list129 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ) );
    $sym130$_KNOWN_TO_BE = makeSymbol( "?KNOWN-TO-BE" );
    $const131$operatorFormulas = constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) );
    $const132$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell( makeString( "GroupOfCardinalityFn" ) );
    $list133 = ConsesLow.list( makeSymbol( "?KNOWN-TO-BE" ) );
    $list134 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), constant_handles.reader_make_constant_shell( makeString( "GroupOfCardinalityFn" ) ), makeSymbol(
        "?KNOWN-TO-BE" ) );
    $list135 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeSymbol( "?COL1" ), ONE_INTEGER, makeSymbol( "?KNOWN-TO-BE" ) );
    $sym136$_COL2 = makeSymbol( "?COL2" );
    $list137 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?COL1" ), makeSymbol( "?COL2" ) ) );
    $sym138$_Y = makeSymbol( "?Y" );
    $sym139$_X = makeSymbol( "?X" );
    $list140 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol(
        "?Y" ), makeSymbol( "?X" ) ) ) );
    $kw141$NEEDED = makeKeyword( "NEEDED" );
    $str142$____investigating__A_faithfulness = makeString( "*** investigating ~A faithfulness cutoff? ~A arbitrary filter cutoff? ~A~%" );
    $kw143$ARBITRARYFILTERCUTFF = makeKeyword( "ARBITRARYFILTERCUTFF" );
    $str144$_____S_will_be_asserted_into__A__ = makeString( "*** ~S will be asserted into ~A, if at all~%" );
    $sym145$_COL = makeSymbol( "?COL" );
    $sym146$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym147$UNASSERT = makeSymbol( "UNASSERT" );
    $sym148$HLMT_P = makeSymbol( "HLMT-P" );
    $list149 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "THE-TERM" ), makeSymbol( "ARG2" ) );
    $const150$Group = constant_handles.reader_make_constant_shell( makeString( "Group" ) );
    $const151$GroupFn = constant_handles.reader_make_constant_shell( makeString( "GroupFn" ) );
    $list152 = ConsesLow.list( makeSymbol( "THIS-ISA" ), makeSymbol( "THIS-MT" ) );
    $const153$hypothesizedIsaCoercedInto = constant_handles.reader_make_constant_shell( makeString( "hypothesizedIsaCoercedInto" ) );
    $list154 = ConsesLow.list( makeSymbol( "?COL" ), makeSymbol( "?ANYWHERE" ) );
    $const155$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $sym156$_ANYWHERE = makeSymbol( "?ANYWHERE" );
    $list157 = ConsesLow.list( makeSymbol( "?COL" ) );
    $const158$sourceOfTerm = constant_handles.reader_make_constant_shell( makeString( "sourceOfTerm" ) );
    $kw159$MONOTONIC = makeKeyword( "MONOTONIC" );
    $sym160$FI_ASSERT_INT = makeSymbol( "FI-ASSERT-INT" );
    $list161 = ConsesLow.list( makeSymbol( "GAF" ), makeSymbol( "VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MT" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "SOURCE" ), NIL ), ConsesLow
        .list( makeSymbol( "RECORD-FILTER" ), NIL ), ConsesLow.list( makeSymbol( "RECORD-NULL" ), NIL ) );
    $list162 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "SOURCE" ), makeKeyword( "RECORD-FILTER" ), makeKeyword( "RECORD-NULL" ) );
    $kw163$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw164$SOURCE = makeKeyword( "SOURCE" );
    $kw165$RECORD_FILTER = makeKeyword( "RECORD-FILTER" );
    $kw166$RECORD_NULL = makeKeyword( "RECORD-NULL" );
    $sym167$CHANNEL_SAYS = makeUninternedSymbol( "CHANNEL-SAYS" );
    $sym168$CONSTRAINED_PARSING_POSSIBLY_ASSERT = makeSymbol( "CONSTRAINED-PARSING-POSSIBLY-ASSERT" );
    $sym169$CAND = makeSymbol( "CAND" );
    $sym170$CNOT = makeSymbol( "CNOT" );
    $sym171$CSETQ = makeSymbol( "CSETQ" );
    $list172 = ConsesLow.list( makeKeyword( "WORK-DONE" ) );
    $sym173$COR = makeSymbol( "COR" );
    $const174$PositiveIntegerExtent = constant_handles.reader_make_constant_shell( makeString( "PositiveIntegerExtent" ) );
    $list175 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COL" ), makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "SOURCE" ) );
    $list176 = ConsesLow.list( makeKeyword( "SOURCE" ) );
    $sym177$GROUP_COL = makeUninternedSymbol( "GROUP-COL" );
    $sym178$CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS = makeSymbol( "CONSTRAINED-PARSING-ASSERT-THROUGH-CHANNELS" );
    $sym179$LIST = makeSymbol( "LIST" );
    $str180$of = makeString( "of" );
    $sym181$_WU = makeSymbol( "?WU" );
    $const182$prepositionStrings = constant_handles.reader_make_constant_shell( makeString( "prepositionStrings" ) );
    $const183$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $sym184$_POS = makeSymbol( "?POS" );
    $list185 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol(
        "?POS" ), constant_handles.reader_make_constant_shell( makeString( "Complementizer" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?POS" ),
            constant_handles.reader_make_constant_shell( makeString( "WHPronoun" ) ) ) ) );
    $sym186$FORT_P = makeSymbol( "FORT-P" );
    $sym187$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym188$STRINGP = makeSymbol( "STRINGP" );
    $sym189$SUBCOLLECTION_NAUT_P = makeSymbol( "SUBCOLLECTION-NAUT-P" );
    $str190$____rejected_potential_parse_of__ = makeString( "*** rejected potential parse of ~A for ~A" );
    $const191$nounStrings = constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) );
    $kw192$NADA = makeKeyword( "NADA" );
    $const193$termPhrases = constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) );
    $list194 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?COL" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) );
    $str195$____remaining_parses_are__A_w_car = makeString( "*** remaining parses are ~A w/cardinality ~A~%" );
    $kw196$WORK_DONE = makeKeyword( "WORK-DONE" );
    $sym197$_COL_TYPE = makeSymbol( "?COL-TYPE" );
    $sym198$_FACETING_COL = makeSymbol( "?FACETING-COL" );
    $sym199$_SOMEWHERE = makeSymbol( "?SOMEWHERE" );
    $sym200$_TERM_COL = makeSymbol( "?TERM-COL" );
    $list201 = ConsesLow.list( makeSymbol( "?COL-TYPE" ) );
    $list202 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?COL-TYPE" ), makeSymbol( "?FACETING-COL" ) );
    $list203 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?FACETING-COL" ), constant_handles.reader_make_constant_shell( makeString( "FacetingCollectionType" ) ) );
    $list204 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?COL" ), makeSymbol( "?TERM-COL" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?TERM-COL" ), makeSymbol( "?FACETING-COL" ) ) );
    $list205 = ConsesLow.list( makeSymbol( "CARDINALITY" ), makeSymbol( "STRINGS" ) );
    $kw206$ERROR = makeKeyword( "ERROR" );
    $const207$adjStrings = constant_handles.reader_make_constant_shell( makeString( "adjStrings" ) );
    $kw208$ON = makeKeyword( "ON" );
    $kw209$OFF = makeKeyword( "OFF" );
    $str210$_ = makeString( "," );
    $sym211$_DENOT = makeSymbol( "?DENOT" );
    $const212$Determiner = constant_handles.reader_make_constant_shell( makeString( "Determiner" ) );
    $const213$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $list214 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?DENOT" ), constant_handles.reader_make_constant_shell( makeString(
        "PositiveInteger" ) ) ) );
    $list215 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?DENOT" ), constant_handles.reader_make_constant_shell( makeString(
        "PositiveIntegerExtent" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
            "?DENOT" ), constant_handles.reader_make_constant_shell( makeString( "PositiveInteger" ) ) ) ) );
    $list216 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PositiveIntegerExtent" ) ) );
    $list217 = ConsesLow.list( makeSymbol( "?STRING" ) );
    $list218 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeSymbol( "?DENOT" ), makeSymbol( "?STRING" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?DENOT" ), constant_handles.reader_make_constant_shell( makeString( "PositiveInteger" ) ) ) );
    $const219$preferredNameString = constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) );
    $str220$____found__at_least___A_and__A_as = makeString( "*** found (at least) ~A and ~A as rewrite possibilities for ~A" );
    $str221$____setting_rewrite_option_to__S = makeString( "*** setting rewrite option to ~S" );
    $sym222$_WHO = makeSymbol( "?WHO" );
    $const223$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $list224 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol(
        "?CORE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), makeSymbol( "?CORE" ), makeSymbol( "?WHO" ) ) ) );
    $const225$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $list226 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?WHO" ),
        makeSymbol( "?COL" ) ) ) );
    $sym227$LISTP = makeSymbol( "LISTP" );
    $kw228$IGNORE = makeKeyword( "IGNORE" );
    $const229$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const230$subFields = constant_handles.reader_make_constant_shell( makeString( "subFields" ) );
    $const231$admittedArgument = constant_handles.reader_make_constant_shell( makeString( "admittedArgument" ) );
    $const232$wordStrings = constant_handles.reader_make_constant_shell( makeString( "wordStrings" ) );
    $list233 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ), makeSymbol( "?WU" ), makeSymbol( "??POS" ), makeSymbol( "??WS" ), makeSymbol( "?DENOT" ) );
    $sym234$_FUNC = makeSymbol( "?FUNC" );
    $list235 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?FUNC" ), constant_handles.reader_make_constant_shell( makeString(
        "ReifiableFunction" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?FUNC" ), constant_handles.reader_make_constant_shell( makeString(
            "UnaryFunction" ) ) ) );
    $const236$RelationParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "RelationParaphraseMt" ) );
    $list237 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionDenotingFunction" ) ) );
    $list238 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "COL1" ), makeSymbol( "COL2" ) );
    $const239$relationExistsInstance = constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) );
    $const240$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $list241 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ), makeSymbol( "?WU" ), makeSymbol( "?POS" ), makeSymbol( "?WS" ), makeSymbol( "?DENOT" ) );
    $list242 = ConsesLow.list( makeSymbol( "?PRED" ), makeSymbol( "?COL1" ), makeSymbol( "?COL2" ) );
    $sym243$_PRED = makeSymbol( "?PRED" );
    $list244 = ConsesLow.list( TWO_INTEGER, makeSymbol( "?PRED" ) );
    $list245 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) ), makeSymbol( "?SOMEWHERE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "arg1Isa" ) ), makeSymbol( "?PRED" ), makeSymbol( "?COL1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) ), makeSymbol( "?ANYWHERE" ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), makeSymbol( "?PRED" ), makeSymbol( "?COL2" ) ) ) );
    $const246$Person = constant_handles.reader_make_constant_shell( makeString( "Person" ) );
    $const247$Organization = constant_handles.reader_make_constant_shell( makeString( "Organization" ) );
    $const248$GeopoliticalEntity = constant_handles.reader_make_constant_shell( makeString( "GeopoliticalEntity" ) );
    $list249 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Business" ) ) );
    $list250 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) );
    $const251$substring = constant_handles.reader_make_constant_shell( makeString( "substring" ) );
    $str252$___Co = makeString( " & Co" );
    $str253$_Company = makeString( " Company" );
    $str254$_Plc = makeString( " Plc" );
    $str255$_Ltd = makeString( " Ltd" );
    $const256$Business = constant_handles.reader_make_constant_shell( makeString( "Business" ) );
    $str257$_ = makeString( " " );
    $list258 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HomoSapiens" ) ) );
    $sym259$_CONSTANT = makeSymbol( "?CONSTANT" );
    $list260 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?CONSTANT" ), constant_handles.reader_make_constant_shell( makeString( "HumanGivenName" ) ) );
    $const261$nameSpelling = constant_handles.reader_make_constant_shell( makeString( "nameSpelling" ) );
    $const262$givenNames = constant_handles.reader_make_constant_shell( makeString( "givenNames" ) );
    $list263 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?CONSTANT" ), constant_handles.reader_make_constant_shell( makeString( "HumanSurname" ) ) );
    $const264$familyName = constant_handles.reader_make_constant_shell( makeString( "familyName" ) );
    $sym265$_SALUT = makeSymbol( "?SALUT" );
    $const266$codeMapping = constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) );
    $const267$SalutationMapping = constant_handles.reader_make_constant_shell( makeString( "SalutationMapping" ) );
    $list268 = ConsesLow.list( makeSymbol( "?SALUT" ) );
    $const269$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const270$salutation = constant_handles.reader_make_constant_shell( makeString( "salutation" ) );
    $const271$BBN_CDE_StrengthenedMt = constant_handles.reader_make_constant_shell( makeString( "BBN-CDE-StrengthenedMt" ) );
    $const272$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $str273$____DEMO__initializing_rankings_w = makeString( "*** DEMO: initializing rankings with :AvoidRedundantFacets suppressed" );
    $str274$____DEMO__reverting_to_standard_c = makeString( "*** DEMO: reverting to standard constraint rankings (and our mt preferences)" );
    $sym275$GET_RELEVANCE = makeSymbol( "GET-RELEVANCE" );
    $sym276$CAPITALIZED_STRING_P = makeSymbol( "CAPITALIZED-STRING-P" );
    $str277$Who_is__A_ = makeString( "Who is ~A?" );
    $sym278$DEFINITIONAL_QUESTION_P = makeSymbol( "DEFINITIONAL-QUESTION-P" );
    $str279$____processing__A = makeString( "*** processing ~A" );
    $sym280$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym281$ANSWER = makeSymbol( "ANSWER" );
    $str282$_S__ = makeString( "~S~%" );
    $str283$____DEMO_____isa__A__A__wasn_t_fo = makeString( "*** DEMO: (#$isa ~A ~A) wasn't found" );
    $str284$Tony_Blair = makeString( "Tony Blair" );
    $const285$TonyBlair = constant_handles.reader_make_constant_shell( makeString( "TonyBlair" ) );
    $sym286$_WHERE = makeSymbol( "?WHERE" );
    $list287 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "primeMinister" ) ), makeSymbol( "?WHERE" ), constant_handles.reader_make_constant_shell( makeString( "TonyBlair" ) ) );
    $str288$____DEMO_____primeMinister_WHATEV = makeString( "*** DEMO: (#$primeMinister WHATEVER #$TonyBlair) apparently wasn't added" );
    $const289$Warrior = constant_handles.reader_make_constant_shell( makeString( "Warrior" ) );
    $str290$____DEMO____TonyBlair_was_mistake = makeString( "*** DEMO: #$TonyBlair was mistakenly asserted to be a #$Warrior" );
    $str291$Saddam_Hussein = makeString( "Saddam Hussein" );
    $const292$SaddamHusseinAl_Takriti = constant_handles.reader_make_constant_shell( makeString( "SaddamHusseinAl-Takriti" ) );
    $const293$Vicious = constant_handles.reader_make_constant_shell( makeString( "Vicious" ) );
    $const294$PresidentFn = constant_handles.reader_make_constant_shell( makeString( "PresidentFn" ) );
    $const295$Iraq = constant_handles.reader_make_constant_shell( makeString( "Iraq" ) );
    $str296$Bill_Clinton = makeString( "Bill Clinton" );
    $const297$BillClinton = constant_handles.reader_make_constant_shell( makeString( "BillClinton" ) );
    $const298$UnitedStatesOfAmerica = constant_handles.reader_make_constant_shell( makeString( "UnitedStatesOfAmerica" ) );
    $str299$Osama = makeString( "Osama" );
    $const300$OsamaBinLaden = constant_handles.reader_make_constant_shell( makeString( "OsamaBinLaden" ) );
    $str301$____DEMO_____isa___SaddamHusseinA = makeString( "*** DEMO: (#$isa #$SaddamHusseinAl-Takriti ~A) is missing!" );
  }

  public static final class $parsing_faithfulness_filter_native
      extends
        SubLStructNative
  {
    public SubLObject $type;
    public SubLObject $mt;
    private static final SubLStructDeclNative structDecl;

    public $parsing_faithfulness_filter_native()
    {
      this.$type = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $parsing_faithfulness_filter_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $parsing_faithfulness_filter_native.class, $sym29$PARSING_FAITHFULNESS_FILTER, $sym30$PARSING_FAITHFULNESS_FILTER_P, $list31, $list32, new String[] { "$type", "$mt"
      }, $list33, $list34, $sym35$PPRINT_FAITHFULNESS_FILTER );
    }
  }

  public static final class $parsing_faithfulness_filter_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $parsing_faithfulness_filter_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PARSING-FAITHFULNESS-FILTER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return parsing_faithfulness_filter_p( arg1 );
    }
  }

  public static final class $parsing_arbitrary_filter_native
      extends
        SubLStructNative
  {
    public SubLObject $type;
    public SubLObject $details;
    public SubLObject $mt;
    private static final SubLStructDeclNative structDecl;

    public $parsing_arbitrary_filter_native()
    {
      this.$type = CommonSymbols.NIL;
      this.$details = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $parsing_arbitrary_filter_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$details;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$details = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $parsing_arbitrary_filter_native.class, $sym56$PARSING_ARBITRARY_FILTER, $sym57$PARSING_ARBITRARY_FILTER_P, $list58, $list59, new String[] { "$type", "$details", "$mt"
      }, $list60, $list61, $sym62$PPRINT_ARBITRARY_FILTER );
    }
  }

  public static final class $parsing_arbitrary_filter_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $parsing_arbitrary_filter_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PARSING-ARBITRARY-FILTER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return parsing_arbitrary_filter_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1001 ms synthetic
 */