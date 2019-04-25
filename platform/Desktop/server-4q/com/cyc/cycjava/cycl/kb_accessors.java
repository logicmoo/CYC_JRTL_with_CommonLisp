package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_accessors
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_accessors";
  public static final String myFingerPrint = "da448a081ecede0833e580c07deb5ae0cc370ca9adcf08bd9dbd5e0db6211399";
  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 9294L)
  private static SubLSymbol $decontextualized_weakening_prohibitedP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 20710L)
  public static SubLSymbol $suppress_backchain_forbidden_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 143921L)
  private static SubLSymbol $common_non_skolem_indeterminate_term_denoting_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 147136L)
  private static SubLSymbol $guess_the_cyclist_from_user_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 149101L)
  private static SubLSymbol $smallest_num_index_so_far$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 149211L)
  private static SubLSymbol $most_specialized_fort_so_far$;
  private static final SubLSymbol $sym0$RELATION_;
  private static final SubLList $list1;
  private static final SubLString $str2$Return_T_iff_RELATION_is_a_relati;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const5$EverythingPSC;
  private static final SubLObject $const6$AtemporalNecessarilyEssentialColl;
  private static final SubLSymbol $sym7$REFLEXIVE_PREDICATE_;
  private static final SubLList $list8;
  private static final SubLString $str9$Return_T_iff_PREDICATE_is_a_refle;
  private static final SubLSymbol $sym10$IRREFLEXIVE_PREDICATE_;
  private static final SubLString $str11$Return_T_iff_PREDICATE_is_an_irre;
  private static final SubLSymbol $sym12$SYMMETRIC_PREDICATE_;
  private static final SubLString $str13$Return_T_iff_PREDICATE_is_a_symme;
  private static final SubLSymbol $sym14$ASYMMETRIC_PREDICATE_;
  private static final SubLString $str15$Return_T_iff_PREDICATE_is_an_asym;
  private static final SubLSymbol $sym16$ANTI_SYMMETRIC_PREDICATE_;
  private static final SubLString $str17$Return_T_iff_PREDICATE_is_an_anti;
  private static final SubLSymbol $sym18$TRANSITIVE_PREDICATE_;
  private static final SubLString $str19$Return_T_iff_PREDICATE_is_a_trans;
  private static final SubLSymbol $sym20$COMMUTATIVE_FUNCTION_;
  private static final SubLList $list21;
  private static final SubLString $str22$Return_T_iff_FUNCTION_is_a_commut;
  private static final SubLSymbol $sym23$BINARY_PREDICATE_;
  private static final SubLString $str24$Return_T_iff_PREDICATE_is_a_predi;
  private static final SubLObject $const25$Cyclist;
  private static final SubLObject $const26$HumanCyclist;
  private static final SubLSymbol $sym27$INDIVIDUAL_;
  private static final SubLList $list28;
  private static final SubLString $str29$Return_T_iff_TERM_is_an_individua;
  private static final SubLObject $const30$Set_Mathematical;
  private static final SubLSymbol $sym31$SET_OR_COLLECTION_;
  private static final SubLString $str32$Return_T_iff_TERM_is_a_set_or_col;
  private static final SubLObject $const33$Individual;
  private static final SubLObject $const34$SetOrCollection;
  private static final SubLObject $const35$FirstOrderCollection;
  private static final SubLObject $const36$Thing;
  private static final SubLObject $const37$SubcollectionRelationFunction;
  private static final SubLObject $const38$decontextualizedPredicate;
  private static final SubLObject $const39$predicateConventionMt;
  private static final SubLObject $const40$decontextualizedCollection;
  private static final SubLObject $const41$collectionConventionMt;
  private static final SubLObject $const42$isa;
  private static final SubLObject $const43$genls;
  private static final SubLObject $const44$quotedCollection;
  private static final SubLObject $const45$quotedArgument;
  private static final SubLObject $const46$opaqueArgument;
  private static final SubLObject $const47$minimizeCollectionExtent;
  private static final SubLObject $const48$minimizeExtent;
  private static final SubLSymbol $sym49$FORT_P;
  private static final SubLObject $const50$completeExtentAsserted;
  private static final SubLSymbol $sym51$NON_NEGATIVE_INTEGER_P;
  private static final SubLObject $const52$completeExtentAssertedForValueInA;
  private static final SubLObject $const53$completeExtentEnumerable;
  private static final SubLObject $const54$completeExtentEnumerableViaBackch;
  private static final SubLObject $const55$completeExtentDecidable;
  private static final SubLObject $const56$completeExtentEnumerableForArg;
  private static final SubLObject $const57$completeExtentEnumerableForValueI;
  private static final SubLObject $const58$completeExtentDecidableForValueIn;
  private static final SubLObject $const59$completelyEnumerableCollection;
  private static final SubLObject $const60$collectionCompletelyEnumerableVia;
  private static final SubLObject $const61$completelyDecidableCollection;
  private static final SubLObject $const62$collectionCheckPreferred;
  private static final SubLObject $const63$backchainRequired;
  private static final SubLObject $const64$backchainEncouraged;
  private static final SubLObject $const65$backchainDiscouraged;
  private static final SubLObject $const66$backchainForbidden;
  private static final SubLObject $const67$collectionIsaBackchainRequired;
  private static final SubLObject $const68$collectionGenlsBackchainRequired;
  private static final SubLObject $const69$collectionBackchainRequired;
  private static final SubLObject $const70$collectionIsaBackchainEncouraged;
  private static final SubLObject $const71$collectionGenlsBackchainEncourage;
  private static final SubLObject $const72$collectionBackchainEncouraged;
  private static final SubLSymbol $kw73$TRUE;
  private static final SubLSymbol $sym74$_;
  private static final SubLObject $const75$highlyRelevantTerm;
  private static final SubLObject $const76$irrelevantTerm;
  private static final SubLObject $const77$skolemizeForward;
  private static final SubLObject $const78$forwardReificationRule;
  private static final SubLObject $const79$universalForwardReificationRule;
  private static final SubLObject $const80$argsIsa;
  private static final SubLSymbol $sym81$CYC_VAR_;
  private static final SubLObject $const82$argsQuotedIsa;
  private static final SubLObject $const83$argAndRestIsa;
  private static final SubLObject $const84$argAndRestQuotedIsa;
  private static final SubLSymbol $sym85$INTEGERP;
  private static final SubLSymbol $sym86$ARGN_ISA;
  private static final SubLList $list87;
  private static final SubLString $str88$Returns_a_list_of_the_local_isa_c;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$ARGN_SOMETIMES_ISA;
  private static final SubLSymbol $sym91$ARGN_QUOTED_ISA;
  private static final SubLObject $const92$CycLSentence_Assertible;
  private static final SubLObject $const93$CycLVariable;
  private static final SubLObject $const94$ArgQuotedIsaBinaryPredicate;
  private static final SubLObject $const95$ArgQuotedIsaTernaryPredicate;
  private static final SubLString $str96$illegal_arg_quoted_isa_pred_encou;
  private static final SubLList $list97;
  private static final SubLObject $const98$arg1Isa;
  private static final SubLObject $const99$arg2Isa;
  private static final SubLObject $const100$arg3Isa;
  private static final SubLObject $const101$arg4Isa;
  private static final SubLObject $const102$arg5Isa;
  private static final SubLObject $const103$arg6Isa;
  private static final SubLString $str104$illegal_index_specification_for_a;
  private static final SubLObject $const105$arg1SometimesIsa;
  private static final SubLObject $const106$arg2SometimesIsa;
  private static final SubLObject $const107$arg3SometimesIsa;
  private static final SubLObject $const108$arg4SometimesIsa;
  private static final SubLObject $const109$arg5SometimesIsa;
  private static final SubLObject $const110$arg6SometimesIsa;
  private static final SubLString $str111$illegal_argnum_specification_for_;
  private static final SubLObject $const112$arg1NotIsa;
  private static final SubLObject $const113$arg2NotIsa;
  private static final SubLObject $const114$arg3NotIsa;
  private static final SubLObject $const115$arg4NotIsa;
  private static final SubLObject $const116$arg5NotIsa;
  private static final SubLObject $const117$argsNotIsa;
  private static final SubLString $str118$illegal_index_specification_for_a;
  private static final SubLString $str119$illegal_argnum_specification_for_;
  private static final SubLObject $const120$arg1QuotedIsa;
  private static final SubLObject $const121$arg2QuotedIsa;
  private static final SubLObject $const122$arg3QuotedIsa;
  private static final SubLObject $const123$arg4QuotedIsa;
  private static final SubLObject $const124$arg5QuotedIsa;
  private static final SubLObject $const125$arg6QuotedIsa;
  private static final SubLString $str126$illegal_index_specification_for_a;
  private static final SubLString $str127$illegal_argnum_specification_for_;
  private static final SubLString $str128$invalid_argument_to_inverse_argnu;
  private static final SubLObject $const129$arg1Genl;
  private static final SubLObject $const130$arg2Genl;
  private static final SubLObject $const131$arg3Genl;
  private static final SubLObject $const132$arg4Genl;
  private static final SubLObject $const133$arg5Genl;
  private static final SubLObject $const134$arg6Genl;
  private static final SubLObject $const135$argsGenl;
  private static final SubLSymbol $sym136$INDEXED_TERM_P;
  private static final SubLSymbol $sym137$MIN_ARGN_ISA;
  private static final SubLList $list138;
  private static final SubLString $str139$Returns_a_list_of_the_most_specif;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLObject $const142$argIsa;
  private static final SubLSymbol $sym143$ARGN_ISA_OF;
  private static final SubLList $list144;
  private static final SubLString $str145$Returns_the_relations_for_which_C;
  private static final SubLObject $const146$ArgGenlBinaryPredicate;
  private static final SubLObject $const147$ArgGenlTernaryPredicate;
  private static final SubLString $str148$illegal_arg_genl_pred_encountered;
  private static final SubLSymbol $sym149$ARGN_GENL;
  private static final SubLString $str150$Returns_the_local_genl_constraint;
  private static final SubLObject $const151$argAndRestGenl;
  private static final SubLString $str152$illegal_index_specification_for_a;
  private static final SubLString $str153$illegal_argnum_specification_for_;
  private static final SubLSymbol $sym154$MIN_ARGN_GENL;
  private static final SubLString $str155$Return_a_list_of_the_most_specifi;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLObject $const158$argGenl;
  private static final SubLSymbol $sym159$ARGN_GENL_OF;
  private static final SubLString $str160$Returns_a_list_of_the_predicates_;
  private static final SubLObject $const161$interArgIsa1_2;
  private static final SubLSymbol $sym162$INTER_ARG_ISA1_2;
  private static final SubLList $list163;
  private static final SubLString $str164$return_a_list_of_pairs_of___arg1_;
  private static final SubLList $list165;
  private static final SubLObject $const166$interArgIsa2_1;
  private static final SubLObject $const167$interArgIsa3_1;
  private static final SubLObject $const168$interArgIsa4_1;
  private static final SubLObject $const169$interArgIsa5_1;
  private static final SubLObject $const170$interArgIsa3_2;
  private static final SubLObject $const171$interArgIsa4_2;
  private static final SubLObject $const172$interArgIsa5_2;
  private static final SubLObject $const173$interArgIsa1_3;
  private static final SubLObject $const174$interArgIsa2_3;
  private static final SubLObject $const175$interArgIsa4_3;
  private static final SubLObject $const176$interArgIsa5_3;
  private static final SubLObject $const177$interArgIsa1_4;
  private static final SubLObject $const178$interArgIsa2_4;
  private static final SubLObject $const179$interArgIsa3_4;
  private static final SubLObject $const180$interArgIsa5_4;
  private static final SubLObject $const181$interArgIsa1_5;
  private static final SubLObject $const182$interArgIsa2_5;
  private static final SubLObject $const183$interArgIsa3_5;
  private static final SubLObject $const184$interArgIsa4_5;
  private static final SubLList $list185;
  private static final SubLList $list186;
  private static final SubLList $list187;
  private static final SubLList $list188;
  private static final SubLList $list189;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLList $list192;
  private static final SubLList $list193;
  private static final SubLList $list194;
  private static final SubLObject $const195$defnIff;
  private static final SubLObject $const196$defnSufficient;
  private static final SubLObject $const197$defnNecessary;
  private static final SubLObject $const198$quotedDefnIff;
  private static final SubLObject $const199$quotedDefnSufficient;
  private static final SubLObject $const200$quotedDefnNecessary;
  private static final SubLSymbol $sym201$DEFINING_DEFNS;
  private static final SubLList $list202;
  private static final SubLString $str203$Return_a_list_of_the_local_defini;
  private static final SubLSymbol $sym204$NECESSARY_DEFNS;
  private static final SubLString $str205$Return_a_list_of_the_local_necess;
  private static final SubLSymbol $sym206$SUFFICIENT_DEFNS;
  private static final SubLString $str207$Return_a_list_of_the_local_suffic;
  private static final SubLSymbol $sym208$ALL_SUFFICIENT_DEFNS;
  private static final SubLString $str209$Return_a_list_of_all_sufficient_d;
  private static final SubLObject $const210$resultIsa;
  private static final SubLObject $const211$resultIsaArg;
  private static final SubLObject $const212$resultIsaArgIsa;
  private static final SubLObject $const213$resultIsaWhenArgIsa;
  private static final SubLObject $const214$closedUnder;
  private static final SubLObject $const215$FormulaArgFn;
  private static final SubLObject $const216$FunctionToArg;
  private static final SubLSymbol $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS;
  private static final SubLObject $const218$relationAllInstance;
  private static final SubLSymbol $sym219$MAPPING_FUNCALL_ARG;
  private static final SubLObject $const220$evaluationResultQuotedIsa;
  private static final SubLObject $const221$resultQuotedIsa;
  private static final SubLObject $const222$resultGenl;
  private static final SubLObject $const223$resultGenlArg;
  private static final SubLSymbol $sym224$RESULT_ISA;
  private static final SubLList $list225;
  private static final SubLString $str226$Return_a_list_of_the_collections_;
  private static final SubLList $list227;
  private static final SubLSymbol $sym228$RESULT_ISA_VIA_CLOSED_UNDER;
  private static final SubLInteger $int229$512;
  private static final SubLSymbol $sym230$RESULT_INTER_ARG_ISA;
  private static final SubLObject $const231$interArgResultIsa;
  private static final SubLSymbol $sym232$RESULT_INTER_ARG_ISA_RELN;
  private static final SubLObject $const233$interArgResultIsaReln;
  private static final SubLList $list234;
  private static final SubLList $list235;
  private static final SubLSymbol $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS;
  private static final SubLSymbol $sym237$EVALUATION_RESULT_QUOTED_ISA;
  private static final SubLString $str238$return_the_collections_that_inclu;
  private static final SubLSymbol $sym239$RESULT_QUOTED_ISA;
  private static final SubLString $str240$return_the_collections_that_inclu;
  private static final SubLObject $const241$interArgResultGenl;
  private static final SubLObject $const242$interArgResultGenlReln;
  private static final SubLObject $const243$arg1Format;
  private static final SubLObject $const244$arg2Format;
  private static final SubLObject $const245$arg3Format;
  private static final SubLObject $const246$arg4Format;
  private static final SubLObject $const247$arg5Format;
  private static final SubLObject $const248$arg6Format;
  private static final SubLString $str249$illegal_arg_specification_for_arg;
  private static final SubLObject $const250$singleEntryFormatInArgs;
  private static final SubLObject $const251$SingleEntry;
  private static final SubLList $list252;
  private static final SubLObject $const253$interArgFormat1_2;
  private static final SubLObject $const254$interArgFormat2_1;
  private static final SubLList $list255;
  private static final SubLList $list256;
  private static final SubLList $list257;
  private static final SubLList $list258;
  private static final SubLList $list259;
  private static final SubLList $list260;
  private static final SubLList $list261;
  private static final SubLList $list262;
  private static final SubLList $list263;
  private static final SubLList $list264;
  private static final SubLObject $const265$requiredArg1Pred;
  private static final SubLObject $const266$requiredArg2Pred;
  private static final SubLString $str267$illegal_required_pred_for_require;
  private static final SubLString $str268$illegal_arg_number_for_required_p;
  private static final SubLList $list269;
  private static final SubLList $list270;
  private static final SubLList $list271;
  private static final SubLList $list272;
  private static final SubLList $list273;
  private static final SubLList $list274;
  private static final SubLSymbol $sym275$MTS_OF_PREDICATE_TYPE_INT;
  private static final SubLObject $const276$ArgTypePredicate;
  private static final SubLObject $const277$genlMt;
  private static final SubLObject $const278$fanOutArg;
  private static final SubLSymbol $kw279$SUPERIOR_;
  private static final SubLObject $const280$coExtensional;
  private static final SubLObject $const281$BookkeepingMt;
  private static final SubLSymbol $sym282$HLMT_P;
  private static final SubLObject $const283$myReviewer;
  private static final SubLSymbol $sym284$REVIEWER;
  private static final SubLList $list285;
  private static final SubLString $str286$Identify_the_cyclist_who_reviewed;
  private static final SubLList $list287;
  private static final SubLList $list288;
  private static final SubLObject $const289$comment;
  private static final SubLSymbol $sym290$COMMENT;
  private static final SubLList $list291;
  private static final SubLString $str292$Return_the_comment_string_for_FOR;
  private static final SubLList $list293;
  private static final SubLList $list294;
  private static final SubLSymbol $sym295$COMMENT_IF_FORT;
  private static final SubLSymbol $sym296$CYCLIST_NOTES;
  private static final SubLObject $const297$cyclistNotes;
  private static final SubLSymbol $sym298$INDEX_ARG_REFERENCES_IN_STRING_;
  private static final SubLSymbol $sym299$GATHER_ARG_OF_SELECTED_GAF_ASSERTION;
  private static final SubLString $str300$mapping_Cyc_assertions;
  private static final SubLSymbol $sym301$STRINGP;
  private static final SubLSymbol $kw302$SKIP;
  private static final SubLSymbol $sym303$CONSTANT_NAME;
  private static final SubLSymbol $sym304$STR;
  private static final SubLSymbol $sym305$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw306$GAF;
  private static final SubLSymbol $sym307$GATHER_ASSERTIONS;
  private static final SubLString $str308$____in_mt____s_;
  private static final SubLString $str309$__EL____S_;
  private static final SubLSymbol $kw310$ALL;
  private static final SubLString $str311$___a___;
  private static final SubLSymbol $sym312$PRINT_ARG;
  private static final SubLSymbol $sym313$GATHER_FN_OF_ARG;
  private static final SubLList $list314;
  private static final SubLString $str315$____missing_doc_preds_;
  private static final SubLString $str316$__A;
  private static final SubLString $str317$_____a;
  private static final SubLString $str318$_______a;
  private static final SubLString $str319$______;
  private static final SubLString $str320$________;
  private static final SubLObject $const321$scopingArg;
  private static final SubLObject $const322$InferencePSC;
  private static final SubLSymbol $sym323$ALL_TERM_ASSERTIONS;
  private static final SubLList $list324;
  private static final SubLString $str325$Return_a_list_of_all_the_assertio;
  private static final SubLList $list326;
  private static final SubLList $list327;
  private static final SubLSymbol $sym328$MAPPING_ANSWER_FOUND_;
  private static final SubLSymbol $kw329$MAPPING_DONE;
  private static final SubLSymbol $sym330$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym331$GATHER_SOME_ASSERTIONS;
  private static final SubLSymbol $sym332$ASSERTION_FI_FORMULA;
  private static final SubLSymbol $sym333$ASSERTION_MENTIONS_KBA_PRED_;
  private static final SubLObject $const334$retainTerm;
  private static final SubLSymbol $sym335$ISA_RELEVANT_ASSERTIONS;
  private static final SubLList $list336;
  private static final SubLString $str337$Return_a_list_of_all__e_g___inher;
  private static final SubLSymbol $kw338$NEG;
  private static final SubLSymbol $kw339$POS;
  private static final SubLSymbol $sym340$ISA_RELEVANT_ASSERTIONS_WRT_TYPE;
  private static final SubLList $list341;
  private static final SubLString $str342$Returns_a_list_of_all__e_g___inhe;
  private static final SubLSymbol $sym343$ASSERTION_FORMULA;
  private static final SubLSymbol $sym344$GAF_ASSERTION_;
  private static final SubLList $list345;
  private static final SubLList $list346;
  private static final SubLSymbol $kw347$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw348$MT;
  private static final SubLSymbol $kw349$TRUTH;
  private static final SubLSymbol $kw350$DONE;
  private static final SubLSymbol $sym351$PRED_VAR;
  private static final SubLSymbol $sym352$DO_ALL_FORT_INSTANCES;
  private static final SubLSymbol $sym353$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym354$DO_GAF_ARG_INDEX;
  private static final SubLSymbol $kw355$PREDICATE;
  private static final SubLSymbol $sym356$DO_GAFS_WRT_PRED_TYPE;
  private static final SubLString $str357$iterate_over_every_gaf_assertion_;
  private static final SubLSymbol $kw358$BREADTH;
  private static final SubLSymbol $kw359$QUEUE;
  private static final SubLSymbol $kw360$STACK;
  private static final SubLSymbol $sym361$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw362$ERROR;
  private static final SubLString $str363$_A_is_not_a__A;
  private static final SubLSymbol $sym364$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw365$CERROR;
  private static final SubLString $str366$continue_anyway;
  private static final SubLSymbol $kw367$WARN;
  private static final SubLString $str368$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str369$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str370$attempting_to_bind_direction_link;
  private static final SubLList $list371;
  private static final SubLString $str372$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym373$GATHER_RELATION_TYPES;
  private static final SubLObject $const374$relationAllExists;
  private static final SubLSymbol $sym375$GATHER_RELATION_TYPES_SP;
  private static final SubLObject $const376$definingMt;
  private static final SubLObject $const377$hypotheticalTerm;
  private static final SubLObject $const378$notAssertible;
  private static final SubLObject $const379$notAssertibleCollection;
  private static final SubLObject $const380$notAssertibleMt;
  private static final SubLObject $const381$IndexicalConcept;
  private static final SubLList $list382;
  private static final SubLObject $const383$IndeterminateTermDenotingFunction;
  private static final SubLObject $const384$IndeterminateTerm;
  private static final SubLObject $const385$NonSkolemIndeterminateTerm;
  private static final SubLObject $const386$nonAbducibleRule;
  private static final SubLObject $const387$TermExemptFromUniqueNamesAssumpti;
  private static final SubLString $str388$_cyc_com;
  private static final SubLString $str389$Can_t_get_the_email_address_of_a_;
  private static final SubLObject $const390$preferredEMailAddressText;
  private static final SubLObject $const391$localEMailAddressText;
  private static final SubLSymbol $sym392$GUESS_THE_CYCLIST_FROM_USER_NAME;
  private static final SubLList $list393;
  private static final SubLObject $const394$and;
  private static final SubLList $list395;
  private static final SubLSymbol $sym396$_CYCLIST;
  private static final SubLList $list397;
  private static final SubLSymbol $sym398$_GUESS_THE_CYCLIST_FROM_USER_NAME_CACHING_STATE_;
  private static final SubLInteger $int399$64;
  private static final SubLSymbol $sym400$CLEAR_GUESS_THE_CYCLIST_FROM_USER_NAME;
  private static final SubLSymbol $sym401$POSSIBLY_UPDATE_MOST_SPECIALIZED_FORT;

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 705L)
  public static SubLObject relationP(final SubLObject relation)
  {
    return fort_types_interface.relation_p( relation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 971L)
  public static SubLObject relation_in_any_mtP(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
      result = fort_types_interface.relation_p( relation );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 1167L)
  public static SubLObject anectP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.isaP( v_object, $const6$AtemporalNecessarilyEssentialColl, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 1308L)
  public static SubLObject reflexive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.reflexive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 1486L)
  public static SubLObject irreflexive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.irreflexive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 1671L)
  public static SubLObject symmetric_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.symmetric_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 1849L)
  public static SubLObject asymmetric_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.asymmetric_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 2031L)
  public static SubLObject anti_symmetric_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.anti_symmetric_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 2225L)
  public static SubLObject transitive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.transitive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 2406L)
  public static SubLObject anti_transitive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.anti_transitive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 2577L)
  public static SubLObject documentation_predicate_in_any_mt_p(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
      result = fort_types_interface.documentation_predicate_p( predicate, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 2857L)
  public static SubLObject fast_documentation_predicate_p(final SubLObject predicate)
  {
    return documentation_predicate_in_any_mt_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 3055L)
  public static SubLObject fast_documentation_assertion_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != fast_documentation_predicate_p( assertions_high.gaf_predicate( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 3306L)
  public static SubLObject at_least_partially_commutative_relationP(final SubLObject relation)
  {
    return makeBoolean( NIL != fort_types_interface.commutative_relation_p( relation ) || NIL != fort_types_interface.partially_commutative_relation_p( relation ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 3561L)
  public static SubLObject commutative_functionP(final SubLObject function)
  {
    return makeBoolean( NIL != fort_types_interface.functionP( function ) && NIL != fort_types_interface.commutative_relationP( function ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 3765L)
  public static SubLObject binary_predicateP(final SubLObject predicate)
  {
    return makeBoolean( NIL != fort_types_interface.predicate_p( predicate ) && arity.arity( predicate ).eql( TWO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 3963L)
  public static SubLObject ternary_predicateP(final SubLObject predicate)
  {
    return makeBoolean( NIL != fort_types_interface.predicate_p( predicate ) && arity.arity( predicate ).eql( THREE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 4125L)
  public static SubLObject cyclistP(final SubLObject v_term)
  {
    return isa.isa_in_any_mtP( v_term, $const25$Cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 4259L)
  public static SubLObject human_cyclistP(final SubLObject v_term)
  {
    return isa.isa_in_any_mtP( v_term, $const26$HumanCyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 4974L)
  public static SubLObject individualP(final SubLObject v_term)
  {
    return makeBoolean( NIL == set_or_collectionP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 5272L)
  public static SubLObject set_or_collectionP(final SubLObject v_term)
  {
    return makeBoolean( NIL != fort_types_interface.isa_collectionP( v_term, UNPROVIDED ) || NIL != at_defns.quiet_has_typeP( v_term, $const30$Set_Mathematical, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 5507L)
  public static SubLObject kb_individual_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const33$Individual );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 5831L)
  public static SubLObject kb_set_mathematical_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const30$Set_Mathematical );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 6012L)
  public static SubLObject kb_set_or_collection_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const34$SetOrCollection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 6231L)
  public static SubLObject kb_first_order_collection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != fort_types_interface.collection_in_any_mtP( v_object ) && NIL != isa.isa_in_any_mtP( v_object, $const35$FirstOrderCollection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 6470L)
  public static SubLObject kb_thing_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const36$Thing );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 6618L)
  public static SubLObject subcollection_relation_function_p(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const37$SubcollectionRelationFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 6804L)
  public static SubLObject subcollection_relation_function_expression_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_nat_p( v_object ) && NIL != subcollection_relation_function_p( cycl_utilities.nat_functor( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 6973L)
  public static SubLObject decontextualized_predicateP(final SubLObject predicate)
  {
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, $const38$decontextualizedPredicate, mt_vars.$decontextualized_predicate_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 7393L)
  public static SubLObject predicate_convention_mt(final SubLObject predicate)
  {
    final SubLObject kb_value = kb_mapping_utilities.fpred_value_in_any_mt( predicate, $const39$predicateConventionMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != kb_value ) ? kb_value : mt_vars.$default_convention_mt$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 7581L)
  public static SubLObject decontextualized_collectionP(final SubLObject collection)
  {
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const40$decontextualizedCollection, mt_vars.$decontextualized_collection_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 7887L)
  public static SubLObject collection_convention_mt(final SubLObject collection)
  {
    final SubLObject kb_value = kb_mapping_utilities.fpred_value_in_any_mt( collection, $const41$collectionConventionMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != kb_value ) ? kb_value : mt_vars.$default_convention_mt$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 8078L)
  public static SubLObject decontextualized_literalP(final SubLObject literal)
  {
    if( NIL != el_utilities.el_formula_p( literal ) )
    {
      final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
      return makeBoolean( NIL != forts.fort_p( predicate ) && ( NIL != decontextualized_predicateP( predicate ) || NIL != decontextualized_collection_literalP( literal ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 8359L)
  public static SubLObject decontextualized_literal_convention_mt(final SubLObject literal)
  {
    if( NIL != decontextualized_collection_literalP( literal ) )
    {
      return collection_convention_mt( cycl_utilities.sentence_arg2( el_utilities.literal_atomic_sentence( literal ), UNPROVIDED ) );
    }
    return predicate_convention_mt( el_utilities.literal_predicate( literal, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 8637L)
  public static SubLObject decontextualized_collection_literalP(final SubLObject literal)
  {
    if( NIL != el_utilities.el_binary_formula_p( literal ) )
    {
      final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
      final SubLObject arg2 = el_utilities.literal_arg2( literal, UNPROVIDED );
      return makeBoolean( ( $const42$isa.eql( predicate ) || $const43$genls.eql( predicate ) ) && NIL != forts.fort_p( arg2 ) && NIL != decontextualized_collectionP( arg2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 9108L)
  public static SubLObject decontextualized_atomic_cnfP(final SubLObject cnf)
  {
    if( NIL != clauses.atomic_clause_p( cnf ) )
    {
      final SubLObject asent = clause_utilities.atomic_cnf_asent( cnf );
      return decontextualized_literalP( asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 9487L)
  public static SubLObject decontextualized_weakening_prohibitedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $decontextualized_weakening_prohibitedP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 9598L)
  public static SubLObject mt_matches_convention_mtP(final SubLObject given_mt, final SubLObject convention_mt)
  {
    return makeBoolean( given_mt.eql( convention_mt ) || NIL != hlmt.hlmt_equalP( given_mt, convention_mt ) || ( NIL != decontextualized_weakening_prohibitedP() && NIL != genl_mts.proper_genl_mtP( convention_mt,
        given_mt, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 9927L)
  public static SubLObject possibly_convention_mt_for_decontextualized_cnf(final SubLObject mt, final SubLObject cnf)
  {
    if( NIL != decontextualized_atomic_cnfP( cnf ) )
    {
      final SubLObject asent = clause_utilities.atomic_cnf_asent( cnf );
      final SubLObject convention_mt = decontextualized_literal_convention_mt( asent );
      if( NIL != convention_mt && NIL == mt_matches_convention_mtP( mt, convention_mt ) )
      {
        return convention_mt;
      }
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 10296L)
  public static SubLObject decontextualized_gafP(final SubLObject gaf)
  {
    return decontextualized_literalP( assertions_high.gaf_formula( gaf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 10395L)
  public static SubLObject decontextualized_ruleP(final SubLObject rule)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 10480L)
  public static SubLObject decontextualized_assertionP(final SubLObject assertion)
  {
    return ( NIL != assertions_high.gaf_assertionP( assertion ) ) ? decontextualized_gafP( assertion ) : decontextualized_ruleP( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 10657L)
  public static SubLObject decontextualized_assertion_convention_mt(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return decontextualized_literal_convention_mt( assertions_high.gaf_formula( assertion ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 10883L)
  public static SubLObject decontextualized_assertion_in_right_mtP(final SubLObject assertion)
  {
    if( NIL != decontextualized_assertionP( assertion ) )
    {
      final SubLObject convention_mt = decontextualized_assertion_convention_mt( assertion );
      final SubLObject actual_mt = assertions_high.assertion_mt( assertion );
      return mt_matches_convention_mtP( actual_mt, convention_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 11299L)
  public static SubLObject quoted_collectionP(final SubLObject collection)
  {
    return makeBoolean( NIL != forts.fort_p( collection ) && NIL != kb_mapping_utilities.some_pred_value_in_any_mt( collection, $const44$quotedCollection, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 11468L)
  public static SubLObject quoted_argumentP(final SubLObject relation, final SubLObject argnum)
  {
    return makeBoolean( NIL != forts.fort_p( relation ) && argnum.isNumber() && argnum.numG( ZERO_INTEGER ) && NIL != kb_mapping_utilities.pred_u_v_holds_in_any_mt( $const45$quotedArgument, relation, argnum, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 11778L)
  public static SubLObject some_quoted_argumentP(final SubLObject relation)
  {
    return makeBoolean( NIL != forts.fort_p( relation ) && NIL != kb_mapping_utilities.some_pred_value_in_any_mt( relation, $const45$quotedArgument, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 11921L)
  public static SubLObject opaque_argumentP(final SubLObject relation, final SubLObject argnum)
  {
    return makeBoolean( NIL != quoted_argumentP( relation, argnum ) || NIL != kb_mapping_utilities.pred_u_v_holds_in_any_mt( $const46$opaqueArgument, relation, argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 12108L)
  public static SubLObject some_opaque_argumentP(final SubLObject relation)
  {
    return makeBoolean( NIL != some_quoted_argumentP( relation ) || NIL != kb_mapping_utilities.some_pred_value_in_any_mt( relation, $const46$opaqueArgument, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 12257L)
  public static SubLObject minimize_collection_extent(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const47$minimizeCollectionExtent, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 12544L)
  public static SubLObject minimize_extent(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, $const48$minimizeExtent, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 12724L)
  public static SubLObject complete_extent_assertedP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_asserted_gaf( predicate, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 12933L)
  public static SubLObject complete_extent_asserted_gaf(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    return ( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const50$completeExtentAsserted, predicate, ONE_INTEGER, UNPROVIDED ) ) ? kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( predicate,
        $const50$completeExtentAsserted, mt, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 13327L)
  public static SubLObject complete_extent_asserted_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_asserted_for_value_in_arg_gaf( predicate, value, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 13622L)
  public static SubLObject complete_extent_asserted_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    assert NIL != subl_promotions.non_negative_integer_p( argnum ) : argnum;
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const52$completeExtentAssertedForValueInA, predicate, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject asent = el_utilities.make_ternary_formula( $const52$completeExtentAssertedForValueInA, predicate, value, argnum );
      return kb_indexing.find_gaf_possibly_in_mt( asent, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 14256L)
  public static SubLObject complete_extent_enumerableP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_enumerable_gaf( predicate, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 14456L)
  public static SubLObject complete_extent_enumerable_gaf(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    return ( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const53$completeExtentEnumerable, predicate, ONE_INTEGER, UNPROVIDED ) ) ? kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( predicate,
        $const53$completeExtentEnumerable, mt, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 14856L)
  public static SubLObject complete_extent_enumerable_via_backchain_gaf(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    return kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( predicate, $const54$completeExtentEnumerableViaBackch, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 15251L)
  public static SubLObject complete_extent_decidableP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_decidable_gaf( predicate, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 15446L)
  public static SubLObject complete_extent_decidable_gaf(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    return ( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const55$completeExtentDecidable, predicate, ONE_INTEGER, UNPROVIDED ) ) ? kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( predicate,
        $const55$completeExtentDecidable, mt, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 15840L)
  public static SubLObject complete_extent_enumerable_for_argP(final SubLObject predicate, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_enumerable_for_arg_gaf( predicate, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 16099L)
  public static SubLObject complete_extent_enumerable_for_arg_gaf(final SubLObject predicate, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    assert NIL != subl_promotions.non_negative_integer_p( argnum ) : argnum;
    return ( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const56$completeExtentEnumerableForArg, predicate, ONE_INTEGER, UNPROVIDED ) ) ? kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(
        $const56$completeExtentEnumerableForArg, predicate, argnum, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 16615L)
  public static SubLObject complete_extent_enumerable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_enumerable_for_value_in_arg_gaf( predicate, value, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 16904L)
  public static SubLObject complete_extent_enumerable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    assert NIL != subl_promotions.non_negative_integer_p( argnum ) : argnum;
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const57$completeExtentEnumerableForValueI, predicate, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject asent = el_utilities.make_ternary_formula( $const57$completeExtentEnumerableForValueI, predicate, value, argnum );
      return kb_indexing.find_gaf_possibly_in_mt( asent, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 17534L)
  public static SubLObject complete_extent_decidable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( complete_extent_decidable_for_value_in_arg_gaf( predicate, value, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 17820L)
  public static SubLObject complete_extent_decidable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    assert NIL != subl_promotions.non_negative_integer_p( argnum ) : argnum;
    if( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const58$completeExtentDecidableForValueIn, predicate, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject asent = el_utilities.make_ternary_formula( $const58$completeExtentDecidableForValueIn, predicate, value, argnum );
      return kb_indexing.find_gaf_possibly_in_mt( asent, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 18446L)
  public static SubLObject completely_enumerable_collectionP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( completely_enumerable_collection_gaf( collection, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 18666L)
  public static SubLObject completely_enumerable_collection_gaf(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( collection, $const59$completelyEnumerableCollection, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 18992L)
  public static SubLObject collection_completely_enumerable_via_backchain_gaf(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( collection, $const60$collectionCompletelyEnumerableVia, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 19361L)
  public static SubLObject completely_decidable_collectionP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( completely_decidable_collection_gaf( collection, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 19592L)
  public static SubLObject completely_decidable_collection_gaf(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( collection, $const61$completelyDecidableCollection, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 19929L)
  public static SubLObject check_preferred_collectionP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.fpred_value_gaf_in_relevant_mts( collection, $const62$collectionCheckPreferred, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 20248L)
  public static SubLObject backchain_requiredP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, $const63$backchainRequired, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 20426L)
  public static SubLObject backchain_encouragedP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, $const64$backchainEncouraged, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 20567L)
  public static SubLObject backchain_discouragedP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, $const65$backchainDiscouraged, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 20928L)
  public static SubLObject backchain_forbiddenP(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.member_kbeqP( predicate, $suppress_backchain_forbidden_preds$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, $const66$backchainForbidden, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 21153L)
  public static SubLObject collection_isa_backchain_requiredP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const67$collectionIsaBackchainRequired, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 21320L)
  public static SubLObject collection_genls_backchain_requiredP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const68$collectionGenlsBackchainRequired, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 21491L)
  public static SubLObject collection_backchain_requiredP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const69$collectionBackchainRequired, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 21651L)
  public static SubLObject collection_isa_backchain_encouragedP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const70$collectionIsaBackchainEncouraged, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 21822L)
  public static SubLObject collection_genls_backchain_encouragedP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const71$collectionGenlsBackchainEncourage, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 21997L)
  public static SubLObject collection_backchain_encouragedP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const72$collectionBackchainEncouraged, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 22161L)
  public static SubLObject some_backchain_forbidden_unless_arg_chosen_assertion_somewhereP(final SubLObject predicate)
  {
    return somewhere_cache.some_pred_assertion_somewhereP( kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), predicate, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 22446L)
  public static SubLObject backchain_forbidden_unless_arg_chosen_argnums(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject argnums = NIL;
    if( NIL != forts.fort_p( predicate ) && NIL != some_backchain_forbidden_unless_arg_chosen_assertion_somewhereP( predicate ) )
    {
      argnums = kb_mapping_utilities.pred_values_in_relevant_mts( predicate, kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), mt, ONE_INTEGER, TWO_INTEGER, $kw73$TRUE );
      argnums = Sort.sort( argnums, Symbols.symbol_function( $sym74$_ ), UNPROVIDED );
    }
    return argnums;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 22983L)
  public static SubLObject highly_relevant_term_somewhereP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return somewhere_cache.some_pred_assertion_somewhereP( $const75$highlyRelevantTerm, fort, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 23205L)
  public static SubLObject irrelevant_term_somewhereP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return somewhere_cache.some_pred_assertion_somewhereP( $const76$irrelevantTerm, fort, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 23370L)
  public static SubLObject skolemize_forward_somewhereP(final SubLObject function)
  {
    return makeBoolean( NIL != forts.fort_p( function ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const77$skolemizeForward, function, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 23552L)
  public static SubLObject skolemize_forwardP(final SubLObject function, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( function ) && NIL != skolemize_forward_somewhereP( function ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( function, $const77$skolemizeForward, mt,
        UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 23762L)
  public static SubLObject rule_forward_reification_functions(final SubLObject rule, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject functions = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      functions = kb_mapping_utilities.pred_values( rule, $const78$forwardReificationRule, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return functions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 24022L)
  public static SubLObject forward_reification_ruleP(final SubLObject function, final SubLObject rule, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL != forts.fort_p( function ) )
        {
          result = kb_mapping_utilities.pred_u_v_holds( $const78$forwardReificationRule, function, rule, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
        }
        if( NIL == result && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const79$universalForwardReificationRule, rule, ONE_INTEGER, UNPROVIDED ) )
        {
          result = kb_mapping_utilities.fpred_value( rule, $const79$universalForwardReificationRule, ONE_INTEGER, ONE_INTEGER, UNPROVIDED );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 24595L)
  public static SubLObject arg1_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa( relation, ONE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 24751L)
  public static SubLObject arg2_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa( relation, TWO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 24884L)
  public static SubLObject arg3_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa( relation, THREE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 25017L)
  public static SubLObject arg4_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa( relation, FOUR_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 25150L)
  public static SubLObject arg5_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa( relation, FIVE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 25283L)
  public static SubLObject arg6_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa( relation, SIX_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 25416L)
  public static SubLObject args_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const80$argsIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return args_isa( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 25711L)
  public static SubLObject args_quoted_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const82$argsQuotedIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return args_isa( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 26019L)
  public static SubLObject arg_and_rest_isa_min_argnum(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    if( NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP( relation ) )
    {
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const83$argAndRestIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject argnum = NIL;
      argnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( argnum.isInteger() )
        {
          if( NIL == result )
          {
            result = argnum;
          }
          else if( argnum.numL( result ) )
          {
            result = argnum;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 26526L)
  public static SubLObject arg_and_rest_isa_applicableP(final SubLObject reln, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject min_argnum = arg_and_rest_isa_min_argnum( reln, mt );
    return makeBoolean( min_argnum.isInteger() && argnum.numGE( min_argnum ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 26809L)
  public static SubLObject arg_and_rest_quoted_isa_min_argnum(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    if( NIL != at_cache.some_arg_and_rest_quoted_isa_assertion_somewhereP( relation ) )
    {
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const84$argAndRestQuotedIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject argnum = NIL;
      argnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( argnum.isInteger() )
        {
          if( NIL == result )
          {
            result = argnum;
          }
          else if( argnum.numL( result ) )
          {
            result = argnum;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 27342L)
  public static SubLObject arg_and_rest_quoted_isa_applicableP(final SubLObject reln, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject min_argnum = arg_and_rest_quoted_isa_min_argnum( reln, mt );
    return makeBoolean( min_argnum.isInteger() && argnum.numGE( min_argnum ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 27631L)
  public static SubLObject argn_isa(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( argnum, $sym85$INTEGERP );
    return argn_isa_int( relation, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 27949L)
  public static SubLObject argn_sometimes_isa(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( argnum, $sym85$INTEGERP );
    return argn_sometimes_isa_int( relation, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 28287L)
  public static SubLObject argn_quoted_isa(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( argnum, $sym85$INTEGERP );
    if( NIL != czer_trampolines.within_czer_memoization_stateP() )
    {
      return conses_high.copy_list( czer_trampolines.czer_argn_quoted_isa_int( relation, argnum, mt_relevance_macros.mt_info( mt ) ) );
    }
    return argn_quoted_isa_int( relation, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 28746L)
  public static SubLObject argn_isa_implied(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject cols = argn_isa( relation, argnum, mt );
    return ( NIL != cols ) ? cols : ConsesLow.list( $const36$Thing );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 28950L)
  public static SubLObject argn_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    if( NIL != forts.fort_p( relation ) )
    {
      return argn_isa_int_2( relation, argnum, mt );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_isa( narts_high.find_nart( relation ), argnum, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 29242L)
  public static SubLObject argn_sometimes_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    if( NIL != forts.fort_p( relation ) )
    {
      return argn_sometimes_isa_int_2( relation, argnum, mt );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_sometimes_isa( narts_high.find_nart( relation ), argnum, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 29502L)
  public static SubLObject argn_isa_int_2(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    SubLObject result = NIL;
    if( NIL != at_cache.some_args_isa_assertion_somewhereP( relation ) )
    {
      result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const80$argsIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP( relation ) )
    {
      result = ConsesLow.nconc( result, argn_isa_from_ternary_arg_isa_pred( relation, argnum, $const83$argAndRestIsa, mt ) );
    }
    if( NIL != subl_promotions.positive_integer_p( argnum ) )
    {
      final SubLObject arg_isa_pred = arg_isa_pred_int( argnum );
      if( NIL != arg_isa_pred )
      {
        if( NIL != at_cache.at_cache_use_possibleP( arg_isa_pred, argnum ) )
        {
          result = ConsesLow.nconc( result, at_cache.cached_arg_isas_in_mt( relation, argnum, mt ) );
        }
        else
        {
          result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, arg_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
      }
    }
    return list_utilities.delete_duplicate_forts( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 30304L)
  public static SubLObject argn_sometimes_isa_int_2(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    SubLObject result = NIL;
    if( NIL != subl_promotions.positive_integer_p( argnum ) )
    {
      final SubLObject arg_sometimes_isa_pred = arg_sometimes_isa_pred_int( argnum );
      if( NIL != arg_sometimes_isa_pred )
      {
        result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, arg_sometimes_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
    }
    return list_utilities.delete_duplicate_forts( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 30676L)
  public static SubLObject argn_quoted_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    if( NIL != forts.fort_p( relation ) )
    {
      if( NIL != el_utilities.cyc_const_logical_operator_p( relation ) )
      {
        return ConsesLow.list( $const92$CycLSentence_Assertible );
      }
      if( NIL != el_utilities.cyc_const_quantifier_p( relation ) && argnum.numE( el_utilities.quantified_sub_sentence_argnum_for_operator( relation ) ) )
      {
        return ConsesLow.list( $const92$CycLSentence_Assertible );
      }
      if( NIL != el_utilities.cyc_const_quantifier_p( relation ) && argnum.numE( el_utilities.quantified_var_argnum_for_operator( relation ) ) )
      {
        return ConsesLow.list( $const93$CycLVariable );
      }
      SubLObject result = NIL;
      SubLObject cdolist_list_var = arg_quoted_isa_preds( argnum, relation, mt );
      SubLObject arg_quoted_isa_pred = NIL;
      arg_quoted_isa_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( arg_quoted_isa_pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, arg_quoted_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else if( NIL != subl_promotions.memberP( arg_quoted_isa_pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, argn_quoted_isa_from_ternary_arg_quoted_isa_pred( relation, argnum, arg_quoted_isa_pred, mt ) );
        }
        else if( NIL != isa.isaP( arg_quoted_isa_pred, $const94$ArgQuotedIsaBinaryPredicate, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, arg_quoted_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else if( NIL != isa.isaP( arg_quoted_isa_pred, $const95$ArgQuotedIsaTernaryPredicate, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, argn_quoted_isa_from_ternary_arg_quoted_isa_pred( relation, argnum, arg_quoted_isa_pred, mt ) );
        }
        else
        {
          el_utilities.el_error( THREE_INTEGER, $str96$illegal_arg_quoted_isa_pred_encou, arg_quoted_isa_pred, UNPROVIDED, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg_quoted_isa_pred = cdolist_list_var.first();
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    else
    {
      if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
      {
        return argn_quoted_isa( narts_high.find_nart( relation ), argnum, mt );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 32259L)
  public static SubLObject argn_isa_from_ternary_arg_isa_pred(final SubLObject relation, final SubLObject argnum, final SubLObject arg_isa_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, arg_isa_pred, ONE_INTEGER, $list97, mt, UNPROVIDED );
    SubLObject argnum_isa = NIL;
    argnum_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject tuple_argnum = argnum_isa.first();
      final SubLObject tuple_isa = conses_high.second( argnum_isa );
      if( NIL != forts.fort_p( tuple_isa ) && tuple_argnum.isInteger() && ( argnum.numE( tuple_argnum ) || ( argnum.numG( tuple_argnum ) && arg_isa_pred.eql( $const83$argAndRestIsa ) ) ) )
      {
        result = ConsesLow.cons( tuple_isa, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum_isa = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 32996L)
  public static SubLObject argn_quoted_isa_from_ternary_arg_quoted_isa_pred(final SubLObject relation, final SubLObject argnum, final SubLObject arg_quoted_isa_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, arg_quoted_isa_pred, ONE_INTEGER, $list97, mt, UNPROVIDED );
    SubLObject argnum_quoted_isa = NIL;
    argnum_quoted_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject tuple_argnum = argnum_quoted_isa.first();
      final SubLObject tuple_isa = conses_high.second( argnum_quoted_isa );
      if( NIL != forts.fort_p( tuple_isa ) && tuple_argnum.isInteger() && ( argnum.numE( tuple_argnum ) || ( argnum.numG( tuple_argnum ) && arg_quoted_isa_pred.eql( $const84$argAndRestQuotedIsa ) ) ) )
      {
        result = ConsesLow.cons( tuple_isa, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum_quoted_isa = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 33821L)
  public static SubLObject arg_isa_pred_int(final SubLObject index)
  {
    if( index.eql( ONE_INTEGER ) )
    {
      return $const98$arg1Isa;
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return $const99$arg2Isa;
    }
    if( index.eql( THREE_INTEGER ) )
    {
      return $const100$arg3Isa;
    }
    if( index.eql( FOUR_INTEGER ) )
    {
      return $const101$arg4Isa;
    }
    if( index.eql( FIVE_INTEGER ) )
    {
      return $const102$arg5Isa;
    }
    if( index.eql( SIX_INTEGER ) )
    {
      return $const103$arg6Isa;
    }
    if( index.eql( ZERO_INTEGER ) )
    {
      return $const80$argsIsa;
    }
    el_utilities.el_error( THREE_INTEGER, $str104$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 34134L)
  public static SubLObject arg_sometimes_isa_pred_int(final SubLObject index)
  {
    if( index.eql( ONE_INTEGER ) )
    {
      return $const105$arg1SometimesIsa;
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return $const106$arg2SometimesIsa;
    }
    if( index.eql( THREE_INTEGER ) )
    {
      return $const107$arg3SometimesIsa;
    }
    if( index.eql( FOUR_INTEGER ) )
    {
      return $const108$arg4SometimesIsa;
    }
    if( index.eql( FIVE_INTEGER ) )
    {
      return $const109$arg5SometimesIsa;
    }
    if( index.eql( SIX_INTEGER ) )
    {
      return $const110$arg6SometimesIsa;
    }
    el_utilities.el_error( THREE_INTEGER, $str104$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 34513L)
  public static SubLObject arg_isa_pred(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != reln )
    {
      final SubLObject argnum = arg_and_rest_isa_min_argnum( reln, mt );
      return argnum.isInteger() ? ( index.numGE( argnum ) ? $const83$argAndRestIsa : arg_isa_pred_int( index ) ) : ( ( NIL != arity.variable_arityP( reln ) ) ? $const80$argsIsa : arg_isa_pred_int( index ) );
    }
    if( NIL != el_utilities.valid_argnum_p( index ) )
    {
      return arg_isa_pred_int( index );
    }
    el_utilities.el_error( THREE_INTEGER, $str104$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 35180L)
  public static SubLObject arg_isa_preds(final SubLObject argnum, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.valid_argnum_p( argnum ) )
    {
      SubLObject result = NIL;
      final SubLObject var = arg_isa_pred_int( argnum );
      if( NIL != var )
      {
        result = ConsesLow.cons( var, result );
      }
      final SubLObject item_var = $const80$argsIsa;
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      if( NIL != forts.fort_p( reln ) && NIL != arg_and_rest_isa_applicableP( reln, argnum, mt ) )
      {
        result = ConsesLow.cons( $const83$argAndRestIsa, result );
      }
      return Sequences.nreverse( result );
    }
    el_utilities.el_error( THREE_INTEGER, $str111$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 35719L)
  public static SubLObject arg_not_isa_pred_int(final SubLObject index)
  {
    if( index.eql( ONE_INTEGER ) )
    {
      return $const112$arg1NotIsa;
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return $const113$arg2NotIsa;
    }
    if( index.eql( THREE_INTEGER ) )
    {
      return $const114$arg3NotIsa;
    }
    if( index.eql( FOUR_INTEGER ) )
    {
      return $const115$arg4NotIsa;
    }
    if( index.eql( FIVE_INTEGER ) )
    {
      return $const116$arg5NotIsa;
    }
    if( index.eql( ZERO_INTEGER ) )
    {
      return $const117$argsNotIsa;
    }
    el_utilities.el_error( THREE_INTEGER, $str118$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 36063L)
  public static SubLObject arg_not_isa_pred(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != reln )
    {
      return ( NIL != arity.variable_arityP( reln ) ) ? $const117$argsNotIsa : arg_not_isa_pred_int( index );
    }
    if( NIL != el_utilities.valid_argnum_p( index ) )
    {
      return arg_not_isa_pred_int( index );
    }
    el_utilities.el_error( THREE_INTEGER, $str118$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 36570L)
  public static SubLObject arg_not_isa_preds(final SubLObject argnum, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.valid_argnum_p( argnum ) )
    {
      SubLObject result = NIL;
      final SubLObject var = arg_not_isa_pred_int( argnum );
      if( NIL != var )
      {
        result = ConsesLow.cons( var, result );
      }
      final SubLObject item_var = $const117$argsNotIsa;
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      return Sequences.nreverse( result );
    }
    el_utilities.el_error( THREE_INTEGER, $str119$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 37022L)
  public static SubLObject arg_quoted_isa_pred_int(final SubLObject index)
  {
    if( index.eql( ONE_INTEGER ) )
    {
      return $const120$arg1QuotedIsa;
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return $const121$arg2QuotedIsa;
    }
    if( index.eql( THREE_INTEGER ) )
    {
      return $const122$arg3QuotedIsa;
    }
    if( index.eql( FOUR_INTEGER ) )
    {
      return $const123$arg4QuotedIsa;
    }
    if( index.eql( FIVE_INTEGER ) )
    {
      return $const124$arg5QuotedIsa;
    }
    if( index.eql( SIX_INTEGER ) )
    {
      return $const125$arg6QuotedIsa;
    }
    el_utilities.el_error( THREE_INTEGER, $str126$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 37394L)
  public static SubLObject arg_quoted_isa_pred(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != reln )
    {
      final SubLObject argnum = arg_and_rest_quoted_isa_min_argnum( reln, mt );
      return argnum.isInteger() ? ( index.numGE( argnum ) ? $const84$argAndRestQuotedIsa : arg_quoted_isa_pred_int( index ) )
          : ( ( NIL != arity.variable_arityP( reln ) ) ? $const82$argsQuotedIsa : arg_quoted_isa_pred_int( index ) );
    }
    if( NIL != el_utilities.valid_argnum_p( index ) )
    {
      return arg_quoted_isa_pred_int( index );
    }
    el_utilities.el_error( THREE_INTEGER, $str126$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 38135L)
  public static SubLObject arg_quoted_isa_preds(final SubLObject argnum, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.valid_argnum_p( argnum ) )
    {
      SubLObject result = NIL;
      final SubLObject var = arg_quoted_isa_pred_int( argnum );
      if( NIL != var )
      {
        result = ConsesLow.cons( var, result );
      }
      if( NIL != forts.fort_p( reln ) && NIL != at_cache.some_args_quoted_isa_assertion_somewhereP( reln ) )
      {
        final SubLObject item_var = $const82$argsQuotedIsa;
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
      }
      if( NIL != forts.fort_p( reln ) && NIL != arg_and_rest_quoted_isa_applicableP( reln, argnum, mt ) )
      {
        result = ConsesLow.cons( $const84$argAndRestQuotedIsa, result );
      }
      return Sequences.nreverse( result );
    }
    el_utilities.el_error( THREE_INTEGER, $str127$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 38824L)
  public static SubLObject arg_isa_inverse(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index.eql( ONE_INTEGER ) )
    {
      return arg_isa_pred( TWO_INTEGER, reln, mt );
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return arg_isa_pred( ONE_INTEGER, reln, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 39108L)
  public static SubLObject arg_not_isa_inverse(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index.eql( ONE_INTEGER ) )
    {
      return arg_not_isa_pred( TWO_INTEGER, reln, mt );
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return arg_not_isa_pred( ONE_INTEGER, reln, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 39404L)
  public static SubLObject arg_quoted_isa_inverse(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index.eql( ONE_INTEGER ) )
    {
      return arg_quoted_isa_pred( TWO_INTEGER, reln, mt );
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return arg_quoted_isa_pred( ONE_INTEGER, reln, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 39715L)
  public static SubLObject inverse_argnum(final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      return TWO_INTEGER;
    }
    if( argnum.eql( TWO_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    return Errors.error( $str128$invalid_argument_to_inverse_argnu, argnum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 39926L)
  public static SubLObject isa_pred_arg(final SubLObject isa_pred)
  {
    if( isa_pred.eql( $const98$arg1Isa ) )
    {
      return ONE_INTEGER;
    }
    if( isa_pred.eql( $const99$arg2Isa ) )
    {
      return TWO_INTEGER;
    }
    if( isa_pred.eql( $const100$arg3Isa ) )
    {
      return THREE_INTEGER;
    }
    if( isa_pred.eql( $const101$arg4Isa ) )
    {
      return FOUR_INTEGER;
    }
    if( isa_pred.eql( $const102$arg5Isa ) )
    {
      return FIVE_INTEGER;
    }
    if( isa_pred.eql( $const103$arg6Isa ) )
    {
      return SIX_INTEGER;
    }
    if( isa_pred.eql( $const80$argsIsa ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 40300L)
  public static SubLObject quoted_isa_pred_arg(final SubLObject quoted_isa_pred)
  {
    if( quoted_isa_pred.eql( $const120$arg1QuotedIsa ) )
    {
      return ONE_INTEGER;
    }
    if( quoted_isa_pred.eql( $const121$arg2QuotedIsa ) )
    {
      return TWO_INTEGER;
    }
    if( quoted_isa_pred.eql( $const122$arg3QuotedIsa ) )
    {
      return THREE_INTEGER;
    }
    if( quoted_isa_pred.eql( $const123$arg4QuotedIsa ) )
    {
      return FOUR_INTEGER;
    }
    if( quoted_isa_pred.eql( $const124$arg5QuotedIsa ) )
    {
      return FIVE_INTEGER;
    }
    if( quoted_isa_pred.eql( $const125$arg6QuotedIsa ) )
    {
      return SIX_INTEGER;
    }
    if( quoted_isa_pred.eql( $const82$argsQuotedIsa ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 40764L)
  public static SubLObject genl_pred_arg(final SubLObject genl_pred)
  {
    if( genl_pred.eql( $const129$arg1Genl ) )
    {
      return ONE_INTEGER;
    }
    if( genl_pred.eql( $const130$arg2Genl ) )
    {
      return TWO_INTEGER;
    }
    if( genl_pred.eql( $const131$arg3Genl ) )
    {
      return THREE_INTEGER;
    }
    if( genl_pred.eql( $const132$arg4Genl ) )
    {
      return FOUR_INTEGER;
    }
    if( genl_pred.eql( $const133$arg5Genl ) )
    {
      return FIVE_INTEGER;
    }
    if( genl_pred.eql( $const134$arg6Genl ) )
    {
      return SIX_INTEGER;
    }
    if( genl_pred.eql( $const135$argsGenl ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 41153L)
  public static SubLObject min_argn_isa(final SubLObject relation, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( relation, $sym136$INDEXED_TERM_P );
    enforceType( n, $sym85$INTEGERP );
    if( NIL != forts.fort_p( relation ) )
    {
      return genls.min_cols( argn_isa( relation, n, mt ), mt, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return min_argn_isa( narts_high.find_nart( relation ), n, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 41589L)
  public static SubLObject arg_types(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return arg_isa( relation, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 41663L)
  public static SubLObject ai(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return arg_isa( relation, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 42050L)
  public static SubLObject arg_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return each_arg_isa( relation, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 42447L)
  public static SubLObject each_arg_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      final SubLObject pcase_var;
      final SubLObject v_arity = pcase_var = arity.arity( relation );
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        return argn_isa( relation, ONE_INTEGER, mt );
      }
      if( pcase_var.eql( TWO_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_isa( relation, ONE_INTEGER, mt ), argn_isa( relation, TWO_INTEGER, mt ) ) );
      }
      if( pcase_var.eql( THREE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_isa( relation, ONE_INTEGER, mt ), argn_isa( relation, TWO_INTEGER, mt ), argn_isa( relation, THREE_INTEGER, mt ) ) );
      }
      if( pcase_var.eql( FOUR_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_isa( relation, ONE_INTEGER, mt ), argn_isa( relation, TWO_INTEGER, mt ), argn_isa( relation, THREE_INTEGER, mt ), argn_isa(
            relation, FOUR_INTEGER, mt )
        } ) );
      }
      if( pcase_var.eql( FIVE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_isa( relation, ONE_INTEGER, mt ), argn_isa( relation, TWO_INTEGER, mt ), argn_isa( relation, THREE_INTEGER, mt ), argn_isa(
            relation, FOUR_INTEGER, mt ), argn_isa( relation, FIVE_INTEGER, mt )
        } ) );
      }
      if( pcase_var.eql( SIX_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_isa( relation, ONE_INTEGER, mt ), argn_isa( relation, TWO_INTEGER, mt ), argn_isa( relation, THREE_INTEGER, mt ), argn_isa(
            relation, FOUR_INTEGER, mt ), argn_isa( relation, FIVE_INTEGER, mt ), argn_isa( relation, SIX_INTEGER, mt )
        } ) );
      }
      return args_isa( relation, mt );
    }
    else
    {
      if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
      {
        return each_arg_isa( narts_high.find_nart( relation ), mt );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 43997L)
  public static SubLObject arg_quoted_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return each_arg_quoted_isa( relation, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 44421L)
  public static SubLObject each_arg_quoted_isa(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      final SubLObject pcase_var;
      final SubLObject v_arity = pcase_var = arity.arity( relation );
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        return argn_quoted_isa( relation, ONE_INTEGER, mt );
      }
      if( pcase_var.eql( TWO_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_quoted_isa( relation, ONE_INTEGER, mt ), argn_quoted_isa( relation, TWO_INTEGER, mt ) ) );
      }
      if( pcase_var.eql( THREE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_quoted_isa( relation, ONE_INTEGER, mt ), argn_quoted_isa( relation, TWO_INTEGER, mt ), argn_quoted_isa( relation, THREE_INTEGER, mt ) ) );
      }
      if( pcase_var.eql( FOUR_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_quoted_isa( relation, ONE_INTEGER, mt ), argn_quoted_isa( relation, TWO_INTEGER, mt ), argn_quoted_isa( relation,
            THREE_INTEGER, mt ), argn_quoted_isa( relation, FOUR_INTEGER, mt )
        } ) );
      }
      if( pcase_var.eql( FIVE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_quoted_isa( relation, ONE_INTEGER, mt ), argn_quoted_isa( relation, TWO_INTEGER, mt ), argn_quoted_isa( relation,
            THREE_INTEGER, mt ), argn_quoted_isa( relation, FOUR_INTEGER, mt ), argn_quoted_isa( relation, FIVE_INTEGER, mt )
        } ) );
      }
      if( pcase_var.eql( SIX_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_quoted_isa( relation, ONE_INTEGER, mt ), argn_quoted_isa( relation, TWO_INTEGER, mt ), argn_quoted_isa( relation,
            THREE_INTEGER, mt ), argn_quoted_isa( relation, FOUR_INTEGER, mt ), argn_quoted_isa( relation, FIVE_INTEGER, mt ), argn_quoted_isa( relation, SIX_INTEGER, mt )
        } ) );
      }
      return args_quoted_isa( relation, mt );
    }
    else
    {
      if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
      {
        return each_arg_quoted_isa( narts_high.find_nart( relation ), mt );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46151L)
  public static SubLObject arg1_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa_of( collection, ONE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46237L)
  public static SubLObject arg2_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa_of( collection, TWO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46323L)
  public static SubLObject arg3_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa_of( collection, THREE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46409L)
  public static SubLObject arg4_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa_of( collection, FOUR_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46495L)
  public static SubLObject arg5_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa_of( collection, FIVE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46581L)
  public static SubLObject arg6_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_isa_of( collection, SIX_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46667L)
  public static SubLObject args_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( collection, $const80$argsIsa, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( collection, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return args_isa_of( narts_high.find_nart( collection ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46909L)
  public static SubLObject aio(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return arg_isa_of( collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 46984L)
  public static SubLObject arg_isa_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { arg1_isa_of( collection, mt ), arg2_isa_of( collection, mt ), arg3_isa_of( collection, mt ), arg4_isa_of( collection, mt ),
      arg5_isa_of( collection, mt ), arg6_isa_of( collection, mt )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 47252L)
  public static SubLObject argn_isa_of(final SubLObject collection, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( argnum, $sym85$INTEGERP );
    if( NIL != forts.fort_p( collection ) )
    {
      SubLObject result = args_isa_of( collection, mt );
      final SubLObject arg_isa_pred = arg_isa_pred_int( argnum );
      if( NIL != forts.fort_p( arg_isa_pred ) )
      {
        result = ConsesLow.nconc( new SubLObject[] { kb_mapping_utilities.pred_values_in_relevant_mts( collection, arg_isa_pred, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED )
        } );
      }
      else
      {
        result = ConsesLow.nconc( new SubLObject[] { kb_mapping_utilities.pred_arg_values_in_relevant_mts( collection, $const142$argIsa, argnum, mt, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER, UNPROVIDED )
        } );
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    if( NIL != obsolete.reifiable_natP( collection, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_isa_of( narts_high.find_nart( collection ), argnum, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 47984L)
  public static SubLObject arg1_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, ONE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 48177L)
  public static SubLObject arg2_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, TWO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 48312L)
  public static SubLObject arg3_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, THREE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 48447L)
  public static SubLObject arg4_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, FOUR_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 48582L)
  public static SubLObject arg5_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, FIVE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 48717L)
  public static SubLObject arg6_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, SIX_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 48852L)
  public static SubLObject args_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl( relation, ZERO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 49003L)
  public static SubLObject argn_genl(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( argnum, $sym85$INTEGERP );
    if( NIL != forts.fort_p( relation ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = arg_genl_preds( argnum, relation, mt );
      SubLObject arg_genl_pred = NIL;
      arg_genl_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( arg_genl_pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, arg_genl_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else if( NIL != subl_promotions.memberP( arg_genl_pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, argn_genl_from_ternary_arg_genl_pred( relation, argnum, arg_genl_pred, mt ) );
        }
        else if( NIL != isa.isaP( arg_genl_pred, $const146$ArgGenlBinaryPredicate, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, arg_genl_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else if( NIL != isa.isaP( arg_genl_pred, $const147$ArgGenlTernaryPredicate, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.nconc( result, argn_genl_from_ternary_arg_genl_pred( relation, argnum, arg_genl_pred, mt ) );
        }
        else
        {
          el_utilities.el_error( THREE_INTEGER, $str148$illegal_arg_genl_pred_encountered, arg_genl_pred, UNPROVIDED, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg_genl_pred = cdolist_list_var.first();
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_genl( narts_high.find_nart( relation ), argnum, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 50329L)
  public static SubLObject argn_genl_from_ternary_arg_genl_pred(final SubLObject relation, final SubLObject argnum, final SubLObject arg_genl_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, arg_genl_pred, ONE_INTEGER, $list97, mt, UNPROVIDED );
    SubLObject argnum_genl = NIL;
    argnum_genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject tuple_argnum = argnum_genl.first();
      final SubLObject tuple_genl = conses_high.second( argnum_genl );
      if( NIL != forts.fort_p( tuple_genl ) && tuple_argnum.isInteger() && ( argnum.numE( tuple_argnum ) || ( argnum.numG( tuple_argnum ) && arg_genl_pred.eql( $const83$argAndRestIsa ) ) ) )
      {
        result = ConsesLow.cons( tuple_genl, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum_genl = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 51079L)
  public static SubLObject arg_and_rest_genl_min_argnum(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    if( NIL != at_cache.some_arg_and_rest_genl_assertion_somewhereP( relation ) )
    {
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const151$argAndRestGenl, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject argnum = NIL;
      argnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( argnum.isInteger() )
        {
          if( NIL == result )
          {
            result = argnum;
          }
          else if( argnum.numL( result ) )
          {
            result = argnum;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 51590L)
  public static SubLObject arg_and_rest_genl_applicableP(final SubLObject reln, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject min_argnum = arg_and_rest_genl_min_argnum( reln, mt );
    return makeBoolean( min_argnum.isInteger() && argnum.numGE( min_argnum ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 51868L)
  public static SubLObject arg_genl_pred_int(final SubLObject index)
  {
    if( index.eql( ONE_INTEGER ) )
    {
      return $const129$arg1Genl;
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return $const130$arg2Genl;
    }
    if( index.eql( THREE_INTEGER ) )
    {
      return $const131$arg3Genl;
    }
    if( index.eql( FOUR_INTEGER ) )
    {
      return $const132$arg4Genl;
    }
    if( index.eql( FIVE_INTEGER ) )
    {
      return $const133$arg5Genl;
    }
    if( index.eql( SIX_INTEGER ) )
    {
      return $const134$arg6Genl;
    }
    if( index.eql( ZERO_INTEGER ) )
    {
      return $const135$argsGenl;
    }
    el_utilities.el_error( THREE_INTEGER, $str152$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 52190L)
  public static SubLObject arg_genl_pred(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != reln )
    {
      final SubLObject argnum = arg_and_rest_genl_min_argnum( reln, mt );
      return argnum.isInteger() ? ( index.numGE( argnum ) ? $const151$argAndRestGenl : arg_genl_pred_int( index ) ) : ( ( NIL != arity.variable_arityP( reln ) ) ? $const135$argsGenl : arg_genl_pred_int( index ) );
    }
    if( NIL != el_utilities.valid_argnum_p( index ) )
    {
      return arg_genl_pred_int( index );
    }
    el_utilities.el_error( THREE_INTEGER, $str152$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 52944L)
  public static SubLObject arg_genl_preds(final SubLObject argnum, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.valid_argnum_p( argnum ) )
    {
      SubLObject result = NIL;
      final SubLObject var = arg_genl_pred_int( argnum );
      if( NIL != var )
      {
        result = ConsesLow.cons( var, result );
      }
      final SubLObject item_var = $const135$argsGenl;
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      if( NIL != forts.fort_p( reln ) && NIL != arg_and_rest_genl_applicableP( reln, argnum, mt ) )
      {
        result = ConsesLow.cons( $const151$argAndRestGenl, result );
      }
      return Sequences.nreverse( result );
    }
    el_utilities.el_error( THREE_INTEGER, $str153$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 53533L)
  public static SubLObject arg_genl_inverse(final SubLObject index, SubLObject reln, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index.eql( ONE_INTEGER ) )
    {
      return arg_genl_pred( TWO_INTEGER, reln, mt );
    }
    if( index.eql( TWO_INTEGER ) )
    {
      return arg_genl_pred( ONE_INTEGER, reln, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 53820L)
  public static SubLObject min_argn_genl(final SubLObject relation, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( n, $sym85$INTEGERP );
    return genls.min_cols( argn_genl( relation, n, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 54099L)
  public static SubLObject arg_genls(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return each_arg_genl( relation, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 54179L)
  public static SubLObject each_arg_genl(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == forts.fort_p( relation ) )
    {
      if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
      {
        each_arg_genl( narts_high.find_nart( relation ), mt );
      }
      return NIL;
    }
    final SubLObject pcase_var;
    final SubLObject v_arity = pcase_var = arity.arity( relation );
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return argn_genl( relation, ONE_INTEGER, mt );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_genl( relation, ONE_INTEGER, mt ), argn_genl( relation, TWO_INTEGER, mt ) ) );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_genl( relation, ONE_INTEGER, mt ), argn_genl( relation, TWO_INTEGER, mt ), argn_genl( relation, THREE_INTEGER, mt ) ) );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_genl( relation, ONE_INTEGER, mt ), argn_genl( relation, TWO_INTEGER, mt ), argn_genl( relation, THREE_INTEGER, mt ), argn_genl(
          relation, FOUR_INTEGER, mt )
      } ) );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_genl( relation, ONE_INTEGER, mt ), argn_genl( relation, TWO_INTEGER, mt ), argn_genl( relation, THREE_INTEGER, mt ), argn_genl(
          relation, FOUR_INTEGER, mt ), argn_genl( relation, FIVE_INTEGER, mt )
      } ) );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_genl( relation, ONE_INTEGER, mt ), argn_genl( relation, TWO_INTEGER, mt ), argn_genl( relation, THREE_INTEGER, mt ), argn_genl(
          relation, FOUR_INTEGER, mt ), argn_genl( relation, FIVE_INTEGER, mt ), argn_genl( relation, SIX_INTEGER, mt )
      } ) );
    }
    return args_genl( relation, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55427L)
  public static SubLObject arg1_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, ONE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55515L)
  public static SubLObject arg2_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, TWO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55603L)
  public static SubLObject arg3_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, THREE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55691L)
  public static SubLObject arg4_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, FOUR_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55779L)
  public static SubLObject arg5_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, FIVE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55867L)
  public static SubLObject arg6_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, SIX_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 55955L)
  public static SubLObject args_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_genl_of( collection, ZERO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 56043L)
  public static SubLObject argn_genl_of(final SubLObject collection, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( argnum, $sym85$INTEGERP );
    if( NIL != forts.fort_p( collection ) )
    {
      SubLObject result = args_genl_of( collection, mt );
      final SubLObject arg_genl_pred = arg_genl_pred_int( argnum );
      if( NIL != forts.fort_p( arg_genl_pred ) )
      {
        result = ConsesLow.nconc( new SubLObject[] { kb_mapping_utilities.pred_values_in_relevant_mts( collection, arg_genl_pred, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED )
        } );
      }
      else
      {
        result = ConsesLow.nconc( new SubLObject[] { kb_mapping_utilities.pred_arg_values_in_relevant_mts( collection, $const158$argGenl, argnum, mt, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER, UNPROVIDED )
        } );
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    if( NIL != obsolete.reifiable_natP( collection, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_genl_of( narts_high.find_nart( collection ), argnum, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 56894L)
  public static SubLObject inter_arg_isa1_2(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, $const161$interArgIsa1_2, ONE_INTEGER, $list97, mt, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_isa1_2( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 57370L)
  public static SubLObject inter_arg_isa2_1(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, $const166$interArgIsa2_1, ONE_INTEGER, $list97, mt, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_isa2_1( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 57630L)
  public static SubLObject inter_arg_isa_dep(final SubLObject relation, final SubLObject inter_arg_isa_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( relation, inter_arg_isa_pred, mt, ONE_INTEGER, THREE_INTEGER, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_isa_dep( narts_high.find_nart( relation ), inter_arg_isa_pred, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 57921L)
  public static SubLObject inter_arg_isa_indep(final SubLObject relation, final SubLObject inter_arg_isa_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( relation, inter_arg_isa_pred, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_isa_indep( narts_high.find_nart( relation ), inter_arg_isa_pred, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 58216L)
  public static SubLObject inter_arg_isa_pred_indep_arg(final SubLObject inter_arg_isa_pred)
  {
    if( inter_arg_isa_pred.eql( $const166$interArgIsa2_1 ) )
    {
      return TWO_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const167$interArgIsa3_1 ) )
    {
      return THREE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const168$interArgIsa4_1 ) )
    {
      return FOUR_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const169$interArgIsa5_1 ) )
    {
      return FIVE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const161$interArgIsa1_2 ) )
    {
      return ONE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const170$interArgIsa3_2 ) )
    {
      return THREE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const171$interArgIsa4_2 ) )
    {
      return FOUR_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const172$interArgIsa5_2 ) )
    {
      return FIVE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const173$interArgIsa1_3 ) )
    {
      return ONE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const174$interArgIsa2_3 ) )
    {
      return TWO_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const175$interArgIsa4_3 ) )
    {
      return FOUR_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const176$interArgIsa5_3 ) )
    {
      return FIVE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const177$interArgIsa1_4 ) )
    {
      return ONE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const178$interArgIsa2_4 ) )
    {
      return TWO_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const179$interArgIsa3_4 ) )
    {
      return THREE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const180$interArgIsa5_4 ) )
    {
      return FIVE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const181$interArgIsa1_5 ) )
    {
      return ONE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const182$interArgIsa2_5 ) )
    {
      return TWO_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const183$interArgIsa3_5 ) )
    {
      return THREE_INTEGER;
    }
    if( inter_arg_isa_pred.eql( $const184$interArgIsa4_5 ) )
    {
      return FOUR_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 58868L)
  public static SubLObject inter_arg_isa_preds_dep(final SubLObject arg)
  {
    if( arg.eql( ONE_INTEGER ) )
    {
      return $list185;
    }
    if( arg.eql( TWO_INTEGER ) )
    {
      return $list186;
    }
    if( arg.eql( THREE_INTEGER ) )
    {
      return $list187;
    }
    if( arg.eql( FOUR_INTEGER ) )
    {
      return $list188;
    }
    if( arg.eql( FIVE_INTEGER ) )
    {
      return $list189;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 59347L)
  public static SubLObject inter_arg_isa_preds_indep(final SubLObject arg)
  {
    if( arg.eql( ONE_INTEGER ) )
    {
      return $list190;
    }
    if( arg.eql( TWO_INTEGER ) )
    {
      return $list191;
    }
    if( arg.eql( THREE_INTEGER ) )
    {
      return $list192;
    }
    if( arg.eql( FOUR_INTEGER ) )
    {
      return $list193;
    }
    if( arg.eql( FIVE_INTEGER ) )
    {
      return $list194;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 59828L)
  public static SubLObject defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != admitting_defnsP( col, mt ) || NIL != necessary_defnsP( col, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 59955L)
  public static SubLObject admitting_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != sufficient_defnsP( col, mt ) || NIL != defining_defnsP( col, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60067L)
  public static SubLObject defining_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( col, $const195$defnIff, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60171L)
  public static SubLObject sufficient_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( col, $const196$defnSufficient, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60284L)
  public static SubLObject necessary_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( col, $const197$defnNecessary, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60395L)
  public static SubLObject admitting_quoted_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != sufficient_quoted_defnsP( col, mt ) || NIL != defining_quoted_defnsP( col, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60528L)
  public static SubLObject defining_quoted_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( col, $const198$quotedDefnIff, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60645L)
  public static SubLObject sufficient_quoted_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( col, $const199$quotedDefnSufficient, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60771L)
  public static SubLObject necessary_quoted_defnsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts( col, $const200$quotedDefnNecessary, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 60895L)
  public static SubLObject defns(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return conses_high.nunion( admitting_defns( col, mt ), necessary_defns( col, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 61005L)
  public static SubLObject admitting_defns(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return conses_high.nunion( defining_defns( col, mt ), sufficient_defns( col, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 61125L)
  public static SubLObject defining_defns(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( col ) )
    {
      return el_utilities.cycl_subl_symbol_symbol_list( kb_mapping_utilities.pred_values_in_relevant_mts( col, $const195$defnIff, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != obsolete.reifiable_natP( col, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return defining_defns( narts_high.find_nart( col ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 61501L)
  public static SubLObject necessary_defns(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( col ) )
    {
      return el_utilities.cycl_subl_symbol_symbol_list( kb_mapping_utilities.pred_values_in_relevant_mts( col, $const197$defnNecessary, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != obsolete.reifiable_natP( col, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return defining_defns( narts_high.find_nart( col ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 61858L)
  public static SubLObject sufficient_defns(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( col ) )
    {
      return el_utilities.cycl_subl_symbol_symbol_list( kb_mapping_utilities.pred_values_in_relevant_mts( col, $const196$defnSufficient, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != obsolete.reifiable_natP( col, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return defining_defns( narts_high.find_nart( col ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 62218L)
  public static SubLObject all_sufficient_defns(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_defns = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var = at_defns.suf_defn_assertions( col );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( assertion ) ) )
        {
          final SubLObject item_var = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( assertion ) );
          if( NIL == conses_high.member( item_var, v_defns, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            v_defns = ConsesLow.cons( item_var, v_defns );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_defns;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 62600L)
  public static SubLObject result_isaP(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const210$resultIsa, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isaP( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_isaP( cycl_utilities.nat_functor( functor ), mt );
    }
    if( NIL != function_to_arg_termP( functor ) )
    {
      return argn_isa( cycl_utilities.nat_arg2( functor, UNPROVIDED ), cycl_utilities.nat_arg1( functor, UNPROVIDED ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 63049L)
  public static SubLObject result_isa_argP(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const211$resultIsaArg, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_argP( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_isa_argP( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 63390L)
  public static SubLObject result_isa_arg_isaP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const212$resultIsaArgIsa, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_arg_isaP( narts_high.find_nart( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 63803L)
  public static SubLObject result_isa_arg_when_isaP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const213$resultIsaWhenArgIsa, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_arg_when_isaP( narts_high.find_nart( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 64234L)
  public static SubLObject result_isa_via_closed_underP(final SubLObject nat, final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        if( NIL == result )
        {
          SubLObject csome_list_var = kb_mapping_utilities.pred_values( functor, $const214$closedUnder, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
          SubLObject spec = NIL;
          spec = csome_list_var.first();
          while ( NIL == result && NIL != csome_list_var)
          {
            if( NIL != genls.genlP( spec, col, UNPROVIDED, UNPROVIDED ) )
            {
              SubLObject failP = NIL;
              if( NIL == failP )
              {
                SubLObject csome_list_var_$1;
                SubLObject arg;
                for( csome_list_var_$1 = cycl_utilities.nat_args( nat, UNPROVIDED ), arg = NIL, arg = csome_list_var_$1.first(); NIL == failP && NIL != csome_list_var_$1; failP = makeBoolean( NIL == at_defns
                    .quiet_has_typeP( arg, spec, UNPROVIDED ) ), csome_list_var_$1 = csome_list_var_$1.rest(), arg = csome_list_var_$1.first() )
                {
                }
              }
              result = makeBoolean( NIL == failP );
            }
            csome_list_var = csome_list_var.rest();
            spec = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_via_closed_underP( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), col, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 64958L)
  public static SubLObject result_isa_arg_arg_isaP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    SubLObject v_boolean = NIL;
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject pcase_var = functor;
      if( pcase_var.eql( $const215$FormulaArgFn ) )
      {
        final SubLObject argnum = cycl_utilities.nat_arg1( nat, UNPROVIDED );
        final SubLObject formula = cycl_utilities.nat_arg2( nat, UNPROVIDED );
        final SubLObject relation = cycl_utilities.formula_arg0( formula );
        SubLObject v_boolean_$2 = NIL;
        if( NIL != forts.fort_p( relation ) && argnum.isInteger() && NIL == v_boolean_$2 )
        {
          SubLObject csome_list_var;
          SubLObject arg_isa_pred;
          for( csome_list_var = arg_isa_preds( argnum, relation, mt ), arg_isa_pred = NIL, arg_isa_pred = csome_list_var.first(); NIL == v_boolean_$2 && NIL != csome_list_var; v_boolean_$2 = kb_mapping_utilities
              .some_pred_value_in_relevant_mts( relation, arg_isa_pred, mt, UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var.rest(), arg_isa_pred = csome_list_var.first() )
          {
          }
        }
      }
      if( NIL == v_boolean )
      {
        SubLObject csome_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const211$resultIsaArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject argnum = NIL;
        argnum = csome_list_var2.first();
        while ( NIL == v_boolean && NIL != csome_list_var2)
        {
          if( argnum.isInteger() )
          {
            v_boolean = list_utilities.sublisp_boolean( argn_genl( functor, argnum, mt ) );
          }
          csome_list_var2 = csome_list_var2.rest();
          argnum = csome_list_var2.first();
        }
      }
      return v_boolean;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_arg_arg_isaP( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 65925L)
  public static SubLObject function_to_arg_termP(final SubLObject v_term)
  {
    return makeBoolean( v_term.isCons() && $const216$FunctionToArg.eql( cycl_utilities.nat_functor( v_term ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 66033L)
  public static SubLObject meta_result_isaP(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_isaP = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg1$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg1$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const210$resultIsa, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                if( NIL == meta_result_isaP )
                {
                  SubLObject csome_list_var;
                  SubLObject result_isa;
                  for( csome_list_var = result_isa( meta_functor, mt ), result_isa = NIL, result_isa = csome_list_var.first(); NIL == meta_result_isaP && NIL != csome_list_var; meta_result_isaP = genls.any_all_genls(
                      Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED ), csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first() )
                  {
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$4, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg1$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_isaP;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_isaP( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 66884L)
  public static SubLObject meta_result_isa_argP(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_isa_argP = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg1$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg1$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const211$resultIsaArg, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                if( NIL == meta_result_isa_argP )
                {
                  SubLObject csome_list_var;
                  SubLObject result_isa;
                  for( csome_list_var = result_isa( meta_functor, mt ), result_isa = NIL, result_isa = csome_list_var.first(); NIL == meta_result_isa_argP && NIL != csome_list_var; meta_result_isa_argP = genls
                      .any_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED ), csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first() )
                  {
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$8, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$7, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg1$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_isa_argP;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_isa_argP( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 67765L)
  public static SubLObject evaluation_result_quoted_isaP(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const220$evaluationResultQuotedIsa, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return evaluation_result_quoted_isaP( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_evaluation_result_quoted_isaP( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 68293L)
  public static SubLObject meta_evaluation_result_quoted_isaP(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_evaluation_result_quoted_isaP = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg1$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg1$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const220$evaluationResultQuotedIsa, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$11 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$12 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                if( NIL == meta_evaluation_result_quoted_isaP )
                {
                  SubLObject csome_list_var;
                  SubLObject evaluation_result_quoted_isa;
                  for( csome_list_var = evaluation_result_quoted_isa( meta_functor, mt ), evaluation_result_quoted_isa = NIL, evaluation_result_quoted_isa = csome_list_var
                      .first(); NIL == meta_evaluation_result_quoted_isaP && NIL != csome_list_var; meta_evaluation_result_quoted_isaP = genls.any_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ),
                          evaluation_result_quoted_isa, mt, UNPROVIDED ), csome_list_var = csome_list_var.rest(), evaluation_result_quoted_isa = csome_list_var.first() )
                  {
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$12, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$11, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg1$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_evaluation_result_quoted_isaP;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_evaluation_result_quoted_isaP( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 69353L)
  public static SubLObject result_quoted_isaP(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const221$resultQuotedIsa, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_quoted_isaP( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_quoted_isaP( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 69838L)
  public static SubLObject meta_result_quoted_isaP(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_quoted_isaP = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg1$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg1$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const221$resultQuotedIsa, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$15 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                if( NIL == meta_result_quoted_isaP )
                {
                  SubLObject csome_list_var;
                  SubLObject result_quoted_isa;
                  for( csome_list_var = result_quoted_isa( meta_functor, mt ), result_quoted_isa = NIL, result_quoted_isa = csome_list_var.first(); NIL == meta_result_quoted_isaP
                      && NIL != csome_list_var; meta_result_quoted_isaP = genls.any_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_quoted_isa, mt, UNPROVIDED ), csome_list_var = csome_list_var
                          .rest(), result_quoted_isa = csome_list_var.first() )
                  {
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$16, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$15, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg1$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_quoted_isaP;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_quoted_isaP( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 70770L)
  public static SubLObject result_genlP(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const222$resultGenl, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genlP( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_genlP( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 71100L)
  public static SubLObject result_genl_argP(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( functor, $const223$resultGenlArg, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genl_argP( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_genl_argP( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 71445L)
  public static SubLObject result_genl_arg_arg_genlP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    SubLObject v_boolean = NIL;
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject pcase_var = functor;
      if( pcase_var.eql( $const215$FormulaArgFn ) )
      {
        final SubLObject argnum = cycl_utilities.nat_arg1( nat, UNPROVIDED );
        final SubLObject formula = cycl_utilities.nat_arg2( nat, UNPROVIDED );
        final SubLObject relation = cycl_utilities.formula_arg0( formula );
        SubLObject v_boolean_$19 = NIL;
        if( NIL != forts.fort_p( relation ) && argnum.isInteger() && NIL == v_boolean_$19 )
        {
          SubLObject csome_list_var;
          SubLObject arg_genl_pred;
          for( csome_list_var = arg_genl_preds( argnum, relation, mt ), arg_genl_pred = NIL, arg_genl_pred = csome_list_var.first(); NIL == v_boolean_$19 && NIL != csome_list_var; v_boolean_$19 = kb_mapping_utilities
              .some_pred_value_in_relevant_mts( relation, arg_genl_pred, mt, UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var.rest(), arg_genl_pred = csome_list_var.first() )
          {
          }
        }
      }
      if( NIL == v_boolean )
      {
        SubLObject csome_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const223$resultGenlArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject argnum = NIL;
        argnum = csome_list_var2.first();
        while ( NIL == v_boolean && NIL != csome_list_var2)
        {
          if( argnum.isInteger() )
          {
            v_boolean = list_utilities.sublisp_boolean( argn_genl( functor, argnum, mt ) );
          }
          csome_list_var2 = csome_list_var2.rest();
          argnum = csome_list_var2.first();
        }
      }
      return v_boolean;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genl_arg_arg_genlP( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 72315L)
  public static SubLObject meta_result_genlP(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_genlP = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg1$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg1$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const222$resultGenl, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                if( NIL == meta_result_genlP )
                {
                  SubLObject csome_list_var;
                  SubLObject result_isa;
                  for( csome_list_var = result_isa( meta_functor, mt ), result_isa = NIL, result_isa = csome_list_var.first(); NIL == meta_result_genlP && NIL != csome_list_var; meta_result_genlP = genls.any_all_genls(
                      Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED ), csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first() )
                  {
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$21, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$20, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg1$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_genlP;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_genlP( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 73177L)
  public static SubLObject meta_result_genl_argP(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_genl_argP = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg1$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg1$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const223$resultGenlArg, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$25 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                if( NIL == meta_result_genl_argP )
                {
                  SubLObject csome_list_var;
                  SubLObject result_isa;
                  for( csome_list_var = result_isa( meta_functor, mt ), result_isa = NIL, result_isa = csome_list_var.first(); NIL == meta_result_genl_argP && NIL != csome_list_var; meta_result_genl_argP = genls
                      .any_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED ), csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first() )
                  {
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$25, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
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
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$24, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg1$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_genl_argP;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_genl_argP( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 74066L)
  public static SubLObject result_type(final SubLObject function, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( function ) )
    {
      return kb_mapping_utilities.fpred_value_in_relevant_mts( function, $const210$resultIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( function, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return result_type( narts_high.find_nart( function ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 74313L)
  public static SubLObject result_types(final SubLObject function, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return result_isa( function, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 74410L)
  public static SubLObject result_isa(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const210$resultIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_isa( cycl_utilities.nat_functor( functor ), mt );
    }
    if( NIL != function_to_arg_termP( functor ) )
    {
      return argn_isa( cycl_utilities.nat_arg2( functor, UNPROVIDED ), cycl_utilities.nat_arg1( functor, UNPROVIDED ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 74984L)
  public static SubLObject result_isa_via_arg_arg_isa(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      final SubLObject pcase_var = functor;
      if( pcase_var.eql( $const215$FormulaArgFn ) )
      {
        final SubLObject argnum = cycl_utilities.nat_arg1( naut, UNPROVIDED );
        final SubLObject formula = cycl_utilities.nat_arg2( naut, UNPROVIDED );
        final SubLObject relation = cycl_utilities.formula_arg0( formula );
        if( argnum.isInteger() )
        {
          result = ConsesLow.nconc( result, argn_isa( relation, argnum, mt ) );
        }
      }
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const211$resultIsaArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject argnum2 = NIL;
      argnum2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( argnum2.isInteger() )
        {
          result = ConsesLow.nconc( result, argn_genl( functor, argnum2, mt ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum2 = cdolist_list_var.first();
      }
      return result;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_via_arg_arg_isa( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( naut, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 75774L)
  public static SubLObject result_isa_args(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( function_term );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const211$resultIsaArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( arg.isInteger() )
        {
          final SubLObject col = cycl_utilities.nat_arg( function_term, arg, UNPROVIDED );
          if( NIL != forts.fort_p( col ) )
          {
            result = ConsesLow.cons( col, result );
          }
          else if( NIL != term.first_order_nautP( col ) )
          {
            result = ConsesLow.nconc( result, genls.nat_min_genls( col, mt, UNPROVIDED ) );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( function_term, UNPROVIDED ) ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_isa_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( function_term, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 76631L)
  public static SubLObject result_isa_arg_isas(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const212$resultIsaArgIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( arg.isInteger() )
        {
          final SubLObject v_term = cycl_utilities.nat_arg( naut, arg, UNPROVIDED );
          result = ConsesLow.nconc( result, isa.isa( v_term, mt, UNPROVIDED ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_arg_isas( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( naut, UNPROVIDED ) ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 77299L)
  public static SubLObject result_isa_when_arg_isa(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const213$resultIsaWhenArgIsa, ONE_INTEGER, $list227, UNPROVIDED, UNPROVIDED );
      SubLObject resultcol_argnum_col = NIL;
      resultcol_argnum_col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject resultcol = resultcol_argnum_col.first();
        final SubLObject argnum = conses_high.second( resultcol_argnum_col );
        final SubLObject col = conses_high.third( resultcol_argnum_col );
        if( argnum.isInteger() )
        {
          final SubLObject v_term = cycl_utilities.nat_arg( naut, argnum, UNPROVIDED );
          if( NIL != at_defns.quiet_has_typeP( v_term, col, mt ) )
          {
            result = ConsesLow.cons( resultcol, result );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        resultcol_argnum_col = cdolist_list_var.first();
      }
      return list_utilities.remove_duplicate_forts( result );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_when_arg_isa( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( naut, UNPROVIDED ) ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 78206L)
  public static SubLObject result_isa_via_closed_under_internal(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return result_isa_via_closed_under_int( naut, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 78206L)
  public static SubLObject result_isa_via_closed_under(final SubLObject naut, SubLObject mt)
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
      return result_isa_via_closed_under_internal( naut, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym228$RESULT_ISA_VIA_CLOSED_UNDER, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym228$RESULT_ISA_VIA_CLOSED_UNDER, TWO_INTEGER, $int229$512, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym228$RESULT_ISA_VIA_CLOSED_UNDER, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( naut, mt );
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
        if( naut.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( result_isa_via_closed_under_internal( naut, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( naut, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 78377L)
  public static SubLObject result_isa_via_closed_under_int(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( functor, $const214$closedUnder, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject failP = NIL;
          if( NIL == failP )
          {
            SubLObject csome_list_var;
            SubLObject arg;
            for( csome_list_var = cycl_utilities.nat_args( naut, UNPROVIDED ), arg = NIL, arg = csome_list_var.first(); NIL == failP && NIL != csome_list_var; failP = makeBoolean( NIL == at_defns.quiet_has_typeP( arg,
                col, UNPROVIDED ) ), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first() )
            {
            }
          }
          if( NIL == failP )
          {
            result = ConsesLow.cons( col, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          col = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_isa_via_closed_under_int( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( naut, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 79098L)
  public static SubLObject result_inter_arg_isa_internal(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return result_inter_arg_isa_int( function_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 79098L)
  public static SubLObject result_inter_arg_isa(final SubLObject function_term, SubLObject mt)
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
      return result_inter_arg_isa_internal( function_term, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym230$RESULT_INTER_ARG_ISA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym230$RESULT_INTER_ARG_ISA, TWO_INTEGER, $int229$512, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym230$RESULT_INTER_ARG_ISA, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( function_term, mt );
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
        if( function_term.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( result_inter_arg_isa_internal( function_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( function_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 79273L)
  public static SubLObject result_inter_arg_isa_int(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject functor = cycl_utilities.nat_functor( function_term );
    if( NIL != forts.fort_p( functor ) )
    {
      if( NIL == somewhere_cache.inter_arg_result_isa_somewhereP( functor, ONE_INTEGER, UNPROVIDED ) )
      {
        return NIL;
      }
      final SubLObject argXindXdeps = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const231$interArgResultIsa, ONE_INTEGER, $list227, mt, UNPROVIDED );
      SubLObject result = NIL;
      SubLObject cdolist_list_var = argXindXdeps;
      SubLObject argXindXdep = NIL;
      argXindXdep = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject arg = argXindXdep.first();
        final SubLObject ind_col = conses_high.second( argXindXdep );
        final SubLObject dep_col = conses_high.third( argXindXdep );
        final SubLObject ind_arg = cycl_utilities.nat_arg( function_term, arg, UNPROVIDED );
        if( NIL != at_defns.quiet_has_typeP( ind_arg, ind_col, mt ) )
        {
          result = ConsesLow.cons( dep_col, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argXindXdep = cdolist_list_var.first();
      }
      return genls.min_cols( list_utilities.remove_duplicate_forts( result ), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_inter_arg_isa_int( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( function_term, UNPROVIDED ) ), mt );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 80186L)
  public static SubLObject result_inter_arg_isa_reln_internal(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return result_inter_arg_isa_reln_int( function_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 80186L)
  public static SubLObject result_inter_arg_isa_reln(final SubLObject function_term, SubLObject mt)
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
      return result_inter_arg_isa_reln_internal( function_term, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym232$RESULT_INTER_ARG_ISA_RELN, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym232$RESULT_INTER_ARG_ISA_RELN, TWO_INTEGER, $int229$512, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym232$RESULT_INTER_ARG_ISA_RELN, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( function_term, mt );
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
        if( function_term.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( result_inter_arg_isa_reln_internal( function_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( function_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 80371L)
  public static SubLObject result_inter_arg_isa_reln_int(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject functor = cycl_utilities.nat_functor( function_term );
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject argnumXrelXnatargXcolargs = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const233$interArgResultIsaReln, ONE_INTEGER, $list234, mt, $kw73$TRUE );
      SubLObject result = NIL;
      SubLObject cdolist_list_var = argnumXrelXnatargXcolargs;
      SubLObject argnumXrelXnatargXcolarg = NIL;
      argnumXrelXnatargXcolarg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = argnumXrelXnatargXcolarg;
        SubLObject argnum = NIL;
        SubLObject rel = NIL;
        SubLObject nat_term_arg = NIL;
        SubLObject col_arg = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        nat_term_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        col_arg = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject nat_term = cycl_utilities.nat_arg( function_term, argnum, UNPROVIDED );
          SubLObject cols = NIL;
          if( NIL != forts.fort_p( nat_term ) )
          {
            cols = kb_mapping_utilities.pred_values_in_relevant_mts( nat_term, rel, mt, nat_term_arg, col_arg, $kw73$TRUE );
          }
          else
          {
            cols = NIL;
          }
          result = ConsesLow.nconc( result, cols );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list235 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnumXrelXnatargXcolarg = cdolist_list_var.first();
      }
      return genls.min_cols( list_utilities.remove_duplicate_forts( result ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_inter_arg_isa_reln_int( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( function_term, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 81441L)
  public static SubLObject meta_result_isa(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_isa = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg2$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( ONE_INTEGER, thread );
        control_vars.$mapping_fn_arg2$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const210$resultIsa, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        final SubLObject _prev_bind_0_$28 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                  SubLObject cdolist_list_var = result_isa( meta_functor, mt );
                  SubLObject result_isa = NIL;
                  result_isa = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    meta_result_isa = ConsesLow.nconc( meta_result_isa, genls.gather_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED, UNPROVIDED ) );
                    cdolist_list_var = cdolist_list_var.rest();
                    result_isa = cdolist_list_var.first();
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$30, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$29, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$28, thread );
        }
        meta_result_isa = genls.min_cols( list_utilities.remove_duplicate_forts( meta_result_isa ), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg2$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_isa;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_isa( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 82403L)
  public static SubLObject meta_result_isa_args(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( function_term );
    final SubLObject meta_functor = cycl_utilities.nat_functor( functor );
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_isa_args = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg2$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( ONE_INTEGER, thread );
        control_vars.$mapping_fn_arg2$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const211$resultIsaArg, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                SubLObject cdolist_list_var = result_isa( meta_functor, mt );
                SubLObject result_isa = NIL;
                result_isa = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  meta_result_isa_args = ConsesLow.nconc( meta_result_isa_args, genls.gather_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED, UNPROVIDED ) );
                  cdolist_list_var = cdolist_list_var.rest();
                  result_isa = cdolist_list_var.first();
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$34, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$33, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg2$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject cdolist_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const211$resultIsaArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject arg = NIL;
        arg = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( arg.isInteger() )
          {
            final SubLObject v_isa = cycl_utilities.nat_arg( function_term, arg, UNPROVIDED );
            if( NIL != forts.fort_p( v_isa ) )
            {
              meta_result_isa_args = ConsesLow.cons( v_isa, meta_result_isa_args );
            }
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          arg = cdolist_list_var2.first();
        }
      }
      return genls.min_cols( list_utilities.remove_duplicate_forts( meta_result_isa_args ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_isa_args( el_utilities.make_nat_formula( el_utilities.make_nat_formula( narts_high.find_nart( meta_functor ), cycl_utilities.nat_args( functor, UNPROVIDED ) ), cycl_utilities.nat_args(
          function_term, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 83857L)
  public static SubLObject evaluation_result_quoted_isa(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == fort_types_interface.isa_evaluatable_functionP( functor, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != forts.fort_p( functor ) && NIL != fort_types_interface.evaluatable_function_p( functor ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const220$evaluationResultQuotedIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return evaluation_result_quoted_isa( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_evaluation_result_quoted_isa( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 84647L)
  public static SubLObject meta_evaluation_result_quoted_isa(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_evaluation_result_quoted_isa = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg2$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( ONE_INTEGER, thread );
        control_vars.$mapping_fn_arg2$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const220$evaluationResultQuotedIsa, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        final SubLObject _prev_bind_0_$37 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$38 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                  SubLObject cdolist_list_var = evaluation_result_quoted_isa( meta_functor, mt );
                  SubLObject evaluation_result_quoted_isa = NIL;
                  evaluation_result_quoted_isa = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    meta_evaluation_result_quoted_isa = ConsesLow.nconc( meta_evaluation_result_quoted_isa, genls.gather_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), evaluation_result_quoted_isa,
                        mt, UNPROVIDED, UNPROVIDED ) );
                    cdolist_list_var = cdolist_list_var.rest();
                    evaluation_result_quoted_isa = cdolist_list_var.first();
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$39, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$38, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$37, thread );
        }
        meta_evaluation_result_quoted_isa = genls.min_cols( list_utilities.remove_duplicate_forts( meta_evaluation_result_quoted_isa ), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg2$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_evaluation_result_quoted_isa;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_evaluation_result_quoted_isa( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 85861L)
  public static SubLObject result_quoted_isa(final SubLObject functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const221$resultQuotedIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_quoted_isa( narts_high.find_nart( functor ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_quoted_isa( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 86493L)
  public static SubLObject meta_result_quoted_isa(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_quoted_isa = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg2$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( ONE_INTEGER, thread );
        control_vars.$mapping_fn_arg2$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const221$resultQuotedIsa, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        final SubLObject _prev_bind_0_$42 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                  SubLObject cdolist_list_var = result_quoted_isa( meta_functor, mt );
                  SubLObject result_quoted_isa = NIL;
                  result_quoted_isa = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    meta_result_quoted_isa = ConsesLow.nconc( meta_result_quoted_isa, genls.gather_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_quoted_isa, mt, UNPROVIDED, UNPROVIDED ) );
                    cdolist_list_var = cdolist_list_var.rest();
                    result_quoted_isa = cdolist_list_var.first();
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$44, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$43, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$42, thread );
        }
        meta_result_quoted_isa = genls.min_cols( list_utilities.remove_duplicate_forts( meta_result_quoted_isa ), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg2$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_quoted_isa;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_quoted_isa( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 87554L)
  public static SubLObject result_genl(final SubLObject functor, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const222$resultGenl, mt, ONE_INTEGER, TWO_INTEGER, truth );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genl( narts_high.find_nart( functor ), mt, truth );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) && truth.eql( $kw73$TRUE ) )
    {
      return meta_result_genl( cycl_utilities.nat_functor( functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 88045L)
  public static SubLObject result_genl_args(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( function_term );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const223$resultGenlArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( arg.isInteger() )
        {
          final SubLObject col = cycl_utilities.nat_arg( function_term, arg, UNPROVIDED );
          if( NIL != forts.fort_p( col ) )
          {
            result = ConsesLow.cons( col, result );
          }
          else if( NIL != term.first_order_nautP( col ) )
          {
            result = ConsesLow.nconc( result, genls.nat_min_genls( col, mt, UNPROVIDED ) );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return result;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genl_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( function_term, UNPROVIDED ) ), mt );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return meta_result_genl_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( function_term, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 88883L)
  public static SubLObject result_genl_via_arg_arg_genl(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    if( NIL != forts.fort_p( functor ) )
    {
      SubLObject result = NIL;
      final SubLObject pcase_var = functor;
      if( pcase_var.eql( $const215$FormulaArgFn ) )
      {
        final SubLObject argnum = cycl_utilities.nat_arg1( naut, UNPROVIDED );
        final SubLObject formula = cycl_utilities.nat_arg2( naut, UNPROVIDED );
        final SubLObject relation = cycl_utilities.formula_arg0( formula );
        if( argnum.isInteger() )
        {
          result = ConsesLow.nconc( result, argn_genl( relation, argnum, mt ) );
        }
      }
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const223$resultGenlArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject argnum2 = NIL;
      argnum2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( argnum2.isInteger() )
        {
          result = ConsesLow.nconc( result, argn_genl( functor, argnum2, mt ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum2 = cdolist_list_var.first();
      }
      return result;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_genl_via_arg_arg_genl( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( naut, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 89674L)
  public static SubLObject result_inter_arg_genl(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject argXindXdeps = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const241$interArgResultGenl, ONE_INTEGER, $list227, mt, UNPROVIDED );
      SubLObject result = NIL;
      SubLObject cdolist_list_var = argXindXdeps;
      SubLObject argXindXdep = NIL;
      argXindXdep = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject arg = argXindXdep.first();
        final SubLObject ind_col = conses_high.second( argXindXdep );
        final SubLObject dep_col = conses_high.third( argXindXdep );
        final SubLObject arg_col = cycl_utilities.nat_arg( nat, arg, UNPROVIDED );
        if( NIL != term.el_fort_p( arg_col ) && NIL != term.el_fort_p( ind_col ) && NIL != forts.fort_p( dep_col ) && NIL != genls.genlsP( arg_col, ind_col, mt, UNPROVIDED ) )
        {
          result = ConsesLow.cons( dep_col, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argXindXdep = cdolist_list_var.first();
      }
      return genls.min_cols( list_utilities.remove_duplicate_forts( result ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_inter_arg_genl( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 90537L)
  public static SubLObject result_inter_arg_genl_reln(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    if( NIL != forts.fort_p( functor ) )
    {
      final SubLObject argnumXrelXnatargXcolargs = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const242$interArgResultGenlReln, ONE_INTEGER, $list234, mt, $kw73$TRUE );
      SubLObject result = NIL;
      SubLObject cdolist_list_var = argnumXrelXnatargXcolargs;
      SubLObject argnumXrelXnatargXcolarg = NIL;
      argnumXrelXnatargXcolarg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = argnumXrelXnatargXcolarg;
        SubLObject argnum = NIL;
        SubLObject rel = NIL;
        SubLObject nat_term_arg = NIL;
        SubLObject col_arg = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        rel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        nat_term_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
        col_arg = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject nat_term = cycl_utilities.nat_arg( nat, argnum, UNPROVIDED );
          SubLObject cols = NIL;
          if( NIL != forts.fort_p( nat_term ) )
          {
            cols = kb_mapping_utilities.pred_values_in_relevant_mts( nat_term, rel, mt, nat_term_arg, col_arg, $kw73$TRUE );
          }
          else
          {
            cols = NIL;
          }
          result = ConsesLow.nconc( result, cols );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list235 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnumXrelXnatargXcolarg = cdolist_list_var.first();
      }
      return genls.min_cols( list_utilities.remove_duplicate_forts( result ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
    {
      return result_inter_arg_genl( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 91537L)
  public static SubLObject meta_result_genl(final SubLObject meta_functor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_genl = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg2$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( ONE_INTEGER, thread );
        control_vars.$mapping_fn_arg2$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const222$resultGenl, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                  SubLObject cdolist_list_var = result_isa( meta_functor, mt );
                  SubLObject result_isa = NIL;
                  result_isa = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    meta_result_genl = ConsesLow.nconc( meta_result_genl, genls.gather_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED, UNPROVIDED ) );
                    cdolist_list_var = cdolist_list_var.rest();
                    result_isa = cdolist_list_var.first();
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$49, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$48, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$47, thread );
        }
        meta_result_genl = genls.min_cols( list_utilities.remove_duplicate_forts( meta_result_genl ), mt, UNPROVIDED );
      }
      finally
      {
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg2$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      return meta_result_genl;
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_genl( narts_high.find_nart( meta_functor ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 92515L)
  public static SubLObject meta_result_genl_args(final SubLObject function_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( function_term );
    final SubLObject meta_functor = cycl_utilities.nat_functor( functor );
    if( NIL != forts.fort_p( meta_functor ) )
    {
      SubLObject meta_result_genl_args = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg2$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg3$.currentBinding( thread );
      final SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg4$.currentBinding( thread );
      final SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg5$.currentBinding( thread );
      final SubLObject _prev_bind_7 = control_vars.$mapping_fn_arg6$.currentBinding( thread );
      final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        control_vars.$mapping_fn$.bind( Symbols.symbol_function( $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS ), thread );
        control_vars.$mapping_fn_arg$.bind( ONE_INTEGER, thread );
        control_vars.$mapping_fn_arg2$.bind( $const218$relationAllInstance, thread );
        control_vars.$mapping_fn_arg3$.bind( $const223$resultGenlArg, thread );
        control_vars.$mapping_fn_arg4$.bind( mt, thread );
        control_vars.$mapping_fn_arg5$.bind( TWO_INTEGER, thread );
        control_vars.$mapping_fn_arg6$.bind( ONE_INTEGER, thread );
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$53 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                SubLObject cdolist_list_var = result_isa( meta_functor, mt );
                SubLObject result_isa = NIL;
                result_isa = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  meta_result_genl_args = ConsesLow.nconc( meta_result_genl_args, genls.gather_all_genls( Symbols.symbol_function( $sym219$MAPPING_FUNCALL_ARG ), result_isa, mt, UNPROVIDED, UNPROVIDED ) );
                  cdolist_list_var = cdolist_list_var.rest();
                  result_isa = cdolist_list_var.first();
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$53, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$52, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_8, thread );
        control_vars.$mapping_fn_arg6$.rebind( _prev_bind_7, thread );
        control_vars.$mapping_fn_arg5$.rebind( _prev_bind_6, thread );
        control_vars.$mapping_fn_arg4$.rebind( _prev_bind_5, thread );
        control_vars.$mapping_fn_arg3$.rebind( _prev_bind_4, thread );
        control_vars.$mapping_fn_arg2$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_fn_arg$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_fn$.rebind( _prev_bind_0, thread );
      }
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject cdolist_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const223$resultGenlArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject arg = NIL;
        arg = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( arg.isInteger() )
          {
            final SubLObject genl = cycl_utilities.nat_arg( function_term, arg, UNPROVIDED );
            if( NIL != forts.fort_p( genl ) )
            {
              meta_result_genl_args = ConsesLow.cons( genl, meta_result_genl_args );
            }
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          arg = cdolist_list_var2.first();
        }
      }
      return genls.min_cols( list_utilities.remove_duplicate_forts( meta_result_genl_args ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( meta_functor ) )
    {
      return meta_result_genl_args( el_utilities.make_nat_formula( el_utilities.make_nat_formula( narts_high.find_nart( meta_functor ), cycl_utilities.nat_args( functor, UNPROVIDED ) ), cycl_utilities.nat_args(
          function_term, UNPROVIDED ) ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 93987L)
  public static SubLObject result_isa_of(final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( collection, $const210$resultIsa, mt, TWO_INTEGER, ONE_INTEGER, truth );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( collection ) )
    {
      return result_isa_of( narts_high.find_nart( collection ), mt, truth );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 94262L)
  public static SubLObject result_genl_of(final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( collection, $const222$resultGenl, mt, TWO_INTEGER, ONE_INTEGER, truth );
    }
    if( NIL != czer_utilities.naut_with_corresponding_nartP( collection ) )
    {
      return result_genl_of( narts_high.find_nart( collection ), mt, truth );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 94542L)
  public static SubLObject result_genl_via_argnums(final SubLObject nat_formula, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat_formula );
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const223$resultGenlArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != subl_promotions.positive_integer_p( argnum ) )
          {
            final SubLObject col = cycl_utilities.nat_arg( nat_formula, argnum, UNPROVIDED );
            if( NIL != term.el_fort_p( col ) && NIL != genls.genlsP( col, collection, mt, UNPROVIDED ) )
            {
              result = ConsesLow.cons( argnum, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          argnum = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_genl_via_argnums( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat_formula, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 95243L)
  public static SubLObject result_isa_via_argnums(final SubLObject nat_formula, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat_formula );
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const211$resultIsaArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != subl_promotions.positive_integer_p( argnum ) )
          {
            final SubLObject col = cycl_utilities.nat_arg( nat_formula, argnum, UNPROVIDED );
            if( NIL != term.el_fort_p( col ) && NIL != genls.genlsP( col, collection, mt, UNPROVIDED ) )
            {
              result = ConsesLow.cons( argnum, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          argnum = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_isa_via_argnums( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat_formula, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 95940L)
  public static SubLObject result_isa_arg_isa_via_argnums(final SubLObject nat, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat );
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const212$resultIsaArgIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != subl_promotions.positive_integer_p( argnum ) )
          {
            final SubLObject v_term = cycl_utilities.nat_arg( nat, argnum, UNPROVIDED );
            if( NIL != at_defns.quiet_has_typeP( v_term, collection, mt ) )
            {
              result = ConsesLow.cons( argnum, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          argnum = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_isa_arg_isa_via_argnums( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 96722L)
  public static SubLObject result_isa_when_arg_isa_via_argnums(final SubLObject nat, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat );
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const213$resultIsaWhenArgIsa, ONE_INTEGER, $list227, UNPROVIDED, UNPROVIDED );
        SubLObject resultcol_argnum_col = NIL;
        resultcol_argnum_col = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject resultcol = resultcol_argnum_col.first();
          final SubLObject argnum = conses_high.second( resultcol_argnum_col );
          final SubLObject col = conses_high.third( resultcol_argnum_col );
          if( argnum.isInteger() )
          {
            final SubLObject v_term = cycl_utilities.nat_arg( nat, argnum, UNPROVIDED );
            if( NIL != at_defns.quiet_has_typeP( v_term, col, mt ) )
            {
              result = ConsesLow.cons( resultcol_argnum_col, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          resultcol_argnum_col = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_isa_when_arg_isa_via_argnums( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 97719L)
  public static SubLObject result_inter_arg_isa_via_which_args(final SubLObject nat_formula, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat_formula );
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const231$interArgResultIsa, ONE_INTEGER, $list227, mt, UNPROVIDED );
        SubLObject argXindXdep = NIL;
        argXindXdep = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject arg = argXindXdep.first();
          final SubLObject ind_col = conses_high.second( argXindXdep );
          final SubLObject dep_col = conses_high.third( argXindXdep );
          final SubLObject arg_col = cycl_utilities.nat_arg( nat_formula, arg, UNPROVIDED );
          if( NIL != term.el_fort_p( ind_col ) && NIL != term.el_fort_p( dep_col ) && NIL != at_defns.quiet_has_typeP( arg_col, ind_col, mt ) && NIL != genls.genlsP( dep_col, collection, mt, UNPROVIDED ) )
          {
            result = ConsesLow.cons( argXindXdep, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argXindXdep = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_inter_arg_isa_via_which_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat_formula, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 98616L)
  public static SubLObject result_inter_arg_isa_reln_via_which_args(final SubLObject nat_formula, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat_formula );
      if( NIL != forts.fort_p( functor ) )
      {
        final SubLObject argXrelXnatargXcolargs = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const233$interArgResultIsaReln, ONE_INTEGER, $list234, mt, $kw73$TRUE );
        SubLObject result = NIL;
        SubLObject cdolist_list_var = argXrelXnatargXcolargs;
        SubLObject argXrelXnatargXcolarg = NIL;
        argXrelXnatargXcolarg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject arg = argXrelXnatargXcolarg.first();
          final SubLObject rel = conses_high.second( argXrelXnatargXcolarg );
          final SubLObject nat_term_arg = conses_high.third( argXrelXnatargXcolarg );
          final SubLObject col_arg = conses_high.fourth( argXrelXnatargXcolarg );
          final SubLObject nat_term = cycl_utilities.nat_arg( nat_formula, arg, UNPROVIDED );
          final SubLObject rel_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( nat_term, rel, mt, nat_term_arg, $kw73$TRUE );
          SubLObject rel_sentences = NIL;
          SubLObject cdolist_list_var_$56 = rel_gafs;
          SubLObject rel_gaf = NIL;
          rel_gaf = cdolist_list_var_$56.first();
          while ( NIL != cdolist_list_var_$56)
          {
            final SubLObject col = assertions_high.gaf_arg( rel_gaf, col_arg );
            if( NIL != genls.genlsP( col, collection, mt, UNPROVIDED ) )
            {
              rel_sentences = ConsesLow.cons( assertions_high.gaf_formula( rel_gaf ), rel_sentences );
            }
            cdolist_list_var_$56 = cdolist_list_var_$56.rest();
            rel_gaf = cdolist_list_var_$56.first();
          }
          if( NIL != rel_sentences )
          {
            result = ConsesLow.cons( ConsesLow.list( rel_sentences, arg, nat_term_arg, col_arg ), result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argXrelXnatargXcolarg = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_inter_arg_isa_reln_via_which_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat_formula, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 100452L)
  public static SubLObject result_inter_arg_genl_via_which_args(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat_formula );
      if( NIL != forts.fort_p( functor ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const241$interArgResultGenl, ONE_INTEGER, $list227, mt, UNPROVIDED );
        SubLObject argXindXdep = NIL;
        argXindXdep = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject arg = argXindXdep.first();
          final SubLObject ind_col = conses_high.second( argXindXdep );
          final SubLObject dep_col = conses_high.third( argXindXdep );
          final SubLObject arg_col = cycl_utilities.nat_arg( nat_formula, arg, UNPROVIDED );
          if( NIL != term.el_fort_p( arg_col ) && NIL != term.el_fort_p( ind_col ) && NIL != term.el_fort_p( dep_col ) && NIL != genls.genlsP( arg_col, ind_col, mt, UNPROVIDED ) && NIL != genls.genlsP( dep_col,
              collection, mt, UNPROVIDED ) )
          {
            result = ConsesLow.cons( argXindXdep, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argXindXdep = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_inter_arg_genl_via_which_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat_formula, UNPROVIDED ) ), collection, mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 101346L)
  public static SubLObject result_inter_arg_genl_reln_via_which_args(final SubLObject nat_formula, final SubLObject collection, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    if( NIL != term.el_fort_p( collection ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( nat_formula );
      if( NIL != forts.fort_p( functor ) )
      {
        final SubLObject argXrelXnatargXcolargs = kb_mapping_utilities.pred_value_tuples_in_relevant_mts( functor, $const242$interArgResultGenlReln, ONE_INTEGER, $list234, mt, $kw73$TRUE );
        SubLObject result = NIL;
        SubLObject cdolist_list_var = argXrelXnatargXcolargs;
        SubLObject argXrelXnatargXcolarg = NIL;
        argXrelXnatargXcolarg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject arg = argXrelXnatargXcolarg.first();
          final SubLObject rel = conses_high.second( argXrelXnatargXcolarg );
          final SubLObject nat_term_arg = conses_high.third( argXrelXnatargXcolarg );
          final SubLObject col_arg = conses_high.fourth( argXrelXnatargXcolarg );
          final SubLObject nat_term = cycl_utilities.nat_arg( nat_formula, arg, UNPROVIDED );
          final SubLObject rel_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( nat_term, rel, mt, nat_term_arg, $kw73$TRUE );
          SubLObject rel_sentences = NIL;
          SubLObject cdolist_list_var_$57 = rel_gafs;
          SubLObject rel_gaf = NIL;
          rel_gaf = cdolist_list_var_$57.first();
          while ( NIL != cdolist_list_var_$57)
          {
            final SubLObject col = assertions_high.gaf_arg( rel_gaf, col_arg );
            if( NIL != genls.genlsP( col, collection, mt, UNPROVIDED ) )
            {
              rel_sentences = ConsesLow.cons( assertions_high.gaf_formula( rel_gaf ), rel_sentences );
            }
            cdolist_list_var_$57 = cdolist_list_var_$57.rest();
            rel_gaf = cdolist_list_var_$57.first();
          }
          if( NIL != rel_sentences )
          {
            result = ConsesLow.cons( ConsesLow.list( rel_sentences, arg, nat_term_arg, col_arg ), result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argXrelXnatargXcolarg = cdolist_list_var.first();
        }
        return Sequences.nreverse( result );
      }
      if( NIL != czer_utilities.naut_with_corresponding_nartP( functor ) )
      {
        return result_inter_arg_genl_reln_via_which_args( el_utilities.make_nat_formula( narts_high.find_nart( functor ), cycl_utilities.nat_args( nat_formula, UNPROVIDED ) ), collection, mt, truth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103190L)
  public static SubLObject arg1_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format( relation, ONE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103299L)
  public static SubLObject arg2_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format( relation, TWO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103381L)
  public static SubLObject arg3_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format( relation, THREE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103463L)
  public static SubLObject arg4_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format( relation, FOUR_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103545L)
  public static SubLObject arg5_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format( relation, FIVE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103627L)
  public static SubLObject arg6_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format( relation, SIX_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103709L)
  public static SubLObject argn_format_inverse(final SubLObject n)
  {
    if( n.eql( ONE_INTEGER ) )
    {
      return argn_format_pred( TWO_INTEGER );
    }
    if( n.eql( TWO_INTEGER ) )
    {
      return argn_format_pred( ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 103909L)
  public static SubLObject argn_format_pred(final SubLObject n)
  {
    if( n.eql( ONE_INTEGER ) )
    {
      return $const243$arg1Format;
    }
    if( n.eql( TWO_INTEGER ) )
    {
      return $const244$arg2Format;
    }
    if( n.eql( THREE_INTEGER ) )
    {
      return $const245$arg3Format;
    }
    if( n.eql( FOUR_INTEGER ) )
    {
      return $const246$arg4Format;
    }
    if( n.eql( FIVE_INTEGER ) )
    {
      return $const247$arg5Format;
    }
    if( n.eql( SIX_INTEGER ) )
    {
      return $const248$arg6Format;
    }
    el_utilities.el_error( THREE_INTEGER, $str249$illegal_arg_specification_for_arg, n, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 104299L)
  public static SubLObject argn_format(final SubLObject relation, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      SubLObject result = NIL;
      final SubLObject format_pred = argn_format_pred( n );
      if( NIL != forts.fort_p( format_pred ) )
      {
        result = ConsesLow.nconc( result, kb_mapping_utilities.pred_values_in_relevant_mts( relation, format_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      if( NIL == subl_promotions.memberP( $const250$singleEntryFormatInArgs, result, UNPROVIDED, UNPROVIDED ) && NIL != single_entry_format_in_argsP( relation, n, mt ) )
      {
        result = ConsesLow.cons( $const250$singleEntryFormatInArgs, result );
      }
      return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_format( narts_high.find_nart( relation ), n, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 104911L)
  public static SubLObject single_entry_format_in_argsP(final SubLObject relation, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const250$singleEntryFormatInArgs, relation, ONE_INTEGER, UNPROVIDED ) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(
        $const250$singleEntryFormatInArgs, relation, n, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 105150L)
  public static SubLObject each_arg_format(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      final SubLObject pcase_var;
      final SubLObject v_arity = pcase_var = arity.arity( relation );
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        return ConsesLow.nconc( argn_format( relation, ONE_INTEGER, mt ), argn_format( relation, TWO_INTEGER, mt ) );
      }
      if( pcase_var.eql( TWO_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_format( relation, ONE_INTEGER, mt ), argn_format( relation, TWO_INTEGER, mt ) ) );
      }
      if( pcase_var.eql( THREE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( argn_format( relation, ONE_INTEGER, mt ), argn_format( relation, TWO_INTEGER, mt ), argn_format( relation, THREE_INTEGER, mt ) ) );
      }
      if( pcase_var.eql( FOUR_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_format( relation, ONE_INTEGER, mt ), argn_format( relation, TWO_INTEGER, mt ), argn_format( relation, THREE_INTEGER, mt ),
          argn_format( relation, FOUR_INTEGER, mt )
        } ) );
      }
      if( pcase_var.eql( FIVE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_format( relation, ONE_INTEGER, mt ), argn_format( relation, TWO_INTEGER, mt ), argn_format( relation, THREE_INTEGER, mt ),
          argn_format( relation, FOUR_INTEGER, mt ), argn_format( relation, FIVE_INTEGER, mt )
        } ) );
      }
      if( pcase_var.eql( FIVE_INTEGER ) )
      {
        return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { argn_format( relation, ONE_INTEGER, mt ), argn_format( relation, TWO_INTEGER, mt ), argn_format( relation, THREE_INTEGER, mt ),
          argn_format( relation, FOUR_INTEGER, mt ), argn_format( relation, FIVE_INTEGER, mt ), argn_format( relation, SIX_INTEGER, mt )
        } ) );
      }
    }
    else if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return each_arg_format( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 106447L)
  public static SubLObject arg_n_single_entry_formatP(final SubLObject relation, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return makeBoolean( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( argn_format_pred( n ), relation, $const251$SingleEntry, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities
          .pred_u_v_holds_in_relevant_mts( argn_format_pred( n ), relation, $const250$singleEntryFormatInArgs, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return arg_n_single_entry_formatP( narts_high.find_nart( relation ), n, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 106940L)
  public static SubLObject arg1_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format_of( format, ONE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107048L)
  public static SubLObject arg2_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format_of( format, TWO_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107132L)
  public static SubLObject arg3_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format_of( format, THREE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107216L)
  public static SubLObject arg4_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format_of( format, FOUR_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107300L)
  public static SubLObject arg5_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format_of( format, FIVE_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107384L)
  public static SubLObject arg6_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return argn_format_of( format, SIX_INTEGER, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107468L)
  public static SubLObject arg_format_of(final SubLObject format, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.remove_duplicate_forts( ConsesLow.nconc( new SubLObject[] { arg1_format_of( format, mt ), arg2_format_of( format, mt ), arg3_format_of( format, mt ), arg4_format_of( format, mt ),
      arg5_format_of( format, mt ), arg6_format_of( format, mt )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 107999L)
  public static SubLObject argn_format_of(final SubLObject format, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( format ) )
    {
      final SubLObject arg_format_pred = argn_format_pred( n );
      if( NIL != forts.fort_p( arg_format_pred ) )
      {
        return kb_mapping_utilities.pred_values_in_relevant_mts( format, arg_format_pred, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      }
    }
    else if( NIL != obsolete.reifiable_natP( format, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return argn_format_of( narts_high.find_nart( format ), mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 108437L)
  public static SubLObject inter_arg_format_dep(final SubLObject relation, final SubLObject inter_arg_format_pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( relation, inter_arg_format_pred, mt, ONE_INTEGER, THREE_INTEGER, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_format_dep( narts_high.find_nart( relation ), inter_arg_format_pred, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 108769L)
  public static SubLObject inter_arg_format_pred(final SubLObject ind_arg, final SubLObject dep_arg)
  {
    final SubLObject ind_candidates = inter_arg_format_preds_ind( ind_arg );
    final SubLObject dep_candidates = inter_arg_format_preds_dep( dep_arg );
    SubLObject pred = NIL;
    if( NIL == pred )
    {
      SubLObject csome_list_var = ind_candidates;
      SubLObject candidate = NIL;
      candidate = csome_list_var.first();
      while ( NIL == pred && NIL != csome_list_var)
      {
        if( NIL != subl_promotions.memberP( candidate, dep_candidates, UNPROVIDED, UNPROVIDED ) )
        {
          pred = candidate;
        }
        csome_list_var = csome_list_var.rest();
        candidate = csome_list_var.first();
      }
    }
    return pred;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 109079L)
  public static SubLObject inter_arg_format_inverse(final SubLObject ind_arg, final SubLObject dep_arg)
  {
    if( NIL != subl_promotions.memberP( ind_arg, $list252, UNPROVIDED, UNPROVIDED ) && NIL != subl_promotions.memberP( dep_arg, $list252, UNPROVIDED, UNPROVIDED ) )
    {
      return inter_arg_format_pred( dep_arg, ind_arg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 109366L)
  public static SubLObject inter_arg_format1_2(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, $const253$interArgFormat1_2, ONE_INTEGER, $list97, mt, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_format1_2( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 109750L)
  public static SubLObject inter_arg_format2_1(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return kb_mapping_utilities.pred_value_tuples_in_relevant_mts( relation, $const254$interArgFormat2_1, ONE_INTEGER, $list97, mt, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( relation, Symbols.symbol_function( $sym81$CYC_VAR_ ), mt ) )
    {
      return inter_arg_format2_1( narts_high.find_nart( relation ), mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 110134L)
  public static SubLObject inter_arg_format_preds_dep(final SubLObject arg)
  {
    if( arg.eql( ONE_INTEGER ) )
    {
      return $list255;
    }
    if( arg.eql( TWO_INTEGER ) )
    {
      return $list256;
    }
    if( arg.eql( THREE_INTEGER ) )
    {
      return $list257;
    }
    if( arg.eql( FOUR_INTEGER ) )
    {
      return $list258;
    }
    if( arg.eql( FIVE_INTEGER ) )
    {
      return $list259;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 110676L)
  public static SubLObject inter_arg_format_preds_ind(final SubLObject arg)
  {
    if( arg.eql( ONE_INTEGER ) )
    {
      return $list260;
    }
    if( arg.eql( TWO_INTEGER ) )
    {
      return $list261;
    }
    if( arg.eql( THREE_INTEGER ) )
    {
      return $list262;
    }
    if( arg.eql( FOUR_INTEGER ) )
    {
      return $list263;
    }
    if( arg.eql( FIVE_INTEGER ) )
    {
      return $list264;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 111218L)
  public static SubLObject required_pred_arg(final SubLObject required_pred)
  {
    if( required_pred.eql( $const265$requiredArg1Pred ) )
    {
      return ONE_INTEGER;
    }
    if( required_pred.eql( $const266$requiredArg2Pred ) )
    {
      return TWO_INTEGER;
    }
    el_utilities.el_error( THREE_INTEGER, $str267$illegal_required_pred_for_require, required_pred, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 111477L)
  public static SubLObject required_pred_of_argnum(final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      return $const265$requiredArg1Pred;
    }
    if( argnum.eql( TWO_INTEGER ) )
    {
      return $const266$requiredArg2Pred;
    }
    el_utilities.el_error( THREE_INTEGER, $str268$illegal_arg_number_for_required_p, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 111686L)
  public static SubLObject required_preds_of_argnum(final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      return $list269;
    }
    if( argnum.eql( TWO_INTEGER ) )
    {
      return $list270;
    }
    el_utilities.el_error( THREE_INTEGER, $str268$illegal_arg_number_for_required_p, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 111902L)
  public static SubLObject relation_all_preds_of_argnum(final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      return $list271;
    }
    if( argnum.eql( TWO_INTEGER ) )
    {
      return $list272;
    }
    el_utilities.el_error( THREE_INTEGER, $str268$illegal_arg_number_for_required_p, argnum, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 112419L)
  public static SubLObject relation_exists_preds_of_argnum(final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      return $list273;
    }
    if( argnum.eql( TWO_INTEGER ) )
    {
      return $list274;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 113181L)
  public static SubLObject pred_mts(final SubLObject fort, final SubLObject pred, SubLObject index_args)
  {
    if( index_args == UNPROVIDED )
    {
      index_args = $list252;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = index_args;
    SubLObject index_arg = NIL;
    index_arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = kb_indexing.mts_gaf_arg_index( fort, index_arg, pred, result );
      cdolist_list_var = cdolist_list_var.rest();
      index_arg = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 113641L)
  public static SubLObject mts_of_fort_wrt_predicate_type(final SubLObject fort, final SubLObject predicate_type, SubLObject index_args)
  {
    if( index_args == UNPROVIDED )
    {
      index_args = $list252;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_data_1$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_data_2$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_data_1$.bind( fort, thread );
      control_vars.$mapping_data_2$.bind( index_args, thread );
      final SubLObject _prev_bind_0_$58 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$59 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
        isa.map_all_instances( Symbols.symbol_function( $sym275$MTS_OF_PREDICATE_TYPE_INT ), predicate_type, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$59, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$58, thread );
      }
      result = list_utilities.remove_duplicate_forts( control_vars.$mapping_answer$.getDynamicValue( thread ) );
    }
    finally
    {
      control_vars.$mapping_data_2$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_data_1$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 114168L)
  public static SubLObject mts_of_predicate_type_int(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    control_vars.$mapping_answer$.setDynamicValue( ConsesLow.nconc( control_vars.$mapping_answer$.getDynamicValue( thread ), pred_mts( control_vars.$mapping_data_1$.getDynamicValue( thread ), pred,
        control_vars.$mapping_data_2$.getDynamicValue( thread ) ) ), thread );
    return control_vars.$mapping_answer$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 114414L)
  public static SubLObject arg_type_mts(final SubLObject fort)
  {
    return mts_of_fort_wrt_predicate_type( fort, $const276$ArgTypePredicate, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 114648L)
  public static SubLObject root_wrtP(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( pred.eql( $const43$genls ) )
    {
      return Equality.eql( v_term, $const36$Thing );
    }
    if( pred.eql( $const277$genlMt ) )
    {
      return Equality.eql( v_term, mt_vars.$mt_root$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 114939L)
  public static SubLObject leaf_wrtP(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 115086L)
  public static SubLObject fan_out_arg(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject arg = asserted_fan_out_arg( pred, mt );
    if( NIL != arg )
    {
      return arg;
    }
    final SubLObject best_inverse_binary_predicate = genl_predicates.best_inverse_binary_predicate( pred, mt, UNPROVIDED );
    if( NIL != best_inverse_binary_predicate )
    {
      final SubLObject pcase_var;
      arg = ( pcase_var = asserted_fan_out_arg( best_inverse_binary_predicate, mt ) );
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        return TWO_INTEGER;
      }
      if( pcase_var.eql( TWO_INTEGER ) )
      {
        return ONE_INTEGER;
      }
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 115572L)
  public static SubLObject asserted_fan_out_arg(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_mapping_utilities.fpred_value_in_relevant_mts( pred, $const278$fanOutArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 115807L)
  public static SubLObject fan_in_arg(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject pcase_var;
    final SubLObject arg = pcase_var = fan_out_arg( pred, mt );
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return TWO_INTEGER;
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 116013L)
  public static SubLObject equivalence_class_wrtP(final SubLObject pred, final SubLObject col1, final SubLObject col2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return equivalence_classP( equivalence_class_pred_wrt( pred, mt ), col1, col2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 116155L)
  public static SubLObject equivalence_classP(final SubLObject pred, final SubLObject col1, final SubLObject col2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != equivalence_class_predP( pred ) )
    {
      return transitivity.gtm( pred, $kw279$SUPERIOR_, col1, col2, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 116300L)
  public static SubLObject equivalence_class_predP(final SubLObject pred)
  {
    return makeBoolean( NIL != transitive_predicateP( pred ) && NIL != symmetric_predicateP( pred ) && NIL != reflexive_predicateP( pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 116453L)
  public static SubLObject equivalence_class_pred_wrt(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( pred.eql( $const43$genls ) )
    {
      return $const280$coExtensional;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 116752L)
  public static SubLObject reviewer(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const281$BookkeepingMt;
    }
    enforceType( fort, $sym49$FORT_P );
    enforceType( mt, $sym282$HLMT_P );
    return kb_mapping_utilities.fpred_value_in_mt( fort, $const283$myReviewer, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 117048L)
  public static SubLObject comment(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( fort, $sym49$FORT_P );
    return kb_mapping_utilities.fpred_value_in_relevant_mts( fort, $const289$comment, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 117253L)
  public static SubLObject comment_if_fort(final SubLObject cycl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( cycl ) )
    {
      return kb_mapping_utilities.fpred_value_in_relevant_mts( cycl, $const289$comment, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 117523L)
  public static SubLObject cyclist_notes(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == forts.fort_p( fort ) )
    {
      return NIL;
    }
    return kb_mapping_utilities.pred_values_in_relevant_mts( fort, $const297$cyclistNotes, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 117678L)
  public static SubLObject constants_referencing_me_in_string(final SubLObject reference, SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject mt)
  {
    if( pred == UNPROVIDED )
    {
      pred = $const289$comment;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = TWO_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = ONE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
    final SubLObject _prev_bind_4 = control_vars.$mapping_target$.currentBinding( thread );
    final SubLObject _prev_bind_5 = control_vars.$mapping_index_arg$.currentBinding( thread );
    final SubLObject _prev_bind_6 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    final SubLObject _prev_bind_7 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      control_vars.$mapping_assertion_selection_fn$.bind( Symbols.symbol_function( $sym298$INDEX_ARG_REFERENCES_IN_STRING_ ), thread );
      control_vars.$mapping_target$.bind( reference.isString() ? reference : string_utilities.str( reference ), thread );
      control_vars.$mapping_index_arg$.bind( index_arg, thread );
      control_vars.$mapping_gather_arg$.bind( gather_arg, thread );
      control_vars.$mapping_answer$.bind( NIL, thread );
      kb_mapping.map_predicate_extent_index( Symbols.symbol_function( $sym299$GATHER_ARG_OF_SELECTED_GAF_ASSERTION ), pred, UNPROVIDED, UNPROVIDED );
      result = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_7, thread );
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_6, thread );
      control_vars.$mapping_index_arg$.rebind( _prev_bind_5, thread );
      control_vars.$mapping_target$.rebind( _prev_bind_4, thread );
      control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 118222L)
  public static SubLObject constants_in_string_assertions(final SubLObject constants)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str300$mapping_Cyc_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$60 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$60, $kw302$SKIP ) )
        {
          final SubLObject idx_$61 = idx_$60;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$61, $kw302$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$61 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw302$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw302$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != any_of_constants_in_string_assertionP( constants, assertion ) )
                {
                  result = ConsesLow.cons( assertion, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$62 = idx_$60;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$62 ) || NIL == id_index.id_index_skip_tombstones_p( $kw302$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$62 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$62 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$62 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw302$SKIP ) ) ? NIL : $kw302$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw302$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != any_of_constants_in_string_assertionP( constants, assertion2 ) )
                {
                  result = ConsesLow.cons( assertion2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
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
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 118443L)
  public static SubLObject any_of_constants_in_string_assertionP(final SubLObject constants, final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject literal = assertions_high.gaf_formula( assertion );
      SubLObject foundP = NIL;
      if( NIL == foundP )
      {
        SubLObject csome_list_var = el_utilities.literal_args( literal, UNPROVIDED );
        SubLObject arg = NIL;
        arg = csome_list_var.first();
        while ( NIL == foundP && NIL != csome_list_var)
        {
          if( arg.isString() && NIL != any_referenced_in_stringP( constants, arg, Symbols.symbol_function( $sym303$CONSTANT_NAME ) ) )
          {
            foundP = T;
          }
          csome_list_var = csome_list_var.rest();
          arg = csome_list_var.first();
        }
      }
      return foundP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 118791L)
  public static SubLObject strings_in_string_assertions(final SubLObject strings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str300$mapping_Cyc_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$64 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$64, $kw302$SKIP ) )
        {
          final SubLObject idx_$65 = idx_$64;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$65, $kw302$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$65 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw302$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw302$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != any_of_strings_in_string_assertionP( strings, assertion ) )
                {
                  result = ConsesLow.cons( assertion, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$66 = idx_$64;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$66 ) || NIL == id_index.id_index_skip_tombstones_p( $kw302$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$66 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$66 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$66 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw302$SKIP ) ) ? NIL : $kw302$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw302$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != any_of_strings_in_string_assertionP( strings, assertion2 ) )
                {
                  result = ConsesLow.cons( assertion2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 119004L)
  public static SubLObject any_of_strings_in_string_assertionP(final SubLObject strings, final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject literal = assertions_high.gaf_formula( assertion );
      SubLObject foundP = NIL;
      if( NIL == foundP )
      {
        SubLObject csome_list_var = el_utilities.literal_args( literal, UNPROVIDED );
        SubLObject arg = NIL;
        arg = csome_list_var.first();
        while ( NIL == foundP && NIL != csome_list_var)
        {
          if( arg.isString() && NIL != any_referenced_in_stringP( strings, arg, Symbols.symbol_function( IDENTITY ) ) )
          {
            foundP = T;
          }
          csome_list_var = csome_list_var.rest();
          arg = csome_list_var.first();
        }
      }
      return foundP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 119341L)
  public static SubLObject any_referenced_in_stringP(final SubLObject items, final SubLObject string, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( $sym304$STR );
    }
    if( string.isString() )
    {
      SubLObject referencedP = NIL;
      if( NIL == referencedP )
      {
        SubLObject csome_list_var;
        SubLObject item;
        for( csome_list_var = items, item = NIL, item = csome_list_var.first(); NIL == referencedP && NIL != csome_list_var; referencedP = string_utilities.substringP( Functions.funcall( key, item ), string, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var.rest(), item = csome_list_var.first() )
        {
        }
      }
      return referencedP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 119589L)
  public static SubLObject gather_arg_of_selected_gaf_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.gaf_assertionP( assertion ) && ( NIL == control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ) || NIL != Functions.funcall( control_vars.$mapping_assertion_selection_fn$
        .getDynamicValue( thread ), assertion ) ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertions_high.gaf_arg( assertion, control_vars.$mapping_gather_arg$.getDynamicValue( thread ) ), control_vars.$mapping_answer$.getDynamicValue(
          thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 119882L)
  public static SubLObject index_arg_references_in_stringP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject arg = assertions_high.gaf_arg( assertion, control_vars.$mapping_index_arg$.getDynamicValue( thread ) );
      return string_utilities.substringP( control_vars.$mapping_target$.getDynamicValue( thread ), arg, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 120078L)
  public static SubLObject supported_entries(final SubLObject c, final SubLObject p, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym305$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( c, index_arg, p ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( c, index_arg, p );
        SubLObject done_var = doneP;
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw306$GAF, truth, NIL );
              SubLObject done_var_$68 = doneP;
              final SubLObject token_var_$69 = NIL;
              while ( NIL == done_var_$68)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$69 );
                final SubLObject valid_$70 = makeBoolean( !token_var_$69.eql( assertion ) );
                if( NIL != valid_$70 && NIL != assertion_still_thereP( assertion, truth ) )
                {
                  final SubLObject item_var = assertions_high.gaf_arg( assertion, gather_arg );
                  if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var, result );
                  }
                }
                done_var_$68 = makeBoolean( NIL == valid_$70 || NIL != doneP );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != doneP );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 121066L)
  public static SubLObject assertion_still_thereP(final SubLObject assertion, final SubLObject truth)
  {
    if( NIL != tms.tms_assertion_being_removedP( assertion ) )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var;
      SubLObject argument;
      for( csome_list_var = assertions_high.assertion_arguments( assertion ), argument = NIL, argument = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = Equality.eq( truth, arguments.argument_truth(
          argument ) ), csome_list_var = csome_list_var.rest(), argument = csome_list_var.first() )
      {
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 121392L)
  public static SubLObject paraphrase_constant(final SubLObject v_term, SubLObject mts, SubLObject stream)
  {
    if( mts == UNPROVIDED )
    {
      mts = mts_of_constant_temp( v_term );
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      paraphrase_constant( narts_high.find_nart( v_term ), mts, stream );
    }
    else if( NIL != forts.fort_p( v_term ) )
    {
      if( NIL != mts )
      {
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          paraphrase_constant_in_mt( v_term, mt, stream );
          cdolist_list_var = cdolist_list_var.rest();
          mt = cdolist_list_var.first();
        }
      }
      else
      {
        paraphrase_constant_in_mt( v_term, mts, stream );
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 121964L)
  public static SubLObject pc(final SubLObject fort, SubLObject mts, SubLObject stream)
  {
    if( mts == UNPROVIDED )
    {
      mts = mts_of_constant_temp( fort );
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    return paraphrase_constant( fort, mts, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 122131L)
  public static SubLObject paraphrase_constant_in_mt(final SubLObject fort, SubLObject mt, SubLObject stream)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_equality_test$.bind( NIL, thread );
      if( NIL != mt )
      {
        final SubLObject _prev_bind_0_$72 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$73 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym305$RELEVANT_MT_IS_EQ, thread );
          mt_relevance_macros.$mt$.bind( mt, thread );
          kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), fort );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$73, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$72, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$73 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$74 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
          kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), fort );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$74, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$73, thread );
        }
      }
      control_vars.$mapping_answer$.setDynamicValue( Sequences.delete_duplicates( control_vars.$mapping_answer$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      if( NIL != mt )
      {
        PrintLow.format( stream, $str308$____in_mt____s_, mt );
      }
      else
      {
        streams_high.terpri( stream );
      }
      SubLObject cdolist_list_var = control_vars.$mapping_answer$.getDynamicValue( thread );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str309$__EL____S_, fi.assertion_fi_formula( assertion, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 122788L)
  public static SubLObject mts_of_constant_temp(final SubLObject fort)
  {
    if( NIL != forts.fort_p( fort ) )
    {
      SubLObject mts = NIL;
      SubLObject cdolist_list_var = all_term_assertions( fort, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = assertions_high.assertion_mt( assertion );
        if( NIL == conses_high.member( item_var, mts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          mts = ConsesLow.cons( item_var, mts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
      return Sequences.nreverse( mts );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 123045L)
  public static SubLObject constant_documentation(final SubLObject v_term, SubLObject mt, SubLObject stream)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      constant_documentation( narts_high.find_nart( v_term ), mt, stream );
    }
    else if( NIL != forts.fort_p( v_term ) )
    {
      if( $kw310$ALL.eql( mt ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
          constant_documentation_int( v_term, stream );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          constant_documentation_int( v_term, stream );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        }
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 123486L)
  public static SubLObject cd(final SubLObject fort, SubLObject mt, SubLObject stream)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw310$ALL;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    return constant_documentation( fort, mt, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 123634L)
  public static SubLObject constant_documentation_int(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject empty_preds = NIL;
    SubLObject cdolist_list_var = $list314;
    SubLObject p = NIL;
    p = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_utilities.some_pred_value( fort, p, UNPROVIDED, UNPROVIDED ) )
      {
        PrintLow.format( stream, $str311$___a___, p );
        final SubLObject _prev_bind_0 = control_vars.$mapping_gather_key$.currentBinding( thread );
        final SubLObject _prev_bind_2 = control_vars.$mapping_gather_arg$.currentBinding( thread );
        try
        {
          control_vars.$mapping_gather_key$.bind( Symbols.symbol_function( $sym312$PRINT_ARG ), thread );
          control_vars.$mapping_gather_arg$.bind( TWO_INTEGER, thread );
          kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym313$GATHER_FN_OF_ARG ), fort, ONE_INTEGER, p, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          control_vars.$mapping_gather_arg$.rebind( _prev_bind_2, thread );
          control_vars.$mapping_gather_key$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        empty_preds = ConsesLow.cons( p, empty_preds );
      }
      cdolist_list_var = cdolist_list_var.rest();
      p = cdolist_list_var.first();
    }
    PrintLow.format( T, $str315$____missing_doc_preds_ );
    cdolist_list_var = empty_preds;
    SubLObject empty_pred = NIL;
    empty_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str316$__A, empty_pred );
      cdolist_list_var = cdolist_list_var.rest();
      empty_pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 124745L)
  public static SubLObject print_arg(final SubLObject arg, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = control_vars.$mapping_output_stream$.getDynamicValue();
    }
    PrintLow.format( stream, $str317$_____a, arg );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 124857L)
  public static SubLObject print_assertion_args(final SubLObject assertion, SubLObject args, SubLObject stream)
  {
    if( args == UNPROVIDED )
    {
      args = control_vars.$mapping_gather_args$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = control_vars.$mapping_output_stream$.getDynamicValue();
    }
    PrintLow.format( stream, $str317$_____a, assertions_high.gaf_arg( assertion, args.first() ) );
    SubLObject cdolist_list_var = args.rest();
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str318$_______a, assertions_high.gaf_arg( assertion, arg ) );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 125122L)
  public static SubLObject relation_signature_string(final SubLObject pred)
  {
    if( NIL == relation_in_any_mtP( pred ) )
    {
      return NIL;
    }
    final SubLObject comment_assertions = ConsesLow.append( kb_mapping_utilities.pred_value_gafs( pred, $const289$comment, UNPROVIDED, UNPROVIDED ), kb_mapping_utilities.pred_value_gafs( pred, $const297$cyclistNotes,
        UNPROVIDED, UNPROVIDED ) );
    SubLObject predicate_templates = NIL;
    SubLObject cdolist_list_var = comment_assertions;
    SubLObject comment_assertion = NIL;
    comment_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject comment_string = assertions_high.gaf_arg2( comment_assertion );
      final SubLObject regular_expression_string = Sequences.cconcatenate( $str319$______, new SubLObject[] { format_nil.format_nil_a_no_copy( constants_high.constant_name( pred ) ), $str320$________
      } );
      final SubLObject regular_expression = regular_expressions.compile_regular_expression( regular_expression_string, UNPROVIDED );
      SubLObject cdolist_list_var_$76 = regular_expression_utilities.find_all_matches_for_pattern( regular_expression, comment_string, UNPROVIDED );
      SubLObject template_string = NIL;
      template_string = cdolist_list_var_$76.first();
      while ( NIL != cdolist_list_var_$76)
      {
        final SubLObject item_var = template_string;
        if( NIL == conses_high.member( item_var, predicate_templates, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          predicate_templates = ConsesLow.cons( item_var, predicate_templates );
        }
        cdolist_list_var_$76 = cdolist_list_var_$76.rest();
        template_string = cdolist_list_var_$76.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      comment_assertion = cdolist_list_var.first();
    }
    if( NIL != predicate_templates )
    {
      return predicate_templates.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 126070L)
  public static SubLObject scoping_args(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) && NIL != some_scoping_arg_somewhereP( relation ) )
    {
      return kb_mapping_utilities.pred_values_in_relevant_mts( relation, $const321$scopingArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 126324L)
  public static SubLObject scoping_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return subl_promotions.memberP( argnum, scoping_args( relation, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 126457L)
  public static SubLObject some_scoping_arg_somewhereP(final SubLObject relation)
  {
    return somewhere_cache.some_pred_assertion_somewhereP( $const321$scopingArg, relation, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 126578L)
  public static SubLObject all_term_assertions(final SubLObject v_term, SubLObject remove_duplicatesP)
  {
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    enforceType( v_term, $sym136$INDEXED_TERM_P );
    return term_assertions( v_term, $const322$InferencePSC, remove_duplicatesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 126874L)
  public static SubLObject term_assertions(final SubLObject v_term, SubLObject mt, SubLObject remove_duplicatesP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = kb_mapping.gather_index( v_term, remove_duplicatesP );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 127122L)
  public static SubLObject ca(final SubLObject fort)
  {
    return all_term_assertions( fort, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 127225L)
  public static SubLObject fort_assertions(final SubLObject fort)
  {
    if( NIL != forts.fort_p( fort ) )
    {
      return all_term_assertions( fort, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 127388L)
  public static SubLObject any_term_assertion(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_any_answerP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_finished_fn$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_any_answerP$.bind( T, thread );
      control_vars.$mapping_finished_fn$.bind( $sym328$MAPPING_ANSWER_FOUND_, thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw329$MAPPING_DONE );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$77 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$78 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            kb_mapping.map_term( Symbols.symbol_function( $sym331$GATHER_SOME_ASSERTIONS ), v_term );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$78, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$77, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$78 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$79 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            kb_mapping.map_term( Symbols.symbol_function( $sym331$GATHER_SOME_ASSERTIONS ), v_term );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$79, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$78, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw329$MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
      ans = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_finished_fn$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_any_answerP$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 127907L)
  public static SubLObject ata(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
      if( NIL != mt )
      {
        final SubLObject _prev_bind_0_$81 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$82 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), v_term ), thread );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$82, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$81, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$82 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$83 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
          kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), v_term );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$83, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$82, thread );
        }
      }
      ans = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 128317L)
  public static SubLObject atf(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym332$ASSERTION_FI_FORMULA ), ata( v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 128491L)
  public static SubLObject assertion_mentions_kba_predP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return assertions_high.assertion_mentions_term( assertion, control_vars.$kba_pred$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 128597L)
  public static SubLObject ata_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$kba_pred$.currentBinding( thread );
    final SubLObject _prev_bind_4 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
      control_vars.$kba_pred$.bind( pred, thread );
      control_vars.$mapping_assertion_selection_fn$.bind( Symbols.symbol_function( $sym333$ASSERTION_MENTIONS_KBA_PRED_ ), thread );
      if( NIL != mt )
      {
        final SubLObject _prev_bind_0_$85 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$86 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( mt, thread );
          kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), v_term );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$86, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$85, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$87 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
          kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), v_term );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$87, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$86, thread );
        }
      }
      ans = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_4, thread );
      control_vars.$kba_pred$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 129111L)
  public static SubLObject relevant_term_assertions(final SubLObject v_term, SubLObject mt, SubLObject truth, SubLObject gafs_onlyP, SubLObject remove_duplicatesP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_onlyP == UNPROVIDED )
    {
      gafs_onlyP = NIL;
    }
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_equality_test$.bind( NIL, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$89 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$90 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        kb_mapping.selected_map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), v_term, truth, gafs_onlyP );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$90, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$89, thread );
      }
      if( NIL != remove_duplicatesP )
      {
        control_vars.$mapping_answer$.setDynamicValue( Sequences.delete_duplicates( control_vars.$mapping_answer$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      }
      ans = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 129644L)
  public static SubLObject term_specified_to_be_retainedP(final SubLObject v_term)
  {
    if( NIL == forts.fort_p( v_term ) )
    {
      return NIL;
    }
    return list_utilities.sublisp_boolean( kb_mapping_utilities.some_pred_value_in_any_mt( v_term, $const334$retainTerm, ONE_INTEGER, $kw73$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 129811L)
  public static SubLObject cyclist_with_most_assertions_about(final SubLObject indexed_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( indexed_term ) : indexed_term;
    final SubLObject cyclist_table = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_term_index_key_validator( indexed_term, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( indexed_term, NIL );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
              SubLObject done_var_$91 = NIL;
              final SubLObject token_var_$92 = NIL;
              while ( NIL == done_var_$91)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$92 );
                final SubLObject valid_$93 = makeBoolean( !token_var_$92.eql( assertion ) );
                if( NIL != valid_$93 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( assertion, final_index_spec ) )
                {
                  final SubLObject cyclist = assertions_high.asserted_by( assertion );
                  if( NIL != cyclist )
                  {
                    dictionary_utilities.dictionary_increment( cyclist_table, cyclist, UNPROVIDED );
                  }
                }
                done_var_$91 = makeBoolean( NIL == valid_$93 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
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
    SubLObject max_cyclist = NIL;
    SubLObject max_count = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( cyclist_table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject cyclist2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( count.numG( max_count ) )
      {
        max_cyclist = cyclist2;
        max_count = count;
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Values.values( max_cyclist, max_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 130458L)
  public static SubLObject isa_relevant_assertions(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return isa_relevant_assertions( narts_high.find_nart( v_term ), UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject isas = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$95 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$96 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            isas = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$96, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$95, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$96 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$97 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            isas = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$97, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$96, thread );
          }
        }
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( v_isa, mt );
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 131159L)
  public static SubLObject ira(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return isa_relevant_assertions( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 131285L)
  public static SubLObject map_selected_term_assertions_int(final SubLObject collection, final SubLObject mt)
  {
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
      kb_mapping.map_isa_rule_index( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), collection, $kw338$NEG, UNPROVIDED, UNPROVIDED );
      kb_mapping.map_isa_rule_index( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), collection, $kw339$POS, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 131521L)
  public static SubLObject ira_wrt_type(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return isa_relevant_assertions_wrt_type( v_term, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 131637L)
  public static SubLObject isa_relevant_assertions_wrt_type(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return isa_relevant_assertions( narts_high.find_nart( v_term ), UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject isas = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$99 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$100 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            isas = isa.all_isas_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$100, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$99, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$100 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$101 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            isas = isa.all_isas_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$101, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$100, thread );
          }
        }
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( v_isa, mt );
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 132351L)
  public static SubLObject ira_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return isa_relevant_assertions_wrt_pred( v_term, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 132455L)
  public static SubLObject isa_relevant_assertions_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return isa_relevant_assertions( narts_high.find_nart( v_term ), UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$kba_pred$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        control_vars.$kba_pred$.bind( pred, thread );
        control_vars.$mapping_assertion_selection_fn$.bind( Symbols.symbol_function( $sym333$ASSERTION_MENTIONS_KBA_PRED_ ), thread );
        SubLObject cdolist_list_var = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( v_isa, mt );
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_4, thread );
        control_vars.$kba_pred$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 132951L)
  public static SubLObject ira_wrt_type_and_pred(final SubLObject v_term, final SubLObject collection, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return isa_relevant_assertions_wrt_type_and_pred( v_term, collection, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 133095L)
  public static SubLObject isa_relevant_assertions_wrt_type_and_pred(final SubLObject v_term, final SubLObject collection, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return isa_relevant_assertions( narts_high.find_nart( v_term ), UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject isas = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$kba_pred$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        control_vars.$kba_pred$.bind( pred, thread );
        control_vars.$mapping_assertion_selection_fn$.bind( Symbols.symbol_function( $sym333$ASSERTION_MENTIONS_KBA_PRED_ ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$103 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$104 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            isas = isa.all_isas_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$104, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$103, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$104 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$105 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            isas = isa.all_isas_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$105, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$104, thread );
          }
        }
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( v_isa, mt );
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_4, thread );
        control_vars.$kba_pred$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 133749L)
  public static SubLObject ako_relevant_assertions(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return ako_relevant_assertions( narts_high.find_nart( v_term ), UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject v_genls = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$107 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$108 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            v_genls = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$108, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$107, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$108 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$109 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            v_genls = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$109, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$108, thread );
          }
        }
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( genl, mt );
          cdolist_list_var = cdolist_list_var.rest();
          genl = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 134291L)
  public static SubLObject ara(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ako_relevant_assertions( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 134417L)
  public static SubLObject ara_wrt_type(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ako_relevant_assertions_wrt_type( v_term, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 134533L)
  public static SubLObject ako_relevant_assertions_wrt_type(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return ako_relevant_assertions_wrt_type( narts_high.find_nart( v_term ), collection, UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject v_genls = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$111 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$112 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            v_genls = genls.all_genls_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$112, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$111, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$112 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$113 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            v_genls = genls.all_genls_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$113, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$112, thread );
          }
        }
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( genl, mt );
          cdolist_list_var = cdolist_list_var.rest();
          genl = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 135108L)
  public static SubLObject ara_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ako_relevant_assertions_wrt_pred( v_term, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 135212L)
  public static SubLObject ako_relevant_assertions_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return ako_relevant_assertions_wrt_pred( narts_high.find_nart( v_term ), pred, UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject v_genls = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$kba_pred$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        control_vars.$kba_pred$.bind( pred, thread );
        control_vars.$mapping_assertion_selection_fn$.bind( Symbols.symbol_function( $sym333$ASSERTION_MENTIONS_KBA_PRED_ ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$115 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$116 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            v_genls = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$116, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$115, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$116 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$117 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            v_genls = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$117, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$116, thread );
          }
        }
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( genl, mt );
          cdolist_list_var = cdolist_list_var.rest();
          genl = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_4, thread );
        control_vars.$kba_pred$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 135839L)
  public static SubLObject ara_wrt_type_and_pred(final SubLObject v_term, final SubLObject collection, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ako_relevant_assertions_wrt_type_and_pred( v_term, collection, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 135983L)
  public static SubLObject ako_relevant_assertions_wrt_type_and_pred(final SubLObject v_term, final SubLObject collection, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return ako_relevant_assertions_wrt_pred( narts_high.find_nart( v_term ), pred, UNPROVIDED );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      SubLObject result = NIL;
      SubLObject v_genls = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_equality_test$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$kba_pred$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        control_vars.$mapping_equality_test$.bind( Symbols.symbol_function( EQL ), thread );
        control_vars.$kba_pred$.bind( pred, thread );
        control_vars.$mapping_assertion_selection_fn$.bind( Symbols.symbol_function( $sym333$ASSERTION_MENTIONS_KBA_PRED_ ), thread );
        if( NIL != mt )
        {
          final SubLObject _prev_bind_0_$119 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$120 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym330$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mt, thread );
            v_genls = genls.all_genls_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$120, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$119, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$120 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$121 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym4$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const5$EverythingPSC, thread );
            v_genls = genls.all_genls_wrt( v_term, collection, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$121, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$120, thread );
          }
        }
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          map_selected_term_assertions_int( genl, mt );
          cdolist_list_var = cdolist_list_var.rest();
          genl = cdolist_list_var.first();
        }
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_4, thread );
        control_vars.$kba_pred$.rebind( _prev_bind_3, thread );
        control_vars.$mapping_equality_test$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 136660L)
  public static SubLObject possibly_relevant_assertions(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return possibly_relevant_assertions( narts_high.find_nart( v_term ), mt );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return conses_high.nunion( ata( v_term, mt ), conses_high.nunion( ako_relevant_assertions( v_term, mt ), isa_relevant_assertions( v_term, mt ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 136999L)
  public static SubLObject pra(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return possibly_relevant_assertions( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 137135L)
  public static SubLObject pra_wrt_type(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return possibly_relevant_assertions_wrt_type( v_term, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 137256L)
  public static SubLObject possibly_relevant_assertions_wrt_type(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return possibly_relevant_assertions_wrt_type( narts_high.find_nart( v_term ), collection, mt );
    }
    if( NIL != term.ground_nautP( collection, UNPROVIDED ) )
    {
      return possibly_relevant_assertions_wrt_type( v_term, narts_high.find_nart( collection ), mt );
    }
    if( NIL != forts.fort_p( v_term ) && NIL != fort_types_interface.collectionP( collection ) )
    {
      return conses_high.nunion( ata( v_term, mt ), conses_high.nunion( ako_relevant_assertions_wrt_type( v_term, collection, mt ), isa_relevant_assertions_wrt_type( v_term, collection, mt ), UNPROVIDED, UNPROVIDED ),
          UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 137775L)
  public static SubLObject pra_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return possibly_relevant_assertions_wrt_pred( v_term, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 137884L)
  public static SubLObject possibly_relevant_assertions_wrt_pred(final SubLObject v_term, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return possibly_relevant_assertions( narts_high.find_nart( v_term ), pred );
    }
    if( NIL != forts.fort_p( v_term ) && NIL != forts.fort_p( pred ) )
    {
      return conses_high.nunion( ata_wrt_pred( v_term, pred, mt ), conses_high.nunion( ako_relevant_assertions_wrt_pred( v_term, pred, mt ), isa_relevant_assertions_wrt_pred( v_term, pred, mt ), UNPROVIDED, UNPROVIDED ),
          UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 138260L)
  public static SubLObject pra_wrt_type_and_pred(final SubLObject v_term, final SubLObject collection, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return possibly_relevant_assertions_wrt_type_and_pred( v_term, collection, pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 138409L)
  public static SubLObject possibly_relevant_assertions_wrt_type_and_pred(final SubLObject v_term, final SubLObject collection, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return possibly_relevant_assertions_wrt_type( narts_high.find_nart( v_term ), collection, mt );
    }
    if( NIL != term.ground_nautP( collection, UNPROVIDED ) )
    {
      return possibly_relevant_assertions_wrt_type( v_term, narts_high.find_nart( collection ), mt );
    }
    if( NIL != forts.fort_p( v_term ) && NIL != fort_types_interface.collectionP( collection ) )
    {
      return conses_high.nunion( ata( v_term, mt ), conses_high.nunion( ako_relevant_assertions_wrt_type_and_pred( v_term, collection, pred, mt ), isa_relevant_assertions_wrt_type_and_pred( v_term, collection, pred,
          mt ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 138970L)
  public static SubLObject gafs_re(final SubLObject fort, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw73$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw306$GAF, truth, NIL );
              SubLObject done_var_$123 = NIL;
              final SubLObject token_var_$124 = NIL;
              while ( NIL == done_var_$123)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$124 );
                final SubLObject valid_$125 = makeBoolean( !token_var_$124.eql( ass ) );
                if( NIL != valid_$125 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$123 = makeBoolean( NIL == valid_$125 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$126, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 139155L)
  public static SubLObject assertions_re(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$127 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        kb_mapping.map_term( Symbols.symbol_function( $sym307$GATHER_ASSERTIONS ), fort );
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$127, thread );
      }
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 139366L)
  public static SubLObject selective_gafs_re(final SubLObject fort, final SubLObject selection_fn, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
    try
    {
      control_vars.$mapping_assertion_selection_fn$.bind( selection_fn, thread );
      result = gafs_re( fort, mt, truth );
    }
    finally
    {
      control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 139574L)
  public static SubLObject selective_assertions_re(final SubLObject fort, final SubLObject selection_fn, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_assertion_selection_fn$.currentBinding( thread );
    try
    {
      control_vars.$mapping_assertion_selection_fn$.bind( selection_fn, thread );
      result = assertions_re( fort, mt );
    }
    finally
    {
      control_vars.$mapping_assertion_selection_fn$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 139782L)
  public static SubLObject pred_assertions(final SubLObject p)
  {
    return kb_mapping.gather_predicate_extent_index( p, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 139862L)
  public static SubLObject constant_pos_gafs(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return constant_pos_gafs( narts_high.find_nart( v_term ), mt );
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return constant_pos_gafs_int( v_term, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 140044L)
  public static SubLObject constant_pos_gafs_int(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym343$ASSERTION_FORMULA ), list_utilities.remove_if_not( Symbols.symbol_function( $sym344$GAF_ASSERTION_ ), gafs_re( fort, mt, $kw73$TRUE ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 140198L)
  public static SubLObject do_gafs_wrt_pred_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    pred_type = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$128 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list345 );
      current_$128 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list345 );
      if( NIL == conses_high.member( current_$128, $list346, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$128 == $kw347$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list345 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw348$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw349$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw350$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pred_var = $sym351$PRED_VAR;
    return ConsesLow.list( $sym352$DO_ALL_FORT_INSTANCES, ConsesLow.list( pred_var, pred_type, mt, truth, done ), ConsesLow.list( $sym353$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.listS(
        $sym354$DO_GAF_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw350$DONE, done, $kw355$PREDICATE, pred_var, $kw349$TRUTH, truth ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 140765L)
  public static SubLObject term_gafs_wrt_pred_type(final SubLObject v_term, final SubLObject pred_type, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const42$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$129 = pred_type;
        final SubLObject deck_type = $kw360$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$130 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$131 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$132 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject tv_var = truth;
              final SubLObject _prev_bind_0_$132 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$133 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym361$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw362$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str363$_A_is_not_a__A, tv_var, $sym364$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw365$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str366$continue_anyway, $str363$_A_is_not_a__A, tv_var, $sym364$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw367$WARN ) )
                  {
                    Errors.warn( $str363$_A_is_not_a__A, tv_var, $sym364$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str368$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str366$continue_anyway, $str363$_A_is_not_a__A, tv_var, $sym364$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$133 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$134 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$137 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const42$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const42$isa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const42$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const42$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred_type, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$135 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const42$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$129, UNPROVIDED );
                      while ( NIL != node_var_$129)
                      {
                        final SubLObject tt_node_var = node_var_$129;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const42$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$135 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
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
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const42$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$143 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$143 ) )
                                    {
                                      final SubLObject _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$143, thread );
                                        SubLObject iteration_state_$145;
                                        for( iteration_state_$145 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$145 ); iteration_state_$145 = dictionary_contents.do_dictionary_contents_next( iteration_state_$145 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$145 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$137 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject pred_var;
                                                SubLObject mt_var_$147;
                                                SubLObject _prev_bind_0_$138;
                                                SubLObject _prev_bind_1_$137;
                                                SubLObject _prev_bind_2_$139;
                                                SubLObject pred_var_$151;
                                                SubLObject iterator_var;
                                                SubLObject done_var;
                                                SubLObject token_var;
                                                SubLObject final_index_spec;
                                                SubLObject valid;
                                                SubLObject final_index_iterator;
                                                SubLObject done_var_$152;
                                                SubLObject token_var_$153;
                                                SubLObject v_assert;
                                                SubLObject valid_$154;
                                                SubLObject _prev_bind_0_$139;
                                                SubLObject _values;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  pred_var = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, pred_var ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred_var ) )
                                                    {
                                                      mt_var_$147 = mt;
                                                      _prev_bind_0_$138 = mt_relevance_macros.$mt$.currentBinding( thread );
                                                      _prev_bind_1_$137 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                                                      _prev_bind_2_$139 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                                                      try
                                                      {
                                                        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$147 ), thread );
                                                        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$147 ), thread );
                                                        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$147 ), thread );
                                                        pred_var_$151 = pred_var;
                                                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var_$151 ) )
                                                        {
                                                          iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var_$151 );
                                                          done_var = NIL;
                                                          token_var = NIL;
                                                          while ( NIL == done_var)
                                                          {
                                                            final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                                                            valid = makeBoolean( !token_var.eql( final_index_spec ) );
                                                            if( NIL != valid )
                                                            {
                                                              final_index_iterator = NIL;
                                                              try
                                                              {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw306$GAF, truth, NIL );
                                                                done_var_$152 = NIL;
                                                                token_var_$153 = NIL;
                                                                while ( NIL == done_var_$152)
                                                                {
                                                                  v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$153 );
                                                                  valid_$154 = makeBoolean( !token_var_$153.eql( v_assert ) );
                                                                  if( NIL != valid_$154 )
                                                                  {
                                                                    result = ConsesLow.cons( v_assert, result );
                                                                  }
                                                                  done_var_$152 = makeBoolean( NIL == valid_$154 );
                                                                }
                                                              }
                                                              finally
                                                              {
                                                                _prev_bind_0_$139 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                                try
                                                                {
                                                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                  _values = Values.getValuesAsVector();
                                                                  if( NIL != final_index_iterator )
                                                                  {
                                                                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                                                  }
                                                                  Values.restoreValuesFromVector( _values );
                                                                }
                                                                finally
                                                                {
                                                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$139, thread );
                                                                }
                                                              }
                                                            }
                                                            done_var = makeBoolean( NIL == valid );
                                                          }
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$139, thread );
                                                        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$137, thread );
                                                        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$138, thread );
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject pred_var2 = NIL;
                                                pred_var2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( pred_var2 ) )
                                                    {
                                                      final SubLObject mt_var_$148 = mt;
                                                      final SubLObject _prev_bind_0_$140 = mt_relevance_macros.$mt$.currentBinding( thread );
                                                      final SubLObject _prev_bind_1_$138 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                                                      final SubLObject _prev_bind_2_$140 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                                                      try
                                                      {
                                                        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$148 ), thread );
                                                        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$148 ), thread );
                                                        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$148 ), thread );
                                                        final SubLObject pred_var_$152 = pred_var2;
                                                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var_$152 ) )
                                                        {
                                                          final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var_$152 );
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
                                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw306$GAF, truth, NIL );
                                                                SubLObject done_var_$153 = NIL;
                                                                final SubLObject token_var_$154 = NIL;
                                                                while ( NIL == done_var_$153)
                                                                {
                                                                  final SubLObject v_assert2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$154 );
                                                                  final SubLObject valid_$155 = makeBoolean( !token_var_$154.eql( v_assert2 ) );
                                                                  if( NIL != valid_$155 )
                                                                  {
                                                                    result = ConsesLow.cons( v_assert2, result );
                                                                  }
                                                                  done_var_$153 = makeBoolean( NIL == valid_$155 );
                                                                }
                                                              }
                                                              finally
                                                              {
                                                                final SubLObject _prev_bind_0_$141 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$141, thread );
                                                                }
                                                              }
                                                            }
                                                            done_var2 = makeBoolean( NIL == valid2 );
                                                          }
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$140, thread );
                                                        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$138, thread );
                                                        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$140, thread );
                                                      }
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  pred_var2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str369$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$137, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$145 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$136, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str370$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
                                  SubLObject mt_$144 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list371 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list371 );
                                  mt_$144 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list371 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$144 ) )
                                    {
                                      final SubLObject _prev_bind_0_$142 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$144, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$143 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                              SubLObject pred_var;
                                              SubLObject iterator_var;
                                              SubLObject done_var;
                                              SubLObject token_var;
                                              SubLObject final_index_spec;
                                              SubLObject valid;
                                              SubLObject final_index_iterator;
                                              SubLObject v_assert;
                                              SubLObject mt_var_$149;
                                              SubLObject _prev_bind_0_$144;
                                              SubLObject _prev_bind_1_$139;
                                              SubLObject _prev_bind_2_$141;
                                              SubLObject pred_var_$153;
                                              SubLObject done_var_$154;
                                              SubLObject token_var_$155;
                                              SubLObject valid_$156;
                                              SubLObject _prev_bind_0_$145;
                                              SubLObject _values3;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                pred_var = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, pred_var ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( pred_var ) )
                                                  {
                                                    mt_var_$149 = mt;
                                                    _prev_bind_0_$144 = mt_relevance_macros.$mt$.currentBinding( thread );
                                                    _prev_bind_1_$139 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                                                    _prev_bind_2_$141 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                                                    try
                                                    {
                                                      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$149 ), thread );
                                                      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$149 ), thread );
                                                      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$149 ), thread );
                                                      pred_var_$153 = pred_var;
                                                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var_$153 ) )
                                                      {
                                                        iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var_$153 );
                                                        done_var = NIL;
                                                        token_var = NIL;
                                                        while ( NIL == done_var)
                                                        {
                                                          final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                                                          valid = makeBoolean( !token_var.eql( final_index_spec ) );
                                                          if( NIL != valid )
                                                          {
                                                            final_index_iterator = NIL;
                                                            try
                                                            {
                                                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw306$GAF, truth, NIL );
                                                              done_var_$154 = NIL;
                                                              token_var_$155 = NIL;
                                                              while ( NIL == done_var_$154)
                                                              {
                                                                v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$155 );
                                                                valid_$156 = makeBoolean( !token_var_$155.eql( v_assert ) );
                                                                if( NIL != valid_$156 )
                                                                {
                                                                  result = ConsesLow.cons( v_assert, result );
                                                                }
                                                                done_var_$154 = makeBoolean( NIL == valid_$156 );
                                                              }
                                                            }
                                                            finally
                                                            {
                                                              _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                              try
                                                              {
                                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                _values3 = Values.getValuesAsVector();
                                                                if( NIL != final_index_iterator )
                                                                {
                                                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                                                }
                                                                Values.restoreValuesFromVector( _values3 );
                                                              }
                                                              finally
                                                              {
                                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$145, thread );
                                                              }
                                                            }
                                                          }
                                                          done_var = makeBoolean( NIL == valid );
                                                        }
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$141, thread );
                                                      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$139, thread );
                                                      mt_relevance_macros.$mt$.rebind( _prev_bind_0_$144, thread );
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$177 = sol;
                                              SubLObject pred_var2 = NIL;
                                              pred_var2 = csome_list_var_$177.first();
                                              while ( NIL != csome_list_var_$177)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( pred_var2 ) )
                                                  {
                                                    final SubLObject mt_var_$150 = mt;
                                                    final SubLObject _prev_bind_0_$146 = mt_relevance_macros.$mt$.currentBinding( thread );
                                                    final SubLObject _prev_bind_1_$140 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                                                    final SubLObject _prev_bind_2_$142 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                                                    try
                                                    {
                                                      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$150 ), thread );
                                                      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$150 ), thread );
                                                      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$150 ), thread );
                                                      final SubLObject pred_var_$154 = pred_var2;
                                                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var_$154 ) )
                                                      {
                                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var_$154 );
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
                                                              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw306$GAF, truth, NIL );
                                                              SubLObject done_var_$155 = NIL;
                                                              final SubLObject token_var_$156 = NIL;
                                                              while ( NIL == done_var_$155)
                                                              {
                                                                final SubLObject v_assert2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$156 );
                                                                final SubLObject valid_$157 = makeBoolean( !token_var_$156.eql( v_assert2 ) );
                                                                if( NIL != valid_$157 )
                                                                {
                                                                  result = ConsesLow.cons( v_assert2, result );
                                                                }
                                                                done_var_$155 = makeBoolean( NIL == valid_$157 );
                                                              }
                                                            }
                                                            finally
                                                            {
                                                              final SubLObject _prev_bind_0_$147 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                              try
                                                              {
                                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                                final SubLObject _values4 = Values.getValuesAsVector();
                                                                if( NIL != final_index_iterator2 )
                                                                {
                                                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                                                                }
                                                                Values.restoreValuesFromVector( _values4 );
                                                              }
                                                              finally
                                                              {
                                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$147, thread );
                                                              }
                                                            }
                                                          }
                                                          done_var2 = makeBoolean( NIL == valid2 );
                                                        }
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$142, thread );
                                                      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$140, thread );
                                                      mt_relevance_macros.$mt$.rebind( _prev_bind_0_$146, thread );
                                                    }
                                                  }
                                                }
                                                csome_list_var_$177 = csome_list_var_$177.rest();
                                                pred_var2 = csome_list_var_$177.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str369$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$143, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$142, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list371 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$187;
                              final SubLObject new_list = cdolist_list_var_$187 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const42$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const42$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$187.first();
                              while ( NIL != cdolist_list_var_$187)
                              {
                                final SubLObject _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    SubLObject pred_var3;
                                    SubLObject mt_var_$151;
                                    SubLObject _prev_bind_0_$149;
                                    SubLObject _prev_bind_1_$141;
                                    SubLObject _prev_bind_2_$143;
                                    SubLObject pred_var_$155;
                                    SubLObject iterator_var3;
                                    SubLObject done_var3;
                                    SubLObject token_var3;
                                    SubLObject final_index_spec3;
                                    SubLObject valid3;
                                    SubLObject final_index_iterator3;
                                    SubLObject done_var_$156;
                                    SubLObject token_var_$157;
                                    SubLObject v_assert3;
                                    SubLObject valid_$158;
                                    SubLObject _prev_bind_0_$150;
                                    SubLObject _values5;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      pred_var3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, pred_var3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var3,
                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred_var3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( pred_var3 ) )
                                        {
                                          mt_var_$151 = mt;
                                          _prev_bind_0_$149 = mt_relevance_macros.$mt$.currentBinding( thread );
                                          _prev_bind_1_$141 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                                          _prev_bind_2_$143 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                                          try
                                          {
                                            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$151 ), thread );
                                            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$151 ), thread );
                                            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$151 ), thread );
                                            pred_var_$155 = pred_var3;
                                            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var_$155 ) )
                                            {
                                              iterator_var3 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var_$155 );
                                              done_var3 = NIL;
                                              token_var3 = NIL;
                                              while ( NIL == done_var3)
                                              {
                                                final_index_spec3 = iteration.iteration_next_without_values_macro_helper( iterator_var3, token_var3 );
                                                valid3 = makeBoolean( !token_var3.eql( final_index_spec3 ) );
                                                if( NIL != valid3 )
                                                {
                                                  final_index_iterator3 = NIL;
                                                  try
                                                  {
                                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator( final_index_spec3, $kw306$GAF, truth, NIL );
                                                    done_var_$156 = NIL;
                                                    token_var_$157 = NIL;
                                                    while ( NIL == done_var_$156)
                                                    {
                                                      v_assert3 = iteration.iteration_next_without_values_macro_helper( final_index_iterator3, token_var_$157 );
                                                      valid_$158 = makeBoolean( !token_var_$157.eql( v_assert3 ) );
                                                      if( NIL != valid_$158 )
                                                      {
                                                        result = ConsesLow.cons( v_assert3, result );
                                                      }
                                                      done_var_$156 = makeBoolean( NIL == valid_$158 );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      _values5 = Values.getValuesAsVector();
                                                      if( NIL != final_index_iterator3 )
                                                      {
                                                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator3 );
                                                      }
                                                      Values.restoreValuesFromVector( _values5 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$150, thread );
                                                    }
                                                  }
                                                }
                                                done_var3 = makeBoolean( NIL == valid3 );
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$143, thread );
                                            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$141, thread );
                                            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$149, thread );
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject pred_var4 = NIL;
                                    pred_var4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( pred_var4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( pred_var4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( pred_var4 ) )
                                        {
                                          final SubLObject mt_var_$152 = mt;
                                          final SubLObject _prev_bind_0_$151 = mt_relevance_macros.$mt$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$142 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                                          final SubLObject _prev_bind_2_$144 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                                          try
                                          {
                                            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$152 ), thread );
                                            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$152 ), thread );
                                            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$152 ), thread );
                                            final SubLObject pred_var_$156 = pred_var4;
                                            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var_$156 ) )
                                            {
                                              final SubLObject iterator_var4 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var_$156 );
                                              SubLObject done_var4 = NIL;
                                              final SubLObject token_var4 = NIL;
                                              while ( NIL == done_var4)
                                              {
                                                final SubLObject final_index_spec4 = iteration.iteration_next_without_values_macro_helper( iterator_var4, token_var4 );
                                                final SubLObject valid4 = makeBoolean( !token_var4.eql( final_index_spec4 ) );
                                                if( NIL != valid4 )
                                                {
                                                  SubLObject final_index_iterator4 = NIL;
                                                  try
                                                  {
                                                    final_index_iterator4 = kb_mapping_macros.new_final_index_iterator( final_index_spec4, $kw306$GAF, truth, NIL );
                                                    SubLObject done_var_$157 = NIL;
                                                    final SubLObject token_var_$158 = NIL;
                                                    while ( NIL == done_var_$157)
                                                    {
                                                      final SubLObject v_assert4 = iteration.iteration_next_without_values_macro_helper( final_index_iterator4, token_var_$158 );
                                                      final SubLObject valid_$159 = makeBoolean( !token_var_$158.eql( v_assert4 ) );
                                                      if( NIL != valid_$159 )
                                                      {
                                                        result = ConsesLow.cons( v_assert4, result );
                                                      }
                                                      done_var_$157 = makeBoolean( NIL == valid_$159 );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    final SubLObject _prev_bind_0_$152 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values6 = Values.getValuesAsVector();
                                                      if( NIL != final_index_iterator4 )
                                                      {
                                                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator4 );
                                                      }
                                                      Values.restoreValuesFromVector( _values6 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$152, thread );
                                                    }
                                                  }
                                                }
                                                done_var4 = makeBoolean( NIL == valid4 );
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$144, thread );
                                            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$142, thread );
                                            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$151, thread );
                                          }
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      pred_var4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str369$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$148, thread );
                                }
                                cdolist_list_var_$187 = cdolist_list_var_$187.rest();
                                generating_fn = cdolist_list_var_$187.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$136, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$135, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const42$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$153 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$143 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$129 );
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
                                    final SubLObject mt_$145 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$145 ) )
                                    {
                                      final SubLObject _prev_bind_0_$154 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$145, thread );
                                        SubLObject iteration_state_$146;
                                        for( iteration_state_$146 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$146 ); iteration_state_$146 = dictionary_contents.do_dictionary_contents_next( iteration_state_$146 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$146 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$155 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                                Errors.error( $str369$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$155, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$146 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$154, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str370$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$188;
                              final SubLObject new_list2 = cdolist_list_var_$188 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$188.first();
                              while ( NIL != cdolist_list_var_$188)
                              {
                                final SubLObject _prev_bind_0_$156 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    Errors.error( $str369$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$156, thread );
                                }
                                cdolist_list_var_$188 = cdolist_list_var_$188.rest();
                                generating_fn2 = cdolist_list_var_$188.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$143, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$153, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$129 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$138, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$135, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$134, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str372$Node__a_does_not_pass_sbhl_type_t, pred_type, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$137, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$134, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$133, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$133, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$132, thread );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$132, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$131, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$157 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values7 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values7 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$157, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$130, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$158 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values8 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values8 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$158, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 141077L)
  public static SubLObject relation_types(final SubLObject col, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_pred$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_pred$.bind( pred, thread );
      control_vars.$mapping_gather_arg$.bind( THREE_INTEGER, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$217 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$218 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym373$GATHER_RELATION_TYPES ), col, TWO_INTEGER, $const374$relationAllExists, UNPROVIDED, UNPROVIDED );
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$218, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$217, thread );
      }
    }
    finally
    {
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_pred$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 141468L)
  public static SubLObject gather_relation_types(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( control_vars.$mapping_pred$.getDynamicValue( thread ).eql( assertions_high.gaf_arg1( assertion ) ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertions_high.gaf_arg3( assertion ), control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 141626L)
  public static SubLObject relation_types_sp(final SubLObject col, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_pred$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_gather_arg$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      control_vars.$mapping_pred$.bind( pred, thread );
      control_vars.$mapping_gather_arg$.bind( THREE_INTEGER, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$219 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$220 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        kb_gp_mapping.gp_map_arg_index( Symbols.symbol_function( $sym375$GATHER_RELATION_TYPES_SP ), col, TWO_INTEGER, $const374$relationAllExists );
        result = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$220, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$219, thread );
      }
    }
    finally
    {
      control_vars.$mapping_gather_arg$.rebind( _prev_bind_3, thread );
      control_vars.$mapping_pred$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 141936L)
  public static SubLObject gather_relation_types_sp(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != genl_predicates.genl_predP( assertions_high.gaf_arg1( assertion ), control_vars.$mapping_pred$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertions_high.gaf_arg3( assertion ), control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 142104L)
  public static SubLObject defining_mt_for_fortP(final SubLObject fort)
  {
    if( NIL != forts.fort_p( fort ) )
    {
      return list_utilities.sublisp_boolean( kb_mapping_utilities.some_pred_value_in_relevant_mts( fort, $const376$definingMt, mt_vars.$defining_mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 142356L)
  public static SubLObject defining_mt(final SubLObject fort)
  {
    if( NIL != forts.fort_p( fort ) )
    {
      return kb_mapping_utilities.fpred_value_in_relevant_mts( fort, $const376$definingMt, mt_vars.$defining_mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 142491L)
  public static SubLObject hypothetical_term_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const377$hypotheticalTerm, v_object, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 142700L)
  public static SubLObject not_assertible_predicateP(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( pred ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( pred, $const378$notAssertible, mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != el_utilities.kappa_predicate_p( pred ) )
    {
      return NIL;
    }
    return makeBoolean( NIL == obsolete.reifiable_natP( pred, $sym81$CYC_VAR_, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 143084L)
  public static SubLObject not_assertible_collectionP(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( collection ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( collection, $const379$notAssertibleCollection, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 143271L)
  public static SubLObject not_assertible_mtP(final SubLObject mt)
  {
    final SubLObject reduced_mt = hlmt_czer.canonicalize_hlmt( mt );
    if( NIL != forts.fort_p( reduced_mt ) && NIL != hlmt.possibly_mt_p( reduced_mt ) )
    {
      return kb_mapping_utilities.some_pred_value_in_any_mt( reduced_mt, $const380$notAssertibleMt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 143730L)
  public static SubLObject indexical_p(final SubLObject v_object)
  {
    return isa.quoted_isa_in_any_mtP( v_object, $const381$IndexicalConcept );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 144251L)
  public static SubLObject common_non_skolem_indeterminate_term_denoting_functionP(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $common_non_skolem_indeterminate_term_denoting_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 144489L)
  public static SubLObject non_skolem_indeterminate_term_denoting_functionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.functionP( v_object ) && NIL == fort_types_interface.skolem_function_p( v_object ) && NIL != isa.isaP( v_object,
        $const383$IndeterminateTermDenotingFunction, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 144719L)
  public static SubLObject indeterminate_termP(final SubLObject v_term)
  {
    if( NIL != variables.variable_p( v_term ) || NIL == cycl_grammar.cycl_represented_term_p( v_term ) )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_formula_p( v_term ) && NIL != common_non_skolem_indeterminate_term_denoting_functionP( cycl_utilities.formula_operator( v_term ) ) )
    {
      return T;
    }
    return isa.quoted_isaP( v_term, $const384$IndeterminateTerm, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 145088L)
  public static SubLObject fast_non_skolem_indeterminate_termP(final SubLObject v_term)
  {
    if( NIL != variables.variable_p( v_term ) || NIL != cycl_grammar.cycl_unrepresented_term_p( v_term ) )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_formula_p( v_term ) && NIL != common_non_skolem_indeterminate_term_denoting_functionP( cycl_utilities.formula_operator( v_term ) ) )
    {
      return T;
    }
    if( NIL != el_utilities.el_formula_p( v_term ) && NIL != non_skolem_indeterminate_term_denoting_functionP( cycl_utilities.formula_operator( v_term ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 145624L)
  public static SubLObject non_skolem_indeterminate_termP(final SubLObject v_term)
  {
    return makeBoolean( NIL != fast_non_skolem_indeterminate_termP( v_term ) || NIL != isa.quoted_isaP( v_term, $const385$NonSkolemIndeterminateTerm, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 145792L)
  public static SubLObject non_abducible_ruleP(final SubLObject rule)
  {
    SubLObject result = NIL;
    final SubLObject pred_var = $const386$nonAbducibleRule;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( rule, NIL, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( rule, NIL, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw306$GAF, NIL, NIL );
            SubLObject done_var_$221 = NIL;
            final SubLObject token_var_$222 = NIL;
            while ( NIL == done_var_$221)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$222 );
              final SubLObject valid_$223 = makeBoolean( !token_var_$222.eql( assertion ) );
              if( NIL != valid_$223 )
              {
                result = T;
              }
              done_var_$221 = makeBoolean( NIL == valid_$223 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 145968L)
  public static SubLObject term_exempt_from_unique_names_assumptionP(final SubLObject v_term)
  {
    return isa.quoted_isa_in_any_mtP( v_term, $const387$TermExemptFromUniqueNamesAssumpti );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 146233L)
  public static SubLObject email_address_text(final SubLObject fort)
  {
    final SubLObject preferred_email_address = preferred_email_address_text( fort );
    SubLObject local_email_address = local_email_address_text( fort );
    if( NIL != local_email_address )
    {
      local_email_address = Sequences.cconcatenate( local_email_address, $str388$_cyc_com );
    }
    return ( NIL != preferred_email_address ) ? preferred_email_address : local_email_address;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 146650L)
  public static SubLObject preferred_email_address_text(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( fort ) )
    {
      Errors.error( $str389$Can_t_get_the_email_address_of_a_, fort );
    }
    return kb_mapping_utilities.fpred_value_in_any_mt( fort, $const390$preferredEMailAddressText, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 146900L)
  public static SubLObject local_email_address_text(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( fort ) )
    {
      Errors.error( $str389$Can_t_get_the_email_address_of_a_, fort );
    }
    return kb_mapping_utilities.fpred_value_in_any_mt( fort, $const391$localEMailAddressText, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 147136L)
  public static SubLObject clear_guess_the_cyclist_from_user_name()
  {
    final SubLObject cs = $guess_the_cyclist_from_user_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 147136L)
  public static SubLObject remove_guess_the_cyclist_from_user_name(SubLObject user_name)
  {
    if( user_name == UNPROVIDED )
    {
      user_name = Environment.get_user_name( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $guess_the_cyclist_from_user_name_caching_state$.getGlobalValue(), ConsesLow.list( user_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 147136L)
  public static SubLObject guess_the_cyclist_from_user_name_internal(final SubLObject user_name)
  {
    if( user_name.isString() )
    {
      final SubLObject mt = $list393;
      return inference_kernel.new_cyc_query( ConsesLow.list( $const394$and, $list395, ConsesLow.list( $const391$localEMailAddressText, $sym396$_CYCLIST, user_name ) ), mt, $list397 ).first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 147136L)
  public static SubLObject guess_the_cyclist_from_user_name(SubLObject user_name)
  {
    if( user_name == UNPROVIDED )
    {
      user_name = Environment.get_user_name( UNPROVIDED );
    }
    SubLObject caching_state = $guess_the_cyclist_from_user_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym392$GUESS_THE_CYCLIST_FROM_USER_NAME, $sym398$_GUESS_THE_CYCLIST_FROM_USER_NAME_CACHING_STATE_, $int399$64, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym400$CLEAR_GUESS_THE_CYCLIST_FROM_USER_NAME );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, user_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( guess_the_cyclist_from_user_name_internal( user_name ) ) );
      memoization_state.caching_state_put( caching_state, user_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 149269L)
  public static SubLObject possibly_update_most_specialized_fort(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_object ) )
    {
      final SubLObject num = kb_indexing.relevant_num_index( v_object );
      if( num.numL( $smallest_num_index_so_far$.getDynamicValue( thread ) ) )
      {
        $smallest_num_index_so_far$.setDynamicValue( num, thread );
        $most_specialized_fort_so_far$.setDynamicValue( v_object, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-accessors.lisp", position = 149571L)
  public static SubLObject most_specialized_fort(final SubLObject expression, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fort = NIL;
    SubLObject num_index = NIL;
    final SubLObject _prev_bind_0 = $most_specialized_fort_so_far$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $smallest_num_index_so_far$.currentBinding( thread );
    try
    {
      $most_specialized_fort_so_far$.bind( NIL, thread );
      $smallest_num_index_so_far$.bind( Numbers.$most_positive_fixnum$.getGlobalValue(), thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$224 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$225 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        cycl_utilities.expression_map( $sym401$POSSIBLY_UPDATE_MOST_SPECIALIZED_FORT, expression, NIL, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$225, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$224, thread );
      }
      fort = $most_specialized_fort_so_far$.getDynamicValue( thread );
      num_index = $smallest_num_index_so_far$.getDynamicValue( thread );
    }
    finally
    {
      $smallest_num_index_so_far$.rebind( _prev_bind_2, thread );
      $most_specialized_fort_so_far$.rebind( _prev_bind_0, thread );
    }
    return Values.values( fort, num_index );
  }

  public static SubLObject declare_kb_accessors_file()
  {
    SubLFiles.declareFunction( me, "relationP", "RELATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_in_any_mtP", "RELATION-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "anectP", "ANECT?", 1, 0, false );
    SubLFiles.declareFunction( me, "reflexive_predicateP", "REFLEXIVE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "irreflexive_predicateP", "IRREFLEXIVE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "symmetric_predicateP", "SYMMETRIC-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "asymmetric_predicateP", "ASYMMETRIC-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "anti_symmetric_predicateP", "ANTI-SYMMETRIC-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "transitive_predicateP", "TRANSITIVE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "anti_transitive_predicateP", "ANTI-TRANSITIVE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "documentation_predicate_in_any_mt_p", "DOCUMENTATION-PREDICATE-IN-ANY-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fast_documentation_predicate_p", "FAST-DOCUMENTATION-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fast_documentation_assertion_p", "FAST-DOCUMENTATION-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "at_least_partially_commutative_relationP", "AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "commutative_functionP", "COMMUTATIVE-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "binary_predicateP", "BINARY-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "ternary_predicateP", "TERNARY-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclistP", "CYCLIST?", 1, 0, false );
    SubLFiles.declareFunction( me, "human_cyclistP", "HUMAN-CYCLIST?", 1, 0, false );
    SubLFiles.declareFunction( me, "individualP", "INDIVIDUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_or_collectionP", "SET-OR-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_individual_p", "KB-INDIVIDUAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_set_mathematical_p", "KB-SET-MATHEMATICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_set_or_collection_p", "KB-SET-OR-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_first_order_collection_p", "KB-FIRST-ORDER-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_thing_p", "KB-THING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subcollection_relation_function_p", "SUBCOLLECTION-RELATION-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subcollection_relation_function_expression_p", "SUBCOLLECTION-RELATION-FUNCTION-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_predicateP", "DECONTEXTUALIZED-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_convention_mt", "PREDICATE-CONVENTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_collectionP", "DECONTEXTUALIZED-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_convention_mt", "COLLECTION-CONVENTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_literalP", "DECONTEXTUALIZED-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_literal_convention_mt", "DECONTEXTUALIZED-LITERAL-CONVENTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_collection_literalP", "DECONTEXTUALIZED-COLLECTION-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_atomic_cnfP", "DECONTEXTUALIZED-ATOMIC-CNF?", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_weakening_prohibitedP", "DECONTEXTUALIZED-WEAKENING-PROHIBITED?", 0, 0, false );
    SubLFiles.declareFunction( me, "mt_matches_convention_mtP", "MT-MATCHES-CONVENTION-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_convention_mt_for_decontextualized_cnf", "POSSIBLY-CONVENTION-MT-FOR-DECONTEXTUALIZED-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_gafP", "DECONTEXTUALIZED-GAF?", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ruleP", "DECONTEXTUALIZED-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_assertionP", "DECONTEXTUALIZED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_assertion_convention_mt", "DECONTEXTUALIZED-ASSERTION-CONVENTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_assertion_in_right_mtP", "DECONTEXTUALIZED-ASSERTION-IN-RIGHT-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_collectionP", "QUOTED-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_argumentP", "QUOTED-ARGUMENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "some_quoted_argumentP", "SOME-QUOTED-ARGUMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "opaque_argumentP", "OPAQUE-ARGUMENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "some_opaque_argumentP", "SOME-OPAQUE-ARGUMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "minimize_collection_extent", "MINIMIZE-COLLECTION-EXTENT", 1, 1, false );
    SubLFiles.declareFunction( me, "minimize_extent", "MINIMIZE-EXTENT", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_assertedP", "COMPLETE-EXTENT-ASSERTED?", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_asserted_gaf", "COMPLETE-EXTENT-ASSERTED-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_asserted_for_value_in_argP", "COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG?", 3, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_asserted_for_value_in_arg_gaf", "COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAF", 3, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerableP", "COMPLETE-EXTENT-ENUMERABLE?", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerable_gaf", "COMPLETE-EXTENT-ENUMERABLE-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerable_via_backchain_gaf", "COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_decidableP", "COMPLETE-EXTENT-DECIDABLE?", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_decidable_gaf", "COMPLETE-EXTENT-DECIDABLE-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerable_for_argP", "COMPLETE-EXTENT-ENUMERABLE-FOR-ARG?", 2, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerable_for_arg_gaf", "COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAF", 2, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerable_for_value_in_argP", "COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG?", 3, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_enumerable_for_value_in_arg_gaf", "COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAF", 3, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_decidable_for_value_in_argP", "COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG?", 3, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_decidable_for_value_in_arg_gaf", "COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAF", 3, 1, false );
    SubLFiles.declareFunction( me, "completely_enumerable_collectionP", "COMPLETELY-ENUMERABLE-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "completely_enumerable_collection_gaf", "COMPLETELY-ENUMERABLE-COLLECTION-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_completely_enumerable_via_backchain_gaf", "COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "completely_decidable_collectionP", "COMPLETELY-DECIDABLE-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "completely_decidable_collection_gaf", "COMPLETELY-DECIDABLE-COLLECTION-GAF", 1, 1, false );
    SubLFiles.declareFunction( me, "check_preferred_collectionP", "CHECK-PREFERRED-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "backchain_requiredP", "BACKCHAIN-REQUIRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "backchain_encouragedP", "BACKCHAIN-ENCOURAGED?", 1, 1, false );
    SubLFiles.declareFunction( me, "backchain_discouragedP", "BACKCHAIN-DISCOURAGED?", 1, 1, false );
    SubLFiles.declareFunction( me, "backchain_forbiddenP", "BACKCHAIN-FORBIDDEN?", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_isa_backchain_requiredP", "COLLECTION-ISA-BACKCHAIN-REQUIRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_genls_backchain_requiredP", "COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_backchain_requiredP", "COLLECTION-BACKCHAIN-REQUIRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_isa_backchain_encouragedP", "COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_genls_backchain_encouragedP", "COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_backchain_encouragedP", "COLLECTION-BACKCHAIN-ENCOURAGED?", 1, 1, false );
    SubLFiles.declareFunction( me, "some_backchain_forbidden_unless_arg_chosen_assertion_somewhereP", "SOME-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASSERTION-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "backchain_forbidden_unless_arg_chosen_argnums", "BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS", 1, 1, false );
    SubLFiles.declareFunction( me, "highly_relevant_term_somewhereP", "HIGHLY-RELEVANT-TERM-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "irrelevant_term_somewhereP", "IRRELEVANT-TERM-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolemize_forward_somewhereP", "SKOLEMIZE-FORWARD-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolemize_forwardP", "SKOLEMIZE-FORWARD?", 1, 1, false );
    SubLFiles.declareFunction( me, "rule_forward_reification_functions", "RULE-FORWARD-REIFICATION-FUNCTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "forward_reification_ruleP", "FORWARD-REIFICATION-RULE?", 2, 1, false );
    SubLFiles.declareFunction( me, "arg1_isa", "ARG1-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg2_isa", "ARG2-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg3_isa", "ARG3-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg4_isa", "ARG4-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg5_isa", "ARG5-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg6_isa", "ARG6-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "args_isa", "ARGS-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "args_quoted_isa", "ARGS-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_and_rest_isa_min_argnum", "ARG-AND-REST-ISA-MIN-ARGNUM", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_and_rest_isa_applicableP", "ARG-AND-REST-ISA-APPLICABLE?", 2, 1, false );
    SubLFiles.declareFunction( me, "arg_and_rest_quoted_isa_min_argnum", "ARG-AND-REST-QUOTED-ISA-MIN-ARGNUM", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_and_rest_quoted_isa_applicableP", "ARG-AND-REST-QUOTED-ISA-APPLICABLE?", 2, 1, false );
    SubLFiles.declareFunction( me, "argn_isa", "ARGN-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "argn_sometimes_isa", "ARGN-SOMETIMES-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "argn_quoted_isa", "ARGN-QUOTED-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "argn_isa_implied", "ARGN-ISA-IMPLIED", 2, 1, false );
    SubLFiles.declareFunction( me, "argn_isa_int", "ARGN-ISA-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "argn_sometimes_isa_int", "ARGN-SOMETIMES-ISA-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "argn_isa_int_2", "ARGN-ISA-INT-2", 3, 0, false );
    SubLFiles.declareFunction( me, "argn_sometimes_isa_int_2", "ARGN-SOMETIMES-ISA-INT-2", 3, 0, false );
    SubLFiles.declareFunction( me, "argn_quoted_isa_int", "ARGN-QUOTED-ISA-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "argn_isa_from_ternary_arg_isa_pred", "ARGN-ISA-FROM-TERNARY-ARG-ISA-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "argn_quoted_isa_from_ternary_arg_quoted_isa_pred", "ARGN-QUOTED-ISA-FROM-TERNARY-ARG-QUOTED-ISA-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "arg_isa_pred_int", "ARG-ISA-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_sometimes_isa_pred_int", "ARG-SOMETIMES-ISA-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_pred", "ARG-ISA-PRED", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_isa_preds", "ARG-ISA-PREDS", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_not_isa_pred_int", "ARG-NOT-ISA-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_pred", "ARG-NOT-ISA-PRED", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_not_isa_preds", "ARG-NOT-ISA-PREDS", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa_pred_int", "ARG-QUOTED-ISA-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa_pred", "ARG-QUOTED-ISA-PRED", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa_preds", "ARG-QUOTED-ISA-PREDS", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_isa_inverse", "ARG-ISA-INVERSE", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_not_isa_inverse", "ARG-NOT-ISA-INVERSE", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa_inverse", "ARG-QUOTED-ISA-INVERSE", 1, 2, false );
    SubLFiles.declareFunction( me, "inverse_argnum", "INVERSE-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_pred_arg", "ISA-PRED-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_isa_pred_arg", "QUOTED-ISA-PRED-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_pred_arg", "GENL-PRED-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "min_argn_isa", "MIN-ARGN-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "arg_types", "ARG-TYPES", 1, 1, false );
    SubLFiles.declareFunction( me, "ai", "AI", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_isa", "ARG-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "each_arg_isa", "EACH-ARG-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa", "ARG-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "each_arg_quoted_isa", "EACH-ARG-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "arg1_isa_of", "ARG1-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg2_isa_of", "ARG2-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg3_isa_of", "ARG3-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg4_isa_of", "ARG4-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg5_isa_of", "ARG5-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg6_isa_of", "ARG6-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "args_isa_of", "ARGS-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "aio", "AIO", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_isa_of", "ARG-ISA-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "argn_isa_of", "ARGN-ISA-OF", 2, 1, false );
    SubLFiles.declareFunction( me, "arg1_genl", "ARG1-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "arg2_genl", "ARG2-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "arg3_genl", "ARG3-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "arg4_genl", "ARG4-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "arg5_genl", "ARG5-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "arg6_genl", "ARG6-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "args_genl", "ARGS-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "argn_genl", "ARGN-GENL", 2, 1, false );
    SubLFiles.declareFunction( me, "argn_genl_from_ternary_arg_genl_pred", "ARGN-GENL-FROM-TERNARY-ARG-GENL-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "arg_and_rest_genl_min_argnum", "ARG-AND-REST-GENL-MIN-ARGNUM", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_and_rest_genl_applicableP", "ARG-AND-REST-GENL-APPLICABLE?", 2, 1, false );
    SubLFiles.declareFunction( me, "arg_genl_pred_int", "ARG-GENL-PRED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_genl_pred", "ARG-GENL-PRED", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_genl_preds", "ARG-GENL-PREDS", 1, 2, false );
    SubLFiles.declareFunction( me, "arg_genl_inverse", "ARG-GENL-INVERSE", 1, 2, false );
    SubLFiles.declareFunction( me, "min_argn_genl", "MIN-ARGN-GENL", 2, 1, false );
    SubLFiles.declareFunction( me, "arg_genls", "ARG-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "each_arg_genl", "EACH-ARG-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "arg1_genl_of", "ARG1-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg2_genl_of", "ARG2-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg3_genl_of", "ARG3-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg4_genl_of", "ARG4-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg5_genl_of", "ARG5-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg6_genl_of", "ARG6-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "args_genl_of", "ARGS-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "argn_genl_of", "ARGN-GENL-OF", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_isa1_2", "INTER-ARG-ISA1-2", 1, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_isa2_1", "INTER-ARG-ISA2-1", 1, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_dep", "INTER-ARG-ISA-DEP", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_indep", "INTER-ARG-ISA-INDEP", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_pred_indep_arg", "INTER-ARG-ISA-PRED-INDEP-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_preds_dep", "INTER-ARG-ISA-PREDS-DEP", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_preds_indep", "INTER-ARG-ISA-PREDS-INDEP", 1, 0, false );
    SubLFiles.declareFunction( me, "defnsP", "DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "admitting_defnsP", "ADMITTING-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "defining_defnsP", "DEFINING-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "sufficient_defnsP", "SUFFICIENT-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "necessary_defnsP", "NECESSARY-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "admitting_quoted_defnsP", "ADMITTING-QUOTED-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "defining_quoted_defnsP", "DEFINING-QUOTED-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "sufficient_quoted_defnsP", "SUFFICIENT-QUOTED-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "necessary_quoted_defnsP", "NECESSARY-QUOTED-DEFNS?", 1, 1, false );
    SubLFiles.declareFunction( me, "defns", "DEFNS", 1, 1, false );
    SubLFiles.declareFunction( me, "admitting_defns", "ADMITTING-DEFNS", 1, 1, false );
    SubLFiles.declareFunction( me, "defining_defns", "DEFINING-DEFNS", 1, 1, false );
    SubLFiles.declareFunction( me, "necessary_defns", "NECESSARY-DEFNS", 1, 1, false );
    SubLFiles.declareFunction( me, "sufficient_defns", "SUFFICIENT-DEFNS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_sufficient_defns", "ALL-SUFFICIENT-DEFNS", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isaP", "RESULT-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_argP", "RESULT-ISA-ARG?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_arg_isaP", "RESULT-ISA-ARG-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_arg_when_isaP", "RESULT-ISA-ARG-WHEN-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_via_closed_underP", "RESULT-ISA-VIA-CLOSED-UNDER?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_isa_arg_arg_isaP", "RESULT-ISA-ARG-ARG-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "function_to_arg_termP", "FUNCTION-TO-ARG-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_result_isaP", "META-RESULT-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_isa_argP", "META-RESULT-ISA-ARG?", 1, 1, false );
    SubLFiles.declareFunction( me, "evaluation_result_quoted_isaP", "EVALUATION-RESULT-QUOTED-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_evaluation_result_quoted_isaP", "META-EVALUATION-RESULT-QUOTED-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_quoted_isaP", "RESULT-QUOTED-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_quoted_isaP", "META-RESULT-QUOTED-ISA?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_genlP", "RESULT-GENL?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_genl_argP", "RESULT-GENL-ARG?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_genl_arg_arg_genlP", "RESULT-GENL-ARG-ARG-GENL?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_genlP", "META-RESULT-GENL?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_genl_argP", "META-RESULT-GENL-ARG?", 1, 1, false );
    SubLFiles.declareFunction( me, "result_type", "RESULT-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "result_types", "RESULT-TYPES", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa", "RESULT-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_via_arg_arg_isa", "RESULT-ISA-VIA-ARG-ARG-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_args", "RESULT-ISA-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_arg_isas", "RESULT-ISA-ARG-ISAS", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_when_arg_isa", "RESULT-ISA-WHEN-ARG-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_via_closed_under_internal", "RESULT-ISA-VIA-CLOSED-UNDER-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_via_closed_under", "RESULT-ISA-VIA-CLOSED-UNDER", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_via_closed_under_int", "RESULT-ISA-VIA-CLOSED-UNDER-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_internal", "RESULT-INTER-ARG-ISA-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa", "RESULT-INTER-ARG-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_int", "RESULT-INTER-ARG-ISA-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_reln_internal", "RESULT-INTER-ARG-ISA-RELN-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_reln", "RESULT-INTER-ARG-ISA-RELN", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_reln_int", "RESULT-INTER-ARG-ISA-RELN-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_isa", "META-RESULT-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_isa_args", "META-RESULT-ISA-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "evaluation_result_quoted_isa", "EVALUATION-RESULT-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_evaluation_result_quoted_isa", "META-EVALUATION-RESULT-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "result_quoted_isa", "RESULT-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_quoted_isa", "META-RESULT-QUOTED-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "result_genl", "RESULT-GENL", 1, 2, false );
    SubLFiles.declareFunction( me, "result_genl_args", "RESULT-GENL-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "result_genl_via_arg_arg_genl", "RESULT-GENL-VIA-ARG-ARG-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_genl", "RESULT-INTER-ARG-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_genl_reln", "RESULT-INTER-ARG-GENL-RELN", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_genl", "META-RESULT-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_result_genl_args", "META-RESULT-GENL-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "result_isa_of", "RESULT-ISA-OF", 1, 2, false );
    SubLFiles.declareFunction( me, "result_genl_of", "RESULT-GENL-OF", 1, 2, false );
    SubLFiles.declareFunction( me, "result_genl_via_argnums", "RESULT-GENL-VIA-ARGNUMS", 2, 2, false );
    SubLFiles.declareFunction( me, "result_isa_via_argnums", "RESULT-ISA-VIA-ARGNUMS", 2, 2, false );
    SubLFiles.declareFunction( me, "result_isa_arg_isa_via_argnums", "RESULT-ISA-ARG-ISA-VIA-ARGNUMS", 2, 2, false );
    SubLFiles.declareFunction( me, "result_isa_when_arg_isa_via_argnums", "RESULT-ISA-WHEN-ARG-ISA-VIA-ARGNUMS", 2, 2, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_via_which_args", "RESULT-INTER-ARG-ISA-VIA-WHICH-ARGS", 2, 2, false );
    SubLFiles.declareFunction( me, "result_inter_arg_isa_reln_via_which_args", "RESULT-INTER-ARG-ISA-RELN-VIA-WHICH-ARGS", 2, 2, false );
    SubLFiles.declareFunction( me, "result_inter_arg_genl_via_which_args", "RESULT-INTER-ARG-GENL-VIA-WHICH-ARGS", 2, 1, false );
    SubLFiles.declareFunction( me, "result_inter_arg_genl_reln_via_which_args", "RESULT-INTER-ARG-GENL-RELN-VIA-WHICH-ARGS", 2, 2, false );
    SubLFiles.declareFunction( me, "arg1_format", "ARG1-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "arg2_format", "ARG2-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "arg3_format", "ARG3-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "arg4_format", "ARG4-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "arg5_format", "ARG5-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "arg6_format", "ARG6-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "argn_format_inverse", "ARGN-FORMAT-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "argn_format_pred", "ARGN-FORMAT-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "argn_format", "ARGN-FORMAT", 2, 1, false );
    SubLFiles.declareFunction( me, "single_entry_format_in_argsP", "SINGLE-ENTRY-FORMAT-IN-ARGS?", 2, 1, false );
    SubLFiles.declareFunction( me, "each_arg_format", "EACH-ARG-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_n_single_entry_formatP", "ARG-N-SINGLE-ENTRY-FORMAT?", 2, 1, false );
    SubLFiles.declareFunction( me, "arg1_format_of", "ARG1-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg2_format_of", "ARG2-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg3_format_of", "ARG3-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg4_format_of", "ARG4-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg5_format_of", "ARG5-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg6_format_of", "ARG6-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_format_of", "ARG-FORMAT-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "argn_format_of", "ARGN-FORMAT-OF", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_format_dep", "INTER-ARG-FORMAT-DEP", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_format_pred", "INTER-ARG-FORMAT-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_format_inverse", "INTER-ARG-FORMAT-INVERSE", 2, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_format1_2", "INTER-ARG-FORMAT1-2", 1, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_format2_1", "INTER-ARG-FORMAT2-1", 1, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_format_preds_dep", "INTER-ARG-FORMAT-PREDS-DEP", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_format_preds_ind", "INTER-ARG-FORMAT-PREDS-IND", 1, 0, false );
    SubLFiles.declareFunction( me, "required_pred_arg", "REQUIRED-PRED-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "required_pred_of_argnum", "REQUIRED-PRED-OF-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "required_preds_of_argnum", "REQUIRED-PREDS-OF-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_all_preds_of_argnum", "RELATION-ALL-PREDS-OF-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_exists_preds_of_argnum", "RELATION-EXISTS-PREDS-OF-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_mts", "PRED-MTS", 2, 1, false );
    SubLFiles.declareFunction( me, "mts_of_fort_wrt_predicate_type", "MTS-OF-FORT-WRT-PREDICATE-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "mts_of_predicate_type_int", "MTS-OF-PREDICATE-TYPE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_type_mts", "ARG-TYPE-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "root_wrtP", "ROOT-WRT?", 2, 1, false );
    SubLFiles.declareFunction( me, "leaf_wrtP", "LEAF-WRT?", 2, 1, false );
    SubLFiles.declareFunction( me, "fan_out_arg", "FAN-OUT-ARG", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_fan_out_arg", "ASSERTED-FAN-OUT-ARG", 1, 1, false );
    SubLFiles.declareFunction( me, "fan_in_arg", "FAN-IN-ARG", 1, 1, false );
    SubLFiles.declareFunction( me, "equivalence_class_wrtP", "EQUIVALENCE-CLASS-WRT?", 3, 1, false );
    SubLFiles.declareFunction( me, "equivalence_classP", "EQUIVALENCE-CLASS?", 3, 1, false );
    SubLFiles.declareFunction( me, "equivalence_class_predP", "EQUIVALENCE-CLASS-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "equivalence_class_pred_wrt", "EQUIVALENCE-CLASS-PRED-WRT", 1, 1, false );
    SubLFiles.declareFunction( me, "reviewer", "REVIEWER", 1, 1, false );
    SubLFiles.declareFunction( me, "comment", "COMMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "comment_if_fort", "COMMENT-IF-FORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclist_notes", "CYCLIST-NOTES", 1, 1, false );
    SubLFiles.declareFunction( me, "constants_referencing_me_in_string", "CONSTANTS-REFERENCING-ME-IN-STRING", 1, 4, false );
    SubLFiles.declareFunction( me, "constants_in_string_assertions", "CONSTANTS-IN-STRING-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "any_of_constants_in_string_assertionP", "ANY-OF-CONSTANTS-IN-STRING-ASSERTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "strings_in_string_assertions", "STRINGS-IN-STRING-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "any_of_strings_in_string_assertionP", "ANY-OF-STRINGS-IN-STRING-ASSERTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "any_referenced_in_stringP", "ANY-REFERENCED-IN-STRING?", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_arg_of_selected_gaf_assertion", "GATHER-ARG-OF-SELECTED-GAF-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "index_arg_references_in_stringP", "INDEX-ARG-REFERENCES-IN-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "supported_entries", "SUPPORTED-ENTRIES", 2, 4, false );
    SubLFiles.declareFunction( me, "assertion_still_thereP", "ASSERTION-STILL-THERE?", 2, 0, false );
    SubLFiles.declareFunction( me, "paraphrase_constant", "PARAPHRASE-CONSTANT", 1, 2, false );
    SubLFiles.declareFunction( me, "pc", "PC", 1, 2, false );
    SubLFiles.declareFunction( me, "paraphrase_constant_in_mt", "PARAPHRASE-CONSTANT-IN-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "mts_of_constant_temp", "MTS-OF-CONSTANT-TEMP", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_documentation", "CONSTANT-DOCUMENTATION", 1, 2, false );
    SubLFiles.declareFunction( me, "cd", "CD", 1, 2, false );
    SubLFiles.declareFunction( me, "constant_documentation_int", "CONSTANT-DOCUMENTATION-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "print_arg", "PRINT-ARG", 1, 1, false );
    SubLFiles.declareFunction( me, "print_assertion_args", "PRINT-ASSERTION-ARGS", 1, 2, false );
    SubLFiles.declareFunction( me, "relation_signature_string", "RELATION-SIGNATURE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "scoping_args", "SCOPING-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "scoping_argP", "SCOPING-ARG?", 2, 1, false );
    SubLFiles.declareFunction( me, "some_scoping_arg_somewhereP", "SOME-SCOPING-ARG-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_term_assertions", "ALL-TERM-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "term_assertions", "TERM-ASSERTIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "ca", "CA", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_assertions", "FORT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "any_term_assertion", "ANY-TERM-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "ata", "ATA", 1, 1, false );
    SubLFiles.declareFunction( me, "atf", "ATF", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_mentions_kba_predP", "ASSERTION-MENTIONS-KBA-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "ata_wrt_pred", "ATA-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "relevant_term_assertions", "RELEVANT-TERM-ASSERTIONS", 1, 4, false );
    SubLFiles.declareFunction( me, "term_specified_to_be_retainedP", "TERM-SPECIFIED-TO-BE-RETAINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclist_with_most_assertions_about", "CYCLIST-WITH-MOST-ASSERTIONS-ABOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_relevant_assertions", "ISA-RELEVANT-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "ira", "IRA", 1, 1, false );
    SubLFiles.declareFunction( me, "map_selected_term_assertions_int", "MAP-SELECTED-TERM-ASSERTIONS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "ira_wrt_type", "IRA-WRT-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "isa_relevant_assertions_wrt_type", "ISA-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "ira_wrt_pred", "IRA-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "isa_relevant_assertions_wrt_pred", "ISA-RELEVANT-ASSERTIONS-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "ira_wrt_type_and_pred", "IRA-WRT-TYPE-AND-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "isa_relevant_assertions_wrt_type_and_pred", "ISA-RELEVANT-ASSERTIONS-WRT-TYPE-AND-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "ako_relevant_assertions", "AKO-RELEVANT-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "ara", "ARA", 1, 1, false );
    SubLFiles.declareFunction( me, "ara_wrt_type", "ARA-WRT-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "ako_relevant_assertions_wrt_type", "AKO-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "ara_wrt_pred", "ARA-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "ako_relevant_assertions_wrt_pred", "AKO-RELEVANT-ASSERTIONS-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "ara_wrt_type_and_pred", "ARA-WRT-TYPE-AND-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "ako_relevant_assertions_wrt_type_and_pred", "AKO-RELEVANT-ASSERTIONS-WRT-TYPE-AND-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "possibly_relevant_assertions", "POSSIBLY-RELEVANT-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "pra", "PRA", 1, 1, false );
    SubLFiles.declareFunction( me, "pra_wrt_type", "PRA-WRT-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "possibly_relevant_assertions_wrt_type", "POSSIBLY-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "pra_wrt_pred", "PRA-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "possibly_relevant_assertions_wrt_pred", "POSSIBLY-RELEVANT-ASSERTIONS-WRT-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "pra_wrt_type_and_pred", "PRA-WRT-TYPE-AND-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "possibly_relevant_assertions_wrt_type_and_pred", "POSSIBLY-RELEVANT-ASSERTIONS-WRT-TYPE-AND-PRED", 3, 1, false );
    SubLFiles.declareFunction( me, "gafs_re", "GAFS-RE", 1, 2, false );
    SubLFiles.declareFunction( me, "assertions_re", "ASSERTIONS-RE", 1, 1, false );
    SubLFiles.declareFunction( me, "selective_gafs_re", "SELECTIVE-GAFS-RE", 2, 2, false );
    SubLFiles.declareFunction( me, "selective_assertions_re", "SELECTIVE-ASSERTIONS-RE", 2, 1, false );
    SubLFiles.declareFunction( me, "pred_assertions", "PRED-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_pos_gafs", "CONSTANT-POS-GAFS", 1, 1, false );
    SubLFiles.declareFunction( me, "constant_pos_gafs_int", "CONSTANT-POS-GAFS-INT", 1, 1, false );
    SubLFiles.declareMacro( me, "do_gafs_wrt_pred_type", "DO-GAFS-WRT-PRED-TYPE" );
    SubLFiles.declareFunction( me, "term_gafs_wrt_pred_type", "TERM-GAFS-WRT-PRED-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "relation_types", "RELATION-TYPES", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_relation_types", "GATHER-RELATION-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_types_sp", "RELATION-TYPES-SP", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_relation_types_sp", "GATHER-RELATION-TYPES-SP", 1, 0, false );
    SubLFiles.declareFunction( me, "defining_mt_for_fortP", "DEFINING-MT-FOR-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "defining_mt", "DEFINING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "hypothetical_term_p", "HYPOTHETICAL-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "not_assertible_predicateP", "NOT-ASSERTIBLE-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "not_assertible_collectionP", "NOT-ASSERTIBLE-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "not_assertible_mtP", "NOT-ASSERTIBLE-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "indexical_p", "INDEXICAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "common_non_skolem_indeterminate_term_denoting_functionP", "COMMON-NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_skolem_indeterminate_term_denoting_functionP", "NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "indeterminate_termP", "INDETERMINATE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "fast_non_skolem_indeterminate_termP", "FAST-NON-SKOLEM-INDETERMINATE-TERM?", 1, 0, false );
    new $fast_non_skolem_indeterminate_termP$UnaryFunction();
    SubLFiles.declareFunction( me, "non_skolem_indeterminate_termP", "NON-SKOLEM-INDETERMINATE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_abducible_ruleP", "NON-ABDUCIBLE-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_exempt_from_unique_names_assumptionP", "TERM-EXEMPT-FROM-UNIQUE-NAMES-ASSUMPTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "email_address_text", "EMAIL-ADDRESS-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "preferred_email_address_text", "PREFERRED-EMAIL-ADDRESS-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "local_email_address_text", "LOCAL-EMAIL-ADDRESS-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_guess_the_cyclist_from_user_name", "CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME", 0, 0, false );
    new $clear_guess_the_cyclist_from_user_name$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_guess_the_cyclist_from_user_name", "REMOVE-GUESS-THE-CYCLIST-FROM-USER-NAME", 0, 1, false );
    SubLFiles.declareFunction( me, "guess_the_cyclist_from_user_name_internal", "GUESS-THE-CYCLIST-FROM-USER-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "guess_the_cyclist_from_user_name", "GUESS-THE-CYCLIST-FROM-USER-NAME", 0, 1, false );
    SubLFiles.declareFunction( me, "possibly_update_most_specialized_fort", "POSSIBLY-UPDATE-MOST-SPECIALIZED-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "most_specialized_fort", "MOST-SPECIALIZED-FORT", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_kb_accessors_file()
  {
    $decontextualized_weakening_prohibitedP$ = SubLFiles.defparameter( "*DECONTEXTUALIZED-WEAKENING-PROHIBITED?*", T );
    $suppress_backchain_forbidden_preds$ = SubLFiles.defparameter( "*SUPPRESS-BACKCHAIN-FORBIDDEN-PREDS*", NIL );
    $common_non_skolem_indeterminate_term_denoting_functions$ = SubLFiles.deflexical( "*COMMON-NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTIONS*", $list382 );
    $guess_the_cyclist_from_user_name_caching_state$ = SubLFiles.deflexical( "*GUESS-THE-CYCLIST-FROM-USER-NAME-CACHING-STATE*", NIL );
    $smallest_num_index_so_far$ = SubLFiles.defparameter( "*SMALLEST-NUM-INDEX-SO-FAR*", NIL );
    $most_specialized_fort_so_far$ = SubLFiles.defparameter( "*MOST-SPECIALIZED-FORT-SO-FAR*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_accessors_file()
  {
    utilities_macros.register_cyc_api_function( $sym0$RELATION_, $list1, $str2$Return_T_iff_RELATION_is_a_relati, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym7$REFLEXIVE_PREDICATE_, $list8, $str9$Return_T_iff_PREDICATE_is_a_refle, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym10$IRREFLEXIVE_PREDICATE_, $list8, $str11$Return_T_iff_PREDICATE_is_an_irre, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym12$SYMMETRIC_PREDICATE_, $list8, $str13$Return_T_iff_PREDICATE_is_a_symme, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym14$ASYMMETRIC_PREDICATE_, $list8, $str15$Return_T_iff_PREDICATE_is_an_asym, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym16$ANTI_SYMMETRIC_PREDICATE_, $list8, $str17$Return_T_iff_PREDICATE_is_an_anti, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym18$TRANSITIVE_PREDICATE_, $list8, $str19$Return_T_iff_PREDICATE_is_a_trans, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym20$COMMUTATIVE_FUNCTION_, $list21, $str22$Return_T_iff_FUNCTION_is_a_commut, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym23$BINARY_PREDICATE_, $list8, $str24$Return_T_iff_PREDICATE_is_a_predi, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym27$INDIVIDUAL_, $list28, $str29$Return_T_iff_TERM_is_an_individua, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym31$SET_OR_COLLECTION_, $list28, $str32$Return_T_iff_TERM_is_a_set_or_col, NIL, $list3 );
    utilities_macros.register_cyc_api_function( $sym86$ARGN_ISA, $list87, $str88$Returns_a_list_of_the_local_isa_c, $list89, NIL );
    utilities_macros.register_cyc_api_function( $sym90$ARGN_SOMETIMES_ISA, $list87, $str88$Returns_a_list_of_the_local_isa_c, $list89, NIL );
    utilities_macros.register_cyc_api_function( $sym91$ARGN_QUOTED_ISA, $list87, $str88$Returns_a_list_of_the_local_isa_c, $list89, NIL );
    utilities_macros.register_cyc_api_function( $sym137$MIN_ARGN_ISA, $list138, $str139$Returns_a_list_of_the_most_specif, $list140, $list141 );
    utilities_macros.register_cyc_api_function( $sym143$ARGN_ISA_OF, $list144, $str145$Returns_the_relations_for_which_C, $list89, $list141 );
    utilities_macros.register_cyc_api_function( $sym149$ARGN_GENL, $list87, $str150$Returns_the_local_genl_constraint, $list89, $list141 );
    utilities_macros.register_cyc_api_function( $sym154$MIN_ARGN_GENL, $list138, $str155$Return_a_list_of_the_most_specifi, $list156, $list157 );
    utilities_macros.register_cyc_api_function( $sym159$ARGN_GENL_OF, $list144, $str160$Returns_a_list_of_the_predicates_, $list89, $list157 );
    utilities_macros.register_cyc_api_function( $sym162$INTER_ARG_ISA1_2, $list163, $str164$return_a_list_of_pairs_of___arg1_, NIL, $list165 );
    utilities_macros.register_cyc_api_function( $sym201$DEFINING_DEFNS, $list202, $str203$Return_a_list_of_the_local_defini, NIL, $list157 );
    utilities_macros.register_cyc_api_function( $sym204$NECESSARY_DEFNS, $list202, $str205$Return_a_list_of_the_local_necess, NIL, $list157 );
    utilities_macros.register_cyc_api_function( $sym206$SUFFICIENT_DEFNS, $list202, $str207$Return_a_list_of_the_local_suffic, NIL, $list157 );
    utilities_macros.register_cyc_api_function( $sym208$ALL_SUFFICIENT_DEFNS, $list202, $str209$Return_a_list_of_all_sufficient_d, NIL, $list157 );
    utilities_macros.register_cyc_api_function( $sym224$RESULT_ISA, $list225, $str226$Return_a_list_of_the_collections_, NIL, $list157 );
    memoization_state.note_memoized_function( $sym228$RESULT_ISA_VIA_CLOSED_UNDER );
    memoization_state.note_memoized_function( $sym230$RESULT_INTER_ARG_ISA );
    memoization_state.note_memoized_function( $sym232$RESULT_INTER_ARG_ISA_RELN );
    utilities_macros.register_cyc_api_function( $sym237$EVALUATION_RESULT_QUOTED_ISA, $list225, $str238$return_the_collections_that_inclu, NIL, $list157 );
    utilities_macros.register_cyc_api_function( $sym239$RESULT_QUOTED_ISA, $list225, $str240$return_the_collections_that_inclu, NIL, $list157 );
    utilities_macros.register_cyc_api_function( $sym284$REVIEWER, $list285, $str286$Identify_the_cyclist_who_reviewed, $list287, $list288 );
    utilities_macros.register_cyc_api_function( $sym290$COMMENT, $list291, $str292$Return_the_comment_string_for_FOR, $list293, $list294 );
    access_macros.register_external_symbol( $sym295$COMMENT_IF_FORT );
    access_macros.register_external_symbol( $sym296$CYCLIST_NOTES );
    utilities_macros.register_cyc_api_function( $sym323$ALL_TERM_ASSERTIONS, $list324, $str325$Return_a_list_of_all_the_assertio, $list326, $list327 );
    utilities_macros.register_cyc_api_function( $sym335$ISA_RELEVANT_ASSERTIONS, $list336, $str337$Return_a_list_of_all__e_g___inher, NIL, $list327 );
    utilities_macros.register_cyc_api_function( $sym340$ISA_RELEVANT_ASSERTIONS_WRT_TYPE, $list341, $str342$Returns_a_list_of_all__e_g___inhe, NIL, $list327 );
    utilities_macros.register_cyc_api_macro( $sym356$DO_GAFS_WRT_PRED_TYPE, $list345, $str357$iterate_over_every_gaf_assertion_ );
    memoization_state.note_globally_cached_function( $sym392$GUESS_THE_CYCLIST_FROM_USER_NAME );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_accessors_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_accessors_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_accessors_file();
  }
  static
  {
    me = new kb_accessors();
    $decontextualized_weakening_prohibitedP$ = null;
    $suppress_backchain_forbidden_preds$ = null;
    $common_non_skolem_indeterminate_term_denoting_functions$ = null;
    $guess_the_cyclist_from_user_name_caching_state$ = null;
    $smallest_num_index_so_far$ = null;
    $most_specialized_fort_so_far$ = null;
    $sym0$RELATION_ = makeSymbol( "RELATION?" );
    $list1 = ConsesLow.list( makeSymbol( "RELATION" ) );
    $str2$Return_T_iff_RELATION_is_a_relati = makeString( "Return T iff RELATION is a relationship." );
    $list3 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym4$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const5$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const6$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell( makeString( "AtemporalNecessarilyEssentialCollectionType" ) );
    $sym7$REFLEXIVE_PREDICATE_ = makeSymbol( "REFLEXIVE-PREDICATE?" );
    $list8 = ConsesLow.list( makeSymbol( "PREDICATE" ) );
    $str9$Return_T_iff_PREDICATE_is_a_refle = makeString( "Return T iff PREDICATE is a reflexive predicate." );
    $sym10$IRREFLEXIVE_PREDICATE_ = makeSymbol( "IRREFLEXIVE-PREDICATE?" );
    $str11$Return_T_iff_PREDICATE_is_an_irre = makeString( "Return T iff PREDICATE is an irreflexive predicate." );
    $sym12$SYMMETRIC_PREDICATE_ = makeSymbol( "SYMMETRIC-PREDICATE?" );
    $str13$Return_T_iff_PREDICATE_is_a_symme = makeString( "Return T iff PREDICATE is a symmetric predicate." );
    $sym14$ASYMMETRIC_PREDICATE_ = makeSymbol( "ASYMMETRIC-PREDICATE?" );
    $str15$Return_T_iff_PREDICATE_is_an_asym = makeString( "Return T iff PREDICATE is an asymmetric predicate." );
    $sym16$ANTI_SYMMETRIC_PREDICATE_ = makeSymbol( "ANTI-SYMMETRIC-PREDICATE?" );
    $str17$Return_T_iff_PREDICATE_is_an_anti = makeString( "Return T iff PREDICATE is an anti-symmetric predicate." );
    $sym18$TRANSITIVE_PREDICATE_ = makeSymbol( "TRANSITIVE-PREDICATE?" );
    $str19$Return_T_iff_PREDICATE_is_a_trans = makeString( "Return T iff PREDICATE is a transitive predicate." );
    $sym20$COMMUTATIVE_FUNCTION_ = makeSymbol( "COMMUTATIVE-FUNCTION?" );
    $list21 = ConsesLow.list( makeSymbol( "FUNCTION" ) );
    $str22$Return_T_iff_FUNCTION_is_a_commut = makeString( "Return T iff FUNCTION is a commutative function." );
    $sym23$BINARY_PREDICATE_ = makeSymbol( "BINARY-PREDICATE?" );
    $str24$Return_T_iff_PREDICATE_is_a_predi = makeString( "Return T iff PREDICATE is a predicate of arity 2." );
    $const25$Cyclist = constant_handles.reader_make_constant_shell( makeString( "Cyclist" ) );
    $const26$HumanCyclist = constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) );
    $sym27$INDIVIDUAL_ = makeSymbol( "INDIVIDUAL?" );
    $list28 = ConsesLow.list( makeSymbol( "TERM" ) );
    $str29$Return_T_iff_TERM_is_an_individua = makeString( "Return T iff TERM is an individual (i.e., *not* a collection)." );
    $const30$Set_Mathematical = constant_handles.reader_make_constant_shell( makeString( "Set-Mathematical" ) );
    $sym31$SET_OR_COLLECTION_ = makeSymbol( "SET-OR-COLLECTION?" );
    $str32$Return_T_iff_TERM_is_a_set_or_col = makeString( "Return T iff TERM is a set or collection (i.e., *not* an individual)." );
    $const33$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const34$SetOrCollection = constant_handles.reader_make_constant_shell( makeString( "SetOrCollection" ) );
    $const35$FirstOrderCollection = constant_handles.reader_make_constant_shell( makeString( "FirstOrderCollection" ) );
    $const36$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const37$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction" ) );
    $const38$decontextualizedPredicate = constant_handles.reader_make_constant_shell( makeString( "decontextualizedPredicate" ) );
    $const39$predicateConventionMt = constant_handles.reader_make_constant_shell( makeString( "predicateConventionMt" ) );
    $const40$decontextualizedCollection = constant_handles.reader_make_constant_shell( makeString( "decontextualizedCollection" ) );
    $const41$collectionConventionMt = constant_handles.reader_make_constant_shell( makeString( "collectionConventionMt" ) );
    $const42$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const43$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const44$quotedCollection = constant_handles.reader_make_constant_shell( makeString( "quotedCollection" ) );
    $const45$quotedArgument = constant_handles.reader_make_constant_shell( makeString( "quotedArgument" ) );
    $const46$opaqueArgument = constant_handles.reader_make_constant_shell( makeString( "opaqueArgument" ) );
    $const47$minimizeCollectionExtent = constant_handles.reader_make_constant_shell( makeString( "minimizeCollectionExtent" ) );
    $const48$minimizeExtent = constant_handles.reader_make_constant_shell( makeString( "minimizeExtent" ) );
    $sym49$FORT_P = makeSymbol( "FORT-P" );
    $const50$completeExtentAsserted = constant_handles.reader_make_constant_shell( makeString( "completeExtentAsserted" ) );
    $sym51$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $const52$completeExtentAssertedForValueInA = constant_handles.reader_make_constant_shell( makeString( "completeExtentAssertedForValueInArg" ) );
    $const53$completeExtentEnumerable = constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerable" ) );
    $const54$completeExtentEnumerableViaBackch = constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerableViaBackchain" ) );
    $const55$completeExtentDecidable = constant_handles.reader_make_constant_shell( makeString( "completeExtentDecidable" ) );
    $const56$completeExtentEnumerableForArg = constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerableForArg" ) );
    $const57$completeExtentEnumerableForValueI = constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerableForValueInArg" ) );
    $const58$completeExtentDecidableForValueIn = constant_handles.reader_make_constant_shell( makeString( "completeExtentDecidableForValueInArg" ) );
    $const59$completelyEnumerableCollection = constant_handles.reader_make_constant_shell( makeString( "completelyEnumerableCollection" ) );
    $const60$collectionCompletelyEnumerableVia = constant_handles.reader_make_constant_shell( makeString( "collectionCompletelyEnumerableViaBackchain" ) );
    $const61$completelyDecidableCollection = constant_handles.reader_make_constant_shell( makeString( "completelyDecidableCollection" ) );
    $const62$collectionCheckPreferred = constant_handles.reader_make_constant_shell( makeString( "collectionCheckPreferred" ) );
    $const63$backchainRequired = constant_handles.reader_make_constant_shell( makeString( "backchainRequired" ) );
    $const64$backchainEncouraged = constant_handles.reader_make_constant_shell( makeString( "backchainEncouraged" ) );
    $const65$backchainDiscouraged = constant_handles.reader_make_constant_shell( makeString( "backchainDiscouraged" ) );
    $const66$backchainForbidden = constant_handles.reader_make_constant_shell( makeString( "backchainForbidden" ) );
    $const67$collectionIsaBackchainRequired = constant_handles.reader_make_constant_shell( makeString( "collectionIsaBackchainRequired" ) );
    $const68$collectionGenlsBackchainRequired = constant_handles.reader_make_constant_shell( makeString( "collectionGenlsBackchainRequired" ) );
    $const69$collectionBackchainRequired = constant_handles.reader_make_constant_shell( makeString( "collectionBackchainRequired" ) );
    $const70$collectionIsaBackchainEncouraged = constant_handles.reader_make_constant_shell( makeString( "collectionIsaBackchainEncouraged" ) );
    $const71$collectionGenlsBackchainEncourage = constant_handles.reader_make_constant_shell( makeString( "collectionGenlsBackchainEncouraged" ) );
    $const72$collectionBackchainEncouraged = constant_handles.reader_make_constant_shell( makeString( "collectionBackchainEncouraged" ) );
    $kw73$TRUE = makeKeyword( "TRUE" );
    $sym74$_ = makeSymbol( "<" );
    $const75$highlyRelevantTerm = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantTerm" ) );
    $const76$irrelevantTerm = constant_handles.reader_make_constant_shell( makeString( "irrelevantTerm" ) );
    $const77$skolemizeForward = constant_handles.reader_make_constant_shell( makeString( "skolemizeForward" ) );
    $const78$forwardReificationRule = constant_handles.reader_make_constant_shell( makeString( "forwardReificationRule" ) );
    $const79$universalForwardReificationRule = constant_handles.reader_make_constant_shell( makeString( "universalForwardReificationRule" ) );
    $const80$argsIsa = constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) );
    $sym81$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $const82$argsQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "argsQuotedIsa" ) );
    $const83$argAndRestIsa = constant_handles.reader_make_constant_shell( makeString( "argAndRestIsa" ) );
    $const84$argAndRestQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "argAndRestQuotedIsa" ) );
    $sym85$INTEGERP = makeSymbol( "INTEGERP" );
    $sym86$ARGN_ISA = makeSymbol( "ARGN-ISA" );
    $list87 = ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "ARGNUM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str88$Returns_a_list_of_the_local_isa_c = makeString( "Returns a list of the local isa constraints applied to the ARGNUMth argument of \nRELATION (#$argsIsa conjoins with #$arg1Isa et al)." );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "INTEGERP" ) ) );
    $sym90$ARGN_SOMETIMES_ISA = makeSymbol( "ARGN-SOMETIMES-ISA" );
    $sym91$ARGN_QUOTED_ISA = makeSymbol( "ARGN-QUOTED-ISA" );
    $const92$CycLSentence_Assertible = constant_handles.reader_make_constant_shell( makeString( "CycLSentence-Assertible" ) );
    $const93$CycLVariable = constant_handles.reader_make_constant_shell( makeString( "CycLVariable" ) );
    $const94$ArgQuotedIsaBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgQuotedIsaBinaryPredicate" ) );
    $const95$ArgQuotedIsaTernaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgQuotedIsaTernaryPredicate" ) );
    $str96$illegal_arg_quoted_isa_pred_encou = makeString( "illegal arg-quoted-isa-pred encountered in argn-isa: ~s" );
    $list97 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $const98$arg1Isa = constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) );
    $const99$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $const100$arg3Isa = constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) );
    $const101$arg4Isa = constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) );
    $const102$arg5Isa = constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) );
    $const103$arg6Isa = constant_handles.reader_make_constant_shell( makeString( "arg6Isa" ) );
    $str104$illegal_index_specification_for_a = makeString( "illegal index specification for arg-isa-pred: ~s" );
    $const105$arg1SometimesIsa = constant_handles.reader_make_constant_shell( makeString( "arg1SometimesIsa" ) );
    $const106$arg2SometimesIsa = constant_handles.reader_make_constant_shell( makeString( "arg2SometimesIsa" ) );
    $const107$arg3SometimesIsa = constant_handles.reader_make_constant_shell( makeString( "arg3SometimesIsa" ) );
    $const108$arg4SometimesIsa = constant_handles.reader_make_constant_shell( makeString( "arg4SometimesIsa" ) );
    $const109$arg5SometimesIsa = constant_handles.reader_make_constant_shell( makeString( "arg5SometimesIsa" ) );
    $const110$arg6SometimesIsa = constant_handles.reader_make_constant_shell( makeString( "arg6SometimesIsa" ) );
    $str111$illegal_argnum_specification_for_ = makeString( "illegal argnum specification for arg-isa-preds: ~s" );
    $const112$arg1NotIsa = constant_handles.reader_make_constant_shell( makeString( "arg1NotIsa" ) );
    $const113$arg2NotIsa = constant_handles.reader_make_constant_shell( makeString( "arg2NotIsa" ) );
    $const114$arg3NotIsa = constant_handles.reader_make_constant_shell( makeString( "arg3NotIsa" ) );
    $const115$arg4NotIsa = constant_handles.reader_make_constant_shell( makeString( "arg4NotIsa" ) );
    $const116$arg5NotIsa = constant_handles.reader_make_constant_shell( makeString( "arg5NotIsa" ) );
    $const117$argsNotIsa = constant_handles.reader_make_constant_shell( makeString( "argsNotIsa" ) );
    $str118$illegal_index_specification_for_a = makeString( "illegal index specification for arg-not-isa-pred: ~s" );
    $str119$illegal_argnum_specification_for_ = makeString( "illegal argnum specification for arg-not-isa-preds: ~s" );
    $const120$arg1QuotedIsa = constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) );
    $const121$arg2QuotedIsa = constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) );
    $const122$arg3QuotedIsa = constant_handles.reader_make_constant_shell( makeString( "arg3QuotedIsa" ) );
    $const123$arg4QuotedIsa = constant_handles.reader_make_constant_shell( makeString( "arg4QuotedIsa" ) );
    $const124$arg5QuotedIsa = constant_handles.reader_make_constant_shell( makeString( "arg5QuotedIsa" ) );
    $const125$arg6QuotedIsa = constant_handles.reader_make_constant_shell( makeString( "arg6QuotedIsa" ) );
    $str126$illegal_index_specification_for_a = makeString( "illegal index specification for arg-quoted-isa-pred: ~s" );
    $str127$illegal_argnum_specification_for_ = makeString( "illegal argnum specification for arg-quoted-isa-preds: ~s" );
    $str128$invalid_argument_to_inverse_argnu = makeString( "invalid argument to inverse-argnum: ~s" );
    $const129$arg1Genl = constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) );
    $const130$arg2Genl = constant_handles.reader_make_constant_shell( makeString( "arg2Genl" ) );
    $const131$arg3Genl = constant_handles.reader_make_constant_shell( makeString( "arg3Genl" ) );
    $const132$arg4Genl = constant_handles.reader_make_constant_shell( makeString( "arg4Genl" ) );
    $const133$arg5Genl = constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) );
    $const134$arg6Genl = constant_handles.reader_make_constant_shell( makeString( "arg6Genl" ) );
    $const135$argsGenl = constant_handles.reader_make_constant_shell( makeString( "argsGenl" ) );
    $sym136$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym137$MIN_ARGN_ISA = makeSymbol( "MIN-ARGN-ISA" );
    $list138 = ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str139$Returns_a_list_of_the_most_specif = makeString( "Returns a list of the most specific local isa-constraints applicable \nto argument N of RELATION." );
    $list140 = ConsesLow.list( ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "INTEGERP" ) ) );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "INDEXED-TERM-P" ) ) );
    $const142$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $sym143$ARGN_ISA_OF = makeSymbol( "ARGN-ISA-OF" );
    $list144 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "ARGNUM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str145$Returns_the_relations_for_which_C = makeString( "Returns the relations for which COLLECTION is a \nlocal isa constraint applied to argument ARGNUM." );
    $const146$ArgGenlBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgGenlBinaryPredicate" ) );
    $const147$ArgGenlTernaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgGenlTernaryPredicate" ) );
    $str148$illegal_arg_genl_pred_encountered = makeString( "illegal arg-genl-pred encountered in argn-genl: ~s" );
    $sym149$ARGN_GENL = makeSymbol( "ARGN-GENL" );
    $str150$Returns_the_local_genl_constraint = makeString( "Returns the local genl constraints applied to the ARGNUMth argument of RELATION." );
    $const151$argAndRestGenl = constant_handles.reader_make_constant_shell( makeString( "argAndRestGenl" ) );
    $str152$illegal_index_specification_for_a = makeString( "illegal index specification for arg-genl-pred: ~s" );
    $str153$illegal_argnum_specification_for_ = makeString( "illegal argnum specification for arg-genl-preds: ~s" );
    $sym154$MIN_ARGN_GENL = makeSymbol( "MIN-ARGN-GENL" );
    $str155$Return_a_list_of_the_most_specifi = makeString( "Return a list of the most specific local genl constraints applicable \nto the argument N of RELATION." );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "N" ), makeSymbol( "INTEGERP" ) ) );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "FORT-P" ) ) );
    $const158$argGenl = constant_handles.reader_make_constant_shell( makeString( "argGenl" ) );
    $sym159$ARGN_GENL_OF = makeSymbol( "ARGN-GENL-OF" );
    $str160$Returns_a_list_of_the_predicates_ = makeString( "Returns a list of the predicates for which COLLECTION is a \nlocal genl constraint applied to the Nth argument." );
    $const161$interArgIsa1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-2" ) );
    $sym162$INTER_ARG_ISA1_2 = makeSymbol( "INTER-ARG-ISA1-2" );
    $list163 = ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str164$return_a_list_of_pairs_of___arg1_ = makeString( "return a list of pairs of (<arg1-isa> <arg2-isa>) that are \nthe #$interArgIsa1-2 constraints of RELATION" );
    $list165 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LISTP" ) ) );
    $const166$interArgIsa2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-1" ) );
    $const167$interArgIsa3_1 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-1" ) );
    $const168$interArgIsa4_1 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-1" ) );
    $const169$interArgIsa5_1 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-1" ) );
    $const170$interArgIsa3_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-2" ) );
    $const171$interArgIsa4_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-2" ) );
    $const172$interArgIsa5_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-2" ) );
    $const173$interArgIsa1_3 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-3" ) );
    $const174$interArgIsa2_3 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-3" ) );
    $const175$interArgIsa4_3 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-3" ) );
    $const176$interArgIsa5_3 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-3" ) );
    $const177$interArgIsa1_4 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-4" ) );
    $const178$interArgIsa2_4 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-4" ) );
    $const179$interArgIsa3_4 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-4" ) );
    $const180$interArgIsa5_4 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-4" ) );
    $const181$interArgIsa1_5 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-5" ) );
    $const182$interArgIsa2_5 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-5" ) );
    $const183$interArgIsa3_5 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-5" ) );
    $const184$interArgIsa4_5 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-5" ) );
    $list185 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-1" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa4-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-1" ) ) );
    $list186 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-2" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa4-2" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-2" ) ) );
    $list187 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa4-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-3" ) ) );
    $list188 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-4" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa3-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-4" ) ) );
    $list189 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-5" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-5" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa3-5" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-5" ) ) );
    $list190 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-2" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa1-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-5" ) ) );
    $list191 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa2-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa2-5" ) ) );
    $list192 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa3-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa3-5" ) ) );
    $list193 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa4-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa4-5" ) ) );
    $list194 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgIsa5-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgIsa5-4" ) ) );
    $const195$defnIff = constant_handles.reader_make_constant_shell( makeString( "defnIff" ) );
    $const196$defnSufficient = constant_handles.reader_make_constant_shell( makeString( "defnSufficient" ) );
    $const197$defnNecessary = constant_handles.reader_make_constant_shell( makeString( "defnNecessary" ) );
    $const198$quotedDefnIff = constant_handles.reader_make_constant_shell( makeString( "quotedDefnIff" ) );
    $const199$quotedDefnSufficient = constant_handles.reader_make_constant_shell( makeString( "quotedDefnSufficient" ) );
    $const200$quotedDefnNecessary = constant_handles.reader_make_constant_shell( makeString( "quotedDefnNecessary" ) );
    $sym201$DEFINING_DEFNS = makeSymbol( "DEFINING-DEFNS" );
    $list202 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str203$Return_a_list_of_the_local_defini = makeString( "Return a list of the local defining (necessary and sufficient definitions) of collection COL." );
    $sym204$NECESSARY_DEFNS = makeSymbol( "NECESSARY-DEFNS" );
    $str205$Return_a_list_of_the_local_necess = makeString( "Return a list of the local necessary definitions of collection COL." );
    $sym206$SUFFICIENT_DEFNS = makeSymbol( "SUFFICIENT-DEFNS" );
    $str207$Return_a_list_of_the_local_suffic = makeString( "Return a list of the local sufficient definitions of collection COL." );
    $sym208$ALL_SUFFICIENT_DEFNS = makeSymbol( "ALL-SUFFICIENT-DEFNS" );
    $str209$Return_a_list_of_all_sufficient_d = makeString( "Return a list of all sufficient definitions of collection COL." );
    $const210$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $const211$resultIsaArg = constant_handles.reader_make_constant_shell( makeString( "resultIsaArg" ) );
    $const212$resultIsaArgIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsaArgIsa" ) );
    $const213$resultIsaWhenArgIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsaWhenArgIsa" ) );
    $const214$closedUnder = constant_handles.reader_make_constant_shell( makeString( "closedUnder" ) );
    $const215$FormulaArgFn = constant_handles.reader_make_constant_shell( makeString( "FormulaArgFn" ) );
    $const216$FunctionToArg = constant_handles.reader_make_constant_shell( makeString( "FunctionToArg" ) );
    $sym217$PRED_U_V_HOLDS_IN_RELEVANT_MTS = makeSymbol( "PRED-U-V-HOLDS-IN-RELEVANT-MTS" );
    $const218$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $sym219$MAPPING_FUNCALL_ARG = makeSymbol( "MAPPING-FUNCALL-ARG" );
    $const220$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "evaluationResultQuotedIsa" ) );
    $const221$resultQuotedIsa = constant_handles.reader_make_constant_shell( makeString( "resultQuotedIsa" ) );
    $const222$resultGenl = constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) );
    $const223$resultGenlArg = constant_handles.reader_make_constant_shell( makeString( "resultGenlArg" ) );
    $sym224$RESULT_ISA = makeSymbol( "RESULT-ISA" );
    $list225 = ConsesLow.list( makeSymbol( "FUNCTOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str226$Return_a_list_of_the_collections_ = makeString( "Return a list of the collections that include as instances \nthe results of non-predicate function constant FUNCTOR." );
    $list227 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER );
    $sym228$RESULT_ISA_VIA_CLOSED_UNDER = makeSymbol( "RESULT-ISA-VIA-CLOSED-UNDER" );
    $int229$512 = makeInteger( 512 );
    $sym230$RESULT_INTER_ARG_ISA = makeSymbol( "RESULT-INTER-ARG-ISA" );
    $const231$interArgResultIsa = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsa" ) );
    $sym232$RESULT_INTER_ARG_ISA_RELN = makeSymbol( "RESULT-INTER-ARG-ISA-RELN" );
    $const233$interArgResultIsaReln = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsaReln" ) );
    $list234 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER );
    $list235 = ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "REL" ), makeSymbol( "NAT-TERM-ARG" ), makeSymbol( "COL-ARG" ) );
    $sym236$PRED_ARG_VALUES_IN_RELEVANT_MTS = makeSymbol( "PRED-ARG-VALUES-IN-RELEVANT-MTS" );
    $sym237$EVALUATION_RESULT_QUOTED_ISA = makeSymbol( "EVALUATION-RESULT-QUOTED-ISA" );
    $str238$return_the_collections_that_inclu = makeString( "return the collections that include as quoted instances the evaluation results of non-predicate function constant FUNCTOR." );
    $sym239$RESULT_QUOTED_ISA = makeSymbol( "RESULT-QUOTED-ISA" );
    $str240$return_the_collections_that_inclu = makeString( "return the collections that include as quoted instances the results of non-predicate function constant FUNCTOR." );
    $const241$interArgResultGenl = constant_handles.reader_make_constant_shell( makeString( "interArgResultGenl" ) );
    $const242$interArgResultGenlReln = constant_handles.reader_make_constant_shell( makeString( "interArgResultGenlReln" ) );
    $const243$arg1Format = constant_handles.reader_make_constant_shell( makeString( "arg1Format" ) );
    $const244$arg2Format = constant_handles.reader_make_constant_shell( makeString( "arg2Format" ) );
    $const245$arg3Format = constant_handles.reader_make_constant_shell( makeString( "arg3Format" ) );
    $const246$arg4Format = constant_handles.reader_make_constant_shell( makeString( "arg4Format" ) );
    $const247$arg5Format = constant_handles.reader_make_constant_shell( makeString( "arg5Format" ) );
    $const248$arg6Format = constant_handles.reader_make_constant_shell( makeString( "arg6Format" ) );
    $str249$illegal_arg_specification_for_arg = makeString( "illegal arg specification for argn-format-pred: ~s" );
    $const250$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) );
    $const251$SingleEntry = constant_handles.reader_make_constant_shell( makeString( "SingleEntry" ) );
    $list252 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $const253$interArgFormat1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-2" ) );
    $const254$interArgFormat2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-1" ) );
    $list255 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat3-1" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat4-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-1" ) ) );
    $list256 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-2" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat3-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat4-2" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-2" ) ) );
    $list257 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat4-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-3" ) ) );
    $list258 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-4" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat3-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-4" ) ) );
    $list259 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-5" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-5" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat3-5" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat4-5" ) ) );
    $list260 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-2" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat1-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat1-5" ) ) );
    $list261 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-3" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat2-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat2-5" ) ) );
    $list262 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat3-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat3-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat3-4" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat3-5" ) ) );
    $list263 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat4-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat4-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat4-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat4-5" ) ) );
    $list264 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-1" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-2" ) ), constant_handles
        .reader_make_constant_shell( makeString( "interArgFormat5-3" ) ), constant_handles.reader_make_constant_shell( makeString( "interArgFormat5-4" ) ) );
    $const265$requiredArg1Pred = constant_handles.reader_make_constant_shell( makeString( "requiredArg1Pred" ) );
    $const266$requiredArg2Pred = constant_handles.reader_make_constant_shell( makeString( "requiredArg2Pred" ) );
    $str267$illegal_required_pred_for_require = makeString( "illegal required-pred for required-pred-arg: ~s" );
    $str268$illegal_arg_number_for_required_p = makeString( "illegal arg number for required-pred-arg: ~s" );
    $list269 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "requiredArg1Pred" ) ) );
    $list270 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "requiredArg2Pred" ) ) );
    $list271 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles
        .reader_make_constant_shell( makeString( "relationAllExistsCount" ) ), constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMany" ) ), constant_handles.reader_make_constant_shell(
            makeString( "relationAllExistsMax" ) ), constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMin" ) ), constant_handles.reader_make_constant_shell( makeString(
                "relationAllInstance" ) ) );
    $list272 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsCountAll" ) ), constant_handles
        .reader_make_constant_shell( makeString( "relationExistsMaxAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsMinAll" ) ), constant_handles.reader_make_constant_shell( makeString(
            "relationInstanceAll" ) ) );
    $list273 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "relationExistsAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsAllMany" ) ),
      constant_handles.reader_make_constant_shell( makeString( "relationExistsCountAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsCountInstance" ) ), constant_handles
          .reader_make_constant_shell( makeString( "relationExistsExists" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell(
              makeString( "relationExistsMaxAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsMaxInstance" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "relationExistsMinAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsMinInstance" ) )
    } );
    $list274 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString( "relationAllExistsCount" ) ),
      constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMany" ) ), constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMax" ) ), constant_handles
          .reader_make_constant_shell( makeString( "relationAllExistsMin" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsExists" ) ), constant_handles.reader_make_constant_shell( makeString(
              "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "relationInstanceExistsMany" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsMax" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "relationInstanceExistsMin" ) )
    } );
    $sym275$MTS_OF_PREDICATE_TYPE_INT = makeSymbol( "MTS-OF-PREDICATE-TYPE-INT" );
    $const276$ArgTypePredicate = constant_handles.reader_make_constant_shell( makeString( "ArgTypePredicate" ) );
    $const277$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const278$fanOutArg = constant_handles.reader_make_constant_shell( makeString( "fanOutArg" ) );
    $kw279$SUPERIOR_ = makeKeyword( "SUPERIOR?" );
    $const280$coExtensional = constant_handles.reader_make_constant_shell( makeString( "coExtensional" ) );
    $const281$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $sym282$HLMT_P = makeSymbol( "HLMT-P" );
    $const283$myReviewer = constant_handles.reader_make_constant_shell( makeString( "myReviewer" ) );
    $sym284$REVIEWER = makeSymbol( "REVIEWER" );
    $list285 = ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) ) ) );
    $str286$Identify_the_cyclist_who_reviewed = makeString( "Identify the cyclist who reviewed FORT." );
    $list287 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ) );
    $list288 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $const289$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $sym290$COMMENT = makeSymbol( "COMMENT" );
    $list291 = ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str292$Return_the_comment_string_for_FOR = makeString( "Return the comment string for FORT." );
    $list293 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "FORT-P" ) ) );
    $list294 = ConsesLow.list( makeSymbol( "STRINGP" ) );
    $sym295$COMMENT_IF_FORT = makeSymbol( "COMMENT-IF-FORT" );
    $sym296$CYCLIST_NOTES = makeSymbol( "CYCLIST-NOTES" );
    $const297$cyclistNotes = constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) );
    $sym298$INDEX_ARG_REFERENCES_IN_STRING_ = makeSymbol( "INDEX-ARG-REFERENCES-IN-STRING?" );
    $sym299$GATHER_ARG_OF_SELECTED_GAF_ASSERTION = makeSymbol( "GATHER-ARG-OF-SELECTED-GAF-ASSERTION" );
    $str300$mapping_Cyc_assertions = makeString( "mapping Cyc assertions" );
    $sym301$STRINGP = makeSymbol( "STRINGP" );
    $kw302$SKIP = makeKeyword( "SKIP" );
    $sym303$CONSTANT_NAME = makeSymbol( "CONSTANT-NAME" );
    $sym304$STR = makeSymbol( "STR" );
    $sym305$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw306$GAF = makeKeyword( "GAF" );
    $sym307$GATHER_ASSERTIONS = makeSymbol( "GATHER-ASSERTIONS" );
    $str308$____in_mt____s_ = makeString( "~%~%in mt : ~s." );
    $str309$__EL____S_ = makeString( "~%EL : ~S." );
    $kw310$ALL = makeKeyword( "ALL" );
    $str311$___a___ = makeString( "~%~a : " );
    $sym312$PRINT_ARG = makeSymbol( "PRINT-ARG" );
    $sym313$GATHER_FN_OF_ARG = makeSymbol( "GATHER-FN-OF-ARG" );
    $list314 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "comment" ) ), constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) ) );
    $str315$____missing_doc_preds_ = makeString( "~%~%missing doc preds:" );
    $str316$__A = makeString( " ~A" );
    $str317$_____a = makeString( "~%  ~a" );
    $str318$_______a = makeString( "~%    ~a" );
    $str319$______ = makeString( "\\(\\#\\$" );
    $str320$________ = makeString( "[^#]*?\\)" );
    $const321$scopingArg = constant_handles.reader_make_constant_shell( makeString( "scopingArg" ) );
    $const322$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym323$ALL_TERM_ASSERTIONS = makeSymbol( "ALL-TERM-ASSERTIONS" );
    $list324 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "REMOVE-DUPLICATES?" ) );
    $str325$Return_a_list_of_all_the_assertio = makeString( "Return a list of all the assertions indexed via the indexed term TERM." );
    $list326 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ) );
    $list327 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ASSERTION-P" ) ) );
    $sym328$MAPPING_ANSWER_FOUND_ = makeSymbol( "MAPPING-ANSWER-FOUND?" );
    $kw329$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $sym330$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym331$GATHER_SOME_ASSERTIONS = makeSymbol( "GATHER-SOME-ASSERTIONS" );
    $sym332$ASSERTION_FI_FORMULA = makeSymbol( "ASSERTION-FI-FORMULA" );
    $sym333$ASSERTION_MENTIONS_KBA_PRED_ = makeSymbol( "ASSERTION-MENTIONS-KBA-PRED?" );
    $const334$retainTerm = constant_handles.reader_make_constant_shell( makeString( "retainTerm" ) );
    $sym335$ISA_RELEVANT_ASSERTIONS = makeSymbol( "ISA-RELEVANT-ASSERTIONS" );
    $list336 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str337$Return_a_list_of_all__e_g___inher = makeString( "Return a list of all (e.g., inheritance) rules relevant to TERM \nby virtue of the collections of which it is an instance." );
    $kw338$NEG = makeKeyword( "NEG" );
    $kw339$POS = makeKeyword( "POS" );
    $sym340$ISA_RELEVANT_ASSERTIONS_WRT_TYPE = makeSymbol( "ISA-RELEVANT-ASSERTIONS-WRT-TYPE" );
    $list341 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str342$Returns_a_list_of_all__e_g___inhe = makeString( "Returns a list of all (e.g., inheritance) rules that may apply \nto TERM by virtue of it being an instance of COLLECTION." );
    $sym343$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $sym344$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $list345 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED-TYPE" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list346 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $kw347$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw348$MT = makeKeyword( "MT" );
    $kw349$TRUTH = makeKeyword( "TRUTH" );
    $kw350$DONE = makeKeyword( "DONE" );
    $sym351$PRED_VAR = makeUninternedSymbol( "PRED-VAR" );
    $sym352$DO_ALL_FORT_INSTANCES = makeSymbol( "DO-ALL-FORT-INSTANCES" );
    $sym353$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE" );
    $sym354$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $kw355$PREDICATE = makeKeyword( "PREDICATE" );
    $sym356$DO_GAFS_WRT_PRED_TYPE = makeSymbol( "DO-GAFS-WRT-PRED-TYPE" );
    $str357$iterate_over_every_gaf_assertion_ = makeString( "iterate over every gaf assertion mentioning TERM and having as a predicate some instance of PRED-TYPE" );
    $kw358$BREADTH = makeKeyword( "BREADTH" );
    $kw359$QUEUE = makeKeyword( "QUEUE" );
    $kw360$STACK = makeKeyword( "STACK" );
    $sym361$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw362$ERROR = makeKeyword( "ERROR" );
    $str363$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym364$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw365$CERROR = makeKeyword( "CERROR" );
    $str366$continue_anyway = makeString( "continue anyway" );
    $kw367$WARN = makeKeyword( "WARN" );
    $str368$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str369$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str370$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list371 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str372$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym373$GATHER_RELATION_TYPES = makeSymbol( "GATHER-RELATION-TYPES" );
    $const374$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $sym375$GATHER_RELATION_TYPES_SP = makeSymbol( "GATHER-RELATION-TYPES-SP" );
    $const376$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
    $const377$hypotheticalTerm = constant_handles.reader_make_constant_shell( makeString( "hypotheticalTerm" ) );
    $const378$notAssertible = constant_handles.reader_make_constant_shell( makeString( "notAssertible" ) );
    $const379$notAssertibleCollection = constant_handles.reader_make_constant_shell( makeString( "notAssertibleCollection" ) );
    $const380$notAssertibleMt = constant_handles.reader_make_constant_shell( makeString( "notAssertibleMt" ) );
    $const381$IndexicalConcept = constant_handles.reader_make_constant_shell( makeString( "IndexicalConcept" ) );
    $list382 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationAllExistsFn" ) ), constant_handles.reader_make_constant_shell( makeString( "RelationExistsAllFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ) );
    $const383$IndeterminateTermDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "IndeterminateTermDenotingFunction" ) );
    $const384$IndeterminateTerm = constant_handles.reader_make_constant_shell( makeString( "IndeterminateTerm" ) );
    $const385$NonSkolemIndeterminateTerm = constant_handles.reader_make_constant_shell( makeString( "NonSkolemIndeterminateTerm" ) );
    $const386$nonAbducibleRule = constant_handles.reader_make_constant_shell( makeString( "nonAbducibleRule" ) );
    $const387$TermExemptFromUniqueNamesAssumpti = constant_handles.reader_make_constant_shell( makeString( "TermExemptFromUniqueNamesAssumption" ) );
    $str388$_cyc_com = makeString( "@cyc.com" );
    $str389$Can_t_get_the_email_address_of_a_ = makeString( "Can't get the email address of a non-fort: ~s" );
    $const390$preferredEMailAddressText = constant_handles.reader_make_constant_shell( makeString( "preferredEMailAddressText" ) );
    $const391$localEMailAddressText = constant_handles.reader_make_constant_shell( makeString( "localEMailAddressText" ) );
    $sym392$GUESS_THE_CYCLIST_FROM_USER_NAME = makeSymbol( "GUESS-THE-CYCLIST-FROM-USER-NAME" );
    $list393 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "CycorpBusinessDatabaseMt" ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ) );
    $const394$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list395 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?CYCLIST" ), constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) );
    $sym396$_CYCLIST = makeSymbol( "?CYCLIST" );
    $list397 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword(
        "NONE" ), makeKeyword( "ALLOWED-MODULES" ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "JOIN" ) ), makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?CYCLIST" ) )
    } );
    $sym398$_GUESS_THE_CYCLIST_FROM_USER_NAME_CACHING_STATE_ = makeSymbol( "*GUESS-THE-CYCLIST-FROM-USER-NAME-CACHING-STATE*" );
    $int399$64 = makeInteger( 64 );
    $sym400$CLEAR_GUESS_THE_CYCLIST_FROM_USER_NAME = makeSymbol( "CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME" );
    $sym401$POSSIBLY_UPDATE_MOST_SPECIALIZED_FORT = makeSymbol( "POSSIBLY-UPDATE-MOST-SPECIALIZED-FORT" );
  }

  public static final class $fast_non_skolem_indeterminate_termP$UnaryFunction
      extends
        UnaryFunction
  {
    public $fast_non_skolem_indeterminate_termP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FAST-NON-SKOLEM-INDETERMINATE-TERM?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fast_non_skolem_indeterminate_termP( arg1 );
    }
  }

  public static final class $clear_guess_the_cyclist_from_user_name$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_guess_the_cyclist_from_user_name$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_guess_the_cyclist_from_user_name();
    }
  }
}
/*
 * 
 * Total time: 6222 ms
 * 
 */