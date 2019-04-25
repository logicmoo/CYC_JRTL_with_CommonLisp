package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wff_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wff_modules";
    public static final String myFingerPrint = "24ffc7942833fa370d0e6462099d03933eafcf347a8b95a0149a5f42ba0dc5f4";
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 569L)
    private static SubLSymbol $use_experimental_wff_suggestionsP$;
    private static final SubLSymbol $kw0$INVALID_VARIABLES;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$NL;
    private static final SubLString $str4$Sentence__s_contains_invalid_vari;
    private static final SubLSymbol $sym5$STR;
    private static final SubLString $str6$__;
    private static final SubLString $str7$__and_;
    private static final SubLSymbol $kw8$HL;
    private static final SubLObject $const9$not;
    private static final SubLObject $const10$quotedIsa;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$IO_MODE;
    private static final SubLSymbol $kw13$INVALID_SENTENCE;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLString $str16$_s_is_not_a_well_formed_sentence_;
    private static final SubLString $str17$Perhaps__s_is_insufficiently_defi;
    private static final SubLString $str18$;
    private static final SubLString $str19$_s_is_not_a_well_formed_sentence_;
    private static final SubLString $str20$Perhaps__s_is_insufficiently_defi;
    private static final SubLObject $const21$ist;
    private static final SubLObject $const22$admittedSentence;
    private static final SubLObject $const23$SubLQuoteFn;
    private static final SubLSymbol $kw24$NOT_AN_ASCII_STRING;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLString $str27$String__s_contains_non_ASCII_char;
    private static final SubLSymbol $kw28$MAL_FORTS;
    private static final SubLList $list29;
    private static final SubLString $str30$References_invalid_forts___a___;
    private static final SubLSymbol $kw31$MAL_FORT;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLString $str34$FORT__s_is_invalid___;
    private static final SubLSymbol $kw35$MAL_ARITY;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLString $str38$The__s_of__s_should_be_a___NonNeg;
    private static final SubLObject $const39$arg2Isa;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$ARITY_MISMATCH;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLString $str44$Arity_mismatch_in__A___A_is_a_n__;
    private static final SubLSymbol $kw45$VIOLATED_ARITY;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLString $str48$The__s_of__s_is__s___;
    private static final SubLObject $const49$arityMin;
    private static final SubLObject $const50$greaterThanOrEqualTo;
    private static final SubLObject $const51$FormulaArityFn;
    private static final SubLObject $const52$Quote;
    private static final SubLObject $const53$arityMax;
    private static final SubLObject $const54$evaluate;
    private static final SubLSymbol $kw55$MISSING_ARITY;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLString $str58$The_arity_of__s_is_unknown___;
    private static final SubLSymbol $kw59$MALFORMED_ARGS;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLString $str62$The__A__A_got_the_malformed_argum;
    private static final SubLSymbol $kw63$NOT_A_DENOTATIONAL_TERM;
    private static final SubLList $list64;
    private static final SubLString $str65$_A_is_not_a_denotational_term___;
    private static final SubLSymbol $kw66$NOT_A_TRUTH_FUNCTION;
    private static final SubLList $list67;
    private static final SubLString $str68$Did_not_recognize__A_as_a_truth_f;
    private static final SubLSymbol $kw69$NOT_AN_EL_FORMULA;
    private static final SubLList $list70;
    private static final SubLString $str71$_A_is_not_an_EL_formula__and_is_n;
    private static final SubLSymbol $kw72$NOT_AN_EL_VARIABLE;
    private static final SubLList $list73;
    private static final SubLString $str74$_A_is_not_an_EL_variable___;
    private static final SubLSymbol $kw75$NOT_A_LIST_OF_VARIABLES;
    private static final SubLList $list76;
    private static final SubLString $str77$_A_is_not_a_list_of_EL_variables_;
    private static final SubLSymbol $kw78$SEQUENCE_NON_VAR;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLString $str81$_A_contains_ill_formed_sequence_v;
    private static final SubLSymbol $kw82$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLString $str85$Sentence__s___has___ExpandSubLFn_;
    private static final SubLObject $const86$trueSubL;
    private static final SubLSymbol $sym87$TREE_FIND;
    private static final SubLSymbol $kw88$INVALID_MT;
    private static final SubLList $list89;
    private static final SubLString $str90$Mt__s_is_invalid___;
    private static final SubLSymbol $kw91$MAL_FN_NESTING;
    private static final SubLList $list92;
    private static final SubLString $str93$Term__s_______has__s_nesting_leve;
    private static final SubLSymbol $kw94$MAL_ARG_WRT_IFF_DEFN;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLSymbol $kw97$VIA_GENL_PRED;
    private static final SubLSymbol $kw98$VIA_GENL_INVERSE;
    private static final SubLString $str99$Term__s__violates__s__s__of_colle;
    private static final SubLString $str100$applicable_to_arg__s_of__s__;
    private static final SubLString $str101$_via__s___;
    private static final SubLString $str102$in_mt__s___;
    private static final SubLObject $const103$False;
    private static final SubLObject $const104$EvaluateSubLFn;
    private static final SubLObject $const105$ExpandSubLFn;
    private static final SubLSymbol $kw106$NL_VERBOSITY;
    private static final SubLSymbol $kw107$TERSE;
    private static final SubLSymbol $kw108$ARG_ISA;
    private static final SubLObject $const109$defnIff;
    private static final SubLSymbol $kw110$MAL_ARG_WRT_QUOTED_IFF_DEFN;
    private static final SubLList $list111;
    private static final SubLObject $const112$quotedDefnIff;
    private static final SubLSymbol $kw113$MAL_ARG_WRT_SUF_DEFNS;
    private static final SubLList $list114;
    private static final SubLObject $const115$defnSufficient;
    private static final SubLSymbol $kw116$MAL_ARG_WRT_QUOTED_SUF_DEFNS;
    private static final SubLList $list117;
    private static final SubLObject $const118$quotedDefnSufficient;
    private static final SubLSymbol $kw119$MAL_ARG_WRT_NEC_DEFN;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLString $str122$Term__s__violates__s__s___s___of_;
    private static final SubLObject $const123$defnNecessary;
    private static final SubLSymbol $kw124$MAL_ARG_WRT_QUOTED_NEC_DEFN;
    private static final SubLList $list125;
    private static final SubLObject $const126$quotedDefnNecessary;
    private static final SubLSymbol $kw127$MAL_ARG_WRT_COL_DEFN;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLString $str130$Term__s_violates_defns_of__a__s__;
    private static final SubLString $str131$applicable_to_argument__s_of_rela;
    private static final SubLObject $const132$isa;
    private static final SubLSymbol $kw133$MAL_ARG_WRT_COL_QUOTED_DEFN;
    private static final SubLList $list134;
    private static final SubLSymbol $kw135$ARG_QUOTED_ISA;
    private static final SubLSymbol $kw136$MAL_ARG_WRT_ARG_ISA;
    private static final SubLList $list137;
    private static final SubLString $str138$arg_isa;
    private static final SubLSymbol $kw139$ARG_NOT_ISA;
    private static final SubLString $str140$arg_not_isa;
    private static final SubLString $str141$arg_quoted_isa;
    private static final SubLSymbol $kw142$ARG_GENLS;
    private static final SubLString $str143$arg_genls;
    private static final SubLString $str144$isa_disjoint;
    private static final SubLString $str145$quoted_isa_disjoint;
    private static final SubLString $str146$disjoint;
    private static final SubLObject $const147$genlPreds;
    private static final SubLObject $const148$genlInverse;
    private static final SubLList $list149;
    private static final SubLString $str150$Term__s_violates__a__s__;
    private static final SubLList $list151;
    private static final SubLString $str152$Term__s_is__a_with__a__s__;
    private static final SubLString $str153$___;
    private static final SubLSymbol $kw154$NL_TERM_MAP;
    private static final SubLObject $const155$ParaphraseFn;
    private static final SubLObject $const156$CycLPhraseFn;
    private static final SubLObject $const157$SpecsFn;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLObject $const161$ConcatenatePhrasesFn;
    private static final SubLList $list162;
    private static final SubLSymbol $kw163$DECLARATIVE;
    private static final SubLObject $const164$Np_DetNbarFn_Indefinite;
    private static final SubLList $list165;
    private static final SubLList $list166;
    private static final SubLString $str167$Term__s_violates_arg_isa__s__;
    private static final SubLSymbol $kw168$AT_CONSTRAINT_GAF;
    private static final SubLSymbol $kw169$WFF_FORMULA;
    private static final SubLObject $const170$unknownSentence;
    private static final SubLSymbol $kw171$ARGUMENTS;
    private static final SubLSymbol $kw172$GENLPREDS;
    private static final SubLSymbol $kw173$EXPLANATION;
    private static final SubLSymbol $kw174$CONSEQUENCE;
    private static final SubLObject $const175$rejectedSentence;
    private static final SubLSymbol $kw176$JUSTIFICATION;
    private static final SubLSymbol $kw177$CANDIDATE_REPAIRS;
    private static final SubLSymbol $kw178$MAL_ARG_WRT_ARG_QUOTED_ISA;
    private static final SubLList $list179;
    private static final SubLSymbol $kw180$MAL_ARG_WRT_ARG_GENL;
    private static final SubLList $list181;
    private static final SubLObject $const182$genls;
    private static final SubLString $str183$Term__s_violates_arg_genls__s__;
    private static final SubLSymbol $kw184$MAL_ARG_WRT_ARG_NOT_ISA;
    private static final SubLList $list185;
    private static final SubLSymbol $kw186$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT;
    private static final SubLList $list187;
    private static final SubLString $str188$Term__s_is_isa_disjoint_with_arg_;
    private static final SubLSymbol $kw189$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT;
    private static final SubLList $list190;
    private static final SubLSymbol $kw191$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT;
    private static final SubLList $list192;
    private static final SubLObject $const193$disjointWith;
    private static final SubLSymbol $kw194$MAL_ARG_WRT_INTER_ARG_ISA;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLString $str197$Term__s_violates_inter_arg_isa__s;
    private static final SubLString $str198$when_argument__s___s__isa__s__;
    private static final SubLSymbol $kw199$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
    private static final SubLList $list200;
    private static final SubLString $str201$Term__s_violates_inter_arg_not_is;
    private static final SubLString $str202$when_argument__s___s__not_isa__s_;
    private static final SubLSymbol $kw203$MAL_ARG_WRT_INTER_ARG_GENL;
    private static final SubLList $list204;
    private static final SubLList $list205;
    private static final SubLString $str206$Term__s_violates_inter_arg_genl__;
    private static final SubLString $str207$when_argument__s___s__genl__s__;
    private static final SubLSymbol $kw208$MAL_ARG_WRT_INTER_ARG_DEFN;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLString $str211$Term__s_violates_defns_of_inter_a;
    private static final SubLSymbol $kw212$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
    private static final SubLList $list213;
    private static final SubLString $str214$Term__s_violates_defns_of_inter_a;
    private static final SubLSymbol $kw215$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT;
    private static final SubLList $list216;
    private static final SubLString $str217$Term__s_is_isa_disjoint_with_inte;
    private static final SubLSymbol $kw218$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLString $str221$Term__s_is_genl_disjoint_with_int;
    private static final SubLSymbol $kw222$MAL_ARG_WRT_INTER_ARG_ISA_GENL;
    private static final SubLList $list223;
    private static final SubLString $str224$Term__s_is_not_a_spec_of__s__viol;
    private static final SubLObject $const225$interArgIsaGenl;
    private static final SubLSymbol $kw226$MAL_ARG_WRT_INTER_ARG_GENL_ISA;
    private static final SubLList $list227;
    private static final SubLString $str228$Term__s_is_not_an_instance_of__s_;
    private static final SubLString $str229$when_argument__s___s__genls__s__;
    private static final SubLObject $const230$genl;
    private static final SubLSymbol $kw231$MAL_ARG_WRT_ARG_FORMAT;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLString $str234$Term__s_violates_arg_format__s__;
    private static final SubLString $str235$__applicable_to_argument__s_of_re;
    private static final SubLString $str236$___via__s___;
    private static final SubLString $str237$__in_mt__s___;
    private static final SubLString $str238$______In_conflict__a_________a__;
    private static final SubLString $str239$are;
    private static final SubLString $str240$is;
    private static final SubLSymbol $sym241$ASSERTION_FI_IST_FORMULA;
    private static final SubLString $str242$________;
    private static final SubLString $str243$__and_______;
    private static final SubLSymbol $kw244$MAL_ARG_WRT_INTER_ARG_FORMAT;
    private static final SubLList $list245;
    private static final SubLList $list246;
    private static final SubLString $str247$Term__s_violates_inter_arg_format;
    private static final SubLString $str248$__when_argument__s___s__isa__s__;
    private static final SubLString $str249$______In_conflict__a_________a;
    private static final SubLSymbol $kw250$MAL_ARG_WRT_INTER_ARG_DIFFERENT;
    private static final SubLList $list251;
    private static final SubLList $list252;
    private static final SubLString $str253$Terms__s_and__s_are_equal__which_;
    private static final SubLString $str254$applicable_to_arguments__s_and__s;
    private static final SubLObject $const255$interArgDifferent;
    private static final SubLObject $const256$equals;
    private static final SubLSymbol $kw257$MAL_RELN_WRT_ARG_ISA_REQUIRED;
    private static final SubLList $list258;
    private static final SubLList $list259;
    private static final SubLString $str260$argument__s_of__s_has_no___argIsa;
    private static final SubLObject $const261$thereExists;
    private static final SubLSymbol $sym262$_COL;
    private static final SubLObject $const263$argIsa;
    private static final SubLList $list264;
    private static final SubLSymbol $kw265$CONFLICT_ASSERTING_TRUE_SBHL;
    private static final SubLList $list266;
    private static final SubLList $list267;
    private static final SubLString $str268$sbhl_conflict___s__a__a________be;
    private static final SubLSymbol $kw269$TRUE;
    private static final SubLSymbol $sym270$STRINGIFY_ITEMS;
    private static final SubLString $str271$_________________;
    private static final SubLString $str272$_s_is_known_not_to_be__a__s_in_mt;
    private static final SubLString $str273$related_to;
    private static final SubLString $str274$an_instance_of;
    private static final SubLString $str275$a_spec_of;
    private static final SubLObject $const276$genlMt;
    private static final SubLString $str277$a_spec_mt_of;
    private static final SubLString $str278$a_spec_pred_of;
    private static final SubLString $str279$a_spec_inverse_of;
    private static final SubLSymbol $kw280$CONFLICT_ASSERTING_FALSE_SBHL;
    private static final SubLList $list281;
    private static final SubLString $str282$sbhl_conflict___s__a__a________be;
    private static final SubLSymbol $kw283$FALSE;
    private static final SubLString $str284$_s_is_known_to_be__a__s_in_mt__s_;
    private static final SubLSymbol $kw285$DISJOINT_ARG_ISA;
    private static final SubLList $list286;
    private static final SubLList $list287;
    private static final SubLString $str288$Variable__s_is_subject_to_disjoin;
    private static final SubLObject $const289$and;
    private static final SubLSymbol $kw290$WFF_EXPANSION_FORMULA;
    private static final SubLSymbol $kw291$WFF_ORIGINAL_FORMULA;
    private static final SubLString $str292$__Original_formula______s;
    private static final SubLString $str293$__Expansion_formula______s;
    private static final SubLString $str294$__WFF_checked_formula______s;
    private static final SubLSymbol $kw295$DISJOINT_ARG_QUOTED_ISA;
    private static final SubLList $list296;
    private static final SubLSymbol $kw297$DISJOINT_ARG_GENL;
    private static final SubLList $list298;
    private static final SubLString $str299$Variable__s_is_subject_to_disjoin;
    private static final SubLSymbol $kw300$ISOLATED_TERMS;
    private static final SubLList $list301;
    private static final SubLList $list302;
    private static final SubLString $str303$__s_is_an_isolated_term_in___s___;
    private static final SubLString $str304$__s__are_isolated_terms_in___s___;
    private static final SubLSymbol $sym305$STR_BY_TYPE;
    private static final SubLSymbol $kw306$IRRELEVANT_LITERALS;
    private static final SubLList $list307;
    private static final SubLList $list308;
    private static final SubLString $str309$__s_is_irrelevant_in___s___;
    private static final SubLString $str310$__s__are_irrelevant_in___s___;
    private static final SubLSymbol $kw311$RESTRICTED_SKOLEM_ASSERTION;
    private static final SubLList $list312;
    private static final SubLSymbol $sym313$REIFIED_SKOLEM_FN_IN_ANY_MT_;
    private static final SubLString $str314$Asserting_a_sentence_that_referen;
    private static final SubLSymbol $kw315$RESTRICTED_PREDICATE_ASSERTION;
    private static final SubLList $list316;
    private static final SubLString $str317$Asserting_a_literal_with_predicat;
    private static final SubLObject $const318$notAssertible;
    private static final SubLSymbol $kw319$RESTRICTED_COLLECTION_ASSERTION;
    private static final SubLList $list320;
    private static final SubLString $str321$Asserting_an___isa_literal_with_c;
    private static final SubLObject $const322$notAssertibleCollection;
    private static final SubLSymbol $kw323$EVALUATABLE_LITERAL_FALSE;
    private static final SubLList $list324;
    private static final SubLString $str325$Asserting_a_sentence_in_mt__s____;
    private static final SubLSymbol $kw326$EXCEPT_FOR_W_O_SINGLETON_VAR;
    private static final SubLList $list327;
    private static final SubLString $str328$__exceptFor_sentence_arg2_must_ha;
    private static final SubLString $str329$__;
    private static final SubLSymbol $kw330$INVALID_MT_FOR_TOU;
    private static final SubLList $list331;
    private static final SubLString $str332$attempt_to_assert___termOfUnit_ga;
    private static final SubLSymbol $kw333$NON_DEFN_PRED_IN_VOCAB_MT;
    private static final SubLList $list334;
    private static final SubLString $str335$attempt_to_assert_gaf_with_non_de;
    private static final SubLSymbol $kw336$PREDICATE_ISA_VIOLATION;
    private static final SubLList $list337;
    private static final SubLList $list338;
    private static final SubLString $str339$___isa__s__s__in_mt__s__;
    private static final SubLSymbol $kw340$META_PREDICATE_VIOLATION;
    private static final SubLList $list341;
    private static final SubLList $list342;
    private static final SubLString $str343$__s__s__s__in_mt__s__;
    private static final SubLSymbol $kw344$MAL_PRECANONICALIZATIONS;
    private static final SubLList $list345;
    private static final SubLString $str346$Uninformative_error_during_precan;
    private static final SubLSymbol $kw347$INVALID_EXPANSION;
    private static final SubLList $list348;
    private static final SubLSymbol $sym349$INTEGERP;
    private static final SubLSymbol $sym350$NULL;
    private static final SubLSymbol $sym351$GENERIC_ARG_P;
    private static final SubLSymbol $sym352$GENERIC_ARG_NUM;
    private static final SubLSymbol $sym353$MAX;
    private static final SubLString $str354$_A_has_arity__A__but_the_expansio;
    private static final SubLString $str355$_A_does_not_fit_the_pattern_of_th;
    private static final SubLSymbol $kw356$RECURSION_LIMIT_EXCEEDED;
    private static final SubLList $list357;
    private static final SubLString $str358$Recursion_limit_exceeded__probabl;
    private static final SubLSymbol $kw359$EL_UNEVALUATABLE_EXPRESSION;
    private static final SubLList $list360;
    private static final SubLString $str361$_was_marked_as___evaluateAtEL__bu;
    private static final SubLSymbol $kw362$QUANTIFIED_SEQUENCE_VARIABLE;
    private static final SubLList $list363;
    private static final SubLString $str364$The_variable__A_is_existentially_;
    private static final SubLSymbol $kw365$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE;
    private static final SubLList $list366;
    private static final SubLString $str367$The_variables__A_were_used_as_seq;
    private static final SubLSymbol $kw368$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE;
    private static final SubLList $list369;
    private static final SubLString $str370$The_variable__A_was_used_both_as_;
    private static final SubLSymbol $kw371$INHIBITED_SEQUENCE_VARIABLE;
    private static final SubLList $list372;
    private static final SubLString $str373$The_variable__A_was_used_as_a_seq;
    private static final SubLSymbol $kw374$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST;
    private static final SubLList $list375;
    private static final SubLString $str376$In_conflict___a___No_more_than_on;
    private static final SubLSymbol $kw377$CYCLIC_COMMUTATIVE_IN_ARGS;
    private static final SubLList $list378;
    private static final SubLString $str379$An_assertion_of_partial_commutati;
    private static final SubLSymbol $kw380$DEFINING_MT_VIOLATION;
    private static final SubLList $list381;
    private static final SubLString $str382$Term__a_was_referenced_in__a___bu;
    private static final SubLSymbol $kw383$DISJUNCT_IN_PRAGMATIC_REQUIREMENT;
    private static final SubLList $list384;
    private static final SubLList $list385;
    private static final SubLString $str386$Disjoint_condition__s_is_present_;
    private static final SubLSymbol $kw387$BAD_EXPONENTIAL_DISJUNCTION;
    private static final SubLList $list388;
    private static final SubLList $list389;
    private static final SubLString $str390$_s_is_a_disjunction_of_conjunctio;
    private static final SubLSymbol $kw391$BAD_EXPONENTIAL_CONJUNCTION;
    private static final SubLList $list392;
    private static final SubLString $str393$_s_is_a_conjunction_of_disjunctio;
    private static final SubLSymbol $kw394$RESTRICTED_MT_ASSERTION;
    private static final SubLList $list395;
    private static final SubLList $list396;
    private static final SubLString $str397$Asserting_the_decontextualized_li;
    private static final SubLString $str398$Asserting_the_literal__s_in_micro;
    private static final SubLObject $const399$decontextualizedPredicate;
    private static final SubLObject $const400$predicateConventionMt;
    private static final SubLObject $const401$notAssertibleMt;
    private static final SubLObject $const402$decontextualizedCollection;
    private static final SubLObject $const403$collectionConventionMt;
    private static final SubLSymbol $kw404$SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL;
    private static final SubLList $list405;
    private static final SubLList $list406;
    private static final SubLString $str407$Formula_simplifies_to_a_tautology;
    private static final SubLSymbol $kw408$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE;
    private static final SubLList $list409;
    private static final SubLString $str410$Could_not_reify_nat__S____in_sent;
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 1041L)
    public static SubLObject explain_invalid_variables(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject v_variables = (SubLObject)wff_modules.NIL;
        SubLObject sentence = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list2);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list2);
        sentence = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject length = Sequences.length(v_variables);
            if (length.numE((SubLObject)wff_modules.ZERO_INTEGER)) {
                return (SubLObject)wff_modules.NIL;
            }
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str4$Sentence__s_contains_invalid_vari, new SubLObject[] { sentence, length, string_utilities.stringify_items(v_variables, Symbols.symbol_function((SubLObject)wff_modules.$sym5$STR), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_), length, cycl_variables.$valid_el_var_regular_expression$.getGlobalValue() });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                if (length.numG((SubLObject)wff_modules.ONE_INTEGER)) {
                    SubLObject hl_explanation = (SubLObject)wff_modules.NIL;
                    SubLObject cdolist_list_var = v_variables;
                    SubLObject variable = (SubLObject)wff_modules.NIL;
                    variable = cdolist_list_var.first();
                    while (wff_modules.NIL != cdolist_list_var) {
                        hl_explanation = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.listS(wff_modules.$const10$quotedIsa, variable, (SubLObject)wff_modules.$list11)), hl_explanation);
                        cdolist_list_var = cdolist_list_var.rest();
                        variable = cdolist_list_var.first();
                    }
                    return simplifier.conjoin(hl_explanation, (SubLObject)wff_modules.UNPROVIDED);
                }
                final SubLObject variable2 = v_variables.first();
                return (SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.listS(wff_modules.$const10$quotedIsa, variable2, (SubLObject)wff_modules.$list11));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list2);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 2059L)
    public static SubLObject explain_invalid_sentence(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject sentence = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list15);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list15);
        mt = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                if (wff_modules.NIL != mt) {
                    return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str16$_s_is_not_a_well_formed_sentence_, sentence, mt), (SubLObject)(sentence.isCons() ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str17$Perhaps__s_is_insufficiently_defi, cycl_utilities.formula_operator(sentence), mt) : wff_modules.$str18$));
                }
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str19$_s_is_not_a_well_formed_sentence_, sentence), (SubLObject)(sentence.isCons() ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str20$Perhaps__s_is_insufficiently_defi, cycl_utilities.formula_operator(sentence)) : wff_modules.$str18$));
            }
            else if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                if (wff_modules.NIL != mt) {
                    return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const22$admittedSentence, (SubLObject)ConsesLow.list(wff_modules.$const23$SubLQuoteFn, sentence))));
                }
                return (SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const22$admittedSentence, (SubLObject)ConsesLow.list(wff_modules.$const23$SubLQuoteFn, sentence)));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list15);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 3151L)
    public static SubLObject explain_not_an_ascii_string(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject string = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list26);
            string = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str27$String__s_contains_non_ASCII_char, string);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list26);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 3772L)
    public static SubLObject explain_mal_forts(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str30$References_invalid_forts___a___, string_utilities.stringify_items(conses_high.cadr(why_not), Symbols.symbol_function((SubLObject)wff_modules.$sym5$STR), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 4286L)
    public static SubLObject explain_mal_fort(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject fort = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list33);
            fort = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str34$FORT__s_is_invalid___, fort);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list33);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 4916L)
    public static SubLObject explain_mal_arity(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arity_pred = (SubLObject)wff_modules.NIL;
        SubLObject relation = (SubLObject)wff_modules.NIL;
        SubLObject v_arity = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list37);
        arity_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list37);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list37);
        v_arity = current.first();
        current = (data = current.rest());
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str38$The__s_of__s_should_be_a___NonNeg, new SubLObject[] { arity_pred, relation, v_arity }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            return simplifier.conjoin((SubLObject)ConsesLow.list(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(arity_pred, relation, v_arity), (SubLObject)wff_modules.UNPROVIDED), czer_utilities.find_hl_gaf((SubLObject)ConsesLow.listS(wff_modules.$const39$arg2Isa, arity_pred, (SubLObject)wff_modules.$list40), (SubLObject)wff_modules.UNPROVIDED)), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 5715L)
    public static SubLObject explain_arity_mismatch(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject sentence = (SubLObject)wff_modules.NIL;
        SubLObject relation = (SubLObject)wff_modules.NIL;
        SubLObject description = (SubLObject)wff_modules.NIL;
        SubLObject expected_argnum = (SubLObject)wff_modules.NIL;
        SubLObject given_argnum = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list43);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list43);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list43);
        description = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list43);
        expected_argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list43);
        given_argnum = current.first();
        current = (data = current.rest());
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str44$Arity_mismatch_in__A___A_is_a_n__, new SubLObject[] { sentence, relation, description, expected_argnum, given_argnum }), nl_explanation_of_verbose_data(data));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 6574L)
    public static SubLObject explain_violated_arity(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arity_pred = (SubLObject)wff_modules.NIL;
        SubLObject relation = (SubLObject)wff_modules.NIL;
        SubLObject v_arity = (SubLObject)wff_modules.NIL;
        SubLObject sentence = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list47);
        arity_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list47);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list47);
        v_arity = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list47);
        sentence = current.first();
        current = (data = current.rest());
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str48$The__s_of__s_is__s___, new SubLObject[] { arity_pred, relation, v_arity }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            return simplifier.conjoin((SubLObject)ConsesLow.list(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(arity_pred, relation, v_arity), (SubLObject)wff_modules.UNPROVIDED), arity_pred.eql(wff_modules.$const49$arityMin) ? czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const50$greaterThanOrEqualTo, (SubLObject)ConsesLow.list(wff_modules.$const51$FormulaArityFn, (SubLObject)ConsesLow.list(wff_modules.$const52$Quote, sentence)), v_arity)), (SubLObject)wff_modules.UNPROVIDED) : (arity_pred.eql(wff_modules.$const53$arityMax) ? czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const50$greaterThanOrEqualTo, v_arity, (SubLObject)ConsesLow.list(wff_modules.$const51$FormulaArityFn, (SubLObject)ConsesLow.list(wff_modules.$const52$Quote, sentence)))), (SubLObject)wff_modules.UNPROVIDED) : czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const54$evaluate, v_arity, (SubLObject)ConsesLow.list(wff_modules.$const51$FormulaArityFn, (SubLObject)ConsesLow.list(wff_modules.$const52$Quote, sentence)))), (SubLObject)wff_modules.UNPROVIDED))), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 7680L)
    public static SubLObject explain_missing_arity(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject relation = (SubLObject)wff_modules.NIL;
            SubLObject v_arity = (SubLObject)wff_modules.NIL;
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            SubLObject data = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list57);
            relation = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list57);
            v_arity = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list57);
            sentence = current.first();
            current = (data = current.rest());
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str58$The_arity_of__s_is_unknown___, relation), nl_explanation_of_verbose_data(data));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 8244L)
    public static SubLObject explain_malformed_args(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject description = (SubLObject)wff_modules.NIL;
            SubLObject relation = (SubLObject)wff_modules.NIL;
            SubLObject args = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list61);
            description = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list61);
            relation = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list61);
            args = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str62$The__A__A_got_the_malformed_argum, new SubLObject[] { description, relation, args });
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list61);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 8816L)
    public static SubLObject explain_not_a_denotational_term(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject v_term = conses_high.cadr(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str65$_A_is_not_a_denotational_term___, v_term);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 9330L)
    public static SubLObject explain_not_a_truth_function(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject v_term = conses_high.cadr(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str68$Did_not_recognize__A_as_a_truth_f, v_term);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 9853L)
    public static SubLObject explain_not_an_el_formula(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject formula = conses_high.cadr(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str71$_A_is_not_an_EL_formula__and_is_n, formula);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 10396L)
    public static SubLObject explain_not_an_el_variable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject v_term = conses_high.cadr(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str74$_A_is_not_an_EL_variable___, v_term);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 10917L)
    public static SubLObject explain_not_a_list_of_variables(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject v_term = conses_high.cadr(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str77$_A_is_not_a_list_of_EL_variables_, v_term);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 11394L)
    public static SubLObject explain_sequence_non_var(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject formula = (SubLObject)wff_modules.NIL;
            SubLObject v_term = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list80);
            formula = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list80);
            v_term = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str81$_A_contains_ill_formed_sequence_v, formula, v_term);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list80);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 12140L)
    public static SubLObject explain_expand_subl_fn_irrelevant_term_in_arg1(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject violating_non_variables = (SubLObject)wff_modules.NIL;
        SubLObject sentence = (SubLObject)wff_modules.NIL;
        SubLObject expand_subl_fn = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list84);
        violating_non_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list84);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list84);
        expand_subl_fn = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject length = Sequences.length(violating_non_variables);
            if (length.numE((SubLObject)wff_modules.ZERO_INTEGER)) {
                return (SubLObject)wff_modules.NIL;
            }
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str85$Sentence__s___has___ExpandSubLFn_, new SubLObject[] { sentence, expand_subl_fn, length, string_utilities.stringify_items(violating_non_variables, Symbols.symbol_function((SubLObject)wff_modules.$sym5$STR), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_), cycl_utilities.formula_arg1(expand_subl_fn, (SubLObject)wff_modules.UNPROVIDED), cycl_utilities.formula_arg2(expand_subl_fn, (SubLObject)wff_modules.UNPROVIDED) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                if (length.numG((SubLObject)wff_modules.ONE_INTEGER)) {
                    final SubLObject formula_arg2 = cycl_utilities.formula_arg2(expand_subl_fn, (SubLObject)wff_modules.UNPROVIDED);
                    SubLObject hl_explanation = (SubLObject)wff_modules.NIL;
                    SubLObject cdolist_list_var = violating_non_variables;
                    SubLObject non_variable = (SubLObject)wff_modules.NIL;
                    non_variable = cdolist_list_var.first();
                    while (wff_modules.NIL != cdolist_list_var) {
                        hl_explanation = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const86$trueSubL, (SubLObject)ConsesLow.list((SubLObject)wff_modules.$sym87$TREE_FIND, non_variable, formula_arg2))), hl_explanation);
                        cdolist_list_var = cdolist_list_var.rest();
                        non_variable = cdolist_list_var.first();
                    }
                    return simplifier.conjoin(hl_explanation, (SubLObject)wff_modules.UNPROVIDED);
                }
                final SubLObject non_variable2 = violating_non_variables.first();
                return (SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const86$trueSubL, (SubLObject)ConsesLow.list((SubLObject)wff_modules.$sym87$TREE_FIND, non_variable2, cycl_utilities.formula_arg2(expand_subl_fn, (SubLObject)wff_modules.UNPROVIDED))));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list84);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 13678L)
    public static SubLObject explain_invalid_mt(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str90$Mt__s_is_invalid___, conses_high.cadr(why_not));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 14503L)
    public static SubLObject explain_mal_function_nesting(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject fn_term = conses_high.cadr(why_not);
            final SubLObject nesting = function_terms.term_functional_complexity(fn_term);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str93$Term__s_______has__s_nesting_leve, new SubLObject[] { fn_term, nesting, control_vars.$term_functional_complexity_cutoff$.getDynamicValue(thread) });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 15196L)
    public static SubLObject explain_mal_arg_wrt_defns_int(final SubLObject why_not, final SubLObject pred, final SubLObject v_properties) {
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject psn = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject v_defns = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list96);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list96);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list96);
        psn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list96);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list96);
        v_defns = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list96);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject message = PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str99$Term__s__violates__s__s__of_colle, new SubLObject[] { arg, pred, v_defns.isList() ? string_utilities.stringify_items(v_defns, Symbols.symbol_function((SubLObject)wff_modules.$sym5$STR), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_) : v_defns, col });
            if (wff_modules.NIL != reln && wff_modules.NIL != psn) {
                message = Sequences.cconcatenate(message, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str100$applicable_to_arg__s_of__s__, psn, reln));
            }
            if (wff_modules.NIL != via_genl) {
                message = Sequences.cconcatenate(message, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl));
            }
            message = Sequences.cconcatenate(message, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt));
            return message;
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject defn_gafs = (SubLObject)wff_modules.NIL;
            if (v_defns.isList()) {
                SubLObject cdolist_list_var = v_defns;
                SubLObject defn = (SubLObject)wff_modules.NIL;
                defn = cdolist_list_var.first();
                while (wff_modules.NIL != cdolist_list_var) {
                    defn_gafs = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(pred, col, (SubLObject)ConsesLow.list(wff_modules.$const23$SubLQuoteFn, defn)), mt), defn_gafs);
                    defn_gafs = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const54$evaluate, wff_modules.$const103$False, (SubLObject)ConsesLow.list(wff_modules.$const104$EvaluateSubLFn, (SubLObject)ConsesLow.list(wff_modules.$const105$ExpandSubLFn, (SubLObject)ConsesLow.list(arg), (SubLObject)ConsesLow.list(defn, arg)))), mt), defn_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    defn = cdolist_list_var.first();
                }
            }
            else {
                defn_gafs = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(pred, col, (SubLObject)ConsesLow.list(wff_modules.$const23$SubLQuoteFn, v_defns)), mt), defn_gafs);
                defn_gafs = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const54$evaluate, wff_modules.$const103$False, (SubLObject)ConsesLow.list(wff_modules.$const104$EvaluateSubLFn, (SubLObject)ConsesLow.list(wff_modules.$const105$ExpandSubLFn, (SubLObject)ConsesLow.list(arg), (SubLObject)ConsesLow.list(v_defns, arg)))), mt), defn_gafs);
            }
            return simplifier.conjoin(defn_gafs, (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 16645L)
    public static SubLObject explain_mal_arg_wrt_iff_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE) == wff_modules.$kw3$NL && wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE && wff_modules.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            return nl_explanation_of_why_not_terse(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, v_properties);
        }
        return explain_mal_arg_wrt_defns_int(why_not, wff_modules.$const109$defnIff, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 17400L)
    public static SubLObject explain_mal_arg_wrt_quoted_iff_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_defns_int(why_not, wff_modules.$const112$quotedDefnIff, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 17885L)
    public static SubLObject explain_mal_arg_wrt_suf_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE) == wff_modules.$kw3$NL && wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE && wff_modules.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            return nl_explanation_of_why_not_terse(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, v_properties);
        }
        return explain_mal_arg_wrt_defns_int(why_not, wff_modules.$const115$defnSufficient, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 18657L)
    public static SubLObject explain_mal_arg_wrt_quoted_suf_defns(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_defns_int(why_not, wff_modules.$const118$quotedDefnSufficient, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 19145L)
    public static SubLObject explain_mal_arg_wrt_nec_defn_int(final SubLObject why_not, final SubLObject pred, final SubLObject io_mode) {
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject psn = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject defn_col = (SubLObject)wff_modules.NIL;
        SubLObject defn = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        psn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        defn_col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        defn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list121);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        if (io_mode.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject message = PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str122$Term__s__violates__s__s___s___of_, new SubLObject[] { arg, pred, defn_col, defn, col });
            if (wff_modules.NIL != reln && wff_modules.NIL != psn) {
                message = Sequences.cconcatenate(message, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str100$applicable_to_arg__s_of__s__, psn, reln));
            }
            if (wff_modules.NIL != via_genl) {
                message = Sequences.cconcatenate(message, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl));
            }
            message = Sequences.cconcatenate(message, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt));
            return message;
        }
        if (io_mode.eql((SubLObject)wff_modules.$kw8$HL)) {
            return simplifier.conjoin((SubLObject)ConsesLow.list(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(pred, defn_col, (SubLObject)ConsesLow.list(wff_modules.$const23$SubLQuoteFn, defn)), mt), czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const54$evaluate, wff_modules.$const103$False, (SubLObject)ConsesLow.list(wff_modules.$const104$EvaluateSubLFn, (SubLObject)ConsesLow.list(wff_modules.$const105$ExpandSubLFn, (SubLObject)ConsesLow.list(arg), (SubLObject)ConsesLow.list(defn, arg)))), mt)), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 20144L)
    public static SubLObject explain_mal_arg_wrt_nec_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE) == wff_modules.$kw3$NL && wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE && wff_modules.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            return nl_explanation_of_why_not_terse(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, v_properties);
        }
        return explain_mal_arg_wrt_nec_defn_int(why_not, wff_modules.$const123$defnNecessary, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 20942L)
    public static SubLObject explain_mal_arg_wrt_quoted_nec_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_nec_defn_int(why_not, wff_modules.$const126$quotedDefnNecessary, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 21439L)
    public static SubLObject explain_mal_arg_wrt_col_defn_int(final SubLObject why_not, final SubLObject v_arg_type, final SubLObject pred, final SubLObject v_properties) {
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE) == wff_modules.$kw3$NL && wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE && wff_modules.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            return nl_explanation_of_why_not_terse(why_not, v_arg_type, v_properties);
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list129);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list129);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list129);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list129);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list129);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str130$Term__s_violates_defns_of__a__s__, new SubLObject[] { arg, Strings.string_downcase(string_utilities.to_string(v_arg_type), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), col }), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via_genl) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            return czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(pred, arg, col)), mt);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 22442L)
    public static SubLObject explain_mal_arg_wrt_col_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_col_defn_int(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, wff_modules.$const132$isa, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 22946L)
    public static SubLObject explain_mal_arg_wrt_col_quoted_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_col_defn_int(why_not, (SubLObject)wff_modules.$kw135$ARG_QUOTED_ISA, wff_modules.$const10$quotedIsa, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 23396L)
    public static SubLObject explanation_constraint_string(final SubLObject constraint_type) {
        if (constraint_type.eql((SubLObject)wff_modules.$kw108$ARG_ISA)) {
            return (SubLObject)wff_modules.$str138$arg_isa;
        }
        if (constraint_type.eql((SubLObject)wff_modules.$kw139$ARG_NOT_ISA)) {
            return (SubLObject)wff_modules.$str140$arg_not_isa;
        }
        if (constraint_type.eql((SubLObject)wff_modules.$kw135$ARG_QUOTED_ISA)) {
            return (SubLObject)wff_modules.$str141$arg_quoted_isa;
        }
        if (constraint_type.eql((SubLObject)wff_modules.$kw142$ARG_GENLS)) {
            return (SubLObject)wff_modules.$str143$arg_genls;
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 23638L)
    public static SubLObject explanation_disjoint_string(final SubLObject constraint_type) {
        if (constraint_type.eql((SubLObject)wff_modules.$kw108$ARG_ISA)) {
            return (SubLObject)wff_modules.$str144$isa_disjoint;
        }
        if (constraint_type.eql((SubLObject)wff_modules.$kw135$ARG_QUOTED_ISA)) {
            return (SubLObject)wff_modules.$str145$quoted_isa_disjoint;
        }
        if (constraint_type.eql((SubLObject)wff_modules.$kw142$ARG_GENLS)) {
            return (SubLObject)wff_modules.$str146$disjoint;
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 23848L)
    public static SubLObject explanation_pred_from_type(final SubLObject constraint_type) {
        if (constraint_type.eql((SubLObject)wff_modules.$kw108$ARG_ISA) || constraint_type.eql((SubLObject)wff_modules.$kw139$ARG_NOT_ISA)) {
            return wff_modules.$const132$isa;
        }
        if (constraint_type.eql((SubLObject)wff_modules.$kw135$ARG_QUOTED_ISA)) {
            return wff_modules.$const10$quotedIsa;
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 24019L)
    public static SubLObject hl_explanation_via_genl_pred(final SubLObject constraint_type, final SubLObject reln, final SubLObject pos, final SubLObject col, final SubLObject genl_pred, final SubLObject mt) {
        SubLObject constraints = (SubLObject)wff_modules.NIL;
        final SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
        if (wff_modules.NIL != constraint_pred) {
            SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(constraint_pred, genl_pred, col), mt);
            if (wff_modules.NIL != var) {
                constraints = (SubLObject)ConsesLow.cons(var, constraints);
            }
            if (wff_modules.NIL != constraints) {
                var = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, genl_pred), mt);
                if (wff_modules.NIL != var) {
                    constraints = (SubLObject)ConsesLow.cons(var, constraints);
                }
            }
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 24431L)
    public static SubLObject hl_explanation_via_genl_inverse(final SubLObject constraint_type, final SubLObject reln, final SubLObject pos, final SubLObject col, final SubLObject genl_inverse, final SubLObject mt) {
        SubLObject constraints = (SubLObject)wff_modules.NIL;
        final SubLObject inverse_pred = at_routines.inverse_pred(constraint_type, pos, reln);
        if (wff_modules.NIL != inverse_pred) {
            SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(inverse_pred, genl_inverse, col), mt);
            if (wff_modules.NIL != var) {
                constraints = (SubLObject)ConsesLow.cons(var, constraints);
            }
            if (wff_modules.NIL != constraints) {
                var = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, genl_inverse), mt);
                if (wff_modules.NIL != var) {
                    constraints = (SubLObject)ConsesLow.cons(var, constraints);
                }
            }
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 24845L)
    public static SubLObject hl_explanation_for_pred(final SubLObject constraint_type, final SubLObject pos, final SubLObject reln, final SubLObject col, final SubLObject mt) {
        SubLObject constraints = (SubLObject)wff_modules.NIL;
        final SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
        if (wff_modules.NIL != constraint_pred) {
            constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(constraint_pred, reln, col), mt), constraints);
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 25131L)
    public static SubLObject hl_explanation_from_why_not(final SubLObject why_not, final SubLObject constraint_type, SubLObject defaultP) {
        if (defaultP == wff_modules.UNPROVIDED) {
            defaultP = (SubLObject)wff_modules.T;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        SubLObject constraints = (SubLObject)wff_modules.NIL;
        if (wff_modules.NIL != genl_pred) {
            constraints = hl_explanation_via_genl_pred(constraint_type, reln, pos, col, genl_pred, mt);
        }
        else if (wff_modules.NIL != genl_inverse) {
            constraints = hl_explanation_via_genl_inverse(constraint_type, reln, pos, col, genl_inverse, mt);
        }
        else if (wff_modules.NIL != defaultP) {
            constraints = hl_explanation_for_pred(constraint_type, pos, reln, col, mt);
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 25840L)
    public static SubLObject nl_explanation_from_why_not(final SubLObject why_not, final SubLObject constraint_type, final SubLObject v_properties) {
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE) == wff_modules.$kw3$NL && wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE && wff_modules.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            return nl_explanation_of_why_not_terse(why_not, constraint_type, v_properties);
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != genl_pred) ? genl_pred : genl_inverse;
        final SubLObject type_string = explanation_constraint_string(constraint_type);
        return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str150$Term__s_violates__a__s__, new SubLObject[] { arg, type_string, col }), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via_genl) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 26777L)
    public static SubLObject nl_explanation_from_why_not_with_disjoint(final SubLObject why_not, final SubLObject constraint_type, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE) == wff_modules.$kw3$NL && wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE && wff_modules.NIL != kb_control_vars.lexicon_kb_loaded_p() && wff_modules.NIL != subl_promotions.memberP(constraint_type, (SubLObject)wff_modules.$list151, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED)) {
            return nl_explanation_of_why_not_terse(why_not, constraint_type, v_properties);
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != genl_pred) ? genl_pred : genl_inverse;
        final SubLObject disjoint_string = explanation_disjoint_string(constraint_type);
        final SubLObject type_string = explanation_constraint_string(constraint_type);
        final SubLObject base_string = Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str152$Term__s_is__a_with__a__s__, new SubLObject[] { arg, disjoint_string, type_string, col }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln));
        if (wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw106$NL_VERBOSITY) == wff_modules.$kw107$TERSE) {
            return Sequences.cconcatenate(base_string, (SubLObject)wff_modules.$str153$___);
        }
        return Sequences.cconcatenate(base_string, new SubLObject[] { (wff_modules.NIL != via_genl) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 27990L)
    public static SubLObject nl_explanation_of_why_not_terse(final SubLObject why_not, final SubLObject constraint_type, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject term_map = conses_high.getf(v_properties, (SubLObject)wff_modules.$kw154$NL_TERM_MAP, (SubLObject)wff_modules.UNPROVIDED);
        final SubLObject violator_phrase = (SubLObject)((wff_modules.NIL != list_utilities.alist_lookup(term_map, arg, (SubLObject)wff_modules.EQUAL, (SubLObject)wff_modules.UNPROVIDED)) ? ConsesLow.list(wff_modules.$const155$ParaphraseFn, list_utilities.alist_lookup(term_map, arg, (SubLObject)wff_modules.EQUAL, (SubLObject)wff_modules.UNPROVIDED)) : ConsesLow.list(wff_modules.$const156$CycLPhraseFn, arg));
        final SubLObject known_type = (SubLObject)((constraint_type == wff_modules.$kw108$ARG_ISA) ? isa.min_isa(arg, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED).first() : ConsesLow.list(wff_modules.$const157$SpecsFn, genls.min_genls(arg, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED).first()));
        final SubLObject col_phrase = get_type_phrase(col, constraint_type);
        final SubLObject but_phrase = (SubLObject)((wff_modules.NIL != known_type && !known_type.equal((SubLObject)wff_modules.$list158)) ? ConsesLow.list((SubLObject)wff_modules.$list159, (SubLObject)wff_modules.$list160, get_type_phrase(known_type, constraint_type)) : wff_modules.NIL);
        return pph_main.generate_string_from_phrase_naut((SubLObject)ConsesLow.listS(wff_modules.$const161$ConcatenatePhrasesFn, violator_phrase, (SubLObject)wff_modules.$list162, col_phrase, ConsesLow.append(but_phrase, (SubLObject)wff_modules.NIL)), pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)wff_modules.$kw163$DECLARATIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 27990L)
    public static SubLObject get_type_phrase(final SubLObject col, final SubLObject constraint_type) {
        return (SubLObject)((constraint_type == wff_modules.$kw108$ARG_ISA) ? ConsesLow.list(wff_modules.$const164$Np_DetNbarFn_Indefinite, (SubLObject)ConsesLow.list(wff_modules.$const156$CycLPhraseFn, col)) : ConsesLow.list(wff_modules.$const161$ConcatenatePhrasesFn, (SubLObject)wff_modules.$list165, (SubLObject)ConsesLow.list(wff_modules.$const156$CycLPhraseFn, col)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 29370L)
    public static SubLObject explain_mal_arg_wrt_arg_isa_int(final SubLObject why_not, final SubLObject constraint_type, final SubLObject v_properties) {
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return nl_explanation_from_why_not(why_not, constraint_type, v_properties);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = (SubLObject)wff_modules.NIL;
            SubLObject reln = (SubLObject)wff_modules.NIL;
            SubLObject pos = (SubLObject)wff_modules.NIL;
            SubLObject col = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            SubLObject data = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            reln = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            mt = current.first();
            current = (data = current.rest());
            final SubLObject constraints = hl_explanation_from_why_not(why_not, constraint_type, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject pred = explanation_pred_from_type(constraint_type);
            return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(pred, arg, col)), mt), constraints), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 29978L)
    public static SubLObject explain_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_modules.NIL != wff_modules.$use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return new_explain_mal_arg_wrt_arg_isa(why_not, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE));
        }
        return explain_mal_arg_wrt_arg_isa_int(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 30268L)
    public static SubLObject new_explain_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == wff_modules.UNPROVIDED) {
            io_mode = (SubLObject)wff_modules.$kw3$NL;
        }
        SubLObject wff_module = (SubLObject)wff_modules.NIL;
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(why_not, why_not, (SubLObject)wff_modules.$list166);
        wff_module = why_not.first();
        SubLObject current = why_not.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str167$Term__s_violates_arg_isa__s__, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via_genl_pred) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            final SubLObject at_constraint_gaf = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw168$AT_CONSTRAINT_GAF, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
            final SubLObject rejected_sentence = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw169$WFF_FORMULA, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
            final SubLObject term_violation = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const170$unknownSentence, (SubLObject)ConsesLow.list(wff_modules.$const132$isa, arg, col)), mt);
            SubLObject result = (SubLObject)ConsesLow.list(wff_module);
            SubLObject explanation = (SubLObject)wff_modules.NIL;
            SubLObject justification = (SubLObject)wff_modules.NIL;
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_modules.$kw171$ARGUMENTS, arg, reln, pos, col, mt), result);
            if (wff_modules.NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                justification = (SubLObject)ConsesLow.cons(at_constraint_gaf, justification);
            }
            if (wff_modules.NIL != forts.fort_p(via_genl_pred)) {
                final SubLObject genl_preds_literal = (SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_modules.$kw172$GENLPREDS, genl_preds_literal, mt, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred_support) {
                    justification = (SubLObject)ConsesLow.cons(genl_pred_support, justification);
                }
            }
            else if (wff_modules.NIL != forts.fort_p(via_genl_inverse)) {
                final SubLObject genl_inverse_literal = (SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_modules.$kw172$GENLPREDS, genl_inverse_literal, mt, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred_support) {
                    justification = (SubLObject)ConsesLow.cons(genl_pred_support, justification);
                }
            }
            if (wff_modules.NIL != term_violation) {
                explanation = (SubLObject)ConsesLow.cons(term_violation, explanation);
                justification = (SubLObject)ConsesLow.cons(term_violation, justification);
            }
            if (wff_modules.NIL != explanation) {
                result = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_modules.$kw173$EXPLANATION, ConsesLow.append(explanation, (SubLObject)wff_modules.NIL)), result);
            }
            if (wff_modules.NIL != rejected_sentence) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_modules.$kw174$CONSEQUENCE, (SubLObject)ConsesLow.list(wff_modules.$const175$rejectedSentence, rejected_sentence)), result);
            }
            if (wff_modules.NIL != justification) {
                result = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_modules.$kw176$JUSTIFICATION, ConsesLow.append(Sequences.nreverse(justification), (SubLObject)wff_modules.NIL)), result);
            }
            if (wff_modules.NIL != wff.provide_wff_suggestionsP()) {
                final SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_isa(why_not, (SubLObject)wff_modules.UNPROVIDED);
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)wff_modules.$kw177$CANDIDATE_REPAIRS, suggestions), result);
            }
            return Sequences.nreverse(result);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 32855L)
    public static SubLObject explain_mal_arg_wrt_arg_quoted_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_arg_isa_int(why_not, (SubLObject)wff_modules.$kw135$ARG_QUOTED_ISA, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 33298L)
    public static SubLObject explain_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_modules.NIL != wff_modules.$use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return new_explain_mal_arg_wrt_arg_genl(why_not, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE));
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return nl_explanation_from_why_not(why_not, (SubLObject)wff_modules.$kw142$ARG_GENLS, v_properties);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject constraints = hl_explanation_from_why_not(why_not, (SubLObject)wff_modules.$kw142$ARG_GENLS, (SubLObject)wff_modules.NIL);
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = (SubLObject)wff_modules.NIL;
            SubLObject reln = (SubLObject)wff_modules.NIL;
            SubLObject pos = (SubLObject)wff_modules.NIL;
            SubLObject col = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            SubLObject data = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            reln = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            mt = current.first();
            current = (data = current.rest());
            if (wff_modules.NIL == constraints) {
                final SubLObject genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
                if (wff_modules.NIL != genl_pred) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(genl_pred, reln, col), mt), constraints);
                }
            }
            return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const182$genls, arg, col)), mt), constraints), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 34110L)
    public static SubLObject new_explain_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == wff_modules.UNPROVIDED) {
            io_mode = (SubLObject)wff_modules.$kw3$NL;
        }
        SubLObject wff_module = (SubLObject)wff_modules.NIL;
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(why_not, why_not, (SubLObject)wff_modules.$list166);
        wff_module = why_not.first();
        SubLObject current = why_not.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str183$Term__s_violates_arg_genls__s__, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via_genl_pred) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            final SubLObject at_constraint_gaf = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw168$AT_CONSTRAINT_GAF, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
            final SubLObject rejected_sentence = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw169$WFF_FORMULA, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
            final SubLObject term_violation = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const170$unknownSentence, (SubLObject)ConsesLow.list(wff_modules.$const182$genls, arg, col)), mt);
            SubLObject result = (SubLObject)ConsesLow.list(wff_module);
            SubLObject explanation = (SubLObject)wff_modules.NIL;
            SubLObject justification = (SubLObject)wff_modules.NIL;
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_modules.$kw171$ARGUMENTS, arg, reln, pos, col, mt), result);
            if (wff_modules.NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                justification = (SubLObject)ConsesLow.cons(at_constraint_gaf, justification);
            }
            if (wff_modules.NIL != forts.fort_p(via_genl_pred)) {
                final SubLObject genl_preds_literal = (SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_modules.$kw172$GENLPREDS, genl_preds_literal, mt, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred_support) {
                    justification = (SubLObject)ConsesLow.cons(genl_pred_support, justification);
                }
            }
            else if (wff_modules.NIL != forts.fort_p(via_genl_inverse)) {
                final SubLObject genl_inverse_literal = (SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, via_genl_inverse);
                final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_modules.$kw172$GENLPREDS, genl_inverse_literal, mt, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred_support) {
                    justification = (SubLObject)ConsesLow.cons(genl_pred_support, justification);
                }
            }
            if (wff_modules.NIL != term_violation) {
                explanation = (SubLObject)ConsesLow.cons(term_violation, explanation);
                justification = (SubLObject)ConsesLow.cons(term_violation, justification);
            }
            if (wff_modules.NIL != explanation) {
                result = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_modules.$kw173$EXPLANATION, ConsesLow.append(explanation, (SubLObject)wff_modules.NIL)), result);
            }
            if (wff_modules.NIL != rejected_sentence) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_modules.$kw174$CONSEQUENCE, (SubLObject)ConsesLow.list(wff_modules.$const175$rejectedSentence, rejected_sentence)), result);
            }
            if (wff_modules.NIL != justification) {
                result = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_modules.$kw176$JUSTIFICATION, ConsesLow.append(Sequences.nreverse(justification), (SubLObject)wff_modules.NIL)), result);
            }
            if (wff_modules.NIL != wff.provide_wff_suggestionsP()) {
                final SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_genl(why_not, (SubLObject)wff_modules.UNPROVIDED);
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)wff_modules.$kw177$CANDIDATE_REPAIRS, suggestions), result);
            }
            return Sequences.nreverse(result);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 36694L)
    public static SubLObject explain_mal_arg_wrt_arg_not_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return nl_explanation_from_why_not(why_not, (SubLObject)wff_modules.$kw139$ARG_NOT_ISA, v_properties);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = (SubLObject)wff_modules.NIL;
            SubLObject reln = (SubLObject)wff_modules.NIL;
            SubLObject pos = (SubLObject)wff_modules.NIL;
            SubLObject col = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            SubLObject data = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            reln = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            mt = current.first();
            current = (data = current.rest());
            final SubLObject constraints = hl_explanation_from_why_not(why_not, (SubLObject)wff_modules.$kw139$ARG_NOT_ISA, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject pred = explanation_pred_from_type((SubLObject)wff_modules.$kw139$ARG_NOT_ISA);
            return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(pred, arg, col), mt), constraints), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 37587L)
    public static SubLObject explain_mal_arg_wrt_arg_not_isa_disjoint_int(final SubLObject why_not, final SubLObject constraint_type, final SubLObject io_mode, final SubLObject v_properties) {
        if (io_mode.eql((SubLObject)wff_modules.$kw3$NL)) {
            return nl_explanation_from_why_not_with_disjoint(why_not, constraint_type, v_properties);
        }
        if (io_mode.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject constraints = hl_explanation_from_why_not(why_not, constraint_type, (SubLObject)wff_modules.UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = (SubLObject)wff_modules.NIL;
            SubLObject reln = (SubLObject)wff_modules.NIL;
            SubLObject pos = (SubLObject)wff_modules.NIL;
            SubLObject col = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            SubLObject data = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            reln = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            mt = current.first();
            current = (data = current.rest());
            final SubLObject constraint_pred = at_routines.constraint_pred(constraint_type, pos, reln);
            final SubLObject pred = explanation_pred_from_type(constraint_type);
            if (wff_modules.NIL == constraints && wff_modules.NIL != constraint_pred) {
                constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(constraint_pred, reln, col), mt), constraints);
            }
            return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(pred, arg, col)), mt), constraints), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 38360L)
    public static SubLObject explain_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        if (wff_modules.NIL != wff_modules.$use_experimental_wff_suggestionsP$.getGlobalValue()) {
            return new_explain_mal_arg_wrt_arg_not_isa_disjoint(why_not, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE));
        }
        return explain_mal_arg_wrt_arg_not_isa_disjoint_int(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE), v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 38728L)
    public static SubLObject new_explain_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == wff_modules.UNPROVIDED) {
            io_mode = (SubLObject)wff_modules.$kw3$NL;
        }
        SubLObject wff_module = (SubLObject)wff_modules.NIL;
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(why_not, why_not, (SubLObject)wff_modules.$list166);
        wff_module = why_not.first();
        SubLObject current = why_not.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_modules.$list166);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw97$VIA_GENL_PRED, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl_inverse = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
        final SubLObject via_genl = (wff_modules.NIL != via_genl_pred) ? via_genl_pred : via_genl_inverse;
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str188$Term__s_is_isa_disjoint_with_arg_, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via_genl_pred) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, via_genl) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            final SubLObject at_constraint_gaf = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw168$AT_CONSTRAINT_GAF, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
            final SubLObject rejected_sentence = conses_high.cadr(conses_high.assoc((SubLObject)wff_modules.$kw169$WFF_FORMULA, data, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED));
            final SubLObject term_violation = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const132$isa, arg, col)), mt);
            SubLObject result = (SubLObject)ConsesLow.list(wff_module);
            SubLObject explanation = (SubLObject)wff_modules.NIL;
            SubLObject justification = (SubLObject)wff_modules.NIL;
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_modules.$kw171$ARGUMENTS, arg, reln, pos, col, mt), result);
            if (wff_modules.NIL != assertion_handles.assertion_p(at_constraint_gaf)) {
                justification = (SubLObject)ConsesLow.cons(at_constraint_gaf, justification);
            }
            if (wff_modules.NIL != forts.fort_p(via_genl_pred)) {
                final SubLObject genl_preds_literal = (SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_modules.$kw172$GENLPREDS, genl_preds_literal, mt, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred_support) {
                    justification = (SubLObject)ConsesLow.cons(genl_pred_support, justification);
                }
            }
            else if (wff_modules.NIL != forts.fort_p(via_genl_inverse)) {
                final SubLObject genl_inverse_literal = (SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, via_genl_pred);
                final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_modules.$kw172$GENLPREDS, genl_inverse_literal, mt, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred_support) {
                    justification = (SubLObject)ConsesLow.cons(genl_pred_support, justification);
                }
            }
            if (wff_modules.NIL != term_violation) {
                explanation = (SubLObject)ConsesLow.cons(term_violation, explanation);
                justification = (SubLObject)ConsesLow.cons(term_violation, justification);
            }
            if (wff_modules.NIL != explanation) {
                result = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_modules.$kw173$EXPLANATION, ConsesLow.append(explanation, (SubLObject)wff_modules.NIL)), result);
            }
            if (wff_modules.NIL != rejected_sentence) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_modules.$kw174$CONSEQUENCE, (SubLObject)ConsesLow.list(wff_modules.$const175$rejectedSentence, rejected_sentence)), result);
            }
            if (wff_modules.NIL != justification) {
                result = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_modules.$kw176$JUSTIFICATION, ConsesLow.append(Sequences.nreverse(justification), (SubLObject)wff_modules.NIL)), result);
            }
            if (wff_modules.NIL != wff.provide_wff_suggestionsP()) {
                final SubLObject suggestions = wff_suggest.suggestions_for_mal_arg_wrt_arg_not_isa_disjoint(why_not, (SubLObject)wff_modules.UNPROVIDED);
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)wff_modules.$kw177$CANDIDATE_REPAIRS, suggestions), result);
            }
            return Sequences.nreverse(result);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 41403L)
    public static SubLObject explain_mal_arg_wrt_arg_not_quoted_isa_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        return explain_mal_arg_wrt_arg_not_isa_disjoint_int(why_not, (SubLObject)wff_modules.$kw108$ARG_ISA, wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE), v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 41977L)
    public static SubLObject explain_mal_arg_wrt_arg_not_genls_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return nl_explanation_from_why_not_with_disjoint(why_not, (SubLObject)wff_modules.$kw142$ARG_GENLS, v_properties);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject constraints = hl_explanation_from_why_not(why_not, (SubLObject)wff_modules.$kw142$ARG_GENLS, (SubLObject)wff_modules.UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject arg = (SubLObject)wff_modules.NIL;
            SubLObject reln = (SubLObject)wff_modules.NIL;
            SubLObject pos = (SubLObject)wff_modules.NIL;
            SubLObject col = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            SubLObject data = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            reln = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list149);
            mt = current.first();
            current = (data = current.rest());
            if (wff_modules.NIL == constraints) {
                final SubLObject genl_pred = kb_accessors.arg_genl_pred(pos, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED);
                if (wff_modules.NIL != genl_pred) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(genl_pred, reln, col), mt), constraints);
                }
            }
            return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const193$disjointWith, arg, col), mt), constraints), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 42961L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list196);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str197$Term__s_violates_inter_arg_isa__s, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str198$when_argument__s___s__isa__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                final SubLObject isa_pred = at_utilities.inter_arg_isa_pred(ind_pos, pos);
                SubLObject constraints = (SubLObject)wff_modules.NIL;
                if (wff_modules.NIL != via) {
                    final SubLObject pcase_var_$1 = via.first();
                    if (pcase_var_$1.eql((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE)) {
                        final SubLObject isa_inverse = at_utilities.inter_arg_isa_inverse(ind_pos, pos);
                        final SubLObject inverse = conses_high.second(via);
                        SubLObject constraints_$2 = (SubLObject)wff_modules.NIL;
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(isa_inverse, inverse, ind_arg_isa, col), mt);
                        if (wff_modules.NIL != var) {
                            constraints_$2 = (SubLObject)ConsesLow.cons(var, constraints_$2);
                        }
                        if (wff_modules.NIL != constraints_$2) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, inverse), mt);
                            if (wff_modules.NIL != var) {
                                constraints_$2 = (SubLObject)ConsesLow.cons(var, constraints_$2);
                            }
                        }
                    }
                    else if (pcase_var_$1.eql((SubLObject)wff_modules.$kw97$VIA_GENL_PRED) && wff_modules.NIL != isa_pred) {
                        SubLObject var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(isa_pred, conses_high.second(via), ind_arg_isa, col), mt);
                        if (wff_modules.NIL != var2) {
                            constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var2) {
                                constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                            }
                        }
                    }
                }
                if (wff_modules.NIL == constraints && wff_modules.NIL != isa_pred) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(isa_pred, reln, ind_arg_isa, col), mt), constraints);
                }
                return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const132$isa, arg, col)), mt), (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const132$isa, ind_arg, ind_arg_isa), mt), constraints)), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list196);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 44880L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_not_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list196);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list196);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str201$Term__s_violates_inter_arg_not_is, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str202$when_argument__s___s__not_isa__s_, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                final SubLObject not_isa_pred = at_utilities.inter_arg_not_isa_pred(ind_pos, pos);
                SubLObject constraints = (SubLObject)wff_modules.NIL;
                if (wff_modules.NIL != via) {
                    final SubLObject pcase_var_$3 = via.first();
                    if (pcase_var_$3.eql((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE)) {
                        final SubLObject isa_inverse = at_utilities.inter_arg_not_isa_inverse(ind_pos, pos);
                        final SubLObject inverse = conses_high.second(via);
                        SubLObject constraints_$4 = (SubLObject)wff_modules.NIL;
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(isa_inverse, inverse, ind_arg_isa, col), mt);
                        if (wff_modules.NIL != var) {
                            constraints_$4 = (SubLObject)ConsesLow.cons(var, constraints_$4);
                        }
                        if (wff_modules.NIL != constraints_$4) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, inverse), mt);
                            if (wff_modules.NIL != var) {
                                constraints_$4 = (SubLObject)ConsesLow.cons(var, constraints_$4);
                            }
                        }
                    }
                    else if (pcase_var_$3.eql((SubLObject)wff_modules.$kw97$VIA_GENL_PRED) && wff_modules.NIL != not_isa_pred) {
                        SubLObject var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(not_isa_pred, conses_high.second(via), ind_arg_isa, col), mt);
                        if (wff_modules.NIL != var2) {
                            constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var2) {
                                constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                            }
                        }
                    }
                }
                if (wff_modules.NIL == constraints && wff_modules.NIL != not_isa_pred) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(not_isa_pred, reln, ind_arg_isa, col), mt), constraints);
                }
                return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const132$isa, arg, col), mt), (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const132$isa, ind_arg, ind_arg_isa), mt), constraints)), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list196);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 46810L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_genl = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        ind_arg_genl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list205);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list205);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str206$Term__s_violates_inter_arg_genl__, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, reln), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str207$when_argument__s___s__genl__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_genl }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                final SubLObject genl_pred = at_utilities.inter_arg_genl_pred(ind_pos, pos);
                SubLObject constraints = (SubLObject)wff_modules.NIL;
                if (wff_modules.NIL != via) {
                    final SubLObject pcase_var_$5 = via.first();
                    if (pcase_var_$5.eql((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE)) {
                        final SubLObject genl_inverse = at_utilities.inter_arg_genl_inverse(ind_pos, pos);
                        final SubLObject inverse = conses_high.second(via);
                        SubLObject constraints_$6 = (SubLObject)wff_modules.NIL;
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(genl_inverse, inverse, ind_arg_genl, col), mt);
                        if (wff_modules.NIL != var) {
                            constraints_$6 = (SubLObject)ConsesLow.cons(var, constraints_$6);
                        }
                        if (wff_modules.NIL != constraints_$6) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, inverse), mt);
                            if (wff_modules.NIL != var) {
                                constraints_$6 = (SubLObject)ConsesLow.cons(var, constraints_$6);
                            }
                        }
                    }
                    else if (pcase_var_$5.eql((SubLObject)wff_modules.$kw97$VIA_GENL_PRED) && wff_modules.NIL != genl_pred) {
                        SubLObject var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(genl_pred, conses_high.second(via), ind_arg_genl, col), mt);
                        if (wff_modules.NIL != var2) {
                            constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var2) {
                                constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                            }
                        }
                    }
                }
                if (wff_modules.NIL == constraints && wff_modules.NIL != genl_pred) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(genl_pred, reln, ind_arg_genl, col), mt), constraints);
                }
                return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(wff_modules.$const182$genls, arg, col)), mt), (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const182$genls, ind_arg, ind_arg_genl), mt), constraints)), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list205);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 48659L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list210);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str211$Term__s_violates_defns_of_inter_a, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str198$when_argument__s___s__isa__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return explain_mal_arg_wrt_inter_arg_isa(why_not, (SubLObject)wff_modules.$kw8$HL);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list210);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 49566L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_not_defn(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list210);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str214$Term__s_violates_defns_of_inter_a, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str202$when_argument__s___s__not_isa__s_, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return explain_mal_arg_wrt_inter_arg_not_isa(why_not, (SubLObject)wff_modules.$kw8$HL);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list210);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 50604L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_not_isa_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list210);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str217$Term__s_is_isa_disjoint_with_inte, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str198$when_argument__s___s__isa__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return explain_mal_arg_wrt_inter_arg_isa(why_not, (SubLObject)wff_modules.$kw8$HL);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list210);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 51647L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_not_genl_disjoint(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_genl = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        ind_arg_genl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list220);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str221$Term__s_is_genl_disjoint_with_int, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str198$when_argument__s___s__isa__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_genl }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return explain_mal_arg_wrt_inter_arg_genl(why_not, (SubLObject)wff_modules.$kw8$HL);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list220);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 52648L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_isa_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list210);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list210);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str224$Term__s_is_not_a_spec_of__s__viol, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str198$when_argument__s___s__isa__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.make_negation(el_utilities.make_binary_formula(wff_modules.$const182$genls, arg, col)), el_utilities.make_binary_formula(wff_modules.$const132$isa, ind_arg, ind_arg_isa), (SubLObject)ConsesLow.list(wff_modules.$const225$interArgIsaGenl, rel, ind_pos, ind_arg_isa, pos, col)), (SubLObject)wff_modules.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list210);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 53812L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_genl_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject rel = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_genl = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        ind_arg_genl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list220);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list220);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str228$Term__s_is_not_an_instance_of__s_, arg, col), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str131$applicable_to_argument__s_of_rela, pos, rel), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str229$when_argument__s___s__genls__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_genl }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.make_negation(el_utilities.make_binary_formula(wff_modules.$const132$isa, arg, col)), el_utilities.make_binary_formula(wff_modules.$const230$genl, ind_arg, ind_arg_genl), (SubLObject)ConsesLow.list(wff_modules.$const225$interArgIsaGenl, rel, ind_pos, ind_arg_genl, pos, col)), (SubLObject)wff_modules.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list220);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 54943L)
    public static SubLObject explain_mal_arg_wrt_arg_format(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject format = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject violations = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list233);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list233);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list233);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list233);
        format = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list233);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list233);
        violations = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list233);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str234$Term__s_violates_arg_format__s__, arg, format), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str235$__applicable_to_argument__s_of_re, pos, reln), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str236$___via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str237$__in_mt__s___, mt), (wff_modules.NIL != violations) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str238$______In_conflict__a_________a__, (SubLObject)((wff_modules.NIL != violations.rest()) ? wff_modules.$str239$are : wff_modules.$str240$is), string_utilities.stringify_items(violations, Symbols.symbol_function((SubLObject)wff_modules.$sym241$ASSERTION_FI_IST_FORMULA), (SubLObject)wff_modules.$str242$________, (SubLObject)wff_modules.$str243$__and_______)) : wff_modules.$str18$ });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                SubLObject constraints = (SubLObject)wff_modules.NIL;
                final SubLObject pcase_var_$7 = via.first();
                if (pcase_var_$7.eql((SubLObject)wff_modules.$kw97$VIA_GENL_PRED)) {
                    final SubLObject format_pred = kb_accessors.argn_format_pred(pos);
                    if (wff_modules.NIL != format_pred) {
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(format_pred, conses_high.second(via), format), mt);
                        if (wff_modules.NIL != var) {
                            constraints = (SubLObject)ConsesLow.cons(var, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var) {
                                constraints = (SubLObject)ConsesLow.cons(var, constraints);
                            }
                        }
                    }
                }
                else if (pcase_var_$7.eql((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE)) {
                    final SubLObject format_inverse = kb_accessors.argn_format_inverse(pos);
                    if (wff_modules.NIL != format_inverse) {
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(format_inverse, conses_high.second(via), format), mt);
                        if (wff_modules.NIL != var) {
                            constraints = (SubLObject)ConsesLow.cons(var, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var) {
                                constraints = (SubLObject)ConsesLow.cons(var, constraints);
                            }
                        }
                    }
                }
                else {
                    final SubLObject format_pred = kb_accessors.argn_format_pred(pos);
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(format_pred, reln, format), mt), constraints);
                }
                if (wff_modules.NIL != constraints && wff_modules.NIL != violations) {
                    return simplifier.conjoin(ConsesLow.append(constraints, violations), (SubLObject)wff_modules.UNPROVIDED);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list233);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 56884L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_format(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject arg = (SubLObject)wff_modules.NIL;
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject pos = (SubLObject)wff_modules.NIL;
        SubLObject format = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg_isa = (SubLObject)wff_modules.NIL;
        SubLObject ind_pos = (SubLObject)wff_modules.NIL;
        SubLObject ind_arg = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        format = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        ind_arg_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        ind_pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        ind_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list246);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list246);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject violations = (SubLObject)wff_modules.NIL;
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str247$Term__s_violates_inter_arg_format, arg, format), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str235$__applicable_to_argument__s_of_re, pos, reln), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str236$___via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str248$__when_argument__s___s__isa__s__, new SubLObject[] { ind_pos, ind_arg, ind_arg_isa }), PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str237$__in_mt__s___, mt), (wff_modules.NIL != violations) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str249$______In_conflict__a_________a, (SubLObject)((wff_modules.NIL != violations.rest()) ? wff_modules.$str239$are : wff_modules.$str240$is), string_utilities.stringify_items(violations, Symbols.symbol_function((SubLObject)wff_modules.$sym241$ASSERTION_FI_IST_FORMULA), (SubLObject)wff_modules.$str242$________, (SubLObject)wff_modules.$str243$__and_______)) : wff_modules.$str18$ });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                final SubLObject format_pred = kb_accessors.inter_arg_format_pred(ind_pos, pos);
                SubLObject constraints = (SubLObject)wff_modules.NIL;
                if (wff_modules.NIL != via) {
                    final SubLObject pcase_var_$8 = via.first();
                    if (pcase_var_$8.eql((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE)) {
                        final SubLObject format_inverse = kb_accessors.inter_arg_format_inverse(ind_pos, pos);
                        if (wff_modules.NIL != format_inverse) {
                            SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(format_inverse, conses_high.second(via), ind_arg_isa, format), mt);
                            if (wff_modules.NIL != var) {
                                constraints = (SubLObject)ConsesLow.cons(var, constraints);
                            }
                            if (wff_modules.NIL != constraints) {
                                var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, conses_high.second(via)), mt);
                                if (wff_modules.NIL != var) {
                                    constraints = (SubLObject)ConsesLow.cons(var, constraints);
                                }
                            }
                        }
                    }
                    else if (pcase_var_$8.eql((SubLObject)wff_modules.$kw97$VIA_GENL_PRED) && wff_modules.NIL != format_pred) {
                        SubLObject var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(format_pred, conses_high.second(via), ind_arg_isa, format), mt);
                        if (wff_modules.NIL != var2) {
                            constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var2 = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var2) {
                                constraints = (SubLObject)ConsesLow.cons(var2, constraints);
                            }
                        }
                    }
                }
                if (wff_modules.NIL == constraints && wff_modules.NIL != format_pred) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(format_pred, reln, ind_arg_isa, format), mt), constraints);
                }
                if (wff_modules.NIL != constraints && wff_modules.NIL != violations) {
                    return simplifier.conjoin(ConsesLow.append(constraints, violations), (SubLObject)wff_modules.UNPROVIDED);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list246);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 59005L)
    public static SubLObject explain_mal_arg_wrt_inter_arg_different(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject reln = (SubLObject)wff_modules.NIL;
        SubLObject arg1 = (SubLObject)wff_modules.NIL;
        SubLObject psn1 = (SubLObject)wff_modules.NIL;
        SubLObject arg2 = (SubLObject)wff_modules.NIL;
        SubLObject psn2 = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list252);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list252);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list252);
        psn1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list252);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list252);
        psn2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list252);
        mt = current.first();
        current = current.rest();
        final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list252);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str253$Terms__s_and__s_are_equal__which_, arg1, arg2), new SubLObject[] { PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str254$applicable_to_arguments__s_and__s, new SubLObject[] { psn1, psn2, reln }), (wff_modules.NIL != via) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str101$_via__s___, conses_high.second(via)) : wff_modules.$str18$, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str102$in_mt__s___, mt) });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                SubLObject constraints = (SubLObject)wff_modules.NIL;
                if (wff_modules.NIL != via) {
                    final SubLObject pcase_var_$9 = via.first();
                    if (pcase_var_$9.eql((SubLObject)wff_modules.$kw98$VIA_GENL_INVERSE)) {
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const255$interArgDifferent, conses_high.second(via), psn2, psn1), mt);
                        if (wff_modules.NIL != var) {
                            constraints = (SubLObject)ConsesLow.cons(var, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const148$genlInverse, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var) {
                                constraints = (SubLObject)ConsesLow.cons(var, constraints);
                            }
                        }
                    }
                    else if (pcase_var_$9.eql((SubLObject)wff_modules.$kw97$VIA_GENL_PRED)) {
                        SubLObject var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const255$interArgDifferent, conses_high.second(via), psn1, psn2), mt);
                        if (wff_modules.NIL != var) {
                            constraints = (SubLObject)ConsesLow.cons(var, constraints);
                        }
                        if (wff_modules.NIL != constraints) {
                            var = czer_utilities.find_hl_gaf_if((SubLObject)ConsesLow.list(wff_modules.$const147$genlPreds, reln, conses_high.second(via)), mt);
                            if (wff_modules.NIL != var) {
                                constraints = (SubLObject)ConsesLow.cons(var, constraints);
                            }
                        }
                    }
                }
                if (wff_modules.NIL == constraints) {
                    constraints = (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const255$interArgDifferent, reln, psn1, psn2), mt), constraints);
                }
                return simplifier.conjoin(Sequences.remove((SubLObject)wff_modules.NIL, (SubLObject)ConsesLow.cons(czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const256$equals, arg1, arg2), mt), constraints), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list252);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 60691L)
    public static SubLObject explain_mal_reln_wrt_arg_isa_required(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject relation = (SubLObject)wff_modules.NIL;
        SubLObject argnum = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list259);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list259);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list259);
        mt = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str260$argument__s_of__s_has_no___argIsa, new SubLObject[] { argnum, relation, mt });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const170$unknownSentence, (SubLObject)ConsesLow.list(wff_modules.$const261$thereExists, (SubLObject)wff_modules.$sym262$_COL, (SubLObject)ConsesLow.listS(wff_modules.$const263$argIsa, relation, (SubLObject)wff_modules.$list264))));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list259);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 61521L)
    public static SubLObject explain_conflict_asserting_true_sbhl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject asent = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list267);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list267);
        mt = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pred = el_utilities.literal_predicate(asent, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject arg1 = el_utilities.literal_arg1(asent, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject arg2 = el_utilities.literal_arg2(asent, (SubLObject)wff_modules.UNPROVIDED);
            SubLObject why = (SubLObject)wff_modules.NIL;
            SubLObject detailed_explanation = (SubLObject)wff_modules.$str18$;
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                why = why_sbhl_false(pred, arg1, arg2, mt);
                if (wff_modules.NIL != why) {
                    detailed_explanation = PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str268$sbhl_conflict___s__a__a________be, new SubLObject[] { asent, wff_modules.$kw269$TRUE, mt, string_utilities.stringify_items(why, (SubLObject)wff_modules.$sym270$STRINGIFY_ITEMS, (SubLObject)wff_modules.$str271$_________________, (SubLObject)wff_modules.UNPROVIDED) });
                }
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str272$_s_is_known_not_to_be__a__s_in_mt, new SubLObject[] { arg1, sbhl_nl_inverse(pred), arg2, mt, detailed_explanation });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const9$not, (SubLObject)ConsesLow.list(pred, arg1, arg2)));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list267);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 62300L)
    public static SubLObject why_sbhl_false(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == wff_modules.UNPROVIDED) {
            mt = (SubLObject)wff_modules.NIL;
        }
        if (wff_modules.NIL == sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
            return (SubLObject)wff_modules.NIL;
        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        if (wff_modules.NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            return sbhl_search_methods.why_sbhl_false_predicate_relation_p(module, arg1, arg2, mt, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED);
        }
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(module, arg1, arg2, mt, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 62777L)
    public static SubLObject sbhl_nl_inverse(final SubLObject pred) {
        SubLObject nl_inverse = (SubLObject)wff_modules.$str273$related_to;
        if (pred.eql(wff_modules.$const132$isa)) {
            nl_inverse = (SubLObject)wff_modules.$str274$an_instance_of;
        }
        else if (pred.eql(wff_modules.$const182$genls)) {
            nl_inverse = (SubLObject)wff_modules.$str275$a_spec_of;
        }
        else if (pred.eql(wff_modules.$const276$genlMt)) {
            nl_inverse = (SubLObject)wff_modules.$str277$a_spec_mt_of;
        }
        else if (pred.eql(wff_modules.$const147$genlPreds)) {
            nl_inverse = (SubLObject)wff_modules.$str278$a_spec_pred_of;
        }
        else if (pred.eql(wff_modules.$const148$genlInverse)) {
            nl_inverse = (SubLObject)wff_modules.$str279$a_spec_inverse_of;
        }
        return nl_inverse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 63564L)
    public static SubLObject explain_conflict_asserting_false_sbhl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject asent = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list267);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list267);
        mt = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pred = el_utilities.literal_predicate(asent, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject arg1 = el_utilities.literal_arg1(asent, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject arg2 = el_utilities.literal_arg2(asent, (SubLObject)wff_modules.UNPROVIDED);
            SubLObject why = (SubLObject)wff_modules.NIL;
            SubLObject detailed_explanation = (SubLObject)wff_modules.$str18$;
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                why = why_sbhl_true(pred, arg1, arg2, mt);
                if (wff_modules.NIL != why) {
                    detailed_explanation = PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str282$sbhl_conflict___s__a__a________be, new SubLObject[] { asent, wff_modules.$kw283$FALSE, mt, string_utilities.stringify_items(why, (SubLObject)wff_modules.$sym270$STRINGIFY_ITEMS, (SubLObject)wff_modules.$str271$_________________, (SubLObject)wff_modules.UNPROVIDED) });
                }
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str284$_s_is_known_to_be__a__s_in_mt__s_, new SubLObject[] { arg1, sbhl_nl_inverse(pred), arg2, mt, detailed_explanation });
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(pred, arg1, arg2));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list267);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 64343L)
    public static SubLObject why_sbhl_true(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == wff_modules.UNPROVIDED) {
            mt = (SubLObject)wff_modules.NIL;
        }
        if (wff_modules.NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred)) {
            return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), arg1, arg2, mt, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 64892L)
    public static SubLObject explain_disjointed_arg_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject var = (SubLObject)wff_modules.NIL;
        SubLObject disjoint = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        disjoint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str288$Variable__s_is_subject_to_disjoin, new SubLObject[] { var, disjoint, mt }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject isa_lits = (SubLObject)wff_modules.NIL;
            SubLObject cdolist_list_var = disjoint;
            SubLObject col = (SubLObject)wff_modules.NIL;
            col = cdolist_list_var.first();
            while (wff_modules.NIL != cdolist_list_var) {
                isa_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wff_modules.$const132$isa, var, col), isa_lits);
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const9$not, reader.bq_cons(wff_modules.$const289$and, ConsesLow.append(isa_lits, (SubLObject)wff_modules.NIL))));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 65405L)
    public static SubLObject nl_explanation_of_verbose_data(final SubLObject data) {
        SubLObject explanation_string = (SubLObject)wff_modules.$str18$;
        SubLObject wff_formula = (SubLObject)wff_modules.NIL;
        SubLObject original_formula = (SubLObject)wff_modules.NIL;
        SubLObject expansion_formula = (SubLObject)wff_modules.NIL;
        SubLObject cdolist_list_var = data;
        SubLObject formula_type_formula = (SubLObject)wff_modules.NIL;
        formula_type_formula = cdolist_list_var.first();
        while (wff_modules.NIL != cdolist_list_var) {
            final SubLObject pcase_var = formula_type_formula.first();
            if (pcase_var.eql((SubLObject)wff_modules.$kw169$WFF_FORMULA)) {
                wff_formula = conses_high.second(formula_type_formula);
            }
            else if (pcase_var.eql((SubLObject)wff_modules.$kw290$WFF_EXPANSION_FORMULA)) {
                expansion_formula = conses_high.second(formula_type_formula);
            }
            else if (pcase_var.eql((SubLObject)wff_modules.$kw291$WFF_ORIGINAL_FORMULA)) {
                original_formula = conses_high.second(formula_type_formula);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula_type_formula = cdolist_list_var.first();
        }
        if (wff_formula.equal(original_formula)) {
            if (wff_modules.NIL != wff_formula && wff_modules.NIL != expansion_formula) {
                explanation_string = Sequences.cconcatenate(explanation_string, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str292$__Original_formula______s, wff_formula));
                explanation_string = Sequences.cconcatenate(explanation_string, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str293$__Expansion_formula______s, expansion_formula));
            }
        }
        else {
            if (wff_modules.NIL != original_formula) {
                explanation_string = Sequences.cconcatenate(explanation_string, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str292$__Original_formula______s, original_formula));
            }
            if (wff_modules.NIL != wff_formula) {
                explanation_string = Sequences.cconcatenate(explanation_string, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str294$__WFF_checked_formula______s, wff_formula));
            }
            if (wff_modules.NIL != expansion_formula) {
                explanation_string = Sequences.cconcatenate(explanation_string, PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str293$__Expansion_formula______s, expansion_formula));
            }
        }
        return explanation_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 67074L)
    public static SubLObject explain_disjointed_arg_quoted_isa(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject var = (SubLObject)wff_modules.NIL;
        SubLObject disjoint = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        disjoint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str288$Variable__s_is_subject_to_disjoin, new SubLObject[] { var, disjoint, mt }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject quoted_isa_lits = (SubLObject)wff_modules.NIL;
            SubLObject cdolist_list_var = disjoint;
            SubLObject col = (SubLObject)wff_modules.NIL;
            col = cdolist_list_var.first();
            while (wff_modules.NIL != cdolist_list_var) {
                quoted_isa_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wff_modules.$const10$quotedIsa, var, col), quoted_isa_lits);
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const9$not, reader.bq_cons(wff_modules.$const289$and, ConsesLow.append(quoted_isa_lits, (SubLObject)wff_modules.NIL))));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 67909L)
    public static SubLObject explain_disjointed_arg_genl(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject var = (SubLObject)wff_modules.NIL;
        SubLObject disjoint = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject data = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        disjoint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list287);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str299$Variable__s_is_subject_to_disjoin, new SubLObject[] { var, disjoint, mt }), nl_explanation_of_verbose_data(data));
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            SubLObject genl_lits = (SubLObject)wff_modules.NIL;
            SubLObject cdolist_list_var = disjoint;
            SubLObject col = (SubLObject)wff_modules.NIL;
            col = cdolist_list_var.first();
            while (wff_modules.NIL != cdolist_list_var) {
                genl_lits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wff_modules.$const182$genls, var, col), genl_lits);
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const9$not, reader.bq_cons(wff_modules.$const289$and, ConsesLow.append(genl_lits, (SubLObject)wff_modules.NIL))));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 68703L)
    public static SubLObject explain_isolated_terms(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            SubLObject terms = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list302);
            sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list302);
            terms = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                if (wff_modules.NIL != list_utilities.singletonP(terms)) {
                    return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str303$__s_is_an_isolated_term_in___s___, terms.first(), sentence);
                }
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str304$__s__are_isolated_terms_in___s___, string_utilities.stringify_items(terms, Symbols.symbol_function((SubLObject)wff_modules.$sym305$STR_BY_TYPE), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_), sentence);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list302);
            }
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 69621L)
    public static SubLObject explain_irrelevant_literals(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            SubLObject irrelevant = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list308);
            sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list308);
            irrelevant = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                if (wff_modules.NIL != list_utilities.singletonP(irrelevant)) {
                    return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str309$__s_is_irrelevant_in___s___, irrelevant.first(), sentence);
                }
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str310$__s__are_irrelevant_in___s___, string_utilities.stringify_items(irrelevant, Symbols.symbol_function((SubLObject)wff_modules.$sym305$STR_BY_TYPE), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_), sentence);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list308);
            }
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 70394L)
    public static SubLObject explain_restricted_skolem_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject literal = conses_high.cadr(why_not);
            final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject sk = list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)wff_modules.$sym313$REIFIED_SKOLEM_FN_IN_ANY_MT_), literal, (SubLObject)wff_modules.UNPROVIDED);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str314$Asserting_a_sentence_that_referen, sk, pred);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 71172L)
    public static SubLObject explain_restricted_predicate_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject literal = conses_high.second(why_not);
        final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)wff_modules.UNPROVIDED);
        final SubLObject mt = conses_high.third(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str317$Asserting_a_literal_with_predicat, pred, mt);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const318$notAssertible, pred));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 71922L)
    public static SubLObject explain_restricted_collection_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject literal = conses_high.second(why_not);
        final SubLObject collection = el_utilities.literal_arg2(literal, (SubLObject)wff_modules.UNPROVIDED);
        final SubLObject mt = conses_high.third(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str321$Asserting_an___isa_literal_with_c, collection, mt);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const322$notAssertibleCollection, collection));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 72588L)
    public static SubLObject explain_evaluatable_literal_false(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject literal = conses_high.second(why_not);
        final SubLObject mt = conses_high.third(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str325$Asserting_a_sentence_in_mt__s____, mt, literal);
        }
        if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
            return (SubLObject)ConsesLow.list(wff_modules.$const21$ist, mt, (SubLObject)ConsesLow.list(wff_modules.$const9$not, literal));
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 73271L)
    public static SubLObject explain_except_for_wXo_singleton_var(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject literal = conses_high.cadr(why_not);
            final SubLObject vars = el_utilities.referenced_variables(el_utilities.literal_arg2(literal, (SubLObject)wff_modules.UNPROVIDED), (SubLObject)wff_modules.UNPROVIDED);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str328$__exceptFor_sentence_arg2_must_ha, new SubLObject[] { Sequences.length(vars), (wff_modules.NIL != vars) ? wff_modules.$str329$__ : wff_modules.$str18$, string_utilities.stringify_items(vars, Symbols.symbol_function((SubLObject)wff_modules.$sym305$STR_BY_TYPE), (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_) });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 73960L)
    public static SubLObject explain_invalid_mt_for_tou(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject mt = list_utilities.caddr(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str332$attempt_to_assert___termOfUnit_ga, mt, mt_vars.$tou_mt$.getGlobalValue());
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 74488L)
    public static SubLObject explain_non_defn_pred_in_vocab_mt(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject asent = conses_high.second(why_not);
            final SubLObject pred = cycl_utilities.sentence_arg0(asent);
            final SubLObject mt = conses_high.third(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str335$attempt_to_assert_gaf_with_non_de, pred, mt);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 75069L)
    public static SubLObject explain_predicate_isa_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject pred = (SubLObject)wff_modules.NIL;
        SubLObject col = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list338);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list338);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list338);
        mt = current.first();
        current = current.rest();
        final SubLObject violations = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list338);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str339$___isa__s__s__in_mt__s__, new SubLObject[] { pred, col, mt }), (SubLObject)((wff_modules.NIL != violations) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str249$______In_conflict__a_________a, (SubLObject)((wff_modules.NIL != violations.rest()) ? wff_modules.$str239$are : wff_modules.$str240$is), string_utilities.stringify_items(violations, Symbols.symbol_function((SubLObject)wff_modules.$sym241$ASSERTION_FI_IST_FORMULA), (SubLObject)wff_modules.$str242$________, (SubLObject)wff_modules.$str243$__and_______)) : wff_modules.$str18$));
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                final SubLObject constraint = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(wff_modules.$const132$isa, pred, col), mt);
                if (wff_modules.NIL != constraint) {
                    if (wff_modules.NIL != violations) {
                        return simplifier.conjoin((SubLObject)ConsesLow.cons(constraint, violations), (SubLObject)wff_modules.UNPROVIDED);
                    }
                    return constraint;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list338);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 76016L)
    public static SubLObject explain_meta_predicate_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject pred = (SubLObject)wff_modules.NIL;
        SubLObject meta_pred = (SubLObject)wff_modules.NIL;
        SubLObject meta_pred_value = (SubLObject)wff_modules.NIL;
        SubLObject mt = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list342);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list342);
        meta_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list342);
        meta_pred_value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list342);
        mt = current.first();
        current = current.rest();
        final SubLObject violations = (SubLObject)(current.isCons() ? current.first() : wff_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_modules.$list342);
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return Sequences.cconcatenate(PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str343$__s__s__s__in_mt__s__, new SubLObject[] { meta_pred, pred, meta_pred_value, mt }), (SubLObject)((wff_modules.NIL != violations) ? PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str249$______In_conflict__a_________a, (SubLObject)((wff_modules.NIL != violations.rest()) ? wff_modules.$str239$are : wff_modules.$str240$is), string_utilities.stringify_items(violations, Symbols.symbol_function((SubLObject)wff_modules.$sym241$ASSERTION_FI_IST_FORMULA), (SubLObject)wff_modules.$str242$________, (SubLObject)wff_modules.$str243$__and_______)) : wff_modules.$str18$));
            }
            if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                final SubLObject constraint = czer_utilities.find_hl_gaf((SubLObject)ConsesLow.list(meta_pred, pred, meta_pred_value), mt);
                if (wff_modules.NIL != constraint && wff_modules.NIL != violations) {
                    return simplifier.conjoin((SubLObject)ConsesLow.cons(constraint, violations), (SubLObject)wff_modules.UNPROVIDED);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list342);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 77028L)
    public static SubLObject explain_mal_precanonicalizations(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str346$Uninformative_error_during_precan);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 77472L)
    public static SubLObject explain_invalid_expansion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (!pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return (SubLObject)wff_modules.NIL;
        }
        final SubLObject invalid_sentence = conses_high.second(why_not);
        final SubLObject invalid_operator = conses_high.third(why_not);
        final SubLObject invalid_expansion = conses_high.fourth(why_not);
        final SubLObject generic_arg_nums = (SubLObject)(invalid_expansion.isCons() ? list_utilities.tree_gather(transform_list_utilities.ntransform(transform_list_utilities.transform(invalid_expansion, Symbols.symbol_function((SubLObject)wff_modules.$sym349$INTEGERP), Symbols.symbol_function((SubLObject)wff_modules.$sym350$NULL), (SubLObject)wff_modules.UNPROVIDED), Symbols.symbol_function((SubLObject)wff_modules.$sym351$GENERIC_ARG_P), Symbols.symbol_function((SubLObject)wff_modules.$sym352$GENERIC_ARG_NUM), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED), Symbols.symbol_function((SubLObject)wff_modules.$sym349$INTEGERP), (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED, (SubLObject)wff_modules.UNPROVIDED) : wff_modules.NIL);
        final SubLObject generic_args_max = (SubLObject)(generic_arg_nums.isCons() ? Functions.apply(Symbols.symbol_function((SubLObject)wff_modules.$sym353$MAX), generic_arg_nums) : wff_modules.NIL);
        if (generic_args_max.isInteger() && wff_modules.NIL != el_utilities.formula_arityL(invalid_sentence, generic_args_max, (SubLObject)wff_modules.UNPROVIDED)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str354$_A_has_arity__A__but_the_expansio, new SubLObject[] { invalid_sentence, el_utilities.formula_arity(invalid_sentence, (SubLObject)wff_modules.UNPROVIDED), invalid_operator, generic_args_max, at_utilities.get_generic_arg(generic_args_max) });
        }
        return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str355$_A_does_not_fit_the_pattern_of_th, new SubLObject[] { invalid_sentence, invalid_operator, invalid_expansion });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 78740L)
    public static SubLObject explain_recursion_limit_exceeded(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str358$Recursion_limit_exceeded__probabl);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 79291L)
    public static SubLObject explain_el_unevaluatable_expression(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject expression = conses_high.second(why_not);
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            return Sequences.cconcatenate(format_nil.format_nil_s_no_copy(expression), new SubLObject[] { wff_modules.$str361$_was_marked_as___evaluateAtEL__bu, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue() });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 79828L)
    public static SubLObject explain_quantified_sequence_variable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject quantified_var = conses_high.second(why_not);
            final SubLObject sentence = conses_high.third(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str364$The_variable__A_is_existentially_, quantified_var, sentence);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 80549L)
    public static SubLObject explain_too_many_sequence_vars_in_skolem_scope(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject existential_var = conses_high.second(why_not);
            final SubLObject sequence_vars = conses_high.third(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str367$The_variables__A_were_used_as_seq, sequence_vars, existential_var);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 81332L)
    public static SubLObject explain_ambiguous_var_type_in_skolem_scope(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject ambiguous_var = conses_high.second(why_not);
            final SubLObject sequence_var = conses_high.third(why_not);
            final SubLObject sentence = conses_high.fourth(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str370$The_variable__A_was_used_both_as_, new SubLObject[] { ambiguous_var, sequence_var, sentence });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 82117L)
    public static SubLObject explain_inhibited_sequence_variable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject inhibited_var = conses_high.second(why_not);
            final SubLObject sentence = conses_high.third(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str373$The_variable__A_was_used_as_a_seq, new SubLObject[] { inhibited_var, sentence, inhibited_var });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 82977L)
    public static SubLObject explain_too_many_commutative_in_args_and_rest(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject new_sentence = conses_high.second(why_not);
            final SubLObject old_sentence = conses_high.third(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str376$In_conflict___a___No_more_than_on, new_sentence, old_sentence);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 83701L)
    public static SubLObject explain_cyclic_commutative_in_args(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject new_sentence = conses_high.second(why_not);
            final SubLObject commutative_relation = cycl_utilities.formula_arg1(new_sentence, (SubLObject)wff_modules.UNPROVIDED);
            final SubLObject cia_arg = conses_high.third(why_not);
            final SubLObject old_sentence = conses_high.fourth(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str379$An_assertion_of_partial_commutati, new SubLObject[] { cia_arg, commutative_relation, old_sentence });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 84405L)
    public static SubLObject explain_defining_mt_violation(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            final SubLObject fort = conses_high.second(why_not);
            final SubLObject mt = conses_high.third(why_not);
            final SubLObject mts = conses_high.fourth(why_not);
            return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str382$Term__a_was_referenced_in__a___bu, new SubLObject[] { fort, mt, string_utilities.stringify_items(mts, (SubLObject)wff_modules.$sym5$STR, (SubLObject)wff_modules.$str6$__, (SubLObject)wff_modules.$str7$__and_) });
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 85311L)
    public static SubLObject explain_disjunct_in_pragmatic_requirement(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject pragmatic_condition = (SubLObject)wff_modules.NIL;
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list385);
            pragmatic_condition = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list385);
            sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list385);
            mt = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str386$Disjoint_condition__s_is_present_, new SubLObject[] { pragmatic_condition, sentence, mt });
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list385);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 86139L)
    public static SubLObject explain_bad_exponential_disjunction(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list389);
            sentence = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str390$_s_is_a_disjunction_of_conjunctio, sentence);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list389);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 86994L)
    public static SubLObject explain_bad_exponential_conjunction(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list389);
            sentence = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str393$_s_is_a_conjunction_of_disjunctio, sentence);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list389);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 87809L)
    public static SubLObject explain_restricted_mt_assertion(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject mt = (SubLObject)wff_modules.NIL;
        SubLObject literal = (SubLObject)wff_modules.NIL;
        SubLObject decontextualized_literalP = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list396);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list396);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list396);
        decontextualized_literalP = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                if (wff_modules.NIL != decontextualized_literalP) {
                    return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str397$Asserting_the_decontextualized_li, literal, mt);
                }
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str398$Asserting_the_literal__s_in_micro, literal, mt);
            }
            else if (pcase_var.eql((SubLObject)wff_modules.$kw8$HL)) {
                if (wff_modules.NIL != decontextualized_literalP) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(literal);
                    if (wff_modules.NIL != kb_accessors.decontextualized_predicateP(pred)) {
                        return (SubLObject)ConsesLow.list(wff_modules.$const289$and, (SubLObject)ConsesLow.list(wff_modules.$const399$decontextualizedPredicate, pred), (SubLObject)ConsesLow.list(wff_modules.$const400$predicateConventionMt, pred, mt), (SubLObject)ConsesLow.list(wff_modules.$const401$notAssertibleMt, mt));
                    }
                    if (wff_modules.NIL != kb_accessors.decontextualized_collection_literalP(literal)) {
                        final SubLObject col = cycl_utilities.atomic_sentence_arg2(literal, (SubLObject)wff_modules.UNPROVIDED);
                        return (SubLObject)ConsesLow.list(wff_modules.$const289$and, (SubLObject)ConsesLow.list(wff_modules.$const402$decontextualizedCollection, col), (SubLObject)ConsesLow.list(wff_modules.$const403$collectionConventionMt, col, mt), (SubLObject)ConsesLow.list(wff_modules.$const401$notAssertibleMt, mt));
                    }
                }
                return (SubLObject)ConsesLow.list(wff_modules.$const401$notAssertibleMt, mt);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list396);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 89279L)
    public static SubLObject explain_simplification_to_tautology_due_to_pos_and_neg_literal(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = why_not.rest();
        SubLObject literal = (SubLObject)wff_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list406);
        literal = current.first();
        current = current.rest();
        if (wff_modules.NIL == current) {
            final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
            if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str407$Formula_simplifies_to_a_tautology, literal);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list406);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-modules.lisp", position = 90063L)
    public static SubLObject explain_reifiable_but_not_forward_reifiable(final SubLObject why_not, SubLObject v_properties) {
        if (v_properties == wff_modules.UNPROVIDED) {
            v_properties = (SubLObject)wff_modules.NIL;
        }
        final SubLObject pcase_var = wff_vars.get_wff_property(v_properties, (SubLObject)wff_modules.$kw12$IO_MODE);
        if (pcase_var.eql((SubLObject)wff_modules.$kw3$NL)) {
            SubLObject current;
            final SubLObject datum = current = why_not.rest();
            SubLObject sentence = (SubLObject)wff_modules.NIL;
            SubLObject mt = (SubLObject)wff_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list15);
            sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_modules.$list15);
            mt = current.first();
            current = current.rest();
            if (wff_modules.NIL == current) {
                final SubLObject nat = wff.contains_a_reifiable_but_not_forward_reifiable_natP(sentence, mt);
                return PrintLow.format((SubLObject)wff_modules.NIL, (SubLObject)wff_modules.$str410$Could_not_reify_nat__S____in_sent, new SubLObject[] { nat, sentence, mt });
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_modules.$list15);
        }
        return (SubLObject)wff_modules.NIL;
    }
    
    public static SubLObject declare_wff_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_invalid_variables", "EXPLAIN-INVALID-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_invalid_sentence", "EXPLAIN-INVALID-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_not_an_ascii_string", "EXPLAIN-NOT-AN-ASCII-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_forts", "EXPLAIN-MAL-FORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_fort", "EXPLAIN-MAL-FORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arity", "EXPLAIN-MAL-ARITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_arity_mismatch", "EXPLAIN-ARITY-MISMATCH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_violated_arity", "EXPLAIN-VIOLATED-ARITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_missing_arity", "EXPLAIN-MISSING-ARITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_malformed_args", "EXPLAIN-MALFORMED-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_not_a_denotational_term", "EXPLAIN-NOT-A-DENOTATIONAL-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_not_a_truth_function", "EXPLAIN-NOT-A-TRUTH-FUNCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_not_an_el_formula", "EXPLAIN-NOT-AN-EL-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_not_an_el_variable", "EXPLAIN-NOT-AN-EL-VARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_not_a_list_of_variables", "EXPLAIN-NOT-A-LIST-OF-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_sequence_non_var", "EXPLAIN-SEQUENCE-NON-VAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_expand_subl_fn_irrelevant_term_in_arg1", "EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_invalid_mt", "EXPLAIN-INVALID-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_function_nesting", "EXPLAIN-MAL-FUNCTION-NESTING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_defns_int", "EXPLAIN-MAL-ARG-WRT-DEFNS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_iff_defns", "EXPLAIN-MAL-ARG-WRT-IFF-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_quoted_iff_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_suf_defns", "EXPLAIN-MAL-ARG-WRT-SUF-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_quoted_suf_defns", "EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_nec_defn_int", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_nec_defn", "EXPLAIN-MAL-ARG-WRT-NEC-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_quoted_nec_defn", "EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_col_defn_int", "EXPLAIN-MAL-ARG-WRT-COL-DEFN-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_col_defn", "EXPLAIN-MAL-ARG-WRT-COL-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_col_quoted_defn", "EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explanation_constraint_string", "EXPLANATION-CONSTRAINT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explanation_disjoint_string", "EXPLANATION-DISJOINT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explanation_pred_from_type", "EXPLANATION-PRED-FROM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "hl_explanation_via_genl_pred", "HL-EXPLANATION-VIA-GENL-PRED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "hl_explanation_via_genl_inverse", "HL-EXPLANATION-VIA-GENL-INVERSE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "hl_explanation_for_pred", "HL-EXPLANATION-FOR-PRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "hl_explanation_from_why_not", "HL-EXPLANATION-FROM-WHY-NOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "nl_explanation_from_why_not", "NL-EXPLANATION-FROM-WHY-NOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "nl_explanation_from_why_not_with_disjoint", "NL-EXPLANATION-FROM-WHY-NOT-WITH-DISJOINT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "nl_explanation_of_why_not_terse", "NL-EXPLANATION-OF-WHY-NOT-TERSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "get_type_phrase", "GET-TYPE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_isa_int", "EXPLAIN-MAL-ARG-WRT-ARG-ISA-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_isa", "EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "new_explain_mal_arg_wrt_arg_isa", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_quoted_isa", "EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_genl", "EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "new_explain_mal_arg_wrt_arg_genl", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_not_isa_disjoint_int", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "new_explain_mal_arg_wrt_arg_not_isa_disjoint", "NEW-EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_not_quoted_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_not_genls_disjoint", "EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_not_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_not_defn", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_not_isa_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_not_genl_disjoint", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_isa_genl", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_genl_isa", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_arg_format", "EXPLAIN-MAL-ARG-WRT-ARG-FORMAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_format", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_arg_wrt_inter_arg_different", "EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_reln_wrt_arg_isa_required", "EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_conflict_asserting_true_sbhl", "EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "why_sbhl_false", "WHY-SBHL-FALSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "sbhl_nl_inverse", "SBHL-NL-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_conflict_asserting_false_sbhl", "EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "why_sbhl_true", "WHY-SBHL-TRUE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_disjointed_arg_isa", "EXPLAIN-DISJOINTED-ARG-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "nl_explanation_of_verbose_data", "NL-EXPLANATION-OF-VERBOSE-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_disjointed_arg_quoted_isa", "EXPLAIN-DISJOINTED-ARG-QUOTED-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_disjointed_arg_genl", "EXPLAIN-DISJOINTED-ARG-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_isolated_terms", "EXPLAIN-ISOLATED-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_irrelevant_literals", "EXPLAIN-IRRELEVANT-LITERALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_restricted_skolem_assertion", "EXPLAIN-RESTRICTED-SKOLEM-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_restricted_predicate_assertion", "EXPLAIN-RESTRICTED-PREDICATE-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_restricted_collection_assertion", "EXPLAIN-RESTRICTED-COLLECTION-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_evaluatable_literal_false", "EXPLAIN-EVALUATABLE-LITERAL-FALSE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_except_for_wXo_singleton_var", "EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_invalid_mt_for_tou", "EXPLAIN-INVALID-MT-FOR-TOU", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_non_defn_pred_in_vocab_mt", "EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_predicate_isa_violation", "EXPLAIN-PREDICATE-ISA-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_meta_predicate_violation", "EXPLAIN-META-PREDICATE-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_mal_precanonicalizations", "EXPLAIN-MAL-PRECANONICALIZATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_invalid_expansion", "EXPLAIN-INVALID-EXPANSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_recursion_limit_exceeded", "EXPLAIN-RECURSION-LIMIT-EXCEEDED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_el_unevaluatable_expression", "EXPLAIN-EL-UNEVALUATABLE-EXPRESSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_quantified_sequence_variable", "EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_too_many_sequence_vars_in_skolem_scope", "EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_ambiguous_var_type_in_skolem_scope", "EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_inhibited_sequence_variable", "EXPLAIN-INHIBITED-SEQUENCE-VARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_too_many_commutative_in_args_and_rest", "EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_cyclic_commutative_in_args", "EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_defining_mt_violation", "EXPLAIN-DEFINING-MT-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_disjunct_in_pragmatic_requirement", "EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_bad_exponential_disjunction", "EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_bad_exponential_conjunction", "EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_restricted_mt_assertion", "EXPLAIN-RESTRICTED-MT-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_simplification_to_tautology_due_to_pos_and_neg_literal", "EXPLAIN-SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_modules", "explain_reifiable_but_not_forward_reifiable", "EXPLAIN-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE", 1, 1, false);
        return (SubLObject)wff_modules.NIL;
    }
    
    public static SubLObject init_wff_modules_file() {
        wff_modules.$use_experimental_wff_suggestionsP$ = SubLFiles.deflexical("*USE-EXPERIMENTAL-WFF-SUGGESTIONS?*", (SubLObject)wff_modules.NIL);
        return (SubLObject)wff_modules.NIL;
    }
    
    public static SubLObject setup_wff_modules_file() {
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw0$INVALID_VARIABLES, (SubLObject)wff_modules.$list1);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw13$INVALID_SENTENCE, (SubLObject)wff_modules.$list14);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw24$NOT_AN_ASCII_STRING, (SubLObject)wff_modules.$list25);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw28$MAL_FORTS, (SubLObject)wff_modules.$list29);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw31$MAL_FORT, (SubLObject)wff_modules.$list32);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw35$MAL_ARITY, (SubLObject)wff_modules.$list36);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw41$ARITY_MISMATCH, (SubLObject)wff_modules.$list42);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw45$VIOLATED_ARITY, (SubLObject)wff_modules.$list46);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw55$MISSING_ARITY, (SubLObject)wff_modules.$list56);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw59$MALFORMED_ARGS, (SubLObject)wff_modules.$list60);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw63$NOT_A_DENOTATIONAL_TERM, (SubLObject)wff_modules.$list64);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw66$NOT_A_TRUTH_FUNCTION, (SubLObject)wff_modules.$list67);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw69$NOT_AN_EL_FORMULA, (SubLObject)wff_modules.$list70);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw72$NOT_AN_EL_VARIABLE, (SubLObject)wff_modules.$list73);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw75$NOT_A_LIST_OF_VARIABLES, (SubLObject)wff_modules.$list76);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw78$SEQUENCE_NON_VAR, (SubLObject)wff_modules.$list79);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw82$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, (SubLObject)wff_modules.$list83);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw88$INVALID_MT, (SubLObject)wff_modules.$list89);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw91$MAL_FN_NESTING, (SubLObject)wff_modules.$list92);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw94$MAL_ARG_WRT_IFF_DEFN, (SubLObject)wff_modules.$list95);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw110$MAL_ARG_WRT_QUOTED_IFF_DEFN, (SubLObject)wff_modules.$list111);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw113$MAL_ARG_WRT_SUF_DEFNS, (SubLObject)wff_modules.$list114);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw116$MAL_ARG_WRT_QUOTED_SUF_DEFNS, (SubLObject)wff_modules.$list117);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw119$MAL_ARG_WRT_NEC_DEFN, (SubLObject)wff_modules.$list120);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw124$MAL_ARG_WRT_QUOTED_NEC_DEFN, (SubLObject)wff_modules.$list125);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw127$MAL_ARG_WRT_COL_DEFN, (SubLObject)wff_modules.$list128);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw133$MAL_ARG_WRT_COL_QUOTED_DEFN, (SubLObject)wff_modules.$list134);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw136$MAL_ARG_WRT_ARG_ISA, (SubLObject)wff_modules.$list137);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw178$MAL_ARG_WRT_ARG_QUOTED_ISA, (SubLObject)wff_modules.$list179);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw180$MAL_ARG_WRT_ARG_GENL, (SubLObject)wff_modules.$list181);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw184$MAL_ARG_WRT_ARG_NOT_ISA, (SubLObject)wff_modules.$list185);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw186$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, (SubLObject)wff_modules.$list187);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw189$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, (SubLObject)wff_modules.$list190);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw191$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT, (SubLObject)wff_modules.$list192);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw194$MAL_ARG_WRT_INTER_ARG_ISA, (SubLObject)wff_modules.$list195);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw199$MAL_ARG_WRT_INTER_ARG_NOT_ISA, (SubLObject)wff_modules.$list200);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw203$MAL_ARG_WRT_INTER_ARG_GENL, (SubLObject)wff_modules.$list204);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw208$MAL_ARG_WRT_INTER_ARG_DEFN, (SubLObject)wff_modules.$list209);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw212$MAL_ARG_WRT_INTER_ARG_NOT_DEFN, (SubLObject)wff_modules.$list213);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw215$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, (SubLObject)wff_modules.$list216);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw218$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, (SubLObject)wff_modules.$list219);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw222$MAL_ARG_WRT_INTER_ARG_ISA_GENL, (SubLObject)wff_modules.$list223);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw226$MAL_ARG_WRT_INTER_ARG_GENL_ISA, (SubLObject)wff_modules.$list227);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw231$MAL_ARG_WRT_ARG_FORMAT, (SubLObject)wff_modules.$list232);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw244$MAL_ARG_WRT_INTER_ARG_FORMAT, (SubLObject)wff_modules.$list245);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw250$MAL_ARG_WRT_INTER_ARG_DIFFERENT, (SubLObject)wff_modules.$list251);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw257$MAL_RELN_WRT_ARG_ISA_REQUIRED, (SubLObject)wff_modules.$list258);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw265$CONFLICT_ASSERTING_TRUE_SBHL, (SubLObject)wff_modules.$list266);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw280$CONFLICT_ASSERTING_FALSE_SBHL, (SubLObject)wff_modules.$list281);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw285$DISJOINT_ARG_ISA, (SubLObject)wff_modules.$list286);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw295$DISJOINT_ARG_QUOTED_ISA, (SubLObject)wff_modules.$list296);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw297$DISJOINT_ARG_GENL, (SubLObject)wff_modules.$list298);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw300$ISOLATED_TERMS, (SubLObject)wff_modules.$list301);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw306$IRRELEVANT_LITERALS, (SubLObject)wff_modules.$list307);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw311$RESTRICTED_SKOLEM_ASSERTION, (SubLObject)wff_modules.$list312);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw315$RESTRICTED_PREDICATE_ASSERTION, (SubLObject)wff_modules.$list316);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw319$RESTRICTED_COLLECTION_ASSERTION, (SubLObject)wff_modules.$list320);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw323$EVALUATABLE_LITERAL_FALSE, (SubLObject)wff_modules.$list324);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw326$EXCEPT_FOR_W_O_SINGLETON_VAR, (SubLObject)wff_modules.$list327);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw330$INVALID_MT_FOR_TOU, (SubLObject)wff_modules.$list331);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw333$NON_DEFN_PRED_IN_VOCAB_MT, (SubLObject)wff_modules.$list334);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw336$PREDICATE_ISA_VIOLATION, (SubLObject)wff_modules.$list337);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw340$META_PREDICATE_VIOLATION, (SubLObject)wff_modules.$list341);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw344$MAL_PRECANONICALIZATIONS, (SubLObject)wff_modules.$list345);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw347$INVALID_EXPANSION, (SubLObject)wff_modules.$list348);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw356$RECURSION_LIMIT_EXCEEDED, (SubLObject)wff_modules.$list357);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw359$EL_UNEVALUATABLE_EXPRESSION, (SubLObject)wff_modules.$list360);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw362$QUANTIFIED_SEQUENCE_VARIABLE, (SubLObject)wff_modules.$list363);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw365$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, (SubLObject)wff_modules.$list366);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw368$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, (SubLObject)wff_modules.$list369);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw371$INHIBITED_SEQUENCE_VARIABLE, (SubLObject)wff_modules.$list372);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw374$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, (SubLObject)wff_modules.$list375);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw377$CYCLIC_COMMUTATIVE_IN_ARGS, (SubLObject)wff_modules.$list378);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw380$DEFINING_MT_VIOLATION, (SubLObject)wff_modules.$list381);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw383$DISJUNCT_IN_PRAGMATIC_REQUIREMENT, (SubLObject)wff_modules.$list384);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw387$BAD_EXPONENTIAL_DISJUNCTION, (SubLObject)wff_modules.$list388);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw391$BAD_EXPONENTIAL_CONJUNCTION, (SubLObject)wff_modules.$list392);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw394$RESTRICTED_MT_ASSERTION, (SubLObject)wff_modules.$list395);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw404$SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL, (SubLObject)wff_modules.$list405);
        wff_module_datastructures.wff_violation_module((SubLObject)wff_modules.$kw408$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE, (SubLObject)wff_modules.$list409);
        return (SubLObject)wff_modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wff_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wff_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wff_modules_file();
    }
    
    static {
        me = (SubLFile)new wff_modules();
        wff_modules.$use_experimental_wff_suggestionsP$ = null;
        $kw0$INVALID_VARIABLES = SubLObjectFactory.makeKeyword("INVALID-VARIABLES");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-INVALID-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence has at least one variable which is not a valid variable name."));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $kw3$NL = SubLObjectFactory.makeKeyword("NL");
        $str4$Sentence__s_contains_invalid_vari = SubLObjectFactory.makeString("Sentence ~s contains invalid variable~P: ~a ~% which do~[~;es~:;~] not satisfy the regular expression ~a~%");
        $sym5$STR = SubLObjectFactory.makeSymbol("STR");
        $str6$__ = SubLObjectFactory.makeString(", ");
        $str7$__and_ = SubLObjectFactory.makeString(", and ");
        $kw8$HL = SubLObjectFactory.makeKeyword("HL");
        $const9$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const10$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLVariable")));
        $kw12$IO_MODE = SubLObjectFactory.makeKeyword("IO-MODE");
        $kw13$INVALID_SENTENCE = SubLObjectFactory.makeKeyword("INVALID-SENTENCE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-INVALID-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("Not a well-formed sentence."));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str16$_s_is_not_a_well_formed_sentence_ = SubLObjectFactory.makeString("~s is not a well-formed sentence in ~s.~%");
        $str17$Perhaps__s_is_insufficiently_defi = SubLObjectFactory.makeString("Perhaps ~s is insufficiently defined in mt ~s.~%");
        $str18$ = SubLObjectFactory.makeString("");
        $str19$_s_is_not_a_well_formed_sentence_ = SubLObjectFactory.makeString("~s is not a well-formed sentence.~%");
        $str20$Perhaps__s_is_insufficiently_defi = SubLObjectFactory.makeString("Perhaps ~s is insufficiently defined.~%");
        $const21$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const22$admittedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedSentence"));
        $const23$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $kw24$NOT_AN_ASCII_STRING = SubLObjectFactory.makeKeyword("NOT-AN-ASCII-STRING");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NOT-AN-ASCII-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence references a non-ASCII string."));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $str27$String__s_contains_non_ASCII_char = SubLObjectFactory.makeString("String ~s contains non-ASCII characters.~%");
        $kw28$MAL_FORTS = SubLObjectFactory.makeKeyword("MAL-FORTS");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-FORTS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence references invalid (undefined) Forts."));
        $str30$References_invalid_forts___a___ = SubLObjectFactory.makeString("References invalid forts: ~a.~%");
        $kw31$MAL_FORT = SubLObjectFactory.makeKeyword("MAL-FORT");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-FORT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence references an invalid (undefined) Fort."));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"));
        $str34$FORT__s_is_invalid___ = SubLObjectFactory.makeString("FORT ~s is invalid.~%");
        $kw35$MAL_ARITY = SubLObjectFactory.makeKeyword("MAL-ARITY");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The arity of a predicate is a Non-Negative Integer."));
        $list37 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARITY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str38$The__s_of__s_should_be_a___NonNeg = SubLObjectFactory.makeString("The ~s of ~s should be a #$NonNegativeInteger is ~s.~%");
        $const39$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeInteger")));
        $kw41$ARITY_MISMATCH = SubLObjectFactory.makeKeyword("ARITY-MISMATCH");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-ARITY-MISMATCH"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The number of arguments applied to the relation in the sentence was different than the number of arguments it expected"));
        $list43 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("EXPECTED-ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("GIVEN-ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str44$Arity_mismatch_in__A___A_is_a_n__ = SubLObjectFactory.makeString("Arity mismatch in ~A: ~A is a(n) ~A, so it expects ~D argument~:P, but it is being applied to ~D argument~:P.~%");
        $kw45$VIOLATED_ARITY = SubLObjectFactory.makeKeyword("VIOLATED-ARITY");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-VIOLATED-ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains use of a predicate which does not conform to the arity of the relation."));
        $list47 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARITY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str48$The__s_of__s_is__s___ = SubLObjectFactory.makeString("The ~s of ~s is ~s.~%");
        $const49$arityMin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $const50$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo"));
        $const51$FormulaArityFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArityFn"));
        $const52$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $const53$arityMax = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax"));
        $const54$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $kw55$MISSING_ARITY = SubLObjectFactory.makeKeyword("MISSING-ARITY");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MISSING-ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence uses a relation whose arity has not yet been defined."));
        $list57 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str58$The_arity_of__s_is_unknown___ = SubLObjectFactory.makeString("The arity of ~s is unknown.~%");
        $kw59$MALFORMED_ARGS = SubLObjectFactory.makeKeyword("MALFORMED-ARGS");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MALFORMED-ARGS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The relation got malformed argument list"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $str62$The__A__A_got_the_malformed_argum = SubLObjectFactory.makeString("The ~A ~A got the malformed argument list ~%~A.~%");
        $kw63$NOT_A_DENOTATIONAL_TERM = SubLObjectFactory.makeKeyword("NOT-A-DENOTATIONAL-TERM");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NOT-A-DENOTATIONAL-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is not a denotational term"));
        $str65$_A_is_not_a_denotational_term___ = SubLObjectFactory.makeString("~A is not a denotational term.~%");
        $kw66$NOT_A_TRUTH_FUNCTION = SubLObjectFactory.makeKeyword("NOT-A-TRUTH-FUNCTION");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NOT-A-TRUTH-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is not a truth function in its arg0 position"));
        $str68$Did_not_recognize__A_as_a_truth_f = SubLObjectFactory.makeString("Did not recognize ~A as a truth function (predicate, quantifier, or logical operator).~%");
        $kw69$NOT_AN_EL_FORMULA = SubLObjectFactory.makeKeyword("NOT-AN-EL-FORMULA");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NOT-AN-EL-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula given was not a EL formula"));
        $str71$_A_is_not_an_EL_formula__and_is_n = SubLObjectFactory.makeString("~A is not an EL formula, and is not #$True, #$False, or an EL variable.~%");
        $kw72$NOT_AN_EL_VARIABLE = SubLObjectFactory.makeKeyword("NOT-AN-EL-VARIABLE");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NOT-AN-EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence does not contain an EL variable where an EL variable is expected"));
        $str74$_A_is_not_an_EL_variable___ = SubLObjectFactory.makeString("~A is not an EL variable.~%");
        $kw75$NOT_A_LIST_OF_VARIABLES = SubLObjectFactory.makeKeyword("NOT-A-LIST-OF-VARIABLES");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NOT-A-LIST-OF-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence does not contain a list of EL variable where such a list is expected"));
        $str77$_A_is_not_a_list_of_EL_variables_ = SubLObjectFactory.makeString("~A is not a list of EL variables.~%");
        $kw78$SEQUENCE_NON_VAR = SubLObjectFactory.makeKeyword("SEQUENCE-NON-VAR");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-SEQUENCE-NON-VAR"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula contains an ill-formed sequence variable syntax"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $str81$_A_contains_ill_formed_sequence_v = SubLObjectFactory.makeString("~A contains ill-formed sequence variable syntax; ~A is not a variable.~%");
        $kw82$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1 = SubLObjectFactory.makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence has (#$ExpandSubLFn SUBL-LIST-CONTAINING-NON-VARIABLE SUBL) where SUBL does not mention the non-variables in SUBL-LIST-CONTAINING-NON-VARIABLE."));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VIOLATING-NON-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPAND-SUBL-FN"));
        $str85$Sentence__s___has___ExpandSubLFn_ = SubLObjectFactory.makeString("Sentence ~s ~%has #$ExpandSubLFn formula ~s, ~%which contains the term~P ~a in arg1 ~s ~%not mentioned in its arg2 ~s.~%");
        $const86$trueSubL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL"));
        $sym87$TREE_FIND = SubLObjectFactory.makeSymbol("TREE-FIND");
        $kw88$INVALID_MT = SubLObjectFactory.makeKeyword("INVALID-MT");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-INVALID-MT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The Mt specified for the sentence is not a #$Microtheory."));
        $str90$Mt__s_is_invalid___ = SubLObjectFactory.makeString("Mt ~s is invalid.~%");
        $kw91$MAL_FN_NESTING = SubLObjectFactory.makeKeyword("MAL-FN-NESTING");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-FUNCTION-NESTING"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a function term whose nesting levels exceeds the allowed limit."));
        $str93$Term__s_______has__s_nesting_leve = SubLObjectFactory.makeString("Term ~s~%     has ~s nesting levels but only ~s are permitted.~%");
        $kw94$MAL_ARG_WRT_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-IFF-DEFNS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$defnIff of some collection."));
        $list96 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARG"), new SubLObject[] { SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("PSN"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("DEFNS"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("DATA") });
        $kw97$VIA_GENL_PRED = SubLObjectFactory.makeKeyword("VIA-GENL-PRED");
        $kw98$VIA_GENL_INVERSE = SubLObjectFactory.makeKeyword("VIA-GENL-INVERSE");
        $str99$Term__s__violates__s__s__of_colle = SubLObjectFactory.makeString("Term ~s~%violates ~s ~s~%of collection ~s~%");
        $str100$applicable_to_arg__s_of__s__ = SubLObjectFactory.makeString("applicable to arg ~s of ~s~%");
        $str101$_via__s___ = SubLObjectFactory.makeString("(via ~s)~%");
        $str102$in_mt__s___ = SubLObjectFactory.makeString("in mt ~s.~%");
        $const103$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const104$EvaluateSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluateSubLFn"));
        $const105$ExpandSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $kw106$NL_VERBOSITY = SubLObjectFactory.makeKeyword("NL-VERBOSITY");
        $kw107$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw108$ARG_ISA = SubLObjectFactory.makeKeyword("ARG-ISA");
        $const109$defnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $kw110$MAL_ARG_WRT_QUOTED_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-IFF-DEFNS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$quotedDefnIff of some collection."));
        $const112$quotedDefnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnIff"));
        $kw113$MAL_ARG_WRT_SUF_DEFNS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-SUF-DEFNS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula contains a term which violates #$defnSufficient of some Collection."));
        $const115$defnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $kw116$MAL_ARG_WRT_QUOTED_SUF_DEFNS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-SUF-DEFNS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The formula contains a term which violates #$quotedDefnSufficient of some Collection."));
        $const118$quotedDefnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient"));
        $kw119$MAL_ARG_WRT_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-NEC-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$defnNecessary of some Collection."));
        $list121 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARG"), new SubLObject[] { SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("PSN"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("DEFN-COL"), SubLObjectFactory.makeSymbol("DEFN"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("DATA") });
        $str122$Term__s__violates__s__s___s___of_ = SubLObjectFactory.makeString("Term ~s~%violates ~s ~s (~s)~%of collection ~s~%");
        $const123$defnNecessary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnNecessary"));
        $kw124$MAL_ARG_WRT_QUOTED_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-QUOTED-NEC-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates #$quotedDefnNecessary of some Collection."));
        $const126$quotedDefnNecessary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary"));
        $kw127$MAL_ARG_WRT_COL_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-DEFN");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-COL-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates defns of argIsa to some Collection."));
        $list129 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("REL"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str130$Term__s_violates_defns_of__a__s__ = SubLObjectFactory.makeString("Term ~s violates defns of ~a ~s~%");
        $str131$applicable_to_argument__s_of_rela = SubLObjectFactory.makeString("applicable to argument ~s of relation ~s~%");
        $const132$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw133$MAL_ARG_WRT_COL_QUOTED_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-QUOTED-DEFN");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-COL-QUOTED-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates quoted-defns of argQuotedIsa to some Collection."));
        $kw135$ARG_QUOTED_ISA = SubLObjectFactory.makeKeyword("ARG-QUOTED-ISA");
        $kw136$MAL_ARG_WRT_ARG_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates argIsa constraint."));
        $str138$arg_isa = SubLObjectFactory.makeString("arg-isa");
        $kw139$ARG_NOT_ISA = SubLObjectFactory.makeKeyword("ARG-NOT-ISA");
        $str140$arg_not_isa = SubLObjectFactory.makeString("arg-not-isa");
        $str141$arg_quoted_isa = SubLObjectFactory.makeString("arg-quoted-isa");
        $kw142$ARG_GENLS = SubLObjectFactory.makeKeyword("ARG-GENLS");
        $str143$arg_genls = SubLObjectFactory.makeString("arg-genls");
        $str144$isa_disjoint = SubLObjectFactory.makeString("isa-disjoint");
        $str145$quoted_isa_disjoint = SubLObjectFactory.makeString("quoted-isa-disjoint");
        $str146$disjoint = SubLObjectFactory.makeString("disjoint");
        $const147$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const148$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $list149 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("RELN"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str150$Term__s_violates__a__s__ = SubLObjectFactory.makeString("Term ~s violates ~a ~s~%");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-GENLS"));
        $str152$Term__s_is__a_with__a__s__ = SubLObjectFactory.makeString("Term ~s is ~a with ~a ~s~%");
        $str153$___ = SubLObjectFactory.makeString(".~%");
        $kw154$NL_TERM_MAP = SubLObjectFactory.makeKeyword("NL-TERM-MAP");
        $const155$ParaphraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParaphraseFn"));
        $const156$CycLPhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLPhraseFn"));
        $const157$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $list158 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn")), (SubLObject)wff_modules.NIL);
        $list159 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymbolPhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Comma-TheSymbol")));
        $list160 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFromStringFn")), (SubLObject)SubLObjectFactory.makeString("but is"));
        $const161$ConcatenatePhrasesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn"));
        $list162 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFromStringFn")), (SubLObject)SubLObjectFactory.makeString("must be"));
        $kw163$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $const164$Np_DetNbarFn_Indefinite = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Np-DetNbarFn-Indefinite"));
        $list165 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFromStringFn")), (SubLObject)SubLObjectFactory.makeString("a specialization of"));
        $list166 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("WFF-MODULE"), new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("DATA") });
        $str167$Term__s_violates_arg_isa__s__ = SubLObjectFactory.makeString("Term ~s violates arg-isa ~s~%");
        $kw168$AT_CONSTRAINT_GAF = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $kw169$WFF_FORMULA = SubLObjectFactory.makeKeyword("WFF-FORMULA");
        $const170$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw171$ARGUMENTS = SubLObjectFactory.makeKeyword("ARGUMENTS");
        $kw172$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw173$EXPLANATION = SubLObjectFactory.makeKeyword("EXPLANATION");
        $kw174$CONSEQUENCE = SubLObjectFactory.makeKeyword("CONSEQUENCE");
        $const175$rejectedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rejectedSentence"));
        $kw176$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $kw177$CANDIDATE_REPAIRS = SubLObjectFactory.makeKeyword("CANDIDATE-REPAIRS");
        $kw178$MAL_ARG_WRT_ARG_QUOTED_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates argQuotedIsa constraint."));
        $kw180$MAL_ARG_WRT_ARG_GENL = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-GENL");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-GENL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates a argGenl constraint."));
        $const182$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str183$Term__s_violates_arg_genls__s__ = SubLObjectFactory.makeString("Term ~s violates arg-genls ~s~%");
        $kw184$MAL_ARG_WRT_ARG_NOT_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is an instance of a collection specified to be an argNotIsa."));
        $kw186$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is disjoint with the argIsa constraint."));
        $str188$Term__s_is_isa_disjoint_with_arg_ = SubLObjectFactory.makeString("Term ~s is isa-disjoint with arg-isa ~s~%");
        $kw189$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is disjoint with the argQuotedIsa constraint."));
        $kw191$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT..) which is disjoint with the argGenl contraint."));
        $const193$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $kw194$MAL_ARG_WRT_INTER_ARG_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is violates interArgIsa constraints."));
        $list196 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("IND-ARG-ISA"), SubLObjectFactory.makeSymbol("IND-POS"), SubLObjectFactory.makeSymbol("IND-ARG"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $str197$Term__s_violates_inter_arg_isa__s = SubLObjectFactory.makeString("Term ~s violates inter-arg-isa ~s~%");
        $str198$when_argument__s___s__isa__s__ = SubLObjectFactory.makeString("when argument ~s, ~s, isa ~s~%");
        $kw199$MAL_ARG_WRT_INTER_ARG_NOT_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is violates interArgNotIsa constraints."));
        $str201$Term__s_violates_inter_arg_not_is = SubLObjectFactory.makeString("Term ~s violates inter-arg-not-isa ~s~%");
        $str202$when_argument__s___s__not_isa__s_ = SubLObjectFactory.makeString("when argument ~s, ~s, not isa ~s~%");
        $kw203$MAL_ARG_WRT_INTER_ARG_GENL = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates interArgGenl constraints."));
        $list205 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("IND-ARG-GENL"), SubLObjectFactory.makeSymbol("IND-POS"), SubLObjectFactory.makeSymbol("IND-ARG"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $str206$Term__s_violates_inter_arg_genl__ = SubLObjectFactory.makeString("Term ~s violates inter-arg-genl ~s~%");
        $str207$when_argument__s___s__genl__s__ = SubLObjectFactory.makeString("when argument ~s, ~s, genl ~s~%");
        $kw208$MAL_ARG_WRT_INTER_ARG_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DEFN");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $list210 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("REL"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("IND-ARG-ISA"), SubLObjectFactory.makeSymbol("IND-POS"), SubLObjectFactory.makeSymbol("IND-ARG"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $str211$Term__s_violates_defns_of_inter_a = SubLObjectFactory.makeString("Term ~s violates defns of inter-arg-isa ~s~%");
        $kw212$MAL_ARG_WRT_INTER_ARG_NOT_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-DEFN");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-DEFN"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str214$Term__s_violates_defns_of_inter_a = SubLObjectFactory.makeString("Term ~s violates defns of inter-arg-not-isa ~s~%");
        $kw215$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT..) which is disjoint with the interArgIsa constraint."));
        $str217$Term__s_is_isa_disjoint_with_inte = SubLObjectFactory.makeString("Term ~s is isa-disjoint with inter-arg-isa ~s~%");
        $kw218$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT...) which is disjoint with the interArgGenl constraint."));
        $list220 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("REL"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("IND-ARG-GENL"), SubLObjectFactory.makeSymbol("IND-POS"), SubLObjectFactory.makeSymbol("IND-ARG"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $str221$Term__s_is_genl_disjoint_with_int = SubLObjectFactory.makeString("Term ~s is genl-disjoint with inter-arg-genl ~s~%");
        $kw222$MAL_ARG_WRT_INTER_ARG_ISA_GENL = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA-GENL");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-ISA-GENL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT...) which violates the interArgIsaGenl constraint."));
        $str224$Term__s_is_not_a_spec_of__s__viol = SubLObjectFactory.makeString("Term ~s is not a spec of ~s, violating inter-arg-isa-genl constraint~%");
        $const225$interArgIsaGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl"));
        $kw226$MAL_ARG_WRT_INTER_ARG_GENL_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL-ISA");
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-GENL-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term (NAT...) which violates the interArgGenlIsa constraint."));
        $str228$Term__s_is_not_an_instance_of__s_ = SubLObjectFactory.makeString("Term ~s is not an instance of ~s, violating inter-arg-genl-isa constraint~%");
        $str229$when_argument__s___s__genls__s__ = SubLObjectFactory.makeString("when argument ~s, ~s, genls ~s~%");
        $const230$genl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genl"));
        $kw231$MAL_ARG_WRT_ARG_FORMAT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-ARG-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates argFormat constraint."));
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("RELN"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("VIOLATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VIA"));
        $str234$Term__s_violates_arg_format__s__ = SubLObjectFactory.makeString("Term ~s violates arg-format ~s~%");
        $str235$__applicable_to_argument__s_of_re = SubLObjectFactory.makeString("  applicable to argument ~s of relation ~s~%");
        $str236$___via__s___ = SubLObjectFactory.makeString("  (via ~s)~%");
        $str237$__in_mt__s___ = SubLObjectFactory.makeString("  in mt ~s.~%");
        $str238$______In_conflict__a_________a__ = SubLObjectFactory.makeString("  ~%  In conflict ~a: ~%    ~a~%");
        $str239$are = SubLObjectFactory.makeString("are");
        $str240$is = SubLObjectFactory.makeString("is");
        $sym241$ASSERTION_FI_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FI-IST-FORMULA");
        $str242$________ = SubLObjectFactory.makeString(", ~%    ");
        $str243$__and_______ = SubLObjectFactory.makeString(", and ~%    ");
        $kw244$MAL_ARG_WRT_INTER_ARG_FORMAT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates interArgFormat constraint."));
        $list246 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("FORMAT"), SubLObjectFactory.makeSymbol("IND-ARG-ISA"), SubLObjectFactory.makeSymbol("IND-POS"), SubLObjectFactory.makeSymbol("IND-ARG"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $str247$Term__s_violates_inter_arg_format = SubLObjectFactory.makeString("Term ~s violates inter-arg-format ~s~%");
        $str248$__when_argument__s___s__isa__s__ = SubLObjectFactory.makeString("  when argument ~s, ~s, isa ~s~%");
        $str249$______In_conflict__a_________a = SubLObjectFactory.makeString("  ~%  In conflict ~a: ~%    ~a");
        $kw250$MAL_ARG_WRT_INTER_ARG_DIFFERENT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");
        $list251 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-ARG-WRT-INTER-ARG-DIFFERENT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which violates interArgDifferent constraint."));
        $list252 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("PSN1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("PSN2"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VIA"));
        $str253$Terms__s_and__s_are_equal__which_ = SubLObjectFactory.makeString("Terms ~s and ~s are equal, which violates the inter-arg-different constraint~%");
        $str254$applicable_to_arguments__s_and__s = SubLObjectFactory.makeString("applicable to arguments ~s and ~s of relation ~s~%");
        $const255$interArgDifferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgDifferent"));
        $const256$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw257$MAL_RELN_WRT_ARG_ISA_REQUIRED = SubLObjectFactory.makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-RELN-WRT-ARG-ISA-REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a predicate for which argIsa is not defined when argIsa's are strictly required on a predicate before using it."));
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str260$argument__s_of__s_has_no___argIsa = SubLObjectFactory.makeString("argument ~s of ~s has no #$argIsa constraint in mt ~s.~%");
        $const261$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym262$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const263$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $list264 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $kw265$CONFLICT_ASSERTING_TRUE_SBHL = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-CONFLICT-ASSERTING-TRUE-SBHL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains sentences which violate the current sbhl information."));
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str268$sbhl_conflict___s__a__a________be = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%      because: ~a~%");
        $kw269$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym270$STRINGIFY_ITEMS = SubLObjectFactory.makeSymbol("STRINGIFY-ITEMS");
        $str271$_________________ = SubLObjectFactory.makeString("               ~%");
        $str272$_s_is_known_not_to_be__a__s_in_mt = SubLObjectFactory.makeString("~s is known not to be ~a ~s in mt ~s.  ~%~a~%");
        $str273$related_to = SubLObjectFactory.makeString("related to");
        $str274$an_instance_of = SubLObjectFactory.makeString("an instance of");
        $str275$a_spec_of = SubLObjectFactory.makeString("a spec of");
        $const276$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str277$a_spec_mt_of = SubLObjectFactory.makeString("a spec mt of");
        $str278$a_spec_pred_of = SubLObjectFactory.makeString("a spec pred of");
        $str279$a_spec_inverse_of = SubLObjectFactory.makeString("a spec inverse of");
        $kw280$CONFLICT_ASSERTING_FALSE_SBHL = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-CONFLICT-ASSERTING-FALSE-SBHL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contain sentences which negate the current sbhl information."));
        $str282$sbhl_conflict___s__a__a________be = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%      because: ~a ~%");
        $kw283$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str284$_s_is_known_to_be__a__s_in_mt__s_ = SubLObjectFactory.makeString("~s is known to be ~a ~s in mt ~s.  ~%~a~%");
        $kw285$DISJOINT_ARG_ISA = SubLObjectFactory.makeKeyword("DISJOINT-ARG-ISA");
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-DISJOINTED-ARG-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is said to be #$isa of disjoint collections."));
        $list287 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DISJOINT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $str288$Variable__s_is_subject_to_disjoin = SubLObjectFactory.makeString("Variable ~s is subject to disjoint ~%isa constraints ~s in mt ~s.~%");
        $const289$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw290$WFF_EXPANSION_FORMULA = SubLObjectFactory.makeKeyword("WFF-EXPANSION-FORMULA");
        $kw291$WFF_ORIGINAL_FORMULA = SubLObjectFactory.makeKeyword("WFF-ORIGINAL-FORMULA");
        $str292$__Original_formula______s = SubLObjectFactory.makeString("~%Original formula: ~% ~s");
        $str293$__Expansion_formula______s = SubLObjectFactory.makeString("~%Expansion formula: ~% ~s");
        $str294$__WFF_checked_formula______s = SubLObjectFactory.makeString("~%WFF checked formula: ~% ~s");
        $kw295$DISJOINT_ARG_QUOTED_ISA = SubLObjectFactory.makeKeyword("DISJOINT-ARG-QUOTED-ISA");
        $list296 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-DISJOINTED-ARG-QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is said to be #$quotedIsa of disjoint collections."));
        $kw297$DISJOINT_ARG_GENL = SubLObjectFactory.makeKeyword("DISJOINT-ARG-GENL");
        $list298 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-DISJOINTED-ARG-GENL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains a term which is said to be #$genls of disjoint collections."));
        $str299$Variable__s_is_subject_to_disjoin = SubLObjectFactory.makeString("Variable ~s is subject to disjoint ~%genl constraints ~s in mt ~s.~%");
        $kw300$ISOLATED_TERMS = SubLObjectFactory.makeKeyword("ISOLATED-TERMS");
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-ISOLATED-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains terms which are isolated when strict coherence is enforced."));
        $list302 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"));
        $str303$__s_is_an_isolated_term_in___s___ = SubLObjectFactory.makeString(" ~s is an isolated term in~%~s.~%");
        $str304$__s__are_isolated_terms_in___s___ = SubLObjectFactory.makeString(" ~s~%are isolated terms in~%~s.~%");
        $sym305$STR_BY_TYPE = SubLObjectFactory.makeSymbol("STR-BY-TYPE");
        $kw306$IRRELEVANT_LITERALS = SubLObjectFactory.makeKeyword("IRRELEVANT-LITERALS");
        $list307 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-IRRELEVANT-LITERALS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence contains literals which become irrelevant when strict coherence is enforced. (Normally simplifier takes care of such cases and reduces them.  This violation will be generated in the above case only when simplifier is turned off and coherence checking is done.)."));
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("IRRELEVANT"));
        $str309$__s_is_irrelevant_in___s___ = SubLObjectFactory.makeString(" ~s is irrelevant in~%~s.~%");
        $str310$__s__are_irrelevant_in___s___ = SubLObjectFactory.makeString(" ~s~%are irrelevant in~%~s.~%");
        $kw311$RESTRICTED_SKOLEM_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-SKOLEM-ASSERTION");
        $list312 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-RESTRICTED-SKOLEM-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence attempts to state more about a skolem function, which is not allowed."));
        $sym313$REIFIED_SKOLEM_FN_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?");
        $str314$Asserting_a_sentence_that_referen = SubLObjectFactory.makeString("Asserting a sentence that references a skolem (e.g., ~s) ~%in a literal with predicate ~s is prohibited.~%");
        $kw315$RESTRICTED_PREDICATE_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-PREDICATE-ASSERTION");
        $list316 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-RESTRICTED-PREDICATE-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence attempts to assert a literal with a predicate which is #$notAssertible."));
        $str317$Asserting_a_literal_with_predicat = SubLObjectFactory.makeString("Asserting a literal with predicate ~s is prohibited in mt ~s.~%");
        $const318$notAssertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertible"));
        $kw319$RESTRICTED_COLLECTION_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-COLLECTION-ASSERTION");
        $list320 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-RESTRICTED-COLLECTION-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence attempts to assert members for a collection which is #$notAssertibleCollection."));
        $str321$Asserting_an___isa_literal_with_c = SubLObjectFactory.makeString("Asserting an #$isa literal with collection ~s is prohibited in mt ~s.~%");
        $const322$notAssertibleCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertibleCollection"));
        $kw323$EVALUATABLE_LITERAL_FALSE = SubLObjectFactory.makeKeyword("EVALUATABLE-LITERAL-FALSE");
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-EVALUATABLE-LITERAL-FALSE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str325$Asserting_a_sentence_in_mt__s____ = SubLObjectFactory.makeString("Asserting a sentence in mt ~s ~%  that references a false evaluatable literal: ~%  ~s ~%  is prohibited.~%");
        $kw326$EXCEPT_FOR_W_O_SINGLETON_VAR = SubLObjectFactory.makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");
        $list327 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-EXCEPT-FOR-W/O-SINGLETON-VAR"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str328$__exceptFor_sentence_arg2_must_ha = SubLObjectFactory.makeString("#$exceptFor sentence arg2 must have precisely one variable but has ~s~s~a.~%");
        $str329$__ = SubLObjectFactory.makeString(": ");
        $kw330$INVALID_MT_FOR_TOU = SubLObjectFactory.makeKeyword("INVALID-MT-FOR-TOU");
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-INVALID-MT-FOR-TOU"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str332$attempt_to_assert___termOfUnit_ga = SubLObjectFactory.makeString("attempt to assert #$termOfUnit gaf in mt ~s; it may only be asserted in mt ~s.~%");
        $kw333$NON_DEFN_PRED_IN_VOCAB_MT = SubLObjectFactory.makeKeyword("NON-DEFN-PRED-IN-VOCAB-MT");
        $list334 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-NON-DEFN-PRED-IN-VOCAB-MT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str335$attempt_to_assert_gaf_with_non_de = SubLObjectFactory.makeString("attempt to assert gaf with non-definitional predicate ~S in vocab mt ~s.~%");
        $kw336$PREDICATE_ISA_VIOLATION = SubLObjectFactory.makeKeyword("PREDICATE-ISA-VIOLATION");
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-PREDICATE-ISA-VIOLATION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $list338 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VIOLATIONS"));
        $str339$___isa__s__s__in_mt__s__ = SubLObjectFactory.makeString("(#$isa ~s ~s) in mt ~s~%");
        $kw340$META_PREDICATE_VIOLATION = SubLObjectFactory.makeKeyword("META-PREDICATE-VIOLATION");
        $list341 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-META-PREDICATE-VIOLATION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $list342 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("META-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("META-PRED-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VIOLATIONS"));
        $str343$__s__s__s__in_mt__s__ = SubLObjectFactory.makeString("(~s ~s ~s) in mt ~s~%");
        $kw344$MAL_PRECANONICALIZATIONS = SubLObjectFactory.makeKeyword("MAL-PRECANONICALIZATIONS");
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-MAL-PRECANONICALIZATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str346$Uninformative_error_during_precan = SubLObjectFactory.makeString("Uninformative error during precanonicalization.~%~%");
        $kw347$INVALID_EXPANSION = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $list348 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-INVALID-EXPANSION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $sym349$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym350$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym351$GENERIC_ARG_P = SubLObjectFactory.makeSymbol("GENERIC-ARG-P");
        $sym352$GENERIC_ARG_NUM = SubLObjectFactory.makeSymbol("GENERIC-ARG-NUM");
        $sym353$MAX = SubLObjectFactory.makeSymbol("MAX");
        $str354$_A_has_arity__A__but_the_expansio = SubLObjectFactory.makeString("~A has arity ~A, but the expansion for ~A requires arity ~A, because it references the generic argument ~A.~%");
        $str355$_A_does_not_fit_the_pattern_of_th = SubLObjectFactory.makeString("~A does not fit the pattern of the expansion of ~A, which is ~A.~%");
        $kw356$RECURSION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $list357 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-RECURSION-LIMIT-EXCEEDED"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str358$Recursion_limit_exceeded__probabl = SubLObjectFactory.makeString("Recursion limit exceeded; probably trying to expand a recursive EL relation.~%~%");
        $kw359$EL_UNEVALUATABLE_EXPRESSION = SubLObjectFactory.makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
        $list360 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-EL-UNEVALUATABLE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str361$_was_marked_as___evaluateAtEL__bu = SubLObjectFactory.makeString(" was marked as #$evaluateAtEL, but was unevaluatable.");
        $kw362$QUANTIFIED_SEQUENCE_VARIABLE = SubLObjectFactory.makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
        $list363 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-QUANTIFIED-SEQUENCE-VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str364$The_variable__A_is_existentially_ = SubLObjectFactory.makeString("The variable ~A is existentially quantified and then used as a sequence variable in the sentence~%~A.~%See rule Q2 in the sequence variable specification.");
        $kw365$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = SubLObjectFactory.makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str367$The_variables__A_were_used_as_seq = SubLObjectFactory.makeString("The variables ~A were used as sequence variables within the scope of the existentially quantified variable ~A.  Only one such sequence variable is permitted.  See rule Q3 in the sequence variable specification.");
        $kw368$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = SubLObjectFactory.makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
        $list369 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str370$The_variable__A_was_used_both_as_ = SubLObjectFactory.makeString("The variable ~A was used both as a sequence variable and a term variable within the scope of the existentially quantified variable ~A, in the sentence~%~A.~%See rule Q4 in the sequence variable specification.");
        $kw371$INHIBITED_SEQUENCE_VARIABLE = SubLObjectFactory.makeKeyword("INHIBITED-SEQUENCE-VARIABLE");
        $list372 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-INHIBITED-SEQUENCE-VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str373$The_variable__A_was_used_as_a_seq = SubLObjectFactory.makeString("The variable ~A was used as a sequence variable in the sentence ~A, which is not allowed because ~A is scoped.  See the section on scoping expressions in the sequence variable specification.");
        $kw374$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = SubLObjectFactory.makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");
        $list375 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str376$In_conflict___a___No_more_than_on = SubLObjectFactory.makeString("In conflict: ~a.~%No more than one #$commutativeInArgsAndRest assertion is allowed.~%");
        $kw377$CYCLIC_COMMUTATIVE_IN_ARGS = SubLObjectFactory.makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");
        $list378 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-CYCLIC-COMMUTATIVE-IN-ARGS"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str379$An_assertion_of_partial_commutati = SubLObjectFactory.makeString("An assertion of partial commutativity has already been made about argument position ~a of relation ~a, namely:~%~a.~%");
        $kw380$DEFINING_MT_VIOLATION = SubLObjectFactory.makeKeyword("DEFINING-MT-VIOLATION");
        $list381 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-DEFINING-MT-VIOLATION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString(""));
        $str382$Term__a_was_referenced_in__a___bu = SubLObjectFactory.makeString("Term ~a was referenced in ~a ~%but is defined only in ~a.~%");
        $kw383$DISJUNCT_IN_PRAGMATIC_REQUIREMENT = SubLObjectFactory.makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");
        $list384 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-DISJUNCT-IN-PRAGMATIC-REQUIREMENT"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence is a pragmatic requirement which contains a disjunct.  e.g. (#$pragmaticRequirement (#$or (#$isa ?X #$Dog) (#$isa ?X #$Cat)) (#$implies (#$isa ?X #$DomesticPet) (#$relationInstanceAll #$loves ?X #$HumanChild)))"));
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRAGMATIC-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str386$Disjoint_condition__s_is_present_ = SubLObjectFactory.makeString("Disjoint condition ~s is present in ~%~s ~s. ~%Disjunct condition is not allowed in a pragmatic requirement sentence.~%");
        $kw387$BAD_EXPONENTIAL_DISJUNCTION = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-BAD-EXPONENTIAL-DISJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));
        $list389 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $str390$_s_is_a_disjunction_of_conjunctio = SubLObjectFactory.makeString("~s is a disjunction of conjunctions which was attempted to be converted into CNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");
        $kw391$BAD_EXPONENTIAL_CONJUNCTION = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
        $list392 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-BAD-EXPONENTIAL-CONJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The sentence is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead."));
        $str393$_s_is_a_conjunction_of_disjunctio = SubLObjectFactory.makeString("~s is a conjunction of disjunctions which was attempted to be converted into DNF, but doing so would have yielded bad exponential behavior, so the sentence was deemed ill-formed instead.");
        $kw394$RESTRICTED_MT_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-MT-ASSERTION");
        $list395 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-RESTRICTED-MT-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("The microtheory specified for the the sentence is a #$notAssertibleMt. For decontextualized collection / predicates the specified mt will be taken as the convention mt."));
        $list396 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("DECONTEXTUALIZED-LITERAL?"));
        $str397$Asserting_the_decontextualized_li = SubLObjectFactory.makeString("Asserting the decontextualized literal ~s in its convention mt ~s is prohibited due to a #$notAssertibleMt assertion.");
        $str398$Asserting_the_literal__s_in_micro = SubLObjectFactory.makeString("Asserting the literal ~s in microtheory ~s is prohibited due to a #$notAssertibleMt assertion.");
        $const399$decontextualizedPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decontextualizedPredicate"));
        $const400$predicateConventionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateConventionMt"));
        $const401$notAssertibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertibleMt"));
        $const402$decontextualizedCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decontextualizedCollection"));
        $const403$collectionConventionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionConventionMt"));
        $kw404$SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL = SubLObjectFactory.makeKeyword("SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL");
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("Formula has a literal that occurs in both the antecedent and consequent."));
        $list406 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"));
        $str407$Formula_simplifies_to_a_tautology = SubLObjectFactory.makeString("Formula simplifies to a tautology due to literal ~%~S being both a pos and neg lit.");
        $kw408$REIFIABLE_BUT_NOT_FORWARD_REIFIABLE = SubLObjectFactory.makeKeyword("REIFIABLE-BUT-NOT-FORWARD-REIFIABLE");
        $list409 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLAIN-REIFIABLE-BUT-NOT-FORWARD-REIFIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeString("Don't assert unreified nats with reifiable functors.  non-skolemizeForward functors during forward inference are like notAssertible predicates, and they are both things that WFF needs to verify."));
        $str410$Could_not_reify_nat__S____in_sent = SubLObjectFactory.makeString("Could not reify nat ~S~%  in sentence:~%  ~s~%  as the functor is reifiable but not forward refiable in mt ~s.");
    }
}

/*

	Total time: 1501 ms
	
*/